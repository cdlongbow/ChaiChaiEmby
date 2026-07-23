package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vn {
    public static final v81 a(Response response) {
        BufferedSource bufferedSourceSource;
        int iCode = response.code();
        long jSentRequestAtMillis = response.sentRequestAtMillis();
        long jReceivedResponseAtMillis = response.receivedResponseAtMillis();
        Headers headers = response.headers();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair<? extends String, ? extends String> pair : headers) {
            String strComponent1 = pair.component1();
            String strComponent2 = pair.component2();
            String lowerCase = strComponent1.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strComponent2);
        }
        t81 t81Var = new t81(MapsKt.toMap(linkedHashMap));
        ResponseBody responseBodyBody = response.body();
        return new v81(iCode, jSentRequestAtMillis, jReceivedResponseAtMillis, t81Var, (responseBodyBody == null || (bufferedSourceSource = responseBodyBody.getSource()) == null) ? null : new q22(bufferedSourceSource), response);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c A[LOOP:1: B:24:0x0086->B:26:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Request b(u81 u81Var, ContinuationImpl continuationImpl) {
        un unVar;
        Request.Builder builder;
        String str;
        Request.Builder builder2;
        u81 u81Var2;
        RequestBody requestBodyCreate$default;
        Headers.Builder builder3;
        String str2;
        Iterator it;
        if (continuationImpl instanceof un) {
            unVar = (un) continuationImpl;
            int i = unVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                unVar.b = i - Integer.MIN_VALUE;
            } else {
                unVar = new un(continuationImpl);
            }
        } else {
            unVar = new un(continuationImpl);
        }
        Object obj = unVar.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = unVar.b;
        Request.Builder builder4 = null;
        if (i2 != 0) {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            ByteString byteString = (ByteString) obj;
            if (byteString != null) {
                requestBodyCreate$default = RequestBody.Companion.create$default(RequestBody.INSTANCE, byteString, (MediaType) null, 1, (Object) null);
                u81Var2 = null;
                builder2 = null;
                str = null;
            } else {
                u81Var = null;
                builder = null;
                builder2 = null;
                str = null;
            }
            builder4.method(str, requestBodyCreate$default);
            t81 t81Var = u81Var2.c;
            builder3 = new Headers.Builder();
            for (Map.Entry entry : t81Var.a.entrySet()) {
                str2 = (String) entry.getKey();
                it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    builder3.addUnsafeNonAscii(str2, (String) it.next());
                }
            }
            builder2.headers(builder3.build());
            return builder2.build();
        }
        ResultKt.throwOnFailure(obj);
        builder = new Request.Builder();
        builder.url(u81Var.a);
        str = u81Var.b;
        builder2 = builder;
        Request.Builder builder5 = builder;
        u81Var2 = u81Var;
        requestBodyCreate$default = null;
        builder4 = builder5;
        builder4.method(str, requestBodyCreate$default);
        t81 t81Var2 = u81Var2.c;
        builder3 = new Headers.Builder();
        while (r5.hasNext()) {
            str2 = (String) entry.getKey();
            it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                builder3.addUnsafeNonAscii(str2, (String) it.next());
            }
        }
        builder2.headers(builder3.build());
        return builder2.build();
    }
}
