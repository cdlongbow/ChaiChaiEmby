package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.SubtitlePreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tl1 extends AdaptedFunctionReference implements Function3 {
    public final /* synthetic */ eo1 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ SubtitlePreferences c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl1(eo1 eo1Var, Function0 function0, SubtitlePreferences subtitlePreferences, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        super(3, Intrinsics.Kotlin.class, "saveSubtitleDisplaySettings", "PlayerScreenContent$lambda$121$saveSubtitleDisplaySettings(Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Lkotlin/jvm/functions/Function0;Lcom/dh/myembyapp/data/SubtitlePreferences;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;FIILcom/dh/myembyapp/data/SubtitlePreferences$SubtitleColor;)V", 0);
        this.a = eo1Var;
        this.b = function0;
        this.c = subtitlePreferences;
        this.d = mutableState;
        this.e = mutableState2;
        this.g = mutableState3;
        this.h = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj).floatValue();
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        dn1.p0(this.a, this.b, this.c, this.d, this.e, this.g, this.h, fFloatValue, iIntValue, iIntValue2);
        return Unit.INSTANCE;
    }
}
