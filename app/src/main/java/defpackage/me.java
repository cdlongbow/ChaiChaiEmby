package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.util.Xml;
import android.webkit.MimeTypeMap;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.io.IOException;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import okio.Okio;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class me implements ck0 {
    public final /* synthetic */ int a;
    public final rd2 b;
    public final wa1 c;

    public /* synthetic */ me(rd2 rd2Var, wa1 wa1Var, int i) {
        this.a = i;
        this.b = rd2Var;
        this.c = wa1Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:50:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    @Override // defpackage.ck0
    public final Object a(eg0 eg0Var) throws XmlPullParserException, IOException {
        Integer intOrNull;
        String mimeTypeFromExtension;
        Drawable drawable;
        int i = this.a;
        rd2 rd2Var = this.b;
        wa1 wa1Var = this.c;
        String mimeTypeFromExtension2 = null;
        switch (i) {
            case 0:
                String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.drop(ku.A(rd2Var), 1), "/", null, null, 0, null, null, 62, null);
                p22 p22Var = new p22(Okio.buffer(Okio.source(wa1Var.a.getAssets().open(strJoinToString$default))), wa1Var.f, new ke(strJoinToString$default));
                if (!StringsKt.isBlank(strJoinToString$default)) {
                    String strSubstringAfterLast = StringsKt__StringsKt.substringAfterLast(StringsKt__StringsKt.substringAfterLast$default(StringsKt__StringsKt.substringBeforeLast$default(StringsKt__StringsKt.substringBeforeLast$default(strJoinToString$default, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', "");
                    if (!StringsKt.isBlank(strSubstringAfterLast)) {
                        String lowerCase = strSubstringAfterLast.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        mimeTypeFromExtension2 = (String) r41.a.get(lowerCase);
                        if (mimeTypeFromExtension2 == null) {
                            mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                        }
                    }
                }
                return new o22(p22Var, mimeTypeFromExtension2, o00.c);
            default:
                String str = rd2Var.d;
                if (str != null) {
                    if (StringsKt.isBlank(str)) {
                        str = null;
                    }
                    if (str != null) {
                        String str2 = (String) CollectionsKt.lastOrNull(ku.A(rd2Var));
                        if (str2 == null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) {
                            vm0.n("Invalid android.resource URI: ", rd2Var);
                            return null;
                        }
                        int iIntValue = intOrNull.intValue();
                        Context context = wa1Var.a;
                        Resources resources = Intrinsics.areEqual(str, context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        String string = typedValue.string.toString();
                        if (StringsKt.isBlank(string)) {
                            mimeTypeFromExtension = null;
                        } else {
                            String strSubstringAfterLast2 = StringsKt__StringsKt.substringAfterLast(StringsKt__StringsKt.substringAfterLast$default(StringsKt__StringsKt.substringBeforeLast$default(StringsKt__StringsKt.substringBeforeLast$default(string, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', "");
                            if (StringsKt.isBlank(strSubstringAfterLast2)) {
                                mimeTypeFromExtension = null;
                            } else {
                                String lowerCase2 = strSubstringAfterLast2.toLowerCase(Locale.ROOT);
                                lowerCase2.getClass();
                                mimeTypeFromExtension = (String) r41.a.get(lowerCase2);
                                if (mimeTypeFromExtension == null) {
                                    mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase2);
                                }
                            }
                        }
                        if (!Intrinsics.areEqual(mimeTypeFromExtension, "text/xml")) {
                            return new o22(new p22(Okio.buffer(Okio.source(resources.openRawResource(iIntValue, new TypedValue()))), wa1Var.f, new ut1(str, iIntValue)), mimeTypeFromExtension, o00.c);
                        }
                        if (Intrinsics.areEqual(str, context.getPackageName())) {
                            drawable = AppCompatResources.getDrawable(context, iIntValue);
                            if (drawable == null) {
                                rd1.k(i9.f(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            if (Build.VERSION.SDK_INT < 24) {
                                String name = xml.getName();
                                if (Intrinsics.areEqual(name, "vector")) {
                                    drawable = VectorDrawableCompat.createFromXmlInner(resources, (XmlPullParser) xml, Xml.asAttributeSet(xml), context.getTheme());
                                } else if (Intrinsics.areEqual(name, "animated-vector")) {
                                    drawable = AnimatedVectorDrawableCompat.createFromXmlInner(context, resources, xml, Xml.asAttributeSet(xml), context.getTheme());
                                } else {
                                    drawable = ResourcesCompat.getDrawable(resources, iIntValue, context.getTheme());
                                    if (drawable == null) {
                                        rd1.k(i9.f(iIntValue, "Invalid resource ID: "));
                                        return null;
                                    }
                                }
                            } else {
                                drawable = ResourcesCompat.getDrawable(resources, iIntValue, context.getTheme());
                                if (drawable == null) {
                                    rd1.k(i9.f(iIntValue, "Invalid resource ID: "));
                                    return null;
                                }
                            }
                        }
                        Drawable bitmapDrawable = drawable;
                        Bitmap.Config[] configArr = ce2.a;
                        boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof VectorDrawableCompat);
                        if (z) {
                            bitmapDrawable = new BitmapDrawable(context.getResources(), tl0.i(bitmapDrawable, (Bitmap.Config) tl0.v(wa1Var, is0.b), wa1Var.b, wa1Var.c, (n12) tl0.v(wa1Var, hs0.b), wa1Var.d == jp1.b));
                        }
                        return new ur0(ig2.f(bitmapDrawable), z, o00.c);
                    }
                }
                vm0.n("Invalid android.resource URI: ", rd2Var);
                return null;
        }
    }
}
