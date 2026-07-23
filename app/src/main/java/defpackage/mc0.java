package defpackage;

import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.foundation.lazy.LazyListMeasuredItemProvider;
import androidx.compose.foundation.lazy.LazyListPrefetchStrategy;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.IndicatorLineNode;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.navigationevent.NavigationEventTransitionState;
import androidx.navigationevent.compose.NavigationEventHandlerKt;
import androidx.navigationevent.compose.NavigationEventState;
import com.dh.myembyapp.MyEmbyApp;
import com.dh.myembyapp.data.VideoVersionMemory;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.server.OnlineSubtitleConfigServerManager;
import com.dh.myembyapp.server.OnlineSubtitleSearchInputServerManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatcherMatchResult$groups$1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.future.FutureKt;
import kotlinx.coroutines.guava.ListenableFutureKt;
import okhttp3.HttpUrl;
import okio.ForwardingFileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mc0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mc0(HttpUrl httpUrl, MyEmbyApp myEmbyApp) {
        this.a = 18;
        this.b = httpUrl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(DragGestureNode._canDrag$lambda$0((DragGestureNode) obj2, (PointerType) obj));
            case 1:
                return FlowLayoutKt.placeHelper_BmaY500$lambda$2((MutableVector) obj2, (Placeable.PlacementScope) obj);
            case 2:
                return ForwardingFileSystem.listRecursively$lambda$0((ForwardingFileSystem) obj2, (Path) obj);
            case 3:
                return FutureKt.asCompletableFuture$lambda$2((CompletableFuture) obj2, (Throwable) obj);
            case 4:
                return Boolean.valueOf(((LinkedHashMap) obj2).containsKey((String) obj));
            case 5:
                return IconKt.Icon$lambda$12$lambda$11((ColorProducer) obj2, (CacheDrawScope) obj);
            case 6:
                return IconKt.Icon$lambda$12$lambda$11$lambda$10((GraphicsLayer) obj2, (ContentDrawScope) obj);
            case 7:
                return IndicatorLineNode.drawWithCacheModifierNode$lambda$3((IndicatorLineNode) obj2, (CacheDrawScope) obj);
            case 8:
                return Float.valueOf(LazyGridState.scrollableState$lambda$0((LazyGridState) obj2, ((Float) obj).floatValue()));
            case 9:
                return LazyGridState.Companion.saver$lambda$1((LazyGridPrefetchStrategy) obj2, (List) obj);
            case 10:
                return LazyListMeasureKt.measureLazyList_pIk1_oM$lambda$7((LazyListMeasuredItemProvider) obj2, ((Integer) obj).intValue());
            case 11:
                return Float.valueOf(LazyListState.scrollableState$lambda$0((LazyListState) obj2, ((Float) obj).floatValue()));
            case 12:
                return LazyListState.Companion.saver$lambda$1((LazyListPrefetchStrategy) obj2, (List) obj);
            case 13:
                return LazyStaggeredGridIntervalContent.item$lambda$2$0((StaggeredGridItemSpan) obj2, ((Integer) obj).intValue());
            case 14:
                return Float.valueOf(LazyStaggeredGridState.scrollableState$lambda$0((LazyStaggeredGridState) obj2, ((Float) obj).floatValue()));
            case 15:
                return ListenableFutureKt.asDeferred$lambda$4((f01) obj2, (Throwable) obj);
            case 16:
                NavOptionsBuilder navOptionsBuilder = (NavOptionsBuilder) obj;
                navOptionsBuilder.getClass();
                navOptionsBuilder.popUpTo(((NavBackStackEntry) obj2).getDestination().getId(), new ox0(29));
                navOptionsBuilder.setLaunchSingleTop(true);
                return Unit.INSTANCE;
            case 17:
                return ((MatcherMatchResult$groups$1) obj2).get(((Integer) obj).intValue());
            case 18:
                HttpUrl httpUrl = (HttpUrl) obj2;
                ServerConfig serverConfig = (ServerConfig) obj;
                int i2 = MyEmbyApp.j;
                serverConfig.getClass();
                HttpUrl httpUrl2 = HttpUrl.INSTANCE.parse(serverConfig.getFullUrl());
                if (httpUrl2 != null && StringsKt__StringsJVMKt.equals(httpUrl.host(), httpUrl2.host(), true) && httpUrl.port() == httpUrl2.port()) {
                    String strEncodedPath = httpUrl.encodedPath();
                    String strTrimEnd = StringsKt.trimEnd(httpUrl2.encodedPath(), '/');
                    if (strTrimEnd.length() == 0 || Intrinsics.areEqual(strEncodedPath, strTrimEnd) || StringsKt__StringsJVMKt.startsWith$default(strEncodedPath, strTrimEnd.concat("/"), false, 2, null)) {
                        return TuplesKt.to(serverConfig, Integer.valueOf(StringsKt.trimEnd(httpUrl2.encodedPath(), '/').length()));
                    }
                }
                return null;
            case 19:
                return NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$24$lambda$19$lambda$18((DrawerState) obj2, (Density) obj);
            case 20:
                return NavigationEventHandlerKt.NavigationEventHandler$lambda$10$lambda$9((NavigationEventState) obj2, (NavigationEventTransitionState) obj);
            case 21:
                wp wpVar = (wp) obj;
                wpVar.getClass();
                List list = ((i91) obj2).b;
                list.getClass();
                wpVar.b = list;
                return Unit.INSTANCE;
            case 22:
                ((DisposableEffectScope) obj).getClass();
                return new o2((OnlineSubtitleConfigServerManager) obj2, 8);
            case 23:
                ((DisposableEffectScope) obj).getClass();
                return new o2((OnlineSubtitleSearchInputServerManager) obj2, 10);
            case 24:
                re reVar = (re) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return reVar.a.a + "_" + ((se) reVar.b.get(iIntValue)).a + "_" + iIntValue;
            case 25:
                Integer num = (Integer) obj2;
                MediaItem mediaItem = (MediaItem) obj;
                mediaItem.getClass();
                if (num == null || mediaItem.getProductionYear() == null) {
                    return Integer.MAX_VALUE;
                }
                return Integer.valueOf(Math.abs(mediaItem.getProductionYear().intValue() - num.intValue()));
            case 26:
                return OverlayControllerImpl._init_$lambda$6((OverlayControllerImpl) obj2, (List) obj);
            case 27:
                return PaddingKt.padding$lambda$0((PaddingValues) obj2, (InspectorInfo) obj);
            case 28:
                VideoVersionMemory videoVersionMemory = (VideoVersionMemory) obj;
                videoVersionMemory.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(videoVersionMemory.getItemId(), ((MediaItem) obj2).getId()));
            default:
                ((DisposableEffectScope) obj).getClass();
                return new o2((th1) obj2, 11);
        }
    }

    public /* synthetic */ mc0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
