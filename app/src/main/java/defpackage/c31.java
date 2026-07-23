package defpackage;

import androidx.compose.runtime.State;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.dlna.DlnaConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class c31 extends SuspendLambda implements Function2 {
    public final /* synthetic */ nb0 a;
    public final /* synthetic */ NavHostController b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ State d;
    public final /* synthetic */ State e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c31(nb0 nb0Var, NavHostController navHostController, Function0 function0, State state, State state2, Continuation continuation) {
        super(2, continuation);
        this.a = nb0Var;
        this.b = navHostController;
        this.c = function0;
        this.d = state;
        this.e = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c31(this.a, this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c31) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        nb0 nb0Var = this.a;
        if (nb0Var != null) {
            Set set = e31.a;
            boolean z = ((DlnaConfig) this.d.getValue()).getUseProxyByDefault() && ((ProxyConfig) this.e.getValue()).getEnabled();
            String str = nb0Var.a;
            String str2 = nb0Var.b;
            String strEncode = URLEncoder.encode(str, "UTF-8");
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder sbZ = kb0.z("dlna_player?uri=", strEncode, "&title=", URLEncoder.encode(str2, "UTF-8"), "&useProxy=");
            sbZ.append(z);
            NavController.navigate$default((NavController) this.b, sbZ.toString(), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
            this.c.invoke();
        }
        return Unit.INSTANCE;
    }
}
