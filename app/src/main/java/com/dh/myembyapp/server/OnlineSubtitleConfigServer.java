package com.dh.myembyapp.server;

import android.util.Log;
import defpackage.kb0;
import defpackage.ne;
import defpackage.t91;
import defpackage.yq;
import fi.iki.elonen.NanoHTTPD;
import java.util.HashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class OnlineSubtitleConfigServer extends NanoHTTPD {
    private final t91 initialConfig;
    private final Function1<t91, Unit> onConfigReceived;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnlineSubtitleConfigServer(int i, t91 t91Var, Function1<? super t91, Unit> function1) {
        super(i);
        t91Var.getClass();
        function1.getClass();
        this.initialConfig = t91Var;
        this.onConfigReceived = function1;
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
                
                objM8825constructorimpl = new JSONObject(str);
            } catch (Throwable th) {
                
                objM8825constructorimpl = ResultKt.createFailure(th);
            }
            if (false) {
                objM8825constructorimpl = null;
            }
            JSONObject jSONObject = (JSONObject) objM8825constructorimpl;
            String string = (jSONObject == null || (strOptString = jSONObject.optString("apiKey")) == null) ? null : StringsKt.trim((CharSequence) strOptString).toString();
            if (string != null) {
                str2 = string;
            }
            boolean zOptBoolean = jSONObject != null ? jSONObject.optBoolean("enabled", true) : true;
            yq yqVar = ne.c;
            String strOptString2 = jSONObject != null ? jSONObject.optString("protocol") : null;
            yqVar.getClass();
            this.onConfigReceived.invoke(new t91(zOptBoolean, str2, yq.i(strOptString2)));
            NanoHTTPD.Response responseNewFixedLengthResponse2 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "application/json; charset=UTF-8", "{\"success\":true}");
            responseNewFixedLengthResponse2.getClass();
            return responseNewFixedLengthResponse2;
        } catch (Exception e) {
            Log.e("OnlineSubCfgServer", "保存 API key 失败", e);
            NanoHTTPD.Response responseNewFixedLengthResponse3 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.INTERNAL_ERROR, "text/plain; charset=UTF-8", "Error: " + e.getMessage());
            responseNewFixedLengthResponse3.getClass();
            return responseNewFixedLengthResponse3;
        }
    }

    private final NanoHTTPD.Response serveHtml() {
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(this.initialConfig.getAssrtApiToken(), "&", "&amp;", false, 4, (Object) null), "\"", "&quot;", false, 4, (Object) null), "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
        String str = this.initialConfig.getEnabled() ? "checked" : "";
        String str2 = this.initialConfig.getAssrtApiProtocol() == ne.HTTPS ? "checked" : "";
        String str3 = this.initialConfig.getAssrtApiProtocol() == ne.HTTP ? "checked" : "";
        StringBuilder sbZ = kb0.z("\n<!DOCTYPE html>\n<html lang=\"zh-CN\">\n<head>\n  <meta charset=\"UTF-8\" />\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n  <title>在线字幕配置</title>\n  <style>\n    * { margin: 0; padding: 0; box-sizing: border-box; }\n    body {\n      font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, sans-serif;\n      min-height: 100vh;\n      display: flex;\n      justify-content: center;\n      align-items: center;\n      background: linear-gradient(135deg, #0f172a 0%, #1e293b 100%);\n      color: #fff;\n      padding: 20px;\n    }\n    .card {\n      width: 100%;\n      max-width: 520px;\n      background: rgba(15, 23, 42, 0.85);\n      border: 1px solid rgba(148, 163, 184, 0.25);\n      border-radius: 14px;\n      padding: 24px;\n      box-shadow: 0 20px 50px rgba(2, 6, 23, 0.5);\n    }\n    h1 { font-size: 22px; margin-bottom: 8px; }\n    p { color: #cbd5e1; font-size: 14px; margin-bottom: 18px; line-height: 1.6; }\n    input[type=\"text\"] {\n      width: 100%;\n      padding: 12px 14px;\n      border: 1px solid rgba(148, 163, 184, 0.45);\n      border-radius: 10px;\n      background: #0b1220;\n      color: #fff;\n      outline: none;\n      font-size: 15px;\n    }\n    input[type=\"text\"]:focus { border-color: #38bdf8; }\n    .switch-row {\n      margin: 12px 0 4px;\n      display: flex;\n      align-items: center;\n      justify-content: space-between;\n      gap: 12px;\n      color: #e2e8f0;\n      font-size: 14px;\n    }\n    .switch-row input[type=\"checkbox\"] {\n      width: 18px;\n      height: 18px;\n      accent-color: #0284c7;\n    }\n    .protocol-title {\n      margin-top: 16px;\n      margin-bottom: 8px;\n      color: #cbd5e1;\n      font-size: 14px;\n    }\n    .protocol-row {\n      display: flex;\n      gap: 10px;\n      margin-bottom: 6px;\n    }\n    .protocol-option {\n      flex: 1;\n      border: 1px solid rgba(148, 163, 184, 0.45);\n      border-radius: 10px;\n      background: #0b1220;\n      color: #fff;\n      padding: 12px 14px;\n      display: flex;\n      align-items: center;\n      gap: 10px;\n      cursor: pointer;\n    }\n    .protocol-option input[type=\"radio\"] {\n      accent-color: #0284c7;\n    }\n    .protocol-hint {\n      color: #94a3b8;\n      font-size: 12px;\n      margin-bottom: 8px;\n      line-height: 1.5;\n    }\n    button {\n      margin-top: 14px;\n      width: 100%;\n      padding: 12px 14px;\n      border: none;\n      border-radius: 10px;\n      background: #0284c7;\n      color: #fff;\n      font-size: 15px;\n      font-weight: 600;\n      cursor: pointer;\n    }\n    .msg { margin-top: 12px; font-size: 13px; color: #bae6fd; min-height: 20px; }\n  </style>\n</head>\n<body>\n  <div class=\"card\">\n    <h1>在线字幕配置</h1>\n    <p>字幕服务由 assrt.net 提供。可直接启用并使用内置 Key；若你有自己的 API Key，填写后会优先使用你的配置。点击保存后会自动同步到电视。</p>\n    <input id=\"apiKey\" type=\"text\" placeholder=\"例如：xxxxxxxxxxxxxxxx\" value=\"", strReplace$default, "\" />\n    <div class=\"protocol-title\">ASSRT 接口协议</div>\n    <div class=\"protocol-row\">\n      <label class=\"protocol-option\">\n        <input type=\"radio\" name=\"protocol\" value=\"https\" ", str2, " />\n        <span>HTTPS（默认）</span>\n      </label>\n      <label class=\"protocol-option\">\n        <input type=\"radio\" name=\"protocol\" value=\"http\" ");
        sbZ.append(str3);
        sbZ.append(" />\n        <span>HTTP（兼容老电视证书问题）</span>\n      </label>\n    </div>\n    <div class=\"protocol-hint\">推荐优先使用 HTTPS；如果老电视提示 SSL、证书链或握手失败，再切换到 HTTP。</div>\n    <label class=\"switch-row\">\n      <span>启用在线字幕</span>\n      <input id=\"enabled\" type=\"checkbox\" ");
        sbZ.append(str);
        sbZ.append(" />\n    </label>\n    <button onclick=\"saveApiKey()\">保存到电视</button>\n    <div id=\"msg\" class=\"msg\"></div>\n  </div>\n  <script>\n    async function saveApiKey() {\n      const key = document.getElementById('apiKey').value.trim();\n      const enabled = document.getElementById('enabled').checked;\n      const protocol = document.querySelector('input[name=\"protocol\"]:checked')?.value || 'https';\n      const msg = document.getElementById('msg');\n      msg.textContent = '提交中...';\n      try {\n        const res = await fetch('/save', {\n          method: 'POST',\n          headers: { 'Content-Type': 'application/json; charset=UTF-8' },\n          body: JSON.stringify({ apiKey: key, enabled: enabled, protocol: protocol })\n        });\n        if (!res.ok) {\n          const text = await res.text();\n          msg.textContent = '提交失败：' + text;\n          return;\n        }\n        msg.textContent = '保存成功，请返回电视确认';\n      } catch (e) {\n        msg.textContent = '提交失败：' + (e && e.message ? e.message : '未知错误');\n      }\n    }\n  </script>\n</body>\n</html>\n        ");
        NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/html; charset=UTF-8", StringsKt.trimIndent(sbZ.toString()));
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
