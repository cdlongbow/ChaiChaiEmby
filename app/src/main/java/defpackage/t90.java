package defpackage;

import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaStream;
import com.dh.myembyapp.data.model.OtherServerResourceMatch;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class t90 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t90(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long size;
        Long size2;
        Long size3;
        Long size4;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                int iCompare = ((k00) obj3).compare(obj, obj2);
                return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(Integer.valueOf(((MediaStream) obj).getIndex()), Integer.valueOf(((MediaStream) obj2).getIndex()));
            case 1:
                int iCompare2 = ((t90) obj3).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : ComparisonsKt.compareValues(Integer.valueOf(((MediaStream) obj).getIndex()), Integer.valueOf(((MediaStream) obj2).getIndex()));
            case 2:
                int iCompare3 = ((k00) obj3).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : ComparisonsKt.compareValues(Boolean.valueOf(((MediaStream) obj2).isForced()), Boolean.valueOf(((MediaStream) obj).isForced()));
            case 3:
                int iCompare4 = ((t90) obj3).compare(obj, obj2);
                return iCompare4 != 0 ? iCompare4 : ComparisonsKt.compareValues(((ya1) obj).a.getAlias(), ((ya1) obj2).a.getAlias());
            case 4:
                Long l = 0L;
                int iCompare5 = ((k00) obj3).compare(obj, obj2);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                MediaSource mediaSource = ((ya1) obj2).b.getMediaSource();
                if (mediaSource == null || (size = mediaSource.getSize()) == null) {
                    size = l;
                }
                MediaSource mediaSource2 = ((ya1) obj).b.getMediaSource();
                if (mediaSource2 != null && (size2 = mediaSource2.getSize()) != null) {
                    l = size2;
                }
                return ComparisonsKt.compareValues(size, l);
            case 5:
                int iCompare6 = ((t90) obj3).compare(obj, obj2);
                if (iCompare6 != 0) {
                    return iCompare6;
                }
                MediaSource mediaSource3 = ((OtherServerResourceMatch) obj).getMediaSource();
                String name = mediaSource3 != null ? mediaSource3.getName() : null;
                if (name == null) {
                    name = "";
                }
                MediaSource mediaSource4 = ((OtherServerResourceMatch) obj2).getMediaSource();
                String name2 = mediaSource4 != null ? mediaSource4.getName() : null;
                return ComparisonsKt.compareValues(name, name2 != null ? name2 : "");
            case 6:
                int iCompare7 = ((k00) obj3).compare(obj, obj2);
                return iCompare7 != 0 ? iCompare7 : ComparisonsKt.compareValues(Integer.valueOf(((OtherServerResourceMatch) obj2).getBitrateSortValue()), Integer.valueOf(((OtherServerResourceMatch) obj).getBitrateSortValue()));
            case 7:
                Long l2 = 0L;
                int iCompare8 = ((t90) obj3).compare(obj, obj2);
                if (iCompare8 != 0) {
                    return iCompare8;
                }
                MediaSource mediaSource5 = ((OtherServerResourceMatch) obj2).getMediaSource();
                if (mediaSource5 == null || (size3 = mediaSource5.getSize()) == null) {
                    size3 = l2;
                }
                MediaSource mediaSource6 = ((OtherServerResourceMatch) obj).getMediaSource();
                if (mediaSource6 != null && (size4 = mediaSource6.getSize()) != null) {
                    l2 = size4;
                }
                return ComparisonsKt.compareValues(size3, l2);
            case 8:
                Function1 function1 = (Function1) obj3;
                return ComparisonsKt.compareValues((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
            default:
                int iCompare9 = ((k00) obj3).compare(obj, obj2);
                return iCompare9 != 0 ? iCompare9 : ComparisonsKt.compareValues(((wr1) obj).a, ((wr1) obj2).a);
        }
    }
}
