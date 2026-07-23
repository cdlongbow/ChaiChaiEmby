package defpackage;

import android.graphics.Point;
import android.util.Log;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yx implements OnApplyWindowInsetsListener, DefaultTrackSelector.TrackInfo.Factory {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yx(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        return DefaultTrackSelector.lambda$selectVideoTrack$1((DefaultTrackSelector.Parameters) this.a, (String) this.b, (int[]) this.c, (Point) this.d, i, trackGroup, iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        CoroutineScope coroutineScope = (CoroutineScope) this.a;
        MutableState mutableState = (MutableState) this.b;
        MutableState mutableState2 = (MutableState) this.c;
        FocusRequester focusRequester = (FocusRequester) this.d;
        boolean zIsVisible = windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime());
        Log.d("DanmakuSearch", "键盘状态变化: imeVisible=" + zIsVisible + ", wasKeyboardVisible=" + ((Boolean) mutableState.getValue()).booleanValue() + ", isInputFocused=" + qy.h(mutableState2));
        if (((Boolean) mutableState.getValue()).booleanValue() && !zIsVisible && ((Boolean) mutableState2.getValue()).booleanValue()) {
            Log.d("DanmakuSearch", "检测到键盘关闭，移动焦点到搜索按钮");
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new vm(focusRequester, null, 1), 3, null);
        }
        mutableState.setValue(Boolean.valueOf(zIsVisible));
        return windowInsetsCompat;
    }
}
