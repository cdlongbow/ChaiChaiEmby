package defpackage;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jy0 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageVector b;
    public final /* synthetic */ String c;

    public /* synthetic */ jy0(ImageVector imageVector, String str, int i) {
        this.a = i;
        this.b = imageVector;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(825777575, iIntValue, -1, "com.dh.myembyapp.ui.components.LibrarySortActionButton.<anonymous> (LibrarySortDialog.kt:464)");
                    }
                    IconKt.m2496Iconww6aTOc(this.b, this.c, SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(30.0f)), 0L, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-902230359, iIntValue2, -1, "com.dh.myembyapp.ui.components.ServerSortActionButton.<anonymous> (ServerSortDialog.kt:406)");
                    }
                    IconKt.m2496Iconww6aTOc(this.b, this.c, SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(28.0f)), 0L, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-554993578, iIntValue3, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingSliderTv.<anonymous>.<anonymous> (SubtitleSettings.kt:728)");
                    }
                    IconKt.m2496Iconww6aTOc(this.b, this.c, SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(24.0f)), Color.INSTANCE.m5189getWhite0d7_KjU(), composer3, 3456, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1939602739, iIntValue4, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingSliderTv.<anonymous>.<anonymous> (SubtitleSettings.kt:780)");
                    }
                    IconKt.m2496Iconww6aTOc(this.b, this.c, SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(24.0f)), Color.INSTANCE.m5189getWhite0d7_KjU(), composer4, 3456, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
            default:
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1312230249, iIntValue5, -1, "com.dh.myembyapp.ui.components.TraktThresholdIconButton.<anonymous> (TraktSyncDialog.kt:783)");
                    }
                    IconKt.m2496Iconww6aTOc(this.b, this.c, SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(22.0f)), 0L, composer5, RendererCapabilities.DECODER_SUPPORT_MASK, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
