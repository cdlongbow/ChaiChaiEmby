package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.media3.exoplayer.Renderer;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class nn1 {
    public final String a;
    public final ph1 b;
    public final MutableState c;
    public final MutableState d;
    public final MutableState e;
    public final MutableState f;
    public final MutableState g;
    public final MutableState h;

    public nn1(String str, long j, ph1 ph1Var) {
        str.getClass();
        ph1Var.getClass();
        this.a = str;
        this.b = ph1Var;
        Long l = (Long) ph1Var.a.get(str);
        long jLongValue = l != null ? l.longValue() : RangesKt.coerceAtLeast(j / Renderer.DEFAULT_DURATION_TO_PROGRESS_US, 0L);
        this.c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(jLongValue), null, 2, null);
        this.d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(jLongValue), null, 2, null);
        this.e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(ph1Var.b.contains(str) || j > 0), null, 2, null);
        this.f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this.g = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.h = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a() {
        return ((Number) this.c.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long b() {
        return (Long) this.g.getValue();
    }

    public final void c(long j) {
        long jCoerceAtLeast = RangesKt.coerceAtLeast(j, 0L);
        this.c.setValue(Long.valueOf(jCoerceAtLeast));
        this.d.setValue(Long.valueOf(jCoerceAtLeast));
        this.e.setValue(Boolean.TRUE);
        ph1 ph1Var = this.b;
        ph1Var.getClass();
        String str = this.a;
        str.getClass();
        ph1Var.a.put(str, Long.valueOf(RangesKt.coerceAtLeast(jCoerceAtLeast, 0L)));
        ph1Var.b.add(str);
    }
}
