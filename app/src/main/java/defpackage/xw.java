package defpackage;

import android.util.Log;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.ExposedDropdownMenuPositionProvider;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.internal.DropdownMenuPositionProvider;
import androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.IntRect;
import com.dh.myembyapp.data.model.DanmakuAnime;
import com.dh.myembyapp.data.model.DanmakuEpisode;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.OtherServerResourceMatch;
import com.dh.myembyapp.data.model.VideoResolutionKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xw implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ xw(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String id;
        String id2;
        String str = "default";
        switch (this.a) {
            case 0:
                String str2 = (String) obj;
                Throwable th = (Throwable) obj2;
                str2.getClass();
                th.getClass();
                Log.e("DanmakuPlayer", str2, th);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj).intValue();
                DanmakuEpisode danmakuEpisode = (DanmakuEpisode) obj2;
                danmakuEpisode.getClass();
                return Long.valueOf(danmakuEpisode.getEpisodeId());
            case 2:
                ((Integer) obj).intValue();
                Pair pair = (Pair) obj2;
                pair.getClass();
                return Integer.valueOf(((DanmakuAnime) pair.getFirst()).getAnimeId());
            case 3:
                ((Integer) obj).intValue();
                MediaItem mediaItem = (MediaItem) obj2;
                mediaItem.getClass();
                return mediaItem.getId();
            case 4:
                ((Integer) obj).intValue();
                MediaItem mediaItem2 = (MediaItem) obj2;
                mediaItem2.getClass();
                return mediaItem2.getId();
            case 5:
                ((Integer) obj).intValue();
                ya1 ya1Var = (ya1) obj2;
                ya1Var.getClass();
                String id3 = ya1Var.a.getId();
                OtherServerResourceMatch otherServerResourceMatch = ya1Var.b;
                String id4 = otherServerResourceMatch.getItem().getId();
                MediaSource mediaSource = otherServerResourceMatch.getMediaSource();
                if (mediaSource != null && (id = mediaSource.getId()) != null) {
                    str = id;
                }
                return id3 + "_" + id4 + "_" + str;
            case 6:
                ((Integer) obj).getClass();
                rg0 rg0Var = (rg0) obj2;
                rg0Var.getClass();
                return rg0Var.a;
            case 7:
                ((Integer) obj).intValue();
                ya1 ya1Var2 = (ya1) obj2;
                ya1Var2.getClass();
                String id5 = ya1Var2.a.getId();
                OtherServerResourceMatch otherServerResourceMatch2 = ya1Var2.b;
                String id6 = otherServerResourceMatch2.getItem().getId();
                MediaSource mediaSource2 = otherServerResourceMatch2.getMediaSource();
                if (mediaSource2 != null && (id2 = mediaSource2.getId()) != null) {
                    str = id2;
                }
                return id5 + "_" + id6 + "_" + str;
            case 8:
                return Integer.valueOf(VideoResolutionKt.resolveVideoResolutionLabelSortValue((String) obj) - VideoResolutionKt.resolveVideoResolutionLabelSortValue((String) obj2));
            case 9:
                ((Integer) obj).intValue();
                u51 u51Var = (u51) obj2;
                u51Var.getClass();
                return u51Var.a;
            case 10:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1098941670, iIntValue, -1, "com.dh.myembyapp.dlna.DlnaInputField.<anonymous> (DlnaSettingsScreen.kt:338)");
                    }
                    TextKt.m3048TextNvy7gAk("设备名称（在控制端显示）", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                return DrawerState.Companion.Saver$lambda$0((SaverScope) obj, (DrawerState) obj2);
            case 12:
                return DropdownMenuPositionProvider._init_$lambda$1((IntRect) obj, (IntRect) obj2);
            case 13:
                return ExposedDropdownMenuPositionProvider._init_$lambda$1((IntRect) obj, (IntRect) obj2);
            case 14:
                ((Integer) obj).intValue();
                MediaItem mediaItem3 = (MediaItem) obj2;
                mediaItem3.getClass();
                return mediaItem3.getId();
            case 15:
                return LazyGridIntervalContent.DefaultSpan$lambda$0((LazyGridItemSpanScope) obj, ((Integer) obj2).intValue());
            case 16:
                return LazyGridState.Saver$lambda$0((SaverScope) obj, (LazyGridState) obj2);
            case 17:
                return LazyGridState.Companion.saver$lambda$2((SaverScope) obj, (LazyGridState) obj2);
            case 18:
                return LazyGridState.Companion.saver$lambda$0((SaverScope) obj, (LazyGridState) obj2);
            case 19:
                return LazyListState.Saver$lambda$0((SaverScope) obj, (LazyListState) obj2);
            case 20:
                return LazyListState.Companion.saver$lambda$0((SaverScope) obj, (LazyListState) obj2);
            case 21:
                return LazyListState.Companion.saver$lambda$2((SaverScope) obj, (LazyListState) obj2);
            case 22:
                return LazyStaggeredGridState.Saver$lambda$0((SaverScope) obj, (LazyStaggeredGridState) obj2);
            case 23:
                int iIntValue2 = ((Integer) obj).intValue();
                MediaSource mediaSource3 = (MediaSource) obj2;
                mediaSource3.getClass();
                return mediaSource3.getId() + "_" + iIntValue2;
            case 24:
                return PullToRefreshStateImpl.Saver$lambda$0((SaverScope) obj, (PullToRefreshStateImpl) obj2);
            case 25:
                return RangeSliderState.Companion.Saver$lambda$0((SaverScope) obj, (RangeSliderState) obj2);
            case 26:
                return Integer.valueOf(SafeCollector.collectContextSize$lambda$0(((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            case 27:
                return SaverKt.AutoSaver$lambda$0((SaverScope) obj, obj2);
            case 28:
                return SaversKt.TextLinkStylesSaver$lambda$0((SaverScope) obj, (TextLinkStyles) obj2);
            default:
                return SaversKt.TextDecorationSaver$lambda$0((SaverScope) obj, (TextDecoration) obj2);
        }
    }
}
