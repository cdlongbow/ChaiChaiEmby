package defpackage;

import androidx.activity.result.ActivityResultCallback;
import androidx.compose.foundation.layout.AlignmentLineProviderBlock;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.ResolvedFlexBoxConfig;
import androidx.compose.foundation.layout.ResolvedFlexItemInfo;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.layout.Measured;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 implements ActivityResultCallback, AlignmentLineProviderBlock, DoubleFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ h1(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // androidx.compose.foundation.layout.AlignmentLineProviderBlock
    public int calculateAlignmentLinePosition(Measured measured) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 2:
                return ColumnScopeInstance.alignBy$lambda$0(function1, measured);
            case 3:
                return ResolvedFlexBoxConfig.alignItems$lambda$0(function1, measured);
            case 4:
                return ResolvedFlexItemInfo.alignSelf$lambda$0(function1, measured);
            default:
                return RowScopeInstance.alignBy$lambda$0(function1, measured);
        }
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 5:
                return Rgb._init_$lambda$0(function1, d);
            case 6:
                return Rgb._init_$lambda$1(function1, d);
            case 7:
                return Rgb._init_$lambda$2(function1, d);
            default:
                return Rgb._init_$lambda$3(function1, d);
        }
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(obj);
                break;
            default:
                function1.invoke(obj);
                break;
        }
    }
}
