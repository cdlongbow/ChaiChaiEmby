package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lj1 extends FunctionReferenceImpl implements Function4 {
    public final /* synthetic */ mx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj1(mx mxVar) {
        super(4, Intrinsics.Kotlin.class, "handleDanmakuSearchSelect", "PlayerScreenContent$lambda$121$handleDanmakuSearchSelect(Lcom/dh/myembyapp/ui/screens/player/danmaku/DanmakuPlayerInteractionHandler;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
        this.a = mxVar;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj).longValue();
        String str = (String) obj2;
        String str2 = (String) obj3;
        String str3 = (String) obj4;
        s01.D(str, str2, str3);
        mx mxVar = this.a;
        mxVar.b.f.setValue(Boolean.FALSE);
        BuildersKt__Builders_commonKt.launch$default(mxVar.a, null, null, new lx(mxVar, jLongValue, str, str2, str3, null), 3, null);
        mxVar.j.invoke(Long.valueOf(System.currentTimeMillis()));
        return Unit.INSTANCE;
    }
}
