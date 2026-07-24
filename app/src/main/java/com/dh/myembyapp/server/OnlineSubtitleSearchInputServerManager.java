package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import defpackage.tl0;
import fi.iki.elonen.NanoHTTPD;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class OnlineSubtitleSearchInputServerManager {
    private static final int PORT = 8769;
    private static final String TAG = "OnlineSubtitleSearchServer";
    private final Context context;
    private OnlineSubtitleSearchInputServer server;
    

    