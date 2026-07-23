package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;

import com.dh.myembyapp.data.DanmakuMemory;
import com.dh.myembyapp.data.model.DanmakuEpisode;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes4.dex */
public final class ny implements Function4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ List g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;
    public final /* synthetic */ DanmakuMemory k;
    public final /* synthetic */ String l;
    public final /* synthetic */ Function4 m;
    public final /* synthetic */ Function0 n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;

    public ny(List list, Integer num, Map map, MutableState mutableState, MutableState mutableState2, List list2, MutableState mutableState3, String str, String str2, DanmakuMemory danmakuMemory, String str3, Function4 function4, Function0 function0, MutableState mutableState4, MutableState mutableState5) {
        this.a = list;
        this.b = num;
        this.c = map;
        this.d = mutableState;
        this.e = mutableState2;
        this.g = list2;
        this.h = mutableState3;
        this.i = str;
        this.j = str2;
        this.k = danmakuMemory;
        this.l = str3;
        this.m = function4;
        this.n = function0;
        this.o = mutableState4;
        this.p = mutableState5;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        DanmakuEpisode danmakuEpisode;
        MutableState mutableState;
        MutableState mutableState2;
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
                ComposerKt.traceEventStart(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            DanmakuEpisode danmakuEpisode2 = (DanmakuEpisode) this.a.get(iIntValue);
            composer.startReplaceGroup(1977102617);
            Integer num = this.b;
            boolean z = num != null && iIntValue == num.intValue();
            MutableState mutableState3 = this.e;
            if (((Integer) mutableState3.getValue()) != null) {
                Integer num2 = (Integer) mutableState3.getValue();
                if (num2 != null && iIntValue == num2.intValue()) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (num == null) {
                if (iIntValue == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            MutableState mutableState4 = this.h;
            int iIntValue3 = ((Number) mutableState4.getValue()).intValue();
            boolean zChangedInstance = composer.changedInstance(this.c) | composer.changed(danmakuEpisode2);
            MutableState mutableState5 = this.d;
            boolean zChanged = zChangedInstance | composer.changed(mutableState5) | composer.changed(mutableState3) | ((((i & Input.Keys.FORWARD_DEL) ^ 48) > 32 && composer.changed(iIntValue)) || (i & 48) == 32);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                danmakuEpisode = danmakuEpisode2;
                objRememberedValue = new ky(this.c, danmakuEpisode, iIntValue, this.d, mutableState3);
                composer.updateRememberedValue(objRememberedValue);
            } else {
                danmakuEpisode = danmakuEpisode2;
            }
            Function0 function0 = (Function0) objRememberedValue;
            List list = this.g;
            boolean zChangedInstance2 = composer.changedInstance(list) | composer.changed(mutableState5) | composer.changed(mutableState3) | composer.changed(mutableState4);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ly(list, mutableState5, mutableState3, mutableState4, 0);
                mutableState = mutableState5;
                mutableState2 = mutableState4;
                composer.updateRememberedValue(objRememberedValue2);
            } else {
                mutableState2 = mutableState4;
                mutableState = mutableState5;
            }
            Function0 function1 = (Function0) objRememberedValue2;
            boolean zChangedInstance3 = composer.changedInstance(list) | composer.changed(mutableState) | composer.changed(mutableState3) | composer.changed(mutableState2);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new ly(list, mutableState, mutableState3, mutableState2, 1);
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function2 = (Function0) objRememberedValue3;
            boolean zChanged2 = composer.changed(danmakuEpisode) | composer.changed(this.i) | composer.changed(this.j) | composer.changedInstance(this.k) | composer.changed(this.l) | composer.changed(this.m) | composer.changed(this.n);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new my(danmakuEpisode, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
                composer.updateRememberedValue(objRememberedValue4);
            }
            qy.o(danmakuEpisode, z, z, iIntValue3, function0, function1, function2, (Function0) objRememberedValue4, composer, 0);
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
