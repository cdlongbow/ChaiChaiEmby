package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mk implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextLinkScope b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ mk(TextLinkScope textLinkScope, Function1 function1, int i) {
        this.a = i;
        this.b = textLinkScope;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.c;
        TextLinkScope textLinkScope = this.b;
        switch (i) {
            case 0:
                return BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$6$0(textLinkScope, function1, (TextLayoutResult) obj);
            default:
                return TextLinkScope.StyleAnnotation$lambda$0$0(textLinkScope, function1, (DisposableEffectScope) obj);
        }
    }
}
