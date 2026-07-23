package defpackage;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxu;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lyu;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class xu extends ModifierNodeElement<yu> {
    public final fs0 a;
    public final ks1 b;
    public final cf c;
    public final Function1 d;
    public final Function1 e;
    public final int g;
    public final Alignment h;
    public final ContentScale i;
    public final float j;
    public final ColorFilter k;
    public final boolean l;
    public final of m;
    public final String n;

    public xu(fs0 fs0Var, ks1 ks1Var, cf cfVar, Function1 function1, Function1 function2, int i, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, boolean z, of ofVar, String str) {
        this.a = fs0Var;
        this.b = ks1Var;
        this.c = cfVar;
        this.d = function1;
        this.e = function2;
        this.g = i;
        this.h = alignment;
        this.i = contentScale;
        this.j = f;
        this.k = colorFilter;
        this.l = z;
        this.m = ofVar;
        this.n = str;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: create */
    public final Modifier.Node getNode() {
        cf cfVar = this.c;
        ks1 ks1Var = this.b;
        fs0 fs0Var = this.a;
        df dfVar = new df(ks1Var, fs0Var, cfVar);
        kf kfVar = new kf(dfVar);
        kfVar.i = this.d;
        kfVar.j = this.e;
        kfVar.k = this.i;
        kfVar.l = this.g;
        kfVar.m = this.m;
        kfVar.e(dfVar);
        o12 o12Var = fs0Var.p;
        return new yu(kfVar, this.h, this.i, this.j, this.k, this.l, this.n, o12Var instanceof mu ? (mu) o12Var : null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu)) {
            return false;
        }
        xu xuVar = (xu) obj;
        return Intrinsics.areEqual(this.a, xuVar.a) && Intrinsics.areEqual(this.b, xuVar.b) && Intrinsics.areEqual(this.c, xuVar.c) && Intrinsics.areEqual(this.d, xuVar.d) && Intrinsics.areEqual(this.e, xuVar.e) && FilterQuality.m5247equalsimpl0(this.g, xuVar.g) && Intrinsics.areEqual(this.h, xuVar.h) && Intrinsics.areEqual(this.i, xuVar.i) && Float.compare(this.j, xuVar.j) == 0 && Intrinsics.areEqual(this.k, xuVar.k) && this.l == xuVar.l && Intrinsics.areEqual(this.m, xuVar.m) && Intrinsics.areEqual(this.n, xuVar.n);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iD = wn.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        Function1 function1 = this.e;
        int iE = qi0.e(this.j, (this.i.hashCode() + ((this.h.hashCode() + ((FilterQuality.m5248hashCodeimpl(this.g) + ((iD + (function1 == null ? 0 : function1.hashCode())) * 31)) * 31)) * 31)) * 31, 31);
        ColorFilter colorFilter = this.k;
        int iHashCode = (((iE + (colorFilter == null ? 0 : colorFilter.hashCode())) * 31) + (this.l ? 1231 : 1237)) * 31;
        of ofVar = this.m;
        int iHashCode2 = (iHashCode + (ofVar == null ? 0 : ofVar.hashCode())) * 31;
        String str = this.n;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("content");
        inspectorInfo.getProperties().set("request", this.a);
        inspectorInfo.getProperties().set("imageLoader", this.b);
        inspectorInfo.getProperties().set("modelEqualityDelegate", this.c);
        inspectorInfo.getProperties().set("transform", this.d);
        inspectorInfo.getProperties().set("onState", this.e);
        inspectorInfo.getProperties().set("filterQuality", FilterQuality.m5244boximpl(this.g));
        inspectorInfo.getProperties().set("alignment", this.h);
        inspectorInfo.getProperties().set("contentScale", this.i);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.j));
        inspectorInfo.getProperties().set("colorFilter", this.k);
        wn.g(this.l, inspectorInfo.getProperties(), "clipToBounds", inspectorInfo).set("previewHandler", this.m);
        inspectorInfo.getProperties().set("contentDescription", this.n);
    }

    public final String toString() {
        String strM5249toStringimpl = FilterQuality.m5249toStringimpl(this.g);
        StringBuilder sb = new StringBuilder("ContentPainterElement(request=");
        sb.append(this.a);
        sb.append(", imageLoader=");
        sb.append(this.b);
        sb.append(", modelEqualityDelegate=");
        sb.append(this.c);
        sb.append(", transform=");
        sb.append(this.d);
        sb.append(", onState=");
        sb.append(this.e);
        sb.append(", filterQuality=");
        sb.append(strM5249toStringimpl);
        sb.append(", alignment=");
        sb.append(this.h);
        sb.append(", contentScale=");
        sb.append(this.i);
        sb.append(", alpha=");
        sb.append(this.j);
        sb.append(", colorFilter=");
        sb.append(this.k);
        sb.append(", clipToBounds=");
        sb.append(this.l);
        sb.append(", previewHandler=");
        sb.append(this.m);
        sb.append(", contentDescription=");
        return s01.w(sb, this.n, ")");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        yu yuVar = (yu) node;
        long intrinsicSize = yuVar.i.getIntrinsicSize();
        mu muVar = yuVar.h;
        cf cfVar = this.c;
        ks1 ks1Var = this.b;
        fs0 fs0Var = this.a;
        df dfVar = new df(ks1Var, fs0Var, cfVar);
        kf kfVar = yuVar.i;
        kfVar.i = this.d;
        kfVar.j = this.e;
        ContentScale contentScale = this.i;
        kfVar.k = contentScale;
        kfVar.l = this.g;
        kfVar.m = this.m;
        kfVar.e(dfVar);
        boolean zM4977equalsimpl0 = Size.m4977equalsimpl0(intrinsicSize, kfVar.getIntrinsicSize());
        yuVar.a = this.h;
        o12 o12Var = fs0Var.p;
        yuVar.h = o12Var instanceof mu ? (mu) o12Var : null;
        yuVar.b = contentScale;
        yuVar.c = this.j;
        yuVar.d = this.k;
        yuVar.e = this.l;
        String str = yuVar.g;
        String str2 = this.n;
        if (!Intrinsics.areEqual(str, str2)) {
            yuVar.g = str2;
            SemanticsModifierNodeKt.invalidateSemantics(yuVar);
        }
        boolean zAreEqual = Intrinsics.areEqual(muVar, yuVar.h);
        if (!zM4977equalsimpl0 || !zAreEqual) {
            LayoutModifierNodeKt.invalidateMeasurement(yuVar);
        }
        DrawModifierNodeKt.invalidateDraw(yuVar);
    }
}
