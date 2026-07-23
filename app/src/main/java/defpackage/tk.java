package defpackage;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectionRegistrar b;

    public /* synthetic */ tk(SelectionRegistrar selectionRegistrar, int i) {
        this.a = i;
        this.b = selectionRegistrar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jNextSelectableId;
        int i = this.a;
        SelectionRegistrar selectionRegistrar = this.b;
        switch (i) {
            case 0:
                jNextSelectableId = selectionRegistrar.nextSelectableId();
                break;
            default:
                jNextSelectableId = selectionRegistrar.nextSelectableId();
                break;
        }
        return Long.valueOf(jNextSelectableId);
    }
}
