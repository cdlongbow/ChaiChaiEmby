package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableIntState;
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
public final class e80 extends SuspendLambda implements Function2 {
    public Object a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MediaItem d;
    public final /* synthetic */ s40 e;
    public final /* synthetic */ List g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Map i;
    public final /* synthetic */ MutableIntState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ ScrollState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ FocusRequester o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e80(int i, MediaItem mediaItem, s40 s40Var, List list, String str, Map map, MutableIntState mutableIntState, MutableState mutableState, MutableState mutableState2, ScrollState scrollState, MutableState mutableState3, FocusRequester focusRequester, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, Continuation continuation) {
        super(2, continuation);
        this.c = i;
        this.d = mediaItem;
        this.e = s40Var;
        this.g = list;
        this.h = str;
        this.i = map;
        this.j = mutableIntState;
        this.k = mutableState;
        this.l = mutableState2;
        this.m = scrollState;
        this.n = mutableState3;
        this.o = focusRequester;
        this.p = mutableState4;
        this.q = mutableState5;
        this.r = mutableState6;
        this.s = mutableState7;
        this.t = mutableState8;
        this.u = mutableState9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e80(this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e80) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        if (defpackage.u90.f(r11.m, r11.n, r11.o, r11.p, true, false, r11) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
    
        if (defpackage.u90.f(r11.m, r11.n, r11.o, r11.p, true, false, r11) == r0) goto L49;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
