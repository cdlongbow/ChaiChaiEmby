package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ d1(Lifecycle.Event event, LifecycleOwner lifecycleOwner, Function0 function0, int i, int i2) {
        this.a = 8;
        this.b = event;
        this.e = lifecycleOwner;
        this.g = function0;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.g;
        Object obj4 = this.b;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AccessibilityServiceStateProvider_androidKt.ObserveState$lambda$13((LifecycleOwner) obj5, (Function1) obj4, (Function0) obj3, this.c, this.d, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$6((Modifier) obj5, (Function1) obj4, (Function2) obj3, this.c, this.d, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return BadgeKt.BadgedBox$lambda$2((Function3) obj5, (Modifier) obj4, (Function3) obj3, this.c, this.d, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return ContextMenuUiKt.ContextMenuColumn$lambda$0((ContextMenuColors) obj5, (Modifier) obj4, (Function3) obj3, this.c, this.d, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return ContextMenuUiKt.ContextMenuColumnBuilder$lambda$1((Modifier) obj5, (ContextMenuColors) obj3, (Function1) obj4, this.c, this.d, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return DatePickerKt.DisplayModeToggleButton_iUJLfQg$lambda$11((Modifier) obj5, this.c, (Function1) obj4, (DatePickerColors) obj3, this.d, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return LazyLayoutItemContentFactoryKt.SkippableItem_JVlU9Rs$lambda$1((LazyLayoutItemProvider) obj5, this.b, this.c, this.g, this.d, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                return LazyLayoutPinnableItemKt.LazyLayoutPinnableItem$lambda$2(this.e, this.c, (LazyLayoutPinnedItemList) obj4, (Function2) obj3, this.d, (Composer) obj, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleEventEffect$lambda$2((Lifecycle.Event) obj4, (LifecycleOwner) obj5, (Function0) obj3, this.c, this.d, (Composer) obj, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj2).intValue();
                return NavHostKt.NavHost$lambda$26((NavHostController) obj5, (NavGraph) obj4, (Modifier) obj3, this.c, this.d, (Composer) obj, iIntValue10);
            case 10:
                int iIntValue11 = ((Integer) obj2).intValue();
                return NavigationDrawerKt.PermanentNavigationDrawer$lambda$42((Function2) obj5, (Modifier) obj4, (Function2) obj3, this.c, this.d, (Composer) obj, iIntValue11);
            case 11:
                int iIntValue12 = ((Integer) obj2).intValue();
                return SnackbarHostKt.SnackbarHost$lambda$1((SnackbarHostState) obj5, (Modifier) obj4, (Function3) obj3, this.c, this.d, (Composer) obj, iIntValue12);
            case 12:
                int iIntValue13 = ((Integer) obj2).intValue();
                return SnackbarHostKt.FadeInFadeOutWithScale$lambda$7((SnackbarData) obj5, (Modifier) obj4, (Function3) obj3, this.c, this.d, (Composer) obj, iIntValue13);
            case 13:
                int iIntValue14 = ((Integer) obj2).intValue();
                return TimePickerKt.TimeInput$lambda$5((TimePickerState) obj5, (Modifier) obj4, (TimePickerColors) obj3, this.c, this.d, (Composer) obj, iIntValue14);
            default:
                ((Integer) obj2).getClass();
                ef2.e((Modifier) obj5, (String) obj4, (List) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d1(Modifier modifier, ContextMenuColors contextMenuColors, Function1 function1, int i, int i2) {
        this.a = 4;
        this.e = modifier;
        this.g = contextMenuColors;
        this.b = function1;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ d1(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i, Object obj2, int i2) {
        this.a = 6;
        this.e = lazyLayoutItemProvider;
        this.b = obj;
        this.c = i;
        this.g = obj2;
        this.d = i2;
    }

    public /* synthetic */ d1(Object obj, int i, Object obj2, Object obj3, int i2, int i3) {
        this.a = i3;
        this.e = obj;
        this.c = i;
        this.b = obj2;
        this.g = obj3;
        this.d = i2;
    }

    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.a = i3;
        this.e = obj;
        this.b = obj2;
        this.g = obj3;
        this.c = i;
        this.d = i2;
    }
}
