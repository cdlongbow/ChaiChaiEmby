package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function7;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ki1 implements Function7 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ to1 b;
    public final /* synthetic */ DefaultBandwidthMeter c;
    public final /* synthetic */ UserPreferences d;
    public final /* synthetic */ AtomicLong e;
    public final /* synthetic */ pn1 g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ on1 i;
    public final /* synthetic */ on1 j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ String[] l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;

    public /* synthetic */ ki1(Context context, to1 to1Var, DefaultBandwidthMeter defaultBandwidthMeter, UserPreferences userPreferences, AtomicLong atomicLong, pn1 pn1Var, MutableState mutableState, on1 on1Var, on1 on1Var2, MutableState mutableState2, String[] strArr, MutableState mutableState3, MutableState mutableState4) {
        this.a = context;
        this.b = to1Var;
        this.c = defaultBandwidthMeter;
        this.d = userPreferences;
        this.e = atomicLong;
        this.g = pn1Var;
        this.h = mutableState;
        this.i = on1Var;
        this.j = on1Var2;
        this.k = mutableState2;
        this.l = strArr;
        this.m = mutableState3;
        this.n = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        String str = (String) obj;
        String str2 = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        int iIntValue = ((Integer) obj4).intValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        int iIntValue2 = ((Integer) obj6).intValue();
        int iIntValue3 = ((Integer) obj7).intValue();
        str.getClass();
        str2.getClass();
        return dn1.d0(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, str, str2, zBooleanValue, iIntValue, zBooleanValue2, iIntValue2, iIntValue3);
    }
}
