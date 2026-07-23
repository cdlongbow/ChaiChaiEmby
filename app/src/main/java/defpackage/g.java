package defpackage;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends Modifier.Node implements DrawModifierNode, LayoutModifierNode, SemanticsModifierNode {
    public Alignment a;
    public ContentScale b;
    public float c;
    public ColorFilter d;
    public boolean e;
    public String g;
    public mu h;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        String str = this.g;
        if (str != null) {
            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
            SemanticsPropertiesKt.m7067setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7052getImageo7Vup1c());
        }
    }

    /* JADX INFO: renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    public final long m8810calculateScaledSizeE7KxVPU(long j) {
        if (Size.m4983isEmptyimpl(j)) {
            return Size.INSTANCE.m4990getZeroNHjbRc();
        }
        long intrinsicSize = ((yu) this).i.getIntrinsicSize();
        if (intrinsicSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return j;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (intrinsicSize >> 32));
        if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (intrinsicSize & 4294967295L));
        if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        long jM4972constructorimpl = Size.m4972constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        long jMo6502computeScaleFactorH7hwNQA = this.b.mo6502computeScaleFactorH7hwNQA(jM4972constructorimpl, j);
        return (Math.abs(Float.intBitsToFloat((int) (jMo6502computeScaleFactorH7hwNQA >> 32))) > Float.MAX_VALUE || Math.abs(Float.intBitsToFloat((int) (4294967295L & jMo6502computeScaleFactorH7hwNQA))) > Float.MAX_VALUE) ? j : ScaleFactorKt.m6622timesmw2e94(jMo6502computeScaleFactorH7hwNQA, jM4972constructorimpl);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope) {
        long jM8810calculateScaledSizeE7KxVPU = m8810calculateScaledSizeE7KxVPU(contentDrawScope.mo5620getSizeNHjbRc());
        long jMo4618alignKFBX0sM = this.a.mo4618alignKFBX0sM(be2.d(jM8810calculateScaledSizeE7KxVPU), be2.d(contentDrawScope.mo5620getSizeNHjbRc()), contentDrawScope.getLayoutDirection());
        int iM7937getXimpl = IntOffset.m7937getXimpl(jMo4618alignKFBX0sM);
        int iM7938getYimpl = IntOffset.m7938getYimpl(jMo4618alignKFBX0sM);
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long jMo5627getSizeNHjbRc = drawContext.mo5627getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            if (this.e) {
                kb0.a(transform, 0.0f, 0.0f, 0.0f, 0.0f, 0, 31, null);
            }
            transform.translate(iM7937getXimpl, iM7938getYimpl);
            ((yu) this).i.m5771drawx_KDEd0(contentDrawScope, jM8810calculateScaledSizeE7KxVPU, this.c, this.d);
            drawContext.getCanvas().restore();
            drawContext.mo5628setSizeuvyYCjk(jMo5627getSizeNHjbRc);
            contentDrawScope.drawContent();
        } catch (Throwable th) {
            s01.B(drawContext, jMo5627getSizeNHjbRc);
            throw th;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: getShouldClearDescendantSemantics */
    public final /* synthetic */ boolean getIsClearingSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: isImportantForBounds */
    public final /* synthetic */ boolean getIsImportantForBounds() {
        return true;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null);
        mu muVar = this.h;
        if (muVar != null) {
            muVar.b(jConstraints$default);
        }
        if (((yu) this).i.getIntrinsicSize() == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        long jM8811modifyConstraintsZezNO4M = m8811modifyConstraintsZezNO4M(jConstraints$default);
        return Math.max(Constraints.m7779getMinHeightimpl(jM8811modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null);
        mu muVar = this.h;
        if (muVar != null) {
            muVar.b(jConstraints$default);
        }
        if (((yu) this).i.getIntrinsicSize() == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }
        long jM8811modifyConstraintsZezNO4M = m8811modifyConstraintsZezNO4M(jConstraints$default);
        return Math.max(Constraints.m7780getMinWidthimpl(jM8811modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo58measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        mu muVar = this.h;
        if (muVar != null) {
            muVar.b(j);
        }
        Placeable placeableMo6509measureBRTryo0 = measurable.mo6509measureBRTryo0(m8811modifyConstraintsZezNO4M(j));
        return s01.m(measureScope, placeableMo6509measureBRTryo0.getWidth(), placeableMo6509measureBRTryo0.getHeight(), null, new f(0, placeableMo6509measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null);
        mu muVar = this.h;
        if (muVar != null) {
            muVar.b(jConstraints$default);
        }
        if (((yu) this).i.getIntrinsicSize() == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        long jM8811modifyConstraintsZezNO4M = m8811modifyConstraintsZezNO4M(jConstraints$default);
        return Math.max(Constraints.m7779getMinHeightimpl(jM8811modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null);
        mu muVar = this.h;
        if (muVar != null) {
            muVar.b(jConstraints$default);
        }
        if (((yu) this).i.getIntrinsicSize() == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        long jM8811modifyConstraintsZezNO4M = m8811modifyConstraintsZezNO4M(jConstraints$default);
        return Math.max(Constraints.m7780getMinWidthimpl(jM8811modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i));
    }

    /* JADX INFO: renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    public final long m8811modifyConstraintsZezNO4M(long j) {
        float fM7780getMinWidthimpl;
        int iM7779getMinHeightimpl;
        float fCoerceIn;
        boolean zM7776getHasFixedWidthimpl = Constraints.m7776getHasFixedWidthimpl(j);
        boolean zM7775getHasFixedHeightimpl = Constraints.m7775getHasFixedHeightimpl(j);
        if (!zM7776getHasFixedWidthimpl || !zM7775getHasFixedHeightimpl) {
            yu yuVar = (yu) this;
            boolean z = Constraints.m7774getHasBoundedWidthimpl(j) && Constraints.m7773getHasBoundedHeightimpl(j);
            kf kfVar = yuVar.i;
            long intrinsicSize = kfVar.getIntrinsicSize();
            if (intrinsicSize != InlineClassHelperKt.UnspecifiedPackedFloats) {
                if (!z || (!zM7776getHasFixedWidthimpl && !zM7775getHasFixedHeightimpl)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (intrinsicSize >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (intrinsicSize & 4294967295L));
                    if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                        int i = be2.b;
                        fM7780getMinWidthimpl = RangesKt.coerceIn(fIntBitsToFloat, Constraints.m7780getMinWidthimpl(j), Constraints.m7778getMaxWidthimpl(j));
                    } else {
                        fM7780getMinWidthimpl = Constraints.m7780getMinWidthimpl(j);
                    }
                    if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                        int i2 = be2.b;
                        fCoerceIn = RangesKt.coerceIn(fIntBitsToFloat2, Constraints.m7779getMinHeightimpl(j), Constraints.m7777getMaxHeightimpl(j));
                    } else {
                        iM7779getMinHeightimpl = Constraints.m7779getMinHeightimpl(j);
                    }
                    long jM8810calculateScaledSizeE7KxVPU = m8810calculateScaledSizeE7KxVPU(Size.m4972constructorimpl((((long) Float.floatToRawIntBits(fCoerceIn)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM7780getMinWidthimpl)) << 32)));
                    return Constraints.m7768copyZbe2FdA$default(j, ConstraintsKt.m7795constrainWidthK40F9xA(j, MathKt.roundToInt(Float.intBitsToFloat((int) (jM8810calculateScaledSizeE7KxVPU >> 32)))), 0, ConstraintsKt.m7794constrainHeightK40F9xA(j, MathKt.roundToInt(Float.intBitsToFloat((int) (jM8810calculateScaledSizeE7KxVPU & 4294967295L)))), 0, 10, null);
                }
                fM7780getMinWidthimpl = Constraints.m7778getMaxWidthimpl(j);
                iM7779getMinHeightimpl = Constraints.m7777getMaxHeightimpl(j);
                fCoerceIn = iM7779getMinHeightimpl;
                long jM8810calculateScaledSizeE7KxVPU2 = m8810calculateScaledSizeE7KxVPU(Size.m4972constructorimpl((((long) Float.floatToRawIntBits(fCoerceIn)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM7780getMinWidthimpl)) << 32)));
                return Constraints.m7768copyZbe2FdA$default(j, ConstraintsKt.m7795constrainWidthK40F9xA(j, MathKt.roundToInt(Float.intBitsToFloat((int) (jM8810calculateScaledSizeE7KxVPU2 >> 32)))), 0, ConstraintsKt.m7794constrainHeightK40F9xA(j, MathKt.roundToInt(Float.intBitsToFloat((int) (jM8810calculateScaledSizeE7KxVPU2 & 4294967295L)))), 0, 10, null);
            }
            if (z && ((jf) kfVar.r.getValue()).a() != null) {
                return Constraints.m7768copyZbe2FdA$default(j, Constraints.m7778getMaxWidthimpl(j), 0, Constraints.m7777getMaxHeightimpl(j), 0, 10, null);
            }
        }
        return j;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final /* synthetic */ void onMeasureResultChanged() {
    }
}
