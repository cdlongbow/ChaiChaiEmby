package defpackage;

import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function6;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q51 implements Function6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q51(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i = this.a;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                return MovableContentKt.movableContentWithReceiverOf$lambda$7((MovableContent) obj7, obj, obj2, obj3, obj4, (Composer) obj5, ((Integer) obj6).intValue());
            case 1:
                return MovableContentKt.movableContentOf$lambda$7((MovableContent) obj7, obj, obj2, obj3, obj4, (Composer) obj5, ((Integer) obj6).intValue());
            default:
                return Boolean.valueOf(SelectionManager._init_$lambda$3((SelectionManager) obj7, ((Boolean) obj).booleanValue(), (LayoutCoordinates) obj2, (Offset) obj3, (Offset) obj4, ((Boolean) obj5).booleanValue(), (SelectionAdjustment) obj6));
        }
    }
}
