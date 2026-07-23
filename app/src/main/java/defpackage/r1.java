package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.runtime.MutableState;
import androidx.datastore.preferences.core.Preferences;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ r1(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int iCoerceAtLeast = 120;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 1:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 2:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 3:
                mutableState.setValue(Intrinsics.areEqual((String) mutableState.getValue(), "http") ? "https" : "http");
                return Unit.INSTANCE;
            case 4:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 5:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 6:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 7:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 8:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 9:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 10:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 11:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 12:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 13:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 14:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 16:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 17:
                return AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$4$0(mutableState);
            case 18:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 19:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 20:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 21:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 22:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 23:
                return BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$4$1$0$0(mutableState);
            case 24:
                return BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$9$0(mutableState);
            case 25:
                mutableState.setValue(Integer.valueOf(RangesKt.coerceAtLeast(((Number) mutableState.getValue()).intValue() - 10, 30)));
                return Unit.INSTANCE;
            case 26:
                mutableState.setValue(Integer.valueOf(RangesKt.coerceAtMost(((Number) mutableState.getValue()).intValue() + 10, HttpStatus.SC_BAD_REQUEST)));
                return Unit.INSTANCE;
            case 27:
                Preferences.Key key = rm.d;
                int iIntValue = ((Number) mutableState.getValue()).intValue();
                if (iIntValue > 120) {
                    int iCoerceIn = RangesKt.coerceIn(iIntValue, 120, 1800);
                    int i2 = (iCoerceIn - 120) % 60;
                    iCoerceAtLeast = i2 == 0 ? RangesKt.coerceAtLeast(iCoerceIn - 60, 120) : RangesKt.coerceAtLeast(iCoerceIn - i2, 120);
                }
                mutableState.setValue(Integer.valueOf(iCoerceAtLeast));
                return Unit.INSTANCE;
            case 28:
                Preferences.Key key2 = rm.d;
                int iIntValue2 = ((Number) mutableState.getValue()).intValue();
                if (iIntValue2 >= 120) {
                    int iCoerceIn2 = RangesKt.coerceIn(iIntValue2, 120, 1800);
                    int i3 = (iCoerceIn2 - 120) % 60;
                    iCoerceAtLeast = i3 == 0 ? RangesKt.coerceAtMost(iCoerceIn2 + 60, 1800) : RangesKt.coerceAtMost((60 - i3) + iCoerceIn2, 1800);
                }
                mutableState.setValue(Integer.valueOf(iCoerceAtLeast));
                return Unit.INSTANCE;
            default:
                return DatePickerKt.DatePickerContent$lambda$36$lambda$33$lambda$32(mutableState);
        }
    }
}
