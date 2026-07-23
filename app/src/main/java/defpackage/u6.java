package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;

import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.ServerConfig;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class u6 implements Function4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ LazyListState e;
    public final /* synthetic */ CoroutineScope g;
    public final /* synthetic */ FocusRequester h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ String k;
    public final /* synthetic */ FocusRequester l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Function n;

    public /* synthetic */ u6(List list, Object obj, int i, int i2, LazyListState lazyListState, CoroutineScope coroutineScope, FocusRequester focusRequester, Function1 function1, boolean z, String str, FocusRequester focusRequester2, Function function, int i3) {
        this.a = i3;
        this.b = list;
        this.m = obj;
        this.c = i;
        this.d = i2;
        this.e = lazyListState;
        this.g = coroutineScope;
        this.h = focusRequester;
        this.i = function1;
        this.j = z;
        this.k = str;
        this.l = focusRequester2;
        this.n = function;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0224  */
    /* JADX WARN: Code duplicated, block: B:118:0x022f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0232  */
    /* JADX WARN: Code duplicated, block: B:121:0x0235  */
    /* JADX WARN: Code duplicated, block: B:123:0x0238  */
    /* JADX WARN: Code duplicated, block: B:125:0x0243  */
    /* JADX WARN: Code duplicated, block: B:135:0x027d  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ad  */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String strN;
        Modifier modifierOnFocusChanged;
        int i2;
        FocusRequester focusRequester;
        boolean zChanged;
        Object objRememberedValue;
        int i3;
        int i4 = this.a;
        CoroutineScope coroutineScope = this.g;
        LazyListState lazyListState = this.e;
        int i5 = this.d;
        int i6 = this.c;
        List list = this.b;
        Object obj5 = this.m;
        FocusRequester focusRequester2 = this.h;
        Function function = this.n;
        switch (i4) {
            case 0:
                LazyItemScope lazyItemScope = (LazyItemScope) obj;
                int iIntValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                Function3 function3 = (Function3) function;
                g3 g3Var = (g3) obj5;
                ServerConfig serverConfig = g3Var.a;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= composer.changed(iIntValue) ? 32 : 16;
                }
                if (composer.shouldExecute((i & Input.Keys.NUMPAD_3) != 146, i & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    Library library = (Library) list.get(iIntValue);
                    composer.startReplaceGroup(809534283);
                    String strE = ll0.e("library:", serverConfig.getId(), ":", library.getId());
                    boolean z = i6 == i5;
                    String name = library.getName();
                    serverConfig.getClass();
                    ImageTags imageTags = library.getImageTags();
                    FocusRequester focusRequester3 = null;
                    String thumb = imageTags != null ? imageTags.getThumb() : null;
                    String primaryImageTag = library.getPrimaryImageTag();
                    if (primaryImageTag == null) {
                        ImageTags imageTags2 = library.getImageTags();
                        primaryImageTag = imageTags2 != null ? imageTags2.getPrimary() : null;
                    }
                    if (thumb == null) {
                        if (primaryImageTag == null) {
                            strN = "";
                        }
                        modifierOnFocusChanged = Modifier.INSTANCE;
                        if (iIntValue == 0) {
                            i2 = 0;
                            modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierOnFocusChanged, new g5(coroutineScope, lazyListState, 0));
                        } else {
                            i2 = 0;
                        }
                        if (z) {
                            focusRequester = null;
                        }
                        if (focusRequester != null) {
                            focusRequester = focusRequester2;
                            modifierOnFocusChanged = FocusPropertiesKt.focusProperties(modifierOnFocusChanged, new h5(focusRequester, i2));
                        }
                        if (z) {
                            modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierOnFocusChanged, new f5(this.i, i2));
                        }
                        if (this.j && Intrinsics.areEqual(strE, this.k)) {
                            focusRequester3 = this.l;
                        }
                        zChanged = composer.changed(function3) | composer.changed(strE) | composer.changedInstance(g3Var) | composer.changed(library);
                        objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new t6(function3, strE, g3Var, library, 0);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        a41.b(name, strN, (Function0) objRememberedValue, modifierOnFocusChanged, focusRequester3, composer, 0);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        primaryImageTag = thumb;
                    }
                    strN = ku.n(serverConfig, library.getId(), thumb != null ? "Thumb" : "Primary", primaryImageTag, 500);
                    modifierOnFocusChanged = Modifier.INSTANCE;
                    if (iIntValue == 0) {
                        i2 = 0;
                        modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierOnFocusChanged, new g5(coroutineScope, lazyListState, 0));
                    } else {
                        i2 = 0;
                    }
                    if (z) {
                        focusRequester = null;
                    }
                    if (focusRequester != null) {
                        focusRequester = focusRequester2;
                        modifierOnFocusChanged = FocusPropertiesKt.focusProperties(modifierOnFocusChanged, new h5(focusRequester, i2));
                    }
                    if (z) {
                        modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierOnFocusChanged, new f5(this.i, i2));
                    }
                    if (this.j) {
                        focusRequester3 = this.l;
                    }
                    zChanged = composer.changed(function3) | composer.changed(strE) | composer.changedInstance(g3Var) | composer.changed(library);
                    objRememberedValue = composer.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new t6(function3, strE, g3Var, library, 0);
                        composer.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new t6(function3, strE, g3Var, library, 0);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    a41.b(name, strN, (Function0) objRememberedValue, modifierOnFocusChanged, focusRequester3, composer, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                LazyItemScope lazyItemScope2 = (LazyItemScope) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                Function2 function2 = (Function2) function;
                j3 j3Var = (j3) obj5;
                if ((iIntValue4 & 6) == 0) {
                    i3 = iIntValue4 | (composer2.changed(lazyItemScope2) ? 4 : 2);
                } else {
                    i3 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i3 |= composer2.changed(iIntValue3) ? 32 : 16;
                }
                if (composer2.shouldExecute((i3 & Input.Keys.NUMPAD_3) != 146, i3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2039820996, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    h3 h3Var = (h3) list.get(iIntValue3);
                    composer2.startReplaceGroup(-2067654299);
                    StringBuilder sbZ = kb0.z("recent:", j3Var.a.getId(), ":", h3Var.b.getId(), ":");
                    sbZ.append(iIntValue3);
                    String string = sbZ.toString();
                    boolean z2 = i6 == i5;
                    Modifier modifierOnFocusChanged2 = Modifier.INSTANCE;
                    if (iIntValue3 == 0) {
                        modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierOnFocusChanged2, new g5(coroutineScope, lazyListState, 0));
                    }
                    boolean zChanged2 = ((((i3 & Input.Keys.FORWARD_DEL) ^ 48) > 32 && composer2.changed(iIntValue3)) || (i3 & 48) == 32) | composer2.changed(z2) | composer2.changed(focusRequester2) | composer2.changedInstance(j3Var);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new d7(z2, focusRequester2, iIntValue3, j3Var);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierFocusProperties = FocusPropertiesKt.focusProperties(modifierOnFocusChanged2, (Function1) objRememberedValue2);
                    if (z2) {
                        modifierFocusProperties = FocusChangedModifierKt.onFocusChanged(modifierFocusProperties, new f5(this.i, 0));
                    }
                    Modifier modifier = modifierFocusProperties;
                    FocusRequester focusRequester4 = (this.j && Intrinsics.areEqual(string, this.k)) ? this.l : null;
                    boolean zChanged3 = composer2.changed(function2) | composer2.changed(string) | composer2.changedInstance(h3Var);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new v5(function2, string, h3Var, 1);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    f7.N(h3Var, (Function0) objRememberedValue3, modifier, focusRequester4, composer2, 0);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
