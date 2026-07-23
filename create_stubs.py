import subprocess, os, re, sys

STUBS_DIR = "/workspace/app/src/main/java"

# Map of missing class -> package path
# These are derived from the actual imports in the codebase
MISSING_CLASSES = {
    # Compose Material3 internal APIs
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
    "WindowBoundsCalculator": "androidx.compose.material3",
    "ButtonGlow": "androidx.compose.material3",
    "ClickableSurfaceGlow": "androidx.compose.material3",
    "ExposedDropdownMenuKt": "androidx.compose.material3",

    # Compose Foundation internal APIs
    "CommonContextMenuAreaKt": "androidx.compose.foundation.text",
    "ContextMenuState": "androidx.compose.foundation.text",
    "ContextMenuColors": "androidx.compose.foundation.text",
    "BasicTextContextMenuProvider": "androidx.compose.foundation.text",
    "CoreTextFieldSemanticsModifierNode": "androidx.compose.foundation.text",
    "TextAutoSize": "androidx.compose.foundation.text",
    "ScrollNode": "androidx.compose.foundation",

    # Compose Runtime internal
    "GapComposer": "androidx.compose.runtime",
    "LinkComposer": "androidx.compose.runtime",
    "SaveableStateRegistryWrapper": "androidx.compose.runtime",
    "CreationExtrasKt": "androidx.lifecycle",

    # Compose Foundation Layout internal
    "PriorityTask": "androidx.compose.foundation.lazy.layout",
    "LazyLayoutMeasuredItemKt": "androidx.compose.foundation.lazy.layout",
    "Scrollable2DNode": "androidx.compose.foundation",
    "Scrollable2DStateKt": "androidx.compose.foundation",
    "MouseWheelScrollingLogic": "androidx.compose.foundation",
    "InsetsPaddingModifierNode": "androidx.compose.foundation.layout",
    "SplitPinRule": "androidx.window.embedding",
    "Predicate2": "androidx.window.reflection",

    # Media3 internal
    "AudioFocusManager": "androidx.media3.common.audio",
    "HlsInterstitialsAdsLoader": "androidx.media3.exoplayer.hls",
    "MetadataRetrieverInternal": "androidx.media3.exoplayer",
    "PreloadManagerListener": "androidx.media3.exoplayer.source.preload",

    # Profile Installer
    "ProfileInstaller": "androidx.profileinstaller",
    "ProfileVerifier": "androidx.profileinstaller",
    "DeviceProfileWriter": "androidx.profileinstaller",

    # Navigation
    "NavGraph": "androidx.navigation",
    "NavHostController": "androidx.navigation",

    # Other
    "Unsafe": "sun.misc",
    "ExperimentalBitmapProcessor": "androidx.compose.ui.graphics",
    "TextAutoSize": "androidx.compose.foundation.text",
    "PlatformFontVariationSettings_androidKt": "androidx.compose.text.font",
    "JvmAnnotatedString_jvmAndAndroidKt": "androidx.compose.ui.text",
    "TextFieldLabelPosition": "androidx.compose.material3",
    "PredictiveBackState": "androidx.activity",
    "RailPredictiveBackState": "androidx.compose.material3",
    "CoreTextFieldKt$CoreTextField$8$1$1$2": "androidx.compose.foundation.text",
    "ComponentActivity$activityResultRegistry$1": "androidx.activity",
    "PreloadManagerListener": "androidx.media3.exoplayer.source.preload",
    "PriorityTask": "androidx.compose.foundation.lazy.layout",
    "TextAutoSize": "androidx.compose.foundation.text",
    "WindowBoundsCalculator": "androidx.compose.material3",
}

def create_stub(full_class_name, package_name):
    simple_name = full_class_name.split("$")[0]
    pkg_path = package_name.replace(".", "/")
    dir_path = os.path.join(STUBS_DIR, pkg_path)
    os.makedirs(dir_path, exist_ok=True)
    file_path = os.path.join(dir_path, f"{simple_name}.java")
    if os.path.exists(file_path):
        return False
    with open(file_path, "w") as f:
        f.write(f"package {package_name};\n\n")
        f.write(f"public class {simple_name} {{\n")
        f.write(f"}}\n")
    print(f"  Created: {package_name}.{simple_name}")
    return True

def main():
    print("Creating stub classes for missing symbols...")
    for cls, pkg in sorted(MISSING_CLASSES.items()):
        create_stub(cls, pkg)

    # Also handle GlShaderProgram - it's a top-level class (no package)
    gl_path = os.path.join(STUBS_DIR, "GlShaderProgram.java")
    if not os.path.exists(gl_path):
        with open(gl_path, "w") as f:
            f.write("public class GlShaderProgram {\n")
            f.write("}\n")
        print("  Created: GlShaderProgram (default package)")

    # Also create stubs for the two unnamed classes
    for name in ["a", "d"]:
        p = os.path.join(STUBS_DIR, "defpackage", f"{name}.java")
        pkg_path = os.path.join(STUBS_DIR, "defpackage")
        os.makedirs(pkg_path, exist_ok=True)
        if not os.path.exists(p):
            with open(p, "w") as f:
                f.write(f"package defpackage;\n\n")
                f.write(f"public class {name} {{\n")
                f.write(f"}}\n")
            print(f"  Created: defpackage.{name}")

    print("\nDone creating stubs.")

if __name__ == "__main__":
    main()