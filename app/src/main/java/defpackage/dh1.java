package defpackage;

import com.dh.myembyapp.data.SubtitlePreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dh1 {
    public final SubtitlePreferences a;
    public final ce1 b;
    public final Function0 c;
    public final Function0 d;
    public final Function0 e;
    public final Function0 f;
    public final Function0 g;
    public final gh h;
    public final Function1 i;

    public dh1(SubtitlePreferences subtitlePreferences, ce1 ce1Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, gh ghVar, Function1 function5) {
        subtitlePreferences.getClass();
        ce1Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        this.a = subtitlePreferences;
        this.b = ce1Var;
        this.c = function0;
        this.d = function1;
        this.e = function2;
        this.f = function3;
        this.g = function4;
        this.h = ghVar;
        this.i = function5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh1)) {
            return false;
        }
        dh1 dh1Var = (dh1) obj;
        return Intrinsics.areEqual(this.a, dh1Var.a) && Intrinsics.areEqual(this.b, dh1Var.b) && Intrinsics.areEqual(this.c, dh1Var.c) && Intrinsics.areEqual(this.d, dh1Var.d) && Intrinsics.areEqual(this.e, dh1Var.e) && Intrinsics.areEqual(this.f, dh1Var.f) && Intrinsics.areEqual(this.g, dh1Var.g) && Intrinsics.areEqual(this.h, dh1Var.h) && Intrinsics.areEqual(this.i, dh1Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PlayerMediaListenerDependencies(subtitlePreferences=" + this.a + ", playbackMemoryPreferences=" + this.b + ", resolveCurrentMediaSource=" + this.c + ", resolveCurrentMediaSourceId=" + this.d + ", resolvePlaybackUrlForError=" + this.e + ", shouldAllowPlaybackStart=" + this.f + ", applyPendingDetailSubtitleSelection=" + this.g + ", applyPendingDetailAudioSelection=" + this.h + ", findNextEpisode=" + this.i + ")";
    }
}
