package defpackage;

import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y12 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y12(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return SliderKt.awaitSlop_8vUncbI$lambda$49((Ref.FloatRef) obj3, (PointerInputChange) obj, ((Float) obj2).floatValue());
            case 1:
                return SnapshotStateObserver.applyObserver$lambda$0((SnapshotStateObserver) obj3, (Set) obj, (Snapshot) obj2);
            case 2:
                o32 o32Var = (o32) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1867756661, iIntValue, -1, "com.dh.myembyapp.ui.components.SubtitleFontManagerDialog.<anonymous>.<anonymous> (SubtitleFontManagerDialog.kt:195)");
                    }
                    TextKt.m3048TextNvy7gAk(mr.r("确定要删除字体 \"", o32Var.b, "\" 吗？"), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                return Boolean.valueOf(TextFieldDecoratorModifierNode.dragAndDropNode$lambda$1((TextFieldDecoratorModifierNode) obj3, (ClipEntry) obj, (ClipMetadata) obj2));
            case 4:
                return WrapContentElement.Companion.width$lambda$0((Alignment.Horizontal) obj3, (IntSize) obj, (LayoutDirection) obj2);
            case 5:
                return WrapContentElement.Companion.height$lambda$0((Alignment.Vertical) obj3, (IntSize) obj, (LayoutDirection) obj2);
            default:
                return WrapContentElement.Companion.size$lambda$0((Alignment) obj3, (IntSize) obj, (LayoutDirection) obj2);
        }
    }
}
