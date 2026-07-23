package com.dh.myembyapp.data.model;

import androidx.media3.common.MimeTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007\u001a,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"createAndroidTvDeviceProfile", "Lcom/dh/myembyapp/data/model/DeviceProfile;", "maxStreamingBitrate", "", "maxVideoWidth", "", "maxVideoHeight", "(JLjava/lang/Integer;Ljava/lang/Integer;)Lcom/dh/myembyapp/data/model/DeviceProfile;", "upsertLessThanEqualProfileCondition", "", "Lcom/dh/myembyapp/data/model/ProfileCondition;", "conditions", "property", "", "value", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
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
