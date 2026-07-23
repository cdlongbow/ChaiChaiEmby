package defpackage;

import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class bc2 implements xv0 {
    public final xv0 a;
    public final xv0 b;
    public final xv0 c;
    public final nw1 d;

    public bc2(xv0 xv0Var, xv0 xv0Var2, xv0 xv0Var3) {
        nw1 nw1Var;
        this.a = xv0Var;
        this.b = xv0Var2;
        this.c = xv0Var3;
        lw1[] lw1VarArr = new lw1[0];
        m22 m22Var = new m22(this, 8);
        if (StringsKt.isBlank("kotlin.Triple")) {
            ra.q("Blank serial names are prohibited");
            nw1Var = null;
        } else {
            wp wpVar = new wp("kotlin.Triple");
            m22Var.invoke(wpVar);
            nw1Var = new nw1("kotlin.Triple", l32.e, wpVar.c.size(), ArraysKt.toList(lw1VarArr), wpVar);
        }
        this.d = nw1Var;
    }

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        nw1 nw1Var = this.d;
        xt xtVarBeginStructure = b20Var.beginStructure(nw1Var);
        boolean zDecodeSequentially = xtVarBeginStructure.decodeSequentially();
        xv0 xv0Var = this.c;
        xv0 xv0Var2 = this.b;
        xv0 xv0Var3 = this.a;
        if (zDecodeSequentially) {
            Object objDecodeSerializableElement = xtVarBeginStructure.decodeSerializableElement(nw1Var, 0, xv0Var3, null);
            Object objDecodeSerializableElement2 = xtVarBeginStructure.decodeSerializableElement(nw1Var, 1, xv0Var2, null);
            Object objDecodeSerializableElement3 = xtVarBeginStructure.decodeSerializableElement(nw1Var, 2, xv0Var, null);
            xtVarBeginStructure.endStructure(nw1Var);
            return new Triple(objDecodeSerializableElement, objDecodeSerializableElement2, objDecodeSerializableElement3);
        }
        Object obj = ku.b;
        Object objDecodeSerializableElement4 = obj;
        Object objDecodeSerializableElement5 = objDecodeSerializableElement4;
        Object objDecodeSerializableElement6 = objDecodeSerializableElement5;
        while (true) {
            int iDecodeElementIndex = xtVarBeginStructure.decodeElementIndex(nw1Var);
            if (iDecodeElementIndex == -1) {
                xtVarBeginStructure.endStructure(nw1Var);
                if (objDecodeSerializableElement4 == obj) {
                    throw new uw1("Element 'first' is missing");
                }
                if (objDecodeSerializableElement5 == obj) {
                    throw new uw1("Element 'second' is missing");
                }
                if (objDecodeSerializableElement6 != obj) {
                    return new Triple(objDecodeSerializableElement4, objDecodeSerializableElement5, objDecodeSerializableElement6);
                }
                throw new uw1("Element 'third' is missing");
            }
            if (iDecodeElementIndex == 0) {
                objDecodeSerializableElement4 = xtVarBeginStructure.decodeSerializableElement(nw1Var, 0, xv0Var3, null);
            } else if (iDecodeElementIndex == 1) {
                objDecodeSerializableElement5 = xtVarBeginStructure.decodeSerializableElement(nw1Var, 1, xv0Var2, null);
            } else {
                if (iDecodeElementIndex != 2) {
                    throw new uw1(i9.f(iDecodeElementIndex, "Unexpected index "));
                }
                objDecodeSerializableElement6 = xtVarBeginStructure.decodeSerializableElement(nw1Var, 2, xv0Var, null);
            }
        }
    }

    @Override // defpackage.vw1, defpackage.l40

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        Triple triple = (Triple) obj;
        triple.getClass();
        nw1 nw1Var = this.d;
        yt ytVarBeginStructure = wf0Var.beginStructure(nw1Var);
        ytVarBeginStructure.encodeSerializableElement(nw1Var, 0, this.a, triple.getFirst());
        ytVarBeginStructure.encodeSerializableElement(nw1Var, 1, this.b, triple.getSecond());
        ytVarBeginStructure.encodeSerializableElement(nw1Var, 2, this.c, triple.getThird());
        ytVarBeginStructure.endStructure(nw1Var);
    }
}
