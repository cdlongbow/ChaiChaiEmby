package defpackage;

import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hu1 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ hu1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchFieldException, NoSuchMethodException {
        boolean zIsClassWindowAttributesValid$lambda$37;
        switch (this.a) {
            case 0:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassWindowAttributesValid$lambda$37();
                break;
            case 1:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassSplitInfoTokenValid$lambda$38();
                break;
            case 2:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassActivityRuleBuilderLevel1Valid$lambda$7();
                break;
            case 3:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassDividerAttributesBuilderValid$lambda$46();
                break;
            case 4:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isActivityStackGetTagValid$lambda$53();
                break;
            case 5:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isMethodSetDividerAttributesValid$lambda$43();
                break;
            case 6:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassAnimationParamsBuilderValid$lambda$52();
                break;
            case 7:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassActivityStackAttributesBuilderValid$lambda$61();
                break;
            case 8:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassAnimationBackgroundValid$lambda$35();
                break;
            case 9:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassActivityRuleBuilderLevel2Valid$lambda$19();
                break;
            case 10:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassAnimationParamsValid$lambda$51();
                break;
            case 11:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassSplitAttributesValid$lambda$21();
                break;
            case 12:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassSplitTypeValid$lambda$23();
                break;
            case 13:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isMethodGetSplitRatioValid$lambda$4();
                break;
            case 14:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isMethodGetDefaultSplitAttributesValid$lambda$18();
                break;
            case 15:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isActivityStackGetActivityStackTokenValid$lambda$29();
                break;
            case 16:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isMethodIsDraggingToFullscreenAllowedValid$lambda$49();
                break;
            case 17:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassSplitPlaceholderRuleValid$lambda$11();
                break;
            case 18:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassEmbeddedActivityWindowInfoValid$lambda$44();
                break;
            case 19:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassSplitPlaceholderRuleBuilderLevel2Valid$lambda$25();
                break;
            case 20:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassParentContainerInfoValid$lambda$55();
                break;
            case 21:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isMethodGetDividerAttributesValid$lambda$42();
                break;
            case 22:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isMethodGetLayoutDirectionValid$lambda$5();
                break;
            case 23:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassDividerAttributesValid$lambda$45();
                break;
            case 24:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isMethodSetAnimationParamsValid$lambda$48();
                break;
            case 25:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassSplitPairRuleValid$lambda$9();
                break;
            case 26:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isMethodGetSplitAttributesValid$lambda$16();
                break;
            case 27:
                zIsClassWindowAttributesValid$lambda$37 = SafeActivityEmbeddingComponentProvider.isClassActivityStackTokenValid$lambda$36();
                break;
            case 28:
                return SaveableStateHolderKt.rememberSaveableStateHolder$lambda$0$0();
            default:
                return SaveableStateRegistryKt.LocalSaveableStateRegistry$lambda$0();
        }
        return Boolean.valueOf(zIsClassWindowAttributesValid$lambda$37);
    }
}
