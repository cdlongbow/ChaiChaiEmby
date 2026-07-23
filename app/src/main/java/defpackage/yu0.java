package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.Chapter;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

import okhttp3.ResponseBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yu0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    public static final Object a(MediaItem mediaItem, ContinuationImpl continuationImpl) {
        xu0 xu0Var;
        if (continuationImpl instanceof xu0) {
            xu0Var = (xu0) continuationImpl;
            int i = xu0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xu0Var.d = i - Integer.MIN_VALUE;
            } else {
                xu0Var = new xu0(continuationImpl);
            }
        } else {
            xu0Var = new xu0(continuationImpl);
        }
        Object itemChapters = xu0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = xu0Var.d;
        boolean z = true;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(itemChapters);
                RetrofitClient retrofitClient = RetrofitClient.INSTANCE;
                String userId = retrofitClient.getUserId();
                Log.d("IntroOutro", "用户ID: " + userId);
                if (userId.length() == 0) {
                    Log.w("IntroOutro", "用户ID为空，无法获取章节信息");
                    return null;
                }
                Log.d("IntroOutro", "开始调用 API 获取章节信息...");
                EmbyApiService apiService = retrofitClient.getApiService();
                String id = mediaItem.getId();
                xu0Var.a = null;
                xu0Var.b = null;
                xu0Var.d = 1;
                itemChapters = apiService.getItemChapters(userId, id, "Chapters", xu0Var);
                if (itemChapters == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(itemChapters);
            }
            Response response = (Response) itemChapters;
            Log.d("IntroOutro", "API 响应码: " + response.code());
            if (!response.isSuccessful()) {
                Log.w("IntroOutro", "API 请求失败: " + response.code() + " - " + response.message());
                try {
                    ResponseBody responseBodyErrorBody = response.errorBody();
                    Log.w("IntroOutro", "错误详情: " + (responseBodyErrorBody != null ? responseBodyErrorBody.string() : null));
                    return null;
                } catch (Exception unused) {
                    Log.w("IntroOutro", "无法读取错误详情");
                    return null;
                }
            }
            MediaItem mediaItem2 = (MediaItem) response.body();
            Log.d("IntroOutro", "API 响应成功，MediaItem: " + (mediaItem2 != null));
            List<Chapter> chapters = mediaItem2 != null ? mediaItem2.getChapters() : null;
            if (chapters == null) {
                z = false;
            }
            Log.d("IntroOutro", "Chapters 字段: " + z);
            Log.d("IntroOutro", "章节数: " + (chapters != null ? chapters.size() : 0));
            if (chapters != null && !chapters.isEmpty()) {
                for (Chapter chapter : chapters) {
                    Log.d("IntroOutro", "章节详情: name='" + chapter.getName() + "', startPositionTicks=" + chapter.getStartPositionTicks() + ", markerType='" + chapter.getMarkerType() + "', chapterIndex=" + chapter.getChapterIndex());
                }
                uu0 uu0VarI = hg2.I(chapters);
                b(uu0VarI);
                return uu0VarI;
            }
            Log.w("IntroOutro", "章节列表为空或null");
            return null;
        } catch (Exception e) {
            kb0.G("获取章节信息异常: ", e.getMessage(), "IntroOutro", e);
            return null;
        }
    }

    public static final void b(uu0 uu0Var) {
        boolean z = uu0Var.e;
        Long l = uu0Var.d;
        if (!z) {
            Log.d("IntroOutro", "markerType 未命中，回退中文名称");
            Log.d("IntroOutro", "查找'正片'章节: " + uu0Var.i);
            Log.d("IntroOutro", "查找'片尾'章节: " + uu0Var.j);
            Log.i("IntroOutro", "✅ 使用中文名称兜底: 正片=" + uu0Var.c + "ms, 片尾=" + l + "ms");
            return;
        }
        Log.d("IntroOutro", "查找 IntroStart: true=" + uu0Var.f);
        Log.d("IntroOutro", "查找 IntroEnd: true=" + uu0Var.g);
        Log.d("IntroOutro", "查找 CreditsStart: true=" + uu0Var.h);
        Log.i("IntroOutro", "✅ 使用 markerType 解析: IntroStart=" + uu0Var.a + "ms, IntroEnd=" + uu0Var.b + "ms, CreditsStart=" + l + "ms（忽略中文名称）");
    }
}
