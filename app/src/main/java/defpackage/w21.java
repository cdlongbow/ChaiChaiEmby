package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.preferences.ServerPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w21 implements Function4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ w21(NavHostController navHostController, MutableState mutableState, ServerPreferences serverPreferences, Context context, UserPreferences userPreferences) {
        this.a = 3;
        this.g = navHostController;
        this.c = mutableState;
        this.d = serverPreferences;
        this.b = context;
        this.e = userPreferences;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        NavHostController navHostController;
        String string;
        NavHostController navHostController2;
        String string2;
        int i = this.a;
        Object obj5 = this.g;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj8;
                ServerPreferences serverPreferences = (ServerPreferences) obj7;
                UserPreferences userPreferences = (UserPreferences) obj6;
                NavHostController navHostController3 = (NavHostController) obj5;
                Composer composer = (Composer) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((AnimatedContentScope) obj).getClass();
                ((NavBackStackEntry) obj2).getClass();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1828195545, iIntValue, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:602)");
                }
                boolean zChangedInstance = composer.changedInstance(context);
                MutableState mutableState = this.c;
                boolean zChanged = composer.changed(mutableState) | zChangedInstance | composer.changedInstance(serverPreferences) | composer.changedInstance(userPreferences) | composer.changedInstance(navHostController3);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    navHostController = navHostController3;
                    z21 z21Var = new z21(2, context, mutableState, navHostController, serverPreferences, userPreferences);
                    composer.updateRememberedValue(z21Var);
                    objRememberedValue = z21Var;
                } else {
                    navHostController = navHostController3;
                }
                Function1 function1 = (Function1) objRememberedValue;
                boolean zChangedInstance2 = composer.changedInstance(navHostController);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new q21(navHostController, 6);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                p2.a(null, function1, (Function0) objRememberedValue2, null, composer, 0, 9);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 1:
                Context context2 = (Context) obj8;
                ServerPreferences serverPreferences2 = (ServerPreferences) obj7;
                UserPreferences userPreferences2 = (UserPreferences) obj6;
                NavHostController navHostController4 = (NavHostController) obj5;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj2;
                Composer composer2 = (Composer) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((AnimatedContentScope) obj).getClass();
                navBackStackEntry.getClass();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-562124760, iIntValue2, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:624)");
                }
                Bundle arguments = navBackStackEntry.getArguments();
                if (arguments != null && (string = arguments.getString("serverId")) != null) {
                    boolean zChangedInstance3 = composer2.changedInstance(context2);
                    MutableState mutableState2 = this.c;
                    boolean zChanged2 = composer2.changed(mutableState2) | zChangedInstance3 | composer2.changedInstance(serverPreferences2) | composer2.changedInstance(userPreferences2) | composer2.changedInstance(navHostController4);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        navHostController2 = navHostController4;
                        z21 z21Var2 = new z21(3, context2, mutableState2, navHostController2, serverPreferences2, userPreferences2);
                        composer2.updateRememberedValue(z21Var2);
                        objRememberedValue3 = z21Var2;
                    } else {
                        navHostController2 = navHostController4;
                    }
                    Function1 function2 = (Function1) objRememberedValue3;
                    boolean zChangedInstance4 = composer2.changedInstance(navHostController2);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new q21(navHostController2, 8);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    p2.a(string, function2, (Function0) objRememberedValue4, null, composer2, 0, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 2:
                final NavHostController navHostController5 = (NavHostController) obj5;
                final ServerPreferences serverPreferences3 = (ServerPreferences) obj7;
                final Context context3 = (Context) obj8;
                final UserPreferences userPreferences3 = (UserPreferences) obj6;
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj2;
                Composer composer3 = (Composer) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((AnimatedContentScope) obj).getClass();
                navBackStackEntry2.getClass();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1473261869, iIntValue3, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:702)");
                }
                Bundle arguments2 = navBackStackEntry2.getArguments();
                if (arguments2 != null && (string2 = arguments2.getString("libraryId")) != null) {
                    final String str = (String) navBackStackEntry2.getSavedStateHandle().get("libraryRestoreServerId");
                    final boolean zAreEqual = Intrinsics.areEqual(navBackStackEntry2.getSavedStateHandle().get("libraryShouldRestoreServer"), Boolean.TRUE);
                    boolean zChangedInstance5 = composer3.changedInstance(navHostController5);
                    Object objRememberedValue5 = composer3.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new m21(navHostController5, 6);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    Function1 function3 = (Function1) objRememberedValue5;
                    boolean zChangedInstance6 = composer3.changedInstance(navHostController5);
                    Object objRememberedValue6 = composer3.rememberedValue();
                    if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new m21(navHostController5, 7);
                        composer3.updateRememberedValue(objRememberedValue6);
                    }
                    Function1 function4 = (Function1) objRememberedValue6;
                    boolean zChangedInstance7 = composer3.changedInstance(navHostController5);
                    Object objRememberedValue7 = composer3.rememberedValue();
                    if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new m21(navHostController5, 8);
                        composer3.updateRememberedValue(objRememberedValue7);
                    }
                    Function1 function5 = (Function1) objRememberedValue7;
                    boolean zChanged3 = composer3.changed(zAreEqual) | composer3.changed(str) | composer3.changedInstance(serverPreferences3) | composer3.changedInstance(context3);
                    final MutableState mutableState3 = this.c;
                    boolean zChanged4 = composer3.changed(mutableState3) | zChanged3 | composer3.changedInstance(userPreferences3) | composer3.changedInstance(navHostController5);
                    Object objRememberedValue8 = composer3.rememberedValue();
                    if (zChanged4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        Function0 function0 = new Function0() { // from class: a31
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (zAreEqual) {
                                    String str2 = str;
                                    MutableState mutableState4 = mutableState3;
                                    if (str2 != null) {
                                        e31.f(serverPreferences3, context3, userPreferences3, mutableState4, str2, false);
                                    } else {
                                        mutableState4.setValue(null);
                                    }
                                }
                                navHostController5.popBackStack();
                                return Unit.INSTANCE;
                            }
                        };
                        composer3.updateRememberedValue(function0);
                        objRememberedValue8 = function0;
                    }
                    gy0.b(string2, function3, function4, function5, (Function0) objRememberedValue8, null, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 3:
                UserPreferences userPreferences4 = (UserPreferences) obj6;
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                e31.d((NavHostController) obj5, this.c, (ServerPreferences) obj7, (Context) obj8, userPreferences4, str2, str3, (String) obj3, (String) obj4, true);
                break;
            default:
                List list = (List) obj8;
                String str4 = (String) obj7;
                List list2 = (List) obj6;
                Function1 function6 = (Function1) obj5;
                int iIntValue4 = ((Integer) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((LazyItemScope) obj).getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= composer4.changed(iIntValue4) ? 32 : 16;
                }
                if (composer4.shouldExecute((iIntValue5 & Input.Keys.NUMPAD_1) != 144, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(744178952, iIntValue5, -1, "com.dh.myembyapp.ui.screens.player.components.DecoderSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DecoderSelectionOverlay.kt:156)");
                    }
                    Pair pair = (Pair) list.get(iIntValue4);
                    String str5 = (String) pair.component1();
                    String str6 = (String) pair.component2();
                    boolean zAreEqual2 = Intrinsics.areEqual(str5, str4);
                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (FocusRequester) list2.get(iIntValue4));
                    boolean z = (iIntValue5 & Input.Keys.FORWARD_DEL) == 32;
                    Object objRememberedValue9 = composer4.rememberedValue();
                    MutableState mutableState4 = this.c;
                    if (z || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new h20(iIntValue4, mutableState4, 0);
                        composer4.updateRememberedValue(objRememberedValue9);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue9);
                    ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                    RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f));
                    int i2 = ClickableSurfaceDefaults.$stable;
                    int i3 = i2 << 15;
                    ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composer4, i3, 30);
                    long jM5151copywmQWz5c$default = m20.b(mutableState4) == iIntValue4 ? Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m5187getTransparent0d7_KjU();
                    Color.Companion companion = Color.INSTANCE;
                    ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(jM5151copywmQWz5c$default, 0L, Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, composer4, (i2 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                    ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), 0.0f, null, 6, null), null, null, null, composer4, i3 | 48, 29);
                    ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.05f, 0.0f, 0.0f, 0.0f, 29, null);
                    boolean zChanged5 = composer4.changed(function6) | composer4.changed(str5);
                    Object objRememberedValue10 = composer4.rememberedValue();
                    if (zChanged5 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new y7(1, str5, function6);
                        composer4.updateRememberedValue(objRememberedValue10);
                    }
                    SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue10, modifierOnFocusChanged, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorderBorder, null, null, ComposableLambdaKt.rememberComposableLambda(-1342531417, true, new i20(0, str6, zAreEqual2), composer4, 54), composer4, 0, 48, 1564);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ w21(int i, Context context, MutableState mutableState, NavHostController navHostController, ServerPreferences serverPreferences, UserPreferences userPreferences) {
        this.a = i;
        this.b = context;
        this.c = mutableState;
        this.d = serverPreferences;
        this.e = userPreferences;
        this.g = navHostController;
    }

    public /* synthetic */ w21(NavHostController navHostController, ServerPreferences serverPreferences, Context context, MutableState mutableState, UserPreferences userPreferences) {
        this.a = 2;
        this.g = navHostController;
        this.d = serverPreferences;
        this.b = context;
        this.c = mutableState;
        this.e = userPreferences;
    }

    public /* synthetic */ w21(List list, String str, List list2, Function1 function1, MutableState mutableState) {
        this.a = 4;
        this.b = list;
        this.d = str;
        this.e = list2;
        this.g = function1;
        this.c = mutableState;
    }
}
