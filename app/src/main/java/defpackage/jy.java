package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Shadow;
import androidx.media3.exoplayer.ExoPlayer;
import com.dh.myembyapp.data.DanmakuMemory;
import com.dh.myembyapp.data.model.DanmakuEpisode;
import com.dh.myembyapp.data.model.EpisodeLocator;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class jy extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.g = obj5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                return new jy((List) obj6, (MutableState) obj5, (Integer) obj4, (Integer) obj3, (DanmakuMemory) obj2, continuation, 0);
            case 1:
                return new jy((EpisodeLocator) obj6, (MutableState) obj5, (MediaItem) obj4, (Function3) obj3, (MutableState) obj2, continuation, 1);
            case 2:
                return new jy((String) obj6, (String) obj5, (String) obj4, (va0) obj3, (NavBackStackEntry) obj2, continuation, 2);
            default:
                return new jy((String[]) obj6, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((jy) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        sw swVar;
        String str;
        int i = this.a;
        Object obj2 = null;
        Object obj3 = this.g;
        Object obj4 = this.e;
        Object obj5 = this.c;
        Object obj6 = this.b;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj6;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                List list = (List) obj5;
                if (list.isEmpty()) {
                    mutableState.setValue(null);
                } else {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((sw) it.next()).a, (String) mutableState.getValue())) {
                                break;
                            }
                        }
                    }
                    Integer num = (Integer) obj7;
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            sw swVar2 = (sw) next;
                            if (num != null) {
                                int i2 = swVar2.c;
                                int size = swVar2.b.size() + i2;
                                int iIntValue = num.intValue();
                                if (i2 > iIntValue || iIntValue >= size) {
                                }
                            }
                        } else {
                            next = null;
                        }
                    }
                    sw swVar3 = (sw) next;
                    if (swVar3 != null) {
                        str = swVar3.a;
                    } else {
                        Integer num2 = (Integer) obj4;
                        DanmakuMemory danmakuMemory = (DanmakuMemory) obj3;
                        for (Object obj8 : list) {
                            sw swVar4 = (sw) obj8;
                            if (num2 != null) {
                                List list2 = swVar4.b;
                                if (list2.isEmpty()) {
                                    continue;
                                } else {
                                    Iterator it3 = list2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            Integer numExtractEpisodeNumber = danmakuMemory.extractEpisodeNumber(((DanmakuEpisode) it3.next()).getEpisodeTitle());
                                            int iIntValue2 = num2.intValue();
                                            if (numExtractEpisodeNumber != null && numExtractEpisodeNumber.intValue() == iIntValue2) {
                                                obj2 = obj8;
                                                swVar = (sw) obj2;
                                                if (swVar != null) {
                                                    str = swVar.a;
                                                } else {
                                                    str = ((sw) CollectionsKt.first(list)).a;
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                        swVar = (sw) obj2;
                        if (swVar != null) {
                            str = swVar.a;
                        } else {
                            str = ((sw) CollectionsKt.first(list)).a;
                        }
                    }
                    mutableState.setValue(str);
                }
                break;
            case 1:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                Shadow shadow = u90.o;
                if (((Boolean) ((MutableState) obj6).getValue()).booleanValue()) {
                    u90.A((MediaItem) obj7, (Function3) obj4, (MutableState) obj3, (EpisodeLocator) obj5, true);
                }
                break;
            case 2:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                String str2 = (String) obj5;
                if (str2 != null) {
                    String str3 = (String) obj6;
                    if (str3 == null) {
                        str3 = (String) obj7;
                    }
                    ((va0) obj4).x(str3, str2, false);
                    ((NavBackStackEntry) obj3).getSavedStateHandle().remove("detailPreselectMediaSourceId");
                }
                break;
            default:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ((MutableState) obj7).setValue((ExoPlayer) ((MutableState) obj6).getValue());
                String[] strArr = (String[]) obj5;
                String str4 = strArr[0];
                if (str4 != null) {
                    ((MutableState) obj4).setValue(Boolean.FALSE);
                    ((MutableState) obj3).setValue(str4);
                    strArr[0] = null;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
