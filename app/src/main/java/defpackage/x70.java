package defpackage;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x70 implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ MediaItem b;
    public final /* synthetic */ String c;

    public x70(boolean z, MediaItem mediaItem, String str) {
        this.a = z;
        this.b = mediaItem;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FocusProperties focusProperties = (FocusProperties) obj;
        focusProperties.getClass();
        focusProperties.setCanFocus(!this.a || Intrinsics.areEqual(this.b.getId(), this.c));
        focusProperties.setRight(FocusRequester.INSTANCE.getCancel());
        return Unit.INSTANCE;
    }
}
