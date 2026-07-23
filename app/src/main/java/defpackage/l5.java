package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.unit.Dp;
import com.dh.myembyapp.data.DanmakuSettings;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.server.OnlineSubtitleConfigServerManager;
import com.dh.myembyapp.server.ProxyConfigServerManager;
import com.dh.myembyapp.server.ServerIconLibraryInputServerManager;
import java.util.List;
import java.util.Set;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ l5(int i, FocusRequester focusRequester, MediaItem mediaItem, List list, Function1 function1) {
        this.a = 9;
        this.d = list;
        this.b = mediaItem;
        this.c = i;
        this.e = function1;
        this.g = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.g;
        Object obj4 = this.b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                f7.N((h3) obj6, (Function0) obj4, (Modifier) obj5, (FocusRequester) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                pi.f((ch) obj6, (Function0) obj4, (Function0) obj5, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                pi.h((String) obj6, (Function1) obj4, (String) obj3, (Modifier) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                pi.a((Function0) obj4, (Modifier) obj5, (bh) obj6, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 4:
                return BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$5((Modifier) obj5, (ProvidableCompositionLocal) obj6, (Function5) obj4, (Function2) obj3, this.c, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                ((Integer) obj2).getClass();
                lq.g((String) obj6, (List) obj4, (String) obj5, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                lq.d((String) obj6, (Function1) obj5, (Function0) obj4, (qq) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 7:
                return ComposableLambdaImpl.invoke$lambda$2((ComposableLambdaImpl) obj6, this.b, this.e, this.g, this.c, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                ((Integer) obj2).getClass();
                gz.a((DanmakuSettings) obj6, (Function1) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 9:
                List list = (List) obj6;
                MediaItem mediaItem = (MediaItem) obj4;
                Function1 function1 = (Function1) obj5;
                FocusRequester focusRequester = (FocusRequester) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(780443428, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.SeasonSelectionDialog.<anonymous> (DetailScreen.kt:3315)");
                    }
                    Modifier modifierM1052heightInVpY3zN4$default = SizeKt.m1052heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(400.0f), 1, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
                    PaddingValues paddingValuesM994PaddingValuesYgX7TsA$default = PaddingKt.m994PaddingValuesYgX7TsA$default(0.0f, Dp.m7813constructorimpl(4.0f), 1, null);
                    boolean zChangedInstance = composer.changedInstance(list) | composer.changedInstance(mediaItem);
                    int i3 = this.c;
                    boolean zChanged = composer.changed(i3) | zChangedInstance | composer.changed(function1);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new e10(i3, focusRequester, mediaItem, list, function1);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    LazyDslKt.LazyColumn(modifierM1052heightInVpY3zN4$default, null, paddingValuesM994PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer, 24966, 490);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).intValue();
                u90.v0((List) obj6, (MediaItem) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).intValue();
                u90.n0((String) obj6, (jb1) obj5, (Function0) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).intValue();
                u90.B0((MediaItem) obj6, (aa0) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).intValue();
                vg0.a((List) obj6, (String) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                sy0.b((List) obj6, (Function2) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).intValue();
                fz0.a((List) obj6, (Set) obj5, (Function2) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                a41.d((String) obj6, (String) obj4, (Modifier) obj5, (ContentScale) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).intValue();
                y91.c((t91) obj6, (OnlineSubtitleConfigServerManager) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                bh1.b((Context) obj6, (Function0) obj4, (Function0) obj5, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).intValue();
                gr1.c((ProxyConfig) obj6, (ProxyConfigServerManager) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                sv1.a((String) obj6, (Function1) obj4, (FocusRequester) obj3, (Modifier) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).intValue();
                lx1.d((String) obj6, (ServerIconLibraryInputServerManager) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).intValue();
                hb2.b((i92) obj6, (xa2) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l5(Modifier modifier, ProvidableCompositionLocal providableCompositionLocal, Function5 function5, Function2 function2, int i) {
        this.a = 4;
        this.e = modifier;
        this.d = providableCompositionLocal;
        this.b = function5;
        this.g = function2;
        this.c = i;
    }

    public /* synthetic */ l5(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.g = obj4;
        this.c = i;
    }

    public /* synthetic */ l5(Object obj, Object obj2, Function0 function0, Object obj3, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = function0;
        this.g = obj3;
        this.c = i;
    }

    public /* synthetic */ l5(String str, Function1 function1, Object obj, Modifier modifier, int i, int i2) {
        this.a = i2;
        this.d = str;
        this.b = function1;
        this.g = obj;
        this.e = modifier;
        this.c = i;
    }

    public /* synthetic */ l5(List list, Object obj, Function function, Function0 function0, int i, int i2) {
        this.a = i2;
        this.d = list;
        this.e = obj;
        this.g = function;
        this.b = function0;
        this.c = i;
    }

    public /* synthetic */ l5(Function0 function0, Modifier modifier, bh bhVar, Function2 function2, int i) {
        this.a = 3;
        this.b = function0;
        this.e = modifier;
        this.d = bhVar;
        this.g = function2;
        this.c = i;
    }
}
