package defpackage;

import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oa implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidTextContextMenuToolbarProvider b;

    public /* synthetic */ oa(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, int i) {
        this.a = i;
        this.b = androidTextContextMenuToolbarProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = this.b;
        switch (i) {
            case 0:
                return AndroidTextContextMenuToolbarProvider.snapshotStateObserver$lambda$0(androidTextContextMenuToolbarProvider, (Function0) obj);
            case 1:
                return AndroidTextContextMenuToolbarProvider.onDataChange$lambda$0(androidTextContextMenuToolbarProvider, obj);
            case 2:
                return AndroidTextContextMenuToolbarProvider.onPositionChange$lambda$0(androidTextContextMenuToolbarProvider, obj);
            default:
                return AndroidTextContextMenuToolbarProvider_androidKt.platformTextContextMenuToolbarProvider$lambda$1$0(androidTextContextMenuToolbarProvider, (DisposableEffectScope) obj);
        }
    }
}
