package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.UserDataRequest;
import com.dh.myembyapp.data.model.QueryResult;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
public final class uf0 {
    public static String A(String str) {
        String string;
        String strReplace$default;
        if (str == null || (string = StringsKt.trim((CharSequence) str).toString()) == null || (strReplace$default = StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null)) == null) {
            return null;
        }
        String lowerCase = strReplace$default.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.length() > 0) {
            return lowerCase;
        }
        return null;
    }

    public static final boolean a(uf0 uf0Var, String str) {
        if (str.length() == 32) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < 'g') || ('A' <= cCharAt && cCharAt < 'G'))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final List b(uf0 uf0Var, QueryResult queryResult, String str) {
        try {
            return queryResult.getItems();
        } catch (NullPointerException e) {
            Log.e("EmbyRepository", str.concat(": 接口返回 Items=null，已按空列表处理"), e);
            return CollectionsKt.emptyList();
        }
    }

    public static final String c(uf0 uf0Var, String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        if (lowerCase == null) {
            return "Series,Movie,Video,MusicVideo,MusicAlbum";
        }
        switch (lowerCase.hashCode()) {
            case -2056947267:
                return !lowerCase.equals("musicvideos") ? "Series,Movie,Video,MusicVideo,MusicAlbum" : "MusicVideo";
            case -1068259517:
                return !lowerCase.equals("movies") ? "Series,Movie,Video,MusicVideo,MusicAlbum" : "Movie,Video";
            case -936101932:
                return !lowerCase.equals("tvshows") ? "Series,Movie,Video,MusicVideo,MusicAlbum" : "Series";
            case 73232540:
                return !lowerCase.equals("boxsets") ? "Series,Movie,Video,MusicVideo,MusicAlbum" : "BoxSet";
            case 104263205:
                return !lowerCase.equals("music") ? "Series,Movie,Video,MusicVideo,MusicAlbum" : "MusicAlbum";
            default:
                return "Series,Movie,Video,MusicVideo,MusicAlbum";
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0093  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:35:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x0165 A[Catch: Exception -> 0x0122, CancellationException -> 0x01aa, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x01aa, blocks: (B:12:0x0049, B:33:0x0106, B:36:0x0116, B:38:0x011c, B:42:0x0130, B:44:0x0136, B:45:0x013a, B:47:0x0141, B:48:0x0145, B:50:0x014d, B:51:0x0151, B:26:0x00b1, B:27:0x00bb, B:29:0x00ee, B:52:0x0165), top: B:73:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ae -> B:65:0x01d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00f8 -> B:77:0x0106). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01ac -> B:54:0x0190). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(defpackage.uf0 r28, java.lang.String r29, java.util.List r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf0.d(uf0, java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static String z(String str) {
        return str.length() <= 8 ? "***" : mr.C(StringsKt.take(str, 4), "...", StringsKt.takeLast(str, 4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(String str, List list, ContinuationImpl continuationImpl) {
        df0 df0Var;
        if (continuationImpl instanceof df0) {
            df0Var = (df0) continuationImpl;
            int i = df0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                df0Var.e = i - Integer.MIN_VALUE;
            } else {
                df0Var = new df0(this, continuationImpl);
            }
        } else {
            df0Var = new df0(this, continuationImpl);
        }
        Object objWithContext = df0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = df0Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ef0 ef0Var = new ef0(this, str, list, null);
            df0Var.a = null;
            df0Var.b = null;
            df0Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, ef0Var, df0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object C(String str, String str2, long j, String str3, String str4, Long l, String str5, boolean z, ContinuationImpl continuationImpl) {
        ff0 ff0Var;
        if (continuationImpl instanceof ff0) {
            ff0Var = (ff0) continuationImpl;
            int i = ff0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ff0Var.j = i - Integer.MIN_VALUE;
            } else {
                ff0Var = new ff0(this, continuationImpl);
            }
        } else {
            ff0Var = new ff0(this, continuationImpl);
        }
        Object objWithContext = ff0Var.h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ff0Var.j;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            gf0 gf0Var = new gf0(str2, j, z, str5, str4, str3, l, this, null);
            ff0Var.a = null;
            ff0Var.b = null;
            ff0Var.c = null;
            ff0Var.d = null;
            ff0Var.e = null;
            ff0Var.g = null;
            ff0Var.j = 1;
            objWithContext = BuildersKt.withContext(io2, gf0Var, ff0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object D(String str, String str2, String str3, String str4, String str5, long j, ContinuationImpl continuationImpl) {
        hf0 hf0Var;
        if (continuationImpl instanceof hf0) {
            hf0Var = (hf0) continuationImpl;
            int i = hf0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                hf0Var.i = i - Integer.MIN_VALUE;
            } else {
                hf0Var = new hf0(this, continuationImpl);
            }
        } else {
            hf0Var = new hf0(this, continuationImpl);
        }
        Object objWithContext = hf0Var.g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = hf0Var.i;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            if0 if0Var = new if0(str2, j, str5, str3, str4, this, null);
            hf0Var.a = null;
            hf0Var.b = null;
            hf0Var.c = null;
            hf0Var.d = null;
            hf0Var.e = null;
            hf0Var.i = 1;
            objWithContext = BuildersKt.withContext(io2, if0Var, hf0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object E(String str, String str2, long j, String str3, String str4, Long l, String str5, ContinuationImpl continuationImpl) {
        jf0 jf0Var;
        if (continuationImpl instanceof jf0) {
            jf0Var = (jf0) continuationImpl;
            int i = jf0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                jf0Var.j = i - Integer.MIN_VALUE;
            } else {
                jf0Var = new jf0(this, continuationImpl);
            }
        } else {
            jf0Var = new jf0(this, continuationImpl);
        }
        Object objWithContext = jf0Var.h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = jf0Var.j;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            kf0 kf0Var = new kf0(str2, j, str5, str4, str3, this, null);
            jf0Var.a = null;
            jf0Var.b = null;
            jf0Var.c = null;
            jf0Var.d = null;
            jf0Var.e = null;
            jf0Var.g = null;
            jf0Var.j = 1;
            objWithContext = BuildersKt.withContext(io2, kf0Var, jf0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F(String str, String str2, Integer num, ContinuationImpl continuationImpl) {
        mf0 mf0Var;
        if (continuationImpl instanceof mf0) {
            mf0Var = (mf0) continuationImpl;
            int i = mf0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                mf0Var.g = i - Integer.MIN_VALUE;
            } else {
                mf0Var = new mf0(this, continuationImpl);
            }
        } else {
            mf0Var = new mf0(this, continuationImpl);
        }
        Object objWithContext = mf0Var.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = mf0Var.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            nf0 nf0Var = new nf0(str, str2, num, null);
            mf0Var.a = null;
            mf0Var.b = null;
            mf0Var.c = null;
            mf0Var.g = 1;
            objWithContext = BuildersKt.withContext(io2, nf0Var, mf0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(String str, String str2, ContinuationImpl continuationImpl) {
        of0 of0Var;
        if (continuationImpl instanceof of0) {
            of0Var = (of0) continuationImpl;
            int i = of0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                of0Var.e = i - Integer.MIN_VALUE;
            } else {
                of0Var = new of0(this, continuationImpl);
            }
        } else {
            of0Var = new of0(this, continuationImpl);
        }
        Object objWithContext = of0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = of0Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            pf0 pf0Var = new pf0(this, str, str2, null);
            of0Var.a = null;
            of0Var.b = null;
            of0Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, pf0Var, of0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H(String str, List list, ContinuationImpl continuationImpl) {
        qf0 qf0Var;
        if (continuationImpl instanceof qf0) {
            qf0Var = (qf0) continuationImpl;
            int i = qf0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qf0Var.e = i - Integer.MIN_VALUE;
            } else {
                qf0Var = new qf0(this, continuationImpl);
            }
        } else {
            qf0Var = new qf0(this, continuationImpl);
        }
        Object objWithContext = qf0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = qf0Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            rf0 rf0Var = new rf0(this, str, list, null);
            qf0Var.a = null;
            qf0Var.b = null;
            qf0Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, rf0Var, qf0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(String str, String str2, UserDataRequest userDataRequest, ContinuationImpl continuationImpl) {
        sf0 sf0Var;
        if (continuationImpl instanceof sf0) {
            sf0Var = (sf0) continuationImpl;
            int i = sf0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                sf0Var.g = i - Integer.MIN_VALUE;
            } else {
                sf0Var = new sf0(this, continuationImpl);
            }
        } else {
            sf0Var = new sf0(this, continuationImpl);
        }
        Object objWithContext = sf0Var.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sf0Var.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            tf0 tf0Var = new tf0(this, str, str2, userDataRequest, null);
            sf0Var.a = null;
            sf0Var.b = null;
            sf0Var.c = null;
            sf0Var.g = 1;
            objWithContext = BuildersKt.withContext(io2, tf0Var, sf0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, String str2, ContinuationImpl continuationImpl) {
        pd0 pd0Var;
        if (continuationImpl instanceof pd0) {
            pd0Var = (pd0) continuationImpl;
            int i = pd0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pd0Var.e = i - Integer.MIN_VALUE;
            } else {
                pd0Var = new pd0(this, continuationImpl);
            }
        } else {
            pd0Var = new pd0(this, continuationImpl);
        }
        Object objWithContext = pd0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = pd0Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            qd0 qd0Var = new qd0(this, str, str2, null);
            pd0Var.a = null;
            pd0Var.b = null;
            pd0Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, qd0Var, pd0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, ContinuationImpl continuationImpl) {
        rd0 rd0Var;
        if (continuationImpl instanceof rd0) {
            rd0Var = (rd0) continuationImpl;
            int i = rd0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rd0Var.d = i - Integer.MIN_VALUE;
            } else {
                rd0Var = new rd0(this, continuationImpl);
            }
        } else {
            rd0Var = new rd0(this, continuationImpl);
        }
        Object objWithContext = rd0Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = rd0Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            sd0 sd0Var = new sd0(this, str, null);
            rd0Var.a = null;
            rd0Var.d = 1;
            objWithContext = BuildersKt.withContext(io2, sd0Var, rd0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, String str2, ContinuationImpl continuationImpl) {
        td0 td0Var;
        if (continuationImpl instanceof td0) {
            td0Var = (td0) continuationImpl;
            int i = td0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                td0Var.e = i - Integer.MIN_VALUE;
            } else {
                td0Var = new td0(this, continuationImpl);
            }
        } else {
            td0Var = new td0(this, continuationImpl);
        }
        Object objWithContext = td0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = td0Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ud0 ud0Var = new ud0(this, str, str2, null);
            td0Var.a = null;
            td0Var.b = null;
            td0Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, ud0Var, td0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, String str2, int i, ContinuationImpl continuationImpl) {
        vd0 vd0Var;
        if (continuationImpl instanceof vd0) {
            vd0Var = (vd0) continuationImpl;
            int i2 = vd0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vd0Var.e = i2 - Integer.MIN_VALUE;
            } else {
                vd0Var = new vd0(this, continuationImpl);
            }
        } else {
            vd0Var = new vd0(this, continuationImpl);
        }
        Object objWithContext = vd0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = vd0Var.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            wd0 wd0Var = new wd0(this, str, str2, i, null);
            vd0Var.a = null;
            vd0Var.b = null;
            vd0Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, wd0Var, vd0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object i(String str, String str2, String str3, String str4, String str5, ContinuationImpl continuationImpl) {
        xd0 xd0Var;
        if (continuationImpl instanceof xd0) {
            xd0Var = (xd0) continuationImpl;
            int i = xd0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                xd0Var.i = i - Integer.MIN_VALUE;
            } else {
                xd0Var = new xd0(this, continuationImpl);
            }
        } else {
            xd0Var = new xd0(this, continuationImpl);
        }
        Object objWithContext = xd0Var.g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = xd0Var.i;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            yd0 yd0Var = new yd0(this, str2, str, str3, str4, str5, null);
            xd0Var.a = null;
            xd0Var.b = null;
            xd0Var.c = null;
            xd0Var.d = null;
            xd0Var.e = null;
            xd0Var.i = 1;
            objWithContext = BuildersKt.withContext(io2, yd0Var, xd0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object j(String str, String str2, String str3, int i, int i2, boolean z, ContinuationImpl continuationImpl) {
        zd0 zd0Var;
        if (continuationImpl instanceof zd0) {
            zd0Var = (zd0) continuationImpl;
            int i3 = zd0Var.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zd0Var.g = i3 - Integer.MIN_VALUE;
            } else {
                zd0Var = new zd0(this, continuationImpl);
            }
        } else {
            zd0Var = new zd0(this, continuationImpl);
        }
        Object objWithContext = zd0Var.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = zd0Var.g;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ae0 ae0Var = new ae0(this, str3, z, str, str2, i, i2, null);
            zd0Var.a = null;
            zd0Var.b = null;
            zd0Var.c = null;
            zd0Var.g = 1;
            objWithContext = BuildersKt.withContext(io2, ae0Var, zd0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(ContinuationImpl continuationImpl) {
        be0 be0Var;
        if (continuationImpl instanceof be0) {
            be0Var = (be0) continuationImpl;
            int i = be0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                be0Var.c = i - Integer.MIN_VALUE;
            } else {
                be0Var = new be0(this, continuationImpl);
            }
        } else {
            be0Var = new be0(this, continuationImpl);
        }
        Object objWithContext = be0Var.a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = be0Var.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ce0 ce0Var = new ce0(this, null);
            be0Var.c = 1;
            objWithContext = BuildersKt.withContext(io2, ce0Var, be0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, String str2, ContinuationImpl continuationImpl) {
        de0 de0Var;
        if (continuationImpl instanceof de0) {
            de0Var = (de0) continuationImpl;
            int i = de0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                de0Var.e = i - Integer.MIN_VALUE;
            } else {
                de0Var = new de0(this, continuationImpl);
            }
        } else {
            de0Var = new de0(this, continuationImpl);
        }
        Object objWithContext = de0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = de0Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ee0 ee0Var = new ee0(this, str, str2, null);
            de0Var.a = null;
            de0Var.b = null;
            de0Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, ee0Var, de0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object m(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, int i2, ContinuationImpl continuationImpl) {
        fe0 fe0Var;
        uf0 uf0Var;
        if (continuationImpl instanceof fe0) {
            fe0Var = (fe0) continuationImpl;
            int i3 = fe0Var.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fe0Var.j = i3 - Integer.MIN_VALUE;
                uf0Var = this;
            } else {
                uf0Var = this;
                fe0Var = new fe0(uf0Var, continuationImpl);
            }
        } else {
            uf0Var = this;
            fe0Var = new fe0(uf0Var, continuationImpl);
        }
        Object objWithContext = fe0Var.h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = fe0Var.j;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ge0 ge0Var = new ge0(str2, i2, i, z, str3, str4, str5, str6, uf0Var, str, null);
            fe0Var.a = null;
            fe0Var.b = null;
            fe0Var.c = null;
            fe0Var.d = null;
            fe0Var.e = null;
            fe0Var.g = null;
            fe0Var.j = 1;
            objWithContext = BuildersKt.withContext(io2, ge0Var, fe0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object n(String str, String str2, String str3, String str4, String str5, String str6, String str7, ContinuationImpl continuationImpl) {
        he0 he0Var;
        if (continuationImpl instanceof he0) {
            he0Var = (he0) continuationImpl;
            int i = he0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                he0Var.k = i - Integer.MIN_VALUE;
            } else {
                he0Var = new he0(this, continuationImpl);
            }
        } else {
            he0Var = new he0(this, continuationImpl);
        }
        Object objWithContext = he0Var.i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = he0Var.k;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ie0 ie0Var = new ie0(this, str, str2, str4, str5, str6, str3, str7, null);
            he0Var.a = null;
            he0Var.b = null;
            he0Var.c = null;
            he0Var.d = null;
            he0Var.e = null;
            he0Var.g = null;
            he0Var.h = null;
            he0Var.k = 1;
            objWithContext = BuildersKt.withContext(io2, ie0Var, he0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(String str, String str2, ContinuationImpl continuationImpl) {
        je0 je0Var;
        if (continuationImpl instanceof je0) {
            je0Var = (je0) continuationImpl;
            int i = je0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                je0Var.e = i - Integer.MIN_VALUE;
            } else {
                je0Var = new je0(this, continuationImpl);
            }
        } else {
            je0Var = new je0(this, continuationImpl);
        }
        Object objWithContext = je0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = je0Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ke0 ke0Var = new ke0(this, str, str2, null);
            je0Var.a = null;
            je0Var.b = null;
            je0Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, ke0Var, je0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(String str, ContinuationImpl continuationImpl) {
        le0 le0Var;
        if (continuationImpl instanceof le0) {
            le0Var = (le0) continuationImpl;
            int i = le0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                le0Var.d = i - Integer.MIN_VALUE;
            } else {
                le0Var = new le0(this, continuationImpl);
            }
        } else {
            le0Var = new le0(this, continuationImpl);
        }
        Object objWithContext = le0Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = le0Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            me0 me0Var = new me0(this, str, null);
            le0Var.a = null;
            le0Var.d = 1;
            objWithContext = BuildersKt.withContext(io2, me0Var, le0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object q(String str, String str2, boolean z, Long l, String str3, Long l2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Boolean bool2, Boolean bool3, ContinuationImpl continuationImpl) {
        ne0 ne0Var;
        uf0 uf0Var;
        if (continuationImpl instanceof ne0) {
            ne0Var = (ne0) continuationImpl;
            int i = ne0Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                ne0Var.q = i - Integer.MIN_VALUE;
                uf0Var = this;
            } else {
                uf0Var = this;
                ne0Var = new ne0(uf0Var, continuationImpl);
            }
        } else {
            uf0Var = this;
            ne0Var = new ne0(uf0Var, continuationImpl);
        }
        Object objWithContext = ne0Var.o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ne0Var.q;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            oe0 oe0Var = new oe0(l2, num, num2, l, num3, num4, str3, num5, bool, bool2, bool3, uf0Var, str2, str, z, null);
            ne0Var.a = null;
            ne0Var.b = null;
            ne0Var.c = null;
            ne0Var.d = null;
            ne0Var.e = null;
            ne0Var.g = null;
            ne0Var.h = null;
            ne0Var.i = null;
            ne0Var.j = null;
            ne0Var.k = null;
            ne0Var.l = null;
            ne0Var.m = null;
            ne0Var.n = null;
            ne0Var.q = 1;
            objWithContext = BuildersKt.withContext(io2, oe0Var, ne0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(String str, ContinuationImpl continuationImpl) {
        pe0 pe0Var;
        if (continuationImpl instanceof pe0) {
            pe0Var = (pe0) continuationImpl;
            int i = pe0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pe0Var.d = i - Integer.MIN_VALUE;
            } else {
                pe0Var = new pe0(this, continuationImpl);
            }
        } else {
            pe0Var = new pe0(this, continuationImpl);
        }
        Object objWithContext = pe0Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = pe0Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            qe0 qe0Var = new qe0(this, str, null);
            pe0Var.a = null;
            pe0Var.d = 1;
            objWithContext = BuildersKt.withContext(io2, qe0Var, pe0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(String str, String str2, ContinuationImpl continuationImpl) {
        re0 re0Var;
        if (continuationImpl instanceof re0) {
            re0Var = (re0) continuationImpl;
            int i = re0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                re0Var.e = i - Integer.MIN_VALUE;
            } else {
                re0Var = new re0(this, continuationImpl);
            }
        } else {
            re0Var = new re0(this, continuationImpl);
        }
        Object objWithContext = re0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = re0Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            se0 se0Var = new se0(this, str2, str, null);
            re0Var.a = null;
            re0Var.b = null;
            re0Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, se0Var, re0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(String str, String str2, int i, ContinuationImpl continuationImpl) {
        te0 te0Var;
        if (continuationImpl instanceof te0) {
            te0Var = (te0) continuationImpl;
            int i2 = te0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                te0Var.e = i2 - Integer.MIN_VALUE;
            } else {
                te0Var = new te0(this, continuationImpl);
            }
        } else {
            te0Var = new te0(this, continuationImpl);
        }
        Object objWithContext = te0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = te0Var.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ue0 ue0Var = new ue0(this, str2, str, i, null);
            te0Var.a = null;
            te0Var.b = null;
            te0Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, ue0Var, te0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(String str, ContinuationImpl continuationImpl) {
        ve0 ve0Var;
        if (continuationImpl instanceof ve0) {
            ve0Var = (ve0) continuationImpl;
            int i = ve0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ve0Var.d = i - Integer.MIN_VALUE;
            } else {
                ve0Var = new ve0(this, continuationImpl);
            }
        } else {
            ve0Var = new ve0(this, continuationImpl);
        }
        Object objWithContext = ve0Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ve0Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            we0 we0Var = new we0(str, null);
            ve0Var.a = null;
            ve0Var.d = 1;
            objWithContext = BuildersKt.withContext(io2, we0Var, ve0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(String str, String str2, ContinuationImpl continuationImpl) {
        xe0 xe0Var;
        if (continuationImpl instanceof xe0) {
            xe0Var = (xe0) continuationImpl;
            int i = xe0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xe0Var.e = i - Integer.MIN_VALUE;
            } else {
                xe0Var = new xe0(this, continuationImpl);
            }
        } else {
            xe0Var = new xe0(this, continuationImpl);
        }
        Object objWithContext = xe0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = xe0Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ye0 ye0Var = new ye0(this, str, str2, null);
            xe0Var.a = null;
            xe0Var.b = null;
            xe0Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, ye0Var, xe0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(String str, String str2, ContinuationImpl continuationImpl) {
        ze0 ze0Var;
        if (continuationImpl instanceof ze0) {
            ze0Var = (ze0) continuationImpl;
            int i = ze0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ze0Var.e = i - Integer.MIN_VALUE;
            } else {
                ze0Var = new ze0(this, continuationImpl);
            }
        } else {
            ze0Var = new ze0(this, continuationImpl);
        }
        Object objWithContext = ze0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ze0Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            af0 af0Var = new af0(this, str, str2, null);
            ze0Var.a = null;
            ze0Var.b = null;
            ze0Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, af0Var, ze0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(String str, String str2, ContinuationImpl continuationImpl) {
        bf0 bf0Var;
        if (continuationImpl instanceof bf0) {
            bf0Var = (bf0) continuationImpl;
            int i = bf0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bf0Var.e = i - Integer.MIN_VALUE;
            } else {
                bf0Var = new bf0(this, continuationImpl);
            }
        } else {
            bf0Var = new bf0(this, continuationImpl);
        }
        Object objWithContext = bf0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bf0Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            cf0 cf0Var = new cf0(this, str, str2, null);
            bf0Var.a = null;
            bf0Var.b = null;
            bf0Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, cf0Var, bf0Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }
}
