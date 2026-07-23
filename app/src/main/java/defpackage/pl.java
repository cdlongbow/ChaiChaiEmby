package defpackage;

import android.graphics.Bitmap;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import com.dh.myembyapp.data.SubtitlePreferences;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class pl {
    public final ol a = new ol(GroupFlagsKt.HasAuxSlotFlag);

    public final boolean a(PlayerView playerView, CueGroup cueGroup, int i) {
        SubtitleView subtitleView;
        boolean z;
        int i2;
        at0 at0Var;
        int i3;
        at0 at0Var2;
        int i4;
        int i5;
        Cue cueBuild;
        cueGroup.getClass();
        int iCoerceIn = 0;
        if (playerView == null) {
            return false;
        }
        at0 at0Var3 = cueGroup.cues;
        at0Var3.getClass();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(at0Var3, 10));
        int size = at0Var3.size();
        boolean z2 = false;
        int i6 = 0;
        while (i6 < size) {
            Object obj = at0Var3.get(i6);
            int i7 = i6 + 1;
            Cue cue = (Cue) obj;
            Bitmap bitmap = cue.bitmap;
            if (bitmap == null) {
                i2 = iCoerceIn;
                cueBuild = cue;
                at0Var = at0Var3;
                i3 = i7;
            } else {
                Cue.Builder builderBuildUpon = cue.buildUpon();
                int iNormalizeBitmapSubtitleBrightness = SubtitlePreferences.INSTANCE.normalizeBitmapSubtitleBrightness(i);
                String str = bitmap.getGenerationId() + ":" + iNormalizeBitmapSubtitleBrightness;
                ol olVar = this.a;
                Bitmap bitmap2 = (Bitmap) olVar.get(str);
                if (bitmap2 != null) {
                    i2 = iCoerceIn;
                    at0Var = at0Var3;
                    i3 = i7;
                    z = true;
                } else {
                    double dCoerceAtLeast = iNormalizeBitmapSubtitleBrightness <= 80 ? ((double) iNormalizeBitmapSubtitleBrightness) / 80.0d : ((((double) (iNormalizeBitmapSubtitleBrightness - 80)) / ((double) RangesKt.coerceAtLeast(20, 1))) * 0.15d) + 1.0d;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int i8 = width * height;
                    int[] iArr = new int[i8];
                    z = true;
                    bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                    int i9 = iCoerceIn;
                    while (i9 < i8) {
                        int i10 = iArr[i9];
                        int i11 = i10 >>> 24;
                        if (i11 == 0) {
                            at0Var2 = at0Var3;
                            i5 = i7;
                            i4 = iCoerceIn;
                        } else {
                            at0Var2 = at0Var3;
                            double d = (i10 >> 16) & 255;
                            double d2 = (i10 >> 8) & 255;
                            double d3 = i10 & 255;
                            double d4 = (0.0722d * d3) + (0.7152d * d2) + (0.2126d * d);
                            if (d4 <= 0.0d) {
                                i5 = i7;
                                iCoerceIn = 0;
                                i4 = 0;
                            } else {
                                double dCoerceAtMost = RangesKt.coerceAtMost((((((Math.pow(d4 / 255.0d, 0.45d) * 255.0d) * 1.12d) - d4) * dCoerceAtLeast) + d4) / d4, 3.0d);
                                i4 = 0;
                                i5 = i7;
                                iCoerceIn = RangesKt.coerceIn((int) Math.round(d3 * dCoerceAtMost), 0, 255) | (RangesKt.coerceIn((int) Math.round(d * dCoerceAtMost), 0, 255) << 16) | (i11 << 24) | (RangesKt.coerceIn((int) Math.round(d2 * dCoerceAtMost), 0, 255) << 8);
                            }
                        }
                        iArr[i9] = iCoerceIn;
                        i9++;
                        at0Var3 = at0Var2;
                        iCoerceIn = i4;
                        i8 = i8;
                        i7 = i5;
                    }
                    i2 = iCoerceIn;
                    at0Var = at0Var3;
                    i3 = i7;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.getClass();
                    bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                    bitmap2 = bitmapCreateBitmap;
                    olVar.put(str, bitmap2);
                }
                cueBuild = builderBuildUpon.setBitmap(bitmap2).build();
                z2 = z;
            }
            arrayList.add(cueBuild);
            at0Var3 = at0Var;
            iCoerceIn = i2;
            i6 = i3;
        }
        if (z2 && (subtitleView = playerView.getSubtitleView()) != null) {
            subtitleView.setCues(arrayList);
        }
        return z2;
    }
}
