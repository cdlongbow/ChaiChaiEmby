package defpackage;

import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.model.PersonInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class w5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public w5(Function1 function1, PersonInfo personInfo) {
        this.a = 10;
        this.c = function1;
        this.b = personInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                if (((FocusRequester) obj3) != null) {
                    ((Function1) obj2).invoke(bool);
                }
                return Unit.INSTANCE;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                return ((a2) obj3).invoke(Integer.valueOf(iIntValue), ((List) obj2).get(iIntValue));
            case 2:
                int iIntValue2 = ((Number) obj).intValue();
                return ((a5) obj3).invoke(Integer.valueOf(iIntValue2), ((List) obj2).get(iIntValue2));
            case 3:
                int iIntValue3 = ((Number) obj).intValue();
                return ((a5) obj3).invoke(Integer.valueOf(iIntValue3), ((List) obj2).get(iIntValue3));
            case 4:
                int iIntValue4 = ((Number) obj).intValue();
                return ((a5) obj3).invoke(Integer.valueOf(iIntValue4), ((List) obj2).get(iIntValue4));
            case 5:
                return ((vb) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 6:
                int iIntValue5 = ((Number) obj).intValue();
                return ((f9) obj3).invoke(Integer.valueOf(iIntValue5), ((List) obj2).get(iIntValue5));
            case 7:
                return ((hq) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 8:
                int iIntValue6 = ((Number) obj).intValue();
                return ((xw) obj3).invoke(Integer.valueOf(iIntValue6), ((List) obj2).get(iIntValue6));
            case 9:
                int iIntValue7 = ((Number) obj).intValue();
                return ((xw) obj3).invoke(Integer.valueOf(iIntValue7), ((List) obj2).get(iIntValue7));
            case 10:
                if (((Boolean) obj).booleanValue()) {
                    ((Function1) obj2).invoke(((PersonInfo) obj3).getId());
                }
                return Unit.INSTANCE;
            case 11:
                return ((hq) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 12:
                int iIntValue8 = ((Number) obj).intValue();
                return ((xw) obj3).invoke(Integer.valueOf(iIntValue8), ((List) obj2).get(iIntValue8));
            case 13:
                return ((hq) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 14:
                int iIntValue9 = ((Number) obj).intValue();
                return ((xw) obj3).invoke(Integer.valueOf(iIntValue9), ((List) obj2).get(iIntValue9));
            case 15:
                int iIntValue10 = ((Number) obj).intValue();
                return ((xw) obj3).invoke(Integer.valueOf(iIntValue10), ((List) obj2).get(iIntValue10));
            case 16:
                int iIntValue11 = ((Number) obj).intValue();
                return ((xw) obj3).invoke(Integer.valueOf(iIntValue11), ((List) obj2).get(iIntValue11));
            case 17:
                int iIntValue12 = ((Number) obj).intValue();
                return ((xw) obj3).invoke(Integer.valueOf(iIntValue12), ((List) obj2).get(iIntValue12));
            case 18:
                int iIntValue13 = ((Number) obj).intValue();
                return ((xw) obj3).invoke(Integer.valueOf(iIntValue13), ((List) obj2).get(iIntValue13));
            case 19:
                return ((vi0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 20:
                int iIntValue14 = ((Number) obj).intValue();
                return ((xw) obj3).invoke(Integer.valueOf(iIntValue14), ((List) obj2).get(iIntValue14));
            case 21:
                return ((vi0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 22:
                return ((ox0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 23:
                return ((ox0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 24:
                int iIntValue15 = ((Number) obj).intValue();
                return ((xw) obj3).invoke(Integer.valueOf(iIntValue15), ((List) obj2).get(iIntValue15));
            case 25:
                int iIntValue16 = ((Number) obj).intValue();
                return ((pu1) obj3).invoke(Integer.valueOf(iIntValue16), ((List) obj2).get(iIntValue16));
            case 26:
                return ((qu1) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 27:
                return ((qu1) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            default:
                return ((qu1) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
        }
    }

    public /* synthetic */ w5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
