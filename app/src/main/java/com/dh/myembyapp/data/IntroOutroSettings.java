package com.dh.myembyapp.data;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import defpackage.i9;
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
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/dh/myembyapp/data/IntroOutroSettings;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "settingsFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dh/myembyapp/data/IntroOutroSettings$Settings;", "getSettingsFlow", "()Lkotlinx/coroutines/flow/Flow;", "saveSettings", "", "settings", "(Lcom/dh/myembyapp/data/IntroOutroSettings$Settings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Settings", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IntroOutroSettings {
    private final Context context;
    private final Flow<Settings> settingsFlow;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final ReadOnlyProperty<Context, DataStore<Preferences>> dataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("intro_outro_settings", null, null, null, 14, null);
    private static final Preferences.Key<Boolean> KEY_AUTO_PRIORITY = PreferencesKeys.booleanKey("auto_priority");
    private static final Preferences.Key<Boolean> KEY_SKIP_INTRO = PreferencesKeys.booleanKey("skip_intro");
    private static final Preferences.Key<Boolean> KEY_SKIP_OUTRO = PreferencesKeys.booleanKey("skip_outro");

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/dh/myembyapp/data/IntroOutroSettings$Companion;", "", "<init>", "()V", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "KEY_AUTO_PRIORITY", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "KEY_SKIP_INTRO", "KEY_SKIP_OUTRO", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {new PropertyReference2Impl(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0)};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DataStore<Preferences> getDataStore(Context context) {
            return (DataStore) IntroOutroSettings.dataStore$delegate.getValue(context, $$delegatedProperties[0]);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.dh.myembyapp.data.IntroOutroSettings$saveSettings$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.dh.myembyapp.data.IntroOutroSettings$saveSettings$2", f = "IntroOutroSettings.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ Settings $settings;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Settings settings, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$settings = settings;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$settings, continuation);
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
            mutablePreferences.set(IntroOutroSettings.KEY_AUTO_PRIORITY, Boxing.boxBoolean(this.$settings.getAutoPriority()));
            mutablePreferences.set(IntroOutroSettings.KEY_SKIP_INTRO, Boxing.boxBoolean(this.$settings.getSkipIntro()));
            mutablePreferences.set(IntroOutroSettings.KEY_SKIP_OUTRO, Boxing.boxBoolean(this.$settings.getSkipOutro()));
            return Unit.INSTANCE;
        }
    }

    public IntroOutroSettings(Context context) {
        context.getClass();
        this.context = context;
        final Flow data = INSTANCE.getDataStore(context).getData();
        this.settingsFlow = new Flow<Settings>() { // from class: com.dh.myembyapp.data.IntroOutroSettings$special$$inlined$map$1

            /* JADX INFO: renamed from: com.dh.myembyapp.data.IntroOutroSettings$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.dh.myembyapp.data.IntroOutroSettings$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @DebugMetadata(c = "com.dh.myembyapp.data.IntroOutroSettings$special$$inlined$map$1$2", f = "IntroOutroSettings.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {47}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
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
                        Boolean bool = (Boolean) preferences.get(IntroOutroSettings.KEY_AUTO_PRIORITY);
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                        Boolean bool2 = (Boolean) preferences.get(IntroOutroSettings.KEY_SKIP_INTRO);
                        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                        Boolean bool3 = (Boolean) preferences.get(IntroOutroSettings.KEY_SKIP_OUTRO);
                        IntroOutroSettings.Settings settings = new IntroOutroSettings.Settings(zBooleanValue, zBooleanValue2, bool3 != null ? bool3.booleanValue() : false);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(settings, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super IntroOutroSettings.Settings> flowCollector, Continuation continuation) {
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<Settings> getSettingsFlow() {
        return this.settingsFlow;
    }

    public final Object saveSettings(Settings settings, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(INSTANCE.getDataStore(this.context), new AnonymousClass2(settings, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/dh/myembyapp/data/IntroOutroSettings$Settings;", "", "autoPriority", "", "skipIntro", "skipOutro", "<init>", "(ZZZ)V", "getAutoPriority", "()Z", "getSkipIntro", "getSkipOutro", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Settings {
        public static final int $stable = 0;
        private final boolean autoPriority;
        private final boolean skipIntro;
        private final boolean skipOutro;

        public /* synthetic */ Settings(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
        }

        public static /* synthetic */ Settings copy$default(Settings settings, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = settings.autoPriority;
            }
            if ((i & 2) != 0) {
                z2 = settings.skipIntro;
            }
            if ((i & 4) != 0) {
                z3 = settings.skipOutro;
            }
            return settings.copy(z, z2, z3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */

        /* JADX INFO: renamed from: component2, reason: from getter */

        /* JADX INFO: renamed from: component3, reason: from getter */

        public final Settings copy(boolean autoPriority, boolean skipIntro, boolean skipOutro) {
            return new Settings(autoPriority, skipIntro, skipOutro);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) other;
            return this.autoPriority == settings.autoPriority && this.skipIntro == settings.skipIntro && this.skipOutro == settings.skipOutro;
        }

        public int hashCode() {
            return ((((this.autoPriority ? 1231 : 1237) * 31) + (this.skipIntro ? 1231 : 1237)) * 31) + (this.skipOutro ? 1231 : 1237);
        }

        public String toString() {
            boolean z = this.autoPriority;
            boolean z2 = this.skipIntro;
            boolean z3 = this.skipOutro;
            StringBuilder sb = new StringBuilder("Settings(autoPriority=");
            sb.append(z);
            sb.append(", skipIntro=");
            sb.append(z2);
            sb.append(", skipOutro=");
            return i9.i(sb, z3, ")");
        }

        public Settings(boolean z, boolean z2, boolean z3) {
            this.autoPriority = z;
            this.skipIntro = z2;
            this.skipOutro = z3;
        }

        public Settings() {
            this(false, false, false, 7, null);
        }
    }
}
