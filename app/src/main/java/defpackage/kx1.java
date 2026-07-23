package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;

import com.dh.myembyapp.data.model.ServerIconEntry;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kx1 implements Function4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ List b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public kx1(List list, ks1 ks1Var, MutableState mutableState, MutableState mutableState2) {
        this.b = list;
        this.d = ks1Var;
        this.c = mutableState;
        this.e = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.a;
        MutableState mutableState = this.c;
        Object obj5 = this.d;
        List list = this.b;
        Object obj6 = this.e;
        switch (i3) {
            case 0:
                LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj;
                int iIntValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (composer.changed(lazyGridItemScope) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= composer.changed(iIntValue) ? 32 : 16;
                }
                if (composer.shouldExecute((i & Input.Keys.NUMPAD_3) != 146, i & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1117249557, i, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
                    }
                    ServerIconEntry serverIconEntry = (ServerIconEntry) list.get(iIntValue);
                    composer.startReplaceGroup(1617530832);
                    ks1 ks1Var = (ks1) obj5;
                    boolean zChanged = composer.changed(serverIconEntry);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new n90(serverIconEntry, mutableState, (MutableState) obj6, 2);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    lx1.b(serverIconEntry, ks1Var, (Function0) objRememberedValue, composer, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                LazyItemScope lazyItemScope = (LazyItemScope) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                Function1 function1 = (Function1) obj6;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (composer2.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= composer2.changed(iIntValue3) ? 32 : 16;
                }
                if (composer2.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(802480018, i2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    o32 o32Var = (o32) list.get(iIntValue3);
                    composer2.startReplaceGroup(-1258713581);
                    String str = o32Var.b;
                    boolean zAreEqual = Intrinsics.areEqual(o32Var.a, (String) obj5);
                    boolean zChanged2 = composer2.changed(function1) | composer2.changed(o32Var);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new ni(11, function1, o32Var);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function0 = (Function0) objRememberedValue2;
                    boolean zChanged3 = composer2.changed(o32Var);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new ni(12, o32Var, mutableState);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    q32.c(str, zAreEqual, function0, (Function0) objRememberedValue3, composer2, 0);
                    composer2.endReplaceGroup();
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

    public kx1(List list, String str, Function1 function1, MutableState mutableState) {
        this.b = list;
        this.d = str;
        this.e = function1;
        this.c = mutableState;
    }
}
