package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.ui.PlayerView;

import com.dh.myembyapp.data.SubtitlePreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xn1 {
    /* JADX WARN: Code duplicated, block: B:270:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:271:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:274:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:275:0x0400  */
    /* JADX WARN: Code duplicated, block: B:278:0x0408  */
    /* JADX WARN: Code duplicated, block: B:279:0x040b  */
    /* JADX WARN: Code duplicated, block: B:282:0x0412  */
    /* JADX WARN: Code duplicated, block: B:283:0x0415  */
    /* JADX WARN: Code duplicated, block: B:288:0x0425  */
    /* JADX WARN: Code duplicated, block: B:293:0x049f  */
    /* JADX WARN: Code duplicated, block: B:294:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:297:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:298:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:301:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:302:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:305:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:306:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:310:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:317:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:320:0x0518  */
    public static final void a(final Context context, final ExoPlayer exoPlayer, final PlayerView playerView, final String str, final UserPreferences userPreferences, final UserPreferences.AssSubtitleEnhancementGuard assSubtitleEnhancementGuard, final String str2, final Function0 function0, final boolean z, final md mdVar, final boolean z2, final boolean z3, final boolean z4, final String str3, final String str4, final Function1 function1, final int i, final boolean z5, final CueGroup cueGroup, final pl plVar, final Function1 function2, final Typeface typeface, final SubtitlePreferences.SubtitleColor subtitleColor, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        Composer composer2;
        Object un1Var;
        int i8;
        int i9;
        md mdVar2;
        pl plVar2;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Object objRememberedValue;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Object objRememberedValue2;
        exoPlayer.getClass();
        str.getClass();
        function0.getClass();
        function1.getClass();
        plVar.getClass();
        function2.getClass();
        subtitleColor.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-55439668);
        if ((i2 & 6) == 0) {
            i5 = i2 | (composerStartRestartGroup.changedInstance(context) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(exoPlayer) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(playerView) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= (i2 & 32768) == 0 ? composerStartRestartGroup.changed(userPreferences) : composerStartRestartGroup.changedInstance(userPreferences) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= composerStartRestartGroup.changed(assSubtitleEnhancementGuard) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= composerStartRestartGroup.changed(str2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        int i16 = i2 & 100663296;
        int i17 = GroupFlagsKt.HasAuxSlotFlag;
        if (i16 == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(mdVar) ? 536870912 : 268435456;
        }
        int i18 = i5;
        if ((i3 & 6) == 0) {
            i6 = i3 | (composerStartRestartGroup.changed(z2) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i6 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(str4) ? 16384 : 8192;
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= composerStartRestartGroup.changed(z5) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            if (composerStartRestartGroup.changedInstance(cueGroup)) {
                i17 = 67108864;
            }
            i6 |= i17;
        }
        if ((i3 & 805306368) == 0) {
            i6 |= (i3 & 1073741824) == 0 ? composerStartRestartGroup.changed(plVar) : composerStartRestartGroup.changedInstance(plVar) ? 536870912 : 268435456;
        }
        int i19 = i6;
        if ((i4 & 6) == 0) {
            i7 = i4 | (composerStartRestartGroup.changedInstance(function2) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(typeface) ? 32 : 16;
        }
        if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerStartRestartGroup.changed(subtitleColor.ordinal()) ? 256 : 128;
        }
        int i20 = i7;
        if (composerStartRestartGroup.shouldExecute(((i18 & 306783379) == 306783378 && (i19 & 306783379) == 306783378 && (i20 & Input.Keys.NUMPAD_3) == 146) ? false : true, i18 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-55439668, i18, i19, "com.dh.myembyapp.ui.screens.player.PlayerSubtitleRenderingEffects (PlayerSubtitleRenderingEffects.kt:43)");
            }
            int i21 = i18 & 57344;
            boolean z12 = (i21 == 16384 || ((i18 & 32768) != 0 && composerStartRestartGroup.changedInstance(userPreferences))) | ((i18 & 458752) == 131072);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z12 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new sn1(assSubtitleEnhancementGuard, userPreferences, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(assSubtitleEnhancementGuard, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (i18 >> 15) & 14);
            boolean zChangedInstance = ((i18 & 29360128) == 8388608) | ((i18 & 3670016) == 1048576) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new tn1(str2, context, function0, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(str2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, (i18 >> 18) & 14);
            Object[] objArr = {Boolean.valueOf(z), mdVar, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), str3, str};
            boolean z13 = (i21 == 16384 || ((i18 & 32768) != 0 && composerStartRestartGroup.changedInstance(userPreferences))) | ((i18 & 7168) == 2048) | ((i19 & 7168) == 2048);
            int i22 = i18 & 234881024;
            int i23 = i19 & 14;
            boolean zChangedInstance2 = z13 | (i22 == 67108864) | composerStartRestartGroup.changedInstance(mdVar) | (i23 == 4);
            int i24 = i19 & Input.Keys.FORWARD_DEL;
            int i25 = i19 & 896;
            boolean z14 = ((i19 & 57344) == 16384) | zChangedInstance2 | (i24 == 32) | (i25 == 256) | ((i19 & 458752) == 131072);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z14 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                i8 = i23;
                i9 = i20;
                un1Var = new un1(userPreferences, str, str3, z, mdVar, z2, z3, z4, str4, function1, null);
                mdVar2 = mdVar;
                composerStartRestartGroup.updateRememberedValue(un1Var);
            } else {
                i9 = i20;
                i8 = i23;
                un1Var = objRememberedValue5;
                mdVar2 = mdVar;
            }
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) un1Var, composerStartRestartGroup, 0);
            Integer numValueOf = Integer.valueOf(i);
            Boolean boolValueOf = Boolean.valueOf(z3);
            Boolean boolValueOf2 = Boolean.valueOf(z5);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(playerView) | composerStartRestartGroup.changedInstance(cueGroup);
            if ((i19 & 1879048192) != 536870912) {
                plVar2 = plVar;
                if ((i19 & 1073741824) == 0 || !composerStartRestartGroup.changedInstance(plVar2)) {
                    z6 = false;
                }
                boolean z15 = z6 | zChangedInstance3;
                if (i24 == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z16 = z15 | z7;
                if ((i19 & 29360128) == 8388608) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z17 = z8 | z16;
                if ((i19 & 3670016) == 1048576) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z18 = z17 | z9;
                if ((i9 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z18 | z10;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z11 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    composer2 = composerStartRestartGroup;
                    i10 = 0;
                    vn1 vn1Var = new vn1(playerView, cueGroup, plVar2, z3, z5, i, function2, null);
                    composer2.updateRememberedValue(vn1Var);
                    objRememberedValue = vn1Var;
                } else {
                    composer2 = composerStartRestartGroup;
                    i10 = 0;
                }
                EffectsKt.LaunchedEffect(numValueOf, boolValueOf, boolValueOf2, (Function2) objRememberedValue, composer2, ((i19 >> 18) & 14) | i24 | ((i19 >> 15) & 896));
                Boolean boolValueOf3 = Boolean.valueOf(z);
                Boolean boolValueOf4 = Boolean.valueOf(z2);
                Boolean boolValueOf5 = Boolean.valueOf(z3);
                Boolean boolValueOf6 = Boolean.valueOf(z4);
                Object[] objArr2 = new Object[9];
                objArr2[i10] = r3;
                objArr2[1] = typeface;
                objArr2[2] = subtitleColor;
                objArr2[3] = boolValueOf3;
                objArr2[r15] = boolValueOf4;
                objArr2[5] = boolValueOf5;
                objArr2[6] = boolValueOf6;
                objArr2[7] = mdVar2;
                objArr2[8] = exoPlayer;
                if (i24 == 32) {
                    i11 = 1;
                } else {
                    i11 = i10;
                }
                int i26 = ((i11 | (composer2.changedInstance(r3) ? 1 : 0)) == true ? 1 : 0) | (composer2.changedInstance(typeface) ? 1 : 0);
                if (i22 == 67108864) {
                    i12 = 1;
                } else {
                    i12 = i10;
                }
                int i27 = i26 | i12;
                if (i8 == 4) {
                    i13 = 1;
                } else {
                    i13 = i10;
                }
                int i28 = i27 | i13;
                if (i25 == 256) {
                    i14 = 1;
                } else {
                    i14 = i10;
                }
                i15 = (((i28 | i14) | (composer2.changedInstance(mdVar2) ? 1 : 0)) == true ? 1 : 0) | ((i9 & 896) != 256 ? i10 : 1) | (composer2.changedInstance(exoPlayer) ? 1 : 0);
                objRememberedValue2 = composer2.rememberedValue();
                if (i15 == 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new wn1(z3, playerView, typeface, z, z2, z4, mdVar2, subtitleColor, exoPlayer, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                EffectsKt.LaunchedEffect(objArr2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, i10);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                plVar2 = plVar;
            }
            z6 = true;
            boolean z19 = z6 | zChangedInstance3;
            if (i24 == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z110 = z19 | z7;
            if ((i19 & 29360128) == 8388608) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z111 = z8 | z110;
            if ((i19 & 3670016) == 1048576) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z112 = z111 | z9;
            if ((i9 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z112 | z10;
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z11) {
                composer2 = composerStartRestartGroup;
                i10 = 0;
                vn1 vn1Var2 = new vn1(playerView, cueGroup, plVar2, z3, z5, i, function2, null);
                composer2.updateRememberedValue(vn1Var2);
                objRememberedValue = vn1Var2;
            } else {
                composer2 = composerStartRestartGroup;
                i10 = 0;
                vn1 vn1Var3 = new vn1(playerView, cueGroup, plVar2, z3, z5, i, function2, null);
                composer2.updateRememberedValue(vn1Var3);
                objRememberedValue = vn1Var3;
            }
            EffectsKt.LaunchedEffect(numValueOf, boolValueOf, boolValueOf2, (Function2) objRememberedValue, composer2, ((i19 >> 18) & 14) | i24 | ((i19 >> 15) & 896));
            Boolean boolValueOf7 = Boolean.valueOf(z);
            Boolean boolValueOf8 = Boolean.valueOf(z2);
            Boolean boolValueOf9 = Boolean.valueOf(z3);
            Boolean boolValueOf10 = Boolean.valueOf(z4);
            Object[] objArr3 = new Object[9];
            objArr3[i10] = r3;
            objArr3[1] = typeface;
            objArr3[2] = subtitleColor;
            objArr3[3] = boolValueOf7;
            objArr3[r15] = boolValueOf8;
            objArr3[5] = boolValueOf9;
            objArr3[6] = boolValueOf10;
            objArr3[7] = mdVar2;
            objArr3[8] = exoPlayer;
            if (i24 == 32) {
                i11 = 1;
            } else {
                i11 = i10;
            }
            int i29 = ((i11 | (composer2.changedInstance(r3) ? 1 : 0)) == true ? 1 : 0) | (composer2.changedInstance(typeface) ? 1 : 0);
            if (i22 == 67108864) {
                i12 = 1;
            } else {
                i12 = i10;
            }
            int i210 = i29 | i12;
            if (i8 == 4) {
                i13 = 1;
            } else {
                i13 = i10;
            }
            int i211 = i210 | i13;
            if (i25 == 256) {
                i14 = 1;
            } else {
                i14 = i10;
            }
            i15 = (((i211 | i14) | (composer2.changedInstance(mdVar2) ? 1 : 0)) == true ? 1 : 0) | ((i9 & 896) != 256 ? i10 : 1) | (composer2.changedInstance(exoPlayer) ? 1 : 0);
            objRememberedValue2 = composer2.rememberedValue();
            if (i15 == 0) {
                objRememberedValue2 = new wn1(z3, playerView, typeface, z, z2, z4, mdVar2, subtitleColor, exoPlayer, null);
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new wn1(z3, playerView, typeface, z, z2, z4, mdVar2, subtitleColor, exoPlayer, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(objArr3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, i10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: rn1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                    int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i4);
                    xn1.a(context, exoPlayer, playerView, str, userPreferences, assSubtitleEnhancementGuard, str2, function0, z, mdVar, z2, z3, z4, str3, str4, function1, i, z5, cueGroup, plVar, function2, typeface, subtitleColor, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, iUpdateChangedFlags3);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
