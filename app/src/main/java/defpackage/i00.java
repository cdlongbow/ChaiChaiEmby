package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.media3.common.Player;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerIconEntry;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class i00 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i00(Player player, int i, State state, State state2, MutableState mutableState, MutableIntState mutableIntState, DanmakuPlayer danmakuPlayer, State state3, State state4, State state5, Continuation continuation) {
        super(2, continuation);
        this.a = 0;
        this.c = player;
        this.b = i;
        this.d = state;
        this.e = state2;
        this.j = mutableState;
        this.k = mutableIntState;
        this.l = danmakuPlayer;
        this.g = state3;
        this.h = state4;
        this.i = state5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                return new i00((Player) this.c, this.b, (State) this.d, (State) this.e, (MutableState) obj4, (MutableIntState) obj3, (DanmakuPlayer) obj2, (State) this.g, (State) this.h, (State) this.i, continuation);
            case 1:
                return new i00((va0) obj4, (jb2) obj3, (Context) obj2, continuation);
            case 2:
                return new i00((to1) this.c, (String) this.d, (Context) this.e, (MutableState) obj4, (ln1) this.g, (MutableState) this.h, (ih1) this.i, (ih1) obj3, (MutableState) obj2, continuation, 2);
            case 3:
                return new i00((px1) this.c, (ServerConfig) this.d, (ServerIconEntry) this.e, (MutableState) obj4, (Function1) this.g, (Function1) this.h, (Function0) this.i, (MutableState) obj3, (MutableState) obj2, continuation, 3);
            default:
                return new i00((q72) this.c, (Function0) this.d, (MutableState) obj4, (MutableState) this.e, (MutableState) this.g, (MutableState) this.h, (MutableState) this.i, (MutableState) obj3, (MutableState) obj2, continuation);
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
            case 3:
                break;
        }
        return ((i00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0348  */
    /* JADX WARN: Code duplicated, block: B:102:0x034a A[PHI: r7
      0x034a: PHI (r7v7 java.lang.Object) = (r7v6 java.lang.Object), (r7v8 java.lang.Object) binds: [B:106:0x036f, B:100:0x0346] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x034e A[Catch: Exception -> 0x023d, TryCatch #0 {Exception -> 0x023d, blocks: (B:62:0x0238, B:68:0x0256, B:69:0x0259, B:73:0x0272, B:108:0x0373, B:110:0x037d, B:112:0x039a, B:114:0x03ad, B:117:0x03db, B:120:0x040a, B:123:0x0416, B:72:0x026e, B:76:0x0280, B:94:0x0309, B:96:0x0315, B:99:0x032b, B:103:0x034e, B:104:0x0353, B:105:0x0354, B:85:0x02ce, B:87:0x02d8, B:89:0x02ec, B:90:0x02f2, B:95:0x030c), top: B:141:0x0218 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0354 A[Catch: Exception -> 0x023d, TryCatch #0 {Exception -> 0x023d, blocks: (B:62:0x0238, B:68:0x0256, B:69:0x0259, B:73:0x0272, B:108:0x0373, B:110:0x037d, B:112:0x039a, B:114:0x03ad, B:117:0x03db, B:120:0x040a, B:123:0x0416, B:72:0x026e, B:76:0x0280, B:94:0x0309, B:96:0x0315, B:99:0x032b, B:103:0x034e, B:104:0x0353, B:105:0x0354, B:85:0x02ce, B:87:0x02d8, B:89:0x02ec, B:90:0x02f2, B:95:0x030c), top: B:141:0x0218 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0371  */
    /* JADX WARN: Code duplicated, block: B:110:0x037d A[Catch: Exception -> 0x023d, TryCatch #0 {Exception -> 0x023d, blocks: (B:62:0x0238, B:68:0x0256, B:69:0x0259, B:73:0x0272, B:108:0x0373, B:110:0x037d, B:112:0x039a, B:114:0x03ad, B:117:0x03db, B:120:0x040a, B:123:0x0416, B:72:0x026e, B:76:0x0280, B:94:0x0309, B:96:0x0315, B:99:0x032b, B:103:0x034e, B:104:0x0353, B:105:0x0354, B:85:0x02ce, B:87:0x02d8, B:89:0x02ec, B:90:0x02f2, B:95:0x030c), top: B:141:0x0218 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x039a A[Catch: Exception -> 0x023d, TryCatch #0 {Exception -> 0x023d, blocks: (B:62:0x0238, B:68:0x0256, B:69:0x0259, B:73:0x0272, B:108:0x0373, B:110:0x037d, B:112:0x039a, B:114:0x03ad, B:117:0x03db, B:120:0x040a, B:123:0x0416, B:72:0x026e, B:76:0x0280, B:94:0x0309, B:96:0x0315, B:99:0x032b, B:103:0x034e, B:104:0x0353, B:105:0x0354, B:85:0x02ce, B:87:0x02d8, B:89:0x02ec, B:90:0x02f2, B:95:0x030c), top: B:141:0x0218 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x03ad A[Catch: Exception -> 0x023d, TryCatch #0 {Exception -> 0x023d, blocks: (B:62:0x0238, B:68:0x0256, B:69:0x0259, B:73:0x0272, B:108:0x0373, B:110:0x037d, B:112:0x039a, B:114:0x03ad, B:117:0x03db, B:120:0x040a, B:123:0x0416, B:72:0x026e, B:76:0x0280, B:94:0x0309, B:96:0x0315, B:99:0x032b, B:103:0x034e, B:104:0x0353, B:105:0x0354, B:85:0x02ce, B:87:0x02d8, B:89:0x02ec, B:90:0x02f2, B:95:0x030c), top: B:141:0x0218 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x03da  */
    /* JADX WARN: Code duplicated, block: B:117:0x03db A[Catch: Exception -> 0x023d, TryCatch #0 {Exception -> 0x023d, blocks: (B:62:0x0238, B:68:0x0256, B:69:0x0259, B:73:0x0272, B:108:0x0373, B:110:0x037d, B:112:0x039a, B:114:0x03ad, B:117:0x03db, B:120:0x040a, B:123:0x0416, B:72:0x026e, B:76:0x0280, B:94:0x0309, B:96:0x0315, B:99:0x032b, B:103:0x034e, B:104:0x0353, B:105:0x0354, B:85:0x02ce, B:87:0x02d8, B:89:0x02ec, B:90:0x02f2, B:95:0x030c), top: B:141:0x0218 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x040a A[Catch: Exception -> 0x023d, TryCatch #0 {Exception -> 0x023d, blocks: (B:62:0x0238, B:68:0x0256, B:69:0x0259, B:73:0x0272, B:108:0x0373, B:110:0x037d, B:112:0x039a, B:114:0x03ad, B:117:0x03db, B:120:0x040a, B:123:0x0416, B:72:0x026e, B:76:0x0280, B:94:0x0309, B:96:0x0315, B:99:0x032b, B:103:0x034e, B:104:0x0353, B:105:0x0354, B:85:0x02ce, B:87:0x02d8, B:89:0x02ec, B:90:0x02f2, B:95:0x030c), top: B:141:0x0218 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0414  */
    /* JADX WARN: Code duplicated, block: B:98:0x0329 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x032b A[Catch: Exception -> 0x023d, TryCatch #0 {Exception -> 0x023d, blocks: (B:62:0x0238, B:68:0x0256, B:69:0x0259, B:73:0x0272, B:108:0x0373, B:110:0x037d, B:112:0x039a, B:114:0x03ad, B:117:0x03db, B:120:0x040a, B:123:0x0416, B:72:0x026e, B:76:0x0280, B:94:0x0309, B:96:0x0315, B:99:0x032b, B:103:0x034e, B:104:0x0353, B:105:0x0354, B:85:0x02ce, B:87:0x02d8, B:89:0x02ec, B:90:0x02f2, B:95:0x030c), top: B:141:0x0218 }] */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0406, code lost:
    
        if (r5.o(r4, r37) == r10) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [ta0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ta0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i00.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i00(q72 q72Var, Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, Continuation continuation) {
        super(2, continuation);
        this.a = 4;
        this.c = q72Var;
        this.d = function0;
        this.j = mutableState;
        this.e = mutableState2;
        this.g = mutableState3;
        this.h = mutableState4;
        this.i = mutableState5;
        this.k = mutableState6;
        this.l = mutableState7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i00(va0 va0Var, jb2 jb2Var, Context context, Continuation continuation) {
        super(2, continuation);
        this.a = 1;
        this.j = va0Var;
        this.k = jb2Var;
        this.l = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i00(Object obj, Object obj2, Object obj3, MutableState mutableState, Object obj4, Object obj5, Object obj6, Object obj7, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.j = mutableState;
        this.g = obj4;
        this.h = obj5;
        this.i = obj6;
        this.k = obj7;
        this.l = mutableState2;
    }
}
