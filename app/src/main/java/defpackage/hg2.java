package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.content.FileProvider;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.DanmakuSettings;
import com.dh.myembyapp.data.model.Chapter;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes5.dex */
public abstract class hg2 {
    public static final lw1[] a = new lw1[0];

    public static int A(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static os0 B(Exception exc) {
        os0 os0Var = new os0();
        os0Var.l(exc);
        return os0Var;
    }

    public static final KClass C(KType kType) {
        kType.getClass();
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (!(classifier instanceof KTypeParameter)) {
            xc0.o("Only KClass supported as classifier, got ", classifier);
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
    }

    public static String D(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbE = w11.e("<", str2, " threw ");
                    sbE.append(e.getClass().getName());
                    sbE.append(">");
                    string = sbE.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final String E(String str) {
        str.getClass();
        String string = StringsKt.trim((CharSequence) str).toString();
        if (StringsKt.isBlank(string)) {
            return "";
        }
        String strReplace = new Regex("/+$").replace(string, "");
        return StringsKt__StringsJVMKt.endsWith$default(strReplace, "://", false, 2, null) ? string : c61.n(strReplace, "/");
    }

    public static final boolean F(Context context, Function1 function1) {
        Object objM8825constructorimpl;
        context.getClass();
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (Build.VERSION.SDK_INT >= 26) {
            listCreateListBuilder.add(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
        }
        listCreateListBuilder.add(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName())));
        listCreateListBuilder.add(new Intent("android.settings.SECURITY_SETTINGS"));
        for (Intent intent : CollectionsKt.build(listCreateListBuilder)) {
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    function1.invoke(intent);
                    objM8825constructorimpl = Result.m8825constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m8832isSuccessimpl(objM8825constructorimpl)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static v81 G(BufferedSource bufferedSource) throws IOException {
        int i = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        long j = Long.parseLong(bufferedSource.readUtf8LineStrict());
        long j2 = Long.parseLong(bufferedSource.readUtf8LineStrict());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        for (int i3 = 0; i3 < i2; i3++) {
            String utf8LineStrict = bufferedSource.readUtf8LineStrict();
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) utf8LineStrict, ':', 0, false, 6, (Object) null);
            if (iIndexOf$default == -1) {
                lc1.f(kb0.x("Unexpected header: ", utf8LineStrict));
                return null;
            }
            String string = StringsKt.trim((CharSequence) utf8LineStrict.substring(0, iIndexOf$default)).toString();
            String strSubstring = utf8LineStrict.substring(iIndexOf$default + 1);
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring);
        }
        return new v81(i, j, j2, new t81(MapsKt.toMap(linkedHashMap)), null, null);
    }

    public static final on1 H(UserPreferences userPreferences, Composer composer, int i) {
        userPreferences.getClass();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(629200238, i, -1, "com.dh.myembyapp.ui.screens.player.rememberPlayerSettingsState (PlayerSettingsState.kt:99)");
        }
        boolean zChanged = composer.changed(userPreferences);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new on1(userPreferences);
            composer.updateRememberedValue(objRememberedValue);
        }
        on1 on1Var = (on1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return on1Var;
    }

    public static final uu0 I(List list) {
        Object objPrevious;
        Object objPrevious2;
        Object objPrevious3;
        Object objPrevious4;
        Object objPrevious5;
        list.getClass();
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!StringsKt__StringsJVMKt.equals(((Chapter) objPrevious).getMarkerType(), "IntroStart", true));
        Chapter chapter = (Chapter) objPrevious;
        ListIterator listIterator2 = list.listIterator(list.size());
        do {
            if (!listIterator2.hasPrevious()) {
                objPrevious2 = null;
                break;
            }
            objPrevious2 = listIterator2.previous();
        } while (!StringsKt__StringsJVMKt.equals(((Chapter) objPrevious2).getMarkerType(), "IntroEnd", true));
        Chapter chapter2 = (Chapter) objPrevious2;
        ListIterator listIterator3 = list.listIterator(list.size());
        do {
            if (!listIterator3.hasPrevious()) {
                objPrevious3 = null;
                break;
            }
            objPrevious3 = listIterator3.previous();
        } while (!StringsKt__StringsJVMKt.equals(((Chapter) objPrevious3).getMarkerType(), "CreditsStart", true));
        Chapter chapter3 = (Chapter) objPrevious3;
        if (chapter != null || chapter2 != null || chapter3 != null) {
            Long lValueOf = chapter2 != null ? Long.valueOf(chapter2.getStartPositionTicks() / Renderer.DEFAULT_DURATION_TO_PROGRESS_US) : null;
            return new uu0(chapter != null ? Long.valueOf(chapter.getStartPositionTicks() / Renderer.DEFAULT_DURATION_TO_PROGRESS_US) : null, lValueOf, lValueOf, chapter3 != null ? Long.valueOf(chapter3.getStartPositionTicks() / Renderer.DEFAULT_DURATION_TO_PROGRESS_US) : null, true, chapter != null, chapter2 != null, chapter3 != null, false, false);
        }
        ListIterator listIterator4 = list.listIterator(list.size());
        do {
            if (!listIterator4.hasPrevious()) {
                objPrevious4 = null;
                break;
            }
            objPrevious4 = listIterator4.previous();
        } while (!Intrinsics.areEqual(((Chapter) objPrevious4).getName(), "正片"));
        Chapter chapter4 = (Chapter) objPrevious4;
        ListIterator listIterator5 = list.listIterator(list.size());
        do {
            if (!listIterator5.hasPrevious()) {
                objPrevious5 = null;
                break;
            }
            objPrevious5 = listIterator5.previous();
        } while (!Intrinsics.areEqual(((Chapter) objPrevious5).getName(), "片尾"));
        Chapter chapter5 = (Chapter) objPrevious5;
        Long lValueOf2 = chapter4 != null ? Long.valueOf(chapter4.getStartPositionTicks() / Renderer.DEFAULT_DURATION_TO_PROGRESS_US) : null;
        return new uu0(null, lValueOf2, lValueOf2, chapter5 != null ? Long.valueOf(chapter5.getStartPositionTicks() / Renderer.DEFAULT_DURATION_TO_PROGRESS_US) : null, false, false, false, false, chapter4 != null, chapter5 != null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0135  */
    /* JADX WARN: Code duplicated, block: B:83:0x013a A[RETURN] */
    public static final xv0 J(yw1 yw1Var, KType kType, boolean z) {
        xv0 xv0VarC;
        xv0 xv0VarZ;
        ap1 ap1Var;
        KClass kClassC = C(kType);
        boolean zIsMarkedNullable = kType.isMarkedNullable();
        List<KTypeProjection> arguments = kType.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10));
        for (KTypeProjection kTypeProjection : arguments) {
            kTypeProjection.getClass();
            KType type = kTypeProjection.getType();
            if (type == null) {
                lm.i("Star projections in type arguments are not allowed, but had ", kTypeProjection.getType());
                return null;
            }
            arrayList.add(type);
        }
        if (arrayList.isEmpty()) {
            if (JvmClassMappingKt.getJavaClass(kClassC).isInterface()) {
                List listEmptyList = CollectionsKt.emptyList();
                rw1 rw1Var = (rw1) yw1Var;
                rw1Var.getClass();
                listEmptyList.getClass();
                mv mvVar = (mv) rw1Var.a.get(kClassC);
                xv0 xv0VarA = mvVar != null ? mvVar.a(listEmptyList) : null;
                if (!(xv0VarA instanceof xv0)) {
                    xv0VarA = null;
                }
                if (xv0VarA != null) {
                    xv0VarC = null;
                } else {
                    ww1 ww1Var = xw1.a;
                    if (zIsMarkedNullable) {
                        xv0VarC = xw1.b.c(kClassC);
                    } else {
                        xv0VarC = xw1.a.c(kClassC);
                        if (xv0VarC == null) {
                            xv0VarC = null;
                        }
                    }
                }
            } else {
                ww1 ww1Var2 = xw1.a;
                if (zIsMarkedNullable) {
                    xv0VarC = xw1.a.c(kClassC);
                    if (xv0VarC == null) {
                        xv0VarC = null;
                    }
                } else {
                    xv0VarC = xw1.b.c(kClassC);
                }
            }
        } else if (((rw1) yw1Var).f) {
            xv0VarC = null;
        } else {
            ww1 ww1Var3 = xw1.a;
            Object objA = !zIsMarkedNullable ? xw1.c.a(kClassC, arrayList) : xw1.d.a(kClassC, arrayList);
            if (Result.m8831isFailureimpl(objA)) {
                objA = null;
            }
            xv0VarC = (xv0) objA;
        }
        if (xv0VarC != null) {
            return xv0VarC;
        }
        if (arrayList.isEmpty()) {
            xv0VarZ = tl0.Z(kClassC);
            if (xv0VarZ == null) {
                List listEmptyList2 = CollectionsKt.emptyList();
                rw1 rw1Var2 = (rw1) yw1Var;
                rw1Var2.getClass();
                listEmptyList2.getClass();
                mv mvVar2 = (mv) rw1Var2.a.get(kClassC);
                xv0 xv0VarA2 = mvVar2 != null ? mvVar2.a(listEmptyList2) : null;
                xv0VarZ = xv0VarA2 instanceof xv0 ? xv0VarA2 : null;
                if (xv0VarZ == null) {
                    if (JvmClassMappingKt.getJavaClass(kClassC).isInterface()) {
                        ap1Var = new ap1(kClassC);
                        xv0VarZ = ap1Var;
                    } else {
                        xv0VarZ = null;
                    }
                }
            }
            if (xv0VarZ != null) {
                if (zIsMarkedNullable) {
                    return ym.b(xv0VarZ);
                }
                return xv0VarZ;
            }
        } else {
            ArrayList arrayListA0 = tl0.a0(yw1Var, arrayList, z);
            if (arrayListA0 != null) {
                xv0 xv0VarE = tl0.E(kClassC, arrayListA0, new c71(arrayList, 21));
                if (xv0VarE == null) {
                    mv mvVar3 = (mv) ((rw1) yw1Var).a.get(kClassC);
                    xv0 xv0VarA3 = mvVar3 != null ? mvVar3.a(arrayListA0) : null;
                    xv0VarZ = xv0VarA3 instanceof xv0 ? xv0VarA3 : null;
                    if (xv0VarZ == null) {
                        if (JvmClassMappingKt.getJavaClass(kClassC).isInterface()) {
                            ap1Var = new ap1(kClassC);
                            xv0VarZ = ap1Var;
                        } else {
                            xv0VarZ = null;
                        }
                    }
                } else {
                    xv0VarZ = xv0VarE;
                }
                if (xv0VarZ != null) {
                    if (zIsMarkedNullable) {
                        return ym.b(xv0VarZ);
                    }
                    return xv0VarZ;
                }
            }
        }
        return null;
    }

    public static final void K(KClass kClass) {
        kClass.getClass();
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        throw new uw1(mr.r("Serializer for class '", simpleName, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final bu0 L(Context context, File file) {
        context.getClass();
        try {
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            intent.addFlags(268435456);
            intent.addFlags(1);
            if (intent.resolveActivity(context.getPackageManager()) == null) {
                Log.e("AppSettingsSupport", "未找到可处理 APK 安装的系统组件");
                return bu0.c;
            }
            context.startActivity(intent);
            return bu0.a;
        } catch (SecurityException e) {
            Log.e("AppSettingsSupport", "缺少安装未知应用权限", e);
            return Build.VERSION.SDK_INT >= 26 ? bu0.b : bu0.c;
        } catch (Exception e2) {
            Log.e("AppSettingsSupport", "启动 APK 安装失败", e2);
            return bu0.c;
        }
    }

    public static final void M(String str, KClass kClass) {
        String string;
        kClass.getClass();
        String str2 = "in the polymorphic scope of '" + kClass.getSimpleName() + '\'';
        if (str == null) {
            string = "Class discriminator was missing and no default serializers were registered " + str2 + '.';
        } else {
            StringBuilder sbZ = kb0.z("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            i02.v(sbZ, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbZ.append(kClass.getSimpleName());
            sbZ.append("' has to be sealed and '@Serializable'.");
            string = sbZ.toString();
        }
        throw new uw1(string);
    }

    public static int N(ab0 ab0Var, uu1 uu1Var) {
        if (ab0Var instanceof ya0) {
            return ((ya0) ab0Var).a;
        }
        int iOrdinal = uu1Var.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        qu.f();
        return 0;
    }

    public static w0 O(f01 f01Var, xl0 xl0Var, Executor executor) {
        int i = x0.k;
        w0 w0Var = new w0(f01Var, xl0Var);
        executor.getClass();
        if (executor != bb0.a) {
            executor = new e51(executor, w0Var);
        }
        f01Var.addListener(w0Var, executor);
        return w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final ag0 P(ag0 ag0Var, fs0 fs0Var, wa1 wa1Var, yg0 yg0Var, ContinuationImpl continuationImpl) {
        hg0 hg0Var;
        List list;
        int i;
        boolean z;
        Bitmap bitmapI;
        int size;
        Bitmap bitmap;
        yg0 yg0Var2;
        ag0 ag0Var2 = ag0Var;
        fs0 fs0Var2 = fs0Var;
        wa1 wa1Var2 = wa1Var;
        if (continuationImpl instanceof hg0) {
            hg0Var = (hg0) continuationImpl;
            int i2 = hg0Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hg0Var.j = i2 - Integer.MIN_VALUE;
            } else {
                hg0Var = new hg0(continuationImpl);
            }
        } else {
            hg0Var = new hg0(continuationImpl);
        }
        Object obj = hg0Var.i;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = hg0Var.j;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            list = (List) tl0.u(fs0Var2, hs0.a);
            if (list.isEmpty()) {
                return ag0Var2;
            }
            pr0 pr0Var = ag0Var2.a;
            boolean z2 = pr0Var instanceof nl;
            if (!z2 && !((Boolean) tl0.u(fs0Var2, hs0.d)).booleanValue()) {
                return ag0Var2;
            }
            i = 0;
            if (z2) {
                Bitmap bitmap2 = ((nl) pr0Var).a;
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (ArraysKt.contains(ce2.a, config)) {
                    bitmapI = bitmap2;
                } else {
                    Drawable drawableE = ig2.e(pr0Var, wa1Var2.a.getResources());
                    Bitmap.Config config2 = (Bitmap.Config) tl0.v(wa1Var2, is0.b);
                    n12 n12Var = wa1Var2.b;
                    uu1 uu1Var = wa1Var2.c;
                    n12 n12Var2 = (n12) tl0.v(wa1Var2, hs0.b);
                    if (wa1Var2.d == jp1.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bitmapI = tl0.i(drawableE, config2, n12Var, uu1Var, n12Var2, z);
                }
            } else {
                Drawable drawableE2 = ig2.e(pr0Var, wa1Var2.a.getResources());
                Bitmap.Config config3 = (Bitmap.Config) tl0.v(wa1Var2, is0.b);
                n12 n12Var3 = wa1Var2.b;
                uu1 uu1Var2 = wa1Var2.c;
                n12 n12Var4 = (n12) tl0.v(wa1Var2, hs0.b);
                if (wa1Var2.d == jp1.b) {
                    z = true;
                } else {
                    z = false;
                }
                bitmapI = tl0.i(drawableE2, config3, n12Var3, uu1Var2, n12Var4, z);
            }
            yg0Var.getClass();
            size = list.size();
            bitmap = bitmapI;
            yg0Var2 = yg0Var;
        } else {
            if (i3 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = hg0Var.h;
            int i5 = hg0Var.g;
            List list2 = hg0Var.e;
            yg0Var2 = hg0Var.d;
            wa1 wa1Var3 = hg0Var.c;
            fs0 fs0Var3 = hg0Var.b;
            ag0 ag0Var3 = hg0Var.a;
            ResultKt.throwOnFailure(obj);
            JobKt.ensureActive(hg0Var.get$context());
            size = i4;
            ag0Var2 = ag0Var3;
            bitmap = (Bitmap) obj;
            list = list2;
            wa1Var2 = wa1Var3;
            i = i5 + 1;
            fs0Var2 = fs0Var3;
        }
        if (i >= size) {
            yg0Var2.getClass();
            return new ag0(new nl(bitmap), ag0Var2.b, ag0Var2.c, ag0Var2.d);
        }
        if (list.get(i) != null) {
            throw new ClassCastException();
        }
        n12 n12Var5 = wa1Var2.b;
        hg0Var.a = ag0Var2;
        hg0Var.b = fs0Var2;
        hg0Var.c = wa1Var2;
        hg0Var.d = yg0Var2;
        hg0Var.e = list;
        hg0Var.g = i;
        hg0Var.h = size;
        hg0Var.j = 1;
        throw null;
    }

    public static void Q(v81 v81Var, BufferedSink bufferedSink) throws IOException {
        bufferedSink.writeDecimalLong(v81Var.a).writeByte(10);
        bufferedSink.writeDecimalLong(v81Var.b).writeByte(10);
        bufferedSink.writeDecimalLong(v81Var.c).writeByte(10);
        Set<Map.Entry> setEntrySet = v81Var.d.a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        bufferedSink.writeDecimalLong(size).writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                bufferedSink.writeUtf8((String) entry.getKey()).writeUtf8(":").writeUtf8((String) it2.next()).writeByte(10);
            }
        }
    }

    public static final void a(final boolean z, final MediaItem mediaItem, final Function0 function0, final Function4 function4, Composer composer, final int i) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        String name;
        String seasonId;
        Composer composerStartRestartGroup = composer.startRestartGroup(-576327381);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(mediaItem) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-576327381, i2, -1, "com.dh.myembyapp.ui.screens.player.DanmakuSearchOverlay (PlayerDialogOverlays.kt:92)");
            }
            if (z) {
                if (!Intrinsics.areEqual(mediaItem.getType(), "Episode") || (name = mediaItem.getSeriesName()) == null) {
                    name = mediaItem.getName();
                }
                String id = mediaItem.getId();
                String type = mediaItem.getType();
                if (Intrinsics.areEqual(mediaItem.getType(), "Episode")) {
                    seasonId = mediaItem.getSeasonId();
                    if (seasonId == null) {
                        seasonId = mediaItem.getParentId();
                    }
                } else {
                    seasonId = null;
                }
                qy.c(name, id, type, seasonId, mediaItem.getIndexNumber(), mediaItem.getParentIndexNumber(), function0, function4, composerStartRestartGroup, (i2 << 12) & 33030144);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i3 = 0;
                function2 = new Function2() { // from class: qg1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i3) {
                            case 0:
                                ((Integer) obj2).intValue();
                                hg2.a(z, mediaItem, function0, function4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                hg2.a(z, mediaItem, function0, function4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i4 = 1;
            function2 = new Function2() { // from class: qg1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            ((Integer) obj2).intValue();
                            hg2.a(z, mediaItem, function0, function4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            hg2.a(z, mediaItem, function0, function4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    public static final void b(final boolean z, final DanmakuSettings danmakuSettings, final Function1 function1, final Function0 function0, final Function1 function2, Composer composer, final int i) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function3;
        Composer composerStartRestartGroup = composer.startRestartGroup(654363521);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(danmakuSettings) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(654363521, i2, -1, "com.dh.myembyapp.ui.screens.player.DanmakuSettingsOverlay (PlayerDialogOverlays.kt:119)");
            }
            if (z) {
                gz.a(danmakuSettings, function1, function0, function2, composerStartRestartGroup, (i2 >> 3) & 8190);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i3 = 0;
                function3 = new Function2() { // from class: rg1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i3) {
                            case 0:
                                ((Integer) obj2).intValue();
                                hg2.b(z, danmakuSettings, function1, function0, function2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                hg2.b(z, danmakuSettings, function1, function0, function2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function3);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i4 = 1;
            function3 = new Function2() { // from class: rg1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            ((Integer) obj2).intValue();
                            hg2.b(z, danmakuSettings, function1, function0, function2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            hg2.b(z, danmakuSettings, function1, function0, function2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function3);
        }
    }

    public static fk0 c(Path path, FileSystem fileSystem, String str, fs1 fs1Var, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            fs1Var = null;
        }
        return new fk0(path, fileSystem, str, fs1Var);
    }

    public static final void d(final boolean z, final MediaItem mediaItem, final t91 t91Var, final ij1 ij1Var, final jj1 jj1Var, Composer composer, final int i) {
        int i2;
        final boolean z2;
        final MediaItem mediaItem2;
        final t91 t91Var2;
        int i3;
        String seriesName;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2145163967);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(mediaItem) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(t91Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(ij1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(jj1Var) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2145163967, i2, -1, "com.dh.myembyapp.ui.screens.player.OnlineSubtitleSearchOverlay (PlayerDialogOverlays.kt:73)");
            }
            if (!z) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i4 = 0;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: sg1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            int i6 = i;
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    hg2.d(z, mediaItem, t91Var, ij1Var, jj1Var, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    hg2.d(z, mediaItem, t91Var, ij1Var, jj1Var, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            mediaItem2 = mediaItem;
            t91Var2 = t91Var;
            i3 = i;
            ra1.c(t91Var2.d(), t91Var2.getAssrtApiProtocol(), (!Intrinsics.areEqual(mediaItem2.getType(), "Episode") || (seriesName = mediaItem2.getSeriesName()) == null || StringsKt.isBlank(seriesName)) ? mediaItem2.getName() : mediaItem2.getSeriesName(), ij1Var, jj1Var, composerStartRestartGroup, 64512 & i2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            z2 = z;
            mediaItem2 = mediaItem;
            t91Var2 = t91Var;
            i3 = i;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i5 = 1;
            final int i6 = i3;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: sg1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i5;
                    int i8 = i6;
                    switch (i7) {
                        case 0:
                            ((Integer) obj2).getClass();
                            hg2.d(z2, mediaItem2, t91Var2, ij1Var, jj1Var, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            hg2.d(z2, mediaItem2, t91Var2, ij1Var, jj1Var, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void e(final MediaItem mediaItem, final t91 t91Var, final boolean z, final boolean z2, final boolean z3, final DanmakuSettings danmakuSettings, final vd1 vd1Var, final boolean z4, final ij1 ij1Var, final jj1 jj1Var, final Function0 function0, final Function4 function4, final Function1 function1, final Function0 function2, final Function1 function3, final Function0 function5, final Function0 function6, final Function0 function7, final Function0 function8, Composer composer, final int i, final int i2) {
        int i3;
        boolean z5;
        boolean z6;
        int i4;
        mediaItem.getClass();
        t91Var.getClass();
        danmakuSettings.getClass();
        function0.getClass();
        function4.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        function8.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1483134348);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(mediaItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(t91Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            z5 = z;
            i3 |= composerStartRestartGroup.changed(z5) ? 256 : 128;
        } else {
            z5 = z;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z6 = z3;
            i3 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
        } else {
            z6 = z3;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changed(danmakuSettings) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(vd1Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
        }
        int i5 = i & 100663296;
        int i6 = GroupFlagsKt.HasAuxSlotFlag;
        if (i5 == 0) {
            i3 |= composerStartRestartGroup.changedInstance(ij1Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(jj1Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function4) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function5) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function6) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function7) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            if (composerStartRestartGroup.changedInstance(function8)) {
                i6 = 67108864;
            }
            i4 |= i6;
        }
        int i7 = i4;
        if (composerStartRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (38347923 & i7) == 38347922) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1483134348, i3, i7, "com.dh.myembyapp.ui.screens.player.PlayerDialogOverlays (PlayerDialogOverlays.kt:34)");
            }
            int i8 = i3 << 3;
            int i9 = i8 & Input.Keys.FORWARD_DEL;
            int i10 = ((i3 >> 6) & 14) | i9 | (i8 & 896);
            int i11 = i3 >> 15;
            d(z5, mediaItem, t91Var, ij1Var, jj1Var, composerStartRestartGroup, i10 | (i11 & 7168) | (i11 & 57344));
            int i12 = i7 << 6;
            a(z2, mediaItem, function0, function4, composerStartRestartGroup, ((i3 >> 9) & 14) | i9 | (i12 & 896) | (i12 & 7168));
            composerStartRestartGroup = composerStartRestartGroup;
            b(z6, danmakuSettings, function1, function2, function3, composerStartRestartGroup, ((i3 >> 12) & WebSocketProtocol.PAYLOAD_SHORT) | (i7 & 896) | (i7 & 7168) | (i7 & 57344));
            if (vd1Var == null) {
                composerStartRestartGroup.startReplaceGroup(-1725137774);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1725137773);
                ud1.b(vd1Var, function5, z4 ? function6 : null, function7, function8, composerStartRestartGroup, (i7 >> 12) & 64624);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: pg1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    hg2.e(mediaItem, t91Var, z, z2, z3, danmakuSettings, vd1Var, z4, ij1Var, jj1Var, function0, function4, function1, function2, function3, function5, function6, function7, function8, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final zp1 f(String str, yp1 yp1Var) {
        if (StringsKt.isBlank(str)) {
            ra.q("Blank serial names are prohibited");
            return null;
        }
        for (xv0 xv0Var : aq1.a.values()) {
            if (Intrinsics.areEqual(str, xv0Var.getDescriptor().f())) {
                StringBuilder sbE = w11.e("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbE.append(Reflection.getOrCreateKotlinClass(xv0Var.getClass()).getSimpleName());
                sbE.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                ra.q(StringsKt.trimIndent(sbE.toString()));
                return null;
            }
        }
        return new zp1(str, yp1Var);
    }

    public static final eg2 g(String str, lw1 lw1Var) {
        lw1Var.getClass();
        if (StringsKt.isBlank(str)) {
            ra.q("Blank serial names are prohibited");
            return null;
        }
        if (lw1Var.getKind() instanceof yp1) {
            ra.q("For primitive descriptors please use 'PrimitiveSerialDescriptor' instead");
            return null;
        }
        if (!Intrinsics.areEqual(str, lw1Var.f())) {
            return new eg2(str, lw1Var);
        }
        StringBuilder sbE = w11.e("The name of the wrapped descriptor (", str, ") cannot be the same as the name of the original descriptor (");
        sbE.append(lw1Var.f());
        sbE.append(')');
        throw new IllegalArgumentException(sbE.toString().toString());
    }

    public static final String h(Uri uri) {
        String string;
        if (uri == null || (string = uri.toString()) == null) {
            string = "null";
        }
        return StringsKt__StringsKt.substringBefore$default(string, '?', (String) null, 2, (Object) null);
    }

    public static void i(f01 f01Var, yl0 yl0Var, Executor executor) {
        f01Var.addListener(new am0(f01Var, yl0Var), executor);
    }

    public static rq j(ArrayList arrayList) {
        List arrayList2;
        at0 at0VarK = at0.k(arrayList);
        rq rqVar = new rq(at0VarK, true, true);
        if (at0VarK.isEmpty()) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            int size = at0VarK.size();
            ig2.r(size, "initialArraySize");
            arrayList2 = new ArrayList(size);
        }
        for (int i = 0; i < at0VarK.size(); i++) {
            arrayList2.add(null);
        }
        rqVar.q = arrayList2;
        rqVar.t();
        return rqVar;
    }

    public static nw1 k(String str, lw1[] lw1VarArr) {
        if (StringsKt.isBlank(str)) {
            ra.q("Blank serial names are prohibited");
            return null;
        }
        wp wpVar = new wp(str);
        Unit unit = Unit.INSTANCE;
        return new nw1(str, l32.e, wpVar.c.size(), ArraysKt.toList(lw1VarArr), wpVar);
    }

    public static final nw1 l(String str, ig2 ig2Var, lw1[] lw1VarArr, Function1 function1) {
        if (StringsKt.isBlank(str)) {
            ra.q("Blank serial names are prohibited");
            return null;
        }
        if (Intrinsics.areEqual(ig2Var, l32.e)) {
            ra.q("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        wp wpVar = new wp(str);
        function1.invoke(wpVar);
        return new nw1(str, ig2Var, wpVar.c.size(), ArraysKt.toList(lw1VarArr), wpVar);
    }

    public static final Set m(lw1 lw1Var) {
        lw1Var.getClass();
        if (lw1Var instanceof qn) {
            return ((qn) lw1Var).a();
        }
        HashSet hashSet = new HashSet(lw1Var.c());
        int iC = lw1Var.c();
        for (int i = 0; i < iC; i++) {
            hashSet.add(lw1Var.d(i));
        }
        return hashSet;
    }

    public static void n(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static final lw1[] o(List list) {
        lw1[] lw1VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (lw1VarArr = (lw1[]) list.toArray(new lw1[0])) == null) ? a : lw1VarArr;
    }

    public static final long p(int i, int i2, n12 n12Var, uu1 uu1Var, n12 n12Var2) {
        if (!Intrinsics.areEqual(n12Var, n12.c)) {
            i = N(n12Var.a, uu1Var);
            i2 = N(n12Var.b, uu1Var);
        }
        ab0 ab0Var = n12Var2.a;
        ab0 ab0Var2 = n12Var2.b;
        if ((ab0Var instanceof ya0) && i != Integer.MIN_VALUE && i != Integer.MAX_VALUE) {
            i = RangesKt.coerceAtMost(i, ((ya0) ab0Var).a);
        }
        if ((ab0Var2 instanceof ya0) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE) {
            i2 = RangesKt.coerceAtMost(i2, ((ya0) ab0Var2).a);
        }
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final double q(int i, int i2, int i3, int i4, uu1 uu1Var, n12 n12Var) {
        double dMax;
        double d = i;
        double d2 = ((double) i3) / d;
        double d3 = i2;
        double d4 = ((double) i4) / d3;
        int iOrdinal = uu1Var.ordinal();
        if (iOrdinal == 0) {
            dMax = Math.max(d2, d4);
        } else {
            if (iOrdinal != 1) {
                qu.f();
                return 0.0d;
            }
            dMax = Math.min(d2, d4);
        }
        ab0 ab0Var = n12Var.a;
        if (ab0Var instanceof ya0) {
            dMax = RangesKt.coerceAtMost(dMax, ((double) ((ya0) ab0Var).a) / d);
        }
        ab0 ab0Var2 = n12Var.b;
        return ab0Var2 instanceof ya0 ? RangesKt.coerceAtMost(dMax, ((double) ((ya0) ab0Var2).a) / d3) : dMax;
    }

    public static long[] r(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        ig2.i(length, length == ((long) i), "the total number of elements (%s) in the arrays must fit in an int");
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static boolean s(sb2 sb2Var, Object obj) {
        Iterator it = sb2Var.a;
        if (obj == null) {
            while (it.hasNext()) {
                if (sb2Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(sb2Var.next())) {
                return true;
            }
        }
        return false;
    }

    public static final Object t(o32 o32Var, y32 y32Var, SuspendLambda suspendLambda) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ac(y32Var, o32Var, (Continuation) null, 0), suspendLambda);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public static final l40 u(u0 u0Var, xt xtVar, String str) {
        xv0 xv0Var;
        yw1 serializersModule = xtVar.getSerializersModule();
        KClass kClass = ((ap1) u0Var).a;
        rw1 rw1Var = (rw1) serializersModule;
        rw1Var.getClass();
        kClass.getClass();
        Map map = (Map) rw1Var.d.get(kClass);
        xv0 xv0Var2 = map != null ? (xv0) map.get(str) : null;
        if (!(xv0Var2 instanceof xv0)) {
            xv0Var2 = null;
        }
        if (xv0Var2 != null) {
            xv0Var = xv0Var2;
        } else {
            Object obj = rw1Var.e.get(kClass);
            Function1 function1 = TypeIntrinsics.isFunctionOfArity(obj, 1) ? (Function1) obj : null;
            xv0Var = function1 != null ? (l40) function1.invoke(str) : null;
        }
        if (xv0Var != null) {
            return xv0Var;
        }
        M(str, kClass);
        throw null;
    }

    public static boolean v(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1159792958, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
        }
        boolean zBooleanValue = ((Boolean) composer.consume(n72.g)).booleanValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return zBooleanValue;
    }

    public static final KClass w(lw1 lw1Var) {
        lw1Var.getClass();
        if (lw1Var instanceof av) {
            return ((av) lw1Var).b;
        }
        if (lw1Var instanceof mw1) {
            return w(((mw1) lw1Var).a);
        }
        return null;
    }

    public static Object x(Future future) {
        boolean z;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bn bnVar = fm0.a;
        em0.a.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = dm0.b;
        Iterator it = copyOnWriteArraySet.iterator();
        try {
            try {
                while (it.hasNext()) {
                    if (VideoFrameProcessingException.class.equals(((WeakReference) it.next()).get())) {
                        return future.get(500000L, timeUnit);
                    }
                }
                return future.get(500000L, timeUnit);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw fm0.a(e);
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof Error) {
                    throw new bh0((Error) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw new nd2(cause);
                }
                throw fm0.a(cause);
            } catch (TimeoutException e3) {
                throw fm0.a(e3);
            }
            fm0.a(new Exception());
        } catch (Throwable unused) {
            z = false;
        }
        z = true;
        ig2.k("Futures.getChecked exception type (%s) must not be a RuntimeException", !RuntimeException.class.isAssignableFrom(VideoFrameProcessingException.class), VideoFrameProcessingException.class);
        ig2.k("Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", z, VideoFrameProcessingException.class);
        if (copyOnWriteArraySet.size() > 1000) {
            copyOnWriteArraySet.clear();
        }
        copyOnWriteArraySet.add(new WeakReference(VideoFrameProcessingException.class));
    }

    public static u61 y(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
        }
        u61 u61Var = (u61) composer.consume(n72.b);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return u61Var;
    }

    public static Object z(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
