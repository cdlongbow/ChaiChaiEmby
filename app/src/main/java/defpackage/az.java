package defpackage;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.TextUnitKt;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineContextKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class az implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ az(Ref.ObjectRef objectRef, boolean z) {
        this.a = 2;
        this.c = objectRef;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean z = this.b;
        Serializable serializable = this.c;
        switch (i) {
            case 0:
                String str = (String) serializable;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-541439185, iIntValue, -1, "com.dh.myembyapp.ui.components.RepeatableIconButton.<anonymous> (DanmakuSettingsDialog.kt:408)");
                    }
                    long sp = TextUnitKt.getSp(16);
                    Color.Companion companion = Color.INSTANCE;
                    TextKt.m3048TextNvy7gAk(str, null, z ? companion.m5189getWhite0d7_KjU() : companion.m5182getGray0d7_KjU(), null, sp, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24576, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) serializable;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(805847720, iIntValue2, -1, "com.dh.myembyapp.ui.components.VideoPriorityRoundButton.<anonymous>.<anonymous> (OtherSettingsOverlay.kt:1303)");
                    }
                    long sp2 = TextUnitKt.getSp(16);
                    Color.Companion companion2 = Color.INSTANCE;
                    TextKt.m3048TextNvy7gAk(str2, null, z ? companion2.m5189getWhite0d7_KjU() : companion2.m5182getGray0d7_KjU(), null, sp2, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24576, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                return CoroutineContextKt.foldCopies$lambda$1((Ref.ObjectRef) serializable, z, (CoroutineContext) obj, (CoroutineContext.Element) obj2);
        }
    }

    public /* synthetic */ az(int i, String str, boolean z) {
        this.a = i;
        this.b = z;
        this.c = str;
    }
}
