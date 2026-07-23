package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconToggleButtonColors;
import androidx.compose.material3.SwitchColors;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.navigationevent.compose.NavigationEventHandlerKt;
import androidx.navigationevent.compose.NavigationEventState;
import com.dh.myembyapp.data.model.DanmakuEpisode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sx implements Function2 {
    public final /* synthetic */ int a = 5;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ sx(PopupPositionProvider popupPositionProvider, Function3 function3, TooltipState tooltipState, Modifier modifier, boolean z, boolean z2, Function2 function2, int i, int i2) {
        this.h = popupPositionProvider;
        this.d = function3;
        this.i = tooltipState;
        this.j = modifier;
        this.b = z;
        this.c = z2;
        this.k = function2;
        this.e = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.d;
        Object obj7 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.g | 1);
                qy.o((DanmakuEpisode) obj7, this.b, this.c, this.e, (Function0) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, iUpdateChangedFlags);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.e | 1);
                u90.C0((String) obj7, (String) obj5, (ImageVector) obj4, this.b, this.c, (Modifier) obj3, (Function0) obj6, (Composer) obj, iUpdateChangedFlags2, this.g);
                return Unit.INSTANCE;
            case 2:
                int iIntValue = ((Integer) obj2).intValue();
                return IconButtonKt.IconToggleButton$lambda$5(this.b, (Function1) obj7, (Modifier) obj6, this.c, (IconToggleButtonColors) obj5, (MutableInteractionSource) obj4, (Function2) obj3, this.e, this.g, (Composer) obj, iIntValue);
            case 3:
                int iIntValue2 = ((Integer) obj2).intValue();
                return NavigationEventHandlerKt.NavigationEventHandler$lambda$17((NavigationEventState) obj7, this.b, (Function0) obj6, (Function0) obj5, this.c, (Function0) obj4, (Function0) obj3, this.e, this.g, (Composer) obj, iIntValue2);
            case 4:
                int iIntValue3 = ((Integer) obj2).intValue();
                return SwitchKt.Switch$lambda$1(this.b, (Function1) obj7, (Modifier) obj6, (Function2) obj5, this.c, (SwitchColors) obj4, (MutableInteractionSource) obj3, this.e, this.g, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return TooltipKt.TooltipBox$lambda$0((PopupPositionProvider) obj7, (Function3) obj6, (TooltipState) obj5, (Modifier) obj4, this.b, this.c, (Function2) obj3, this.e, this.g, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ sx(NavigationEventState navigationEventState, boolean z, Function0 function0, Function0 function1, boolean z2, Function0 function2, Function0 function3, int i, int i2) {
        this.h = navigationEventState;
        this.b = z;
        this.d = function0;
        this.i = function1;
        this.c = z2;
        this.j = function2;
        this.k = function3;
        this.e = i;
        this.g = i2;
    }

    public /* synthetic */ sx(DanmakuEpisode danmakuEpisode, boolean z, boolean z2, int i, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i2) {
        this.h = danmakuEpisode;
        this.b = z;
        this.c = z2;
        this.e = i;
        this.d = function0;
        this.i = function1;
        this.j = function2;
        this.k = function3;
        this.g = i2;
    }

    public /* synthetic */ sx(String str, String str2, ImageVector imageVector, boolean z, boolean z2, Modifier modifier, Function0 function0, int i, int i2) {
        this.h = str;
        this.i = str2;
        this.j = imageVector;
        this.b = z;
        this.c = z2;
        this.k = modifier;
        this.d = function0;
        this.e = i;
        this.g = i2;
    }

    public /* synthetic */ sx(boolean z, Function1 function1, Modifier modifier, Function2 function2, boolean z2, SwitchColors switchColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.b = z;
        this.h = function1;
        this.d = modifier;
        this.i = function2;
        this.c = z2;
        this.j = switchColors;
        this.k = mutableInteractionSource;
        this.e = i;
        this.g = i2;
    }

    public /* synthetic */ sx(boolean z, Function1 function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2) {
        this.b = z;
        this.h = function1;
        this.d = modifier;
        this.c = z2;
        this.i = iconToggleButtonColors;
        this.j = mutableInteractionSource;
        this.k = function2;
        this.e = i;
        this.g = i2;
    }
}
