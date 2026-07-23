package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.drm.DrmSession;
import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.model.PlaybackInfoRequest;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.InlineMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class kb0 {
    public static void A(int i, DrawContext drawContext, long j, int i2) {
        InlineMarker.finallyStart(i);
        drawContext.getCanvas().restore();
        drawContext.mo5628setSizeuvyYCjk(j);
        InlineMarker.finallyEnd(i2);
    }

    public static void B(MutableState mutableState, FocusState focusState) {
        focusState.getClass();
        mutableState.setValue(Boolean.valueOf(focusState.isFocused()));
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.close();
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static /* synthetic */ void E(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            b0.h((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else if (autoCloseable instanceof ContentProviderClient) {
            ((ContentProviderClient) autoCloseable).release();
        } else {
            rd1.u();
        }
    }

    public static void F(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
    }

    public static void G(String str, String str2, String str3, Exception exc) {
        Log.e(str3, str + str2, exc);
    }

    public static float H(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static PathBuilder I(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.verticalLineToRelative(f5);
        return pathBuilder;
    }

    public static void J(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
    }

    public static float K(float f, float f2, float f3, float f4) {
        return (f * f2 * f3) + f4;
    }

    public static void L(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.close();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void M(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.lineTo(f3, f4);
    }

    public static void N(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.close();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void O(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.close();
    }

    public static void P(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.close();
        pathBuilder.moveTo(f3, f4);
    }

    public static void Q(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void R(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void S(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
    }

    public static void T(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.acquire(null);
        }
        if (drmSession != null) {
            drmSession.release(null);
        }
    }

    public static /* synthetic */ Object U(EmbyApiService embyApiService, String str, String str2, boolean z, String str3, String str4, Integer num, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: searchItems");
            return null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = "PrimaryImageAspectRatio,BasicSyncInfo,ProductionYear,PremiereDate,CommunityRating,ChildCount,UserData";
        }
        return embyApiService.searchItems(str, str2, z2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num, continuation);
    }

    public static /* synthetic */ void V(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: translate");
            return;
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawTransform.translate(f, f2);
    }

    public static /* synthetic */ void a(DrawTransform drawTransform, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
            return;
        }
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = Float.intBitsToFloat((int) (drawTransform.mo5632getSizeNHjbRc() >> 32));
        }
        if ((i2 & 8) != 0) {
            f4 = Float.intBitsToFloat((int) (drawTransform.mo5632getSizeNHjbRc() & 4294967295L));
        }
        if ((i2 & 16) != 0) {
            i = ClipOp.INSTANCE.m5141getIntersectrtfAjoo();
        }
        drawTransform.mo5630clipRectN_I0leg(f, f2, f3, f4, i);
    }

    public static /* synthetic */ Object b(EmbyApiService embyApiService, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, int i, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: findItemsByProviderId");
            return null;
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        if ((i2 & 16) != 0) {
            z2 = true;
        }
        if ((i2 & 32) != 0) {
            str4 = "Primary,Backdrop,Thumb";
        }
        if ((i2 & 64) != 0) {
            str5 = "BasicSyncInfo,ProviderIds,ProductionYear,Container,ParentId,UserData,ChildCount,RecursiveItemCount";
        }
        if ((i2 & 128) != 0) {
            i = 10;
        }
        return embyApiService.findItemsByProviderId(str, str2, str3, z, z2, str4, str5, i, continuation);
    }

    public static /* synthetic */ Object c(EmbyApiService embyApiService, String str, String str2, String str3, boolean z, String str4, String str5, String str6, int i, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getContainingCollections");
            return null;
        }
        if ((i2 & 4) != 0) {
            str3 = "BoxSet";
        }
        return embyApiService.getContainingCollections(str, str2, str3, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? "SortName" : str4, (i2 & 32) != 0 ? "BasicSyncInfo,CanDelete,CanDownload,PrimaryImageAspectRatio,ProductionYear,PremiereDate,CommunityRating,ChildCount,UserData" : str5, (i2 & 64) != 0 ? "Primary,Backdrop,Thumb" : str6, (i2 & 128) != 0 ? 12 : i, continuation);
    }

    public static /* synthetic */ Object d(EmbyApiService embyApiService, String str, String str2, String str3, String str4, String str5, String str6, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getEpisodes");
            return null;
        }
        if ((i & 8) != 0) {
            str4 = "PrimaryImageAspectRatio,Overview,UserData,RunTimeTicks,LastPlayedDate,MediaSources,MediaStreams,Path,AlternateMediaSources,DateCreated";
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            str5 = null;
        }
        String str8 = str5;
        if ((i & 32) != 0) {
            str6 = "Descending";
        }
        return embyApiService.getEpisodes(str, str2, str3, str7, str8, str6, continuation);
    }

    public static /* synthetic */ Object e(EmbyApiService embyApiService, String str, String str2, String str3, String str4, String str5, String str6, String str7, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getEpisodesForCrossServerMatch");
            return null;
        }
        if ((i & 8) != 0) {
            str4 = "Primary,Backdrop,Thumb";
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = "BasicSyncInfo,MediaSources,MediaStreams,ParentId,AlternateMediaSources,SeriesId,SeasonId,IndexNumber,ParentIndexNumber,PremiereDate,RunTimeTicks,Container";
        }
        return embyApiService.getEpisodesForCrossServerMatch(str, str2, str3, str8, str5, (i & 32) != 0 ? "IndexNumber" : str6, (i & 64) != 0 ? "Ascending" : str7, continuation);
    }

    public static /* synthetic */ Object f(EmbyApiService embyApiService, String str, String str2, boolean z, String str3, String str4, String str5, String str6, boolean z2, String str7, Integer num, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            return embyApiService.getFavoriteItems(str, (i & 2) != 0 ? "IsFavorite" : str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? "SortName" : str3, (i & 16) != 0 ? "Ascending" : str4, (i & 32) != 0 ? "PrimaryImageAspectRatio,BasicSyncInfo,ProductionYear,PremiereDate,CommunityRating,ChildCount,UserData" : str5, (i & 64) != 0 ? "Movie,Series,Episode,BoxSet" : str6, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? "Primary,Backdrop,Thumb" : str7, (i & 512) != 0 ? null : num, continuation);
        }
        lm.e("Super calls with default arguments not supported in this target, function: getFavoriteItems");
        return null;
    }

    public static /* synthetic */ Object g(EmbyApiService embyApiService, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getItemDetails");
            return null;
        }
        if ((i & 4) != 0) {
            str3 = "Guid,PresentationUniqueKey,MediaSources,MediaStreams,Path,Size,Bitrate,RunTimeTicks,Container,Overview,Genres,CommunityRating,People,BasicSyncInfo,SeriesName,SeasonName,IndexNumber,ParentIndexNumber,ParentId,SeriesId,SeasonId,CollectionType,LocationType,ChildCount,ProviderIds,DateCreated";
        }
        return embyApiService.getItemDetails(str, str2, str3, continuation);
    }

    public static /* synthetic */ Object h(EmbyApiService embyApiService, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, Integer num, Integer num2, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            return embyApiService.getItems(str, str2, (i & 4) != 0 ? "SortName" : str3, (i & 8) != 0 ? "Ascending" : str4, (i & 16) != 0 ? "PrimaryImageAspectRatio,BasicSyncInfo,ProductionYear,PremiereDate,CommunityRating" : str5, (i & 32) != 0 ? true : z, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : num2, continuation);
        }
        lm.e("Super calls with default arguments not supported in this target, function: getItems");
        return null;
    }

    public static /* synthetic */ Object i(EmbyApiService embyApiService, String str, String str2, String str3, boolean z, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getItemsByIds");
            return null;
        }
        if ((i & 4) != 0) {
            str3 = "CommunityRating";
        }
        String str4 = str3;
        if ((i & 8) != 0) {
            z = true;
        }
        return embyApiService.getItemsByIds(str, str2, str4, z, continuation);
    }

    public static /* synthetic */ Object j(EmbyApiService embyApiService, String str, String str2, boolean z, String str3, String str4, String str5, String str6, Integer num, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getItemsByPerson");
            return null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return embyApiService.getItemsByPerson(str, str2, z, (i & 8) != 0 ? "Movie,Series" : str3, (i & 16) != 0 ? "PremiereDate,SortName" : str4, (i & 32) != 0 ? "Descending" : str5, (i & 64) != 0 ? "PrimaryImageAspectRatio,BasicSyncInfo,ProductionYear,PremiereDate,CommunityRating,ChildCount,UserData" : str6, (i & 128) != 0 ? null : num, continuation);
    }

    public static /* synthetic */ Object k(EmbyApiService embyApiService, String str, String str2, int i, boolean z, String str3, String str4, String str5, String str6, String str7, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getLastPlayedEpisodeForSeries");
            return null;
        }
        if ((i2 & 4) != 0) {
            i = 1;
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        if ((i2 & 16) != 0) {
            str3 = "Episode";
        }
        if ((i2 & 32) != 0) {
            str4 = "DatePlayed";
        }
        if ((i2 & 64) != 0) {
            str5 = "Descending";
        }
        if ((i2 & 128) != 0) {
            str6 = "IsPlayed";
        }
        if ((i2 & 256) != 0) {
            str7 = "BasicSyncInfo";
        }
        return embyApiService.getLastPlayedEpisodeForSeries(str, str2, i, z, str3, str4, str5, str6, str7, continuation);
    }

    public static /* synthetic */ Object l(EmbyApiService embyApiService, String str, int i, String str2, String str3, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getLatestMedia");
            return null;
        }
        if ((i2 & 2) != 0) {
            i = 20;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = "PrimaryImageAspectRatio,BasicSyncInfo,ProductionYear,PremiereDate,CommunityRating";
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return embyApiService.getLatestMedia(str, i3, str4, str3, continuation);
    }

    public static /* synthetic */ Object m(EmbyApiService embyApiService, String str, String str2, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getLibraries");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = "Guid,PresentationUniqueKey";
        }
        return embyApiService.getLibraries(str, str2, continuation);
    }

    public static /* synthetic */ Object n(EmbyApiService embyApiService, String str, String str2, boolean z, boolean z2, PlaybackInfoRequest playbackInfoRequest, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getPlaybackInfo");
            return null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        return embyApiService.getPlaybackInfo(str, str2, z3, z2, playbackInfoRequest, continuation);
    }

    public static /* synthetic */ Object o(EmbyApiService embyApiService, String str, int i, String str2, boolean z, String str3, String str4, String str5, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getResumeItems");
            return null;
        }
        if ((i2 & 2) != 0) {
            i = 20;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = "IsResumable";
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            str3 = "DatePlayed";
        }
        return embyApiService.getResumeItems(str, i3, str6, z2, str3, (i2 & 32) != 0 ? "Descending" : str4, (i2 & 64) != 0 ? "PrimaryImageAspectRatio,BasicSyncInfo,ProductionYear,PremiereDate" : str5, continuation);
    }

    public static /* synthetic */ Object p(EmbyApiService embyApiService, String str, String str2, int i, boolean z, String str3, String str4, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getResumeItemsForSeries");
            return null;
        }
        if ((i2 & 4) != 0) {
            i = 1;
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        if ((i2 & 16) != 0) {
            str3 = "BasicSyncInfo";
        }
        if ((i2 & 32) != 0) {
            str4 = "Video";
        }
        return embyApiService.getResumeItemsForSeries(str, str2, i, z, str3, str4, continuation);
    }

    public static /* synthetic */ Object q(EmbyApiService embyApiService, String str, int i, boolean z, String str2, int i2, String str3, String str4, Continuation continuation, int i3, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getResumeItemsV2");
            return null;
        }
        if ((i3 & 2) != 0) {
            i = 20;
        }
        int i4 = i;
        boolean z2 = (i3 & 4) != 0 ? true : z;
        if ((i3 & 8) != 0) {
            str2 = "BasicSyncInfo,CanDelete,PrimaryImageAspectRatio,ProductionYear";
        }
        return embyApiService.getResumeItemsV2(str, i4, z2, str2, (i3 & 16) != 0 ? 1 : i2, (i3 & 32) != 0 ? "Primary,Backdrop,Thumb" : str3, (i3 & 64) != 0 ? "Video" : str4, continuation);
    }

    public static /* synthetic */ Object r(EmbyApiService embyApiService, String str, String str2, int i, int i2, String str3, boolean z, Continuation continuation, int i3, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getSimilarItems");
            return null;
        }
        if ((i3 & 4) != 0) {
            i = 12;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = 1;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str3 = "BasicSyncInfo,CanDelete,CanDownload,PrimaryImageAspectRatio,ProductionYear,Status,EndDate,CommunityRating,ChildCount,RecursiveItemCount";
        }
        String str4 = str3;
        if ((i3 & 32) != 0) {
            z = false;
        }
        return embyApiService.getSimilarItems(str, str2, i4, i5, str4, z, continuation);
    }

    public static float s(float f, float f2, float f3, float f4) {
        return (f * f2) + f3 + f4;
    }

    public static int t(Shape shape, int i, int i2) {
        return (shape.hashCode() + i) * i2;
    }

    public static long u(Composer composer, int i, MaterialTheme materialTheme, Composer composer2, int i2) {
        composer.startReplaceGroup(i);
        long jM2205getOnSurface0d7_KjU = materialTheme.getColorScheme(composer2, i2).getOnSurface();
        composer.endReplaceGroup();
        return jM2205getOnSurface0d7_KjU;
    }

    public static Modifier v(float f, Modifier modifier, long j) {
        return BackgroundKt.m274backgroundbw27NRU(modifier, j, RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(f)));
    }

    public static PathBuilder w(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.lineToRelative(f4, f5);
        return pathBuilder;
    }

    public static String x(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder y(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence5);
        return sb;
    }

    public static StringBuilder z(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }
}
