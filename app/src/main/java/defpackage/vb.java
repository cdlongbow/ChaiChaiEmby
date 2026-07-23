package defpackage;

import android.content.Context;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback;
import androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt;
import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.BasicSecureTextField_androidKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.BottomAppBarState;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselPagerState;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.material3.internal.ChildParentSemanticsKt;
import androidx.compose.material3.internal.ChildSemanticsNode;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import com.dh.myembyapp.data.model.AudioPrioritySortType;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vb implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ vb(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return AppBarKt.TopAppBarLayout_lyUyIHI$lambda$51$lambda$46$lambda$45((SemanticsPropertyReceiver) obj);
            case 1:
                Regex regex = de.a;
                return Integer.valueOf(de.a((String) obj));
            case 2:
                Regex regex2 = de.a;
                return Integer.valueOf(de.a((String) obj));
            case 3:
                return (jf) obj;
            case 4:
                AudioPrioritySortType audioPrioritySortType = (AudioPrioritySortType) obj;
                audioPrioritySortType.getClass();
                return audioPrioritySortType.getLabel();
            case 5:
                BackupRouteConfig backupRouteConfig = (BackupRouteConfig) obj;
                backupRouteConfig.getClass();
                return backupRouteConfig.getId();
            case 6:
                return BadgeKt.badgeBounds$lambda$7$lambda$5((RulerScope) obj);
            case 7:
                return BasicSecureTextFieldKt.BasicSecureTextField_ltb6GB4$lambda$4$0((SemanticsPropertyReceiver) obj);
            case 8:
                return BasicSecureTextField_androidKt.DefaultContentResolverForSecureTextField$lambda$0((Context) obj);
            case 9:
                return BasicTextFieldKt.BasicTextField$lambda$32$0((TextLayoutResult) obj);
            case 10:
                return BasicTextFieldKt.BasicTextField$lambda$16$0((TextLayoutResult) obj);
            case 11:
                return BasicTextFieldKt.BasicTextField$lambda$26$0((TextLayoutResult) obj);
            case 12:
                return BasicTextFieldKt.BasicTextField$lambda$29$0((TextLayoutResult) obj);
            case 13:
                return Long.valueOf(((Long) obj).longValue());
            case 14:
                return BorderKt.drawContentWithoutBorder$lambda$0((ContentDrawScope) obj);
            case 15:
                return BottomAppBarState.Companion.Saver$lambda$1((List) obj);
            case 16:
                return Boolean.valueOf(BottomSheetScaffoldKt.rememberStandardBottomSheetState$lambda$5$lambda$4((SheetValue) obj));
            case 17:
                return BringIntoViewSpec_androidKt.LocalBringIntoViewSpec$lambda$0((CompositionLocalAccessorScope) obj);
            case 18:
                return ButtonKt.Button$lambda$2$lambda$1((SemanticsPropertyReceiver) obj);
            case 19:
                return CacheDrawScopeDragShadowCallback.cachePicture$lambda$0$0$0((ContentDrawScope) obj);
            case 20:
                return CarouselKt.Carousel_cJHQLPU$lambda$16$lambda$15((SemanticsPropertyReceiver) obj);
            case 21:
                return CarouselKt.Carousel_cJHQLPU$lambda$18$lambda$17((SemanticsPropertyReceiver) obj);
            case 22:
                return CarouselKt.carouselItem$lambda$26$lambda$22((Placeable.PlacementScope) obj);
            case 23:
                return CarouselPagerState.Saver$lambda$2((List) obj);
            case 24:
                return CarouselState.Saver$lambda$3((List) obj);
            case 25:
                return ChildParentSemanticsKt.childSemantics$lambda$0((SemanticsPropertyReceiver) obj);
            case 26:
                return Boolean.valueOf(ChildSemanticsNode.onDetach$lambda$2((TraversableNode) obj));
            case 27:
                return ChipKt.SelectableChip_u0RnIRE$lambda$21$lambda$20((SemanticsPropertyReceiver) obj);
            case 28:
                return ChipKt.Chip_nkUnTEs$lambda$17$lambda$16((SemanticsPropertyReceiver) obj);
            default:
                return ClickableTextKt.ClickableText_4YKlhWE$lambda$0$0((TextLayoutResult) obj);
        }
    }
}
