package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class i52 {
    public final CoroutineScope a;
    public final Function0 b;
    public final Function2 c;
    public Job d;

    public i52(CoroutineScope coroutineScope, Function0 function0, Function2 function2) {
        coroutineScope.getClass();
        this.a = coroutineScope;
        this.b = function0;
        this.c = function2;
    }

    public final void a(String str) {
        str.getClass();
        Job job = this.d;
        Continuation continuation = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (!StringsKt.isBlank(str)) {
            this.d = BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new n2(this, StringsKt.trim((CharSequence) str).toString(), continuation, 11), 3, null);
        } else {
            this.c.invoke(CollectionsKt.emptyList(), Boolean.FALSE);
        }
    }
}
