package com.dh.myembyapp.data.model;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.extractor.ts.PsExtractor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"buildTranscodeQualityOptions", "", "Lcom/dh/myembyapp/data/model/TranscodeQualityOption;", "mediaSource", "Lcom/dh/myembyapp/data/model/MediaSource;", "includeAuto", "", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class TranscodeQualityOptionKt {
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:45:0x029e  */
    /* JADX WARN: Code duplicated, block: B:46:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:49:0x0384  */
    public static final List<TranscodeQualityOption> buildTranscodeQualityOptions(MediaSource mediaSource, boolean z) {
        int iIntValue;
        char c;
        int i;
        int i2;
        int i3;
        Integer num;
        ArrayList arrayList;
        int i4;
        int i5;
        ArrayList arrayList2;
        int i6;
        List<MediaStream> mediaStreams;
        Object next;
        Integer width;
        Integer numValueOf = Integer.valueOf(WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
        if (mediaSource == null || (mediaStreams = mediaSource.getMediaStreams()) == null) {
            iIntValue = 4096;
        } else {
            Iterator<T> it = mediaStreams.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((MediaStream) next).getType(), "Video"));
            MediaStream mediaStream = (MediaStream) next;
            if (mediaStream == null || (width = mediaStream.getWidth()) == null) {
                iIntValue = 4096;
            } else {
                if (width.intValue() <= 0) {
                    width = null;
                }
                if (width != null) {
                    iIntValue = width.intValue();
                } else {
                    iIntValue = 4096;
                }
            }
        }
        Integer numValueOf2 = iIntValue > 0 ? Integer.valueOf(iIntValue) : null;
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 4096;
        ArrayList arrayList3 = new ArrayList();
        if (iIntValue2 >= 3400) {
            c = '\b';
            i3 = 4;
            i2 = 5;
            i = 6;
            CollectionsKt__MutableCollectionsKt.addAll(arrayList3, CollectionsKt.listOf((Object[]) new TranscodeQualityOption[]{new TranscodeQualityOption("4K - 200 Mbps", 200000000L, 2160, null, false, false, 56, null), new TranscodeQualityOption("4K - 160 Mbps", 160000000L, 2160, null, false, false, 56, null), new TranscodeQualityOption("4K - 140 Mbps", 140000000L, 2160, null, false, false, 56, null), new TranscodeQualityOption("4K - 120 Mbps", 120000000L, 2160, null, false, false, 56, null), new TranscodeQualityOption("4K - 100 Mbps", 100000000L, 2160, null, false, false, 56, null), new TranscodeQualityOption("4K - 80 Mbps", 80000000L, 2160, null, false, false, 56, null), new TranscodeQualityOption("4K - 60 Mbps", 60000001L, 2160, null, false, false, 56, null), new TranscodeQualityOption("4K - 40 Mbps", 40000001L, 2160, null, false, false, 56, null)}));
        } else {
            c = '\b';
            i = 6;
            i2 = 5;
            i3 = 4;
        }
        if (iIntValue2 >= 1440) {
            TranscodeQualityOption transcodeQualityOption = new TranscodeQualityOption("1080p - 60 Mbps", 60000000L, 1080, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption2 = new TranscodeQualityOption("1080p - 50 Mbps", 50000000L, 1080, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption3 = new TranscodeQualityOption("1080p - 40 Mbps", 40000000L, 1080, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption4 = new TranscodeQualityOption("1080p - 30 Mbps", 30000000L, 1080, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption5 = new TranscodeQualityOption("1080p - 25 Mbps", 25000000L, 1080, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption6 = new TranscodeQualityOption("1080p - 20 Mbps", 20000000L, 1080, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption7 = new TranscodeQualityOption("1080p - 15 Mbps", 15000000L, 1080, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption8 = new TranscodeQualityOption("1080p - 12 Mbps", 12000000L, 1080, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption9 = new TranscodeQualityOption("1080p - 10 Mbps", 10000001L, 1080, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption10 = new TranscodeQualityOption("1080p - 8 Mbps", 8000001L, 1080, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption11 = new TranscodeQualityOption("1080p - 6 Mbps", 6000001L, 1080, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption12 = new TranscodeQualityOption("1080p - 5 Mbps", 5000001L, 1080, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption13 = new TranscodeQualityOption("1080p - 4 Mbps", 4000002L, 1080, null, false, false, 56, null);
            TranscodeQualityOption[] transcodeQualityOptionArr = new TranscodeQualityOption[13];
            transcodeQualityOptionArr[0] = transcodeQualityOption;
            transcodeQualityOptionArr[1] = transcodeQualityOption2;
            transcodeQualityOptionArr[2] = transcodeQualityOption3;
            transcodeQualityOptionArr[3] = transcodeQualityOption4;
            transcodeQualityOptionArr[i3] = transcodeQualityOption5;
            transcodeQualityOptionArr[i2] = transcodeQualityOption6;
            transcodeQualityOptionArr[i] = transcodeQualityOption7;
            transcodeQualityOptionArr[7] = transcodeQualityOption8;
            transcodeQualityOptionArr[c] = transcodeQualityOption9;
            transcodeQualityOptionArr[9] = transcodeQualityOption10;
            transcodeQualityOptionArr[10] = transcodeQualityOption11;
            transcodeQualityOptionArr[11] = transcodeQualityOption12;
            transcodeQualityOptionArr[12] = transcodeQualityOption13;
            CollectionsKt__MutableCollectionsKt.addAll(arrayList3, CollectionsKt.listOf((Object[]) transcodeQualityOptionArr));
            num = 720;
        } else {
            if (iIntValue2 < 1200) {
                num = 720;
                if (iIntValue2 >= 620) {
                    arrayList = arrayList3;
                    i4 = i3;
                    i5 = i2;
                    TranscodeQualityOption transcodeQualityOption14 = new TranscodeQualityOption("480p - 4 Mbps", 4000001L, numValueOf, null, false, false, 56, null);
                    TranscodeQualityOption transcodeQualityOption15 = new TranscodeQualityOption("480p - 3 Mbps", 3000001L, numValueOf, null, false, false, 56, null);
                    TranscodeQualityOption transcodeQualityOption16 = new TranscodeQualityOption("480p - 2.5 Mbps", 2500000L, numValueOf, null, false, false, 56, null);
                    TranscodeQualityOption transcodeQualityOption17 = new TranscodeQualityOption("480p - 2 Mbps", 2000001L, numValueOf, null, false, false, 56, null);
                    TranscodeQualityOption transcodeQualityOption18 = new TranscodeQualityOption("480p - 1.5 Mbps", 1500001L, numValueOf, null, false, false, 56, null);
                    TranscodeQualityOption[] transcodeQualityOptionArr2 = new TranscodeQualityOption[i5];
                    transcodeQualityOptionArr2[0] = transcodeQualityOption14;
                    transcodeQualityOptionArr2[1] = transcodeQualityOption15;
                    transcodeQualityOptionArr2[2] = transcodeQualityOption16;
                    transcodeQualityOptionArr2[3] = transcodeQualityOption17;
                    transcodeQualityOptionArr2[i4] = transcodeQualityOption18;
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) transcodeQualityOptionArr2));
                }
                if (iIntValue2 >= 1260) {
                    i6 = i5;
                    arrayList2 = arrayList;
                    TranscodeQualityOption transcodeQualityOption19 = new TranscodeQualityOption("720p - 4 Mbps", 4000000L, num, null, false, false, 56, null);
                    TranscodeQualityOption transcodeQualityOption20 = new TranscodeQualityOption("720p - 3 Mbps", 3000000L, num, null, false, false, 56, null);
                    TranscodeQualityOption transcodeQualityOption21 = new TranscodeQualityOption("720p - 2 Mbps", SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US, num, null, false, false, 56, null);
                    TranscodeQualityOption transcodeQualityOption22 = new TranscodeQualityOption("720p - 1.5 Mbps", 1500000L, num, null, false, false, 56, null);
                    TranscodeQualityOption transcodeQualityOption23 = new TranscodeQualityOption("720p - 1 Mbps", 1000001L, num, null, false, false, 56, null);
                    TranscodeQualityOption[] transcodeQualityOptionArr3 = new TranscodeQualityOption[i6];
                    transcodeQualityOptionArr3[0] = transcodeQualityOption19;
                    transcodeQualityOptionArr3[1] = transcodeQualityOption20;
                    transcodeQualityOptionArr3[2] = transcodeQualityOption21;
                    transcodeQualityOptionArr3[3] = transcodeQualityOption22;
                    transcodeQualityOptionArr3[i4] = transcodeQualityOption23;
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList2, CollectionsKt.listOf((Object[]) transcodeQualityOptionArr3));
                } else {
                    arrayList2 = arrayList;
                    i6 = i5;
                }
                TranscodeQualityOption transcodeQualityOption24 = new TranscodeQualityOption("480p - 1 Mbps", 1000000L, numValueOf, null, false, false, 56, null);
                TranscodeQualityOption transcodeQualityOption25 = new TranscodeQualityOption("480p - 720 kbps", 720000L, numValueOf, null, false, false, 56, null);
                TranscodeQualityOption transcodeQualityOption26 = new TranscodeQualityOption("480p - 420 kbps", 420000L, numValueOf, null, false, false, 56, null);
                TranscodeQualityOption transcodeQualityOption27 = new TranscodeQualityOption("360p", 400000L, 360, null, false, false, 56, null);
                TranscodeQualityOption transcodeQualityOption28 = new TranscodeQualityOption("240p", 320000L, Integer.valueOf(PsExtractor.VIDEO_STREAM_MASK), null, false, false, 56, null);
                TranscodeQualityOption transcodeQualityOption29 = new TranscodeQualityOption("144p", 192000L, Integer.valueOf(Input.Keys.NUMPAD_0), null, false, false, 56, null);
                TranscodeQualityOption[] transcodeQualityOptionArr4 = new TranscodeQualityOption[i];
                transcodeQualityOptionArr4[0] = transcodeQualityOption24;
                transcodeQualityOptionArr4[1] = transcodeQualityOption25;
                transcodeQualityOptionArr4[2] = transcodeQualityOption26;
                transcodeQualityOptionArr4[3] = transcodeQualityOption27;
                transcodeQualityOptionArr4[i4] = transcodeQualityOption28;
                transcodeQualityOptionArr4[i6] = transcodeQualityOption29;
                CollectionsKt__MutableCollectionsKt.addAll(arrayList2, CollectionsKt.listOf((Object[]) transcodeQualityOptionArr4));
                if (z) {
                    arrayList2.add(new TranscodeQualityOption("自动", 0L, null, null, true, false, 44, null));
                    arrayList2.add(new TranscodeQualityOption("关闭转码", 0L, null, null, false, true, 28, null));
                }
                return arrayList2;
            }
            num = 720;
            TranscodeQualityOption transcodeQualityOption30 = new TranscodeQualityOption("720p - 10 Mbps", 10000000L, 720, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption31 = new TranscodeQualityOption("720p - 8 Mbps", 8000000L, 720, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption32 = new TranscodeQualityOption("720p - 6 Mbps", 6000000L, 720, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption33 = new TranscodeQualityOption("720p - 5 Mbps", 5000000L, 720, null, false, false, 56, null);
            TranscodeQualityOption[] transcodeQualityOptionArr5 = new TranscodeQualityOption[i3];
            transcodeQualityOptionArr5[0] = transcodeQualityOption30;
            transcodeQualityOptionArr5[1] = transcodeQualityOption31;
            transcodeQualityOptionArr5[2] = transcodeQualityOption32;
            transcodeQualityOptionArr5[3] = transcodeQualityOption33;
            CollectionsKt__MutableCollectionsKt.addAll(arrayList3, CollectionsKt.listOf((Object[]) transcodeQualityOptionArr5));
        }
        arrayList = arrayList3;
        i4 = i3;
        i5 = i2;
        if (iIntValue2 >= 1260) {
            i6 = i5;
            arrayList2 = arrayList;
            TranscodeQualityOption transcodeQualityOption110 = new TranscodeQualityOption("720p - 4 Mbps", 4000000L, num, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption210 = new TranscodeQualityOption("720p - 3 Mbps", 3000000L, num, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption211 = new TranscodeQualityOption("720p - 2 Mbps", SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US, num, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption212 = new TranscodeQualityOption("720p - 1.5 Mbps", 1500000L, num, null, false, false, 56, null);
            TranscodeQualityOption transcodeQualityOption213 = new TranscodeQualityOption("720p - 1 Mbps", 1000001L, num, null, false, false, 56, null);
            TranscodeQualityOption[] transcodeQualityOptionArr6 = new TranscodeQualityOption[i6];
            transcodeQualityOptionArr6[0] = transcodeQualityOption110;
            transcodeQualityOptionArr6[1] = transcodeQualityOption210;
            transcodeQualityOptionArr6[2] = transcodeQualityOption211;
            transcodeQualityOptionArr6[3] = transcodeQualityOption212;
            transcodeQualityOptionArr6[i4] = transcodeQualityOption213;
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, CollectionsKt.listOf((Object[]) transcodeQualityOptionArr6));
        } else {
            arrayList2 = arrayList;
            i6 = i5;
        }
        TranscodeQualityOption transcodeQualityOption214 = new TranscodeQualityOption("480p - 1 Mbps", 1000000L, numValueOf, null, false, false, 56, null);
        TranscodeQualityOption transcodeQualityOption215 = new TranscodeQualityOption("480p - 720 kbps", 720000L, numValueOf, null, false, false, 56, null);
        TranscodeQualityOption transcodeQualityOption216 = new TranscodeQualityOption("480p - 420 kbps", 420000L, numValueOf, null, false, false, 56, null);
        TranscodeQualityOption transcodeQualityOption217 = new TranscodeQualityOption("360p", 400000L, 360, null, false, false, 56, null);
        TranscodeQualityOption transcodeQualityOption218 = new TranscodeQualityOption("240p", 320000L, Integer.valueOf(PsExtractor.VIDEO_STREAM_MASK), null, false, false, 56, null);
        TranscodeQualityOption transcodeQualityOption219 = new TranscodeQualityOption("144p", 192000L, Integer.valueOf(Input.Keys.NUMPAD_0), null, false, false, 56, null);
        TranscodeQualityOption[] transcodeQualityOptionArr7 = new TranscodeQualityOption[i];
        transcodeQualityOptionArr7[0] = transcodeQualityOption214;
        transcodeQualityOptionArr7[1] = transcodeQualityOption215;
        transcodeQualityOptionArr7[2] = transcodeQualityOption216;
        transcodeQualityOptionArr7[3] = transcodeQualityOption217;
        transcodeQualityOptionArr7[i4] = transcodeQualityOption218;
        transcodeQualityOptionArr7[i6] = transcodeQualityOption219;
        CollectionsKt__MutableCollectionsKt.addAll(arrayList2, CollectionsKt.listOf((Object[]) transcodeQualityOptionArr7));
        if (z) {
            arrayList2.add(new TranscodeQualityOption("自动", 0L, null, null, true, false, 44, null));
            arrayList2.add(new TranscodeQualityOption("关闭转码", 0L, null, null, false, true, 28, null));
        }
        return arrayList2;
    }

    public static /* synthetic */ List buildTranscodeQualityOptions$default(MediaSource mediaSource, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return buildTranscodeQualityOptions(mediaSource, z);
    }
}
