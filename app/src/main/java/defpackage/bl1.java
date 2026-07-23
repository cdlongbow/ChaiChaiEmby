package defpackage;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bl1 extends AdaptedFunctionReference implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bl1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((pn1) this.receiver).c = SystemClock.elapsedRealtime();
                break;
            default:
                ((pn1) this.receiver).c = SystemClock.elapsedRealtime();
                break;
        }
        return Unit.INSTANCE;
    }
}
