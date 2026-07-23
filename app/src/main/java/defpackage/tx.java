package defpackage;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.unit.Dp;
import com.dh.myembyapp.data.DanmakuMemory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tx implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ FocusRequester e;
    public final /* synthetic */ CoroutineScope g;
    public final /* synthetic */ SoftwareKeyboardController h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ FocusRequester n;
    public final /* synthetic */ String o;
    public final /* synthetic */ Bitmap p;
    public final /* synthetic */ String q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ Integer t;
    public final /* synthetic */ Integer u;
    public final /* synthetic */ DanmakuMemory v;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ Function4 y;
    public final /* synthetic */ Function0 z;

    public /* synthetic */ tx(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, FocusRequester focusRequester, CoroutineScope coroutineScope, SoftwareKeyboardController softwareKeyboardController, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, FocusRequester focusRequester2, String str, Bitmap bitmap, String str2, MutableState mutableState9, MutableState mutableState10, Integer num, Integer num2, DanmakuMemory danmakuMemory, String str3, String str4, Function4 function4, Function0 function0, int i) {
        this.a = i;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = focusRequester;
        this.g = coroutineScope;
        this.h = softwareKeyboardController;
        this.i = mutableState4;
        this.j = mutableState5;
        this.k = mutableState6;
        this.l = mutableState7;
        this.m = mutableState8;
        this.n = focusRequester2;
        this.o = str;
        this.p = bitmap;
        this.q = str2;
        this.r = mutableState9;
        this.s = mutableState10;
        this.t = num;
        this.u = num2;
        this.v = danmakuMemory;
        this.w = str3;
        this.x = str4;
        this.y = function4;
        this.z = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-97848602, iIntValue, -1, "com.dh.myembyapp.ui.components.DanmakuSearchDialog.<anonymous> (DanmakuSearchDialog.kt:245)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5178getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM275backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer);
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    SurfaceKt.m2905SurfaceT9BRK9s(SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(760.0f)), Dp.m7813constructorimpl(600.0f)), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f)), ColorKt.Color(4280953386L), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(132317575, true, new tx(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, 1), composer, 54), composer, 12583302, 120);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                return qy.i(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
