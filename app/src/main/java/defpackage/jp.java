package defpackage;

import androidx.compose.material3.CheckboxKt;
import com.dh.myembyapp.data.DecoderSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jp implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ jp(boolean z, Function1 function1) {
        this.a = 5;
        this.c = z;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        boolean z = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                return CheckboxKt.Checkbox$lambda$5$lambda$4(function1, z);
            case 1:
                return CheckboxKt.Checkbox$lambda$2$lambda$1(function1, z);
            case 2:
                function1.invoke(Boolean.valueOf(!z));
                return Unit.INSTANCE;
            case 3:
                function1.invoke(Boolean.valueOf(!z));
                return Unit.INSTANCE;
            case 4:
                function1.invoke(Boolean.valueOf(!z));
                return Unit.INSTANCE;
            case 5:
                function1.invoke(z ? "auto" : DecoderSettings.AUDIO_DECODER_FORCE_FFMPEG);
                return Unit.INSTANCE;
            case 6:
                function1.invoke(Boolean.valueOf(!z));
                return Unit.INSTANCE;
            case 7:
                function1.invoke(Boolean.valueOf(!z));
                return Unit.INSTANCE;
            case 8:
                function1.invoke(Boolean.valueOf(!z));
                return Unit.INSTANCE;
            case 9:
                function1.invoke(Boolean.valueOf(!z));
                return Unit.INSTANCE;
            case 10:
                function1.invoke(Boolean.valueOf(!z));
                return Unit.INSTANCE;
            default:
                function1.invoke(Boolean.valueOf(!z));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ jp(int i, boolean z, Function1 function1) {
        this.a = i;
        this.b = function1;
        this.c = z;
    }
}
