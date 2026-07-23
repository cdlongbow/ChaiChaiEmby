package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class ni1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ to1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni1(to1 to1Var, String str, String str2, String str3, boolean z, String str4, String str5, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.a = to1Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.g = str4;
        this.h = str5;
        this.i = mutableState;
        this.j = mutableState2;
        this.k = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ni1(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ni1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.i.setValue(null);
        this.j.setValue(null);
        String str = this.b;
        to1 to1Var = this.a;
        to1Var.c = str;
        String str2 = this.g;
        String str3 = this.c;
        if (str3 != null) {
            MutableStateFlow mutableStateFlow = to1Var.d;
            mutableStateFlow.setValue(do1.a);
            to1Var.w = true;
            boolean z = this.e;
            to1Var.x = z;
            to1Var.u++;
            to1Var.v = null;
            to1Var.s.setValue(null);
            Log.d("PlayerViewModel", "========== loadDirectUrl 调用 ==========");
            Log.d("PlayerViewModel", "url: ".concat(str3));
            StringBuilder sb = new StringBuilder("title: ");
            String str4 = this.d;
            sb.append(str4);
            Log.d("PlayerViewModel", sb.toString());
            Log.d("PlayerViewModel", "useProxy: " + z);
            Log.d("PlayerViewModel", "========================================");
            String strL = c61.l("dlna_", System.currentTimeMillis());
            if (str4 == null) {
                str4 = "DLNA 投屏";
            }
            MediaItem mediaItem = new MediaItem(strL, null, null, str4, "Video", false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483622, null);
            to1Var.f = mediaItem;
            to1Var.k = "DirectPlay";
            mutableStateFlow.setValue(new eo1(mediaItem, str3, 0L, false, mediaItem.getId(), null, null, true, null, null, null));
        } else {
            to1Var.F(str2, (506 & 2) != 0 ? false : false, (506 & 4) != 0 ? null : this.h, (506 & 8) != 0 ? null : null, (506 & 16) != 0 ? null : null, (506 & 32) != 0 ? null : null, (506 & 64) != 0 ? null : null, (506 & 128) == 0, false);
        }
        this.k.setValue(str2);
        return Unit.INSTANCE;
    }
}
