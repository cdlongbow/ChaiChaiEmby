package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaStream;
import com.dh.myembyapp.data.model.PersonInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class va0 extends ViewModel {
    public final MutableStateFlow A;
    public final StateFlow B;
    public final MutableStateFlow C;
    public final StateFlow D;
    public final MutableStateFlow E;
    public final StateFlow F;
    public final MutableStateFlow G;
    public final StateFlow H;
    public final MutableStateFlow I;
    public final StateFlow J;
    public final MutableStateFlow K;
    public final StateFlow L;
    public final MutableStateFlow M;
    public final StateFlow N;
    public final MutableStateFlow O;
    public final StateFlow P;
    public final MutableStateFlow Q;
    public final StateFlow R;
    public final MutableStateFlow S;
    public final StateFlow T;
    public final MutableStateFlow U;
    public final StateFlow V;
    public final MutableStateFlow W;
    public final StateFlow X;
    public long Y;
    public String Z;
    public final MutableStateFlow a0;
    public final StateFlow b0;
    public String c;
    public final MutableStateFlow c0;
    public String d;
    public final StateFlow d0;
    public long e;
    public String e0;
    public za1 f;
    public boolean f0;
    public final MutableStateFlow g;
    public boolean g0;
    public final StateFlow h;
    public final MutableStateFlow h0;
    public final MutableStateFlow i;
    public final StateFlow i0;
    public final StateFlow j;
    public final MutableStateFlow j0;
    public final MutableStateFlow k;
    public final StateFlow k0;
    public final StateFlow l;
    public final MutableStateFlow l0;
    public final MutableStateFlow m;
    public final StateFlow m0;
    public final StateFlow n;
    public final MutableStateFlow o;
    public final StateFlow p;
    public final MutableStateFlow q;
    public final StateFlow r;
    public final MutableStateFlow s;
    public final StateFlow t;
    public final MutableStateFlow u;
    public final StateFlow v;
    public final MutableStateFlow w;
    public final StateFlow x;
    public final MutableStateFlow y;
    public final StateFlow z;
    public final uf0 a = new uf0();
    public final hb1 b = new hb1();

    /* JADX WARN: Multi-variable type inference failed */
    public va0() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(da0.a);
        this.g = MutableStateFlow;
        this.h = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.i = MutableStateFlow2;
        this.j = FlowKt.asStateFlow(MutableStateFlow2);
        String str = null;
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.k = MutableStateFlow3;
        this.l = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.m = MutableStateFlow4;
        this.n = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(wg0.TITLE);
        this.o = MutableStateFlow5;
        this.p = FlowKt.asStateFlow(MutableStateFlow5);
        SharedPreferences sharedPreferences = ig2.c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow(Boolean.valueOf(sharedPreferences.getBoolean("sort_descending", true)));
        this.q = MutableStateFlow6;
        this.r = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this.s = MutableStateFlow7;
        this.t = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow MutableStateFlow8 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.u = MutableStateFlow8;
        this.v = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow MutableStateFlow9 = StateFlowKt.MutableStateFlow(0);
        this.w = MutableStateFlow9;
        this.x = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow MutableStateFlow10 = StateFlowKt.MutableStateFlow(s40.a);
        this.y = MutableStateFlow10;
        this.z = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow MutableStateFlow11 = StateFlowKt.MutableStateFlow(null);
        this.A = MutableStateFlow11;
        this.B = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow MutableStateFlow12 = StateFlowKt.MutableStateFlow(null);
        this.C = MutableStateFlow12;
        this.D = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow MutableStateFlow13 = StateFlowKt.MutableStateFlow(0);
        this.E = MutableStateFlow13;
        this.F = FlowKt.asStateFlow(MutableStateFlow13);
        MutableStateFlow MutableStateFlow14 = StateFlowKt.MutableStateFlow(null);
        this.G = MutableStateFlow14;
        this.H = FlowKt.asStateFlow(MutableStateFlow14);
        MutableStateFlow MutableStateFlow15 = StateFlowKt.MutableStateFlow(0);
        this.I = MutableStateFlow15;
        this.J = FlowKt.asStateFlow(MutableStateFlow15);
        MutableStateFlow MutableStateFlow16 = StateFlowKt.MutableStateFlow(null);
        this.K = MutableStateFlow16;
        this.L = FlowKt.asStateFlow(MutableStateFlow16);
        MutableStateFlow MutableStateFlow17 = StateFlowKt.MutableStateFlow(0);
        this.M = MutableStateFlow17;
        this.N = FlowKt.asStateFlow(MutableStateFlow17);
        MutableStateFlow MutableStateFlow18 = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        this.O = MutableStateFlow18;
        this.P = FlowKt.asStateFlow(MutableStateFlow18);
        MutableStateFlow MutableStateFlow19 = StateFlowKt.MutableStateFlow(new r40(null, 7));
        this.Q = MutableStateFlow19;
        this.R = FlowKt.asStateFlow(MutableStateFlow19);
        MutableStateFlow MutableStateFlow20 = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        this.S = MutableStateFlow20;
        this.T = FlowKt.asStateFlow(MutableStateFlow20);
        MutableStateFlow MutableStateFlow21 = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        this.U = MutableStateFlow21;
        this.V = FlowKt.asStateFlow(MutableStateFlow21);
        MutableStateFlow MutableStateFlow22 = StateFlowKt.MutableStateFlow(w90.a);
        this.W = MutableStateFlow22;
        this.X = FlowKt.asStateFlow(MutableStateFlow22);
        MutableStateFlow MutableStateFlow23 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.a0 = MutableStateFlow23;
        this.b0 = FlowKt.asStateFlow(MutableStateFlow23);
        MutableStateFlow MutableStateFlow24 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.c0 = MutableStateFlow24;
        this.d0 = FlowKt.asStateFlow(MutableStateFlow24);
        MutableStateFlow MutableStateFlow25 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.h0 = MutableStateFlow25;
        this.i0 = FlowKt.asStateFlow(MutableStateFlow25);
        MutableStateFlow MutableStateFlow26 = StateFlowKt.MutableStateFlow(new jb1(str, null == true ? 1 : 0, null == true ? 1 : 0, 7));
        this.j0 = MutableStateFlow26;
        this.k0 = FlowKt.asStateFlow(MutableStateFlow26);
        MutableStateFlow MutableStateFlow27 = StateFlowKt.MutableStateFlow(new aa0((jb2) null, (String) null, (kb2) null, (String) null, 31));
        this.l0 = MutableStateFlow27;
        this.m0 = FlowKt.asStateFlow(MutableStateFlow27);
    }

    public static final String a(va0 va0Var, jb2 jb2Var, int i, int i2) {
        String str;
        if (i2 <= 0) {
            return "正在同步";
        }
        int i3 = ga0.$EnumSwitchMapping$0[jb2Var.ordinal()];
        if (i3 == 1) {
            str = "正在上传到 Trakt";
        } else {
            if (i3 != 2) {
                qu.f();
                return null;
            }
            str = "正在写入服务器";
        }
        return str + " " + i + "/" + i2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0128  */
    /* JADX WARN: Code duplicated, block: B:55:0x0130  */
    /* JADX WARN: Code duplicated, block: B:57:0x0136  */
    /* JADX WARN: Code duplicated, block: B:60:0x013b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0143  */
    /* JADX WARN: Code duplicated, block: B:65:0x014e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0151  */
    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:71:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0128 -> B:53:0x012a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.va0 r20, java.lang.String r21, java.lang.String r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va0.b(va0, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0139  */
    /* JADX WARN: Code duplicated, block: B:50:0x0141  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0109, code lost:
    
        if (r10.j(r11, r12, r0, r1) == r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017b, code lost:
    
        if (r10.j(r6, r4, r0, r1) == r2) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.va0 r10, java.lang.String r11, java.lang.String r12, boolean r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va0.c(va0, java.lang.String, java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void d(va0 va0Var, MediaItem mediaItem) {
        MutableStateFlow mutableStateFlow = va0Var.W;
        m82 m82VarV = tl0.V(mediaItem);
        if (m82VarV == null) {
            String id = mediaItem.getId();
            String type = mediaItem.getType();
            String seriesId = mediaItem.getSeriesId();
            StringBuilder sbZ = kb0.z("详情页 Logo 不可用: itemId=", id, ", type=", type, ", seriesId=");
            sbZ.append(seriesId);
            Log.d("DetailViewModel", sbZ.toString());
            va0Var.Y++;
            va0Var.Z = null;
            mutableStateFlow.setValue(new y90(mediaItem.getId()));
            return;
        }
        String str = m82VarV.b;
        String str2 = m82VarV.a;
        String str3 = mediaItem.getId() + "|" + str2 + "|" + (str == null ? "" : str);
        z90 z90Var = (z90) mutableStateFlow.getValue();
        if (Intrinsics.areEqual(va0Var.Z, str3)) {
            if (z90Var instanceof x90) {
                if (Intrinsics.areEqual(((x90) z90Var).a, mediaItem.getId())) {
                    return;
                }
            } else if (z90Var instanceof v90) {
                if (Intrinsics.areEqual(((v90) z90Var).a, mediaItem.getId())) {
                    return;
                }
            } else if (z90Var instanceof y90) {
                if (Intrinsics.areEqual(((y90) z90Var).a, mediaItem.getId())) {
                    return;
                }
            } else if (!Intrinsics.areEqual(z90Var, w90.a)) {
                qu.f();
                return;
            }
        }
        long j = 1 + va0Var.Y;
        va0Var.Y = j;
        va0Var.Z = str3;
        String id2 = mediaItem.getId();
        if (str == null) {
            str = "";
        }
        StringBuilder sbZ2 = kb0.z("开始解析详情页 Logo: itemId=", id2, ", logoItemId=", str2, ", logoTag=");
        sbZ2.append(str);
        sbZ2.append(", requestKey=");
        sbZ2.append(str3);
        Log.d("DetailViewModel", sbZ2.toString());
        mutableStateFlow.setValue(new x90(mediaItem.getId()));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(va0Var), null, null, new uc(va0Var, m82VarV, j, mediaItem, (Continuation) null, 1), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bb A[Catch: Exception -> 0x007c, TryCatch #1 {Exception -> 0x007c, blocks: (B:21:0x0078, B:32:0x00b7, B:34:0x00bb, B:36:0x00db), top: B:56:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00db A[Catch: Exception -> 0x007c, TRY_LEAVE, TryCatch #1 {Exception -> 0x007c, blocks: (B:21:0x0078, B:32:0x00b7, B:34:0x00bb, B:36:0x00db), top: B:56:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0113  */
    /* JADX WARN: Code duplicated, block: B:42:0x011a A[Catch: Exception -> 0x0146, TryCatch #4 {Exception -> 0x0146, blocks: (B:40:0x0114, B:42:0x011a, B:45:0x0149), top: B:62:0x0114 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0149 A[Catch: Exception -> 0x0146, TRY_LEAVE, TryCatch #4 {Exception -> 0x0146, blocks: (B:40:0x0114, B:42:0x011a, B:45:0x0149), top: B:62:0x0114 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00bb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x011a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x0149, please report this as an issue */
    public static final Object e(va0 va0Var, Context context, String str, String str2, boolean z, boolean z2, MediaItem mediaItem, ContinuationImpl continuationImpl) {
        sa0 sa0Var;
        va0 va0Var2;
        boolean z3;
        String str3;
        boolean z4;
        String str4;
        MediaItem mediaItem2;
        Context context2;
        boolean z5;
        ba0 ba0Var;
        Object objM;
        boolean z6;
        Throwable thM8828exceptionOrNullimpl;
        if (continuationImpl instanceof sa0) {
            sa0Var = (sa0) continuationImpl;
            int i = sa0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                sa0Var.k = i - Integer.MIN_VALUE;
                va0Var2 = va0Var;
            } else {
                va0Var2 = va0Var;
                sa0Var = new sa0(va0Var2, continuationImpl);
            }
        } else {
            va0Var2 = va0Var;
            sa0Var = new sa0(va0Var2, continuationImpl);
        }
        sa0 sa0Var2 = sa0Var;
        Object obj = sa0Var2.i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sa0Var2.k;
        if (i2 != 0) {
            if (i2 == 1) {
                z5 = sa0Var2.h;
                z4 = sa0Var2.g;
                mediaItem2 = (MediaItem) sa0Var2.d;
                str3 = sa0Var2.c;
                str4 = (String) sa0Var2.b;
                context2 = (Context) sa0Var2.a;
                try {
                    ResultKt.throwOnFailure(obj);
                    ba0Var = (ba0) obj;
                    if (ba0Var == null) {
                        Log.w("DetailViewModel", "Trakt 单项已看同步跳过: 未找到目标媒体 itemId=" + str3 + " watched=" + z4 + " isSeries=" + z5);
                        return Unit.INSTANCE;
                    }
                    Context applicationContext = context2.getApplicationContext();
                    applicationContext.getClass();
                    xa2 xa2Var = new xa2(applicationContext);
                    MediaItem mediaItem3 = ba0Var.a;
                    MediaItem mediaItem4 = ba0Var.b;
                    sa0Var2.a = null;
                    sa0Var2.b = null;
                    sa0Var2.c = str3;
                    sa0Var2.d = null;
                    sa0Var2.e = null;
                    sa0Var2.g = z4;
                    sa0Var2.h = z5;
                    sa0Var2.k = 2;
                    objM = xa2Var.M(mediaItem3, z4, mediaItem4, sa0Var2);
                    if (objM != coroutine_suspended) {
                        z6 = z4;
                        thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM);
                        if (thM8828exceptionOrNullimpl == null) {
                            kb2 kb2Var = (kb2) objM;
                            Log.d("DetailViewModel", "Trakt 单项已看同步完成: itemId=" + str3 + " watched=" + z6 + " synced=" + kb2Var.d + " notFound=" + kb2Var.f);
                        } else {
                            Log.w("DetailViewModel", "Trakt 单项已看同步失败: itemId=" + str3 + " watched=" + z6 + " message=" + thM8828exceptionOrNullimpl.getMessage());
                        }
                    }
                    return coroutine_suspended;
                } catch (Exception e) {
                    e = e;
                }
            } else {
                if (i2 != 2) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z6 = sa0Var2.g;
                String str5 = sa0Var2.c;
                try {
                    ResultKt.throwOnFailure(obj);
                    objM = ((Result) obj).getValue();
                    str3 = str5;
                    try {
                        thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM);
                        if (thM8828exceptionOrNullimpl == null) {
                            kb2 kb2Var2 = (kb2) objM;
                            Log.d("DetailViewModel", "Trakt 单项已看同步完成: itemId=" + str3 + " watched=" + z6 + " synced=" + kb2Var2.d + " notFound=" + kb2Var2.f);
                        } else {
                            Log.w("DetailViewModel", "Trakt 单项已看同步失败: itemId=" + str3 + " watched=" + z6 + " message=" + thM8828exceptionOrNullimpl.getMessage());
                        }
                    } catch (Exception e2) {
                        e = e2;
                        z4 = z6;
                        Log.e("DetailViewModel", "Trakt 单项已看同步异常: itemId=" + str3 + " watched=" + z4, e);
                    }
                } catch (Exception e3) {
                    e = e3;
                    z4 = z6;
                    str3 = str5;
                }
            }
            Log.e("DetailViewModel", "Trakt 单项已看同步异常: itemId=" + str3 + " watched=" + z4, e);
        } else {
            ResultKt.throwOnFailure(obj);
            try {
                sa0Var2.a = context;
                sa0Var2.b = null;
                sa0Var2.c = str2;
                sa0Var2.d = null;
                z3 = z;
                try {
                    sa0Var2.g = z3;
                    sa0Var2.h = z2;
                    sa0Var2.k = 1;
                    Object objS = va0Var2.s(str, str2, z2, mediaItem, sa0Var2);
                    if (objS != coroutine_suspended) {
                        str4 = str;
                        str3 = str2;
                        mediaItem2 = mediaItem;
                        z4 = z3;
                        context2 = context;
                        obj = objS;
                        z5 = z2;
                        ba0Var = (ba0) obj;
                        if (ba0Var == null) {
                            Log.w("DetailViewModel", "Trakt 单项已看同步跳过: 未找到目标媒体 itemId=" + str3 + " watched=" + z4 + " isSeries=" + z5);
                            return Unit.INSTANCE;
                        }
                        Context applicationContext2 = context2.getApplicationContext();
                        applicationContext2.getClass();
                        xa2 xa2Var2 = new xa2(applicationContext2);
                        MediaItem mediaItem5 = ba0Var.a;
                        MediaItem mediaItem6 = ba0Var.b;
                        sa0Var2.a = null;
                        sa0Var2.b = null;
                        sa0Var2.c = str3;
                        sa0Var2.d = null;
                        sa0Var2.e = null;
                        sa0Var2.g = z4;
                        sa0Var2.h = z5;
                        sa0Var2.k = 2;
                        objM = xa2Var2.M(mediaItem5, z4, mediaItem6, sa0Var2);
                        if (objM != coroutine_suspended) {
                            z6 = z4;
                            thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM);
                            if (thM8828exceptionOrNullimpl == null) {
                                kb2 kb2Var3 = (kb2) objM;
                                Log.d("DetailViewModel", "Trakt 单项已看同步完成: itemId=" + str3 + " watched=" + z6 + " synced=" + kb2Var3.d + " notFound=" + kb2Var3.f);
                            } else {
                                Log.w("DetailViewModel", "Trakt 单项已看同步失败: itemId=" + str3 + " watched=" + z6 + " message=" + thM8828exceptionOrNullimpl.getMessage());
                            }
                        }
                    }
                    return coroutine_suspended;
                } catch (Exception e4) {
                    e = e4;
                    str3 = str2;
                    z4 = z3;
                }
            } catch (Exception e5) {
                e = e5;
                z3 = z;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static MediaItem t(MediaItem mediaItem) {
        List<PersonInfo> people = mediaItem.getPeople();
        Object arrayList = 0;
        if (people == null) {
            people = null;
        } else if (people.size() > 1) {
            HashSet hashSet = new HashSet(people.size());
            ArrayList arrayList2 = new ArrayList(people.size());
            for (Object obj : people) {
                PersonInfo personInfo = (PersonInfo) obj;
                personInfo.getClass();
                if (hashSet.add(personInfo.getId())) {
                    arrayList2.add(obj);
                }
            }
            people = arrayList2;
        }
        List<MediaSource> mediaSources = mediaItem.getMediaSources();
        if (mediaSources != null) {
            if (mediaSources.size() <= 1) {
                arrayList = mediaSources;
            } else {
                HashSet hashSet2 = new HashSet(mediaSources.size());
                arrayList = new ArrayList(mediaSources.size());
                for (Object obj2 : mediaSources) {
                    MediaSource mediaSource = (MediaSource) obj2;
                    mediaSource.getClass();
                    if (hashSet2.add(mediaSource.getId())) {
                        arrayList.add(obj2);
                    }
                }
            }
        }
        if (Intrinsics.areEqual(people, mediaItem.getPeople()) && Intrinsics.areEqual((Object) arrayList, mediaItem.getMediaSources())) {
            return mediaItem;
        }
        return MediaItem.copy$default(mediaItem, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, people, null, 1610579967, null);
    }

    public static List u(List list) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(t((MediaItem) it.next()));
        }
        if (arrayList.size() <= 1) {
            return arrayList;
        }
        HashSet hashSet = new HashSet(arrayList.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            MediaItem mediaItem = (MediaItem) obj;
            mediaItem.getClass();
            if (hashSet.add(mediaItem.getId())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static List v(List list) {
        if (list.size() <= 1) {
            return list;
        }
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            MediaSource mediaSource = (MediaSource) obj;
            mediaSource.getClass();
            if (hashSet.add(mediaSource.getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List w(List list) {
        if (list.size() <= 1) {
            return list;
        }
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            PersonInfo personInfo = (PersonInfo) obj;
            personInfo.getClass();
            if (hashSet.add(personInfo.getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A(String str, r40 r40Var) {
        Integer num = r40Var.b;
        Integer num2 = r40Var.c;
        MutableStateFlow mutableStateFlow = this.S;
        mutableStateFlow.setValue((num == null && num2 == null) ? MapsKt__MapsKt.minus((Map<? extends String, ? extends V>) mutableStateFlow.getValue(), str) : MapsKt.plus((Map) mutableStateFlow.getValue(), TuplesKt.to(str, new r40(str, num, num2))));
    }

    public final void f() {
        boolean z;
        String str = this.e0;
        if (str == null || this.g0 || (z = this.f0) || z) {
            return;
        }
        this.f0 = true;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ha0(this, str, null, 3), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x025b A[Catch: Exception -> 0x0111, TryCatch #1 {Exception -> 0x0111, blocks: (B:98:0x023b, B:100:0x0241, B:103:0x0249, B:105:0x024d, B:106:0x0251, B:107:0x0255, B:109:0x025b, B:111:0x0269, B:117:0x0278, B:119:0x027e, B:123:0x0289, B:92:0x01f9, B:94:0x01ff, B:126:0x02b5, B:128:0x02cf, B:68:0x0160, B:70:0x0166, B:74:0x0170, B:76:0x0174, B:78:0x01a6, B:80:0x01ac, B:81:0x01b0, B:83:0x01b6, B:87:0x01ca, B:89:0x01ce, B:91:0x01e8, B:51:0x0103, B:58:0x0118, B:60:0x011c, B:64:0x0144), top: B:133:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0269 A[Catch: Exception -> 0x0111, TryCatch #1 {Exception -> 0x0111, blocks: (B:98:0x023b, B:100:0x0241, B:103:0x0249, B:105:0x024d, B:106:0x0251, B:107:0x0255, B:109:0x025b, B:111:0x0269, B:117:0x0278, B:119:0x027e, B:123:0x0289, B:92:0x01f9, B:94:0x01ff, B:126:0x02b5, B:128:0x02cf, B:68:0x0160, B:70:0x0166, B:74:0x0170, B:76:0x0174, B:78:0x01a6, B:80:0x01ac, B:81:0x01b0, B:83:0x01b6, B:87:0x01ca, B:89:0x01ce, B:91:0x01e8, B:51:0x0103, B:58:0x0118, B:60:0x011c, B:64:0x0144), top: B:133:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x026e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0274  */
    /* JADX WARN: Code duplicated, block: B:117:0x0278 A[Catch: Exception -> 0x0111, TryCatch #1 {Exception -> 0x0111, blocks: (B:98:0x023b, B:100:0x0241, B:103:0x0249, B:105:0x024d, B:106:0x0251, B:107:0x0255, B:109:0x025b, B:111:0x0269, B:117:0x0278, B:119:0x027e, B:123:0x0289, B:92:0x01f9, B:94:0x01ff, B:126:0x02b5, B:128:0x02cf, B:68:0x0160, B:70:0x0166, B:74:0x0170, B:76:0x0174, B:78:0x01a6, B:80:0x01ac, B:81:0x01b0, B:83:0x01b6, B:87:0x01ca, B:89:0x01ce, B:91:0x01e8, B:51:0x0103, B:58:0x0118, B:60:0x011c, B:64:0x0144), top: B:133:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0283  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[LOOP:0: B:107:0x0255->B:137:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0236 -> B:98:0x023b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:136:0x0289
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(java.lang.String r22, java.lang.String r23, java.util.List r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va0.g(java.lang.String, java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean h(String str) {
        Object value = this.g.getValue();
        ea0 ea0Var = value instanceof ea0 ? (ea0) value : null;
        if (ea0Var == null) {
            return false;
        }
        MediaItem mediaItem = ea0Var.a;
        return Intrinsics.areEqual(mediaItem.getId(), str) && !Intrinsics.areEqual(mediaItem.getType(), "Series");
    }

    public final boolean i() {
        Object value = this.g.getValue();
        ea0 ea0Var = value instanceof ea0 ? (ea0) value : null;
        if (ea0Var != null) {
            return Intrinsics.areEqual(ea0Var.a.getType(), "Series");
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object j(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        ka0 ka0Var;
        Object objI;
        if (continuationImpl instanceof ka0) {
            ka0Var = (ka0) continuationImpl;
            int i = ka0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ka0Var.g = i - Integer.MIN_VALUE;
            } else {
                ka0Var = new ka0(this, continuationImpl);
            }
        } else {
            ka0Var = new ka0(this, continuationImpl);
        }
        ka0 ka0Var2 = ka0Var;
        Object obj = ka0Var2.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ka0Var2.g;
        MutableStateFlow mutableStateFlow = this.q;
        MutableStateFlow mutableStateFlow2 = this.o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            String str4 = ((wg0) mutableStateFlow2.getValue()).a;
            String str5 = ((Boolean) mutableStateFlow.getValue()).booleanValue() ? "Descending" : "Ascending";
            ka0Var2.a = null;
            ka0Var2.b = null;
            ka0Var2.c = null;
            ka0Var2.g = 1;
            objI = this.a.i(str, str2, str3, str4, str5, ka0Var2);
            if (objI == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            objI = ((Result) obj).getValue();
        }
        if (Result.m8832isSuccessimpl(objI)) {
            List listEmptyList = (List) (false ? null : objI);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            List listU = u(listEmptyList);
            if (mutableStateFlow2.getValue() == wg0.TITLE) {
                boolean zBooleanValue = ((Boolean) mutableStateFlow.getValue()).booleanValue();
                listU = CollectionsKt.sortedWith(listU, new z9(3));
                if (zBooleanValue) {
                    listU = CollectionsKt.reversed(listU);
                }
            }
            this.m.setValue(listU);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(String str, boolean z) {
        str.getClass();
        MutableStateFlow mutableStateFlow = this.g;
        Object value = mutableStateFlow.getValue();
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        ea0 ea0Var = value instanceof ea0 ? (ea0) value : null;
        if (ea0Var == null || !Intrinsics.areEqual(ea0Var.a.getId(), str)) {
            ea0Var = null;
        }
        boolean z2 = z && ea0Var != null;
        if (!z2) {
            mutableStateFlow.setValue(da0.a);
            this.a0.setValue(CollectionsKt.emptyList());
            this.h0.setValue(CollectionsKt.emptyList());
            this.c0.setValue(CollectionsKt.emptyList());
            this.e0 = null;
            this.f0 = false;
            this.g0 = false;
            this.S.setValue(MapsKt.emptyMap());
            this.Y++;
            this.Z = null;
            this.W.setValue(w90.a);
            this.f = null;
            this.j0.setValue(new jb1(str2, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 7));
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new h90(this, str, z2, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:97:0x0056 A[SYNTHETIC] */
    public final r40 l(String str, Integer num, Integer num2) {
        Iterator it;
        Object next;
        MediaItem mediaItem;
        Object next2;
        MediaSource mediaSource;
        if (!i()) {
            return new r40(str, 6);
        }
        if (i()) {
            List<MediaSource> listEmptyList = (List) ((Map) this.U.getValue()).get(str);
            if (listEmptyList == null) {
                it = ((Iterable) this.m.getValue()).iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((MediaItem) next).getId(), str));
                mediaItem = (MediaItem) next;
                if (mediaItem != null) {
                    listEmptyList = mediaItem.getMediaSources();
                } else {
                    listEmptyList = null;
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } else {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = null;
                }
                if (listEmptyList == null) {
                    it = ((Iterable) this.m.getValue()).iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((MediaItem) next).getId(), str));
                    mediaItem = (MediaItem) next;
                    if (mediaItem != null) {
                        listEmptyList = mediaItem.getMediaSources();
                    } else {
                        listEmptyList = null;
                    }
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                }
            }
            String str2 = (String) ((Map) this.O.getValue()).get(str);
            Iterator<T> it2 = listEmptyList.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!Intrinsics.areEqual(((MediaSource) next2).getId(), str2));
            mediaSource = (MediaSource) next2;
            if (mediaSource == null) {
                mediaSource = (MediaSource) CollectionsKt.firstOrNull((List) listEmptyList);
            }
        } else {
            mediaSource = null;
        }
        List<MediaStream> mediaStreams = mediaSource != null ? mediaSource.getMediaStreams() : null;
        if (mediaStreams == null) {
            mediaStreams = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : mediaStreams) {
            if (Intrinsics.areEqual(((MediaStream) obj).getType(), "Audio")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add(Integer.valueOf(((MediaStream) obj2).getIndex()));
        }
        Set set = CollectionsKt.toSet(arrayList2);
        List<MediaStream> mediaStreams2 = mediaSource != null ? mediaSource.getMediaStreams() : null;
        if (mediaStreams2 == null) {
            mediaStreams2 = CollectionsKt.emptyList();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : mediaStreams2) {
            if (Intrinsics.areEqual(((MediaStream) obj3).getType(), "Subtitle")) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj4 = arrayList3.get(i);
            i++;
            arrayList4.add(Integer.valueOf(((MediaStream) obj4).getIndex()));
        }
        Set set2 = CollectionsKt.toSet(arrayList4);
        if (num == null || !set.contains(Integer.valueOf(num.intValue()))) {
            num = null;
        }
        if (num2 == null || !set2.contains(Integer.valueOf(num2.intValue()))) {
            num2 = null;
        }
        return new r40(str, num, num2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    public final r40 m(String str, Integer num, Integer num2) {
        MediaSource mediaSource;
        Object next;
        if (!h(str)) {
            return new r40(null, 7);
        }
        Object value = this.g.getValue();
        ea0 ea0Var = value instanceof ea0 ? (ea0) value : null;
        if (ea0Var != null) {
            MediaItem mediaItem = ea0Var.a;
            if (!Intrinsics.areEqual(mediaItem.getId(), str) || Intrinsics.areEqual(mediaItem.getType(), "Series")) {
                mediaSource = null;
            } else {
                List<MediaSource> mediaSources = mediaItem.getMediaSources();
                if (mediaSources == null) {
                    mediaSources = CollectionsKt.emptyList();
                }
                String str2 = (String) ((Map) this.O.getValue()).get(str);
                Iterator<T> it = mediaSources.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((MediaSource) next).getId(), str2));
                mediaSource = (MediaSource) next;
                if (mediaSource == null) {
                    mediaSource = (MediaSource) CollectionsKt.firstOrNull((List) mediaSources);
                }
            }
        } else {
            mediaSource = null;
        }
        List<MediaStream> mediaStreams = mediaSource != null ? mediaSource.getMediaStreams() : null;
        if (mediaStreams == null) {
            mediaStreams = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : mediaStreams) {
            if (Intrinsics.areEqual(((MediaStream) obj).getType(), "Audio")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add(Integer.valueOf(((MediaStream) obj2).getIndex()));
        }
        Set set = CollectionsKt.toSet(arrayList2);
        List<MediaStream> mediaStreams2 = mediaSource != null ? mediaSource.getMediaStreams() : null;
        if (mediaStreams2 == null) {
            mediaStreams2 = CollectionsKt.emptyList();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : mediaStreams2) {
            if (Intrinsics.areEqual(((MediaStream) obj3).getType(), "Subtitle")) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj4 = arrayList3.get(i);
            i++;
            arrayList4.add(Integer.valueOf(((MediaStream) obj4).getIndex()));
        }
        Set set2 = CollectionsKt.toSet(arrayList4);
        if (num == null || !set.contains(Integer.valueOf(num.intValue()))) {
            num = null;
        }
        if (num2 == null || !set2.contains(Integer.valueOf(num2.intValue()))) {
            num2 = null;
        }
        return new r40(str, num, num2);
    }

    public final void n(String str, s40 s40Var) {
        str.getClass();
        this.y.setValue(s40Var);
        this.A.setValue(null);
        this.s.setValue(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(ea0 ea0Var, ContinuationImpl continuationImpl) {
        na0 na0Var;
        Object objL;
        if (continuationImpl instanceof na0) {
            na0Var = (na0) continuationImpl;
            int i = na0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                na0Var.e = i - Integer.MIN_VALUE;
            } else {
                na0Var = new na0(this, continuationImpl);
            }
        } else {
            na0Var = new na0(this, continuationImpl);
        }
        Object obj = na0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = na0Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            String userId = this.d;
            if (userId == null) {
                userId = RetrofitClient.INSTANCE.getUserId();
            }
            this.d = userId;
            String id = ea0Var.a.getId();
            na0Var.a = ea0Var;
            na0Var.b = null;
            na0Var.e = 1;
            objL = this.a.l(userId, id, na0Var);
            if (objL == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ea0Var = na0Var.a;
            ResultKt.throwOnFailure(obj);
            objL = ((Result) obj).getValue();
        }
        if (Result.m8832isSuccessimpl(objL)) {
            if (false) {
                objL = null;
            }
            MediaItem mediaItem = (MediaItem) objL;
            if (mediaItem == null) {
                return Unit.INSTANCE;
            }
            MediaItem mediaItemT = t(mediaItem);
            this.c = null;
            ea0Var.getClass();
            mediaItemT.getClass();
            this.g.setValue(new ea0(mediaItemT));
            z(mediaItemT.getId());
        } else {
            Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objL);
            Boxing.boxInt(Log.e("DetailViewModel", "刷新电影播放进度失败: " + (thM8828exceptionOrNullimpl != null ? thM8828exceptionOrNullimpl.getMessage() : null)));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (o(r3, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.oa0
            if (r0 == 0) goto L13
            r0 = r7
            oa0 r0 = (defpackage.oa0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            oa0 r0 = new oa0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L30
            if (r2 != r4) goto L2a
            goto L30
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.rd1.o(r6)
            return r3
        L30:
            java.lang.Object r6 = r0.a
            ea0 r6 = (defpackage.ea0) r6
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L79
            goto L86
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.flow.MutableStateFlow r7 = r6.g     // Catch: java.lang.Exception -> L79
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Exception -> L79
            boolean r2 = r7 instanceof defpackage.ea0     // Catch: java.lang.Exception -> L79
            if (r2 == 0) goto L48
            r3 = r7
            ea0 r3 = (defpackage.ea0) r3     // Catch: java.lang.Exception -> L79
        L48:
            if (r3 != 0) goto L4d
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L79
            return r6
        L4d:
            com.dh.myembyapp.data.model.MediaItem r7 = r3.a     // Catch: java.lang.Exception -> L79
            java.lang.String r7 = r7.getType()     // Catch: java.lang.Exception -> L79
            java.lang.String r2 = "Series"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r2)     // Catch: java.lang.Exception -> L79
            if (r7 == 0) goto L6a
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.null     // Catch: java.lang.Exception -> L79
            r0.a = r7     // Catch: java.lang.Exception -> L79
            r0.d = r5     // Catch: java.lang.Exception -> L79
            java.lang.Object r6 = r6.q(r0)     // Catch: java.lang.Exception -> L79
            if (r6 != r1) goto L86
            goto L78
        L6a:
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.null     // Catch: java.lang.Exception -> L79
            r0.a = r7     // Catch: java.lang.Exception -> L79
            r0.d = r4     // Catch: java.lang.Exception -> L79
            java.lang.Object r6 = r6.o(r3, r0)     // Catch: java.lang.Exception -> L79
            if (r6 != r1) goto L86
        L78:
            return r1
        L79:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()
            java.lang.String r0 = "返回详情页后刷新播放进度失败: "
            java.lang.String r1 = "DetailViewModel"
            defpackage.kb0.G(r0, r7, r1, r6)
        L86:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va0.p(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        if (r10 == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va0.q(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(String str, MediaItem mediaItem, MediaItem mediaItem2, ContinuationImpl continuationImpl) {
        qa0 qa0Var;
        Object objL;
        if (continuationImpl instanceof qa0) {
            qa0Var = (qa0) continuationImpl;
            int i = qa0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                qa0Var.h = i - Integer.MIN_VALUE;
            } else {
                qa0Var = new qa0(this, continuationImpl);
            }
        } else {
            qa0Var = new qa0(this, continuationImpl);
        }
        Object obj = qa0Var.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = qa0Var.h;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (mediaItem2 != null) {
                MediaItem mediaItem3 = Intrinsics.areEqual(mediaItem2.getType(), "Series") ? mediaItem2 : null;
                if (mediaItem3 != null) {
                    return mediaItem3;
                }
            }
            String seriesId = mediaItem.getSeriesId();
            if (seriesId != null) {
                if (StringsKt.isBlank(seriesId)) {
                    seriesId = null;
                }
                if (seriesId != null) {
                    qa0Var.a = null;
                    qa0Var.b = null;
                    qa0Var.c = null;
                    qa0Var.d = null;
                    qa0Var.h = 1;
                    objL = this.a.l(str, seriesId, qa0Var);
                    if (objL == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return null;
        }
        if (i2 != 1) {
            rd1.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.throwOnFailure(obj);
        objL = ((Result) obj).getValue();
        if (false) {
            objL = null;
        }
        MediaItem mediaItem4 = (MediaItem) objL;
        if (mediaItem4 != null) {
            return t(mediaItem4);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:49:0x011b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0128  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r14 == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0169, code lost:
    
        if (r14 == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017d, code lost:
    
        if (r14 == null) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r10, java.lang.String r11, boolean r12, com.dh.myembyapp.data.model.MediaItem r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va0.s(java.lang.String, java.lang.String, boolean, com.dh.myembyapp.data.model.MediaItem, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void x(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        MutableStateFlow mutableStateFlow = this.O;
        mutableStateFlow.setValue(MapsKt.plus((Map) mutableStateFlow.getValue(), TuplesKt.to(str, str2)));
        Log.d("DetailViewModel", "记住版本选择: episodeId=" + str + ", mediaSourceId=" + str2);
        if (!z) {
            z(str);
            y(str);
            return;
        }
        if (h(str)) {
            this.Q.setValue(new r40(str, 6));
        }
        if (i()) {
            MutableStateFlow mutableStateFlow2 = this.S;
            mutableStateFlow2.setValue(MapsKt__MapsKt.minus((Map<? extends String, ? extends V>) mutableStateFlow2.getValue(), str));
        }
    }

    public final void y(String str) {
        boolean zI = i();
        MutableStateFlow mutableStateFlow = this.S;
        if (!zI) {
            mutableStateFlow.setValue(MapsKt__MapsKt.minus((Map<? extends String, ? extends V>) mutableStateFlow.getValue(), str));
            return;
        }
        r40 r40Var = (r40) ((Map) mutableStateFlow.getValue()).get(str);
        if (r40Var == null) {
            return;
        }
        A(str, l(str, r40Var.b, r40Var.c));
    }

    public final void z(String str) {
        boolean zH = h(str);
        MutableStateFlow mutableStateFlow = this.Q;
        if (!zH) {
            mutableStateFlow.setValue(new r40(null, 7));
            return;
        }
        Object value = mutableStateFlow.getValue();
        r40 r40Var = (r40) (Intrinsics.areEqual(((r40) value).a, str) ? value : null);
        if (r40Var == null) {
            r40Var = new r40(str, 6);
        }
        mutableStateFlow.setValue(m(str, r40Var.b, r40Var.c));
    }
}
