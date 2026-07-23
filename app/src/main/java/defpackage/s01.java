package defpackage;

import android.util.Log;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.DefaultIntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import androidx.compose.ui.layout.IntrinsicsMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.modifier.EmptyMap;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class s01 {
    public static void A(long j, String str, StringBuilder sb) {
        sb.append((Object) Color.m5160toStringimpl(j));
        sb.append(str);
    }

    public static void B(DrawContext drawContext, long j) {
        drawContext.getCanvas().restore();
        drawContext.mo5628setSizeuvyYCjk(j);
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void D(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    public static void E(String str, String str2, String str3, String str4, String str5) {
        Log.d(str5, str + str2 + str3 + str4);
    }

    public static float F(float f, float f2, float f3, float f4, float f5) {
        return f5 - (((f * f2) * f3) * f4);
    }

    public static List G(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void H(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static List I(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void J(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
    }

    public static void K(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void L(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static boolean a(Modifier.Element element, Function1 function1) {
        return ((Boolean) function1.invoke(element)).booleanValue();
    }

    public static boolean b(Modifier.Element element, Function1 function1) {
        return ((Boolean) function1.invoke(element)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    public static Object c(ModifierLocalModifierNode modifierLocalModifierNode, ModifierLocal modifierLocal) {
        NodeChain nodes;
        if (!modifierLocalModifierNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("ModifierLocal accessed from an unattached node");
        }
        int iM6807constructorimpl = NodeKind.m6807constructorimpl(32);
        if (!modifierLocalModifierNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = modifierLocalModifierNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(modifierLocalModifierNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((fl.b(layoutNodeRequireLayoutNode) & iM6807constructorimpl) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet() & iM6807constructorimpl) != 0) {
                        Modifier.Node nodePop = parent$ui;
                        MutableVector mutableVector = null;
                        while (nodePop != 0) {
                            if (nodePop instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode2 = (ModifierLocalModifierNode) nodePop;
                                if (modifierLocalModifierNode2.getProvidedValues().contains$ui(modifierLocal)) {
                                    return modifierLocalModifierNode2.getProvidedValues().get$ui(modifierLocal);
                                }
                            } else if ((nodePop.getKindSet() & iM6807constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate();
                                int i = 0;
                                nodePop = nodePop;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet() & iM6807constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != 0) {
                                                mutableVector.add(nodePop);
                                                nodePop = 0;
                                            }
                                            mutableVector.add(delegate$ui);
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild();
                                    nodePop = nodePop;
                                }
                                if (i == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui = parent$ui.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return modifierLocal.getDefaultFactory$ui().invoke();
    }

    public static int d(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return measurePolicy.mo32measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).get$h();
    }

    public static int e(MultiContentMeasurePolicy multiContentMeasurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i3), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
            }
            arrayList.add(arrayList2);
        }
        return multiContentMeasurePolicy.mo879measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).get$h();
    }

    public static int f(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return measurePolicy.mo32measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).get$w();
    }

    public static int g(MultiContentMeasurePolicy multiContentMeasurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i3), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
            }
            arrayList.add(arrayList2);
        }
        return multiContentMeasurePolicy.mo879measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).get$w();
    }

    public static int h(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return measurePolicy.mo32measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).get$h();
    }

    public static int i(MultiContentMeasurePolicy multiContentMeasurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i3), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
            }
            arrayList.add(arrayList2);
        }
        return multiContentMeasurePolicy.mo879measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).get$h();
    }

    public static int j(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return measurePolicy.mo32measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).get$w();
    }

    public static int k(MultiContentMeasurePolicy multiContentMeasurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i3), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
            }
            arrayList.add(arrayList2);
        }
        return multiContentMeasurePolicy.mo879measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).get$w();
    }

    public static void l(ModifierLocalModifierNode modifierLocalModifierNode, ModifierLocal modifierLocal, Object obj) {
        if (modifierLocalModifierNode.getProvidedValues() == EmptyMap.INSTANCE) {
            InlineClassHelperKt.throwIllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!modifierLocalModifierNode.getProvidedValues().contains$ui(modifierLocal)) {
            InlineClassHelperKt.throwIllegalArgumentException("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + modifierLocal + " was not found.");
        }
        modifierLocalModifierNode.getProvidedValues().mo6643set$ui(modifierLocal, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MeasureResult m(MeasureScope measureScope, int i, int i2, Map map, Function1 function1, int i3, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: layout");
            return null;
        }
        if ((i3 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        return measureScope.layout(i, i2, map, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MeasureResult n(MeasureScope measureScope, int i, int i2, Map map, Function1 function1, Function1 function2, int i3, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: layout");
            return null;
        }
        if ((i3 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        Map map2 = map;
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        return measureScope.layout(i, i2, map2, function1, function2);
    }

    public static /* synthetic */ long o(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z, int i) {
        long jM4928getZeroF1C5BW0 = Offset.INSTANCE.m4928getZeroF1C5BW0();
        if ((i & 4) != 0) {
            z = true;
        }
        return lookaheadScope.mo140localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2, jM4928getZeroF1C5BW0, z);
    }

    public static float p(float f, float f2, float f3, float f4, float f5) {
        return (f * f2 * f3 * f4) + f5;
    }

    public static int q(float f, int i, int i2) {
        return (Dp.m7819hashCodeimpl(f) + i) * i2;
    }

    public static int r(int i, int i2, int i3, int i4) {
        return CodedOutputStream.computeUInt32SizeNoTag(i) + i2 + i3 + i4;
    }

    public static int s(long j, int i, int i2) {
        return (Color.m5159hashCodeimpl(j) + i) * i2;
    }

    public static PathBuilder t(float f, float f2, float f3) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        return pathBuilder;
    }

    public static PathBuilder u(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.verticalLineToRelative(f5);
        return pathBuilder;
    }

    public static ValueElementSequence v(float f, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Dp.m7811boximpl(f));
        return inspectorInfo.getProperties();
    }

    public static String w(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder x(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static List y(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static Ref.ObjectRef z(Object obj) {
        ResultKt.throwOnFailure(obj);
        return new Ref.ObjectRef();
    }
}
