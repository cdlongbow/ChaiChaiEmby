package defpackage;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.Savers_androidKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nu1 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ nu1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        switch (this.a) {
            case 0:
                return SaversKt.TextGeometricTransformSaver$lambda$0(saverScope, (TextGeometricTransform) obj2);
            case 1:
                return SaversKt.TextIndentSaver$lambda$0(saverScope, (TextIndent) obj2);
            case 2:
                return SaversKt.FontWeightSaver$lambda$0(saverScope, (FontWeight) obj2);
            case 3:
                return SaversKt.AnnotatedStringSaver$lambda$0(saverScope, (AnnotatedString) obj2);
            case 4:
                return SaversKt.BaselineShiftSaver$lambda$0(saverScope, (BaselineShift) obj2);
            case 5:
                return SaversKt.AnnotationRangeListSaver$lambda$0(saverScope, (List) obj2);
            case 6:
                return SaversKt.TextRangeSaver$lambda$0(saverScope, (TextRange) obj2);
            case 7:
                return SaversKt.ShadowSaver$lambda$0(saverScope, (Shadow) obj2);
            case 8:
                return SaversKt.TextAlignSaver$lambda$0(saverScope, (TextAlign) obj2);
            case 9:
                return SaversKt.LinkSaver$lambda$0(saverScope, (LinkAnnotation.Url) obj2);
            case 10:
                return SaversKt.TextDirectionSaver$lambda$0(saverScope, (TextDirection) obj2);
            case 11:
                return SaversKt.HyphensSaver$lambda$0(saverScope, (Hyphens) obj2);
            case 12:
                return SaversKt.FontStyleSaver$lambda$0(saverScope, (FontStyle) obj2);
            case 13:
                return SaversKt.FontSynthesisSaver$lambda$0(saverScope, (FontSynthesis) obj2);
            case 14:
                return SaversKt.TextUnitSaver$lambda$0(saverScope, (TextUnit) obj2);
            case 15:
                return SaversKt.TextUnitTypeSaver$lambda$0(saverScope, (TextUnitType) obj2);
            case 16:
                return SaversKt.OffsetSaver$lambda$0(saverScope, (Offset) obj2);
            case 17:
                return SaversKt.AnnotationRangeSaver$lambda$0(saverScope, (AnnotatedString.Range) obj2);
            case 18:
                return SaversKt.LocaleListSaver$lambda$0(saverScope, (LocaleList) obj2);
            case 19:
                return SaversKt.LocaleSaver$lambda$0(saverScope, (Locale) obj2);
            case 20:
                return SaversKt.ClickableSaver$lambda$0(saverScope, (LinkAnnotation.Clickable) obj2);
            case 21:
                return SaversKt.LineHeightStyleSaver$lambda$0(saverScope, (LineHeightStyle) obj2);
            case 22:
                return SaversKt.LineHeightStyleAlignmentSaver$lambda$0(saverScope, (LineHeightStyle.Alignment) obj2);
            case 23:
                return SaversKt.LineHeightStyleTrimSaver$lambda$0(saverScope, (LineHeightStyle.Trim) obj2);
            case 24:
                return SaversKt.LineHeightStyleModeSaver$lambda$0(saverScope, (LineHeightStyle.Mode) obj2);
            case 25:
                return SaversKt.VerbatimTtsAnnotationSaver$lambda$0(saverScope, (VerbatimTtsAnnotation) obj2);
            case 26:
                return SaversKt.UrlAnnotationSaver$lambda$0(saverScope, (UrlAnnotation) obj2);
            case 27:
                return SaversKt.ParagraphStyleSaver$lambda$0(saverScope, (ParagraphStyle) obj2);
            case 28:
                return SaversKt.SpanStyleSaver$lambda$0(saverScope, (SpanStyle) obj2);
            default:
                return Savers_androidKt.PlatformParagraphStyleSaver$lambda$0(saverScope, (PlatformParagraphStyle) obj2);
        }
    }
}
