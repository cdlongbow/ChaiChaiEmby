package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class og0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ og0(int i, String str, pg0 pg0Var) {
        this.a = 0;
        this.b = i;
        this.c = str;
        this.d = pg0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj2;
                pg0 pg0Var = (pg0) obj;
                lw1[] lw1VarArr = new lw1[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    String str2 = str + '.' + pg0Var.e[i3];
                    l32 l32Var = l32.h;
                    lw1[] lw1VarArr2 = new lw1[0];
                    if (StringsKt.isBlank(str2)) {
                        ra.q("Blank serial names are prohibited");
                    } else if (Intrinsics.areEqual(l32Var, l32.e)) {
                        ra.q("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                    } else {
                        wp wpVar = new wp(str2);
                        Unit unit = Unit.INSTANCE;
                        lw1VarArr[i3] = new nw1(str2, l32Var, wpVar.c.size(), ArraysKt.toList(lw1VarArr2), wpVar);
                    }
                    return null;
                }
                return lw1VarArr;
            case 1:
                MediaItem mediaItem = (MediaItem) obj2;
                Function3 function3 = (Function3) obj;
                String seriesId = mediaItem.getSeriesId();
                if (seriesId == null) {
                    seriesId = mediaItem.getId();
                }
                function3.invoke(seriesId, mediaItem.getId(), Integer.valueOf(i2));
                return Unit.INSTANCE;
            case 2:
                return Http2Connection.pushRequestLater$lambda$1((Http2Connection) obj2, i2, (List) obj);
            default:
                return ((Regex) obj2).find((CharSequence) obj, i2);
        }
    }

    public /* synthetic */ og0(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public /* synthetic */ og0(Http2Connection http2Connection, int i, List list) {
        this.a = 2;
        this.c = http2Connection;
        this.b = i;
        this.d = list;
    }
}
