package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class un1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ UserPreferences a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ md e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ String j;
    public final /* synthetic */ Function1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un1(UserPreferences userPreferences, String str, String str2, boolean z, md mdVar, boolean z2, boolean z3, boolean z4, String str3, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.a = userPreferences;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = mdVar;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = str3;
        this.k = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new un1(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((un1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strC;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = this.b;
        str.getClass();
        Function1 function1 = this.k;
        function1.getClass();
        String str2 = this.c;
        if (this.d && this.e != null && this.g && !this.h && this.i) {
            strC = mr.C(str, "|", str2 == null ? "" : str2);
        } else {
            strC = null;
        }
        UserPreferences userPreferences = this.a;
        String str3 = this.j;
        if (strC != null && !Intrinsics.areEqual(str3, strC)) {
            userPreferences.armAssSubtitleEnhancementGuard(str, str2);
            function1.invoke(strC);
            s01.E("ASS 增强渲染保护标记已写入: mediaId=", str, ", subtitle=", str2, "PlayerScreen");
        } else if (strC == null && str3 != null) {
            userPreferences.clearAssSubtitleEnhancementGuard();
            Log.d("PlayerScreen", "ASS 增强渲染保护标记已清除");
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }
}
