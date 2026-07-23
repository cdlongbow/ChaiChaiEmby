package defpackage;

import androidx.compose.runtime.DisposableEffectResult;

/* JADX INFO: loaded from: classes4.dex */
public final class op0 implements DisposableEffectResult {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ zq0 b;

    public op0(boolean z, zq0 zq0Var) {
        this.a = z;
        this.b = zq0Var;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        if (this.a) {
            this.b.k.setValue(Boolean.TRUE);
        }
    }
}
