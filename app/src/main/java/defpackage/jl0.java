package defpackage;

import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.TypefaceRequest;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jl0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FontFamilyResolverImpl b;

    public /* synthetic */ jl0(FontFamilyResolverImpl fontFamilyResolverImpl, int i) {
        this.a = i;
        this.b = fontFamilyResolverImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        FontFamilyResolverImpl fontFamilyResolverImpl = this.b;
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        switch (i) {
            case 0:
                return FontFamilyResolverImpl.createDefaultTypeface$lambda$0(fontFamilyResolverImpl, typefaceRequest);
            default:
                return FontFamilyResolverImpl.preload$lambda$1(fontFamilyResolverImpl, typefaceRequest);
        }
    }
}
