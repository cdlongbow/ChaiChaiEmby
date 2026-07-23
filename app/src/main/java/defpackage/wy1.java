package defpackage;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class wy1 extends ContinuationImpl {
    public yy1 a;
    public Object b;
    public Object c;
    public Function0 d;
    public FocusRequester e;
    public int g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public int l;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return xy1.e(null, null, null, null, this);
    }
}
