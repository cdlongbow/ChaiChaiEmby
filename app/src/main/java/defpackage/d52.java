package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d52 {
    public static final List a;

    static {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(Charsets.UTF_8);
        listCreateListBuilder.add(Charsets.UTF_16LE);
        listCreateListBuilder.add(Charsets.UTF_16BE);
        Charset charsetForName = Charset.forName("GB18030");
        charsetForName.getClass();
        listCreateListBuilder.add(charsetForName);
        Charset charsetForName2 = Charset.forName("Big5");
        charsetForName2.getClass();
        listCreateListBuilder.add(charsetForName2);
        Charset charsetForName3 = Charset.forName("Shift_JIS");
        charsetForName3.getClass();
        listCreateListBuilder.add(charsetForName3);
        Charset charsetForName4 = Charset.forName("EUC-JP");
        charsetForName4.getClass();
        listCreateListBuilder.add(charsetForName4);
        listCreateListBuilder.add(Charsets.ISO_8859_1);
        a = CollectionsKt.build(listCreateListBuilder);
    }

    public static String a(byte[] bArr, Function1 function1) {
        Charset charset;
        String string;
        String strRemovePrefix;
        bArr = bArr;
        bArr.getClass();
        if (bArr.length == 0) {
            return "";
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        if (bArr.length >= 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) {
            charset = Charsets.UTF_8;
        } else if (bArr.length >= 2 && bArr[0] == -1 && bArr[1] == -2) {
            charset = Charsets.UTF_16LE;
        } else {
            charset = (bArr.length >= 2 && bArr[0] == -2 && bArr[1] == -1) ? Charsets.UTF_16BE : null;
        }
        if (charset != null) {
            linkedHashSet.add(charset);
        }
        linkedHashSet.addAll(a);
        Iterator it = linkedHashSet.iterator();
        it.getClass();
        int i2 = Integer.MIN_VALUE;
        String str = null;
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            Charset charset2 = (Charset) next;
            try {
                CharsetDecoder charsetDecoderNewDecoder = charset2.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException unused) {
                string = null;
            }
            if (string == null || (strRemovePrefix = StringsKt.removePrefix(string, (CharSequence) "\ufeff")) == null) {
                i = 0;
            } else {
                int iIntValue = ((Number) function1.invoke(strRemovePrefix)).intValue();
                int i3 = !StringsKt__StringsKt.contains$default(strRemovePrefix, Utf8.REPLACEMENT_CHARACTER, false, 2, (Object) null) ? 40 : i;
                int i4 = i;
                int i5 = i4;
                while (i4 < strRemovePrefix.length()) {
                    char cCharAt = strRemovePrefix.charAt(i4);
                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t' && cCharAt >= 0 && cCharAt < ' ') {
                        i5++;
                    }
                    i4++;
                }
                int i6 = i3 - (i5 * 10);
                int i7 = i;
                int i8 = i7;
                while (i7 < strRemovePrefix.length()) {
                    if (strRemovePrefix.charAt(i7) == 0) {
                        i8++;
                    }
                    i7++;
                }
                int i9 = i6 - (i8 * 20);
                int length = bArr.length;
                int i10 = i;
                int i11 = i10;
                while (i10 < length) {
                    if ((bArr[i10] & ByteCompanionObject.MIN_VALUE) != 0) {
                        i11++;
                    }
                    i10++;
                }
                int i12 = i;
                int i13 = i12;
                while (i12 < strRemovePrefix.length()) {
                    Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(strRemovePrefix.charAt(i12));
                    if (Intrinsics.areEqual(unicodeBlockOf, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || Intrinsics.areEqual(unicodeBlockOf, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || Intrinsics.areEqual(unicodeBlockOf, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || Intrinsics.areEqual(unicodeBlockOf, Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || Intrinsics.areEqual(unicodeBlockOf, Character.UnicodeBlock.HIRAGANA) || Intrinsics.areEqual(unicodeBlockOf, Character.UnicodeBlock.KATAKANA) || Intrinsics.areEqual(unicodeBlockOf, Character.UnicodeBlock.HANGUL_SYLLABLES) || Intrinsics.areEqual(unicodeBlockOf, Character.UnicodeBlock.HANGUL_JAMO)) {
                        i13++;
                    }
                    i12++;
                }
                int i14 = i;
                int i15 = i14;
                while (i14 < strRemovePrefix.length()) {
                    char cCharAt2 = strRemovePrefix.charAt(i14);
                    if (192 <= cCharAt2 && cCharAt2 < 592 && Character.isLetter(cCharAt2)) {
                        i15++;
                    }
                    i14++;
                }
                int i16 = 0;
                for (int i17 = 0; i17 < strRemovePrefix.length(); i17++) {
                    char cCharAt3 = strRemovePrefix.charAt(i17);
                    if (161 <= cCharAt3 && cCharAt3 < 192 && !Character.isLetterOrDigit(cCharAt3)) {
                        i16++;
                    }
                }
                int iMin = (Math.min(i15, 24) + (Math.min(i13 * 2, 120) + i9)) - (i16 * 6);
                if (i11 >= 8 && i13 == 0 && i16 >= 4) {
                    iMin -= i16 * 8;
                }
                if (Intrinsics.areEqual(charset2, Charsets.ISO_8859_1) && i11 >= 8 && i13 == 0 && i16 >= 4) {
                    iMin -= 220;
                }
                int i18 = iIntValue + iMin;
                if (i18 > i2) {
                    i2 = i18;
                    str = strRemovePrefix;
                    i = 0;
                } else {
                    i = 0;
                }
            }
        }
        return str;
    }
}
