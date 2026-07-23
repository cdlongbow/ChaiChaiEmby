package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;
import androidx.media3.common.Player;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class s6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(rn0 rn0Var, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.a = 5;
        this.c = rn0Var;
        this.d = focusRequester;
        this.e = focusRequester2;
        this.g = focusRequester3;
        this.i = mutableState;
        this.j = mutableState2;
        this.h = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                return new s6((i3) this.c, (FocusRequester) this.d, (FocusRequester) this.e, (FocusRequester) this.g, (FocusRequester) this.h, (MutableState) obj3, (MutableState) obj2, continuation, 0);
            case 1:
                return new s6((qq) obj3, (String) obj2, continuation);
            case 2:
                return new s6((Player) this.c, (DanmakuPlayer) this.d, (State) this.e, (State) this.g, (State) this.h, (State) obj3, (State) obj2, continuation, 2);
            case 3:
                return new s6((Context) this.d, (String) this.e, (MutableState) obj3, (MutableState) obj2, (MutableState) this.g, (MutableState) this.h, continuation);
            case 4:
                return new s6((gg0) this.c, (fs0) this.d, this.e, (wa1) this.g, (yg0) this.h, (g41) obj3, (ns1) obj2, continuation, 4);
            case 5:
                return new s6((rn0) this.c, (FocusRequester) this.d, (FocusRequester) this.e, (FocusRequester) this.g, (MutableState) obj3, (MutableState) obj2, (MutableState) this.h, continuation);
            case 6:
                return new s6((xa2) this.c, (i92) this.d, (MutableState) obj3, (MutableState) obj2, (MutableState) this.e, (MutableState) this.g, (MutableState) this.h, continuation);
            default:
                return new s6((pf2) this.c, (gd1) this.d, (Function1) this.e, (MutableState) obj3, (MutableState) obj2, (MutableState) this.g, (MutableState) this.h, continuation);
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
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return ((s6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:143:0x033c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0346  */
    /* JADX WARN: Code duplicated, block: B:148:0x0354  */
    /* JADX WARN: Code duplicated, block: B:150:0x037d  */
    /* JADX WARN: Code duplicated, block: B:190:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:208:0x0548 A[Catch: Exception -> 0x0406, TryCatch #0 {Exception -> 0x0406, blocks: (B:159:0x03f8, B:191:0x04f6, B:193:0x04fc, B:195:0x0502, B:198:0x0509, B:200:0x050d, B:201:0x0511, B:204:0x0518, B:206:0x051c, B:207:0x0520, B:208:0x0548, B:210:0x054e, B:212:0x0554, B:214:0x055a, B:216:0x0560, B:165:0x041e, B:187:0x04b2, B:168:0x0435, B:174:0x045b, B:176:0x0461, B:180:0x046b, B:182:0x046f, B:183:0x047b, B:217:0x0581, B:219:0x0589, B:223:0x0591, B:171:0x0446), top: B:257:0x03e2 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x054e A[Catch: Exception -> 0x0406, TryCatch #0 {Exception -> 0x0406, blocks: (B:159:0x03f8, B:191:0x04f6, B:193:0x04fc, B:195:0x0502, B:198:0x0509, B:200:0x050d, B:201:0x0511, B:204:0x0518, B:206:0x051c, B:207:0x0520, B:208:0x0548, B:210:0x054e, B:212:0x0554, B:214:0x055a, B:216:0x0560, B:165:0x041e, B:187:0x04b2, B:168:0x0435, B:174:0x045b, B:176:0x0461, B:180:0x046b, B:182:0x046f, B:183:0x047b, B:217:0x0581, B:219:0x0589, B:223:0x0591, B:171:0x0446), top: B:257:0x03e2 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x0553  */
    /* JADX WARN: Code duplicated, block: B:214:0x055a A[Catch: Exception -> 0x0406, TryCatch #0 {Exception -> 0x0406, blocks: (B:159:0x03f8, B:191:0x04f6, B:193:0x04fc, B:195:0x0502, B:198:0x0509, B:200:0x050d, B:201:0x0511, B:204:0x0518, B:206:0x051c, B:207:0x0520, B:208:0x0548, B:210:0x054e, B:212:0x0554, B:214:0x055a, B:216:0x0560, B:165:0x041e, B:187:0x04b2, B:168:0x0435, B:174:0x045b, B:176:0x0461, B:180:0x046b, B:182:0x046f, B:183:0x047b, B:217:0x0581, B:219:0x0589, B:223:0x0591, B:171:0x0446), top: B:257:0x03e2 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x055f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x0344 -> B:146:0x0348). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(qq qqVar, String str, Continuation continuation) {
        super(2, continuation);
        this.a = 1;
        this.i = qqVar;
        this.j = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(xa2 xa2Var, i92 i92Var, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Continuation continuation) {
        super(2, continuation);
        this.a = 6;
        this.c = xa2Var;
        this.d = i92Var;
        this.i = mutableState;
        this.j = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(pf2 pf2Var, gd1 gd1Var, Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.a = 7;
        this.c = pf2Var;
        this.d = gd1Var;
        this.e = function1;
        this.i = mutableState;
        this.j = mutableState2;
        this.g = mutableState3;
        this.h = mutableState4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(Context context, String str, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.a = 3;
        this.d = context;
        this.e = str;
        this.i = mutableState;
        this.j = mutableState2;
        this.g = mutableState3;
        this.h = mutableState4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.g = obj4;
        this.h = obj5;
        this.i = obj6;
        this.j = obj7;
    }
}
