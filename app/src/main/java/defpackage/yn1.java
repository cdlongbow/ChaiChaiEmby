package defpackage;

import android.content.Context;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaStream;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class yn1 {
    public final Context a;
    public final CoroutineScope b;
    public final Function0 c;
    public final Function0 d;
    public final Function0 e;
    public final Function0 f;
    public final Function0 g;
    public final wm1 h;
    public final Function1 i;
    public final ym1 j;
    public final Function0 k;
    public final Function1 l;
    public final Function1 m;
    public final Function3 n;

    public yn1(Context context, CoroutineScope coroutineScope, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, wm1 wm1Var, Function1 function5, ym1 ym1Var, Function0 function6, Function1 function7, Function1 function8, Function3 function9) {
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        function8.getClass();
        function9.getClass();
        this.a = context;
        this.b = coroutineScope;
        this.c = function0;
        this.d = function1;
        this.e = function2;
        this.f = function3;
        this.g = function4;
        this.h = wm1Var;
        this.i = function5;
        this.j = ym1Var;
        this.k = function6;
        this.l = function7;
        this.m = function8;
        this.n = function9;
    }

    public final void a(TranscodeQualityOption transcodeQualityOption) {
        String id;
        String str = (String) this.c.invoke();
        String str2 = (String) this.e.invoke();
        Integer num = (Integer) this.h.invoke();
        Integer num2 = (Integer) this.i.invoke(Boolean.TRUE);
        long jLongValue = ((Number) this.g.invoke()).longValue();
        MediaSource mediaSource = (MediaSource) this.f.invoke();
        str.getClass();
        zn1 zn1Var = null;
        MediaStream mediaStreamV = num2 != null ? ku.v(mediaSource, num2.intValue()) : null;
        bo1 bo1Var = new bo1(str, str2, transcodeQualityOption, num, num2, jLongValue);
        if (mediaStreamV != null) {
            if (!in1.g(mediaStreamV)) {
                mediaStreamV = null;
            }
            if (mediaStreamV != null) {
                if (mediaSource == null || (id = mediaSource.getId()) == null) {
                    id = str2 == null ? str : str2;
                }
                zn1Var = new zn1(str, id, mediaStreamV);
            }
        }
        zn1 zn1Var2 = zn1Var;
        ao1 ao1Var = new ao1(bo1Var, zn1Var2);
        this.j.invoke();
        d6 d6Var = new d6(1, this, yn1.class, "showToast", "showToast(Ljava/lang/String;)V", 0, 29);
        Function1 function1 = this.l;
        function1.getClass();
        Function1 function2 = this.m;
        function2.getClass();
        if (zn1Var2 == null) {
            function2.invoke(bo1Var);
        } else {
            ku.o(this.b, this.a, zn1Var2, d6Var, function1, new a2(21, function2, ao1Var), new jx0(24, function2, ao1Var));
        }
    }
}
