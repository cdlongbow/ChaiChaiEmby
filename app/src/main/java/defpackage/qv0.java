package defpackage;

import android.webkit.MimeTypeMap;
import java.util.Locale;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import okio.Okio;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public final class qv0 implements ck0 {
    public final rd2 a;
    public final wa1 b;

    public qv0(rd2 rd2Var, wa1 wa1Var) {
        this.a = rd2Var;
        this.b = wa1Var;
    }

    @Override // defpackage.ck0
    public final Object a(eg0 eg0Var) {
        rd2 rd2Var = this.a;
        String str = rd2Var.e;
        if (str == null) {
            str = "";
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '!', 0, false, 6, (Object) null);
        String mimeTypeFromExtension = null;
        if (iIndexOf$default == -1) {
            n41.m("Invalid jar:file URI: ", rd2Var);
            return null;
        }
        Path.Companion companion = Path.INSTANCE;
        Path path = Path.Companion.get$default(companion, str.substring(0, iIndexOf$default), false, 1, (Object) null);
        Path path2 = Path.Companion.get$default(companion, str.substring(iIndexOf$default + 1, str.length()), false, 1, (Object) null);
        fk0 fk0VarC = hg2.c(path2, Okio.openZip(this.b.f, path), null, null, 28);
        String strSubstringAfterLast = StringsKt__StringsKt.substringAfterLast(path2.name(), '.', "");
        if (!StringsKt.isBlank(strSubstringAfterLast)) {
            String lowerCase = strSubstringAfterLast.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            mimeTypeFromExtension = (String) r41.a.get(lowerCase);
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
            }
        }
        return new o22(fk0VarC, mimeTypeFromExtension, o00.c);
    }
}
