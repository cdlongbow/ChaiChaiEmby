package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class f31 extends MetricAffectingSpan {
    public final Typeface a;

    public f31(Typeface typeface) {
        typeface.getClass();
        this.a = typeface;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    public final void a(TextPaint textPaint) {
        int i;
        Typeface typeface = textPaint.getTypeface();
        Integer numValueOf = typeface != null ? Integer.valueOf(typeface.getStyle()) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            i = 1;
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            i = 2;
        } else if (numValueOf == null) {
            i = 0;
        } else {
            i = 3;
            if (numValueOf.intValue() != 3) {
                i = 0;
            }
        }
        Typeface typefaceCreate = Typeface.create(this.a, i);
        int i2 = (~typefaceCreate.getStyle()) & i;
        textPaint.setTypeface(typefaceCreate);
        textPaint.setFakeBoldText(textPaint.isFakeBoldText() || (i2 & 1) != 0);
        if ((i2 & 2) != 0) {
            textPaint.setTextSkewX(-0.25f);
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.getClass();
        a(textPaint);
    }
}
