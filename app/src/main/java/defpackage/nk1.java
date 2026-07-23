package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.media3.exoplayer.ExoPlayer;
import com.dh.myembyapp.data.SubtitlePreferences;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaStream;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nk1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ CoroutineScope c;
    public final /* synthetic */ eo1 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ SubtitlePreferences g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ on1 i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ to1 m;
    public final /* synthetic */ on1 n;
    public final /* synthetic */ ln1 o;
    public final /* synthetic */ MutableState p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk1(Function0 function0, Context context, CoroutineScope coroutineScope, eo1 eo1Var, Function0 function1, SubtitlePreferences subtitlePreferences, MutableState mutableState, on1 on1Var, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, to1 to1Var, on1 on1Var2, ln1 ln1Var, MutableState mutableState5) {
        super(1, Intrinsics.Kotlin.class, "handleSubtitlesEnabledChange", "PlayerScreenContent$lambda$121$handleSubtitlesEnabledChange(Lkotlin/jvm/functions/Function0;Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Lkotlin/jvm/functions/Function0;Lcom/dh/myembyapp/data/SubtitlePreferences;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerSettingsState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerViewModel;Lcom/dh/myembyapp/ui/screens/player/PlayerSettingsState;Lcom/dh/myembyapp/ui/screens/player/PlayerSeekController;Landroidx/compose/runtime/MutableState;Z)V", 0);
        this.a = function0;
        this.b = context;
        this.c = coroutineScope;
        this.d = eo1Var;
        this.e = function1;
        this.g = subtitlePreferences;
        this.h = mutableState;
        this.i = on1Var;
        this.j = mutableState2;
        this.k = mutableState3;
        this.l = mutableState4;
        this.m = to1Var;
        this.n = on1Var2;
        this.o = ln1Var;
        this.p = mutableState5;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        Object EmptyList;
        List<MediaStream> mediaStreams;
        zn1 zn1Var;
        MediaStream mediaStreamV;
        String id;
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        Function0 function0 = this.a;
        MediaSource mediaSource = (MediaSource) function0.invoke();
        MutableState mutableState = this.h;
        ExoPlayer exoPlayer = (ExoPlayer) mutableState.getValue();
        eo1 eo1Var = this.d;
        boolean z = eo1Var.d;
        MediaItem mediaItem = eo1Var.a;
        String id2 = mediaItem.getId();
        String str2 = (String) this.e.invoke();
        String id3 = eo1Var.e;
        if (StringsKt.isBlank(id3)) {
            id3 = null;
        }
        if (id3 != null) {
            str = id3;
        } else if (mediaSource != null) {
            id3 = mediaSource.getId();
            str = id3;
        } else {
            str = null;
        }
        TranscodeQualityOption transcodeQualityOption = eo1Var.i;
        SubtitleVersionPrioritySettings subtitleVersionPrioritySettings = (SubtitleVersionPrioritySettings) this.i.m.getValue();
        yl1 yl1Var = new yl1(function0, eo1Var);
        zl1 zl1Var = new zl1(function0, eo1Var, mutableState, this.n);
        am1 am1Var = new am1(eo1Var, this.o);
        vh1 vh1Var = new vh1(8, this.j);
        vh1 vh1Var2 = new vh1(9, this.l);
        yh1 yh1Var = new yh1(this.m, 1);
        Context context = this.b;
        n61 n61Var = new n61(context, 3);
        xl1 xl1Var = new xl1(this.p);
        exoPlayer.getClass();
        id2.getClass();
        subtitleVersionPrioritySettings.getClass();
        vh1Var.invoke(bool);
        SubtitlePreferences subtitlePreferences = this.g;
        subtitlePreferences.saveSubtitlesEnabled(zBooleanValue);
        MutableState mutableState2 = this.k;
        if (z) {
            mutableState2.setValue(Boolean.TRUE);
            Unit unit = Unit.INSTANCE;
            Integer num = zBooleanValue ? (Integer) yl1Var.invoke() : -1;
            if (!zBooleanValue || (mediaStreamV = ku.v(mediaSource, num.intValue())) == null) {
                zn1Var = null;
            } else {
                if (!in1.g(mediaStreamV)) {
                    mediaStreamV = null;
                }
                if (mediaStreamV != null) {
                    if (mediaSource == null || (id = mediaSource.getId()) == null) {
                        id = str2 == null ? id2 : str2;
                    }
                    zn1Var = new zn1(id2, id, mediaStreamV);
                } else {
                    zn1Var = null;
                }
            }
            if (zn1Var != null) {
                ku.o(this.c, context, zn1Var, n61Var, vh1Var2, new ry1(num, n61Var, xl1Var, yh1Var, id2, str2, transcodeQualityOption, zl1Var, am1Var), new th(vh1Var, subtitlePreferences, xl1Var, yh1Var, id2, str2, transcodeQualityOption, zl1Var, am1Var, 2));
            } else {
                ig2.F(yh1Var, id2, str2, transcodeQualityOption, zl1Var, am1Var, num);
                n61Var.invoke(zBooleanValue ? "字幕已开启" : "字幕已关闭");
                xl1Var.invoke();
            }
        } else {
            if (zBooleanValue) {
                if (mediaSource == null || (mediaStreams = mediaSource.getMediaStreams()) == null) {
                    EmptyList = CollectionsKt.emptyList();
                } else {
                    EmptyList = new ArrayList();
                    for (Object obj2 : mediaStreams) {
                        if (Intrinsics.areEqual(((MediaStream) obj2).getType(), "Subtitle")) {
                            EmptyList.add(obj2);
                        }
                    }
                }
                n42.d(exoPlayer, EmptyList, subtitlePreferences, mediaItem, str, subtitleVersionPrioritySettings);
                mutableState2.setValue(Boolean.TRUE);
                Unit unit2 = Unit.INSTANCE;
            } else {
                n42.c(exoPlayer, new h42(), context);
                mutableState2.setValue(Boolean.TRUE);
                Unit unit3 = Unit.INSTANCE;
            }
            n61Var.invoke(zBooleanValue ? "字幕已开启" : "字幕已关闭");
            xl1Var.invoke();
        }
        return Unit.INSTANCE;
    }
}
