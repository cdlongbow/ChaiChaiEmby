package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.lifecycle.SavedStateHandle;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import com.dh.myembyapp.dlna.DlnaConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s21 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ s21(Context context, MutableState mutableState, ServerPreferences serverPreferences, UserPreferences userPreferences, NavHostController navHostController, MutableState mutableState2, ServerConfig serverConfig, CoroutineScope coroutineScope) {
        this.b = context;
        this.c = mutableState;
        this.e = serverPreferences;
        this.g = userPreferences;
        this.h = navHostController;
        this.d = mutableState2;
        this.i = serverConfig;
        this.j = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.e;
        Object obj5 = this.g;
        Object obj6 = this.d;
        Object obj7 = this.b;
        Object obj8 = this.c;
        Object obj9 = this.j;
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                final Context context = (Context) obj7;
                final MutableState mutableState = (MutableState) obj8;
                final ServerPreferences serverPreferences = (ServerPreferences) obj4;
                final UserPreferences userPreferences = (UserPreferences) obj5;
                final NavHostController navHostController = (NavHostController) obj3;
                final MutableState mutableState2 = (MutableState) obj6;
                ServerConfig serverConfig = (ServerConfig) obj2;
                NavGraphBuilder navGraphBuilder = (NavGraphBuilder) obj;
                navGraphBuilder.getClass();
                NavGraphBuilderKt.composable$default(navGraphBuilder, "server_list", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-2093592912, true, new Function4() { // from class: t21
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13) {
                        Composer composer = (Composer) obj12;
                        int iIntValue = ((Integer) obj13).intValue();
                        ((AnimatedContentScope) obj10).getClass();
                        ((NavBackStackEntry) obj11).getClass();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2093592912, iIntValue, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:565)");
                        }
                        Context context2 = context;
                        boolean zChangedInstance = composer.changedInstance(context2);
                        MutableState mutableState3 = mutableState;
                        boolean zChanged = zChangedInstance | composer.changed(mutableState3);
                        ServerPreferences serverPreferences2 = serverPreferences;
                        boolean zChangedInstance2 = zChanged | composer.changedInstance(serverPreferences2);
                        UserPreferences userPreferences2 = userPreferences;
                        boolean zChangedInstance3 = zChangedInstance2 | composer.changedInstance(userPreferences2);
                        NavHostController navHostController2 = navHostController;
                        boolean zChangedInstance4 = zChangedInstance3 | composer.changedInstance(navHostController2);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            z21 z21Var = new z21(1, context2, mutableState3, navHostController2, serverPreferences2, userPreferences2);
                            composer.updateRememberedValue(z21Var);
                            objRememberedValue = z21Var;
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        boolean zChangedInstance5 = composer.changedInstance(navHostController2);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new q21(navHostController2, 3);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function0 = (Function0) objRememberedValue2;
                        boolean zChangedInstance6 = composer.changedInstance(navHostController2);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance6 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new m21(navHostController2, 5);
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function1 function2 = (Function1) objRememberedValue3;
                        boolean zChangedInstance7 = composer.changedInstance(navHostController2);
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (zChangedInstance7 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new q21(navHostController2, 4);
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        Function0 function3 = (Function0) objRememberedValue4;
                        boolean zChangedInstance8 = composer.changedInstance(navHostController2);
                        Object objRememberedValue5 = composer.rememberedValue();
                        if (zChangedInstance8 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new q21(navHostController2, 5);
                            composer.updateRememberedValue(objRememberedValue5);
                        }
                        Function0 function4 = (Function0) objRememberedValue5;
                        boolean zChangedInstance9 = composer.changedInstance(userPreferences2) | composer.changedInstance(navHostController2);
                        Object objRememberedValue6 = composer.rememberedValue();
                        if (zChangedInstance9 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new r21(userPreferences2, navHostController2, 1);
                            composer.updateRememberedValue(objRememberedValue6);
                        }
                        Function0 function5 = (Function0) objRememberedValue6;
                        MutableState mutableState4 = mutableState2;
                        boolean zBooleanValue = ((Boolean) mutableState4.getValue()).booleanValue();
                        boolean zChanged2 = composer.changed(mutableState4);
                        Object objRememberedValue7 = composer.rememberedValue();
                        if (zChanged2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new lu0(19, mutableState4);
                            composer.updateRememberedValue(objRememberedValue7);
                        }
                        gy1.g(function1, function0, function2, function3, function4, function5, zBooleanValue, (Function0) objRememberedValue7, null, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }), 254, (Object) null);
                NavGraphBuilderKt.composable$default(navGraphBuilder, "add_server", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1828195545, true, new w21(0, context, mutableState, navHostController, serverPreferences, userPreferences)), 254, (Object) null);
                NavGraphBuilderKt.composable$default(navGraphBuilder, "edit_server/{serverId}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("serverId", new ox0(25))), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-562124760, true, new w21(1, context, mutableState, navHostController, serverPreferences, userPreferences)), 252, (Object) null);
                final int i4 = 3;
                NavGraphBuilderKt.composable$default(navGraphBuilder, "danmaku_settings", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(703946025, true, new Function4() { // from class: u21
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13) throws UnsupportedEncodingException {
                        final String string;
                        final String string2;
                        String string3;
                        String string4;
                        String string5;
                        int i5 = i4;
                        String str = "";
                        Object[] objArr = 0;
                        final NavHostController navHostController2 = navHostController;
                        switch (i5) {
                            case 0:
                                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj11;
                                Composer composer = (Composer) obj12;
                                int iIntValue = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                navBackStackEntry.getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1555634642, iIntValue, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:744)");
                                }
                                Bundle arguments = navBackStackEntry.getArguments();
                                if (arguments != null && (string = arguments.getString("collectionId")) != null) {
                                    boolean zChangedInstance = composer.changedInstance(navHostController2);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new m21(navHostController2, 3);
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function1 function1 = (Function1) objRememberedValue;
                                    boolean zChangedInstance2 = composer.changedInstance(navHostController2) | composer.changed(string);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        final int i6 = 1;
                                        objRememberedValue2 = new Function0() { // from class: n21
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                SavedStateHandle savedStateHandle;
                                                SavedStateHandle savedStateHandle2;
                                                int i7 = i6;
                                                String str2 = string;
                                                NavHostController navHostController3 = navHostController2;
                                                switch (i7) {
                                                    case 0:
                                                        NavBackStackEntry previousBackStackEntry = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
                                                            savedStateHandle.set("detailReturnPersonFocusId", str2);
                                                            Integer num = (Integer) savedStateHandle.get("detailReturnPersonFocusToken");
                                                            savedStateHandle.set("detailReturnPersonFocusToken", Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                    default:
                                                        NavBackStackEntry previousBackStackEntry2 = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry2 != null) {
                                                            if (!Intrinsics.areEqual(previousBackStackEntry2.getDestination().getRoute(), "detail/{itemId}?episodeId={episodeId}")) {
                                                                previousBackStackEntry2 = null;
                                                            }
                                                            if (previousBackStackEntry2 != null && (savedStateHandle2 = previousBackStackEntry2.getSavedStateHandle()) != null) {
                                                                savedStateHandle2.set("detailReturnCollectionFocusId", str2);
                                                                Integer num2 = (Integer) savedStateHandle2.get("detailReturnCollectionFocusToken");
                                                                savedStateHandle2.set("detailReturnCollectionFocusToken", Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                                                            }
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    lq.d(string, function1, (Function0) objRememberedValue2, null, composer, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 1:
                                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj11;
                                Composer composer2 = (Composer) obj12;
                                int iIntValue2 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                navBackStackEntry2.getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1277479964, iIntValue2, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1044)");
                                }
                                Bundle arguments2 = navBackStackEntry2.getArguments();
                                if (arguments2 != null && (string2 = arguments2.getString("personId")) != null) {
                                    Bundle arguments3 = navBackStackEntry2.getArguments();
                                    if (arguments3 != null && (string3 = arguments3.getString(HintConstants.AUTOFILL_HINT_PERSON_NAME)) != null) {
                                        str = string3;
                                    }
                                    String strDecode = URLDecoder.decode(str, "UTF-8");
                                    Bundle arguments4 = navBackStackEntry2.getArguments();
                                    String string6 = arguments4 != null ? arguments4.getString("personImageTag") : null;
                                    strDecode.getClass();
                                    boolean zChangedInstance3 = composer2.changedInstance(navHostController2);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new m21(navHostController2, 0);
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function1 function2 = (Function1) objRememberedValue3;
                                    boolean zChangedInstance4 = composer2.changedInstance(navHostController2) | composer2.changed(string2);
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        final Object[] objArr2 = objArr == true ? 1 : 0;
                                        objRememberedValue4 = new Function0() { // from class: n21
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                SavedStateHandle savedStateHandle;
                                                SavedStateHandle savedStateHandle2;
                                                int i7 = objArr2;
                                                String str2 = string2;
                                                NavHostController navHostController3 = navHostController2;
                                                switch (i7) {
                                                    case 0:
                                                        NavBackStackEntry previousBackStackEntry = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
                                                            savedStateHandle.set("detailReturnPersonFocusId", str2);
                                                            Integer num = (Integer) savedStateHandle.get("detailReturnPersonFocusToken");
                                                            savedStateHandle.set("detailReturnPersonFocusToken", Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                    default:
                                                        NavBackStackEntry previousBackStackEntry2 = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry2 != null) {
                                                            if (!Intrinsics.areEqual(previousBackStackEntry2.getDestination().getRoute(), "detail/{itemId}?episodeId={episodeId}")) {
                                                                previousBackStackEntry2 = null;
                                                            }
                                                            if (previousBackStackEntry2 != null && (savedStateHandle2 = previousBackStackEntry2.getSavedStateHandle()) != null) {
                                                                savedStateHandle2.set("detailReturnCollectionFocusId", str2);
                                                                Integer num2 = (Integer) savedStateHandle2.get("detailReturnCollectionFocusToken");
                                                                savedStateHandle2.set("detailReturnCollectionFocusToken", Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                                                            }
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    ld1.c(string2, strDecode, string6, function2, (Function0) objRememberedValue4, null, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 2:
                                NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj11;
                                Composer composer3 = (Composer) obj12;
                                int iIntValue3 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                navBackStackEntry3.getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1751416547, iIntValue3, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1085)");
                                }
                                Bundle arguments5 = navBackStackEntry3.getArguments();
                                if (arguments5 == null || (string4 = arguments5.getString(DlnaConstants.EXTRA_URI)) == null) {
                                    string4 = "";
                                }
                                String strDecode2 = URLDecoder.decode(string4, "UTF-8");
                                Bundle arguments6 = navBackStackEntry3.getArguments();
                                if (arguments6 != null && (string5 = arguments6.getString(DlnaConstants.EXTRA_TITLE)) != null) {
                                    str = string5;
                                }
                                String strDecode3 = URLDecoder.decode(str, "UTF-8");
                                strDecode3.getClass();
                                String str2 = strDecode3.length() > 0 ? strDecode3 : null;
                                Bundle arguments7 = navBackStackEntry3.getArguments();
                                boolean z = arguments7 != null ? arguments7.getBoolean("useProxy") : false;
                                String strL = c61.l("dlna_", System.currentTimeMillis());
                                boolean zChangedInstance5 = composer3.changedInstance(navHostController2);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new m21(navHostController2, 4);
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                kn1.a(strL, null, null, null, null, null, strDecode2, str2, z, (Function1) objRememberedValue5, null, null, composer3, 0, 0, 3134);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 3:
                                Composer composer4 = (Composer) obj12;
                                int iIntValue4 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                ((NavBackStackEntry) obj11).getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(703946025, iIntValue4, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:644)");
                                }
                                boolean zChangedInstance6 = composer4.changedInstance(navHostController2);
                                Object objRememberedValue6 = composer4.rememberedValue();
                                if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new q21(navHostController2, 9);
                                    composer4.updateRememberedValue(objRememberedValue6);
                                }
                                b00.a((Function0) objRememberedValue6, false, null, composer4, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            default:
                                Composer composer5 = (Composer) obj12;
                                int iIntValue5 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                ((NavBackStackEntry) obj11).getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1970016810, iIntValue5, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:653)");
                                }
                                boolean zChangedInstance7 = composer5.changedInstance(navHostController2);
                                Object objRememberedValue7 = composer5.rememberedValue();
                                if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new q21(navHostController2, 7);
                                    composer5.updateRememberedValue(objRememberedValue7);
                                }
                                zb0.b((Function0) objRememberedValue7, composer5, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 254, (Object) null);
                final int i5 = 4;
                NavGraphBuilderKt.composable$default(navGraphBuilder, "dlna_settings", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(1970016810, true, new Function4() { // from class: u21
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13) throws UnsupportedEncodingException {
                        final String string;
                        final String string2;
                        String string3;
                        String string4;
                        String string5;
                        int i6 = i5;
                        String str = "";
                        Object[] objArr = 0;
                        final NavHostController navHostController2 = navHostController;
                        switch (i6) {
                            case 0:
                                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj11;
                                Composer composer = (Composer) obj12;
                                int iIntValue = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                navBackStackEntry.getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1555634642, iIntValue, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:744)");
                                }
                                Bundle arguments = navBackStackEntry.getArguments();
                                if (arguments != null && (string = arguments.getString("collectionId")) != null) {
                                    boolean zChangedInstance = composer.changedInstance(navHostController2);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new m21(navHostController2, 3);
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function1 function1 = (Function1) objRememberedValue;
                                    boolean zChangedInstance2 = composer.changedInstance(navHostController2) | composer.changed(string);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        final int i7 = 1;
                                        objRememberedValue2 = new Function0() { // from class: n21
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                SavedStateHandle savedStateHandle;
                                                SavedStateHandle savedStateHandle2;
                                                int i8 = i7;
                                                String str2 = string;
                                                NavHostController navHostController3 = navHostController2;
                                                switch (i8) {
                                                    case 0:
                                                        NavBackStackEntry previousBackStackEntry = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
                                                            savedStateHandle.set("detailReturnPersonFocusId", str2);
                                                            Integer num = (Integer) savedStateHandle.get("detailReturnPersonFocusToken");
                                                            savedStateHandle.set("detailReturnPersonFocusToken", Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                    default:
                                                        NavBackStackEntry previousBackStackEntry2 = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry2 != null) {
                                                            if (!Intrinsics.areEqual(previousBackStackEntry2.getDestination().getRoute(), "detail/{itemId}?episodeId={episodeId}")) {
                                                                previousBackStackEntry2 = null;
                                                            }
                                                            if (previousBackStackEntry2 != null && (savedStateHandle2 = previousBackStackEntry2.getSavedStateHandle()) != null) {
                                                                savedStateHandle2.set("detailReturnCollectionFocusId", str2);
                                                                Integer num2 = (Integer) savedStateHandle2.get("detailReturnCollectionFocusToken");
                                                                savedStateHandle2.set("detailReturnCollectionFocusToken", Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                                                            }
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    lq.d(string, function1, (Function0) objRememberedValue2, null, composer, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 1:
                                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj11;
                                Composer composer2 = (Composer) obj12;
                                int iIntValue2 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                navBackStackEntry2.getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1277479964, iIntValue2, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1044)");
                                }
                                Bundle arguments2 = navBackStackEntry2.getArguments();
                                if (arguments2 != null && (string2 = arguments2.getString("personId")) != null) {
                                    Bundle arguments3 = navBackStackEntry2.getArguments();
                                    if (arguments3 != null && (string3 = arguments3.getString(HintConstants.AUTOFILL_HINT_PERSON_NAME)) != null) {
                                        str = string3;
                                    }
                                    String strDecode = URLDecoder.decode(str, "UTF-8");
                                    Bundle arguments4 = navBackStackEntry2.getArguments();
                                    String string6 = arguments4 != null ? arguments4.getString("personImageTag") : null;
                                    strDecode.getClass();
                                    boolean zChangedInstance3 = composer2.changedInstance(navHostController2);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new m21(navHostController2, 0);
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function1 function2 = (Function1) objRememberedValue3;
                                    boolean zChangedInstance4 = composer2.changedInstance(navHostController2) | composer2.changed(string2);
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        final int objArr2 = objArr == true ? 1 : 0;
                                        objRememberedValue4 = new Function0() { // from class: n21
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                SavedStateHandle savedStateHandle;
                                                SavedStateHandle savedStateHandle2;
                                                int i8 = objArr2;
                                                String str2 = string2;
                                                NavHostController navHostController3 = navHostController2;
                                                switch (i8) {
                                                    case 0:
                                                        NavBackStackEntry previousBackStackEntry = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
                                                            savedStateHandle.set("detailReturnPersonFocusId", str2);
                                                            Integer num = (Integer) savedStateHandle.get("detailReturnPersonFocusToken");
                                                            savedStateHandle.set("detailReturnPersonFocusToken", Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                    default:
                                                        NavBackStackEntry previousBackStackEntry2 = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry2 != null) {
                                                            if (!Intrinsics.areEqual(previousBackStackEntry2.getDestination().getRoute(), "detail/{itemId}?episodeId={episodeId}")) {
                                                                previousBackStackEntry2 = null;
                                                            }
                                                            if (previousBackStackEntry2 != null && (savedStateHandle2 = previousBackStackEntry2.getSavedStateHandle()) != null) {
                                                                savedStateHandle2.set("detailReturnCollectionFocusId", str2);
                                                                Integer num2 = (Integer) savedStateHandle2.get("detailReturnCollectionFocusToken");
                                                                savedStateHandle2.set("detailReturnCollectionFocusToken", Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                                                            }
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    ld1.c(string2, strDecode, string6, function2, (Function0) objRememberedValue4, null, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 2:
                                NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj11;
                                Composer composer3 = (Composer) obj12;
                                int iIntValue3 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                navBackStackEntry3.getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1751416547, iIntValue3, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1085)");
                                }
                                Bundle arguments5 = navBackStackEntry3.getArguments();
                                if (arguments5 == null || (string4 = arguments5.getString(DlnaConstants.EXTRA_URI)) == null) {
                                    string4 = "";
                                }
                                String strDecode2 = URLDecoder.decode(string4, "UTF-8");
                                Bundle arguments6 = navBackStackEntry3.getArguments();
                                if (arguments6 != null && (string5 = arguments6.getString(DlnaConstants.EXTRA_TITLE)) != null) {
                                    str = string5;
                                }
                                String strDecode3 = URLDecoder.decode(str, "UTF-8");
                                strDecode3.getClass();
                                String str2 = strDecode3.length() > 0 ? strDecode3 : null;
                                Bundle arguments7 = navBackStackEntry3.getArguments();
                                boolean z = arguments7 != null ? arguments7.getBoolean("useProxy") : false;
                                String strL = c61.l("dlna_", System.currentTimeMillis());
                                boolean zChangedInstance5 = composer3.changedInstance(navHostController2);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new m21(navHostController2, 4);
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                kn1.a(strL, null, null, null, null, null, strDecode2, str2, z, (Function1) objRememberedValue5, null, null, composer3, 0, 0, 3134);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 3:
                                Composer composer4 = (Composer) obj12;
                                int iIntValue4 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                ((NavBackStackEntry) obj11).getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(703946025, iIntValue4, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:644)");
                                }
                                boolean zChangedInstance6 = composer4.changedInstance(navHostController2);
                                Object objRememberedValue6 = composer4.rememberedValue();
                                if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new q21(navHostController2, 9);
                                    composer4.updateRememberedValue(objRememberedValue6);
                                }
                                b00.a((Function0) objRememberedValue6, false, null, composer4, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            default:
                                Composer composer5 = (Composer) obj12;
                                int iIntValue5 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                ((NavBackStackEntry) obj11).getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1970016810, iIntValue5, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:653)");
                                }
                                boolean zChangedInstance7 = composer5.changedInstance(navHostController2);
                                Object objRememberedValue7 = composer5.rememberedValue();
                                if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new q21(navHostController2, 7);
                                    composer5.updateRememberedValue(objRememberedValue7);
                                }
                                zb0.b((Function0) objRememberedValue7, composer5, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 254, (Object) null);
                NavGraphBuilderKt.composable$default(navGraphBuilder, "aggregate_search", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1058879701, true, new no0(mutableState2, navHostController, serverPreferences, context, mutableState, userPreferences, serverConfig)), 254, (Object) null);
                NavGraphBuilderKt.composable$default(navGraphBuilder, "home", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ht.c, 254, (Object) null);
                NavGraphBuilderKt.composable$default(navGraphBuilder, "library/{libraryId}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("libraryId", new ox0(27))), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(1473261869, true, new w21(navHostController, serverPreferences, context, mutableState, userPreferences)), 252, (Object) null);
                NavGraphBuilderKt.composable$default(navGraphBuilder, "collection/{collectionId}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("collectionId", new ox0(28))), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1555634642, true, new Function4() { // from class: u21
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13) throws UnsupportedEncodingException {
                        final String string;
                        final String string2;
                        String string3;
                        String string4;
                        String string5;
                        int i6 = i2;
                        String str = "";
                        Object[] objArr = 0;
                        final NavHostController navHostController2 = navHostController;
                        switch (i6) {
                            case 0:
                                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj11;
                                Composer composer = (Composer) obj12;
                                int iIntValue = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                navBackStackEntry.getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1555634642, iIntValue, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:744)");
                                }
                                Bundle arguments = navBackStackEntry.getArguments();
                                if (arguments != null && (string = arguments.getString("collectionId")) != null) {
                                    boolean zChangedInstance = composer.changedInstance(navHostController2);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new m21(navHostController2, 3);
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function1 function1 = (Function1) objRememberedValue;
                                    boolean zChangedInstance2 = composer.changedInstance(navHostController2) | composer.changed(string);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        final int i7 = 1;
                                        objRememberedValue2 = new Function0() { // from class: n21
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                SavedStateHandle savedStateHandle;
                                                SavedStateHandle savedStateHandle2;
                                                int i8 = i7;
                                                String str2 = string;
                                                NavHostController navHostController3 = navHostController2;
                                                switch (i8) {
                                                    case 0:
                                                        NavBackStackEntry previousBackStackEntry = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
                                                            savedStateHandle.set("detailReturnPersonFocusId", str2);
                                                            Integer num = (Integer) savedStateHandle.get("detailReturnPersonFocusToken");
                                                            savedStateHandle.set("detailReturnPersonFocusToken", Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                    default:
                                                        NavBackStackEntry previousBackStackEntry2 = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry2 != null) {
                                                            if (!Intrinsics.areEqual(previousBackStackEntry2.getDestination().getRoute(), "detail/{itemId}?episodeId={episodeId}")) {
                                                                previousBackStackEntry2 = null;
                                                            }
                                                            if (previousBackStackEntry2 != null && (savedStateHandle2 = previousBackStackEntry2.getSavedStateHandle()) != null) {
                                                                savedStateHandle2.set("detailReturnCollectionFocusId", str2);
                                                                Integer num2 = (Integer) savedStateHandle2.get("detailReturnCollectionFocusToken");
                                                                savedStateHandle2.set("detailReturnCollectionFocusToken", Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                                                            }
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    lq.d(string, function1, (Function0) objRememberedValue2, null, composer, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 1:
                                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj11;
                                Composer composer2 = (Composer) obj12;
                                int iIntValue2 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                navBackStackEntry2.getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1277479964, iIntValue2, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1044)");
                                }
                                Bundle arguments2 = navBackStackEntry2.getArguments();
                                if (arguments2 != null && (string2 = arguments2.getString("personId")) != null) {
                                    Bundle arguments3 = navBackStackEntry2.getArguments();
                                    if (arguments3 != null && (string3 = arguments3.getString(HintConstants.AUTOFILL_HINT_PERSON_NAME)) != null) {
                                        str = string3;
                                    }
                                    String strDecode = URLDecoder.decode(str, "UTF-8");
                                    Bundle arguments4 = navBackStackEntry2.getArguments();
                                    String string6 = arguments4 != null ? arguments4.getString("personImageTag") : null;
                                    strDecode.getClass();
                                    boolean zChangedInstance3 = composer2.changedInstance(navHostController2);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new m21(navHostController2, 0);
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function1 function2 = (Function1) objRememberedValue3;
                                    boolean zChangedInstance4 = composer2.changedInstance(navHostController2) | composer2.changed(string2);
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        final int objArr2 = objArr == true ? 1 : 0;
                                        objRememberedValue4 = new Function0() { // from class: n21
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                SavedStateHandle savedStateHandle;
                                                SavedStateHandle savedStateHandle2;
                                                int i8 = objArr2;
                                                String str2 = string2;
                                                NavHostController navHostController3 = navHostController2;
                                                switch (i8) {
                                                    case 0:
                                                        NavBackStackEntry previousBackStackEntry = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
                                                            savedStateHandle.set("detailReturnPersonFocusId", str2);
                                                            Integer num = (Integer) savedStateHandle.get("detailReturnPersonFocusToken");
                                                            savedStateHandle.set("detailReturnPersonFocusToken", Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                    default:
                                                        NavBackStackEntry previousBackStackEntry2 = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry2 != null) {
                                                            if (!Intrinsics.areEqual(previousBackStackEntry2.getDestination().getRoute(), "detail/{itemId}?episodeId={episodeId}")) {
                                                                previousBackStackEntry2 = null;
                                                            }
                                                            if (previousBackStackEntry2 != null && (savedStateHandle2 = previousBackStackEntry2.getSavedStateHandle()) != null) {
                                                                savedStateHandle2.set("detailReturnCollectionFocusId", str2);
                                                                Integer num2 = (Integer) savedStateHandle2.get("detailReturnCollectionFocusToken");
                                                                savedStateHandle2.set("detailReturnCollectionFocusToken", Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                                                            }
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    ld1.c(string2, strDecode, string6, function2, (Function0) objRememberedValue4, null, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 2:
                                NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj11;
                                Composer composer3 = (Composer) obj12;
                                int iIntValue3 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                navBackStackEntry3.getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1751416547, iIntValue3, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1085)");
                                }
                                Bundle arguments5 = navBackStackEntry3.getArguments();
                                if (arguments5 == null || (string4 = arguments5.getString(DlnaConstants.EXTRA_URI)) == null) {
                                    string4 = "";
                                }
                                String strDecode2 = URLDecoder.decode(string4, "UTF-8");
                                Bundle arguments6 = navBackStackEntry3.getArguments();
                                if (arguments6 != null && (string5 = arguments6.getString(DlnaConstants.EXTRA_TITLE)) != null) {
                                    str = string5;
                                }
                                String strDecode3 = URLDecoder.decode(str, "UTF-8");
                                strDecode3.getClass();
                                String str2 = strDecode3.length() > 0 ? strDecode3 : null;
                                Bundle arguments7 = navBackStackEntry3.getArguments();
                                boolean z = arguments7 != null ? arguments7.getBoolean("useProxy") : false;
                                String strL = c61.l("dlna_", System.currentTimeMillis());
                                boolean zChangedInstance5 = composer3.changedInstance(navHostController2);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new m21(navHostController2, 4);
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                kn1.a(strL, null, null, null, null, null, strDecode2, str2, z, (Function1) objRememberedValue5, null, null, composer3, 0, 0, 3134);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 3:
                                Composer composer4 = (Composer) obj12;
                                int iIntValue4 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                ((NavBackStackEntry) obj11).getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(703946025, iIntValue4, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:644)");
                                }
                                boolean zChangedInstance6 = composer4.changedInstance(navHostController2);
                                Object objRememberedValue6 = composer4.rememberedValue();
                                if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new q21(navHostController2, 9);
                                    composer4.updateRememberedValue(objRememberedValue6);
                                }
                                b00.a((Function0) objRememberedValue6, false, null, composer4, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            default:
                                Composer composer5 = (Composer) obj12;
                                int iIntValue5 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                ((NavBackStackEntry) obj11).getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1970016810, iIntValue5, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:653)");
                                }
                                boolean zChangedInstance7 = composer5.changedInstance(navHostController2);
                                Object objRememberedValue7 = composer5.rememberedValue();
                                if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new q21(navHostController2, 7);
                                    composer5.updateRememberedValue(objRememberedValue7);
                                }
                                zb0.b((Function0) objRememberedValue7, composer5, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 252, (Object) null);
                NavGraphBuilderKt.composable$default(navGraphBuilder, "detail/{itemId}?episodeId={episodeId}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument("itemId", new ox0(14)), NamedNavArgumentKt.navArgument("episodeId", new ox0(15))}), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-289563857, true, new no0(serverConfig, navHostController, serverPreferences, context, mutableState, userPreferences, (CoroutineScope) obj9)), 252, (Object) null);
                NavGraphBuilderKt.composable$default(navGraphBuilder, "player/{itemId}?mediaSourceId={mediaSourceId}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument("itemId", new ox0(16)), NamedNavArgumentKt.navArgument("mediaSourceId", new ox0(17))}), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(11409179, true, new v21(i2, navHostController, serverConfig)), 252, (Object) null);
                NavGraphBuilderKt.composable$default(navGraphBuilder, "person/{personId}?personName={personName}&personImageTag={personImageTag}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument("personId", new ox0(18)), NamedNavArgumentKt.navArgument(HintConstants.AUTOFILL_HINT_PERSON_NAME, new ox0(19)), NamedNavArgumentKt.navArgument("personImageTag", new ox0(20))}), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(1277479964, true, new Function4() { // from class: u21
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13) throws UnsupportedEncodingException {
                        final String string;
                        final String string2;
                        String string3;
                        String string4;
                        String string5;
                        int i6 = i3;
                        String str = "";
                        Object[] objArr = 0;
                        final NavHostController navHostController2 = navHostController;
                        switch (i6) {
                            case 0:
                                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj11;
                                Composer composer = (Composer) obj12;
                                int iIntValue = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                navBackStackEntry.getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1555634642, iIntValue, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:744)");
                                }
                                Bundle arguments = navBackStackEntry.getArguments();
                                if (arguments != null && (string = arguments.getString("collectionId")) != null) {
                                    boolean zChangedInstance = composer.changedInstance(navHostController2);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new m21(navHostController2, 3);
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function1 function1 = (Function1) objRememberedValue;
                                    boolean zChangedInstance2 = composer.changedInstance(navHostController2) | composer.changed(string);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        final int i7 = 1;
                                        objRememberedValue2 = new Function0() { // from class: n21
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                SavedStateHandle savedStateHandle;
                                                SavedStateHandle savedStateHandle2;
                                                int i8 = i7;
                                                String str2 = string;
                                                NavHostController navHostController3 = navHostController2;
                                                switch (i8) {
                                                    case 0:
                                                        NavBackStackEntry previousBackStackEntry = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
                                                            savedStateHandle.set("detailReturnPersonFocusId", str2);
                                                            Integer num = (Integer) savedStateHandle.get("detailReturnPersonFocusToken");
                                                            savedStateHandle.set("detailReturnPersonFocusToken", Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                    default:
                                                        NavBackStackEntry previousBackStackEntry2 = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry2 != null) {
                                                            if (!Intrinsics.areEqual(previousBackStackEntry2.getDestination().getRoute(), "detail/{itemId}?episodeId={episodeId}")) {
                                                                previousBackStackEntry2 = null;
                                                            }
                                                            if (previousBackStackEntry2 != null && (savedStateHandle2 = previousBackStackEntry2.getSavedStateHandle()) != null) {
                                                                savedStateHandle2.set("detailReturnCollectionFocusId", str2);
                                                                Integer num2 = (Integer) savedStateHandle2.get("detailReturnCollectionFocusToken");
                                                                savedStateHandle2.set("detailReturnCollectionFocusToken", Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                                                            }
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    lq.d(string, function1, (Function0) objRememberedValue2, null, composer, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 1:
                                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj11;
                                Composer composer2 = (Composer) obj12;
                                int iIntValue2 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                navBackStackEntry2.getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1277479964, iIntValue2, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1044)");
                                }
                                Bundle arguments2 = navBackStackEntry2.getArguments();
                                if (arguments2 != null && (string2 = arguments2.getString("personId")) != null) {
                                    Bundle arguments3 = navBackStackEntry2.getArguments();
                                    if (arguments3 != null && (string3 = arguments3.getString(HintConstants.AUTOFILL_HINT_PERSON_NAME)) != null) {
                                        str = string3;
                                    }
                                    String strDecode = URLDecoder.decode(str, "UTF-8");
                                    Bundle arguments4 = navBackStackEntry2.getArguments();
                                    String string6 = arguments4 != null ? arguments4.getString("personImageTag") : null;
                                    strDecode.getClass();
                                    boolean zChangedInstance3 = composer2.changedInstance(navHostController2);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new m21(navHostController2, 0);
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function1 function2 = (Function1) objRememberedValue3;
                                    boolean zChangedInstance4 = composer2.changedInstance(navHostController2) | composer2.changed(string2);
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        final int objArr2 = objArr == true ? 1 : 0;
                                        objRememberedValue4 = new Function0() { // from class: n21
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                SavedStateHandle savedStateHandle;
                                                SavedStateHandle savedStateHandle2;
                                                int i8 = objArr2;
                                                String str2 = string2;
                                                NavHostController navHostController3 = navHostController2;
                                                switch (i8) {
                                                    case 0:
                                                        NavBackStackEntry previousBackStackEntry = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
                                                            savedStateHandle.set("detailReturnPersonFocusId", str2);
                                                            Integer num = (Integer) savedStateHandle.get("detailReturnPersonFocusToken");
                                                            savedStateHandle.set("detailReturnPersonFocusToken", Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                    default:
                                                        NavBackStackEntry previousBackStackEntry2 = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry2 != null) {
                                                            if (!Intrinsics.areEqual(previousBackStackEntry2.getDestination().getRoute(), "detail/{itemId}?episodeId={episodeId}")) {
                                                                previousBackStackEntry2 = null;
                                                            }
                                                            if (previousBackStackEntry2 != null && (savedStateHandle2 = previousBackStackEntry2.getSavedStateHandle()) != null) {
                                                                savedStateHandle2.set("detailReturnCollectionFocusId", str2);
                                                                Integer num2 = (Integer) savedStateHandle2.get("detailReturnCollectionFocusToken");
                                                                savedStateHandle2.set("detailReturnCollectionFocusToken", Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                                                            }
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    ld1.c(string2, strDecode, string6, function2, (Function0) objRememberedValue4, null, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 2:
                                NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj11;
                                Composer composer3 = (Composer) obj12;
                                int iIntValue3 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                navBackStackEntry3.getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1751416547, iIntValue3, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1085)");
                                }
                                Bundle arguments5 = navBackStackEntry3.getArguments();
                                if (arguments5 == null || (string4 = arguments5.getString(DlnaConstants.EXTRA_URI)) == null) {
                                    string4 = "";
                                }
                                String strDecode2 = URLDecoder.decode(string4, "UTF-8");
                                Bundle arguments6 = navBackStackEntry3.getArguments();
                                if (arguments6 != null && (string5 = arguments6.getString(DlnaConstants.EXTRA_TITLE)) != null) {
                                    str = string5;
                                }
                                String strDecode3 = URLDecoder.decode(str, "UTF-8");
                                strDecode3.getClass();
                                String str2 = strDecode3.length() > 0 ? strDecode3 : null;
                                Bundle arguments7 = navBackStackEntry3.getArguments();
                                boolean z = arguments7 != null ? arguments7.getBoolean("useProxy") : false;
                                String strL = c61.l("dlna_", System.currentTimeMillis());
                                boolean zChangedInstance5 = composer3.changedInstance(navHostController2);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new m21(navHostController2, 4);
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                kn1.a(strL, null, null, null, null, null, strDecode2, str2, z, (Function1) objRememberedValue5, null, null, composer3, 0, 0, 3134);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 3:
                                Composer composer4 = (Composer) obj12;
                                int iIntValue4 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                ((NavBackStackEntry) obj11).getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(703946025, iIntValue4, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:644)");
                                }
                                boolean zChangedInstance6 = composer4.changedInstance(navHostController2);
                                Object objRememberedValue6 = composer4.rememberedValue();
                                if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new q21(navHostController2, 9);
                                    composer4.updateRememberedValue(objRememberedValue6);
                                }
                                b00.a((Function0) objRememberedValue6, false, null, composer4, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            default:
                                Composer composer5 = (Composer) obj12;
                                int iIntValue5 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                ((NavBackStackEntry) obj11).getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1970016810, iIntValue5, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:653)");
                                }
                                boolean zChangedInstance7 = composer5.changedInstance(navHostController2);
                                Object objRememberedValue7 = composer5.rememberedValue();
                                if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new q21(navHostController2, 7);
                                    composer5.updateRememberedValue(objRememberedValue7);
                                }
                                zb0.b((Function0) objRememberedValue7, composer5, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 252, (Object) null);
                final int i6 = 2;
                NavGraphBuilderKt.composable$default(navGraphBuilder, "dlna_player?uri={uri}&title={title}&useProxy={useProxy}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument(DlnaConstants.EXTRA_URI, new ox0(22)), NamedNavArgumentKt.navArgument(DlnaConstants.EXTRA_TITLE, new ox0(23)), NamedNavArgumentKt.navArgument("useProxy", new ox0(24))}), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1751416547, true, new Function4() { // from class: u21
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13) throws UnsupportedEncodingException {
                        final String string;
                        final String string2;
                        String string3;
                        String string4;
                        String string5;
                        int i7 = i6;
                        String str = "";
                        Object[] objArr = 0;
                        final NavHostController navHostController2 = navHostController;
                        switch (i7) {
                            case 0:
                                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj11;
                                Composer composer = (Composer) obj12;
                                int iIntValue = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                navBackStackEntry.getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1555634642, iIntValue, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:744)");
                                }
                                Bundle arguments = navBackStackEntry.getArguments();
                                if (arguments != null && (string = arguments.getString("collectionId")) != null) {
                                    boolean zChangedInstance = composer.changedInstance(navHostController2);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new m21(navHostController2, 3);
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function1 function1 = (Function1) objRememberedValue;
                                    boolean zChangedInstance2 = composer.changedInstance(navHostController2) | composer.changed(string);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        final int i8 = 1;
                                        objRememberedValue2 = new Function0() { // from class: n21
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                SavedStateHandle savedStateHandle;
                                                SavedStateHandle savedStateHandle2;
                                                int i9 = i8;
                                                String str2 = string;
                                                NavHostController navHostController3 = navHostController2;
                                                switch (i9) {
                                                    case 0:
                                                        NavBackStackEntry previousBackStackEntry = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
                                                            savedStateHandle.set("detailReturnPersonFocusId", str2);
                                                            Integer num = (Integer) savedStateHandle.get("detailReturnPersonFocusToken");
                                                            savedStateHandle.set("detailReturnPersonFocusToken", Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                    default:
                                                        NavBackStackEntry previousBackStackEntry2 = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry2 != null) {
                                                            if (!Intrinsics.areEqual(previousBackStackEntry2.getDestination().getRoute(), "detail/{itemId}?episodeId={episodeId}")) {
                                                                previousBackStackEntry2 = null;
                                                            }
                                                            if (previousBackStackEntry2 != null && (savedStateHandle2 = previousBackStackEntry2.getSavedStateHandle()) != null) {
                                                                savedStateHandle2.set("detailReturnCollectionFocusId", str2);
                                                                Integer num2 = (Integer) savedStateHandle2.get("detailReturnCollectionFocusToken");
                                                                savedStateHandle2.set("detailReturnCollectionFocusToken", Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                                                            }
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    lq.d(string, function1, (Function0) objRememberedValue2, null, composer, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 1:
                                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj11;
                                Composer composer2 = (Composer) obj12;
                                int iIntValue2 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                navBackStackEntry2.getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1277479964, iIntValue2, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1044)");
                                }
                                Bundle arguments2 = navBackStackEntry2.getArguments();
                                if (arguments2 != null && (string2 = arguments2.getString("personId")) != null) {
                                    Bundle arguments3 = navBackStackEntry2.getArguments();
                                    if (arguments3 != null && (string3 = arguments3.getString(HintConstants.AUTOFILL_HINT_PERSON_NAME)) != null) {
                                        str = string3;
                                    }
                                    String strDecode = URLDecoder.decode(str, "UTF-8");
                                    Bundle arguments4 = navBackStackEntry2.getArguments();
                                    String string6 = arguments4 != null ? arguments4.getString("personImageTag") : null;
                                    strDecode.getClass();
                                    boolean zChangedInstance3 = composer2.changedInstance(navHostController2);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new m21(navHostController2, 0);
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function1 function2 = (Function1) objRememberedValue3;
                                    boolean zChangedInstance4 = composer2.changedInstance(navHostController2) | composer2.changed(string2);
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        final int objArr2 = objArr == true ? 1 : 0;
                                        objRememberedValue4 = new Function0() { // from class: n21
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                SavedStateHandle savedStateHandle;
                                                SavedStateHandle savedStateHandle2;
                                                int i9 = objArr2;
                                                String str2 = string2;
                                                NavHostController navHostController3 = navHostController2;
                                                switch (i9) {
                                                    case 0:
                                                        NavBackStackEntry previousBackStackEntry = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
                                                            savedStateHandle.set("detailReturnPersonFocusId", str2);
                                                            Integer num = (Integer) savedStateHandle.get("detailReturnPersonFocusToken");
                                                            savedStateHandle.set("detailReturnPersonFocusToken", Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                    default:
                                                        NavBackStackEntry previousBackStackEntry2 = navHostController3.getPreviousBackStackEntry();
                                                        if (previousBackStackEntry2 != null) {
                                                            if (!Intrinsics.areEqual(previousBackStackEntry2.getDestination().getRoute(), "detail/{itemId}?episodeId={episodeId}")) {
                                                                previousBackStackEntry2 = null;
                                                            }
                                                            if (previousBackStackEntry2 != null && (savedStateHandle2 = previousBackStackEntry2.getSavedStateHandle()) != null) {
                                                                savedStateHandle2.set("detailReturnCollectionFocusId", str2);
                                                                Integer num2 = (Integer) savedStateHandle2.get("detailReturnCollectionFocusToken");
                                                                savedStateHandle2.set("detailReturnCollectionFocusToken", Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                                                            }
                                                        }
                                                        navHostController3.popBackStack();
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    ld1.c(string2, strDecode, string6, function2, (Function0) objRememberedValue4, null, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 2:
                                NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj11;
                                Composer composer3 = (Composer) obj12;
                                int iIntValue3 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                navBackStackEntry3.getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1751416547, iIntValue3, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1085)");
                                }
                                Bundle arguments5 = navBackStackEntry3.getArguments();
                                if (arguments5 == null || (string4 = arguments5.getString(DlnaConstants.EXTRA_URI)) == null) {
                                    string4 = "";
                                }
                                String strDecode2 = URLDecoder.decode(string4, "UTF-8");
                                Bundle arguments6 = navBackStackEntry3.getArguments();
                                if (arguments6 != null && (string5 = arguments6.getString(DlnaConstants.EXTRA_TITLE)) != null) {
                                    str = string5;
                                }
                                String strDecode3 = URLDecoder.decode(str, "UTF-8");
                                strDecode3.getClass();
                                String str2 = strDecode3.length() > 0 ? strDecode3 : null;
                                Bundle arguments7 = navBackStackEntry3.getArguments();
                                boolean z = arguments7 != null ? arguments7.getBoolean("useProxy") : false;
                                String strL = c61.l("dlna_", System.currentTimeMillis());
                                boolean zChangedInstance5 = composer3.changedInstance(navHostController2);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new m21(navHostController2, 4);
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                kn1.a(strL, null, null, null, null, null, strDecode2, str2, z, (Function1) objRememberedValue5, null, null, composer3, 0, 0, 3134);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 3:
                                Composer composer4 = (Composer) obj12;
                                int iIntValue4 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                ((NavBackStackEntry) obj11).getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(703946025, iIntValue4, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:644)");
                                }
                                boolean zChangedInstance6 = composer4.changedInstance(navHostController2);
                                Object objRememberedValue6 = composer4.rememberedValue();
                                if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new q21(navHostController2, 9);
                                    composer4.updateRememberedValue(objRememberedValue6);
                                }
                                b00.a((Function0) objRememberedValue6, false, null, composer4, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            default:
                                Composer composer5 = (Composer) obj12;
                                int iIntValue5 = ((Integer) obj13).intValue();
                                ((AnimatedContentScope) obj10).getClass();
                                ((NavBackStackEntry) obj11).getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1970016810, iIntValue5, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:653)");
                                }
                                boolean zChangedInstance7 = composer5.changedInstance(navHostController2);
                                Object objRememberedValue7 = composer5.rememberedValue();
                                if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new q21(navHostController2, 7);
                                    composer5.updateRememberedValue(objRememberedValue7);
                                }
                                zb0.b((Function0) objRememberedValue7, composer5, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 252, (Object) null);
                break;
            case 1:
                final State state = (State) obj3;
                final Function1 function1 = (Function1) obj2;
                final State state2 = (State) obj9;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-815152629, true, new n1((String) obj7, (String) obj8, (FocusRequester) obj6, (State) obj4, (State) obj5, 6)), 3, null);
                if (!((List) state.getValue()).isEmpty()) {
                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-292016176, true, new Function3() { // from class: jd1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj10, Object obj11, Object obj12) {
                            int i7 = i2;
                            State state3 = state;
                            Function1 function2 = function1;
                            LazyItemScope lazyItemScope = (LazyItemScope) obj10;
                            Composer composer = (Composer) obj11;
                            int iIntValue = ((Integer) obj12).intValue();
                            switch (i7) {
                                case 0:
                                    lazyItemScope.getClass();
                                    if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-292016176, iIntValue, -1, "com.dh.myembyapp.ui.screens.person.PersonScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonScreen.kt:112)");
                                        }
                                        ld1.a(6, composer, "电影", (List) state3.getValue(), function2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    lazyItemScope.getClass();
                                    if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-967855879, iIntValue, -1, "com.dh.myembyapp.ui.screens.person.PersonScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonScreen.kt:123)");
                                        }
                                        ld1.a(6, composer, "剧集", (List) state3.getValue(), function2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3, null);
                }
                if (!((List) state2.getValue()).isEmpty()) {
                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-967855879, true, new Function3() { // from class: jd1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj10, Object obj11, Object obj12) {
                            int i7 = i3;
                            State state3 = state2;
                            Function1 function2 = function1;
                            LazyItemScope lazyItemScope = (LazyItemScope) obj10;
                            Composer composer = (Composer) obj11;
                            int iIntValue = ((Integer) obj12).intValue();
                            switch (i7) {
                                case 0:
                                    lazyItemScope.getClass();
                                    if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-292016176, iIntValue, -1, "com.dh.myembyapp.ui.screens.person.PersonScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonScreen.kt:112)");
                                        }
                                        ld1.a(6, composer, "电影", (List) state3.getValue(), function2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    lazyItemScope.getClass();
                                    if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-967855879, iIntValue, -1, "com.dh.myembyapp.ui.screens.person.PersonScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonScreen.kt:123)");
                                        }
                                        ld1.a(6, composer, "剧集", (List) state3.getValue(), function2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3, null);
                }
                break;
            case 2:
                ProxyConfig proxyConfig = (ProxyConfig) obj;
                ((MutableState) obj8).setValue(Boolean.valueOf(proxyConfig.getEnabled()));
                ((MutableState) obj6).setValue(proxyConfig.getProtocol());
                ((MutableState) obj7).setValue(proxyConfig.getHost());
                ((MutableState) obj4).setValue(String.valueOf(proxyConfig.getPort()));
                ((MutableState) obj5).setValue(proxyConfig.getUsername());
                ((MutableState) obj3).setValue(proxyConfig.getPassword());
                ((MutableState) obj2).setValue(Boolean.valueOf(proxyConfig.getBypassLan()));
                ((MutableState) obj9).setValue("已通过扫码导入代理配置");
                break;
            default:
                String str = (String) obj;
                str.getClass();
                lx1.g((CoroutineScope) obj9, (MutableState) obj8, (px1) obj7, (MutableState) obj6, (UserPreferences) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, str);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ s21(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8) {
        this.c = mutableState;
        this.d = mutableState2;
        this.b = mutableState3;
        this.e = mutableState4;
        this.g = mutableState5;
        this.h = mutableState6;
        this.i = mutableState7;
        this.j = mutableState8;
    }

    public /* synthetic */ s21(String str, String str2, FocusRequester focusRequester, State state, State state2, State state3, Function1 function1, State state4) {
        this.b = str;
        this.c = str2;
        this.d = focusRequester;
        this.e = state;
        this.g = state2;
        this.h = state3;
        this.i = function1;
        this.j = state4;
    }

    public /* synthetic */ s21(CoroutineScope coroutineScope, MutableState mutableState, px1 px1Var, MutableState mutableState2, UserPreferences userPreferences, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        this.j = coroutineScope;
        this.c = mutableState;
        this.b = px1Var;
        this.d = mutableState2;
        this.g = userPreferences;
        this.e = mutableState3;
        this.h = mutableState4;
        this.i = mutableState5;
    }
}
