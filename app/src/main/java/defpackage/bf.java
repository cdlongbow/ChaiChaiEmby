package defpackage;

import android.content.Context;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bf {
    public static final void a(final pf pfVar, final String str, Modifier modifier, final Function1 function1, final Function1 function2, final Alignment alignment, final ContentScale contentScale, final float f, final ColorFilter colorFilter, final int i, final boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        String str2;
        Function1 function3;
        Function1 function4;
        Alignment alignment2;
        float f2;
        ColorFilter colorFilter2;
        int i5;
        int i6;
        final Modifier modifier2;
        Composer composer2;
        fs0 fs0Var;
        Composer composerStartRestartGroup = composer.startRestartGroup(1236588022);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(pfVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i4 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function3 = function1;
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        } else {
            function3 = function1;
        }
        if ((i2 & 24576) == 0) {
            function4 = function2;
            i4 |= composerStartRestartGroup.changedInstance(function4) ? 16384 : 8192;
        } else {
            function4 = function2;
        }
        if ((196608 & i2) == 0) {
            alignment2 = alignment;
            i4 |= composerStartRestartGroup.changed(alignment2) ? 131072 : 65536;
        } else {
            alignment2 = alignment;
        }
        if ((1572864 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(contentScale) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            f2 = f;
            i4 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
        } else {
            f2 = f;
        }
        if ((100663296 & i2) == 0) {
            colorFilter2 = colorFilter;
            i4 |= composerStartRestartGroup.changed(colorFilter2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        } else {
            colorFilter2 = colorFilter;
        }
        if ((805306368 & i2) == 0) {
            i5 = i;
            i4 |= composerStartRestartGroup.changed(i5) ? 536870912 : 268435456;
        } else {
            i5 = i;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (composerStartRestartGroup.changed(z) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1236588022, i4, i6, "coil3.compose.AsyncImage (AsyncImage.kt:152)");
            }
            Object obj = pfVar.a;
            int i7 = (i4 >> 15) & Input.Keys.FORWARD_DEL;
            int i8 = be2.b;
            composerStartRestartGroup.startReplaceGroup(-329318062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-329318062, i7, -1, "coil3.compose.internal.requestOfWithSizeResolver (utils.kt:61)");
            }
            if (obj instanceof fs0) {
                composerStartRestartGroup.startReplaceGroup(-1008942344);
                fs0Var = (fs0) obj;
                if (fs0Var.t.g != null) {
                    composerStartRestartGroup.startReplaceGroup(-1008902292);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1008854118);
                    o12 o12VarB = be2.b(contentScale, composerStartRestartGroup, (i7 >> 3) & 14);
                    boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(o12VarB);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        bs0 bs0VarA = fs0.a(fs0Var);
                        bs0VarA.n = o12VarB;
                        objRememberedValue = bs0VarA.a();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    fs0Var = (fs0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            } else {
                composerStartRestartGroup.startReplaceGroup(-1008595950);
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                o12 o12VarB2 = be2.b(contentScale, composerStartRestartGroup, (i7 >> 3) & 14);
                boolean zChanged2 = composerStartRestartGroup.changed(context) | composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(o12VarB2);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    bs0 bs0Var = new bs0(context);
                    bs0Var.c = obj;
                    bs0Var.n = o12VarB2;
                    objRememberedValue2 = bs0Var.a();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                fs0Var = (fs0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            fs0 fs0Var2 = fs0Var;
            be2.f(fs0Var2);
            composer2 = composerStartRestartGroup;
            int i9 = i5;
            modifier2 = modifier;
            Modifier modifierThen = modifier2.then(new xu(fs0Var2, pfVar.c, pfVar.b, function3, function4, i9, alignment2, contentScale, f2, colorFilter2, z, be2.a(composerStartRestartGroup), str2));
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
            int i10 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierThen);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer2);
            Updater.m4326setimpl(composerM4318constructorimpl, xd2.a, companion.getSetMeasurePolicy());
            Updater.m4326setimpl(composerM4318constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM4318constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4318constructorimpl.rememberedValue(), Integer.valueOf(i10))) {
                x2.l(setCompositeKeyHash, i10, composerM4318constructorimpl, i10);
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: af
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                    bf.a(pfVar, str, modifier2, function1, function2, alignment, contentScale, f, colorFilter, i, z, (Composer) obj2, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void b(Object obj, String str, ks1 ks1Var, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, int i, Composer composer, int i2, int i3, int i4) {
        Alignment center = (i4 & 64) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        float f2 = (i4 & 256) != 0 ? 1.0f : f;
        int iM5653getDefaultFilterQualityfv9h1I = (i4 & 1024) != 0 ? DrawScope.INSTANCE.m5653getDefaultFilterQualityfv9h1I() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(40041566, i2, i3, "coil3.compose.AsyncImage (AsyncImage.kt:125)");
        }
        int i5 = i2 >> 3;
        a(new pf(obj, (cf) composer.consume(m01.a), ks1Var), str, modifier, kf.s, null, center, contentScale, f2, null, iM5653getDefaultFilterQualityfv9h1I, true, composer, (i2 & Input.Keys.FORWARD_DEL) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (i5 & 234881024) | ((i3 << 27) & 1879048192), (i3 >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
