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
import kotlin.Metadata;
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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 82\u00020\u0001:\u000289B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\b\u0010%\u001a\u00020\u001aH\u0002J\b\u0010&\u001a\u00020\u001aH\u0002J\b\u0010'\u001a\u00020\u001aH\u0002J\b\u0010(\u001a\u00020\u001aH\u0002J \u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0014H\u0002J \u0010.\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u0011H\u0002J\u001a\u00100\u001a\u0004\u0018\u00010\u00112\u0006\u0010*\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u0011H\u0002J\n\u00102\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u00103\u001a\u00020\u0011H\u0002J\"\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u00112\b\u00106\u001a\u0004\u0018\u00010\u00112\b\u00107\u001a\u0004\u0018\u00010\u0011R\u0012\u0010\u0004\u001a\u00060\u0005R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/dh/myembyapp/dlna/DlnaService;", "Landroid/app/Service;", "<init>", "()V", "binder", "Lcom/dh/myembyapp/dlna/DlnaService$LocalBinder;", "ssdpThread", "Ljava/lang/Thread;", "httpServer", "Lcom/dh/myembyapp/dlna/DlnaHttpServer;", "multicastLock", "Landroid/net/wifi/WifiManager$MulticastLock;", "Landroid/net/wifi/WifiManager;", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "deviceUuid", "", "deviceName", "httpPort", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onStartCommand", "flags", "startId", "onDestroy", "createNotificationChannel", "createNotification", "Landroid/app/Notification;", "acquireMulticastLock", "releaseMulticastLock", "startHttpServer", "stopHttpServer", "startSsdpListener", "stopSsdpListener", "sendSsdpNotify", "handleSsdpMessage", "message", "address", "Ljava/net/InetAddress;", "port", "sendSsdpResponse", "searchTarget", "extractHeader", "header", "getLocalIpAddress", "getOrCreateDeviceUuid", "handlePlayRequest", DlnaConstants.EXTRA_URI, DlnaConstants.EXTRA_TITLE, "metadata", "Companion", "LocalBinder", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
    public static final int $stable = 8;
    private final LocalBinder binder = new LocalBinder();
    private final ExecutorService executor = Executors.newCachedThreadPool();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/dh/myembyapp/dlna/DlnaService$Companion;", "", "<init>", "()V", "TAG", "", "NOTIFICATION_ID", "", "CHANNEL_ID", "SSDP_ADDRESS", "SSDP_PORT", "value", "", "isRunning", "()Z", "onPlayRequest", "Lkotlin/Function1;", "Lcom/dh/myembyapp/dlna/DlnaPlayRequest;", "", "getOnPlayRequest", "()Lkotlin/jvm/functions/Function1;", "setOnPlayRequest", "(Lkotlin/jvm/functions/Function1;)V", "start", "context", "Landroid/content/Context;", DlnaConstants.CMD_STOP, "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function1<DlnaPlayRequest, Unit> getOnPlayRequest() {
            return DlnaService.onPlayRequest;
        }

        public final boolean isRunning() {
            return DlnaService.isRunning;
        }

        public final void setOnPlayRequest(Function1<? super DlnaPlayRequest, Unit> function1) {
            DlnaService.onPlayRequest = function1;
        }

        public final void start(Context context) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) DlnaService.class);
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        }

        public final void stop(Context context) {
            context.getClass();
            context.stopService(new Intent(context, (Class<?>) DlnaService.class));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/dh/myembyapp/dlna/DlnaService$LocalBinder;", "Landroid/os/Binder;", "<init>", "(Lcom/dh/myembyapp/dlna/DlnaService;)V", "getService", "Lcom/dh/myembyapp/dlna/DlnaService;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class LocalBinder extends Binder {
        public LocalBinder() {
        }

        /* JADX INFO: renamed from: getService, reason: from getter */
        public final DlnaService getThis$0() {
            return DlnaService.this;
        }
    }

    private final void acquireMulticastLock() {
        try {
            Object systemService = getApplicationContext().getSystemService("wifi");
            systemService.getClass();
            WifiManager.MulticastLock multicastLockCreateMulticastLock = ((WifiManager) systemService).createMulticastLock("dlna_multicast_lock");
            this.multicastLock = multicastLockCreateMulticastLock;
            if (multicastLockCreateMulticastLock != null) {
                multicastLockCreateMulticastLock.setReferenceCounted(true);
            }
            WifiManager.MulticastLock multicastLock = this.multicastLock;
            if (multicastLock != null) {
                multicastLock.acquire();
            }
            Log.d(TAG, "Multicast Lock 已获取");
        } catch (Exception e) {
            Log.e(TAG, "获取 Multicast Lock 失败", e);
        }
    }

    private final Notification createNotification() {
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) MainActivity.class), 201326592);
        NotificationCompat.Builder contentTitle = new NotificationCompat.Builder(this, CHANNEL_ID).setContentTitle("DLNA 投屏已开启");
        String str = this.deviceName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceName");
            str = null;
        }
        Notification notificationBuild = contentTitle.setContentText("设备名称: " + str).setSmallIcon(zr1.chaichai).setContentIntent(activity).setOngoing(true).build();
        notificationBuild.getClass();
        return notificationBuild;
    }

    private final void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "DLNA 投屏服务", 2);
            notificationChannel.setDescription("允许其他设备投屏到本设备");
            notificationChannel.setShowBadge(false);
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    private final String extractHeader(String message, String header) {
        for (String str : StringsKt__StringsKt.split$default(message, new String[]{"\r\n"}, false, 0, 6, (Object) null)) {
            Locale locale = Locale.ROOT;
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            String upperCase2 = header.toUpperCase(locale);
            upperCase2.getClass();
            if (StringsKt__StringsJVMKt.startsWith$default(upperCase, upperCase2.concat(":"), false, 2, null)) {
                return StringsKt.trim((CharSequence) str.substring(header.length() + 1)).toString();
            }
        }
        return null;
    }

    private final String getLocalIpAddress() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (!networkInterfaceNextElement.isLoopback() && networkInterfaceNextElement.isUp()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                            return ((Inet4Address) inetAddressNextElement).getHostAddress();
                        }
                    }
                }
            }
            return null;
        } catch (Exception e) {
            Log.e(TAG, "获取本地 IP 失败", e);
            return null;
        }
    }

    private final String getOrCreateDeviceUuid() {
        SharedPreferences sharedPreferences = getSharedPreferences("dlna_prefs", 0);
        String string = sharedPreferences.getString("device_uuid", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        sharedPreferences.edit().putString("device_uuid", string2).apply();
        return string2;
    }

    private final void handleSsdpMessage(String message, final InetAddress address, final int port) {
        if (StringsKt__StringsJVMKt.startsWith$default(message, "M-SEARCH", false, 2, null)) {
            final String strExtractHeader = extractHeader(message, "ST");
            StringBuilder sbZ = kb0.z("收到 M-SEARCH: ST=", strExtractHeader, ", UA=", extractHeader(message, "USER-AGENT"), ", from=");
            sbZ.append(address);
            sbZ.append(":");
            sbZ.append(port);
            Log.d(TAG, sbZ.toString());
            if (strExtractHeader == null) {
                return;
            }
            if (Intrinsics.areEqual(strExtractHeader, "ssdp:all") || Intrinsics.areEqual(strExtractHeader, "upnp:rootdevice") || StringsKt__StringsKt.contains$default(strExtractHeader, (CharSequence) "MediaRenderer", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strExtractHeader, (CharSequence) "AVTransport", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strExtractHeader, (CharSequence) "RenderingControl", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strExtractHeader, (CharSequence) "ConnectionManager", false, 2, (Object) null)) {
                this.executor.execute(new Runnable() { // from class: pb0
                    @Override // java.lang.Runnable
                    public final void run() throws InterruptedException {
                        DlnaService.handleSsdpMessage$lambda$0(strExtractHeader, this, address, port);
                    }
                });
            } else {
                Log.d(TAG, "不响应此 ST: ".concat(strExtractHeader));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSsdpMessage$lambda$0(String str, DlnaService dlnaService, InetAddress inetAddress, int i) throws InterruptedException {
        if (!Intrinsics.areEqual(str, "ssdp:all")) {
            dlnaService.sendSsdpResponse(inetAddress, i, str);
            return;
        }
        dlnaService.sendSsdpResponse(inetAddress, i, "upnp:rootdevice");
        Thread.sleep(100L);
        dlnaService.sendSsdpResponse(inetAddress, i, "urn:schemas-upnp-org:device:MediaRenderer:1");
        Thread.sleep(100L);
        dlnaService.sendSsdpResponse(inetAddress, i, "urn:schemas-upnp-org:service:AVTransport:1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStartCommand$lambda$0(DlnaService dlnaService) {
        dlnaService.startHttpServer();
        dlnaService.startSsdpListener();
        dlnaService.sendSsdpNotify();
    }

    private final void releaseMulticastLock() {
        try {
            WifiManager.MulticastLock multicastLock = this.multicastLock;
            if (multicastLock != null) {
                multicastLock.release();
            }
            this.multicastLock = null;
            Log.d(TAG, "Multicast Lock 已释放");
        } catch (Exception e) {
            Log.e(TAG, "释放 Multicast Lock 失败", e);
        }
    }

    private final void sendSsdpNotify() {
        this.executor.execute(new ob0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendSsdpNotify$lambda$0(DlnaService dlnaService) {
        try {
            String localIpAddress = dlnaService.getLocalIpAddress();
            if (localIpAddress == null) {
                Log.e(TAG, "无法获取本地 IP，跳过 SSDP NOTIFY");
                return;
            }
            int i = dlnaService.httpPort;
            if (i == 0) {
                Log.w(TAG, "HTTP 服务器未启动，跳过 SSDP NOTIFY");
                return;
            }
            String str = "http://" + localIpAddress + ":" + i + "/description.xml";
            Log.d(TAG, "发送 SSDP NOTIFY, Location: ".concat(str));
            String str2 = dlnaService.deviceUuid;
            String str3 = null;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceUuid");
                str2 = null;
            }
            Pair pair = TuplesKt.to("upnp:rootdevice", "uuid:" + str2 + "::upnp:rootdevice");
            String str4 = dlnaService.deviceUuid;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceUuid");
                str4 = null;
            }
            String str5 = "uuid:" + str4;
            String str6 = dlnaService.deviceUuid;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceUuid");
                str6 = null;
            }
            Pair pair2 = TuplesKt.to(str5, "uuid:" + str6);
            String str7 = dlnaService.deviceUuid;
            if (str7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceUuid");
                str7 = null;
            }
            Pair pair3 = TuplesKt.to("urn:schemas-upnp-org:device:MediaRenderer:1", "uuid:" + str7 + "::urn:schemas-upnp-org:device:MediaRenderer:1");
            String str8 = dlnaService.deviceUuid;
            if (str8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceUuid");
                str8 = null;
            }
            Pair pair4 = TuplesKt.to("urn:schemas-upnp-org:service:AVTransport:1", "uuid:" + str8 + "::urn:schemas-upnp-org:service:AVTransport:1");
            String str9 = dlnaService.deviceUuid;
            if (str9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceUuid");
                str9 = null;
            }
            Pair pair5 = TuplesKt.to("urn:schemas-upnp-org:service:RenderingControl:1", "uuid:" + str9 + "::urn:schemas-upnp-org:service:RenderingControl:1");
            String str10 = dlnaService.deviceUuid;
            if (str10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceUuid");
            } else {
                str3 = str10;
            }
            List<Pair> listListOf = CollectionsKt.listOf((Object[]) new Pair[]{pair, pair2, pair3, pair4, pair5, TuplesKt.to("urn:schemas-upnp-org:service:ConnectionManager:1", "uuid:" + str3 + "::urn:schemas-upnp-org:service:ConnectionManager:1")});
            InetAddress byName = InetAddress.getByName(SSDP_ADDRESS);
            DatagramSocket datagramSocket = new DatagramSocket();
            for (Pair pair6 : listListOf) {
                String str11 = (String) pair6.component1();
                String str12 = (String) pair6.component2();
                StringBuilder sb = new StringBuilder();
                sb.append("NOTIFY * HTTP/1.1\r\n");
                sb.append("HOST: 239.255.255.250:1900\r\n");
                sb.append("CACHE-CONTROL: max-age=1800\r\n");
                sb.append("LOCATION: " + str + "\r\n");
                sb.append("NT: " + str11 + "\r\n");
                sb.append("NTS: ssdp:alive\r\n");
                sb.append("SERVER: Linux/3.0 UPnP/1.0 ChaiChaiTV/1.0\r\n");
                sb.append("USN: " + str12 + "\r\n");
                sb.append("\r\n");
                byte[] bytes = sb.toString().getBytes(Charsets.UTF_8);
                bytes.getClass();
                DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, byName, SSDP_PORT);
                datagramSocket.send(datagramPacket);
                Thread.sleep(100L);
                datagramSocket.send(datagramPacket);
            }
            datagramSocket.close();
            Log.d(TAG, "SSDP NOTIFY 广播已发送");
        } catch (Exception e) {
            Log.e(TAG, "发送 SSDP NOTIFY 失败", e);
        }
    }

    private final void sendSsdpResponse(InetAddress address, int port, String searchTarget) {
        String str;
        try {
            String localIpAddress = getLocalIpAddress();
            if (localIpAddress == null) {
                Log.e(TAG, "无法获取本地 IP 地址");
                return;
            }
            int i = this.httpPort;
            if (i == 0) {
                Log.w(TAG, "HTTP 服务器未启动，跳过 SSDP 响应");
                return;
            }
            String str2 = "http://" + localIpAddress + ":" + i + "/description.xml";
            Log.d(TAG, "SSDP 响应 Location: ".concat(str2));
            String str3 = "upnp:rootdevice";
            if (Intrinsics.areEqual(searchTarget, "ssdp:all") || Intrinsics.areEqual(searchTarget, "upnp:rootdevice")) {
                String str4 = this.deviceUuid;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("deviceUuid");
                    str4 = null;
                }
                str = "uuid:" + str4 + "::upnp:rootdevice";
            } else {
                String str5 = this.deviceUuid;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("deviceUuid");
                    str5 = null;
                }
                str = "uuid:" + str5 + "::" + searchTarget;
            }
            if (!Intrinsics.areEqual(searchTarget, "ssdp:all")) {
                str3 = searchTarget;
            }
            StringBuilder sb = new StringBuilder("HTTP/1.1 200 OK\r\nCACHE-CONTROL: max-age=1800\r\n");
            sb.append("DATE: " + new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US).format(new Date()) + "\r\n");
            sb.append("EXT:\r\n");
            sb.append("LOCATION: " + str2 + "\r\n");
            sb.append("SERVER: Linux/3.0 UPnP/1.0 ChaiChaiTV/1.0\r\n");
            sb.append("ST: " + str3 + "\r\n");
            sb.append("USN: " + str + "\r\n");
            sb.append("\r\n");
            String string = sb.toString();
            DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
            datagramSocket.setReuseAddress(true);
            datagramSocket.bind(new InetSocketAddress(InetAddress.getByName(localIpAddress), 0));
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            bytes.getClass();
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, address, port);
            datagramSocket.send(datagramPacket);
            Thread.sleep(50L);
            datagramSocket.send(datagramPacket);
            Thread.sleep(50L);
            datagramSocket.send(datagramPacket);
            datagramSocket.close();
            Log.d(TAG, "已发送 SSDP 响应到 " + address + ":" + port + ", ST=" + str3 + ", Location=" + str2 + " (从 " + localIpAddress + ")");
        } catch (Exception e) {
            Log.e(TAG, "发送 SSDP 响应失败", e);
        }
    }

    private final void startHttpServer() {
        try {
            stopHttpServer();
            boolean z = false;
            int i = DlnaHttpServer.PORT_RANGE_START;
            while (!z && i <= 65535) {
                try {
                    String str = this.deviceUuid;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("deviceUuid");
                        str = null;
                    }
                    String str2 = this.deviceName;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("deviceName");
                        str2 = null;
                    }
                    DlnaHttpServer dlnaHttpServer = new DlnaHttpServer(this, str, str2, i);
                    this.httpServer = dlnaHttpServer;
                    dlnaHttpServer.start();
                    z = true;
                    DlnaHttpServer dlnaHttpServer2 = this.httpServer;
                    int listeningPort = dlnaHttpServer2 != null ? dlnaHttpServer2.getListeningPort() : i;
                    this.httpPort = listeningPort;
                    Log.d(TAG, "HTTP 服务器启动成功，端口: " + listeningPort);
                } catch (BindException unused) {
                    Log.d(TAG, "端口 " + i + " 被占用，尝试下一个");
                    this.httpServer = null;
                    i++;
                }
            }
            if (z) {
                return;
            }
            Log.e(TAG, "HTTP 服务器启动失败，无可用端口");
        } catch (Exception e) {
            Log.e(TAG, "HTTP 服务器启动失败", e);
        }
    }

    private final void startSsdpListener() {
        Thread thread = new Thread(new ob0(this, 2));
        this.ssdpThread = thread;
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startSsdpListener$lambda$0(DlnaService dlnaService) {
        try {
            MulticastSocket multicastSocket = new MulticastSocket(SSDP_PORT);
            multicastSocket.setReuseAddress(true);
            InetAddress byName = InetAddress.getByName(SSDP_ADDRESS);
            multicastSocket.joinGroup(byName);
            Log.d(TAG, "SSDP 监听已启动");
            byte[] bArr = new byte[8192];
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    DatagramPacket datagramPacket = new DatagramPacket(bArr, 8192);
                    multicastSocket.receive(datagramPacket);
                    byte[] data = datagramPacket.getData();
                    data.getClass();
                    String str = new String(data, 0, datagramPacket.getLength(), Charsets.UTF_8);
                    InetAddress address = datagramPacket.getAddress();
                    address.getClass();
                    dlnaService.handleSsdpMessage(str, address, datagramPacket.getPort());
                } catch (Exception e) {
                    if (!Thread.currentThread().isInterrupted()) {
                        Log.e(TAG, "SSDP 接收错误", e);
                    }
                }
            }
            multicastSocket.leaveGroup(byName);
            multicastSocket.close();
        } catch (Exception e2) {
            Log.e(TAG, "SSDP 监听启动失败", e2);
        }
    }

    private final void stopHttpServer() {
        try {
            DlnaHttpServer dlnaHttpServer = this.httpServer;
            if (dlnaHttpServer != null) {
                dlnaHttpServer.stop();
                dlnaHttpServer.closeAllConnections();
            }
            this.httpServer = null;
            Log.d(TAG, "HTTP 服务器已停止");
        } catch (Exception e) {
            Log.e(TAG, "停止 HTTP 服务器失败", e);
            this.httpServer = null;
        }
    }

    private final void stopSsdpListener() {
        Thread thread = this.ssdpThread;
        if (thread != null) {
            thread.interrupt();
        }
        this.ssdpThread = null;
        Log.d(TAG, "SSDP 监听已停止");
    }

    public final void handlePlayRequest(String uri, String title, String metadata) {
        uri.getClass();
        Log.d(TAG, "处理播放请求: uri=" + uri + ", title=" + title);
        DlnaPlayRequest dlnaPlayRequest = new DlnaPlayRequest(uri, title, metadata);
        Intent intent = new Intent(DlnaConstants.ACTION_PLAY_REQUEST);
        intent.putExtra(DlnaConstants.EXTRA_URI, uri);
        intent.putExtra(DlnaConstants.EXTRA_TITLE, title);
        intent.putExtra("metadata", metadata);
        intent.setPackage(getPackageName());
        sendBroadcast(intent);
        Function1<? super DlnaPlayRequest, Unit> function1 = onPlayRequest;
        if (function1 != null) {
            function1.invoke(dlnaPlayRequest);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.binder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "DLNA 服务创建");
        this.deviceUuid = getOrCreateDeviceUuid();
        this.deviceName = new DlnaSettings(this).getConfigSync().getDeviceName();
        createNotificationChannel();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "DLNA 服务销毁");
        stopSsdpListener();
        stopHttpServer();
        releaseMulticastLock();
        this.executor.shutdown();
        isRunning = false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "DLNA 服务启动");
        startForeground(1001, createNotification());
        acquireMulticastLock();
        this.executor.execute(new ob0(this, 0));
        isRunning = true;
        return 1;
    }
}
