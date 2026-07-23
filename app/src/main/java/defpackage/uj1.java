package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uj1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ og1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj1(og1 og1Var) {
        super(0, Intrinsics.Kotlin.class, "resolveEffectiveAudioDecoderMode", "PlayerScreenContent$resolveEffectiveAudioDecoderMode(Lcom/dh/myembyapp/ui/screens/player/PlayerDecoderState;)Ljava/lang/String;", 0);
        this.a = og1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.a.c();
    }
}
