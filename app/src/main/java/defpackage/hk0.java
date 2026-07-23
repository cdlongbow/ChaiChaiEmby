package defpackage;

import android.webkit.MimeTypeMap;
import java.util.Locale;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public final class hk0 implements ck0 {
    public final rd2 a;
    public final wa1 b;

    public hk0(rd2 rd2Var, wa1 wa1Var) {
        this.a = rd2Var;
        this.b = wa1Var;
    }

    @Override // defpackage.ck0
    public final Object a(eg0 eg0Var) {
        Path.Companion companion = Path.INSTANCE;
        String strZ = ku.z(this.a);
        String mimeTypeFromExtension = null;
        if (strZ == null) {
            rd1.o("filePath == null");
            return null;
        }
        Path path = Path.Companion.get$default(companion, strZ, false, 1, (Object) null);
        fk0 fk0VarC = hg2.c(path, this.b.f, null, null, 28);
        String strSubstringAfterLast = StringsKt__StringsKt.substringAfterLast(path.name(), '.', "");
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
