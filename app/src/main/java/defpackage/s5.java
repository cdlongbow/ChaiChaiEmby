package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.MyEmbyApp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ s5(Context context, MutableState mutableState, MutableState mutableState2, int i) {
        this.a = i;
        this.b = context;
        this.c = mutableState;
        this.d = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MyEmbyApp myEmbyApp;
        int i = this.a;
        MutableState mutableState = this.d;
        MutableState mutableState2 = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                mutableState2.setValue(Boolean.TRUE);
                Context applicationContext = context.getApplicationContext();
                myEmbyApp = applicationContext instanceof MyEmbyApp ? (MyEmbyApp) applicationContext : null;
                if (myEmbyApp != null) {
                    myEmbyApp.b(new d4(11, mutableState2, mutableState));
                }
                break;
            default:
                mutableState2.setValue(Boolean.TRUE);
                Context applicationContext2 = context.getApplicationContext();
                myEmbyApp = applicationContext2 instanceof MyEmbyApp ? (MyEmbyApp) applicationContext2 : null;
                if (myEmbyApp != null) {
                    myEmbyApp.b(new wx1(2, mutableState2, mutableState));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
