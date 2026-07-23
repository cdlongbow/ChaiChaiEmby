package defpackage;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.style.StyleOuterNode;
import androidx.compose.foundation.text.TextFieldScrollKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLinkStyles;
import com.dh.myembyapp.server.WebDavSyncConfigServerManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m22 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m22(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return SnapshotStateObserver.readObserver$lambda$0((SnapshotStateObserver) obj2, obj);
            case 1:
                return StyleOuterNode._get_layerBlockNonNull_$lambda$0$0((StyleOuterNode) obj2, (GraphicsLayerScope) obj);
            case 2:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                pc0.g(drawScope, ((u61) obj2).L, Offset.m4904constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), Offset.m4904constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5620getSizeNHjbRc() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(0.0f)))), 2.0f, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{12.0f, 10.0f}, 0.0f), 0.0f, null, 0, 464, null);
                return Unit.INSTANCE;
            case 3:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(StringsKt__StringsJVMKt.startsWith$default(str, ((o32) obj2).a + "|", false, 2, null));
            case 4:
                return TextContextMenuModifierKt.collectTextContextMenuData$lambda$0$0((TextContextMenuBuilderScope) obj2, (Function1) obj);
            case 5:
                return TextFieldCoreModifierNode.textContextMenuToolbarHandlerNode$lambda$0((TextFieldCoreModifierNode) obj2, (LayoutCoordinates) obj);
            case 6:
                return Float.valueOf(TextFieldScrollKt.textFieldScrollable$lambda$1$0$0((TextFieldScrollerPosition) obj2, ((Float) obj).floatValue()));
            case 7:
                return TextKt.createTextWithLinkStyles$lambda$21((TextLinkStyles) obj2, (AnnotatedString.Range) obj);
            case 8:
                bc2 bc2Var = (bc2) obj2;
                wp wpVar = (wp) obj;
                wpVar.getClass();
                wp.a(wpVar, "first", bc2Var.a.getDescriptor());
                wp.a(wpVar, "second", bc2Var.b.getDescriptor());
                wp.a(wpVar, "third", bc2Var.c.getDescriptor());
                return Unit.INSTANCE;
            case 9:
                return TypeReference.asString$lambda$0((TypeReference) obj2, (KTypeProjection) obj);
            case 10:
                ((DisposableEffectScope) obj).getClass();
                return new o2((WebDavSyncConfigServerManager) obj2, 16);
            default:
                return WideNavigationRailStateImpl.Companion.Saver$lambda$1((AnimationSpec) obj2, (WideNavigationRailValue) obj);
        }
    }
}
