package defpackage;

import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.intl.LocaleList;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fb implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocaleList b;

    public /* synthetic */ fb(int i, LocaleList localeList) {
        this.a = i;
        this.b = localeList;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        String str = (String) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        LocaleList localeList = this.b;
        switch (i) {
            case 0:
                return AnnotatedStringKt.decapitalize$lambda$0(localeList, str, iIntValue, iIntValue2);
            case 1:
                return AnnotatedStringKt.capitalize$lambda$0(localeList, str, iIntValue, iIntValue2);
            case 2:
                return AnnotatedStringKt.toUpperCase$lambda$0(localeList, str, iIntValue, iIntValue2);
            default:
                return AnnotatedStringKt.toLowerCase$lambda$0(localeList, str, iIntValue, iIntValue2);
        }
    }
}
