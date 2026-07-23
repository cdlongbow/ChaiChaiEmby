package defpackage;

import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.lifecycle.ViewModelKt;
import com.dh.myembyapp.data.DanmakuMemory;
import com.dh.myembyapp.data.api.DanmakuApiClient;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.PlayerDefaultViewMode;
import com.dh.myembyapp.data.model.PlayerFrameRateMatchingMode;
import com.dh.myembyapp.data.model.PlayerResizeMode;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import com.dh.myembyapp.data.model.SystemNetworkSpeedDisplayMode;
import com.dh.myembyapp.data.model.SystemNetworkSpeedPosition;
import com.dh.myembyapp.data.model.SystemTimeDisplayMode;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d6 extends FunctionReferenceImpl implements Function1, SuspendFunction {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(on1 on1Var, int i) {
        super(1, on1Var, on1.class, "updateAudioVersionPrioritySettings", "updateAudioVersionPrioritySettings(Lcom/dh/myembyapp/data/model/AudioVersionPrioritySettings;)V", 0);
        this.a = i;
        switch (i) {
            case 19:
                super(1, on1Var, on1.class, "updateFrameRateMatchingMode", "updateFrameRateMatchingMode(Lcom/dh/myembyapp/data/model/PlayerFrameRateMatchingMode;)V", 0);
                break;
            case 20:
                super(1, on1Var, on1.class, "updatePlaybackSpeed", "updatePlaybackSpeed(F)V", 0);
                break;
            case 21:
                super(1, on1Var, on1.class, "updatePlayerDefaultViewMode", "updatePlayerDefaultViewMode(Lcom/dh/myembyapp/data/model/PlayerDefaultViewMode;)V", 0);
                break;
            case 22:
                super(1, on1Var, on1.class, "updatePlayerResizeMode", "updatePlayerResizeMode(Lcom/dh/myembyapp/data/model/PlayerResizeMode;)V", 0);
                break;
            case 23:
                super(1, on1Var, on1.class, "updateSeekIntervalSec", "updateSeekIntervalSec(I)V", 0);
                break;
            case 24:
                super(1, on1Var, on1.class, "updateSubtitleVersionPrioritySettings", "updateSubtitleVersionPrioritySettings(Lcom/dh/myembyapp/data/model/SubtitleVersionPrioritySettings;)V", 0);
                break;
            case 25:
                super(1, on1Var, on1.class, "updateSystemNetworkSpeedDisplayMode", "updateSystemNetworkSpeedDisplayMode(Lcom/dh/myembyapp/data/model/SystemNetworkSpeedDisplayMode;)V", 0);
                break;
            case 26:
                super(1, on1Var, on1.class, "updateSystemNetworkSpeedPosition", "updateSystemNetworkSpeedPosition(Lcom/dh/myembyapp/data/model/SystemNetworkSpeedPosition;)V", 0);
                break;
            case 27:
                super(1, on1Var, on1.class, "updateSystemTimeDisplayMode", "updateSystemTimeDisplayMode(Lcom/dh/myembyapp/data/model/SystemTimeDisplayMode;)V", 0);
                break;
            case 28:
                super(1, on1Var, on1.class, "updateVideoVersionPrioritySettings", "updateVideoVersionPrioritySettings(Lcom/dh/myembyapp/data/model/VideoVersionPrioritySettings;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:48:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:51:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:53:0x0203  */
    /* JADX WARN: Code duplicated, block: B:55:0x0207  */
    /* JADX WARN: Code duplicated, block: B:56:0x020e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0215  */
    /* JADX WARN: Code duplicated, block: B:59:0x0221  */
    /* JADX WARN: Code duplicated, block: B:60:0x0233  */
    /* JADX WARN: Code duplicated, block: B:61:0x0237  */
    /* JADX WARN: Code duplicated, block: B:70:0x0275  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int keyCode;
        boolean zD = true;
        boolean zC = true;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                p7 p7Var = (p7) this.receiver;
                p7Var.getClass();
                p7Var.i.setValue(i3Var);
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                ((p7) this.receiver).j(str2);
                return Unit.INSTANCE;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                return ((DanmakuApiClient) this.receiver).getServiceForUrl(str3);
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                return ((DanmakuApiClient) this.receiver).getServiceForUrl(str4);
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                return ((DanmakuMemory) this.receiver).extractEpisodeNumber(str5);
            case 5:
                String str6 = (String) obj;
                str6.getClass();
                va0 va0Var = (va0) this.receiver;
                va0Var.getClass();
                MutableStateFlow mutableStateFlow = va0Var.O;
                if (((Map) mutableStateFlow.getValue()).containsKey(str6)) {
                    mutableStateFlow.setValue(MapsKt__MapsKt.minus((Map<? extends String, ? extends V>) mutableStateFlow.getValue(), str6));
                    Log.d("DetailViewModel", "清除详情页临时版本选择: itemId=".concat(str6));
                    va0Var.z(str6);
                    va0Var.y(str6);
                }
                return Unit.INSTANCE;
            case 6:
                String str7 = (String) obj;
                str7.getClass();
                va0 va0Var2 = (va0) this.receiver;
                va0Var2.getClass();
                if (!((Map) va0Var2.U.getValue()).containsKey(str7)) {
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(va0Var2), null, null, new ha0(va0Var2, str7, continuation, true ? 1 : 0), 3, null);
                }
                return Unit.INSTANCE;
            case 7:
                String str8 = (String) obj;
                str8.getClass();
                va0 va0Var3 = (va0) this.receiver;
                va0Var3.getClass();
                MutableStateFlow mutableStateFlow2 = va0Var3.W;
                z90 z90Var = (z90) mutableStateFlow2.getValue();
                if (!(z90Var instanceof y90) || !Intrinsics.areEqual(((y90) z90Var).a, str8)) {
                    if ((z90Var instanceof v90) && Intrinsics.areEqual(((v90) z90Var).a, str8)) {
                        Log.d("DetailViewModel", "详情页 Logo 渲染失败，回退文字标题: ".concat(str8));
                    }
                    mutableStateFlow2.setValue(new y90(str8));
                }
                return Unit.INSTANCE;
            case 8:
                String str9 = (String) obj;
                MutableStateFlow mutableStateFlow3 = ((va0) this.receiver).C;
                if (str9 == null || Intrinsics.areEqual(mutableStateFlow3.getValue(), str9)) {
                    mutableStateFlow3.setValue(null);
                }
                return Unit.INSTANCE;
            case 9:
                String str10 = (String) obj;
                MutableStateFlow mutableStateFlow4 = ((va0) this.receiver).G;
                if (str10 == null || Intrinsics.areEqual(mutableStateFlow4.getValue(), str10)) {
                    mutableStateFlow4.setValue(null);
                }
                return Unit.INSTANCE;
            case 10:
                String str11 = (String) obj;
                MutableStateFlow mutableStateFlow5 = ((va0) this.receiver).K;
                if (str11 == null || Intrinsics.areEqual(mutableStateFlow5.getValue(), str11)) {
                    mutableStateFlow5.setValue(null);
                }
                return Unit.INSTANCE;
            case 11:
                MediaItem mediaItem = (MediaItem) obj;
                mediaItem.getClass();
                va0 va0Var4 = (va0) this.receiver;
                va0Var4.getClass();
                va0Var4.k.setValue(mediaItem);
                String id = mediaItem.getId();
                String str12 = va0Var4.d;
                if (str12 != null && (str = va0Var4.c) != null && id != null) {
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(va0Var4), null, null, new q3(va0Var4, str12, str, id, (Continuation) null, 6), 3, null);
                }
                return Unit.INSTANCE;
            case 12:
                String str13 = (String) obj;
                str13.getClass();
                return Boolean.valueOf(((zq0) this.receiver).z(str13));
            case 13:
                return s81.b((s81) this.receiver, (Continuation) obj);
            case 14:
                return ((to1) this.receiver).y((Continuation) obj);
            case 15:
                KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
                keyEventM6229unboximpl.getClass();
                vg1 vg1Var = (vg1) this.receiver;
                wh1 wh1Var = vg1Var.l;
                wg1 wg1Var = vg1Var.a;
                int keyCode2 = keyEventM6229unboximpl.getKeyCode();
                wg1Var.getClass();
                if (keyCode2 == 23 || keyCode2 == 66) {
                    int iM6241getTypeZmokQxo = KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl);
                    KeyEventType.Companion companion = KeyEventType.INSTANCE;
                    if (KeyEventType.m6233equalsimpl0(iM6241getTypeZmokQxo, companion.m6237getKeyDownCS__XNY())) {
                        zD = vg1.c(vg1Var, keyEventM6229unboximpl.getEventTime(), keyEventM6229unboximpl.getRepeatCount(), 1);
                    } else if (!KeyEventType.m6233equalsimpl0(iM6241getTypeZmokQxo, companion.m6238getKeyUpCS__XNY()) || (((Boolean) wh1Var.invoke()).booleanValue() && !wg1Var.b())) {
                        zD = false;
                    } else {
                        zD = vg1Var.d(false);
                    }
                } else if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY()) && keyEventM6229unboximpl.getKeyCode() == 4) {
                    boolean zBooleanValue = ((Boolean) vg1Var.k.invoke()).booleanValue();
                    if (!((Boolean) wh1Var.invoke()).booleanValue() || zBooleanValue) {
                        zD = false;
                    } else {
                        vg1Var.m.invoke(Boolean.FALSE);
                        vg1Var.p.invoke(0L);
                    }
                } else {
                    zD = false;
                }
                return Boolean.valueOf(zD);
            case 16:
                KeyEvent keyEventM6229unboximpl2 = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
                keyEventM6229unboximpl2.getClass();
                vg1 vg1Var2 = (vg1) this.receiver;
                Function0 function0 = vg1Var2.q;
                wh1 wh1Var2 = vg1Var2.l;
                wg1 wg1Var2 = vg1Var2.a;
                int iM6241getTypeZmokQxo2 = KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl2);
                KeyEventType.Companion companion2 = KeyEventType.INSTANCE;
                if (KeyEventType.m6233equalsimpl0(iM6241getTypeZmokQxo2, companion2.m6238getKeyUpCS__XNY())) {
                    int keyCode3 = keyEventM6229unboximpl2.getKeyCode();
                    wg1Var2.getClass();
                    if (keyCode3 == 23 || keyCode3 == 66) {
                        if (!((Boolean) wh1Var2.invoke()).booleanValue() || wg1Var2.b()) {
                            zC = vg1Var2.d(false);
                        } else {
                            zC = false;
                        }
                    } else if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl2), companion2.m6237getKeyDownCS__XNY())) {
                        keyCode = keyEventM6229unboximpl2.getKeyCode();
                        if (keyCode != 66) {
                            switch (keyCode) {
                                case 19:
                                case 20:
                                    if (((Boolean) wh1Var2.invoke()).booleanValue()) {
                                        vg1Var2.m.invoke(Boolean.TRUE);
                                        vg1Var2.o.invoke(nv.a);
                                        function0.invoke();
                                    } else {
                                        function0.invoke();
                                        zC = false;
                                    }
                                    break;
                                case 21:
                                    zC = vg1Var2.e(21);
                                    break;
                                case 22:
                                    zC = vg1Var2.e(22);
                                    break;
                                case 23:
                                    zC = vg1.c(vg1Var2, keyEventM6229unboximpl2.getEventTime(), keyEventM6229unboximpl2.getRepeatCount(), 1);
                                    break;
                                default:
                                    zC = false;
                                    break;
                            }
                        } else {
                            zC = vg1.c(vg1Var2, keyEventM6229unboximpl2.getEventTime(), keyEventM6229unboximpl2.getRepeatCount(), 1);
                        }
                    } else {
                        zC = false;
                    }
                } else if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl2), companion2.m6237getKeyDownCS__XNY())) {
                    keyCode = keyEventM6229unboximpl2.getKeyCode();
                    if (keyCode != 66) {
                        switch (keyCode) {
                            case 19:
                            case 20:
                                if (((Boolean) wh1Var2.invoke()).booleanValue()) {
                                    function0.invoke();
                                    zC = false;
                                } else {
                                    vg1Var2.m.invoke(Boolean.TRUE);
                                    vg1Var2.o.invoke(nv.a);
                                    function0.invoke();
                                }
                                break;
                            case 21:
                                zC = vg1Var2.e(21);
                                break;
                            case 22:
                                zC = vg1Var2.e(22);
                                break;
                            case 23:
                                zC = vg1.c(vg1Var2, keyEventM6229unboximpl2.getEventTime(), keyEventM6229unboximpl2.getRepeatCount(), 1);
                                break;
                            default:
                                zC = false;
                                break;
                        }
                    } else {
                        zC = vg1.c(vg1Var2, keyEventM6229unboximpl2.getEventTime(), keyEventM6229unboximpl2.getRepeatCount(), 1);
                    }
                } else {
                    zC = false;
                }
                return Boolean.valueOf(zC);
            case 17:
                TranscodeQualityOption transcodeQualityOption = (TranscodeQualityOption) obj;
                transcodeQualityOption.getClass();
                yn1 yn1Var = (yn1) this.receiver;
                yn1Var.getClass();
                if (!transcodeQualityOption.getDisablesTranscoding()) {
                    yn1Var.a(transcodeQualityOption);
                } else if (((Boolean) yn1Var.d.invoke()).booleanValue()) {
                    yn1Var.j.invoke();
                    yn1Var.n.invoke(yn1Var.c.invoke(), yn1Var.e.invoke(), yn1Var.g.invoke());
                } else {
                    yn1Var.k.invoke();
                }
                return Unit.INSTANCE;
            case 18:
                AudioVersionPrioritySettings audioVersionPrioritySettings = (AudioVersionPrioritySettings) obj;
                audioVersionPrioritySettings.getClass();
                on1 on1Var = (on1) this.receiver;
                on1Var.getClass();
                AudioVersionPrioritySettings audioVersionPrioritySettingsNormalized = audioVersionPrioritySettings.normalized();
                audioVersionPrioritySettingsNormalized.getClass();
                on1Var.l.setValue(audioVersionPrioritySettingsNormalized);
                on1Var.a.saveAudioVersionPrioritySettings(audioVersionPrioritySettingsNormalized);
                return Unit.INSTANCE;
            case 19:
                PlayerFrameRateMatchingMode playerFrameRateMatchingMode = (PlayerFrameRateMatchingMode) obj;
                playerFrameRateMatchingMode.getClass();
                on1 on1Var2 = (on1) this.receiver;
                on1Var2.getClass();
                on1Var2.j.setValue(playerFrameRateMatchingMode);
                on1Var2.a.savePlayerFrameRateMatchingMode(playerFrameRateMatchingMode);
                return Unit.INSTANCE;
            case 20:
                float fFloatValue = ((Number) obj).floatValue();
                on1 on1Var3 = (on1) this.receiver;
                on1Var3.getClass();
                float fCoerceIn = RangesKt.coerceIn(fFloatValue, 0.5f, 3.0f);
                on1Var3.b.setFloatValue(fCoerceIn);
                on1Var3.a.savePlaybackSpeed(fCoerceIn);
                return Unit.INSTANCE;
            case 21:
                PlayerDefaultViewMode playerDefaultViewMode = (PlayerDefaultViewMode) obj;
                playerDefaultViewMode.getClass();
                on1 on1Var4 = (on1) this.receiver;
                on1Var4.getClass();
                on1Var4.i.setValue(playerDefaultViewMode);
                on1Var4.a.savePlayerDefaultViewMode(playerDefaultViewMode);
                return Unit.INSTANCE;
            case 22:
                PlayerResizeMode playerResizeMode = (PlayerResizeMode) obj;
                playerResizeMode.getClass();
                on1 on1Var5 = (on1) this.receiver;
                on1Var5.getClass();
                on1Var5.h.setValue(playerResizeMode);
                on1Var5.a.savePlayerResizeMode(playerResizeMode);
                return Unit.INSTANCE;
            case 23:
                int iIntValue = ((Number) obj).intValue();
                on1 on1Var6 = (on1) this.receiver;
                on1Var6.getClass();
                int iCoerceIn = (RangesKt.coerceIn(iIntValue, 5, 60) / 5) * 5;
                on1Var6.f.setIntValue(iCoerceIn);
                on1Var6.a.saveSeekIntervalSec(iCoerceIn);
                return Unit.INSTANCE;
            case 24:
                SubtitleVersionPrioritySettings subtitleVersionPrioritySettings = (SubtitleVersionPrioritySettings) obj;
                subtitleVersionPrioritySettings.getClass();
                on1 on1Var7 = (on1) this.receiver;
                on1Var7.getClass();
                SubtitleVersionPrioritySettings subtitleVersionPrioritySettingsNormalized = subtitleVersionPrioritySettings.normalized();
                subtitleVersionPrioritySettingsNormalized.getClass();
                on1Var7.m.setValue(subtitleVersionPrioritySettingsNormalized);
                on1Var7.a.saveSubtitleVersionPrioritySettings(subtitleVersionPrioritySettingsNormalized);
                return Unit.INSTANCE;
            case 25:
                SystemNetworkSpeedDisplayMode systemNetworkSpeedDisplayMode = (SystemNetworkSpeedDisplayMode) obj;
                systemNetworkSpeedDisplayMode.getClass();
                on1 on1Var8 = (on1) this.receiver;
                on1Var8.getClass();
                on1Var8.c.setValue(systemNetworkSpeedDisplayMode);
                on1Var8.a.saveSystemNetworkSpeedDisplayMode(systemNetworkSpeedDisplayMode);
                return Unit.INSTANCE;
            case 26:
                SystemNetworkSpeedPosition systemNetworkSpeedPosition = (SystemNetworkSpeedPosition) obj;
                systemNetworkSpeedPosition.getClass();
                on1 on1Var9 = (on1) this.receiver;
                on1Var9.getClass();
                on1Var9.d.setValue(systemNetworkSpeedPosition);
                on1Var9.a.saveSystemNetworkSpeedPosition(systemNetworkSpeedPosition);
                return Unit.INSTANCE;
            case 27:
                SystemTimeDisplayMode systemTimeDisplayMode = (SystemTimeDisplayMode) obj;
                systemTimeDisplayMode.getClass();
                on1 on1Var10 = (on1) this.receiver;
                on1Var10.getClass();
                on1Var10.e.setValue(systemTimeDisplayMode);
                on1Var10.a.saveSystemTimeDisplayMode(systemTimeDisplayMode);
                return Unit.INSTANCE;
            case 28:
                VideoVersionPrioritySettings videoVersionPrioritySettings = (VideoVersionPrioritySettings) obj;
                videoVersionPrioritySettings.getClass();
                on1 on1Var11 = (on1) this.receiver;
                on1Var11.getClass();
                VideoVersionPrioritySettings videoVersionPrioritySettingsNormalized = videoVersionPrioritySettings.normalized();
                videoVersionPrioritySettingsNormalized.getClass();
                on1Var11.k.setValue(videoVersionPrioritySettingsNormalized);
                on1Var11.a.saveVideoVersionPrioritySettings(videoVersionPrioritySettingsNormalized);
                return Unit.INSTANCE;
            default:
                String str14 = (String) obj;
                str14.getClass();
                Toast.makeText(((yn1) this.receiver).a, str14, 0).show();
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(p7 p7Var) {
        super(1, p7Var, p7.class, "setCurrentPage", "setCurrentPage(Lcom/dh/myembyapp/ui/screens/aggregate/AggregateHubPageType;)V", 0);
        this.a = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(va0 va0Var, int i) {
        super(1, va0Var, va0.class, "clearPendingSimilarItemFocusReturn", "clearPendingSimilarItemFocusReturn(Ljava/lang/String;)V", 0);
        this.a = i;
        switch (i) {
            case 10:
                super(1, va0Var, va0.class, "clearPendingContainingCollectionFocusReturn", "clearPendingContainingCollectionFocusReturn(Ljava/lang/String;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(vg1 vg1Var, int i) {
        super(1, vg1Var, vg1.class, "handlePlayerRootPreviewKeyEvent", "handlePlayerRootPreviewKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
        this.a = i;
        switch (i) {
            case 16:
                super(1, vg1Var, vg1.class, "handlePlayerRootKeyEvent", "handlePlayerRootKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(yn1 yn1Var) {
        super(1, yn1Var, yn1.class, "handleTranscodeQualitySelected", "handleTranscodeQualitySelected(Lcom/dh/myembyapp/data/model/TranscodeQualityOption;)V", 0);
        this.a = 17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(to1 to1Var) {
        super(1, to1Var, to1.class, "findNextEpisode", "findNextEpisode(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = 14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(DanmakuMemory danmakuMemory) {
        super(1, danmakuMemory, DanmakuMemory.class, "extractEpisodeNumber", "extractEpisodeNumber(Ljava/lang/String;)Ljava/lang/Integer;", 0);
        this.a = 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(Object obj, int i) {
        super(1, obj, p7.class, "updateSearchQuery", "updateSearchQuery(Ljava/lang/String;)V", 0);
        this.a = i;
        switch (i) {
            case 12:
                super(1, obj, zq0.class, "hasCachedHomeLibraryContent", "hasCachedHomeLibraryContent(Ljava/lang/String;)Z", 0);
                break;
            default:
                break;
        }
    }
}
