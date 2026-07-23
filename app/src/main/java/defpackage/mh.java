package defpackage;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material3.SwitchColors;
import androidx.compose.material3.SwitchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import com.dh.myembyapp.data.model.AppThemePreset;
import com.dh.myembyapp.data.model.DarkThemeGlowPosition;
import com.dh.myembyapp.data.model.DarkThemeStyle;
import com.dh.myembyapp.data.model.LightThemeBackgroundStyle;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ mh(AppThemePreset appThemePreset, LightThemeBackgroundStyle lightThemeBackgroundStyle, DarkThemeStyle darkThemeStyle, DarkThemeGlowPosition darkThemeGlowPosition, boolean z, boolean z2, Function2 function2, int i) {
        this.a = 2;
        this.e = appThemePreset;
        this.g = lightThemeBackgroundStyle;
        this.h = darkThemeStyle;
        this.i = darkThemeGlowPosition;
        this.b = z;
        this.c = z2;
        this.j = function2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                pi.i((String) this.e, this.b, this.c, (Function0) this.g, (Function0) this.h, (Function0) this.i, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.INSTANCE;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return SwitchKt.SwitchImpl$lambda$4((Modifier) this.e, this.b, this.c, (SwitchColors) this.g, (Function2) this.h, (InteractionSource) this.i, (Shape) this.j, this.d, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                n72.a((AppThemePreset) this.e, (LightThemeBackgroundStyle) this.g, (DarkThemeStyle) this.h, (DarkThemeGlowPosition) this.i, this.b, this.c, (Function2) this.j, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ mh(Object obj, boolean z, boolean z2, Object obj2, Function function, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.b = z;
        this.c = z2;
        this.g = obj2;
        this.h = function;
        this.i = obj3;
        this.j = obj4;
        this.d = i;
    }
}
