package defpackage;

import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.selection.DefaultTextSelectionColors_androidKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.DefaultShortNavigationBarOverride;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.tokens.TypographyTokensKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.text.SpanStyleKt;
import com.dh.myembyapp.data.model.AppThemePreset;
import com.dh.myembyapp.data.model.DarkThemeStyle;
import com.dh.myembyapp.data.model.LightThemeBackgroundStyle;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mu1 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ mu1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return Boolean.valueOf(SearchBarDefaults.enterAlwaysSearchBarScrollBehavior$lambda$1$lambda$0());
            case 2:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            case 3:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 4:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 5:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 6:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            case 7:
                return SelectionContainerKt.SelectionContainer$lambda$5$0();
            case 8:
                return SelectionRegistrarKt.LocalSelectionRegistrar$lambda$0();
            case 9:
                return Unit.INSTANCE;
            case 10:
                try {
                    return ku.P(SequencesKt.toList(SequencesKt.asSequence(Arrays.asList(new q91()).iterator())));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(th.getMessage(), th);
                }
            case 11:
                try {
                    return ku.P(SequencesKt.toList(SequencesKt.asSequence(Arrays.asList(new n20[0]).iterator())));
                } catch (Throwable th2) {
                    throw new ServiceConfigurationError(th2.getMessage(), th2);
                }
            case 12:
                return ShapesKt.LocalShapes$lambda$0();
            case 13:
                return DefaultShortNavigationBarOverride.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                return SpanStyleKt.DefaultColorForegroundStyle;
            case 16:
                return Unit.INSTANCE;
            case 17:
                return SurfaceKt.LocalAbsoluteTonalElevation$lambda$3();
            case 18:
                return TextContextMenuProviderKt.LocalTextContextMenuDropdownProvider$lambda$0();
            case 19:
                return TextContextMenuProviderKt.LocalTextContextMenuToolbarProvider$lambda$0();
            case 20:
                return TypographyTokensKt.getDefaultTextStyle();
            case 21:
                return TextLinkScope.textRange$lambda$0$0();
            case 22:
                return TextLinkScope.textRange$lambda$0$1();
            case 23:
                return DefaultTextSelectionColors_androidKt.getDefaultTextSelectionColors();
            case 24:
                return xq.p;
            case 25:
                return l72.a;
            case 26:
                return AppThemePreset.DARK;
            case 27:
                return DarkThemeStyle.INSTANCE.getDEFAULT();
            case 28:
                return LightThemeBackgroundStyle.PLAIN_WHITE;
            default:
                ColorScheme colorScheme = n72.a;
                return Boolean.TRUE;
        }
    }
}
