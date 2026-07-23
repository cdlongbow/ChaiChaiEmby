package defpackage;

import com.dh.myembyapp.data.preferences.ServerPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vi1 extends AdaptedFunctionReference implements Function1 {
    public final /* synthetic */ int a = 2;

    public vi1(to1 to1Var) {
        super(1, to1Var, to1.class, "loadMediaItem", "loadMediaItem(Ljava/lang/String;ZLjava/lang/String;Lcom/dh/myembyapp/data/model/TranscodeQualityOption;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;ZZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ServerPreferences.updateServerPlaybackAccess$default((ServerPreferences) this.receiver, str, 0L, 2, null);
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                ((to1) this.receiver).F(str2, (506 & 2) != 0 ? false : false, (506 & 4) != 0 ? null : null, (506 & 8) != 0 ? null : null, (506 & 16) != 0 ? null : null, (506 & 32) != 0 ? null : null, (506 & 64) != 0 ? null : null, (506 & 128) == 0, false);
                break;
            default:
                String str3 = (String) obj;
                str3.getClass();
                ((to1) this.receiver).F(str3, (506 & 2) != 0 ? false : false, (506 & 4) != 0 ? null : null, (506 & 8) != 0 ? null : null, (506 & 16) != 0 ? null : null, (506 & 32) != 0 ? null : null, (506 & 64) != 0 ? null : null, (506 & 128) == 0, false);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ vi1(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    public vi1(ServerPreferences serverPreferences) {
        super(1, serverPreferences, ServerPreferences.class, "updateServerPlaybackAccess", "updateServerPlaybackAccess(Ljava/lang/String;J)V", 0);
    }
}
