package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.PopupPositionProvider;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zk implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Function j;

    public /* synthetic */ zk(Modifier modifier, Function0 function0, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i) {
        this.e = modifier;
        this.c = function0;
        this.b = z;
        this.g = shape;
        this.h = iconButtonColors;
        this.i = mutableInteractionSource;
        this.j = function2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTooltipKt.TooltipPopup$lambda$10((PopupPositionProvider) this.e, (TooltipState) this.g, this.c, (CoroutineScope) this.h, this.b, (MutableState) this.i, (Function2) this.j, this.d, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                u90.x0((List) this.e, (MediaItem) this.g, this.b, (FocusRequester) this.h, (Function1) this.i, this.c, (Function1) this.j, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.INSTANCE;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return IconButtonKt.IconButtonImpl$lambda$4((Modifier) this.e, this.c, this.b, (Shape) this.g, (IconButtonColors) this.h, (MutableInteractionSource) this.i, (Function2) this.j, this.d, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ zk(PopupPositionProvider popupPositionProvider, TooltipState tooltipState, Function0 function0, CoroutineScope coroutineScope, boolean z, MutableState mutableState, Function2 function2, int i) {
        this.e = popupPositionProvider;
        this.g = tooltipState;
        this.c = function0;
        this.h = coroutineScope;
        this.b = z;
        this.i = mutableState;
        this.j = function2;
        this.d = i;
    }

    public /* synthetic */ zk(List list, MediaItem mediaItem, boolean z, FocusRequester focusRequester, Function1 function1, Function0 function0, Function1 function2, int i) {
        this.e = list;
        this.g = mediaItem;
        this.b = z;
        this.h = focusRequester;
        this.i = function1;
        this.c = function0;
        this.j = function2;
        this.d = i;
    }
}
