package defpackage;

import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yl1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ eo1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl1(Function0 function0, eo1 eo1Var) {
        super(0, Intrinsics.Kotlin.class, "resolvePreferredEnabledSubtitleStreamIndexForTranscode", "PlayerScreenContent$lambda$121$resolvePreferredEnabledSubtitleStreamIndexForTranscode(Lkotlin/jvm/functions/Function0;Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;)Ljava/lang/Integer;", 0);
        this.a = function0;
        this.b = eo1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object EmptyList;
        Object next;
        Object next2;
        List<MediaStream> mediaStreams;
        MediaSource mediaSource = (MediaSource) this.a.invoke();
        Integer num = this.b.k;
        if (mediaSource == null || (mediaStreams = mediaSource.getMediaStreams()) == null) {
            EmptyList = CollectionsKt.emptyList();
        } else {
            EmptyList = new ArrayList();
            for (Object obj : mediaStreams) {
                if (Intrinsics.areEqual(((MediaStream) obj).getType(), "Subtitle")) {
                    EmptyList.add(obj);
                }
            }
        }
        int index = -1;
        if (EmptyList.isEmpty()) {
            return -1;
        }
        Object obj2 = null;
        if (num != null) {
            int iIntValue = num.intValue();
            Iterator it = EmptyList.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((MediaStream) next2).getIndex() != iIntValue);
            MediaStream mediaStream = (MediaStream) next2;
            if (iIntValue < 0 || (!in1.h(mediaStream, Integer.valueOf(iIntValue)) && !in1.g(mediaStream))) {
                num = null;
            }
            if (num != null) {
                return Integer.valueOf(num.intValue());
            }
        }
        Iterator it2 = EmptyList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            MediaStream mediaStream2 = (MediaStream) next;
            if (mediaStream2.isDefault() && (in1.h(mediaStream2, Integer.valueOf(mediaStream2.getIndex())) || in1.g(mediaStream2))) {
                break;
            }
        }
        MediaStream mediaStream3 = (MediaStream) next;
        if (mediaStream3 != null) {
            index = mediaStream3.getIndex();
        } else {
            for (Object obj3 : EmptyList) {
                MediaStream mediaStream4 = (MediaStream) obj3;
                if (in1.h(mediaStream4, Integer.valueOf(mediaStream4.getIndex())) || in1.g(mediaStream4)) {
                    obj2 = obj3;
                    break;
                }
            }
            MediaStream mediaStream5 = (MediaStream) obj2;
            if (mediaStream5 != null) {
                index = mediaStream5.getIndex();
            }
        }
        return Integer.valueOf(index);
    }
}
