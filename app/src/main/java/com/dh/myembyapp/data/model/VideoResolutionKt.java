package com.dh.myembyapp.data.model;

import defpackage.mr;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoResolutionKt {
    public static final String buildVideoResolutionLabel(MediaSource mediaSource, ResolutionLabelStyle resolutionLabelStyle) {
        MediaStream mediaStream;
        Integer height;
        Integer width;
        List<MediaStream> mediaStreams;
        Object next;
        resolutionLabelStyle.getClass();
        if (mediaSource == null || (mediaStreams = mediaSource.getMediaStreams()) == null) {
            mediaStream = null;
        } else {
            Iterator<T> it = mediaStreams.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((MediaStream) next).getType(), "Video"));
            mediaStream = (MediaStream) next;
        }
        int iIntValue = 0;
        int iIntValue2 = (mediaStream == null || (width = mediaStream.getWidth()) == null) ? 0 : width.intValue();
        if (mediaStream != null && (height = mediaStream.getHeight()) != null) {
            iIntValue = height.intValue();
        }
        VideoResolution videoResolutionResolveVideoResolution = resolveVideoResolution(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
        if (videoResolutionResolveVideoResolution != null) {
            return videoResolutionResolveVideoResolution.label(resolutionLabelStyle);
        }
        if (iIntValue <= 0) {
            if (iIntValue2 > 0) {
                return "SD";
            }
            VideoResolution videoResolution = parseVideoResolution(mediaSource != null ? mediaSource.getName() : null, mediaSource != null ? mediaSource.getPath() : null);
            if (videoResolution != null) {
                return videoResolution.label(resolutionLabelStyle);
            }
            return null;
        }
        if (resolutionLabelStyle == ResolutionLabelStyle.UPPERCASE) {
            return iIntValue + "P";
        }
        return iIntValue + TtmlNode.TAG_P;
    }

    public static /* synthetic */ String buildVideoResolutionLabel$default(MediaSource mediaSource, ResolutionLabelStyle resolutionLabelStyle, int i, Object obj) {
        if ((i & 2) != 0) {
            resolutionLabelStyle = ResolutionLabelStyle.UPPERCASE;
        }
        return buildVideoResolutionLabel(mediaSource, resolutionLabelStyle);
    }

    public static final VideoResolution parseVideoResolution(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        String lowerCase = mr.C(str, " ", str2).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        boolean zContainsMatchIn = new Regex("(^|[^a-z0-9])hd([^a-z0-9]|$)").containsMatchIn(lowerCase);
        if (StringsKt__lowerCase.contains("2160p") || StringsKt__lowerCase.contains("4k") || StringsKt__lowerCase.contains("uhd")) {
            return VideoResolution.UHD_4K;
        }
        if (StringsKt__lowerCase.contains("1440p") || StringsKt__lowerCase.contains("2k") || StringsKt__lowerCase.contains("qhd")) {
            return VideoResolution.QHD_2K;
        }
        if (StringsKt__lowerCase.contains("1080p") || StringsKt__lowerCase.contains("1080i") || StringsKt__lowerCase.contains("fhd")) {
            return VideoResolution.FULL_HD_1080;
        }
        if (StringsKt__lowerCase.contains("720p") || StringsKt__lowerCase.contains("720i") || zContainsMatchIn) {
            return VideoResolution.HD_720;
        }
        if (StringsKt__lowerCase.contains("480p") || StringsKt__lowerCase.contains("480i") || StringsKt__lowerCase.contains("sd")) {
            return VideoResolution.SD_480;
        }
        return null;
    }

    public static final VideoResolution resolveVideoResolution(Integer num, Integer num2) {
        int iIntValue = num != null ? num.intValue() : 0;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        int iMax = Math.max(iIntValue, iIntValue2);
        int iMin = Math.min(iIntValue, iIntValue2);
        if (iMax >= 3800 || iMin >= 2160) {
            return VideoResolution.UHD_4K;
        }
        if (iMax >= 2500 || iMin >= 1440) {
            return VideoResolution.QHD_2K;
        }
        if (iMax >= 1900 || iMin >= 1080) {
            return VideoResolution.FULL_HD_1080;
        }
        if (iMax >= 1200 || iMin >= 720) {
            return VideoResolution.HD_720;
        }
        if (iMax >= 800 || iMin >= 480) {
            return VideoResolution.SD_480;
        }
        return null;
    }

    public static final int resolveVideoResolutionLabelSortValue(String str) {
        String lowerCase;
        List<String> groupValues;
        String str2;
        Integer intOrNull;
        String string;
        if (str == null || (string = StringsKt.trim((CharSequence) str).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        if (lowerCase == null) {
            lowerCase = "";
        }
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 1657) {
            if (iHashCode != 1719) {
                if (iHashCode == 3665 && lowerCase.equals("sd")) {
                    return 360;
                }
            } else if (lowerCase.equals("4k")) {
                return 2160;
            }
        } else if (lowerCase.equals("2k")) {
            return 1440;
        }
        MatchResult matchResultFind$default = Regex.find$default(new Regex("(\\d{3,4})p"), lowerCase, 0, 2, null);
        if (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null || (str2 = (String) CollectionsKt.getOrNull(groupValues, 1)) == null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) {
            return 0;
        }
        return intOrNull.intValue();
    }

    public static final int resolveVideoResolutionSortValue(MediaSource mediaSource) {
        MediaStream mediaStream;
        Integer height;
        Integer width;
        List<MediaStream> mediaStreams;
        Object next;
        if (mediaSource == null || (mediaStreams = mediaSource.getMediaStreams()) == null) {
            mediaStream = null;
        } else {
            Iterator<T> it = mediaStreams.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((MediaStream) next).getType(), "Video"));
            mediaStream = (MediaStream) next;
        }
        int iIntValue = (mediaStream == null || (width = mediaStream.getWidth()) == null) ? 0 : width.intValue();
        int iIntValue2 = (mediaStream == null || (height = mediaStream.getHeight()) == null) ? 0 : height.intValue();
        VideoResolution videoResolutionResolveVideoResolution = resolveVideoResolution(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        if (videoResolutionResolveVideoResolution != null) {
            return videoResolutionResolveVideoResolution.getSortValue();
        }
        if (iIntValue2 > 0) {
            return iIntValue2;
        }
        if (iIntValue > 0) {
            return 360;
        }
        VideoResolution videoResolution = parseVideoResolution(mediaSource != null ? mediaSource.getName() : null, mediaSource != null ? mediaSource.getPath() : null);
        if (videoResolution != null) {
            return videoResolution.getSortValue();
        }
        return 0;
    }
}
