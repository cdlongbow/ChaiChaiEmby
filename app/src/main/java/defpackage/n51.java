package defpackage;

import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.gestures.TrackpadScrollingLogic;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n51 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Channel b;

    public /* synthetic */ n51(Channel channel, int i) {
        this.a = i;
        this.b = channel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Channel channel = this.b;
        switch (i) {
            case 0:
                return MouseWheelScrollingLogic.sumOrNull$lambda$0(channel);
            default:
                return TrackpadScrollingLogic.sumOrNull$lambda$0(channel);
        }
    }
}
