package defpackage;

import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.model.EpisodeLocator;
import com.dh.myembyapp.data.model.ProviderIds;
import com.dh.myembyapp.data.model.ServerConfig;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class eb1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ hb1 A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Integer D;
    public final /* synthetic */ EpisodeLocator E;
    public String a;
    public Object b;
    public EmbyApiService c;
    public String d;
    public Object e;
    public Iterator g;
    public String h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public String m;
    public EpisodeLocator n;
    public hb1 o;
    public Object p;
    public Collection q;
    public Iterator r;
    public Object s;
    public Object t;
    public int u;
    public int v;
    public int w;
    public int x;
    public final /* synthetic */ ServerConfig y;
    public final /* synthetic */ ProviderIds z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb1(ServerConfig serverConfig, ProviderIds providerIds, hb1 hb1Var, String str, String str2, Integer num, EpisodeLocator episodeLocator, Continuation continuation) {
        super(2, continuation);
        this.y = serverConfig;
        this.z = providerIds;
        this.A = hb1Var;
        this.B = str;
        this.C = str2;
        this.D = num;
        this.E = episodeLocator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new eb1(this.y, this.z, this.A, this.B, this.C, this.D, this.E, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((eb1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0426 A[Catch: Exception -> 0x043f, TryCatch #22 {Exception -> 0x043f, blocks: (B:104:0x0422, B:106:0x0426, B:111:0x044b), top: B:254:0x0422 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x044b A[Catch: Exception -> 0x043f, TRY_LEAVE, TryCatch #22 {Exception -> 0x043f, blocks: (B:104:0x0422, B:106:0x0426, B:111:0x044b), top: B:254:0x0422 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0484  */
    /* JADX WARN: Code duplicated, block: B:129:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:144:0x0563  */
    /* JADX WARN: Code duplicated, block: B:231:0x0301 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x028e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0311 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x033d  */
    /* JADX WARN: Code duplicated, block: B:90:0x037f A[Catch: Exception -> 0x0559, TRY_LEAVE, TryCatch #11 {Exception -> 0x0559, blocks: (B:88:0x0379, B:90:0x037f), top: B:233:0x0379 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.dh.myembyapp.data.model.EpisodeLocator, hb1, java.lang.Object, java.lang.String, java.util.Collection, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v10 */
    /* JADX WARN: Type inference failed for: r30v11 */
    /* JADX WARN: Type inference failed for: r30v12 */
    /* JADX WARN: Type inference failed for: r30v13 */
    /* JADX WARN: Type inference failed for: r30v14 */
    /* JADX WARN: Type inference failed for: r30v16 */
    /* JADX WARN: Type inference failed for: r30v17 */
    /* JADX WARN: Type inference failed for: r30v19 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v20 */
    /* JADX WARN: Type inference failed for: r30v21 */
    /* JADX WARN: Type inference failed for: r30v22 */
    /* JADX WARN: Type inference failed for: r30v23 */
    /* JADX WARN: Type inference failed for: r30v24 */
    /* JADX WARN: Type inference failed for: r30v25 */
    /* JADX WARN: Type inference failed for: r30v26 */
    /* JADX WARN: Type inference failed for: r30v27 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r30v6 */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r30v8 */
    /* JADX WARN: Type inference failed for: r30v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x04f0 -> B:263:0x04fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x05d3 -> B:162:0x05e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x033d -> B:61:0x0288). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x035a -> B:233:0x0379). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 1790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
