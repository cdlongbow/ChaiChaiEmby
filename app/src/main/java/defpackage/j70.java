package defpackage;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconToggleButtonColors;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j70 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ j70(Function0 function0, jb1 jb1Var, boolean z, List list, boolean z2, int i, String str, String str2, Function2 function2, int i2, FocusRequester focusRequester) {
        this.a = 0;
        this.h = function0;
        this.i = jb1Var;
        this.b = z;
        this.j = list;
        this.c = z2;
        this.e = i;
        this.k = str;
        this.l = str2;
        this.d = function2;
        this.g = i2;
        this.m = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.m;
        Object obj4 = this.d;
        Object obj5 = this.l;
        Object obj6 = this.k;
        Object obj7 = this.j;
        Object obj8 = this.i;
        Object obj9 = this.h;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj9;
                jb1 jb1Var = (jb1) obj8;
                List list = (List) obj7;
                String str = (String) obj6;
                String str2 = (String) obj5;
                Function2 function2 = (Function2) obj4;
                FocusRequester focusRequester = (FocusRequester) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1865757353, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.OtherServerResourcesDialog.<anonymous> (DetailScreen.kt:3469)");
                    }
                    boolean zChanged = composer.changed(function0);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new n8(11, function0);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    BackHandlerKt.BackHandler(false, (Function0) objRememberedValue, composer, 0, 1);
                    SurfaceKt.m2905SurfaceT9BRK9s(SizeKt.m1051heightInVpY3zN4(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.66f), Dp.m7813constructorimpl(320.0f), Dp.m7813constructorimpl(600.0f)), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(24.0f)), u90.f, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(214073628, true, new kp(jb1Var, this.b, list, this.c, this.e, str, str2, function2, this.g, focusRequester), composer, 54), composer, 12583302, 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                return IconButtonKt.OutlinedIconToggleButton$lambda$21(this.b, (Function1) obj9, (Modifier) obj8, this.c, (Shape) obj7, (IconToggleButtonColors) obj6, (BorderStroke) obj5, (MutableInteractionSource) obj3, (Function2) obj4, this.e, this.g, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return LazyDslKt.LazyColumn$lambda$1((Modifier) obj9, (LazyListState) obj8, (PaddingValues) obj7, this.b, (Arrangement.Vertical) obj6, (Alignment.Horizontal) obj5, (FlingBehavior) obj4, this.c, (Function1) obj3, this.e, this.g, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return LazyDslKt.LazyRow$lambda$1((Modifier) obj9, (LazyListState) obj8, (PaddingValues) obj7, this.b, (Arrangement.Horizontal) obj6, (Alignment.Vertical) obj5, (FlingBehavior) obj4, this.c, (Function1) obj3, this.e, this.g, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ j70(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Object obj, Object obj2, FlingBehavior flingBehavior, boolean z2, Function1 function1, int i, int i2, int i3) {
        this.a = i3;
        this.h = modifier;
        this.i = lazyListState;
        this.j = paddingValues;
        this.b = z;
        this.k = obj;
        this.l = obj2;
        this.d = flingBehavior;
        this.c = z2;
        this.m = function1;
        this.e = i;
        this.g = i2;
    }

    public /* synthetic */ j70(boolean z, Function1 function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2) {
        this.a = 1;
        this.b = z;
        this.h = function1;
        this.i = modifier;
        this.c = z2;
        this.j = shape;
        this.k = iconToggleButtonColors;
        this.l = borderStroke;
        this.m = mutableInteractionSource;
        this.d = function2;
        this.e = i;
        this.g = i2;
    }
}
