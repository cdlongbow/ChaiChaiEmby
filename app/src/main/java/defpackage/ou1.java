package defpackage;

import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.Savers_androidKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ou1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ou1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return SaversKt.FontWeightSaver$lambda$1(obj);
            case 1:
                return SaversKt.BaselineShiftSaver$lambda$1(obj);
            case 2:
                return SaversKt.TextRangeSaver$lambda$1(obj);
            case 3:
                return SaversKt.ShadowSaver$lambda$1(obj);
            case 4:
                return SaversKt.TextAlignSaver$lambda$1(obj);
            case 5:
                return SaversKt.TextDirectionSaver$lambda$1(obj);
            case 6:
                return SaversKt.HyphensSaver$lambda$1(obj);
            case 7:
                return SaversKt.AnnotationRangeListSaver$lambda$1(obj);
            case 8:
                return SaversKt.FontStyleSaver$lambda$1(obj);
            case 9:
                return SaversKt.FontSynthesisSaver$lambda$1(obj);
            case 10:
                return SaversKt.LinkSaver$lambda$1(obj);
            case 11:
                return SaversKt.TextUnitSaver$lambda$1(obj);
            case 12:
                return SaversKt.TextUnitTypeSaver$lambda$1(obj);
            case 13:
                return SaversKt.OffsetSaver$lambda$1(obj);
            case 14:
                return SaversKt.LocaleListSaver$lambda$1(obj);
            case 15:
                return SaversKt.LocaleSaver$lambda$1(obj);
            case 16:
                return SaversKt.LineHeightStyleSaver$lambda$1(obj);
            case 17:
                return SaversKt.LineHeightStyleAlignmentSaver$lambda$1(obj);
            case 18:
                return SaversKt.LineHeightStyleTrimSaver$lambda$1(obj);
            case 19:
                return SaversKt.AnnotationRangeSaver$lambda$1(obj);
            case 20:
                return SaversKt.LineHeightStyleModeSaver$lambda$1(obj);
            case 21:
                return SaversKt.ClickableSaver$lambda$1(obj);
            case 22:
                return SaversKt.VerbatimTtsAnnotationSaver$lambda$1(obj);
            case 23:
                return SaversKt.UrlAnnotationSaver$lambda$1(obj);
            case 24:
                return SaversKt.ParagraphStyleSaver$lambda$1(obj);
            case 25:
                return SaversKt.SpanStyleSaver$lambda$1(obj);
            case 26:
                return Savers_androidKt.PlatformParagraphStyleSaver$lambda$1(obj);
            case 27:
                return Savers_androidKt.emojiSupportMatchSaver$lambda$1(obj);
            case 28:
                return Savers_androidKt.LineBreakSaver$lambda$1(obj);
            default:
                return Savers_androidKt.TextMotionSaver$lambda$1(obj);
        }
    }
}
