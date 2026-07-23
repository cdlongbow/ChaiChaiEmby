package defpackage;

import android.graphics.Bitmap;
import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.zip.Inflater;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class z51 implements SubtitleParser {
    public final ParsableByteArray a = new ParsableByteArray();
    public final ParsableByteArray b = new ParsableByteArray();
    public final y51 c = new y51();
    public Inflater d;

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final int getCueReplacementBehavior() {
        return 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        ArrayList arrayList;
        ParsableByteArray parsableByteArray;
        int i3;
        Collection collectionEmptyList;
        int[] iArr;
        int i4;
        int i5;
        LinkedHashMap linkedHashMap;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iMin;
        int unsignedInt24;
        bArr.getClass();
        outputOptions.getClass();
        consumer.getClass();
        ParsableByteArray parsableByteArray2 = this.a;
        parsableByteArray2.reset(bArr, i + i2);
        parsableByteArray2.setPosition(i);
        if (this.d == null) {
            this.d = new Inflater();
        }
        Inflater inflater = this.d;
        ParsableByteArray parsableByteArray3 = this.b;
        if (Util.maybeInflate(parsableByteArray2, parsableByteArray3, inflater)) {
            parsableByteArray2.reset(parsableByteArray3.getData(), parsableByteArray3.limit());
        }
        y51 y51Var = this.c;
        y51Var.a();
        ArrayList arrayList2 = y51Var.b;
        int[] iArr2 = y51Var.a;
        LinkedHashMap linkedHashMap2 = y51Var.c;
        ArrayList arrayList3 = new ArrayList();
        while (parsableByteArray2.bytesLeft() >= 3) {
            int iLimit = parsableByteArray2.limit();
            int unsignedByte = parsableByteArray2.readUnsignedByte();
            int unsignedShort = parsableByteArray2.readUnsignedShort();
            int position = parsableByteArray2.getPosition() + unsignedShort;
            if (position > iLimit) {
                parsableByteArray2.setPosition(iLimit);
                arrayList2 = arrayList2;
                iArr2 = iArr2;
                parsableByteArray2 = parsableByteArray2;
                linkedHashMap2 = linkedHashMap2;
                arrayList = arrayList3;
                collectionEmptyList = null;
            } else {
                char c = '\b';
                char c2 = 128;
                if (unsignedByte != 128) {
                    switch (unsignedByte) {
                        case 20:
                            if (unsignedShort % 5 != 2) {
                                arrayList = arrayList3;
                            } else {
                                parsableByteArray2.skipBytes(2);
                                ArraysKt___ArraysJvmKt.fill$default(iArr2, 0, 0, 0, 6, (Object) null);
                                int i12 = unsignedShort / 5;
                                int i13 = 0;
                                while (i13 < i12) {
                                    int unsignedByte2 = parsableByteArray2.readUnsignedByte();
                                    int unsignedByte3 = parsableByteArray2.readUnsignedByte();
                                    int unsignedByte4 = parsableByteArray2.readUnsignedByte();
                                    char c3 = c;
                                    double d = unsignedByte3;
                                    ArrayList arrayList4 = arrayList3;
                                    double d2 = unsignedByte4 - 128;
                                    double unsignedByte5 = parsableByteArray2.readUnsignedByte() - 128;
                                    iArr2[unsignedByte2] = (RangesKt.coerceIn((int) ((d - (0.34414d * unsignedByte5)) - (d2 * 0.71414d)), 0, 255) << 8) | (parsableByteArray2.readUnsignedByte() << 24) | (RangesKt.coerceIn((int) ((1.402d * d2) + d), 0, 255) << 16) | RangesKt.coerceIn((int) ((1.772d * unsignedByte5) + d), 0, 255);
                                    i13++;
                                    c = c3;
                                    c2 = c2;
                                    arrayList3 = arrayList4;
                                }
                                arrayList = arrayList3;
                                y51Var.d = true;
                            }
                            break;
                        case 21:
                            if (unsignedShort >= 4) {
                                int position2 = parsableByteArray2.getPosition() + unsignedShort;
                                int unsignedShort2 = parsableByteArray2.readUnsignedShort();
                                parsableByteArray2.skipBytes(1);
                                boolean z = (parsableByteArray2.readUnsignedByte() & 128) != 0;
                                Integer numValueOf = Integer.valueOf(unsignedShort2);
                                Object obj = linkedHashMap2.get(numValueOf);
                                Object obj2 = obj;
                                if (obj == null) {
                                    w51 w51Var = new w51();
                                    w51Var.c = new byte[0];
                                    linkedHashMap2.put(numValueOf, w51Var);
                                    obj2 = w51Var;
                                }
                                w51 w51Var2 = (w51) obj2;
                                if (!z) {
                                    int iCoerceAtLeast = RangesKt.coerceAtLeast(position2 - parsableByteArray2.getPosition(), 0);
                                    i11 = w51Var2.d;
                                    if (i11 > 0 && iCoerceAtLeast > 0 && (iMin = Math.min(iCoerceAtLeast, i11 - w51Var2.e)) > 0) {
                                        parsableByteArray2.readBytes(w51Var2.c, w51Var2.e, iMin);
                                        w51Var2.e += iMin;
                                    }
                                } else if (position2 - parsableByteArray2.getPosition() >= 7 && (unsignedInt24 = parsableByteArray2.readUnsignedInt24()) >= 4) {
                                    int unsignedShort3 = parsableByteArray2.readUnsignedShort();
                                    int unsignedShort4 = parsableByteArray2.readUnsignedShort();
                                    int i14 = unsignedInt24 - 4;
                                    w51Var2.a = unsignedShort3;
                                    w51Var2.b = unsignedShort4;
                                    if (w51Var2.c.length < i14) {
                                        w51Var2.c = new byte[i14];
                                    }
                                    w51Var2.d = i14;
                                    w51Var2.e = 0;
                                    int iCoerceAtLeast2 = RangesKt.coerceAtLeast(position2 - parsableByteArray2.getPosition(), 0);
                                    i11 = w51Var2.d;
                                    if (i11 > 0) {
                                        parsableByteArray2.readBytes(w51Var2.c, w51Var2.e, iMin);
                                        w51Var2.e += iMin;
                                    }
                                }
                            }
                            arrayList = arrayList3;
                            break;
                        case 22:
                            if (unsignedShort >= 11) {
                                int position3 = parsableByteArray2.getPosition() + unsignedShort;
                                y51Var.e = parsableByteArray2.readUnsignedShort();
                                y51Var.f = parsableByteArray2.readUnsignedShort();
                                parsableByteArray2.skipBytes(1);
                                parsableByteArray2.skipBytes(2);
                                int unsignedByte6 = parsableByteArray2.readUnsignedByte();
                                parsableByteArray2.skipBytes(1);
                                parsableByteArray2.readUnsignedByte();
                                int unsignedByte7 = parsableByteArray2.readUnsignedByte();
                                if (unsignedByte6 != 0) {
                                    linkedHashMap2.clear();
                                }
                                arrayList2.clear();
                                for (int i15 = 0; i15 < unsignedByte7; i15++) {
                                    if (position3 - parsableByteArray2.getPosition() >= 8) {
                                        int unsignedShort5 = parsableByteArray2.readUnsignedShort();
                                        parsableByteArray2.skipBytes(1);
                                        int unsignedByte8 = parsableByteArray2.readUnsignedByte();
                                        int unsignedShort6 = parsableByteArray2.readUnsignedShort();
                                        int unsignedShort7 = parsableByteArray2.readUnsignedShort();
                                        if ((unsignedByte8 & 128) == 0 || position3 - parsableByteArray2.getPosition() < 8) {
                                            arrayList2.add(new x51(unsignedShort5, unsignedShort6, unsignedShort7, 0, 0, 0, 0));
                                        } else {
                                            arrayList2.add(new x51(unsignedShort5, unsignedShort6, unsignedShort7, parsableByteArray2.readUnsignedShort(), parsableByteArray2.readUnsignedShort(), parsableByteArray2.readUnsignedShort(), parsableByteArray2.readUnsignedShort()));
                                        }
                                    }
                                }
                            }
                            arrayList = arrayList3;
                            break;
                        default:
                            arrayList = arrayList3;
                            break;
                    }
                    collectionEmptyList = null;
                } else {
                    arrayList = arrayList3;
                    if (!y51Var.d || y51Var.e <= 0 || y51Var.f <= 0 || arrayList2.isEmpty()) {
                        arrayList2 = arrayList2;
                        iArr2 = iArr2;
                        parsableByteArray = parsableByteArray2;
                        linkedHashMap2 = linkedHashMap2;
                        i3 = position;
                        collectionEmptyList = CollectionsKt.emptyList();
                    } else {
                        ArrayList arrayList5 = new ArrayList(arrayList2.size());
                        int size = arrayList2.size();
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < size) {
                            Object obj3 = arrayList2.get(i16);
                            int i18 = i16 + 1;
                            int i19 = i17 + 1;
                            if (i17 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            x51 x51Var = (x51) obj3;
                            int i20 = x51Var.a;
                            int i21 = x51Var.e;
                            int i22 = x51Var.d;
                            int i23 = x51Var.g;
                            ArrayList arrayList6 = arrayList2;
                            int i24 = x51Var.f;
                            w51 w51Var3 = (w51) linkedHashMap2.get(Integer.valueOf(i20));
                            if (w51Var3 == null) {
                                iArr = iArr2;
                            } else {
                                iArr = iArr2;
                                int i25 = w51Var3.a;
                                if (i25 > 0 && (i4 = w51Var3.b) > 0 && (i5 = w51Var3.d) > 0) {
                                    linkedHashMap = linkedHashMap2;
                                    if (w51Var3.e == i5) {
                                        byte[] bArr2 = w51Var3.c;
                                        int i26 = i25 * i4;
                                        i6 = size;
                                        int[] iArr3 = new int[i26];
                                        i7 = i18;
                                        i8 = i19;
                                        int i27 = 0;
                                        int i28 = 0;
                                        while (true) {
                                            if (i28 >= i26 || i27 >= i5) {
                                                parsableByteArray2 = parsableByteArray2;
                                                position = position;
                                            } else {
                                                int i29 = i27;
                                                parsableByteArray2 = parsableByteArray2;
                                                int i30 = bArr2[i29] & UByte.MAX_VALUE;
                                                int i31 = i29 + 1;
                                                if (i30 != 0) {
                                                    iArr3[i28] = iArr[i30];
                                                    i27 = i31;
                                                    i28++;
                                                } else {
                                                    if (i31 < i5) {
                                                        int i32 = bArr2[i31];
                                                        i27 = i29 + 2;
                                                        if ((i32 & 255) != 0) {
                                                            if ((i32 & 64) == 0) {
                                                                i9 = i32 & 63;
                                                            } else if (i27 < i5) {
                                                                int i33 = bArr2[i27] & 255;
                                                                int i34 = i29 + 3;
                                                                Unit unit = Unit.INSTANCE;
                                                                i9 = ((i32 & 63) << 8) | i33;
                                                                i27 = i34;
                                                            }
                                                            if ((i32 & 128) == 0) {
                                                                i10 = iArr[0];
                                                            } else if (i27 < i5) {
                                                                i10 = iArr[bArr2[i27] & UByte.MAX_VALUE];
                                                                i27++;
                                                            }
                                                            int iCoerceAtMost = RangesKt.coerceAtMost(i28 + i9, i26);
                                                            ArraysKt.fill(iArr3, i10, i28, iCoerceAtMost);
                                                            i28 = iCoerceAtMost;
                                                            position = position;
                                                        }
                                                    }
                                                    position = position;
                                                }
                                            }
                                        }
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr3, w51Var3.a, w51Var3.b, Bitmap.Config.ARGB_8888);
                                        bitmapCreateBitmap.getClass();
                                        if (i24 > 0 && i23 > 0) {
                                            int i35 = i22 + i24;
                                            int i36 = i21 + i23;
                                            if (i22 >= 0 && i21 >= 0 && i35 <= w51Var3.a && i36 <= w51Var3.b) {
                                                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, i22, i21, i24, i23);
                                            }
                                        }
                                        if (bitmapCreateBitmap != null) {
                                            int i37 = x51Var.b + i22;
                                            int i38 = x51Var.c + i21;
                                            if (i24 <= 0) {
                                                i24 = w51Var3.a;
                                            }
                                            if (i23 <= 0) {
                                                i23 = w51Var3.b;
                                            }
                                            arrayList5.add(new Cue.Builder().setBitmap(bitmapCreateBitmap).setPosition(i37 / y51Var.e).setPositionAnchor(0).setLine(i38 / y51Var.f, 0).setLineAnchor(0).setSize(i24 / y51Var.e).setBitmapHeight(i23 / y51Var.f).setZIndex(i17).build());
                                        }
                                    }
                                    size = i6;
                                    arrayList2 = arrayList6;
                                    iArr2 = iArr;
                                    i16 = i7;
                                    i17 = i8;
                                    linkedHashMap2 = linkedHashMap;
                                    parsableByteArray2 = parsableByteArray2;
                                    position = position;
                                }
                                i6 = size;
                                i7 = i18;
                                position = position;
                                i8 = i19;
                                size = i6;
                                arrayList2 = arrayList6;
                                iArr2 = iArr;
                                i16 = i7;
                                i17 = i8;
                                linkedHashMap2 = linkedHashMap;
                                parsableByteArray2 = parsableByteArray2;
                                position = position;
                            }
                            linkedHashMap = linkedHashMap2;
                            i6 = size;
                            i7 = i18;
                            position = position;
                            i8 = i19;
                            size = i6;
                            arrayList2 = arrayList6;
                            iArr2 = iArr;
                            i16 = i7;
                            i17 = i8;
                            linkedHashMap2 = linkedHashMap;
                            parsableByteArray2 = parsableByteArray2;
                            position = position;
                        }
                        arrayList2 = arrayList2;
                        iArr2 = iArr2;
                        parsableByteArray = parsableByteArray2;
                        linkedHashMap2 = linkedHashMap2;
                        i3 = position;
                        collectionEmptyList = arrayList5;
                    }
                    y51Var.a();
                    parsableByteArray2 = parsableByteArray;
                    position = i3;
                }
                parsableByteArray2.setPosition(position);
            }
            if (collectionEmptyList == null || collectionEmptyList.isEmpty()) {
                arrayList3 = arrayList;
            } else {
                arrayList3 = arrayList;
                arrayList3.addAll(collectionEmptyList);
            }
            parsableByteArray2 = parsableByteArray2;
            arrayList2 = arrayList2;
            iArr2 = iArr2;
            linkedHashMap2 = linkedHashMap2;
        }
        consumer.accept(new CuesWithTiming(arrayList3, C.TIME_UNSET, C.TIME_UNSET));
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final /* synthetic */ Subtitle parseToLegacySubtitle(byte[] bArr, int i, int i2) {
        return b.b(this, bArr, i, i2);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void reset() {
        this.c.a();
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final /* synthetic */ void parse(byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        b.a(this, bArr, outputOptions, consumer);
    }
}
