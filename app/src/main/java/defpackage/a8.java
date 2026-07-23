package defpackage;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt;
import androidx.compose.material3.AppBarMenuState;
import androidx.compose.material3.BasicAlertDialogOverrideScope;
import androidx.compose.material3.ClickableAppBarItem;
import androidx.compose.material3.CustomAppBarItem;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DefaultBasicAlertDialogOverride;
import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.DefaultNavigationBarOverride;
import androidx.compose.material3.DefaultNavigationRailOverride;
import androidx.compose.material3.DefaultShortNavigationBarOverride;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.DefaultWideNavigationRailOverride;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.ModalWideNavigationRailOverrideScope;
import androidx.compose.material3.NavigationBarOverrideScope;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.NavigationRailOverrideScope;
import androidx.compose.material3.ShortNavigationBarOverrideScope;
import androidx.compose.material3.SingleRowTopAppBarOverrideScope;
import androidx.compose.material3.TwoRowsTopAppBarOverrideScope;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaNImpl;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a8 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a8(int i, Collection collection, List list) {
        this.a = 24;
        this.b = list;
        this.d = collection;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                m8.g((BoxScope) obj4, (List) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 1:
                return AnnotatedStringResolveInlineContentKt.InlineChildren$lambda$1((AnnotatedString) obj4, (List) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return CanvasKt.Canvas$lambda$0((Modifier) obj4, (Function1) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return ClickableAppBarItem.MenuContent$lambda$3((ClickableAppBarItem) obj4, (AppBarMenuState) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return ComposableLambdaImpl.invoke$lambda$0((ComposableLambdaImpl) obj4, obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return ComposableLambdaNImpl.invoke$lambda$0((Object[]) obj4, i2, (ComposableLambdaNImpl) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return CompositionLocalKt.CompositionLocalProvider$lambda$1((ProvidedValue) obj4, (Function2) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return CompositionLocalKt.CompositionLocalProvider$lambda$0((ProvidedValue[]) obj4, (Function2) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return CompositionLocalKt.CompositionLocalProvider$lambda$3((CompositionLocalContext) obj4, (Function2) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return ContextMenuScope.Content$lambda$1((ContextMenuScope) obj4, (ContextMenuColors) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return CustomAppBarItem.MenuContent$lambda$1((CustomAppBarItem) obj4, (AppBarMenuState) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return DatePickerKt.WeekDays$lambda$49((DatePickerColors) obj4, (CalendarModel) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return DefaultBasicAlertDialogOverride.BasicAlertDialog$lambda$0((DefaultBasicAlertDialogOverride) obj4, (BasicAlertDialogOverrideScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$23((DefaultModalWideNavigationRailOverride) obj4, (ModalWideNavigationRailOverrideScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return DefaultNavigationBarOverride.NavigationBar$lambda$0((DefaultNavigationBarOverride) obj4, (NavigationBarOverrideScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return DefaultNavigationRailOverride.NavigationRail$lambda$0((DefaultNavigationRailOverride) obj4, (NavigationRailOverrideScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return DefaultShortNavigationBarOverride.ShortNavigationBar$lambda$0((DefaultShortNavigationBarOverride) obj4, (ShortNavigationBarOverrideScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 17:
                return DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$16((DefaultSingleRowTopAppBarOverride) obj4, (SingleRowTopAppBarOverrideScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 18:
                return DefaultTextContextMenuDropdownProvider_androidKt.DefaultTextContextMenuDropdown$lambda$1((TextContextMenuSession) obj4, (TextContextMenuData) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 19:
                return DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$28((DefaultTwoRowsTopAppBarOverride) obj4, (TwoRowsTopAppBarOverrideScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return DefaultWideNavigationRailOverride.WideNavigationRail$lambda$0((DefaultWideNavigationRailOverride) obj4, (WideNavigationRailOverrideScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                ((Integer) obj2).getClass();
                u90.t0((Function0) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                u90.E((p40) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                u90.H((Modifier) obj4, (Function4) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 24:
                return DialogHostKt.PopulateVisibleList$lambda$13((List) obj3, (Collection) obj4, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return LazyLayoutItemContentFactoryKt.SkippableItem_JVlU9Rs$lambda$0((LazyLayoutItemProvider) obj4, i2, obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return LocalRetainedValuesStoreKt.LocalRetainedValuesStoreProvider$lambda$2((RetainedValuesStore) obj4, (Function2) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 27:
                ((Integer) obj2).getClass();
                a41.c((io) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 28:
                return NavBackStackEntryProviderKt.SaveableStateProvider$lambda$3((SaveableStateHolder) obj4, (Function2) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return NavigationDrawerKt.DrawerPredictiveBackHandler$lambda$62((DrawerState) obj4, (Function3) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ a8(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.d = obj;
        this.c = i;
        this.b = obj2;
    }

    public /* synthetic */ a8(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }
}
