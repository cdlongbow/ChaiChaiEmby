package defpackage;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class kz0 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ lz0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz0(lz0 lz0Var, boolean z, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.b = lz0Var;
        this.c = z;
        this.d = str;
        this.e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        kz0 kz0Var = new kz0(this.b, this.c, this.d, this.e, continuation);
        kz0Var.a = obj;
        return kz0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kz0) create((MutablePreferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutablePreferences mutablePreferences = (MutablePreferences) this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        lz0 lz0Var = this.b;
        Preferences.Key key = lz0Var.c;
        Preferences.Key key2 = lz0Var.b;
        Set setEmptySet = (Set) mutablePreferences.get(key2);
        if (setEmptySet == null) {
            setEmptySet = SetsKt.emptySet();
        }
        Set set = (Set) mutablePreferences.get(key);
        Set set2 = set;
        if (set2 != null && !set2.isEmpty()) {
            Set set3 = set;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set3, 10));
            Iterator it = set3.iterator();
            while (it.hasNext()) {
                arrayList.add(this.e + "|" + ((String) it.next()));
            }
            mutablePreferences.set(key2, SetsKt.plus(setEmptySet, (Iterable) arrayList));
            mutablePreferences.remove(key);
        }
        boolean z = this.c;
        String str = this.d;
        mutablePreferences.set(key2, z ? SetsKt.plus((Set<? extends String>) setEmptySet, str) : SetsKt.minus((Set<? extends String>) setEmptySet, str));
        return Unit.INSTANCE;
    }
}
