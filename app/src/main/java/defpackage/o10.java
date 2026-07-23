package defpackage;

import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.material3.DateRangePickerStateImpl;
import androidx.compose.material3.SelectableDates;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectableDates b;
    public final /* synthetic */ Locale c;

    public /* synthetic */ o10(SelectableDates selectableDates, Locale locale, int i) {
        this.a = i;
        this.b = selectableDates;
        this.c = locale;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return DatePickerStateImpl.Companion.Saver$lambda$1(this.b, this.c, (List) obj);
            default:
                return DateRangePickerStateImpl.Companion.Saver$lambda$1(this.b, this.c, (List) obj);
        }
    }
}
