package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ss1 {
    public final long a;
    public final l91 b;
    public final rs1 c;

    public ss1(long j, l91 l91Var) {
        this.a = j;
        this.b = l91Var;
        this.c = new rs1(this, j);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(g41 g41Var, pr0 pr0Var, Map map, long j) {
        rs1 rs1Var = this.c;
        long j2 = rs1Var.b;
        LinkedHashMap linkedHashMap = rs1Var.a;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(g41Var);
            if (objRemove != null) {
                rs1Var.c = rs1Var.b() - rs1Var.c(g41Var, objRemove);
                rs1Var.a(g41Var, objRemove, null);
            }
            this.b.c(g41Var, pr0Var, map, j);
            return;
        }
        qs1 qs1Var = new qs1(pr0Var, map, j);
        Object objPut = linkedHashMap.put(g41Var, qs1Var);
        rs1Var.c = rs1Var.c(g41Var, qs1Var) + rs1Var.b();
        if (objPut != null) {
            rs1Var.c = rs1Var.b() - rs1Var.c(g41Var, objPut);
            rs1Var.a(g41Var, objPut, qs1Var);
        }
        rs1Var.d(rs1Var.b);
    }
}
