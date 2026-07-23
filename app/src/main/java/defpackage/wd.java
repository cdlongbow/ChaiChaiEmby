package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class wd extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ String c;
    public Object d;
    public Object e;
    public Object g;
    public Object h;
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(vb1 vb1Var, vh1 vh1Var, Throwable th, String str, vh1 vh1Var2, vh1 vh1Var3, UserPreferences userPreferences, vj1 vj1Var, vh1 vh1Var4, String str2, Continuation continuation) {
        super(2, continuation);
        this.d = vb1Var;
        this.e = vh1Var;
        this.g = th;
        this.c = str;
        this.i = vh1Var2;
        this.j = vh1Var3;
        this.k = userPreferences;
        this.l = vj1Var;
        this.m = vh1Var4;
        this.h = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        switch (i) {
            case 0:
                String str = (String) this.h;
                return new wd((vb1) this.d, (vh1) this.e, (Throwable) this.g, this.c, (vh1) this.i, (vh1) this.j, (UserPreferences) obj4, (vj1) obj3, (vh1) obj2, str, continuation);
            case 1:
                wd wdVar = new wd(this.c, (MutableState) this.j, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, continuation);
                wdVar.i = obj;
                return wdVar;
            case 2:
                return new wd((qe) this.d, (se) this.e, (Context) this.g, this.c, (ne) this.h, (MutableState) this.i, (MutableState) this.j, (MutableState) obj4, (jj1) obj3, (MutableState) obj2, continuation);
            default:
                wd wdVar2 = new wd((to1) obj4, this.c, (vb1) obj3, (vb1) obj2, continuation);
                wdVar2.j = obj;
                return wdVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((wd) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:87|(1:89)(1:90)|91|92|260|93|94|246|95|96|230|97|98|236|99|100|252|101|102|238|103|104|244|105|106|224|107|108|232|109|110|216|111|112) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:248|79|(34:87|(1:89)(1:90)|91|92|260|93|94|246|95|96|230|97|98|236|99|100|252|101|102|238|103|104|244|105|106|224|107|108|232|109|110|216|111|112)(2:81|264)) */
    /* JADX WARN: Code duplicated, block: B:142:0x0393  */
    /* JADX WARN: Code duplicated, block: B:248:0x0260 A[EXC_TOP_SPLITTER, PHI: r1 r2 r10 r11 r12 r13 r14 r15 r18 r23 r26 r29 r30
      0x0260: PHI (r1v44 kotlinx.coroutines.CoroutineScope) = (r1v57 kotlinx.coroutines.CoroutineScope), (r1v62 kotlinx.coroutines.CoroutineScope) binds: [B:77:0x025c, B:18:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r2v19 java.lang.String) = (r2v20 java.lang.String), (r2v41 java.lang.String) binds: [B:77:0x025c, B:18:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r10v4 wd) = (r10v5 wd), (r10v0 wd) binds: [B:77:0x025c, B:18:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r11v6 java.lang.String) = (r11v9 java.lang.String), (r11v4 java.lang.String) binds: [B:77:0x025c, B:18:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r12v9 java.lang.String) = (r12v10 java.lang.String), (r12v19 java.lang.String) binds: [B:77:0x025c, B:18:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r13v19 java.lang.Object) = (r13v32 java.lang.Object), (r13v49 java.lang.Object) binds: [B:77:0x025c, B:18:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r14v14 to1) = (r14v15 to1), (r14v35 to1) binds: [B:77:0x025c, B:18:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r15v6 java.lang.String) = (r15v7 java.lang.String), (r15v16 java.lang.String) binds: [B:77:0x025c, B:18:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r18v5 java.lang.String) = (r18v10 java.lang.String), (r18v25 java.lang.String) binds: [B:77:0x025c, B:18:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r23v6 java.lang.String) = (r23v8 java.lang.String), (r23v17 java.lang.String) binds: [B:77:0x025c, B:18:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r26v8 vb1) = (r26v9 vb1), (r26v16 vb1) binds: [B:77:0x025c, B:18:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r29v3 java.lang.String) = (r29v4 java.lang.String), (r29v19 java.lang.String) binds: [B:77:0x025c, B:18:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r30v4 java.lang.String) = (r30v11 java.lang.String), (r30v25 java.lang.String) binds: [B:77:0x025c, B:18:0x009a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x01c6 A[PHI: r13
      0x01c6: PHI (r13v31 java.lang.Object) = (r13v32 java.lang.Object), (r13v44 java.lang.Object) binds: [B:77:0x025c, B:49:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0244  */
    /* JADX WARN: Code duplicated, block: B:81:0x0264 A[Catch: Exception -> 0x027c, TryCatch #16 {Exception -> 0x027c, blocks: (B:79:0x0260, B:81:0x0264, B:87:0x028a, B:91:0x0291), top: B:248:0x0260 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x028a A[Catch: Exception -> 0x027c, TryCatch #16 {Exception -> 0x027c, blocks: (B:79:0x0260, B:81:0x0264, B:87:0x028a, B:91:0x0291), top: B:248:0x0260 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x028e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0290  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x033b, code lost:
    
        if (r0 == r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0350, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0351, code lost:
    
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0354, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0355, code lost:
    
        r28 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0358, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0359, code lost:
    
        r25 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x035c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x035d, code lost:
    
        r25 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0360, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0361, code lost:
    
        r25 = r3;
        r30 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0366, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0367, code lost:
    
        r30 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x036b, code lost:
    
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0371, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0375, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0378, code lost:
    
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x037c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x037d, code lost:
    
        r13 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0382, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x027c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x027d, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x027f, code lost:
    
        r1 = r13;
        r25 = r18;
        r13 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0286, code lost:
    
        r11 = r29;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:81:0x0264, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x033b -> B:220:0x0340). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x0385 -> B:116:0x0343). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 1516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(qe qeVar, se seVar, Context context, String str, ne neVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, jj1 jj1Var, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.d = qeVar;
        this.e = seVar;
        this.g = context;
        this.c = str;
        this.h = neVar;
        this.i = mutableState;
        this.j = mutableState2;
        this.k = mutableState3;
        this.l = jj1Var;
        this.m = mutableState4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(to1 to1Var, String str, vb1 vb1Var, vb1 vb1Var2, Continuation continuation) {
        super(2, continuation);
        this.k = to1Var;
        this.c = str;
        this.l = vb1Var;
        this.m = vb1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(String str, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.c = str;
        this.j = mutableState;
        this.k = mutableState2;
        this.l = mutableState3;
        this.m = mutableState4;
    }
}
