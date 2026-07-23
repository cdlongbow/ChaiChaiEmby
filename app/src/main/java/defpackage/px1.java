package defpackage;

import android.content.Context;
import androidx.media3.common.MimeTypes;
import com.dh.myembyapp.data.model.ServerIconEntry;
import com.dh.myembyapp.data.repository.a;
import com.google.gson.Gson;
import java.util.Locale;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public final class px1 {
    public static final Set c = SetsKt.setOf((Object[]) new String[]{"png", "jpg", "jpeg", "webp", "gif", "bmp"});
    public final Context a;
    public final Gson b;

    public px1(Context context) {
        context.getClass();
        this.a = context;
        this.b = new Gson();
    }

    public static final String a(px1 px1Var, String str) {
        String string = StringsKt.trim((CharSequence) str).toString();
        if (!StringsKt__StringsJVMKt.startsWith(string, "http://", true) && !StringsKt__StringsJVMKt.startsWith(string, "https://", true)) {
            string = kb0.x("https://", string);
        }
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(string);
        if (httpUrl == null) {
            ra.q("请输入有效的图标库 URL");
            return null;
        }
        if (Intrinsics.areEqual(httpUrl.scheme(), "http") || Intrinsics.areEqual(httpUrl.scheme(), "https")) {
            return httpUrl.getUrl();
        }
        ra.q("图标库 URL 仅支持 http 或 https");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String b(px1 px1Var, String str, String str2) {
        String string = StringsKt.trim((CharSequence) StringsKt__StringsKt.substringBefore$default(str, ";", (String) null, 2, (Object) null)).toString();
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        String str3 = "jpg";
        switch (lowerCase.hashCode()) {
            case -1487394660:
                if (!lowerCase.equals(MimeTypes.IMAGE_JPEG)) {
                    str3 = null;
                }
                break;
            case -1487018032:
                if (!lowerCase.equals(MimeTypes.IMAGE_WEBP)) {
                    str3 = null;
                } else {
                    str3 = "webp";
                }
                break;
            case -879272239:
                if (!lowerCase.equals(MimeTypes.IMAGE_BMP)) {
                    str3 = null;
                } else {
                    str3 = "bmp";
                }
                break;
            case -879267568:
                if (!lowerCase.equals("image/gif")) {
                    str3 = null;
                } else {
                    str3 = "gif";
                }
                break;
            case -879264467:
                if (!lowerCase.equals("image/jpg")) {
                    str3 = null;
                }
                break;
            case -879258763:
                if (!lowerCase.equals(MimeTypes.IMAGE_PNG)) {
                    str3 = null;
                } else {
                    str3 = "png";
                }
                break;
            default:
                str3 = null;
                break;
        }
        if (str3 != null) {
            return str3;
        }
        String lowerCase2 = StringsKt__StringsKt.substringAfterLast(StringsKt__StringsKt.substringBefore$default(StringsKt__StringsKt.substringBefore$default(str2, '?', (String) null, 2, (Object) null), '#', (String) null, 2, (Object) null), '.', "").toLowerCase(locale);
        lowerCase2.getClass();
        return c.contains(lowerCase2) ? lowerCase2 : "png";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, ServerIconEntry serverIconEntry, String str2, ContinuationImpl continuationImpl) {
        mx1 mx1Var;
        if (continuationImpl instanceof mx1) {
            mx1Var = (mx1) continuationImpl;
            int i = mx1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                mx1Var.g = i - Integer.MIN_VALUE;
            } else {
                mx1Var = new mx1(this, continuationImpl);
            }
        } else {
            mx1Var = new mx1(this, continuationImpl);
        }
        Object objWithContext = mx1Var.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = mx1Var.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            nx1 nx1Var = new nx1(this, serverIconEntry, str, str2, null);
            mx1Var.a = null;
            mx1Var.b = null;
            mx1Var.c = null;
            mx1Var.g = 1;
            objWithContext = BuildersKt.withContext(io2, nx1Var, mx1Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        ox1 ox1Var;
        if (continuationImpl instanceof ox1) {
            ox1Var = (ox1) continuationImpl;
            int i = ox1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ox1Var.d = i - Integer.MIN_VALUE;
            } else {
                ox1Var = new ox1(this, continuationImpl);
            }
        } else {
            ox1Var = new ox1(this, continuationImpl);
        }
        Object objWithContext = ox1Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ox1Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(this, str, null);
            ox1Var.a = null;
            ox1Var.d = 1;
            objWithContext = BuildersKt.withContext(io2, aVar, ox1Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }
}
