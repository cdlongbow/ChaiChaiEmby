package defpackage;

import android.util.Log;
import androidx.compose.foundation.text.selection.SelectableInfo;
import androidx.compose.foundation.text.selection.SelectionAdjustmentKt;
import androidx.compose.foundation.text.selection.SelectionLayout;
import androidx.compose.runtime.MutableState;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jf1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ jf1(int i, Object obj, int i2, Object obj2, int i3, Object obj3) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
        this.e = obj2;
        this.g = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.g;
        Object obj2 = this.e;
        int i2 = this.c;
        int i3 = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj;
                Log.d("SubtitleSettings", "保存延迟: " + ((Number) mutableState.getValue()).floatValue());
                ((jk1) obj3).invoke(Float.valueOf(((Number) mutableState.getValue()).floatValue()), Integer.valueOf(i3), Integer.valueOf(i2));
                ((Function0) obj2).invoke();
                return Unit.INSTANCE;
            default:
                return SelectionAdjustmentKt.updateSelectionBoundary$lambda$2((SelectableInfo) obj3, i3, i2, (SelectionLayout) obj2, (Lazy) obj);
        }
    }
}
