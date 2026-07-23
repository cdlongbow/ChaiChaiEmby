package defpackage;

import android.util.Log;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zp0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState A;
    public final /* synthetic */ MutableState B;
    public final /* synthetic */ MutableState C;
    public final /* synthetic */ MutableState D;
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ Integer s;
    public final /* synthetic */ List t;
    public final /* synthetic */ String u;
    public final /* synthetic */ LazyListState v;
    public final /* synthetic */ Function0 w;
    public final /* synthetic */ MutableState x;
    public final /* synthetic */ MutableState y;
    public final /* synthetic */ MutableState z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp0(boolean z, String str, String str2, boolean z2, boolean z3, Integer num, List list, String str3, LazyListState lazyListState, Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, Continuation continuation) {
        super(2, continuation);
        this.n = z;
        this.o = str;
        this.p = str2;
        this.q = z2;
        this.r = z3;
        this.s = num;
        this.t = list;
        this.u = str3;
        this.v = lazyListState;
        this.w = function0;
        this.x = mutableState;
        this.y = mutableState2;
        this.z = mutableState3;
        this.A = mutableState4;
        this.B = mutableState5;
        this.C = mutableState6;
        this.D = mutableState7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zp0(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zp0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0279  */
    /* JADX WARN: Code duplicated, block: B:141:0x0280  */
    /* JADX WARN: Code duplicated, block: B:93:0x0158  */
    /* JADX WARN: Code duplicated, block: B:95:0x015c  */
    /* JADX WARN: Code duplicated, block: B:96:0x015e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        int i;
        int iIntValue;
        int iIntValue2;
        String seriesId;
        boolean zAreEqual;
        Integer num;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer num2;
        MediaItem mediaItem;
        int iIntValue3;
        boolean z3;
        Function0 function0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.m;
        MutableState mutableState = this.C;
        LazyListState lazyListState = this.v;
        Integer num3 = null;
        int i7 = 1;
        try {
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = this.b;
                    z3 = this.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e) {
                        e = e;
                        Log.e("ResumeItemSection", "Error scrolling to target item", e);
                    }
                    zAreEqual = z2;
                    z = z3;
                    if (zAreEqual) {
                        mutableState.setValue(Boolean.FALSE);
                        if (!z && (function0 = this.w) != null) {
                            function0.invoke();
                        }
                    }
                    return Unit.INSTANCE;
                }
                int i8 = this.l;
                zAreEqual = this.b;
                int i9 = this.k;
                i3 = this.j;
                i5 = this.i;
                i4 = this.h;
                boolean z4 = this.a;
                seriesId = (String) this.g;
                mediaItem = (MediaItem) this.e;
                num2 = (Integer) this.d;
                Integer num4 = (Integer) this.c;
                try {
                    ResultKt.throwOnFailure(obj);
                    iIntValue2 = i9;
                    z = z4;
                    num = num4;
                    i2 = i8;
                } catch (Exception e2) {
                    e = e2;
                    z2 = zAreEqual;
                    z3 = z4;
                    Log.e("ResumeItemSection", "Error scrolling to target item", e);
                }
                Log.e("ResumeItemSection", "Error scrolling to target item", e);
                zAreEqual = z2;
                z = z3;
                if (zAreEqual) {
                    mutableState.setValue(Boolean.FALSE);
                    if (!z) {
                        function0.invoke();
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (!this.n) {
                return Unit.INSTANCE;
            }
            if (!Intrinsics.areEqual(this.o, "继续观看") || (str = this.p) == null) {
                return Unit.INSTANCE;
            }
            if (!this.q) {
                return Unit.INSTANCE;
            }
            MutableState mutableState2 = this.x;
            z = this.r;
            if (z && ((Boolean) mutableState2.getValue()).booleanValue()) {
                return Unit.INSTANCE;
            }
            MutableState mutableState3 = this.y;
            if (!z && ((Boolean) mutableState3.getValue()).booleanValue()) {
                return Unit.INSTANCE;
            }
            List list = this.t;
            Integer num5 = this.s;
            if (num5 == null || (iIntValue3 = num5.intValue()) < 0 || iIntValue3 >= list.size()) {
                num5 = null;
            }
            if (num5 != null && Intrinsics.areEqual(((MediaItem) list.get(num5.intValue())).getId(), str)) {
                num3 = num5;
            }
            Iterator it = list.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                if (Intrinsics.areEqual(((MediaItem) it.next()).getId(), str)) {
                    break;
                }
                i10++;
            }
            String str2 = this.u;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                Iterator it2 = list.iterator();
                i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    }
                    MediaItem mediaItem2 = (MediaItem) it2.next();
                    if (Intrinsics.areEqual(mediaItem2.getSeriesId(), str2) || Intrinsics.areEqual(mediaItem2.getId(), str2)) {
                        break;
                    }
                    i++;
                }
            } else {
                i = -1;
                break;
            }
            if (num5 != null) {
                iIntValue = num5.intValue();
            } else {
                iIntValue = !list.isEmpty() ? 0 : -1;
            }
            if (z) {
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                } else if (i10 >= 0) {
                    iIntValue2 = i10;
                } else if (i >= 0) {
                    iIntValue2 = i;
                } else {
                    iIntValue2 = iIntValue;
                }
            } else if (i10 >= 0) {
                iIntValue2 = i10;
            } else if (i >= 0) {
                iIntValue2 = i;
            } else {
                iIntValue2 = iIntValue;
            }
            if (iIntValue2 >= 0) {
                MediaItem mediaItem3 = (MediaItem) list.get(iIntValue2);
                seriesId = mediaItem3.getSeriesId();
                if (seriesId == null) {
                    seriesId = mediaItem3.getId();
                }
                zAreEqual = i10 >= 0 ? Intrinsics.areEqual((String) this.z.getValue(), mediaItem3.getId()) : Intrinsics.areEqual((String) this.A.getValue(), seriesId);
                this.B.setValue(Boolean.valueOf(!z));
                Boolean bool = Boolean.TRUE;
                mutableState.setValue(bool);
                num = num5;
                this.D.setValue(Boxing.boxInt(iIntValue2));
                if (z) {
                    mutableState2.setValue(bool);
                } else {
                    mutableState3.setValue(bool);
                }
                try {
                    List<LazyListItemInfo> visibleItemsInfo = lazyListState.getLayoutInfo().getVisibleItemsInfo();
                    if (!(visibleItemsInfo != null) || !visibleItemsInfo.isEmpty()) {
                        Iterator<T> it3 = visibleItemsInfo.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                i2 = 0;
                                break;
                            }
                            if (((LazyListItemInfo) it3.next()).getIndex() == iIntValue2) {
                                i2 = 1;
                                break;
                            }
                        }
                    } else {
                        i2 = 0;
                        break;
                    }
                    if (i2 == 0) {
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.g = null;
                        this.a = z;
                        this.h = i10;
                        this.i = i;
                        this.j = iIntValue;
                        this.k = iIntValue2;
                        this.b = zAreEqual;
                        this.l = i2;
                        i7 = 1;
                        this.m = 1;
                        if (lazyListState.scrollToItem(iIntValue2, 0, this) != coroutine_suspended) {
                            i3 = iIntValue;
                            i4 = i10;
                            i5 = i;
                            num2 = num3;
                            mediaItem = mediaItem3;
                        }
                        return coroutine_suspended;
                    }
                    if (zAreEqual) {
                        mutableState.setValue(Boolean.FALSE);
                        if (!z) {
                            function0.invoke();
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    z2 = zAreEqual;
                    z3 = z;
                    Log.e("ResumeItemSection", "Error scrolling to target item", e);
                    zAreEqual = z2;
                    z = z3;
                    if (zAreEqual) {
                        mutableState.setValue(Boolean.FALSE);
                        if (!z) {
                            function0.invoke();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
            b7 b7Var = new b7(SnapshotStateKt.snapshotFlow(new vo(lazyListState, iIntValue2, i7)), 6);
            this.c = null;
            this.d = null;
            this.e = null;
            this.g = null;
            this.a = z;
            this.h = i4;
            this.i = i5;
            this.j = i3;
            this.k = iIntValue2;
            this.b = z2;
            this.l = i2;
            this.m = 2;
            if (FlowKt.first(b7Var, this) != coroutine_suspended) {
                z3 = z;
                zAreEqual = z2;
                z = z3;
                if (zAreEqual) {
                    mutableState.setValue(Boolean.FALSE);
                    if (!z) {
                        function0.invoke();
                    }
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Exception e4) {
            e = e4;
            z3 = z;
            Log.e("ResumeItemSection", "Error scrolling to target item", e);
        }
        z2 = zAreEqual;
    }
}
