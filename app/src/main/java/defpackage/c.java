package defpackage;

import android.content.Intent;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.BorderModifierNode;
import androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarScrollBehavior;
import androidx.compose.material3.BottomAppBarState;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.SingleRowTopAppBarOverrideScope;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.TwoRowsTopAppBarOverrideScope;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.material3.internal.ChildSemanticsNode;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.HostDefaultKey;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.dh.myembyapp.data.DanmakuMemory;
import com.dh.myembyapp.server.BackupRouteConfigServerManager;
import com.dh.myembyapp.server.ConfigServerManager;
import com.dh.myembyapp.server.DanmakuConfigServerManager;
import com.dh.myembyapp.server.DanmakuSearchInputServerManager;
import com.dh.myembyapp.server.SearchInputServerManager;
import java.io.IOException;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractMap;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.BroadcastKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kd kdVar;
        int i = this.a;
        int i2 = 1;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return AbstractCollection.toString$lambda$0((AbstractCollection) obj2, obj);
            case 1:
                return AbstractMap.toString$lambda$0((AbstractMap) obj2, (Map.Entry) obj);
            case 2:
                ((DisposableEffectScope) obj).getClass();
                return new o2((ConfigServerManager) obj2, 0);
            case 3:
                ((DisposableEffectScope) obj).getClass();
                return new o2((SearchInputServerManager) obj2, i2);
            case 4:
                String str = (String) obj;
                str.getClass();
                ((v8) obj2).c(str);
                return Unit.INSTANCE;
            case 5:
                return AndroidCursorHandle_androidKt.CursorHandle_USBMPiE$lambda$0$0((OffsetProvider) obj2, (SemanticsPropertyReceiver) obj);
            case 6:
                return AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$19$lambda$18((BottomAppBarScrollBehavior) obj2, ((Float) obj).floatValue());
            case 7:
                return AppBarKt.settleAppBarBottom$lambda$30((BottomAppBarState) obj2, (AnimationScope) obj);
            case 8:
                Intent intent = (Intent) obj;
                intent.getClass();
                ((ManagedActivityResultLauncher) obj2).launch(intent);
                return Unit.INSTANCE;
            case 9:
                long jLongValue = ((Long) obj).longValue();
                vd vdVar = ((fe) obj2).b;
                if (vdVar != null && (kdVar = vdVar.c) != null) {
                    he heVar = he.a;
                    ud udVar = vdVar.h;
                    udVar.getClass();
                    ge geVar = kdVar.d;
                    if (geVar.b) {
                        udVar.invoke(kdVar.b);
                    } else {
                        geVar.c = jLongValue;
                        geVar.e = udVar;
                        geVar.d = heVar;
                        kdVar.c.execute(geVar);
                    }
                }
                return Unit.INSTANCE;
            case 10:
                ((DisposableEffectScope) obj).getClass();
                return new o2((BackupRouteConfigServerManager) obj2, 2);
            case 11:
                return BasicTextContextMenuProviderKt.basicTextContextMenuProvider$lambda$1$0((BasicTextContextMenuProvider) obj2, (DisposableEffectScope) obj);
            case 12:
                return BasicTextFieldKt.BasicTextField$lambda$12$0((TextFieldSelectionState) obj2, (DisposableEffectScope) obj);
            case 13:
                return BasicTooltipKt.BasicTooltipBox$lambda$4$lambda$3((TooltipState) obj2, (DisposableEffectScope) obj);
            case 14:
                return androidx.compose.foundation.BasicTooltipKt.BasicTooltipBox$lambda$1$0((BasicTooltipState) obj2, (DisposableEffectScope) obj);
            case 15:
                return BorderModifierNode.drawWithCacheModifierNode$lambda$0((BorderModifierNode) obj2, (CacheDrawScope) obj);
            case 16:
                return BroadcastKt.broadcast$lambda$1((ReceiveChannel) obj2, (Throwable) obj);
            case 17:
                return CacheDrawScopeDragShadowCallback.cachePicture$lambda$0$1((CacheDrawScopeDragShadowCallback) obj2, (ContentDrawScope) obj);
            case 18:
                return Boolean.valueOf(ChildSemanticsNode.applySemantics$lambda$1((SemanticsPropertyReceiver) obj2, (TraversableNode) obj));
            case 19:
                return CompositionLocalKt.compositionLocalWithHostDefaultOf$lambda$0((HostDefaultKey) obj2, (CompositionLocalAccessorScope) obj);
            case 20:
                return ContextMenuGesturesKt.contextMenuGestures$lambda$0((ContextMenuState) obj2, (Offset) obj);
            case 21:
                int iIntValue = ((Integer) obj).intValue();
                return "已加载记忆弹幕: " + ((DanmakuMemory.MovieDanmakuMemory) obj2).getAnimeTitle() + "\n弹幕: " + iIntValue + "条";
            case 22:
                DanmakuMemory.EpisodeDanmakuMemory episodeDanmakuMemory = (DanmakuMemory.EpisodeDanmakuMemory) obj2;
                return ll0.f(kb0.z("已加载记忆弹幕: ", episodeDanmakuMemory.getAnimeTitle(), " - ", episodeDanmakuMemory.getEpisodeTitle(), "\n弹幕: "), ((Integer) obj).intValue(), "条");
            case 23:
                ((DisposableEffectScope) obj).getClass();
                return new o2((DanmakuSearchInputServerManager) obj2, 4);
            case 24:
                ((DisposableEffectScope) obj).getClass();
                return new o2((DanmakuConfigServerManager) obj2, 5);
            case 25:
                return DatePickerKt.WeekDays$lambda$48$lambda$47$lambda$45$lambda$44((Pair) obj2, (SemanticsPropertyReceiver) obj);
            case 26:
                return DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$4$lambda$3((SingleRowTopAppBarOverrideScope) obj2, ((Float) obj).floatValue());
            case 27:
                return DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$15$lambda$14((TwoRowsTopAppBarOverrideScope) obj2, ((Float) obj).floatValue());
            case 28:
                return DiskLruCache.newJournalWriter$lambda$0((DiskLruCache) obj2, (IOException) obj);
            default:
                ((ib0) obj2).m = true;
                return Unit.INSTANCE;
        }
    }
}
