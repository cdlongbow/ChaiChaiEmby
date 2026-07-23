package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vh1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ vh1(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                mutableState.setValue((String) obj);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                mutableState.setValue(str);
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                mutableState.setValue(str2);
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mutableState.setValue(bool);
                break;
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mutableState.setValue(bool2);
                break;
            case 5:
                mutableState.setValue((md) obj);
                break;
            case 6:
                String str3 = (String) obj;
                str3.getClass();
                mutableState.setValue(str3);
                break;
            case 7:
                Float f = (Float) obj;
                f.getClass();
                mutableState.setValue(f);
                break;
            case 8:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                mutableState.setValue(bool3);
                break;
            case 9:
                String str4 = (String) obj;
                str4.getClass();
                mutableState.setValue(str4);
                break;
            case 10:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                mutableState.setValue(bool4);
                break;
            case 11:
                mutableState.setValue((md) obj);
                break;
            case 12:
                String str5 = (String) obj;
                str5.getClass();
                mutableState.setValue(str5);
                break;
            case 13:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                mutableState.setValue(bool5);
                break;
            case 14:
                Float f2 = (Float) obj;
                f2.floatValue();
                mutableState.setValue(f2);
                break;
            case 15:
                mutableState.setValue((String) obj);
                break;
            case 16:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                mutableState.setValue(bool6);
                break;
            case 17:
                Float f3 = (Float) obj;
                f3.floatValue();
                mutableState.setValue(f3);
                break;
            case 18:
                mutableState.setValue((String) obj);
                break;
            case 19:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                mutableState.setValue(bool7);
                break;
            case 20:
                Long l = (Long) obj;
                l.longValue();
                mutableState.setValue(l);
                break;
            case 21:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                mutableState.setValue(bool8);
                break;
            case 22:
                float fFloatValue = ((Float) obj).floatValue();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    ((ExoPlayer) mutableState.getValue()).setPlaybackSpeed(fFloatValue);
                    Result.m8825constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m8825constructorimpl(ResultKt.createFailure(th));
                }
                break;
            case 23:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                mutableState.setValue(bool9);
                break;
            case 24:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                mutableState.setValue(bool10);
                break;
            case 25:
                float fFloatValue2 = ((Float) obj).floatValue();
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    ((ExoPlayer) mutableState.getValue()).setPlaybackSpeed(fFloatValue2);
                    Result.m8825constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m8825constructorimpl(ResultKt.createFailure(th2));
                }
                break;
            case 26:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                mutableState.setValue(bool11);
                break;
            case 27:
                Long l2 = (Long) obj;
                l2.longValue();
                mutableState.setValue(l2);
                break;
            case 28:
                ExoPlayer exoPlayer = (ExoPlayer) obj;
                exoPlayer.getClass();
                mutableState.setValue(exoPlayer);
                break;
            default:
                ExoPlayer exoPlayer2 = (ExoPlayer) obj;
                exoPlayer2.getClass();
                mutableState.setValue(exoPlayer2);
                break;
        }
        return Unit.INSTANCE;
    }
}
