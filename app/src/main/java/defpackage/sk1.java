package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.IntroOutroMemory;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sk1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ eo1 a;
    public final /* synthetic */ IntroOutroMemory b;
    public final /* synthetic */ nn1 c;
    public final /* synthetic */ zu0 d;
    public final /* synthetic */ zu0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk1(eo1 eo1Var, IntroOutroMemory introOutroMemory, nn1 nn1Var, zu0 zu0Var, zu0 zu0Var2) {
        super(0, Intrinsics.Kotlin.class, "handleMarkIntro", "PlayerScreenContent$lambda$121$handleMarkIntro(Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Lcom/dh/myembyapp/data/IntroOutroMemory;Lcom/dh/myembyapp/ui/screens/player/PlayerSessionState;Lcom/dh/myembyapp/ui/screens/player/introoutro/IntroOutroPlaybackState;Lcom/dh/myembyapp/ui/screens/player/introoutro/IntroOutroPlaybackState;)V", 0);
        this.a = eo1Var;
        this.b = introOutroMemory;
        this.c = nn1Var;
        this.d = zu0Var;
        this.e = zu0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableState mutableState = this.d.e;
        MediaItem mediaItem = this.a.a;
        String seasonId = mediaItem.getSeasonId();
        if (seasonId == null) {
            seasonId = mediaItem.getParentId();
        }
        long jA = this.c.a();
        Long l = (Long) mutableState.getValue();
        Long l2 = (Long) this.e.f.getValue();
        IntroOutroMemory introOutroMemory = this.b;
        introOutroMemory.getClass();
        if (seasonId != null) {
            Long lValueOf = l != null ? null : Long.valueOf(jA);
            introOutroMemory.saveSeasonIntroOutro(seasonId, lValueOf, l2);
            mutableState.setValue(lValueOf);
            Unit unit = Unit.INSTANCE;
            Log.d("IntroOutro", "标记正片: " + lValueOf);
        }
        return Unit.INSTANCE;
    }
}
