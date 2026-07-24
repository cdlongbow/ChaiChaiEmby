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
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class IntroOutroSettings {
    private final Context context;
    private final Flow<Settings> settingsFlow;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    
    private static final ReadOnlyProperty<Context, DataStore<Preferences>> dataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("intro_outro_settings", null, null, null, 14, null);
    private static final Preferences.Key<Boolean> KEY_AUTO_PRIORITY = PreferencesKeys.booleanKey("auto_priority");
    private static final Preferences.Key<Boolean> KEY_SKIP_INTRO = PreferencesKeys.booleanKey("skip_intro");
    private static final Preferences.Key<Boolean> KEY_SKIP_OUTRO = PreferencesKeys.booleanKey("skip_outro");

    