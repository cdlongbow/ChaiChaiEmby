package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.BasicTooltipState;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wk implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ BasicTooltipState b;
    public final /* synthetic */ CoroutineScope c;

    public /* synthetic */ wk(BasicTooltipState basicTooltipState, CoroutineScope coroutineScope) {
        this.b = basicTooltipState;
        this.c = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        CoroutineScope coroutineScope = this.c;
        BasicTooltipState basicTooltipState = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(BasicTooltipKt.anchorSemantics$lambda$0$0(coroutineScope, basicTooltipState));
            default:
                return BasicTooltipKt.TooltipPopup$lambda$0$0(basicTooltipState, coroutineScope);
        }
    }

    public /* synthetic */ wk(CoroutineScope coroutineScope, BasicTooltipState basicTooltipState) {
        this.c = coroutineScope;
        this.b = basicTooltipState;
    }
}
