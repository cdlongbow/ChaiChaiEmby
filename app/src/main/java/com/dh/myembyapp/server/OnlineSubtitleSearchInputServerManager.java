package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import defpackage.tl0;
import fi.iki.elonen.NanoHTTPD;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bJ\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0018\u00010\u0007R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/dh/myembyapp/server/OnlineSubtitleSearchInputServerManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "server", "Lcom/dh/myembyapp/server/OnlineSubtitleSearchInputServerManager$OnlineSubtitleSearchInputServer;", "startServer", "", "onSearchReceived", "Lkotlin/Function1;", "", "stopServer", "getServerUrl", "Companion", "OnlineSubtitleSearchInputServer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OnlineSubtitleSearchInputServerManager {
    private static final int PORT = 8769;
    private static final String TAG = "OnlineSubtitleSearchServer";
    private final Context context;
    private OnlineSubtitleSearchInputServer server;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/dh/myembyapp/server/OnlineSubtitleSearchInputServerManager$OnlineSubtitleSearchInputServer;", "Lfi/iki/elonen/NanoHTTPD;", "onSearchReceived", "Lkotlin/Function1;", "", "", "<init>", "(Lcom/dh/myembyapp/server/OnlineSubtitleSearchInputServerManager;Lkotlin/jvm/functions/Function1;)V", "serve", "Lfi/iki/elonen/NanoHTTPD$Response;", "session", "Lfi/iki/elonen/NanoHTTPD$IHTTPSession;", "serveHtmlPage", "handleSearchPost", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class OnlineSubtitleSearchInputServer extends NanoHTTPD {
        private final Function1<String, Unit> onSearchReceived;
        final /* synthetic */ OnlineSubtitleSearchInputServerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OnlineSubtitleSearchInputServer(OnlineSubtitleSearchInputServerManager onlineSubtitleSearchInputServerManager, Function1<? super String, Unit> function1) {
            super(OnlineSubtitleSearchInputServerManager.PORT);
            function1.getClass();
            this.this$0 = onlineSubtitleSearchInputServerManager;
            this.onSearchReceived = function1;
        }

        private final NanoHTTPD.Response handleSearchPost(NanoHTTPD.IHTTPSession session) {
            NanoHTTPD.Response responseNewFixedLengthResponse;
            String str;
            try {
                session.parseBody(new HashMap());
                List<String> list = session.getParameters().get("keyword");
                String string = (list == null || (str = (String) CollectionsKt.firstOrNull((List) list)) == null) ? null : StringsKt.trim((CharSequence) str).toString();
                if (string == null) {
                    string = "";
                }
                if (StringsKt.isBlank(string)) {
                    responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.BAD_REQUEST, NanoHTTPD.MIME_PLAINTEXT, "Keyword is required");
                } else {
                    this.onSearchReceived.invoke(string);
                    responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, NanoHTTPD.MIME_PLAINTEXT, "OK");
                }
                responseNewFixedLengthResponse.getClass();
                return responseNewFixedLengthResponse;
            } catch (Exception e) {
                Log.e(OnlineSubtitleSearchInputServerManager.TAG, "Handle search post failed", e);
                NanoHTTPD.Response responseNewFixedLengthResponse2 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.INTERNAL_ERROR, NanoHTTPD.MIME_PLAINTEXT, "Internal Server Error");
                responseNewFixedLengthResponse2.getClass();
                return responseNewFixedLengthResponse2;
            }
        }

        private final NanoHTTPD.Response serveHtmlPage() {
            NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/html; charset=UTF-8", "<!DOCTYPE html>\n<html lang=\"zh-CN\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>在线字幕搜索</title>\n    <style>\n        * { margin: 0; padding: 0; box-sizing: border-box; }\n        body {\n            font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, sans-serif;\n            background: linear-gradient(135deg, #0f172a 0%, #1d4ed8 100%);\n            min-height: 100vh;\n            padding: 20px;\n            display: flex;\n            align-items: center;\n            justify-content: center;\n        }\n        .container {\n            max-width: 420px;\n            width: 100%;\n            background: white;\n            border-radius: 16px;\n            padding: 30px;\n            box-shadow: 0 20px 60px rgba(0,0,0,0.3);\n        }\n        h1 { color: #111827; margin-bottom: 10px; font-size: 24px; text-align: center; }\n        .subtitle { color: #6b7280; margin-bottom: 24px; font-size: 14px; text-align: center; }\n        input[type=\"text\"] {\n            width: 100%;\n            padding: 14px 16px;\n            border: 2px solid #d1d5db;\n            border-radius: 12px;\n            font-size: 16px;\n            transition: border-color 0.3s;\n            margin-bottom: 16px;\n        }\n        input[type=\"text\"]:focus { outline: none; border-color: #2563eb; }\n        button {\n            width: 100%;\n            padding: 14px;\n            background: linear-gradient(135deg, #2563eb 0%, #1d4ed8 100%);\n            color: white;\n            border: none;\n            border-radius: 12px;\n            font-size: 16px;\n            font-weight: 600;\n            cursor: pointer;\n        }\n        .tips {\n            margin-top: 18px;\n            padding: 12px;\n            background: #eff6ff;\n            border-radius: 8px;\n            font-size: 13px;\n            color: #1d4ed8;\n        }\n        .success, .error {\n            position: fixed;\n            top: 20px;\n            left: 50%;\n            transform: translateX(-50%);\n            padding: 16px 24px;\n            border-radius: 8px;\n            display: none;\n            z-index: 1000;\n        }\n        .success { background: #10b981; color: white; }\n        .error { background: #ef4444; color: white; }\n    </style>\n</head>\n<body>\n    <div class=\"container\">\n        <h1>字幕搜索</h1>\n        <p class=\"subtitle\">输入影片名或剧名，同步到电视搜索在线字幕</p>\n        <input type=\"text\" id=\"searchInput\" placeholder=\"例如：沙丘 / 进击的巨人\" autofocus>\n        <button type=\"button\" id=\"searchBtn\">发送到电视</button>\n        <div class=\"tips\">提示：这里只输入片名或剧名即可，不需要包含分辨率或字幕格式。</div>\n    </div>\n    <div class=\"success\" id=\"success\">已发送到电视</div>\n    <div class=\"error\" id=\"error\">发送失败，请重试</div>\n    <script>\n        const searchInput = document.getElementById('searchInput');\n        const searchBtn = document.getElementById('searchBtn');\n        const success = document.getElementById('success');\n        const error = document.getElementById('error');\n\n        async function sendSearch() {\n            const keyword = searchInput.value.trim();\n            if (!keyword) {\n                searchInput.focus();\n                return;\n            }\n            searchBtn.disabled = true;\n            try {\n                const response = await fetch('/search', {\n                    method: 'POST',\n                    headers: { 'Content-Type': 'application/x-www-form-urlencoded' },\n                    body: 'keyword=' + encodeURIComponent(keyword)\n                });\n                if (response.ok) {\n                    success.style.display = 'block';\n                    setTimeout(() => success.style.display = 'none', 2000);\n                } else {\n                    throw new Error('request failed');\n                }\n            } catch (e) {\n                error.style.display = 'block';\n                setTimeout(() => error.style.display = 'none', 2000);\n            } finally {\n                searchBtn.disabled = false;\n            }\n        }\n\n        searchBtn.addEventListener('click', sendSearch);\n        searchInput.addEventListener('keypress', (e) => {\n            if (e.key === 'Enter') sendSearch();\n        });\n    </script>\n</body>\n</html>");
            responseNewFixedLengthResponse.getClass();
            return responseNewFixedLengthResponse;
        }

        @Override // fi.iki.elonen.NanoHTTPD
        public NanoHTTPD.Response serve(NanoHTTPD.IHTTPSession session) {
            session.getClass();
            if (Intrinsics.areEqual(session.getUri(), "/")) {
                return serveHtmlPage();
            }
            if (Intrinsics.areEqual(session.getUri(), "/search") && session.getMethod() == NanoHTTPD.Method.POST) {
                return handleSearchPost(session);
            }
            NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.NOT_FOUND, NanoHTTPD.MIME_PLAINTEXT, "Not Found");
            responseNewFixedLengthResponse.getClass();
            return responseNewFixedLengthResponse;
        }
    }

    public OnlineSubtitleSearchInputServerManager(Context context) {
        context.getClass();
        this.context = context;
    }

    public final String getServerUrl() {
        String strB = tl0.b(this.context, PORT);
        return strB == null ? "http://192.168.1.1:8769" : strB;
    }

    public final void startServer(Function1<? super String, Unit> onSearchReceived) {
        onSearchReceived.getClass();
        stopServer();
        OnlineSubtitleSearchInputServer onlineSubtitleSearchInputServer = new OnlineSubtitleSearchInputServer(this, onSearchReceived);
        this.server = onlineSubtitleSearchInputServer;
        try {
            onlineSubtitleSearchInputServer.start();
            Log.d(TAG, "在线字幕搜索服务器启动成功，端口: 8769");
        } catch (Exception e) {
            Log.e(TAG, "在线字幕搜索服务器启动失败", e);
        }
    }

    public final void stopServer() {
        OnlineSubtitleSearchInputServer onlineSubtitleSearchInputServer = this.server;
        if (onlineSubtitleSearchInputServer != null) {
            onlineSubtitleSearchInputServer.stop();
        }
        this.server = null;
    }
}
