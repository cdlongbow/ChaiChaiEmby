package defpackage;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q90 implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ MediaItem b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;

    public q90(boolean z, MediaItem mediaItem, String str, int i, List list) {
        this.a = z;
        this.b = mediaItem;
        this.c = str;
        this.d = i;
        this.e = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FocusProperties focusProperties = (FocusProperties) obj;
        focusProperties.getClass();
        focusProperties.setCanFocus(!this.a || Intrinsics.areEqual(this.b.getId(), this.c));
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        focusProperties.setLeft(companion.getCancel());
        if (this.d == CollectionsKt.getLastIndex(this.e)) {
            focusProperties.setRight(companion.getCancel());
        }
        return Unit.INSTANCE;
    }
}
