package defpackage;

import android.content.Context;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults;
import androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.SaversKt;
import androidx.savedstate.serialization.SavedStateConfiguration_androidKt;
import com.dh.myembyapp.data.AudioTrackMemory;
import com.dh.myembyapp.data.VideoVersionMemory;
import com.dh.myembyapp.data.model.DanmakuComment;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import okio.internal.ResourceFileSystem;
import okio.internal.ZipEntry;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uc1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ uc1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objM8825constructorimpl;
        switch (this.a) {
            case 0:
                return PagerMeasureKt.measurePager_7L1iB3k$lambda$3((Placeable.PlacementScope) obj);
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                return ud1.e(th);
            case 2:
                AudioTrackMemory audioTrackMemory = (AudioTrackMemory) obj;
                audioTrackMemory.getClass();
                return Long.valueOf(audioTrackMemory.getTimestamp());
            case 3:
                AudioTrackMemory audioTrackMemory2 = (AudioTrackMemory) obj;
                audioTrackMemory2.getClass();
                return Long.valueOf(audioTrackMemory2.getTimestamp());
            case 4:
                VideoVersionMemory videoVersionMemory = (VideoVersionMemory) obj;
                videoVersionMemory.getClass();
                return Long.valueOf(videoVersionMemory.getTimestamp());
            case 5:
                VideoVersionMemory videoVersionMemory2 = (VideoVersionMemory) obj;
                videoVersionMemory2.getClass();
                return Long.valueOf(videoVersionMemory2.getTimestamp());
            case 6:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 7:
                DanmakuComment danmakuComment = (DanmakuComment) obj;
                danmakuComment.getClass();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM8825constructorimpl = Result.m8825constructorimpl(StringsKt.trim((CharSequence) danmakuComment.parseParams().getSource()).toString());
                    break;
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th2));
                }
                return (String) (Result.m8831isFailureimpl(objM8825constructorimpl) ? null : objM8825constructorimpl);
            case 8:
                Double d = (Double) obj;
                if (d != null) {
                    return Float.valueOf((float) d.doubleValue());
                }
                return null;
            case 9:
                return ProcessTextApi23Impl.processTextActivitiesQuery$lambda$0((Context) obj);
            case 10:
                return ProgressIndicatorKt._get_linearIndeterminateFirstLineHeadAnimationSpec_$lambda$43((KeyframesSpec.KeyframesSpecConfig) obj);
            case 11:
                return ProgressIndicatorKt._get_linearIndeterminateFirstLineTailAnimationSpec_$lambda$44((KeyframesSpec.KeyframesSpecConfig) obj);
            case 12:
                return ProgressIndicatorKt._get_circularIndeterminateProgressAnimationSpec_$lambda$42((KeyframesSpec.KeyframesSpecConfig) obj);
            case 13:
                return ProgressIndicatorKt._get_circularIndeterminateRotationAnimationSpec_$lambda$41((KeyframesSpec.KeyframesSpecConfig) obj);
            case 14:
                return ProgressIndicatorKt._get_linearIndeterminateSecondLineHeadAnimationSpec_$lambda$45((KeyframesSpec.KeyframesSpecConfig) obj);
            case 15:
                return ProgressIndicatorKt._get_linearIndeterminateSecondLineTailAnimationSpec_$lambda$46((KeyframesSpec.KeyframesSpecConfig) obj);
            case 16:
                return ProgressSemanticsKt.progressSemantics$lambda$1((SemanticsPropertyReceiver) obj);
            case 17:
                return PullToRefreshDefaults.IndicatorBox_1CPYgEU$lambda$2$lambda$1((ContentDrawScope) obj);
            case 18:
                return PullToRefreshStateImpl.Saver$lambda$1(((Float) obj).floatValue());
            case 19:
                return Boolean.valueOf(ReceiveContentDragAndDropNode_androidKt.ReceiveContentDragAndDropNode$lambda$0((DragAndDropEvent) obj));
            case 20:
                return Boolean.valueOf(ResourceFileSystem.toJarRoot$lambda$0((ZipEntry) obj));
            case 21:
                return Boolean.valueOf(RetainedValuesStoreRegistry.dispose$lambda$0(obj));
            case 22:
                return SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE$lambda$1$lambda$0((List) obj);
            case 23:
                return SavedStateConfiguration_androidKt.getDefaultSerializersModuleOnPlatform$lambda$1$lambda$0((List) obj);
            case 24:
                return SaverKt.AutoSaver$lambda$1(obj);
            case 25:
                return SaversKt.TextLinkStylesSaver$lambda$1(obj);
            case 26:
                return SaversKt.AnnotatedStringSaver$lambda$1(obj);
            case 27:
                return SaversKt.TextDecorationSaver$lambda$1(obj);
            case 28:
                return SaversKt.TextGeometricTransformSaver$lambda$1(obj);
            default:
                return SaversKt.TextIndentSaver$lambda$1(obj);
        }
    }
}
