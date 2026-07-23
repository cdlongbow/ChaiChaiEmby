package defpackage;


import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class f00 extends SuspendLambda implements Function2 {
    public final /* synthetic */ up1 a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f00(up1 up1Var, long j, Continuation continuation) {
        super(2, continuation);
        this.a = up1Var;
        this.b = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f00(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f00) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        up1 up1Var = this.a;
        List list = up1Var.a;
        int i = up1Var.d.a;
        boolean zIsEmpty = list.isEmpty();
        long position = this.b;
        if (zIsEmpty) {
            return new wt0(CollectionsKt.emptyList(), CollectionsKt.emptyList(), position, position);
        }
        int iG = l00.g(list, RangesKt.coerceAtLeast(position - 15000, 0L));
        int iG2 = l00.g(list, 90000 + position);
        int iMin = (iG2 > iG && iG2 - iG >= i) ? Math.min(list.size(), Math.min(iG2, RangesKt.coerceAtLeast(i * 2, i) + iG)) : Math.min(list.size(), iG + i);
        List list2 = CollectionsKt.toList(list.subList(iG, iMin));
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (iMin < list.size()) {
            listCreateListBuilder.addAll(CollectionsKt___CollectionsKt.chunked(list.subList(iMin, list.size()), i));
        }
        if (iG > 0) {
            listCreateListBuilder.addAll(CollectionsKt___CollectionsKt.chunked(list.subList(0, iG), i));
        }
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        DanmakuItemData danmakuItemData = (DanmakuItemData) CollectionsKt.firstOrNull(list2);
        long position2 = danmakuItemData != null ? danmakuItemData.getPosition() : position;
        DanmakuItemData danmakuItemData2 = (DanmakuItemData) CollectionsKt.lastOrNull(list2);
        if (danmakuItemData2 != null) {
            position = danmakuItemData2.getPosition();
        }
        return new wt0(list2, listBuild, position2, position);
    }
}
