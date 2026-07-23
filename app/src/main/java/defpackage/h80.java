package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class h80 extends SuspendLambda implements Function2 {
    public Object a;
    public LazyListState b;
    public int c;
    public int d;
    public int e;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ List j;
    public final /* synthetic */ MediaItem k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ LazyListState m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h80(List list, MediaItem mediaItem, MutableState mutableState, LazyListState lazyListState, Continuation continuation) {
        super(2, continuation);
        this.j = list;
        this.k = mediaItem;
        this.l = mutableState;
        this.m = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h80(this.j, this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h80) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:60:0x011a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0122 A[Catch: Exception -> 0x0125, TRY_LEAVE, TryCatch #2 {Exception -> 0x0125, blocks: (B:61:0x011c, B:63:0x0122), top: B:77:0x011c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x011a -> B:77:0x011c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
