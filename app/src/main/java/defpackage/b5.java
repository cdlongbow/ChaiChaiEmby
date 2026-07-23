package defpackage;

import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.ui.semantics.SemanticsSortKt;
import com.dh.myembyapp.data.model.MediaSourcePriorityKt;
import java.util.Comparator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b5 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ b5(int i, Function2 function2) {
        this.a = i;
        this.b = function2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                return ((Number) ((a5) function2).invoke(obj, obj2)).intValue();
            case 1:
                return ((Number) ((b2) function2).invoke(obj, obj2)).intValue();
            case 2:
                return ((Number) ((hg) function2).invoke(obj, obj2)).intValue();
            case 3:
                return ((Number) ((a2) function2).invoke(obj, obj2)).intValue();
            case 4:
                return ((Number) ((xw) function2).invoke(obj, obj2)).intValue();
            case 5:
                return ((Number) ((l60) function2).invoke(obj, obj2)).intValue();
            case 6:
                return ((Number) ((hg) function2).invoke(obj, obj2)).intValue();
            case 7:
                return MediaSourcePriorityKt.sortMediaSourcesByPriority$lambda$4((a5) function2, obj, obj2);
            case 8:
                return SelectionRegistrarImpl.sort$lambda$1((a5) function2, obj, obj2);
            case 9:
                return SemanticsSortKt.sortByGeometryGroupings$lambda$1(function2, obj, obj2);
            default:
                return ((Number) ((l60) function2).invoke(obj, obj2)).intValue();
        }
    }
}
