package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.SubtitlePreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bi1 implements Function1 {
    public final /* synthetic */ h42 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ eo1 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ SubtitlePreferences g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Context j;
    public final /* synthetic */ to1 k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ on1 m;
    public final /* synthetic */ ln1 n;

    public /* synthetic */ bi1(h42 h42Var, int i, boolean z, eo1 eo1Var, Function0 function0, SubtitlePreferences subtitlePreferences, MutableState mutableState, Function0 function1, Context context, to1 to1Var, MutableState mutableState2, on1 on1Var, ln1 ln1Var) {
        this.a = h42Var;
        this.b = i;
        this.c = z;
        this.d = eo1Var;
        this.e = function0;
        this.g = subtitlePreferences;
        this.h = mutableState;
        this.i = function1;
        this.j = context;
        this.k = to1Var;
        this.l = mutableState2;
        this.m = on1Var;
        this.n = ln1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dn1.c0(this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.a, this.b, this.c, (Long) obj);
        return Unit.INSTANCE;
    }
}
