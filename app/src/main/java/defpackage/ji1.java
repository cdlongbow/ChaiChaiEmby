package defpackage;

import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import com.dh.myembyapp.data.model.MediaSource;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ji1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ ji1(int i, Function1 function1, Function1 function2) {
        this.a = i;
        this.b = function1;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String lowerCase;
        int i = this.a;
        String str = null;
        Function1 function1 = this.c;
        Function1 function2 = this.b;
        switch (i) {
            case 0:
                MediaSource mediaSource = (MediaSource) obj;
                String str2 = (String) function2.invoke(mediaSource);
                String str3 = (String) function1.invoke(mediaSource);
                str2.getClass();
                Locale locale = Locale.ROOT;
                String lowerCase2 = str2.toLowerCase(locale);
                lowerCase2.getClass();
                if (str3 != null) {
                    lowerCase = str3.toLowerCase(locale);
                    lowerCase.getClass();
                } else {
                    lowerCase = null;
                }
                if (StringsKt__lowerCase2.contains(".m3u8") || Intrinsics.areEqual(lowerCase, "hls")) {
                    str = MimeTypes.APPLICATION_M3U8;
                } else if (StringsKt__lowerCase2.contains(".mpd")) {
                    str = MimeTypes.APPLICATION_MPD;
                }
                MediaItem.Builder uri = new MediaItem.Builder().setUri(str2);
                if (str != null) {
                    uri.setMimeType(str);
                }
                uri.getClass();
                return uri;
            case 1:
                return SnapshotKt.mergedReadObserver$lambda$0(function2, function1, obj);
            case 2:
                return SnapshotKt.mergedWriteObserver$lambda$0(function2, function1, obj);
            case 3:
                return SnapshotObserverKt.mergeObservers$lambda$1(function2, function1, obj);
            case 4:
                return Boolean.valueOf(TextContextMenuModifierKt.traverseTextContextMenuDataNodes$lambda$0(function2, function1, (TraversableNode) obj));
            default:
                jf jfVar = (jf) obj;
                if (!(jfVar instanceof gf)) {
                    if (jfVar instanceof hf) {
                        if (function2 != null) {
                            function2.invoke(jfVar);
                        }
                    } else if (jfVar instanceof ff) {
                        if (function1 != null) {
                            function1.invoke(jfVar);
                        }
                    } else if (!(jfVar instanceof ef)) {
                        qu.f();
                        return null;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
