package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cy1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ hy1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ UserPreferences c;
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
    public final /* synthetic */ MutableState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy1(hy1 hy1Var, Context context, UserPreferences userPreferences, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14) {
        super(1, Intrinsics.Kotlin.class, "handleWebDavDownloadApplied", "ServerListScreen$handleWebDavDownloadApplied(Lcom/dh/myembyapp/ui/screens/serverlist/ServerListViewModel;Landroid/content/Context;Lcom/dh/myembyapp/data/preferences/UserPreferences;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/util/List;)V", 0);
        this.a = hy1Var;
        this.b = context;
        this.c = userPreferences;
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
        this.p = mutableState12;
        this.q = mutableState13;
        this.r = mutableState14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.contains("应用设置")) {
            UserPreferences userPreferences = this.c;
            this.d.setValue(Boolean.valueOf(userPreferences.getEnableAggregateSearch()));
            this.e.setValue(Boolean.valueOf(userPreferences.getEnableAggregateSearchInServerSearch()));
            this.g.setValue(Boolean.valueOf(userPreferences.getDisableTopNavFocusRefresh()));
            this.h.setValue(Boolean.valueOf(userPreferences.getEnableTransparentTopNavButtons()));
            this.i.setValue(Boolean.valueOf(userPreferences.getEnableClickableLibrarySectionTitle()));
            this.j.setValue(Boolean.valueOf(userPreferences.getEnableLibraryRowMoreButton()));
            this.k.setValue(Boolean.valueOf(userPreferences.getEnableHomeUnplayedOnly()));
            this.l.setValue(Boolean.valueOf(userPreferences.getEnablePlaybackStartupPoster()));
            this.m.setValue(Boolean.valueOf(userPreferences.getEnableAggregateSearchVersionTags()));
            this.n.setValue(Boolean.valueOf(userPreferences.getEnableDetailAggregateVersionRail()));
            this.o.setValue(Boolean.valueOf(userPreferences.getEnableHomeBackFocusServerButton()));
            this.p.setValue(Boolean.valueOf(userPreferences.getEnableAppUpdateCheckOnStartup()));
            this.q.setValue(Boolean.valueOf(userPreferences.getAdminDebugFeaturesUnlocked()));
            this.r.setValue(Boolean.valueOf(userPreferences.getEnableSpecialFeatures()));
        }
        if (list.contains("服务器配置")) {
            hy1 hy1Var = this.a;
            hy1Var.d(this.b);
            hy1Var.f((List) hy1Var.g.getValue());
        }
        return Unit.INSTANCE;
    }
}
