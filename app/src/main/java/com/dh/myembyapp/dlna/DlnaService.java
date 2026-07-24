package com.dh.myembyapp.dlna;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.dh.myembyapp.MainActivity;
import com.dh.myembyapp.dlna.DlnaService;
import defpackage.kb0;
import defpackage.ob0;
import defpackage.zr1;
import java.net.BindException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class DlnaService extends Service {
    private static final String CHANNEL_ID = "dlna_service_channel";
    private static final int NOTIFICATION_ID = 1001;
    private static final String SSDP_ADDRESS = "239.255.255.250";
    private static final int SSDP_PORT = 1900;
    private static final String TAG = "DlnaService";
    private static boolean isRunning;
    private static Function1<? super DlnaPlayRequest, Unit> onPlayRequest;
    private String deviceName;
    private String deviceUuid;
    private int httpPort;
    private DlnaHttpServer httpServer;
    private WifiManager.MulticastLock multicastLock;
    private Thread ssdpThread;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    
    private final LocalBinder binder = new LocalBinder();
    private final ExecutorService executor = Executors.newCachedThreadPool();

    