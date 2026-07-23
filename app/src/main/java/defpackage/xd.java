package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class xd extends SuspendLambda implements Function2 {
    public boolean a;
    public md b;
    public int c;
    public final /* synthetic */ vb1 d;
    public final /* synthetic */ vb1 e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ fl1 h;
    public final /* synthetic */ vh1 i;
    public final /* synthetic */ vj1 j;
    public final /* synthetic */ UserPreferences k;
    public final /* synthetic */ n61 l;
    public final /* synthetic */ vh1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(vb1 vb1Var, vb1 vb1Var2, boolean z, fl1 fl1Var, vh1 vh1Var, vj1 vj1Var, UserPreferences userPreferences, n61 n61Var, vh1 vh1Var2, Continuation continuation) {
        super(2, continuation);
        this.d = vb1Var;
        this.e = vb1Var2;
        this.g = z;
        this.h = fl1Var;
        this.i = vh1Var;
        this.j = vj1Var;
        this.k = userPreferences;
        this.l = n61Var;
        this.m = vh1Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new xd(this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xd) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        md mdVar;
        boolean z;
        Exception e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        n61 n61Var = this.l;
        vh1 vh1Var = this.i;
        fl1 fl1Var = this.h;
        boolean z2 = this.g;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            boolean zBooleanValue = ((Boolean) this.d.invoke()).booleanValue();
            mdVar = (md) this.e.invoke();
            if (zBooleanValue == z2) {
                fl1Var.invoke();
                return Unit.INSTANCE;
            }
            try {
                vh1Var.invoke(Boxing.boxBoolean(z2));
                vj1 vj1Var = this.j;
                this.b = mdVar;
                this.a = zBooleanValue;
                this.c = 1;
                if (vj1Var.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z = zBooleanValue;
            } catch (Exception e2) {
                z = zBooleanValue;
                e = e2;
                vh1Var.invoke(Boxing.boxBoolean(z));
                this.m.invoke(mdVar);
                Log.e("PlayerScreen", "切换 ASS 增强渲染失败", e);
                n61Var.invoke("切换 ASS 增强渲染失败: " + e.getMessage());
            }
        } else {
            if (i != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.a;
            mdVar = this.b;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e3) {
                e = e3;
                vh1Var.invoke(Boxing.boxBoolean(z));
                this.m.invoke(mdVar);
                Log.e("PlayerScreen", "切换 ASS 增强渲染失败", e);
                n61Var.invoke("切换 ASS 增强渲染失败: " + e.getMessage());
            }
        }
        this.k.saveEnableAssSubtitleEnhancement(z2);
        Log.d("PlayerScreen", "ASS 增强渲染切换成功: " + z2);
        n61Var.invoke(z2 ? "ASS 增强渲染已开启" : "ASS 增强渲染已关闭");
        fl1Var.invoke();
        return Unit.INSTANCE;
    }
}
