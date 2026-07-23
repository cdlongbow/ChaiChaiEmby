package com.dh.myembyapp.dlna;

import android.content.Intent;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.zxing.client.android.Intents;
import defpackage.i02;
import defpackage.kb0;
import defpackage.ll0;
import defpackage.mr;
import defpackage.s01;
import fi.iki.elonen.NanoHTTPD;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0014H\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002J\b\u0010$\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\b\u0010'\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020\u0014H\u0002J\b\u0010)\u001a\u00020\u0014H\u0002J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0005H\u0002J\u001a\u0010.\u001a\u0004\u0018\u00010\u00052\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005H\u0002J\u0010\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0002J\u0010\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0002J\u0018\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005H\u0002J\u0010\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u000fH\u0002J\b\u00109\u001a\u00020\u0005H\u0002J\u001e\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/dh/myembyapp/dlna/DlnaHttpServer;", "Lfi/iki/elonen/NanoHTTPD;", NotificationCompat.CATEGORY_SERVICE, "Lcom/dh/myembyapp/dlna/DlnaService;", "deviceUuid", "", "deviceName", "port", "", "<init>", "(Lcom/dh/myembyapp/dlna/DlnaService;Ljava/lang/String;Ljava/lang/String;I)V", "currentUri", "currentMetadata", "transportState", "currentPosition", "", "currentDuration", "start", "", "serve", "Lfi/iki/elonen/NanoHTTPD$Response;", "session", "Lfi/iki/elonen/NanoHTTPD$IHTTPSession;", "handleEventSubscription", "serveDeviceDescription", "serveAvTransportDescription", "serveRenderingControlDescription", "serveConnectionManagerDescription", "handleAvTransportControl", "handleSetAvTransportUri", "soapBody", "handlePlay", "handlePause", "handleStop", "handleSeek", "handleGetTransportInfo", "handleGetPositionInfo", "handleGetMediaInfo", "handleSetNextAvTransportUri", "handleGetDeviceCapabilities", "handleGetTransportSettings", "handleGetCurrentTransportActions", "handleRenderingControl", "handleConnectionManager", "createSoapResponse", "body", "extractXmlValue", "xml", "tag", "escapeXml", "text", "unescapeXml", "parseSeekTarget", "unit", "target", "formatTime", "ms", "getLocalIp", "updatePlaybackState", "state", DlnaConstants.EXTRA_POSITION, "duration", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DlnaHttpServer extends NanoHTTPD {
    public static final int PORT_RANGE_END = 65535;
    public static final int PORT_RANGE_START = 49152;
    private static final String TAG = "DlnaHttpServer";
    private long currentDuration;
    private String currentMetadata;
    private long currentPosition;
    private String currentUri;
    private final String deviceName;
    private final String deviceUuid;
    private final DlnaService service;
    private String transportState;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DlnaHttpServer(DlnaService dlnaService, String str, String str2, int i) {
        super("0.0.0.0", i);
        dlnaService.getClass();
        str.getClass();
        str2.getClass();
        this.service = dlnaService;
        this.deviceUuid = str;
        this.deviceName = str2;
        this.currentUri = "";
        this.currentMetadata = "";
        this.transportState = "NO_MEDIA_PRESENT";
    }

    private final NanoHTTPD.Response createSoapResponse(String body) {
        NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/xml; charset=\"utf-8\"", mr.r("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\" s:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n    <s:Body>\n        ", body, "\n    </s:Body>\n</s:Envelope>"));
        responseNewFixedLengthResponse.getClass();
        return responseNewFixedLengthResponse;
    }

    private final String escapeXml(String text) {
        return StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(text, "&", "&amp;", false, 4, (Object) null), "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null), "\"", "&quot;", false, 4, (Object) null), "'", "&apos;", false, 4, (Object) null);
    }

    private final String extractXmlValue(String xml, String tag) {
        Iterator it = CollectionsKt.listOf((Object[]) new String[]{mr.s("<", tag, ">(.+?)</", tag, ">"), mr.s("<", tag, "[^>]*>(.+?)</", tag, ">"), mr.s("<[^:]+:", tag, ">(.+?)</[^:]+:", tag, ">")}).iterator();
        while (it.hasNext()) {
            MatchResult matchResultFind$default = Regex.find$default(new Regex((String) it.next(), RegexOption.DOT_MATCHES_ALL), xml, 0, 2, null);
            if (matchResultFind$default != null) {
                return unescapeXml(StringsKt.trim((CharSequence) matchResultFind$default.getGroupValues().get(1)).toString());
            }
        }
        return null;
    }

    private final String formatTime(long ms) {
        long j = ms / 1000;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 3600), Long.valueOf((j % 3600) / 60), Long.valueOf(j % 60)}, 3));
    }

    private final String getLocalIp() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (!networkInterfaceNextElement.isLoopback() && networkInterfaceNextElement.isUp()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                            String hostAddress = ((Inet4Address) inetAddressNextElement).getHostAddress();
                            return hostAddress == null ? "127.0.0.1" : hostAddress;
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "获取本地 IP 失败", e);
        }
        return "127.0.0.1";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final NanoHTTPD.Response handleAvTransportControl(NanoHTTPD.IHTTPSession session) {
        String strReplace$default;
        NanoHTTPD.Response responseHandleGetMediaInfo;
        try {
            HashMap map = new HashMap();
            session.parseBody(map);
            String str = (String) map.get("postData");
            if (str == null) {
                str = "";
            }
            Log.d(TAG, "========== AVTransport SOAP 请求 ==========");
            Log.d(TAG, "SOAP Body: ".concat(str));
            String str2 = session.getHeaders().get("soapaction");
            if (str2 == null || (strReplace$default = StringsKt__StringsJVMKt.replace$default(str2, "\"", "", false, 4, (Object) null)) == null) {
                strReplace$default = "";
            }
            String strSubstringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(strReplace$default, "#", (String) null, 2, (Object) null);
            Log.d(TAG, "SOAP Action: " + strSubstringAfterLast$default);
            switch (strSubstringAfterLast$default.hashCode()) {
                case -2000126948:
                    if (!strSubstringAfterLast$default.equals("GetMediaInfo")) {
                        Log.w(TAG, "未知的 AVTransport Action: ".concat(strSubstringAfterLast$default));
                        responseHandleGetMediaInfo = createSoapResponse("");
                    } else {
                        responseHandleGetMediaInfo = handleGetMediaInfo();
                    }
                    break;
                case -618096170:
                    if (!strSubstringAfterLast$default.equals("GetTransportSettings")) {
                        Log.w(TAG, "未知的 AVTransport Action: ".concat(strSubstringAfterLast$default));
                        responseHandleGetMediaInfo = createSoapResponse("");
                    } else {
                        responseHandleGetMediaInfo = handleGetTransportSettings();
                    }
                    break;
                case -94215187:
                    if (!strSubstringAfterLast$default.equals("SetNextAVTransportURI")) {
                        Log.w(TAG, "未知的 AVTransport Action: ".concat(strSubstringAfterLast$default));
                        responseHandleGetMediaInfo = createSoapResponse("");
                    } else {
                        responseHandleGetMediaInfo = handleSetNextAvTransportUri(str);
                    }
                    break;
                case 2490196:
                    if (!strSubstringAfterLast$default.equals("Play")) {
                        Log.w(TAG, "未知的 AVTransport Action: ".concat(strSubstringAfterLast$default));
                        responseHandleGetMediaInfo = createSoapResponse("");
                    } else {
                        responseHandleGetMediaInfo = handlePlay();
                    }
                    break;
                case 2572952:
                    if (!strSubstringAfterLast$default.equals("Seek")) {
                        Log.w(TAG, "未知的 AVTransport Action: ".concat(strSubstringAfterLast$default));
                        responseHandleGetMediaInfo = createSoapResponse("");
                    } else {
                        responseHandleGetMediaInfo = handleSeek(str);
                    }
                    break;
                case 2587682:
                    if (!strSubstringAfterLast$default.equals("Stop")) {
                        Log.w(TAG, "未知的 AVTransport Action: ".concat(strSubstringAfterLast$default));
                        responseHandleGetMediaInfo = createSoapResponse("");
                    } else {
                        responseHandleGetMediaInfo = handleStop();
                    }
                    break;
                case 42267418:
                    if (!strSubstringAfterLast$default.equals("SetAVTransportURI")) {
                        Log.w(TAG, "未知的 AVTransport Action: ".concat(strSubstringAfterLast$default));
                        responseHandleGetMediaInfo = createSoapResponse("");
                    } else {
                        responseHandleGetMediaInfo = handleSetAvTransportUri(str);
                    }
                    break;
                case 76887510:
                    if (!strSubstringAfterLast$default.equals("Pause")) {
                        Log.w(TAG, "未知的 AVTransport Action: ".concat(strSubstringAfterLast$default));
                        responseHandleGetMediaInfo = createSoapResponse("");
                    } else {
                        responseHandleGetMediaInfo = handlePause();
                    }
                    break;
                case 336618242:
                    if (!strSubstringAfterLast$default.equals("GetDeviceCapabilities")) {
                        Log.w(TAG, "未知的 AVTransport Action: ".concat(strSubstringAfterLast$default));
                        responseHandleGetMediaInfo = createSoapResponse("");
                    } else {
                        responseHandleGetMediaInfo = handleGetDeviceCapabilities();
                    }
                    break;
                case 663224269:
                    if (!strSubstringAfterLast$default.equals("GetPositionInfo")) {
                        Log.w(TAG, "未知的 AVTransport Action: ".concat(strSubstringAfterLast$default));
                        responseHandleGetMediaInfo = createSoapResponse("");
                    } else {
                        responseHandleGetMediaInfo = handleGetPositionInfo();
                    }
                    break;
                case 871896033:
                    if (!strSubstringAfterLast$default.equals("GetTransportInfo")) {
                        Log.w(TAG, "未知的 AVTransport Action: ".concat(strSubstringAfterLast$default));
                        responseHandleGetMediaInfo = createSoapResponse("");
                    } else {
                        responseHandleGetMediaInfo = handleGetTransportInfo();
                    }
                    break;
                case 2135436567:
                    if (!strSubstringAfterLast$default.equals("GetCurrentTransportActions")) {
                        Log.w(TAG, "未知的 AVTransport Action: ".concat(strSubstringAfterLast$default));
                        responseHandleGetMediaInfo = createSoapResponse("");
                    } else {
                        responseHandleGetMediaInfo = handleGetCurrentTransportActions();
                    }
                    break;
                default:
                    Log.w(TAG, "未知的 AVTransport Action: ".concat(strSubstringAfterLast$default));
                    responseHandleGetMediaInfo = createSoapResponse("");
                    break;
            }
            Log.d(TAG, "========================================");
            return responseHandleGetMediaInfo;
        } catch (Exception e) {
            Log.e(TAG, "处理 AVTransport 请求失败", e);
            e.printStackTrace();
            NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.INTERNAL_ERROR, NanoHTTPD.MIME_PLAINTEXT, "Error: " + e.getMessage());
            responseNewFixedLengthResponse.getClass();
            return responseNewFixedLengthResponse;
        }
    }

    private final NanoHTTPD.Response handleConnectionManager(NanoHTTPD.IHTTPSession session) {
        String strReplace$default;
        try {
            HashMap map = new HashMap();
            session.parseBody(map);
            String str = (String) map.get("postData");
            if (str == null) {
                str = "";
            }
            String str2 = session.getHeaders().get("soapaction");
            if (str2 == null || (strReplace$default = StringsKt__StringsJVMKt.replace$default(str2, "\"", "", false, 4, (Object) null)) == null) {
                strReplace$default = "";
            }
            String strSubstringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(strReplace$default, "#", (String) null, 2, (Object) null);
            Log.d(TAG, "========== ConnectionManager SOAP 请求 ==========");
            Log.d(TAG, "Action: " + strSubstringAfterLast$default);
            Log.d(TAG, "SOAP Body: ".concat(str));
            String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{"http-get:*:video/mp4:DLNA.ORG_PN=AVC_MP4_BL_CIF15_AAC_520;DLNA.ORG_OP=01;DLNA.ORG_FLAGS=01700000000000000000000000000000", "http-get:*:video/mp4:*", "http-get:*:video/x-matroska:*", "http-get:*:video/x-msvideo:*", "http-get:*:video/avi:*", "http-get:*:video/webm:*", "http-get:*:video/mpeg:*", "http-get:*:video/x-ms-wmv:*", "http-get:*:video/x-flv:*", "http-get:*:video/3gpp:*", "http-get:*:audio/mpeg:*", "http-get:*:audio/mp4:*", "http-get:*:audio/x-ms-wma:*", "http-get:*:audio/flac:*", "http-get:*:audio/ogg:*", "http-get:*:image/jpeg:*", "http-get:*:image/png:*", "http-get:*:*:*"}), ",", null, null, 0, null, null, 62, null);
            int iHashCode = strSubstringAfterLast$default.hashCode();
            if (iHashCode != -310136593) {
                if (iHashCode != 790209980) {
                    if (iHashCode == 1929656951 && strSubstringAfterLast$default.equals("GetCurrentConnectionIDs")) {
                        return createSoapResponse("<u:GetCurrentConnectionIDsResponse xmlns:u=\"urn:schemas-upnp-org:service:ConnectionManager:1\">\n    <ConnectionIDs>0</ConnectionIDs>\n</u:GetCurrentConnectionIDsResponse>");
                    }
                } else if (strSubstringAfterLast$default.equals("GetProtocolInfo")) {
                    Log.d(TAG, "返回 GetProtocolInfo 响应");
                    return createSoapResponse(StringsKt.trimIndent("\n                    <u:GetProtocolInfoResponse xmlns:u=\"urn:schemas-upnp-org:service:ConnectionManager:1\">\n                        <Source></Source>\n                        <Sink>" + strJoinToString$default + "</Sink>\n                    </u:GetProtocolInfoResponse>\n                "));
                }
            } else if (strSubstringAfterLast$default.equals("GetCurrentConnectionInfo")) {
                return createSoapResponse("<u:GetCurrentConnectionInfoResponse xmlns:u=\"urn:schemas-upnp-org:service:ConnectionManager:1\">\n    <RcsID>0</RcsID>\n    <AVTransportID>0</AVTransportID>\n    <ProtocolInfo></ProtocolInfo>\n    <PeerConnectionManager></PeerConnectionManager>\n    <PeerConnectionID>-1</PeerConnectionID>\n    <Direction>Input</Direction>\n    <Status>OK</Status>\n</u:GetCurrentConnectionInfoResponse>");
            }
            return createSoapResponse("");
        } catch (Exception e) {
            Log.e(TAG, "处理 ConnectionManager 请求失败", e);
            NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.INTERNAL_ERROR, NanoHTTPD.MIME_PLAINTEXT, "Error");
            responseNewFixedLengthResponse.getClass();
            return responseNewFixedLengthResponse;
        }
    }

    private final NanoHTTPD.Response handleEventSubscription(NanoHTTPD.IHTTPSession session) {
        String strName = session.getMethod().name();
        s01.E("事件订阅请求: method=", strName, ", uri=", session.getUri(), TAG);
        if (!Intrinsics.areEqual(strName, "SUBSCRIBE")) {
            if (Intrinsics.areEqual(strName, "UNSUBSCRIBE")) {
                NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/xml", "");
                responseNewFixedLengthResponse.getClass();
                return responseNewFixedLengthResponse;
            }
            NanoHTTPD.Response responseNewFixedLengthResponse2 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.METHOD_NOT_ALLOWED, NanoHTTPD.MIME_PLAINTEXT, "Method Not Allowed");
            responseNewFixedLengthResponse2.getClass();
            return responseNewFixedLengthResponse2;
        }
        String str = "uuid:" + UUID.randomUUID();
        NanoHTTPD.Response responseNewFixedLengthResponse3 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/xml", "");
        responseNewFixedLengthResponse3.addHeader("SID", str);
        responseNewFixedLengthResponse3.addHeader(Intents.Scan.TIMEOUT, "Second-1800");
        return responseNewFixedLengthResponse3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    private final NanoHTTPD.Response handleGetCurrentTransportActions() {
        String str;
        switch (this.transportState) {
            case "NO_MEDIA_PRESENT":
                str = "Play";
                break;
            case "STOPPED":
                str = "Play,Seek";
                break;
            case "PAUSED_PLAYBACK":
                str = "Play,Stop,Seek";
                break;
            case "PLAYING":
                str = "Pause,Stop,Seek";
                break;
            default:
                str = "Play,Pause,Stop,Seek";
                break;
        }
        return createSoapResponse(StringsKt.trimIndent("\n            <u:GetCurrentTransportActionsResponse xmlns:u=\"urn:schemas-upnp-org:service:AVTransport:1\">\n                <Actions>" + str + "</Actions>\n            </u:GetCurrentTransportActionsResponse>\n        "));
    }

    private final NanoHTTPD.Response handleGetDeviceCapabilities() {
        return createSoapResponse("<u:GetDeviceCapabilitiesResponse xmlns:u=\"urn:schemas-upnp-org:service:AVTransport:1\">\n    <PlayMedia>NETWORK,NONE</PlayMedia>\n    <RecMedia>NOT_IMPLEMENTED</RecMedia>\n    <RecQualityModes>NOT_IMPLEMENTED</RecQualityModes>\n</u:GetDeviceCapabilitiesResponse>");
    }

    private final NanoHTTPD.Response handleGetMediaInfo() {
        String time = formatTime(this.currentDuration);
        String strEscapeXml = escapeXml(this.currentUri);
        String strEscapeXml2 = escapeXml(this.currentMetadata);
        StringBuilder sbZ = kb0.z("\n            <u:GetMediaInfoResponse xmlns:u=\"urn:schemas-upnp-org:service:AVTransport:1\">\n                <NrTracks>1</NrTracks>\n                <MediaDuration>", time, "</MediaDuration>\n                <CurrentURI>", strEscapeXml, "</CurrentURI>\n                <CurrentURIMetaData>");
        sbZ.append(strEscapeXml2);
        sbZ.append("</CurrentURIMetaData>\n                <NextURI></NextURI>\n                <NextURIMetaData></NextURIMetaData>\n                <PlayMedium>NETWORK</PlayMedium>\n                <RecordMedium>NOT_IMPLEMENTED</RecordMedium>\n                <WriteStatus>NOT_IMPLEMENTED</WriteStatus>\n            </u:GetMediaInfoResponse>\n        ");
        return createSoapResponse(StringsKt.trimIndent(sbZ.toString()));
    }

    private final NanoHTTPD.Response handleGetPositionInfo() {
        String time = formatTime(this.currentPosition);
        String time2 = formatTime(this.currentDuration);
        String strEscapeXml = escapeXml(this.currentMetadata);
        String strEscapeXml2 = escapeXml(this.currentUri);
        StringBuilder sbZ = kb0.z("\n            <u:GetPositionInfoResponse xmlns:u=\"urn:schemas-upnp-org:service:AVTransport:1\">\n                <Track>1</Track>\n                <TrackDuration>", time2, "</TrackDuration>\n                <TrackMetaData>", strEscapeXml, "</TrackMetaData>\n                <TrackURI>");
        i02.v(sbZ, strEscapeXml2, "</TrackURI>\n                <RelTime>", time, "</RelTime>\n                <AbsTime>");
        sbZ.append(time);
        sbZ.append("</AbsTime>\n                <RelCount>2147483647</RelCount>\n                <AbsCount>2147483647</AbsCount>\n            </u:GetPositionInfoResponse>\n        ");
        return createSoapResponse(StringsKt.trimIndent(sbZ.toString()));
    }

    private final NanoHTTPD.Response handleGetTransportInfo() {
        return createSoapResponse(StringsKt.trimIndent("\n            <u:GetTransportInfoResponse xmlns:u=\"urn:schemas-upnp-org:service:AVTransport:1\">\n                <CurrentTransportState>" + this.transportState + "</CurrentTransportState>\n                <CurrentTransportStatus>OK</CurrentTransportStatus>\n                <CurrentSpeed>1</CurrentSpeed>\n            </u:GetTransportInfoResponse>\n        "));
    }

    private final NanoHTTPD.Response handleGetTransportSettings() {
        return createSoapResponse("<u:GetTransportSettingsResponse xmlns:u=\"urn:schemas-upnp-org:service:AVTransport:1\">\n    <PlayMode>NORMAL</PlayMode>\n    <RecQualityMode>NOT_IMPLEMENTED</RecQualityMode>\n</u:GetTransportSettingsResponse>");
    }

    private final NanoHTTPD.Response handlePause() {
        Log.d(TAG, "Pause");
        this.transportState = "PAUSED_PLAYBACK";
        DlnaService dlnaService = this.service;
        Intent intent = new Intent(DlnaConstants.ACTION_CONTROL);
        intent.putExtra(DlnaConstants.EXTRA_COMMAND, DlnaConstants.CMD_PAUSE);
        intent.setPackage(this.service.getPackageName());
        dlnaService.sendBroadcast(intent);
        return createSoapResponse("<u:PauseResponse xmlns:u=\"urn:schemas-upnp-org:service:AVTransport:1\">\n</u:PauseResponse>");
    }

    private final NanoHTTPD.Response handlePlay() {
        Log.d(TAG, "Play");
        this.transportState = "PLAYING";
        DlnaService dlnaService = this.service;
        Intent intent = new Intent(DlnaConstants.ACTION_CONTROL);
        intent.putExtra(DlnaConstants.EXTRA_COMMAND, DlnaConstants.CMD_PLAY);
        intent.setPackage(this.service.getPackageName());
        dlnaService.sendBroadcast(intent);
        return createSoapResponse("<u:PlayResponse xmlns:u=\"urn:schemas-upnp-org:service:AVTransport:1\">\n</u:PlayResponse>");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final NanoHTTPD.Response handleRenderingControl(NanoHTTPD.IHTTPSession session) {
        String strReplace$default;
        try {
            HashMap map = new HashMap();
            session.parseBody(map);
            String str = (String) map.get("postData");
            if (str == null) {
                str = "";
            }
            String str2 = session.getHeaders().get("soapaction");
            if (str2 == null || (strReplace$default = StringsKt__StringsJVMKt.replace$default(str2, "\"", "", false, 4, (Object) null)) == null) {
                strReplace$default = "";
            }
            String strSubstringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(strReplace$default, "#", (String) null, 2, (Object) null);
            Log.d(TAG, "========== RenderingControl SOAP 请求 ==========");
            Log.d(TAG, "Action: " + strSubstringAfterLast$default);
            Log.d(TAG, "SOAP Body: ".concat(str));
            switch (strSubstringAfterLast$default.hashCode()) {
                case -1620484612:
                    if (strSubstringAfterLast$default.equals("SetVolume")) {
                        return createSoapResponse("<u:SetVolumeResponse xmlns:u=\"urn:schemas-upnp-org:service:RenderingControl:1\">\n</u:SetVolumeResponse>");
                    }
                    break;
                case -1405867536:
                    if (strSubstringAfterLast$default.equals("GetVolume")) {
                        return createSoapResponse("<u:GetVolumeResponse xmlns:u=\"urn:schemas-upnp-org:service:RenderingControl:1\">\n    <CurrentVolume>50</CurrentVolume>\n</u:GetVolumeResponse>");
                    }
                    break;
                case -645523077:
                    if (strSubstringAfterLast$default.equals("SetMute")) {
                        return createSoapResponse("<u:SetMuteResponse xmlns:u=\"urn:schemas-upnp-org:service:RenderingControl:1\">\n</u:SetMuteResponse>");
                    }
                    break;
                case 1589334639:
                    if (strSubstringAfterLast$default.equals("GetMute")) {
                        return createSoapResponse("<u:GetMuteResponse xmlns:u=\"urn:schemas-upnp-org:service:RenderingControl:1\">\n    <CurrentMute>0</CurrentMute>\n</u:GetMuteResponse>");
                    }
                    break;
            }
            return createSoapResponse("");
        } catch (Exception e) {
            Log.e(TAG, "处理 RenderingControl 请求失败", e);
            NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.INTERNAL_ERROR, NanoHTTPD.MIME_PLAINTEXT, "Error");
            responseNewFixedLengthResponse.getClass();
            return responseNewFixedLengthResponse;
        }
    }

    private final NanoHTTPD.Response handleSeek(String soapBody) {
        String strExtractXmlValue = extractXmlValue(soapBody, "Unit");
        if (strExtractXmlValue == null) {
            strExtractXmlValue = "REL_TIME";
        }
        String strExtractXmlValue2 = extractXmlValue(soapBody, "Target");
        if (strExtractXmlValue2 == null) {
            strExtractXmlValue2 = "00:00:00";
        }
        s01.E("Seek: unit=", strExtractXmlValue, ", target=", strExtractXmlValue2, TAG);
        long seekTarget = parseSeekTarget(strExtractXmlValue, strExtractXmlValue2);
        DlnaService dlnaService = this.service;
        Intent intent = new Intent(DlnaConstants.ACTION_CONTROL);
        intent.putExtra(DlnaConstants.EXTRA_COMMAND, DlnaConstants.CMD_SEEK);
        intent.putExtra(DlnaConstants.EXTRA_POSITION, seekTarget);
        intent.setPackage(this.service.getPackageName());
        dlnaService.sendBroadcast(intent);
        return createSoapResponse("<u:SeekResponse xmlns:u=\"urn:schemas-upnp-org:service:AVTransport:1\">\n</u:SeekResponse>");
    }

    private final NanoHTTPD.Response handleSetAvTransportUri(String soapBody) {
        String strExtractXmlValue = extractXmlValue(soapBody, "CurrentURI");
        if (strExtractXmlValue == null) {
            strExtractXmlValue = "";
        }
        String strExtractXmlValue2 = extractXmlValue(soapBody, "CurrentURIMetaData");
        String str = strExtractXmlValue2 != null ? strExtractXmlValue2 : "";
        Log.d(TAG, "SetAVTransportURI: uri=".concat(strExtractXmlValue));
        this.currentUri = strExtractXmlValue;
        this.currentMetadata = str;
        this.transportState = "STOPPED";
        this.service.handlePlayRequest(strExtractXmlValue, extractXmlValue(str, "dc:title"), str);
        return createSoapResponse("<u:SetAVTransportURIResponse xmlns:u=\"urn:schemas-upnp-org:service:AVTransport:1\">\n</u:SetAVTransportURIResponse>");
    }

    private final NanoHTTPD.Response handleSetNextAvTransportUri(String soapBody) {
        String strExtractXmlValue = extractXmlValue(soapBody, "NextURI");
        if (strExtractXmlValue == null) {
            strExtractXmlValue = "";
        }
        extractXmlValue(soapBody, "NextURIMetaData");
        Log.d(TAG, "SetNextAVTransportURI: nextUri=".concat(strExtractXmlValue));
        return createSoapResponse("<u:SetNextAVTransportURIResponse xmlns:u=\"urn:schemas-upnp-org:service:AVTransport:1\">\n</u:SetNextAVTransportURIResponse>");
    }

    private final NanoHTTPD.Response handleStop() {
        Log.d(TAG, "Stop");
        this.transportState = "STOPPED";
        DlnaService dlnaService = this.service;
        Intent intent = new Intent(DlnaConstants.ACTION_CONTROL);
        intent.putExtra(DlnaConstants.EXTRA_COMMAND, DlnaConstants.CMD_STOP);
        intent.setPackage(this.service.getPackageName());
        dlnaService.sendBroadcast(intent);
        return createSoapResponse("<u:StopResponse xmlns:u=\"urn:schemas-upnp-org:service:AVTransport:1\">\n</u:StopResponse>");
    }

    private final long parseSeekTarget(String unit, String target) {
        Long longOrNull;
        String upperCase = unit.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        long jLongValue = 0;
        if (Intrinsics.areEqual(upperCase, "REL_TIME") || Intrinsics.areEqual(upperCase, "ABS_TIME")) {
            List listSplit$default = StringsKt__StringsKt.split$default(target, new String[]{":"}, false, 0, 6, (Object) null);
            if (listSplit$default.size() == 3) {
                Long longOrNull2 = StringsKt.toLongOrNull((String) listSplit$default.get(0));
                long jLongValue2 = longOrNull2 != null ? longOrNull2.longValue() : 0L;
                Long longOrNull3 = StringsKt.toLongOrNull((String) listSplit$default.get(1));
                long jLongValue3 = longOrNull3 != null ? longOrNull3.longValue() : 0L;
                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(2), new String[]{"."}, false, 0, 6, (Object) null);
                Long longOrNull4 = StringsKt.toLongOrNull((String) listSplit$default2.get(0));
                long jLongValue4 = longOrNull4 != null ? longOrNull4.longValue() : 0L;
                if (listSplit$default2.size() > 1 && (longOrNull = StringsKt.toLongOrNull(StringsKt.take(StringsKt__StringsKt.padEnd((String) listSplit$default2.get(1), 3, '0'), 3))) != null) {
                    jLongValue = longOrNull.longValue();
                }
                return (((jLongValue3 * 60) + (jLongValue2 * 3600) + jLongValue4) * 1000) + jLongValue;
            }
        } else {
            Long longOrNull5 = StringsKt.toLongOrNull(target);
            if (longOrNull5 != null) {
                return longOrNull5.longValue();
            }
        }
        return 0L;
    }

    private final NanoHTTPD.Response serveAvTransportDescription() {
        NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/xml; charset=\"utf-8\"", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<scpd xmlns=\"urn:schemas-upnp-org:service-1-0\">\n    <specVersion><major>1</major><minor>0</minor></specVersion>\n    <actionList>\n        <action><name>SetAVTransportURI</name>\n            <argumentList>\n                <argument><name>InstanceID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable></argument>\n                <argument><name>CurrentURI</name><direction>in</direction><relatedStateVariable>AVTransportURI</relatedStateVariable></argument>\n                <argument><name>CurrentURIMetaData</name><direction>in</direction><relatedStateVariable>AVTransportURIMetaData</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n        <action><name>SetNextAVTransportURI</name>\n            <argumentList>\n                <argument><name>InstanceID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable></argument>\n                <argument><name>NextURI</name><direction>in</direction><relatedStateVariable>NextAVTransportURI</relatedStateVariable></argument>\n                <argument><name>NextURIMetaData</name><direction>in</direction><relatedStateVariable>NextAVTransportURIMetaData</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n        <action><name>Play</name>\n            <argumentList>\n                <argument><name>InstanceID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable></argument>\n                <argument><name>Speed</name><direction>in</direction><relatedStateVariable>TransportPlaySpeed</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n        <action><name>Pause</name>\n            <argumentList>\n                <argument><name>InstanceID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n        <action><name>Stop</name>\n            <argumentList>\n                <argument><name>InstanceID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n        <action><name>Seek</name>\n            <argumentList>\n                <argument><name>InstanceID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable></argument>\n                <argument><name>Unit</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_SeekMode</relatedStateVariable></argument>\n                <argument><name>Target</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_SeekTarget</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n        <action><name>GetTransportInfo</name>\n            <argumentList>\n                <argument><name>InstanceID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable></argument>\n                <argument><name>CurrentTransportState</name><direction>out</direction><relatedStateVariable>TransportState</relatedStateVariable></argument>\n                <argument><name>CurrentTransportStatus</name><direction>out</direction><relatedStateVariable>TransportStatus</relatedStateVariable></argument>\n                <argument><name>CurrentSpeed</name><direction>out</direction><relatedStateVariable>TransportPlaySpeed</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n        <action><name>GetPositionInfo</name>\n            <argumentList>\n                <argument><name>InstanceID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable></argument>\n                <argument><name>Track</name><direction>out</direction><relatedStateVariable>CurrentTrack</relatedStateVariable></argument>\n                <argument><name>TrackDuration</name><direction>out</direction><relatedStateVariable>CurrentTrackDuration</relatedStateVariable></argument>\n                <argument><name>TrackMetaData</name><direction>out</direction><relatedStateVariable>CurrentTrackMetaData</relatedStateVariable></argument>\n                <argument><name>TrackURI</name><direction>out</direction><relatedStateVariable>CurrentTrackURI</relatedStateVariable></argument>\n                <argument><name>RelTime</name><direction>out</direction><relatedStateVariable>RelativeTimePosition</relatedStateVariable></argument>\n                <argument><name>AbsTime</name><direction>out</direction><relatedStateVariable>AbsoluteTimePosition</relatedStateVariable></argument>\n                <argument><name>RelCount</name><direction>out</direction><relatedStateVariable>RelativeCounterPosition</relatedStateVariable></argument>\n                <argument><name>AbsCount</name><direction>out</direction><relatedStateVariable>AbsoluteCounterPosition</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n        <action><name>GetMediaInfo</name>\n            <argumentList>\n                <argument><name>InstanceID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable></argument>\n                <argument><name>NrTracks</name><direction>out</direction><relatedStateVariable>NumberOfTracks</relatedStateVariable></argument>\n                <argument><name>MediaDuration</name><direction>out</direction><relatedStateVariable>CurrentMediaDuration</relatedStateVariable></argument>\n                <argument><name>CurrentURI</name><direction>out</direction><relatedStateVariable>AVTransportURI</relatedStateVariable></argument>\n                <argument><name>CurrentURIMetaData</name><direction>out</direction><relatedStateVariable>AVTransportURIMetaData</relatedStateVariable></argument>\n                <argument><name>NextURI</name><direction>out</direction><relatedStateVariable>NextAVTransportURI</relatedStateVariable></argument>\n                <argument><name>NextURIMetaData</name><direction>out</direction><relatedStateVariable>NextAVTransportURIMetaData</relatedStateVariable></argument>\n                <argument><name>PlayMedium</name><direction>out</direction><relatedStateVariable>PlaybackStorageMedium</relatedStateVariable></argument>\n                <argument><name>RecordMedium</name><direction>out</direction><relatedStateVariable>RecordStorageMedium</relatedStateVariable></argument>\n                <argument><name>WriteStatus</name><direction>out</direction><relatedStateVariable>RecordMediumWriteStatus</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n        <action><name>GetDeviceCapabilities</name>\n            <argumentList>\n                <argument><name>InstanceID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable></argument>\n                <argument><name>PlayMedia</name><direction>out</direction><relatedStateVariable>PossiblePlaybackStorageMedia</relatedStateVariable></argument>\n                <argument><name>RecMedia</name><direction>out</direction><relatedStateVariable>PossibleRecordStorageMedia</relatedStateVariable></argument>\n                <argument><name>RecQualityModes</name><direction>out</direction><relatedStateVariable>PossibleRecordQualityModes</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n        <action><name>GetTransportSettings</name>\n            <argumentList>\n                <argument><name>InstanceID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable></argument>\n                <argument><name>PlayMode</name><direction>out</direction><relatedStateVariable>CurrentPlayMode</relatedStateVariable></argument>\n                <argument><name>RecQualityMode</name><direction>out</direction><relatedStateVariable>CurrentRecordQualityMode</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n        <action><name>GetCurrentTransportActions</name>\n            <argumentList>\n                <argument><name>InstanceID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable></argument>\n                <argument><name>Actions</name><direction>out</direction><relatedStateVariable>CurrentTransportActions</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n    </actionList>\n    <serviceStateTable>\n        <stateVariable sendEvents=\"no\"><name>TransportState</name><dataType>string</dataType><allowedValueList><allowedValue>STOPPED</allowedValue><allowedValue>PLAYING</allowedValue><allowedValue>TRANSITIONING</allowedValue><allowedValue>PAUSED_PLAYBACK</allowedValue><allowedValue>NO_MEDIA_PRESENT</allowedValue></allowedValueList></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>TransportStatus</name><dataType>string</dataType><allowedValueList><allowedValue>OK</allowedValue><allowedValue>ERROR_OCCURRED</allowedValue></allowedValueList></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>TransportPlaySpeed</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>AVTransportURI</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>AVTransportURIMetaData</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>NextAVTransportURI</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>NextAVTransportURIMetaData</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>CurrentTrack</name><dataType>ui4</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>CurrentTrackDuration</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>CurrentTrackMetaData</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>CurrentTrackURI</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>RelativeTimePosition</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>AbsoluteTimePosition</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>RelativeCounterPosition</name><dataType>i4</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>AbsoluteCounterPosition</name><dataType>i4</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>NumberOfTracks</name><dataType>ui4</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>CurrentMediaDuration</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>PlaybackStorageMedium</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>RecordStorageMedium</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>RecordMediumWriteStatus</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>PossiblePlaybackStorageMedia</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>PossibleRecordStorageMedia</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>PossibleRecordQualityModes</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>CurrentPlayMode</name><dataType>string</dataType><allowedValueList><allowedValue>NORMAL</allowedValue></allowedValueList></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>CurrentRecordQualityMode</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>CurrentTransportActions</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>A_ARG_TYPE_InstanceID</name><dataType>ui4</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>A_ARG_TYPE_SeekMode</name><dataType>string</dataType><allowedValueList><allowedValue>REL_TIME</allowedValue><allowedValue>ABS_TIME</allowedValue></allowedValueList></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>A_ARG_TYPE_SeekTarget</name><dataType>string</dataType></stateVariable>\n    </serviceStateTable>\n</scpd>");
        responseNewFixedLengthResponse.getClass();
        return responseNewFixedLengthResponse;
    }

    private final NanoHTTPD.Response serveConnectionManagerDescription() {
        NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/xml", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<scpd xmlns=\"urn:schemas-upnp-org:service-1-0\">\n    <specVersion><major>1</major><minor>0</minor></specVersion>\n    <actionList>\n        <action><name>GetProtocolInfo</name>\n            <argumentList>\n                <argument><name>Source</name><direction>out</direction><relatedStateVariable>SourceProtocolInfo</relatedStateVariable></argument>\n                <argument><name>Sink</name><direction>out</direction><relatedStateVariable>SinkProtocolInfo</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n        <action><name>GetCurrentConnectionIDs</name>\n            <argumentList>\n                <argument><name>ConnectionIDs</name><direction>out</direction><relatedStateVariable>CurrentConnectionIDs</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n        <action><name>GetCurrentConnectionInfo</name>\n            <argumentList>\n                <argument><name>ConnectionID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_ConnectionID</relatedStateVariable></argument>\n                <argument><name>RcsID</name><direction>out</direction><relatedStateVariable>A_ARG_TYPE_RcsID</relatedStateVariable></argument>\n                <argument><name>AVTransportID</name><direction>out</direction><relatedStateVariable>A_ARG_TYPE_AVTransportID</relatedStateVariable></argument>\n                <argument><name>ProtocolInfo</name><direction>out</direction><relatedStateVariable>A_ARG_TYPE_ProtocolInfo</relatedStateVariable></argument>\n                <argument><name>PeerConnectionManager</name><direction>out</direction><relatedStateVariable>A_ARG_TYPE_ConnectionManager</relatedStateVariable></argument>\n                <argument><name>PeerConnectionID</name><direction>out</direction><relatedStateVariable>A_ARG_TYPE_ConnectionID</relatedStateVariable></argument>\n                <argument><name>Direction</name><direction>out</direction><relatedStateVariable>A_ARG_TYPE_Direction</relatedStateVariable></argument>\n                <argument><name>Status</name><direction>out</direction><relatedStateVariable>A_ARG_TYPE_ConnectionStatus</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n    </actionList>\n    <serviceStateTable>\n        <stateVariable sendEvents=\"yes\"><name>SourceProtocolInfo</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"yes\"><name>SinkProtocolInfo</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"yes\"><name>CurrentConnectionIDs</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>A_ARG_TYPE_ConnectionStatus</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>A_ARG_TYPE_ConnectionManager</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>A_ARG_TYPE_Direction</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>A_ARG_TYPE_ProtocolInfo</name><dataType>string</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>A_ARG_TYPE_ConnectionID</name><dataType>i4</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>A_ARG_TYPE_AVTransportID</name><dataType>i4</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>A_ARG_TYPE_RcsID</name><dataType>i4</dataType></stateVariable>\n    </serviceStateTable>\n</scpd>");
        responseNewFixedLengthResponse.getClass();
        return responseNewFixedLengthResponse;
    }

    private final NanoHTTPD.Response serveDeviceDescription() {
        String localIp = getLocalIp();
        int listeningPort = getListeningPort();
        String str = this.deviceName;
        String str2 = this.deviceUuid;
        StringBuilder sbZ = kb0.z("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<root xmlns=\"urn:schemas-upnp-org:device-1-0\" xmlns:dlna=\"urn:schemas-dlna-org:device-1-0\">\n    <specVersion>\n        <major>1</major>\n        <minor>0</minor>\n    </specVersion>\n    <device>\n        <deviceType>urn:schemas-upnp-org:device:MediaRenderer:1</deviceType>\n        <presentationURL>/</presentationURL>\n        <friendlyName>", str, "</friendlyName>\n        <manufacturer>ChaiChai</manufacturer>\n        <manufacturerURL>https://github.com/chaichai</manufacturerURL>\n        <modelDescription>DLNA Digital Media Renderer</modelDescription>\n        <modelName>ChaiChaiTV</modelName>\n        <modelNumber>1.0</modelNumber>\n        <modelURL>https://github.com/chaichai</modelURL>\n        <UPC>000000000000</UPC>\n        <serialNumber>", str2, "</serialNumber>\n        <UDN>uuid:");
        i02.v(sbZ, str2, "</UDN>\n        <dlna:X_DLNADOC xmlns:dlna=\"urn:schemas-dlna-org:device-1-0\">DMR-1.50</dlna:X_DLNADOC>\n        <serviceList>\n            <service>\n                <serviceType>urn:schemas-upnp-org:service:AVTransport:1</serviceType>\n                <serviceId>urn:upnp-org:serviceId:AVTransport</serviceId>\n                <SCPDURL>/AVTransport.xml</SCPDURL>\n                <controlURL>/AVTransport/control</controlURL>\n                <eventSubURL>/AVTransport/event</eventSubURL>\n            </service>\n            <service>\n                <serviceType>urn:schemas-upnp-org:service:ConnectionManager:1</serviceType>\n                <serviceId>urn:upnp-org:serviceId:ConnectionManager</serviceId>\n                <SCPDURL>/ConnectionManager.xml</SCPDURL>\n                <controlURL>/ConnectionManager/control</controlURL>\n                <eventSubURL>/ConnectionManager/event</eventSubURL>\n            </service>\n            <service>\n                <serviceType>urn:schemas-upnp-org:service:RenderingControl:1</serviceType>\n                <serviceId>urn:upnp-org:serviceId:RenderingControl</serviceId>\n                <SCPDURL>/RenderingControl.xml</SCPDURL>\n                <controlURL>/RenderingControl/control</controlURL>\n                <eventSubURL>/RenderingControl/event</eventSubURL>\n            </service>\n        </serviceList>\n    </device>\n    <URLBase>http://", localIp, ":");
        String strF = ll0.f(sbZ, listeningPort, "</URLBase>\n</root>");
        Log.d(TAG, "设备描述 XML 长度: " + strF.length());
        NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/xml; charset=\"utf-8\"", strF);
        responseNewFixedLengthResponse.getClass();
        return responseNewFixedLengthResponse;
    }

    private final NanoHTTPD.Response serveRenderingControlDescription() {
        NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/xml", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<scpd xmlns=\"urn:schemas-upnp-org:service-1-0\">\n    <specVersion><major>1</major><minor>0</minor></specVersion>\n    <actionList>\n        <action><name>GetVolume</name>\n            <argumentList>\n                <argument><name>InstanceID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable></argument>\n                <argument><name>Channel</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_Channel</relatedStateVariable></argument>\n                <argument><name>CurrentVolume</name><direction>out</direction><relatedStateVariable>Volume</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n        <action><name>SetVolume</name>\n            <argumentList>\n                <argument><name>InstanceID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable></argument>\n                <argument><name>Channel</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_Channel</relatedStateVariable></argument>\n                <argument><name>DesiredVolume</name><direction>in</direction><relatedStateVariable>Volume</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n        <action><name>GetMute</name>\n            <argumentList>\n                <argument><name>InstanceID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable></argument>\n                <argument><name>Channel</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_Channel</relatedStateVariable></argument>\n                <argument><name>CurrentMute</name><direction>out</direction><relatedStateVariable>Mute</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n        <action><name>SetMute</name>\n            <argumentList>\n                <argument><name>InstanceID</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_InstanceID</relatedStateVariable></argument>\n                <argument><name>Channel</name><direction>in</direction><relatedStateVariable>A_ARG_TYPE_Channel</relatedStateVariable></argument>\n                <argument><name>DesiredMute</name><direction>in</direction><relatedStateVariable>Mute</relatedStateVariable></argument>\n            </argumentList>\n        </action>\n    </actionList>\n    <serviceStateTable>\n        <stateVariable sendEvents=\"no\"><name>Volume</name><dataType>ui2</dataType><allowedValueRange><minimum>0</minimum><maximum>100</maximum></allowedValueRange></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>Mute</name><dataType>boolean</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>A_ARG_TYPE_InstanceID</name><dataType>ui4</dataType></stateVariable>\n        <stateVariable sendEvents=\"no\"><name>A_ARG_TYPE_Channel</name><dataType>string</dataType></stateVariable>\n    </serviceStateTable>\n</scpd>");
        responseNewFixedLengthResponse.getClass();
        return responseNewFixedLengthResponse;
    }

    private final String unescapeXml(String text) {
        return StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(text, "&lt;", "<", false, 4, (Object) null), "&gt;", ">", false, 4, (Object) null), "&quot;", "\"", false, 4, (Object) null), "&apos;", "'", false, 4, (Object) null), "&amp;", "&", false, 4, (Object) null);
    }

    @Override // fi.iki.elonen.NanoHTTPD
    public NanoHTTPD.Response serve(NanoHTTPD.IHTTPSession session) {
        NanoHTTPD.Response responseNewFixedLengthResponse;
        session.getClass();
        String uri = session.getUri();
        NanoHTTPD.Method method = session.getMethod();
        Log.d(TAG, "========== 收到 HTTP 请求 ==========");
        Log.d(TAG, "方法: " + method + ", URI: " + uri);
        String remoteIpAddress = session.getRemoteIpAddress();
        StringBuilder sb = new StringBuilder("来源: ");
        sb.append(remoteIpAddress);
        Log.d(TAG, sb.toString());
        Log.d(TAG, "Headers: " + session.getHeaders());
        if (Intrinsics.areEqual(uri, "/description.xml")) {
            Log.d(TAG, "返回设备描述文档");
            responseNewFixedLengthResponse = serveDeviceDescription();
        } else if (Intrinsics.areEqual(uri, "/AVTransport.xml")) {
            Log.d(TAG, "返回 AVTransport 服务描述");
            responseNewFixedLengthResponse = serveAvTransportDescription();
        } else if (Intrinsics.areEqual(uri, "/RenderingControl.xml")) {
            Log.d(TAG, "返回 RenderingControl 服务描述");
            responseNewFixedLengthResponse = serveRenderingControlDescription();
        } else if (Intrinsics.areEqual(uri, "/ConnectionManager.xml")) {
            Log.d(TAG, "返回 ConnectionManager 服务描述");
            responseNewFixedLengthResponse = serveConnectionManagerDescription();
        } else if (Intrinsics.areEqual(uri, "/AVTransport/control")) {
            responseNewFixedLengthResponse = handleAvTransportControl(session);
        } else if (Intrinsics.areEqual(uri, "/RenderingControl/control")) {
            responseNewFixedLengthResponse = handleRenderingControl(session);
        } else if (Intrinsics.areEqual(uri, "/ConnectionManager/control")) {
            responseNewFixedLengthResponse = handleConnectionManager(session);
        } else {
            uri.getClass();
            if (StringsKt__StringsJVMKt.endsWith$default(uri, "/event", false, 2, null)) {
                responseNewFixedLengthResponse = handleEventSubscription(session);
            } else {
                Log.w(TAG, "未知请求: ".concat(uri));
                responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.NOT_FOUND, NanoHTTPD.MIME_PLAINTEXT, "Not Found");
            }
        }
        responseNewFixedLengthResponse.addHeader("Access-Control-Allow-Origin", "*");
        responseNewFixedLengthResponse.addHeader("Access-Control-Allow-Methods", "GET, POST, SUBSCRIBE, UNSUBSCRIBE");
        responseNewFixedLengthResponse.addHeader("Access-Control-Allow-Headers", "Content-Type, SOAPACTION, CALLBACK, NT, TIMEOUT");
        Log.d(TAG, "响应状态: " + responseNewFixedLengthResponse.getStatus());
        return responseNewFixedLengthResponse;
    }

    @Override // fi.iki.elonen.NanoHTTPD
    public void start() {
        super.start();
        Log.d(TAG, "HTTP 服务器已启动: hostname=" + getHostname() + ", port=" + getListeningPort());
        Log.d(TAG, "访问地址: http://" + getLocalIp() + ":" + getListeningPort() + "/description.xml");
    }

    public final void updatePlaybackState(String state, long position, long duration) {
        state.getClass();
        this.transportState = state;
        this.currentPosition = position;
        this.currentDuration = duration;
    }

    public /* synthetic */ DlnaHttpServer(DlnaService dlnaService, String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dlnaService, str, str2, (i2 & 8) != 0 ? 0 : i);
    }
}
