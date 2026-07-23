package defpackage;
import com.badlogic.gdx.utils.Pool;



/* JADX INFO: loaded from: classes4.dex */
public final class fp1 extends Pool {
    public final /* synthetic */ hp1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp1(hp1 hp1Var) {
        super(200, 1000);
        this.a = hp1Var;
    }

    @Override // com.badlogic.gdx.utils.Pool
    public final Object newObject() {
        return new gp1(this.a);
    }
}
