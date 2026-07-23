package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gu1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SafeActivityEmbeddingComponentProvider b;

    public /* synthetic */ gu1(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider, int i) {
        this.a = i;
        this.b = safeActivityEmbeddingComponentProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        boolean zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40;
        int i = this.a;
        SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider = this.b;
        switch (i) {
            case 0:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40(safeActivityEmbeddingComponentProvider);
                break;
            case 1:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodPinUnpinTopActivityStackValid$lambda$32(safeActivityEmbeddingComponentProvider);
                break;
            case 2:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodClearActivityStackAttributesCalculatorValid$lambda$58(safeActivityEmbeddingComponentProvider);
                break;
            case 3:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodClearEmbeddedActivityWindowInfoCallbackValid$lambda$41(safeActivityEmbeddingComponentProvider);
                break;
            case 4:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodUpdateActivityStackAttributesValid$lambda$59(safeActivityEmbeddingComponentProvider);
                break;
            case 5:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodSetActivityStackAttributesCalculatorValid$lambda$57(safeActivityEmbeddingComponentProvider);
                break;
            case 6:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodGetEmbeddedActivityWindowInfoValid$lambda$39(safeActivityEmbeddingComponentProvider);
                break;
            case 7:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodClearSplitInfoCallbackValid$lambda$14(safeActivityEmbeddingComponentProvider);
                break;
            case 8:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodUpdateSplitAttributesValid$lambda$27(safeActivityEmbeddingComponentProvider);
                break;
            case 9:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodInvalidateTopVisibleSplitAttributesValid$lambda$26(safeActivityEmbeddingComponentProvider);
                break;
            case 10:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodIsActivityEmbeddedValid$lambda$2(safeActivityEmbeddingComponentProvider);
                break;
            case 11:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodSetSplitInfoCallbackJavaConsumerValid$lambda$3(safeActivityEmbeddingComponentProvider);
                break;
            case 12:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodSetSplitInfoCallbackWindowConsumerValid$lambda$13(safeActivityEmbeddingComponentProvider);
                break;
            case 13:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodGetParentContainerInfoValid$lambda$56(safeActivityEmbeddingComponentProvider);
                break;
            case 14:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodSetEmbeddingRulesValid$lambda$1(safeActivityEmbeddingComponentProvider);
                break;
            case 15:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodGetActivityStackTokenValid$lambda$54(safeActivityEmbeddingComponentProvider);
                break;
            case 16:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodSplitAttributesCalculatorValid$lambda$15(safeActivityEmbeddingComponentProvider);
                break;
            case 17:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodRegisterActivityStackCallbackValid$lambda$30(safeActivityEmbeddingComponentProvider);
                break;
            case 18:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodUpdateSplitAttributesWithTokenValid$lambda$33(safeActivityEmbeddingComponentProvider);
                break;
            case 19:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isActivityEmbeddingComponentValid$lambda$0(safeActivityEmbeddingComponentProvider);
                break;
            default:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodUnregisterActivityStackCallbackValid$lambda$31(safeActivityEmbeddingComponentProvider);
                break;
        }
        return Boolean.valueOf(zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40);
    }
}
