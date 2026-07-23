package defpackage;

import com.dh.myembyapp.data.model.EpisodeLocator;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.OtherServerResourceSection;
import com.dh.myembyapp.data.model.ProviderIds;
import com.dh.myembyapp.data.model.ServerConfig;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class la0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ va0 b;
    public final /* synthetic */ ServerConfig c;
    public final /* synthetic */ MediaItem d;
    public final /* synthetic */ EpisodeLocator e;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la0(va0 va0Var, ServerConfig serverConfig, MediaItem mediaItem, EpisodeLocator episodeLocator, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.b = va0Var;
        this.c = serverConfig;
        this.d = mediaItem;
        this.e = episodeLocator;
        this.g = j;
        this.h = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new la0(this.b, this.c, this.d, this.e, this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((la0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF;
        OtherServerResourceSection otherServerResourceSection;
        String message;
        va0 va0Var = this.b;
        MutableStateFlow mutableStateFlow = va0Var.j0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        MediaItem mediaItem = this.d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            hb1 hb1Var = va0Var.b;
            String type = mediaItem.getType();
            String name = mediaItem.getName();
            Integer productionYear = mediaItem.getProductionYear();
            ProviderIds providerIds = mediaItem.getProviderIds();
            this.a = 1;
            objF = hb1Var.f(this.c, type, name, productionYear, providerIds, this.e, this);
            if (objF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            objF = ((Result) obj).getValue();
        }
        if (this.g != va0Var.e) {
            return Unit.INSTANCE;
        }
        jb1 jb1Var = (jb1) mutableStateFlow.getValue();
        String str = jb1Var.a;
        List list = jb1Var.b;
        if (!Intrinsics.areEqual(str, mediaItem.getId())) {
            return Unit.INSTANCE;
        }
        int i2 = this.h;
        if (i2 < 0 || i2 >= list.size()) {
            return Unit.INSTANCE;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        boolean zM8832isSuccessimpl = Result.m8832isSuccessimpl(objF);
        ServerConfig serverConfig = this.c;
        if (zM8832isSuccessimpl) {
            List listEmptyList = (List) (Result.m8831isFailureimpl(objF) ? null : objF);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            otherServerResourceSection = new OtherServerResourceSection(serverConfig, listEmptyList, false, null, 8, null);
        } else {
            Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objF);
            if (thM8828exceptionOrNullimpl == null || (message = thM8828exceptionOrNullimpl.getMessage()) == null) {
                message = "加载失败";
            }
            otherServerResourceSection = new OtherServerResourceSection(serverConfig, null, false, message, 2, null);
        }
        mutableList.set(i2, otherServerResourceSection);
        mutableStateFlow.setValue(new jb1(jb1Var.a, jb1Var.c, mutableList));
        return Unit.INSTANCE;
    }
}
