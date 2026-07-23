package defpackage;

import com.dh.myembyapp.data.DanmakuSettingsManager;
import com.dh.myembyapp.data.preferences.DanmakuPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class mx {
    public final CoroutineScope a;
    public final kx b;
    public final DanmakuPreferences c;
    public final DanmakuSettingsManager d;
    public final ax e;
    public final th1 f;
    public final wh1 g;
    public final Function1 h;
    public final Function1 i;
    public final Function1 j;
    public final Function0 k;

    public mx(CoroutineScope coroutineScope, kx kxVar, DanmakuPreferences danmakuPreferences, DanmakuSettingsManager danmakuSettingsManager, ax axVar, th1 th1Var, wh1 wh1Var, Function1 function1, Function1 function2, Function1 function3, Function0 function0) {
        axVar.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function0.getClass();
        this.a = coroutineScope;
        this.b = kxVar;
        this.c = danmakuPreferences;
        this.d = danmakuSettingsManager;
        this.e = axVar;
        this.f = th1Var;
        this.g = wh1Var;
        this.h = function1;
        this.i = function2;
        this.j = function3;
        this.k = function0;
    }
}
