package defpackage;

import android.content.res.Resources;
import androidx.activity.SystemBarStyle;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.material3.SheetDefaultsKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.Savers_androidKt;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerIconEntry;
import com.dh.myembyapp.data.model.SubtitleFormatPriorityType;
import com.dh.myembyapp.data.model.SubtitleLanguagePriorityType;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qu1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ qu1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Savers_androidKt.TextMotionLinearitySaver$lambda$1(obj);
            case 1:
                return ScrollState.Saver$lambda$1(((Integer) obj).intValue());
            case 2:
                return Boolean.valueOf(ScrollableKt.CanDragCalculation$lambda$0((PointerType) obj));
            case 3:
                return SegmentedButtonKt.SegmentedButton$lambda$4$lambda$3((SemanticsPropertyReceiver) obj);
            case 4:
                return SelectableGroupKt.selectableGroup$lambda$0((SemanticsPropertyReceiver) obj);
            case 5:
                return SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter$lambda$0((Offset) obj);
            case 6:
                return SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter$lambda$1((AnimationVector2D) obj);
            case 7:
                return SelectionRegistrarImpl.Saver$lambda$1(((Long) obj).longValue());
            case 8:
                KClass kClass = (KClass) obj;
                kClass.getClass();
                xv0 xv0VarZ = tl0.Z(kClass);
                if (xv0VarZ != null) {
                    return xv0VarZ;
                }
                if (JvmClassMappingKt.getJavaClass(kClass).isInterface()) {
                    return new ap1(kClass);
                }
                return null;
            case 9:
                KClass kClass2 = (KClass) obj;
                kClass2.getClass();
                xv0 xv0VarZ2 = tl0.Z(kClass2);
                if (xv0VarZ2 == null) {
                    xv0VarZ2 = JvmClassMappingKt.getJavaClass(kClass2).isInterface() ? new ap1(kClass2) : null;
                }
                if (xv0VarZ2 != null) {
                    return ym.b(xv0VarZ2);
                }
                return null;
            case 10:
                ServerIconEntry serverIconEntry = (ServerIconEntry) obj;
                serverIconEntry.getClass();
                return serverIconEntry.getId();
            case 11:
                ServerConfig serverConfig = (ServerConfig) obj;
                serverConfig.getClass();
                return serverConfig.getId();
            case 12:
                return Boolean.valueOf(SheetDefaultsKt.rememberSheetState_AGcomas$lambda$3$lambda$2((SheetValue) obj));
            case 13:
                return Boolean.valueOf(SheetState._init_$lambda$0((SheetValue) obj));
            case 14:
                return Boolean.valueOf(SheetState._init_$lambda$7((SheetValue) obj));
            case 15:
                return SnapshotKt.emptyLambda$lambda$0((SnapshotIdSet) obj);
            case 16:
                String strReplace$default = StringsKt__StringsJVMKt.replace$default((String) obj, "\r\n", "\n", false, 4, (Object) null);
                int i = 0;
                int iCount = SequencesKt.count(Regex.findAll$default(new Regex("\\d{2}:\\d{2}:\\d{2}[,.]\\d{3}\\s*-->\\s*\\d{2}:\\d{2}:\\d{2}[,.]\\d{3}"), strReplace$default, 0, 2, null));
                List listSplit$default = StringsKt__StringsKt.split$default(strReplace$default, new String[]{"\n\n"}, false, 0, 6, (Object) null);
                if (listSplit$default == null || !listSplit$default.isEmpty()) {
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        if (StringsKt__StringsKt.contains$default((String) it.next(), (CharSequence) "-->", false, 2, (Object) null) && (i = i + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                return Integer.valueOf((i * 10) + (iCount * 100));
            case 17:
                o32 o32Var = (o32) obj;
                o32Var.getClass();
                return o32Var.a;
            case 18:
                return SubtitleVersionPrioritySettings.Companion.buildLanguagePriorityText$lambda$0$2((SubtitleLanguagePriorityType) obj);
            case 19:
                return SubtitleVersionPrioritySettings.Companion.buildFormatPriorityText$lambda$0$2((SubtitleFormatPriorityType) obj);
            case 20:
                return SuspendAnimationKt.animateDecay$lambda$1((AnimationScope) obj);
            case 21:
                return SuspendAnimationKt.animate$lambda$2((AnimationScope) obj);
            case 22:
                return SuspendAnimationKt.animateTo$lambda$0((AnimationScope) obj);
            case 23:
                return Boolean.valueOf(SwipeToDismissBoxKt.rememberSwipeToDismissBoxState$lambda$3$lambda$2((SwipeToDismissBoxValue) obj));
            case 24:
                return SwipeToDismissBoxKt.SwipeToDismissBox$lambda$15$lambda$14((SwipeToDismissBoxValue) obj);
            case 25:
                return SwipeToDismissBoxKt.SwipeToDismissBox$lambda$7$lambda$6((SwipeToDismissBoxValue) obj);
            case 26:
                return Boolean.valueOf(SwipeToDismissBoxState._init_$lambda$0((SwipeToDismissBoxValue) obj));
            case 27:
                return Boolean.valueOf(SystemBarStyle.Companion.light$lambda$0((Resources) obj));
            case 28:
                return Boolean.valueOf(SystemBarStyle.Companion.dark$lambda$0((Resources) obj));
            default:
                return Boolean.valueOf(SystemBarStyle.Companion.auto$lambda$0((Resources) obj));
        }
    }
}
