package defpackage;

import androidx.activity.compose.ReportDrawnKt;
import androidx.compose.foundation.OverscrollConfiguration_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.material.ripple.DebugRippleTheme;
import androidx.compose.material3.RippleKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.Dispatchers;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o91 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ o91(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 0;
        switch (this.a) {
            case 0:
                return new tn(new OkHttpClient());
            case 1:
                return OverscrollConfiguration_androidKt.LocalOverscrollConfiguration$lambda$0();
            case 2:
                return Dispatchers.getIO();
            case 3:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 4:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 5:
                return Boolean.TRUE;
            case 6:
                return null;
            case 7:
                return Unit.INSTANCE;
            case 8:
                return PullToRefreshKt.rememberPullToRefreshState$lambda$3$lambda$2();
            case 9:
                List listSortedWith = CollectionsKt.sortedWith((List) az1.a.getValue(), new k00(13));
                ArrayList arrayList = new ArrayList();
                int size = listSortedWith.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((q91) listSortedWith.get(i2)).getClass();
                    m81 m81Var = new m81(new o91(i));
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(rd2.class);
                    Pair pair = orCreateKotlinClass == null ? null : TuplesKt.to(m81Var, orCreateKotlinClass);
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return arrayList;
            case 10:
                List listSortedWith2 = CollectionsKt.sortedWith((List) az1.b.getValue(), new k00(14));
                ArrayList arrayList2 = new ArrayList();
                if (listSortedWith2.size() <= 0) {
                    return arrayList2;
                }
                listSortedWith2.get(0).getClass();
                throw new ClassCastException();
            case 11:
                return ReceiveContentConfigurationKt.ModifierLocalReceiveContent$lambda$0();
            case 12:
                return Boolean.valueOf(ReportDrawnKt.ReportDrawn$lambda$0$0());
            case 13:
                return RetainedValuesStoreRegistryKt.retainRetainedValuesStoreRegistry$lambda$0$0();
            case 14:
                return RippleKt.LocalRippleConfiguration$lambda$0();
            case 15:
                return DebugRippleTheme.INSTANCE;
            case 16:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitPairRuleBuilderLevel2Valid$lambda$24());
            case 17:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassActivityStackAttributesValid$lambda$60());
            case 18:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitPairRuleBuilderLevel1Valid$lambda$10());
            case 19:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetSplitInfoTokenValid$lambda$34());
            case 20:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassEmbeddingRuleValid$lambda$20());
            case 21:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodSplitInfoGetTokenValid$lambda$28());
            case 22:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassActivityRuleValid$lambda$6());
            case 23:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetFinishPrimaryWithPlaceholderValid$lambda$17());
            case 24:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassActivityStackAttributesCalculatorParamsValid$lambda$62());
            case 25:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitPlaceholderRuleBuilderLevel1Valid$lambda$12());
            case 26:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetAnimationParamsValid$lambda$47());
            case 27:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodSetDraggingToFullscreenAllowedValid$lambda$50());
            case 28:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitInfoValid$lambda$8());
            default:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitAttributesCalculatorParamsValid$lambda$22());
        }
    }
}
