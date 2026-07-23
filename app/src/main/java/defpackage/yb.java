package defpackage;

import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ yb(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                AppCompatDelegate.lambda$syncRequestedAndStoredLocales$1(context);
                break;
            case 1:
                AppCompatDelegate.syncRequestedAndStoredLocales(context);
                break;
            case 2:
                ProfileInstallerInitializer.writeInBackground(context);
                break;
            default:
                ProfileInstaller.writeProfile(context);
                break;
        }
    }
}
