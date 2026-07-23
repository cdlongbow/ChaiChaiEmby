package defpackage;

import android.content.Context;
import androidx.compose.material3.AnalogTimePickerState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.dh.myembyapp.data.model.AppThemePreset;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.DanmakuAnime;
import com.dh.myembyapp.data.model.LightThemeBackgroundStyle;
import com.dh.myembyapp.data.model.SystemTimeDisplayMode;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ u7(Modifier modifier, AnalogTimePickerState analogTimePickerState, TimePickerColors timePickerColors, boolean z, int i) {
        this.a = 10;
        this.c = modifier;
        this.e = analogTimePickerState;
        this.g = timePickerColors;
        this.b = z;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.g;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                boolean z = this.b;
                m8.h((List) obj5, z, (Function1) obj4, (Modifier) obj3, (Composer) obj, iUpdateChangedFlags);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                boolean z2 = this.b;
                pi.g((BackupRouteConfig) obj5, z2, (Modifier) obj3, (Function0) obj4, (Composer) obj, iUpdateChangedFlags2);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                qy.a((DanmakuAnime) obj5, (String) obj4, this.b, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                zb0.a((String) obj5, (Function1) obj4, (FocusRequester) obj3, this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                boolean z3 = this.b;
                qn0.e((tn0) obj5, z3, (Modifier) obj3, (Function0) obj4, (Composer) obj, iUpdateChangedFlags3);
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                boolean z4 = this.b;
                gy0.c((uy0) obj5, z4, (Function0) obj3, (Function1) obj4, (Composer) obj, iUpdateChangedFlags4);
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags5 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                boolean z5 = this.b;
                ku.f((Context) obj5, z5, (SystemTimeDisplayMode) obj3, (Function1) obj4, (Composer) obj, iUpdateChangedFlags5);
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags6 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                boolean z6 = this.b;
                q32.c((String) obj5, z6, (Function0) obj4, (Function0) obj3, (Composer) obj, iUpdateChangedFlags6);
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags7 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                boolean z7 = this.b;
                v72.e((AppThemePreset) obj5, z7, (Modifier) obj3, (Function0) obj4, (Composer) obj, iUpdateChangedFlags7);
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags8 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                boolean z8 = this.b;
                v72.c((LightThemeBackgroundStyle) obj5, z8, (Modifier) obj3, (Function0) obj4, (Composer) obj, iUpdateChangedFlags8);
                return Unit.INSTANCE;
            case 10:
                int iIntValue = ((Integer) obj2).intValue();
                return TimePickerKt.ClockFace$lambda$60((Modifier) obj3, (AnalogTimePickerState) obj5, (TimePickerColors) obj4, this.b, this.d, (Composer) obj, iIntValue);
            case 11:
                ((Integer) obj2).getClass();
                s92.a((fo1) obj5, (Function0) obj4, (Function0) obj3, this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                hb2.e((ImageVector) obj5, (String) obj4, this.b, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ef2.i((String) obj5, (String) obj4, this.b, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags9 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                boolean z9 = this.b;
                ef2.j((ye2) obj5, z9, (Function0) obj4, (Function0) obj3, (Composer) obj, iUpdateChangedFlags9);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags10 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                boolean z10 = this.b;
                ef2.c((ve2) obj5, z10, (Function0) obj4, (Function0) obj3, (Composer) obj, iUpdateChangedFlags10);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ u7(Object obj, String str, boolean z, Function0 function0, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.g = str;
        this.b = z;
        this.c = function0;
        this.d = i;
    }

    public /* synthetic */ u7(Object obj, Function function, Object obj2, boolean z, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.g = function;
        this.c = obj2;
        this.b = z;
        this.d = i;
    }

    public /* synthetic */ u7(Object obj, boolean z, Object obj2, Function function, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.b = z;
        this.c = obj2;
        this.g = function;
        this.d = i;
    }

    public /* synthetic */ u7(Object obj, boolean z, Function function, Object obj2, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.b = z;
        this.g = function;
        this.c = obj2;
        this.d = i;
    }
}
