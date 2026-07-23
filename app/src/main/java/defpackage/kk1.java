package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.SubtitlePreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kk1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ SubtitlePreferences a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk1(SubtitlePreferences subtitlePreferences, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        super(1, Intrinsics.Kotlin.class, "handleBitmapSubtitleBrightnessChange", "PlayerScreenContent$lambda$121$handleBitmapSubtitleBrightnessChange(Lcom/dh/myembyapp/data/SubtitlePreferences;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;I)V", 0);
        this.a = subtitlePreferences;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        kl1 kl1Var = new kl1(this.d);
        int iNormalizeBitmapSubtitleBrightness = SubtitlePreferences.INSTANCE.normalizeBitmapSubtitleBrightness(iIntValue);
        this.b.setValue(Integer.valueOf(iNormalizeBitmapSubtitleBrightness));
        Unit unit = Unit.INSTANCE;
        this.a.saveBitmapSubtitleBrightness(iNormalizeBitmapSubtitleBrightness);
        this.c.setValue(Boolean.FALSE);
        Unit unit2 = Unit.INSTANCE;
        Log.d("SubtitleSettings", "保存全局图形字幕亮度: " + iNormalizeBitmapSubtitleBrightness);
        kl1Var.invoke();
        return Unit.INSTANCE;
    }
}
