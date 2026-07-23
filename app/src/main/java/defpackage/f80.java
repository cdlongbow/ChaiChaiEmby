package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Shadow;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class f80 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaItem b;
    public final /* synthetic */ s40 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ MediaItem g;
    public final /* synthetic */ Map h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f80(int i, MediaItem mediaItem, s40 s40Var, String str, int i2, MediaItem mediaItem2, Map map, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, Continuation continuation) {
        super(2, continuation);
        this.a = i;
        this.b = mediaItem;
        this.c = s40Var;
        this.d = str;
        this.e = i2;
        this.g = mediaItem2;
        this.h = map;
        this.i = mutableState;
        this.j = mutableState2;
        this.k = mutableState3;
        this.l = mutableState4;
        this.m = mutableState5;
        this.n = mutableState6;
        this.o = mutableState7;
        this.p = mutableState8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f80(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f80) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = this.a;
        if (i <= 0) {
            return Unit.INSTANCE;
        }
        if (!Intrinsics.areEqual(this.b.getType(), "Series")) {
            return Unit.INSTANCE;
        }
        if (this.c != s40.b) {
            return Unit.INSTANCE;
        }
        Shadow shadow = u90.o;
        MutableState mutableState = this.i;
        String str = (String) mutableState.getValue();
        if (str == null) {
            return Unit.INSTANCE;
        }
        String str2 = this.d;
        if (str2 == null) {
            return Unit.INSTANCE;
        }
        if (this.e != i) {
            return Unit.INSTANCE;
        }
        MediaItem mediaItem = this.g;
        if (!Intrinsics.areEqual(mediaItem != null ? mediaItem.getId() : null, str2)) {
            mutableState.setValue(null);
            return Unit.INSTANCE;
        }
        MutableState mutableState2 = this.j;
        boolean zAreEqual = Intrinsics.areEqual((String) mutableState2.getValue(), str2);
        MutableState mutableState3 = this.l;
        if (!zAreEqual) {
            MutableState mutableState4 = this.k;
            if (!Intrinsics.areEqual((String) mutableState4.getValue(), str2)) {
                if (!Intrinsics.areEqual((String) mutableState2.getValue(), str) && !Intrinsics.areEqual((String) mutableState4.getValue(), str)) {
                    mutableState.setValue(null);
                    return Unit.INSTANCE;
                }
                this.m.setValue(null);
                String str3 = (String) this.h.get(str2);
                if (str3 != null) {
                    this.n.setValue(str3);
                }
                mutableState2.setValue(str2);
                MutableState mutableState5 = this.o;
                mutableState5.setValue(Integer.valueOf(u90.i(mutableState5) + 1));
                mutableState3.setValue(null);
                mutableState.setValue(null);
                u90.E0(this.p);
                return Unit.INSTANCE;
            }
        }
        mutableState3.setValue(null);
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }
}
