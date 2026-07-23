package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import defpackage.tl0;
import fi.iki.elonen.NanoHTTPD;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bJ\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0018\u00010\u0007R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/dh/myembyapp/server/DanmakuSearchInputServerManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "server", "Lcom/dh/myembyapp/server/DanmakuSearchInputServerManager$DanmakuSearchInputServer;", "startServer", "", "onSearchReceived", "Lkotlin/Function1;", "", "stopServer", "getServerUrl", "Companion", "DanmakuSearchInputServer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DanmakuSearchInputServerManager {
    private static final int PORT = 8768;
    private static final String TAG = "DanmakuSearchServer";
    private final Context context;
    private DanmakuSearchInputServer server;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/dh/myembyapp/server/DanmakuSearchInputServerManager$DanmakuSearchInputServer;", "Lfi/iki/elonen/NanoHTTPD;", "onSearchReceived", "Lkotlin/Function1;", "", "", "<init>", "(Lcom/dh/myembyapp/server/DanmakuSearchInputServerManager;Lkotlin/jvm/functions/Function1;)V", "serve", "Lfi/iki/elonen/NanoHTTPD$Response;", "session", "Lfi/iki/elonen/NanoHTTPD$IHTTPSession;", "serveHtmlPage", "handleSearchPost", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class DanmakuSearchInputServer extends NanoHTTPD {
        private final Function1<String, Unit> onSearchReceived;
        final /* synthetic */ DanmakuSearchInputServerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DanmakuSearchInputServer(DanmakuSearchInputServerManager danmakuSearchInputServerManager, Function1<? super String, Unit> function1) {
            super(DanmakuSearchInputServerManager.PORT);
            function1.getClass();
            this.this$0 = danmakuSearchInputServerManager;
            this.onSearchReceived = function1;
        }

        private final NanoHTTPD.Response handleSearchPost(NanoHTTPD.IHTTPSession session) {
            try {
                HashMap map = new HashMap();
                session.parseBody(map);
                String string = (String) map.get("postData");
                if (string == null) {
                    NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.BAD_REQUEST, "text/plain; charset=UTF-8", "No data");
                    responseNewFixedLengthResponse.getClass();
                    return responseNewFixedLengthResponse;
                }
                Log.d(DanmakuSearchInputServerManager.TAG, "Received danmaku search data: ".concat(string));
                try {
                    string = new JSONObject(string).getString("keyword");
                } catch (Exception unused) {
                }
                Log.d(DanmakuSearchInputServerManager.TAG, "Danmaku search keyword: " + string);
                BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new DanmakuSearchInputServerManager$DanmakuSearchInputServer$handleSearchPost$1(this, string, null), 3, null);
                NanoHTTPD.Response responseNewFixedLengthResponse2 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "application/json; charset=UTF-8", "{\"success\":true}");
                responseNewFixedLengthResponse2.getClass();
                return responseNewFixedLengthResponse2;
            } catch (Exception e) {
                Log.e(DanmakuSearchInputServerManager.TAG, "Handle danmaku search post failed", e);
                NanoHTTPD.Response responseNewFixedLengthResponse3 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.INTERNAL_ERROR, "text/plain; charset=UTF-8", "Error: " + e.getMessage());
                responseNewFixedLengthResponse3.getClass();
                return responseNewFixedLengthResponse3;
            }
        }

        private final NanoHTTPD.Response serveHtmlPage() {
            NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/html; charset=UTF-8", "<!DOCTYPE html>\n<html lang=\"zh-CN\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>弹幕搜索</title>\n    <style>\n        * { margin: 0; padding: 0; box-sizing: border-box; }\n        body {\n            font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, sans-serif;\n            background: linear-gradient(135deg, #f093fb 0%, #f5576c 100%);\n            min-height: 100vh;\n            padding: 20px;\n            display: flex;\n            align-items: center;\n            justify-content: center;\n        }\n        .container {\n            max-width: 400px;\n            width: 100%;\n            background: white;\n            border-radius: 16px;\n            padding: 30px;\n            box-shadow: 0 20px 60px rgba(0,0,0,0.3);\n        }\n        h1 { color: #333; margin-bottom: 10px; font-size: 24px; text-align: center; }\n        .subtitle { color: #666; margin-bottom: 24px; font-size: 14px; text-align: center; }\n        .form-group { margin-bottom: 20px; }\n        input[type=\"text\"] {\n            width: 100%;\n            padding: 14px 16px;\n            border: 2px solid #e0e0e0;\n            border-radius: 12px;\n            font-size: 16px;\n            transition: border-color 0.3s;\n        }\n        input[type=\"text\"]:focus { outline: none; border-color: #f5576c; }\n        button {\n            width: 100%; padding: 14px;\n            background: linear-gradient(135deg, #f093fb 0%, #f5576c 100%);\n            color: white; border: none; border-radius: 12px;\n            font-size: 16px; font-weight: 600; cursor: pointer;\n            transition: transform 0.2s, opacity 0.2s;\n        }\n        button:active { transform: scale(0.98); }\n        button:disabled { opacity: 0.6; cursor: not-allowed; }\n        .success, .error {\n            position: fixed; top: 20px; left: 50%; transform: translateX(-50%);\n            padding: 16px 24px; border-radius: 8px; text-align: center;\n            display: none; box-shadow: 0 4px 12px rgba(0,0,0,0.15);\n            z-index: 1000; min-width: 200px;\n        }\n        .success { background: #10b981; color: white; }\n        .error { background: #ef4444; color: white; }\n        .tips {\n            margin-top: 20px;\n            padding: 12px;\n            background: #fff3cd;\n            border-radius: 8px;\n            font-size: 13px;\n            color: #856404;\n        }\n        .history { margin-top: 20px; }\n        .history-title { font-size: 14px; color: #888; margin-bottom: 10px; }\n        .history-item {\n            padding: 10px 14px;\n            background: #f5f5f5;\n            border-radius: 8px;\n            margin-bottom: 8px;\n            cursor: pointer;\n            transition: background 0.2s;\n        }\n        .history-item:hover { background: #e8e8e8; }\n    </style>\n</head>\n<body>\n    <div class=\"container\">\n        <h1>🎬 弹幕搜索</h1>\n        <p class=\"subtitle\">输入番剧/电影名称，同步到电视搜索弹幕</p>\n        \n        <div class=\"form-group\">\n            <input type=\"text\" id=\"searchInput\" placeholder=\"输入名称，如：凡人修仙传\" autofocus>\n        </div>\n        \n        <button type=\"button\" id=\"searchBtn\">📺 发送到电视</button>\n        \n        <div class=\"tips\">\n            💡 提示：搜索时仅保留番剧名或电影名称即可，不需要包含集数信息\n        </div>\n        \n        <div class=\"history\" id=\"historySection\" style=\"display: none;\">\n            <div class=\"history-title\">搜索历史</div>\n            <div id=\"historyList\"></div>\n        </div>\n    </div>\n    \n    <div class=\"success\" id=\"success\">✅ 已发送到电视！</div>\n    <div class=\"error\" id=\"error\">❌ 发送失败，请重试</div>\n    \n    <script>\n        const searchInput = document.getElementById('searchInput');\n        const searchBtn = document.getElementById('searchBtn');\n        const historySection = document.getElementById('historySection');\n        const historyList = document.getElementById('historyList');\n        \n        // 加载搜索历史\n        function loadHistory() {\n            const history = JSON.parse(localStorage.getItem('danmakuSearchHistory') || '[]');\n            if (history.length > 0) {\n                historySection.style.display = 'block';\n                historyList.innerHTML = history.slice(0, 5).map(item => \n                    '<div class=\"history-item\" onclick=\"useHistory(\\'' + item.replace(/'/g, \"\\\\'\") + '\\')\">' + item + '</div>'\n                ).join('');\n            }\n        }\n        \n        // 保存搜索历史\n        function saveHistory(keyword) {\n            let history = JSON.parse(localStorage.getItem('danmakuSearchHistory') || '[]');\n            history = history.filter(item => item !== keyword);\n            history.unshift(keyword);\n            history = history.slice(0, 10);\n            localStorage.setItem('danmakuSearchHistory', JSON.stringify(history));\n            loadHistory();\n        }\n        \n        // 使用历史记录\n        window.useHistory = function(keyword) {\n            searchInput.value = keyword;\n            sendSearch();\n        }\n        \n        // 发送搜索\n        async function sendSearch() {\n            const keyword = searchInput.value.trim();\n            if (!keyword) {\n                searchInput.focus();\n                return;\n            }\n            \n            searchBtn.disabled = true;\n            searchBtn.textContent = '发送中...';\n            \n            try {\n                const response = await fetch('/search', {\n                    method: 'POST',\n                    headers: { 'Content-Type': 'application/json; charset=UTF-8' },\n                    body: JSON.stringify({ keyword: keyword })\n                });\n                \n                if (response.ok) {\n                    saveHistory(keyword);\n                    document.getElementById('success').style.display = 'block';\n                    document.getElementById('error').style.display = 'none';\n                    setTimeout(() => document.getElementById('success').style.display = 'none', 2000);\n                } else {\n                    throw new Error('Failed');\n                }\n            } catch (error) {\n                document.getElementById('error').style.display = 'block';\n                document.getElementById('success').style.display = 'none';\n                setTimeout(() => document.getElementById('error').style.display = 'none', 3000);\n            } finally {\n                searchBtn.disabled = false;\n                searchBtn.textContent = '📺 发送到电视';\n            }\n        }\n        \n        searchBtn.addEventListener('click', sendSearch);\n        searchInput.addEventListener('keypress', (e) => {\n            if (e.key === 'Enter') sendSearch();\n        });\n        \n        loadHistory();\n    </script>\n</body>\n</html>");
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
            if (Intrinsics.areEqual(uri, "/search") && session.getMethod() == NanoHTTPD.Method.POST) {
                return handleSearchPost(session);
            }
            NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.NOT_FOUND, NanoHTTPD.MIME_PLAINTEXT, "Not Found");
            responseNewFixedLengthResponse.getClass();
            return responseNewFixedLengthResponse;
        }
    }

    public DanmakuSearchInputServerManager(Context context) {
        context.getClass();
        this.context = context;
    }

    public final String getServerUrl() {
        String strB = tl0.b(this.context, PORT);
        return strB == null ? "http://192.168.1.1:8768" : strB;
    }

    public final void startServer(Function1<? super String, Unit> onSearchReceived) {
        onSearchReceived.getClass();
        stopServer();
        DanmakuSearchInputServer danmakuSearchInputServer = new DanmakuSearchInputServer(this, onSearchReceived);
        this.server = danmakuSearchInputServer;
        try {
            danmakuSearchInputServer.start();
            Log.d(TAG, "弹幕搜索服务器启动成功，端口: 8768");
        } catch (Exception e) {
            Log.e(TAG, "弹幕搜索服务器启动失败", e);
        }
    }

    public final void stopServer() {
        DanmakuSearchInputServer danmakuSearchInputServer = this.server;
        if (danmakuSearchInputServer != null) {
            danmakuSearchInputServer.stop();
        }
        this.server = null;
    }
}
