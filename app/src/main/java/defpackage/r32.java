package defpackage;

import android.util.Base64;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.util.Collection;
import java.nio.charset.Charset;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r32 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ y32 b;
    public final /* synthetic */ o32 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r32(y32 y32Var, o32 o32Var, Continuation continuation) {
        super(2, continuation);
        this.b = y32Var;
        this.c = o32Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        r32 r32Var = new r32(this.b, this.c, continuation);
        r32Var.a = obj;
        return r32Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r32) create((MutablePreferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set linkedHashSet;
        MutablePreferences mutablePreferences = (MutablePreferences) this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        y32 y32Var = this.b;
        Preferences.Key key = y32Var.c;
        Preferences.Key key2 = y32Var.b;
        Set set = (Set) mutablePreferences.get(key2);
        if (set == null || (linkedHashSet = CollectionsKt.toMutableSet(set)) == null) {
            linkedHashSet = new LinkedHashSet();
        }
        o32 o32Var = this.c;
        Collection.EL.removeIf(linkedHashSet, new oy1(new m22(o32Var, 3), 1));
        String str = o32Var.b;
        String str2 = o32Var.a;
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        byte[] bytes2 = o32Var.c.getBytes(charset);
        bytes2.getClass();
        linkedHashSet.add(str2 + "|" + strEncodeToString + "|" + Base64.encodeToString(bytes2, 2));
        mutablePreferences.set(key2, linkedHashSet);
        CharSequence charSequence = (CharSequence) mutablePreferences.get(key);
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            mutablePreferences.set(key, str2);
        }
        return Unit.INSTANCE;
    }
}
