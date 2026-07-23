package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.exoplayer.Renderer;

import com.dh.myembyapp.data.AudioTrackMemory;
import com.dh.myembyapp.data.model.AudioCodecPriorityType;
import com.dh.myembyapp.data.model.AudioLanguagePreference;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pk1 extends FunctionReferenceImpl implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ eo1 b;
    public final /* synthetic */ ce1 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ to1 g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ ln1 j;
    public final /* synthetic */ MutableState k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk1(Function0 function0, eo1 eo1Var, ce1 ce1Var, Function0 function1, Context context, to1 to1Var, MutableState mutableState, MutableState mutableState2, ln1 ln1Var, MutableState mutableState3) {
        super(2, Intrinsics.Kotlin.class, "handleAudioSelected", "PlayerScreenContent$lambda$121$handleAudioSelected(Lkotlin/jvm/functions/Function0;Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Lcom/dh/myembyapp/data/PlaybackMemoryPreferences;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Lcom/dh/myembyapp/ui/screens/player/PlayerViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerSeekController;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/components/AudioOption;Z)V", 0);
        this.a = function0;
        this.b = eo1Var;
        this.c = ce1Var;
        this.d = function1;
        this.e = context;
        this.g = to1Var;
        this.h = mutableState;
        this.i = mutableState2;
        this.j = ln1Var;
        this.k = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        yf yfVar = (yf) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        yfVar.getClass();
        String str = (String) this.a.invoke();
        eo1 eo1Var = this.b;
        MediaItem mediaItem = eo1Var.a;
        boolean z = eo1Var.d;
        TranscodeQualityOption transcodeQualityOption = eo1Var.i;
        gl1 gl1Var = new gl1(eo1Var, this.d, this.h, this.i);
        hl1 hl1Var = new hl1(eo1Var, this.j);
        il1 il1Var = new il1(this.k);
        mediaItem.getClass();
        ce1 ce1Var = this.c;
        Context context = this.e;
        if (zBooleanValue) {
            ce1Var.a(mediaItem, str);
            Toast.makeText(context, "已取消音轨记忆", 0).show();
            Unit unit = Unit.INSTANCE;
        } else {
            Integer num = yfVar.i;
            AudioCodecPriorityType audioCodecPriorityType = yfVar.e;
            AudioLanguagePreference audioLanguagePreference = yfVar.d;
            String storageValue = audioLanguagePreference != null ? audioLanguagePreference.getStorageValue() : null;
            String strName = audioCodecPriorityType != AudioCodecPriorityType.OTHER ? audioCodecPriorityType.name() : null;
            int i = yfVar.g;
            ce1Var.j(mediaItem, str, new AudioTrackMemory(null, null, num, storageValue, strName, (i <= 0 || i == Integer.MAX_VALUE) ? null : Integer.valueOf(i), tg.a(yfVar.b), 0L, Input.Keys.F1, null));
            Toast.makeText(context, "已记住音轨选择", 0).show();
            Unit unit2 = Unit.INSTANCE;
        }
        if (!z || yfVar.i == null) {
            il1Var.invoke();
        } else {
            String id = mediaItem.getId();
            Integer num2 = yfVar.i;
            Integer num3 = (Integer) gl1Var.invoke();
            long jLongValue = ((Number) hl1Var.invoke()).longValue();
            id.getClass();
            Long lValueOf = Long.valueOf(jLongValue);
            long j = jLongValue / Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
            to1 to1Var = this.g;
            io1 io1VarV = to1Var.v(id, j);
            Job job = to1Var.g;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(to1Var), null, null, new mi(io1VarV, to1Var, id, str, transcodeQualityOption, num2, num3, lValueOf, null, 2), 3, null);
        }
        return Unit.INSTANCE;
    }
}
