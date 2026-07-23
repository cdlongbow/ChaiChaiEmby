package defpackage;

import androidx.compose.foundation.text.input.internal.HandwritingGestureApi34;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ym0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref.IntRef b;
    public final /* synthetic */ Ref.IntRef c;

    public /* synthetic */ ym0(Ref.IntRef intRef, Ref.IntRef intRef2, int i) {
        this.a = i;
        this.b = intRef;
        this.c = intRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Ref.IntRef intRef = this.c;
        Ref.IntRef intRef2 = this.b;
        MatchResult matchResult = (MatchResult) obj;
        switch (i) {
            case 0:
                return HandwritingGestureApi34.performRemoveSpaceGesture$lambda$1(intRef2, intRef, matchResult);
            default:
                return HandwritingGestureApi34.performRemoveSpaceGesture$lambda$3(intRef2, intRef, matchResult);
        }
    }
}
