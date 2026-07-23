package defpackage;
import com.badlogic.gdx.utils.Array;

/* JADX INFO: loaded from: classes4.dex */
public final class fd extends d01 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fd(lw1 lw1Var, int i) {
        super(lw1Var);
        this.b = i;
    }

    @Override // defpackage.lw1
    public final String f() {
        switch (this.b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
