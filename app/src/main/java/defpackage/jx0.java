package defpackage;

import androidx.collection.MutableScatterSet;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.DrawerValue;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.LinkComposer;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NextFrameEndCallbackQueue;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;
import androidx.window.area.SafeWindowAreaComponentProvider;
import com.dh.myembyapp.data.model.AudioLanguagePreference;
import com.dh.myembyapp.data.model.AudioPrioritySortType;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.PlayerDefaultViewMode;
import com.dh.myembyapp.data.model.PlayerFrameRateMatchingMode;
import com.dh.myembyapp.data.model.PlayerResizeMode;
import com.dh.myembyapp.data.model.SubtitlePrioritySortType;
import com.dh.myembyapp.data.model.SystemNetworkSpeedDisplayMode;
import com.dh.myembyapp.data.model.SystemNetworkSpeedPosition;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import com.dh.myembyapp.data.model.VideoPrioritySortType;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jx0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jx0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objM8825constructorimpl;
        MediaItem mediaItem;
        String id;
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda$lambda$0$1((State) obj2, (LazyStaggeredGridState) obj);
            case 1:
                ((Function1) obj2).invoke((uy0) obj);
                return Unit.INSTANCE;
            case 2:
                ((cz0) obj2).e((String) obj, true);
                return Unit.INSTANCE;
            case 3:
                return LinkComposer.insertMovableContentGuarded$lambda$0$0$1$0$0$0$0$0((LinkComposer) obj2, (MovableContentStateReference) obj);
            case 4:
                NavHostController navHostController = (NavHostController) obj2;
                ((MutableState) obj).setValue(Boolean.TRUE);
                if (!NavController.popBackStack$default((NavController) navHostController, "server_list", false, false, 4, (Object) null)) {
                    try {
                        
                        objM8825constructorimpl = navHostController.getBackStackEntry("home");
                    } catch (Throwable th) {
                        
                        objM8825constructorimpl = ResultKt.createFailure(th);
                    }
                    navHostController.navigate("server_list", (Function1<? super NavOptionsBuilder, Unit>) new uo0(Result.m8832isSuccessimpl(objM8825constructorimpl), i2));
                    break;
                }
                return Unit.INSTANCE;
            case 5:
                return NavController.NavControllerNavigatorState.markTransitionComplete$lambda$1((NavController.NavControllerNavigatorState) obj2, (NavBackStackEntry) obj);
            case 6:
                return Float.valueOf(NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$24$lambda$16$lambda$15(0.0f, (DrawerState) obj2, (MutableFloatState) obj));
            case 7:
                return NavigationDrawerKt.rememberDrawerState$lambda$3$lambda$2((DrawerValue) obj2, (Function1) obj);
            case 8:
                return NextFrameEndCallbackQueue.onNewAwaiters$lambda$0((NextFrameEndCallbackQueue) obj2, (Function0) obj);
            case 9:
                ((Function1) obj2).invoke((AudioLanguagePreference) obj);
                return Unit.INSTANCE;
            case 10:
                ((Function1) obj2).invoke((VideoPrioritySortType) obj);
                return Unit.INSTANCE;
            case 11:
                ((Function1) obj2).invoke((AudioPrioritySortType) obj);
                return Unit.INSTANCE;
            case 12:
                ((Function1) obj2).invoke((SubtitlePrioritySortType) obj);
                return Unit.INSTANCE;
            case 13:
                ((Function1) obj2).invoke((SystemNetworkSpeedDisplayMode) obj);
                return Unit.INSTANCE;
            case 14:
                ((Function1) obj2).invoke((PlayerDefaultViewMode) obj);
                return Unit.INSTANCE;
            case 15:
                ((Function1) obj2).invoke((SystemNetworkSpeedPosition) obj);
                return Unit.INSTANCE;
            case 16:
                ((Function1) obj2).invoke((PlayerResizeMode) obj);
                return Unit.INSTANCE;
            case 17:
                ((Function1) obj2).invoke((PlayerFrameRateMatchingMode) obj);
                return Unit.INSTANCE;
            case 18:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj2, null, null, new eg1((FocusRequester) obj, null), 3, null);
                return Unit.INSTANCE;
            case 19:
                ((zk1) obj2).invoke();
                ((Function0) obj).invoke();
                return Unit.INSTANCE;
            case 20:
                ((ih1) obj2).a.setValue(Boolean.FALSE);
                ((ih1) obj).h.setValue(0L);
                return Unit.INSTANCE;
            case 21:
                Function0 function0 = (Function0) obj;
                String str = ((eo1) obj2).e;
                if (StringsKt.isBlank(str)) {
                    str = null;
                }
                if (str != null) {
                    return str;
                }
                MediaSource mediaSource = (MediaSource) function0.invoke();
                if (mediaSource != null) {
                    return mediaSource.getId();
                }
                return null;
            case 22:
                MutableState mutableState = (MutableState) obj;
                go1 go1Var = (go1) ((State) obj2).getValue();
                eo1 eo1Var = go1Var instanceof eo1 ? (eo1) go1Var : null;
                return (eo1Var == null || (mediaItem = eo1Var.a) == null || (id = mediaItem.getId()) == null) ? (String) mutableState.getValue() : id;
            case 23:
                return (String) ((Function1) obj2).invoke(((Function0) obj).invoke());
            case 24:
                bo1 bo1Var = ((ao1) obj).a;
                String str2 = bo1Var.a;
                String str3 = bo1Var.b;
                TranscodeQualityOption transcodeQualityOption = bo1Var.c;
                Integer num = bo1Var.d;
                long j = bo1Var.f;
                str2.getClass();
                ((Function1) obj2).invoke(new bo1(str2, str3, transcodeQualityOption, num, -1, j));
                return Unit.INSTANCE;
            case 25:
                ((MutableState) obj).setValue(((wr1) obj2).a);
                return Unit.INSTANCE;
            case 26:
                return Recomposer.performRecompose$lambda$0$0((MutableScatterSet) obj2, (ControlledComposition) obj);
            case 27:
                return Boolean.valueOf(ReflectionUtils.validateImplementation$lambda$1$lambda$0((Class) obj2, (Method) obj));
            case 28:
                return RetainKt.retainImpl$lambda$1$0((RetainedValueHolder) obj2, (RetainedValuesStore) obj);
            default:
                return Boolean.valueOf(SafeWindowAreaComponentProvider.isWindowAreaProviderValid$lambda$0(obj2, (SafeWindowAreaComponentProvider) obj));
        }
    }
}
