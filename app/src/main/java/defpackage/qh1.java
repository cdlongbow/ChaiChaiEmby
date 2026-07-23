package defpackage;

import android.util.Log;
import androidx.media3.exoplayer.ExoPlayer;
import com.dh.myembyapp.data.DecoderSettings;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class qh1 extends SuspendLambda implements Function2 {
    public float a;
    public Object b;
    public String c;
    public int d;
    public final /* synthetic */ tj1 e;
    public final /* synthetic */ int g;
    public final /* synthetic */ ExoPlayer h;
    public final /* synthetic */ float i;
    public final /* synthetic */ h50 j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ uj1 l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ n61 n;
    public final /* synthetic */ di1 o;
    public final /* synthetic */ kh1 p;
    public final /* synthetic */ vh1 q;
    public final /* synthetic */ rj1 r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ a2 t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ vh1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh1(tj1 tj1Var, int i, ExoPlayer exoPlayer, float f, h50 h50Var, Function0 function0, uj1 uj1Var, boolean z, n61 n61Var, di1 di1Var, kh1 kh1Var, vh1 vh1Var, rj1 rj1Var, Function0 function1, a2 a2Var, boolean z2, vh1 vh1Var2, Continuation continuation) {
        super(2, continuation);
        this.e = tj1Var;
        this.g = i;
        this.h = exoPlayer;
        this.i = f;
        this.j = h50Var;
        this.k = function0;
        this.l = uj1Var;
        this.m = z;
        this.n = n61Var;
        this.o = di1Var;
        this.p = kh1Var;
        this.q = vh1Var;
        this.r = rj1Var;
        this.s = function1;
        this.t = a2Var;
        this.u = z2;
        this.v = vh1Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new qh1(this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qh1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01b7 A[Catch: all -> 0x005d, CancellationException -> 0x0067, Exception -> 0x01ce, TRY_LEAVE, TryCatch #1 {Exception -> 0x01ce, blocks: (B:47:0x017c, B:49:0x018e, B:52:0x019b, B:54:0x01b7, B:59:0x01d9, B:61:0x01e1, B:62:0x01f7), top: B:103:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01e1 A[Catch: all -> 0x005d, CancellationException -> 0x0067, Exception -> 0x01ce, TryCatch #1 {Exception -> 0x01ce, blocks: (B:47:0x017c, B:49:0x018e, B:52:0x019b, B:54:0x01b7, B:59:0x01d9, B:61:0x01e1, B:62:0x01f7), top: B:103:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0220 A[Catch: all -> 0x005d, TryCatch #4 {all -> 0x005d, blocks: (B:9:0x0052, B:47:0x017c, B:49:0x018e, B:52:0x019b, B:54:0x01b7, B:59:0x01d9, B:61:0x01e1, B:62:0x01f7, B:69:0x0209, B:71:0x0220, B:74:0x0255, B:77:0x0268, B:85:0x02b1, B:79:0x027a, B:81:0x0286, B:82:0x0292, B:84:0x029a, B:73:0x0240, B:86:0x02b6, B:41:0x0150, B:43:0x0166), top: B:104:0x0042, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x023e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0240 A[Catch: all -> 0x005d, TryCatch #4 {all -> 0x005d, blocks: (B:9:0x0052, B:47:0x017c, B:49:0x018e, B:52:0x019b, B:54:0x01b7, B:59:0x01d9, B:61:0x01e1, B:62:0x01f7, B:69:0x0209, B:71:0x0220, B:74:0x0255, B:77:0x0268, B:85:0x02b1, B:79:0x027a, B:81:0x0286, B:82:0x0292, B:84:0x029a, B:73:0x0240, B:86:0x02b6, B:41:0x0150, B:43:0x0166), top: B:104:0x0042, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0266 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0268 A[Catch: all -> 0x005d, TryCatch #4 {all -> 0x005d, blocks: (B:9:0x0052, B:47:0x017c, B:49:0x018e, B:52:0x019b, B:54:0x01b7, B:59:0x01d9, B:61:0x01e1, B:62:0x01f7, B:69:0x0209, B:71:0x0220, B:74:0x0255, B:77:0x0268, B:85:0x02b1, B:79:0x027a, B:81:0x0286, B:82:0x0292, B:84:0x029a, B:73:0x0240, B:86:0x02b6, B:41:0x0150, B:43:0x0166), top: B:104:0x0042, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x027a A[Catch: all -> 0x005d, TryCatch #4 {all -> 0x005d, blocks: (B:9:0x0052, B:47:0x017c, B:49:0x018e, B:52:0x019b, B:54:0x01b7, B:59:0x01d9, B:61:0x01e1, B:62:0x01f7, B:69:0x0209, B:71:0x0220, B:74:0x0255, B:77:0x0268, B:85:0x02b1, B:79:0x027a, B:81:0x0286, B:82:0x0292, B:84:0x029a, B:73:0x0240, B:86:0x02b6, B:41:0x0150, B:43:0x0166), top: B:104:0x0042, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0286 A[Catch: all -> 0x005d, TryCatch #4 {all -> 0x005d, blocks: (B:9:0x0052, B:47:0x017c, B:49:0x018e, B:52:0x019b, B:54:0x01b7, B:59:0x01d9, B:61:0x01e1, B:62:0x01f7, B:69:0x0209, B:71:0x0220, B:74:0x0255, B:77:0x0268, B:85:0x02b1, B:79:0x027a, B:81:0x0286, B:82:0x0292, B:84:0x029a, B:73:0x0240, B:86:0x02b6, B:41:0x0150, B:43:0x0166), top: B:104:0x0042, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0292 A[Catch: all -> 0x005d, TryCatch #4 {all -> 0x005d, blocks: (B:9:0x0052, B:47:0x017c, B:49:0x018e, B:52:0x019b, B:54:0x01b7, B:59:0x01d9, B:61:0x01e1, B:62:0x01f7, B:69:0x0209, B:71:0x0220, B:74:0x0255, B:77:0x0268, B:85:0x02b1, B:79:0x027a, B:81:0x0286, B:82:0x0292, B:84:0x029a, B:73:0x0240, B:86:0x02b6, B:41:0x0150, B:43:0x0166), top: B:104:0x0042, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x029a A[Catch: all -> 0x005d, TryCatch #4 {all -> 0x005d, blocks: (B:9:0x0052, B:47:0x017c, B:49:0x018e, B:52:0x019b, B:54:0x01b7, B:59:0x01d9, B:61:0x01e1, B:62:0x01f7, B:69:0x0209, B:71:0x0220, B:74:0x0255, B:77:0x0268, B:85:0x02b1, B:79:0x027a, B:81:0x0286, B:82:0x0292, B:84:0x029a, B:73:0x0240, B:86:0x02b6, B:41:0x0150, B:43:0x0166), top: B:104:0x0042, inners: #2 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x01b7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x0220, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x0240, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        kh1 kh1Var;
        float f;
        String str2;
        Float f2;
        Float f3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.d;
        kh1 kh1Var2 = this.p;
        h50 h50Var = this.j;
        vh1 vh1Var = this.v;
        Function0 function0 = this.s;
        boolean z = this.u;
        n61 n61Var = this.n;
        boolean z2 = this.m;
        Function0 function1 = this.k;
        tj1 tj1Var = this.e;
        vh1 vh1Var2 = this.q;
        int i2 = this.g;
        a2 a2Var = this.t;
        float f4 = this.i;
        try {
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.d = 1;
                    if (DelayKt.delay(300L, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f = this.a;
                    str2 = this.c;
                    try {
                        ResultKt.throwOnFailure(obj);
                        kh1Var = kh1Var2;
                        str = ", currentToken=";
                        try {
                            if (((Boolean) tj1Var.invoke(Boxing.boxInt(i2), null)).booleanValue() && ((Boolean) function1.invoke()).booleanValue()) {
                                a2Var.invoke(Boxing.boxFloat(f4), Boxing.boxBoolean(z));
                                Log.d("PlayerScreen", "✓ 自动切换 FFmpeg 音频解码完成，倍速: " + f4);
                                if (z2) {
                                    n61Var.invoke("已切换到音频解码，倍速: " + f4 + "x");
                                }
                                vh1Var2.invoke(Boxing.boxBoolean(false));
                                return Unit.INSTANCE;
                            }
                            f3 = (Float) function0.invoke();
                            if (f3 != null) {
                                float fFloatValue = f3.floatValue();
                                a2Var.invoke(Boxing.boxFloat(fFloatValue), Boxing.boxBoolean(false));
                                vh1Var.invoke(Boxing.boxFloat(fFloatValue));
                            }
                            Unit unit = Unit.INSTANCE;
                            vh1Var2.invoke(Boxing.boxBoolean(false));
                            return unit;
                        } catch (Exception e) {
                            e = e;
                            Log.e("PlayerScreen", "自动切换音频解码器失败", e);
                            if (!((Boolean) tj1Var.invoke(Boxing.boxInt(i2), null)).booleanValue()) {
                                Log.d("PlayerScreen", "忽略过期倍速自动切换失败结果: token=" + i2 + str + h50Var.invoke());
                            } else if (z2) {
                                n61Var.invoke("切换失败: " + e.getMessage());
                            }
                            if (((Boolean) tj1Var.invoke(Boxing.boxInt(i2), null)).booleanValue()) {
                                if (z) {
                                    a2Var.invoke(Boxing.boxFloat(1.0f), Boxing.boxBoolean(true));
                                } else if (((Boolean) function1.invoke()).booleanValue()) {
                                    a2Var.invoke(Boxing.boxFloat(f), Boxing.boxBoolean(false));
                                } else {
                                    f2 = (Float) function0.invoke();
                                    if (f2 != null) {
                                        float fFloatValue2 = f2.floatValue();
                                        a2Var.invoke(Boxing.boxFloat(fFloatValue2), Boxing.boxBoolean(false));
                                        vh1Var.invoke(Boxing.boxFloat(fFloatValue2));
                                    }
                                }
                                kh1Var.invoke(str2);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        kh1Var = kh1Var2;
                        str = ", currentToken=";
                        Log.e("PlayerScreen", "自动切换音频解码器失败", e);
                        if (!((Boolean) tj1Var.invoke(Boxing.boxInt(i2), null)).booleanValue()) {
                            Log.d("PlayerScreen", "忽略过期倍速自动切换失败结果: token=" + i2 + str + h50Var.invoke());
                        } else if (z2) {
                            n61Var.invoke("切换失败: " + e.getMessage());
                        }
                        if (((Boolean) tj1Var.invoke(Boxing.boxInt(i2), null)).booleanValue()) {
                            if (z) {
                                a2Var.invoke(Boxing.boxFloat(1.0f), Boxing.boxBoolean(true));
                            } else if (((Boolean) function1.invoke()).booleanValue()) {
                                a2Var.invoke(Boxing.boxFloat(f), Boxing.boxBoolean(false));
                            } else {
                                f2 = (Float) function0.invoke();
                                if (f2 != null) {
                                    float fFloatValue3 = f2.floatValue();
                                    a2Var.invoke(Boxing.boxFloat(fFloatValue3), Boxing.boxBoolean(false));
                                    vh1Var.invoke(Boxing.boxFloat(fFloatValue3));
                                }
                            }
                            kh1Var.invoke(str2);
                        }
                        vh1Var2.invoke(Boxing.boxBoolean(false));
                        return Unit.INSTANCE;
                    }
                }
                Integer numBoxInt = Boxing.boxInt(i2);
                ExoPlayer exoPlayer = this.h;
                if (!((Boolean) tj1Var.invoke(numBoxInt, exoPlayer)).booleanValue()) {
                    Log.d("PlayerScreen", "跳过过期倍速检查: 期望 " + f4 + ", token=" + i2 + ", currentToken=" + h50Var.invoke());
                    return Unit.INSTANCE;
                }
                if (!((Boolean) function1.invoke()).booleanValue()) {
                    return Unit.INSTANCE;
                }
                float f5 = exoPlayer.getPlaybackParameters().speed;
                str = ", currentToken=";
                Log.d("PlayerScreen", "🎬 倍速检查: 期望 " + f4 + ", 实际 " + f5 + ", token=" + i2);
                if (Math.abs(f5 - f4) <= 0.01f) {
                    return Unit.INSTANCE;
                }
                Log.w("PlayerScreen", "⚠️ 倍速设置未生效: 期望 " + f4 + ", 实际 " + f5 + " (可能是音频格式不支持)");
                String strC = this.l.a.c();
                if (Intrinsics.areEqual(strC, DecoderSettings.AUDIO_DECODER_FORCE_FFMPEG)) {
                    if (z2) {
                        n61Var.invoke("该视频不支持变速播放");
                    }
                    if (z) {
                        a2Var.invoke(Boxing.boxFloat(f5), Boxing.boxBoolean(true));
                    } else if (((Boolean) function1.invoke()).booleanValue()) {
                        a2Var.invoke(Boxing.boxFloat(f5), Boxing.boxBoolean(false));
                    } else {
                        Float f6 = (Float) function0.invoke();
                        if (f6 != null) {
                            float fFloatValue4 = f6.floatValue();
                            a2Var.invoke(Boxing.boxFloat(fFloatValue4), Boxing.boxBoolean(false));
                            vh1Var.invoke(Boxing.boxFloat(fFloatValue4));
                        }
                    }
                } else {
                    Log.d("PlayerScreen", "自动切换到音频解码以支持变速播放");
                    if (z2) {
                        n61Var.invoke("正在切换音频解码器以支持变速...");
                    }
                    String str3 = (String) this.o.b.c.getValue();
                    try {
                        kh1Var2.invoke(DecoderSettings.AUDIO_DECODER_FORCE_FFMPEG);
                        vh1Var2.invoke(Boxing.boxBoolean(true));
                        rj1 rj1Var = this.r;
                        Float fBoxFloat = Boxing.boxFloat(f4);
                        kh1Var = kh1Var2;
                        try {
                            this.b = null;
                            this.c = str3;
                            this.a = f5;
                            this.d = 2;
                            if (rj1Var.invoke(fBoxFloat, this) != coroutine_suspended) {
                                f = f5;
                                str2 = str3;
                                if (((Boolean) tj1Var.invoke(Boxing.boxInt(i2), null)).booleanValue()) {
                                    a2Var.invoke(Boxing.boxFloat(f4), Boxing.boxBoolean(z));
                                    Log.d("PlayerScreen", "✓ 自动切换 FFmpeg 音频解码完成，倍速: " + f4);
                                    if (z2) {
                                        n61Var.invoke("已切换到音频解码，倍速: " + f4 + "x");
                                    }
                                    vh1Var2.invoke(Boxing.boxBoolean(false));
                                }
                                f3 = (Float) function0.invoke();
                                if (f3 != null) {
                                    float fFloatValue5 = f3.floatValue();
                                    a2Var.invoke(Boxing.boxFloat(fFloatValue5), Boxing.boxBoolean(false));
                                    vh1Var.invoke(Boxing.boxFloat(fFloatValue5));
                                }
                                Unit unit2 = Unit.INSTANCE;
                                vh1Var2.invoke(Boxing.boxBoolean(false));
                                return unit2;
                            }
                            return coroutine_suspended;
                        } catch (Exception e3) {
                            e = e3;
                            f = f5;
                            str2 = str3;
                            Log.e("PlayerScreen", "自动切换音频解码器失败", e);
                            if (!((Boolean) tj1Var.invoke(Boxing.boxInt(i2), null)).booleanValue()) {
                                Log.d("PlayerScreen", "忽略过期倍速自动切换失败结果: token=" + i2 + str + h50Var.invoke());
                            } else if (z2) {
                                n61Var.invoke("切换失败: " + e.getMessage());
                            }
                            if (((Boolean) tj1Var.invoke(Boxing.boxInt(i2), null)).booleanValue()) {
                                if (z) {
                                    a2Var.invoke(Boxing.boxFloat(1.0f), Boxing.boxBoolean(true));
                                } else if (((Boolean) function1.invoke()).booleanValue()) {
                                    a2Var.invoke(Boxing.boxFloat(f), Boxing.boxBoolean(false));
                                } else {
                                    f2 = (Float) function0.invoke();
                                    if (f2 != null) {
                                        float fFloatValue6 = f2.floatValue();
                                        a2Var.invoke(Boxing.boxFloat(fFloatValue6), Boxing.boxBoolean(false));
                                        vh1Var.invoke(Boxing.boxFloat(fFloatValue6));
                                    }
                                }
                                kh1Var.invoke(str2);
                            }
                            vh1Var2.invoke(Boxing.boxBoolean(false));
                            return Unit.INSTANCE;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        kh1Var = kh1Var2;
                    }
                }
                return Unit.INSTANCE;
            } catch (CancellationException e5) {
                throw e5;
            }
        } catch (Throwable th) {
            vh1Var2.invoke(Boxing.boxBoolean(false));
            throw th;
        }
    }
}
