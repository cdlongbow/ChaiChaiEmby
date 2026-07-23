package defpackage;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zt1 implements DoubleFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferParameters b;

    public /* synthetic */ zt1(TransferParameters transferParameters, int i) {
        this.a = i;
        this.b = transferParameters;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        int i = this.a;
        TransferParameters transferParameters = this.b;
        switch (i) {
            case 0:
                return Rgb.Companion.generateEotf$lambda$0(transferParameters, d);
            case 1:
                return Rgb.Companion.generateEotf$lambda$1(transferParameters, d);
            case 2:
                return Rgb.Companion.generateEotf$lambda$2(transferParameters, d);
            case 3:
                return Rgb.Companion.generateEotf$lambda$3(transferParameters, d);
            case 4:
                return Rgb.Companion.generateOetf$lambda$0(transferParameters, d);
            case 5:
                return Rgb.Companion.generateOetf$lambda$1(transferParameters, d);
            case 6:
                return Rgb.Companion.generateOetf$lambda$2(transferParameters, d);
            default:
                return Rgb.Companion.generateOetf$lambda$3(transferParameters, d);
        }
    }
}
