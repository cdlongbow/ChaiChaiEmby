package defpackage;

import android.util.Log;
import androidx.media3.exoplayer.ExoPlayer;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class mn1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ ExoPlayer c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ n61 h;
    public final /* synthetic */ t4 i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ String n;
    public final /* synthetic */ Function1 o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Function1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn1(Function0 function0, ExoPlayer exoPlayer, Function2 function2, String str, Function1 function1, n61 n61Var, t4 t4Var, Function1 function3, Function1 function4, boolean z, boolean z2, String str2, Function1 function5, String str3, Function1 function6, Continuation continuation) {
        super(2, continuation);
        this.b = function0;
        this.c = exoPlayer;
        this.d = function2;
        this.e = str;
        this.g = function1;
        this.h = n61Var;
        this.i = t4Var;
        this.j = function3;
        this.k = function4;
        this.l = z;
        this.m = z2;
        this.n = str2;
        this.o = function5;
        this.p = str3;
        this.q = function6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new mn1(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mn1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!((Boolean) this.b.invoke()).booleanValue()) {
                Log.d("PlayerScreen", "后台暂停状态下取消播放结束自动迁移");
                return Unit.INSTANCE;
            }
            this.d.invoke(this.e, Boxing.boxLong(RangesKt.coerceAtLeast(this.c.getDuration(), 0L)));
            this.a = 1;
            obj = this.g.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
        }
        MediaItem mediaItem = (MediaItem) obj;
        if (mediaItem != null) {
            ll0.l("播放结束，自动播放下一集: ", mediaItem.getId(), "PlayerScreen");
            this.h.invoke("正在播放下一集");
            this.i.invoke();
            this.j.invoke(mediaItem.getId());
            this.k.invoke(mediaItem.getId());
        } else {
            boolean z = this.l;
            String str2 = this.p;
            if (!z && this.m && (str = this.n) != null && !StringsKt.isBlank(str)) {
                this.o.invoke(str);
                Log.d("PlayerScreen", "播放结束返回详情页时刷新服务器最近播放时间: serverId=" + str + ", mediaId=" + str2);
            }
            Log.d("PlayerScreen", "播放结束，没有下一集，返回详情页");
            this.q.invoke(str2);
        }
        return Unit.INSTANCE;
    }
}
