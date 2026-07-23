package defpackage;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import com.dh.myembyapp.data.preferences.UserPreferences;

/* JADX INFO: loaded from: classes4.dex */
public final class on1 {
    public final UserPreferences a;
    public final MutableFloatState b;
    public final MutableState c;
    public final MutableState d;
    public final MutableState e;
    public final MutableIntState f;
    public final MutableIntState g;
    public final MutableState h;
    public final MutableState i;
    public final MutableState j;
    public final MutableState k;
    public final MutableState l;
    public final MutableState m;

    public on1(UserPreferences userPreferences) {
        userPreferences.getClass();
        this.a = userPreferences;
        this.b = PrimitiveSnapshotStateKt.mutableFloatStateOf(userPreferences.getPlaybackSpeed());
        this.c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(userPreferences.getSystemNetworkSpeedDisplayMode(), null, 2, null);
        this.d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(userPreferences.getSystemNetworkSpeedPosition(), null, 2, null);
        this.e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(userPreferences.getSystemTimeDisplayMode(), null, 2, null);
        this.f = SnapshotIntStateKt.mutableIntStateOf(userPreferences.getSeekIntervalSec());
        this.g = SnapshotIntStateKt.mutableIntStateOf(userPreferences.getAudioDelayMs());
        this.h = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(userPreferences.getPlayerResizeMode(), null, 2, null);
        this.i = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(userPreferences.getPlayerDefaultViewMode(), null, 2, null);
        this.j = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(userPreferences.getPlayerFrameRateMatchingMode(), null, 2, null);
        this.k = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(userPreferences.getVideoVersionPrioritySettings(), null, 2, null);
        this.l = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(userPreferences.getAudioVersionPrioritySettings(), null, 2, null);
        this.m = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(userPreferences.getSubtitleVersionPrioritySettings(), null, 2, null);
    }
}
