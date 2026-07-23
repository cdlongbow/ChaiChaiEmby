package defpackage;

import com.dh.myembyapp.data.model.MediaStream;
import com.dh.myembyapp.data.model.SubtitlePrioritySortType;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l60 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SubtitleVersionPrioritySettings b;

    public /* synthetic */ l60(SubtitleVersionPrioritySettings subtitleVersionPrioritySettings, int i) {
        this.a = i;
        this.b = subtitleVersionPrioritySettings;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d1  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int iCompare;
        int iCompare2;
        int i = this.a;
        SubtitleVersionPrioritySettings subtitleVersionPrioritySettings = this.b;
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        switch (i) {
            case 0:
                pair.getClass();
                pair2.getClass();
                boolean zHasLanguagePriority = subtitleVersionPrioritySettings.hasLanguagePriority();
                boolean zHasFormatPriority = subtitleVersionPrioritySettings.hasFormatPriority();
                Iterator<T> it = subtitleVersionPrioritySettings.getSortTypes().iterator();
                while (it.hasNext()) {
                    int i2 = s90.$EnumSwitchMapping$2[((SubtitlePrioritySortType) it.next()).ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            qu.f();
                            return null;
                        }
                        if (zHasFormatPriority) {
                            iCompare = Intrinsics.compare(subtitleVersionPrioritySettings.formatPriorityFor(u90.s1((MediaStream) pair.getSecond())), subtitleVersionPrioritySettings.formatPriorityFor(u90.s1((MediaStream) pair2.getSecond())));
                        } else {
                            iCompare = 0;
                        }
                    } else if (zHasLanguagePriority) {
                        iCompare = Intrinsics.compare(subtitleVersionPrioritySettings.languagePriorityFor(u90.t1((MediaStream) pair.getSecond())), subtitleVersionPrioritySettings.languagePriorityFor(u90.t1((MediaStream) pair2.getSecond())));
                    } else {
                        iCompare = 0;
                    }
                    if (iCompare != 0) {
                        return Integer.valueOf(iCompare);
                    }
                }
                iCompare = Intrinsics.compare(((Number) pair.getFirst()).intValue(), ((Number) pair2.getFirst()).intValue());
                return Integer.valueOf(iCompare);
            default:
                pair.getClass();
                pair2.getClass();
                boolean zHasLanguagePriority2 = subtitleVersionPrioritySettings.hasLanguagePriority();
                boolean zHasFormatPriority2 = subtitleVersionPrioritySettings.hasFormatPriority();
                Iterator<T> it2 = subtitleVersionPrioritySettings.getSortTypes().iterator();
                while (it2.hasNext()) {
                    int i3 = m42.$EnumSwitchMapping$0[((SubtitlePrioritySortType) it2.next()).ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            qu.f();
                            return null;
                        }
                        if (zHasFormatPriority2) {
                            iCompare2 = Intrinsics.compare(subtitleVersionPrioritySettings.formatPriorityFor(((h42) pair.getSecond()).g), subtitleVersionPrioritySettings.formatPriorityFor(((h42) pair2.getSecond()).g));
                        } else {
                            iCompare2 = 0;
                        }
                    } else if (zHasLanguagePriority2) {
                        iCompare2 = Intrinsics.compare(subtitleVersionPrioritySettings.languagePriorityFor(((h42) pair.getSecond()).f), subtitleVersionPrioritySettings.languagePriorityFor(((h42) pair2.getSecond()).f));
                    } else {
                        iCompare2 = 0;
                    }
                    if (iCompare2 != 0) {
                        return Integer.valueOf(iCompare2);
                    }
                }
                iCompare2 = Intrinsics.compare(((Number) pair.getFirst()).intValue(), ((Number) pair2.getFirst()).intValue());
                return Integer.valueOf(iCompare2);
        }
    }
}
