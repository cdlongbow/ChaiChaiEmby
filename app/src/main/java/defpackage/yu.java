package defpackage;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class yu extends g {
    public final kf i;

    public yu(kf kfVar, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, boolean z, String str, mu muVar) {
        this.a = alignment;
        this.b = contentScale;
        this.c = f;
        this.d = colorFilter;
        this.e = z;
        this.g = str;
        this.h = muVar;
        this.i = kfVar;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        CoroutineScope coroutineScope = getCoroutineScope();
        kf kfVar = this.i;
        kfVar.h = coroutineScope;
        kfVar.onRemembered();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.i.onForgotten();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        this.i.e(null);
    }
}
