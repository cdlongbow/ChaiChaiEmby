package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public final class sa {
    public final /* synthetic */ int a;

    public /* synthetic */ sa(int i) {
        this.a = i;
    }

    public final rd2 a(Object obj, wa1 wa1Var) {
        switch (this.a) {
            case 0:
                return ku.R(((Uri) obj).toString());
            case 1:
                return ku.g(((File) obj).getPath());
            case 2:
                return ku.g(((Path) obj).toString());
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = wa1Var.a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return ku.R("android.resource://" + context.getPackageName() + "/" + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return ku.R((String) obj);
        }
    }
}
