package defpackage;

import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final class qg0 implements xv0 {
    public final Enum[] a;
    public final Lazy b;

    public qg0(String str, Enum[] enumArr) {
        str.getClass();
        enumArr.getClass();
        this.a = enumArr;
        this.b = LazyKt.lazy(new z7(21, this, str));
    }

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        int iDecodeEnum = b20Var.decodeEnum(getDescriptor());
        Enum[] enumArr = this.a;
        if (iDecodeEnum >= 0 && iDecodeEnum < enumArr.length) {
            return enumArr[iDecodeEnum];
        }
        throw new uw1(iDecodeEnum + " is not among valid " + getDescriptor().f() + " enum values, values size is " + enumArr.length);
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return (lw1) this.b.getValue();
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        Enum[] enumArr = this.a;
        int iIndexOf = ArraysKt.indexOf(enumArr, r5);
        if (iIndexOf != -1) {
            wf0Var.encodeEnum(getDescriptor(), iIndexOf);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String strF = getDescriptor().f();
        String string = Arrays.toString(enumArr);
        string.getClass();
        sb.append(" is not a valid enum ");
        sb.append(strF);
        sb.append(", must be one of ");
        sb.append(string);
        throw new uw1(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().f() + Typography.greater;
    }
}
