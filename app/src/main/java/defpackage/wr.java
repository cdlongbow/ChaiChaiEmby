package defpackage;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wr implements OnContextAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ wr(ComponentActivity componentActivity, int i) {
        this.a = i;
        this.b = componentActivity;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        int i = this.a;
        ComponentActivity componentActivity = this.b;
        switch (i) {
            case 0:
                ComponentActivity._init_$lambda$4(componentActivity, context);
                break;
            default:
                ((FragmentActivity) componentActivity).lambda$init$3(context);
                break;
        }
    }
}
