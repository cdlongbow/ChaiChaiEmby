package defpackage;

import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dr implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContextMenuState b;

    public /* synthetic */ dr(ContextMenuState contextMenuState, int i) {
        this.a = i;
        this.b = contextMenuState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ContextMenuState contextMenuState = this.b;
        switch (i) {
            case 0:
                return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$2$0(contextMenuState);
            case 1:
                return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$13$0(contextMenuState);
            default:
                return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$9$0(contextMenuState);
        }
    }
}
