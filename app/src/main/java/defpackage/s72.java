package defpackage;

import androidx.compose.material3.TooltipKt;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.AppCardSizeLevel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s72 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ s72(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 1:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 2:
                mutableState.setValue(Integer.valueOf(AppCardSizeLevel.INSTANCE.next(((Number) mutableState.getValue()).intValue())));
                return Unit.INSTANCE;
            case 3:
                return TooltipKt.TooltipBox$lambda$4$lambda$3(mutableState);
            case 4:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 5:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 6:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 7:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 8:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 9:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 10:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            default:
                return Boolean.valueOf(WideNavigationRailKt.Scrim_3J_VO9M$lambda$33$lambda$32$lambda$31(mutableState));
        }
    }
}
