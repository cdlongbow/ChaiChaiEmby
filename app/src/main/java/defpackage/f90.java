package defpackage;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final class f90 implements Function3 {
    public final /* synthetic */ rg0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ MutableState d;

    public f90(rg0 rg0Var, boolean z, long j, MutableState mutableState) {
        this.a = rg0Var;
        this.b = z;
        this.c = j;
        this.d = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jM7306getFontSizeXSAIIZE;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1056260122, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.EpisodeRangeSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:1629)");
            }
            String str = this.a.a;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i = MaterialTheme.$stable;
            TextStyle titleMedium = materialTheme.getTypography(composer, i).getTitleMedium();
            boolean z = this.b;
            FontWeight.Companion companion = FontWeight.INSTANCE;
            FontWeight bold = z ? companion.getBold() : companion.getMedium();
            if (z) {
                composer.startReplaceGroup(-1453686360);
                composer.endReplaceGroup();
                jM7306getFontSizeXSAIIZE = TextUnitKt.getSp(18);
            } else {
                composer.startReplaceGroup(-1453684914);
                jM7306getFontSizeXSAIIZE = materialTheme.getTypography(composer, i).getTitleMedium().m7306getFontSizeXSAIIZE();
                composer.endReplaceGroup();
            }
            long j = jM7306getFontSizeXSAIIZE;
            PlatformTextStyle platformTextStyle = new PlatformTextStyle(false);
            Shadow shadow = u90.o;
            TextKt.m3048TextNvy7gAk(str, null, this.c, null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(titleMedium, 0L, j, bold, null, null, null, null, 0L, null, null, null, 0L, null, ((Boolean) this.d.getValue()).booleanValue() ? null : u90.p, null, 0, 0, 0L, null, platformTextStyle, null, 0, 0, null, 16244729, null), composer, 0, 0, 130042);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
