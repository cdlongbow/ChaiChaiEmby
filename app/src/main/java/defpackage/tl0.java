package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.preferences.DanmakuPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.io.File;
import java.math.RoundingMode;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;
import okhttp3.internal.ws.RealWebSocket;
import okio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tl0 {
    public static final ri a;
    public static final ri b;

    static {
        Boolean bool = Boolean.FALSE;
        int i = 3;
        a = new ri(bool, i);
        b = new ri(bool, i);
    }

    public static final int A(lw1 lw1Var, lw1[] lw1VarArr) {
        lw1VarArr.getClass();
        int iHashCode = (lw1Var.f().hashCode() * 31) + Arrays.hashCode(lw1VarArr);
        int iC = lw1Var.c();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iC > 0)) {
                break;
            }
            int i2 = iC - 1;
            int i3 = i * 31;
            String strF = lw1Var.e(lw1Var.c() - iC).f();
            if (strF != null) {
                iHashCode2 = strF.hashCode();
            }
            i = i3 + iHashCode2;
            iC = i2;
        }
        int iC2 = lw1Var.c();
        int iHashCode3 = 1;
        while (true) {
            if (!(iC2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iC2 - 1;
            int i5 = iHashCode3 * 31;
            ig2 kind = lw1Var.e(lw1Var.c() - iC2).getKind();
            iHashCode3 = i5 + (kind != null ? kind.hashCode() : 0);
            iC2 = i4;
        }
    }

    public static int B(int i) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i <= 0) {
            ra.q(x2.f(i, "x (", ") must be > 0"));
            return 0;
        }
        switch (eu0.a[roundingMode.ordinal()]) {
            case 1:
                ku.r((i > 0) & (((i + (-1)) & i) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static int C(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static final Float D(float f) {
        if (Math.abs(f) <= Float.MAX_VALUE) {
            Float fValueOf = Float.valueOf(f);
            float fFloatValue = fValueOf.floatValue();
            if (10.0f <= fFloatValue && fFloatValue <= 144.0f) {
                return fValueOf;
            }
        }
        return null;
    }

    public static final xv0 E(KClass kClass, ArrayList arrayList, Function0 function0) {
        xv0 hdVar;
        xv0 bc2Var;
        kClass.getClass();
        arrayList.getClass();
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Collection.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(ArrayList.class))) {
            hdVar = new hd((xv0) arrayList.get(0), 0);
        } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            hdVar = new hd((xv0) arrayList.get(0), 1);
        } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            hdVar = new hd((xv0) arrayList.get(0), 2);
        } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            hdVar = new cn0((xv0) arrayList.get(0), (xv0) arrayList.get(1), 0);
        } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
            hdVar = new cn0((xv0) arrayList.get(0), (xv0) arrayList.get(1), 1);
        } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
            xv0 xv0Var = (xv0) arrayList.get(0);
            xv0 xv0Var2 = (xv0) arrayList.get(1);
            xv0Var.getClass();
            xv0Var2.getClass();
            hdVar = new i31(xv0Var, xv0Var2, 0);
        } else {
            if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
                xv0 xv0Var3 = (xv0) arrayList.get(0);
                xv0 xv0Var4 = (xv0) arrayList.get(1);
                xv0Var3.getClass();
                xv0Var4.getClass();
                bc2Var = new i31(xv0Var3, xv0Var4, 1);
            } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Triple.class))) {
                xv0 xv0Var5 = (xv0) arrayList.get(0);
                xv0 xv0Var6 = (xv0) arrayList.get(1);
                xv0 xv0Var7 = (xv0) arrayList.get(2);
                xv0Var5.getClass();
                xv0Var6.getClass();
                xv0Var7.getClass();
                bc2Var = new bc2(xv0Var5, xv0Var6, xv0Var7);
            } else if (JvmClassMappingKt.getJavaClass(kClass).isArray()) {
                Object objInvoke = function0.invoke();
                objInvoke.getClass();
                hdVar = ym.a((KClass) objInvoke, (xv0) arrayList.get(0));
            } else {
                hdVar = null;
            }
            hdVar = bc2Var;
        }
        if (hdVar != null) {
            return hdVar;
        }
        xv0[] xv0VarArr = (xv0[]) arrayList.toArray(new xv0[0]);
        return qd1.a(kClass, (xv0[]) Arrays.copyOf(xv0VarArr, xv0VarArr.length));
    }

    public static ta F(uv0 uv0Var, g11 g11Var) {
        return new ta(gw0.a(uv0Var, g11Var, 1.0f, yq.b, false), 0);
    }

    public static ua G(tv0 tv0Var, g11 g11Var, boolean z) {
        return new ua(gw0.a(tv0Var, g11Var, z ? wd2.c() : 1.0f, yq.c, false));
    }

    public static ta H(uv0 uv0Var, g11 g11Var, int i) {
        mm0 mm0Var = new mm0();
        mm0Var.a = i;
        ArrayList arrayListA = gw0.a(uv0Var, g11Var, 1.0f, mm0Var, false);
        for (int i2 = 0; i2 < arrayListA.size(); i2++) {
            dw0 dw0Var = (dw0) arrayListA.get(i2);
            km0 km0Var = (km0) dw0Var.b;
            km0 km0Var2 = (km0) dw0Var.c;
            if (km0Var != null && km0Var2 != null) {
                float[] fArr = km0Var.a;
                int length = fArr.length;
                float[] fArr2 = km0Var2.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f = Float.NaN;
                    int i3 = 0;
                    for (int i4 = 0; i4 < length2; i4++) {
                        float f2 = fArr3[i4];
                        if (f2 != f) {
                            fArr3[i3] = f2;
                            i3++;
                            f = fArr3[i4];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                    dw0Var = new dw0(km0Var.b(fArrCopyOfRange), km0Var2.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i2, dw0Var);
        }
        return new ta(arrayListA, 1);
    }

    public static ta I(tv0 tv0Var, g11 g11Var) {
        return new ta(gw0.a(tv0Var, g11Var, 1.0f, yq.d, false), 2);
    }

    public static ta J(uv0 uv0Var, g11 g11Var) {
        return new ta(gw0.a(uv0Var, g11Var, wd2.c(), yq.f, true), 3);
    }

    public static ArrayList K(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = StringsKt__StringsKt.split$default(StringsKt__StringsJVMKt.replace$default(str, "\r\n", "\n", false, 4, (Object) null), new String[]{"\n\n"}, false, 0, 6, (Object) null).iterator();
        while (it.hasNext()) {
            List listSplit$default = StringsKt__StringsKt.split$default(StringsKt.trim((CharSequence) it.next()).toString(), new String[]{"\n"}, false, 0, 6, (Object) null);
            if (listSplit$default.size() >= 3) {
                try {
                    Integer intOrNull = StringsKt.toIntOrNull(StringsKt.trim((CharSequence) listSplit$default.get(0)).toString());
                    if (intOrNull != null) {
                        int iIntValue = intOrNull.intValue();
                        Pair pairM = M(StringsKt.trim((CharSequence) listSplit$default.get(1)).toString());
                        if (pairM != null) {
                            arrayList.add(new z22(iIntValue, ((Number) pairM.getFirst()).longValue(), ((Number) pairM.getSecond()).longValue(), CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.drop(listSplit$default, 2), "\n", null, null, 0, null, null, 62, null)));
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    public static Long L(String str) {
        try {
            List listSplit$default = StringsKt__StringsKt.split$default(StringsKt__StringsJVMKt.replace$default(str, ",", ".", false, 4, (Object) null), new String[]{":"}, false, 0, 6, (Object) null);
            if (listSplit$default.size() != 3) {
                return null;
            }
            long j = Long.parseLong((String) listSplit$default.get(0));
            long j2 = Long.parseLong((String) listSplit$default.get(1));
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(2), new String[]{"."}, false, 0, 6, (Object) null);
            return Long.valueOf((Long.parseLong((String) listSplit$default2.get(0)) * 1000) + (j2 * 60000) + (j * DurationKt.MILLIS_IN_HOUR) + (listSplit$default2.size() > 1 ? Long.parseLong(StringsKt.take(StringsKt__StringsKt.padEnd((String) listSplit$default2.get(1), 3, '0'), 3)) : 0L));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Pair M(String str) {
        Long L;
        Long L2;
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"-->"}, false, 0, 6, (Object) null);
        if (listSplit$default.size() != 2 || (L = L(StringsKt.trim((CharSequence) listSplit$default.get(0)).toString())) == null || (L2 = L(StringsKt.trim((CharSequence) listSplit$default.get(1)).toString())) == null) {
            return null;
        }
        return new Pair(L, L2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object P(q22 q22Var, ContinuationImpl continuationImpl) {
        yd2 yd2Var;
        q22 q22Var2;
        Throwable th;
        Buffer buffer;
        if (continuationImpl instanceof yd2) {
            yd2Var = (yd2) continuationImpl;
            int i = yd2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yd2Var.d = i - Integer.MIN_VALUE;
            } else {
                yd2Var = new yd2(continuationImpl);
            }
        } else {
            yd2Var = new yd2(continuationImpl);
        }
        Object obj = yd2Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = yd2Var.d;
        if (i2 != 0) {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            buffer = yd2Var.b;
            q22Var2 = yd2Var.a;
            try {
                ResultKt.throwOnFailure(obj);
                AutoCloseableKt.closeFinally(q22Var2, null);
                return buffer;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    AutoCloseableKt.closeFinally(q22Var2, th);
                    throw th3;
                }
            }
        }
        ResultKt.throwOnFailure(obj);
        try {
            Buffer buffer2 = new Buffer();
            yd2Var.a = q22Var;
            yd2Var.b = buffer2;
            yd2Var.d = 1;
            q22Var.a.readAll(buffer2);
            if (Unit.INSTANCE == coroutine_suspended) {
                return coroutine_suspended;
            }
            q22Var2 = q22Var;
            buffer = buffer2;
            AutoCloseableKt.closeFinally(q22Var2, null);
            return buffer;
        } catch (Throwable th4) {
            q22Var2 = q22Var;
            th = th4;
            throw th;
        }
    }

    public static final kx Q(DanmakuPreferences danmakuPreferences, Composer composer, int i) {
        danmakuPreferences.getClass();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(571980881, i, -1, "com.dh.myembyapp.ui.screens.player.danmaku.rememberDanmakuPlaybackState (DanmakuPlaybackState.kt:53)");
        }
        boolean zChanged = composer.changed(danmakuPreferences);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new kx(danmakuPreferences);
            composer.updateRememberedValue(objRememberedValue);
        }
        kx kxVar = (kx) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return kxVar;
    }

    public static final og1 R(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1211876254, 0, -1, "com.dh.myembyapp.ui.screens.player.rememberPlayerDecoderState (PlayerDecoderState.kt:30)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new og1();
            composer.updateRememberedValue(objRememberedValue);
        }
        og1 og1Var = (og1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return og1Var;
    }

    public static final ph1 S(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1381180836, 0, -1, "com.dh.myembyapp.ui.screens.player.rememberPlayerPlaybackPositionMemory (PlayerSessionState.kt:70)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new ph1();
            composer.updateRememberedValue(objRememberedValue);
        }
        ph1 ph1Var = (ph1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ph1Var;
    }

    public static final nn1 T(String str, long j, ph1 ph1Var, Composer composer) {
        str.getClass();
        ph1Var.getClass();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(439203637, 512, -1, "com.dh.myembyapp.ui.screens.player.rememberPlayerSessionState (PlayerSessionState.kt:79)");
        }
        boolean zChanged = composer.changed(str);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new nn1(str, j, ph1Var);
            composer.updateRememberedValue(objRememberedValue);
        }
        nn1 nn1Var = (nn1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return nn1Var;
    }

    public static int U(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iN = ku.N(obj);
        int i2 = iN & i;
        int iC0 = c0(i2, obj3);
        if (iC0 != 0) {
            int i3 = ~i;
            int i4 = iN & i3;
            int i5 = -1;
            while (true) {
                int i6 = iC0 - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) == i4 && n(obj, objArr[i6]) && (objArr2 == null || n(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i5 == -1) {
                        d0(i2, i8, obj3);
                        return i6;
                    }
                    iArr[i5] = C(iArr[i5], i8, i);
                    return i6;
                }
                int i9 = i7 & i;
                if (i9 == 0) {
                    break;
                }
                i5 = i6;
                iC0 = i9;
            }
        }
        return -1;
    }

    public static final m82 V(MediaItem mediaItem) {
        String seriesId;
        mediaItem.getClass();
        ImageTags imageTags = mediaItem.getImageTags();
        String logo = imageTags != null ? imageTags.getLogo() : null;
        if (logo != null && !StringsKt.isBlank(logo)) {
            String id = mediaItem.getId();
            ImageTags imageTags2 = mediaItem.getImageTags();
            return new m82(id, imageTags2 != null ? imageTags2.getLogo() : null);
        }
        if (!Intrinsics.areEqual(mediaItem.getType(), "Episode") || (seriesId = mediaItem.getSeriesId()) == null || StringsKt.isBlank(seriesId)) {
            return null;
        }
        String seriesId2 = mediaItem.getSeriesId();
        if (seriesId2 == null) {
            seriesId2 = "";
        }
        return new m82(seriesId2, null);
    }

    public static long W(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    public static final xv0 X(yw1 yw1Var, KType kType) {
        yw1Var.getClass();
        kType.getClass();
        xv0 xv0VarJ = hg2.J(yw1Var, kType, true);
        if (xv0VarJ != null) {
            return xv0VarJ;
        }
        hg2.K(hg2.C(kType));
        throw null;
    }

    public static final xv0 Y(KClass kClass) {
        kClass.getClass();
        xv0 xv0VarZ = Z(kClass);
        if (xv0VarZ != null) {
            return xv0VarZ;
        }
        hg2.K(kClass);
        throw null;
    }

    public static final xv0 Z(KClass kClass) {
        kClass.getClass();
        xv0 xv0VarA = qd1.a(kClass, new xv0[0]);
        return xv0VarA == null ? (xv0) aq1.a.get(kClass) : xv0VarA;
    }

    public static final boolean a(Activity activity, int i) {
        activity.getClass();
        Window window = activity.getWindow();
        if (window == null) {
            return false;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes.preferredDisplayModeId == i) {
            return false;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(attributes);
        layoutParams.preferredDisplayModeId = i;
        window.setAttributes(layoutParams);
        return true;
    }

    public static final ArrayList a0(yw1 yw1Var, List list, boolean z) {
        yw1Var.getClass();
        list.getClass();
        if (z) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(X(yw1Var, (KType) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            KType kType = (KType) it2.next();
            kType.getClass();
            xv0 xv0VarJ = hg2.J(yw1Var, kType, false);
            if (xv0VarJ == null) {
                return null;
            }
            arrayList2.add(xv0VarJ);
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076 A[SYNTHETIC] */
    public static String b(Context context, int i) {
        Iterator it;
        Object next;
        wr1 wr1Var;
        wr1 wr1Var2;
        String str;
        String str2;
        String str3;
        Object next2;
        context.getClass();
        String qrNetworkInterfaceName = new UserPreferences(context).getQrNetworkInterfaceName();
        List listT = t(context);
        if (listT.isEmpty()) {
            Log.w("QrNetworkAddressResolver", "未检测到可用于二维码展示的 IPv4 地址");
            wr1Var2 = null;
        } else {
            if (qrNetworkInterfaceName == null || StringsKt.isBlank(qrNetworkInterfaceName)) {
                it = listT.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((wr1) next).d);
                wr1Var = (wr1) next;
                if (wr1Var == null) {
                    wr1Var2 = (wr1) CollectionsKt.first(listT);
                } else {
                    wr1Var2 = wr1Var;
                }
                str = wr1Var2.a;
                str2 = wr1Var2.c;
                str3 = "二维码地址使用自动选择网卡: ";
            } else {
                Iterator it2 = listT.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!Intrinsics.areEqual(((wr1) next2).a, qrNetworkInterfaceName));
                wr1Var2 = (wr1) next2;
                if (wr1Var2 != null) {
                    str = wr1Var2.a;
                    str2 = wr1Var2.c;
                    str3 = "二维码地址使用用户指定网卡: ";
                } else {
                    Log.w("QrNetworkAddressResolver", "用户指定的二维码网卡不可用，回退自动选择: ".concat(qrNetworkInterfaceName));
                    it = listT.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((wr1) next).d);
                    wr1Var = (wr1) next;
                    if (wr1Var == null) {
                        wr1Var2 = (wr1) CollectionsKt.first(listT);
                    } else {
                        wr1Var2 = wr1Var;
                    }
                    str = wr1Var2.a;
                    str2 = wr1Var2.c;
                    str3 = "二维码地址使用自动选择网卡: ";
                }
            }
            s01.E(str3, str, " -> ", str2, "QrNetworkAddressResolver");
        }
        if (wr1Var2 == null) {
            return null;
        }
        return "http://" + wr1Var2.c + ":" + i;
    }

    public static void b0(List list, lp1 lp1Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (lp1Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static int c0(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & UByte.MAX_VALUE;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & UShort.MAX_VALUE : ((int[]) obj)[i];
    }

    public static void d0(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int f(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j == ((long) i3)) {
            return i3;
        }
        throw new ArithmeticException(c61.k("overflow: checkedAdd(", i, i2, ", ", ")"));
    }

    public static long g(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException(c61.i(j2, ")", i02.r(j, "overflow: checkedAdd(", ", ")));
    }

    public static void h(Context context) {
        context.getClass();
        try {
            File[] fileArrListFiles = context.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    name.getClass();
                    if (StringsKt__StringsJVMKt.startsWith$default(name, "subtitle_", false, 2, null)) {
                        String name2 = file.getName();
                        name2.getClass();
                        if (StringsKt__StringsJVMKt.endsWith$default(name2, "_modified.srt", false, 2, null)) {
                            file.delete();
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (Exception e) {
            kb0.G("清理临时文件失败: ", e.getMessage(), "SrtParser", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (defpackage.hg2.q(r11.getWidth(), r11.getHeight(), (int) (r2 >> 32), (int) (r2 & 4294967295L), r4, r20) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap i(android.graphics.drawable.Drawable r16, android.graphics.Bitmap.Config r17, defpackage.n12 r18, defpackage.uu1 r19, defpackage.n12 r20, boolean r21) {
        /*
            r0 = r16
            r1 = r18
            r4 = r19
            r5 = r20
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 32
            if (r2 == 0) goto L5d
            r2 = r0
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r11 = r2.getBitmap()
            android.graphics.Bitmap$Config r2 = r11.getConfig()
            if (r17 == 0) goto L2a
            boolean r3 = defpackage.rl.b(r17)
            if (r3 == 0) goto L27
            goto L2a
        L27:
            r3 = r17
            goto L2c
        L2a:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
        L2c:
            if (r2 != r3) goto L5d
            if (r21 == 0) goto L31
            goto L5c
        L31:
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            long r2 = defpackage.hg2.p(r2, r3, r1, r4, r5)
            long r6 = r2 >> r10
            int r6 = (int) r6
            long r2 = r2 & r8
            int r2 = (int) r2
            r5 = r2
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            r7 = r6
            r6 = r4
            r4 = r7
            r7 = r20
            double r2 = defpackage.hg2.q(r2, r3, r4, r5, r6, r7)
            r4 = r6
            r5 = r7
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L5d
        L5c:
            return r11
        L5d:
            android.graphics.drawable.Drawable r6 = r0.mutate()
            int r0 = defpackage.ce2.b(r6)
            r2 = 512(0x200, float:7.175E-43)
            if (r0 <= 0) goto L6a
            goto L6b
        L6a:
            r0 = r2
        L6b:
            int r3 = defpackage.ce2.a(r6)
            if (r3 <= 0) goto L72
            r2 = r3
        L72:
            long r11 = defpackage.hg2.p(r0, r2, r1, r4, r5)
            long r13 = r11 >> r10
            int r1 = (int) r13
            long r8 = r8 & r11
            int r3 = (int) r8
            r15 = r2
            r2 = r1
            r1 = r15
            double r2 = defpackage.hg2.q(r0, r1, r2, r3, r4, r5)
            double r4 = (double) r0
            double r4 = r4 * r2
            int r0 = kotlin.math.MathKt.roundToInt(r4)
            double r4 = (double) r1
            double r2 = r2 * r4
            int r1 = kotlin.math.MathKt.roundToInt(r2)
            if (r17 == 0) goto L9a
            boolean r2 = defpackage.rl.b(r17)
            if (r2 == 0) goto L97
            goto L9a
        L97:
            r2 = r17
            goto L9c
        L9a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L9c:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Rect r3 = r6.getBounds()
            int r4 = r3.left
            int r5 = r3.top
            int r7 = r3.right
            int r3 = r3.bottom
            r8 = 0
            r6.setBounds(r8, r8, r0, r1)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r2)
            r6.draw(r0)
            r6.setBounds(r4, r5, r7, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl0.i(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, n12, uu1, n12, boolean):android.graphics.Bitmap");
    }

    public static Object j(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            ra.q(i9.f(i, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static final String k(Display.Mode mode) {
        if (mode == null) {
            return "null";
        }
        return mode.getPhysicalWidth() + "x" + mode.getPhysicalHeight() + "@" + String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(mode.getRefreshRate())}, 1)) + "(id=" + mode.getModeId() + ")";
    }

    public static int l(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (eu0.a[roundingMode.ordinal()]) {
            case 1:
                ku.r(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long m(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (v01.a[roundingMode.ordinal()]) {
            case 1:
                ku.r(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 4:
                return j3 + ((long) i);
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            default:
                throw new AssertionError();
        }
    }

    public static boolean n(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object o(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        n41.l("Both parameters are null");
        return null;
    }

    public static String p(long j) {
        long jMax = Math.max(0L, j);
        long j2 = jMax / DurationKt.MILLIS_IN_HOUR;
        long j3 = (jMax % DurationKt.MILLIS_IN_HOUR) / 60000;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%02d:%02d:%02d,%03d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf((jMax % 60000) / 1000), Long.valueOf(jMax % 1000)}, 4));
    }

    public static long s(long j, long j2) {
        ku.q(CmcdData.OBJECT_TYPE_AUDIO_ONLY, j);
        ku.q("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            j3 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    public static List t(Context context) {
        String hostAddress;
        Object objM8825constructorimpl;
        Inet4Address inet4Address;
        List<LinkAddress> linkAddresses;
        Object obj;
        context.getClass();
        int i = 0;
        try {
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            LinkProperties linkProperties = connectivityManager != null ? connectivityManager.getLinkProperties(connectivityManager != null ? connectivityManager.getActiveNetwork() : null) : null;
            if (linkProperties == null || (linkAddresses = linkProperties.getLinkAddresses()) == null) {
                hostAddress = null;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = linkAddresses.iterator();
                while (it.hasNext()) {
                    InetAddress address = ((LinkAddress) it.next()).getAddress();
                    Inet4Address inet4Address2 = address instanceof Inet4Address ? (Inet4Address) address : null;
                    if (inet4Address2 != null) {
                        arrayList.add(inet4Address2);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i2);
                    i2++;
                    Inet4Address inet4Address3 = (Inet4Address) obj;
                    if (!inet4Address3.isLoopbackAddress() && !inet4Address3.isLinkLocalAddress()) {
                        break;
                    }
                }
                Inet4Address inet4Address4 = (Inet4Address) obj;
                if (inet4Address4 != null) {
                    hostAddress = inet4Address4.getHostAddress();
                } else {
                    hostAddress = null;
                }
            }
        } catch (Exception e) {
            Log.e("QrNetworkAddressResolver", "读取活动网络 IPv4 失败", e);
        }
        ArrayList arrayList2 = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return CollectionsKt.emptyList();
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM8825constructorimpl = Result.m8825constructorimpl(Boolean.valueOf(networkInterfaceNextElement.isUp()));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
                }
                Boolean bool = Boolean.FALSE;
                if (Result.m8831isFailureimpl(objM8825constructorimpl)) {
                    objM8825constructorimpl = bool;
                }
                if (((Boolean) objM8825constructorimpl).booleanValue() && !networkInterfaceNextElement.isLoopback()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    inetAddresses.getClass();
                    while (true) {
                        if (!inetAddresses.hasMoreElements()) {
                            inet4Address = null;
                            break;
                        }
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (inetAddressNextElement instanceof Inet4Address) {
                            inet4Address = (Inet4Address) inetAddressNextElement;
                            if (!inet4Address.isLoopbackAddress() && !inet4Address.isLinkLocalAddress()) {
                                break;
                            }
                        }
                    }
                    if (inet4Address != null) {
                        String hostAddress2 = inet4Address.getHostAddress();
                        String string = hostAddress2 != null ? StringsKt.trim((CharSequence) hostAddress2).toString() : null;
                        String str = "";
                        if (string == null) {
                            string = "";
                        }
                        if (!StringsKt.isBlank(string)) {
                            String name = networkInterfaceNextElement.getName();
                            if (name == null) {
                                name = "";
                            }
                            String displayName = networkInterfaceNextElement.getDisplayName();
                            String string2 = displayName != null ? StringsKt.trim((CharSequence) displayName).toString() : null;
                            if (string2 != null) {
                                str = string2;
                            }
                            arrayList2.add(new wr1(name, str, string, Intrinsics.areEqual(string, hostAddress)));
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                if (hashSet.add(((wr1) obj2).a)) {
                    arrayList3.add(obj2);
                }
            }
            return CollectionsKt.sortedWith(arrayList3, new t90(new k00(12), 9));
        } catch (Exception e2) {
            Log.e("QrNetworkAddressResolver", "遍历网卡获取二维码地址失败", e2);
        }
    }

    public static final Object u(fs0 fs0Var, ri riVar) {
        Object obj = fs0Var.s.a.get(riVar);
        if (obj != null) {
            return obj;
        }
        Object obj2 = fs0Var.u.n.a.get(riVar);
        return obj2 == null ? riVar.b : obj2;
    }

    public static final Object v(wa1 wa1Var, ri riVar) {
        Object obj = wa1Var.j.a.get(riVar);
        return obj == null ? riVar.b : obj;
    }

    public static Object w(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        return it.hasNext() ? it.next() : obj;
    }

    public static Object x(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return wn.h(1, list);
        }
        r02.p();
        return null;
    }

    public static Object y(Iterable iterable) {
        Object next;
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return null;
            }
            if (iterable instanceof List) {
                return wn.h(1, (List) iterable);
            }
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int z() {
        return RangesKt.coerceAtLeast((RangesKt.coerceIn(((int) ((Runtime.getRuntime().maxMemory() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE)) / 2, 30, 120) / 10) * 10, 30);
    }

    public abstract void N(x xVar, x xVar2);

    public abstract void O(x xVar, Thread thread);

    public abstract boolean c(y yVar, m mVar, m mVar2);

    public abstract boolean d(y yVar, Object obj, Object obj2);

    public abstract boolean e(y yVar, x xVar, x xVar2);

    public abstract m q(y yVar);

    public abstract x r(y yVar);
}
