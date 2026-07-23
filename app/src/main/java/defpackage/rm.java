package defpackage;

import android.content.Context;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;

import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes4.dex */
public final class rm {
    public static final Preferences.Key d = PreferencesKeys.intKey("memory_buffer_size_mb");
    public static final Preferences.Key e = PreferencesKeys.intKey("buffer_time_seconds");
    public final Context a;
    public final b7 b;
    public final b7 c;

    public rm(Context context) {
        context.getClass();
        this.a = context;
        this.b = new b7(xm.a(context).getData(), 1);
        this.c = new b7(xm.a(context).getData(), 2);
    }

    public final b7 a() {
        return this.c;
    }

    public final int b() {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new mm(this, null, 0), 1, null)).intValue();
    }

    public final b7 c() {
        return this.b;
    }

    public final int d() {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new mm(this, null, 1), 1, null)).intValue();
    }

    public final Object e(int i, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(xm.a(this.a), new nm(RangesKt.coerceIn(i, 60, 1800), null), continuationImpl);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    public final Object f(int i, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(xm.a(this.a), new om(RangesKt.coerceIn(i, 30, HttpStatus.SC_BAD_REQUEST), null), continuationImpl);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }
}
