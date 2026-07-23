package defpackage;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class nd1 implements SubtitleParser.Factory {
    public final SubtitleParser.Factory a;

    public /* synthetic */ nd1() {
        this(new DefaultSubtitleParserFactory());
    }

    public static boolean a(Format format) {
        String str = format.sampleMimeType;
        if (str == null) {
            str = "";
        }
        String str2 = format.codecs;
        String str3 = str2 != null ? str2 : "";
        return Intrinsics.areEqual(str, MimeTypes.APPLICATION_PGS) || StringsKt__StringsKt.contains(str, (CharSequence) "pgs", true) || StringsKt__StringsKt.contains(str3, (CharSequence) "pgs", true) || StringsKt__StringsKt.contains(str3, (CharSequence) "hdmv_pgs", true);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser.Factory
    public final SubtitleParser create(Format format) {
        format.getClass();
        if (a(format)) {
            return new z51();
        }
        String str = format.sampleMimeType;
        if (str == null) {
            str = "";
        }
        String str2 = format.codecs;
        if (str2 == null) {
            str2 = "";
        }
        if ((Intrinsics.areEqual(str, MimeTypes.TEXT_SSA) || StringsKt__StringsKt.contains(str, (CharSequence) "ssa", true) || StringsKt__StringsKt.contains(str, (CharSequence) "ass", true) || StringsKt__StringsKt.contains(str2, (CharSequence) "ssa", true) || StringsKt__StringsKt.contains(str2, (CharSequence) "ass", true)) && format.id == null) {
            format = format.buildUpon().setId("").build();
            format.getClass();
        }
        SubtitleParser subtitleParserCreate = this.a.create(format);
        subtitleParserCreate.getClass();
        return subtitleParserCreate;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser.Factory
    public final int getCueReplacementBehavior(Format format) {
        format.getClass();
        if (a(format)) {
            return 2;
        }
        return this.a.getCueReplacementBehavior(format);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser.Factory
    public final boolean supportsFormat(Format format) {
        format.getClass();
        return a(format) || this.a.supportsFormat(format);
    }

    public nd1(SubtitleParser.Factory factory) {
        this.a = factory;
    }
}
