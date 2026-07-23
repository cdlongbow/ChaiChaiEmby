package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.DanmakuAnime;
import com.dh.myembyapp.data.model.DanmakuEpisode;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class iy implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DanmakuAnime b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;

    public iy(int i, DanmakuAnime danmakuAnime, String str, String str2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.a = i;
        this.b = danmakuAnime;
        this.c = str;
        this.d = str2;
        this.e = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.e.setValue(Integer.valueOf(this.a));
        MutableState mutableState = this.g;
        DanmakuAnime danmakuAnime = this.b;
        mutableState.setValue(danmakuAnime);
        MutableState mutableState2 = this.h;
        String str = this.c;
        mutableState2.setValue(str);
        Log.d("DanmakuSearch", "========== 用户选择番剧 ==========");
        Log.d("DanmakuSearch", "番剧标题: " + danmakuAnime.getAnimeTitle());
        Log.d("DanmakuSearch", "番剧ID: " + danmakuAnime.getAnimeId());
        Log.d("DanmakuSearch", "来源API: " + str);
        List<DanmakuEpisode> episodes = danmakuAnime.getEpisodes();
        Log.d("DanmakuSearch", "剧集数量: " + (episodes != null ? episodes.size() : 0));
        Log.d("DanmakuSearch", "媒体类型: " + this.d);
        Log.d("DanmakuSearch", "注意：季级别记忆将在选择具体集时保存");
        Log.d("DanmakuSearch", "===================================");
        return Unit.INSTANCE;
    }
}
