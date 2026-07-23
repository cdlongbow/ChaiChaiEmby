package defpackage;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class mu implements o12, LayoutModifier {
    public long a;
    public ArrayList b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, kotlinx.coroutines.CancellableContinuationImpl] */
    @Override // defpackage.o12
    public final Object a(Continuation continuation) throws Throwable {
        lu luVar;
        Ref.ObjectRef objectRef;
        Throwable th;
        ab0 ya0Var;
        if (continuation instanceof lu) {
            luVar = (lu) continuation;
            int i = luVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                luVar.d = i - Integer.MIN_VALUE;
            } else {
                luVar = new lu(this, (ContinuationImpl) continuation);
            }
        } else {
            luVar = new lu(this, (ContinuationImpl) continuation);
        }
        Object obj = luVar.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = luVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (Constraints.m7782isZeroimpl(this.a)) {
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                try {
                    luVar.a = objectRef2;
                    luVar.d = 1;
                    Object cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(luVar), 1);
                    cancellableContinuationImpl.initCancellability();
                    objectRef2.element = cancellableContinuationImpl;
                    this.b.add(cancellableContinuationImpl);
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(luVar);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                    ArrayList arrayList = this.b;
                    TypeIntrinsics.asMutableCollection(arrayList).remove(objectRef.element);
                } catch (Throwable th2) {
                    objectRef = objectRef2;
                    th = th2;
                    ArrayList arrayList2 = this.b;
                    TypeIntrinsics.asMutableCollection(arrayList2).remove(objectRef.element);
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = luVar.a;
            try {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList3 = this.b;
                TypeIntrinsics.asMutableCollection(arrayList3).remove(objectRef.element);
            } catch (Throwable th3) {
                th = th3;
                ArrayList arrayList4 = this.b;
                TypeIntrinsics.asMutableCollection(arrayList4).remove(objectRef.element);
                throw th;
            }
        }
        long j = this.a;
        int iM7778getMaxWidthimpl = Constraints.m7778getMaxWidthimpl(j);
        ab0 ya0Var2 = za0.a;
        if (iM7778getMaxWidthimpl != Integer.MAX_VALUE) {
            ig2.a(iM7778getMaxWidthimpl);
            ya0Var = new ya0(iM7778getMaxWidthimpl);
        } else {
            ya0Var = ya0Var2;
        }
        int iM7777getMaxHeightimpl = Constraints.m7777getMaxHeightimpl(j);
        if (iM7777getMaxHeightimpl != Integer.MAX_VALUE) {
            ig2.a(iM7777getMaxHeightimpl);
            ya0Var2 = new ya0(iM7777getMaxHeightimpl);
        }
        return new n12(ya0Var, ya0Var2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return s01.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return s01.b(this, function1);
    }

    public final void b(long j) {
        this.a = j;
        if (Constraints.m7782isZeroimpl(j)) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        this.b = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Result.Companion companion = Result.INSTANCE;
            ((Continuation) obj).resumeWith(Result.m8825constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final Object foldIn(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final Object foldOut(Object obj, Function2 function2) {
        return function2.invoke(this, obj);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return a.c(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return a.d(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo1456measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        b(j);
        Placeable placeableMo6509measureBRTryo0 = measurable.mo6509measureBRTryo0(j);
        return s01.m(measureScope, placeableMo6509measureBRTryo0.getWidth(), placeableMo6509measureBRTryo0.getHeight(), null, new f(5, placeableMo6509measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return a.h(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return a.i(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return c51.a(this, modifier);
    }
}
