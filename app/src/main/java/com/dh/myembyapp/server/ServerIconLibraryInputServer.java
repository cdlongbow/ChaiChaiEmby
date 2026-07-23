package com.dh.myembyapp.server;

import android.util.Log;
import fi.iki.elonen.NanoHTTPD;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/dh/myembyapp/server/ServerIconLibraryInputServer;", "Lfi/iki/elonen/NanoHTTPD;", "port", "", "initialUrl", "", "onUrlReceived", "Lkotlin/Function1;", "", "<init>", "(ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "escapedInitialUrl", "serve", "Lfi/iki/elonen/NanoHTTPD$Response;", "session", "Lfi/iki/elonen/NanoHTTPD$IHTTPSession;", "serveHtml", "handleSave", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class ServerIconLibraryInputServer extends NanoHTTPD {
    private final String escapedInitialUrl;
    private final Function1<String, Unit> onUrlReceived;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ServerIconLibraryInputServer(int i, String str, Function1<? super String, Unit> function1) {
        super(i);
        str.getClass();
        function1.getClass();
        this.onUrlReceived = function1;
        this.escapedInitialUrl = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, "&", "&amp;", false, 4, (Object) null), "\"", "&quot;", false, 4, (Object) null), "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
    }

    private final NanoHTTPD.Response handleSave(NanoHTTPD.IHTTPSession session) {
        Object objM8825constructorimpl;
        String strOptString;
        try {
            HashMap map = new HashMap();
            session.parseBody(map);
            String str = (String) map.get("postData");
            String str2 = "";
            if (str == null) {
                str = "";
            }
            if (StringsKt.isBlank(str)) {
                NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.BAD_REQUEST, "text/plain; charset=UTF-8", "Missing body");
                responseNewFixedLengthResponse.getClass();
                return responseNewFixedLengthResponse;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(new JSONObject(str));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
            }
            String string = null;
            if (Result.m8831isFailureimpl(objM8825constructorimpl)) {
                objM8825constructorimpl = null;
            }
            JSONObject jSONObject = (JSONObject) objM8825constructorimpl;
            if (jSONObject != null && (strOptString = jSONObject.optString("url")) != null) {
                string = StringsKt.trim((CharSequence) strOptString).toString();
            }
            if (string != null) {
                str2 = string;
            }
            if (StringsKt.isBlank(str2)) {
                NanoHTTPD.Response responseNewFixedLengthResponse2 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.BAD_REQUEST, "text/plain; charset=UTF-8", "Missing url");
                responseNewFixedLengthResponse2.getClass();
                return responseNewFixedLengthResponse2;
            }
            this.onUrlReceived.invoke(str2);
            NanoHTTPD.Response responseNewFixedLengthResponse3 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "application/json; charset=UTF-8", "{\"success\":true}");
            responseNewFixedLengthResponse3.getClass();
            return responseNewFixedLengthResponse3;
        } catch (Exception e) {
            Log.e("ServerIconInputSrv", "保存图标库 URL 失败", e);
            NanoHTTPD.Response responseNewFixedLengthResponse4 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.INTERNAL_ERROR, "text/plain; charset=UTF-8", "Error: " + e.getMessage());
            responseNewFixedLengthResponse4.getClass();
            return responseNewFixedLengthResponse4;
        }
    }

    private final NanoHTTPD.Response serveHtml() {
        NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/html; charset=UTF-8", StringsKt.trimIndent("\n<!DOCTYPE html>\n<html lang=\"zh-CN\">\n<head>\n  <meta charset=\"UTF-8\" />\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n  <title>图标库 URL</title>\n  <style>\n    * { margin: 0; padding: 0; box-sizing: border-box; }\n    body {\n      font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, sans-serif;\n      min-height: 100vh;\n      display: flex;\n      justify-content: center;\n      align-items: center;\n      background: linear-gradient(135deg, #111827 0%, #1f2937 100%);\n      color: #fff;\n      padding: 20px;\n    }\n    .card {\n      width: 100%;\n      max-width: 560px;\n      background: rgba(17, 24, 39, 0.92);\n      border: 1px solid rgba(148, 163, 184, 0.22);\n      border-radius: 16px;\n      padding: 24px;\n      box-shadow: 0 24px 60px rgba(0, 0, 0, 0.35);\n    }\n    h1 { font-size: 24px; margin-bottom: 10px; }\n    p { color: #cbd5e1; font-size: 14px; line-height: 1.6; margin-bottom: 16px; }\n    input {\n      width: 100%;\n      padding: 13px 14px;\n      border-radius: 10px;\n      border: 1px solid rgba(148, 163, 184, 0.45);\n      background: #0f172a;\n      color: #fff;\n      font-size: 15px;\n      outline: none;\n    }\n    input:focus { border-color: #38bdf8; }\n    button {\n      width: 100%;\n      margin-top: 16px;\n      padding: 13px 14px;\n      border: none;\n      border-radius: 10px;\n      background: #0284c7;\n      color: #fff;\n      font-size: 15px;\n      font-weight: 600;\n      cursor: pointer;\n    }\n    .msg { margin-top: 14px; min-height: 20px; color: #bae6fd; font-size: 13px; }\n  </style>\n</head>\n<body>\n  <div class=\"card\">\n    <h1>图标库 URL</h1>\n    <p>输入图标库 JSON 地址并保存，电视会立即加载图标列表。支持直接粘贴 http/https 链接。</p>\n    <input id=\"url\" type=\"text\" value=\"" + this.escapedInitialUrl + "\" placeholder=\"请输入图标库 URL\" />\n    <button onclick=\"saveUrl()\">保存到电视</button>\n    <div id=\"msg\" class=\"msg\"></div>\n  </div>\n  <script>\n    async function saveUrl() {\n      const url = document.getElementById('url').value.trim();\n      const msg = document.getElementById('msg');\n      if (!url) {\n        msg.textContent = '请输入图标库 URL';\n        return;\n      }\n      msg.textContent = '提交中...';\n      try {\n        const res = await fetch('/save', {\n          method: 'POST',\n          headers: { 'Content-Type': 'application/json; charset=UTF-8' },\n          body: JSON.stringify({ url: url })\n        });\n        if (!res.ok) {\n          const text = await res.text();\n          msg.textContent = '提交失败：' + text;\n          return;\n        }\n        msg.textContent = '提交成功，电视正在加载图标库';\n      } catch (e) {\n        msg.textContent = '提交失败：' + (e && e.message ? e.message : '未知错误');\n      }\n    }\n  </script>\n</body>\n</html>\n        "));
        responseNewFixedLengthResponse.addHeader("Content-Type", "text/html; charset=UTF-8");
        return responseNewFixedLengthResponse;
    }

    @Override // fi.iki.elonen.NanoHTTPD
    public NanoHTTPD.Response serve(NanoHTTPD.IHTTPSession session) {
        session.getClass();
        if (Intrinsics.areEqual(session.getUri(), "/")) {
            return serveHtml();
        }
        if (Intrinsics.areEqual(session.getUri(), "/save") && session.getMethod() == NanoHTTPD.Method.POST) {
            return handleSave(session);
        }
        NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.NOT_FOUND, NanoHTTPD.MIME_PLAINTEXT, "Not Found");
        responseNewFixedLengthResponse.getClass();
        return responseNewFixedLengthResponse;
    }
}
