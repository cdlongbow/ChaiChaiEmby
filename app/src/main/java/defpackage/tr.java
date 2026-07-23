package defpackage;

import androidx.activity.ComponentActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tr implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ tr(ComponentActivity componentActivity, int i) {
        this.a = i;
        this.b = componentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ComponentActivity componentActivity = this.b;
        switch (i) {
            case 0:
                return ComponentActivity.fullyDrawnReporter_delegate$lambda$0$0(componentActivity);
            case 1:
                return ComponentActivity.fullyDrawnReporter_delegate$lambda$0(componentActivity);
            case 2:
                return ComponentActivity.onBackPressedInput_delegate$lambda$0(componentActivity);
            case 3:
                return ComponentActivity.defaultViewModelProviderFactory_delegate$lambda$0(componentActivity);
            default:
                return ComponentActivity.onBackPressedDispatcher_delegate$lambda$0(componentActivity);
        }
    }
}
