package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.exoplayer.Renderer;
import com.dh.myembyapp.data.SubtitlePreferences;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaStream;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qk1 extends FunctionReferenceImpl implements Function3 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ eo1 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ SubtitlePreferences g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ to1 k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ on1 m;
    public final /* synthetic */ ln1 n;
    public final /* synthetic */ MutableState o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk1(Context context, CoroutineScope coroutineScope, eo1 eo1Var, Function0 function0, Function0 function1, SubtitlePreferences subtitlePreferences, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, to1 to1Var, MutableState mutableState4, on1 on1Var, ln1 ln1Var, MutableState mutableState5) {
        super(3, Intrinsics.Kotlin.class, "handleSubtitleSelected", "PlayerScreenContent$lambda$121$handleSubtitleSelected(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/dh/myembyapp/data/SubtitlePreferences;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerViewModel;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerSettingsState;Lcom/dh/myembyapp/ui/screens/player/PlayerSeekController;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/components/SubtitleOption;IZ)V", 0);
        this.a = context;
        this.b = coroutineScope;
        this.c = eo1Var;
        this.d = function0;
        this.e = function1;
        this.g = subtitlePreferences;
        this.h = mutableState;
        this.i = mutableState2;
        this.j = mutableState3;
        this.k = to1Var;
        this.l = mutableState4;
        this.m = on1Var;
        this.n = ln1Var;
        this.o = mutableState5;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0243  */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        Context context;
        eo1 eo1Var;
        MediaStream mediaStream;
        zn1 zn1Var;
        String str;
        String id;
        List<MediaStream> mediaStreams;
        Object next;
        h42 h42Var = (h42) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        h42Var.getClass();
        eo1 eo1Var2 = this.c;
        boolean z2 = eo1Var2.d;
        String id2 = eo1Var2.a.getId();
        Function0 function0 = this.d;
        String str2 = (String) function0.invoke();
        TranscodeQualityOption transcodeQualityOption = eo1Var2.i;
        Function0 function1 = this.e;
        MediaSource mediaSource = (MediaSource) function1.invoke();
        MutableState mutableState = this.l;
        on1 on1Var = this.m;
        ql1 ql1Var = new ql1(function1, eo1Var2, mutableState, on1Var);
        ln1 ln1Var = this.n;
        rl1 rl1Var = new rl1(eo1Var2, ln1Var);
        vh1 vh1Var = new vh1(12, this.i);
        final vh1 vh1Var2 = new vh1(13, this.j);
        Context context2 = this.a;
        n61 n61Var = new n61(context2, 5);
        sl1 sl1Var = new sl1(this.o);
        SubtitlePreferences subtitlePreferences = this.g;
        MutableState mutableState2 = this.h;
        to1 to1Var = this.k;
        final bi1 bi1Var = new bi1(h42Var, iIntValue, zBooleanValue, eo1Var2, function0, subtitlePreferences, mutableState2, function1, context2, to1Var, mutableState, on1Var, ln1Var);
        eo1 eo1Var3 = eo1Var2;
        Context context3 = context2;
        SubtitlePreferences subtitlePreferences2 = subtitlePreferences;
        Function0 function2 = function0;
        id2.getClass();
        if (z2) {
            i = iIntValue;
            z = zBooleanValue;
            if (Intrinsics.areEqual(h42Var.a, "subtitle_off")) {
                mutableState2.setValue(Boolean.FALSE);
                Unit unit = Unit.INSTANCE;
                subtitlePreferences2.saveSubtitlesEnabled(false);
                Integer num = (Integer) ql1Var.invoke();
                int i2 = -1;
                long jLongValue = ((Number) rl1Var.invoke()).longValue();
                Long lValueOf = Long.valueOf(jLongValue);
                io1 io1VarV = to1Var.v(id2, jLongValue / Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
                Job job = to1Var.g;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(to1Var), null, null, new mi(io1VarV, to1Var, id2, str2, transcodeQualityOption, num, i2, lValueOf, null, 2), 3, null);
                n61Var.invoke("字幕已关闭");
                sl1Var.invoke();
            } else {
                Integer num2 = h42Var.e;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    if (mediaSource == null || (mediaStreams = mediaSource.getMediaStreams()) == null) {
                        context = context3;
                        eo1Var = eo1Var3;
                        mediaStream = null;
                    } else {
                        Iterator<T> it = mediaStreams.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                context = context3;
                                eo1Var = eo1Var3;
                                next = null;
                                break;
                            }
                            next = it.next();
                            MediaStream mediaStream2 = (MediaStream) next;
                            context = context3;
                            eo1Var = eo1Var3;
                            if (Intrinsics.areEqual(mediaStream2.getType(), "Subtitle") && mediaStream2.getIndex() == iIntValue2) {
                                break;
                            }
                            context3 = context;
                            eo1Var3 = eo1Var;
                        }
                        mediaStream = (MediaStream) next;
                    }
                    String codec = mediaStream != null ? mediaStream.getCodec() : null;
                    Boolean boolValueOf = mediaStream != null ? Boolean.valueOf(mediaStream.isExternal()) : null;
                    Boolean boolValueOf2 = mediaStream != null ? Boolean.valueOf(mediaStream.isTextSubtitleStream()) : null;
                    Boolean boolValueOf3 = mediaStream != null ? Boolean.valueOf(mediaStream.getSupportsExternalStream()) : null;
                    Log.d("SubtitleTrack", "转码字幕选择: streamIndex=" + iIntValue2 + ", codec=" + codec + ", isExternal=" + boolValueOf + ", isText=" + boolValueOf2 + ", supportsExternal=" + boolValueOf3 + ", canSwitch=" + in1.h(mediaStream, num2) + ", canCache=" + in1.g(mediaStream));
                    if (in1.h(mediaStream, num2)) {
                        context3 = context;
                    } else {
                        MediaStream mediaStreamV = ku.v(mediaSource, num2.intValue());
                        if (mediaStreamV == null) {
                            zn1Var = null;
                        } else {
                            if (!in1.g(mediaStreamV)) {
                                mediaStreamV = null;
                            }
                            if (mediaStreamV != null) {
                                if (mediaSource == null || (id = mediaSource.getId()) == null) {
                                    str = str2 == null ? id2 : str2;
                                } else {
                                    str = id;
                                }
                                zn1Var = new zn1(id2, str, mediaStreamV);
                            } else {
                                zn1Var = null;
                            }
                        }
                        if (zn1Var != null) {
                            final long jLongValue2 = ((Number) rl1Var.invoke()).longValue();
                            sl1Var.invoke();
                            ku.o(this.b, context, zn1Var, n61Var, vh1Var, new Function2() { // from class: ob2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    MediaStream mediaStream3 = (MediaStream) obj4;
                                    Uri uri = (Uri) obj5;
                                    mediaStream3.getClass();
                                    uri.getClass();
                                    vh1Var2.invoke(Boolean.FALSE);
                                    Log.d("SubtitleTrack", "转码内封文本字幕已缓存，准备切换: streamIndex=" + mediaStream3.getIndex() + ", uri=" + uri);
                                    bi1Var.invoke(Long.valueOf(jLongValue2));
                                    return Unit.INSTANCE;
                                }
                            }, new h62(sl1Var, 6));
                        } else {
                            Log.w("SubtitleTrack", "转码模式下忽略不稳定的字幕切换: streamIndex=" + iIntValue2 + ", title=" + h42Var.b);
                            n61Var.invoke("该字幕在转码模式下暂不可显示");
                            sl1Var.invoke();
                        }
                    }
                }
                dn1.c0(eo1Var, function2, subtitlePreferences2, mutableState2, function1, context3, to1Var, mutableState, on1Var, ln1Var, h42Var, i, z, null);
            }
            return Unit.INSTANCE;
        }
        i = iIntValue;
        z = zBooleanValue;
        eo1Var = eo1Var3;
        function2 = function2;
        subtitlePreferences2 = subtitlePreferences2;
        function1 = function1;
        dn1.c0(eo1Var, function2, subtitlePreferences2, mutableState2, function1, context3, to1Var, mutableState, on1Var, ln1Var, h42Var, i, z, null);
        return Unit.INSTANCE;
    }
}
