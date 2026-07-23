package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.DanmakuMemory;
import com.dh.myembyapp.data.model.DanmakuAnime;
import com.dh.myembyapp.data.model.DanmakuEpisode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class my implements Function0 {
    public final /* synthetic */ DanmakuEpisode a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ DanmakuMemory d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function4 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;

    public my(DanmakuEpisode danmakuEpisode, String str, String str2, DanmakuMemory danmakuMemory, String str3, Function4 function4, Function0 function0, MutableState mutableState, MutableState mutableState2) {
        this.a = danmakuEpisode;
        this.b = str;
        this.c = str2;
        this.d = danmakuMemory;
        this.e = str3;
        this.g = function4;
        this.h = function0;
        this.i = mutableState;
        this.j = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String animeTitle;
        String str = (String) this.i.getValue();
        String str2 = str == null ? "" : str;
        MutableState mutableState = this.j;
        DanmakuAnime danmakuAnime = (DanmakuAnime) mutableState.getValue();
        String str3 = (danmakuAnime == null || (animeTitle = danmakuAnime.getAnimeTitle()) == null) ? "" : animeTitle;
        DanmakuAnime danmakuAnime2 = (DanmakuAnime) mutableState.getValue();
        int animeId = danmakuAnime2 != null ? danmakuAnime2.getAnimeId() : 0;
        Log.d("DanmakuSearch", "========== 用户选择具体集 ==========");
        DanmakuEpisode danmakuEpisode = this.a;
        Log.d("DanmakuSearch", "剧集标题: " + danmakuEpisode.getEpisodeTitle());
        Log.d("DanmakuSearch", "剧集ID: " + danmakuEpisode.getEpisodeId());
        Log.d("DanmakuSearch", "番剧标题: ".concat(str3));
        Log.d("DanmakuSearch", "番剧ID: " + animeId);
        Log.d("DanmakuSearch", "来源API: ".concat(str2));
        String str4 = this.b;
        ll0.l("媒体类型: ", str4, "DanmakuSearch");
        Log.d("DanmakuSearch", "媒体ID: " + this.c);
        if (Intrinsics.areEqual(str4, "Movie")) {
            Log.d("DanmakuSearch", "保存电影弹幕记忆...");
            this.d.saveMovieDanmaku(this.c, str2, danmakuEpisode.getEpisodeId(), str3, danmakuEpisode.getEpisodeTitle());
        } else if (Intrinsics.areEqual(str4, "Episode")) {
            Log.d("DanmakuSearch", "保存剧集弹幕记忆...");
            this.d.saveEpisodeDanmaku(this.c, str2, danmakuEpisode.getEpisodeId(), str3, danmakuEpisode.getEpisodeTitle());
            String str5 = this.e;
            if (str5 != null) {
                Log.d("DanmakuSearch", "同时保存季级别记忆...");
                Log.d("DanmakuSearch", "季ID: ".concat(str5));
                this.d.saveSeasonDanmaku(str5, str2, animeId, str3);
            }
        }
        Log.d("DanmakuSearch", "======================================");
        this.g.invoke(Long.valueOf(danmakuEpisode.getEpisodeId()), str2, str3, danmakuEpisode.getEpisodeTitle());
        this.h.invoke();
        return Unit.INSTANCE;
    }
}
