package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import com.dh.myembyapp.data.SubtitlePreferences;
import com.dh.myembyapp.data.model.AudioLanguagePreference;
import com.dh.myembyapp.data.model.AudioPrioritySortType;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.ServerIconEntry;
import com.dh.myembyapp.data.model.SubtitlePrioritySortType;
import com.dh.myembyapp.data.model.VideoPriorityRule;
import com.dh.myembyapp.data.model.VideoPrioritySortType;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x7(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                m8.d((List) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return AndroidSelectionHandles_androidKt.HandlePopup$lambda$1((OffsetProvider) obj5, (Alignment) obj3, (Function2) obj4, this.b, (Composer) obj, iIntValue);
            case 2:
                ((Integer) obj2).getClass();
                pi.e((BackupRouteConfig) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 3:
                int iIntValue2 = ((Integer) obj2).intValue();
                return BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$0((ProvidableCompositionLocal) obj5, (Function5) obj3, (Function2) obj4, this.b, (Composer) obj, iIntValue2);
            case 4:
                int iIntValue3 = ((Integer) obj2).intValue();
                return CanvasKt.Canvas$lambda$2((Modifier) obj5, (String) obj4, (Function1) obj3, this.b, (Composer) obj, iIntValue3);
            case 5:
                int iIntValue4 = ((Integer) obj2).intValue();
                return ComposableLambdaImpl.invoke$lambda$1((ComposableLambdaImpl) obj5, this.d, this.e, this.b, (Composer) obj, iIntValue4);
            case 6:
                int iIntValue5 = ((Integer) obj2).intValue();
                return CoreTextFieldKt.CoreTextFieldRootBox$lambda$1((Modifier) obj5, (TextFieldSelectionManager) obj3, (Function2) obj4, this.b, (Composer) obj, iIntValue5);
            case 7:
                int iIntValue6 = ((Integer) obj2).intValue();
                return DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu$lambda$3((TextContextMenuSession) obj5, (TextContextMenuDataProvider) obj3, (Function0) obj4, this.b, (Composer) obj, iIntValue6);
            case 8:
                ((Integer) obj2).getClass();
                u90.Y((bi0) obj5, (Modifier) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).intValue();
                u90.a0((String) obj5, (FocusRequester) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                u90.K((String) obj5, (String) obj3, (String) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 11:
                int iIntValue7 = ((Integer) obj2).intValue();
                return ExposedDropdownMenu_androidKt.SoftKeyboardListener$lambda$6((View) obj5, (Density) obj3, (Function0) obj4, this.b, (Composer) obj, iIntValue7);
            case 12:
                int iIntValue8 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleResumeEffectImpl$lambda$1((LifecycleOwner) obj5, (LifecycleResumePauseEffectScope) obj4, (Function1) obj3, this.b, (Composer) obj, iIntValue8);
            case 13:
                int iIntValue9 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleStartEffectImpl$lambda$1((LifecycleOwner) obj5, (LifecycleStartStopEffectScope) obj4, (Function1) obj3, this.b, (Composer) obj, iIntValue9);
            case 14:
                ((Integer) obj2).getClass();
                e31.b((UserPreferences) obj5, (nb0) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                a41.a((String) obj5, (io) obj3, (Modifier) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 16:
                int iIntValue10 = ((Integer) obj2).intValue();
                return NavBackStackEntryProviderKt.LocalOwnersProvider$lambda$0((NavBackStackEntry) obj5, (SaveableStateHolder) obj3, (Function2) obj4, this.b, (Composer) obj, iIntValue10);
            case 17:
                ((Integer) obj2).getClass();
                ra1.b((Bitmap) obj5, (String) obj3, (String) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                cc1.F((VideoPriorityRule) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).intValue();
                cc1.b((AudioVersionPrioritySettings) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).intValue();
                cc1.c((AudioLanguagePreference) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).intValue();
                cc1.I((VideoPrioritySortType) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).intValue();
                cc1.f((AudioPrioritySortType) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).intValue();
                cc1.A((SubtitlePrioritySortType) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).intValue();
                xr1.b((String) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 25:
                int iIntValue11 = ((Integer) obj2).intValue();
                return RetainedValuesStoreRegistry.LocalRetainedValuesStoreProvider$lambda$0((RetainedValuesStoreRegistry) obj5, this.d, (Function2) obj4, this.b, (Composer) obj, iIntValue11);
            case 26:
                int iIntValue12 = ((Integer) obj2).intValue();
                return SegmentedButtonKt.SegmentedButtonContent$lambda$15((Function2) obj5, (Function2) obj3, (PaddingValues) obj4, this.b, (Composer) obj, iIntValue12);
            case 27:
                ((Integer) obj2).intValue();
                lx1.b((ServerIconEntry) obj5, (ks1) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                c52.b((SubtitlePreferences.SubtitleColor) obj5, (Function1) obj3, (FocusRequester) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ x7(Object obj, Object obj2, Function function, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.e = obj2;
        this.d = function;
        this.b = i;
    }
}
