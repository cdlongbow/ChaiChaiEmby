package defpackage;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListState$prefetchScope$1;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt;
import androidx.compose.foundation.text.modifiers.TextStyleProviderNodeKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.text.TextStyle;
import com.dh.myembyapp.data.model.AudioPrioritySortType;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.SubtitlePrioritySortType;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import com.dh.myembyapp.data.model.VideoPriorityRule;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ns0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ns0(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<SubtitlePrioritySortType> listNormalizeSortTypes;
        List<AudioPrioritySortType> listNormalizeSortTypes2;
        int i = this.a;
        Object obj2 = this.d;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return ImeEditCommand_androidKt.setComposingText$lambda$0((String) obj3, (List) obj2, i2, (TextFieldBuffer) obj);
            case 1:
                return LazyListState$prefetchScope$1.schedulePrefetch$lambda$1((Function1) obj3, i2, (LazyListMeasureResult) obj2, (LazyLayoutPrefetchState.PrefetchResultScope) obj);
            case 2:
                Function1 function1 = (Function1) obj3;
                VideoVersionPrioritySettings videoVersionPrioritySettings = (VideoVersionPrioritySettings) obj2;
                VideoPriorityRule videoPriorityRule = (VideoPriorityRule) obj;
                videoPriorityRule.getClass();
                List<VideoPriorityRule> rules = videoVersionPrioritySettings.getRules();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(rules, 10));
                int i3 = 0;
                for (Object obj4 : rules) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    VideoPriorityRule videoPriorityRule2 = (VideoPriorityRule) obj4;
                    if (i3 == i2) {
                        videoPriorityRule2 = videoPriorityRule;
                    }
                    arrayList.add(videoPriorityRule2);
                    i3 = i4;
                }
                function1.invoke(videoVersionPrioritySettings.copy(arrayList).normalized());
                return Unit.INSTANCE;
            case 3:
                Function1 function2 = (Function1) obj3;
                SubtitleVersionPrioritySettings subtitleVersionPrioritySettings = (SubtitleVersionPrioritySettings) obj2;
                SubtitlePrioritySortType subtitlePrioritySortType = (SubtitlePrioritySortType) obj;
                subtitlePrioritySortType.getClass();
                List<? extends SubtitlePrioritySortType> mutableList = CollectionsKt.toMutableList((Collection) subtitleVersionPrioritySettings.getSortTypes());
                if (i2 < 0 || i2 >= mutableList.size()) {
                    listNormalizeSortTypes = SubtitleVersionPrioritySettings.INSTANCE.normalizeSortTypes(mutableList);
                } else {
                    SubtitlePrioritySortType subtitlePrioritySortType2 = mutableList.get(i2);
                    int iIndexOf = mutableList.indexOf(subtitlePrioritySortType);
                    if (iIndexOf >= 0 && iIndexOf < mutableList.size() && iIndexOf != i2) {
                        mutableList.set(iIndexOf, subtitlePrioritySortType2);
                    }
                    mutableList.set(i2, subtitlePrioritySortType);
                    listNormalizeSortTypes = SubtitleVersionPrioritySettings.INSTANCE.normalizeSortTypes(mutableList);
                }
                function2.invoke(SubtitleVersionPrioritySettings.copy$default(subtitleVersionPrioritySettings, listNormalizeSortTypes, null, null, 6, null).normalized());
                return Unit.INSTANCE;
            case 4:
                Function1 function3 = (Function1) obj3;
                AudioVersionPrioritySettings audioVersionPrioritySettings = (AudioVersionPrioritySettings) obj2;
                AudioPrioritySortType audioPrioritySortType = (AudioPrioritySortType) obj;
                audioPrioritySortType.getClass();
                List<? extends AudioPrioritySortType> mutableList2 = CollectionsKt.toMutableList((Collection) audioVersionPrioritySettings.getSortTypes());
                if (i2 < 0 || i2 >= mutableList2.size()) {
                    listNormalizeSortTypes2 = AudioVersionPrioritySettings.INSTANCE.normalizeSortTypes(mutableList2);
                } else {
                    AudioPrioritySortType audioPrioritySortType2 = mutableList2.get(i2);
                    int iIndexOf2 = mutableList2.indexOf(audioPrioritySortType);
                    if (iIndexOf2 >= 0 && iIndexOf2 < mutableList2.size() && iIndexOf2 != i2) {
                        mutableList2.set(iIndexOf2, audioPrioritySortType2);
                    }
                    mutableList2.set(i2, audioPrioritySortType);
                    listNormalizeSortTypes2 = AudioVersionPrioritySettings.INSTANCE.normalizeSortTypes(mutableList2);
                }
                function3.invoke(AudioVersionPrioritySettings.copy$default(audioVersionPrioritySettings, listNormalizeSortTypes2, null, 0, 0, 0, 0, 0, 0, 254, null).normalized());
                return Unit.INSTANCE;
            case 5:
                return RecomposeScopeImpl.end$lambda$0$1((RecomposeScopeImpl) obj3, i2, (MutableObjectIntMap) obj2, (Composition) obj);
            case 6:
                return ScrollNode.measure_3p2s80s$lambda$0((ScrollNode) obj3, i2, (Placeable) obj2, (Placeable.PlacementScope) obj);
            default:
                return Boolean.valueOf(TextStyleProviderNodeKt.inheritedTextStyle_Bh5OqGs$lambda$0((Ref.ObjectRef) obj3, i2, (TextStyle) obj2, (TraversableNode) obj));
        }
    }

    public /* synthetic */ ns0(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
