package defpackage;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.d;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.Dp;
import androidx.core.text.util.LocalePreferences;
import androidx.media3.exoplayer.RendererCapabilities;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mn0 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ mn0(re reVar, FocusRequester focusRequester, boolean z, Function1 function1, String str) {
        this.c = reVar;
        this.e = focusRequester;
        this.b = z;
        this.g = function1;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                List list = (List) obj5;
                Function1 function1 = (Function1) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                vi0 vi0Var = new vi0(14);
                int size = list.size();
                w5 w5Var = new w5(21, vi0Var, list);
                x5 x5Var = new x5(list, 21);
                boolean z = this.b;
                lazyListScope.items(size, w5Var, x5Var, ComposableLambdaKt.composableLambdaInstance(802480018, true, new pn0(list, z, (String) obj4, (FocusRequester) obj3, function1)));
                return Unit.INSTANCE;
            case 1:
                return MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$5$lambda$4(this.b, (MutableTransitionState) obj5, (MutableState) obj4, (State) obj3, (State) obj2, (GraphicsLayerScope) obj);
            case 2:
                return NavControllerImpl.executePopOperations$lambda$10((Ref.BooleanRef) obj5, (Ref.BooleanRef) obj4, (NavControllerImpl) obj3, this.b, (ArrayDeque) obj2, (NavBackStackEntry) obj);
            case 3:
                final re reVar = (re) obj5;
                final FocusRequester focusRequester = (FocusRequester) obj3;
                final Function1 function2 = (Function1) obj2;
                final String str = (String) obj4;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                int size2 = reVar.b.size();
                mc0 mc0Var = new mc0(reVar, 24);
                final boolean z2 = this.b;
                d.b(lazyListScope2, size2, mc0Var, null, ComposableLambdaKt.composableLambdaInstance(-1567315732, true, new Function4() { // from class: ja1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        List list2;
                        long jM5189getWhite0d7_KjU;
                        int i2;
                        Object obj10;
                        float f;
                        int iIntValue = ((Integer) obj7).intValue();
                        Composer composer = (Composer) obj8;
                        int iIntValue2 = ((Integer) obj9).intValue();
                        ((LazyItemScope) obj6).getClass();
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((iIntValue2 & Input.Keys.NUMPAD_1) != 144, iIntValue2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1567315732, iIntValue2, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleFilePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnlineSubtitleSearchDialog.kt:783)");
                            }
                            re reVar2 = reVar;
                            ArrayList arrayList = reVar2.b;
                            qe qeVar = reVar2.a;
                            se seVar = (se) arrayList.get(iIntValue);
                            String str2 = seVar.a;
                            boolean zChanged = composer.changed(qeVar.f) | composer.changed(str2);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                String[] strArr = {str2, qeVar.f};
                                ArrayList arrayList2 = new ArrayList();
                                for (int i3 = 0; i3 < 2; i3++) {
                                    String str3 = strArr[i3];
                                    if (!StringsKt.isBlank(str3)) {
                                        arrayList2.add(str3);
                                    }
                                }
                                String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList2, " | ", null, null, 0, null, null, 62, null);
                                if (StringsKt.isBlank(strJoinToString$default)) {
                                    list2 = CollectionsKt.emptyList();
                                } else {
                                    String lowerCase = strJoinToString$default.toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(lowerCase, '_', ' ', false, 4, (Object) null), '-', ' ', false, 4, (Object) null), '.', ' ', false, 4, (Object) null), '[', ' ', false, 4, (Object) null), ']', ' ', false, 4, (Object) null), '(', ' ', false, 4, (Object) null), ')', ' ', false, 4, (Object) null);
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    boolean zF = ra1.f(strJoinToString$default, strReplace$default, "简体", "简中", "chs", "sc", "gb", "gbk", "zh cn", "zhcn", "cn");
                                    boolean zF2 = ra1.f(strJoinToString$default, strReplace$default, "繁体", "繁中", "cht", "tc", "big5", "zh tw", "zhtw", "zh hk", "zhhk");
                                    boolean zF3 = ra1.f(strJoinToString$default, strReplace$default, "中文", "华语", "国语", LocalePreferences.CalendarType.CHINESE, "mandarin", "chi", "zho", "zh");
                                    boolean zF4 = ra1.f(strJoinToString$default, strReplace$default, "英文", "英语", "eng", "english");
                                    boolean zF5 = ra1.f(strJoinToString$default, strReplace$default, "日文", "日语", "jpn", "japanese", "jp");
                                    boolean zF6 = ra1.f(strJoinToString$default, strReplace$default, "韩文", "韩语", "kor", "korean", "kr");
                                    boolean z3 = ra1.f(strJoinToString$default, strReplace$default, "双语", "中英", "英中", "简英", "繁英", "bilingual", "chs eng", "cht eng", "chi eng") || ((zF3 || zF || zF2) && zF4);
                                    if (zF) {
                                        linkedHashSet.add("简中");
                                    } else if (zF2) {
                                        linkedHashSet.add("繁中");
                                    } else if (zF3) {
                                        linkedHashSet.add("中文");
                                    }
                                    if (z3) {
                                        linkedHashSet.add("双语");
                                    }
                                    if (zF4 && !z3) {
                                        linkedHashSet.add("英文");
                                    }
                                    if (zF5) {
                                        linkedHashSet.add("日文");
                                    }
                                    if (zF6) {
                                        linkedHashSet.add("韩文");
                                    }
                                    list2 = CollectionsKt.toList(linkedHashSet);
                                }
                                objRememberedValue = list2;
                                composer.updateRememberedValue(objRememberedValue);
                            } else {
                                iIntValue = iIntValue;
                                seVar = seVar;
                            }
                            List list3 = (List) objRememberedValue;
                            boolean zChanged2 = composer.changed(str2);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            MutableState mutableState = (MutableState) objRememberedValue2;
                            Modifier modifierFocusRequester = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null);
                            if (iIntValue == 0) {
                                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester);
                            }
                            Modifier modifierThen = modifierFillMaxWidth$default.then(modifierFocusRequester);
                            boolean zChanged3 = composer.changed(mutableState);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new p21(11, mutableState);
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierThen, (Function1) objRememberedValue3);
                            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                            if (((Boolean) mutableState.getValue()).booleanValue()) {
                                jM5189getWhite0d7_KjU = Color.INSTANCE.m5189getWhite0d7_KjU();
                                i2 = 14;
                                obj10 = null;
                                f = 0.15f;
                            } else {
                                jM5189getWhite0d7_KjU = Color.INSTANCE.m5189getWhite0d7_KjU();
                                i2 = 14;
                                obj10 = null;
                                f = 0.06f;
                            }
                            long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(jM5189getWhite0d7_KjU, f, 0.0f, 0.0f, 0.0f, i2, obj10);
                            Color.Companion companion = Color.INSTANCE;
                            long jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                            int i4 = ClickableSurfaceDefaults.$stable;
                            se seVar2 = seVar;
                            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(jM5151copywmQWz5c$default, 0L, jM5151copywmQWz5c$default2, 0L, 0L, 0L, 0L, 0L, composer, (i4 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                            int i5 = i4 << 15;
                            ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composer, i5 | 48, 29);
                            ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f)), null, null, null, null, composer, i5, 30);
                            ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.01f, 0.0f, 0.0f, 0.0f, 29, null);
                            boolean z4 = z2;
                            boolean zChanged4 = composer.changed(z4);
                            Function1 function3 = function2;
                            boolean zChanged5 = zChanged4 | composer.changed(function3) | composer.changed(seVar2);
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (zChanged5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new a60(z4, function3, seVar2, 5);
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue4, modifierOnFocusChanged, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorderBorder, null, null, ComposableLambdaKt.rememberComposableLambda(-1737841589, true, new dz0(seVar2, str, z4, mutableState, list3), composer, 54), composer, 0, 48, 1564);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }), 4, null);
                return Unit.INSTANCE;
            default:
                return TextFieldSelectionState.detectSelectionHandleDragGestures$lambda$0((Ref.LongRef) obj5, (TextFieldSelectionState) obj4, this.b, (Handle) obj3, (Ref.LongRef) obj2, (Offset) obj);
        }
    }

    public /* synthetic */ mn0(List list, boolean z, String str, FocusRequester focusRequester, Function1 function1) {
        this.c = list;
        this.b = z;
        this.d = str;
        this.e = focusRequester;
        this.g = function1;
    }

    public /* synthetic */ mn0(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, NavControllerImpl navControllerImpl, boolean z, ArrayDeque arrayDeque) {
        this.c = booleanRef;
        this.d = booleanRef2;
        this.e = navControllerImpl;
        this.b = z;
        this.g = arrayDeque;
    }

    public /* synthetic */ mn0(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, boolean z, Handle handle, Ref.LongRef longRef2) {
        this.c = longRef;
        this.d = textFieldSelectionState;
        this.b = z;
        this.e = handle;
        this.g = longRef2;
    }

    public /* synthetic */ mn0(boolean z, MutableTransitionState mutableTransitionState, MutableState mutableState, State state, State state2) {
        this.b = z;
        this.c = mutableTransitionState;
        this.d = mutableState;
        this.e = state;
        this.g = state2;
    }
}
