package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.Log;
import androidx.collection.SieveCacheKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

import com.dh.myembyapp.data.model.DanmakuComment;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaStream;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.SystemNetworkSpeedDisplayMode;
import com.dh.myembyapp.data.model.SystemTimeDisplayMode;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.Path;
import okio.internal.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ku {
    public static final ri a = new ri(Boolean.TRUE, 3);
    public static final Object b = new Object();

    public static final List A(rd2 rd2Var) {
        String str = rd2Var.e;
        if (str == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '/', i2, false, 4, (Object) null);
            if (iIndexOf$default == -1) {
                iIndexOf$default = str.length();
            }
            String strSubstring = str.substring(i2, iIndexOf$default);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i = iIndexOf$default;
        }
        return arrayList;
    }

    public static long B(double d) {
        ig2.m(F(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static int C(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static int D(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static bz1 E(st0 st0Var, st0 st0Var2) {
        ig2.t(st0Var, "set1");
        ig2.t(st0Var2, "set2");
        return new bz1(st0Var, st0Var2);
    }

    public static boolean F(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static j52 G(j52 j52Var) {
        if ((j52Var instanceof l52) || (j52Var instanceof k52)) {
            return j52Var;
        }
        return j52Var instanceof Serializable ? new k52(j52Var) : new l52(j52Var);
    }

    public static final void H(to1 to1Var, bo1 bo1Var) {
        to1Var.getClass();
        bo1Var.getClass();
        String str = bo1Var.a;
        String str2 = bo1Var.b;
        TranscodeQualityOption transcodeQualityOption = bo1Var.c;
        Integer num = bo1Var.d;
        Integer num2 = bo1Var.e;
        long j = bo1Var.f;
        Long lValueOf = Long.valueOf(j);
        to1Var.getClass();
        str.getClass();
        io1 io1VarV = to1Var.v(str, j / Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
        Job job = to1Var.g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(to1Var), null, null, new mi(io1VarV, to1Var, str, str2, transcodeQualityOption, num, num2, lValueOf, null, 2), 3, null);
    }

    public static final String I(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iMax) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    return StringsKt__StringsJVMKt.decodeToString$default(bArr, 0, i2, false, 5, null);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    bArr[i2] = (byte) Integer.parseInt(str.substring(i + 1, i3), CharsKt.checkRadix(16));
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                    bArr[i2] = (byte) str.charAt(i);
                    i2++;
                    i++;
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static final ih1 J(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-986976213, 0, -1, "com.dh.myembyapp.ui.screens.player.rememberPlayerMenuState (PlayerMenuState.kt:22)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new ih1();
            composer.updateRememberedValue(objRememberedValue);
        }
        ih1 ih1Var = (ih1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0115, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r4) == r5) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ba, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r4) == r5) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f7, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r4) == r5) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f9, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [ci1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, vh1] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(defpackage.c4 r16, defpackage.ci1 r17, defpackage.tm1 r18, java.lang.String r19, int r20, int r21, defpackage.vh1 r22, defpackage.vh1 r23, defpackage.vh1 r24, defpackage.n61 r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku.K(c4, ci1, tm1, java.lang.String, int, int, vh1, vh1, vh1, n61, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static int L(long j) {
        if (j > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        if (j < SieveCacheKt.NodeMetaAndPreviousMask) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int M(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int N(Object obj) {
        return M(obj == null ? 0 : obj.hashCode());
    }

    public static int[] O(Collection collection) {
        if (collection instanceof hv0) {
            hv0 hv0Var = (hv0) collection;
            return Arrays.copyOfRange(hv0Var.a, hv0Var.b, hv0Var.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final List P(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.first(list));
        }
        return CollectionsKt.emptyList();
    }

    public static final Map Q(Map map) {
        int size = map.size();
        if (size == 0) {
            return MapsKt.emptyMap();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.first(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static rd2 R(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = Path.DIRECTORY_SEPARATOR;
        String strReplace$default = !Intrinsics.areEqual(str2, "/") ? StringsKt__StringsJVMKt.replace$default(str, str2, "/", false, 4, (Object) null) : str;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < strReplace$default.length()) {
            char cCharAt = strReplace$default.charAt(i);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/') {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (Intrinsics.areEqual(strReplace$default, str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int iMin = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, strReplace$default.length());
        int iMin2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, iMin);
        if (i5 != -1) {
            strSubstring2 = strReplace$default.substring(0, i6);
            strSubstring = strReplace$default.substring(i5, Math.min(i3 != -1 ? i3 : Integer.MAX_VALUE, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i3 != -1 ? strReplace$default.substring(i3, iMin2) : null;
        String strSubstring4 = i4 != -1 ? strReplace$default.substring(i4, iMin) : null;
        String strSubstring5 = i2 != -1 ? strReplace$default.substring(i2, strReplace$default.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String strI = strSubstring2 != null ? I(strSubstring2, bArr) : null;
        String strI2 = strSubstring != null ? I(strSubstring, bArr) : null;
        String strI3 = strSubstring3 != null ? I(strSubstring3, bArr) : null;
        if (strSubstring4 != null) {
            I(strSubstring4, bArr);
        }
        if (strSubstring5 != null) {
            I(strSubstring5, bArr);
        }
        return new rd2(strReplace$default, str2, strI, strI2, strI3);
    }

    public static AbstractList S(List list, xl0 xl0Var) {
        return list instanceof RandomAccess ? new j01(list, xl0Var) : new k01(list, xl0Var);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static Integer T(String str) {
        byte b2;
        Long lValueOf;
        byte b3;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt < 128) {
                    b2 = z01.a[cCharAt];
                } else {
                    byte[] bArr = z01.a;
                    b2 = -1;
                }
                if (b2 >= 0 && b2 < 10) {
                    long j = -b2;
                    while (true) {
                        if (i2 >= str.length()) {
                            if (i == 0) {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i3 = i2 + 1;
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 128) {
                            b3 = z01.a[cCharAt2];
                        } else {
                            byte[] bArr2 = z01.a;
                            b3 = -1;
                        }
                        if (b3 >= 0 && b3 < 10 && j >= Buffer.OVERFLOW_ZONE) {
                            long j2 = j * 10;
                            long j3 = b3;
                            if (j2 >= Long.MIN_VALUE + j3) {
                                j = j2 - j3;
                                i2 = i3;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    public static void U(s0 s0Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(s0Var.b().size());
        for (Map.Entry entry : s0Var.b().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static final iu a(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(applicationContext, ConnectivityManager.class);
        if (connectivityManager != null && ContextCompat.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return Build.VERSION.SDK_INT > 23 ? new ju(connectivityManager, 1) : new ju(connectivityManager, 0);
            } catch (Exception unused) {
            }
        }
        return iu.a;
    }

    public static final xt0 b(String str, xv0 xv0Var) {
        return new xt0(str, new yt0(xv0Var));
    }

    public static final void c(long j, boolean z, boolean z2, wh1 wh1Var, Composer composer, int i) {
        int i2;
        wh1 wh1Var2;
        Composer composerStartRestartGroup = composer.startRestartGroup(36868154);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            wh1Var2 = wh1Var;
            i2 |= composerStartRestartGroup.changedInstance(wh1Var2) ? 2048 : 1024;
        } else {
            wh1Var2 = wh1Var;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(36868154, i2, -1, "com.dh.myembyapp.ui.screens.player.PlayerControlAutoHideEffect (PlayerChromeEffects.kt:86)");
            }
            Long lValueOf = Long.valueOf(j);
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean z3 = ((i2 & 14) == 4) | ((i2 & Input.Keys.FORWARD_DEL) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                me1 me1Var = new me1(z, z2, j, wh1Var2, null);
                composerStartRestartGroup.updateRememberedValue(me1Var);
                objRememberedValue = me1Var;
            }
            EffectsKt.LaunchedEffect(lValueOf, boolValueOf, boolValueOf2, (Function2) objRememberedValue, composerStartRestartGroup, i2 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a51(j, z, z2, wh1Var, i));
        }
    }

    public static final void d(final boolean z, final boolean z2, final boolean z3, final Function1 function1, final th1 th1Var, final Function1 function2, Composer composer, final int i) {
        int i2;
        th1 th1Var2;
        Function1 function3;
        function1.getClass();
        function2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(60103038);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            th1Var2 = th1Var;
            i2 |= composerStartRestartGroup.changedInstance(th1Var2) ? 16384 : 8192;
        } else {
            th1Var2 = th1Var;
        }
        if ((196608 & i) == 0) {
            function3 = function2;
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        } else {
            function3 = function2;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 74899) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(60103038, i2, -1, "com.dh.myembyapp.ui.screens.player.PlayerControlShowOnPauseEffect (PlayerChromeEffects.kt:107)");
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean z4 = ((i2 & 14) == 4) | ((i2 & Input.Keys.FORWARD_DEL) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                ne1 ne1Var = new ne1(z, z2, z3, function1, th1Var2, function3, null);
                composerStartRestartGroup.updateRememberedValue(ne1Var);
                objRememberedValue = ne1Var;
            }
            EffectsKt.LaunchedEffect(boolValueOf, boolValueOf2, (Function2) objRememberedValue, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: le1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ku.d(z, z2, z3, function1, th1Var, function2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void e(final int i, final int i2, final boolean z, final SystemNetworkSpeedDisplayMode systemNetworkSpeedDisplayMode, final Object obj, final Function1 function1, final Function1 function2, Composer composer, final int i3) {
        int i4;
        Function1 function3;
        Function1 function4;
        systemNetworkSpeedDisplayMode.getClass();
        obj.getClass();
        function1.getClass();
        function2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1388682452);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(systemNetworkSpeedDisplayMode.ordinal()) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(obj) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            function3 = function1;
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        } else {
            function3 = function1;
        }
        if ((1572864 & i3) == 0) {
            function4 = function2;
            i4 |= composerStartRestartGroup.changedInstance(function4) ? 1048576 : 524288;
        } else {
            function4 = function2;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1388682452, i4, -1, "com.dh.myembyapp.ui.screens.player.PlayerNetworkSpeedEffect (PlayerChromeEffects.kt:23)");
            }
            Object[] objArr = {Integer.valueOf(i2), Boolean.valueOf(z), systemNetworkSpeedDisplayMode, obj};
            boolean z2 = ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((i4 & Input.Keys.FORWARD_DEL) == 32) | ((i4 & 14) == 4) | ((458752 & i4) == 131072) | ((i4 & 3670016) == 1048576);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                oe1 oe1Var = new oe1(z, systemNetworkSpeedDisplayMode, i2, i, function3, function4, null);
                composerStartRestartGroup.updateRememberedValue(oe1Var);
                objRememberedValue = oe1Var;
            }
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ke1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ku.e(i, i2, z, systemNetworkSpeedDisplayMode, obj, function1, function2, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void f(Context context, boolean z, SystemTimeDisplayMode systemTimeDisplayMode, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        systemTimeDisplayMode.getClass();
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-312025941);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(systemTimeDisplayMode.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-312025941, i3, -1, "com.dh.myembyapp.ui.screens.player.PlayerSystemTimeEffect (PlayerChromeEffects.kt:64)");
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zChangedInstance = ((i3 & Input.Keys.FORWARD_DEL) == 32) | ((i3 & 896) == 256) | composerStartRestartGroup.changedInstance(context) | ((i3 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                b6 b6Var = new b6(z, systemTimeDisplayMode, context, function1, null, 1);
                composerStartRestartGroup.updateRememberedValue(b6Var);
                objRememberedValue = b6Var;
            }
            composer2 = composerStartRestartGroup;
            EffectsKt.LaunchedEffect(boolValueOf, systemTimeDisplayMode, context, (Function2) objRememberedValue, composer2, ((i3 >> 3) & WebSocketProtocol.PAYLOAD_SHORT) | ((i3 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u7(context, z, systemTimeDisplayMode, function1, i, 6));
        }
    }

    public static rd2 g(String str) {
        String str2 = Path.DIRECTORY_SEPARATOR;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new rd2(sb.toString(), str2, "file", null, str);
    }

    public static final List h(List list, long j) {
        Float floatOrNull;
        list.getClass();
        if (j == 0) {
            return list;
        }
        float f = j / 1000.0f;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DanmakuComment danmakuCommentCopy$default = (DanmakuComment) it.next();
            List mutableList = CollectionsKt.toMutableList((Collection) StringsKt__StringsKt.split$default(danmakuCommentCopy$default.getP(), new String[]{","}, false, 0, 6, (Object) null));
            String str = (String) CollectionsKt.getOrNull(mutableList, 0);
            float fCoerceAtLeast = RangesKt.coerceAtLeast(((str == null || (floatOrNull = StringsKt.toFloatOrNull(str)) == null) ? 0.0f : floatOrNull.floatValue()) + f, 0.0f);
            if (!mutableList.isEmpty()) {
                mutableList.set(0, String.valueOf(fCoerceAtLeast));
                danmakuCommentCopy$default = DanmakuComment.copy$default(danmakuCommentCopy$default, CollectionsKt___CollectionsKt.joinToString$default(mutableList, ",", null, null, 0, null, null, 62, null), null, 2, null);
            }
            arrayList.add(danmakuCommentCopy$default);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x049f A[Catch: all -> 0x04b5, TRY_LEAVE, TryCatch #18 {all -> 0x04b5, blocks: (B:123:0x0490, B:125:0x049f), top: B:154:0x0490 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x058c  */
    /* JADX WARN: Code duplicated, block: B:164:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:53:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x0326  */
    /* JADX WARN: Code duplicated, block: B:78:0x035c  */
    /* JADX WARN: Code duplicated, block: B:82:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0512, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r8) == r13) goto L142;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:125:0x049f, please report this as an issue */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(android.content.Context r27, java.lang.String r28, java.lang.String r29, float r30, int r31, int r32, java.lang.String r33, boolean r34, defpackage.pj1 r35, defpackage.ci1 r36, defpackage.qj1 r37, defpackage.vh1 r38, defpackage.vh1 r39, defpackage.vh1 r40, defpackage.n61 r41, kotlin.coroutines.jvm.internal.ContinuationImpl r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku.i(android.content.Context, java.lang.String, java.lang.String, float, int, int, java.lang.String, boolean, pj1, ci1, qj1, vh1, vh1, vh1, n61, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static List j(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new hv0(iArr, 0, iArr.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x0350  */
    /* JADX WARN: Code duplicated, block: B:87:0x0359  */
    /* JADX WARN: Code duplicated, block: B:89:0x035d A[RETURN] */
    public static final Object k(Context context, String str, String str2, long j, boolean z, Function1 function1, ContinuationImpl continuationImpl) {
        ki0 ki0Var;
        String str3;
        boolean z2;
        Context context2;
        String str4;
        Function1 function2;
        long j2;
        Object obj;
        String str5;
        Function1 function3;
        int i;
        int i2;
        String str6;
        if (continuationImpl instanceof ki0) {
            ki0Var = (ki0) continuationImpl;
            int i3 = ki0Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ki0Var.l = i3 - Integer.MIN_VALUE;
            } else {
                ki0Var = new ki0(continuationImpl);
            }
        } else {
            ki0Var = new ki0(continuationImpl);
        }
        Object objWithContext = ki0Var.k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = ki0Var.l;
        int i5 = 0;
        String str7 = "SubtitleDelay";
        Continuation continuation = null;
        if (i4 != 0) {
            if (i4 == 1) {
                z2 = ki0Var.j;
                j2 = ki0Var.i;
                function2 = ki0Var.d;
                str4 = (String) ki0Var.c;
                str3 = (String) ki0Var.b;
                context2 = (Context) ki0Var.a;
                ResultKt.throwOnFailure(objWithContext);
            } else {
                if (i4 != 2) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = ki0Var.j;
                function3 = ki0Var.d;
                ResultKt.throwOnFailure(objWithContext);
                str5 = "SubtitleDelay";
                obj = null;
            }
            str6 = (String) objWithContext;
            if (str6 == null) {
                return str6;
            }
            Log.e(str5, "保存临时文件失败");
            if (z2) {
                function3.invoke("保存临时文件失败");
                return obj;
            }
            return obj;
        }
        ResultKt.throwOnFailure(objWithContext);
        Regex regex = de.a;
        ki0Var.a = context;
        ki0Var.b = str;
        ki0Var.c = str2;
        ki0Var.d = function1;
        ki0Var.i = j;
        ki0Var.j = z;
        ki0Var.l = 1;
        Object objWithContext2 = BuildersKt.withContext(Dispatchers.getIO(), new be(str, continuation, i5), ki0Var);
        if (objWithContext2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        str3 = str;
        z2 = z;
        context2 = context;
        objWithContext = objWithContext2;
        str4 = str2;
        function2 = function1;
        j2 = j;
        String str8 = (String) objWithContext;
        if (str8 == null || StringsKt.isBlank(str8)) {
            obj = null;
            Log.e("SubtitleDelay", "解析 ASS/SSA 失败或为空");
            if (z2) {
                function2.invoke("字幕解析失败");
            }
        } else {
            Regex regex2 = de.a;
            obj = null;
            List listSplit$default = StringsKt__StringsKt.split$default(StringsKt__StringsJVMKt.replace$default(str8, "\r\n", "\n", false, 4, (Object) null), new String[]{"\n"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(listSplit$default.size());
            List listEmptyList = CollectionsKt.emptyList();
            Iterator it = listSplit$default.iterator();
            boolean zEquals = false;
            int i6 = -1;
            int iIndexOf = -1;
            while (it.hasNext()) {
                String str9 = (String) it.next();
                String string = StringsKt.trim((CharSequence) str9).toString();
                str8 = str8;
                if (StringsKt__StringsJVMKt.startsWith$default(string, "[", false, 2, null) && StringsKt__StringsJVMKt.endsWith$default(string, "]", false, 2, null)) {
                    zEquals = StringsKt__StringsJVMKt.equals(string, "[Events]", true);
                    if (!zEquals) {
                        listEmptyList = CollectionsKt.emptyList();
                        i6 = -1;
                        iIndexOf = -1;
                    }
                    arrayList.add(str9);
                } else if (zEquals && StringsKt__StringsJVMKt.startsWith(string, "Format:", true)) {
                    Iterator it2 = it;
                    List listSplit$default2 = StringsKt__StringsKt.split$default(StringsKt__StringsKt.substringAfter(string, ":", ""), new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default2, 10));
                    Iterator it3 = listSplit$default2.iterator();
                    while (it3.hasNext()) {
                        String lowerCase = StringsKt.trim((CharSequence) it3.next()).toString().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        arrayList2.add(lowerCase);
                    }
                    int iIndexOf2 = arrayList2.indexOf(TtmlNode.START);
                    iIndexOf = arrayList2.indexOf(TtmlNode.END);
                    arrayList.add(str9);
                    it = it2;
                    i6 = iIndexOf2;
                    listEmptyList = arrayList2;
                } else {
                    Iterator it4 = it;
                    MatchResult matchResultMatchEntire = zEquals ? de.a.matchEntire(str9) : null;
                    if (matchResultMatchEntire != null) {
                        i = i6;
                        if (i >= 0) {
                            i2 = iIndexOf;
                            if (i2 < 0 || listEmptyList.isEmpty()) {
                                coroutine_suspended = coroutine_suspended;
                                str7 = str7;
                                listEmptyList = listEmptyList;
                                j2 = j2;
                                context2 = context2;
                                arrayList.add(str9);
                            } else {
                                MatchResult matchResult = matchResultMatchEntire;
                                listEmptyList = listEmptyList;
                                String str10 = matchResult.getGroupValues().get(1);
                                str3 = str3;
                                String str11 = matchResult.getGroupValues().get(2);
                                context2 = context2;
                                str7 = str7;
                                coroutine_suspended = coroutine_suspended;
                                List mutableList = CollectionsKt.toMutableList((Collection) StringsKt__StringsKt.split$default(matchResult.getGroupValues().get(3), new String[]{","}, false, listEmptyList.size(), 2, (Object) null));
                                if (mutableList.size() <= Math.max(i, i2)) {
                                    arrayList.add(str9);
                                    j2 = j2;
                                } else {
                                    Long lD = de.d(StringsKt.trim((CharSequence) mutableList.get(i)).toString());
                                    Long lD2 = de.d(StringsKt.trim((CharSequence) mutableList.get(i2)).toString());
                                    if (lD == null || lD2 == null) {
                                        j2 = j2;
                                        arrayList.add(str9);
                                    } else {
                                        long jLongValue = lD.longValue() + j2;
                                        long jLongValue2 = lD2.longValue() + j2;
                                        j2 = j2;
                                        if (jLongValue2 >= 0) {
                                            mutableList.set(i, de.c(Math.max(0L, jLongValue)));
                                            mutableList.set(i2, de.c(Math.max(0L, jLongValue2)));
                                            arrayList.add(str10 + str11 + ": " + CollectionsKt___CollectionsKt.joinToString$default(mutableList, ",", null, null, 0, null, null, 62, null));
                                        }
                                    }
                                }
                            }
                        }
                        listEmptyList = listEmptyList;
                        i6 = i;
                        str3 = str3;
                        context2 = context2;
                        str7 = str7;
                        coroutine_suspended = coroutine_suspended;
                        j2 = j2;
                        it = it4;
                        iIndexOf = i2;
                    } else {
                        i = i6;
                    }
                    i2 = iIndexOf;
                    arrayList.add(str9);
                    listEmptyList = listEmptyList;
                    i6 = i;
                    str3 = str3;
                    context2 = context2;
                    str7 = str7;
                    coroutine_suspended = coroutine_suspended;
                    j2 = j2;
                    it = it4;
                    iIndexOf = i2;
                }
            }
            String str12 = str8;
            Object obj2 = coroutine_suspended;
            str5 = str7;
            long j3 = j2;
            String str13 = str3;
            Context context3 = context2;
            String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null);
            String str14 = StringsKt__StringsJVMKt.equals(str4, "ssa", true) ? "ssa" : "ass";
            Regex regex3 = de.a;
            ki0Var.a = null;
            ki0Var.b = null;
            ki0Var.c = null;
            ki0Var.d = function2;
            ki0Var.e = null;
            ki0Var.g = null;
            ki0Var.h = null;
            ki0Var.i = j3;
            ki0Var.j = z2;
            ki0Var.l = 2;
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new m2(str14, str13, context3, strJoinToString$default, null, 1), ki0Var);
            if (objWithContext == obj2) {
                return obj2;
            }
            function3 = function2;
            str6 = (String) objWithContext;
            if (str6 == null) {
                return str6;
            }
            Log.e(str5, "保存临时文件失败");
            if (z2) {
                function3.invoke("保存临时文件失败");
                return obj;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x016d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0174  */
    /* JADX WARN: Code duplicated, block: B:45:0x0178 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object l(Context context, String str, long j, boolean z, Function1 function1, ContinuationImpl continuationImpl) {
        li0 li0Var;
        Function1 function2;
        long j2;
        String str2;
        boolean z2;
        Context context2;
        Object obj;
        Function1 function3;
        String str3;
        if (continuationImpl instanceof li0) {
            li0Var = (li0) continuationImpl;
            int i = li0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                li0Var.j = i - Integer.MIN_VALUE;
            } else {
                li0Var = new li0(continuationImpl);
            }
        } else {
            li0Var = new li0(continuationImpl);
        }
        Object objWithContext = li0Var.i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = li0Var.j;
        int i3 = 1;
        Continuation continuation = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            li0Var.a = context;
            li0Var.b = str;
            function2 = function1;
            li0Var.c = function2;
            j2 = j;
            li0Var.g = j2;
            li0Var.h = z;
            li0Var.j = 1;
            Object objWithContext2 = BuildersKt.withContext(Dispatchers.getIO(), new be(str, continuation, 6), li0Var);
            if (objWithContext2 != coroutine_suspended) {
                str2 = str;
                z2 = z;
                context2 = context;
                objWithContext = objWithContext2;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            z2 = li0Var.h;
            j2 = li0Var.g;
            function2 = li0Var.c;
            str2 = (String) li0Var.b;
            context2 = (Context) li0Var.a;
            ResultKt.throwOnFailure(objWithContext);
        } else {
            if (i2 != 2) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = li0Var.h;
            function3 = li0Var.c;
            ResultKt.throwOnFailure(objWithContext);
            obj = null;
        }
        str3 = (String) objWithContext;
        if (str3 == null) {
            return str3;
        }
        Log.e("SubtitleDelay", "保存临时文件失败");
        if (z2) {
            return obj;
        }
        function3.invoke("保存临时文件失败");
        return obj;
        List<z22> list = (List) objWithContext;
        if (list.isEmpty()) {
            Log.e("SubtitleDelay", "解析 SRT 失败或为空");
            if (!z2) {
                return null;
            }
            function2.invoke("字幕解析失败");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        for (z22 z22Var : list) {
            i4 += i3;
            long j3 = j2;
            long j4 = z22Var.b + j3;
            String str4 = str2;
            long j5 = z22Var.c + j3;
            if (j5 >= 0) {
                sb.append(i4);
                sb.append("\n");
                sb.append(tl0.p(Math.max(0L, j4)));
                sb.append(" --> ");
                sb.append(tl0.p(j5));
                sb.append("\n");
                sb.append(z22Var.d);
                sb.append("\n\n");
            }
            j2 = j3;
            str2 = str4;
            list = list;
            i3 = 1;
        }
        List list2 = list;
        String str5 = str2;
        String string = sb.toString();
        li0Var.a = null;
        li0Var.b = null;
        li0Var.c = function2;
        li0Var.d = null;
        li0Var.e = null;
        li0Var.g = j2;
        li0Var.h = z2;
        li0Var.j = 2;
        obj = null;
        objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new e6(str5, context2, string, (Continuation) null, 15), li0Var);
        if (objWithContext != coroutine_suspended) {
            function3 = function2;
            str3 = (String) objWithContext;
            if (str3 == null) {
                return str3;
            }
            Log.e("SubtitleDelay", "保存临时文件失败");
            if (z2) {
                return obj;
            }
            function3.invoke("保存临时文件失败");
            return obj;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public static final Object m(Context context, String str, String str2, float f, String str3, boolean z, Function1 function1, ContinuationImpl continuationImpl) {
        mi0 mi0Var;
        boolean z2;
        Function1 function2;
        String str4;
        if (continuationImpl instanceof mi0) {
            mi0Var = (mi0) continuationImpl;
            int i = mi0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                mi0Var.i = i - Integer.MIN_VALUE;
            } else {
                mi0Var = new mi0(continuationImpl);
            }
        } else {
            mi0Var = new mi0(continuationImpl);
        }
        mi0 mi0Var2 = mi0Var;
        Object objK = mi0Var2.h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = mi0Var2.i;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objK);
            long j = (long) (f * 1000.0f);
            String strN = in1.n(str2);
            if (Intrinsics.areEqual(strN, "srt")) {
                mi0Var2.a = null;
                mi0Var2.b = null;
                mi0Var2.c = null;
                mi0Var2.d = null;
                mi0Var2.e = function1;
                mi0Var2.g = z;
                mi0Var2.i = 1;
                objK = l(context, str, j, z, function1, mi0Var2);
                if (objK != coroutine_suspended) {
                    z2 = z;
                    function2 = function1;
                    str4 = (String) objK;
                }
            } else if (Intrinsics.areEqual(strN, "ass")) {
                mi0Var2.a = null;
                mi0Var2.b = null;
                mi0Var2.c = null;
                mi0Var2.d = null;
                mi0Var2.e = function1;
                mi0Var2.g = z;
                mi0Var2.i = 2;
                objK = k(context, str, str2, j, z, function1, mi0Var2);
                if (objK != coroutine_suspended) {
                    z2 = z;
                    function2 = function1;
                    str4 = (String) objK;
                }
            } else {
                Log.w("SubtitleDelay", "当前字幕格式暂不支持时间偏移: " + str3);
                if (z) {
                    function1.invoke("当前字幕格式暂不支持时间偏移");
                }
                z2 = z;
                function2 = function1;
                str4 = null;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            z2 = mi0Var2.g;
            function2 = mi0Var2.e;
            ResultKt.throwOnFailure(objK);
            str4 = (String) objK;
        } else {
            if (i2 != 2) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = mi0Var2.g;
            function2 = mi0Var2.e;
            ResultKt.throwOnFailure(objK);
            str4 = (String) objK;
        }
        if (str4 != null) {
            if (StringsKt.isBlank(str4)) {
                Log.e("SubtitleDelay", "保存临时文件失败");
                if (z2) {
                    function2.invoke("保存临时文件失败");
                }
            }
            if (!StringsKt.isBlank(str4)) {
                return str4;
            }
        }
        return null;
    }

    public static final String n(ServerConfig serverConfig, String str, String str2, String str3, int i) {
        serverConfig.getClass();
        str.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(serverConfig.getFullUrl() + "emby/Items/" + str + "/Images/" + str2);
        StringBuilder sb2 = new StringBuilder("?maxWidth=");
        sb2.append(i);
        sb.append(sb2.toString());
        if (str3 != null && !StringsKt.isBlank(str3)) {
            sb.append("&tag=".concat(str3));
        }
        return sb.toString();
    }

    public static final void o(CoroutineScope coroutineScope, Context context, zn1 zn1Var, Function1 function1, Function1 function2, Function2 function3, Function0 function0) {
        coroutineScope.getClass();
        context.getClass();
        zn1Var.getClass();
        function2.getClass();
        function1.invoke("正在加载字幕...");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new w3(context, zn1Var, function1, function0, function2, function3, null, 3), 3, null);
    }

    public static void p(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                n41.l(i9.f(i2, "at index "));
                return;
            }
        }
    }

    public static void q(String str, long j) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void r(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static int s(long j) {
        int i = (int) j;
        ig2.i(j, ((long) i) == j, "Out of range: %s");
        return i;
    }

    public static boolean t(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static cz1 u(Set set, lp1 lp1Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof cz1)) {
                return new dz1(set2, lp1Var);
            }
            cz1 cz1Var = (cz1) set2;
            lp1 lp1Var2 = cz1Var.b;
            lp1Var2.getClass();
            return new dz1((SortedSet) cz1Var.a, new mp1(Arrays.asList(lp1Var2, lp1Var)));
        }
        if (!(set instanceof cz1)) {
            set.getClass();
            return new cz1(set, lp1Var);
        }
        cz1 cz1Var2 = (cz1) set;
        lp1 lp1Var3 = cz1Var2.b;
        lp1Var3.getClass();
        return new cz1(cz1Var2.a, new mp1(Arrays.asList(lp1Var3, lp1Var)));
    }

    public static final MediaStream v(MediaSource mediaSource, int i) {
        List<MediaStream> mediaStreams;
        Object obj = null;
        if (i < 0 || mediaSource == null || (mediaStreams = mediaSource.getMediaStreams()) == null) {
            return null;
        }
        for (Object obj2 : mediaStreams) {
            MediaStream mediaStream = (MediaStream) obj2;
            if (Intrinsics.areEqual(mediaStream.getType(), "Subtitle") && mediaStream.getIndex() == i) {
                obj = obj2;
                break;
            }
        }
        return (MediaStream) obj;
    }

    public static byte[] w(byte[] bArr) {
        if (bArr[bArr.length - 1] != 0) {
            return bArr;
        }
        int length = bArr.length - 1;
        Charset charset = Charsets.UTF_8;
        byte[] bytes = new String(bArr, 0, length, charset).concat("\n[Events]\nFormat: Layer, Start, End, Style, Name, MarginL, MarginR, MarginV, Effect, Text").getBytes(charset);
        bytes.getClass();
        return bytes;
    }

    public static int x(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << 24) | ((b3 & UByte.MAX_VALUE) << 16) | ((b4 & UByte.MAX_VALUE) << 8) | (b5 & UByte.MAX_VALUE);
    }

    public static Bitmap y(int i, int i2, String str) {
        str.getClass();
        try {
            BitMatrix bitMatrixEncode = new QRCodeWriter().encode(str, BarcodeFormat.QR_CODE, i, i2, MapsKt.hashMapOf(TuplesKt.to(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H), TuplesKt.to(EncodeHintType.CHARACTER_SET, "UTF-8"), TuplesKt.to(EncodeHintType.MARGIN, 1)));
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
            bitmapCreateBitmap.getClass();
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    bitmapCreateBitmap.setPixel(i3, i4, bitMatrixEncode.get(i3, i4) ? -16777216 : -1);
                }
            }
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final String z(rd2 rd2Var) {
        List listA = A(rd2Var);
        String str = rd2Var.b;
        if (listA.isEmpty()) {
            return null;
        }
        String str2 = rd2Var.e;
        str2.getClass();
        if (!StringsKt__StringsJVMKt.startsWith$default(str2, str, false, 2, null)) {
            str = "";
        }
        return CollectionsKt___CollectionsKt.joinToString$default(listA, rd2Var.b, str, null, 0, null, null, 60, null);
    }
}
