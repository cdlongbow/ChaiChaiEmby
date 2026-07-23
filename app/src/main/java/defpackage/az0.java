package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.Library;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class az0 extends SuspendLambda implements Function2 {
    public Object a;
    public Object b;
    public Object c;
    public int d;
    public int e;
    public final /* synthetic */ cz0 g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az0(cz0 cz0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.g = cz0Var;
        this.h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new az0(this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((az0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01db  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object r18;
        Object r17;
        boolean z;
        Object r2;
        Object r13;
        Object r19;
        Object r110;
        Object r6;
        int i;
        Object r8;
        boolean z2;
        Object obj2;
        Object objM;
        int i2;
        boolean z3;
        Object r111;
        cz0 cz0Var = this.g;
        MutableStateFlow mutableStateFlow = cz0Var.b;
        Object r14 = cz0Var.l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.e;
        Object obj3 = null;
        Object M8832isSuccessimpl = "LibraryViewModel";
        Object r3 = 1;
        r3 = 1;
        try {
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    String userId = RetrofitClient.INSTANCE.getUserId();
                    String strB = cz0.b(cz0Var, (uy0) cz0Var.d.getValue());
                    String str = ((Boolean) cz0Var.f.getValue()).booleanValue() ? "Descending" : "Ascending";
                    int i4 = cz0Var.n;
                    int i5 = cz0Var.k;
                    px0 px0Var = cz0Var.q;
                    qx0 qx0Var = px0Var.a;
                    try {
                        Log.d("LibraryViewModel", "加载更多: startIndex=" + i4 + ", pageSize=" + i5 + ", mode=" + qx0Var + ", itemTypes=" + px0Var.b + ", recursive=" + px0Var.c);
                        uf0 uf0Var = cz0Var.a;
                        try {
                            String str2 = this.h;
                            px0 px0Var2 = cz0Var.q;
                            String str3 = px0Var2.b;
                            boolean z4 = px0Var2.c;
                            int i6 = cz0Var.k;
                            this.a = null;
                            this.b = null;
                            this.c = null;
                            this.d = i4;
                            try {
                                this.e = 1;
                                z2 = true;
                                String str4 = str3;
                                r14 = r14;
                                obj2 = "LibraryViewModel";
                                try {
                                    objM = uf0Var.m(userId, str2, str4, strB, str, "PrimaryImageAspectRatio,BasicSyncInfo,ProductionYear,PremiereDate,CommunityRating", z4, i6, i4, this);
                                    if (objM == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    i2 = i4;
                                    r3 = str4;
                                    r14 = obj2;
                                    r111 = r14;
                                    z3 = z2;
                                } catch (Exception e) {
                                    e = e;
                                    z = false;
                                    r13 = obj2;
                                    r110 = r14;
                                    r19 = z2;
                                    try {
                                        Log.e(r13, "加载更多失败", e);
                                        List list = CollectionsKt.toList((Iterable) r110);
                                        Library library = cz0Var.p;
                                        if (cz0Var.q.a == qx0.a) {
                                            r6 = r19;
                                        } else {
                                            r6 = z;
                                        }
                                        i = cz0Var.m;
                                        if (cz0Var.n < i) {
                                            r8 = r19;
                                        } else {
                                            r8 = z;
                                        }
                                        mutableStateFlow.setValue(new xy0(list, library, r6, i, r8, false));
                                    } catch (Throwable th) {
                                        th = th;
                                        cz0Var.o = z;
                                        throw th;
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                z2 = true;
                                obj2 = "LibraryViewModel";
                                z = false;
                                r13 = obj2;
                                r110 = r14;
                                r19 = z2;
                                Log.e(r13, "加载更多失败", e);
                                List list2 = CollectionsKt.toList((Iterable) r110);
                                Library library2 = cz0Var.p;
                                if (cz0Var.q.a == qx0.a) {
                                    r6 = r19;
                                } else {
                                    r6 = z;
                                }
                                i = cz0Var.m;
                                if (cz0Var.n < i) {
                                    r8 = r19;
                                } else {
                                    r8 = z;
                                }
                                mutableStateFlow.setValue(new xy0(list2, library2, r6, i, r8, false));
                                cz0Var.o = z;
                                return Unit.INSTANCE;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            z2 = true;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        r17 = r14;
                        z = false;
                        r18 = 1;
                        r2 = M8832isSuccessimpl;
                        r13 = r2;
                        r110 = r17;
                        r19 = r18;
                        Log.e(r13, "加载更多失败", e);
                        List list3 = CollectionsKt.toList((Iterable) r110);
                        Library library3 = cz0Var.p;
                        if (cz0Var.q.a == qx0.a) {
                            r6 = r19;
                        } else {
                            r6 = z;
                        }
                        i = cz0Var.m;
                        if (cz0Var.n < i) {
                            r8 = r19;
                        } else {
                            r8 = z;
                        }
                        mutableStateFlow.setValue(new xy0(list3, library3, r6, i, r8, false));
                        cz0Var.o = z;
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = this.d;
                    ResultKt.throwOnFailure(obj);
                    objM = ((Result) obj).getValue();
                    z3 = true;
                    r111 = r14;
                    r14 = "LibraryViewModel";
                }
                M8832isSuccessimpl = Result.m8832isSuccessimpl(objM);
                if (M8832isSuccessimpl != 0) {
                    if (!Result.m8831isFailureimpl(objM)) {
                        obj3 = objM;
                    }
                    obj3.getClass();
                    od0 od0Var = (od0) obj3;
                    List list4 = od0Var.a;
                    int iA = cz0.a(cz0Var, list4);
                    cz0Var.m = od0Var.b;
                    int size = list4.size();
                    int iCoerceAtMost = cz0Var.m;
                    if (size > 0) {
                        iCoerceAtMost = RangesKt.coerceAtMost(i2 + size, iCoerceAtMost);
                    }
                    cz0Var.n = iCoerceAtMost;
                    Log.d(r14, "加载更多完成: 唯一项 " + r111.size() + "/" + cz0Var.m + ", 本次新增 " + iA + ", 原始返回 " + list4.size() + ", 下次起点 " + cz0Var.n);
                    List list5 = CollectionsKt.toList((Iterable) r111);
                    Library library4 = cz0Var.p;
                    boolean z5 = cz0Var.q.a == qx0.a ? z3 : false;
                    int i7 = cz0Var.m;
                    mutableStateFlow.setValue(new xy0(list5, library4, z5, i7, cz0Var.n < i7 ? z3 : false, false));
                } else {
                    List list6 = CollectionsKt.toList((Iterable) r111);
                    Library library5 = cz0Var.p;
                    boolean z6 = cz0Var.q.a == qx0.a ? z3 : false;
                    int i8 = cz0Var.m;
                    mutableStateFlow.setValue(new xy0(list6, library5, z6, i8, cz0Var.n < i8 ? z3 : false, false));
                }
                z = false;
            } catch (Throwable th2) {
                th = th2;
                z = false;
                cz0Var.o = z;
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            r18 = r3;
            r17 = r14;
            z = false;
            r2 = M8832isSuccessimpl;
        }
        cz0Var.o = z;
        return Unit.INSTANCE;
    }
}
