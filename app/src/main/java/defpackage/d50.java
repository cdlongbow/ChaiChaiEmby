package defpackage;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d50 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableIntState d;

    public /* synthetic */ d50(MutableState mutableState, MutableState mutableState2, MutableIntState mutableIntState, int i) {
        this.a = i;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MutableIntState mutableIntState = this.d;
        MutableState mutableState = this.c;
        MutableState mutableState2 = this.b;
        switch (i) {
            case 0:
                u90.i0(mutableState2, mutableState, mutableIntState, v51.c);
                break;
            case 1:
                u90.i0(mutableState2, mutableState, mutableIntState, v51.a);
                break;
            case 2:
                u90.i0(mutableState2, mutableState, mutableIntState, v51.b);
                break;
            case 3:
                u90.O(mutableState2, mutableState, mutableIntState, v51.a);
                break;
            case 4:
                u90.O(mutableState2, mutableState, mutableIntState, v51.b);
                break;
            default:
                u90.O(mutableState2, mutableState, mutableIntState, v51.c);
                break;
        }
        return Unit.INSTANCE;
    }
}
