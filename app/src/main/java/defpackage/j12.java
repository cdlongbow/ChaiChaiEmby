package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j12 {
    public static final /* synthetic */ AtomicReference a = new AtomicReference(null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final ks1 a(Context context) {
        ks1 ks1Var;
        ks1 ks1Var2;
        i12 i12Var;
        i12 i12Var2;
        i12 i12Var3;
        i12 i12Var4;
        AtomicReference atomicReference = a;
        Object obj = atomicReference.get();
        ks1 ks1Var3 = obj instanceof ks1 ? (ks1) obj : null;
        if (ks1Var3 != null) {
            return ks1Var3;
        }
        ks1 ks1VarA = null;
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof ks1) {
                ks1Var = (ks1) obj2;
                ks1Var2 = ks1VarA;
            } else {
                if (ks1VarA == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (obj2 instanceof i12) {
                        i12Var4 = (i12) obj2;
                    } else {
                        i12Var = null;
                    }
                    if (i12Var != null) {
                        i12Var = i12Var4;
                        ks1VarA = i12Var.a(applicationContext);
                    } else {
                        if (applicationContext instanceof i12) {
                            i12Var3 = (i12) applicationContext;
                        } else {
                            i12Var2 = null;
                        }
                        if (i12Var2 != null) {
                            i12Var = i12Var4;
                            i12Var = i12Var4;
                            i12Var2 = i12Var3;
                            ks1VarA = i12Var2.a(applicationContext);
                        } else {
                            i12Var = i12Var4;
                            i12Var = i12Var4;
                            i12Var2 = i12Var3;
                            ks1VarA = l12.a.a(applicationContext);
                        }
                    }
                }
                ks1Var = ks1VarA;
                ks1Var2 = ks1Var;
            }
            while (!atomicReference.compareAndSet(obj2, ks1Var)) {
                if (atomicReference.get() != obj2) {
                    ks1VarA = ks1Var2;
                }
            }
            return ks1Var;
        }
    }
}
