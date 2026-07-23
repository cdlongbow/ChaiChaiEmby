package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.focus.FocusRequester;

import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b90 implements Function4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Map d;
    public final /* synthetic */ List e;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ VideoVersionPrioritySettings i;
    public final /* synthetic */ Map j;
    public final /* synthetic */ Map k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ Function1 n;
    public final /* synthetic */ Function0 o;
    public final /* synthetic */ Function2 p;
    public final /* synthetic */ Function2 q;
    public final /* synthetic */ Function2 r;
    public final /* synthetic */ Function2 s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ Function1 u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ Function0 x;
    public final /* synthetic */ Function0 y;
    public final /* synthetic */ Function0 z;

    public b90(List list, String str, Map map, Map map2, List list2, String str2, String str3, VideoVersionPrioritySettings videoVersionPrioritySettings, Map map3, Map map4, Function2 function2, Function2 function3, Function1 function1, Function0 function0, Function2 function4, Function2 function5, Function2 function6, Function2 function7, Function1 function8, Function1 function9, Function1 function10, Function1 function11, Function0 function12, Function0 function13, Function0 function14) {
        this.a = list;
        this.b = str;
        this.c = map;
        this.d = map2;
        this.e = list2;
        this.g = str2;
        this.h = str3;
        this.i = videoVersionPrioritySettings;
        this.j = map3;
        this.k = map4;
        this.l = function2;
        this.m = function3;
        this.n = function1;
        this.o = function0;
        this.p = function4;
        this.q = function5;
        this.r = function6;
        this.s = function7;
        this.t = function8;
        this.u = function9;
        this.v = function10;
        this.w = function11;
        this.x = function12;
        this.y = function13;
        this.z = function14;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= composer.changed(iIntValue) ? 32 : 16;
        }
        if (composer.shouldExecute((i & Input.Keys.NUMPAD_3) != 146, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            MediaItem mediaItem = (MediaItem) this.a.get(iIntValue);
            composer.startReplaceGroup(1197593726);
            boolean zAreEqual = Intrinsics.areEqual(mediaItem.getId(), this.b);
            String str = (String) this.c.get(mediaItem.getId());
            FocusRequester focusRequester = (FocusRequester) MapsKt.getValue(this.d, mediaItem.getId());
            String id = mediaItem.getId();
            MediaItem mediaItem2 = (MediaItem) CollectionsKt.firstOrNull(this.e);
            boolean zAreEqual2 = Intrinsics.areEqual(id, mediaItem2 != null ? mediaItem2.getId() : null);
            boolean zAreEqual3 = Intrinsics.areEqual(mediaItem.getId(), this.g);
            boolean zAreEqual4 = Intrinsics.areEqual(mediaItem.getId(), this.h);
            r40 r40Var = (r40) this.j.get(mediaItem.getId());
            if (r40Var == null) {
                r40Var = new r40(mediaItem.getId(), 6);
            }
            List list = (List) this.k.get(mediaItem.getId());
            Function2 function2 = this.l;
            boolean zChanged = composer.changed(function2) | composer.changedInstance(mediaItem);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a90(function2, mediaItem, 0);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            Function2 function3 = this.m;
            boolean zChanged2 = composer.changed(function3) | composer.changedInstance(mediaItem);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new a90(function3, mediaItem, 1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function4 = (Function1) objRememberedValue2;
            Function1 function5 = this.n;
            boolean zChanged3 = composer.changed(function5) | composer.changedInstance(mediaItem);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new jq(function5, mediaItem, 2);
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            Function2 function6 = this.p;
            boolean zChanged4 = composer.changed(function6) | composer.changedInstance(mediaItem);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new a90(function6, mediaItem, 2);
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function1 function7 = (Function1) objRememberedValue4;
            Function2 function8 = this.q;
            boolean zChanged5 = composer.changed(function8) | composer.changedInstance(mediaItem);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new a90(function8, mediaItem, 3);
                composer.updateRememberedValue(objRememberedValue5);
            }
            Function1 function9 = (Function1) objRememberedValue5;
            Function1 function10 = this.t;
            boolean zChanged6 = composer.changed(function10) | composer.changedInstance(mediaItem);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new jq(function10, mediaItem, 3);
                composer.updateRememberedValue(objRememberedValue6);
            }
            u90.J(mediaItem, zAreEqual, str, focusRequester, zAreEqual2, zAreEqual3, zAreEqual4, this.i, r40Var, list, function1, function4, function0, this.o, function7, function9, this.r, this.s, (Function0) objRememberedValue6, this.u, this.v, this.w, this.x, this.y, this.z, null, composer, 0, 0, 0);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
