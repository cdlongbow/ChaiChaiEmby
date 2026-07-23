package defpackage;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.SubtitlePreferences;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e50 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MediaItem b;
    public final /* synthetic */ MediaSource c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ List e;
    public final /* synthetic */ String g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ MutableIntState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableIntState l;
    public final /* synthetic */ Object m;

    public /* synthetic */ e50(ce1 ce1Var, MediaItem mediaItem, MediaSource mediaSource, Function1 function1, List list, String str, Function1 function2, MutableIntState mutableIntState, MutableState mutableState, MutableState mutableState2, MutableIntState mutableIntState2) {
        this.m = ce1Var;
        this.b = mediaItem;
        this.c = mediaSource;
        this.d = function1;
        this.e = list;
        this.g = str;
        this.h = function2;
        this.i = mutableIntState;
        this.j = mutableState;
        this.k = mutableState2;
        this.l = mutableIntState2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0102  */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:51:0x0124  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v5 java.lang.Object, still in use, count: 2, list:
          (r1v5 java.lang.Object) from 0x00f8: PHI (r1 I:Object) = (r1v2 java.lang.Object), (r1v5 java.lang.Object) binds: [B:43:0x00f7, B:58:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          (r1v5 java.lang.Object) from 0x00e6: CHECK_CAST (com.dh.myembyapp.data.model.MediaStream) (r1v5 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e50.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ e50(MediaItem mediaItem, MediaSource mediaSource, SubtitlePreferences subtitlePreferences, Function1 function1, List list, String str, Function1 function2, MutableIntState mutableIntState, MutableState mutableState, MutableState mutableState2, MutableIntState mutableIntState2) {
        this.b = mediaItem;
        this.c = mediaSource;
        this.m = subtitlePreferences;
        this.d = function1;
        this.e = list;
        this.g = str;
        this.h = function2;
        this.i = mutableIntState;
        this.j = mutableState;
        this.k = mutableState2;
        this.l = mutableIntState2;
    }
}
