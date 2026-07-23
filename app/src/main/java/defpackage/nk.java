package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextLinkScope;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextLinkScope b;

    public /* synthetic */ nk(TextLinkScope textLinkScope, int i) {
        this.a = i;
        this.b = textLinkScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zLayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0;
        int i = this.a;
        TextLinkScope textLinkScope = this.b;
        switch (i) {
            case 0:
                zLayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0 = BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0(textLinkScope);
                break;
            case 1:
                zLayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0 = BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$8$0(textLinkScope);
                break;
            default:
                zLayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0 = TextLinkScope._get_shouldMeasureLinks_$lambda$0(textLinkScope);
                break;
        }
        return Boolean.valueOf(zLayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0);
    }
}
