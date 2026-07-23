package defpackage;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class w92 extends ContinuationImpl {
    public Object a;
    public List b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ xa2 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w92(xa2 xa2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = xa2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return xa2.c(this.e, null, null, null, this);
    }
}
