package defpackage;

import android.content.Context;
import android.view.WindowMetrics;
import androidx.window.reflection.Predicate2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fd0 implements Predicate2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ SplitRule c;

    public /* synthetic */ fd0(SplitRule splitRule, Context context, int i) {
        this.a = i;
        this.c = splitRule;
        this.b = context;
    }

    @Override // androidx.window.reflection.Predicate2
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return EmbeddingAdapter.translateSplitPinRule$lambda$8((SplitPinRule) this.c, this.b, (WindowMetrics) obj);
            case 1:
                return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$14((SplitPlaceholderRule) this.c, this.b, (WindowMetrics) obj);
            default:
                return EmbeddingAdapter.translateSplitPairRule$lambda$7((SplitPairRule) this.c, this.b, (WindowMetrics) obj);
        }
    }
}
