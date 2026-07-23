package defpackage;

import android.view.View;
import androidx.media3.ui.PlayerControlView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j71 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j71(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Navigation.createNavigateOnClickListener$lambda$1((NavDirections) obj, view);
                break;
            default:
                ((PlayerControlView) obj).onFullscreenButtonClicked(view);
                break;
        }
    }
}
