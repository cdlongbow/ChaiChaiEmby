package defpackage;

import android.content.Context;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DateRangeInputKt;
import androidx.compose.material3.SelectableDates;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ns implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ns(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.g = obj4;
        this.h = obj5;
        this.i = obj6;
        this.j = obj7;
        this.k = obj8;
        this.l = obj9;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.e;
        Object obj10 = this.d;
        Object obj11 = this.c;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ComposableLambdaImpl.invoke$lambda$7((ComposableLambdaImpl) obj11, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.b, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return DatePickerKt.HorizontalMonthsList$lambda$42((LazyListState) obj11, (Long) obj10, (Function1) obj9, (Function1) obj8, (CalendarModel) obj7, (IntRange) obj6, (DatePickerFormatter) obj5, (SelectableDates) obj4, (DatePickerColors) obj3, this.b, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return DateRangeInputKt.DateRangeInputContent$lambda$8((Long) obj11, (Long) obj10, (Function2) obj9, (CalendarModel) obj8, (IntRange) obj7, (DatePickerFormatter) obj6, (SelectableDates) obj5, (DatePickerColors) obj4, (FocusRequester) obj3, this.b, (Composer) obj, iIntValue3);
            case 3:
                ((Integer) obj2).getClass();
                fh1.a((Context) obj11, (ExoPlayer) obj10, (String) obj9, (DefaultBandwidthMeter) obj8, (CoroutineScope) obj7, (gh1) obj6, (hh1) obj5, (dh1) obj4, (ch1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.INSTANCE;
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return SearchBarKt.SearchBarLayout$lambda$49((Animatable) obj11, (MutableFloatState) obj10, (MutableState) obj9, (MutableState) obj8, (Modifier) obj7, (WindowInsets) obj6, (Function2) obj5, (Function2) obj4, (Function2) obj3, this.b, (Composer) obj, iIntValue4);
        }
    }
}
