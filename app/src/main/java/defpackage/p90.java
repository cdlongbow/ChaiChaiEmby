package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.focus.FocusRequester;

import com.dh.myembyapp.data.model.OtherServerResourceMatch;
import com.dh.myembyapp.data.model.ServerConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p90 implements Function4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ String b;
    public final /* synthetic */ FocusRequester c;
    public final /* synthetic */ List d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;

    public p90(List list, String str, FocusRequester focusRequester, List list2, Function2 function2, Function1 function1, Function0 function0, Function0 function3) {
        this.a = list;
        this.b = str;
        this.c = focusRequester;
        this.d = list2;
        this.e = function2;
        this.g = function1;
        this.h = function0;
        this.i = function3;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= composer.changed(iIntValue) ? 32 : 16;
        }
        if (composer.shouldExecute((i & Input.Keys.NUMPAD_3) != 146, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            ya1 ya1Var = (ya1) this.a.get(iIntValue);
            composer.startReplaceGroup(585416440);
            ServerConfig serverConfig = ya1Var.a;
            OtherServerResourceMatch otherServerResourceMatch = ya1Var.b;
            boolean zAreEqual = Intrinsics.areEqual(serverConfig.getId(), this.b);
            FocusRequester focusRequester = iIntValue == 0 ? this.c : null;
            boolean z = iIntValue == 0;
            boolean z2 = iIntValue == CollectionsKt.getLastIndex(this.d);
            Function2 function2 = this.e;
            boolean zChanged = composer.changed(function2) | composer.changedInstance(ya1Var);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ni(7, function2, ya1Var);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            Function1 function1 = this.g;
            boolean zChanged2 = composer.changed(function1) | composer.changedInstance(ya1Var);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ni(8, function1, ya1Var);
                composer.updateRememberedValue(objRememberedValue2);
            }
            u90.q0(serverConfig, otherServerResourceMatch, zAreEqual, focusRequester, z, z2, function0, (Function0) objRememberedValue2, this.h, this.i, composer, 0);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
