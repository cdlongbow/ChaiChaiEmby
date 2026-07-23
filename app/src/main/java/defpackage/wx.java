package defpackage;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final class wx implements Function3 {
    public final /* synthetic */ sw a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ MutableState c;

    public wx(sw swVar, boolean z, MutableState mutableState) {
        this.a = swVar;
        this.b = z;
        this.c = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jColor;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1668052426, iIntValue, -1, "com.dh.myembyapp.ui.components.DanmakuEpisodeRangeSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DanmakuSearchDialog.kt:1143)");
            }
            String str = this.a.a;
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium();
            MutableState mutableState = this.c;
            boolean z = this.b;
            FontWeight medium = (!z || ((Boolean) mutableState.getValue()).booleanValue()) ? FontWeight.INSTANCE.getMedium() : FontWeight.INSTANCE.getBold();
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                jColor = Color.INSTANCE.m5178getBlack0d7_KjU();
            } else {
                jColor = z ? ColorKt.Color(4283417591L) : Color.INSTANCE.m5189getWhite0d7_KjU();
            }
            TextKt.m3048TextNvy7gAk(str, null, jColor, null, 0L, null, medium, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer, 0, 0, 131002);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
