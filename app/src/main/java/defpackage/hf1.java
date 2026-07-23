package defpackage;

import android.util.Log;
import androidx.compose.ui.focus.FocusState;
import com.dh.myembyapp.data.SubtitlePreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hf1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ hf1(Function1 function1, Function0 function0, int i) {
        this.a = i;
        this.b = function1;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function0 function0 = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                Log.d("SubtitleSettings", "图形字幕亮度变化: " + num.intValue());
                function1.invoke(num);
                function0.invoke();
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                Log.d("SubtitleSettings", "图形字幕亮度增强切换: " + bool.booleanValue());
                function1.invoke(bool);
                function0.invoke();
                break;
            case 2:
                SubtitlePreferences.SubtitleColor subtitleColor = (SubtitlePreferences.SubtitleColor) obj;
                subtitleColor.getClass();
                Log.d("SubtitleSettings", "颜色变化: " + subtitleColor);
                function1.invoke(subtitleColor);
                function0.invoke();
                break;
            case 3:
                Boolean bool2 = (Boolean) obj;
                Log.d("SubtitleSettings", "ASS 增强渲染切换: " + bool2.booleanValue());
                function1.invoke(bool2);
                function0.invoke();
                break;
            default:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                function1.invoke(Boolean.valueOf(focusState.getHasFocus()));
                if (focusState.getHasFocus()) {
                    function0.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
