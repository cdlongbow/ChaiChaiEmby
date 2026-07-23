package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.IntroOutroMemory;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.server.WebDavSyncConfigServerManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class oj1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a = 1;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj1(WebDavSyncConfigServerManager webDavSyncConfigServerManager, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Function1 function1, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, Continuation continuation) {
        super(2, continuation);
        this.b = webDavSyncConfigServerManager;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
        this.i = function1;
        this.j = mutableState6;
        this.k = mutableState7;
        this.l = mutableState8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.c;
        switch (i) {
            case 0:
                oj1 oj1Var = new oj1((eo1) obj10, (zu0) obj9, (IntroOutroMemory) obj2, (zu0) obj8, (zu0) obj7, (zu0) obj6, (zu0) obj5, (zu0) obj4, (zu0) obj3, continuation);
                oj1Var.b = obj;
                return oj1Var;
            default:
                return new oj1((WebDavSyncConfigServerManager) this.b, (MutableState) obj10, (MutableState) obj9, (MutableState) obj8, (MutableState) obj7, (MutableState) obj6, (Function1) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
        }
        return ((oj1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g31 g31Var;
        int i = this.a;
        Object obj2 = this.l;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.k;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.c;
        switch (i) {
            case 0:
                zu0 zu0Var = (zu0) obj9;
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                eo1 eo1Var = (eo1) obj10;
                MediaItem mediaItem = eo1Var.a;
                if (Intrinsics.areEqual(mediaItem.getType(), "Episode")) {
                    Log.d("IntroOutro", "========== 开始获取章节信息 ==========");
                    Log.d("IntroOutro", "剧集ID: " + mediaItem.getId());
                    ll0.l("剧集名称: ", mediaItem.getName(), "IntroOutro");
                    zu0Var.a.setValue(null);
                    zu0Var.b.setValue(null);
                    zu0Var.c.setValue(null);
                    zu0Var.d.setValue(null);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new w3(eo1Var, zu0Var, (zu0) obj8, (zu0) obj7, (zu0) obj6, (zu0) obj4, null, 2), 3, null);
                    IntroOutroMemory introOutroMemory = (IntroOutroMemory) obj2;
                    mediaItem.getClass();
                    introOutroMemory.getClass();
                    String seasonId = mediaItem.getSeasonId();
                    if (seasonId == null) {
                        seasonId = mediaItem.getParentId();
                    }
                    ll0.l("季ID: ", seasonId, "IntroOutro");
                    if (seasonId == null) {
                        Log.w("IntroOutro", "季ID为空，无法获取手动标记");
                        g31Var = new g31(null, null);
                    } else {
                        IntroOutroMemory.SeasonIntroOutroMemory seasonIntroOutro = introOutroMemory.getSeasonIntroOutro(seasonId);
                        Long manualIntroTime = seasonIntroOutro != null ? seasonIntroOutro.getManualIntroTime() : null;
                        Long manualOutroRemainingMs = seasonIntroOutro != null ? seasonIntroOutro.getManualOutroRemainingMs() : null;
                        g31 g31Var2 = new g31(manualIntroTime, manualOutroRemainingMs);
                        Log.i("IntroOutro", "✅ 获取手动标记: 正片=" + manualIntroTime + "ms, 片尾剩余=" + manualOutroRemainingMs + "ms");
                        g31Var = g31Var2;
                    }
                    ((zu0) obj3).e.setValue(g31Var.a);
                    ((zu0) obj5).f.setValue(g31Var.b);
                    MutableState mutableState = zu0Var.g;
                    Boolean bool = Boolean.FALSE;
                    mutableState.setValue(bool);
                    zu0Var.h.setValue(bool);
                    Log.d("IntroOutro", "重置跳过标记");
                    Log.d("IntroOutro", "========================================");
                }
                break;
            default:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                MutableState mutableState2 = (MutableState) obj5;
                mutableState2.setValue(((WebDavSyncConfigServerManager) this.b).startServer(ef2.g((MutableState) obj10, (MutableState) obj9, (MutableState) obj8, (MutableState) obj7, (MutableState) obj6), new cy((Function1) obj4, (MutableState) obj10, (MutableState) obj9, (MutableState) obj8, (MutableState) obj7, (MutableState) obj6, (MutableState) obj3, 7)));
                MutableState mutableState3 = (MutableState) obj2;
                String str = (String) mutableState2.getValue();
                mutableState3.setValue(Boolean.valueOf(str == null || StringsKt.isBlank(str)));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj1(eo1 eo1Var, zu0 zu0Var, IntroOutroMemory introOutroMemory, zu0 zu0Var2, zu0 zu0Var3, zu0 zu0Var4, zu0 zu0Var5, zu0 zu0Var6, zu0 zu0Var7, Continuation continuation) {
        super(2, continuation);
        this.c = eo1Var;
        this.d = zu0Var;
        this.l = introOutroMemory;
        this.e = zu0Var2;
        this.g = zu0Var3;
        this.h = zu0Var4;
        this.i = zu0Var5;
        this.j = zu0Var6;
        this.k = zu0Var7;
    }
}
