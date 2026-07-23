package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class d80 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String g;
    public final /* synthetic */ int h;
    public final /* synthetic */ MediaItem i;
    public final /* synthetic */ int j;
    public final /* synthetic */ String k;
    public final /* synthetic */ Map l;
    public final /* synthetic */ List m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ ScrollState r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ FocusRequester t;
    public final /* synthetic */ MutableState u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d80(String str, int i, String str2, int i2, String str3, int i3, MediaItem mediaItem, int i4, String str4, Map map, List list, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, ScrollState scrollState, MutableState mutableState5, FocusRequester focusRequester, MutableState mutableState6, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = i2;
        this.g = str3;
        this.h = i3;
        this.i = mediaItem;
        this.j = i4;
        this.k = str4;
        this.l = map;
        this.m = list;
        this.n = mutableState;
        this.o = mutableState2;
        this.p = mutableState3;
        this.q = mutableState4;
        this.r = scrollState;
        this.s = mutableState5;
        this.t = focusRequester;
        this.u = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d80(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d80) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0105, code lost:
    
        if (defpackage.u90.f(r5, r6, r7, r8, true, false, r12) == r0) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
