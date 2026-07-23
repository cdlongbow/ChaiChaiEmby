package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dh.myembyapp.MainActivity;
import com.dh.myembyapp.dlna.DlnaConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class l21 extends BroadcastReceiver {
    public final /* synthetic */ MainActivity a;

    public l21(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        String action = intent != null ? intent.getAction() : null;
        if (action == null || action.hashCode() != 1134047874 || !action.equals(DlnaConstants.ACTION_PLAY_REQUEST) || (stringExtra = intent.getStringExtra(DlnaConstants.EXTRA_URI)) == null) {
            return;
        }
        String stringExtra2 = intent.getStringExtra(DlnaConstants.EXTRA_TITLE);
        String stringExtra3 = intent.getStringExtra("metadata");
        s01.E("收到 DLNA 播放请求: uri=", stringExtra, ", title=", stringExtra2, "MainActivity");
        this.a.c.setValue(new nb0(stringExtra, stringExtra2, stringExtra3));
    }
}
