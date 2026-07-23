package defpackage;

import com.dh.myembyapp.data.model.AudioLanguagePreference;
import com.dh.myembyapp.data.model.AudioPrioritySortType;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hg implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioVersionPrioritySettings b;

    public /* synthetic */ hg(AudioVersionPrioritySettings audioVersionPrioritySettings, int i) {
        this.a = i;
        this.b = audioVersionPrioritySettings;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int iCompare;
        int iCompare2;
        int i = this.a;
        AudioVersionPrioritySettings audioVersionPrioritySettings = this.b;
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        switch (i) {
            case 0:
                pair.getClass();
                pair2.getClass();
                boolean zHasDistinctFormatPriorities = AudioVersionPrioritySettings.INSTANCE.hasDistinctFormatPriorities(audioVersionPrioritySettings);
                Iterator<T> it = audioVersionPrioritySettings.getSortTypes().iterator();
                while (it.hasNext()) {
                    int i2 = og.$EnumSwitchMapping$0[((AudioPrioritySortType) it.next()).ordinal()];
                    if (i2 == 1) {
                        AudioLanguagePreference preferredLanguage = audioVersionPrioritySettings.getPreferredLanguage();
                        AudioLanguagePreference audioLanguagePreference = AudioLanguagePreference.DEFAULT;
                        if (preferredLanguage == audioLanguagePreference) {
                            iCompare = 0;
                        } else {
                            yf yfVar = (yf) pair.getSecond();
                            AudioLanguagePreference preferredLanguage2 = audioVersionPrioritySettings.getPreferredLanguage();
                            int i3 = (preferredLanguage2 == audioLanguagePreference || yfVar.d == preferredLanguage2) ? 0 : 1;
                            yf yfVar2 = (yf) pair2.getSecond();
                            AudioLanguagePreference preferredLanguage3 = audioVersionPrioritySettings.getPreferredLanguage();
                            iCompare = Intrinsics.compare(i3, (preferredLanguage3 == audioLanguagePreference || yfVar2.d == preferredLanguage3) ? 0 : 1);
                        }
                    } else {
                        if (i2 != 2) {
                            qu.f();
                            return null;
                        }
                        if (zHasDistinctFormatPriorities) {
                            iCompare = Intrinsics.compare(pg.m((yf) pair.getSecond(), audioVersionPrioritySettings), pg.m((yf) pair2.getSecond(), audioVersionPrioritySettings));
                        } else {
                            iCompare = 0;
                        }
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
                boolean zHasDistinctFormatPriorities2 = AudioVersionPrioritySettings.INSTANCE.hasDistinctFormatPriorities(audioVersionPrioritySettings);
                Iterator<T> it2 = audioVersionPrioritySettings.getSortTypes().iterator();
                while (it2.hasNext()) {
                    int i4 = s90.$EnumSwitchMapping$0[((AudioPrioritySortType) it2.next()).ordinal()];
                    if (i4 == 1) {
                        AudioLanguagePreference preferredLanguage4 = audioVersionPrioritySettings.getPreferredLanguage();
                        AudioLanguagePreference audioLanguagePreference2 = AudioLanguagePreference.DEFAULT;
                        if (preferredLanguage4 == audioLanguagePreference2) {
                            iCompare2 = 0;
                        } else {
                            rg rgVar = (rg) pair.getSecond();
                            AudioLanguagePreference preferredLanguage5 = audioVersionPrioritySettings.getPreferredLanguage();
                            int i5 = (preferredLanguage5 == audioLanguagePreference2 || rgVar.d == preferredLanguage5) ? 0 : 1;
                            rg rgVar2 = (rg) pair2.getSecond();
                            AudioLanguagePreference preferredLanguage6 = audioVersionPrioritySettings.getPreferredLanguage();
                            iCompare2 = Intrinsics.compare(i5, (preferredLanguage6 == audioLanguagePreference2 || rgVar2.d == preferredLanguage6) ? 0 : 1);
                        }
                    } else {
                        if (i4 != 2) {
                            qu.f();
                            return null;
                        }
                        if (zHasDistinctFormatPriorities2) {
                            iCompare2 = Intrinsics.compare(u90.r1(((rg) pair.getSecond()).e, audioVersionPrioritySettings), u90.r1(((rg) pair2.getSecond()).e, audioVersionPrioritySettings));
                        } else {
                            iCompare2 = 0;
                        }
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
