package defpackage;
import com.badlogic.gdx.utils.Bits;
import com.badlogic.gdx.utils.ObjectMap;

import androidx.media3.extractor.metadata.icy.IcyHeaders;



/* JADX INFO: loaded from: classes4.dex */
public final class ri0 {
    public static final ObjectMap e = new ObjectMap();
    public static int f = 0;
    public static final rr0 g;
    public static final Bits h;
    public final Bits a;
    public final Bits b;
    public final Bits c;
    public final int d;

    static {
        rr0 rr0Var = new rr0();
        Bits bits = h;
        rr0Var.b = bits;
        rr0Var.c = bits;
        rr0Var.d = bits;
        g = rr0Var;
        h = new Bits();
    }

    public ri0(Bits bits, Bits bits2, Bits bits3) {
        this.a = bits;
        this.b = bits2;
        this.c = bits3;
        int i = f;
        f = i + 1;
        this.d = i;
    }

    public static String a(Bits bits) {
        StringBuilder sb = new StringBuilder();
        int length = bits.length();
        for (int i = 0; i < length; i++) {
            sb.append(bits.get(i) ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

}
