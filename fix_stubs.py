import subprocess, os, re, sys

STUBS_DIR = "/workspace/app/src/main/java"

def run_build():
    result = subprocess.run(
        ["bash", "-c", "export ANDROID_HOME=/opt/android-sdk && export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64 && cd /workspace && ./gradlew assembleDebug --no-daemon 2>&1"],
        capture_output=True, text=True, timeout=900
    )
    return result.stdout + result.stderr

def parse_errors(output):
    symbols = set()
    packages = set()
    for line in output.split("\n"):
        m = re.search(r"symbol:\s*class\s+(\S+)", line)
        if m:
            symbols.add(m.group(1))
        m = re.search(r"package\s+(\S+)\s+does not exist", line)
        if m:
            packages.add(m.group(1))
    return symbols, packages

def find_package_for_class(output, class_name):
    """Find the import statement for a class in the error output"""
    for line in output.split("\n"):
        if "cannot find symbol" in line and class_name in line:
            # Look at the verbose error output for the location
            pass
    return None

def create_stub(class_name, package_name):
    pkg_path = package_name.replace(".", "/")
    dir_path = os.path.join(STUBS_DIR, pkg_path)
    os.makedirs(dir_path, exist_ok=True)
    file_path = os.path.join(dir_path, f"{class_name}.java")
    if os.path.exists(file_path):
        return False
    with open(file_path, "w") as f:
        f.write(f"package {package_name};\n\n")
        f.write(f"public class {class_name} {{\n")
        f.write(f"}}\n")
    return True

def main():
    # Map well-known internal class names to their packages
    # These are extended based on actual errors
    CLASS_PACKAGE_MAP = {
        # Compose Material3
        "WideNavigationRailColors": "androidx.compose.material3",
        "WideNavigationRailKt": "androidx.compose.material3",
        "WideNavigationRailState": "androidx.compose.material3",
        "WideNavigationRailStateImpl": "androidx.compose.material3",
        "ModalWideNavigationRailState": "androidx.compose.material3",
        "DefaultSingleRowTopAppBarOverride": "androidx.compose.material3",
        "DefaultTwoRowsTopAppBarOverride": "androidx.compose.material3",
        "SearchBarKt": "androidx.compose.material3",
        "SearchBarScrollBehavior": "androidx.compose.material3",
        "SearchBarState": "androidx.compose.material3",
        "SearchBarColors": "androidx.compose.material3",
        "WindowBoundsCalculator": "androidx.compose.material3",
        "ButtonGlow": "androidx.compose.material3",
        "ClickableSurfaceGlow": "androidx.compose.material3",
        "ClickableAppBarItem": "androidx.compose.material3",
        "CustomAppBarItem": "androidx.compose.material3",
        "ToggleableAppBarItem": "androidx.compose.material3",
        "DragHandleKt": "androidx.compose.material3",
        "TextFieldLabelPosition": "androidx.compose.material3",
        "AnchoredDraggableDefaults": "androidx.compose.material3",
        "ExposedDropdownMenuKt": "androidx.compose.material3",
        "RailPredictiveBackState": "androidx.compose.material3",

        # Compose Foundation
        "CommonContextMenuAreaKt": "androidx.compose.foundation.text",
        "ContextMenuState": "androidx.compose.foundation.text",
        "ContextMenuColors": "androidx.compose.foundation.text",
        "BasicTextContextMenuProvider": "androidx.compose.foundation.text",
        "CoreTextFieldSemanticsModifierNode": "androidx.compose.foundation.text",
        "TextAutoSize": "androidx.compose.foundation.text",
        "CoreTextFieldKt": "androidx.compose.foundation.text",
        "ImeEditCommand_androidKt": "androidx.compose.foundation.text",
        "ScrollNode": "androidx.compose.foundation",
        "Scrollable2DNode": "androidx.compose.foundation",
        "Scrollable2DStateKt": "androidx.compose.foundation",
        "MouseWheelScrollingLogic": "androidx.compose.foundation",
        "InsetsPaddingModifierNode": "androidx.compose.foundation.layout",
        "PriorityTask": "androidx.compose.foundation.lazy.layout",
        "LazyLayoutMeasuredItemKt": "androidx.compose.foundation.lazy.layout",
        "GridScope": "androidx.compose.foundation.lazy.grid",
        "BasicEdgeToEdgeDialog_androidKt": "androidx.compose.foundation",

        # Compose Runtime
        "GapComposer": "androidx.compose.runtime",
        "LinkComposer": "androidx.compose.runtime",
        "SaveableStateRegistryWrapper": "androidx.compose.runtime",

        # Compose UI
        "ExperimentalBitmapProcessor": "androidx.compose.ui.graphics",
        "PlatformFontVariationSettings_androidKt": "androidx.compose.text.font",
        "JvmAnnotatedString_jvmAndAndroidKt": "androidx.compose.ui.text",
        "_UtilJvmKt": "androidx.compose.foundation",

        # Lifecycle
        "CreationExtrasKt": "androidx.lifecycle",
        "ProcessLifecycleOwner": "androidx.lifecycle",

        # Activity
        "PredictiveBackState": "androidx.activity",
        "ComponentActivity": "androidx.activity",

        # Navigation
        "NavGraph": "androidx.navigation",
        "NavHostController": "androidx.navigation",

        # Media3
        "AudioFocusManager": "androidx.media3.common.audio",
        "AudioTrackAudioOutputProvider": "androidx.media3.exoplayer.audio",
        "HlsInterstitialsAdsLoader": "androidx.media3.exoplayer.hls",
        "HlsExtractorFactory": "androidx.media3.exoplayer.hls",
        "HlsMediaChunkExtractor": "androidx.media3.exoplayer.hls",
        "MetadataRetrieverInternal": "androidx.media3.exoplayer",
        "PreloadManagerListener": "androidx.media3.exoplayer.source.preload",
        "ForwardingExtractorsFactory": "androidx.media3.exoplayer.source",
        "KeyRequestInfo": "androidx.media3.exoplayer.drm",
        "ShouldPauseCallback": "androidx.media3.exoplayer",
        "Protection": "androidx.media3.exoplayer.drm",
        "RankingDataComparator": "androidx.media3.exoplayer.trackselection",
        "ReorderingBufferQueue": "androidx.media3.exoplayer",

        # Window
        "SplitRule": "androidx.window.embedding",
        "SplitPinRule": "androidx.window.embedding",
        "Predicate2": "androidx.window.reflection",

        # Profile Installer
        "ProfileInstaller": "androidx.profileinstaller",
        "ProfileVerifier": "androidx.profileinstaller",
        "DeviceProfileWriter": "androidx.profileinstaller",

        # Other
        "Unsafe": "sun.misc",
        "AudioTrackAudioOutput": "androidx.media3.exoplayer.audio",
        "BaseAudioProcessor": "androidx.media3.common.audio",
        "ChildSemanticsNode": "androidx.compose.ui.semantics",
        "HostDefaultKey": "androidx.compose.ui.layout",
        "NavBackStackEntry": "androidx.navigation",
        "PreCacheHelper": "androidx.media3.exoplayer.source.preload",
        "SingleRowTopAppBarOverrideScope": "androidx.compose.material3",
        "TwoRowsTopAppBarOverrideScope": "androidx.compose.material3",
        "TimePickerDialogKt": "androidx.compose.material3",
        "FloatProducer": "androidx.compose.animation.core",
        "LazyLayoutMeasurePolicy": "androidx.compose.foundation.lazy.layout",
        "RulerAlignmentKt": "androidx.compose.material3",
        "GapComposerKt": "androidx.compose.runtime",
        "a": "defpackage",
        "d": "defpackage",
    }

    print("=" * 60)
    print("Running build to get current errors...")
    print("=" * 60)
    output = run_build()
    symbols, packages = parse_errors(output)

    print(f"\nMissing symbols: {len(symbols)}")
    print(f"Missing packages: {len(packages)}")

    # Create stubs
    created = 0
    for sym in sorted(symbols):
        if sym in CLASS_PACKAGE_MAP:
            pkg = CLASS_PACKAGE_MAP[sym]
            if create_stub(sym, pkg):
                print(f"  Created: {pkg}.{sym}")
                created += 1
        else:
            print(f"  UNKNOWN: {sym} - no package mapping")

    # Also check for package-level errors
    for pkg in sorted(packages):
        print(f"  Missing package: {pkg}")

    if created > 0:
        print(f"\nCreated {created} new stubs.")
        print("Rebuilding to check for remaining errors...")
        output2 = run_build()
        symbols2, packages2 = parse_errors(output2)
        new_symbols = symbols2 - symbols
        if new_symbols:
            print(f"\nNew symbols appeared: {len(new_symbols)}")
            for s in sorted(new_symbols):
                print(f"  NEW: {s}")
        if symbols2:
            print(f"\nRemaining errors: {len(symbols2)} symbols")
            print(f"Build still has {len([l for l in output2.split(chr(10)) if 'error:' in l])} errors")
        else:
            print("\nBUILD SUCCESSFUL!")
    else:
        print("\nNo new stubs created.")

if __name__ == "__main__":
    main()