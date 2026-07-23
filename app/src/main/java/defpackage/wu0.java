package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.IntroOutroSettings;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;


/* JADX INFO: loaded from: classes4.dex */
public abstract class wu0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(IntroOutroSettings introOutroSettings, IntroOutroSettings.Settings settings, ContinuationImpl continuationImpl) {
        vu0 vu0Var;
        if (continuationImpl instanceof vu0) {
            vu0Var = (vu0) continuationImpl;
            int i = vu0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vu0Var.d = i - Integer.MIN_VALUE;
            } else {
                vu0Var = new vu0(continuationImpl);
            }
        } else {
            vu0Var = new vu0(continuationImpl);
        }
        Object obj = vu0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = vu0Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Log.d("IntroOutro", "========== 保存片头片尾设置 ==========");
            Log.d("IntroOutro", "自动标记优先: " + settings.getAutoPriority());
            Log.d("IntroOutro", "跳过片头: " + settings.getSkipIntro());
            Log.d("IntroOutro", "跳过片尾: " + settings.getSkipOutro());
            vu0Var.a = null;
            vu0Var.b = null;
            vu0Var.d = 1;
            if (introOutroSettings.saveSettings(settings, vu0Var) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
        }
        Log.i("IntroOutro", "设置保存成功");
        Log.d("IntroOutro", "========================================");
        return Unit.INSTANCE;
    }
}
