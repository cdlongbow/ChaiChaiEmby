package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.preferences.UserPreferences;
import com.dh.myembyapp.server.SearchInputServerManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n6 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ UserPreferences a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
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
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ SearchInputServerManager r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(UserPreferences userPreferences, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, SearchInputServerManager searchInputServerManager, MutableState mutableState16, MutableState mutableState17, MutableState mutableState18) {
        super(1, Intrinsics.Kotlin.class, "handleWebDavDownloadApplied", "AggregateHubScreen$handleWebDavDownloadApplied(Lcom/dh/myembyapp/data/preferences/UserPreferences;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/server/SearchInputServerManager;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/util/List;)V", 0);
        this.a = userPreferences;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
        this.g = mutableState5;
        this.h = mutableState6;
        this.i = mutableState7;
        this.j = mutableState8;
        this.k = mutableState9;
        this.l = mutableState10;
        this.m = mutableState11;
        this.n = mutableState12;
        this.o = mutableState13;
        this.p = mutableState14;
        this.q = mutableState15;
        this.r = searchInputServerManager;
        this.s = mutableState16;
        this.t = mutableState17;
        this.u = mutableState18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.contains("应用设置")) {
            f7.I(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
            f7.H(this.r, this.s, this.t);
        }
        if (list.contains("服务器配置")) {
            MutableState mutableState = this.u;
            mr.A((Number) mutableState.getValue(), 1, mutableState);
        }
        return Unit.INSTANCE;
    }
}
