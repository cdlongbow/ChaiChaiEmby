package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.material3.BottomSheetDefaults;
import androidx.compose.material3.DatePickerDefaults;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.dh.myembyapp.data.DanmakuMemory;
import com.dh.myembyapp.data.IntroOutroMemory;
import com.dh.myembyapp.data.SubtitlePreferences;
import com.dh.myembyapp.data.VideoVersionMemory;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ dl(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return BasicTooltipKt.TooltipPopup$lambda$1$0$0(str, (SemanticsPropertyReceiver) obj);
            case 1:
                return BottomSheetDefaults.DragHandle_lgZ2HuY$lambda$1$lambda$0(str, (SemanticsPropertyReceiver) obj);
            case 2:
                return CanvasKt.Canvas$lambda$1$0(str, (SemanticsPropertyReceiver) obj);
            case 3:
                return Boolean.valueOf(DanmakuMemory.saveSeasonDanmaku$lambda$1(str, (DanmakuMemory.SeasonDanmakuMemory) obj));
            case 4:
                return Boolean.valueOf(DanmakuMemory.saveMovieDanmaku$lambda$1(str, (DanmakuMemory.MovieDanmakuMemory) obj));
            case 5:
                return Boolean.valueOf(DanmakuMemory.saveEpisodeDanmaku$lambda$1(str, (DanmakuMemory.EpisodeDanmakuMemory) obj));
            case 6:
                return DatePickerDefaults.DatePickerHeadline_ISIPfiY$lambda$3$lambda$2(str, (SemanticsPropertyReceiver) obj);
            case 7:
                return DatePickerKt.Day$lambda$61$lambda$60(str, (SemanticsPropertyReceiver) obj);
            case 8:
                return DatePickerKt.Year$lambda$66$lambda$65(str, (SemanticsPropertyReceiver) obj);
            case 9:
                return IconKt.Icon_ww6aTOc$lambda$5$lambda$4(str, (SemanticsPropertyReceiver) obj);
            case 10:
                return ImageKt.Image$lambda$0$0(str, (SemanticsPropertyReceiver) obj);
            case 11:
                return Boolean.valueOf(IntroOutroMemory.saveSeasonIntroOutro$lambda$0(str, (IntroOutroMemory.SeasonIntroOutroMemory) obj));
            case 12:
                return ModalBottomSheetKt.ModalBottomSheetContent_7___e2Q$lambda$21$lambda$20(str, (SemanticsPropertyReceiver) obj);
            case 13:
                return Boolean.valueOf(NavControllerImpl.restoreStateInternal$lambda$53(str, (String) obj));
            case 14:
                return Boolean.valueOf(NavControllerImpl.restoreStateInternal$lambda$51(str, (String) obj));
            case 15:
                return NavigationDrawerKt.PermanentDrawerSheet_afqeVBk$lambda$48$lambda$47(str, (SemanticsPropertyReceiver) obj);
            case 16:
                MediaItem mediaItem = (MediaItem) obj;
                mediaItem.getClass();
                String lowerCase = StringsKt.trim((CharSequence) mediaItem.getName()).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return Integer.valueOf(Intrinsics.areEqual(lowerCase, str) ? 0 : 1);
            case 17:
                VideoVersionMemory videoVersionMemory = (VideoVersionMemory) obj;
                videoVersionMemory.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(videoVersionMemory.getKey(), str));
            case 18:
                return Boolean.valueOf(ServerPreferences.deleteServer$lambda$0(str, (ServerConfig) obj));
            case 19:
                return SliderKt.RangeSliderImpl$lambda$44$lambda$36$lambda$35(str, (SemanticsPropertyReceiver) obj);
            case 20:
                return SliderKt.RangeSliderImpl$lambda$44$lambda$41$lambda$40(str, (SemanticsPropertyReceiver) obj);
            case 21:
                String str2 = (String) obj;
                str2.getClass();
                return Boolean.valueOf(StringsKt__StringsJVMKt.startsWith$default(str2, str + "|", false, 2, null));
            case 22:
                return Boolean.valueOf(SubtitlePreferences.saveMovieSubtitleSelection$lambda$0(str, (SubtitlePreferences.MovieSubtitlePref) obj));
            case 23:
                return Boolean.valueOf(SubtitlePreferences.clearMovieSubtitleSelection$lambda$0(str, (SubtitlePreferences.MovieSubtitlePref) obj));
            case 24:
                return Boolean.valueOf(SubtitlePreferences.clearSeriesSubtitleSelection$lambda$0(str, (SubtitlePreferences.SeriesSubtitlePref) obj));
            case 25:
                return Boolean.valueOf(SubtitlePreferences.saveMovieDisplaySettings$lambda$0(str, (SubtitlePreferences.MovieSubtitlePref) obj));
            case 26:
                return Boolean.valueOf(SubtitlePreferences.saveSeriesDisplaySettings$lambda$0(str, (SubtitlePreferences.SeriesSubtitlePref) obj));
            case 27:
                return Boolean.valueOf(SubtitlePreferences.saveSeriesSubtitleSelection$lambda$0(str, (SubtitlePreferences.SeriesSubtitlePref) obj));
            case 28:
                return TextFieldImplKt.defaultErrorSemantics$lambda$22(str, (SemanticsPropertyReceiver) obj);
            default:
                return TimePickerKt.ClockText$lambda$83$lambda$82$lambda$81(str, (SemanticsPropertyReceiver) obj);
        }
    }
}
