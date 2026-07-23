package defpackage;

import android.net.Uri;
import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.dh.myembyapp.data.model.MediaStream;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ry1 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Function k;

    public /* synthetic */ ry1(u61 u61Var, LazyListState lazyListState, MutableState mutableState, String str, SnapshotStateMap snapshotStateMap, SnapshotStateMap snapshotStateMap2, Function1 function1, MutableState mutableState2, MutableState mutableState3) {
        this.c = u61Var;
        this.d = lazyListState;
        this.e = mutableState;
        this.b = str;
        this.i = snapshotStateMap;
        this.j = snapshotStateMap2;
        this.k = function1;
        this.g = mutableState2;
        this.h = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function function = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        switch (i) {
            case 0:
                u61 u61Var = (u61) obj9;
                LazyListState lazyListState = (LazyListState) obj8;
                MutableState mutableState = (MutableState) obj7;
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj4;
                SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj3;
                Function1 function1 = (Function1) function;
                MutableState mutableState2 = (MutableState) obj6;
                MutableState mutableState3 = (MutableState) obj5;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-34561713, iIntValue, -1, "com.dh.myembyapp.ui.components.ServerSortDialog.<anonymous> (ServerSortDialog.kt:161)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), u61Var.a, null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    CardKt.Card(SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(620.0f)), 0.0f, Dp.m7813constructorimpl(620.0f), 1, null), null, CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(427228503, true, new q5(u61Var, lazyListState, mutableState, this.b, snapshotStateMap, snapshotStateMap2, function1, mutableState2, mutableState3), composer, 54), composer, 196614, 26);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                am1 am1Var = (am1) function;
                MediaStream mediaStream = (MediaStream) obj;
                Uri uri = (Uri) obj2;
                mediaStream.getClass();
                uri.getClass();
                Log.d("SubtitleTrack", "开启转码字幕前已缓存内封文本字幕: streamIndex=" + mediaStream.getIndex() + ", uri=" + uri);
                ig2.F((yh1) obj6, this.b, (String) obj5, (TranscodeQualityOption) obj4, (zl1) obj3, am1Var, (Integer) obj9);
                ((n61) obj8).invoke("字幕已开启");
                ((xl1) obj7).invoke();
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ry1(Integer num, n61 n61Var, xl1 xl1Var, yh1 yh1Var, String str, String str2, TranscodeQualityOption transcodeQualityOption, zl1 zl1Var, am1 am1Var) {
        this.c = num;
        this.d = n61Var;
        this.e = xl1Var;
        this.g = yh1Var;
        this.b = str;
        this.h = str2;
        this.i = transcodeQualityOption;
        this.j = zl1Var;
        this.k = am1Var;
    }
}
