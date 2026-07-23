package defpackage;

import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uy implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ uy(int i, Function1 function1, int i2) {
        this.a = i2;
        this.b = i;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = this.b;
        Function1 function1 = this.c;
        switch (i) {
            case 0:
                function1.invoke(Float.valueOf(RangesKt.coerceAtLeast(i2 - 1, 5) / 10.0f));
                break;
            case 1:
                function1.invoke(Float.valueOf(RangesKt.coerceAtMost(i2 + 1, 30) / 10.0f));
                break;
            case 2:
                function1.invoke(Integer.valueOf(RangesKt.coerceAtLeast(i2 - 5, 0)));
                break;
            case 3:
                function1.invoke(Integer.valueOf(RangesKt.coerceAtMost(i2 + 5, 100)));
                break;
            case 4:
                function1.invoke(Float.valueOf(RangesKt.coerceAtLeast(i2 - 1, 3) / 10.0f));
                break;
            case 5:
                function1.invoke(Float.valueOf(RangesKt.coerceAtMost(i2 + 1, 20) / 10.0f));
                break;
            case 6:
                function1.invoke(Integer.valueOf(RangesKt.coerceAtLeast(i2 - 1, -600)));
                break;
            case 7:
                function1.invoke(Integer.valueOf(RangesKt.coerceAtMost(i2 + 1, 600)));
                break;
            case 8:
                function1.invoke(Integer.valueOf(RangesKt.coerceAtLeast(i2 - 5, 5)));
                break;
            case 9:
                function1.invoke(Integer.valueOf(RangesKt.coerceAtMost(i2 + 5, 60)));
                break;
            case 10:
                function1.invoke(Integer.valueOf(UserPreferences.INSTANCE.normalizeAudioDelayMs(i2 - 100)));
                break;
            case 11:
                function1.invoke(Integer.valueOf(UserPreferences.INSTANCE.normalizeAudioDelayMs(i2 + 100)));
                break;
            case 12:
                function1.invoke(Integer.valueOf(RangesKt.coerceAtLeast(i2 - 10, 50)));
                break;
            case 13:
                function1.invoke(Integer.valueOf(RangesKt.coerceAtMost(i2 + 10, 200)));
                break;
            case 14:
                function1.invoke(Integer.valueOf(RangesKt.coerceAtLeast(i2 - 5, 5)));
                break;
            case 15:
                function1.invoke(Integer.valueOf(RangesKt.coerceAtMost(i2 + 5, 100)));
                break;
            case 16:
                function1.invoke(Integer.valueOf(i2 - 1));
                break;
            case 17:
                qi0.m(i2, 1, function1);
                break;
            case 18:
                function1.invoke(Integer.valueOf(RangesKt.coerceAtLeast(i2 - 10, 10)));
                break;
            default:
                function1.invoke(Integer.valueOf(RangesKt.coerceAtMost(i2 + 10, 300)));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ uy(Function1 function1, int i, int i2) {
        this.a = i2;
        this.c = function1;
        this.b = i;
    }
}
