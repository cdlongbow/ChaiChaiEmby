package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import defpackage.tl0;
import fi.iki.elonen.NanoHTTPD;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class DanmakuSearchInputServerManager {
    private static final int PORT = 8768;
    private static final String TAG = "DanmakuSearchServer";
    private final Context context;
    private DanmakuSearchInputServer server;
    

    