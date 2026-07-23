package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.media3.common.MediaItem;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ci1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ ln1 c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ AtomicLong g;
    public final /* synthetic */ on1 h;

    public /* synthetic */ ci1(MutableState mutableState, ln1 ln1Var, MutableState mutableState2, MutableState mutableState3, AtomicLong atomicLong, on1 on1Var, int i) {
        this.a = i;
        this.b = mutableState;
        this.c = ln1Var;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = atomicLong;
        this.h = on1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                MediaItem mediaItem = (MediaItem) obj;
                mediaItem.getClass();
                dn1.k0(this.b, this.c, this.d, this.e, this.g, this.h, mediaItem);
                break;
            default:
                MediaItem mediaItem2 = (MediaItem) obj;
                mediaItem2.getClass();
                dn1.k0(this.b, this.c, this.d, this.e, this.g, this.h, mediaItem2);
                break;
        }
        return Unit.INSTANCE;
    }
}
