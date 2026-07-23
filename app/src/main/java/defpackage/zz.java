package defpackage;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class zz implements Function1 {
    public static final zz a = new zz();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        drawScope.getClass();
        PathEffect pathEffectDashPathEffect = PathEffect.INSTANCE.dashPathEffect(new float[]{12.0f, 8.0f}, 0.0f);
        pc0.g(drawScope, Color.m5151copywmQWz5c$default(Color.INSTANCE.m5182getGray0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4904constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), Offset.m4904constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5620getSizeNHjbRc() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(0.0f)))), 2.0f, 0, pathEffectDashPathEffect, 0.0f, null, 0, 464, null);
        return Unit.INSTANCE;
    }
}
