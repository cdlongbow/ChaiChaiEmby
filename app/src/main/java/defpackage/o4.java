package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.state.ToggleableState;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o4 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ o4(int i, Function1 function1, Function1 function2, FocusRequester focusRequester, boolean z, Function0 function0, Function3 function3, int i2) {
        this.d = i;
        this.g = function1;
        this.h = function2;
        this.i = focusRequester;
        this.c = z;
        this.b = function0;
        this.j = function3;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                f7.L(this.d, (Function1) obj6, (Function1) obj5, (FocusRequester) obj4, this.c, this.b, (Function3) obj3, (Composer) obj, iUpdateChangedFlags);
                return Unit.INSTANCE;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return CheckboxKt.TriStateCheckbox$lambda$8((ToggleableState) obj6, this.b, (Modifier) obj5, this.c, (CheckboxColors) obj4, (MutableInteractionSource) obj3, this.d, this.e, (Composer) obj, iIntValue);
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ContextMenuUiKt.ContextMenuItem$lambda$2((String) obj6, this.c, (ContextMenuColors) obj5, (Modifier) obj4, (Function3) obj3, this.b, this.d, this.e, (Composer) obj, iIntValue2);
            case 3:
                int iIntValue3 = ((Integer) obj2).intValue();
                return ExposedDropdownMenuBoxScope.ExposedDropdownMenu$lambda$9((ExposedDropdownMenuBoxScope) obj6, this.c, this.b, (Modifier) obj5, (ScrollState) obj4, (Function3) obj3, this.d, this.e, (Composer) obj, iIntValue3);
            case 4:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                bq0.S(this.c, (MediaItem) obj5, this.d, (FocusRequester) obj4, this.b, (Function0) obj3, (Function1) obj6, (Composer) obj, iUpdateChangedFlags2);
                return Unit.INSTANCE;
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return IconButtonKt.IconButton$lambda$0(this.b, (Modifier) obj6, this.c, (IconButtonColors) obj5, (MutableInteractionSource) obj4, (Function2) obj3, this.d, this.e, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ o4(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, Function0 function0, Modifier modifier, ScrollState scrollState, Function3 function3, int i, int i2) {
        this.g = exposedDropdownMenuBoxScope;
        this.c = z;
        this.b = function0;
        this.h = modifier;
        this.i = scrollState;
        this.j = function3;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ o4(ToggleableState toggleableState, Function0 function0, Modifier modifier, boolean z, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.g = toggleableState;
        this.b = function0;
        this.h = modifier;
        this.c = z;
        this.i = checkboxColors;
        this.j = mutableInteractionSource;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ o4(String str, boolean z, ContextMenuColors contextMenuColors, Modifier modifier, Function3 function3, Function0 function0, int i, int i2) {
        this.g = str;
        this.c = z;
        this.h = contextMenuColors;
        this.i = modifier;
        this.j = function3;
        this.b = function0;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ o4(Function0 function0, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2) {
        this.b = function0;
        this.g = modifier;
        this.c = z;
        this.h = iconButtonColors;
        this.i = mutableInteractionSource;
        this.j = function2;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ o4(boolean z, MediaItem mediaItem, int i, FocusRequester focusRequester, Function0 function0, Function0 function1, Function1 function2, int i2) {
        this.c = z;
        this.h = mediaItem;
        this.d = i;
        this.i = focusRequester;
        this.b = function0;
        this.j = function1;
        this.g = function2;
        this.e = i2;
    }
}
