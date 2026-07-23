package defpackage;

import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.ProxyProtocol;
import com.dh.myembyapp.data.model.MediaSource;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a60 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a60(Http2Connection.ReaderRunnable readerRunnable, boolean z, Settings settings) {
        this.a = 2;
        this.c = readerRunnable;
        this.b = z;
        this.d = settings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        boolean z = true;
        Object obj = this.d;
        Object obj2 = this.c;
        boolean z2 = this.b;
        switch (i) {
            case 0:
                MutableIntState mutableIntState = (MutableIntState) obj;
                u90.n((MutableState) obj2, false);
                if (z2) {
                    mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                ((Function2) obj2).invoke((MediaSource) obj, Boolean.valueOf(z2));
                return Unit.INSTANCE;
            case 2:
                return Http2Connection.ReaderRunnable.settings$lambda$0((Http2Connection.ReaderRunnable) obj2, z2, (Settings) obj);
            case 3:
                return NavController.NavControllerNavigatorState.pop$lambda$0((NavController.NavControllerNavigatorState) obj2, (NavBackStackEntry) obj, z2);
            case 4:
                return NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$24$lambda$14$lambda$13(z2, (DrawerState) obj2, (CoroutineScope) obj);
            case 5:
                Function1 function1 = (Function1) obj2;
                se seVar = (se) obj;
                if (!z2) {
                    function1.invoke(seVar);
                }
                return Unit.INSTANCE;
            default:
                ProxyProtocol proxyProtocol = (ProxyProtocol) obj2;
                Function1 function2 = (Function1) obj;
                if (z2) {
                    ProxyProtocol[] proxyProtocolArrValues = ProxyProtocol.values();
                    function2.invoke(proxyProtocolArrValues[(ArraysKt.indexOf(proxyProtocolArrValues, proxyProtocol) + 1) % proxyProtocolArrValues.length]);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a60(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public /* synthetic */ a60(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
