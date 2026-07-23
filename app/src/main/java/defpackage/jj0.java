package defpackage;

import android.content.Context;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.SnapshotStateKt;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class jj0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ LazyGridState c;
    public final /* synthetic */ List d;
    public final /* synthetic */ Set e;
    public final /* synthetic */ Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj0(LazyGridState lazyGridState, List list, Set set, Context context, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = lazyGridState;
        this.d = list;
        this.e = set;
        this.g = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new jj0(this.c, this.d, this.e, this.g, continuation, 0);
            default:
                return new jj0(this.c, this.d, this.e, this.g, continuation, 1);
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
        return ((jj0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        Context context = this.g;
        Set set = this.e;
        final List list = this.d;
        final LazyGridState lazyGridState = this.c;
        final int i2 = 1;
        switch (i) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final int i4 = 0;
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new ij0(SnapshotStateKt.snapshotFlow(new Function0() { // from class: ej0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int index;
                            String primary;
                            String primary2;
                            int i5 = i4;
                            List list2 = list;
                            LazyGridState lazyGridState2 = lazyGridState;
                            switch (i5) {
                                case 0:
                                    LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.lastOrNull((List) lazyGridState2.getLayoutInfo().getVisibleItemsInfo());
                                    index = lazyGridItemInfo != null ? lazyGridItemInfo.getIndex() : -1;
                                    if (index < 0) {
                                        return CollectionsKt.emptyList();
                                    }
                                    List<MediaItem> listTake = CollectionsKt.take(CollectionsKt.drop(list2, index + 1), 12);
                                    ArrayList arrayList = new ArrayList();
                                    for (MediaItem mediaItem : listTake) {
                                        ImageTags imageTags = mediaItem.getImageTags();
                                        String imageUrl = (imageTags == null || (primary = imageTags.getPrimary()) == null) ? null : RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), "Primary", primary, 320);
                                        if (imageUrl != null) {
                                            arrayList.add(imageUrl);
                                        }
                                    }
                                    return arrayList;
                                default:
                                    LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.lastOrNull((List) lazyGridState2.getLayoutInfo().getVisibleItemsInfo());
                                    index = lazyGridItemInfo2 != null ? lazyGridItemInfo2.getIndex() : -1;
                                    if (index < 0) {
                                        return CollectionsKt.emptyList();
                                    }
                                    List<MediaItem> listTake2 = CollectionsKt.take(CollectionsKt.drop(list2, index + 1), 12);
                                    ArrayList arrayList2 = new ArrayList();
                                    for (MediaItem mediaItem2 : listTake2) {
                                        ImageTags imageTags2 = mediaItem2.getImageTags();
                                        String imageUrl2 = (imageTags2 == null || (primary2 = imageTags2.getPrimary()) == null) ? null : RetrofitClient.INSTANCE.getImageUrl(mediaItem2.getId(), "Primary", primary2, 320);
                                        if (imageUrl2 != null) {
                                            arrayList2.add(imageUrl2);
                                        }
                                    }
                                    return arrayList2;
                            }
                        }
                    }), set, 0));
                    fj0 fj0Var = new fj0(context, 0);
                    this.b = 1;
                    if (flowDistinctUntilChanged.collect(fj0Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.b;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged2 = FlowKt.distinctUntilChanged(new ij0(SnapshotStateKt.snapshotFlow(new Function0() { // from class: ej0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int index;
                            String primary;
                            String primary2;
                            int i6 = i2;
                            List list2 = list;
                            LazyGridState lazyGridState2 = lazyGridState;
                            switch (i6) {
                                case 0:
                                    LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.lastOrNull((List) lazyGridState2.getLayoutInfo().getVisibleItemsInfo());
                                    index = lazyGridItemInfo != null ? lazyGridItemInfo.getIndex() : -1;
                                    if (index < 0) {
                                        return CollectionsKt.emptyList();
                                    }
                                    List<MediaItem> listTake = CollectionsKt.take(CollectionsKt.drop(list2, index + 1), 12);
                                    ArrayList arrayList = new ArrayList();
                                    for (MediaItem mediaItem : listTake) {
                                        ImageTags imageTags = mediaItem.getImageTags();
                                        String imageUrl = (imageTags == null || (primary = imageTags.getPrimary()) == null) ? null : RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), "Primary", primary, 320);
                                        if (imageUrl != null) {
                                            arrayList.add(imageUrl);
                                        }
                                    }
                                    return arrayList;
                                default:
                                    LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.lastOrNull((List) lazyGridState2.getLayoutInfo().getVisibleItemsInfo());
                                    index = lazyGridItemInfo2 != null ? lazyGridItemInfo2.getIndex() : -1;
                                    if (index < 0) {
                                        return CollectionsKt.emptyList();
                                    }
                                    List<MediaItem> listTake2 = CollectionsKt.take(CollectionsKt.drop(list2, index + 1), 12);
                                    ArrayList arrayList2 = new ArrayList();
                                    for (MediaItem mediaItem2 : listTake2) {
                                        ImageTags imageTags2 = mediaItem2.getImageTags();
                                        String imageUrl2 = (imageTags2 == null || (primary2 = imageTags2.getPrimary()) == null) ? null : RetrofitClient.INSTANCE.getImageUrl(mediaItem2.getId(), "Primary", primary2, 320);
                                        if (imageUrl2 != null) {
                                            arrayList2.add(imageUrl2);
                                        }
                                    }
                                    return arrayList2;
                            }
                        }
                    }), set, 1));
                    fj0 fj0Var2 = new fj0(context, 1);
                    this.b = 1;
                    if (flowDistinctUntilChanged2.collect(fj0Var2, this) == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i5 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
