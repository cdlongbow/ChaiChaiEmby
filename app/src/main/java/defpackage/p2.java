package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.d;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.server.ConfigServerManager;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.SnapshotMutationPolicy, java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(String str, Function1 function1, final Function0 function0, w2 w2Var, Composer composer, int i, int i2) {
        String str2;
        int i3;
        String str3;
        w2 w2Var2;
        Object r3;
        int i4;
        int i5;
        w2 w2Var3;
        int i6;
        long secondaryContainer;
        long onSecondaryContainer;
        int i7;
        int i8;
        SnapshotMutationPolicy snapshotMutationPolicy;
        LazyListState lazyListState;
        Context context;
        ConfigServerManager configServerManager;
        CoroutineScope coroutineScope;
        MutableState mutableState;
        MutableState mutableState2;
        final String str4;
        final w2 w2Var4;
        final State state;
        MutableState mutableState3;
        int i9;
        Object r5;
        String str5;
        MutableState mutableState4;
        MutableState mutableState5;
        function1.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1223605474);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 6) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i10 != 0) {
                    str2 = null;
                }
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                CreationExtras defaultViewModelCreationExtras = current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                int i11 = i3;
                r3 = 0;
                i4 = 0;
                i5 = 6;
                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(w2.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                w2Var3 = (w2) viewModel;
                i6 = i11 & (-7169);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                int i12 = i3 & (-7169);
                w2Var3 = w2Var;
                i6 = i12;
                i5 = 6;
                i4 = 0;
                r3 = 0;
            }
            String str6 = str2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1223605474, i6, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen (AddServerScreen.kt:139)");
            }
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, i5, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            final u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i13 = MaterialTheme.$stable;
            int i14 = ColorKt.m5204luminance8_81llA(materialTheme.getColorScheme(composerStartRestartGroup, i13).getBackground()) > 0.5f ? 1 : i4;
            long surface = materialTheme.getColorScheme(composerStartRestartGroup, i13).getSurface();
            if (i14 != 0) {
                composerStartRestartGroup.startReplaceGroup(1043673341);
                composerStartRestartGroup.endReplaceGroup();
                secondaryContainer = surface;
            } else {
                composerStartRestartGroup.startReplaceGroup(1043714788);
                secondaryContainer = materialTheme.getColorScheme(composerStartRestartGroup, i13).getSecondaryContainer();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (i14 != 0) {
                onSecondaryContainer = kb0.u(composerStartRestartGroup, 1043822637, materialTheme, composerStartRestartGroup, i13);
            } else {
                composerStartRestartGroup.startReplaceGroup(1043879522);
                onSecondaryContainer = materialTheme.getColorScheme(composerStartRestartGroup, i13).getOnSecondaryContainer();
                composerStartRestartGroup.endReplaceGroup();
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(w2Var3.d, r3, composerStartRestartGroup, i4, 1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("http", r3, 2, r3);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue = mutableStateMutableStateOf$default;
                i7 = 2;
            } else {
                i7 = 2;
            }
            final MutableState mutableState6 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("192.168.1.1", r3, i7, r3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState7 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("8096", r3, i7, r3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState8 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", r3, i7, r3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final MutableState mutableState9 = (MutableState) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("admin", r3, i7, r3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final MutableState mutableState10 = (MutableState) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", r3, i7, r3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final MutableState mutableState11 = (MutableState) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("我的Emby服务器", r3, i7, r3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState12 = (MutableState) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", r3, i7, r3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            final MutableState mutableState13 = (MutableState) objRememberedValue8;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, r3, i7, r3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            final MutableState mutableState14 = (MutableState) objRememberedValue9;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, r3, i7, r3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            final MutableState mutableState15 = (MutableState) objRememberedValue10;
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, r3, i7, r3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            final MutableState mutableState16 = (MutableState) objRememberedValue11;
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, r3, i7, r3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            MutableState mutableState17 = (MutableState) objRememberedValue12;
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, r3, 2, r3);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
                objRememberedValue13 = mutableStateMutableStateOf$default2;
            }
            MutableState mutableState18 = (MutableState) objRememberedValue13;
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue14 == companion.getEmpty()) {
                i8 = 2;
                objRememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", r3, 2, r3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            } else {
                i8 = 2;
            }
            MutableState mutableState19 = (MutableState) objRememberedValue14;
            boolean z = str6 != null;
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue15 == companion.getEmpty()) {
                snapshotMutationPolicy = null;
                objRememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i8, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            } else {
                snapshotMutationPolicy = null;
            }
            MutableState mutableState20 = (MutableState) objRememberedValue15;
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            final boolean z2 = z;
            if (objRememberedValue16 == companion.getEmpty()) {
                objRememberedValue16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i8, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            }
            MutableState mutableState21 = (MutableState) objRememberedValue16;
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue17 == companion.getEmpty()) {
                objRememberedValue17 = new ConfigServerManager(context2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            }
            ConfigServerManager configServerManager2 = (ConfigServerManager) objRememberedValue17;
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue18 == companion.getEmpty()) {
                objRememberedValue18 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue18;
            Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue19 == companion.getEmpty()) {
                objRememberedValue19 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester2 = (FocusRequester) objRememberedValue19;
            Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue20 == companion.getEmpty()) {
                objRememberedValue20 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester3 = (FocusRequester) objRememberedValue20;
            Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue21 == companion.getEmpty()) {
                objRememberedValue21 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester4 = (FocusRequester) objRememberedValue21;
            Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue22 == companion.getEmpty()) {
                objRememberedValue22 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester5 = (FocusRequester) objRememberedValue22;
            Object objRememberedValue23 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue23 == companion.getEmpty()) {
                objRememberedValue23 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester6 = (FocusRequester) objRememberedValue23;
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Object objRememberedValue24 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue24 == companion.getEmpty()) {
                objRememberedValue24 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue24;
            Object objRememberedValue25 = composerStartRestartGroup.rememberedValue();
            int i15 = i6;
            if (objRememberedValue25 == companion.getEmpty()) {
                objRememberedValue25 = new lz0(context2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue25);
            }
            lz0 lz0Var = (lz0) objRememberedValue25;
            Unit unit = Unit.INSTANCE;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(w2Var3) | composerStartRestartGroup.changedInstance(context2) | ((i15 & 14) == 4) | composerStartRestartGroup.changedInstance(configServerManager2) | composerStartRestartGroup.changedInstance(coroutineScope2) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue26 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue26 == companion.getEmpty()) {
                lazyListState = lazyListStateRememberLazyListState;
                w2 w2Var5 = w2Var3;
                objRememberedValue26 = new l2(w2Var5, context2, str6, configServerManager2, coroutineScope2, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, mutableState11, mutableState12, mutableState13, mutableState14, mutableState15, mutableState16, lazyListState, focusRequester6, mutableState21, mutableState20, null);
                context = context2;
                configServerManager = configServerManager2;
                coroutineScope = coroutineScope2;
                mutableState = mutableState12;
                mutableState2 = mutableState21;
                str4 = str6;
                mutableState7 = mutableState7;
                mutableState11 = mutableState11;
                mutableState6 = mutableState6;
                w2Var4 = w2Var5;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue26);
            } else {
                lazyListState = lazyListStateRememberLazyListState;
                coroutineScope = coroutineScope2;
                w2Var4 = w2Var3;
                str4 = str6;
                mutableState2 = mutableState21;
                context = context2;
                configServerManager = configServerManager2;
                mutableState = mutableState12;
            }
            final Context context3 = context;
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue26, composerStartRestartGroup, 6);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(configServerManager);
            Object objRememberedValue27 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue27 == companion.getEmpty()) {
                objRememberedValue27 = new c(configServerManager, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue27);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue27, composerStartRestartGroup, 6);
            u2 u2Var = (u2) stateCollectAsState.getValue();
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState) | ((i15 & Input.Keys.FORWARD_DEL) == 32);
            Object objRememberedValue28 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue28 == companion.getEmpty()) {
                m2 m2Var = new m2(function1, stateCollectAsState, mutableState19, mutableState18, null, 0);
                state = stateCollectAsState;
                mutableState3 = mutableState18;
                composerStartRestartGroup.updateRememberedValue(m2Var);
                objRememberedValue28 = m2Var;
            } else {
                state = stateCollectAsState;
                mutableState3 = mutableState18;
            }
            EffectsKt.LaunchedEffect(u2Var, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue28, composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Dp.m7813constructorimpl(48.0f));
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i16 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM999padding3ABfNKs);
            final MutableState mutableState22 = mutableState;
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion4, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i16), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(32.0f)), companion3.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i17 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion4, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i17), composerM4318constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (((Bitmap) mutableState20.getValue()) != null) {
                composerStartRestartGroup.startReplaceGroup(610469380);
                Composer composer2 = composerStartRestartGroup;
                r5 = 1;
                i9 = 54;
                composerStartRestartGroup = composer2;
                CardKt.Card(SizeKt.fillMaxHeight$default(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(350.0f)), 0.0f, 1, null), null, CardDefaults.INSTANCE.m2119cardColorsro_MJ88(secondaryContainer, 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-2130471093, true, new d2(onSecondaryContainer, mutableState20, mutableState2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 26);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i9 = 54;
                r5 = 1;
                composerStartRestartGroup.startReplaceGroup(612689290);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(zs1.E(rowScopeInstance, companion2, 1.0f, false, 2, null), 0.0f, r5, null);
            Composer composer3 = composerStartRestartGroup;
            CardColors cardColorsM2119cardColorsro_MJ88 = CardDefaults.INSTANCE.m2119cardColorsro_MJ88(surface, 0L, 0L, 0L, composer3, CardDefaults.$stable << 12, 14);
            composerStartRestartGroup = composer3;
            final LazyListState lazyListState2 = lazyListState;
            Function3 function3 = new Function3() { // from class: e2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer4 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ColumnScope) obj).getClass();
                    if (composer4.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(915676806, iIntValue, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:382)");
                        }
                        Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f));
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f));
                        final boolean z3 = z2;
                        boolean zChanged2 = composer4.changed(z3);
                        final u61 u61Var2 = u61Var;
                        boolean zChanged3 = zChanged2 | composer4.changed(u61Var2);
                        final Function0 function2 = function0;
                        boolean zChanged4 = zChanged3 | composer4.changed(function2);
                        final State state2 = state;
                        boolean zChanged5 = zChanged4 | composer4.changed(state2);
                        final Context context4 = context3;
                        boolean zChangedInstance3 = zChanged5 | composer4.changedInstance(context4);
                        final String str7 = str4;
                        boolean zChanged6 = zChangedInstance3 | composer4.changed(str7);
                        final w2 w2Var6 = w2Var4;
                        boolean zChangedInstance4 = zChanged6 | composer4.changedInstance(w2Var6);
                        Object objRememberedValue29 = composer4.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue29 == Composer.INSTANCE.getEmpty()) {
                            final FocusRequester focusRequester7 = focusRequester;
                            final MutableState mutableState23 = mutableState22;
                            final MutableState mutableState24 = mutableState13;
                            final FocusRequester focusRequester8 = focusRequester2;
                            final MutableState mutableState25 = mutableState6;
                            final MutableState mutableState26 = mutableState7;
                            final MutableState mutableState27 = mutableState8;
                            final FocusRequester focusRequester9 = focusRequester3;
                            final MutableState mutableState28 = mutableState9;
                            final FocusRequester focusRequester10 = focusRequester4;
                            final MutableState mutableState29 = mutableState10;
                            final FocusRequester focusRequester11 = focusRequester5;
                            final MutableState mutableState30 = mutableState11;
                            final MutableState mutableState31 = mutableState14;
                            final MutableState mutableState32 = mutableState15;
                            final MutableState mutableState33 = mutableState16;
                            final FocusRequester focusRequester12 = focusRequester6;
                            Function1 function4 = new Function1() { // from class: s1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    LazyListScope lazyListScope = (LazyListScope) obj4;
                                    lazyListScope.getClass();
                                    final int i18 = 0;
                                    final int i19 = 1;
                                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1871802193, true, new g2(z3, i18)), 3, null);
                                    final int i20 = 3;
                                    final FocusRequester focusRequester13 = focusRequester7;
                                    final MutableState mutableState34 = mutableState23;
                                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-2125930246, true, new Function3() { // from class: o1
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            int i21 = i20;
                                            MutableState mutableState35 = mutableState34;
                                            FocusRequester focusRequester14 = focusRequester13;
                                            switch (i21) {
                                                case 0:
                                                    Composer composer5 = (Composer) obj6;
                                                    int iIntValue2 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer5.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(2136440663, iIntValue2, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:496)");
                                                        }
                                                        String str8 = (String) mutableState35.getValue();
                                                        Object objRememberedValue30 = composer5.rememberedValue();
                                                        if (objRememberedValue30 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue30 = new t1(1, mutableState35);
                                                            composer5.updateRememberedValue(objRememberedValue30);
                                                        }
                                                        p2.b(str8, (Function1) objRememberedValue30, "端口", "8096", FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester14), null, null, composer5, 3504, 224);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer5.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    Composer composer6 = (Composer) obj6;
                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer6.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(683053973, iIntValue3, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:520)");
                                                        }
                                                        String str9 = (String) mutableState35.getValue();
                                                        Object objRememberedValue31 = composer6.rememberedValue();
                                                        if (objRememberedValue31 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue31 = new t1(2, mutableState35);
                                                            composer6.updateRememberedValue(objRememberedValue31);
                                                        }
                                                        p2.b(str9, (Function1) objRememberedValue31, "用户名", "Emby 账号用户名", FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester14), null, null, composer6, 3504, 224);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer6.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 2:
                                                    Composer composer7 = (Composer) obj6;
                                                    int iIntValue4 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer7.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(2103844276, iIntValue4, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:533)");
                                                        }
                                                        String str10 = (String) mutableState35.getValue();
                                                        Object objRememberedValue32 = composer7.rememberedValue();
                                                        if (objRememberedValue32 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue32 = new t1(4, mutableState35);
                                                            composer7.updateRememberedValue(objRememberedValue32);
                                                        }
                                                        p2.b(str10, (Function1) objRememberedValue32, "密码", "Emby 账号密码", FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester14), new PasswordVisualTransformation((char) 0, 1, null), null, composer7, 3504, Input.Keys.NUMPAD_ENTER);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer7.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer8 = (Composer) obj6;
                                                    int iIntValue5 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer8.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-2125930246, iIntValue5, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:400)");
                                                        }
                                                        String str11 = (String) mutableState35.getValue();
                                                        Object objRememberedValue33 = composer8.rememberedValue();
                                                        if (objRememberedValue33 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue33 = new t1(0, mutableState35);
                                                            composer8.updateRememberedValue(objRememberedValue33);
                                                        }
                                                        p2.b(str11, (Function1) objRememberedValue33, "服务器别名", "给服务器起个名字，方便识别", FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester14), null, null, composer8, 3504, 224);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer8.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 3, null);
                                    MutableState mutableState35 = mutableState24;
                                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-705139943, true, new p1(4, mutableState35)), 3, null);
                                    FocusRequester focusRequester14 = focusRequester8;
                                    final u61 u61Var3 = u61Var2;
                                    MutableState mutableState36 = mutableState25;
                                    MutableState mutableState37 = mutableState26;
                                    final MutableState mutableState38 = mutableState27;
                                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(715650360, true, new n1(focusRequester14, u61Var3, mutableState36, mutableState37, mutableState38, 0)), 3, null);
                                    final FocusRequester focusRequester15 = focusRequester9;
                                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(2136440663, true, new Function3() { // from class: o1
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            int i21 = i18;
                                            MutableState mutableState39 = mutableState38;
                                            FocusRequester focusRequester16 = focusRequester15;
                                            switch (i21) {
                                                case 0:
                                                    Composer composer5 = (Composer) obj6;
                                                    int iIntValue2 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer5.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(2136440663, iIntValue2, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:496)");
                                                        }
                                                        String str8 = (String) mutableState39.getValue();
                                                        Object objRememberedValue30 = composer5.rememberedValue();
                                                        if (objRememberedValue30 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue30 = new t1(1, mutableState39);
                                                            composer5.updateRememberedValue(objRememberedValue30);
                                                        }
                                                        p2.b(str8, (Function1) objRememberedValue30, "端口", "8096", FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester16), null, null, composer5, 3504, 224);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer5.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    Composer composer6 = (Composer) obj6;
                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer6.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(683053973, iIntValue3, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:520)");
                                                        }
                                                        String str9 = (String) mutableState39.getValue();
                                                        Object objRememberedValue31 = composer6.rememberedValue();
                                                        if (objRememberedValue31 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue31 = new t1(2, mutableState39);
                                                            composer6.updateRememberedValue(objRememberedValue31);
                                                        }
                                                        p2.b(str9, (Function1) objRememberedValue31, "用户名", "Emby 账号用户名", FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester16), null, null, composer6, 3504, 224);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer6.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 2:
                                                    Composer composer7 = (Composer) obj6;
                                                    int iIntValue4 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer7.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(2103844276, iIntValue4, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:533)");
                                                        }
                                                        String str10 = (String) mutableState39.getValue();
                                                        Object objRememberedValue32 = composer7.rememberedValue();
                                                        if (objRememberedValue32 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue32 = new t1(4, mutableState39);
                                                            composer7.updateRememberedValue(objRememberedValue32);
                                                        }
                                                        p2.b(str10, (Function1) objRememberedValue32, "密码", "Emby 账号密码", FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester16), new PasswordVisualTransformation((char) 0, 1, null), null, composer7, 3504, Input.Keys.NUMPAD_ENTER);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer7.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer8 = (Composer) obj6;
                                                    int iIntValue5 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer8.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-2125930246, iIntValue5, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:400)");
                                                        }
                                                        String str11 = (String) mutableState39.getValue();
                                                        Object objRememberedValue33 = composer8.rememberedValue();
                                                        if (objRememberedValue33 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue33 = new t1(0, mutableState39);
                                                            composer8.updateRememberedValue(objRememberedValue33);
                                                        }
                                                        p2.b(str11, (Function1) objRememberedValue33, "服务器别名", "给服务器起个名字，方便识别", FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester16), null, null, composer8, 3504, 224);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer8.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 3, null);
                                    MutableState mutableState39 = mutableState28;
                                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-737736330, true, new p1(0, mutableState39)), 3, null);
                                    final FocusRequester focusRequester16 = focusRequester10;
                                    final MutableState mutableState40 = mutableState29;
                                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(683053973, true, new Function3() { // from class: o1
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            int i21 = i19;
                                            MutableState mutableState310 = mutableState40;
                                            FocusRequester focusRequester17 = focusRequester16;
                                            switch (i21) {
                                                case 0:
                                                    Composer composer5 = (Composer) obj6;
                                                    int iIntValue2 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer5.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(2136440663, iIntValue2, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:496)");
                                                        }
                                                        String str8 = (String) mutableState310.getValue();
                                                        Object objRememberedValue30 = composer5.rememberedValue();
                                                        if (objRememberedValue30 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue30 = new t1(1, mutableState310);
                                                            composer5.updateRememberedValue(objRememberedValue30);
                                                        }
                                                        p2.b(str8, (Function1) objRememberedValue30, "端口", "8096", FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester17), null, null, composer5, 3504, 224);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer5.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    Composer composer6 = (Composer) obj6;
                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer6.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(683053973, iIntValue3, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:520)");
                                                        }
                                                        String str9 = (String) mutableState310.getValue();
                                                        Object objRememberedValue31 = composer6.rememberedValue();
                                                        if (objRememberedValue31 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue31 = new t1(2, mutableState310);
                                                            composer6.updateRememberedValue(objRememberedValue31);
                                                        }
                                                        p2.b(str9, (Function1) objRememberedValue31, "用户名", "Emby 账号用户名", FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester17), null, null, composer6, 3504, 224);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer6.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 2:
                                                    Composer composer7 = (Composer) obj6;
                                                    int iIntValue4 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer7.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(2103844276, iIntValue4, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:533)");
                                                        }
                                                        String str10 = (String) mutableState310.getValue();
                                                        Object objRememberedValue32 = composer7.rememberedValue();
                                                        if (objRememberedValue32 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue32 = new t1(4, mutableState310);
                                                            composer7.updateRememberedValue(objRememberedValue32);
                                                        }
                                                        p2.b(str10, (Function1) objRememberedValue32, "密码", "Emby 账号密码", FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester17), new PasswordVisualTransformation((char) 0, 1, null), null, composer7, 3504, Input.Keys.NUMPAD_ENTER);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer7.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer8 = (Composer) obj6;
                                                    int iIntValue5 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer8.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-2125930246, iIntValue5, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:400)");
                                                        }
                                                        String str11 = (String) mutableState310.getValue();
                                                        Object objRememberedValue33 = composer8.rememberedValue();
                                                        if (objRememberedValue33 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue33 = new t1(0, mutableState310);
                                                            composer8.updateRememberedValue(objRememberedValue33);
                                                        }
                                                        p2.b(str11, (Function1) objRememberedValue33, "服务器别名", "给服务器起个名字，方便识别", FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester17), null, null, composer8, 3504, 224);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer8.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 3, null);
                                    final FocusRequester focusRequester17 = focusRequester11;
                                    final MutableState mutableState41 = mutableState30;
                                    final int i21 = 2;
                                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(2103844276, true, new Function3() { // from class: o1
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            int i22 = i21;
                                            MutableState mutableState310 = mutableState41;
                                            FocusRequester focusRequester18 = focusRequester17;
                                            switch (i22) {
                                                case 0:
                                                    Composer composer5 = (Composer) obj6;
                                                    int iIntValue2 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer5.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(2136440663, iIntValue2, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:496)");
                                                        }
                                                        String str8 = (String) mutableState310.getValue();
                                                        Object objRememberedValue30 = composer5.rememberedValue();
                                                        if (objRememberedValue30 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue30 = new t1(1, mutableState310);
                                                            composer5.updateRememberedValue(objRememberedValue30);
                                                        }
                                                        p2.b(str8, (Function1) objRememberedValue30, "端口", "8096", FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester18), null, null, composer5, 3504, 224);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer5.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    Composer composer6 = (Composer) obj6;
                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer6.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(683053973, iIntValue3, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:520)");
                                                        }
                                                        String str9 = (String) mutableState310.getValue();
                                                        Object objRememberedValue31 = composer6.rememberedValue();
                                                        if (objRememberedValue31 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue31 = new t1(2, mutableState310);
                                                            composer6.updateRememberedValue(objRememberedValue31);
                                                        }
                                                        p2.b(str9, (Function1) objRememberedValue31, "用户名", "Emby 账号用户名", FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester18), null, null, composer6, 3504, 224);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer6.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 2:
                                                    Composer composer7 = (Composer) obj6;
                                                    int iIntValue4 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer7.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(2103844276, iIntValue4, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:533)");
                                                        }
                                                        String str10 = (String) mutableState310.getValue();
                                                        Object objRememberedValue32 = composer7.rememberedValue();
                                                        if (objRememberedValue32 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue32 = new t1(4, mutableState310);
                                                            composer7.updateRememberedValue(objRememberedValue32);
                                                        }
                                                        p2.b(str10, (Function1) objRememberedValue32, "密码", "Emby 账号密码", FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester18), new PasswordVisualTransformation((char) 0, 1, null), null, composer7, 3504, Input.Keys.NUMPAD_ENTER);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer7.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer8 = (Composer) obj6;
                                                    int iIntValue5 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer8.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-2125930246, iIntValue5, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:400)");
                                                        }
                                                        String str11 = (String) mutableState310.getValue();
                                                        Object objRememberedValue33 = composer8.rememberedValue();
                                                        if (objRememberedValue33 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue33 = new t1(0, mutableState310);
                                                            composer8.updateRememberedValue(objRememberedValue33);
                                                        }
                                                        p2.b(str11, (Function1) objRememberedValue33, "服务器别名", "给服务器起个名字，方便识别", FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester18), null, null, composer8, 3504, 224);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer8.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 3, null);
                                    final MutableState mutableState42 = mutableState31;
                                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-770332717, true, new Function3() { // from class: q1
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            int i22 = i18;
                                            MutableState mutableState43 = mutableState42;
                                            u61 u61Var4 = u61Var3;
                                            switch (i22) {
                                                case 0:
                                                    Composer composer5 = (Composer) obj6;
                                                    int iIntValue2 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer5.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-770332717, iIntValue2, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:547)");
                                                        }
                                                        Object objRememberedValue30 = composer5.rememberedValue();
                                                        Composer.Companion companion5 = Composer.INSTANCE;
                                                        if (objRememberedValue30 == companion5.getEmpty()) {
                                                            objRememberedValue30 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                                            composer5.updateRememberedValue(objRememberedValue30);
                                                        }
                                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                                                        long j = u61Var4.C;
                                                        long j2 = u61Var4.D;
                                                        int i23 = ClickableSurfaceDefaults.$stable;
                                                        ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j, 0L, j2, 0L, 0L, 0L, 0L, 0L, composer5, i23 << 24, 250);
                                                        int i24 = i23 << 15;
                                                        ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var4.b), 0.0f, null, 6, null), null, null, null, composer5, i24, 29);
                                                        ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
                                                        ClickableSurfaceGlow clickableSurfaceGlowC = el0.c(u61Var4);
                                                        ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f)), null, null, null, null, composer5, i24, 30);
                                                        Object objRememberedValue31 = composer5.rememberedValue();
                                                        if (objRememberedValue31 == companion5.getEmpty()) {
                                                            objRememberedValue31 = new r1(0, mutableState43);
                                                            composer5.updateRememberedValue(objRememberedValue31);
                                                        }
                                                        SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue31, modifierFillMaxWidth$default, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorderBorder, clickableSurfaceGlowC, null, ComposableLambdaKt.rememberComposableLambda(883343218, true, new p1(1, mutableState43), composer5, 54), composer5, 54, 48, 1052);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer5.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    Composer composer6 = (Composer) obj6;
                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer6.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(650457586, iIntValue3, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:589)");
                                                        }
                                                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        ClickableSurfaceDefaults clickableSurfaceDefaults2 = ClickableSurfaceDefaults.INSTANCE;
                                                        long j3 = u61Var4.C;
                                                        long j4 = u61Var4.D;
                                                        int i25 = ClickableSurfaceDefaults.$stable;
                                                        ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We09 = clickableSurfaceDefaults2.m8292colorsoq7We08(j3, 0L, j4, 0L, 0L, 0L, 0L, 0L, composer6, i25 << 24, 250);
                                                        int i26 = i25 << 15;
                                                        ClickableSurfaceBorder clickableSurfaceBorderBorder2 = clickableSurfaceDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var4.b), 0.0f, null, 6, null), null, null, null, composer6, i26, 29);
                                                        ClickableSurfaceScale clickableSurfaceScaleScale$default2 = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults2, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
                                                        ClickableSurfaceGlow clickableSurfaceGlowC2 = el0.c(u61Var4);
                                                        ClickableSurfaceShape clickableSurfaceShapeShape2 = clickableSurfaceDefaults2.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f)), null, null, null, null, composer6, i26, 30);
                                                        Object objRememberedValue32 = composer6.rememberedValue();
                                                        if (objRememberedValue32 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue32 = new r1(2, mutableState43);
                                                            composer6.updateRememberedValue(objRememberedValue32);
                                                        }
                                                        SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue32, modifierFillMaxWidth$default2, null, false, 0.0f, clickableSurfaceShapeShape2, clickableSurfaceColorsM8292colorsoq7We09, clickableSurfaceScaleScale$default2, clickableSurfaceBorderBorder2, clickableSurfaceGlowC2, null, ComposableLambdaKt.rememberComposableLambda(-1990833775, true, new p1(3, mutableState43), composer6, 54), composer6, 54, 48, 1052);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer6.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer7 = (Composer) obj6;
                                                    int iIntValue4 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer7.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1639192584, iIntValue4, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:636)");
                                                        }
                                                        Object objRememberedValue33 = composer7.rememberedValue();
                                                        Composer.Companion companion6 = Composer.INSTANCE;
                                                        if (objRememberedValue33 == companion6.getEmpty()) {
                                                            objRememberedValue33 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                                            composer7.updateRememberedValue(objRememberedValue33);
                                                        }
                                                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        ClickableSurfaceDefaults clickableSurfaceDefaults3 = ClickableSurfaceDefaults.INSTANCE;
                                                        long j5 = u61Var4.C;
                                                        long j6 = u61Var4.D;
                                                        int i27 = ClickableSurfaceDefaults.$stable;
                                                        ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We010 = clickableSurfaceDefaults3.m8292colorsoq7We08(j5, 0L, j6, 0L, 0L, 0L, 0L, 0L, composer7, i27 << 24, 250);
                                                        int i28 = i27 << 15;
                                                        ClickableSurfaceBorder clickableSurfaceBorderBorder3 = clickableSurfaceDefaults3.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var4.b), 0.0f, null, 6, null), null, null, null, composer7, i28, 29);
                                                        ClickableSurfaceScale clickableSurfaceScaleScale$default3 = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults3, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
                                                        ClickableSurfaceGlow clickableSurfaceGlowC3 = el0.c(u61Var4);
                                                        ClickableSurfaceShape clickableSurfaceShapeShape3 = clickableSurfaceDefaults3.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f)), null, null, null, null, composer7, i28, 30);
                                                        Object objRememberedValue34 = composer7.rememberedValue();
                                                        if (objRememberedValue34 == companion6.getEmpty()) {
                                                            objRememberedValue34 = new r1(1, mutableState43);
                                                            composer7.updateRememberedValue(objRememberedValue34);
                                                        }
                                                        SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue34, modifierFillMaxWidth$default3, null, false, 0.0f, clickableSurfaceShapeShape3, clickableSurfaceColorsM8292colorsoq7We010, clickableSurfaceScaleScale$default3, clickableSurfaceBorderBorder3, clickableSurfaceGlowC3, null, ComposableLambdaKt.rememberComposableLambda(-1914846151, true, new p1(2, mutableState43), composer7, 54), composer7, 54, 48, 1052);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer7.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 3, null);
                                    final MutableState mutableState43 = mutableState32;
                                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(650457586, true, new Function3() { // from class: q1
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            int i22 = i19;
                                            MutableState mutableState44 = mutableState43;
                                            u61 u61Var4 = u61Var3;
                                            switch (i22) {
                                                case 0:
                                                    Composer composer5 = (Composer) obj6;
                                                    int iIntValue2 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer5.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-770332717, iIntValue2, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:547)");
                                                        }
                                                        Object objRememberedValue30 = composer5.rememberedValue();
                                                        Composer.Companion companion5 = Composer.INSTANCE;
                                                        if (objRememberedValue30 == companion5.getEmpty()) {
                                                            objRememberedValue30 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                                            composer5.updateRememberedValue(objRememberedValue30);
                                                        }
                                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                                                        long j = u61Var4.C;
                                                        long j2 = u61Var4.D;
                                                        int i23 = ClickableSurfaceDefaults.$stable;
                                                        ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j, 0L, j2, 0L, 0L, 0L, 0L, 0L, composer5, i23 << 24, 250);
                                                        int i24 = i23 << 15;
                                                        ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var4.b), 0.0f, null, 6, null), null, null, null, composer5, i24, 29);
                                                        ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
                                                        ClickableSurfaceGlow clickableSurfaceGlowC = el0.c(u61Var4);
                                                        ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f)), null, null, null, null, composer5, i24, 30);
                                                        Object objRememberedValue31 = composer5.rememberedValue();
                                                        if (objRememberedValue31 == companion5.getEmpty()) {
                                                            objRememberedValue31 = new r1(0, mutableState44);
                                                            composer5.updateRememberedValue(objRememberedValue31);
                                                        }
                                                        SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue31, modifierFillMaxWidth$default, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorderBorder, clickableSurfaceGlowC, null, ComposableLambdaKt.rememberComposableLambda(883343218, true, new p1(1, mutableState44), composer5, 54), composer5, 54, 48, 1052);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer5.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    Composer composer6 = (Composer) obj6;
                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer6.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(650457586, iIntValue3, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:589)");
                                                        }
                                                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        ClickableSurfaceDefaults clickableSurfaceDefaults2 = ClickableSurfaceDefaults.INSTANCE;
                                                        long j3 = u61Var4.C;
                                                        long j4 = u61Var4.D;
                                                        int i25 = ClickableSurfaceDefaults.$stable;
                                                        ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We09 = clickableSurfaceDefaults2.m8292colorsoq7We08(j3, 0L, j4, 0L, 0L, 0L, 0L, 0L, composer6, i25 << 24, 250);
                                                        int i26 = i25 << 15;
                                                        ClickableSurfaceBorder clickableSurfaceBorderBorder2 = clickableSurfaceDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var4.b), 0.0f, null, 6, null), null, null, null, composer6, i26, 29);
                                                        ClickableSurfaceScale clickableSurfaceScaleScale$default2 = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults2, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
                                                        ClickableSurfaceGlow clickableSurfaceGlowC2 = el0.c(u61Var4);
                                                        ClickableSurfaceShape clickableSurfaceShapeShape2 = clickableSurfaceDefaults2.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f)), null, null, null, null, composer6, i26, 30);
                                                        Object objRememberedValue32 = composer6.rememberedValue();
                                                        if (objRememberedValue32 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue32 = new r1(2, mutableState44);
                                                            composer6.updateRememberedValue(objRememberedValue32);
                                                        }
                                                        SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue32, modifierFillMaxWidth$default2, null, false, 0.0f, clickableSurfaceShapeShape2, clickableSurfaceColorsM8292colorsoq7We09, clickableSurfaceScaleScale$default2, clickableSurfaceBorderBorder2, clickableSurfaceGlowC2, null, ComposableLambdaKt.rememberComposableLambda(-1990833775, true, new p1(3, mutableState44), composer6, 54), composer6, 54, 48, 1052);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer6.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer7 = (Composer) obj6;
                                                    int iIntValue4 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer7.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1639192584, iIntValue4, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:636)");
                                                        }
                                                        Object objRememberedValue33 = composer7.rememberedValue();
                                                        Composer.Companion companion6 = Composer.INSTANCE;
                                                        if (objRememberedValue33 == companion6.getEmpty()) {
                                                            objRememberedValue33 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                                            composer7.updateRememberedValue(objRememberedValue33);
                                                        }
                                                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        ClickableSurfaceDefaults clickableSurfaceDefaults3 = ClickableSurfaceDefaults.INSTANCE;
                                                        long j5 = u61Var4.C;
                                                        long j6 = u61Var4.D;
                                                        int i27 = ClickableSurfaceDefaults.$stable;
                                                        ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We010 = clickableSurfaceDefaults3.m8292colorsoq7We08(j5, 0L, j6, 0L, 0L, 0L, 0L, 0L, composer7, i27 << 24, 250);
                                                        int i28 = i27 << 15;
                                                        ClickableSurfaceBorder clickableSurfaceBorderBorder3 = clickableSurfaceDefaults3.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var4.b), 0.0f, null, 6, null), null, null, null, composer7, i28, 29);
                                                        ClickableSurfaceScale clickableSurfaceScaleScale$default3 = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults3, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
                                                        ClickableSurfaceGlow clickableSurfaceGlowC3 = el0.c(u61Var4);
                                                        ClickableSurfaceShape clickableSurfaceShapeShape3 = clickableSurfaceDefaults3.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f)), null, null, null, null, composer7, i28, 30);
                                                        Object objRememberedValue34 = composer7.rememberedValue();
                                                        if (objRememberedValue34 == companion6.getEmpty()) {
                                                            objRememberedValue34 = new r1(1, mutableState44);
                                                            composer7.updateRememberedValue(objRememberedValue34);
                                                        }
                                                        SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue34, modifierFillMaxWidth$default3, null, false, 0.0f, clickableSurfaceShapeShape3, clickableSurfaceColorsM8292colorsoq7We010, clickableSurfaceScaleScale$default3, clickableSurfaceBorderBorder3, clickableSurfaceGlowC3, null, ComposableLambdaKt.rememberComposableLambda(-1914846151, true, new p1(2, mutableState44), composer7, 54), composer7, 54, 48, 1052);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer7.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 3, null);
                                    final MutableState mutableState44 = mutableState33;
                                    final int i22 = 2;
                                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-1639192584, true, new Function3() { // from class: q1
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            int i23 = i22;
                                            MutableState mutableState45 = mutableState44;
                                            u61 u61Var4 = u61Var3;
                                            switch (i23) {
                                                case 0:
                                                    Composer composer5 = (Composer) obj6;
                                                    int iIntValue2 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer5.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-770332717, iIntValue2, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:547)");
                                                        }
                                                        Object objRememberedValue30 = composer5.rememberedValue();
                                                        Composer.Companion companion5 = Composer.INSTANCE;
                                                        if (objRememberedValue30 == companion5.getEmpty()) {
                                                            objRememberedValue30 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                                            composer5.updateRememberedValue(objRememberedValue30);
                                                        }
                                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                                                        long j = u61Var4.C;
                                                        long j2 = u61Var4.D;
                                                        int i24 = ClickableSurfaceDefaults.$stable;
                                                        ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j, 0L, j2, 0L, 0L, 0L, 0L, 0L, composer5, i24 << 24, 250);
                                                        int i25 = i24 << 15;
                                                        ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var4.b), 0.0f, null, 6, null), null, null, null, composer5, i25, 29);
                                                        ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
                                                        ClickableSurfaceGlow clickableSurfaceGlowC = el0.c(u61Var4);
                                                        ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f)), null, null, null, null, composer5, i25, 30);
                                                        Object objRememberedValue31 = composer5.rememberedValue();
                                                        if (objRememberedValue31 == companion5.getEmpty()) {
                                                            objRememberedValue31 = new r1(0, mutableState45);
                                                            composer5.updateRememberedValue(objRememberedValue31);
                                                        }
                                                        SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue31, modifierFillMaxWidth$default, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorderBorder, clickableSurfaceGlowC, null, ComposableLambdaKt.rememberComposableLambda(883343218, true, new p1(1, mutableState45), composer5, 54), composer5, 54, 48, 1052);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer5.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    Composer composer6 = (Composer) obj6;
                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer6.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(650457586, iIntValue3, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:589)");
                                                        }
                                                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        ClickableSurfaceDefaults clickableSurfaceDefaults2 = ClickableSurfaceDefaults.INSTANCE;
                                                        long j3 = u61Var4.C;
                                                        long j4 = u61Var4.D;
                                                        int i26 = ClickableSurfaceDefaults.$stable;
                                                        ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We09 = clickableSurfaceDefaults2.m8292colorsoq7We08(j3, 0L, j4, 0L, 0L, 0L, 0L, 0L, composer6, i26 << 24, 250);
                                                        int i27 = i26 << 15;
                                                        ClickableSurfaceBorder clickableSurfaceBorderBorder2 = clickableSurfaceDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var4.b), 0.0f, null, 6, null), null, null, null, composer6, i27, 29);
                                                        ClickableSurfaceScale clickableSurfaceScaleScale$default2 = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults2, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
                                                        ClickableSurfaceGlow clickableSurfaceGlowC2 = el0.c(u61Var4);
                                                        ClickableSurfaceShape clickableSurfaceShapeShape2 = clickableSurfaceDefaults2.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f)), null, null, null, null, composer6, i27, 30);
                                                        Object objRememberedValue32 = composer6.rememberedValue();
                                                        if (objRememberedValue32 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue32 = new r1(2, mutableState45);
                                                            composer6.updateRememberedValue(objRememberedValue32);
                                                        }
                                                        SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue32, modifierFillMaxWidth$default2, null, false, 0.0f, clickableSurfaceShapeShape2, clickableSurfaceColorsM8292colorsoq7We09, clickableSurfaceScaleScale$default2, clickableSurfaceBorderBorder2, clickableSurfaceGlowC2, null, ComposableLambdaKt.rememberComposableLambda(-1990833775, true, new p1(3, mutableState45), composer6, 54), composer6, 54, 48, 1052);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer6.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer7 = (Composer) obj6;
                                                    int iIntValue4 = ((Integer) obj7).intValue();
                                                    ((LazyItemScope) obj5).getClass();
                                                    if (composer7.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1639192584, iIntValue4, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:636)");
                                                        }
                                                        Object objRememberedValue33 = composer7.rememberedValue();
                                                        Composer.Companion companion6 = Composer.INSTANCE;
                                                        if (objRememberedValue33 == companion6.getEmpty()) {
                                                            objRememberedValue33 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                                            composer7.updateRememberedValue(objRememberedValue33);
                                                        }
                                                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        ClickableSurfaceDefaults clickableSurfaceDefaults3 = ClickableSurfaceDefaults.INSTANCE;
                                                        long j5 = u61Var4.C;
                                                        long j6 = u61Var4.D;
                                                        int i28 = ClickableSurfaceDefaults.$stable;
                                                        ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We010 = clickableSurfaceDefaults3.m8292colorsoq7We08(j5, 0L, j6, 0L, 0L, 0L, 0L, 0L, composer7, i28 << 24, 250);
                                                        int i29 = i28 << 15;
                                                        ClickableSurfaceBorder clickableSurfaceBorderBorder3 = clickableSurfaceDefaults3.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var4.b), 0.0f, null, 6, null), null, null, null, composer7, i29, 29);
                                                        ClickableSurfaceScale clickableSurfaceScaleScale$default3 = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults3, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
                                                        ClickableSurfaceGlow clickableSurfaceGlowC3 = el0.c(u61Var4);
                                                        ClickableSurfaceShape clickableSurfaceShapeShape3 = clickableSurfaceDefaults3.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f)), null, null, null, null, composer7, i29, 30);
                                                        Object objRememberedValue34 = composer7.rememberedValue();
                                                        if (objRememberedValue34 == companion6.getEmpty()) {
                                                            objRememberedValue34 = new r1(1, mutableState45);
                                                            composer7.updateRememberedValue(objRememberedValue34);
                                                        }
                                                        SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue34, modifierFillMaxWidth$default3, null, false, 0.0f, clickableSurfaceShapeShape3, clickableSurfaceColorsM8292colorsoq7We010, clickableSurfaceScaleScale$default3, clickableSurfaceBorderBorder3, clickableSurfaceGlowC3, null, ComposableLambdaKt.rememberComposableLambda(-1914846151, true, new p1(2, mutableState45), composer7, 54), composer7, 54, 48, 1052);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer7.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 3, null);
                                    Function0 function5 = function2;
                                    FocusRequester focusRequester18 = focusRequester12;
                                    Context context5 = context4;
                                    String str8 = str7;
                                    w2 w2Var7 = w2Var6;
                                    State state3 = state2;
                                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-218402281, true, new h2(function5, focusRequester18, context5, str8, w2Var7, state3, mutableState37, mutableState38, mutableState40, mutableState34, mutableState39, mutableState35, mutableState36, mutableState41, mutableState42, mutableState43, mutableState44)), 3, null);
                                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1202388022, true, new i2(state3, i18)), 3, null);
                                    return Unit.INSTANCE;
                                }
                            };
                            composer4.updateRememberedValue(function4);
                            objRememberedValue29 = function4;
                        }
                        LazyDslKt.LazyColumn(modifierM999padding3ABfNKs2, lazyListState2, null, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue29, composer4, 24582, 492);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer4.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            };
            String str7 = str4;
            w2 w2Var6 = w2Var4;
            CardKt.Card(modifierFillMaxHeight$default, null, cardColorsM2119cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(915676806, r5, function3, composerStartRestartGroup, i9), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (!((Boolean) mutableState17.getValue()).booleanValue() || str7 == null) {
                str5 = str7;
                composerStartRestartGroup.startReplaceGroup(1075605728);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1074590912);
                Object objRememberedValue29 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue29 == companion.getEmpty()) {
                    mutableState5 = mutableState17;
                    objRememberedValue29 = new r1(5, mutableState5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue29);
                } else {
                    mutableState5 = mutableState17;
                }
                str5 = str7;
                AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue29, ComposableLambdaKt.rememberComposableLambda(-1328907537, r5, new f2(context3, str7, coroutineScope, lz0Var, function0, mutableState5, 0), composerStartRestartGroup, i9), null, ComposableLambdaKt.rememberComposableLambda(1042809329, r5, new b2(r5, mutableState5), composerStartRestartGroup, i9), null, rs.a, ComposableLambdaKt.rememberComposableLambda(-1842066316, r5, new b2(2, mutableState22), composerStartRestartGroup, i9), null, 0L, 0L, 0L, 0L, 0.0f, null, composerStartRestartGroup, 1772598, 0, 16276);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (((Boolean) mutableState3.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(1075668348);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(w2Var6);
                Object objRememberedValue30 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue30 == companion.getEmpty()) {
                    mutableState4 = mutableState3;
                    objRememberedValue30 = new m1(w2Var6, mutableState4, r5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue30);
                } else {
                    mutableState4 = mutableState3;
                }
                int i18 = 0;
                Composer composer4 = composerStartRestartGroup;
                AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue30, ComposableLambdaKt.rememberComposableLambda(-1858711016, r5, new a2(i18, w2Var6, mutableState4), composerStartRestartGroup, i9), null, null, null, rs.b, ComposableLambdaKt.rememberComposableLambda(-1083058595, r5, new b2(i18, mutableState19), composerStartRestartGroup, i9), null, 0L, 0L, 0L, 0L, 0.0f, null, composer4, 1769520, 0, 16284);
                composerStartRestartGroup = composer4;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1076225728);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            String str8 = str5;
            w2Var2 = w2Var6;
            str3 = str8;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str2;
            w2Var2 = w2Var;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c2(str3, function1, function0, w2Var2, i, i2, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0128  */
    /* JADX WARN: Code duplicated, block: B:64:0x0130  */
    /* JADX WARN: Code duplicated, block: B:67:0x013e  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void b(String str, Function1 function1, String str2, String str3, Modifier modifier, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, Composer composer, int i, int i2) {
        int i3;
        VisualTransformation none;
        int i4;
        int i5;
        int i6;
        boolean z;
        Composer composer2;
        KeyboardOptions keyboardOptions2;
        VisualTransformation visualTransformation2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(185550744);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        int i7 = 196608 | i3;
        int i8 = i2 & 64;
        if (i8 == 0) {
            if ((1572864 & i) == 0) {
                none = visualTransformation;
                i7 |= composerStartRestartGroup.changed(none) ? 1048576 : 524288;
            }
            i4 = i7 | 12582912;
            i5 = 0;
            i6 = 1;
            if ((4793491 & i4) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
                if (i8 != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                }
                VisualTransformation visualTransformation3 = none;
                KeyboardOptions keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(185550744, i4, -1, "com.dh.myembyapp.ui.screens.addserver.TvConfirmEditableTextField (AddServerScreen.kt:102)");
                }
                int i9 = i4 << 3;
                composer2 = composerStartRestartGroup;
                yc2.d(str, function1, modifier.then(Modifier.INSTANCE), false, ComposableLambdaKt.rememberComposableLambda(1892381938, true, new z1(str2, i5), composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1334397875, true, new z1(str3, i6), composerStartRestartGroup, 54), null, visualTransformation3, keyboardOptions3, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), false, null, null, composer2, (i4 & 14) | 221184 | (i4 & Input.Keys.FORWARD_DEL) | (29360128 & i9) | (i9 & 234881024), 6, 29256);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                visualTransformation2 = visualTransformation3;
                keyboardOptions2 = keyboardOptions3;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                keyboardOptions2 = keyboardOptions;
                visualTransformation2 = none;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jb(str, function1, str2, str3, modifier, visualTransformation2, keyboardOptions2, i, i2));
            }
        }
        i7 = 1769472 | i3;
        none = visualTransformation;
        i4 = i7 | 12582912;
        i5 = 0;
        i6 = 1;
        if ((4793491 & i4) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
            if (i8 != 0) {
                none = VisualTransformation.INSTANCE.getNone();
            }
            VisualTransformation visualTransformation4 = none;
            KeyboardOptions keyboardOptions4 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(185550744, i4, -1, "com.dh.myembyapp.ui.screens.addserver.TvConfirmEditableTextField (AddServerScreen.kt:102)");
            }
            int i10 = i4 << 3;
            composer2 = composerStartRestartGroup;
            yc2.d(str, function1, modifier.then(Modifier.INSTANCE), false, ComposableLambdaKt.rememberComposableLambda(1892381938, true, new z1(str2, i5), composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1334397875, true, new z1(str3, i6), composerStartRestartGroup, 54), null, visualTransformation4, keyboardOptions4, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), false, null, null, composer2, (i4 & 14) | 221184 | (i4 & Input.Keys.FORWARD_DEL) | (29360128 & i10) | (i10 & 234881024), 6, 29256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            visualTransformation2 = visualTransformation4;
            keyboardOptions2 = keyboardOptions4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            keyboardOptions2 = keyboardOptions;
            visualTransformation2 = none;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jb(str, function1, str2, str3, modifier, visualTransformation2, keyboardOptions2, i, i2));
        }
    }

    public static final ad1 c(String str) {
        String lowerCase;
        String string = StringsKt.trim((CharSequence) str).toString();
        Integer intOrNull = null;
        MatchResult matchResultFind$default = Regex.find$default(new Regex("^(https?)://", RegexOption.IGNORE_CASE), string, 0, 2, null);
        if (matchResultFind$default != null) {
            lowerCase = matchResultFind$default.getGroupValues().get(1).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            string = string.substring(matchResultFind$default.getValue().length());
        } else {
            lowerCase = null;
        }
        String strTrimEnd = StringsKt.trimEnd(string, '/', '\\');
        MatchResult matchResultFind$default2 = Regex.find$default(new Regex(":(\\d+)$"), strTrimEnd, 0, 2, null);
        if (matchResultFind$default2 != null) {
            intOrNull = StringsKt.toIntOrNull(matchResultFind$default2.getGroupValues().get(1));
            strTrimEnd = strTrimEnd.substring(0, matchResultFind$default2.getRange().getFirst());
        }
        return new ad1(strTrimEnd, lowerCase, intOrNull);
    }
}
