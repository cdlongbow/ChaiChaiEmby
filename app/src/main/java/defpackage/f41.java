package defpackage;

import androidx.media3.common.MimeTypes;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class f41 {
    public static final bt0 f;
    public static final zo g;
    public static final HashMap h;
    public static final f41 i;
    public static final ri j;
    public final String a;
    public final String b;
    public final bt0 c;
    public String d;
    public int e;

    static {
        bt0 bt0Var;
        String strM = ig2.M(StandardCharsets.UTF_8.name());
        ig2.q("charset", strM);
        kr krVarA = kr.a();
        ss0 ss0VarJ = (ss0) krVarA.get("charset");
        if (ss0VarJ == null) {
            ss0VarJ = at0.j(4);
            krVarA.put("charset", ss0VarJ);
        }
        ss0VarJ.a(strM);
        Collection collectionEntrySet = krVarA.entrySet();
        if (((AbstractCollection) collectionEntrySet).isEmpty()) {
            bt0Var = vf0.h;
        } else {
            ir<Map.Entry> irVar = (ir) collectionEntrySet;
            dt0 dt0Var = new dt0(irVar.b.size());
            int i2 = 0;
            for (Map.Entry entry : irVar) {
                Object key = entry.getKey();
                bt1 bt1VarF = ((xs0) entry.getValue()).f();
                dt0Var.b(key, bt1VarF);
                i2 += bt1VarF.d;
            }
            bt0Var = new bt0(dt0Var.a(true), i2);
        }
        f = bt0Var;
        ap apVar = ap.d;
        ap apVar2 = ap.e;
        apVar2.getClass();
        fp fpVar = new fp(apVar2);
        apVar.getClass();
        g = new zo(new zo(new zo(apVar, fpVar), new dp(' ', 1)), gp.b("()<>@,;:\\\"/[]?=").d());
        gp.b("\"\\\r").d().getClass();
        gp.b(" \t\r\n");
        h = new HashMap();
        a("*", "*");
        a("text", "*");
        a("image", "*");
        a(MimeTypes.BASE_TYPE_AUDIO, "*");
        a(MimeTypes.BASE_TYPE_VIDEO, "*");
        a(MimeTypes.BASE_TYPE_APPLICATION, "*");
        a("font", "*");
        b("text", "cache-manifest");
        b("text", "css");
        b("text", "csv");
        b("text", "html");
        b("text", "calendar");
        b("text", "markdown");
        b("text", "plain");
        b("text", "javascript");
        b("text", "tab-separated-values");
        b("text", "vcard");
        b("text", "vnd.wap.wml");
        b("text", "xml");
        b("text", "vtt");
        a("image", "bmp");
        a("image", "x-canon-crw");
        a("image", "gif");
        a("image", "vnd.microsoft.icon");
        a("image", "jpeg");
        a("image", "png");
        a("image", "vnd.adobe.photoshop");
        b("image", "svg+xml");
        a("image", "tiff");
        a("image", "webp");
        a("image", "heif");
        a("image", "jp2");
        a(MimeTypes.BASE_TYPE_AUDIO, "mp4");
        a(MimeTypes.BASE_TYPE_AUDIO, "mpeg");
        a(MimeTypes.BASE_TYPE_AUDIO, "ogg");
        a(MimeTypes.BASE_TYPE_AUDIO, "webm");
        a(MimeTypes.BASE_TYPE_AUDIO, "l16");
        a(MimeTypes.BASE_TYPE_AUDIO, "l24");
        a(MimeTypes.BASE_TYPE_AUDIO, "basic");
        a(MimeTypes.BASE_TYPE_AUDIO, "aac");
        a(MimeTypes.BASE_TYPE_AUDIO, "vorbis");
        a(MimeTypes.BASE_TYPE_AUDIO, "x-ms-wma");
        a(MimeTypes.BASE_TYPE_AUDIO, "x-ms-wax");
        a(MimeTypes.BASE_TYPE_AUDIO, "vnd.rn-realaudio");
        a(MimeTypes.BASE_TYPE_AUDIO, "vnd.wave");
        a(MimeTypes.BASE_TYPE_VIDEO, "mp4");
        a(MimeTypes.BASE_TYPE_VIDEO, "mpeg");
        a(MimeTypes.BASE_TYPE_VIDEO, "ogg");
        a(MimeTypes.BASE_TYPE_VIDEO, "quicktime");
        a(MimeTypes.BASE_TYPE_VIDEO, "webm");
        a(MimeTypes.BASE_TYPE_VIDEO, "x-ms-wmv");
        a(MimeTypes.BASE_TYPE_VIDEO, "x-flv");
        a(MimeTypes.BASE_TYPE_VIDEO, "3gpp");
        a(MimeTypes.BASE_TYPE_VIDEO, "3gpp2");
        b(MimeTypes.BASE_TYPE_APPLICATION, "xml");
        b(MimeTypes.BASE_TYPE_APPLICATION, "atom+xml");
        a(MimeTypes.BASE_TYPE_APPLICATION, "x-bzip2");
        b(MimeTypes.BASE_TYPE_APPLICATION, "dart");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.apple.pkpass");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.ms-fontobject");
        a(MimeTypes.BASE_TYPE_APPLICATION, "epub+zip");
        a(MimeTypes.BASE_TYPE_APPLICATION, "x-www-form-urlencoded");
        a(MimeTypes.BASE_TYPE_APPLICATION, "pkcs12");
        a(MimeTypes.BASE_TYPE_APPLICATION, "binary");
        a(MimeTypes.BASE_TYPE_APPLICATION, "geo+json");
        a(MimeTypes.BASE_TYPE_APPLICATION, "x-gzip");
        a(MimeTypes.BASE_TYPE_APPLICATION, "hal+json");
        b(MimeTypes.BASE_TYPE_APPLICATION, "javascript");
        a(MimeTypes.BASE_TYPE_APPLICATION, "jose");
        a(MimeTypes.BASE_TYPE_APPLICATION, "jose+json");
        i = b(MimeTypes.BASE_TYPE_APPLICATION, "json");
        a(MimeTypes.BASE_TYPE_APPLICATION, "jwt");
        b(MimeTypes.BASE_TYPE_APPLICATION, "manifest+json");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.google-earth.kml+xml");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.google-earth.kmz");
        a(MimeTypes.BASE_TYPE_APPLICATION, "mbox");
        a(MimeTypes.BASE_TYPE_APPLICATION, "x-apple-aspen-config");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.ms-excel");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.ms-outlook");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.ms-powerpoint");
        a(MimeTypes.BASE_TYPE_APPLICATION, "msword");
        a(MimeTypes.BASE_TYPE_APPLICATION, "dash+xml");
        a(MimeTypes.BASE_TYPE_APPLICATION, "wasm");
        a(MimeTypes.BASE_TYPE_APPLICATION, "x-nacl");
        a(MimeTypes.BASE_TYPE_APPLICATION, "x-pnacl");
        a(MimeTypes.BASE_TYPE_APPLICATION, "octet-stream");
        a(MimeTypes.BASE_TYPE_APPLICATION, "ogg");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.presentationml.presentation");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.oasis.opendocument.graphics");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.oasis.opendocument.presentation");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.oasis.opendocument.spreadsheet");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.oasis.opendocument.text");
        b(MimeTypes.BASE_TYPE_APPLICATION, "opensearchdescription+xml");
        a(MimeTypes.BASE_TYPE_APPLICATION, "pdf");
        a(MimeTypes.BASE_TYPE_APPLICATION, "postscript");
        a(MimeTypes.BASE_TYPE_APPLICATION, "protobuf");
        b(MimeTypes.BASE_TYPE_APPLICATION, "rdf+xml");
        b(MimeTypes.BASE_TYPE_APPLICATION, "rtf");
        a(MimeTypes.BASE_TYPE_APPLICATION, "font-sfnt");
        a(MimeTypes.BASE_TYPE_APPLICATION, "x-shockwave-flash");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.sketchup.skp");
        b(MimeTypes.BASE_TYPE_APPLICATION, "soap+xml");
        a(MimeTypes.BASE_TYPE_APPLICATION, "x-tar");
        a(MimeTypes.BASE_TYPE_APPLICATION, "font-woff");
        a(MimeTypes.BASE_TYPE_APPLICATION, "font-woff2");
        b(MimeTypes.BASE_TYPE_APPLICATION, "xhtml+xml");
        b(MimeTypes.BASE_TYPE_APPLICATION, "xrd+xml");
        a(MimeTypes.BASE_TYPE_APPLICATION, "zip");
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        j = new ri(new rv0("; "), 4);
    }

    public f41(String str, String str2, bt0 bt0Var) {
        this.a = str;
        this.b = str2;
        this.c = bt0Var;
    }

    public static void a(String str, String str2) {
        f41 f41Var = new f41(str, str2, vf0.h);
        h.put(f41Var, f41Var);
    }

    public static f41 b(String str, String str2) {
        f41 f41Var = new f41(str, str2, f);
        h.put(f41Var, f41Var);
        StandardCharsets.UTF_8.getClass();
        return f41Var;
    }

    public final p31 c() {
        return new p31(this.c.b(), new ri(new zm(24), 6));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f41)) {
            return false;
        }
        f41 f41Var = (f41) obj;
        return this.a.equals(f41Var.a) && this.b.equals(f41Var.b) && c().equals(f41Var.c());
    }

    public final int hashCode() {
        int i2 = this.e;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(new Object[]{this.a, this.b, c()});
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('/');
        sb.append(this.b);
        bt0 bt0Var = this.c;
        if (!bt0Var.isEmpty()) {
            sb.append("; ");
            Collection collectionA = new g61(bt0Var, new ri(new zm(23), 6)).a();
            ri riVar = j;
            riVar.getClass();
            try {
                riVar.i(sb, collectionA.iterator());
            } catch (IOException e) {
                lm.d(e);
                return null;
            }
        }
        String string = sb.toString();
        this.d = string;
        return string;
    }
}
