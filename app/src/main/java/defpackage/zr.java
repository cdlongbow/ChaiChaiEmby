package defpackage;
import com.badlogic.gdx.utils.Bits;
import com.badlogic.gdx.utils.Pool;




/* JADX INFO: loaded from: classes4.dex */
public final class zr extends Pool {
    public final /* synthetic */ int a;

    public /* synthetic */ zr(int i) {
        this.a = i;
    }

    @Override // com.badlogic.gdx.utils.Pool
    public final Object newObject() {
        switch (this.a) {
            case 0:
                return new yr();
            case 1:
                return new lg0();
            default:
                return new Bits();
        }
    }
}
