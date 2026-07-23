package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.server.OnlineSubtitleSearchInputServerManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class k2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(OnlineSubtitleSearchInputServerManager onlineSubtitleSearchInputServerManager, String str, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Context context, ne neVar, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableIntState mutableIntState, Continuation continuation) {
        super(2, continuation);
        this.m = onlineSubtitleSearchInputServerManager;
        this.n = str;
        this.b = coroutineScope;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.o = context;
        this.p = neVar;
        this.g = mutableState4;
        this.h = mutableState5;
        this.i = mutableState6;
        this.j = mutableState7;
        this.k = mutableState8;
        this.l = mutableState9;
        this.q = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        Object obj5 = this.n;
        switch (i) {
            case 0:
                k2 k2Var = new k2(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, (MutableState) obj5, (MutableState) obj4, (LazyListState) obj3, (FocusRequester) obj2, continuation);
                k2Var.m = obj;
                return k2Var;
            default:
                MutableState mutableState = this.l;
                MutableIntState mutableIntState = (MutableIntState) obj2;
                return new k2((OnlineSubtitleSearchInputServerManager) this.m, (String) obj5, this.b, this.c, this.d, this.e, (Context) obj4, (ne) obj3, this.g, this.h, this.i, this.j, this.k, mutableState, mutableIntState, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((k2) create((ServerConfig) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((k2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        Object obj5 = this.n;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj4;
                MutableState mutableState2 = (MutableState) obj5;
                ServerConfig serverConfig = (ServerConfig) this.m;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                s01.E("Received config from phone: alias=", serverConfig.getAlias(), ", host=", serverConfig.getHost(), "AddServerScreen");
                ad1 ad1VarC = p2.c(serverConfig.getHost());
                String protocol = ad1VarC.b;
                if (protocol == null) {
                    protocol = serverConfig.getProtocol();
                }
                MutableState mutableState3 = this.c;
                mutableState3.setValue(protocol);
                String str = ad1VarC.a;
                MutableState mutableState4 = this.d;
                mutableState4.setValue(str);
                Integer num = ad1VarC.c;
                String strValueOf = String.valueOf(num != null ? num.intValue() : serverConfig.getPort());
                MutableState mutableState5 = this.e;
                mutableState5.setValue(strValueOf);
                String path = serverConfig.getPath();
                if (path == null) {
                    path = "";
                }
                this.g.setValue(StringsKt.trim((CharSequence) path).toString());
                this.h.setValue(StringsKt.trim((CharSequence) serverConfig.getUsername()).toString());
                this.i.setValue(StringsKt.trim((CharSequence) serverConfig.getPassword()).toString());
                String string = StringsKt.trim((CharSequence) serverConfig.getAlias()).toString();
                MutableState mutableState6 = this.j;
                mutableState6.setValue(string);
                String note = serverConfig.getNote();
                String string2 = note != null ? StringsKt.trim((CharSequence) note).toString() : null;
                this.k.setValue(string2 != null ? string2 : "");
                Boolean boolValueOf = Boolean.valueOf(serverConfig.getDirectOnly());
                MutableState mutableState7 = this.l;
                mutableState7.setValue(boolValueOf);
                mutableState2.setValue(Boolean.valueOf(serverConfig.getEnableStrmDirectPlay()));
                mutableState.setValue(Boolean.valueOf(serverConfig.getTrustAllCerts()));
                String str2 = (String) mutableState3.getValue();
                String str3 = (String) mutableState4.getValue();
                String str4 = (String) mutableState5.getValue();
                String str5 = (String) mutableState6.getValue();
                boolean zBooleanValue = ((Boolean) mutableState7.getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
                boolean zBooleanValue3 = ((Boolean) mutableState.getValue()).booleanValue();
                StringBuilder sbZ = kb0.z("Form fields updated: protocol=", str2, ", host=", str3, ", port=");
                i02.v(sbZ, str4, ", alias=", str5, ", directOnly=");
                i9.r(sbZ, zBooleanValue, ", enableStrmDirectPlay=", zBooleanValue2, ", trustAllCerts=");
                sbZ.append(zBooleanValue3);
                Log.d("AddServerScreen", sbZ.toString());
                BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new j2((LazyListState) obj3, (FocusRequester) obj2, null), 3, null);
                break;
            default:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                OnlineSubtitleSearchInputServerManager onlineSubtitleSearchInputServerManager = (OnlineSubtitleSearchInputServerManager) this.m;
                final String str6 = (String) obj5;
                final Context context = (Context) obj4;
                final ne neVar = (ne) obj3;
                final MutableIntState mutableIntState = (MutableIntState) obj2;
                final CoroutineScope coroutineScope = this.b;
                final MutableState mutableState8 = this.c;
                final MutableState mutableState9 = this.d;
                final MutableState mutableState10 = this.e;
                final MutableState mutableState11 = this.g;
                final MutableState mutableState12 = this.h;
                final MutableState mutableState13 = this.i;
                final MutableState mutableState14 = this.j;
                final MutableState mutableState15 = this.k;
                final MutableState mutableState16 = this.l;
                onlineSubtitleSearchInputServerManager.startServer(new Function1() { // from class: ma1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        ra1.e(str6, coroutineScope, mutableState8, mutableState9, mutableState10, context, neVar, mutableState11, mutableState12, mutableState13, mutableState14, mutableState15, mutableState16, mutableIntState, (String) obj6);
                        return Unit.INSTANCE;
                    }
                });
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, LazyListState lazyListState, FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.b = coroutineScope;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
        this.i = mutableState6;
        this.j = mutableState7;
        this.k = mutableState8;
        this.l = mutableState9;
        this.n = mutableState10;
        this.o = mutableState11;
        this.p = lazyListState;
        this.q = focusRequester;
    }
}
