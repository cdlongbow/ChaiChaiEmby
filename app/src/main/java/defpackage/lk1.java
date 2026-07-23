package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.media3.common.text.CueGroup;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import com.dh.myembyapp.data.SubtitlePreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lk1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ SubtitlePreferences a;
    public final /* synthetic */ pl b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk1(SubtitlePreferences subtitlePreferences, pl plVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        super(1, Intrinsics.Kotlin.class, "handleBitmapSubtitleBrightnessEnabledChange", "PlayerScreenContent$lambda$121$handleBitmapSubtitleBrightnessEnabledChange(Lcom/dh/myembyapp/data/SubtitlePreferences;Lcom/dh/myembyapp/ui/screens/player/BitmapSubtitleCueBinder;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Z)V", 0);
        this.a = subtitlePreferences;
        this.b = plVar;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
        this.i = mutableState6;
        this.j = mutableState7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SubtitleView subtitleView;
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        PlayerView playerView = (PlayerView) this.c.getValue();
        CueGroup cueGroup = (CueGroup) this.d.getValue();
        boolean zBooleanValue2 = ((Boolean) this.e.getValue()).booleanValue();
        int iIntValue = ((Number) this.g.getValue()).intValue();
        ll1 ll1Var = new ll1(this.j);
        this.h.setValue(bool);
        Unit unit = Unit.INSTANCE;
        this.a.saveBitmapSubtitleBrightnessEnabled(zBooleanValue);
        pl plVar = this.b;
        plVar.a.evictAll();
        this.i.setValue(Boolean.FALSE);
        if (zBooleanValue2 && cueGroup != null) {
            if (zBooleanValue) {
                plVar.a(playerView, cueGroup, iIntValue);
            } else if (playerView != null && (subtitleView = playerView.getSubtitleView()) != null) {
                subtitleView.setCues(cueGroup.cues);
            }
        }
        Log.d("SubtitleSettings", "保存全局图形字幕亮度增强开关: " + zBooleanValue);
        ll1Var.invoke();
        return Unit.INSTANCE;
    }
}
