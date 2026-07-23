package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ra2 extends SuspendLambda implements Function2 {
    public Object a;
    public o92 b;
    public int c;
    public final /* synthetic */ xa2 d;
    public final /* synthetic */ MediaItem e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ MediaItem h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra2(xa2 xa2Var, MediaItem mediaItem, boolean z, MediaItem mediaItem2, Continuation continuation) {
        super(2, continuation);
        this.d = xa2Var;
        this.e = mediaItem;
        this.g = z;
        this.h = mediaItem2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ra2(this.d, this.e, this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ra2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e8 A[Catch: Exception -> 0x002e, CancellationException -> 0x0247, TryCatch #2 {CancellationException -> 0x0247, Exception -> 0x002e, blocks: (B:9:0x0026, B:72:0x0189, B:73:0x018b, B:75:0x0191, B:77:0x0199, B:79:0x01a0, B:86:0x01c3, B:88:0x01fa, B:87:0x01cf, B:16:0x003d, B:68:0x0165, B:19:0x004b, B:47:0x00e2, B:49:0x00e8, B:51:0x00ee, B:52:0x00f6, B:54:0x0103, B:57:0x010e, B:59:0x0116, B:65:0x0144, B:69:0x0168, B:20:0x0058, B:26:0x006b, B:28:0x006f, B:30:0x008e, B:33:0x009c, B:35:0x00a2, B:40:0x00b6, B:43:0x00cf, B:36:0x00a8, B:38:0x00b0, B:23:0x0061), top: B:95:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee A[Catch: Exception -> 0x002e, CancellationException -> 0x0247, TryCatch #2 {CancellationException -> 0x0247, Exception -> 0x002e, blocks: (B:9:0x0026, B:72:0x0189, B:73:0x018b, B:75:0x0191, B:77:0x0199, B:79:0x01a0, B:86:0x01c3, B:88:0x01fa, B:87:0x01cf, B:16:0x003d, B:68:0x0165, B:19:0x004b, B:47:0x00e2, B:49:0x00e8, B:51:0x00ee, B:52:0x00f6, B:54:0x0103, B:57:0x010e, B:59:0x0116, B:65:0x0144, B:69:0x0168, B:20:0x0058, B:26:0x006b, B:28:0x006f, B:30:0x008e, B:33:0x009c, B:35:0x00a2, B:40:0x00b6, B:43:0x00cf, B:36:0x00a8, B:38:0x00b0, B:23:0x0061), top: B:95:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0103 A[Catch: Exception -> 0x002e, CancellationException -> 0x0247, TryCatch #2 {CancellationException -> 0x0247, Exception -> 0x002e, blocks: (B:9:0x0026, B:72:0x0189, B:73:0x018b, B:75:0x0191, B:77:0x0199, B:79:0x01a0, B:86:0x01c3, B:88:0x01fa, B:87:0x01cf, B:16:0x003d, B:68:0x0165, B:19:0x004b, B:47:0x00e2, B:49:0x00e8, B:51:0x00ee, B:52:0x00f6, B:54:0x0103, B:57:0x010e, B:59:0x0116, B:65:0x0144, B:69:0x0168, B:20:0x0058, B:26:0x006b, B:28:0x006f, B:30:0x008e, B:33:0x009c, B:35:0x00a2, B:40:0x00b6, B:43:0x00cf, B:36:0x00a8, B:38:0x00b0, B:23:0x0061), top: B:95:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x010d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116 A[Catch: Exception -> 0x002e, CancellationException -> 0x0247, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0247, Exception -> 0x002e, blocks: (B:9:0x0026, B:72:0x0189, B:73:0x018b, B:75:0x0191, B:77:0x0199, B:79:0x01a0, B:86:0x01c3, B:88:0x01fa, B:87:0x01cf, B:16:0x003d, B:68:0x0165, B:19:0x004b, B:47:0x00e2, B:49:0x00e8, B:51:0x00ee, B:52:0x00f6, B:54:0x0103, B:57:0x010e, B:59:0x0116, B:65:0x0144, B:69:0x0168, B:20:0x0058, B:26:0x006b, B:28:0x006f, B:30:0x008e, B:33:0x009c, B:35:0x00a2, B:40:0x00b6, B:43:0x00cf, B:36:0x00a8, B:38:0x00b0, B:23:0x0061), top: B:95:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0144 A[Catch: Exception -> 0x002e, CancellationException -> 0x0247, TRY_ENTER, TryCatch #2 {CancellationException -> 0x0247, Exception -> 0x002e, blocks: (B:9:0x0026, B:72:0x0189, B:73:0x018b, B:75:0x0191, B:77:0x0199, B:79:0x01a0, B:86:0x01c3, B:88:0x01fa, B:87:0x01cf, B:16:0x003d, B:68:0x0165, B:19:0x004b, B:47:0x00e2, B:49:0x00e8, B:51:0x00ee, B:52:0x00f6, B:54:0x0103, B:57:0x010e, B:59:0x0116, B:65:0x0144, B:69:0x0168, B:20:0x0058, B:26:0x006b, B:28:0x006f, B:30:0x008e, B:33:0x009c, B:35:0x00a2, B:40:0x00b6, B:43:0x00cf, B:36:0x00a8, B:38:0x00b0, B:23:0x0061), top: B:95:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0168 A[Catch: Exception -> 0x002e, CancellationException -> 0x0247, TryCatch #2 {CancellationException -> 0x0247, Exception -> 0x002e, blocks: (B:9:0x0026, B:72:0x0189, B:73:0x018b, B:75:0x0191, B:77:0x0199, B:79:0x01a0, B:86:0x01c3, B:88:0x01fa, B:87:0x01cf, B:16:0x003d, B:68:0x0165, B:19:0x004b, B:47:0x00e2, B:49:0x00e8, B:51:0x00ee, B:52:0x00f6, B:54:0x0103, B:57:0x010e, B:59:0x0116, B:65:0x0144, B:69:0x0168, B:20:0x0058, B:26:0x006b, B:28:0x006f, B:30:0x008e, B:33:0x009c, B:35:0x00a2, B:40:0x00b6, B:43:0x00cf, B:36:0x00a8, B:38:0x00b0, B:23:0x0061), top: B:95:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0191 A[Catch: Exception -> 0x002e, CancellationException -> 0x0247, TryCatch #2 {CancellationException -> 0x0247, Exception -> 0x002e, blocks: (B:9:0x0026, B:72:0x0189, B:73:0x018b, B:75:0x0191, B:77:0x0199, B:79:0x01a0, B:86:0x01c3, B:88:0x01fa, B:87:0x01cf, B:16:0x003d, B:68:0x0165, B:19:0x004b, B:47:0x00e2, B:49:0x00e8, B:51:0x00ee, B:52:0x00f6, B:54:0x0103, B:57:0x010e, B:59:0x0116, B:65:0x0144, B:69:0x0168, B:20:0x0058, B:26:0x006b, B:28:0x006f, B:30:0x008e, B:33:0x009c, B:35:0x00a2, B:40:0x00b6, B:43:0x00cf, B:36:0x00a8, B:38:0x00b0, B:23:0x0061), top: B:95:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0199 A[Catch: Exception -> 0x002e, CancellationException -> 0x0247, TryCatch #2 {CancellationException -> 0x0247, Exception -> 0x002e, blocks: (B:9:0x0026, B:72:0x0189, B:73:0x018b, B:75:0x0191, B:77:0x0199, B:79:0x01a0, B:86:0x01c3, B:88:0x01fa, B:87:0x01cf, B:16:0x003d, B:68:0x0165, B:19:0x004b, B:47:0x00e2, B:49:0x00e8, B:51:0x00ee, B:52:0x00f6, B:54:0x0103, B:57:0x010e, B:59:0x0116, B:65:0x0144, B:69:0x0168, B:20:0x0058, B:26:0x006b, B:28:0x006f, B:30:0x008e, B:33:0x009c, B:35:0x00a2, B:40:0x00b6, B:43:0x00cf, B:36:0x00a8, B:38:0x00b0, B:23:0x0061), top: B:95:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x019f  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cf A[Catch: Exception -> 0x002e, CancellationException -> 0x0247, TryCatch #2 {CancellationException -> 0x0247, Exception -> 0x002e, blocks: (B:9:0x0026, B:72:0x0189, B:73:0x018b, B:75:0x0191, B:77:0x0199, B:79:0x01a0, B:86:0x01c3, B:88:0x01fa, B:87:0x01cf, B:16:0x003d, B:68:0x0165, B:19:0x004b, B:47:0x00e2, B:49:0x00e8, B:51:0x00ee, B:52:0x00f6, B:54:0x0103, B:57:0x010e, B:59:0x0116, B:65:0x0144, B:69:0x0168, B:20:0x0058, B:26:0x006b, B:28:0x006f, B:30:0x008e, B:33:0x009c, B:35:0x00a2, B:40:0x00b6, B:43:0x00cf, B:36:0x00a8, B:38:0x00b0, B:23:0x0061), top: B:95:0x0016 }] */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0186, code lost:
    
        if (r0 == r9) goto L71;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x01cf, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
