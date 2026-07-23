package com.dh.myembyapp.data;

import android.content.Context;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;

import defpackage.i02;
import defpackage.kb0;
import defpackage.o20;
import defpackage.rd1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/dh/myembyapp/data/DecoderSettings;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "decoderConfigFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dh/myembyapp/data/DecoderSettings$DecoderConfig;", "getDecoderConfigFlow", "()Lkotlinx/coroutines/flow/Flow;", "saveDecoderMode", "", "mode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAudioDecoderMode", "saveAudioPassthroughPriorityEnabled", "enabled", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveDv7CompatibilityEnabled", "Companion", "DecoderConfig", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DecoderSettings {
    public static final String AUDIO_DECODER_AUTO = "auto";
    public static final String AUDIO_DECODER_FORCE_FFMPEG = "force_ffmpeg";
    public static final String DECODER_MODE_AUTO = "auto";
    public static final String DECODER_MODE_HARDWARE = "hardware";
    public static final String DECODER_MODE_SOFTWARE = "software";
    private final Context context;
    private final Flow<DecoderConfig> decoderConfigFlow;
    public static final int $stable = 8;
    private static final Preferences.Key<String> DECODER_MODE_KEY = PreferencesKeys.stringKey("decoder_mode");
    private static final Preferences.Key<String> AUDIO_DECODER_MODE_KEY = PreferencesKeys.stringKey("audio_decoder_mode");
    private static final Preferences.Key<Boolean> AUDIO_PASSTHROUGH_PRIORITY_ENABLED_KEY = PreferencesKeys.booleanKey("audio_passthrough_priority_enabled");
    private static final Preferences.Key<Boolean> DV7_COMPATIBILITY_ENABLED_KEY = PreferencesKeys.booleanKey("dv7_compatibility_enabled");

    /* JADX INFO: renamed from: com.dh.myembyapp.data.DecoderSettings$saveAudioDecoderMode$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.dh.myembyapp.data.DecoderSettings$saveAudioDecoderMode$2", f = "DecoderSettings.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $mode;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$mode = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$mode, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            mutablePreferences.set(DecoderSettings.AUDIO_DECODER_MODE_KEY, this.$mode);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.dh.myembyapp.data.DecoderSettings$saveAudioPassthroughPriorityEnabled$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.dh.myembyapp.data.DecoderSettings$saveAudioPassthroughPriorityEnabled$2", f = "DecoderSettings.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    public static final class C03652 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $enabled;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03652(boolean z, Continuation<? super C03652> continuation) {
            super(2, continuation);
            this.$enabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C03652 c03652 = new C03652(this.$enabled, continuation);
            c03652.L$0 = obj;
            return c03652;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((C03652) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            mutablePreferences.set(DecoderSettings.AUDIO_PASSTHROUGH_PRIORITY_ENABLED_KEY, Boxing.boxBoolean(this.$enabled));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.dh.myembyapp.data.DecoderSettings$saveDecoderMode$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.dh.myembyapp.data.DecoderSettings$saveDecoderMode$2", f = "DecoderSettings.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    public static final class C03662 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $mode;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03662(String str, Continuation<? super C03662> continuation) {
            super(2, continuation);
            this.$mode = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C03662 c03662 = new C03662(this.$mode, continuation);
            c03662.L$0 = obj;
            return c03662;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((C03662) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            mutablePreferences.set(DecoderSettings.DECODER_MODE_KEY, this.$mode);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.dh.myembyapp.data.DecoderSettings$saveDv7CompatibilityEnabled$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.dh.myembyapp.data.DecoderSettings$saveDv7CompatibilityEnabled$2", f = "DecoderSettings.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    public static final class C03672 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $enabled;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03672(boolean z, Continuation<? super C03672> continuation) {
            super(2, continuation);
            this.$enabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C03672 c03672 = new C03672(this.$enabled, continuation);
            c03672.L$0 = obj;
            return c03672;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((C03672) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            mutablePreferences.set(DecoderSettings.DV7_COMPATIBILITY_ENABLED_KEY, Boxing.boxBoolean(this.$enabled));
            return Unit.INSTANCE;
        }
    }

    public DecoderSettings(Context context) {
        context.getClass();
        this.context = context;
        final Flow data = o20.a(context).getData();
        this.decoderConfigFlow = new Flow<DecoderConfig>() { // from class: com.dh.myembyapp.data.DecoderSettings$special$$inlined$map$1

            /* JADX INFO: renamed from: com.dh.myembyapp.data.DecoderSettings$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.dh.myembyapp.data.DecoderSettings$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @DebugMetadata(c = "com.dh.myembyapp.data.DecoderSettings$special$$inlined$map$1$2", f = "DecoderSettings.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {Input.Keys.U}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Preferences preferences = (Preferences) obj;
                        String str = (String) preferences.get(DecoderSettings.DECODER_MODE_KEY);
                        if (str == null) {
                            str = "auto";
                        }
                        String str2 = (String) preferences.get(DecoderSettings.AUDIO_DECODER_MODE_KEY);
                        String str3 = str2 != null ? str2 : "auto";
                        Boolean bool = (Boolean) preferences.get(DecoderSettings.AUDIO_PASSTHROUGH_PRIORITY_ENABLED_KEY);
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        Boolean bool2 = (Boolean) preferences.get(DecoderSettings.DV7_COMPATIBILITY_ENABLED_KEY);
                        DecoderSettings.DecoderConfig decoderConfig = new DecoderSettings.DecoderConfig(str, str3, zBooleanValue, bool2 != null ? bool2.booleanValue() : false);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(decoderConfig, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super DecoderSettings.DecoderConfig> flowCollector, Continuation continuation) {
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<DecoderConfig> getDecoderConfigFlow() {
        return this.decoderConfigFlow;
    }

    public final Object saveAudioDecoderMode(String str, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(o20.a(this.context), new AnonymousClass2(str, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    public final Object saveAudioPassthroughPriorityEnabled(boolean z, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(o20.a(this.context), new C03652(z, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    public final Object saveDecoderMode(String str, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(o20.a(this.context), new C03662(str, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    public final Object saveDv7CompatibilityEnabled(boolean z, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(o20.a(this.context), new C03672(z, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/dh/myembyapp/data/DecoderSettings$DecoderConfig;", "", "mode", "", "audioMode", "audioPassthroughPriorityEnabled", "", "dv7CompatibilityEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getMode", "()Ljava/lang/String;", "getAudioMode", "getAudioPassthroughPriorityEnabled", "()Z", "getDv7CompatibilityEnabled", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DecoderConfig {
        public static final int $stable = 0;
        private final String audioMode;
        private final boolean audioPassthroughPriorityEnabled;
        private final boolean dv7CompatibilityEnabled;
        private final String mode;

        public /* synthetic */ DecoderConfig(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "auto" : str, (i & 2) != 0 ? "auto" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
        }

        public static /* synthetic */ DecoderConfig copy$default(DecoderConfig decoderConfig, String str, String str2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = decoderConfig.mode;
            }
            if ((i & 2) != 0) {
                str2 = decoderConfig.audioMode;
            }
            if ((i & 4) != 0) {
                z = decoderConfig.audioPassthroughPriorityEnabled;
            }
            if ((i & 8) != 0) {
                z2 = decoderConfig.dv7CompatibilityEnabled;
            }
            return decoderConfig.copy(str, str2, z, z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */

        /* JADX INFO: renamed from: component2, reason: from getter */

        /* JADX INFO: renamed from: component3, reason: from getter */

        /* JADX INFO: renamed from: component4, reason: from getter */

        public final DecoderConfig copy(String mode, String audioMode, boolean audioPassthroughPriorityEnabled, boolean dv7CompatibilityEnabled) {
            mode.getClass();
            audioMode.getClass();
            return new DecoderConfig(mode, audioMode, audioPassthroughPriorityEnabled, dv7CompatibilityEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DecoderConfig)) {
                return false;
            }
            DecoderConfig decoderConfig = (DecoderConfig) other;
            return Intrinsics.areEqual(this.mode, decoderConfig.mode) && Intrinsics.areEqual(this.audioMode, decoderConfig.audioMode) && this.audioPassthroughPriorityEnabled == decoderConfig.audioPassthroughPriorityEnabled && this.dv7CompatibilityEnabled == decoderConfig.dv7CompatibilityEnabled;
        }





        public int hashCode() {
            return ((i02.i(this.mode.hashCode() * 31, 31, this.audioMode) + (this.audioPassthroughPriorityEnabled ? 1231 : 1237)) * 31) + (this.dv7CompatibilityEnabled ? 1231 : 1237);
        }

        public String toString() {
            String str = this.mode;
            String str2 = this.audioMode;
            boolean z = this.audioPassthroughPriorityEnabled;
            boolean z2 = this.dv7CompatibilityEnabled;
            StringBuilder sbZ = kb0.z("DecoderConfig(mode=", str, ", audioMode=", str2, ", audioPassthroughPriorityEnabled=");
            sbZ.append(z);
            sbZ.append(", dv7CompatibilityEnabled=");
            sbZ.append(z2);
            sbZ.append(")");
            return sbZ.toString();
        }

        public DecoderConfig(String str, String str2, boolean z, boolean z2) {
            str.getClass();
            str2.getClass();
            this.mode = str;
            this.audioMode = str2;
            this.audioPassthroughPriorityEnabled = z;
            this.dv7CompatibilityEnabled = z2;
        }

        public DecoderConfig() {
            this(null, null, false, false, 15, null);
        }
    }
}
