package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class rf0 extends SuspendLambda implements Function2 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ List o;
    public final /* synthetic */ uf0 p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(uf0 uf0Var, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.o = list;
        this.p = uf0Var;
        this.q = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        rf0 rf0Var = new rf0(this.p, this.q, this.o, continuation);
        rf0Var.n = obj;
        return rf0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rf0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01d4 A[Catch: Exception -> 0x0052, CancellationException -> 0x040f, TryCatch #2 {CancellationException -> 0x040f, Exception -> 0x0052, blocks: (B:7:0x004b, B:134:0x0312, B:136:0x031a, B:137:0x0324, B:14:0x005f, B:30:0x00c5, B:34:0x00d9, B:36:0x00e1, B:41:0x00eb, B:43:0x00f1, B:45:0x00f7, B:50:0x0101, B:53:0x0109, B:54:0x0112, B:56:0x0118, B:61:0x0129, B:63:0x012f, B:65:0x0137, B:69:0x013f, B:70:0x0143, B:71:0x014c, B:73:0x0152, B:75:0x0162, B:77:0x0167, B:80:0x0175, B:90:0x019c, B:101:0x01c1, B:102:0x01ce, B:104:0x01d4, B:106:0x01e4, B:109:0x01f0, B:112:0x0200, B:113:0x0206, B:115:0x021a, B:117:0x0256, B:118:0x026b, B:120:0x0271, B:123:0x0284, B:125:0x028a, B:127:0x0292, B:128:0x02a7, B:130:0x02ad, B:131:0x02b7, B:93:0x01a3, B:94:0x01a7, B:96:0x01ad, B:83:0x017e, B:84:0x0182, B:86:0x0188, B:138:0x0377, B:140:0x0394, B:17:0x0069, B:18:0x0079, B:20:0x007f, B:22:0x0090, B:23:0x0094, B:25:0x009a, B:27:0x00b1), top: B:147:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01e4 A[Catch: Exception -> 0x0052, CancellationException -> 0x040f, TryCatch #2 {CancellationException -> 0x040f, Exception -> 0x0052, blocks: (B:7:0x004b, B:134:0x0312, B:136:0x031a, B:137:0x0324, B:14:0x005f, B:30:0x00c5, B:34:0x00d9, B:36:0x00e1, B:41:0x00eb, B:43:0x00f1, B:45:0x00f7, B:50:0x0101, B:53:0x0109, B:54:0x0112, B:56:0x0118, B:61:0x0129, B:63:0x012f, B:65:0x0137, B:69:0x013f, B:70:0x0143, B:71:0x014c, B:73:0x0152, B:75:0x0162, B:77:0x0167, B:80:0x0175, B:90:0x019c, B:101:0x01c1, B:102:0x01ce, B:104:0x01d4, B:106:0x01e4, B:109:0x01f0, B:112:0x0200, B:113:0x0206, B:115:0x021a, B:117:0x0256, B:118:0x026b, B:120:0x0271, B:123:0x0284, B:125:0x028a, B:127:0x0292, B:128:0x02a7, B:130:0x02ad, B:131:0x02b7, B:93:0x01a3, B:94:0x01a7, B:96:0x01ad, B:83:0x017e, B:84:0x0182, B:86:0x0188, B:138:0x0377, B:140:0x0394, B:17:0x0069, B:18:0x0079, B:20:0x007f, B:22:0x0090, B:23:0x0094, B:25:0x009a, B:27:0x00b1), top: B:147:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01f0 A[Catch: Exception -> 0x0052, CancellationException -> 0x040f, TryCatch #2 {CancellationException -> 0x040f, Exception -> 0x0052, blocks: (B:7:0x004b, B:134:0x0312, B:136:0x031a, B:137:0x0324, B:14:0x005f, B:30:0x00c5, B:34:0x00d9, B:36:0x00e1, B:41:0x00eb, B:43:0x00f1, B:45:0x00f7, B:50:0x0101, B:53:0x0109, B:54:0x0112, B:56:0x0118, B:61:0x0129, B:63:0x012f, B:65:0x0137, B:69:0x013f, B:70:0x0143, B:71:0x014c, B:73:0x0152, B:75:0x0162, B:77:0x0167, B:80:0x0175, B:90:0x019c, B:101:0x01c1, B:102:0x01ce, B:104:0x01d4, B:106:0x01e4, B:109:0x01f0, B:112:0x0200, B:113:0x0206, B:115:0x021a, B:117:0x0256, B:118:0x026b, B:120:0x0271, B:123:0x0284, B:125:0x028a, B:127:0x0292, B:128:0x02a7, B:130:0x02ad, B:131:0x02b7, B:93:0x01a3, B:94:0x01a7, B:96:0x01ad, B:83:0x017e, B:84:0x0182, B:86:0x0188, B:138:0x0377, B:140:0x0394, B:17:0x0069, B:18:0x0079, B:20:0x007f, B:22:0x0090, B:23:0x0094, B:25:0x009a, B:27:0x00b1), top: B:147:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01f8 A[PHI: r20
      0x01f8: PHI (r20v6 java.lang.String) = (r20v5 java.lang.String), (r20v7 java.lang.String) binds: [B:107:0x01ec, B:109:0x01f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:115:0x021a A[Catch: Exception -> 0x0052, CancellationException -> 0x040f, TryCatch #2 {CancellationException -> 0x040f, Exception -> 0x0052, blocks: (B:7:0x004b, B:134:0x0312, B:136:0x031a, B:137:0x0324, B:14:0x005f, B:30:0x00c5, B:34:0x00d9, B:36:0x00e1, B:41:0x00eb, B:43:0x00f1, B:45:0x00f7, B:50:0x0101, B:53:0x0109, B:54:0x0112, B:56:0x0118, B:61:0x0129, B:63:0x012f, B:65:0x0137, B:69:0x013f, B:70:0x0143, B:71:0x014c, B:73:0x0152, B:75:0x0162, B:77:0x0167, B:80:0x0175, B:90:0x019c, B:101:0x01c1, B:102:0x01ce, B:104:0x01d4, B:106:0x01e4, B:109:0x01f0, B:112:0x0200, B:113:0x0206, B:115:0x021a, B:117:0x0256, B:118:0x026b, B:120:0x0271, B:123:0x0284, B:125:0x028a, B:127:0x0292, B:128:0x02a7, B:130:0x02ad, B:131:0x02b7, B:93:0x01a3, B:94:0x01a7, B:96:0x01ad, B:83:0x017e, B:84:0x0182, B:86:0x0188, B:138:0x0377, B:140:0x0394, B:17:0x0069, B:18:0x0079, B:20:0x007f, B:22:0x0090, B:23:0x0094, B:25:0x009a, B:27:0x00b1), top: B:147:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0256 A[Catch: Exception -> 0x0052, CancellationException -> 0x040f, TryCatch #2 {CancellationException -> 0x040f, Exception -> 0x0052, blocks: (B:7:0x004b, B:134:0x0312, B:136:0x031a, B:137:0x0324, B:14:0x005f, B:30:0x00c5, B:34:0x00d9, B:36:0x00e1, B:41:0x00eb, B:43:0x00f1, B:45:0x00f7, B:50:0x0101, B:53:0x0109, B:54:0x0112, B:56:0x0118, B:61:0x0129, B:63:0x012f, B:65:0x0137, B:69:0x013f, B:70:0x0143, B:71:0x014c, B:73:0x0152, B:75:0x0162, B:77:0x0167, B:80:0x0175, B:90:0x019c, B:101:0x01c1, B:102:0x01ce, B:104:0x01d4, B:106:0x01e4, B:109:0x01f0, B:112:0x0200, B:113:0x0206, B:115:0x021a, B:117:0x0256, B:118:0x026b, B:120:0x0271, B:123:0x0284, B:125:0x028a, B:127:0x0292, B:128:0x02a7, B:130:0x02ad, B:131:0x02b7, B:93:0x01a3, B:94:0x01a7, B:96:0x01ad, B:83:0x017e, B:84:0x0182, B:86:0x0188, B:138:0x0377, B:140:0x0394, B:17:0x0069, B:18:0x0079, B:20:0x007f, B:22:0x0090, B:23:0x0094, B:25:0x009a, B:27:0x00b1), top: B:147:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0271 A[Catch: Exception -> 0x0052, CancellationException -> 0x040f, TryCatch #2 {CancellationException -> 0x040f, Exception -> 0x0052, blocks: (B:7:0x004b, B:134:0x0312, B:136:0x031a, B:137:0x0324, B:14:0x005f, B:30:0x00c5, B:34:0x00d9, B:36:0x00e1, B:41:0x00eb, B:43:0x00f1, B:45:0x00f7, B:50:0x0101, B:53:0x0109, B:54:0x0112, B:56:0x0118, B:61:0x0129, B:63:0x012f, B:65:0x0137, B:69:0x013f, B:70:0x0143, B:71:0x014c, B:73:0x0152, B:75:0x0162, B:77:0x0167, B:80:0x0175, B:90:0x019c, B:101:0x01c1, B:102:0x01ce, B:104:0x01d4, B:106:0x01e4, B:109:0x01f0, B:112:0x0200, B:113:0x0206, B:115:0x021a, B:117:0x0256, B:118:0x026b, B:120:0x0271, B:123:0x0284, B:125:0x028a, B:127:0x0292, B:128:0x02a7, B:130:0x02ad, B:131:0x02b7, B:93:0x01a3, B:94:0x01a7, B:96:0x01ad, B:83:0x017e, B:84:0x0182, B:86:0x0188, B:138:0x0377, B:140:0x0394, B:17:0x0069, B:18:0x0079, B:20:0x007f, B:22:0x0090, B:23:0x0094, B:25:0x009a, B:27:0x00b1), top: B:147:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x02ad A[Catch: Exception -> 0x0052, CancellationException -> 0x040f, LOOP:4: B:128:0x02a7->B:130:0x02ad, LOOP_END, TryCatch #2 {CancellationException -> 0x040f, Exception -> 0x0052, blocks: (B:7:0x004b, B:134:0x0312, B:136:0x031a, B:137:0x0324, B:14:0x005f, B:30:0x00c5, B:34:0x00d9, B:36:0x00e1, B:41:0x00eb, B:43:0x00f1, B:45:0x00f7, B:50:0x0101, B:53:0x0109, B:54:0x0112, B:56:0x0118, B:61:0x0129, B:63:0x012f, B:65:0x0137, B:69:0x013f, B:70:0x0143, B:71:0x014c, B:73:0x0152, B:75:0x0162, B:77:0x0167, B:80:0x0175, B:90:0x019c, B:101:0x01c1, B:102:0x01ce, B:104:0x01d4, B:106:0x01e4, B:109:0x01f0, B:112:0x0200, B:113:0x0206, B:115:0x021a, B:117:0x0256, B:118:0x026b, B:120:0x0271, B:123:0x0284, B:125:0x028a, B:127:0x0292, B:128:0x02a7, B:130:0x02ad, B:131:0x02b7, B:93:0x01a3, B:94:0x01a7, B:96:0x01ad, B:83:0x017e, B:84:0x0182, B:86:0x0188, B:138:0x0377, B:140:0x0394, B:17:0x0069, B:18:0x0079, B:20:0x007f, B:22:0x0090, B:23:0x0094, B:25:0x009a, B:27:0x00b1), top: B:147:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:? A[LOOP:5: B:94:0x01a7->B:164:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a3 A[Catch: Exception -> 0x0052, CancellationException -> 0x040f, TryCatch #2 {CancellationException -> 0x040f, Exception -> 0x0052, blocks: (B:7:0x004b, B:134:0x0312, B:136:0x031a, B:137:0x0324, B:14:0x005f, B:30:0x00c5, B:34:0x00d9, B:36:0x00e1, B:41:0x00eb, B:43:0x00f1, B:45:0x00f7, B:50:0x0101, B:53:0x0109, B:54:0x0112, B:56:0x0118, B:61:0x0129, B:63:0x012f, B:65:0x0137, B:69:0x013f, B:70:0x0143, B:71:0x014c, B:73:0x0152, B:75:0x0162, B:77:0x0167, B:80:0x0175, B:90:0x019c, B:101:0x01c1, B:102:0x01ce, B:104:0x01d4, B:106:0x01e4, B:109:0x01f0, B:112:0x0200, B:113:0x0206, B:115:0x021a, B:117:0x0256, B:118:0x026b, B:120:0x0271, B:123:0x0284, B:125:0x028a, B:127:0x0292, B:128:0x02a7, B:130:0x02ad, B:131:0x02b7, B:93:0x01a3, B:94:0x01a7, B:96:0x01ad, B:83:0x017e, B:84:0x0182, B:86:0x0188, B:138:0x0377, B:140:0x0394, B:17:0x0069, B:18:0x0079, B:20:0x007f, B:22:0x0090, B:23:0x0094, B:25:0x009a, B:27:0x00b1), top: B:147:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01ad A[Catch: Exception -> 0x0052, CancellationException -> 0x040f, TryCatch #2 {CancellationException -> 0x040f, Exception -> 0x0052, blocks: (B:7:0x004b, B:134:0x0312, B:136:0x031a, B:137:0x0324, B:14:0x005f, B:30:0x00c5, B:34:0x00d9, B:36:0x00e1, B:41:0x00eb, B:43:0x00f1, B:45:0x00f7, B:50:0x0101, B:53:0x0109, B:54:0x0112, B:56:0x0118, B:61:0x0129, B:63:0x012f, B:65:0x0137, B:69:0x013f, B:70:0x0143, B:71:0x014c, B:73:0x0152, B:75:0x0162, B:77:0x0167, B:80:0x0175, B:90:0x019c, B:101:0x01c1, B:102:0x01ce, B:104:0x01d4, B:106:0x01e4, B:109:0x01f0, B:112:0x0200, B:113:0x0206, B:115:0x021a, B:117:0x0256, B:118:0x026b, B:120:0x0271, B:123:0x0284, B:125:0x028a, B:127:0x0292, B:128:0x02a7, B:130:0x02ad, B:131:0x02b7, B:93:0x01a3, B:94:0x01a7, B:96:0x01ad, B:83:0x017e, B:84:0x0182, B:86:0x0188, B:138:0x0377, B:140:0x0394, B:17:0x0069, B:18:0x0079, B:20:0x007f, B:22:0x0090, B:23:0x0094, B:25:0x009a, B:27:0x00b1), top: B:147:0x0019 }] */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x030f, code lost:
    
        if (r0 == r3) goto L133;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:115:0x021a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5, types: [com.google.gson.JsonElement] */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 1041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rf0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
