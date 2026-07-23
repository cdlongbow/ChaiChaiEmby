package com.dh.myembyapp.server;

import android.util.Log;
import defpackage.hg2;
import defpackage.i02;
import defpackage.kb0;
import defpackage.ye2;
import fi.iki.elonen.NanoHTTPD;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DebugKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0011R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/dh/myembyapp/server/WebDavSyncConfigServer;", "Lfi/iki/elonen/NanoHTTPD;", "", "port", "Lye2;", "initialConfig", "Lkotlin/Function1;", "", "onConfigReceived", "<init>", "(ILye2;Lkotlin/jvm/functions/Function1;)V", "Lfi/iki/elonen/NanoHTTPD$Response;", "serveHtmlPage", "()Lfi/iki/elonen/NanoHTTPD$Response;", "Lfi/iki/elonen/NanoHTTPD$IHTTPSession;", "session", "handleSave", "(Lfi/iki/elonen/NanoHTTPD$IHTTPSession;)Lfi/iki/elonen/NanoHTTPD$Response;", "", "value", "escapeJson", "(Ljava/lang/String;)Ljava/lang/String;", "serve", "Lkotlin/jvm/functions/Function1;", "currentConfig", "Lye2;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class WebDavSyncConfigServer extends NanoHTTPD {
    private ye2 currentConfig;
    private final Function1<ye2, Unit> onConfigReceived;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WebDavSyncConfigServer(int i, ye2 ye2Var, Function1<? super ye2, Unit> function1) {
        super(i);
        ye2Var.getClass();
        function1.getClass();
        this.onConfigReceived = function1;
        this.currentConfig = ye2Var.a();
    }

    private final String escapeJson(String value) {
        StringBuilder sb = new StringBuilder(value.length());
        for (int i = 0; i < value.length(); i++) {
            char cCharAt = value.charAt(i);
            if (cCharAt == '\f') {
                sb.append("\\f");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\"') {
                sb.append("\\\"");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        sb.append("\\b");
                        break;
                    case '\t':
                        sb.append("\\t");
                        break;
                    case '\n':
                        sb.append("\\n");
                        break;
                    default:
                        sb.append(cCharAt);
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    private final NanoHTTPD.Response handleSave(NanoHTTPD.IHTTPSession session) {
        Object objM8825constructorimpl;
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
                Result.Companion companion = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(new JSONObject(str));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8831isFailureimpl(objM8825constructorimpl)) {
                objM8825constructorimpl = null;
            }
            JSONObject jSONObject = (JSONObject) objM8825constructorimpl;
            if (jSONObject == null) {
                NanoHTTPD.Response responseNewFixedLengthResponse2 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.BAD_REQUEST, "text/plain; charset=UTF-8", "Invalid payload");
                responseNewFixedLengthResponse2.getClass();
                return responseNewFixedLengthResponse2;
            }
            String strOptString = jSONObject.optString("serverUrl");
            strOptString.getClass();
            String string = StringsKt.trim((CharSequence) strOptString).toString();
            String strOptString2 = jSONObject.optString("username");
            strOptString2.getClass();
            String string2 = StringsKt.trim((CharSequence) strOptString2).toString();
            String strOptString3 = jSONObject.optString("password");
            strOptString3.getClass();
            String string3 = StringsKt.trim((CharSequence) strOptString3).toString();
            boolean zOptBoolean = jSONObject.optBoolean("syncServerConfigurations", true);
            boolean zOptBoolean2 = jSONObject.optBoolean("syncAppSettings", true);
            string.getClass();
            string2.getClass();
            string3.getClass();
            String strE = hg2.E(string);
            String string4 = StringsKt.trim((CharSequence) string2).toString();
            String string5 = StringsKt.trim((CharSequence) string3).toString();
            strE.getClass();
            string4.getClass();
            string5.getClass();
            ye2 ye2Var = new ye2(strE, string4, string5, zOptBoolean, zOptBoolean2);
            this.currentConfig = ye2Var;
            this.onConfigReceived.invoke(ye2Var);
            NanoHTTPD.Response responseNewFixedLengthResponse3 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "application/json; charset=UTF-8", StringsKt.trimIndent("\n                {\n                  \"success\": true,\n                  \"serverUrl\": \"" + escapeJson(strE) + "\",\n                  \"username\": \"" + escapeJson(string4) + "\",\n                  \"password\": \"" + escapeJson(string5) + "\",\n                  \"syncServerConfigurations\": " + zOptBoolean + ",\n                  \"syncAppSettings\": " + zOptBoolean2 + "\n                }\n                "));
            responseNewFixedLengthResponse3.getClass();
            return responseNewFixedLengthResponse3;
        } catch (Exception e) {
            Log.e("WebDavSyncCfgServer", "保存 WebDAV 配置失败", e);
            NanoHTTPD.Response responseNewFixedLengthResponse4 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.INTERNAL_ERROR, "text/plain; charset=UTF-8", "Error: " + e.getMessage());
            responseNewFixedLengthResponse4.getClass();
            return responseNewFixedLengthResponse4;
        }
    }

    private final NanoHTTPD.Response serveHtmlPage() {
        String strServeHtmlPage$escapeHtmlAttribute = serveHtmlPage$escapeHtmlAttribute(this.currentConfig.a);
        String strServeHtmlPage$escapeHtmlAttribute2 = serveHtmlPage$escapeHtmlAttribute(this.currentConfig.b);
        String strServeHtmlPage$escapeHtmlAttribute3 = serveHtmlPage$escapeHtmlAttribute(this.currentConfig.c);
        ye2 ye2Var = this.currentConfig;
        boolean z = ye2Var.d;
        String str = z ? DebugKt.DEBUG_PROPERTY_VALUE_ON : "";
        String str2 = ye2Var.e ? DebugKt.DEBUG_PROPERTY_VALUE_ON : "";
        String strValueOf = String.valueOf(z);
        Locale locale = Locale.ROOT;
        String lowerCase = strValueOf.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = String.valueOf(this.currentConfig.e).toLowerCase(locale);
        lowerCase2.getClass();
        StringBuilder sbZ = kb0.z("\n<!DOCTYPE html>\n<html lang=\"zh-CN\">\n<head>\n  <meta charset=\"UTF-8\" />\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n  <title>WebDAV 同步</title>\n  <style>\n    * { box-sizing: border-box; }\n    body {\n      margin: 0;\n      min-height: 100vh;\n      font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, sans-serif;\n      background: linear-gradient(180deg, #0f172a 0%, #111827 100%);\n      color: #f8fafc;\n      padding: 24px 16px 32px;\n    }\n    .card {\n      max-width: 560px;\n      margin: 0 auto;\n      background: rgba(15, 23, 42, 0.9);\n      border: 1px solid rgba(148, 163, 184, 0.18);\n      border-radius: 20px;\n      padding: 22px 18px 20px;\n      box-shadow: 0 18px 40px rgba(15, 23, 42, 0.35);\n    }\n    h1 { font-size: 22px; margin: 0 0 8px; }\n    p { color: #cbd5e1; font-size: 14px; margin: 0 0 18px; line-height: 1.6; }\n    .hint {\n      padding: 12px 14px;\n      border-radius: 12px;\n      background: rgba(30, 41, 59, 0.95);\n      border: 1px solid rgba(148, 163, 184, 0.16);\n      margin-bottom: 18px;\n      font-size: 13px;\n      line-height: 1.7;\n      color: #dbeafe;\n    }\n    label {\n      display: block;\n      margin-bottom: 6px;\n      color: #e2e8f0;\n      font-size: 14px;\n    }\n    .field { margin-bottom: 14px; }\n    input {\n      width: 100%;\n      padding: 10px 14px;\n      border-radius: 12px;\n      border: 1px solid rgba(148, 163, 184, 0.22);\n      background: rgba(15, 23, 42, 0.85);\n      color: #f8fafc;\n      font-size: 15px;\n      outline: none;\n    }\n    input:focus { border-color: #60a5fa; }\n    .switch-row {\n      display: flex;\n      align-items: center;\n      justify-content: space-between;\n      gap: 12px;\n      padding: 12px 14px;\n      border-radius: 12px;\n      background: rgba(30, 41, 59, 0.95);\n      border: 1px solid rgba(148, 163, 184, 0.16);\n      margin-bottom: 10px;\n    }\n    .switch-copy {\n      display: flex;\n      flex-direction: column;\n      gap: 4px;\n    }\n    .switch-copy strong { font-size: 15px; }\n    .switch-copy span { font-size: 12px; color: #cbd5e1; line-height: 1.5; }\n    .switch {\n      flex: 0 0 52px;\n      width: 52px;\n      min-width: 52px;\n      height: 30px;\n      border-radius: 15px;\n      background: #475569;\n      border: none;\n      padding: 4px;\n      overflow: hidden;\n      appearance: none;\n      -webkit-appearance: none;\n      display: flex;\n      align-items: center;\n      justify-content: flex-start;\n      cursor: pointer;\n    }\n    .switch::after {\n      content: \"\";\n      width: 22px;\n      height: 22px;\n      border-radius: 50%;\n      background: white;\n      display: block;\n      transition: transform 0.2s ease;\n    }\n    .switch.on {\n      background: #22c55e;\n      justify-content: flex-end;\n    }\n    .switch:focus-visible {\n      outline: 2px solid rgba(255, 255, 255, 0.75);\n      outline-offset: 2px;\n    }\n    button.primary {\n      width: 100%;\n      margin-top: 16px;\n      padding: 14px 16px;\n      border: none;\n      border-radius: 12px;\n      background: linear-gradient(135deg, #22c55e 0%, #16a34a 100%);\n      color: #f8fafc;\n      font-size: 15px;\n      font-weight: 600;\n    }\n    .msg { margin-top: 12px; min-height: 20px; color: #bae6fd; font-size: 13px; }\n  </style>\n</head>\n<body>\n  <div class=\"card\">\n    <h1>WebDAV 同步</h1>\n    <p>在手机上填写 WebDAV 信息并提交，电视端会立即回填配置。固定使用目录 <strong>ChaiChaiEmby</strong>，同步文件名为 <strong>sync-config.json</strong>。</p>\n\n    <div class=\"field\">\n      <label for=\"serverUrl\">服务器地址</label>\n      <input id=\"serverUrl\" type=\"text\" value=\"", strServeHtmlPage$escapeHtmlAttribute, "\" placeholder=\"例如：https://dav.example.com/dav/\" />\n    </div>\n\n    <div class=\"field\">\n      <label for=\"username\">账号</label>\n      <input id=\"username\" type=\"text\" value=\"", strServeHtmlPage$escapeHtmlAttribute2, "\" placeholder=\"请输入 WebDAV 账号\" />\n    </div>\n\n    <div class=\"field\">\n      <label for=\"password\">密码</label>\n      <input id=\"password\" type=\"password\" value=\"");
        i02.v(sbZ, strServeHtmlPage$escapeHtmlAttribute3, "\" placeholder=\"请输入 WebDAV 密码\" />\n    </div>\n\n    <div class=\"switch-row\" onclick=\"toggle('syncServers')\">\n      <div class=\"switch-copy\">\n        <strong>同步服务器配置</strong>\n        <span>包含服务器地址、账号、密码、Token、备用线路和最后使用服务器。</span>\n      </div>\n      <button id=\"syncServersBtn\" type=\"button\" class=\"switch ", str, "\"></button>\n    </div>\n\n    <div class=\"switch-row\" onclick=\"toggle('syncSettings')\">\n      <div class=\"switch-copy\">\n        <strong>同步应用设置</strong>\n        <span>包含弹幕源配置、代理、在线字幕、图标库 URL、主题、缓冲、DLNA、排序和 Trakt 基础配置；不包含字幕字体文件、播放器相关偏好和 Trakt 授权 Token。</span>\n      </div>\n      <button id=\"syncSettingsBtn\" type=\"button\" class=\"switch ");
        i02.v(sbZ, str2, "\"></button>\n    </div>\n\n    <button class=\"primary\" type=\"button\" onclick=\"submitForm()\">保存到电视</button>\n    <div id=\"msg\" class=\"msg\"></div>\n  </div>\n\n  <script>\n    let syncServers = ", lowerCase, ";\n    let syncSettings = ");
        sbZ.append(lowerCase2);
        sbZ.append(";\n\n    function renderSwitches() {\n      document.getElementById('syncServersBtn').className = 'switch' + (syncServers ? ' on' : '');\n      document.getElementById('syncSettingsBtn').className = 'switch' + (syncSettings ? ' on' : '');\n    }\n\n    function toggle(key) {\n      if (key === 'syncServers') {\n        syncServers = !syncServers;\n      } else if (key === 'syncSettings') {\n        syncSettings = !syncSettings;\n      }\n      renderSwitches();\n    }\n\n    async function submitForm() {\n      const msg = document.getElementById('msg');\n      msg.textContent = '提交中...';\n\n      const payload = {\n        serverUrl: document.getElementById('serverUrl').value.trim(),\n        username: document.getElementById('username').value.trim(),\n        password: document.getElementById('password').value.trim(),\n        syncServerConfigurations: syncServers,\n        syncAppSettings: syncSettings\n      };\n\n      try {\n        const res = await fetch('/save', {\n          method: 'POST',\n          headers: { 'Content-Type': 'application/json; charset=UTF-8' },\n          body: JSON.stringify(payload)\n        });\n        if (!res.ok) {\n          const text = await res.text();\n          msg.textContent = '提交失败：' + text;\n          return;\n        }\n        const savedConfig = await res.json();\n        document.getElementById('serverUrl').value = savedConfig.serverUrl || '';\n        document.getElementById('username').value = savedConfig.username || '';\n        document.getElementById('password').value = savedConfig.password || '';\n        syncServers = !!savedConfig.syncServerConfigurations;\n        syncSettings = !!savedConfig.syncAppSettings;\n        renderSwitches();\n        msg.textContent = '保存成功，电视端已更新为最新 WebDAV 配置';\n      } catch (e) {\n        msg.textContent = '提交失败：' + (e && e.message ? e.message : '未知错误');\n      }\n    }\n\n    renderSwitches();\n  </script>\n</body>\n</html>\n        ");
        NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/html; charset=UTF-8", StringsKt.trimIndent(sbZ.toString()));
        responseNewFixedLengthResponse.addHeader("Content-Type", "text/html; charset=UTF-8");
        return responseNewFixedLengthResponse;
    }

    private static final String serveHtmlPage$escapeHtmlAttribute(String str) {
        String strReplace$default;
        String strReplace$default2;
        String strReplace$default3;
        String strReplace$default4;
        return (str == null || (strReplace$default = StringsKt.replace$default(str, "&", "&amp;", false, 4, (Object) null)) == null || (strReplace$default2 = StringsKt.replace$default(strReplace$default, "\"", "&quot;", false, 4, (Object) null)) == null || (strReplace$default3 = StringsKt.replace$default(strReplace$default2, "<", "&lt;", false, 4, (Object) null)) == null || (strReplace$default4 = StringsKt.replace$default(strReplace$default3, ">", "&gt;", false, 4, (Object) null)) == null) ? "" : strReplace$default4;
    }

    @Override // fi.iki.elonen.NanoHTTPD
    public NanoHTTPD.Response serve(NanoHTTPD.IHTTPSession session) {
        session.getClass();
        if (Intrinsics.areEqual(session.getUri(), "/")) {
            return serveHtmlPage();
        }
        if (Intrinsics.areEqual(session.getUri(), "/save") && session.getMethod() == NanoHTTPD.Method.POST) {
            return handleSave(session);
        }
        NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.NOT_FOUND, NanoHTTPD.MIME_PLAINTEXT, "Not Found");
        responseNewFixedLengthResponse.getClass();
        return responseNewFixedLengthResponse;
    }
}
