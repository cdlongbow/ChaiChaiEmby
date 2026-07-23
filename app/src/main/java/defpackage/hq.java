package defpackage;

import android.util.Log;
import android.view.View;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$8$1$1$2;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.lifecycle.viewmodel.CreationExtrasKt;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.PersonInfo;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hq implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ hq(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 1:
                return ComposeInputMethodManager_androidKt.ComposeInputMethodManagerFactory$lambda$0((View) obj);
            case 2:
                return CoreTextFieldKt.CoreTextField$lambda$0$0((TextLayoutResult) obj);
            case 3:
                return CoreTextFieldKt$CoreTextField$8$1$1$2.measure_3p2s80s$lambda$2((Placeable.PlacementScope) obj);
            case 4:
                return CoroutineDispatcher.Companion._init_$lambda$0((CoroutineContext.Element) obj);
            case 5:
                return CreationExtrasKt.CreationExtras$lambda$0((MutableCreationExtras) obj);
            case 6:
                String str = (String) obj;
                str.getClass();
                Log.d("DanmakuPlayer", str);
                return Unit.INSTANCE;
            case 7:
                String str2 = (String) obj;
                str2.getClass();
                Log.w("DanmakuPlayer", str2);
                return Unit.INSTANCE;
            case 8:
                sw swVar = (sw) obj;
                swVar.getClass();
                return swVar.a;
            case 9:
                return Integer.valueOf(DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$15(((Integer) obj).intValue()));
            case 10:
                return Integer.valueOf(DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$18(((Integer) obj).intValue()));
            case 11:
                return DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$14$lambda$13((SemanticsPropertyReceiver) obj);
            case 12:
                return DatePickerKt.DateEntryContainer_au3_HiA$lambda$8$lambda$7((SemanticsPropertyReceiver) obj);
            case 13:
                return DateRangePickerKt.SwitchableDateEntryContent_eVtQiho$lambda$8$lambda$7((SemanticsPropertyReceiver) obj);
            case 14:
                return Boolean.valueOf(DebugProbesImpl.dumpCoroutinesSynchronized$lambda$14((DebugProbesImpl.CoroutineOwner) obj));
            case 15:
                return DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$9$lambda$8((SemanticsPropertyReceiver) obj);
            case 16:
                return DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$20$lambda$19((SemanticsPropertyReceiver) obj);
            case 17:
                PersonInfo personInfo = (PersonInfo) obj;
                personInfo.getClass();
                return personInfo.getId();
            case 18:
                MediaItem mediaItem = (MediaItem) obj;
                mediaItem.getClass();
                return mediaItem.getId();
            case 19:
                FocusProperties focusProperties = (FocusProperties) obj;
                focusProperties.getClass();
                focusProperties.setLeft(FocusRequester.INSTANCE.getCancel());
                return Unit.INSTANCE;
            case 20:
                FocusProperties focusProperties2 = (FocusProperties) obj;
                focusProperties2.getClass();
                focusProperties2.setRight(FocusRequester.INSTANCE.getCancel());
                return Unit.INSTANCE;
            case 21:
                MediaItem mediaItem2 = (MediaItem) obj;
                mediaItem2.getClass();
                Integer parentIndexNumber = mediaItem2.getParentIndexNumber();
                if (parentIndexNumber != null) {
                    return parentIndexNumber;
                }
                return Integer.MAX_VALUE;
            case 22:
                MediaItem mediaItem3 = (MediaItem) obj;
                mediaItem3.getClass();
                Integer indexNumber = mediaItem3.getIndexNumber();
                if (indexNumber != null) {
                    return indexNumber;
                }
                return Integer.MAX_VALUE;
            case 23:
                MediaItem mediaItem4 = (MediaItem) obj;
                mediaItem4.getClass();
                return mediaItem4.getName();
            case 24:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 25:
                CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                cacheDrawScope.getClass();
                Brush.Companion companion = Brush.INSTANCE;
                Float fValueOf = Float.valueOf(0.0f);
                Color.Companion companion2 = Color.INSTANCE;
                Pair pair = TuplesKt.to(fValueOf, Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.24f, 0.0f, 0.0f, 0.0f, 14, null)));
                Pair pair2 = TuplesKt.to(Float.valueOf(0.24f), Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null)));
                Pair pair3 = TuplesKt.to(Float.valueOf(0.5f), Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.09f, 0.0f, 0.0f, 0.0f, 14, null)));
                Pair pair4 = TuplesKt.to(Float.valueOf(0.78f), Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null)));
                Float fValueOf2 = Float.valueOf(1.0f);
                Pair[] pairArr = {pair, pair2, pair3, pair4, TuplesKt.to(fValueOf2, Color.m5142boximpl(companion2.m5187getTransparent0d7_KjU()))};
                float fIntBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.m4730getSizeNHjbRc() >> 32)) * 0.08f;
                Brush brushM5110radialGradientP_VxKs$default = Brush.Companion.m5110radialGradientP_VxKs$default(companion, pairArr, Offset.m4904constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m4730getSizeNHjbRc() & 4294967295L)) * 0.84f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)), Size.m4979getMaxDimensionimpl(cacheDrawScope.m4730getSizeNHjbRc()) * 0.92f, 0, 8, (Object) null);
                Pair[] pairArr2 = {TuplesKt.to(fValueOf, Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.14f, 0.0f, 0.0f, 0.0f, 14, null))), TuplesKt.to(Float.valueOf(0.34f), Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.09f, 0.0f, 0.0f, 0.0f, 14, null))), TuplesKt.to(Float.valueOf(0.62f), Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null))), TuplesKt.to(fValueOf2, Color.m5142boximpl(companion2.m5187getTransparent0d7_KjU()))};
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cacheDrawScope.m4730getSizeNHjbRc() >> 32)) * 0.34f;
                return cacheDrawScope.onDrawBehind(new c1(brushM5110radialGradientP_VxKs$default, Brush.Companion.m5110radialGradientP_VxKs$default(companion, pairArr2, Offset.m4904constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m4730getSizeNHjbRc() & 4294967295L)) * 0.78f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32)), Size.m4979getMaxDimensionimpl(cacheDrawScope.m4730getSizeNHjbRc()) * 0.78f, 0, 8, (Object) null), Brush.Companion.m5114verticalGradient8A3gB4$default(companion, new Pair[]{TuplesKt.to(fValueOf, Color.m5142boximpl(companion2.m5187getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.56f), Color.m5142boximpl(companion2.m5187getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.82f), Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null))), TuplesKt.to(fValueOf2, Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null)))}, 0.0f, 0.0f, 0, 14, (Object) null), 15));
            case 26:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 27:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 28:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            default:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
        }
    }
}
