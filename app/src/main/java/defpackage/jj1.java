package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import com.dh.myembyapp.data.SubtitlePreferences;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jj1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ eo1 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ SubtitlePreferences d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ ln1 g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ on1 j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;
    public final /* synthetic */ MutableState v;
    public final /* synthetic */ AtomicLong w;
    public final /* synthetic */ on1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj1(Context context, eo1 eo1Var, Function0 function0, SubtitlePreferences subtitlePreferences, Function1 function1, ln1 ln1Var, MutableState mutableState, MutableState mutableState2, on1 on1Var, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, AtomicLong atomicLong, on1 on1Var2) {
        super(1, Intrinsics.Kotlin.class, "handleOnlineSubtitleLoaded", "PlayerScreenContent$lambda$121$handleOnlineSubtitleLoaded(Landroid/content/Context;Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Lkotlin/jvm/functions/Function0;Lcom/dh/myembyapp/data/SubtitlePreferences;Lkotlin/jvm/functions/Function1;Lcom/dh/myembyapp/ui/screens/player/PlayerSeekController;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerSettingsState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/util/concurrent/atomic/AtomicLong;Lcom/dh/myembyapp/ui/screens/player/PlayerSettingsState;Lcom/dh/myembyapp/data/repository/AssrtSubtitleRepository$DownloadedSubtitle;)V", 0);
        this.a = context;
        this.b = eo1Var;
        this.c = function0;
        this.d = subtitlePreferences;
        this.e = function1;
        this.g = ln1Var;
        this.h = mutableState;
        this.i = mutableState2;
        this.j = on1Var;
        this.k = mutableState3;
        this.l = mutableState4;
        this.m = mutableState5;
        this.n = mutableState6;
        this.o = mutableState7;
        this.p = mutableState8;
        this.q = mutableState9;
        this.r = mutableState10;
        this.s = mutableState11;
        this.t = mutableState12;
        this.u = mutableState13;
        this.v = mutableState14;
        this.w = atomicLong;
        this.x = on1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, aa1, androidx.media3.common.Player$Listener] */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.Runnable, z91] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<MediaStream> listEmptyList;
        pe peVar = (pe) obj;
        peVar.getClass();
        String str = peVar.b;
        long jN0 = dn1.n0(this.g);
        MutableState mutableState = this.h;
        ExoPlayer exoPlayer = (ExoPlayer) mutableState.getValue();
        MutableState mutableState2 = this.i;
        List list = (List) mutableState2.getValue();
        eo1 eo1Var = this.b;
        String id = eo1Var.a.getId();
        MediaSource mediaSource = (MediaSource) this.c.invoke();
        boolean z = eo1Var.d;
        Integer num = eo1Var.k;
        float floatValue = this.j.b.getFloatValue();
        boolean z2 = ((ExoPlayer) mutableState.getValue()).getPlayWhenReady() && dn1.q0(this.u, this.v);
        MutableState mutableState3 = this.k;
        boolean zBooleanValue = ((Boolean) mutableState3.getValue()).booleanValue();
        boolean z3 = z2;
        pl1 pl1Var = new pl1(this.w, this.x);
        exoPlayer.getClass();
        list.getClass();
        id.getClass();
        Function1 function1 = this.e;
        function1.getClass();
        if (!zBooleanValue) {
            mutableState3.setValue(Boolean.TRUE);
            Unit unit = Unit.INSTANCE;
            this.d.saveSubtitlesEnabled(true);
        }
        boolean z4 = z3;
        ta1 ta1Var = new ta1(peVar.a, str, peVar.c, peVar.d, peVar.e, peVar.f);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            ta1 ta1Var2 = (ta1) next;
            Iterator it2 = it;
            if (!Intrinsics.areEqual(ta1Var2.a, ta1Var.a) && !Intrinsics.areEqual(ta1Var2.b, str)) {
                arrayList.add(next);
            }
            it = it2;
        }
        List listPlus = CollectionsKt.plus((Collection<? extends ta1>) arrayList, ta1Var);
        String id2 = mediaSource != null ? mediaSource.getId() : null;
        if (mediaSource == null || (listEmptyList = mediaSource.getMediaStreams()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<MediaStream> list2 = listEmptyList;
        Map mapEmptyMap = MapsKt.emptyMap();
        Context context = this.a;
        ii0 ii0VarA = qn1.a(context, id, id2, list2, z, num, mapEmptyMap);
        Context context2 = context;
        List<MediaItem.SubtitleConfiguration> listPlus2 = CollectionsKt.plus((Collection) ii0VarA.a, (Iterable) qn1.b(listPlus, MapsKt.emptyMap()));
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(listPlus, 10)), 16));
        Iterator it3 = listPlus.iterator();
        while (it3.hasNext()) {
            Iterator it4 = it3;
            ta1 ta1Var3 = (ta1) it3.next();
            Context context3 = context2;
            Pair pair = TuplesKt.to(ta1Var3.b, ta1Var3.c);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
            it3 = it4;
            context2 = context3;
        }
        Context context4 = context2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(listPlus, 10)), 16));
        Iterator it5 = listPlus.iterator();
        while (it5.hasNext()) {
            Iterator it6 = it5;
            ta1 ta1Var4 = (ta1) it5.next();
            Pair pair2 = TuplesKt.to(ta1Var4.b, ta1Var4.e);
            linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
            it5 = it6;
            z4 = z4;
        }
        boolean z5 = z4;
        LinkedHashSet linkedHashSet = ii0VarA.b;
        LinkedHashMap linkedHashMap3 = ii0VarA.c;
        LinkedHashMap linkedHashMap4 = ii0VarA.d;
        mutableState2.setValue(listPlus);
        this.l.setValue(linkedHashMap);
        this.m.setValue(linkedHashMap2);
        this.n.setValue(str);
        this.o.setValue(Boolean.TRUE);
        this.p.setValue(linkedHashSet);
        this.q.setValue(linkedHashMap3);
        this.r.setValue(linkedHashMap4);
        Unit unit2 = Unit.INSTANCE;
        MediaItem.Builder builder = (MediaItem.Builder) function1.invoke(mediaSource);
        if (!listPlus2.isEmpty()) {
            builder.setSubtitleConfigurations(listPlus2);
        }
        exoPlayer.setMediaItem(builder.build());
        String str2 = ta1Var.b;
        ExoPlayer exoPlayer2 = exoPlayer;
        if (!StringsKt.isBlank(str2)) {
            Handler handler = new Handler(Looper.getMainLooper());
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            Object aa1Var = new aa1(exoPlayer, str2, booleanRef, objectRef2, handler, objectRef3, objectRef, booleanRef2);
            objectRef.element = aa1Var;
            exoPlayer.addListener(aa1Var);
            Object z91Var = new z91(booleanRef, str2, objectRef2, handler, objectRef3, exoPlayer, objectRef);
            exoPlayer2 = exoPlayer;
            objectRef3.element = z91Var;
            handler.postDelayed(z91Var, 8000L);
        }
        exoPlayer2.prepare();
        exoPlayer2.setPlaybackSpeed(floatValue);
        pl1Var.invoke(exoPlayer2, Long.valueOf(jN0));
        exoPlayer2.setPlayWhenReady(z5);
        this.s.setValue(Boolean.FALSE);
        this.t.setValue(Long.valueOf(System.currentTimeMillis()));
        Toast.makeText(context4, "已加载在线字幕：".concat(str), 0).show();
        return Unit.INSTANCE;
    }
}
