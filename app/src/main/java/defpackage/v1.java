package defpackage;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.unit.Density;
import androidx.media3.exoplayer.ExoPlayer;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.DanmakuAnime;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaStream;
import com.dh.myembyapp.data.model.ServerConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ v1(Context context, Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.a = 10;
        this.b = context;
        this.g = function0;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String displayName;
        Object EmptyList;
        Object obj;
        List<MediaStream> mediaStreams;
        int i = this.a;
        boolean z = false;
        Object obj2 = this.c;
        Object obj3 = this.g;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj6;
                MutableState mutableState = (MutableState) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                MutableState mutableState3 = (MutableState) obj3;
                ArrayList arrayList = new ArrayList();
                if (StringsKt.isBlank((String) ((MutableState) obj2).getValue())) {
                    arrayList.add("服务器别名");
                }
                if (StringsKt.isBlank((String) mutableState.getValue())) {
                    arrayList.add("服务器地址");
                }
                if (StringsKt.isBlank((String) mutableState2.getValue())) {
                    arrayList.add("端口");
                }
                if (StringsKt.isBlank((String) mutableState3.getValue())) {
                    arrayList.add("用户名");
                }
                if (!arrayList.isEmpty()) {
                    Toast.makeText(context, CollectionsKt___CollectionsKt.joinToString$default(arrayList, "、", null, null, 0, null, null, 62, null) + " 未填写", 0).show();
                }
                return Unit.INSTANCE;
            case 1:
                FocusRequester focusRequester = (FocusRequester) obj6;
                FocusRequester focusRequester2 = (FocusRequester) obj2;
                FocusRequester focusRequester3 = (FocusRequester) obj5;
                FocusRequester focusRequester4 = (FocusRequester) obj4;
                int iOrdinal = ((i3) ((State) obj3).getValue()).ordinal();
                if (iOrdinal == 0) {
                    FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                } else if (iOrdinal == 1) {
                    FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester2, 0, 1, null);
                } else if (iOrdinal == 2) {
                    FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester3, 0, 1, null);
                } else {
                    if (iOrdinal != 3) {
                        qu.f();
                        return null;
                    }
                    FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester4, 0, 1, null);
                }
                return Unit.INSTANCE;
            case 2:
                ((MutableState) obj2).setValue(null);
                ((MutableState) obj5).setValue((ch) obj6);
                ((MutableState) obj4).setValue(SetsKt.emptySet());
                ((MutableState) obj3).setValue(null);
                return Unit.INSTANCE;
            case 3:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj6;
                MutableState mutableState4 = (MutableState) obj2;
                MutableState mutableState5 = (MutableState) obj5;
                ServerConfig serverConfig = (ServerConfig) obj3;
                MutableState mutableState6 = (MutableState) obj4;
                if (snapshotStateList.size() >= 50) {
                    mutableState4.setValue("最多只能配置 50 条备用线路");
                } else {
                    mutableState5.setValue(null);
                    int size = snapshotStateList.size() + 1;
                    String string = UUID.randomUUID().toString();
                    string.getClass();
                    String strF = i9.f(size, "备用线路");
                    String protocol = serverConfig.getProtocol();
                    int port = serverConfig.getPort();
                    String path = serverConfig.getPath();
                    if (path == null) {
                        path = "";
                    }
                    mutableState6.setValue(new BackupRouteConfig(string, strF, protocol, "", port, path, true));
                    mutableState4.setValue(null);
                }
                return Unit.INSTANCE;
            case 4:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj6, null, null, new q3((rm) obj4, (Function0) obj3, (MutableState) obj2, (MutableState) obj5, (Continuation) null, 2), 3, null);
                return Unit.INSTANCE;
            case 5:
                SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) obj6;
                FocusRequester focusRequester5 = (FocusRequester) obj4;
                Function0 function0 = (Function0) obj3;
                MutableState mutableState7 = (MutableState) obj2;
                MutableState mutableState8 = (MutableState) obj5;
                Log.d("DanmakuSearch", "handleBackPress 被调用, isInputFocused=" + qy.h(mutableState7));
                if (((Boolean) mutableState7.getValue()).booleanValue()) {
                    Log.d("DanmakuSearch", "输入框有焦点，准备隐藏键盘并移动焦点");
                    if (softwareKeyboardController != null) {
                        softwareKeyboardController.hide();
                    }
                    FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester5, 0, 1, null);
                } else if (((DanmakuAnime) mutableState8.getValue()) != null) {
                    mutableState8.setValue(null);
                } else {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 6:
                MediaItem mediaItem = (MediaItem) obj6;
                MediaSource mediaSource = (MediaSource) obj2;
                String str = (String) obj5;
                Function2 function2 = (Function2) obj4;
                List list = (List) obj3;
                if (mediaItem != null) {
                    if (str == null || (list != null && list.isEmpty())) {
                        str = null;
                    } else {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                str = null;
                            }
                        } while (!Intrinsics.areEqual(((MediaSource) it.next()).getId(), str));
                    }
                    if (mediaSource == null || (displayName = mediaSource.getDisplayName()) == null) {
                        displayName = "默认";
                    }
                    String strE1 = u90.e1(mediaSource != null ? mediaSource.getBitrate() : null);
                    String strI1 = u90.i1(mediaSource != null ? mediaSource.getSize() : null);
                    Object indexNumber = mediaItem.getIndexNumber();
                    if (indexNumber == null) {
                        indexNumber = "?";
                    }
                    String name = mediaItem.getName();
                    String str2 = str == null ? "null" : str;
                    if (strE1 == null) {
                        strE1 = "-";
                    }
                    if (strI1 == null) {
                        strI1 = "-";
                    }
                    StringBuilder sb = new StringBuilder("继续播放按钮: 第");
                    sb.append(indexNumber);
                    sb.append("集 ");
                    sb.append(name);
                    sb.append(", 版本=");
                    i02.v(sb, displayName, ", mediaSourceId=", str2, ", bitrate=");
                    sb.append(strE1);
                    sb.append(", size=");
                    sb.append(strI1);
                    Log.d("SeriesActionButtons", sb.toString());
                    function2.invoke(mediaItem.getId(), str);
                }
                return Unit.INSTANCE;
            case 7:
                u90.n((MutableState) obj2, false);
                return Boolean.valueOf(u90.y((List) obj6, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3));
            case 8:
                Function1 function1 = (Function1) obj6;
                MutableState mutableState9 = (MutableState) obj5;
                MutableState mutableState10 = (MutableState) obj4;
                MutableState mutableState11 = (MutableState) obj3;
                if (((String) ((MutableState) obj2).getValue()) != null && ((String) mutableState9.getValue()) != null) {
                    vj0.c(mutableState10, true);
                    mr.A((Number) mutableState11.getValue(), 1, mutableState11);
                }
                function1.invoke(null);
                return Unit.INSTANCE;
            case 9:
                return NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$11$lambda$10((DrawerState) obj6, (Density) obj2, (FiniteAnimationSpec) obj5, (FiniteAnimationSpec) obj4, (FiniteAnimationSpec) obj3);
            case 10:
                Context context2 = (Context) obj6;
                Function0 function3 = (Function0) obj3;
                MutableState mutableState12 = (MutableState) obj5;
                ExoPlayer exoPlayer = (ExoPlayer) ((MutableState) obj2).getValue();
                Integer num = (Integer) mutableState12.getValue();
                boolean zL = dn1.L((MutableState) obj4);
                context2.getClass();
                function3.getClass();
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (exoPlayer != null) {
                        if (zL) {
                            MediaSource mediaSource2 = (MediaSource) function3.invoke();
                            if (mediaSource2 == null || (mediaStreams = mediaSource2.getMediaStreams()) == null) {
                                EmptyList = CollectionsKt.emptyList();
                            } else {
                                EmptyList = new ArrayList();
                                for (Object obj7 : mediaStreams) {
                                    if (Intrinsics.areEqual(((MediaStream) obj7).getType(), "Subtitle")) {
                                        EmptyList.add(obj7);
                                    }
                                }
                            }
                            ArrayList arrayListF = n42.f(exoPlayer, EmptyList);
                            int size2 = arrayListF.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 < size2) {
                                    obj = arrayListF.get(i2);
                                    i2++;
                                    Integer num2 = ((h42) obj).e;
                                    if (num2 != null && num2.intValue() == iIntValue) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            h42 h42Var = (h42) obj;
                            mutableState12.setValue(null);
                            Unit unit = Unit.INSTANCE;
                            if (h42Var == null) {
                                Log.w("SubtitleTrack", "详情页预选字幕未匹配到可用轨道: streamIndex=" + iIntValue);
                            } else {
                                n42.c(exoPlayer, h42Var, context2);
                            }
                        } else {
                            mutableState12.setValue(null);
                            Unit unit2 = Unit.INSTANCE;
                            Log.d("SubtitleTrack", "全局字幕开关已关闭，忽略详情页预选字幕: streamIndex=" + iIntValue);
                            n42.c(exoPlayer, new h42(), context2);
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) obj6;
                FocusManager focusManager = (FocusManager) obj5;
                Function1 function4 = (Function1) obj4;
                Function0 function5 = (Function0) obj3;
                String string2 = StringsKt.trim((CharSequence) ((MutableState) obj2).getValue()).toString();
                if (!StringsKt.isBlank(string2)) {
                    if (softwareKeyboardController2 != null) {
                        softwareKeyboardController2.hide();
                    }
                    focusManager.clearFocus(true);
                    function4.invoke(string2);
                    function5.invoke();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ v1(MutableState mutableState, List list, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.a = 7;
        this.c = mutableState;
        this.b = list;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
    }

    public /* synthetic */ v1(SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2, ServerConfig serverConfig, MutableState mutableState3) {
        this.a = 3;
        this.b = snapshotStateList;
        this.c = mutableState;
        this.d = mutableState2;
        this.g = serverConfig;
        this.e = mutableState3;
    }

    public /* synthetic */ v1(SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, Function1 function1, Function0 function0, MutableState mutableState) {
        this.a = 11;
        this.b = softwareKeyboardController;
        this.d = focusManager;
        this.e = function1;
        this.g = function0;
        this.c = mutableState;
    }

    public /* synthetic */ v1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.g = obj5;
    }

    public /* synthetic */ v1(Object obj, Object obj2, Function0 function0, MutableState mutableState, MutableState mutableState2, int i) {
        this.a = i;
        this.b = obj;
        this.e = obj2;
        this.g = function0;
        this.c = mutableState;
        this.d = mutableState2;
    }
}
