package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.server.BackupRouteConfigServerManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class li extends SuspendLambda implements Function2 {
    public final /* synthetic */ BackupRouteConfigServerManager a;
    public final /* synthetic */ ServerConfig b;
    public final /* synthetic */ SnapshotStateList c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ MutableState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(BackupRouteConfigServerManager backupRouteConfigServerManager, ServerConfig serverConfig, SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, Function1 function1, MutableState mutableState12, MutableState mutableState13, Continuation continuation) {
        super(2, continuation);
        this.a = backupRouteConfigServerManager;
        this.b = serverConfig;
        this.c = snapshotStateList;
        this.d = mutableState;
        this.e = mutableState2;
        this.g = mutableState3;
        this.h = mutableState4;
        this.i = mutableState5;
        this.j = mutableState6;
        this.k = mutableState7;
        this.l = mutableState8;
        this.m = mutableState9;
        this.n = mutableState10;
        this.o = mutableState11;
        this.p = function1;
        this.q = mutableState12;
        this.r = mutableState13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new li(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((li) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String strStartServer = this.a.startServer(this.b.getAlias(), this.c.toList(), new ki(this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.c, this.p));
        MutableState mutableState = this.q;
        mutableState.setValue(strStartServer);
        String str = (String) mutableState.getValue();
        this.r.setValue(Boolean.valueOf(str == null || StringsKt.isBlank(str)));
        return Unit.INSTANCE;
    }
}
