package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.SubtitlePreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mk1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ MutableState a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ eo1 e;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ SubtitlePreferences h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk1(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, eo1 eo1Var, Function0 function0, SubtitlePreferences subtitlePreferences, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8) {
        super(1, Intrinsics.Kotlin.class, "handleSubtitleColorChange", "PlayerScreenContent$lambda$121$handleSubtitleColorChange(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Lkotlin/jvm/functions/Function0;Lcom/dh/myembyapp/data/SubtitlePreferences;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/data/SubtitlePreferences$SubtitleColor;)V", 0);
        this.a = mutableState;
        this.b = mutableState2;
        this.c = mutableState3;
        this.d = mutableState4;
        this.e = eo1Var;
        this.g = function0;
        this.h = subtitlePreferences;
        this.i = mutableState5;
        this.j = mutableState6;
        this.k = mutableState7;
        this.l = mutableState8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SubtitlePreferences.SubtitleColor subtitleColor = (SubtitlePreferences.SubtitleColor) obj;
        subtitleColor.getClass();
        this.a.setValue(subtitleColor);
        dn1.o0(this.e, this.g, this.h, this.i, this.j, this.k, ((Number) this.b.getValue()).floatValue(), ((Number) this.c.getValue()).intValue(), ((Number) this.d.getValue()).intValue(), subtitleColor);
        Log.d("SubtitleSettings", "保存字幕颜色: " + subtitleColor);
        dn1.h0(this.l);
        return Unit.INSTANCE;
    }
}
