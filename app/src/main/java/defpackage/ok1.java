package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ok1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ CoroutineScope a;
    public final /* synthetic */ UserPreferences b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ sh1 e;
    public final /* synthetic */ Context g;
    public final /* synthetic */ og1 h;
    public final /* synthetic */ MutableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok1(CoroutineScope coroutineScope, UserPreferences userPreferences, MutableState mutableState, MutableState mutableState2, sh1 sh1Var, Context context, og1 og1Var, MutableState mutableState3) {
        super(1, Intrinsics.Kotlin.class, "handleAssSubtitleEnhancementToggle", "PlayerScreenContent$lambda$121$handleAssSubtitleEnhancementToggle(Lkotlinx/coroutines/CoroutineScope;Lcom/dh/myembyapp/data/preferences/UserPreferences;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerRebuildController;Landroid/content/Context;Lcom/dh/myembyapp/ui/screens/player/PlayerDecoderState;Landroidx/compose/runtime/MutableState;Z)V", 0);
        this.a = coroutineScope;
        this.b = userPreferences;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = sh1Var;
        this.g = context;
        this.h = og1Var;
        this.i = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        MutableState mutableState = this.c;
        vb1 vb1Var = new vb1(16, mutableState);
        MutableState mutableState2 = this.d;
        vb1 vb1Var2 = new vb1(17, mutableState2);
        vh1 vh1Var = new vh1(10, mutableState);
        vh1 vh1Var2 = new vh1(11, mutableState2);
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new xd(vb1Var, vb1Var2, zBooleanValue, new fl1(this.i), vh1Var, new vj1(this.e, this.h, null, 3), this.b, new n61(this.g, 4), vh1Var2, null), 3, null);
        return Unit.INSTANCE;
    }
}
