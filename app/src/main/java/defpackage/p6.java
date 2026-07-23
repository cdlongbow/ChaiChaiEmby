package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.lifecycle.ViewModel;
import com.dh.myembyapp.data.preferences.AggregateSearchHistoryPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import com.dh.myembyapp.server.SearchInputServerManager;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class p6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SearchInputServerManager c;
    public final /* synthetic */ AggregateSearchHistoryPreferences d;
    public final /* synthetic */ UserPreferences e;
    public final /* synthetic */ List g;
    public final /* synthetic */ State h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ State k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ ViewModel n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(boolean z, SearchInputServerManager searchInputServerManager, p7 p7Var, AggregateSearchHistoryPreferences aggregateSearchHistoryPreferences, UserPreferences userPreferences, List list, State state, MutableState mutableState, MutableState mutableState2, State state2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.b = z;
        this.c = searchInputServerManager;
        this.n = p7Var;
        this.d = aggregateSearchHistoryPreferences;
        this.e = userPreferences;
        this.g = list;
        this.h = state;
        this.i = mutableState;
        this.j = mutableState2;
        this.k = state2;
        this.l = mutableState3;
        this.m = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        ViewModel viewModel = this.n;
        switch (i) {
            case 0:
                MutableState mutableState = this.l;
                MutableState mutableState2 = this.m;
                return new p6(this.b, this.c, (p7) viewModel, this.d, this.e, this.g, this.h, this.i, this.j, this.k, mutableState, mutableState2, continuation);
            default:
                MutableState mutableState3 = this.l;
                MutableState mutableState4 = this.m;
                return new p6(this.b, this.c, this.d, this.e, (v8) viewModel, this.g, this.h, this.i, this.j, this.k, mutableState3, mutableState4, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
        }
        return ((p6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        MutableState mutableState = this.m;
        ViewModel viewModel = this.n;
        SearchInputServerManager searchInputServerManager = this.c;
        boolean z = this.b;
        MutableState mutableState2 = this.l;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (!z) {
                    searchInputServerManager.stopServer();
                } else {
                    searchInputServerManager.startServer(new w4((p7) viewModel, this.d, this.e, this.g, this.h, this.i, this.j, this.k, 2));
                    f7.H(searchInputServerManager, mutableState2, mutableState);
                }
                break;
            default:
                ResultKt.throwOnFailure(obj);
                if (!z) {
                    searchInputServerManager.stopServer();
                } else {
                    searchInputServerManager.startServer(new q8(this.d, this.e, (v8) viewModel, this.g, this.h, this.i, this.j, this.k));
                    mutableState2.setValue(searchInputServerManager.getServerUrl());
                    mutableState.setValue(ku.y(200, 200, (String) mutableState2.getValue()));
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(boolean z, SearchInputServerManager searchInputServerManager, AggregateSearchHistoryPreferences aggregateSearchHistoryPreferences, UserPreferences userPreferences, v8 v8Var, List list, State state, MutableState mutableState, MutableState mutableState2, State state2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.b = z;
        this.c = searchInputServerManager;
        this.d = aggregateSearchHistoryPreferences;
        this.e = userPreferences;
        this.n = v8Var;
        this.g = list;
        this.h = state;
        this.i = mutableState;
        this.j = mutableState2;
        this.k = state2;
        this.l = mutableState3;
        this.m = mutableState4;
    }
}
