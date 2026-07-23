package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class i31 implements xv0 {
    public final xv0 a;
    public final xv0 b;
    public final /* synthetic */ int c;
    public final nw1 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i31(xv0 xv0Var, xv0 xv0Var2, int i) {
        this(xv0Var, xv0Var2, (byte) 0);
        this.c = i;
        switch (i) {
            case 1:
                this(xv0Var, xv0Var2, (byte) 0);
                lw1[] lw1VarArr = new lw1[0];
                if (StringsKt.isBlank("kotlin.Pair")) {
                    ra.q("Blank serial names are prohibited");
                    throw null;
                }
                wp wpVar = new wp("kotlin.Pair");
                wp.a(wpVar, "first", xv0Var.getDescriptor());
                wp.a(wpVar, "second", xv0Var2.getDescriptor());
                Unit unit = Unit.INSTANCE;
                this.d = new nw1("kotlin.Pair", l32.e, wpVar.c.size(), ArraysKt.toList(lw1VarArr), wpVar);
                return;
            default:
                this.d = hg2.l("kotlin.collections.Map.Entry", l32.g, new lw1[0], new vw0(3, xv0Var, xv0Var2));
                return;
        }
    }

    public final Object a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                return new h31(obj, obj2);
            default:
                return TuplesKt.to(obj, obj2);
        }
    }

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        Object objA;
        Object obj = ku.b;
        b20Var.getClass();
        lw1 descriptor = getDescriptor();
        xt xtVarBeginStructure = b20Var.beginStructure(descriptor);
        boolean zDecodeSequentially = xtVarBeginStructure.decodeSequentially();
        xv0 xv0Var = this.b;
        xv0 xv0Var2 = this.a;
        if (zDecodeSequentially) {
            objA = a(xtVarBeginStructure.decodeSerializableElement(getDescriptor(), 0, xv0Var2, null), xtVarBeginStructure.decodeSerializableElement(getDescriptor(), 1, xv0Var, null));
        } else {
            Object objDecodeSerializableElement = obj;
            Object objDecodeSerializableElement2 = objDecodeSerializableElement;
            while (true) {
                int iDecodeElementIndex = xtVarBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    if (objDecodeSerializableElement == obj) {
                        throw new uw1("Element 'key' is missing");
                    }
                    if (objDecodeSerializableElement2 == obj) {
                        throw new uw1("Element 'value' is missing");
                    }
                    objA = a(objDecodeSerializableElement, objDecodeSerializableElement2);
                    break;
                }
                if (iDecodeElementIndex == 0) {
                    objDecodeSerializableElement = xtVarBeginStructure.decodeSerializableElement(getDescriptor(), 0, xv0Var2, null);
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new uw1(i9.f(iDecodeElementIndex, "Invalid index: "));
                    }
                    objDecodeSerializableElement2 = xtVarBeginStructure.decodeSerializableElement(getDescriptor(), 1, xv0Var, null);
                }
            }
        }
        xtVarBeginStructure.endStructure(descriptor);
        return objA;
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        switch (this.c) {
            case 0:
                break;
        }
        return this.d;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        Object key;
        Object value;
        yt ytVarBeginStructure = wf0Var.beginStructure(getDescriptor());
        lw1 descriptor = getDescriptor();
        xv0 xv0Var = this.a;
        int i = this.c;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                Pair pair = (Pair) obj;
                pair.getClass();
                key = pair.getFirst();
                break;
        }
        ytVarBeginStructure.encodeSerializableElement(descriptor, 0, xv0Var, key);
        lw1 descriptor2 = getDescriptor();
        xv0 xv0Var2 = this.b;
        switch (i) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                value = pair2.getSecond();
                break;
        }
        ytVarBeginStructure.encodeSerializableElement(descriptor2, 1, xv0Var2, value);
        ytVarBeginStructure.endStructure(getDescriptor());
    }

    public i31(xv0 xv0Var, xv0 xv0Var2, byte b) {
        this.a = xv0Var;
        this.b = xv0Var2;
    }
}
