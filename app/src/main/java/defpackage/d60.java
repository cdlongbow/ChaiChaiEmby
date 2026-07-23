package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;
import androidx.lifecycle.LifecycleOwner;
import com.dh.myembyapp.data.SubtitlePreferences;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d60 implements Function1 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ State i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ State k;
    public final /* synthetic */ State l;
    public final /* synthetic */ State m;
    public final /* synthetic */ Object n;

    public /* synthetic */ d60(ce1 ce1Var, MediaItem mediaItem, MediaSource mediaSource, Function1 function1, List list, String str, Function1 function2, MutableState mutableState, MutableIntState mutableIntState, MutableState mutableState2, MutableState mutableState3, MutableIntState mutableIntState2) {
        this.n = ce1Var;
        this.b = mediaItem;
        this.c = mediaSource;
        this.d = function1;
        this.e = list;
        this.g = str;
        this.h = function2;
        this.i = mutableState;
        this.j = mutableIntState;
        this.k = mutableState2;
        this.l = mutableState3;
        this.m = mutableIntState2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0129  */
    /* JADX WARN: Code duplicated, block: B:23:0x012f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0137  */
    /* JADX WARN: Code duplicated, block: B:26:0x0152  */
    /* JADX WARN: Code duplicated, block: B:45:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x01d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:57:0x0209  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 java.lang.Object, still in use, count: 2, list:
          (r2v5 java.lang.Object) from 0x01c7: PHI (r2 I:Object) = (r2v2 java.lang.Object), (r2v5 java.lang.Object) binds: [B:42:0x01c6, B:63:0x01c7] A[DONT_GENERATE, DONT_INLINE]
          (r2v5 java.lang.Object) from 0x01b5: CHECK_CAST (com.dh.myembyapp.data.model.MediaStream) (r2v5 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d60.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ d60(State state, LifecycleOwner lifecycleOwner, State state2, State state3, State state4, State state5, State state6, State state7, State state8, State state9, State state10, State state11) {
        this.n = state;
        this.b = lifecycleOwner;
        this.c = state2;
        this.d = state3;
        this.h = state4;
        this.e = state5;
        this.g = state6;
        this.i = state7;
        this.k = state8;
        this.l = state9;
        this.j = state10;
        this.m = state11;
    }

    public /* synthetic */ d60(LifecycleOwner lifecycleOwner, UserPreferences userPreferences, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, State state, ScrollState scrollState, MutableState mutableState5, FocusRequester focusRequester, MutableState mutableState6) {
        this.n = lifecycleOwner;
        this.b = userPreferences;
        this.c = coroutineScope;
        this.i = mutableState;
        this.k = mutableState2;
        this.l = mutableState3;
        this.d = mutableState4;
        this.h = state;
        this.e = scrollState;
        this.g = mutableState5;
        this.j = focusRequester;
        this.m = mutableState6;
    }

    public /* synthetic */ d60(MediaItem mediaItem, MediaSource mediaSource, SubtitlePreferences subtitlePreferences, Function1 function1, List list, String str, Function1 function2, MutableState mutableState, MutableIntState mutableIntState, MutableState mutableState2, MutableState mutableState3, MutableIntState mutableIntState2) {
        this.b = mediaItem;
        this.c = mediaSource;
        this.n = subtitlePreferences;
        this.d = function1;
        this.e = list;
        this.g = str;
        this.h = function2;
        this.i = mutableState;
        this.j = mutableIntState;
        this.k = mutableState2;
        this.l = mutableState3;
        this.m = mutableIntState2;
    }
}
