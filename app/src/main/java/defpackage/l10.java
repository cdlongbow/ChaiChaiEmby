package defpackage;

import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.material3.SelectableDates;
import androidx.compose.material3.SelectedRangeInfo;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l10 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Long b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ DatePickerFormatter g;
    public final /* synthetic */ SelectableDates h;
    public final /* synthetic */ DatePickerColors i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ l10(CalendarMonth calendarMonth, Function1 function1, long j, Long l, Long l2, SelectedRangeInfo selectedRangeInfo, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Locale locale, int i) {
        this.k = calendarMonth;
        this.e = function1;
        this.d = j;
        this.b = l;
        this.c = l2;
        this.l = selectedRangeInfo;
        this.g = datePickerFormatter;
        this.h = selectableDates;
        this.i = datePickerColors;
        this.m = locale;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return DatePickerKt.Month$lambda$59((CalendarMonth) this.k, this.e, this.d, this.b, this.c, (SelectedRangeInfo) this.l, this.g, this.h, this.i, (Locale) this.m, this.j, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return DateRangePickerKt.DateRangePickerContent$lambda$12(this.b, this.c, this.d, (Function2) this.k, this.e, (CalendarModel) this.l, (IntRange) this.m, this.g, this.h, this.i, this.j, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ l10(Long l, Long l2, long j, Function2 function2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i) {
        this.b = l;
        this.c = l2;
        this.d = j;
        this.k = function2;
        this.e = function1;
        this.l = calendarModel;
        this.m = intRange;
        this.g = datePickerFormatter;
        this.h = selectableDates;
        this.i = datePickerColors;
        this.j = i;
    }
}
