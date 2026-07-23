package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pj1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ eo1 d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj1(Function0 function0, Function1 function1, Context context, eo1 eo1Var, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        super(1, Intrinsics.Kotlin.class, "buildPlaybackMediaItemWithSubtitles", "PlayerScreenContent$lambda$121$buildPlaybackMediaItemWithSubtitles(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroid/content/Context;Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/util/Map;)Landroidx/media3/common/MediaItem;", 0);
        this.a = function0;
        this.b = function1;
        this.c = context;
        this.d = eo1Var;
        this.e = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
        this.i = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return dn1.a0(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, map);
    }
}
