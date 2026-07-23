package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class np0 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ ServerPreferences a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ zq0 d;
    public final /* synthetic */ UserPreferences e;
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
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ MutableState w;
    public final /* synthetic */ MutableState x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np0(ServerPreferences serverPreferences, Context context, Function0 function0, zq0 zq0Var, UserPreferences userPreferences, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, Function1 function1, MutableState mutableState16, MutableState mutableState17) {
        super(1, Intrinsics.Kotlin.class, "handleWebDavDownloadApplied", "HomeScreen$handleWebDavDownloadApplied(Lcom/dh/myembyapp/data/preferences/ServerPreferences;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/dh/myembyapp/ui/screens/home/HomeViewModel;Lcom/dh/myembyapp/data/preferences/UserPreferences;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/util/List;)V", 0);
        this.a = serverPreferences;
        this.b = context;
        this.c = function0;
        this.d = zq0Var;
        this.e = userPreferences;
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
        this.r = mutableState12;
        this.s = mutableState13;
        this.t = mutableState14;
        this.u = mutableState15;
        this.v = function1;
        this.w = mutableState16;
        this.x = mutableState17;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0129  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.contains("应用设置")) {
            UserPreferences userPreferences = this.e;
            this.g.setValue(Boolean.valueOf(userPreferences.getEnableAggregateSearch()));
            this.h.setValue(Boolean.valueOf(userPreferences.getEnableAggregateSearchInServerSearch()));
            this.i.setValue(Boolean.valueOf(userPreferences.getDisableTopNavFocusRefresh()));
            this.j.setValue(Boolean.valueOf(userPreferences.getEnableTransparentTopNavButtons()));
            this.k.setValue(Boolean.valueOf(userPreferences.getEnableClickableLibrarySectionTitle()));
            this.l.setValue(Boolean.valueOf(userPreferences.getEnableLibraryRowMoreButton()));
            this.m.setValue(Boolean.valueOf(userPreferences.getEnableHomeUnplayedOnly()));
            this.n.setValue(Boolean.valueOf(userPreferences.getEnablePlaybackStartupPoster()));
            this.o.setValue(Boolean.valueOf(userPreferences.getEnableAggregateSearchVersionTags()));
            this.p.setValue(Boolean.valueOf(userPreferences.getEnableDetailAggregateVersionRail()));
            this.q.setValue(Boolean.valueOf(userPreferences.getEnableHomeBackFocusServerButton()));
            this.r.setValue(Boolean.valueOf(userPreferences.getEnableAppUpdateCheckOnStartup()));
            this.s.setValue(Boolean.valueOf(userPreferences.getAdminDebugFeaturesUnlocked()));
            this.t.setValue(Boolean.valueOf(userPreferences.getEnableSpecialFeatures()));
        }
        if (list.contains("服务器配置")) {
            ServerPreferences serverPreferences = this.a;
            String lastUsedServerId = serverPreferences.getLastUsedServerId();
            MutableState mutableState = this.u;
            if (lastUsedServerId == null && ((lastUsedServerId = ((cq0) mutableState.getValue()).a) == null || serverPreferences.getServerById(lastUsedServerId) == null)) {
                lastUsedServerId = null;
            }
            ServerConfig serverById = lastUsedServerId != null ? serverPreferences.getServerById(lastUsedServerId) : null;
            Context context = this.b;
            Function0 function0 = this.c;
            if (serverById == null) {
                Toast.makeText(context, "同步后的服务器列表不可直接使用，已返回服务器列表", 0).show();
                function0.invoke();
            } else if (serverById.isLoggedIn()) {
                zq0 zq0Var = this.d;
                if (bq0.g(serverPreferences, context, zq0Var, this.v, mutableState, this.w, this.x, serverById, false)) {
                    zq0Var.I(serverPreferences.getAllServers());
                    zq0Var.E(false, false);
                } else {
                    Toast.makeText(context, "同步后的当前服务器需要重新登录，已返回服务器列表", 0).show();
                    function0.invoke();
                }
            } else {
                Toast.makeText(context, "同步后的当前服务器需要重新登录，已返回服务器列表", 0).show();
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
