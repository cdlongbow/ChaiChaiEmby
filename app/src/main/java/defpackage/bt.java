package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bt implements Function5 {
    public final /* synthetic */ int a;

    public /* synthetic */ bt(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 0:
                return ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda_129995601$lambda$0((TextContextMenuSession) obj, (TextContextMenuDataProvider) obj2, (Function0) obj3, (Composer) obj4, ((Integer) obj5).intValue());
            case 1:
                return ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda_636288403$lambda$0((TextContextMenuSession) obj, (TextContextMenuDataProvider) obj2, (Function0) obj3, (Composer) obj4, ((Integer) obj5).intValue());
            case 2:
                return ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda__1357803046$lambda$0((TextContextMenuSession) obj, (TextContextMenuDataProvider) obj2, (Function0) obj3, (Composer) obj4, ((Integer) obj5).intValue());
            default:
                return ProcessTextApi23Impl.onClickProcessTextItem$lambda$0((Context) obj, (ResolveInfo) obj2, ((Boolean) obj3).booleanValue(), (CharSequence) obj4, (TextRange) obj5);
        }
    }
}
