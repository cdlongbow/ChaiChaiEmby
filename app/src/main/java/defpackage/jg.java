package defpackage;

import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.ui.layout.Placeable;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ jg(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                return ((yf) list.get(((Integer) obj).intValue())).a;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                return ((MediaItem) list.get(iIntValue)).getId() + "_" + iIntValue;
            case 2:
                return list.get(((Integer) obj).intValue());
            case 3:
                int iIntValue2 = ((Integer) obj).intValue();
                return "resume_" + ((MediaItem) list.get(iIntValue2)).getId() + "_" + iIntValue2;
            case 4:
                int iIntValue3 = ((Integer) obj).intValue();
                return "library_" + ((uv1) list.get(iIntValue3)).a + "_" + iIntValue3;
            case 5:
                return PagerMeasureKt.measurePager_7L1iB3k$lambda$18$0(list, (Placeable.PlacementScope) obj);
            case 6:
                return Boolean.valueOf(list.contains(obj));
            case 7:
                return list.get(((Integer) obj).intValue());
            default:
                return nb2.c((TranscodeQualityOption) list.get(((Integer) obj).intValue()));
        }
    }
}
