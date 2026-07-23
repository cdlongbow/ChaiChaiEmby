package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class t80 extends ContinuationImpl {
    public FocusRequester a;
    public MutableState b;
    public int c;
    public int d;
    public int e;
    public int g;
    public /* synthetic */ Object h;
    public int i;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.i |= Integer.MIN_VALUE;
        return u90.z(null, null, this);
    }
}
