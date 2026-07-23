package defpackage;

import kotlin.io.encoding.Base64;
import kotlin.text.StringsKt;
import okio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public final class r00 implements ck0 {
    public final rd2 a;
    public final wa1 b;

    public r00(rd2 rd2Var, wa1 wa1Var) {
        this.a = rd2Var;
        this.b = wa1Var;
    }

    @Override // defpackage.ck0
    public final Object a(eg0 eg0Var) {
        rd2 rd2Var = this.a;
        String str = rd2Var.a;
        String str2 = rd2Var.a;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default(str, ";base64,", 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            n41.m("invalid data uri: ", rd2Var);
            return null;
        }
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str2, ':', 0, false, 6, (Object) null);
        if (iIndexOf$default2 == -1) {
            n41.m("invalid data uri: ", rd2Var);
            return null;
        }
        String strSubstring = str2.substring(iIndexOf$default2 + 1, iIndexOf$default);
        byte[] bArrDecode$default = Base64.decode$default(Base64.INSTANCE, str2, iIndexOf$default + 8, 0, 4, (Object) null);
        Buffer buffer = new Buffer();
        buffer.write(bArrDecode$default);
        return new o22(new p22(buffer, this.b.f, null), strSubstring, o00.b);
    }
}
