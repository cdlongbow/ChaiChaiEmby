package defpackage;

import androidx.datastore.preferences.core.Preferences;

import com.dh.myembyapp.data.DanmakuSettings;
import com.dh.myembyapp.data.DanmakuSettingsManager;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.ProxyProtocol;
import com.dh.myembyapp.data.ProxySettings;
import com.dh.myembyapp.data.model.AppCardSizeLevel;
import com.dh.myembyapp.data.model.AppThemePreset;
import com.dh.myembyapp.data.model.DarkThemeGlowPosition;
import com.dh.myembyapp.data.model.DarkThemeStyle;
import com.dh.myembyapp.data.model.LightThemeBackgroundStyle;
import com.dh.myembyapp.dlna.DlnaConfig;
import com.dh.myembyapp.dlna.DlnaSettings;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;

import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class a7 implements FlowCollector {
    public final /* synthetic */ int a;
    public final /* synthetic */ FlowCollector b;

    public /* synthetic */ a7(FlowCollector flowCollector, int i) {
        this.a = i;
        this.b = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0247  */
    /* JADX WARN: Code duplicated, block: B:119:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:137:0x030d  */
    /* JADX WARN: Code duplicated, block: B:171:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:214:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:234:0x052f  */
    /* JADX WARN: Code duplicated, block: B:254:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01de  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        z6 z6Var;
        pm pmVar;
        qm qmVar;
        iz izVar;
        ub0 ub0Var;
        dp0 dp0Var;
        yp0 yp0Var;
        aq0 aq0Var;
        pr1 pr1Var;
        ProxyProtocol proxyProtocolValueOf;
        p72 p72Var;
        int i = this.a;
        FlowCollector flowCollector = this.b;
        switch (i) {
            case 0:
                if (continuation instanceof z6) {
                    z6Var = (z6) continuation;
                    int i2 = z6Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        z6Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        z6Var = new z6(this, continuation);
                    }
                } else {
                    z6Var = new z6(this, continuation);
                }
                Object obj2 = z6Var.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = z6Var.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (!((Boolean) obj).booleanValue()) {
                        z6Var.c = null;
                        z6Var.d = null;
                        z6Var.g = null;
                        z6Var.h = null;
                        z6Var.b = 1;
                        if (flowCollector.emit(obj, z6Var) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            case 1:
                if (continuation instanceof pm) {
                    pmVar = (pm) continuation;
                    int i4 = pmVar.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        pmVar.b = i4 - Integer.MIN_VALUE;
                    } else {
                        pmVar = new pm(this, continuation);
                    }
                } else {
                    pmVar = new pm(this, continuation);
                }
                Object obj3 = pmVar.a;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = pmVar.b;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj3);
                    Integer num = (Integer) ((Preferences) obj).get(rm.d);
                    Integer numBoxInt = Boxing.boxInt(RangesKt.coerceIn(num != null ? num.intValue() : tl0.z(), 30, HttpStatus.SC_BAD_REQUEST));
                    pmVar.c = null;
                    pmVar.e = null;
                    pmVar.g = null;
                    pmVar.h = null;
                    pmVar.b = 1;
                    if (flowCollector.emit(numBoxInt, pmVar) == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i5 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj3);
                }
                return Unit.INSTANCE;
            case 2:
                if (continuation instanceof qm) {
                    qmVar = (qm) continuation;
                    int i6 = qmVar.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        qmVar.b = i6 - Integer.MIN_VALUE;
                    } else {
                        qmVar = new qm(this, continuation);
                    }
                } else {
                    qmVar = new qm(this, continuation);
                }
                Object obj4 = qmVar.a;
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = qmVar.b;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj4);
                    Integer num2 = (Integer) ((Preferences) obj).get(rm.e);
                    Integer numBoxInt2 = Boxing.boxInt(num2 == null ? 120 : RangesKt.coerceIn(num2.intValue(), 60, 1800));
                    qmVar.c = null;
                    qmVar.e = null;
                    qmVar.g = null;
                    qmVar.h = null;
                    qmVar.b = 1;
                    if (flowCollector.emit(numBoxInt2, qmVar) == coroutine_suspended3) {
                        return coroutine_suspended3;
                    }
                } else {
                    if (i7 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj4);
                }
                return Unit.INSTANCE;
            case 3:
                if (continuation instanceof iz) {
                    izVar = (iz) continuation;
                    int i8 = izVar.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        izVar.b = i8 - Integer.MIN_VALUE;
                    } else {
                        izVar = new iz(this, continuation);
                    }
                } else {
                    izVar = new iz(this, continuation);
                }
                Object obj5 = izVar.a;
                Object coroutine_suspended4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = izVar.b;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj5);
                    Preferences preferences = (Preferences) obj;
                    Float f = (Float) preferences.get(DanmakuSettingsManager.SPEED_KEY);
                    float fFloatValue = f != null ? f.floatValue() : 1.0f;
                    Float f2 = (Float) preferences.get(DanmakuSettingsManager.SIZE_KEY);
                    float fFloatValue2 = f2 != null ? f2.floatValue() : 1.0f;
                    Integer num3 = (Integer) preferences.get(DanmakuSettingsManager.OPACITY_KEY);
                    int iIntValue = num3 != null ? num3.intValue() : 100;
                    Float f3 = (Float) preferences.get(DanmakuSettingsManager.SCREEN_PART_KEY);
                    float fFloatValue3 = f3 != null ? f3.floatValue() : 1.0f;
                    Integer num4 = (Integer) preferences.get(DanmakuSettingsManager.TIME_OFFSET_SEC_KEY);
                    int iIntValue2 = num4 != null ? num4.intValue() : 0;
                    Boolean bool = (Boolean) preferences.get(DanmakuSettingsManager.SHOW_TOP_KEY);
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                    Boolean bool2 = (Boolean) preferences.get(DanmakuSettingsManager.SHOW_BOTTOM_KEY);
                    DanmakuSettings danmakuSettings = new DanmakuSettings(fFloatValue, fFloatValue2, iIntValue, fFloatValue3, iIntValue2, zBooleanValue, bool2 != null ? bool2.booleanValue() : false);
                    izVar.c = null;
                    izVar.e = null;
                    izVar.g = null;
                    izVar.h = null;
                    izVar.b = 1;
                    if (flowCollector.emit(danmakuSettings, izVar) == coroutine_suspended4) {
                        return coroutine_suspended4;
                    }
                } else {
                    if (i9 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj5);
                }
                return Unit.INSTANCE;
            case 4:
                if (continuation instanceof ub0) {
                    ub0Var = (ub0) continuation;
                    int i10 = ub0Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        ub0Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        ub0Var = new ub0(this, continuation);
                    }
                } else {
                    ub0Var = new ub0(this, continuation);
                }
                Object obj6 = ub0Var.a;
                Object coroutine_suspended5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = ub0Var.b;
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj6);
                    Preferences preferences2 = (Preferences) obj;
                    Boolean bool3 = (Boolean) preferences2.get(DlnaSettings.KEY_ENABLED);
                    boolean zBooleanValue2 = bool3 != null ? bool3.booleanValue() : false;
                    String str = (String) preferences2.get(DlnaSettings.KEY_DEVICE_NAME);
                    if (str == null) {
                        str = "柴柴TV";
                    }
                    String str2 = str;
                    Boolean bool4 = (Boolean) preferences2.get(DlnaSettings.KEY_AUTO_PLAY);
                    boolean zBooleanValue3 = bool4 != null ? bool4.booleanValue() : false;
                    Boolean bool5 = (Boolean) preferences2.get(DlnaSettings.KEY_USE_PROXY_DEFAULT);
                    boolean zBooleanValue4 = bool5 != null ? bool5.booleanValue() : false;
                    Boolean bool6 = (Boolean) preferences2.get(DlnaSettings.KEY_TRUST_ALL_CERTS);
                    DlnaConfig dlnaConfig = new DlnaConfig(zBooleanValue2, str2, zBooleanValue3, zBooleanValue4, bool6 != null ? bool6.booleanValue() : false);
                    ub0Var.c = null;
                    ub0Var.e = null;
                    ub0Var.g = null;
                    ub0Var.h = null;
                    ub0Var.b = 1;
                    if (flowCollector.emit(dlnaConfig, ub0Var) == coroutine_suspended5) {
                        return coroutine_suspended5;
                    }
                } else {
                    if (i11 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj6);
                }
                return Unit.INSTANCE;
            case 5:
                if (continuation instanceof dp0) {
                    dp0Var = (dp0) continuation;
                    int i12 = dp0Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        dp0Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        dp0Var = new dp0(this, continuation);
                    }
                } else {
                    dp0Var = new dp0(this, continuation);
                }
                Object obj7 = dp0Var.a;
                Object coroutine_suspended6 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i13 = dp0Var.b;
                if (i13 == 0) {
                    ResultKt.throwOnFailure(obj7);
                    if (!((Boolean) obj).booleanValue()) {
                        dp0Var.c = null;
                        dp0Var.d = null;
                        dp0Var.g = null;
                        dp0Var.h = null;
                        dp0Var.b = 1;
                        if (flowCollector.emit(obj, dp0Var) == coroutine_suspended6) {
                            return coroutine_suspended6;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj7);
                }
                return Unit.INSTANCE;
            case 6:
                if (continuation instanceof yp0) {
                    yp0Var = (yp0) continuation;
                    int i14 = yp0Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        yp0Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        yp0Var = new yp0(this, continuation);
                    }
                } else {
                    yp0Var = new yp0(this, continuation);
                }
                Object obj8 = yp0Var.a;
                Object coroutine_suspended7 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i15 = yp0Var.b;
                if (i15 == 0) {
                    ResultKt.throwOnFailure(obj8);
                    if (((Boolean) obj).booleanValue()) {
                        yp0Var.c = null;
                        yp0Var.d = null;
                        yp0Var.g = null;
                        yp0Var.h = null;
                        yp0Var.b = 1;
                        if (flowCollector.emit(obj, yp0Var) == coroutine_suspended7) {
                            return coroutine_suspended7;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj8);
                }
                return Unit.INSTANCE;
            case 7:
                if (continuation instanceof aq0) {
                    aq0Var = (aq0) continuation;
                    int i16 = aq0Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        aq0Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        aq0Var = new aq0(this, continuation);
                    }
                } else {
                    aq0Var = new aq0(this, continuation);
                }
                Object obj9 = aq0Var.a;
                Object coroutine_suspended8 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i17 = aq0Var.b;
                if (i17 == 0) {
                    ResultKt.throwOnFailure(obj9);
                    if (!((Boolean) ((Triple) obj).getFirst()).booleanValue()) {
                        aq0Var.c = null;
                        aq0Var.d = null;
                        aq0Var.g = null;
                        aq0Var.h = null;
                        aq0Var.b = 1;
                        if (flowCollector.emit(obj, aq0Var) == coroutine_suspended8) {
                            return coroutine_suspended8;
                        }
                    }
                } else {
                    if (i17 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj9);
                }
                return Unit.INSTANCE;
            case 8:
                if (continuation instanceof pr1) {
                    pr1Var = (pr1) continuation;
                    int i18 = pr1Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        pr1Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        pr1Var = new pr1(this, continuation);
                    }
                } else {
                    pr1Var = new pr1(this, continuation);
                }
                Object obj10 = pr1Var.a;
                Object coroutine_suspended9 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i19 = pr1Var.b;
                if (i19 == 0) {
                    ResultKt.throwOnFailure(obj10);
                    Preferences preferences3 = (Preferences) obj;
                    Boolean bool7 = (Boolean) preferences3.get(ProxySettings.KEY_ENABLED);
                    boolean zBooleanValue5 = bool7 != null ? bool7.booleanValue() : false;
                    try {
                        String str3 = (String) preferences3.get(ProxySettings.KEY_PROTOCOL);
                        if (str3 == null) {
                            str3 = "HTTP";
                        }
                        proxyProtocolValueOf = ProxyProtocol.valueOf(str3);
                    } catch (Exception unused) {
                        proxyProtocolValueOf = ProxyProtocol.HTTP;
                    }
                    ProxyProtocol proxyProtocol = proxyProtocolValueOf;
                    String str4 = (String) preferences3.get(ProxySettings.KEY_HOST);
                    if (str4 == null) {
                        str4 = "192.168.5.235";
                    }
                    String str5 = str4;
                    Integer num5 = (Integer) preferences3.get(ProxySettings.KEY_PORT);
                    int iIntValue3 = num5 != null ? num5.intValue() : 7890;
                    String str6 = (String) preferences3.get(ProxySettings.KEY_USERNAME);
                    String str7 = str6 == null ? "" : str6;
                    String str8 = (String) preferences3.get(ProxySettings.KEY_PASSWORD);
                    String str9 = str8 == null ? "" : str8;
                    Boolean bool8 = (Boolean) preferences3.get(ProxySettings.KEY_BYPASS_LAN);
                    ProxyConfig proxyConfig = new ProxyConfig(zBooleanValue5, proxyProtocol, str5, iIntValue3, str7, str9, bool8 != null ? bool8.booleanValue() : true);
                    pr1Var.c = null;
                    pr1Var.e = null;
                    pr1Var.g = null;
                    pr1Var.h = null;
                    pr1Var.b = 1;
                    if (flowCollector.emit(proxyConfig, pr1Var) == coroutine_suspended9) {
                        return coroutine_suspended9;
                    }
                    break;
                } else {
                    if (i19 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj10);
                }
                return Unit.INSTANCE;
            default:
                if (continuation instanceof p72) {
                    p72Var = (p72) continuation;
                    int i20 = p72Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        p72Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        p72Var = new p72(this, continuation);
                    }
                } else {
                    p72Var = new p72(this, continuation);
                }
                Object obj11 = p72Var.a;
                Object coroutine_suspended10 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i21 = p72Var.b;
                if (i21 == 0) {
                    ResultKt.throwOnFailure(obj11);
                    Preferences preferences4 = (Preferences) obj;
                    AppThemePreset appThemePresetFromStorageValue = AppThemePreset.INSTANCE.fromStorageValue((String) preferences4.get(q72.c));
                    LightThemeBackgroundStyle lightThemeBackgroundStyleFromStorageValue = LightThemeBackgroundStyle.INSTANCE.fromStorageValue((String) preferences4.get(q72.d));
                    DarkThemeStyle darkThemeStyleFromStorageValue = DarkThemeStyle.INSTANCE.fromStorageValue((String) preferences4.get(q72.e));
                    DarkThemeGlowPosition darkThemeGlowPositionFromStorageValue = DarkThemeGlowPosition.INSTANCE.fromStorageValue((String) preferences4.get(q72.f));
                    Boolean bool9 = (Boolean) preferences4.get(q72.g);
                    boolean zBooleanValue6 = bool9 != null ? bool9.booleanValue() : true;
                    Boolean bool10 = (Boolean) preferences4.get(q72.h);
                    boolean zBooleanValue7 = bool10 != null ? bool10.booleanValue() : true;
                    AppCardSizeLevel appCardSizeLevel = AppCardSizeLevel.INSTANCE;
                    Integer num6 = (Integer) preferences4.get(q72.i);
                    bc bcVar = new bc(appThemePresetFromStorageValue, lightThemeBackgroundStyleFromStorageValue, darkThemeStyleFromStorageValue, darkThemeGlowPositionFromStorageValue, zBooleanValue6, zBooleanValue7, appCardSizeLevel.normalize(num6 != null ? num6.intValue() : 5));
                    p72Var.c = null;
                    p72Var.e = null;
                    p72Var.g = null;
                    p72Var.h = null;
                    p72Var.b = 1;
                    if (flowCollector.emit(bcVar, p72Var) == coroutine_suspended10) {
                        return coroutine_suspended10;
                    }
                } else {
                    if (i21 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj11);
                }
                return Unit.INSTANCE;
        }
    }
}
