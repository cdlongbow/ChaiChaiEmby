package defpackage;

import android.os.Build;
import android.text.Html;
import android.util.Log;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.media3.common.Player;
import com.dh.myembyapp.data.DanmakuSettings;





import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l00 {
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v2 Object, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void a(java.util.List r34, androidx.media3.common.Player r35, boolean r36, float r37, int r38, com.dh.myembyapp.data.DanmakuSettings r39, androidx.compose.ui.Modifier r40, androidx.compose.runtime.Composer r41, int r42) {
        /*
            Method dump skipped, instruction units count: 1436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l00.a(java.util.List, androidx.media3.common.Player, boolean, float, int, com.dh.myembyapp.data.DanmakuSettings, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    public static final void b(DanmakuPlayer danmakuPlayer, State state) {
        if (((Boolean) state.getValue()).booleanValue()) {
            DanmakuPlayer.start$default(danmakuPlayer, null, 1, null);
        } else {
            danmakuPlayer.pause();
        }
    }

    public static final DanmakuConfig c(DanmakuSettings danmakuSettings, float f) {
        int i;
        long speed = (long) ((8000.0f / danmakuSettings.getSpeed()) * f);
        float size = danmakuSettings.getSize();
        float opacity = danmakuSettings.getOpacity() / 100.0f;
        float screenPart = danmakuSettings.getScreenPart();
        float screenPart2 = danmakuSettings.getScreenPart();
        if (screenPart2 <= 0.2f) {
            i = 36;
        } else {
            i = screenPart2 <= 0.5f ? 48 : 60;
        }
        List listListOf = CollectionsKt.listOf(new QuantityFilter(i));
        OverlappingFilter overlappingFilter = new OverlappingFilter();
        Boolean bool = Boolean.TRUE;
        overlappingFilter.setEnablePairs(MapsKt.mapOf(TuplesKt.to(1, bool), TuplesKt.to(5, bool), TuplesKt.to(4, bool)));
        return new DanmakuConfig(0, 0L, 0L, speed, size, 0.0f, screenPart, opacity, false, 0, false, false, 0, 0, 0, 0, 0, 0, 0, 0, listListOf, CollectionsKt.listOf(overlappingFilter), 1046311, null);
    }

    public static final void d(MutableState mutableState, MutableIntState mutableIntState, String str, Long l) {
        mutableState.setValue(null);
        mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
        if (l == null) {
            Log.d("DanmakuView", "🔁 触发弹幕重载: ".concat(str));
            return;
        }
        Log.d("DanmakuView", "🔁 触发弹幕重载: " + str + ", target=" + l + "ms");
    }

    public static final void e(Player player, DanmakuPlayer danmakuPlayer, State state, State state2, State state3, State state4, State state5, boolean z) {
        if (((up1) state.getValue()) == null) {
            return;
        }
        danmakuPlayer.seekTo(f(player, ((Number) state2.getValue()).intValue()));
        if (z) {
            danmakuPlayer.updateConfig(c((DanmakuSettings) state3.getValue(), ((Number) state4.getValue()).floatValue()));
        }
        danmakuPlayer.updatePlaySpeed(((Number) state4.getValue()).floatValue());
        b(danmakuPlayer, state5);
    }

    public static final long f(Player player, int i) {
        return RangesKt.coerceAtLeast(RangesKt.coerceAtLeast(player.getCurrentPosition(), 0L) - (((long) i) * 1000), 0L);
    }

    public static final int g(List list, long j) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = (i + size) >>> 1;
            if (((DanmakuItemData) list.get(i2)).getPosition() < j) {
                i = i2 + 1;
            } else {
                size = i2;
            }
        }
        return i;
    }

    public static final String h(String str) {
        try {
            if (StringsKt__str.contains("&#")) {
                str = Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0).toString() : Html.fromHtml(str).toString();
            }
        } catch (Exception e) {
            Log.w("DanmakuView", "解码HTML实体失败: " + str + ", " + e.getMessage());
            str = new Regex("&#\\d+;").replace(str, "");
        }
        return new Regex("\\[[^\\]]{1,4}\\]").replace(str, "");
    }
}
