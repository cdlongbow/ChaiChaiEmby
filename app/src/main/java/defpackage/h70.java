package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import com.dh.myembyapp.data.model.Library;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h70 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ h70(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x019f  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bitmap bitmapCreateBitmap;
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                mutableState.setValue(str);
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                mutableState.setValue(str2);
                return Unit.INSTANCE;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mutableState.setValue(bool);
                return Unit.INSTANCE;
            case 3:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                mutableState.setValue(LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates, false, 1, null));
                return Unit.INSTANCE;
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mutableState.setValue(bool2);
                return Unit.INSTANCE;
            case 5:
                hf hfVar = (hf) obj;
                hfVar.getClass();
                pr0 pr0Var = hfVar.b.a;
                int width = pr0Var.getWidth();
                int height = pr0Var.getHeight();
                boolean z = pr0Var instanceof nl;
                Bitmap.Config config = z ? ((nl) pr0Var).a.getConfig() : null;
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (z) {
                    bitmapCreateBitmap = ((nl) pr0Var).a;
                    if (bitmapCreateBitmap.getWidth() != width || bitmapCreateBitmap.getHeight() != height || bitmapCreateBitmap.getConfig() != config) {
                        bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
                        pr0Var.b(new Canvas(bitmapCreateBitmap));
                    }
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
                    pr0Var.b(new Canvas(bitmapCreateBitmap));
                }
                try {
                    int width2 = bitmapCreateBitmap.getWidth();
                    int height2 = bitmapCreateBitmap.getHeight();
                    int i2 = (int) (((double) height2) * 0.85d);
                    int i3 = height2 - 1;
                    int iCoerceIn = RangesKt.coerceIn(i2, 0, i3);
                    int i4 = 0;
                    int iRed = 0;
                    int iGreen = 0;
                    int iBlue = 0;
                    for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Integer.valueOf(width2 / 4), Integer.valueOf(iCoerceIn)), TuplesKt.to(Integer.valueOf(width2 / 2), Integer.valueOf(iCoerceIn)), TuplesKt.to(Integer.valueOf((width2 * 3) / 4), Integer.valueOf(iCoerceIn))})) {
                        int pixel = bitmapCreateBitmap.getPixel(RangesKt.coerceIn(((Number) pair.component1()).intValue(), 0, width2 - 1), RangesKt.coerceIn(((Number) pair.component2()).intValue(), 0, i3));
                        iRed += Color.red(pixel);
                        iGreen += Color.green(pixel);
                        iBlue += Color.blue(pixel);
                        i4++;
                    }
                    if (i4 > 0) {
                        mutableState.setValue(androidx.compose.ui.graphics.Color.m5142boximpl(ColorKt.Color$default(RangesKt.coerceIn((int) (((double) (iRed / i4)) * 0.7d), 0, 255), RangesKt.coerceIn((int) (((double) (iGreen / i4)) * 0.7d), 0, 255), RangesKt.coerceIn((int) (((double) (iBlue / i4)) * 0.7d), 0, 255), 0, 8, null)));
                    }
                    break;
                } catch (Exception unused) {
                }
                return Unit.INSTANCE;
            case 6:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                mutableState.setValue(bool3);
                return Unit.INSTANCE;
            case 7:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                mutableState.setValue(bool4);
                return Unit.INSTANCE;
            case 8:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 9:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 10:
                String str3 = (String) obj;
                str3.getClass();
                mutableState.setValue(str3);
                return Unit.INSTANCE;
            case 11:
                ((hf) obj).getClass();
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 12:
                ((ff) obj).getClass();
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 13:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                if (!focusState.getHasFocus()) {
                    vj0.g(mutableState, false);
                }
                return Unit.INSTANCE;
            case 14:
                FocusState focusState2 = (FocusState) obj;
                focusState2.getClass();
                mutableState.setValue(Boolean.valueOf(focusState2.getHasFocus()));
                return Unit.INSTANCE;
            case 15:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 16:
                FocusState focusState3 = (FocusState) obj;
                focusState3.getClass();
                mutableState.setValue(Boolean.valueOf(focusState3.getHasFocus()));
                return Unit.INSTANCE;
            case 17:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 18:
                FocusState focusState4 = (FocusState) obj;
                focusState4.getClass();
                mutableState.setValue(Boolean.valueOf(focusState4.getHasFocus()));
                return Unit.INSTANCE;
            case 19:
                bq0.o(mutableState, ((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 20:
                mutableState.setValue((String) obj);
                return Unit.INSTANCE;
            case 21:
                bq0.o(mutableState, ((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 22:
                rn0 rn0Var = (rn0) obj;
                rn0Var.getClass();
                mutableState.setValue(rn0Var);
                return Unit.INSTANCE;
            case 23:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                mutableState.setValue(bool5);
                return Unit.INSTANCE;
            case 24:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 25:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 26:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 27:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 28:
                return ((Library) ((List) mutableState.getValue()).get(((Integer) obj).intValue())).getId();
            default:
                FocusState focusState5 = (FocusState) obj;
                focusState5.getClass();
                mutableState.setValue(Boolean.valueOf(focusState5.getHasFocus()));
                return Unit.INSTANCE;
        }
    }
}
