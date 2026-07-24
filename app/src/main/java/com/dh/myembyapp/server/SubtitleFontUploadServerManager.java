package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import defpackage.o32;
import defpackage.rd1;
import defpackage.tl0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
public final class SubtitleFontUploadServerManager {
    private static final int DEFAULT_PORT = 8768;
    private static final int MAX_PORT = 8799;
    private static final String TAG = "FontUploadServer";
    private final Context context;
    private Function2<? super o32, ? super Continuation<? super Unit>, ? extends Object> onFontUploaded;
    private SubtitleFontUploadServer server;
    

    /* JADX INFO: renamed from: com.dh.myembyapp.server.SubtitleFontUploadServerManager$handleUploaded$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ o32 $entry;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(o32 o32Var, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$entry = o32Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SubtitleFontUploadServerManager.this.new AnonymousClass1(this.$entry, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function2 function2 = SubtitleFontUploadServerManager.this.onFontUploaded;
                if (function2 != null) {
                    o32 o32Var = this.$entry;
                    this.label = 1;
                    if (function2.invoke(o32Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public SubtitleFontUploadServerManager(Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleUploaded(o32 entry) {
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AnonymousClass1(entry, null), 3, null);
    }

    public final String startServer(Function2<? super o32, ? super Continuation<? super Unit>, ? extends Object> onFontUploaded) {
        onFontUploaded.getClass();
        stopServer();
        this.onFontUploaded = onFontUploaded;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        for (int i = DEFAULT_PORT; i < 8800; i++) {
            listCreateListBuilder.add(Integer.valueOf(i));
        }
        Iterator it = CollectionsKt.build(listCreateListBuilder).iterator();
        IOException iOException = null;
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            try {
                SubtitleFontUploadServer subtitleFontUploadServer = new SubtitleFontUploadServer(iIntValue, this.context, new C03691(this));
                this.server = subtitleFontUploadServer;
                subtitleFontUploadServer.start();
                return tl0.b(this.context, iIntValue);
            } catch (IOException e) {
                SubtitleFontUploadServer subtitleFontUploadServer2 = this.server;
                if (subtitleFontUploadServer2 != null) {
                    subtitleFontUploadServer2.stop();
                }
                this.server = null;
                Log.e(TAG, "Failed to start server on port " + iIntValue, e);
                String message = e.getMessage();
                if (message == null || !message.contains("EADDRINUSE")) {
                    iOException = e;
                    break;
                }
                iOException = e;
            }
        }
        if (iOException != null) {
            Log.e(TAG, "All candidate ports failed", iOException);
        }
        return null;
    }

    public final void stopServer() {
        SubtitleFontUploadServer subtitleFontUploadServer = this.server;
        if (subtitleFontUploadServer != null) {
            subtitleFontUploadServer.stop();
        }
        this.server = null;
    }

    /* JADX INFO: renamed from: com.dh.myembyapp.server.SubtitleFontUploadServerManager$startServer$1, reason: invalid class name and case insensitive filesystem */
        public static final /* synthetic */ class C03691 extends FunctionReferenceImpl implements Function1<o32, Unit> {
        public C03691(Object obj) {
            super(1, obj, SubtitleFontUploadServerManager.class, "handleUploaded", "handleUploaded(Lcom/dh/myembyapp/data/SubtitleFontEntry;)V", 0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(o32 o32Var) {
            o32Var.getClass();
            ((SubtitleFontUploadServerManager) this.receiver).handleUploaded(o32Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(o32 o32Var) {
            invoke2(o32Var);
            return Unit.INSTANCE;
        }
    }
}
