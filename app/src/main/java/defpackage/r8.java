package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.PreferencesKt;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(lz0 lz0Var, String str, boolean z, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.e = lz0Var;
        this.g = str;
        this.c = z;
        this.d = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.g;
        Object obj3 = this.d;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                return new r8(this.c, (FocusRequester) obj4, (MutableState) obj3, (State) obj2, continuation);
            case 1:
                return new r8((lz0) obj4, (String) obj2, this.c, (MutableState) obj3, continuation);
            default:
                return new r8((zq0) obj4, (String) obj3, (Library) obj2, this.c, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((r8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objEdit;
        Object objJ;
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                State state = (State) obj4;
                MutableState mutableState = (MutableState) obj2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!this.c) {
                            return Unit.INSTANCE;
                        }
                        if (((Boolean) mutableState.getValue()).booleanValue() && ((String) state.getValue()) != null) {
                            this.b = 1;
                            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i2 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    FocusRequester.m4818requestFocus3ESFkO8$default((FocusRequester) obj3, 0, 1, null);
                    Log.d("AggregateSearch", "焦点恢复成功: " + ((String) state.getValue()));
                    break;
                } catch (Exception e) {
                    Log.e("AggregateSearch", "焦点恢复失败", e);
                }
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    lz0 lz0Var = (lz0) obj3;
                    String str = ((cq0) ((MutableState) obj2).getValue()).a;
                    String str2 = (String) obj4;
                    this.b = 1;
                    if (str == null || StringsKt.isBlank(str)) {
                        objEdit = Unit.INSTANCE;
                    } else {
                        objEdit = PreferencesKt.edit((DataStore) mz0.b.getValue(lz0Var.a, mz0.a[0]), new kz0(lz0Var, this.c, mr.C(str, "|", str2), str, null), this);
                        if (objEdit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objEdit = Unit.INSTANCE;
                        }
                    }
                    if (objEdit == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                Library library = (Library) obj4;
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    String id = library.getId();
                    String collectionType = library.getCollectionType();
                    this.b = 1;
                    objJ = ((zq0) obj3).a.j((String) obj2, id, collectionType, 8, 0, this.c, this);
                    if (objJ == coroutine_suspended3) {
                        return coroutine_suspended3;
                    }
                } else {
                    if (i4 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    objJ = ((Result) obj).getValue();
                }
                if (false) {
                    objJ = null;
                }
                od0 od0Var = (od0) objJ;
                List listEmptyList = od0Var != null ? od0Var.a : null;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                List list = listEmptyList;
                if (od0Var == null) {
                    return null;
                }
                Library library2 = (Library) obj4;
                int i5 = od0Var.b;
                return new rx0(library2, list, i5, i5 > list.size(), false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(zq0 zq0Var, String str, Library library, boolean z, Continuation continuation) {
        super(2, continuation);
        this.e = zq0Var;
        this.d = str;
        this.g = library;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(boolean z, FocusRequester focusRequester, MutableState mutableState, State state, Continuation continuation) {
        super(2, continuation);
        this.c = z;
        this.e = focusRequester;
        this.d = mutableState;
        this.g = state;
    }
}
