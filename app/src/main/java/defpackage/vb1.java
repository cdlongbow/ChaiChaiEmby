package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vb1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ vb1(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 3:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 4:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 5:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 6:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 7:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 8:
                return PlatformDefaultTextContextMenuProviders_androidKt.ProvideBothDefaultProviders$lambda$3$0(mutableState);
            case 9:
                Boolean bool = (Boolean) mutableState.getValue();
                bool.booleanValue();
                return bool;
            case 10:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 11:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 12:
                return (ExoPlayer) mutableState.getValue();
            case 13:
                dn1.J(mutableState, System.currentTimeMillis());
                return Unit.INSTANCE;
            case 14:
                Boolean bool2 = (Boolean) mutableState.getValue();
                bool2.booleanValue();
                return bool2;
            case 15:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 16:
                Boolean bool3 = (Boolean) mutableState.getValue();
                bool3.booleanValue();
                return bool3;
            case 17:
                return (md) mutableState.getValue();
            case 18:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 19:
                return (ExoPlayer) mutableState.getValue();
            case 20:
                Function0 function0 = (Function0) mutableState.getValue();
                if (function0 != null) {
                    return (Long) function0.invoke();
                }
                return null;
            case 21:
                return (ExoPlayer) mutableState.getValue();
            case 22:
                Function0 function1 = (Function0) mutableState.getValue();
                if (function1 != null) {
                    return (Long) function1.invoke();
                }
                return null;
            case 23:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 24:
                return (PlayerView) mutableState.getValue();
            case 25:
                Boolean bool4 = (Boolean) mutableState.getValue();
                bool4.booleanValue();
                return bool4;
            case 26:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 27:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 28:
                return Long.valueOf(((ExoPlayer) mutableState.getValue()).getCurrentPosition());
            default:
                return Boolean.valueOf((((ExoPlayer) mutableState.getValue()).getPlayWhenReady() || ((ExoPlayer) mutableState.getValue()).getPlaybackState() == 4) ? false : true);
        }
    }
}
