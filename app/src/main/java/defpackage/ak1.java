package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ak1 extends FunctionReferenceImpl implements Function3 {
    public final /* synthetic */ eo1 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ ce1 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ String e;
    public final /* synthetic */ to1 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ ln1 i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ ih1 n;
    public final /* synthetic */ ih1 o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak1(eo1 eo1Var, Function0 function0, ce1 ce1Var, Context context, String str, to1 to1Var, Function2 function2, ln1 ln1Var, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, ih1 ih1Var, ih1 ih1Var2, MutableState mutableState5, MutableState mutableState6) {
        super(3, Intrinsics.Kotlin.class, "handleVideoVersionSelected", "PlayerScreenContent$lambda$121$handleVideoVersionSelected(Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Lkotlin/jvm/functions/Function0;Lcom/dh/myembyapp/data/PlaybackMemoryPreferences;Landroid/content/Context;Ljava/lang/String;Lcom/dh/myembyapp/ui/screens/player/PlayerViewModel;Lkotlin/jvm/functions/Function2;Lcom/dh/myembyapp/ui/screens/player/PlayerSeekController;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/data/model/MediaSource;ZLjava/util/List;)V", 0);
        this.a = eo1Var;
        this.b = function0;
        this.c = ce1Var;
        this.d = context;
        this.e = str;
        this.g = to1Var;
        this.h = function2;
        this.i = ln1Var;
        this.j = mutableState;
        this.k = mutableState2;
        this.l = mutableState3;
        this.m = mutableState4;
        this.n = ih1Var;
        this.o = ih1Var2;
        this.p = mutableState5;
        this.q = mutableState6;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MediaSource mediaSource = (MediaSource) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        List list = (List) obj3;
        mediaSource.getClass();
        list.getClass();
        MediaItem mediaItem = this.a.a;
        Function0 function0 = this.b;
        String str = (String) function0.invoke();
        String str2 = this.e;
        to1 to1Var = this.g;
        Function2 function2 = this.h;
        ln1 ln1Var = this.i;
        MutableState mutableState = this.j;
        MutableState mutableState2 = this.k;
        MutableState mutableState3 = this.l;
        MutableState mutableState4 = this.m;
        ih1 ih1Var = this.n;
        ih1 ih1Var2 = this.o;
        MutableState mutableState5 = this.p;
        MutableState mutableState6 = this.q;
        bm1 bm1Var = new bm1(str2, function0, to1Var, function2, ln1Var, mutableState, mutableState2, mutableState3, mutableState4, ih1Var, ih1Var2, mutableState5, mutableState6);
        cm1 cm1Var = new cm1(mutableState6);
        mediaItem.getClass();
        ce1 ce1Var = this.c;
        Context context = this.d;
        if (zBooleanValue) {
            ce1Var.b(mediaItem);
            Toast.makeText(context, "已取消视频版本记忆", 0).show();
            Unit unit = Unit.INSTANCE;
        } else {
            ce1Var.k(mediaItem, mediaSource, list);
            Toast.makeText(context, "已记住视频版本选择", 0).show();
            Unit unit2 = Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(mediaSource.getId(), str)) {
            cm1Var.invoke();
        } else {
            bm1Var.invoke(mediaSource.getId());
        }
        return Unit.INSTANCE;
    }
}
