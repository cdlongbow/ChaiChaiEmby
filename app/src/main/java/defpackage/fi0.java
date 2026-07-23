package defpackage;

import android.content.Context;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class fi0 extends SuspendLambda implements Function2 {
    public Object a;
    public Object b;
    public MediaItem c;
    public Object d;
    public Object e;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public int k;
    public final /* synthetic */ String l;
    public final /* synthetic */ Context m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi0(String str, Context context, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.l = str;
        this.m = context;
        this.n = str2;
        this.o = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new fi0(this.l, this.m, this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fi0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ce A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:8:0x003f, B:58:0x0174, B:15:0x005a, B:30:0x00c8, B:32:0x00ce, B:33:0x00e1, B:36:0x00e8, B:38:0x00f5, B:40:0x00fb, B:41:0x00ff, B:43:0x0105, B:44:0x0109, B:46:0x0111, B:51:0x011c, B:53:0x012c, B:55:0x0133, B:18:0x0070, B:25:0x009e, B:27:0x00a4, B:59:0x018a, B:21:0x007f), top: B:64:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f5 A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:8:0x003f, B:58:0x0174, B:15:0x005a, B:30:0x00c8, B:32:0x00ce, B:33:0x00e1, B:36:0x00e8, B:38:0x00f5, B:40:0x00fb, B:41:0x00ff, B:43:0x0105, B:44:0x0109, B:46:0x0111, B:51:0x011c, B:53:0x012c, B:55:0x0133, B:18:0x0070, B:25:0x009e, B:27:0x00a4, B:59:0x018a, B:21:0x007f), top: B:64:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:8:0x003f, B:58:0x0174, B:15:0x005a, B:30:0x00c8, B:32:0x00ce, B:33:0x00e1, B:36:0x00e8, B:38:0x00f5, B:40:0x00fb, B:41:0x00ff, B:43:0x0105, B:44:0x0109, B:46:0x0111, B:51:0x011c, B:53:0x012c, B:55:0x0133, B:18:0x0070, B:25:0x009e, B:27:0x00a4, B:59:0x018a, B:21:0x007f), top: B:64:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0105 A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:8:0x003f, B:58:0x0174, B:15:0x005a, B:30:0x00c8, B:32:0x00ce, B:33:0x00e1, B:36:0x00e8, B:38:0x00f5, B:40:0x00fb, B:41:0x00ff, B:43:0x0105, B:44:0x0109, B:46:0x0111, B:51:0x011c, B:53:0x012c, B:55:0x0133, B:18:0x0070, B:25:0x009e, B:27:0x00a4, B:59:0x018a, B:21:0x007f), top: B:64:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x011a  */
    /* JADX WARN: Code duplicated, block: B:53:0x012c A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:8:0x003f, B:58:0x0174, B:15:0x005a, B:30:0x00c8, B:32:0x00ce, B:33:0x00e1, B:36:0x00e8, B:38:0x00f5, B:40:0x00fb, B:41:0x00ff, B:43:0x0105, B:44:0x0109, B:46:0x0111, B:51:0x011c, B:53:0x012c, B:55:0x0133, B:18:0x0070, B:25:0x009e, B:27:0x00a4, B:59:0x018a, B:21:0x007f), top: B:64:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0131  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0171, code lost:
    
        if (r0 == r9) goto L57;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00ce, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
