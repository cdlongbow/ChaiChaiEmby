package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.TraktScrobbleRequest;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class la2 extends SuspendLambda implements Function2 {
    public Object a;
    public za2 b;
    public TraktScrobbleRequest c;
    public Object d;
    public Object e;
    public long g;
    public int h;
    public final /* synthetic */ xa2 i;
    public final /* synthetic */ MediaItem j;
    public final /* synthetic */ long k;
    public final /* synthetic */ Long l;
    public final /* synthetic */ ya2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la2(xa2 xa2Var, MediaItem mediaItem, long j, Long l, ya2 ya2Var, Continuation continuation) {
        super(2, continuation);
        this.i = xa2Var;
        this.j = mediaItem;
        this.k = j;
        this.l = l;
        this.m = ya2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new la2(this.i, this.j, this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((la2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0322 A[Catch: Exception -> 0x02fb, CancellationException -> 0x06c4, TryCatch #22 {Exception -> 0x02fb, blocks: (B:90:0x02f6, B:100:0x031c, B:102:0x0322, B:103:0x0335, B:87:0x02cd), top: B:283:0x02cd }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0335 A[Catch: Exception -> 0x02fb, CancellationException -> 0x06c4, TRY_LEAVE, TryCatch #22 {Exception -> 0x02fb, blocks: (B:90:0x02f6, B:100:0x031c, B:102:0x0322, B:103:0x0335, B:87:0x02cd), top: B:283:0x02cd }] */
    /* JADX WARN: Code duplicated, block: B:108:0x034d  */
    /* JADX WARN: Code duplicated, block: B:120:0x03d7 A[Catch: Exception -> 0x03c7, CancellationException -> 0x06c4, TRY_LEAVE, TryCatch #26 {Exception -> 0x03c7, blocks: (B:113:0x03a8, B:120:0x03d7), top: B:290:0x033d }] */
    /* JADX WARN: Code duplicated, block: B:125:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:136:0x0414  */
    /* JADX WARN: Code duplicated, block: B:154:0x0496 A[Catch: Exception -> 0x047d, CancellationException -> 0x06c4, TryCatch #20 {Exception -> 0x047d, blocks: (B:141:0x046b, B:154:0x0496, B:156:0x04a2, B:159:0x04b2), top: B:279:0x03e5 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x04a2 A[Catch: Exception -> 0x047d, CancellationException -> 0x06c4, TryCatch #20 {Exception -> 0x047d, blocks: (B:141:0x046b, B:154:0x0496, B:156:0x04a2, B:159:0x04b2), top: B:279:0x03e5 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:182:0x053e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0556  */
    /* JADX WARN: Code duplicated, block: B:209:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:212:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:249:0x0548 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0407 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0214 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x03e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x033f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x01c3 A[Catch: Exception -> 0x01a6, CancellationException -> 0x06c4, TryCatch #8 {Exception -> 0x01a6, blocks: (B:66:0x020b, B:70:0x021a, B:58:0x01bf, B:60:0x01c3, B:62:0x01f5, B:49:0x018f, B:51:0x0197, B:55:0x01b0, B:45:0x0184), top: B:255:0x0184 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01f5 A[Catch: Exception -> 0x01a6, CancellationException -> 0x06c4, TryCatch #8 {Exception -> 0x01a6, blocks: (B:66:0x020b, B:70:0x021a, B:58:0x01bf, B:60:0x01c3, B:62:0x01f5, B:49:0x018f, B:51:0x0197, B:55:0x01b0, B:45:0x0184), top: B:255:0x0184 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0209  */
    /* JADX WARN: Code duplicated, block: B:65:0x020a  */
    /* JADX WARN: Code duplicated, block: B:70:0x021a A[Catch: Exception -> 0x01a6, CancellationException -> 0x06c4, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x01a6, blocks: (B:66:0x020b, B:70:0x021a, B:58:0x01bf, B:60:0x01c3, B:62:0x01f5, B:49:0x018f, B:51:0x0197, B:55:0x01b0, B:45:0x0184), top: B:255:0x0184 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0224  */
    /* JADX WARN: Code duplicated, block: B:75:0x0239  */
    /* JADX WARN: Code duplicated, block: B:77:0x023e  */
    /* JADX WARN: Code duplicated, block: B:86:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:99:0x030f  */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x01c3, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17, types: [long] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v3, types: [long] */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v9, types: [int] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11, types: [retrofit2.Response] */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7, types: [retrofit2.Response] */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r22v24 */
    /* JADX WARN: Type inference failed for: r22v25 */
    /* JADX WARN: Type inference failed for: r22v26 */
    /* JADX WARN: Type inference failed for: r22v27 */
    /* JADX WARN: Type inference failed for: r22v28 */
    /* JADX WARN: Type inference failed for: r22v29 */
    /* JADX WARN: Type inference failed for: r22v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27, types: [int] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v10 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v14 */
    /* JADX WARN: Type inference failed for: r33v15 */
    /* JADX WARN: Type inference failed for: r33v16 */
    /* JADX WARN: Type inference failed for: r33v17 */
    /* JADX WARN: Type inference failed for: r33v18 */
    /* JADX WARN: Type inference failed for: r33v19 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v20 */
    /* JADX WARN: Type inference failed for: r33v21 */
    /* JADX WARN: Type inference failed for: r33v22 */
    /* JADX WARN: Type inference failed for: r33v23 */
    /* JADX WARN: Type inference failed for: r33v24 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v8 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1 */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r39v3 */
    /* JADX WARN: Type inference failed for: r39v4 */
    /* JADX WARN: Type inference failed for: r39v5 */
    /* JADX WARN: Type inference failed for: r39v6 */
    /* JADX WARN: Type inference failed for: r39v7 */
    /* JADX WARN: Type inference failed for: r39v8 */
    /* JADX WARN: Type inference failed for: r39v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [retrofit2.Response] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25, types: [long] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [int] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r4v0, types: [long] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [long] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41, types: [long] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44, types: [long] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48, types: [long] */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object IsSuccessful;
        MediaItem mediaItem;
        Object r22;
        Object Code;
        Object objM8825constructorimpl;
        int i;
        String str2;
        String str3;
        boolean z;
        xa2 xa2Var;
        Object objA;
        i92 i92Var;
        Object r39;
        Object obj2;
        za2 za2Var;
        TraktScrobbleRequest traktScrobbleRequestB;
        Object objA2;
        Object r310;
        Object obj3;
        boolean z2;
        String str4;
        Object objL;
        TraktScrobbleRequest traktScrobbleRequest;
        Object r311;
        Object obj4;
        boolean z3;
        String str5;
        Response response;
        Object r33;
        Long lJ;
        long jLongValue;
        String str6;
        long j;
        String strA;
        String str7;
        TraktScrobbleRequest traktScrobbleRequest2;
        String str8;
        String str9;
        Object r12;
        za2 za2Var2;
        i92 i92Var2;
        Object objDelay;
        Object obj5;
        Response response2;
        String str10;
        TraktScrobbleRequest traktScrobbleRequest3;
        long j2;
        Object r34;
        boolean z4;
        Object objL2;
        Object r35;
        Object obj6;
        Object r23;
        String strA2;
        Object r17;
        TraktScrobbleRequest traktScrobbleRequest4;
        Object r3;
        Object Code2;
        String strA3;
        Object obj7;
        Long lJ2;
        Object r4;
        long jLongValue2;
        Object r24;
        Object r16;
        Object r18;
        String strA4;
        Object r6;
        String strA5;
        Object r19;
        Object r36;
        Object obj8;
        Object r37;
        boolean z5;
        Object obj9;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.h;
        Object obj10 = " message=";
        Object r5 = this.k;
        String type = "TraktSync";
        ya2 ya2Var = this.m;
        MediaItem mediaItem2 = this.j;
        String str11 = " code=";
        xa2 xa2Var2 = this.i;
        try {
            try {
                if (i2 != 0) {
                    try {
                        if (i2 == 1) {
                            i92 i92Var3 = (i92) this.a;
                            ResultKt.throwOnFailure(obj);
                            str2 = " idSource=";
                            str3 = " positionMs=";
                            r39 = r5;
                            mediaItem = mediaItem2;
                            obj2 = obj10;
                            z = true;
                            i92Var = i92Var3;
                            i = 2;
                            xa2Var = xa2Var2;
                            objA = obj;
                        } else {
                            if (i2 == 2) {
                                TraktScrobbleRequest traktScrobbleRequest5 = this.c;
                                za2Var = this.b;
                                i92 i92Var4 = (i92) this.a;
                                ResultKt.throwOnFailure(obj);
                                str2 = " idSource=";
                                str3 = " positionMs=";
                                r310 = r5;
                                mediaItem = mediaItem2;
                                traktScrobbleRequestB = traktScrobbleRequest5;
                                obj3 = obj10;
                                str11 = str11;
                                z2 = true;
                                objA2 = obj;
                                i92Var = i92Var4;
                                xa2Var = xa2Var2;
                                z2 = z;
                                obj3 = obj2;
                                r310 = r39;
                                str4 = (String) objA2;
                                if (str4 == null) {
                                    Log.w("TraktSync", "event=scrobble result=skip reason=no_valid_token itemId=" + mediaItem.getId() + " type=" + mediaItem.getType() + " action=" + ya2Var);
                                    Result.Companion companion = Result.INSTANCE;
                                    return Result.m8824boximpl(Result.m8825constructorimpl(Boxing.boxBoolean(false)));
                                }
                                i92Var.getClass();
                                this.a = i92Var;
                                this.b = za2Var;
                                this.c = traktScrobbleRequestB;
                                this.d = str4;
                                this.h = 3;
                                objL = xa2.l(xa2Var, str4, ya2Var, traktScrobbleRequestB, this);
                                if (objL != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                traktScrobbleRequest = traktScrobbleRequestB;
                                str5 = str4;
                                z3 = z2;
                                obj4 = obj3;
                                r311 = r310;
                                response = (Response) objL;
                                if (xa2.m(xa2Var, response, ya2Var)) {
                                    lJ = xa2.j(xa2Var, response);
                                    if (lJ != null) {
                                        jLongValue = lJ.longValue();
                                    } else {
                                        jLongValue = 1000;
                                    }
                                    str6 = str5;
                                    j = jLongValue;
                                    String id = mediaItem.getId();
                                    String type2 = mediaItem.getType();
                                    strA = za2Var.a();
                                    if (strA == null) {
                                        str7 = "none";
                                    } else {
                                        str7 = strA;
                                    }
                                    traktScrobbleRequest2 = traktScrobbleRequest;
                                    int iCode = response.code();
                                    za2 za2Var3 = za2Var;
                                    i92 i92Var5 = i92Var;
                                    String strD = xa2.d(xa2Var, traktScrobbleRequest2.getProgress());
                                    Object sb = new StringBuilder("event=scrobble result=retry itemId=");
                                    sb.append(id);
                                    sb.append(" type=");
                                    sb.append(type2);
                                    sb.append(" action=");
                                    sb.append(ya2Var);
                                    str8 = str2;
                                    sb.append(str8);
                                    sb.append(str7);
                                    str9 = str11;
                                    sb.append(str9);
                                    sb.append(iCode);
                                    sb.append(" retryDelayMs=");
                                    sb.append(j);
                                    sb.append(" progress=");
                                    sb.append(strD);
                                    str = str3;
                                    sb.append(str);
                                    r12 = r311;
                                    sb.append(r12);
                                    Log.w("TraktSync", sb.toString());
                                    xa2.v(response);
                                    this.a = i92Var5;
                                    za2Var2 = za2Var3;
                                    this.b = za2Var2;
                                    i92Var2 = i92Var5;
                                    this.c = traktScrobbleRequest2;
                                    this.d = str6;
                                    this.e = null;
                                    this.g = j;
                                    this.h = 4;
                                    objDelay = DelayKt.delay(j, this);
                                    obj5 = coroutine_suspended;
                                    if (objDelay == obj5) {
                                        return obj5;
                                    }
                                    response2 = response;
                                    r33 = r12;
                                    str10 = str6;
                                    traktScrobbleRequest3 = traktScrobbleRequest2;
                                    j2 = j;
                                    z4 = z3;
                                    obj4 = obj4;
                                    i92Var2.getClass();
                                    this.a = null;
                                    this.b = za2Var2;
                                    this.c = traktScrobbleRequest3;
                                    this.d = null;
                                    this.e = null;
                                    this.g = j2;
                                    this.h = 5;
                                    objL2 = xa2.l(xa2Var, str10, ya2Var, traktScrobbleRequest3, this);
                                    obj9 = objL2;
                                    z5 = z4;
                                    r37 = r33;
                                    obj8 = obj4;
                                    if (objL2 == obj5) {
                                        return obj5;
                                    }
                                } else {
                                    za2Var2 = za2Var;
                                    str9 = str11;
                                    str8 = str2;
                                    str = str3;
                                    r34 = r311;
                                    Code = response;
                                    r5 = str5;
                                    r23 = z3;
                                    obj6 = obj4;
                                }
                                IsSuccessful = Code.isSuccessful();
                                if (IsSuccessful != 0) {
                                    Result.Companion companion2 = Result.INSTANCE;
                                    objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(r23));
                                    r17 = Code;
                                    IsSuccessful = "TraktSync";
                                    r5 = r34;
                                    Code = obj6;
                                } else {
                                    IsSuccessful = Code.code();
                                    if (IsSuccessful == 409) {
                                        r17 = Code;
                                        traktScrobbleRequest4 = traktScrobbleRequest;
                                        r3 = r34;
                                        IsSuccessful = obj6;
                                        Code2 = r17.code();
                                        if (Code2 == 429) {
                                            String id2 = mediaItem.getId();
                                            String type3 = mediaItem.getType();
                                            strA3 = za2Var2.a();
                                            if (strA3 == null) {
                                                strA3 = "none";
                                            }
                                            r23 = IsSuccessful;
                                            int iCode2 = r17.code();
                                            obj7 = "TraktSync";
                                            lJ2 = xa2.j(xa2Var, r17);
                                            if (lJ2 != null) {
                                                jLongValue2 = lJ2.longValue();
                                            } else {
                                                jLongValue2 = -1;
                                            }
                                            String strD2 = xa2.d(xa2Var, traktScrobbleRequest4.getProgress());
                                            String strK = xa2.K(r17);
                                            r17 = r17;
                                            type = "event=scrobble result=rate_limited itemId=";
                                            Object sb2 = new StringBuilder(type);
                                            sb2.append(id2);
                                            sb2.append(" type=");
                                            sb2.append(type3);
                                            sb2.append(" action=");
                                            sb2.append(ya2Var);
                                            sb2.append(str8);
                                            sb2.append(strA3);
                                            sb2.append(str9);
                                            sb2.append(iCode2);
                                            sb2.append(" retryAfterMs=");
                                            sb2.append(jLongValue2);
                                            sb2.append(" progress=");
                                            sb2.append(strD2);
                                            sb2.append(str);
                                            Code2 = r3;
                                            sb2.append(Code2);
                                            sb2.append(" error=");
                                            sb2.append(strK);
                                            IsSuccessful = obj7;
                                            Log.w((String) IsSuccessful, sb2.toString());
                                            Result.Companion companion3 = Result.INSTANCE;
                                            objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                            r5 = Code2;
                                            Code = r23;
                                        } else {
                                            r23 = IsSuccessful;
                                            IsSuccessful = "TraktSync";
                                            Code = r17.code();
                                            r5 = 422;
                                            if (Code == 422) {
                                                String id3 = mediaItem.getId();
                                                String type4 = mediaItem.getType();
                                                type = za2Var2.a();
                                                if (type == null) {
                                                    type = "none";
                                                }
                                                int iCode3 = r17.code();
                                                r19 = IsSuccessful;
                                                String strK2 = xa2.k(xa2Var, r17.message());
                                                r36 = r3;
                                                String strD3 = xa2.d(xa2Var, traktScrobbleRequest4.getProgress());
                                                String strK3 = xa2.K(r17);
                                                String str12 = "event=scrobble result=validation_error itemId=";
                                                Object sb3 = new StringBuilder(str12);
                                                sb3.append(id3);
                                                sb3.append(" type=");
                                                sb3.append(type4);
                                                sb3.append(" action=");
                                                sb3.append(ya2Var);
                                                sb3.append(str8);
                                                sb3.append(type);
                                                sb3.append(str9);
                                                sb3.append(iCode3);
                                                Object r7 = r23;
                                                sb3.append(r7);
                                                sb3.append(strK2);
                                                sb3.append(" progress=");
                                                sb3.append(strD3);
                                                sb3.append(str);
                                                Object r8 = r36;
                                                sb3.append(r8);
                                                sb3.append(" error=");
                                                sb3.append(strK3);
                                                Object r2 = r19;
                                                Log.w((String) r2, sb3.toString());
                                                Result.Companion companion4 = Result.INSTANCE;
                                                objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                IsSuccessful = r2;
                                                Code = r7;
                                                r5 = r8;
                                                Code2 = str12;
                                                r18 = r19;
                                                r34 = r36;
                                            } else {
                                                Code = r23;
                                                if (r17.code() >= 500) {
                                                    String id4 = mediaItem.getId();
                                                    type = mediaItem.getType();
                                                    strA4 = za2Var2.a();
                                                    if (strA4 == null) {
                                                        strA4 = "none";
                                                    }
                                                    int iCode4 = r17.code();
                                                    String strK4 = xa2.k(xa2Var, r17.message());
                                                    String strD4 = xa2.d(xa2Var, traktScrobbleRequest4.getProgress());
                                                    String strK5 = xa2.K(r17);
                                                    Code2 = "event=scrobble result=server_error itemId=";
                                                    Object sb4 = new StringBuilder((String) Code2);
                                                    sb4.append(id4);
                                                    sb4.append(" type=");
                                                    sb4.append(type);
                                                    sb4.append(" action=");
                                                    sb4.append(ya2Var);
                                                    sb4.append(str8);
                                                    sb4.append(strA4);
                                                    sb4.append(str9);
                                                    sb4.append(iCode4);
                                                    sb4.append(Code);
                                                    sb4.append(strK4);
                                                    sb4.append(" progress=");
                                                    sb4.append(strD4);
                                                    sb4.append(str);
                                                    r5 = r3;
                                                    sb4.append(r5);
                                                    sb4.append(" error=");
                                                    sb4.append(strK5);
                                                    r6 = IsSuccessful;
                                                    Log.w((String) r6, sb4.toString());
                                                    Result.Companion companion5 = Result.INSTANCE;
                                                    objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                    IsSuccessful = r6;
                                                } else {
                                                    String id5 = mediaItem.getId();
                                                    type = mediaItem.getType();
                                                    strA5 = za2Var2.a();
                                                    if (strA5 == null) {
                                                        strA5 = "none";
                                                    }
                                                    r18 = IsSuccessful;
                                                    int iCode5 = r17.code();
                                                    String strK6 = xa2.k(xa2Var, r17.message());
                                                    Object r38 = r3;
                                                    String strD5 = xa2.d(xa2Var, traktScrobbleRequest4.getProgress());
                                                    String strK7 = xa2.K(r17);
                                                    String str13 = "event=scrobble result=http_error itemId=";
                                                    Object sb5 = new StringBuilder(str13);
                                                    sb5.append(id5);
                                                    sb5.append(" type=");
                                                    sb5.append(type);
                                                    sb5.append(" action=");
                                                    sb5.append(ya2Var);
                                                    sb5.append(str8);
                                                    sb5.append(strA5);
                                                    sb5.append(str9);
                                                    sb5.append(iCode5);
                                                    sb5.append(Code);
                                                    sb5.append(strK6);
                                                    sb5.append(" progress=");
                                                    sb5.append(strD5);
                                                    sb5.append(str);
                                                    Object r9 = r38;
                                                    sb5.append(r9);
                                                    sb5.append(" error=");
                                                    sb5.append(strK7);
                                                    Object r10 = r18;
                                                    Log.w((String) r10, sb5.toString());
                                                    Result.Companion companion6 = Result.INSTANCE;
                                                    objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                    IsSuccessful = r10;
                                                    Code = Code;
                                                    r5 = r9;
                                                    Code2 = str13;
                                                    r18 = r18;
                                                    r34 = r38;
                                                }
                                                r5 = r3;
                                                String id6 = mediaItem.getId();
                                                String type5 = mediaItem.getType();
                                                String message = e.getMessage();
                                                Object Z = kb0.z("event=scrobble result=exception itemId=", id6, " type=", type5, " action=");
                                                Z.append(ya2Var);
                                                Z.append(str);
                                                Z.append(r5);
                                                Z.append(Code);
                                                Z.append(message);
                                                Log.e(IsSuccessful, Z.toString(), e);
                                                Result.Companion companion7 = Result.INSTANCE;
                                                objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                            }
                                        }
                                        return Result.m8824boximpl(objM8825constructorimpl);
                                    }
                                    String id7 = mediaItem.getId();
                                    String type6 = mediaItem.getType();
                                    strA2 = za2Var2.a();
                                    if (strA2 == null) {
                                        strA2 = "none";
                                    }
                                    int iCode6 = Code.code();
                                    TraktScrobbleRequest traktScrobbleRequest6 = traktScrobbleRequest;
                                    String strK8 = xa2.k(xa2Var, Code.message());
                                    String strD6 = xa2.d(xa2Var, traktScrobbleRequest6.getProgress());
                                    String strK9 = xa2.K(Code);
                                    r17 = Code;
                                    Object sb6 = new StringBuilder("event=scrobble result=conflict itemId=");
                                    sb6.append(id7);
                                    sb6.append(" type=");
                                    sb6.append(type6);
                                    sb6.append(" action=");
                                    sb6.append(ya2Var);
                                    sb6.append(str8);
                                    sb6.append(strA2);
                                    sb6.append(str9);
                                    sb6.append(iCode6);
                                    IsSuccessful = obj6;
                                    sb6.append(IsSuccessful);
                                    sb6.append(strK8);
                                    sb6.append(" progress=");
                                    sb6.append(strD6);
                                    sb6.append(str);
                                    Object r11 = r34;
                                    sb6.append(r11);
                                    sb6.append(" error=");
                                    sb6.append(strK9);
                                    Log.w("TraktSync", sb6.toString());
                                    Result.Companion companion8 = Result.INSTANCE;
                                    objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                    r5 = r11;
                                    Code = IsSuccessful;
                                    IsSuccessful = "TraktSync";
                                }
                                xa2.v(r17);
                                return Result.m8824boximpl(objM8825constructorimpl);
                            }
                            if (i2 == 3) {
                                String str14 = (String) this.d;
                                traktScrobbleRequest = this.c;
                                za2Var = this.b;
                                i92 i92Var6 = (i92) this.a;
                                ResultKt.throwOnFailure(obj);
                                str2 = " idSource=";
                                str3 = " positionMs=";
                                r311 = r5;
                                str5 = str14;
                                obj4 = obj10;
                                str11 = str11;
                                z3 = true;
                                objL = obj;
                                i92Var = i92Var6;
                                mediaItem = mediaItem2;
                                xa2Var = xa2Var2;
                                response = (Response) objL;
                                if (xa2.m(xa2Var, response, ya2Var)) {
                                    try {
                                        lJ = xa2.j(xa2Var, response);
                                        if (lJ != null) {
                                            jLongValue = lJ.longValue();
                                        } else {
                                            jLongValue = 1000;
                                        }
                                        str6 = str5;
                                        j = jLongValue;
                                        String id8 = mediaItem.getId();
                                        String type7 = mediaItem.getType();
                                        strA = za2Var.a();
                                        if (strA == null) {
                                            str7 = "none";
                                        } else {
                                            str7 = strA;
                                        }
                                        traktScrobbleRequest2 = traktScrobbleRequest;
                                        int iCode7 = response.code();
                                        za2 za2Var4 = za2Var;
                                        i92 i92Var7 = i92Var;
                                        String strD7 = xa2.d(xa2Var, traktScrobbleRequest2.getProgress());
                                        Object sb7 = new StringBuilder("event=scrobble result=retry itemId=");
                                        sb7.append(id8);
                                        sb7.append(" type=");
                                        sb7.append(type7);
                                        sb7.append(" action=");
                                        sb7.append(ya2Var);
                                        str8 = str2;
                                        sb7.append(str8);
                                        sb7.append(str7);
                                        str9 = str11;
                                        sb7.append(str9);
                                        sb7.append(iCode7);
                                        sb7.append(" retryDelayMs=");
                                        sb7.append(j);
                                        sb7.append(" progress=");
                                        sb7.append(strD7);
                                        str = str3;
                                        try {
                                            sb7.append(str);
                                            r12 = r311;
                                            try {
                                                sb7.append(r12);
                                                Log.w("TraktSync", sb7.toString());
                                                xa2.v(response);
                                                this.a = i92Var7;
                                                za2Var2 = za2Var4;
                                                this.b = za2Var2;
                                                i92Var2 = i92Var7;
                                                this.c = traktScrobbleRequest2;
                                                this.d = str6;
                                                this.e = null;
                                                this.g = j;
                                                this.h = 4;
                                                objDelay = DelayKt.delay(j, this);
                                                obj5 = coroutine_suspended;
                                                if (objDelay == obj5) {
                                                    return obj5;
                                                }
                                                response2 = response;
                                                r33 = r12;
                                                str10 = str6;
                                                traktScrobbleRequest3 = traktScrobbleRequest2;
                                                j2 = j;
                                                z4 = z3;
                                                obj4 = obj4;
                                                i92Var2.getClass();
                                                this.a = null;
                                                this.b = za2Var2;
                                                this.c = traktScrobbleRequest3;
                                                this.d = null;
                                                this.e = null;
                                                this.g = j2;
                                                this.h = 5;
                                                objL2 = xa2.l(xa2Var, str10, ya2Var, traktScrobbleRequest3, this);
                                                obj9 = objL2;
                                                z5 = z4;
                                                r37 = r33;
                                                obj8 = obj4;
                                                if (objL2 == obj5) {
                                                    return obj5;
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                r33 = r12;
                                                IsSuccessful = "TraktSync";
                                                r5 = r33;
                                                Code = obj4;
                                                String id9 = mediaItem.getId();
                                                String type8 = mediaItem.getType();
                                                String message2 = e.getMessage();
                                                Object Z2 = kb0.z("event=scrobble result=exception itemId=", id9, " type=", type8, " action=");
                                                Z2.append(ya2Var);
                                                Z2.append(str);
                                                Z2.append(r5);
                                                Z2.append(Code);
                                                Z2.append(message2);
                                                Log.e(IsSuccessful, Z2.toString(), e);
                                                Result.Companion companion9 = Result.INSTANCE;
                                                objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                return Result.m8824boximpl(objM8825constructorimpl);
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            r33 = r311;
                                            IsSuccessful = "TraktSync";
                                            r5 = r33;
                                            Code = obj4;
                                            String id10 = mediaItem.getId();
                                            String type9 = mediaItem.getType();
                                            String message3 = e.getMessage();
                                            Object Z3 = kb0.z("event=scrobble result=exception itemId=", id10, " type=", type9, " action=");
                                            Z3.append(ya2Var);
                                            Z3.append(str);
                                            Z3.append(r5);
                                            Z3.append(Code);
                                            Z3.append(message3);
                                            Log.e(IsSuccessful, Z3.toString(), e);
                                            Result.Companion companion10 = Result.INSTANCE;
                                            objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                            return Result.m8824boximpl(objM8825constructorimpl);
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        str = str3;
                                    }
                                } else {
                                    za2Var2 = za2Var;
                                    str9 = str11;
                                    str8 = str2;
                                    str = str3;
                                    r34 = r311;
                                    Code = response;
                                    r5 = str5;
                                    r23 = z3;
                                    obj6 = obj4;
                                }
                                IsSuccessful = Code.isSuccessful();
                                if (IsSuccessful != 0) {
                                    Result.Companion companion11 = Result.INSTANCE;
                                    objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(r23));
                                    r17 = Code;
                                    IsSuccessful = "TraktSync";
                                    r5 = r34;
                                    Code = obj6;
                                } else {
                                    IsSuccessful = Code.code();
                                    try {
                                        if (IsSuccessful == 409) {
                                            r17 = Code;
                                            traktScrobbleRequest4 = traktScrobbleRequest;
                                            r3 = r34;
                                            IsSuccessful = obj6;
                                            Code2 = r17.code();
                                            try {
                                                if (Code2 == 429) {
                                                    try {
                                                        String id11 = mediaItem.getId();
                                                        String type10 = mediaItem.getType();
                                                        strA3 = za2Var2.a();
                                                        if (strA3 == null) {
                                                            strA3 = "none";
                                                        }
                                                        r23 = IsSuccessful;
                                                        try {
                                                            int iCode8 = r17.code();
                                                            obj7 = "TraktSync";
                                                            try {
                                                                lJ2 = xa2.j(xa2Var, r17);
                                                                if (lJ2 != null) {
                                                                    try {
                                                                        jLongValue2 = lJ2.longValue();
                                                                    } catch (Exception e4) {
                                                                        e = e4;
                                                                        r4 = r3;
                                                                        r16 = obj7;
                                                                        r24 = r23;
                                                                        IsSuccessful = r16;
                                                                        r5 = r4;
                                                                        r22 = r24;
                                                                        Code = r22;
                                                                        String id12 = mediaItem.getId();
                                                                        String type11 = mediaItem.getType();
                                                                        String message4 = e.getMessage();
                                                                        Object Z4 = kb0.z("event=scrobble result=exception itemId=", id12, " type=", type11, " action=");
                                                                        Z4.append(ya2Var);
                                                                        Z4.append(str);
                                                                        Z4.append(r5);
                                                                        Z4.append(Code);
                                                                        Z4.append(message4);
                                                                        Log.e(IsSuccessful, Z4.toString(), e);
                                                                        Result.Companion companion12 = Result.INSTANCE;
                                                                        objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                                    }
                                                                } else {
                                                                    jLongValue2 = -1;
                                                                }
                                                                try {
                                                                    String strD8 = xa2.d(xa2Var, traktScrobbleRequest4.getProgress());
                                                                    String strK10 = xa2.K(r17);
                                                                    r17 = r17;
                                                                    type = "event=scrobble result=rate_limited itemId=";
                                                                    Object sb8 = new StringBuilder(type);
                                                                    sb8.append(id11);
                                                                    sb8.append(" type=");
                                                                    sb8.append(type10);
                                                                    sb8.append(" action=");
                                                                    sb8.append(ya2Var);
                                                                    sb8.append(str8);
                                                                    sb8.append(strA3);
                                                                    sb8.append(str9);
                                                                    sb8.append(iCode8);
                                                                    sb8.append(" retryAfterMs=");
                                                                    sb8.append(jLongValue2);
                                                                    sb8.append(" progress=");
                                                                    sb8.append(strD8);
                                                                    sb8.append(str);
                                                                    Code2 = r3;
                                                                    try {
                                                                        sb8.append(Code2);
                                                                        sb8.append(" error=");
                                                                        sb8.append(strK10);
                                                                        IsSuccessful = obj7;
                                                                        Log.w((String) IsSuccessful, sb8.toString());
                                                                        Result.Companion companion13 = Result.INSTANCE;
                                                                        objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                                        r5 = Code2;
                                                                        Code = r23;
                                                                    } catch (Exception e5) {
                                                                        e = e5;
                                                                        IsSuccessful = obj7;
                                                                        r5 = Code2;
                                                                        IsSuccessful = IsSuccessful;
                                                                        r22 = r23;
                                                                        Code = r22;
                                                                        String id13 = mediaItem.getId();
                                                                        String type12 = mediaItem.getType();
                                                                        String message5 = e.getMessage();
                                                                        Object Z5 = kb0.z("event=scrobble result=exception itemId=", id13, " type=", type12, " action=");
                                                                        Z5.append(ya2Var);
                                                                        Z5.append(str);
                                                                        Z5.append(r5);
                                                                        Z5.append(Code);
                                                                        Z5.append(message5);
                                                                        Log.e(IsSuccessful, Z5.toString(), e);
                                                                        Result.Companion companion14 = Result.INSTANCE;
                                                                        objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                                    }
                                                                } catch (Exception e6) {
                                                                    e = e6;
                                                                    IsSuccessful = obj7;
                                                                    Code2 = r3;
                                                                    r5 = Code2;
                                                                    IsSuccessful = IsSuccessful;
                                                                    r22 = r23;
                                                                    Code = r22;
                                                                    String id14 = mediaItem.getId();
                                                                    String type13 = mediaItem.getType();
                                                                    String message6 = e.getMessage();
                                                                    Object Z6 = kb0.z("event=scrobble result=exception itemId=", id14, " type=", type13, " action=");
                                                                    Z6.append(ya2Var);
                                                                    Z6.append(str);
                                                                    Z6.append(r5);
                                                                    Z6.append(Code);
                                                                    Z6.append(message6);
                                                                    Log.e(IsSuccessful, Z6.toString(), e);
                                                                    Result.Companion companion15 = Result.INSTANCE;
                                                                    objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                                }
                                                            } catch (Exception e7) {
                                                                e = e7;
                                                                Code2 = r3;
                                                            }
                                                        } catch (Exception e8) {
                                                            e = e8;
                                                            Code2 = r3;
                                                            IsSuccessful = "TraktSync";
                                                            r5 = Code2;
                                                            IsSuccessful = IsSuccessful;
                                                            r22 = r23;
                                                            Code = r22;
                                                            String id15 = mediaItem.getId();
                                                            String type14 = mediaItem.getType();
                                                            String message7 = e.getMessage();
                                                            Object Z7 = kb0.z("event=scrobble result=exception itemId=", id15, " type=", type14, " action=");
                                                            Z7.append(ya2Var);
                                                            Z7.append(str);
                                                            Z7.append(r5);
                                                            Z7.append(Code);
                                                            Z7.append(message7);
                                                            Log.e(IsSuccessful, Z7.toString(), e);
                                                            Result.Companion companion16 = Result.INSTANCE;
                                                            objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                            return Result.m8824boximpl(objM8825constructorimpl);
                                                        }
                                                    } catch (Exception e9) {
                                                        e = e9;
                                                        r23 = IsSuccessful;
                                                    }
                                                } else {
                                                    r23 = IsSuccessful;
                                                    IsSuccessful = "TraktSync";
                                                    Code = r17.code();
                                                    r5 = 422;
                                                    try {
                                                        try {
                                                            if (Code == 422) {
                                                                String id16 = mediaItem.getId();
                                                                String type15 = mediaItem.getType();
                                                                type = za2Var2.a();
                                                                if (type == null) {
                                                                    type = "none";
                                                                }
                                                                int iCode9 = r17.code();
                                                                r19 = IsSuccessful;
                                                                try {
                                                                    String strK11 = xa2.k(xa2Var, r17.message());
                                                                    r36 = r3;
                                                                    try {
                                                                        String strD9 = xa2.d(xa2Var, traktScrobbleRequest4.getProgress());
                                                                        String strK12 = xa2.K(r17);
                                                                        String str15 = "event=scrobble result=validation_error itemId=";
                                                                        Object sb9 = new StringBuilder(str15);
                                                                        sb9.append(id16);
                                                                        sb9.append(" type=");
                                                                        sb9.append(type15);
                                                                        sb9.append(" action=");
                                                                        sb9.append(ya2Var);
                                                                        sb9.append(str8);
                                                                        sb9.append(type);
                                                                        sb9.append(str9);
                                                                        sb9.append(iCode9);
                                                                        Object r13 = r23;
                                                                        sb9.append(r13);
                                                                        sb9.append(strK11);
                                                                        sb9.append(" progress=");
                                                                        sb9.append(strD9);
                                                                        sb9.append(str);
                                                                        Object r14 = r36;
                                                                        sb9.append(r14);
                                                                        sb9.append(" error=");
                                                                        sb9.append(strK12);
                                                                        Object r15 = r19;
                                                                        Log.w((String) r15, sb9.toString());
                                                                        Result.Companion companion17 = Result.INSTANCE;
                                                                        objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                                        IsSuccessful = r15;
                                                                        Code = r13;
                                                                        r5 = r14;
                                                                        Code2 = str15;
                                                                        r18 = r19;
                                                                        r34 = r36;
                                                                    } catch (Exception e10) {
                                                                        e = e10;
                                                                        IsSuccessful = r19;
                                                                        Code = r23;
                                                                        r35 = r36;
                                                                        r5 = r35;
                                                                        String id17 = mediaItem.getId();
                                                                        String type16 = mediaItem.getType();
                                                                        String message8 = e.getMessage();
                                                                        Object Z8 = kb0.z("event=scrobble result=exception itemId=", id17, " type=", type16, " action=");
                                                                        Z8.append(ya2Var);
                                                                        Z8.append(str);
                                                                        Z8.append(r5);
                                                                        Z8.append(Code);
                                                                        Z8.append(message8);
                                                                        Log.e(IsSuccessful, Z8.toString(), e);
                                                                        Result.Companion companion18 = Result.INSTANCE;
                                                                        objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                                    }
                                                                } catch (Exception e11) {
                                                                    e = e11;
                                                                    r4 = r3;
                                                                    r16 = r19;
                                                                    r24 = r23;
                                                                    IsSuccessful = r16;
                                                                    r5 = r4;
                                                                    r22 = r24;
                                                                    Code = r22;
                                                                    String id18 = mediaItem.getId();
                                                                    String type17 = mediaItem.getType();
                                                                    String message9 = e.getMessage();
                                                                    Object Z9 = kb0.z("event=scrobble result=exception itemId=", id18, " type=", type17, " action=");
                                                                    Z9.append(ya2Var);
                                                                    Z9.append(str);
                                                                    Z9.append(r5);
                                                                    Z9.append(Code);
                                                                    Z9.append(message9);
                                                                    Log.e(IsSuccessful, Z9.toString(), e);
                                                                    Result.Companion companion19 = Result.INSTANCE;
                                                                    objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                                }
                                                            } else {
                                                                Code = r23;
                                                                try {
                                                                    if (r17.code() >= 500) {
                                                                        try {
                                                                            String id19 = mediaItem.getId();
                                                                            type = mediaItem.getType();
                                                                            strA4 = za2Var2.a();
                                                                            if (strA4 == null) {
                                                                                strA4 = "none";
                                                                            }
                                                                            try {
                                                                                int iCode10 = r17.code();
                                                                                String strK13 = xa2.k(xa2Var, r17.message());
                                                                                try {
                                                                                    String strD10 = xa2.d(xa2Var, traktScrobbleRequest4.getProgress());
                                                                                    String strK14 = xa2.K(r17);
                                                                                    Code2 = "event=scrobble result=server_error itemId=";
                                                                                    Object sb10 = new StringBuilder((String) Code2);
                                                                                    sb10.append(id19);
                                                                                    sb10.append(" type=");
                                                                                    sb10.append(type);
                                                                                    sb10.append(" action=");
                                                                                    sb10.append(ya2Var);
                                                                                    sb10.append(str8);
                                                                                    sb10.append(strA4);
                                                                                    sb10.append(str9);
                                                                                    sb10.append(iCode10);
                                                                                    sb10.append(Code);
                                                                                    sb10.append(strK13);
                                                                                    sb10.append(" progress=");
                                                                                    sb10.append(strD10);
                                                                                    sb10.append(str);
                                                                                    r5 = r3;
                                                                                    try {
                                                                                        sb10.append(r5);
                                                                                        sb10.append(" error=");
                                                                                        sb10.append(strK14);
                                                                                        r6 = IsSuccessful;
                                                                                        try {
                                                                                            Log.w((String) r6, sb10.toString());
                                                                                            Result.Companion companion20 = Result.INSTANCE;
                                                                                            objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                                                            IsSuccessful = r6;
                                                                                        } catch (Exception e12) {
                                                                                            e = e12;
                                                                                            IsSuccessful = r6;
                                                                                            String id110 = mediaItem.getId();
                                                                                            String type18 = mediaItem.getType();
                                                                                            String message10 = e.getMessage();
                                                                                            Object Z10 = kb0.z("event=scrobble result=exception itemId=", id110, " type=", type18, " action=");
                                                                                            Z10.append(ya2Var);
                                                                                            Z10.append(str);
                                                                                            Z10.append(r5);
                                                                                            Z10.append(Code);
                                                                                            Z10.append(message10);
                                                                                            Log.e(IsSuccessful, Z10.toString(), e);
                                                                                            Result.Companion companion110 = Result.INSTANCE;
                                                                                            objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                                                        }
                                                                                    } catch (Exception e13) {
                                                                                        e = e13;
                                                                                        r6 = IsSuccessful;
                                                                                        IsSuccessful = r6;
                                                                                        String id111 = mediaItem.getId();
                                                                                        String type19 = mediaItem.getType();
                                                                                        String message11 = e.getMessage();
                                                                                        Object Z11 = kb0.z("event=scrobble result=exception itemId=", id111, " type=", type19, " action=");
                                                                                        Z11.append(ya2Var);
                                                                                        Z11.append(str);
                                                                                        Z11.append(r5);
                                                                                        Z11.append(Code);
                                                                                        Z11.append(message11);
                                                                                        Log.e(IsSuccessful, Z11.toString(), e);
                                                                                        Result.Companion companion111 = Result.INSTANCE;
                                                                                        objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                                                        return Result.m8824boximpl(objM8825constructorimpl);
                                                                                    }
                                                                                } catch (Exception e14) {
                                                                                    e = e14;
                                                                                    r6 = IsSuccessful;
                                                                                    r5 = r3;
                                                                                }
                                                                            } catch (Exception e15) {
                                                                                e = e15;
                                                                                r5 = r3;
                                                                            }
                                                                        } catch (Exception e16) {
                                                                            e = e16;
                                                                            r5 = r3;
                                                                        }
                                                                    } else {
                                                                        try {
                                                                            String id20 = mediaItem.getId();
                                                                            type = mediaItem.getType();
                                                                            strA5 = za2Var2.a();
                                                                            if (strA5 == null) {
                                                                                strA5 = "none";
                                                                            }
                                                                            r18 = IsSuccessful;
                                                                            try {
                                                                                int iCode11 = r17.code();
                                                                                String strK15 = xa2.k(xa2Var, r17.message());
                                                                                Object r312 = r3;
                                                                                String strD11 = xa2.d(xa2Var, traktScrobbleRequest4.getProgress());
                                                                                String strK16 = xa2.K(r17);
                                                                                String str16 = "event=scrobble result=http_error itemId=";
                                                                                Object sb11 = new StringBuilder(str16);
                                                                                sb11.append(id20);
                                                                                sb11.append(" type=");
                                                                                sb11.append(type);
                                                                                sb11.append(" action=");
                                                                                sb11.append(ya2Var);
                                                                                sb11.append(str8);
                                                                                sb11.append(strA5);
                                                                                sb11.append(str9);
                                                                                sb11.append(iCode11);
                                                                                sb11.append(Code);
                                                                                sb11.append(strK15);
                                                                                sb11.append(" progress=");
                                                                                sb11.append(strD11);
                                                                                sb11.append(str);
                                                                                Object r20 = r312;
                                                                                sb11.append(r20);
                                                                                sb11.append(" error=");
                                                                                sb11.append(strK16);
                                                                                Object r110 = r18;
                                                                                Log.w((String) r110, sb11.toString());
                                                                                Result.Companion companion21 = Result.INSTANCE;
                                                                                objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                                                IsSuccessful = r110;
                                                                                Code = Code;
                                                                                r5 = r20;
                                                                                Code2 = str16;
                                                                                r18 = r18;
                                                                                r34 = r312;
                                                                            } catch (Exception e17) {
                                                                                e = e17;
                                                                                r5 = r3;
                                                                                IsSuccessful = r18;
                                                                                String id112 = mediaItem.getId();
                                                                                String type110 = mediaItem.getType();
                                                                                String message12 = e.getMessage();
                                                                                Object Z12 = kb0.z("event=scrobble result=exception itemId=", id112, " type=", type110, " action=");
                                                                                Z12.append(ya2Var);
                                                                                Z12.append(str);
                                                                                Z12.append(r5);
                                                                                Z12.append(Code);
                                                                                Z12.append(message12);
                                                                                Log.e(IsSuccessful, Z12.toString(), e);
                                                                                Result.Companion companion112 = Result.INSTANCE;
                                                                                objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                                            }
                                                                        } catch (Exception e18) {
                                                                            e = e18;
                                                                            IsSuccessful = IsSuccessful;
                                                                            r5 = r3;
                                                                            String id113 = mediaItem.getId();
                                                                            String type111 = mediaItem.getType();
                                                                            String message13 = e.getMessage();
                                                                            Object Z13 = kb0.z("event=scrobble result=exception itemId=", id113, " type=", type111, " action=");
                                                                            Z13.append(ya2Var);
                                                                            Z13.append(str);
                                                                            Z13.append(r5);
                                                                            Z13.append(Code);
                                                                            Z13.append(message13);
                                                                            Log.e(IsSuccessful, Z13.toString(), e);
                                                                            Result.Companion companion113 = Result.INSTANCE;
                                                                            objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                                        }
                                                                    }
                                                                } catch (Exception e19) {
                                                                    e = e19;
                                                                }
                                                                r5 = r3;
                                                                String id114 = mediaItem.getId();
                                                                String type112 = mediaItem.getType();
                                                                String message14 = e.getMessage();
                                                                Object Z14 = kb0.z("event=scrobble result=exception itemId=", id114, " type=", type112, " action=");
                                                                Z14.append(ya2Var);
                                                                Z14.append(str);
                                                                Z14.append(r5);
                                                                Z14.append(Code);
                                                                Z14.append(message14);
                                                                Log.e(IsSuccessful, Z14.toString(), e);
                                                                Result.Companion companion114 = Result.INSTANCE;
                                                                objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                            }
                                                        } catch (Exception e20) {
                                                            e = e20;
                                                            IsSuccessful = r18;
                                                            Code = Code;
                                                            r35 = r34;
                                                        }
                                                    } catch (Exception e21) {
                                                        e = e21;
                                                    }
                                                }
                                            } catch (Exception e22) {
                                                e = e22;
                                            }
                                            return Result.m8824boximpl(objM8825constructorimpl);
                                        }
                                        try {
                                            String id21 = mediaItem.getId();
                                            String type20 = mediaItem.getType();
                                            strA2 = za2Var2.a();
                                            if (strA2 == null) {
                                                strA2 = "none";
                                            }
                                            int iCode12 = Code.code();
                                            TraktScrobbleRequest traktScrobbleRequest7 = traktScrobbleRequest;
                                            String strK17 = xa2.k(xa2Var, Code.message());
                                            String strD12 = xa2.d(xa2Var, traktScrobbleRequest7.getProgress());
                                            String strK18 = xa2.K(Code);
                                            r17 = Code;
                                            Object sb12 = new StringBuilder("event=scrobble result=conflict itemId=");
                                            sb12.append(id21);
                                            sb12.append(" type=");
                                            sb12.append(type20);
                                            sb12.append(" action=");
                                            sb12.append(ya2Var);
                                            sb12.append(str8);
                                            sb12.append(strA2);
                                            sb12.append(str9);
                                            sb12.append(iCode12);
                                            IsSuccessful = obj6;
                                            try {
                                                sb12.append(IsSuccessful);
                                                sb12.append(strK17);
                                                sb12.append(" progress=");
                                                sb12.append(strD12);
                                                sb12.append(str);
                                                Object r111 = r34;
                                                sb12.append(r111);
                                                sb12.append(" error=");
                                                sb12.append(strK18);
                                                Log.w("TraktSync", sb12.toString());
                                                Result.Companion companion22 = Result.INSTANCE;
                                                objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                                r5 = r111;
                                                Code = IsSuccessful;
                                                IsSuccessful = "TraktSync";
                                            } catch (Exception e23) {
                                                e = e23;
                                                Code = r34;
                                                r5 = Code;
                                                Code = IsSuccessful;
                                                IsSuccessful = type;
                                                String id115 = mediaItem.getId();
                                                String type113 = mediaItem.getType();
                                                String message15 = e.getMessage();
                                                Object Z15 = kb0.z("event=scrobble result=exception itemId=", id115, " type=", type113, " action=");
                                                Z15.append(ya2Var);
                                                Z15.append(str);
                                                Z15.append(r5);
                                                Z15.append(Code);
                                                Z15.append(message15);
                                                Log.e(IsSuccessful, Z15.toString(), e);
                                                Result.Companion companion115 = Result.INSTANCE;
                                                objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                            }
                                        } catch (Exception e24) {
                                            e = e24;
                                            Code = r34;
                                            IsSuccessful = obj6;
                                        }
                                    } catch (Exception e25) {
                                        e = e25;
                                    }
                                }
                                xa2.v(r17);
                                return Result.m8824boximpl(objM8825constructorimpl);
                            }
                            if (i2 == 4) {
                                long j3 = this.g;
                                Response response3 = (Response) this.e;
                                String str17 = (String) this.d;
                                TraktScrobbleRequest traktScrobbleRequest8 = this.c;
                                za2 za2Var5 = this.b;
                                i92 i92Var8 = (i92) this.a;
                                ResultKt.throwOnFailure(obj);
                                i92Var2 = i92Var8;
                                xa2Var = xa2Var2;
                                za2Var2 = za2Var5;
                                str = " positionMs=";
                                obj5 = coroutine_suspended;
                                r33 = r5;
                                response2 = response3;
                                str10 = str17;
                                j2 = j3;
                                obj4 = obj10;
                                z4 = true;
                                str8 = " idSource=";
                                mediaItem = mediaItem2;
                                traktScrobbleRequest3 = traktScrobbleRequest8;
                                str9 = str11;
                                try {
                                    i92Var2.getClass();
                                    this.a = null;
                                    this.b = za2Var2;
                                    this.c = traktScrobbleRequest3;
                                    this.d = null;
                                    this.e = null;
                                    this.g = j2;
                                    this.h = 5;
                                    objL2 = xa2.l(xa2Var, str10, ya2Var, traktScrobbleRequest3, this);
                                    obj9 = objL2;
                                    z5 = z4;
                                    r37 = r33;
                                    obj8 = obj4;
                                    if (objL2 == obj5) {
                                        return obj5;
                                    }
                                } catch (Exception e26) {
                                    e = e26;
                                    IsSuccessful = "TraktSync";
                                    r5 = r33;
                                    Code = obj4;
                                }
                            } else {
                                if (i2 != 5) {
                                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                TraktScrobbleRequest traktScrobbleRequest9 = this.c;
                                za2 za2Var6 = this.b;
                                ResultKt.throwOnFailure(obj);
                                za2Var2 = za2Var6;
                                str = " positionMs=";
                                r37 = r5;
                                mediaItem = mediaItem2;
                                obj8 = obj10;
                                str9 = str11;
                                z5 = true;
                                obj9 = obj;
                                str8 = " idSource=";
                                traktScrobbleRequest3 = traktScrobbleRequest9;
                                xa2Var = xa2Var2;
                            }
                        }
                        if (IsSuccessful != 0) {
                            Result.Companion companion116 = Result.INSTANCE;
                            objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(r23));
                            r17 = Code;
                            IsSuccessful = "TraktSync";
                            r5 = r34;
                            Code = obj6;
                        } else {
                            IsSuccessful = Code.code();
                            if (IsSuccessful == 409) {
                                r17 = Code;
                                traktScrobbleRequest4 = traktScrobbleRequest;
                                r3 = r34;
                                IsSuccessful = obj6;
                                Code2 = r17.code();
                                if (Code2 == 429) {
                                    String id116 = mediaItem.getId();
                                    String type114 = mediaItem.getType();
                                    strA3 = za2Var2.a();
                                    if (strA3 == null) {
                                        strA3 = "none";
                                    }
                                    r23 = IsSuccessful;
                                    int iCode13 = r17.code();
                                    obj7 = "TraktSync";
                                    lJ2 = xa2.j(xa2Var, r17);
                                    if (lJ2 != null) {
                                        jLongValue2 = lJ2.longValue();
                                    } else {
                                        jLongValue2 = -1;
                                    }
                                    String strD13 = xa2.d(xa2Var, traktScrobbleRequest4.getProgress());
                                    String strK19 = xa2.K(r17);
                                    r17 = r17;
                                    type = "event=scrobble result=rate_limited itemId=";
                                    Object sb13 = new StringBuilder(type);
                                    sb13.append(id116);
                                    sb13.append(" type=");
                                    sb13.append(type114);
                                    sb13.append(" action=");
                                    sb13.append(ya2Var);
                                    sb13.append(str8);
                                    sb13.append(strA3);
                                    sb13.append(str9);
                                    sb13.append(iCode13);
                                    sb13.append(" retryAfterMs=");
                                    sb13.append(jLongValue2);
                                    sb13.append(" progress=");
                                    sb13.append(strD13);
                                    sb13.append(str);
                                    Code2 = r3;
                                    sb13.append(Code2);
                                    sb13.append(" error=");
                                    sb13.append(strK19);
                                    IsSuccessful = obj7;
                                    Log.w((String) IsSuccessful, sb13.toString());
                                    Result.Companion companion117 = Result.INSTANCE;
                                    objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                    r5 = Code2;
                                    Code = r23;
                                } else {
                                    r23 = IsSuccessful;
                                    IsSuccessful = "TraktSync";
                                    Code = r17.code();
                                    r5 = 422;
                                    if (Code == 422) {
                                        String id117 = mediaItem.getId();
                                        String type115 = mediaItem.getType();
                                        type = za2Var2.a();
                                        if (type == null) {
                                            type = "none";
                                        }
                                        int iCode14 = r17.code();
                                        r19 = IsSuccessful;
                                        String strK110 = xa2.k(xa2Var, r17.message());
                                        r36 = r3;
                                        String strD14 = xa2.d(xa2Var, traktScrobbleRequest4.getProgress());
                                        String strK111 = xa2.K(r17);
                                        String str18 = "event=scrobble result=validation_error itemId=";
                                        Object sb14 = new StringBuilder(str18);
                                        sb14.append(id117);
                                        sb14.append(" type=");
                                        sb14.append(type115);
                                        sb14.append(" action=");
                                        sb14.append(ya2Var);
                                        sb14.append(str8);
                                        sb14.append(type);
                                        sb14.append(str9);
                                        sb14.append(iCode14);
                                        Object r112 = r23;
                                        sb14.append(r112);
                                        sb14.append(strK110);
                                        sb14.append(" progress=");
                                        sb14.append(strD14);
                                        sb14.append(str);
                                        Object r113 = r36;
                                        sb14.append(r113);
                                        sb14.append(" error=");
                                        sb14.append(strK111);
                                        Object r114 = r19;
                                        Log.w((String) r114, sb14.toString());
                                        Result.Companion companion118 = Result.INSTANCE;
                                        objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                        IsSuccessful = r114;
                                        Code = r112;
                                        r5 = r113;
                                        Code2 = str18;
                                        r18 = r19;
                                        r34 = r36;
                                    } else {
                                        Code = r23;
                                        if (r17.code() >= 500) {
                                            String id118 = mediaItem.getId();
                                            type = mediaItem.getType();
                                            strA4 = za2Var2.a();
                                            if (strA4 == null) {
                                                strA4 = "none";
                                            }
                                            int iCode15 = r17.code();
                                            String strK112 = xa2.k(xa2Var, r17.message());
                                            String strD15 = xa2.d(xa2Var, traktScrobbleRequest4.getProgress());
                                            String strK113 = xa2.K(r17);
                                            Code2 = "event=scrobble result=server_error itemId=";
                                            Object sb15 = new StringBuilder((String) Code2);
                                            sb15.append(id118);
                                            sb15.append(" type=");
                                            sb15.append(type);
                                            sb15.append(" action=");
                                            sb15.append(ya2Var);
                                            sb15.append(str8);
                                            sb15.append(strA4);
                                            sb15.append(str9);
                                            sb15.append(iCode15);
                                            sb15.append(Code);
                                            sb15.append(strK112);
                                            sb15.append(" progress=");
                                            sb15.append(strD15);
                                            sb15.append(str);
                                            r5 = r3;
                                            sb15.append(r5);
                                            sb15.append(" error=");
                                            sb15.append(strK113);
                                            r6 = IsSuccessful;
                                            Log.w((String) r6, sb15.toString());
                                            Result.Companion companion23 = Result.INSTANCE;
                                            objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                            IsSuccessful = r6;
                                        } else {
                                            String id22 = mediaItem.getId();
                                            type = mediaItem.getType();
                                            strA5 = za2Var2.a();
                                            if (strA5 == null) {
                                                strA5 = "none";
                                            }
                                            r18 = IsSuccessful;
                                            int iCode16 = r17.code();
                                            String strK114 = xa2.k(xa2Var, r17.message());
                                            Object r313 = r3;
                                            String strD16 = xa2.d(xa2Var, traktScrobbleRequest4.getProgress());
                                            String strK115 = xa2.K(r17);
                                            String str19 = "event=scrobble result=http_error itemId=";
                                            Object sb16 = new StringBuilder(str19);
                                            sb16.append(id22);
                                            sb16.append(" type=");
                                            sb16.append(type);
                                            sb16.append(" action=");
                                            sb16.append(ya2Var);
                                            sb16.append(str8);
                                            sb16.append(strA5);
                                            sb16.append(str9);
                                            sb16.append(iCode16);
                                            sb16.append(Code);
                                            sb16.append(strK114);
                                            sb16.append(" progress=");
                                            sb16.append(strD16);
                                            sb16.append(str);
                                            Object r21 = r313;
                                            sb16.append(r21);
                                            sb16.append(" error=");
                                            sb16.append(strK115);
                                            Object r115 = r18;
                                            Log.w((String) r115, sb16.toString());
                                            Result.Companion companion24 = Result.INSTANCE;
                                            objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                            IsSuccessful = r115;
                                            Code = Code;
                                            r5 = r21;
                                            Code2 = str19;
                                            r18 = r18;
                                            r34 = r313;
                                        }
                                        r5 = r3;
                                        String id119 = mediaItem.getId();
                                        String type116 = mediaItem.getType();
                                        String message16 = e.getMessage();
                                        Object Z16 = kb0.z("event=scrobble result=exception itemId=", id119, " type=", type116, " action=");
                                        Z16.append(ya2Var);
                                        Z16.append(str);
                                        Z16.append(r5);
                                        Z16.append(Code);
                                        Z16.append(message16);
                                        Log.e(IsSuccessful, Z16.toString(), e);
                                        Result.Companion companion119 = Result.INSTANCE;
                                        objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                    }
                                }
                                return Result.m8824boximpl(objM8825constructorimpl);
                            }
                            String id23 = mediaItem.getId();
                            String type21 = mediaItem.getType();
                            strA2 = za2Var2.a();
                            if (strA2 == null) {
                                strA2 = "none";
                            }
                            int iCode17 = Code.code();
                            TraktScrobbleRequest traktScrobbleRequest10 = traktScrobbleRequest;
                            String strK116 = xa2.k(xa2Var, Code.message());
                            String strD17 = xa2.d(xa2Var, traktScrobbleRequest10.getProgress());
                            String strK117 = xa2.K(Code);
                            r17 = Code;
                            Object sb17 = new StringBuilder("event=scrobble result=conflict itemId=");
                            sb17.append(id23);
                            sb17.append(" type=");
                            sb17.append(type21);
                            sb17.append(" action=");
                            sb17.append(ya2Var);
                            sb17.append(str8);
                            sb17.append(strA2);
                            sb17.append(str9);
                            sb17.append(iCode17);
                            IsSuccessful = obj6;
                            sb17.append(IsSuccessful);
                            sb17.append(strK116);
                            sb17.append(" progress=");
                            sb17.append(strD17);
                            sb17.append(str);
                            Object r116 = r34;
                            sb17.append(r116);
                            sb17.append(" error=");
                            sb17.append(strK117);
                            Log.w("TraktSync", sb17.toString());
                            Result.Companion companion25 = Result.INSTANCE;
                            objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                            r5 = r116;
                            Code = IsSuccessful;
                            IsSuccessful = "TraktSync";
                        }
                        xa2.v(r17);
                    } catch (Exception e27) {
                        e = e27;
                    }
                    traktScrobbleRequest = traktScrobbleRequest3;
                    Code = (Response) obj9;
                    r5 = obj9;
                    r23 = z5;
                    r34 = r37;
                    obj6 = obj8;
                    IsSuccessful = Code.isSuccessful();
                    return Result.m8824boximpl(objM8825constructorimpl);
                }
                ResultKt.throwOnFailure(obj);
                i92 i92VarA = xa2Var2.b.a();
                if (!i92VarA.b()) {
                    Result.Companion companion26 = Result.INSTANCE;
                    return Result.m8824boximpl(Result.m8825constructorimpl(Boxing.boxBoolean(false)));
                }
                MediaItem mediaItem3 = this.j;
                try {
                    long j4 = this.k;
                    Object r314 = r5;
                    try {
                        Long l = this.l;
                        ya2 ya2Var2 = this.m;
                        this.a = i92VarA;
                        this.h = 1;
                        mediaItem = mediaItem2;
                        i = 2;
                        Object obj11 = obj10;
                        str2 = " idSource=";
                        str3 = " positionMs=";
                        Object r315 = r314;
                        z = true;
                        xa2Var = xa2Var2;
                        try {
                            objA = xa2.a(xa2Var, mediaItem3, j4, l, ya2Var2, this);
                            if (objA != coroutine_suspended) {
                                i92Var = i92VarA;
                                obj2 = obj11;
                                r39 = r315;
                            }
                            return coroutine_suspended;
                        } catch (Exception e28) {
                            e = e28;
                            IsSuccessful = "TraktSync";
                            Code = obj11;
                            str = str3;
                            r5 = r315;
                        }
                    } catch (Exception e29) {
                        e = e29;
                        IsSuccessful = "TraktSync";
                        mediaItem = mediaItem2;
                        Code = obj10;
                        str = " positionMs=";
                        r35 = r314;
                        r5 = r35;
                        String id1110 = mediaItem.getId();
                        String type117 = mediaItem.getType();
                        String message17 = e.getMessage();
                        Object Z17 = kb0.z("event=scrobble result=exception itemId=", id1110, " type=", type117, " action=");
                        Z17.append(ya2Var);
                        Z17.append(str);
                        Z17.append(r5);
                        Z17.append(Code);
                        Z17.append(message17);
                        Log.e(IsSuccessful, Z17.toString(), e);
                        Result.Companion companion1110 = Result.INSTANCE;
                        objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                        return Result.m8824boximpl(objM8825constructorimpl);
                    }
                } catch (Exception e30) {
                    e = e30;
                    IsSuccessful = "TraktSync";
                    mediaItem = mediaItem2;
                    Code = obj10;
                    str = " positionMs=";
                }
                za2Var = (za2) objA;
                traktScrobbleRequestB = za2Var.b();
                if (traktScrobbleRequestB == null) {
                    Result.Companion companion27 = Result.INSTANCE;
                    return Result.m8824boximpl(Result.m8825constructorimpl(Boxing.boxBoolean(false)));
                }
                this.a = i92Var;
                this.b = za2Var;
                this.c = traktScrobbleRequestB;
                this.h = i;
                objA2 = xa2Var.A(i92Var, this);
                if (objA2 == coroutine_suspended) {
                    z2 = z;
                    obj3 = obj2;
                    r310 = r39;
                } else {
                    z2 = z;
                    obj3 = obj2;
                    r310 = r39;
                    str4 = (String) objA2;
                    if (str4 == null) {
                        Log.w("TraktSync", "event=scrobble result=skip reason=no_valid_token itemId=" + mediaItem.getId() + " type=" + mediaItem.getType() + " action=" + ya2Var);
                        Result.Companion companion28 = Result.INSTANCE;
                        return Result.m8824boximpl(Result.m8825constructorimpl(Boxing.boxBoolean(false)));
                    }
                    i92Var.getClass();
                    this.a = i92Var;
                    this.b = za2Var;
                    this.c = traktScrobbleRequestB;
                    this.d = str4;
                    this.h = 3;
                    objL = xa2.l(xa2Var, str4, ya2Var, traktScrobbleRequestB, this);
                    if (objL != coroutine_suspended) {
                        traktScrobbleRequest = traktScrobbleRequestB;
                        str5 = str4;
                        z3 = z2;
                        obj4 = obj3;
                        r311 = r310;
                        response = (Response) objL;
                        if (xa2.m(xa2Var, response, ya2Var)) {
                            lJ = xa2.j(xa2Var, response);
                            if (lJ != null) {
                                jLongValue = lJ.longValue();
                            } else {
                                jLongValue = 1000;
                            }
                            str6 = str5;
                            j = jLongValue;
                            String id24 = mediaItem.getId();
                            String type22 = mediaItem.getType();
                            strA = za2Var.a();
                            if (strA == null) {
                                str7 = "none";
                            } else {
                                str7 = strA;
                            }
                            traktScrobbleRequest2 = traktScrobbleRequest;
                            int iCode18 = response.code();
                            za2 za2Var7 = za2Var;
                            i92 i92Var9 = i92Var;
                            String strD18 = xa2.d(xa2Var, traktScrobbleRequest2.getProgress());
                            Object sb18 = new StringBuilder("event=scrobble result=retry itemId=");
                            sb18.append(id24);
                            sb18.append(" type=");
                            sb18.append(type22);
                            sb18.append(" action=");
                            sb18.append(ya2Var);
                            str8 = str2;
                            sb18.append(str8);
                            sb18.append(str7);
                            str9 = str11;
                            sb18.append(str9);
                            sb18.append(iCode18);
                            sb18.append(" retryDelayMs=");
                            sb18.append(j);
                            sb18.append(" progress=");
                            sb18.append(strD18);
                            str = str3;
                            sb18.append(str);
                            r12 = r311;
                            sb18.append(r12);
                            Log.w("TraktSync", sb18.toString());
                            xa2.v(response);
                            this.a = i92Var9;
                            za2Var2 = za2Var7;
                            this.b = za2Var2;
                            i92Var2 = i92Var9;
                            this.c = traktScrobbleRequest2;
                            this.d = str6;
                            this.e = null;
                            this.g = j;
                            this.h = 4;
                            objDelay = DelayKt.delay(j, this);
                            obj5 = coroutine_suspended;
                            if (objDelay == obj5) {
                                return obj5;
                            }
                            response2 = response;
                            r33 = r12;
                            str10 = str6;
                            traktScrobbleRequest3 = traktScrobbleRequest2;
                            j2 = j;
                            z4 = z3;
                            obj4 = obj4;
                            i92Var2.getClass();
                            this.a = null;
                            this.b = za2Var2;
                            this.c = traktScrobbleRequest3;
                            this.d = null;
                            this.e = null;
                            this.g = j2;
                            this.h = 5;
                            objL2 = xa2.l(xa2Var, str10, ya2Var, traktScrobbleRequest3, this);
                            obj9 = objL2;
                            z5 = z4;
                            r37 = r33;
                            obj8 = obj4;
                            if (objL2 == obj5) {
                                return obj5;
                            }
                            traktScrobbleRequest = traktScrobbleRequest3;
                            Code = (Response) obj9;
                            r5 = obj9;
                            r23 = z5;
                            r34 = r37;
                            obj6 = obj8;
                        } else {
                            za2Var2 = za2Var;
                            str9 = str11;
                            str8 = str2;
                            str = str3;
                            r34 = r311;
                            Code = response;
                            r5 = str5;
                            r23 = z3;
                            obj6 = obj4;
                        }
                        IsSuccessful = Code.isSuccessful();
                        if (IsSuccessful != 0) {
                            Result.Companion companion1111 = Result.INSTANCE;
                            objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(r23));
                            r17 = Code;
                            IsSuccessful = "TraktSync";
                            r5 = r34;
                            Code = obj6;
                        } else {
                            IsSuccessful = Code.code();
                            if (IsSuccessful == 409) {
                                r17 = Code;
                                traktScrobbleRequest4 = traktScrobbleRequest;
                                r3 = r34;
                                IsSuccessful = obj6;
                                Code2 = r17.code();
                                if (Code2 == 429) {
                                    String id1111 = mediaItem.getId();
                                    String type118 = mediaItem.getType();
                                    strA3 = za2Var2.a();
                                    if (strA3 == null) {
                                        strA3 = "none";
                                    }
                                    r23 = IsSuccessful;
                                    int iCode19 = r17.code();
                                    obj7 = "TraktSync";
                                    lJ2 = xa2.j(xa2Var, r17);
                                    if (lJ2 != null) {
                                        jLongValue2 = lJ2.longValue();
                                    } else {
                                        jLongValue2 = -1;
                                    }
                                    String strD19 = xa2.d(xa2Var, traktScrobbleRequest4.getProgress());
                                    String strK118 = xa2.K(r17);
                                    r17 = r17;
                                    type = "event=scrobble result=rate_limited itemId=";
                                    Object sb19 = new StringBuilder(type);
                                    sb19.append(id1111);
                                    sb19.append(" type=");
                                    sb19.append(type118);
                                    sb19.append(" action=");
                                    sb19.append(ya2Var);
                                    sb19.append(str8);
                                    sb19.append(strA3);
                                    sb19.append(str9);
                                    sb19.append(iCode19);
                                    sb19.append(" retryAfterMs=");
                                    sb19.append(jLongValue2);
                                    sb19.append(" progress=");
                                    sb19.append(strD19);
                                    sb19.append(str);
                                    Code2 = r3;
                                    sb19.append(Code2);
                                    sb19.append(" error=");
                                    sb19.append(strK118);
                                    IsSuccessful = obj7;
                                    Log.w((String) IsSuccessful, sb19.toString());
                                    Result.Companion companion1112 = Result.INSTANCE;
                                    objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                    r5 = Code2;
                                    Code = r23;
                                } else {
                                    r23 = IsSuccessful;
                                    IsSuccessful = "TraktSync";
                                    Code = r17.code();
                                    r5 = 422;
                                    if (Code == 422) {
                                        String id1112 = mediaItem.getId();
                                        String type119 = mediaItem.getType();
                                        type = za2Var2.a();
                                        if (type == null) {
                                            type = "none";
                                        }
                                        int iCode110 = r17.code();
                                        r19 = IsSuccessful;
                                        String strK119 = xa2.k(xa2Var, r17.message());
                                        r36 = r3;
                                        String strD110 = xa2.d(xa2Var, traktScrobbleRequest4.getProgress());
                                        String strK1110 = xa2.K(r17);
                                        String str110 = "event=scrobble result=validation_error itemId=";
                                        Object sb110 = new StringBuilder(str110);
                                        sb110.append(id1112);
                                        sb110.append(" type=");
                                        sb110.append(type119);
                                        sb110.append(" action=");
                                        sb110.append(ya2Var);
                                        sb110.append(str8);
                                        sb110.append(type);
                                        sb110.append(str9);
                                        sb110.append(iCode110);
                                        Object r117 = r23;
                                        sb110.append(r117);
                                        sb110.append(strK119);
                                        sb110.append(" progress=");
                                        sb110.append(strD110);
                                        sb110.append(str);
                                        Object r118 = r36;
                                        sb110.append(r118);
                                        sb110.append(" error=");
                                        sb110.append(strK1110);
                                        Object r119 = r19;
                                        Log.w((String) r119, sb110.toString());
                                        Result.Companion companion1113 = Result.INSTANCE;
                                        objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                        IsSuccessful = r119;
                                        Code = r117;
                                        r5 = r118;
                                        Code2 = str110;
                                        r18 = r19;
                                        r34 = r36;
                                    } else {
                                        Code = r23;
                                        if (r17.code() >= 500) {
                                            String id1113 = mediaItem.getId();
                                            type = mediaItem.getType();
                                            strA4 = za2Var2.a();
                                            if (strA4 == null) {
                                                strA4 = "none";
                                            }
                                            int iCode111 = r17.code();
                                            String strK1111 = xa2.k(xa2Var, r17.message());
                                            String strD111 = xa2.d(xa2Var, traktScrobbleRequest4.getProgress());
                                            String strK1112 = xa2.K(r17);
                                            Code2 = "event=scrobble result=server_error itemId=";
                                            Object sb111 = new StringBuilder((String) Code2);
                                            sb111.append(id1113);
                                            sb111.append(" type=");
                                            sb111.append(type);
                                            sb111.append(" action=");
                                            sb111.append(ya2Var);
                                            sb111.append(str8);
                                            sb111.append(strA4);
                                            sb111.append(str9);
                                            sb111.append(iCode111);
                                            sb111.append(Code);
                                            sb111.append(strK1111);
                                            sb111.append(" progress=");
                                            sb111.append(strD111);
                                            sb111.append(str);
                                            r5 = r3;
                                            sb111.append(r5);
                                            sb111.append(" error=");
                                            sb111.append(strK1112);
                                            r6 = IsSuccessful;
                                            Log.w((String) r6, sb111.toString());
                                            Result.Companion companion29 = Result.INSTANCE;
                                            objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                            IsSuccessful = r6;
                                        } else {
                                            String id25 = mediaItem.getId();
                                            type = mediaItem.getType();
                                            strA5 = za2Var2.a();
                                            if (strA5 == null) {
                                                strA5 = "none";
                                            }
                                            r18 = IsSuccessful;
                                            int iCode112 = r17.code();
                                            String strK1113 = xa2.k(xa2Var, r17.message());
                                            Object r316 = r3;
                                            String strD112 = xa2.d(xa2Var, traktScrobbleRequest4.getProgress());
                                            String strK1114 = xa2.K(r17);
                                            String str111 = "event=scrobble result=http_error itemId=";
                                            Object sb112 = new StringBuilder(str111);
                                            sb112.append(id25);
                                            sb112.append(" type=");
                                            sb112.append(type);
                                            sb112.append(" action=");
                                            sb112.append(ya2Var);
                                            sb112.append(str8);
                                            sb112.append(strA5);
                                            sb112.append(str9);
                                            sb112.append(iCode112);
                                            sb112.append(Code);
                                            sb112.append(strK1113);
                                            sb112.append(" progress=");
                                            sb112.append(strD112);
                                            sb112.append(str);
                                            Object r25 = r316;
                                            sb112.append(r25);
                                            sb112.append(" error=");
                                            sb112.append(strK1114);
                                            Object r1110 = r18;
                                            Log.w((String) r1110, sb112.toString());
                                            Result.Companion companion210 = Result.INSTANCE;
                                            objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                            IsSuccessful = r1110;
                                            Code = Code;
                                            r5 = r25;
                                            Code2 = str111;
                                            r18 = r18;
                                            r34 = r316;
                                        }
                                        r5 = r3;
                                        String id1114 = mediaItem.getId();
                                        String type1110 = mediaItem.getType();
                                        String message18 = e.getMessage();
                                        Object Z18 = kb0.z("event=scrobble result=exception itemId=", id1114, " type=", type1110, " action=");
                                        Z18.append(ya2Var);
                                        Z18.append(str);
                                        Z18.append(r5);
                                        Z18.append(Code);
                                        Z18.append(message18);
                                        Log.e(IsSuccessful, Z18.toString(), e);
                                        Result.Companion companion1114 = Result.INSTANCE;
                                        objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                                    }
                                }
                                return Result.m8824boximpl(objM8825constructorimpl);
                            }
                            String id26 = mediaItem.getId();
                            String type23 = mediaItem.getType();
                            strA2 = za2Var2.a();
                            if (strA2 == null) {
                                strA2 = "none";
                            }
                            int iCode113 = Code.code();
                            TraktScrobbleRequest traktScrobbleRequest11 = traktScrobbleRequest;
                            String strK1115 = xa2.k(xa2Var, Code.message());
                            String strD113 = xa2.d(xa2Var, traktScrobbleRequest11.getProgress());
                            String strK1116 = xa2.K(Code);
                            r17 = Code;
                            Object sb113 = new StringBuilder("event=scrobble result=conflict itemId=");
                            sb113.append(id26);
                            sb113.append(" type=");
                            sb113.append(type23);
                            sb113.append(" action=");
                            sb113.append(ya2Var);
                            sb113.append(str8);
                            sb113.append(strA2);
                            sb113.append(str9);
                            sb113.append(iCode113);
                            IsSuccessful = obj6;
                            sb113.append(IsSuccessful);
                            sb113.append(strK1115);
                            sb113.append(" progress=");
                            sb113.append(strD113);
                            sb113.append(str);
                            Object r1111 = r34;
                            sb113.append(r1111);
                            sb113.append(" error=");
                            sb113.append(strK1116);
                            Log.w("TraktSync", sb113.toString());
                            Result.Companion companion211 = Result.INSTANCE;
                            objM8825constructorimpl = Result.m8825constructorimpl(Boxing.boxBoolean(false));
                            r5 = r1111;
                            Code = IsSuccessful;
                            IsSuccessful = "TraktSync";
                        }
                        xa2.v(r17);
                        return Result.m8824boximpl(objM8825constructorimpl);
                    }
                }
                return coroutine_suspended;
            } catch (Exception e31) {
                e = e31;
                str = " positionMs=";
                IsSuccessful = "TraktSync";
                mediaItem = mediaItem2;
                r5 = r5;
                r22 = obj10;
            }
        } catch (CancellationException e32) {
            throw e32;
        }
    }
}
