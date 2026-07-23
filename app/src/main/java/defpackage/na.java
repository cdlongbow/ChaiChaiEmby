package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class na implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidTextContextMenuToolbarProvider b;
    public final /* synthetic */ TextContextMenuDataProvider c;

    public /* synthetic */ na(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, TextContextMenuDataProvider textContextMenuDataProvider, int i) {
        this.a = i;
        this.b = androidTextContextMenuToolbarProvider;
        this.c = textContextMenuDataProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        TextContextMenuDataProvider textContextMenuDataProvider = this.c;
        AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = this.b;
        switch (i) {
            case 0:
                return androidTextContextMenuToolbarProvider.observeAndGetData(textContextMenuDataProvider);
            case 1:
                return androidTextContextMenuToolbarProvider.observeAndGetBounds(textContextMenuDataProvider);
            default:
                return AndroidTextContextMenuToolbarProvider.observeAndGetBounds$lambda$0(androidTextContextMenuToolbarProvider, textContextMenuDataProvider);
        }
    }
}
