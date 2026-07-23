package defpackage;

import androidx.compose.material3.Typography;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class ad2 {
    public static final Typography a;

    static {
        FontFamily.Companion companion = FontFamily.INSTANCE;
        SystemFontFamily systemFontFamily = companion.getDefault();
        FontWeight.Companion companion2 = FontWeight.INSTANCE;
        FontWeight bold = companion2.getBold();
        TextStyle textStyle = new TextStyle(0L, TextUnitKt.getSp(48), bold, (FontStyle) null, (FontSynthesis) null, systemFontFamily, (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(56), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
        SystemFontFamily systemFontFamily2 = companion.getDefault();
        FontWeight bold2 = companion2.getBold();
        TextStyle textStyle2 = new TextStyle(0L, TextUnitKt.getSp(36), bold2, (FontStyle) null, (FontSynthesis) null, systemFontFamily2, (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(44), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
        SystemFontFamily systemFontFamily3 = companion.getDefault();
        FontWeight semiBold = companion2.getSemiBold();
        TextStyle textStyle3 = new TextStyle(0L, TextUnitKt.getSp(28), semiBold, (FontStyle) null, (FontSynthesis) null, systemFontFamily3, (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(36), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
        SystemFontFamily systemFontFamily4 = companion.getDefault();
        FontWeight semiBold2 = companion2.getSemiBold();
        TextStyle textStyle4 = new TextStyle(0L, TextUnitKt.getSp(24), semiBold2, (FontStyle) null, (FontSynthesis) null, systemFontFamily4, (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(32), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
        SystemFontFamily systemFontFamily5 = companion.getDefault();
        FontWeight normal = companion2.getNormal();
        TextStyle textStyle5 = new TextStyle(0L, TextUnitKt.getSp(20), normal, (FontStyle) null, (FontSynthesis) null, systemFontFamily5, (String) null, TextUnitKt.getSp(0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(28), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
        SystemFontFamily systemFontFamily6 = companion.getDefault();
        FontWeight normal2 = companion2.getNormal();
        TextStyle textStyle6 = new TextStyle(0L, TextUnitKt.getSp(18), normal2, (FontStyle) null, (FontSynthesis) null, systemFontFamily6, (String) null, TextUnitKt.getSp(0.25d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
        SystemFontFamily systemFontFamily7 = companion.getDefault();
        FontWeight medium = companion2.getMedium();
        a = new Typography(textStyle, null, null, textStyle2, textStyle3, null, textStyle4, null, null, textStyle5, textStyle6, null, new TextStyle(0L, TextUnitKt.getSp(18), medium, (FontStyle) null, (FontSynthesis) null, systemFontFamily7, (String) null, TextUnitKt.getSp(0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null), null, null, 27046, null);
    }
}
