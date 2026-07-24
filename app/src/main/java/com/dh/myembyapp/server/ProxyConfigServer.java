package com.dh.myembyapp.server;

import android.util.Log;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.ProxyProtocol;
import defpackage.i02;
import defpackage.kb0;
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
final class ProxyConfigServer extends NanoHTTPD {
    private static final String TAG = "ProxyCfgServerInner";
    private final ProxyConfig initialConfig;
    private final Function1<ProxyConfig, Unit> onConfigReceived;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProxyConfigServer(int i, ProxyConfig proxyConfig, Function1<? super ProxyConfig, Unit> function1) {
        super(i);
        proxyConfig.getClass();
        function1.getClass();
        this.initialConfig = proxyConfig;
        this.onConfigReceived = function1;
    }

    private final NanoHTTPD.Response handleSave(NanoHTTPD.IHTTPSession session) {
        Object objM8825constructorimpl;
        ProxyProtocol proxyProtocolValueOf;
        String strOptString;
        String strOptString2;
        try {
            HashMap map = new HashMap();
            session.parseBody(map);
            String str = (String) map.get("postData");
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
            boolean zOptBoolean = jSONObject != null ? jSONObject.optBoolean("enabled", false) : false;
            String str2 = "HTTP";
            if (jSONObject != null) {
                try {
                    String strOptString3 = jSONObject.optString("protocol", "HTTP");
                    if (strOptString3 != null) {
                        str2 = strOptString3;
                    }
                } catch (Exception unused) {
                    proxyProtocolValueOf = ProxyProtocol.HTTP;
                }
            }
            proxyProtocolValueOf = ProxyProtocol.valueOf(str2);
            String string = (jSONObject == null || (strOptString2 = jSONObject.optString("host", "")) == null) ? null : StringsKt.trim((CharSequence) strOptString2).toString();
            if (string == null) {
                string = "";
            }
            int iOptInt = jSONObject != null ? jSONObject.optInt("port", 7890) : 7890;
            String string2 = (jSONObject == null || (strOptString = jSONObject.optString("username", "")) == null) ? null : StringsKt.trim((CharSequence) strOptString).toString();
            if (string2 == null) {
                string2 = "";
            }
            String strOptString4 = jSONObject != null ? jSONObject.optString("password", "") : null;
            this.onConfigReceived.invoke(new ProxyConfig(zOptBoolean, proxyProtocolValueOf, string, iOptInt, string2, strOptString4 == null ? "" : strOptString4, jSONObject != null ? jSONObject.optBoolean("bypassLan", true) : true));
            NanoHTTPD.Response responseNewFixedLengthResponse2 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "application/json; charset=UTF-8", "{\"success\":true}");
            responseNewFixedLengthResponse2.getClass();
            return responseNewFixedLengthResponse2;
        } catch (Exception e) {
            Log.e(TAG, "保存代理配置失败", e);
            NanoHTTPD.Response responseNewFixedLengthResponse3 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.INTERNAL_ERROR, "text/plain; charset=UTF-8", "Error: " + e.getMessage());
            responseNewFixedLengthResponse3.getClass();
            return responseNewFixedLengthResponse3;
        }
    }

    private final NanoHTTPD.Response serveHtml() {
        String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(this.initialConfig.getHost(), "&", "&amp;", false, 4, (Object) null), "\"", "&quot;", false, 4, (Object) null), "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
        String strReplace$default2 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(this.initialConfig.getUsername(), "&", "&amp;", false, 4, (Object) null), "\"", "&quot;", false, 4, (Object) null), "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
        String strReplace$default3 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(this.initialConfig.getPassword(), "&", "&amp;", false, 4, (Object) null), "\"", "&quot;", false, 4, (Object) null), "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
        String str = this.initialConfig.getEnabled() ? "checked" : "";
        String str2 = this.initialConfig.getBypassLan() ? "checked" : "";
        String str3 = this.initialConfig.getProtocol() == ProxyProtocol.HTTP ? "checked" : "";
        String str4 = this.initialConfig.getProtocol() == ProxyProtocol.HTTPS ? "checked" : "";
        String str5 = this.initialConfig.getProtocol() == ProxyProtocol.SOCKS5 ? "checked" : "";
        int port = this.initialConfig.getPort();
        StringBuilder sbZ = kb0.z("\n<!DOCTYPE html>\n<html lang=\"zh-CN\">\n<head>\n  <meta charset=\"UTF-8\" />\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n  <title>代理配置</title>\n  <style>\n    * { margin: 0; padding: 0; box-sizing: border-box; }\n    body {\n      font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, sans-serif;\n      min-height: 100vh;\n      display: flex;\n      justify-content: center;\n      align-items: center;\n      background: linear-gradient(135deg, #0f172a 0%, #1e293b 100%);\n      color: #fff;\n      padding: 20px;\n    }\n    .card {\n      width: 100%;\n      max-width: 520px;\n      background: rgba(15, 23, 42, 0.85);\n      border: 1px solid rgba(148, 163, 184, 0.25);\n      border-radius: 14px;\n      padding: 24px;\n      box-shadow: 0 20px 50px rgba(2, 6, 23, 0.5);\n    }\n    h1 { font-size: 22px; margin-bottom: 8px; }\n    p { color: #cbd5e1; font-size: 14px; margin-bottom: 18px; line-height: 1.6; }\n    label.field { display: block; color: #cbd5e1; font-size: 13px; margin: 10px 0 4px; }\n    input[type=\"text\"], input[type=\"password\"] {\n      width: 100%;\n      padding: 12px 14px;\n      border: 1px solid rgba(148, 163, 184, 0.45);\n      border-radius: 10px;\n      background: #0b1220;\n      color: #fff;\n      outline: none;\n      font-size: 15px;\n    }\n    input[type=\"text\"]:focus, input[type=\"password\"]:focus { border-color: #38bdf8; }\n    .row2 { display: flex; gap: 10px; }\n    .row2 > * { flex: 1; }\n    .switch-row {\n      margin: 12px 0 4px;\n      display: flex;\n      align-items: center;\n      justify-content: space-between;\n      gap: 12px;\n      color: #e2e8f0;\n      font-size: 14px;\n    }\n    .switch-row input[type=\"checkbox\"] {\n      width: 18px;\n      height: 18px;\n      accent-color: #0284c7;\n    }\n    .protocol-title {\n      margin-top: 16px;\n      margin-bottom: 8px;\n      color: #cbd5e1;\n      font-size: 14px;\n    }\n    .protocol-row {\n      display: flex;\n      gap: 10px;\n      margin-bottom: 6px;\n    }\n    .protocol-option {\n      flex: 1;\n      border: 1px solid rgba(148, 163, 184, 0.45);\n      border-radius: 10px;\n      background: #0b1220;\n      color: #fff;\n      padding: 8px 6px;\n      display: flex;\n      align-items: center;\n      gap: 6px;\n      cursor: pointer;\n      font-size: 13px;\n    }\n    .protocol-option input[type=\"radio\"] {\n      accent-color: #0284c7;\n      width: 14px;\n      height: 14px;\n    }\n    button {\n      margin-top: 14px;\n      width: 100%;\n      padding: 12px 14px;\n      border: none;\n      border-radius: 10px;\n      background: #0284c7;\n      color: #fff;\n      font-size: 15px;\n      font-weight: 600;\n      cursor: pointer;\n    }\n    .msg { margin-top: 12px; font-size: 13px; color: #bae6fd; min-height: 20px; }\n  </style>\n</head>\n<body>\n  <div class=\"card\">\n    <h1>代理配置</h1>\n    <p>在手机上填写代理信息后点击保存，配置会自动同步到电视。</p>\n\n    <label class=\"switch-row\">\n      <span>启用代理</span>\n      <input id=\"enabled\" type=\"checkbox\" ", str, " />\n    </label>\n\n    <div class=\"protocol-title\">代理协议</div>\n    <div class=\"protocol-row\">\n      <label class=\"protocol-option\">\n        <input type=\"radio\" name=\"protocol\" value=\"HTTP\" ", str3, " />\n        <span>HTTP</span>\n      </label>\n      <label class=\"protocol-option\">\n        <input type=\"radio\" name=\"protocol\" value=\"HTTPS\" ");
        i02.v(sbZ, str4, " />\n        <span>HTTPS</span>\n      </label>\n      <label class=\"protocol-option\">\n        <input type=\"radio\" name=\"protocol\" value=\"SOCKS5\" ", str5, " />\n        <span>SOCKS5</span>\n      </label>\n    </div>\n\n    <div class=\"row2\">\n      <div>\n        <label class=\"field\">代理服务器</label>\n        <input id=\"host\" type=\"text\" placeholder=\"例如：192.168.1.100\" value=\"");
        sbZ.append(strReplace$default);
        sbZ.append("\" />\n      </div>\n      <div>\n        <label class=\"field\">端口</label>\n        <input id=\"port\" type=\"text\" placeholder=\"例如：7890\" value=\"");
        sbZ.append(port);
        sbZ.append("\" />\n      </div>\n    </div>\n\n    <div class=\"row2\">\n      <div>\n        <label class=\"field\">用户名（可选）</label>\n        <input id=\"username\" type=\"text\" placeholder=\"无认证留空\" value=\"");
        i02.v(sbZ, strReplace$default2, "\" />\n      </div>\n      <div>\n        <label class=\"field\">密码（可选）</label>\n        <input id=\"password\" type=\"password\" placeholder=\"无认证留空\" value=\"", strReplace$default3, "\" />\n      </div>\n    </div>\n\n    <label class=\"switch-row\">\n      <span>局域网不代理</span>\n      <input id=\"bypassLan\" type=\"checkbox\" ");
        sbZ.append(str2);
        sbZ.append(" />\n    </label>\n\n    <button onclick=\"saveConfig()\">保存到电视</button>\n    <div id=\"msg\" class=\"msg\"></div>\n  </div>\n  <script>\n    async function saveConfig() {\n      const msg = document.getElementById('msg');\n      const port = parseInt(document.getElementById('port').value.trim(), 10);\n      if (!port || port < 1 || port > 65535) {\n        msg.textContent = '请输入有效的端口号（1-65535）';\n        return;\n      }\n      msg.textContent = '提交中...';\n      try {\n        const res = await fetch('/save', {\n          method: 'POST',\n          headers: { 'Content-Type': 'application/json; charset=UTF-8' },\n          body: JSON.stringify({\n            enabled: document.getElementById('enabled').checked,\n            protocol: document.querySelector('input[name=\"protocol\"]:checked')?.value || 'HTTP',\n            host: document.getElementById('host').value.trim(),\n            port: port,\n            username: document.getElementById('username').value.trim(),\n            password: document.getElementById('password').value,\n            bypassLan: document.getElementById('bypassLan').checked\n          })\n        });\n        if (!res.ok) {\n          msg.textContent = '提交失败：' + (await res.text());\n          return;\n        }\n        msg.textContent = '保存成功，请返回电视确认';\n      } catch (e) {\n        msg.textContent = '提交失败：' + (e && e.message ? e.message : '未知错误');\n      }\n    }\n  </script>\n</body>\n</html>\n        ");
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
