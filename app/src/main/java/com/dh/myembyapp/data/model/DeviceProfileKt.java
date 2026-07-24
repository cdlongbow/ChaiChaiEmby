package com.dh.myembyapp.data.model;

import androidx.media3.common.MimeTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class DeviceProfileKt {
    public static final DeviceProfile createAndroidTvDeviceProfile(long j, Integer num, Integer num2) {
        DeviceProfile deviceProfile = new DeviceProfile(j, j, j, CollectionsKt.listOf(new DirectPlayProfile("Video", "mov,mp4,mkv,webm,avi,flv,m4v,ts", "h264,hevc,hev1,vp9,mpeg4,mpeg2video", "aac,mp3,ac3,eac3,flac,opus,dts,dca,truehd,wav")), CollectionsKt.listOf(new TranscodingProfile("Video", "ts", "h264,hevc", "aac,mp3,ac3,eac3", "hls", null, null, 0, false, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null)), CollectionsKt.listOf((Object[]) new CodecProfile[]{new CodecProfile("Video", "h264", CollectionsKt.listOf((Object[]) new ProfileCondition[]{new ProfileCondition("NotEquals", "IsAnamorphic", "true", false, 8, null), new ProfileCondition("EqualsAny", "VideoProfile", "high|main|baseline|constrained baseline", false, 8, null), new ProfileCondition("LessThanEqual", "VideoLevel", "80", false, 8, null), new ProfileCondition("NotEquals", "IsInterlaced", "true", false, 8, null)})), new CodecProfile("Video", "hevc", CollectionsKt.listOf((Object[]) new ProfileCondition[]{new ProfileCondition("NotEquals", "IsAnamorphic", "true", false, 8, null), new ProfileCondition("EqualsAny", "VideoProfile", "high|main|main 10", false, 8, null), new ProfileCondition("LessThanEqual", "VideoLevel", "175", false, 8, null), new ProfileCondition("NotEquals", "IsInterlaced", "true", false, 8, null)}))}), CollectionsKt.listOf((Object[]) new SubtitleProfile[]{new SubtitleProfile("ass", "Embed"), new SubtitleProfile("ssa", "Embed"), new SubtitleProfile("subrip", "Embed"), new SubtitleProfile("sub", "Embed"), new SubtitleProfile("pgssub", "Embed"), new SubtitleProfile("subrip", "External"), new SubtitleProfile("sub", "External"), new SubtitleProfile("ass", "External"), new SubtitleProfile("ssa", "External"), new SubtitleProfile("vtt", "External")}), CollectionsKt.listOf(new ResponseProfile("Video", "m4v", MimeTypes.VIDEO_MP4)), null, 256, null);
        Integer num3 = null;
        Integer num4 = (num == null || num.intValue() <= 0) ? null : num;
        if (num2 != null && num2.intValue() > 0) {
            num3 = num2;
        }
        boolean z = num4 != null;
        boolean z2 = num3 != null;
        if (!z && !z2) {
            return deviceProfile;
        }
        List<CodecProfile> codecProfiles = deviceProfile.getCodecProfiles();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(codecProfiles, 10));
        for (CodecProfile codecProfileCopy$default : codecProfiles) {
            if (Intrinsics.areEqual(codecProfileCopy$default.getType(), "Video")) {
                List<ProfileCondition> listUpsertLessThanEqualProfileCondition = z ? upsertLessThanEqualProfileCondition(codecProfileCopy$default.getApplyConditions(), "Width", String.valueOf(num4.intValue())) : codecProfileCopy$default.getApplyConditions();
                if (z2) {
                    listUpsertLessThanEqualProfileCondition = upsertLessThanEqualProfileCondition(listUpsertLessThanEqualProfileCondition, "Height", String.valueOf(num3.intValue()));
                }
                codecProfileCopy$default = CodecProfile.copy$default(codecProfileCopy$default, null, null, listUpsertLessThanEqualProfileCondition, 3, null);
            }
            arrayList.add(codecProfileCopy$default);
        }
        return DeviceProfile.copy$default(deviceProfile, 0L, 0L, 0L, null, null, arrayList, null, null, null, 479, null);
    }

    public static /* synthetic */ DeviceProfile createAndroidTvDeviceProfile$default(long j, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 40000000;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        return createAndroidTvDeviceProfile(j, num, num2);
    }

    private static final List<ProfileCondition> upsertLessThanEqualProfileCondition(List<ProfileCondition> list, String str, String str2) {
        String str3;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        boolean z = false;
        for (ProfileCondition profileConditionCopy$default : list) {
            if (Intrinsics.areEqual(profileConditionCopy$default.getProperty(), str)) {
                str3 = str2;
                profileConditionCopy$default = ProfileCondition.copy$default(profileConditionCopy$default, "LessThanEqual", null, str3, false, 10, null);
                z = true;
            } else {
                str3 = str2;
            }
            arrayList.add(profileConditionCopy$default);
            str2 = str3;
        }
        return z ? arrayList : CollectionsKt.plus((Collection<? extends ProfileCondition>) arrayList, new ProfileCondition("LessThanEqual", str, str2, false, 8, null));
    }
}
