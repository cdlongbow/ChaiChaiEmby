package defpackage;

import android.content.Context;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class y32 {
    public final Context a;
    public final Preferences.Key b;
    public final Preferences.Key c;
    public final w32 d;
    public final w32 e;

    public y32(Context context) {
        context.getClass();
        this.a = context;
        this.b = PreferencesKeys.stringSetKey("fonts");
        this.c = PreferencesKeys.stringKey("selected_font_id");
        this.d = new w32(z32.a(context).getData(), this, 0);
        this.e = new w32(z32.a(context).getData(), this, 1);
    }

    public final Object a(o32 o32Var, SuspendLambda suspendLambda) {
        Object objEdit = PreferencesKt.edit(z32.a(this.a), new r32(this, o32Var, null), suspendLambda);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    public final Object b(String str, SuspendLambda suspendLambda) {
        Object objEdit = PreferencesKt.edit(z32.a(this.a), new t32(this, str, null), suspendLambda);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }
}
