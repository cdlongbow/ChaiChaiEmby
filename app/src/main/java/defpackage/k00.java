package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaStream;
import com.dh.myembyapp.data.model.OtherServerResourceMatch;
import com.dh.myembyapp.data.model.TraktHistorySeason;

import java.util.Comparator;
import java.util.Locale;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class k00 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ k00(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ComparisonsKt.compareValues(Long.valueOf(((DanmakuItemData) obj).getPosition()), Long.valueOf(((DanmakuItemData) obj2).getPosition()));
            case 1:
                Integer indexNumber = ((MediaItem) obj).getIndexNumber();
                Integer numValueOf = Integer.valueOf(indexNumber != null ? indexNumber.intValue() : Integer.MAX_VALUE);
                Integer indexNumber2 = ((MediaItem) obj2).getIndexNumber();
                return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(indexNumber2 != null ? indexNumber2.intValue() : Integer.MAX_VALUE));
            case 2:
                return ComparisonsKt.compareValues(Boolean.valueOf(((MediaStream) obj2).isDefault()), Boolean.valueOf(((MediaStream) obj).isDefault()));
            case 3:
                return ComparisonsKt.compareValues(Boolean.valueOf(((MediaStream) obj2).isDefault()), Boolean.valueOf(((MediaStream) obj).isDefault()));
            case 4:
                return ComparisonsKt.compareValues(Integer.valueOf(((ya1) obj2).b.getBitrateSortValue()), Integer.valueOf(((ya1) obj).b.getBitrateSortValue()));
            case 5:
                String str = ((bi0) obj).a;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((bi0) obj2).a.toLowerCase(locale);
                lowerCase2.getClass();
                return ComparisonsKt.compareValues(lowerCase, lowerCase2);
            case 6:
                return ComparisonsKt.compareValues((Long) ((Pair) obj2).getSecond(), (Long) ((Pair) obj).getSecond());
            case 7:
                return ComparisonsKt.compareValues(Integer.valueOf(((OtherServerResourceMatch) obj2).getResolutionSortValue()), Integer.valueOf(((OtherServerResourceMatch) obj).getResolutionSortValue()));
            case 8:
                Integer indexNumber3 = ((MediaItem) obj).getIndexNumber();
                Integer numValueOf2 = Integer.valueOf(indexNumber3 != null ? indexNumber3.intValue() : Integer.MAX_VALUE);
                Integer indexNumber4 = ((MediaItem) obj2).getIndexNumber();
                return ComparisonsKt.compareValues(numValueOf2, Integer.valueOf(indexNumber4 != null ? indexNumber4.intValue() : Integer.MAX_VALUE));
            case 9:
                Integer indexNumber5 = ((MediaItem) obj).getIndexNumber();
                Integer numValueOf3 = Integer.valueOf(indexNumber5 != null ? indexNumber5.intValue() : Integer.MAX_VALUE);
                Integer indexNumber6 = ((MediaItem) obj2).getIndexNumber();
                return ComparisonsKt.compareValues(numValueOf3, Integer.valueOf(indexNumber6 != null ? indexNumber6.intValue() : Integer.MAX_VALUE));
            case 10:
                Integer indexNumber7 = ((MediaItem) obj).getIndexNumber();
                Integer numValueOf4 = Integer.valueOf(indexNumber7 != null ? indexNumber7.intValue() : Integer.MAX_VALUE);
                Integer indexNumber8 = ((MediaItem) obj2).getIndexNumber();
                return ComparisonsKt.compareValues(numValueOf4, Integer.valueOf(indexNumber8 != null ? indexNumber8.intValue() : Integer.MAX_VALUE));
            case 11:
                Integer indexNumber9 = ((MediaItem) obj).getIndexNumber();
                Integer numValueOf5 = Integer.valueOf(indexNumber9 != null ? indexNumber9.intValue() : Integer.MAX_VALUE);
                Integer indexNumber10 = ((MediaItem) obj2).getIndexNumber();
                return ComparisonsKt.compareValues(numValueOf5, Integer.valueOf(indexNumber10 != null ? indexNumber10.intValue() : Integer.MAX_VALUE));
            case 12:
                return ComparisonsKt.compareValues(Boolean.valueOf(((wr1) obj2).d), Boolean.valueOf(((wr1) obj).d));
            case 13:
                ((q91) obj2).getClass();
                ((q91) obj).getClass();
                return ComparisonsKt.compareValues(2, 2);
            case 14:
                obj2.getClass();
                throw new ClassCastException();
            case 15:
                String str2 = ((o32) obj).b;
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = str2.toLowerCase(locale2);
                lowerCase3.getClass();
                String lowerCase4 = ((o32) obj2).b.toLowerCase(locale2);
                lowerCase4.getClass();
                return ComparisonsKt.compareValues(lowerCase3, lowerCase4);
            case 16:
                int i = ((ng0) obj).priority;
                int i2 = ((ng0) obj2).priority;
                if (i > i2) {
                    return 1;
                }
                return i == i2 ? 0 : -1;
            default:
                return ComparisonsKt.compareValues(Integer.valueOf(((TraktHistorySeason) obj).getNumber()), Integer.valueOf(((TraktHistorySeason) obj2).getNumber()));
        }
    }
}
