package defpackage;

import androidx.compose.runtime.LinkComposer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yz0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkComposer b;

    public /* synthetic */ yz0(LinkComposer linkComposer, int i) {
        this.a = i;
        this.b = linkComposer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        LinkComposer linkComposer = this.b;
        switch (i) {
            case 0:
                break;
        }
        return linkComposer.currentStackTrace();
    }
}
