package defpackage;

import androidx.compose.material3.DateInputKt;
import androidx.compose.material3.DateInputValidator;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.SelectableDates;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.MutableState;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s00 implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Locale c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ s00(DateInputValidator dateInputValidator, CalendarModel calendarModel, DateInputFormat dateInputFormat, Locale locale, int i, MutableState mutableState) {
        this.d = dateInputValidator;
        this.e = calendarModel;
        this.g = dateInputFormat;
        this.c = locale;
        this.b = i;
        this.h = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return DateInputKt.DateInputTextField_xJ3Ic0Y$lambda$9$lambda$8((DateInputValidator) this.d, (CalendarModel) this.e, (DateInputFormat) this.g, this.c, this.b, (MutableState) this.h);
            default:
                return DatePickerKt.rememberDatePickerState_EU0dCGE$lambda$5$lambda$4((Long) this.d, (Long) this.e, (IntRange) this.g, this.b, (SelectableDates) this.h, this.c);
        }
    }

    public /* synthetic */ s00(Long l, Long l2, IntRange intRange, int i, SelectableDates selectableDates, Locale locale) {
        this.d = l;
        this.e = l2;
        this.g = intRange;
        this.b = i;
        this.h = selectableDates;
        this.c = locale;
    }
}
