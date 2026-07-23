package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yy implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ yy(float f, Function1 function1, int i) {
        this.a = i;
        this.b = f;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                function1.invoke(Float.valueOf(((float) Math.rint(RangesKt.coerceAtLeast(f - 0.05f, 0.05f) / 0.05f)) * 0.05f));
                break;
            case 1:
                function1.invoke(Float.valueOf(((float) Math.rint(RangesKt.coerceAtMost(f + 0.05f, 1.0f) / 0.05f)) * 0.05f));
                break;
            case 2:
                function1.invoke(Float.valueOf(RangesKt.coerceAtLeast(f - 0.1f, -10.0f)));
                break;
            default:
                function1.invoke(Float.valueOf(RangesKt.coerceAtMost(f + 0.1f, 10.0f)));
                break;
        }
        return Unit.INSTANCE;
    }
}
