package defpackage;

import android.content.Context;
import android.util.Log;

import com.dh.myembyapp.data.api.ExternalHttpClient;
import com.dh.myembyapp.data.api.RetrofitClient;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class ue extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qe c;
    public final /* synthetic */ ne d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String g;
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue(String str, qe qeVar, ne neVar, String str2, String str3, Context context, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = qeVar;
        this.d = neVar;
        this.e = str2;
        this.g = str3;
        this.h = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ue ueVar = new ue(this.b, this.c, this.d, this.e, this.g, this.h, continuation);
        ueVar.a = obj;
        return ueVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ue) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:168:0x03c5 A[Catch: all -> 0x03ba, TryCatch #2 {all -> 0x03ba, blocks: (B:97:0x0216, B:99:0x021c, B:101:0x0222, B:166:0x03bd, B:167:0x03c4, B:168:0x03c5, B:169:0x03df), top: B:185:0x0216, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x03e6 A[Catch: all -> 0x03f7, TryCatch #1 {all -> 0x03f7, blocks: (B:3:0x0018, B:5:0x0028, B:7:0x0044, B:11:0x005f, B:14:0x0066, B:16:0x006d, B:20:0x0080, B:43:0x00d7, B:45:0x00df, B:47:0x00f2, B:51:0x00fc, B:54:0x0102, B:70:0x0121, B:75:0x012e, B:77:0x0164, B:78:0x0172, B:80:0x017f, B:82:0x018e, B:83:0x0192, B:86:0x0198, B:89:0x019e, B:93:0x01aa, B:95:0x01b6, B:96:0x01e3, B:104:0x0229, B:107:0x0243, B:110:0x024b, B:111:0x025a, B:114:0x0273, B:130:0x02ad, B:142:0x02f7, B:143:0x0340, B:161:0x0375, B:145:0x0344, B:149:0x0350, B:153:0x035c, B:157:0x0368, B:133:0x02b4, B:134:0x02bc, B:117:0x0288, B:120:0x0291, B:122:0x0295, B:124:0x029d, B:126:0x02a3, B:128:0x02a9, B:135:0x02bd, B:137:0x02c3, B:141:0x02ce, B:162:0x03b2, B:163:0x03b9, B:172:0x03e2, B:173:0x03e5, B:174:0x03e6, B:175:0x03ee, B:61:0x010f, B:63:0x0113, B:68:0x011d, B:23:0x0087, B:26:0x008e, B:28:0x0095, B:32:0x00a8, B:33:0x00ab, B:35:0x00b2, B:37:0x00c7, B:41:0x00d3, B:176:0x03ef, B:177:0x03f6, B:170:0x03e0, B:97:0x0216, B:99:0x021c, B:101:0x0222, B:166:0x03bd, B:167:0x03c4, B:168:0x03c5, B:169:0x03df), top: B:184:0x0018, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7 A[Catch: all -> 0x03f7, TryCatch #1 {all -> 0x03f7, blocks: (B:3:0x0018, B:5:0x0028, B:7:0x0044, B:11:0x005f, B:14:0x0066, B:16:0x006d, B:20:0x0080, B:43:0x00d7, B:45:0x00df, B:47:0x00f2, B:51:0x00fc, B:54:0x0102, B:70:0x0121, B:75:0x012e, B:77:0x0164, B:78:0x0172, B:80:0x017f, B:82:0x018e, B:83:0x0192, B:86:0x0198, B:89:0x019e, B:93:0x01aa, B:95:0x01b6, B:96:0x01e3, B:104:0x0229, B:107:0x0243, B:110:0x024b, B:111:0x025a, B:114:0x0273, B:130:0x02ad, B:142:0x02f7, B:143:0x0340, B:161:0x0375, B:145:0x0344, B:149:0x0350, B:153:0x035c, B:157:0x0368, B:133:0x02b4, B:134:0x02bc, B:117:0x0288, B:120:0x0291, B:122:0x0295, B:124:0x029d, B:126:0x02a3, B:128:0x02a9, B:135:0x02bd, B:137:0x02c3, B:141:0x02ce, B:162:0x03b2, B:163:0x03b9, B:172:0x03e2, B:173:0x03e5, B:174:0x03e6, B:175:0x03ee, B:61:0x010f, B:63:0x0113, B:68:0x011d, B:23:0x0087, B:26:0x008e, B:28:0x0095, B:32:0x00a8, B:33:0x00ab, B:35:0x00b2, B:37:0x00c7, B:41:0x00d3, B:176:0x03ef, B:177:0x03f6, B:170:0x03e0, B:97:0x0216, B:99:0x021c, B:101:0x0222, B:166:0x03bd, B:167:0x03c4, B:168:0x03c5, B:169:0x03df), top: B:184:0x0018, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00df A[Catch: all -> 0x03f7, TryCatch #1 {all -> 0x03f7, blocks: (B:3:0x0018, B:5:0x0028, B:7:0x0044, B:11:0x005f, B:14:0x0066, B:16:0x006d, B:20:0x0080, B:43:0x00d7, B:45:0x00df, B:47:0x00f2, B:51:0x00fc, B:54:0x0102, B:70:0x0121, B:75:0x012e, B:77:0x0164, B:78:0x0172, B:80:0x017f, B:82:0x018e, B:83:0x0192, B:86:0x0198, B:89:0x019e, B:93:0x01aa, B:95:0x01b6, B:96:0x01e3, B:104:0x0229, B:107:0x0243, B:110:0x024b, B:111:0x025a, B:114:0x0273, B:130:0x02ad, B:142:0x02f7, B:143:0x0340, B:161:0x0375, B:145:0x0344, B:149:0x0350, B:153:0x035c, B:157:0x0368, B:133:0x02b4, B:134:0x02bc, B:117:0x0288, B:120:0x0291, B:122:0x0295, B:124:0x029d, B:126:0x02a3, B:128:0x02a9, B:135:0x02bd, B:137:0x02c3, B:141:0x02ce, B:162:0x03b2, B:163:0x03b9, B:172:0x03e2, B:173:0x03e5, B:174:0x03e6, B:175:0x03ee, B:61:0x010f, B:63:0x0113, B:68:0x011d, B:23:0x0087, B:26:0x008e, B:28:0x0095, B:32:0x00a8, B:33:0x00ab, B:35:0x00b2, B:37:0x00c7, B:41:0x00d3, B:176:0x03ef, B:177:0x03f6, B:170:0x03e0, B:97:0x0216, B:99:0x021c, B:101:0x0222, B:166:0x03bd, B:167:0x03c4, B:168:0x03c5, B:169:0x03df), top: B:184:0x0018, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102 A[Catch: all -> 0x03f7, TryCatch #1 {all -> 0x03f7, blocks: (B:3:0x0018, B:5:0x0028, B:7:0x0044, B:11:0x005f, B:14:0x0066, B:16:0x006d, B:20:0x0080, B:43:0x00d7, B:45:0x00df, B:47:0x00f2, B:51:0x00fc, B:54:0x0102, B:70:0x0121, B:75:0x012e, B:77:0x0164, B:78:0x0172, B:80:0x017f, B:82:0x018e, B:83:0x0192, B:86:0x0198, B:89:0x019e, B:93:0x01aa, B:95:0x01b6, B:96:0x01e3, B:104:0x0229, B:107:0x0243, B:110:0x024b, B:111:0x025a, B:114:0x0273, B:130:0x02ad, B:142:0x02f7, B:143:0x0340, B:161:0x0375, B:145:0x0344, B:149:0x0350, B:153:0x035c, B:157:0x0368, B:133:0x02b4, B:134:0x02bc, B:117:0x0288, B:120:0x0291, B:122:0x0295, B:124:0x029d, B:126:0x02a3, B:128:0x02a9, B:135:0x02bd, B:137:0x02c3, B:141:0x02ce, B:162:0x03b2, B:163:0x03b9, B:172:0x03e2, B:173:0x03e5, B:174:0x03e6, B:175:0x03ee, B:61:0x010f, B:63:0x0113, B:68:0x011d, B:23:0x0087, B:26:0x008e, B:28:0x0095, B:32:0x00a8, B:33:0x00ab, B:35:0x00b2, B:37:0x00c7, B:41:0x00d3, B:176:0x03ef, B:177:0x03f6, B:170:0x03e0, B:97:0x0216, B:99:0x021c, B:101:0x0222, B:166:0x03bd, B:167:0x03c4, B:168:0x03c5, B:169:0x03df), top: B:184:0x0018, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0108  */
    /* JADX WARN: Code duplicated, block: B:57:0x0109  */
    /* JADX WARN: Code duplicated, block: B:59:0x010c  */
    /* JADX WARN: Code duplicated, block: B:60:0x010d  */
    /* JADX WARN: Code duplicated, block: B:61:0x010f A[Catch: all -> 0x03f7, TryCatch #1 {all -> 0x03f7, blocks: (B:3:0x0018, B:5:0x0028, B:7:0x0044, B:11:0x005f, B:14:0x0066, B:16:0x006d, B:20:0x0080, B:43:0x00d7, B:45:0x00df, B:47:0x00f2, B:51:0x00fc, B:54:0x0102, B:70:0x0121, B:75:0x012e, B:77:0x0164, B:78:0x0172, B:80:0x017f, B:82:0x018e, B:83:0x0192, B:86:0x0198, B:89:0x019e, B:93:0x01aa, B:95:0x01b6, B:96:0x01e3, B:104:0x0229, B:107:0x0243, B:110:0x024b, B:111:0x025a, B:114:0x0273, B:130:0x02ad, B:142:0x02f7, B:143:0x0340, B:161:0x0375, B:145:0x0344, B:149:0x0350, B:153:0x035c, B:157:0x0368, B:133:0x02b4, B:134:0x02bc, B:117:0x0288, B:120:0x0291, B:122:0x0295, B:124:0x029d, B:126:0x02a3, B:128:0x02a9, B:135:0x02bd, B:137:0x02c3, B:141:0x02ce, B:162:0x03b2, B:163:0x03b9, B:172:0x03e2, B:173:0x03e5, B:174:0x03e6, B:175:0x03ee, B:61:0x010f, B:63:0x0113, B:68:0x011d, B:23:0x0087, B:26:0x008e, B:28:0x0095, B:32:0x00a8, B:33:0x00ab, B:35:0x00b2, B:37:0x00c7, B:41:0x00d3, B:176:0x03ef, B:177:0x03f6, B:170:0x03e0, B:97:0x0216, B:99:0x021c, B:101:0x0222, B:166:0x03bd, B:167:0x03c4, B:168:0x03c5, B:169:0x03df), top: B:184:0x0018, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x011a  */
    /* JADX WARN: Code duplicated, block: B:68:0x011d A[Catch: all -> 0x03f7, TryCatch #1 {all -> 0x03f7, blocks: (B:3:0x0018, B:5:0x0028, B:7:0x0044, B:11:0x005f, B:14:0x0066, B:16:0x006d, B:20:0x0080, B:43:0x00d7, B:45:0x00df, B:47:0x00f2, B:51:0x00fc, B:54:0x0102, B:70:0x0121, B:75:0x012e, B:77:0x0164, B:78:0x0172, B:80:0x017f, B:82:0x018e, B:83:0x0192, B:86:0x0198, B:89:0x019e, B:93:0x01aa, B:95:0x01b6, B:96:0x01e3, B:104:0x0229, B:107:0x0243, B:110:0x024b, B:111:0x025a, B:114:0x0273, B:130:0x02ad, B:142:0x02f7, B:143:0x0340, B:161:0x0375, B:145:0x0344, B:149:0x0350, B:153:0x035c, B:157:0x0368, B:133:0x02b4, B:134:0x02bc, B:117:0x0288, B:120:0x0291, B:122:0x0295, B:124:0x029d, B:126:0x02a3, B:128:0x02a9, B:135:0x02bd, B:137:0x02c3, B:141:0x02ce, B:162:0x03b2, B:163:0x03b9, B:172:0x03e2, B:173:0x03e5, B:174:0x03e6, B:175:0x03ee, B:61:0x010f, B:63:0x0113, B:68:0x011d, B:23:0x0087, B:26:0x008e, B:28:0x0095, B:32:0x00a8, B:33:0x00ab, B:35:0x00b2, B:37:0x00c7, B:41:0x00d3, B:176:0x03ef, B:177:0x03f6, B:170:0x03e0, B:97:0x0216, B:99:0x021c, B:101:0x0222, B:166:0x03bd, B:167:0x03c4, B:168:0x03c5, B:169:0x03df), top: B:184:0x0018, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0120  */
    /* JADX WARN: Code duplicated, block: B:72:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0129  */
    /* JADX WARN: Code duplicated, block: B:74:0x012c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0164 A[Catch: all -> 0x03f7, LOOP:3: B:76:0x0162->B:77:0x0164, LOOP_END, TryCatch #1 {all -> 0x03f7, blocks: (B:3:0x0018, B:5:0x0028, B:7:0x0044, B:11:0x005f, B:14:0x0066, B:16:0x006d, B:20:0x0080, B:43:0x00d7, B:45:0x00df, B:47:0x00f2, B:51:0x00fc, B:54:0x0102, B:70:0x0121, B:75:0x012e, B:77:0x0164, B:78:0x0172, B:80:0x017f, B:82:0x018e, B:83:0x0192, B:86:0x0198, B:89:0x019e, B:93:0x01aa, B:95:0x01b6, B:96:0x01e3, B:104:0x0229, B:107:0x0243, B:110:0x024b, B:111:0x025a, B:114:0x0273, B:130:0x02ad, B:142:0x02f7, B:143:0x0340, B:161:0x0375, B:145:0x0344, B:149:0x0350, B:153:0x035c, B:157:0x0368, B:133:0x02b4, B:134:0x02bc, B:117:0x0288, B:120:0x0291, B:122:0x0295, B:124:0x029d, B:126:0x02a3, B:128:0x02a9, B:135:0x02bd, B:137:0x02c3, B:141:0x02ce, B:162:0x03b2, B:163:0x03b9, B:172:0x03e2, B:173:0x03e5, B:174:0x03e6, B:175:0x03ee, B:61:0x010f, B:63:0x0113, B:68:0x011d, B:23:0x0087, B:26:0x008e, B:28:0x0095, B:32:0x00a8, B:33:0x00ab, B:35:0x00b2, B:37:0x00c7, B:41:0x00d3, B:176:0x03ef, B:177:0x03f6, B:170:0x03e0, B:97:0x0216, B:99:0x021c, B:101:0x0222, B:166:0x03bd, B:167:0x03c4, B:168:0x03c5, B:169:0x03df), top: B:184:0x0018, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x017f A[Catch: all -> 0x03f7, TryCatch #1 {all -> 0x03f7, blocks: (B:3:0x0018, B:5:0x0028, B:7:0x0044, B:11:0x005f, B:14:0x0066, B:16:0x006d, B:20:0x0080, B:43:0x00d7, B:45:0x00df, B:47:0x00f2, B:51:0x00fc, B:54:0x0102, B:70:0x0121, B:75:0x012e, B:77:0x0164, B:78:0x0172, B:80:0x017f, B:82:0x018e, B:83:0x0192, B:86:0x0198, B:89:0x019e, B:93:0x01aa, B:95:0x01b6, B:96:0x01e3, B:104:0x0229, B:107:0x0243, B:110:0x024b, B:111:0x025a, B:114:0x0273, B:130:0x02ad, B:142:0x02f7, B:143:0x0340, B:161:0x0375, B:145:0x0344, B:149:0x0350, B:153:0x035c, B:157:0x0368, B:133:0x02b4, B:134:0x02bc, B:117:0x0288, B:120:0x0291, B:122:0x0295, B:124:0x029d, B:126:0x02a3, B:128:0x02a9, B:135:0x02bd, B:137:0x02c3, B:141:0x02ce, B:162:0x03b2, B:163:0x03b9, B:172:0x03e2, B:173:0x03e5, B:174:0x03e6, B:175:0x03ee, B:61:0x010f, B:63:0x0113, B:68:0x011d, B:23:0x0087, B:26:0x008e, B:28:0x0095, B:32:0x00a8, B:33:0x00ab, B:35:0x00b2, B:37:0x00c7, B:41:0x00d3, B:176:0x03ef, B:177:0x03f6, B:170:0x03e0, B:97:0x0216, B:99:0x021c, B:101:0x0222, B:166:0x03bd, B:167:0x03c4, B:168:0x03c5, B:169:0x03df), top: B:184:0x0018, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0198 A[Catch: all -> 0x03f7, TryCatch #1 {all -> 0x03f7, blocks: (B:3:0x0018, B:5:0x0028, B:7:0x0044, B:11:0x005f, B:14:0x0066, B:16:0x006d, B:20:0x0080, B:43:0x00d7, B:45:0x00df, B:47:0x00f2, B:51:0x00fc, B:54:0x0102, B:70:0x0121, B:75:0x012e, B:77:0x0164, B:78:0x0172, B:80:0x017f, B:82:0x018e, B:83:0x0192, B:86:0x0198, B:89:0x019e, B:93:0x01aa, B:95:0x01b6, B:96:0x01e3, B:104:0x0229, B:107:0x0243, B:110:0x024b, B:111:0x025a, B:114:0x0273, B:130:0x02ad, B:142:0x02f7, B:143:0x0340, B:161:0x0375, B:145:0x0344, B:149:0x0350, B:153:0x035c, B:157:0x0368, B:133:0x02b4, B:134:0x02bc, B:117:0x0288, B:120:0x0291, B:122:0x0295, B:124:0x029d, B:126:0x02a3, B:128:0x02a9, B:135:0x02bd, B:137:0x02c3, B:141:0x02ce, B:162:0x03b2, B:163:0x03b9, B:172:0x03e2, B:173:0x03e5, B:174:0x03e6, B:175:0x03ee, B:61:0x010f, B:63:0x0113, B:68:0x011d, B:23:0x0087, B:26:0x008e, B:28:0x0095, B:32:0x00a8, B:33:0x00ab, B:35:0x00b2, B:37:0x00c7, B:41:0x00d3, B:176:0x03ef, B:177:0x03f6, B:170:0x03e0, B:97:0x0216, B:99:0x021c, B:101:0x0222, B:166:0x03bd, B:167:0x03c4, B:168:0x03c5, B:169:0x03df), top: B:184:0x0018, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x019b  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b6 A[Catch: all -> 0x03f7, TryCatch #1 {all -> 0x03f7, blocks: (B:3:0x0018, B:5:0x0028, B:7:0x0044, B:11:0x005f, B:14:0x0066, B:16:0x006d, B:20:0x0080, B:43:0x00d7, B:45:0x00df, B:47:0x00f2, B:51:0x00fc, B:54:0x0102, B:70:0x0121, B:75:0x012e, B:77:0x0164, B:78:0x0172, B:80:0x017f, B:82:0x018e, B:83:0x0192, B:86:0x0198, B:89:0x019e, B:93:0x01aa, B:95:0x01b6, B:96:0x01e3, B:104:0x0229, B:107:0x0243, B:110:0x024b, B:111:0x025a, B:114:0x0273, B:130:0x02ad, B:142:0x02f7, B:143:0x0340, B:161:0x0375, B:145:0x0344, B:149:0x0350, B:153:0x035c, B:157:0x0368, B:133:0x02b4, B:134:0x02bc, B:117:0x0288, B:120:0x0291, B:122:0x0295, B:124:0x029d, B:126:0x02a3, B:128:0x02a9, B:135:0x02bd, B:137:0x02c3, B:141:0x02ce, B:162:0x03b2, B:163:0x03b9, B:172:0x03e2, B:173:0x03e5, B:174:0x03e6, B:175:0x03ee, B:61:0x010f, B:63:0x0113, B:68:0x011d, B:23:0x0087, B:26:0x008e, B:28:0x0095, B:32:0x00a8, B:33:0x00ab, B:35:0x00b2, B:37:0x00c7, B:41:0x00d3, B:176:0x03ef, B:177:0x03f6, B:170:0x03e0, B:97:0x0216, B:99:0x021c, B:101:0x0222, B:166:0x03bd, B:167:0x03c4, B:168:0x03c5, B:169:0x03df), top: B:184:0x0018, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x021c A[Catch: all -> 0x03ba, TryCatch #2 {all -> 0x03ba, blocks: (B:97:0x0216, B:99:0x021c, B:101:0x0222, B:166:0x03bd, B:167:0x03c4, B:168:0x03c5, B:169:0x03df), top: B:185:0x0216, outer: #1 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:168:0x03c5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x01b6, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        int i;
        Object obj2;
        oe oeVar;
        Object obj3;
        oe oeVar2;
        String str;
        String str2;
        ArrayList arrayList;
        int size;
        int i2;
        ArrayList arrayList2;
        int size2;
        int i3;
        String str3;
        Response responseExecute;
        ResponseBody responseBodyBody;
        byte[] bArrBytes;
        File file;
        String str4;
        Object obj4;
        int size3;
        int i4;
        Object obj5;
        oe oeVar3;
        Object obj6;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str5 = this.b;
        qe qeVar = this.c;
        ne neVar = this.d;
        Context context = this.h;
        try {
            Result.Companion companion = Result.INSTANCE;
            String string = StringsKt.trim((CharSequence) str5).toString();
            if (StringsKt.isBlank(string)) {
                throw new IllegalArgumentException("ASSRT API Key 为空");
            }
            ye yeVar = ye.a;
            re reVarB = ye.b(string, qeVar, neVar);
            String str6 = qeVar.b;
            String str7 = qeVar.a;
            ArrayList arrayList3 = reVarB.b;
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            int size4 = arrayList3.size();
            int i5 = 0;
            while (i5 < size4) {
                Object obj7 = arrayList3.get(i5);
                i5++;
                se seVar = (se) obj7;
                arrayList4.add(new oe(seVar.a, seVar.b));
            }
            String str8 = this.e;
            String str9 = this.g;
            if (str8 == null || StringsKt.isBlank(str8)) {
                if (str9 == null || StringsKt.isBlank(str9)) {
                    int size5 = arrayList4.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size5) {
                            i = 0;
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList4.get(i6);
                        i6++;
                        oe oeVar4 = (oe) obj2;
                        ye yeVar2 = ye.a;
                        i = 0;
                        if (ye.m(oeVar4.b) && ye.k(oeVar4.a)) {
                            break;
                        }
                    }
                    oeVar = (oe) obj2;
                } else {
                    int size6 = arrayList4.size();
                    int i7 = 0;
                    do {
                        if (i7 >= size6) {
                            obj3 = null;
                            break;
                        }
                        obj3 = arrayList4.get(i7);
                        i7++;
                    } while (!Intrinsics.areEqual(((oe) obj3).a, str9));
                    oeVar = (oe) obj3;
                }
                if (oeVar == null) {
                    size3 = arrayList4.size();
                    i4 = i;
                    while (true) {
                        if (i4 < size3) {
                            obj5 = null;
                            break;
                        }
                        obj5 = arrayList4.get(i4);
                        i4++;
                        oeVar3 = (oe) obj5;
                        ye yeVar3 = ye.a;
                        if (!ye.m(oeVar3.b) && ye.k(oeVar3.a)) {
                            break;
                        }
                    }
                    oeVar2 = (oe) obj5;
                } else {
                    oeVar2 = oeVar;
                }
                if (str8 == null) {
                    if (oeVar2 != null || (str = oeVar2.b) == null || StringsKt.isBlank(str)) {
                        str = null;
                    }
                    if (str == null) {
                        str8 = reVarB.c;
                    } else {
                        str8 = str;
                    }
                } else {
                    if (!StringsKt.isBlank(str8)) {
                        str8 = null;
                    }
                    if (str8 != null) {
                        if (oeVar2 != null) {
                            str = null;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str8 = reVarB.c;
                        } else {
                            str8 = str;
                        }
                    }
                }
                if (!StringsKt.isBlank(str8)) {
                    throw new IllegalStateException("字幕详情未返回下载地址");
                }
                if (oeVar2 != null) {
                    str2 = "filelist";
                } else {
                    str2 = "detail";
                }
                Log.d("AssrtSubtitleRepo", "字幕下载地址: id=" + str7 + ", url=" + str8 + ", source=" + str2);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                size = arrayList4.size();
                i2 = i;
                while (i2 < size) {
                    Object obj8 = arrayList4.get(i2);
                    i2++;
                    arrayList.add(((oe) obj8).a);
                }
                arrayList2 = new ArrayList();
                size2 = arrayList.size();
                i3 = i;
                while (i3 < size2) {
                    obj4 = arrayList.get(i3);
                    i3++;
                    if (!StringsKt.isBlank((String) obj4)) {
                        arrayList2.add(obj4);
                    }
                }
                ye yeVar4 = ye.a;
                if (str9 == null) {
                    if (oeVar != null) {
                        str3 = oeVar.a;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null && (str3 = (String) CollectionsKt.firstOrNull((List) arrayList2)) == null) {
                        str3 = "";
                    }
                } else {
                    str3 = str9;
                }
                String strL = ye.l(str3, qeVar.f);
                if (!arrayList2.isEmpty()) {
                    Log.d("AssrtSubtitleRepo", "字幕文件列表: id=" + str7 + ", files=" + CollectionsKt___CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, null, 63, null));
                }
                responseExecute = ExternalHttpClient.createDownloadClient$default(ExternalHttpClient.INSTANCE, ExternalHttpClient.RouteMode.FORCE_DIRECT, false, false, 6, null).newCall(new Request.Builder().url(str8).header(HttpRequestHeader.UserAgent, RetrofitClient.buildUserAgent$default(RetrofitClient.INSTANCE, null, 1, null)).build()).execute();
                try {
                    if (!responseExecute.getIsSuccessful()) {
                        throw new IllegalStateException("下载字幕失败：HTTP " + responseExecute.code());
                    }
                    responseBodyBody = responseExecute.body();
                    if (responseBodyBody != null || (bArrBytes = responseBodyBody.bytes()) == null) {
                        throw new IllegalStateException("下载字幕失败：响应为空");
                    }
                    CloseableKt.closeFinally(responseExecute, null);
                    File file2 = new File(context.getCacheDir(), "online_subtitles");
                    file2.mkdirs();
                    String str10 = qeVar.c;
                    if (StringsKt.isBlank(str10)) {
                        str10 = str6;
                    }
                    if (StringsKt.isBlank(str10)) {
                        str10 = "assrt_" + str7;
                    }
                    String strTake = StringsKt.take(new Regex("[^A-Za-z0-9._-]").replace(str10, "_"), 50);
                    if (StringsKt.isBlank(strTake)) {
                        strTake = "subtitle";
                    }
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = str8.toLowerCase(locale);
                    lowerCase.getClass();
                    if (StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) ".zip", false, 2, (Object) null) || Intrinsics.areEqual(strL, "zip") || (bArrBytes.length >= 4 && bArrBytes[i] == 80 && bArrBytes[1] == 75 && bArrBytes[2] == 3 && bArrBytes[3] == 4)) {
                        file = ye.a(bArrBytes, file2, strTake, str9);
                        if (file == null) {
                            throw new IllegalStateException("压缩包内未找到可用字幕文件");
                        }
                    } else {
                        if (ye.c(str8, strL, bArrBytes)) {
                            throw new IllegalStateException("下载到 RAR 压缩包，当前不支持解压 RAR，请换一个字幕源");
                        }
                        if (!ye.b.contains(strL)) {
                            strL = "srt";
                        }
                        file = new File(file2, "assrt_" + str7 + "_" + System.currentTimeMillis() + "." + strL);
                        FilesKt.writeBytes(file, bArrBytes);
                    }
                    String lowerCase2 = FilesKt.getExtension(file).toLowerCase(locale);
                    lowerCase2.getClass();
                    Log.d("AssrtSubtitleRepo", "字幕下载完成: id=" + str7 + ", path=" + file.getAbsolutePath() + ", ext=" + lowerCase2 + ", size=" + file.length() + "B");
                    switch (lowerCase2.hashCode()) {
                        case 96897:
                            str4 = !lowerCase2.equals("ass") ? "SRT" : "ASS";
                            break;
                        case 114177:
                            if (lowerCase2.equals("ssa")) {
                                str4 = "SSA";
                            }
                            break;
                        case 114240:
                            if (lowerCase2.equals("sub")) {
                                str4 = "SUB";
                            }
                            break;
                        case 117110:
                            if (lowerCase2.equals("vtt")) {
                                str4 = "VTT";
                            }
                            break;
                        default:
                            break;
                    }
                    String absolutePath = file.getAbsolutePath();
                    absolutePath.getClass();
                    objM8825constructorimpl = Result.m8825constructorimpl(new pe(qeVar.a, "ASSRT · " + str6 + " (" + str4 + ")", absolutePath, ye.e(lowerCase2), lowerCase2, ye.d(qeVar.d)));
                    return Result.m8824boximpl(objM8825constructorimpl);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(responseExecute, th);
                        throw th2;
                    }
                }
            }
            int size7 = arrayList4.size();
            int i8 = 0;
            do {
                if (i8 >= size7) {
                    obj6 = null;
                    break;
                }
                obj6 = arrayList4.get(i8);
                i8++;
            } while (!Intrinsics.areEqual(((oe) obj6).b, str8));
            oeVar = (oe) obj6;
            i = 0;
            if (oeVar == null) {
                size3 = arrayList4.size();
                i4 = i;
                while (true) {
                    if (i4 < size3) {
                        obj5 = null;
                        break;
                    }
                    obj5 = arrayList4.get(i4);
                    i4++;
                    oeVar3 = (oe) obj5;
                    ye yeVar5 = ye.a;
                    if (!ye.m(oeVar3.b)) {
                    }
                }
                oeVar2 = (oe) obj5;
            } else {
                oeVar2 = oeVar;
            }
            if (str8 == null) {
                if (oeVar2 != null) {
                    str = null;
                } else {
                    str = null;
                }
                if (str == null) {
                    str8 = reVarB.c;
                } else {
                    str8 = str;
                }
            } else {
                if (!StringsKt.isBlank(str8)) {
                    str8 = null;
                }
                if (str8 != null) {
                    if (oeVar2 != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str8 = reVarB.c;
                    } else {
                        str8 = str;
                    }
                }
            }
            if (!StringsKt.isBlank(str8)) {
                throw new IllegalStateException("字幕详情未返回下载地址");
            }
            if (oeVar2 != null) {
                str2 = "filelist";
            } else {
                str2 = "detail";
            }
            Log.d("AssrtSubtitleRepo", "字幕下载地址: id=" + str7 + ", url=" + str8 + ", source=" + str2);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
            size = arrayList4.size();
            i2 = i;
            while (i2 < size) {
                Object obj9 = arrayList4.get(i2);
                i2++;
                arrayList.add(((oe) obj9).a);
            }
            arrayList2 = new ArrayList();
            size2 = arrayList.size();
            i3 = i;
            while (i3 < size2) {
                obj4 = arrayList.get(i3);
                i3++;
                if (!StringsKt.isBlank((String) obj4)) {
                    arrayList2.add(obj4);
                }
            }
            ye yeVar6 = ye.a;
            if (str9 == null) {
                if (oeVar != null) {
                    str3 = oeVar.a;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "";
                }
            } else {
                str3 = str9;
            }
            String strL2 = ye.l(str3, qeVar.f);
            if (!arrayList2.isEmpty()) {
                Log.d("AssrtSubtitleRepo", "字幕文件列表: id=" + str7 + ", files=" + CollectionsKt___CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, null, 63, null));
            }
            responseExecute = ExternalHttpClient.createDownloadClient$default(ExternalHttpClient.INSTANCE, ExternalHttpClient.RouteMode.FORCE_DIRECT, false, false, 6, null).newCall(new Request.Builder().url(str8).header(HttpRequestHeader.UserAgent, RetrofitClient.buildUserAgent$default(RetrofitClient.INSTANCE, null, 1, null)).build()).execute();
            if (!responseExecute.getIsSuccessful()) {
                responseBodyBody = responseExecute.body();
                if (responseBodyBody != null) {
                }
                throw new IllegalStateException("下载字幕失败：响应为空");
            }
            throw new IllegalStateException("下载字幕失败：HTTP " + responseExecute.code());
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th3));
        }
    }
}
