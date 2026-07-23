package defpackage;

import com.dh.myembyapp.data.IntroOutroSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uk1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ CoroutineScope a;
    public final /* synthetic */ IntroOutroSettings b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk1(CoroutineScope coroutineScope, IntroOutroSettings introOutroSettings) {
        super(1, Intrinsics.Kotlin.class, "handleIntroOutroSettingsChange", "PlayerScreenContent$lambda$121$handleIntroOutroSettingsChange(Lkotlinx/coroutines/CoroutineScope;Lcom/dh/myembyapp/data/IntroOutroSettings;Lcom/dh/myembyapp/data/IntroOutroSettings$Settings;)V", 0);
        this.a = coroutineScope;
        this.b = introOutroSettings;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IntroOutroSettings.Settings settings = (IntroOutroSettings.Settings) obj;
        settings.getClass();
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new nl1(this.b, settings, null), 3, null);
        return Unit.INSTANCE;
    }
}
