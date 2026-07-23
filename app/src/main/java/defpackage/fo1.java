package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.TraktCloudPlaybackProgress;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fo1 extends go1 {
    public final MediaItem a;
    public final String b;
    public final long c;
    public final TraktCloudPlaybackProgress d;
    public final boolean e;
    public final String f;
    public final TranscodeQualityOption g;
    public final Integer h;
    public final Integer i;

    public fo1(MediaItem mediaItem, String str, long j, TraktCloudPlaybackProgress traktCloudPlaybackProgress, boolean z, String str2, TranscodeQualityOption transcodeQualityOption, Integer num, Integer num2) {
        str.getClass();
        this.a = mediaItem;
        this.b = str;
        this.c = j;
        this.d = traktCloudPlaybackProgress;
        this.e = z;
        this.f = str2;
        this.g = transcodeQualityOption;
        this.h = num;
        this.i = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo1)) {
            return false;
        }
        fo1 fo1Var = (fo1) obj;
        return Intrinsics.areEqual(this.a, fo1Var.a) && Intrinsics.areEqual(this.b, fo1Var.b) && this.c == fo1Var.c && Intrinsics.areEqual(this.d, fo1Var.d) && this.e == fo1Var.e && Intrinsics.areEqual(this.f, fo1Var.f) && Intrinsics.areEqual(this.g, fo1Var.g) && Intrinsics.areEqual(this.h, fo1Var.h) && Intrinsics.areEqual(this.i, fo1Var.i);
    }

    public final int hashCode() {
        int i = i02.i(this.a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int iHashCode = (((this.d.hashCode() + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        TranscodeQualityOption transcodeQualityOption = this.g;
        int iHashCode3 = (iHashCode2 + (transcodeQualityOption == null ? 0 : transcodeQualityOption.hashCode())) * 31;
        Integer num = this.h;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "TraktProgressPrompt(mediaItem=" + this.a + ", itemId=" + this.b + ", localStartPosition=" + this.c + ", cloudProgress=" + this.d + ", useTranscoding=" + this.e + ", preferredMediaSourceId=" + this.f + ", transcodeQuality=" + this.g + ", audioStreamIndex=" + this.h + ", subtitleStreamIndex=" + this.i + ")";
    }
}
