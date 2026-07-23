package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.DanmakuMemory;
import com.dh.myembyapp.data.api.DanmakuApiClient;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rw {
    public final DanmakuMemory a;
    public final Function1 b;
    public final Function2 c;

    public rw(DanmakuMemory danmakuMemory) {
        d6 d6Var = new d6(1, DanmakuApiClient.INSTANCE, DanmakuApiClient.class, "getServiceForUrl", "getServiceForUrl(Ljava/lang/String;)Lcom/dh/myembyapp/data/api/DanmakuApiService;", 0, 2);
        kw kwVar = new kw(2, null);
        this.a = danmakuMemory;
        this.b = d6Var;
        this.c = kwVar;
    }

    public static void h(MediaItem mediaItem, boolean z, boolean z2) {
        Log.d("DanmakuPlayer", "========================================");
        Log.d("DanmakuPlayer", "开始弹幕匹配流程");
        Log.d("DanmakuPlayer", "媒体ID: " + mediaItem.getId());
        Log.d("DanmakuPlayer", "媒体类型: " + mediaItem.getType());
        Log.d("DanmakuPlayer", "媒体名称: " + mediaItem.getName());
        if (Intrinsics.areEqual(mediaItem.getType(), "Episode")) {
            Log.d("DanmakuPlayer", "剧集名称: " + mediaItem.getSeriesName());
            String seasonId = mediaItem.getSeasonId();
            if (seasonId == null) {
                seasonId = mediaItem.getParentId();
            }
            Log.d("DanmakuPlayer", "季ID: " + seasonId);
            Log.d("DanmakuPlayer", "季数: " + mediaItem.getParentIndexNumber());
            Log.d("DanmakuPlayer", "集数: " + mediaItem.getIndexNumber());
        }
        Log.d("DanmakuPlayer", "弹幕显示状态: " + z2);
        Log.d("DanmakuPlayer", "直接URL模式: " + z);
        Log.d("DanmakuPlayer", "========================================");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009d A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:14:0x0037, B:41:0x00b6, B:43:0x00ba, B:45:0x00d9, B:44:0x00cd, B:21:0x0052, B:36:0x0099, B:38:0x009d, B:24:0x0063, B:30:0x007e, B:32:0x0082, B:27:0x006a), top: B:49:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:14:0x0037, B:41:0x00b6, B:43:0x00ba, B:45:0x00d9, B:44:0x00cd, B:21:0x0052, B:36:0x0099, B:38:0x009d, B:24:0x0063, B:30:0x007e, B:32:0x0082, B:27:0x006a), top: B:49:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:14:0x0037, B:41:0x00b6, B:43:0x00ba, B:45:0x00d9, B:44:0x00cd, B:21:0x0052, B:36:0x0099, B:38:0x009d, B:24:0x0063, B:30:0x007e, B:32:0x0082, B:27:0x006a), top: B:49:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
    
        if (r14 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.dh.myembyapp.data.model.MediaItem r10, com.dh.myembyapp.data.model.DanmakuConfig r11, boolean r12, boolean r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw.a(com.dh.myembyapp.data.model.MediaItem, com.dh.myembyapp.data.model.DanmakuConfig, boolean, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0383  */
    /* JADX WARN: Code duplicated, block: B:207:0x069d A[Catch: Exception -> 0x069b, TRY_LEAVE, TryCatch #9 {Exception -> 0x069b, blocks: (B:204:0x0681, B:207:0x069d), top: B:242:0x0681 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x0366 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x02da  */
    /* JADX WARN: Code duplicated, block: B:92:0x0353  */
    /* JADX WARN: Code duplicated, block: B:97:0x036e A[Catch: Exception -> 0x0677, TryCatch #3 {Exception -> 0x0677, blocks: (B:95:0x0366, B:97:0x036e, B:99:0x0377, B:101:0x037d, B:104:0x038d), top: B:230:0x0366 }] */
    /* JADX WARN: Type inference failed for: r13v13, types: [com.dh.myembyapp.data.model.DanmakuMatch, java.lang.Object, java.lang.String, java.util.Iterator] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0411 -> B:268:0x0415). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:221:0x06fb -> B:212:0x06d7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(com.dh.myembyapp.data.model.MediaItem r33, com.dh.myembyapp.data.model.DanmakuConfig r34, boolean r35, kotlin.coroutines.jvm.internal.ContinuationImpl r36) {
        /*
            Method dump skipped, instruction units count: 1842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw.b(com.dh.myembyapp.data.model.MediaItem, com.dh.myembyapp.data.model.DanmakuConfig, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f7 A[Catch: Exception -> 0x006a, TRY_ENTER, TryCatch #4 {Exception -> 0x006a, blocks: (B:33:0x00f7, B:35:0x00fd, B:37:0x0103, B:16:0x0065), top: B:84:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x010a  */
    /* JADX WARN: Code duplicated, block: B:42:0x010d A[Catch: Exception -> 0x017f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x017f, blocks: (B:31:0x00ed, B:42:0x010d), top: B:78:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0183  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0183 -> B:73:0x021d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0206 -> B:71:0x0209). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0218 -> B:71:0x0209). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(java.lang.String r22, long r23, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, kotlin.jvm.functions.Function1 r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw.c(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(MediaItem mediaItem, ContinuationImpl continuationImpl) {
        ow owVar;
        DanmakuMemory.SeasonDanmakuMemory seasonDanmaku;
        MediaItem mediaItem2;
        String str;
        Integer num;
        DanmakuMemory.SeasonDanmakuMemory seasonDanmakuMemory;
        if (continuationImpl instanceof ow) {
            owVar = (ow) continuationImpl;
            int i = owVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                owVar.h = i - Integer.MIN_VALUE;
            } else {
                owVar = new ow(this, continuationImpl);
            }
        } else {
            owVar = new ow(this, continuationImpl);
        }
        Object obj = owVar.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = owVar.h;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(mediaItem.getType(), "Episode")) {
                Log.d("DanmakuPlayer", "【优先级2】检查季级别记忆（仅剧集）...");
                String seasonId = mediaItem.getSeasonId();
                if (seasonId == null) {
                    seasonId = mediaItem.getParentId();
                }
                Integer indexNumber = mediaItem.getIndexNumber();
                if (seasonId != null && indexNumber != null && (seasonDanmaku = this.a.getSeasonDanmaku(seasonId)) != null) {
                    Log.d("DanmakuPlayer", "找到季级别弹幕记忆: " + seasonDanmaku.getAnimeTitle() + ", 尝试匹配第" + indexNumber + "集");
                    int iIntValue = indexNumber.intValue();
                    owVar.a = null;
                    owVar.b = null;
                    owVar.c = indexNumber;
                    owVar.d = seasonDanmaku;
                    owVar.h = 1;
                    Object objE = e(seasonDanmaku, iIntValue, owVar);
                    if (objE != coroutine_suspended) {
                        mediaItem2 = mediaItem;
                        str = seasonId;
                        obj = objE;
                        num = indexNumber;
                        seasonDanmakuMemory = seasonDanmaku;
                    }
                }
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        seasonDanmakuMemory = (DanmakuMemory.SeasonDanmakuMemory) owVar.d;
        num = (Integer) owVar.c;
        str = (String) owVar.b;
        mediaItem2 = (MediaItem) owVar.a;
        ResultKt.throwOnFailure(obj);
        jw jwVar = (jw) obj;
        if (jwVar != null) {
            return jwVar;
        }
        int iIntValue2 = num.intValue();
        owVar.a = null;
        owVar.b = null;
        owVar.c = null;
        owVar.d = null;
        owVar.h = 2;
        Object objF = f(seasonDanmakuMemory, iIntValue2, owVar);
        return objF == coroutine_suspended ? coroutine_suspended : objF;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e8 A[Catch: Exception -> 0x006a, TryCatch #1 {Exception -> 0x006a, blocks: (B:35:0x00e0, B:37:0x00e8, B:39:0x00f0, B:42:0x00f8, B:44:0x00fe, B:17:0x0063), top: B:95:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f0 A[Catch: Exception -> 0x006a, TryCatch #1 {Exception -> 0x006a, blocks: (B:35:0x00e0, B:37:0x00e8, B:39:0x00f0, B:42:0x00f8, B:44:0x00fe, B:17:0x0063), top: B:95:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f8 A[Catch: Exception -> 0x006a, TryCatch #1 {Exception -> 0x006a, blocks: (B:35:0x00e0, B:37:0x00e8, B:39:0x00f0, B:42:0x00f8, B:44:0x00fe, B:17:0x0063), top: B:95:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c1 A[Catch: Exception -> 0x0156, TryCatch #3 {Exception -> 0x0156, blocks: (B:48:0x0108, B:49:0x013c, B:51:0x0142, B:57:0x015a, B:59:0x015f, B:63:0x019e, B:65:0x01a8, B:67:0x01ae, B:69:0x01b4, B:74:0x01c1, B:76:0x0229, B:77:0x022c, B:78:0x0249, B:79:0x0256), top: B:99:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0229 A[Catch: Exception -> 0x0156, TryCatch #3 {Exception -> 0x0156, blocks: (B:48:0x0108, B:49:0x013c, B:51:0x0142, B:57:0x015a, B:59:0x015f, B:63:0x019e, B:65:0x01a8, B:67:0x01ae, B:69:0x01b4, B:74:0x01c1, B:76:0x0229, B:77:0x022c, B:78:0x0249, B:79:0x0256), top: B:99:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0249 A[Catch: Exception -> 0x0156, TryCatch #3 {Exception -> 0x0156, blocks: (B:48:0x0108, B:49:0x013c, B:51:0x0142, B:57:0x015a, B:59:0x015f, B:63:0x019e, B:65:0x01a8, B:67:0x01ae, B:69:0x01b4, B:74:0x01c1, B:76:0x0229, B:77:0x022c, B:78:0x0249, B:79:0x0256), top: B:99:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0256 A[Catch: Exception -> 0x0156, TRY_LEAVE, TryCatch #3 {Exception -> 0x0156, blocks: (B:48:0x0108, B:49:0x013c, B:51:0x0142, B:57:0x015a, B:59:0x015f, B:63:0x019e, B:65:0x01a8, B:67:0x01ae, B:69:0x01b4, B:74:0x01c1, B:76:0x0229, B:77:0x022c, B:78:0x0249, B:79:0x0256), top: B:99:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v11, types: [com.dh.myembyapp.data.model.DanmakuBangumi, com.dh.myembyapp.data.model.DanmakuEpisode, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.dh.myembyapp.data.model.DanmakuBangumi] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [com.dh.myembyapp.data.model.DanmakuBangumi] */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0275 -> B:90:0x02d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x02cb -> B:88:0x02ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x02d4 -> B:88:0x02ce). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(com.dh.myembyapp.data.DanmakuMemory.SeasonDanmakuMemory r26, int r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw.e(com.dh.myembyapp.data.DanmakuMemory$SeasonDanmakuMemory, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4 A[Catch: Exception -> 0x0064, TryCatch #3 {Exception -> 0x0064, blocks: (B:35:0x00dc, B:37:0x00e4, B:39:0x00ec, B:41:0x00f2, B:44:0x00fc, B:46:0x0102, B:49:0x010a, B:50:0x0141, B:52:0x0147, B:56:0x015c, B:58:0x0161, B:17:0x005e), top: B:106:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec A[Catch: Exception -> 0x0064, TryCatch #3 {Exception -> 0x0064, blocks: (B:35:0x00dc, B:37:0x00e4, B:39:0x00ec, B:41:0x00f2, B:44:0x00fc, B:46:0x0102, B:49:0x010a, B:50:0x0141, B:52:0x0147, B:56:0x015c, B:58:0x0161, B:17:0x005e), top: B:106:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc A[Catch: Exception -> 0x0064, TryCatch #3 {Exception -> 0x0064, blocks: (B:35:0x00dc, B:37:0x00e4, B:39:0x00ec, B:41:0x00f2, B:44:0x00fc, B:46:0x0102, B:49:0x010a, B:50:0x0141, B:52:0x0147, B:56:0x015c, B:58:0x0161, B:17:0x005e), top: B:106:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c6 A[Catch: Exception -> 0x01bf, TryCatch #0 {Exception -> 0x01bf, blocks: (B:61:0x0195, B:65:0x01a0, B:67:0x01aa, B:69:0x01b0, B:71:0x01b6, B:78:0x01c6, B:80:0x022e, B:83:0x0235, B:84:0x0256, B:85:0x0262), top: B:100:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:80:0x022e A[Catch: Exception -> 0x01bf, TryCatch #0 {Exception -> 0x01bf, blocks: (B:61:0x0195, B:65:0x01a0, B:67:0x01aa, B:69:0x01b0, B:71:0x01b6, B:78:0x01c6, B:80:0x022e, B:83:0x0235, B:84:0x0256, B:85:0x0262), top: B:100:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0256 A[Catch: Exception -> 0x01bf, TryCatch #0 {Exception -> 0x01bf, blocks: (B:61:0x0195, B:65:0x01a0, B:67:0x01aa, B:69:0x01b0, B:71:0x01b6, B:78:0x01c6, B:80:0x022e, B:83:0x0235, B:84:0x0256, B:85:0x0262), top: B:100:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0262 A[Catch: Exception -> 0x01bf, TRY_LEAVE, TryCatch #0 {Exception -> 0x01bf, blocks: (B:61:0x0195, B:65:0x01a0, B:67:0x01aa, B:69:0x01b0, B:71:0x01b6, B:78:0x01c6, B:80:0x022e, B:83:0x0235, B:84:0x0256, B:85:0x0262), top: B:100:0x0195 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v19, types: [com.dh.myembyapp.data.model.DanmakuAnime, com.dh.myembyapp.data.model.DanmakuEpisode, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.dh.myembyapp.data.model.DanmakuAnime] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [com.dh.myembyapp.data.model.DanmakuAnime] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0280 -> B:87:0x0283). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x02d1 -> B:95:0x02d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x02d7 -> B:97:0x02dc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(com.dh.myembyapp.data.DanmakuMemory.SeasonDanmakuMemory r26, int r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw.f(com.dh.myembyapp.data.DanmakuMemory$SeasonDanmakuMemory, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object g(MediaItem mediaItem, lw lwVar) {
        DanmakuMemory.EpisodeDanmakuMemory episodeDanmaku;
        Log.d("DanmakuPlayer", "【优先级1】检查具体集/电影记忆...");
        String type = mediaItem.getType();
        boolean zAreEqual = Intrinsics.areEqual(type, "Movie");
        DanmakuMemory danmakuMemory = this.a;
        if (zAreEqual) {
            DanmakuMemory.MovieDanmakuMemory movieDanmaku = danmakuMemory.getMovieDanmaku(mediaItem.getId());
            if (movieDanmaku == null) {
                return null;
            }
            s01.E("找到电影弹幕记忆: ", movieDanmaku.getAnimeTitle(), " - ", movieDanmaku.getEpisodeTitle(), "DanmakuPlayer");
            return c(movieDanmaku.getApiUrl(), movieDanmaku.getEpisodeId(), movieDanmaku.getAnimeTitle(), movieDanmaku.getEpisodeTitle(), "记忆匹配(电影)", "电影记忆弹幕加载", "电影记忆弹幕加载失败", new c(movieDanmaku, 21), lwVar);
        }
        if (!Intrinsics.areEqual(type, "Episode") || (episodeDanmaku = danmakuMemory.getEpisodeDanmaku(mediaItem.getId())) == null) {
            return null;
        }
        s01.E("找到剧集弹幕记忆: ", episodeDanmaku.getAnimeTitle(), " - ", episodeDanmaku.getEpisodeTitle(), "DanmakuPlayer");
        return c(episodeDanmaku.getApiUrl(), episodeDanmaku.getEpisodeId(), episodeDanmaku.getAnimeTitle(), episodeDanmaku.getEpisodeTitle(), "记忆匹配(剧集)", "剧集记忆弹幕加载", "剧集记忆弹幕加载失败", new c(episodeDanmaku, 22), lwVar);
    }
}
