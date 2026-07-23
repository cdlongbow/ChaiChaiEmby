package defpackage;


/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ua1 implements SlotTableEditor.VisitSlotsInRememberOrderCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ RememberManager b;

    public /* synthetic */ ua1(RememberManager rememberManager, int i) {
        this.a = i;
        this.b = rememberManager;
    }

    @Override // androidx.compose.runtime.composer.linkbuffer.SlotTableEditor.VisitSlotsInRememberOrderCallback
    public final boolean visit(int i, int i2, Object obj) {
        int i3 = this.a;
        RememberManager rememberManager = this.b;
        switch (i3) {
            case 0:
                return Operation.RemoveTailGroupsAndValues.execute$lambda$0(rememberManager, i, i2, obj);
            case 1:
                return SlotTableEditorKt.removeGroupAndForgetSlots$lambda$0(rememberManager, i, i2, obj);
            case 2:
                return SlotTableKt.deactivateCurrentGroup$lambda$0(rememberManager, i, i2, obj);
            default:
                return SlotTableKt.removeCurrentGroup$lambda$0(rememberManager, i, i2, obj);
        }
    }
}
