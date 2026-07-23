package com.dh.myembyapp.server;

import defpackage.rd1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.dh.myembyapp.server.SearchInputServerManager$SearchInputServer$handleSearchPost$1", f = "SearchInputServerManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
public final class SearchInputServerManager$SearchInputServer$handleSearchPost$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $keyword;
    int label;
    final /* synthetic */ SearchInputServerManager.SearchInputServer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchInputServerManager$SearchInputServer$handleSearchPost$1(SearchInputServerManager.SearchInputServer searchInputServer, String str, Continuation<? super SearchInputServerManager$SearchInputServer$handleSearchPost$1> continuation) {
        super(2, continuation);
        this.this$0 = searchInputServer;
        this.$keyword = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchInputServerManager$SearchInputServer$handleSearchPost$1(this.this$0, this.$keyword, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchInputServerManager$SearchInputServer$handleSearchPost$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            rd1.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.throwOnFailure(obj);
        Function1 function1 = this.this$0.onSearchReceived;
        String str = this.$keyword;
        str.getClass();
        function1.invoke(str);
        return Unit.INSTANCE;
    }
}
