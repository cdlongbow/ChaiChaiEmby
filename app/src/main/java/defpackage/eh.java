package defpackage;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.material3.ListItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.model.AudioPrioritySortType;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.SubtitlePrioritySortType;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import com.dh.myembyapp.data.model.SystemTimeDisplayMode;
import com.dh.myembyapp.server.BackupRouteConfigServerManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ eh(vd1 vd1Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i) {
        this.a = 11;
        this.d = vd1Var;
        this.g = function0;
        this.e = function1;
        this.b = function2;
        this.h = function3;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.g;
        Object obj5 = this.h;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                pi.k((ServerConfig) obj7, (BackupRouteConfigServerManager) obj6, (Function0) obj4, (Function1) obj3, (Function2) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                lq.c((MediaItem) obj7, (List) obj6, (List) obj4, (String) obj5, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 2:
                int iIntValue = ((Integer) obj2).intValue();
                return ComposableLambdaImpl.invoke$lambda$3((ComposableLambdaImpl) obj7, this.e, this.g, this.b, this.h, this.c, (Composer) obj, iIntValue);
            case 3:
                ((Integer) obj2).intValue();
                u90.l0((List) obj7, (String) obj6, (String) obj3, (Function0) obj4, (Function2) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 4:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ListItemKt.ListItemLayout$lambda$8((Function2) obj5, (Function2) obj7, (Function2) obj6, (Function2) obj4, (Function2) obj3, this.c, (Composer) obj, iIntValue2);
            case 5:
                ((Integer) obj2).getClass();
                a41.b((String) obj7, (String) obj6, (Function0) obj4, (Modifier) obj3, (FocusRequester) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ra1.c((String) obj7, (ne) obj6, (String) obj4, (ij1) obj3, (jj1) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).intValue();
                cc1.E((SystemTimeDisplayMode) obj7, (FocusRequester) obj6, (FocusRequester) obj4, (FocusRequester) obj5, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                cc1.z((SubtitlePrioritySortType) obj7, (SubtitleVersionPrioritySettings) obj6, (FocusRequester) obj4, (Function1) obj3, (Function1) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                cc1.e((AudioPrioritySortType) obj7, (AudioVersionPrioritySettings) obj6, (FocusRequester) obj4, (Function1) obj3, (Function1) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).intValue();
                ld1.b((String) obj7, (String) obj6, (Integer) obj4, (String) obj3, (FocusRequester) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ud1.b((vd1) obj7, (Function0) obj4, (Function0) obj6, (Function0) obj3, (Function0) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return TransitionKt.UpdateInitialAndTargetValues$lambda$0((Transition) obj7, (Transition.TransitionAnimationState) obj6, this.g, this.b, (FiniteAnimationSpec) obj5, this.c, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ eh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.g = obj3;
        this.b = obj4;
        this.h = obj5;
        this.c = i;
    }

    public /* synthetic */ eh(Object obj, Object obj2, Object obj3, Object obj4, Function1 function1, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.g = obj3;
        this.h = obj4;
        this.b = function1;
        this.c = i;
    }

    public /* synthetic */ eh(List list, String str, String str2, Function0 function0, Function2 function2, int i) {
        this.a = 3;
        this.d = list;
        this.e = str;
        this.b = str2;
        this.g = function0;
        this.h = function2;
        this.c = i;
    }

    public /* synthetic */ eh(Function2 function2, Function2 function3, Function2 function4, Function2 function5, Function2 function6, int i) {
        this.a = 4;
        this.h = function2;
        this.d = function3;
        this.e = function4;
        this.g = function5;
        this.b = function6;
        this.c = i;
    }
}
