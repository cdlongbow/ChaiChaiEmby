package defpackage;

import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dv implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ dv(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        long j = this.b;
        switch (i) {
            case 0:
                return IntOffset.m7928boximpl(j);
            default:
                return Long.valueOf(j);
        }
    }
}
