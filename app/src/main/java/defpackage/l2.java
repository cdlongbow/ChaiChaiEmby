package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;

import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import com.dh.myembyapp.server.ConfigServerManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class l2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ w2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ConfigServerManager d;
    public final /* synthetic */ CoroutineScope e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ LazyListState r;
    public final /* synthetic */ FocusRequester s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(w2 w2Var, Context context, String str, ConfigServerManager configServerManager, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, LazyListState lazyListState, FocusRequester focusRequester, MutableState mutableState12, MutableState mutableState13, Continuation continuation) {
        super(2, continuation);
        this.a = w2Var;
        this.b = context;
        this.c = str;
        this.d = configServerManager;
        this.e = coroutineScope;
        this.g = mutableState;
        this.h = mutableState2;
        this.i = mutableState3;
        this.j = mutableState4;
        this.k = mutableState5;
        this.l = mutableState6;
        this.m = mutableState7;
        this.n = mutableState8;
        this.o = mutableState9;
        this.p = mutableState10;
        this.q = mutableState11;
        this.r = lazyListState;
        this.s = focusRequester;
        this.t = mutableState12;
        this.u = mutableState13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l2(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Context context = this.b;
        context.getClass();
        w2 w2Var = this.a;
        if (w2Var.a == null) {
            w2Var.a = new ServerPreferences(context);
        }
        String str = this.c;
        ServerConfig serverById = str != null ? new ServerPreferences(context).getServerById(str) : null;
        String strStartServer = this.d.startServer(serverById, new k2(this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, null));
        this.t.setValue(strStartServer);
        Log.d("AddServerScreen", "Config server started at: " + strStartServer);
        if (strStartServer != null) {
            this.u.setValue(ku.y(HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST, strStartServer));
            Boxing.boxInt(Log.d("AddServerScreen", "QR code generated"));
        }
        if (serverById != null) {
            this.g.setValue(serverById.getProtocol());
            this.h.setValue(serverById.getHost());
            this.i.setValue(String.valueOf(serverById.getPort()));
            String path = serverById.getPath();
            if (path == null) {
                path = "";
            }
            this.j.setValue(path);
            this.k.setValue(serverById.getUsername());
            this.l.setValue(serverById.getPassword());
            this.m.setValue(serverById.getAlias());
            String note = serverById.getNote();
            this.n.setValue(note != null ? note : "");
            this.o.setValue(Boolean.valueOf(serverById.getDirectOnly()));
            this.p.setValue(Boolean.valueOf(serverById.getEnableStrmDirectPlay()));
            this.q.setValue(Boolean.valueOf(serverById.getTrustAllCerts()));
        }
        return Unit.INSTANCE;
    }
}
