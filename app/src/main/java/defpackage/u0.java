package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes5.dex */
public abstract class u0 implements xv0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.String] */
    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        Object objDecodeSerializableElement;
        b20Var.getClass();
        ap1 ap1Var = (ap1) this;
        lw1 descriptor = ap1Var.getDescriptor();
        xt xtVarBeginStructure = b20Var.beginStructure(descriptor);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (xtVarBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement = xtVarBeginStructure.decodeSerializableElement(ap1Var.getDescriptor(), 1, hg2.u(this, xtVarBeginStructure, xtVarBeginStructure.decodeStringElement(ap1Var.getDescriptor(), 0)), null);
        } else {
            Object objDecodeSerializableElement2 = null;
            while (true) {
                int iDecodeElementIndex = xtVarBeginStructure.decodeElementIndex(ap1Var.getDescriptor());
                if (iDecodeElementIndex == -1) {
                    if (objDecodeSerializableElement2 != null) {
                        objDecodeSerializableElement = objDecodeSerializableElement2;
                        break;
                    }
                    lm.i("Polymorphic value has not been read for class ", (String) objectRef.element);
                    return null;
                }
                if (iDecodeElementIndex != 0) {
                    T t = objectRef.element;
                    if (iDecodeElementIndex != 1) {
                        StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                        String str = (String) t;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(iDecodeElementIndex);
                        throw new uw1(sb.toString());
                    }
                    if (t == 0) {
                        ra.q("Cannot read polymorphic value before its type token");
                        return null;
                    }
                    objectRef.element = t;
                    objDecodeSerializableElement2 = xtVarBeginStructure.decodeSerializableElement(ap1Var.getDescriptor(), iDecodeElementIndex, hg2.u(this, xtVarBeginStructure, (String) t), null);
                } else {
                    objectRef.element = xtVarBeginStructure.decodeStringElement(ap1Var.getDescriptor(), iDecodeElementIndex);
                }
            }
        }
        xtVarBeginStructure.endStructure(descriptor);
        return objDecodeSerializableElement;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        xv0 xv0Var;
        obj.getClass();
        ap1 ap1Var = (ap1) this;
        rw1 rw1Var = (rw1) wf0Var.getSerializersModule();
        rw1Var.getClass();
        KClass kClass = ap1Var.a;
        kClass.getClass();
        if (kClass.isInstance(obj)) {
            Map map = (Map) rw1Var.b.get(kClass);
            xv0 xv0Var2 = map != null ? (xv0) map.get(Reflection.getOrCreateKotlinClass(obj.getClass())) : null;
            xv0Var = xv0Var2 instanceof vw1 ? xv0Var2 : null;
            if (xv0Var == null) {
                Object obj2 = rw1Var.c.get(kClass);
                Function1 function1 = TypeIntrinsics.isFunctionOfArity(obj2, 1) ? (Function1) obj2 : null;
                if (function1 != null) {
                    xv0Var = (vw1) function1.invoke(obj);
                } else {
                    xv0Var = null;
                }
            }
        } else {
            xv0Var = null;
        }
        if (xv0Var != null) {
            lw1 descriptor = ap1Var.getDescriptor();
            yt ytVarBeginStructure = wf0Var.beginStructure(descriptor);
            ytVarBeginStructure.encodeStringElement(ap1Var.getDescriptor(), 0, xv0Var.getDescriptor().f());
            ytVarBeginStructure.encodeSerializableElement(ap1Var.getDescriptor(), 1, xv0Var, obj);
            ytVarBeginStructure.endStructure(descriptor);
            return;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(obj.getClass());
        orCreateKotlinClass.getClass();
        String simpleName = orCreateKotlinClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(orCreateKotlinClass);
        }
        hg2.M(simpleName, kClass);
        throw null;
    }
}
