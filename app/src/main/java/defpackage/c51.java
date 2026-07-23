package defpackage;

import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c51 {
    static {
        Modifier.Companion companion = Modifier.INSTANCE;
    }

    public static Modifier a(Modifier modifier, Modifier modifier2) {
        return modifier2 == Modifier.INSTANCE ? modifier : new CombinedModifier(modifier, modifier2);
    }
}
