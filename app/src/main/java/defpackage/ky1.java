package defpackage;

import com.dh.myembyapp.data.model.ServerConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
public final class ky1 {
    public final Object a(ServerConfig serverConfig, SuspendLambda suspendLambda) {
        return BuildersKt.withContext(Dispatchers.getIO(), new jy1(serverConfig, this, null), suspendLambda);
    }
}
