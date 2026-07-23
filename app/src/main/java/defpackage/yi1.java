package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.ExoPlayer;

import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yi1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ pn1 c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableIntState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ eo1 j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ ih1 n;
    public final /* synthetic */ ih1 o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ to1 q;
    public final /* synthetic */ MutableState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi1(boolean z, String str, pn1 pn1Var, MutableState mutableState, MutableState mutableState2, MutableIntState mutableIntState, MutableState mutableState3, MutableState mutableState4, eo1 eo1Var, Function0 function0, MutableState mutableState5, MutableState mutableState6, ih1 ih1Var, ih1 ih1Var2, MutableState mutableState7, to1 to1Var, MutableState mutableState8) {
        super(1, Intrinsics.Kotlin.class, "handleAutoRefreshPlaybackAfterError", "PlayerScreenContent$lambda$121$handleAutoRefreshPlaybackAfterError(ZLjava/lang/String;Lcom/dh/myembyapp/ui/screens/player/PlayerStallRecoveryState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerViewModel;Landroidx/compose/runtime/MutableState;Landroidx/media3/common/PlaybackException;)Z", 0);
        this.a = z;
        this.b = str;
        this.c = pn1Var;
        this.d = mutableState;
        this.e = mutableState2;
        this.g = mutableIntState;
        this.h = mutableState3;
        this.i = mutableState4;
        this.j = eo1Var;
        this.k = function0;
        this.l = mutableState5;
        this.m = mutableState6;
        this.n = ih1Var;
        this.o = ih1Var2;
        this.p = mutableState7;
        this.q = to1Var;
        this.r = mutableState8;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0107  */
    /* JADX WARN: Code duplicated, block: B:34:0x0115  */
    /* JADX WARN: Code duplicated, block: B:36:0x011b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0128  */
    /* JADX WARN: Code duplicated, block: B:40:0x014d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0159  */
    /* JADX WARN: Code duplicated, block: B:43:0x0164  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x0128, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        HttpDataSource.InvalidResponseCodeException invalidResponseCodeException;
        boolean z;
        boolean zContains;
        String str;
        MutableState mutableState;
        Function0 function0;
        long currentPosition;
        PlaybackException playbackException = (PlaybackException) obj;
        playbackException.getClass();
        MutableState mutableState2 = this.d;
        boolean zBooleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
        MutableState mutableState3 = this.e;
        String str2 = (String) mutableState3.getValue();
        MutableIntState mutableIntState = this.g;
        int intValue = mutableIntState.getIntValue();
        bl1 bl1Var = new bl1(0, this.c, pn1.class, "markMediaLoadActivity", "markMediaLoadActivity(J)V", 0, 1);
        jl1 jl1Var = new jl1(this.q, this.r);
        boolean z2 = false;
        if (!this.a) {
            Throwable cause = playbackException;
            int i2 = 0;
            while (true) {
                i = 16;
                if (cause == null || i2 >= 16) {
                    invalidResponseCodeException = null;
                    break;
                }
                if (cause instanceof HttpDataSource.InvalidResponseCodeException) {
                    invalidResponseCodeException = (HttpDataSource.InvalidResponseCodeException) cause;
                    break;
                }
                cause = cause.getCause();
                i2++;
            }
            if (invalidResponseCodeException == null) {
                z = true;
                switch (playbackException.errorCode) {
                    case 2000:
                    case PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED /* 2001 */:
                    case PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT /* 2002 */:
                    case PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS /* 2004 */:
                        zContains = true;
                        break;
                    case PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE /* 2003 */:
                    default:
                        zContains = false;
                        break;
                }
            } else {
                z = true;
                zContains = SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(HttpStatus.SC_UNAUTHORIZED), Integer.valueOf(HttpStatus.SC_FORBIDDEN), Integer.valueOf(HttpStatus.SC_NOT_FOUND), Integer.valueOf(HttpStatus.SC_REQUEST_TIMEOUT), Integer.valueOf(HttpStatus.SC_GONE), 429, 500, Integer.valueOf(HttpStatus.SC_BAD_GATEWAY), Integer.valueOf(HttpStatus.SC_SERVICE_UNAVAILABLE), Integer.valueOf(HttpStatus.SC_GATEWAY_TIMEOUT)}).contains(Integer.valueOf(invalidResponseCodeException.responseCode));
            }
            if (zContains) {
                str = this.b;
                if (zBooleanValue) {
                    Log.w("PlayerScreen", "播放链接自动刷新已在进行中，忽略重复错误: mediaId=".concat(str));
                } else {
                    if (!Intrinsics.areEqual(str2, str)) {
                        mutableState3.setValue(str);
                        Unit unit = Unit.INSTANCE;
                        mutableIntState.setIntValue(0);
                        intValue = 0;
                    }
                    mutableState = this.m;
                    if (intValue >= 2) {
                        Log.w("PlayerScreen", "播放链接自动刷新次数已达上限: mediaId=" + str + " count=" + intValue);
                        mutableState.setValue(Integer.valueOf(intValue));
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        int i3 = intValue + 1;
                        function0 = (Function0) this.h.getValue();
                        if (function0 != null) {
                            currentPosition = ((Number) function0.invoke()).longValue();
                        } else {
                            currentPosition = ((ExoPlayer) this.i.getValue()).getCurrentPosition();
                        }
                        nh1 nh1VarZ = dn1.Z(this.j, this.k, RangesKt.coerceAtLeast(currentPosition, 0L));
                        mutableIntState.setIntValue(i3);
                        Unit unit3 = Unit.INSTANCE;
                        mutableState2.setValue(Boolean.TRUE);
                        this.l.setValue(null);
                        mutableState.setValue(null);
                        Boolean bool = Boolean.FALSE;
                        this.n.a.setValue(bool);
                        Unit unit4 = Unit.INSTANCE;
                        this.o.h.setValue(0L);
                        Unit unit5 = Unit.INSTANCE;
                        this.p.setValue(bool);
                        bl1Var.invoke();
                        Log.w("PlayerScreen", "检测到疑似播放链接失效或返回内容异常，自动刷新 PlaybackInfo 后续播: mediaId=" + str + " attempt=" + i3 + "/2 position=" + nh1VarZ.b + "ms error=" + playbackException.getErrorCodeName() + "(" + playbackException.errorCode + ")");
                        jl1Var.invoke(nh1VarZ);
                    }
                }
                z2 = z;
            } else if (playbackException.errorCode == 3003) {
                Throwable cause2 = playbackException;
                int i4 = 0;
                while (true) {
                    if (cause2 != null && i4 < i) {
                        if (!Intrinsics.areEqual(cause2.getClass().getSimpleName(), "UnrecognizedInputFormatException")) {
                            cause2 = cause2.getCause();
                            i4++;
                            i = 16;
                        }
                    }
                }
                str = this.b;
                if (zBooleanValue) {
                    Log.w("PlayerScreen", "播放链接自动刷新已在进行中，忽略重复错误: mediaId=".concat(str));
                } else {
                    if (!Intrinsics.areEqual(str2, str)) {
                        mutableState3.setValue(str);
                        Unit unit6 = Unit.INSTANCE;
                        mutableIntState.setIntValue(0);
                        intValue = 0;
                    }
                    mutableState = this.m;
                    if (intValue >= 2) {
                        Log.w("PlayerScreen", "播放链接自动刷新次数已达上限: mediaId=" + str + " count=" + intValue);
                        mutableState.setValue(Integer.valueOf(intValue));
                        Unit unit7 = Unit.INSTANCE;
                    } else {
                        int i5 = intValue + 1;
                        function0 = (Function0) this.h.getValue();
                        if (function0 != null) {
                            currentPosition = ((Number) function0.invoke()).longValue();
                        } else {
                            currentPosition = ((ExoPlayer) this.i.getValue()).getCurrentPosition();
                        }
                        nh1 nh1VarZ2 = dn1.Z(this.j, this.k, RangesKt.coerceAtLeast(currentPosition, 0L));
                        mutableIntState.setIntValue(i5);
                        Unit unit8 = Unit.INSTANCE;
                        mutableState2.setValue(Boolean.TRUE);
                        this.l.setValue(null);
                        mutableState.setValue(null);
                        Boolean bool2 = Boolean.FALSE;
                        this.n.a.setValue(bool2);
                        Unit unit9 = Unit.INSTANCE;
                        this.o.h.setValue(0L);
                        Unit unit10 = Unit.INSTANCE;
                        this.p.setValue(bool2);
                        bl1Var.invoke();
                        Log.w("PlayerScreen", "检测到疑似播放链接失效或返回内容异常，自动刷新 PlaybackInfo 后续播: mediaId=" + str + " attempt=" + i5 + "/2 position=" + nh1VarZ2.b + "ms error=" + playbackException.getErrorCodeName() + "(" + playbackException.errorCode + ")");
                        jl1Var.invoke(nh1VarZ2);
                    }
                }
                z2 = z;
            }
        }
        return Boolean.valueOf(z2);
    }
}
