package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.Call;

/* JADX INFO: loaded from: classes4.dex */
public final class sn extends ContinuationImpl {
    public Object a;
    public Call.Factory b;
    public /* synthetic */ Object c;
    public int d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return tn.a(null, null, null, this);
    }
}
