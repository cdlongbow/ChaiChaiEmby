package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import com.dh.myembyapp.data.model.DanmakuConfig;
import com.google.gson.Gson;
import defpackage.i02;
import defpackage.kb0;
import defpackage.tl0;
import fi.iki.elonen.NanoHTTPD;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\u000fJ\u0006\u0010\u0010\u001a\u00020\u000bJ\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0018\u00010\u0007R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/dh/myembyapp/server/DanmakuConfigServerManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "server", "Lcom/dh/myembyapp/server/DanmakuConfigServerManager$DanmakuConfigServer;", "gson", "Lcom/google/gson/Gson;", "startServer", "", "currentConfig", "Lcom/dh/myembyapp/data/model/DanmakuConfig;", "onConfigReceived", "Lkotlin/Function1;", "stopServer", "getServerUrl", "", "Companion", DanmakuConfigServerManager.TAG, "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DanmakuConfigServerManager {
    private static final int PORT = 8766;
    private static final String TAG = "DanmakuConfigServer";
    private final Context context;
    private final Gson gson;
    private DanmakuConfigServer server;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/dh/myembyapp/server/DanmakuConfigServerManager$DanmakuConfigServer;", "Lfi/iki/elonen/NanoHTTPD;", "currentConfig", "Lcom/dh/myembyapp/data/model/DanmakuConfig;", "onConfigReceived", "Lkotlin/Function1;", "", "<init>", "(Lcom/dh/myembyapp/server/DanmakuConfigServerManager;Lcom/dh/myembyapp/data/model/DanmakuConfig;Lkotlin/jvm/functions/Function1;)V", "escapeHtml", "", "value", "serve", "Lfi/iki/elonen/NanoHTTPD$Response;", "session", "Lfi/iki/elonen/NanoHTTPD$IHTTPSession;", "serveHtmlPage", "handleConfigPost", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class DanmakuConfigServer extends NanoHTTPD {
        private final DanmakuConfig currentConfig;
        private final Function1<DanmakuConfig, Unit> onConfigReceived;
        final /* synthetic */ DanmakuConfigServerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DanmakuConfigServer(DanmakuConfigServerManager danmakuConfigServerManager, DanmakuConfig danmakuConfig, Function1<? super DanmakuConfig, Unit> function1) {
            super(DanmakuConfigServerManager.PORT);
            danmakuConfig.getClass();
            function1.getClass();
            this.this$0 = danmakuConfigServerManager;
            this.currentConfig = danmakuConfig;
            this.onConfigReceived = function1;
        }

        private final String escapeHtml(String value) {
            return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(value, "&", "&amp;", false, 4, (Object) null), "\"", "&quot;", false, 4, (Object) null), "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
        }

        private final NanoHTTPD.Response handleConfigPost(NanoHTTPD.IHTTPSession session) {
            try {
                HashMap map = new HashMap();
                session.parseBody(map);
                String str = (String) map.get("postData");
                if (str == null) {
                    NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.BAD_REQUEST, "text/plain; charset=UTF-8", "No data");
                    responseNewFixedLengthResponse.getClass();
                    return responseNewFixedLengthResponse;
                }
                Log.d(DanmakuConfigServerManager.TAG, "Received config data: ".concat(str));
                DanmakuConfig danmakuConfig = (DanmakuConfig) this.this$0.gson.fromJson(str, DanmakuConfig.class);
                Log.d(DanmakuConfigServerManager.TAG, "Parsed config: enabled=" + danmakuConfig.getEnabled() + ", apiNames=" + danmakuConfig.getApiNames() + ", apiUrls=" + danmakuConfig.getApiUrls());
                BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new DanmakuConfigServerManager$DanmakuConfigServer$handleConfigPost$1(this, danmakuConfig, null), 3, null);
                NanoHTTPD.Response responseNewFixedLengthResponse2 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "application/json; charset=UTF-8", "{\"success\":true}");
                responseNewFixedLengthResponse2.getClass();
                return responseNewFixedLengthResponse2;
            } catch (Exception e) {
                Log.e(DanmakuConfigServerManager.TAG, "Handle config post failed", e);
                NanoHTTPD.Response responseNewFixedLengthResponse3 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.INTERNAL_ERROR, "text/plain; charset=UTF-8", "Error: " + e.getMessage());
                responseNewFixedLengthResponse3.getClass();
                return responseNewFixedLengthResponse3;
            }
        }

        private final NanoHTTPD.Response serveHtmlPage() {
            List<String> apiSlotUrls = this.currentConfig.getApiSlotUrls();
            List<String> apiSlotNames = this.currentConfig.getApiSlotNames();
            String str = this.currentConfig.getEnabled() ? "checked" : "";
            String strEscapeHtml = escapeHtml(apiSlotNames.get(0));
            String strEscapeHtml2 = escapeHtml(apiSlotUrls.get(0));
            String str2 = this.currentConfig.isApiUseProxy(0) ? "checked" : "";
            String strEscapeHtml3 = escapeHtml(apiSlotNames.get(1));
            String strEscapeHtml4 = escapeHtml(apiSlotUrls.get(1));
            String str3 = this.currentConfig.isApiUseProxy(1) ? "checked" : "";
            String strEscapeHtml5 = escapeHtml(apiSlotNames.get(2));
            String strEscapeHtml6 = escapeHtml(apiSlotUrls.get(2));
            String str4 = this.currentConfig.isApiUseProxy(2) ? "checked" : "";
            String strEscapeHtml7 = escapeHtml(apiSlotNames.get(3));
            String strEscapeHtml8 = escapeHtml(apiSlotUrls.get(3));
            String str5 = this.currentConfig.isApiUseProxy(3) ? "checked" : "";
            String strEscapeHtml9 = escapeHtml(apiSlotNames.get(4));
            String strEscapeHtml10 = escapeHtml(apiSlotUrls.get(4));
            String str6 = this.currentConfig.isApiUseProxy(4) ? "checked" : "";
            StringBuilder sbZ = kb0.z("\n<!DOCTYPE html>\n<html lang=\"zh-CN\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>弹幕配置</title>\n    <style>\n        * { margin: 0; padding: 0; box-sizing: border-box; }\n        body {\n            font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, sans-serif;\n            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);\n            min-height: 100vh;\n            padding: 20px;\n        }\n        .container {\n            max-width: 500px;\n            margin: 0 auto;\n            background: white;\n            border-radius: 16px;\n            padding: 30px;\n            box-shadow: 0 20px 60px rgba(0,0,0,0.3);\n        }\n        h1 { color: #333; margin-bottom: 10px; font-size: 24px; }\n        .subtitle { color: #666; margin-bottom: 20px; font-size: 14px; }\n        .form-group { margin-bottom: 16px; }\n        label { display: block; margin-bottom: 6px; color: #555; font-weight: 500; font-size: 14px; }\n        input[type=\"text\"] {\n            width: 100%;\n            padding: 10px 12px;\n            border: 2px solid #e0e0e0;\n            border-radius: 8px;\n            font-size: 14px;\n            transition: border-color 0.3s;\n        }\n        input[type=\"text\"]:focus { outline: none; border-color: #667eea; }\n        .switch-group { display: flex; justify-content: space-between; align-items: center; margin-bottom: 20px; }\n        .switch { position: relative; display: inline-block; width: 60px; height: 34px; }\n        .switch input { opacity: 0; width: 0; height: 0; }\n        .slider {\n            position: absolute; cursor: pointer; top: 0; left: 0; right: 0; bottom: 0;\n            background-color: #ccc; transition: .4s; border-radius: 34px;\n        }\n        .slider:before {\n            position: absolute; content: \"\"; height: 26px; width: 26px;\n            left: 4px; bottom: 4px; background-color: white;\n            transition: .4s; border-radius: 50%;\n        }\n        input:checked + .slider { background-color: #2196F3; }\n        input:checked + .slider:before { transform: translateX(26px); }\n        button {\n            width: 100%; padding: 14px;\n            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);\n            color: white; border: none; border-radius: 8px;\n            font-size: 16px; font-weight: 600; cursor: pointer;\n            transition: transform 0.2s; margin-top: 10px;\n        }\n        button:active { transform: scale(0.98); }\n        .success, .error {\n            position: fixed; top: 20px; left: 50%; transform: translateX(-50%);\n            padding: 16px 24px; border-radius: 8px; text-align: center;\n            display: none; box-shadow: 0 4px 12px rgba(0,0,0,0.15);\n            z-index: 1000; min-width: 200px;\n        }\n        .success { background: #10b981; color: white; }\n        .error { background: #ef4444; color: white; }\n        .api-hint { font-size: 12px; color: #888; margin-bottom: 16px; }\n        .checkbox-label {\n            display: flex; align-items: center; margin-top: 8px; padding: 8px;\n            font-size: 13px; color: #666; font-weight: normal;\n        }\n        .checkbox-label input[type=\"checkbox\"] {\n            margin-right: 6px; width: 18px; height: 18px; cursor: pointer;\n        }\n        .api-group {\n            padding-bottom: 16px;\n            border-bottom: 2px dashed rgba(0,0,0,0.2);\n            margin-bottom: 20px;\n        }\n        .api-group:last-of-type {\n            border-bottom: none;\n            margin-bottom: 0;\n        }\n        .field-row {\n            display: grid;\n            gap: 10px;\n        }\n    </style>\n</head>\n<body>\n    <div class=\"container\">\n        <h1>🎯 弹幕配置</h1>\n        <p class=\"subtitle\">配置您的弹幕功能</p>\n        \n        <form id=\"configForm\">\n            <div class=\"form-group switch-group\">\n                <label>启用弹幕功能</label>\n                <label class=\"switch\">\n                    <input type=\"checkbox\" id=\"enabled\" ", str, ">\n                    <span class=\"slider\"></span>\n                </label>\n            </div>\n            \n            <p class=\"api-hint\">弹幕API地址（最多5个，按顺序轮询查询）</p>\n            \n            <div class=\"form-group api-group\">\n                <div class=\"field-row\">\n                    <div>\n                        <label>弹幕API 1 名称</label>\n                        <input type=\"text\" id=\"apiName1\" placeholder=\"弹幕API1\" value=\"", strEscapeHtml, "\">\n                    </div>\n                    <div>\n                        <label>弹幕API 1 地址</label>\n                        <input type=\"text\" id=\"apiUrl1\" placeholder=\"https://api.dandanplay.net\" value=\"");
            i02.v(sbZ, strEscapeHtml2, "\">\n                    </div>\n                </div>\n                <label class=\"checkbox-label\">\n                    <input type=\"checkbox\" id=\"useProxy1\" ", str2, ">\n                    使用代理\n                </label>\n            </div>\n            \n            <div class=\"form-group api-group\">\n                <div class=\"field-row\">\n                    <div>\n                        <label>弹幕API 2 名称</label>\n                        <input type=\"text\" id=\"apiName2\" placeholder=\"弹幕API2\" value=\"");
            i02.v(sbZ, strEscapeHtml3, "\">\n                    </div>\n                    <div>\n                        <label>弹幕API 2 地址</label>\n                        <input type=\"text\" id=\"apiUrl2\" placeholder=\"备用API地址\" value=\"", strEscapeHtml4, "\">\n                    </div>\n                </div>\n                <label class=\"checkbox-label\">\n                    <input type=\"checkbox\" id=\"useProxy2\" ");
            i02.v(sbZ, str3, ">\n                    使用代理\n                </label>\n            </div>\n            \n            <div class=\"form-group api-group\">\n                <div class=\"field-row\">\n                    <div>\n                        <label>弹幕API 3 名称</label>\n                        <input type=\"text\" id=\"apiName3\" placeholder=\"弹幕API3\" value=\"", strEscapeHtml5, "\">\n                    </div>\n                    <div>\n                        <label>弹幕API 3 地址</label>\n                        <input type=\"text\" id=\"apiUrl3\" placeholder=\"备用API地址\" value=\"");
            i02.v(sbZ, strEscapeHtml6, "\">\n                    </div>\n                </div>\n                <label class=\"checkbox-label\">\n                    <input type=\"checkbox\" id=\"useProxy3\" ", str4, ">\n                    使用代理\n                </label>\n            </div>\n            \n            <div class=\"form-group api-group\">\n                <div class=\"field-row\">\n                    <div>\n                        <label>弹幕API 4 名称</label>\n                        <input type=\"text\" id=\"apiName4\" placeholder=\"弹幕API4\" value=\"");
            i02.v(sbZ, strEscapeHtml7, "\">\n                    </div>\n                    <div>\n                        <label>弹幕API 4 地址</label>\n                        <input type=\"text\" id=\"apiUrl4\" placeholder=\"备用API地址\" value=\"", strEscapeHtml8, "\">\n                    </div>\n                </div>\n                <label class=\"checkbox-label\">\n                    <input type=\"checkbox\" id=\"useProxy4\" ");
            i02.v(sbZ, str5, ">\n                    使用代理\n                </label>\n            </div>\n            \n            <div class=\"form-group api-group\">\n                <div class=\"field-row\">\n                    <div>\n                        <label>弹幕API 5 名称</label>\n                        <input type=\"text\" id=\"apiName5\" placeholder=\"弹幕API5\" value=\"", strEscapeHtml9, "\">\n                    </div>\n                    <div>\n                        <label>弹幕API 5 地址</label>\n                        <input type=\"text\" id=\"apiUrl5\" placeholder=\"备用API地址\" value=\"");
            sbZ.append(strEscapeHtml10);
            sbZ.append("\">\n                    </div>\n                </div>\n                <label class=\"checkbox-label\">\n                    <input type=\"checkbox\" id=\"useProxy5\" ");
            sbZ.append(str6);
            sbZ.append(">\n                    使用代理\n                </label>\n            </div>\n            \n            <button type=\"button\" id=\"submitBtn\">📺 同步到电视</button>\n        </form>\n    </div>\n    \n    <div class=\"success\" id=\"success\">✅ 配置已成功发送到电视！</div>\n    <div class=\"error\" id=\"error\">❌ 发送失败，请重试</div>\n    \n        <script>\n            document.getElementById('submitBtn').addEventListener('click', async () => {\n                const apiNames = [\n                    document.getElementById('apiName1').value.trim() || '弹幕API1',\n                    document.getElementById('apiName2').value.trim() || '弹幕API2',\n                    document.getElementById('apiName3').value.trim() || '弹幕API3',\n                    document.getElementById('apiName4').value.trim() || '弹幕API4',\n                    document.getElementById('apiName5').value.trim() || '弹幕API5'\n                ];\n                const apiUrls = [\n                    document.getElementById('apiUrl1').value.trim(),\n                    document.getElementById('apiUrl2').value.trim(),\n                    document.getElementById('apiUrl3').value.trim(),\n                    document.getElementById('apiUrl4').value.trim(),\n                    document.getElementById('apiUrl5').value.trim()\n                ];\n            \n                // 收集代理开关状态\n                const apiUrlsUseProxy = {\n                0: document.getElementById('useProxy1').checked,\n                1: document.getElementById('useProxy2').checked,\n                2: document.getElementById('useProxy3').checked,\n                3: document.getElementById('useProxy4').checked,\n                4: document.getElementById('useProxy5').checked\n            };\n            \n            const config = {\n                enabled: document.getElementById('enabled').checked,\n                apiUrl: apiUrls.find(url => url.length > 0) || '',\n                apiUrls: apiUrls,\n                apiNames: apiNames,\n                apiUrlsUseProxy: apiUrlsUseProxy\n            };\n            \n            try {\n                const response = await fetch('/config', {\n                    method: 'POST',\n                    headers: { 'Content-Type': 'application/json; charset=UTF-8' },\n                    body: JSON.stringify(config)\n                });\n                \n                if (response.ok) {\n                    document.getElementById('success').style.display = 'block';\n                    document.getElementById('error').style.display = 'none';\n                    setTimeout(() => document.getElementById('success').style.display = 'none', 3000);\n                } else {\n                    throw new Error('Failed');\n                }\n            } catch (error) {\n                document.getElementById('error').style.display = 'block';\n                document.getElementById('success').style.display = 'none';\n                setTimeout(() => document.getElementById('error').style.display = 'none', 5000);\n            }\n        });\n    </script>\n</body>\n</html>\n            ");
            NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/html; charset=UTF-8", StringsKt.trimIndent(sbZ.toString()));
            responseNewFixedLengthResponse.addHeader("Content-Type", "text/html; charset=UTF-8");
            return responseNewFixedLengthResponse;
        }

        @Override // fi.iki.elonen.NanoHTTPD
        public NanoHTTPD.Response serve(NanoHTTPD.IHTTPSession session) {
            session.getClass();
            String uri = session.getUri();
            if (Intrinsics.areEqual(uri, "/")) {
                return serveHtmlPage();
            }
            if (Intrinsics.areEqual(uri, "/config") && session.getMethod() == NanoHTTPD.Method.POST) {
                return handleConfigPost(session);
            }
            NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.NOT_FOUND, NanoHTTPD.MIME_PLAINTEXT, "Not Found");
            responseNewFixedLengthResponse.getClass();
            return responseNewFixedLengthResponse;
        }
    }

    public DanmakuConfigServerManager(Context context) {
        context.getClass();
        this.context = context;
        this.gson = new Gson();
    }

    public final String getServerUrl() {
        String strB = tl0.b(this.context, PORT);
        return strB == null ? "http://192.168.1.1:8766" : strB;
    }

    public final void startServer(DanmakuConfig currentConfig, Function1<? super DanmakuConfig, Unit> onConfigReceived) throws IOException {
        currentConfig.getClass();
        onConfigReceived.getClass();
        stopServer();
        DanmakuConfigServer danmakuConfigServer = new DanmakuConfigServer(this, currentConfig, onConfigReceived);
        this.server = danmakuConfigServer;
        danmakuConfigServer.start();
    }

    public final void stopServer() {
        DanmakuConfigServer danmakuConfigServer = this.server;
        if (danmakuConfigServer != null) {
            danmakuConfigServer.stop();
        }
        this.server = null;
    }
}
