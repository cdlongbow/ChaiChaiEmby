package defpackage;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m50 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageVector b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ MutableState e;

    public /* synthetic */ m50(ImageVector imageVector, String str, boolean z, MutableState mutableState, int i) {
        this.a = i;
        this.b = imageVector;
        this.c = str;
        this.d = z;
        this.e = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jM5189getWhite0d7_KjU;
        long jM5189getWhite0d7_KjU2;
        int i = this.a;
        MutableState mutableState = this.e;
        boolean z = this.d;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235126211, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.MoviePlaybackHeaderButton.<anonymous> (DetailScreen.kt:2549)");
                    }
                    Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(18.0f));
                    if (z) {
                        jM5189getWhite0d7_KjU = ((Boolean) mutableState.getValue()).booleanValue() ? u90.c : Color.INSTANCE.m5189getWhite0d7_KjU();
                    } else {
                        jM5189getWhite0d7_KjU = Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    u90.C(this.b, this.c, modifierM1064size3ABfNKs, jM5189getWhite0d7_KjU, z && !((Boolean) mutableState.getValue()).booleanValue(), composer, RendererCapabilities.DECODER_SUPPORT_MASK);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1366885564, iIntValue2, -1, "com.dh.myembyapp.ui.screens.detail.EpisodeMiniActionButton.<anonymous> (DetailScreen.kt:8890)");
                    }
                    if (z) {
                        jM5189getWhite0d7_KjU2 = ((Boolean) mutableState.getValue()).booleanValue() ? u90.c : Color.INSTANCE.m5189getWhite0d7_KjU();
                    } else {
                        jM5189getWhite0d7_KjU2 = Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    IconKt.m2496Iconww6aTOc(this.b, this.c, (Modifier) null, jM5189getWhite0d7_KjU2, composer2, 0, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
