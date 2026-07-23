package com.dh.myembyapp.server;

import android.util.Log;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.ServerConfigKt;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import defpackage.i02;
import defpackage.i9;
import defpackage.kb0;
import fi.iki.elonen.NanoHTTPD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0003\u0018\u0019\u001aB?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R \u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/dh/myembyapp/server/BackupRouteConfigServer;", "Lfi/iki/elonen/NanoHTTPD;", "port", "", "serverAlias", "", "initialRoutes", "", "Lcom/dh/myembyapp/data/model/BackupRouteConfig;", "onConfigReceived", "Lkotlin/Function1;", "", "<init>", "(ILjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "gson", "Lcom/google/gson/Gson;", "escapedServerAlias", "initialRoutesJson", "serve", "Lfi/iki/elonen/NanoHTTPD$Response;", "session", "Lfi/iki/elonen/NanoHTTPD$IHTTPSession;", "serveHtml", "handleSave", "Companion", "BackupRoutePayload", "BackupRouteItemPayload", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class BackupRouteConfigServer extends NanoHTTPD {
    private static final int MAX_ROUTES = 50;
    private final String escapedServerAlias;
    private final Gson gson;
    private final String initialRoutesJson;
    private final Function1<List<BackupRouteConfig>, Unit> onConfigReceived;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackupRouteConfigServer(int i, String str, List<BackupRouteConfig> list, Function1<? super List<BackupRouteConfig>, Unit> function1) {
        super(i);
        str.getClass();
        list.getClass();
        function1.getClass();
        this.onConfigReceived = function1;
        Gson gson = new Gson();
        this.gson = gson;
        this.escapedServerAlias = BackupRouteConfigServerManagerKt.escapeHtml(str);
        String json = gson.toJson(list);
        json.getClass();
        this.initialRoutesJson = StringsKt.replace$default(json, "</", "<\\/", false, 4, (Object) null);
    }

    private final NanoHTTPD.Response handleSave(NanoHTTPD.IHTTPSession session) {
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
            Object objFromJson = this.gson.fromJson(str, new TypeToken<BackupRoutePayload>() { // from class: com.dh.myembyapp.server.BackupRouteConfigServer$handleSave$type$1
            }.getType());
            objFromJson.getClass();
            List listTake = CollectionsKt.take(((BackupRoutePayload) objFromJson).getRoutes(), 50);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
            int i = 0;
            for (Object obj : listTake) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                BackupRouteItemPayload backupRouteItemPayload = (BackupRouteItemPayload) obj;
                String string = StringsKt.trim((CharSequence) backupRouteItemPayload.getAlias()).toString();
                String string2 = StringsKt.trim((CharSequence) backupRouteItemPayload.getHost()).toString();
                int port = backupRouteItemPayload.getPort();
                if (string.length() <= 0) {
                    throw new IllegalArgumentException(("第 " + i2 + " 条线路缺少服务器别名").toString());
                }
                if (string2.length() <= 0) {
                    throw new IllegalArgumentException(("第 " + i2 + " 条线路缺少服务器地址").toString());
                }
                if (1 > port || port >= 65536) {
                    throw new IllegalArgumentException(("第 " + i2 + " 条线路端口无效").toString());
                }
                String id = backupRouteItemPayload.getId();
                if (id == null) {
                    id = UUID.randomUUID().toString();
                    id.getClass();
                } else {
                    if (StringsKt.isBlank(id)) {
                        id = null;
                    }
                    if (id == null) {
                        id = UUID.randomUUID().toString();
                        id.getClass();
                    }
                }
                String str2 = id;
                String lowerCase = backupRouteItemPayload.getProtocol().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                arrayList.add(ServerConfigKt.normalizeBackupRouteConfig(new BackupRouteConfig(str2, string, Intrinsics.areEqual(lowerCase, "https") ? "https" : "http", string2, port, StringsKt.trim((CharSequence) backupRouteItemPayload.getPath()).toString(), backupRouteItemPayload.getDirectOnly())));
                i = i2;
            }
            this.onConfigReceived.invoke(arrayList);
            NanoHTTPD.Response responseNewFixedLengthResponse2 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "application/json; charset=UTF-8", "{\"success\":true}");
            responseNewFixedLengthResponse2.getClass();
            return responseNewFixedLengthResponse2;
        } catch (Exception e) {
            Log.e("BackupRouteCfgServer", "保存备用线路失败", e);
            NanoHTTPD.Response.Status status = NanoHTTPD.Response.Status.BAD_REQUEST;
            String message = e.getMessage();
            if (message == null) {
                message = "Invalid payload";
            }
            NanoHTTPD.Response responseNewFixedLengthResponse3 = NanoHTTPD.newFixedLengthResponse(status, "text/plain; charset=UTF-8", message);
            responseNewFixedLengthResponse3.getClass();
            return responseNewFixedLengthResponse3;
        }
    }

    private final NanoHTTPD.Response serveHtml() {
        NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/html; charset=UTF-8", StringsKt.trimIndent("\n<!DOCTYPE html>\n<html lang=\"zh-CN\">\n<head>\n  <meta charset=\"UTF-8\" />\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n  <title>备用线路管理</title>\n  <style>\n    * { margin: 0; padding: 0; box-sizing: border-box; }\n    body {\n      font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, sans-serif;\n      min-height: 100vh;\n      background: linear-gradient(135deg, #0f172a 0%, #1e293b 100%);\n      color: #fff;\n      padding: 18px;\n    }\n    .wrap {\n      max-width: 920px;\n      margin: 0 auto;\n      background: rgba(15, 23, 42, 0.88);\n      border: 1px solid rgba(148, 163, 184, 0.22);\n      border-radius: 18px;\n      padding: 20px;\n      box-shadow: 0 20px 50px rgba(2, 6, 23, 0.45);\n    }\n    h1 { font-size: 24px; margin-bottom: 8px; }\n    .sub {\n      color: #cbd5e1;\n      font-size: 14px;\n      line-height: 1.7;\n      margin-bottom: 16px;\n    }\n    .toolbar {\n      display: flex;\n      align-items: center;\n      gap: 12px;\n      margin-bottom: 14px;\n      flex-wrap: wrap;\n    }\n    .pill {\n      padding: 8px 12px;\n      border-radius: 999px;\n      background: rgba(255,255,255,0.08);\n      color: #e2e8f0;\n      font-size: 13px;\n    }\n    button {\n      border: none;\n      border-radius: 12px;\n      background: #2563eb;\n      color: white;\n      padding: 11px 16px;\n      font-size: 15px;\n      font-weight: 600;\n      cursor: pointer;\n    }\n    button.secondary { background: rgba(255,255,255,0.12); }\n    button.danger { background: #b91c1c; }\n    .entry-list {\n      display: grid;\n      gap: 14px;\n    }\n    .entry {\n      border-radius: 14px;\n      border: 1px solid rgba(148, 163, 184, 0.22);\n      background: rgba(15, 23, 42, 0.76);\n      padding: 14px;\n    }\n    .entry-head {\n      display: flex;\n      align-items: center;\n      justify-content: space-between;\n      gap: 10px;\n      margin-bottom: 12px;\n      flex-wrap: wrap;\n    }\n    .entry-title {\n      font-size: 16px;\n      font-weight: 700;\n    }\n    .grid {\n      display: grid;\n      grid-template-columns: 1fr;\n      gap: 10px;\n    }\n    .field { display: flex; flex-direction: column; gap: 6px; }\n    .grid-split {\n      display: grid;\n      grid-template-columns: 132px 1fr;\n      gap: 10px;\n    }\n    label {\n      color: #cbd5e1;\n      font-size: 13px;\n      font-weight: 600;\n    }\n    input, select {\n      width: 100%;\n      padding: 11px 12px;\n      border-radius: 10px;\n      border: 1px solid rgba(148, 163, 184, 0.32);\n      background: #0b1220;\n      color: #fff;\n      font-size: 14px;\n      outline: none;\n    }\n    input:focus, select:focus { border-color: #60a5fa; }\n    .switch {\n      display: flex;\n      align-items: center;\n      justify-content: space-between;\n      gap: 12px;\n      padding: 12px;\n      border-radius: 10px;\n      background: rgba(255,255,255,0.04);\n    }\n    .switch input {\n      width: 18px;\n      height: 18px;\n      accent-color: #2563eb;\n    }\n    .msg {\n      min-height: 20px;\n      margin-top: 14px;\n      font-size: 13px;\n      line-height: 1.5;\n      padding: 10px 12px;\n      border-radius: 12px;\n      background: rgba(255,255,255,0.04);\n      color: #cbd5e1;\n      display: none;\n    }\n    .msg.show { display: block; }\n    .msg.success {\n      color: #bbf7d0;\n      background: rgba(34, 197, 94, 0.14);\n      border: 1px solid rgba(34, 197, 94, 0.28);\n    }\n    .msg.error {\n      color: #fecaca;\n      background: rgba(239, 68, 68, 0.14);\n      border: 1px solid rgba(239, 68, 68, 0.28);\n    }\n    .msg.info {\n      color: #bfdbfe;\n      background: rgba(37, 99, 235, 0.14);\n      border: 1px solid rgba(37, 99, 235, 0.28);\n    }\n    .bottom-actions {\n      margin-top: 16px;\n      display: flex;\n      justify-content: flex-end;\n    }\n    @media (max-width: 720px) {\n      .grid-split { grid-template-columns: 1fr; }\n      .bottom-actions { justify-content: stretch; }\n      .bottom-actions button { width: 100%; }\n    }\n  </style>\n</head>\n<body>\n  <div class=\"wrap\">\n    <h1>备用线路管理</h1>\n    <p class=\"sub\">当前服务器：" + this.escapedServerAlias + "。可维护最多 50 条备用线路。这里只保存线路信息，不会立刻切换电视当前使用的主线路。</p>\n\n    <div class=\"toolbar\">\n      <div class=\"pill\">已配置 <span id=\"routeCount\">0</span> / 50 条</div>\n    </div>\n\n    <div id=\"routeList\" class=\"entry-list\"></div>\n    <div id=\"msg\" class=\"msg\"></div>\n    <div class=\"bottom-actions\">\n      <button type=\"button\" onclick=\"saveRoutes()\">保存到电视</button>\n    </div>\n  </div>\n\n  <script>\n    const MAX_ROUTES = 50;\n    let routes = " + this.initialRoutesJson + ";\n\n    function escapeHtml(value) {\n      return String(value || '')\n        .replace(/&/g, '&amp;')\n        .replace(/</g, '&lt;')\n        .replace(/>/g, '&gt;')\n        .replace(/\"/g, '&quot;');\n    }\n\n    function routeTemplate(route, index) {\n      const alias = escapeHtml(route.alias || '');\n      const protocol = escapeHtml(route.protocol || 'http');\n      const host = escapeHtml(route.host || '');\n      const port = Number.isFinite(route.port) ? route.port : 443;\n      const path = escapeHtml(route.path || '');\n      return `\n        <div class=\"entry\">\n          <div class=\"entry-head\">\n            <div class=\"entry-title\">备用线路 ${index + 1}</div>\n            <button type=\"button\" class=\"danger\" onclick=\"removeRoute(${index})\">删除</button>\n          </div>\n          <div class=\"grid\">\n            <div class=\"field\">\n              <label>服务器别名</label>\n              <input type=\"text\" value=\"${alias}\" placeholder=\"例如：家庭宽带入口\" oninput=\"updateRoute(${index}, 'alias', this.value)\" />\n            </div>\n            <div class=\"field\">\n              <label>协议</label>\n              <select onchange=\"updateRoute(${index}, 'protocol', this.value)\">\n                <option value=\"http\" ${protocol === 'http' ? 'selected' : ''}>HTTP</option>\n                <option value=\"https\" ${protocol === 'https' ? 'selected' : ''}>HTTPS</option>\n              </select>\n            </div>\n            <div class=\"field\">\n              <label>服务器地址</label>\n              <input type=\"text\" value=\"${host}\" placeholder=\"例如：emby.example.com\" oninput=\"updateRoute(${index}, 'host', this.value, this)\" />\n            </div>\n            <div class=\"grid-split\">\n              <div class=\"field\">\n                <label>端口</label>\n                <input type=\"text\" inputmode=\"numeric\" pattern=\"[0-9]*\" value=\"${port}\" placeholder=\"443\" oninput=\"updateRoute(${index}, 'port', this.value, this)\" />\n              </div>\n              <div class=\"field\">\n                <label>路径（可选）</label>\n                <input type=\"text\" value=\"${path}\" placeholder=\"如 emby 或 media\" oninput=\"updateRoute(${index}, 'path', this.value)\" />\n              </div>\n            </div>\n            <div class=\"field\">\n              <div class=\"switch\">\n                <label>仅直连</label>\n                <input type=\"checkbox\" ${route.directOnly ? 'checked' : ''} onchange=\"updateRoute(${index}, 'directOnly', this.checked)\" />\n              </div>\n            </div>\n          </div>\n        </div>\n      `;\n    }\n\n    function renderRoutes() {\n      const routeList = document.getElementById('routeList');\n      const count = document.getElementById('routeCount');\n      count.textContent = routes.length;\n      const emptyState = !routes.length\n        ? '<div class=\"entry\"><div class=\"entry-title\" style=\"margin-bottom:8px;\">还没有备用线路</div><div class=\"sub\" style=\"margin:0; color:#cbd5e1;\">点击下方“新增线路”，或者直接在手机里批量录入后保存到电视。</div></div>'\n        : '';\n      const addButton = '<button type=\\\"button\\\" class=\\\"secondary\\\" style=\\\"width:100%; margin-top:2px;\\\" onclick=\\\"addRoute()\\\">+ 新增线路</button>';\n      routeList.innerHTML = emptyState + routes.map((route, index) => routeTemplate(route, index)).join('') + addButton;\n    }\n\n    function setMessage(text, type) {\n      const msg = document.getElementById('msg');\n      msg.textContent = text || '';\n      msg.className = text ? `msg show ${type || 'info'}` : 'msg';\n    }\n\n    function normalizeHostInput(index, rawValue) {\n      const trimmed = String(rawValue || '').trim();\n      if (!trimmed) {\n        routes[index].host = '';\n        return;\n      }\n\n      if (/^https?:\\/\\//i.test(trimmed)) {\n        try {\n          const parsed = new URL(trimmed);\n          routes[index].protocol = parsed.protocol === 'https:' ? 'https' : 'http';\n          routes[index].host = parsed.hostname || '';\n          routes[index].port = parsed.port ? parseInt(parsed.port, 10) || routes[index].port : routes[index].port;\n          routes[index].path = parsed.pathname && parsed.pathname !== '/' ? parsed.pathname.replace(/^\\/+/, '') : routes[index].path;\n          return;\n        } catch (e) {\n          routes[index].protocol = trimmed.toLowerCase().startsWith('https://') ? 'https' : 'http';\n          routes[index].host = trimmed.replace(/^https?:\\/\\//i, '').trim();\n          return;\n        }\n      }\n\n      routes[index].host = trimmed;\n    }\n\n    function addRoute() {\n      if (routes.length >= MAX_ROUTES) {\n        setMessage('最多只能配置 50 条备用线路', 'error');\n        return;\n      }\n      routes.push({\n        id: crypto.randomUUID ? crypto.randomUUID() : `route-${Date.now()}-${routes.length}`,\n        alias: `备用线路${routes.length + 1}`,\n        protocol: 'https',\n        host: '',\n        port: 443,\n        path: '',\n        directOnly: true\n      });\n      setMessage('', '');\n      renderRoutes();\n    }\n\n    function removeRoute(index) {\n      routes.splice(index, 1);\n      setMessage('', '');\n      renderRoutes();\n    }\n\n    function updateRoute(index, field, value, element) {\n      if (field === 'port') {\n        const digitsOnly = String(value || '').replace(/\\D/g, '');\n        routes[index][field] = digitsOnly === '' ? 443 : parseInt(digitsOnly, 10) || 443;\n        if (element) element.value = digitsOnly;\n        return;\n      }\n      if (field === 'host') {\n        const hasScheme = /^https?:\\/\\//i.test(String(value || '').trim());\n        normalizeHostInput(index, value);\n        if (element) element.value = routes[index].host || '';\n        if (hasScheme) renderRoutes();\n        return;\n      }\n      routes[index][field] = typeof value === 'string' ? value.trim() : value;\n    }\n\n    function validateRoutes() {\n      for (let i = 0; i < routes.length; i++) {\n        const route = routes[i];\n        if (!String(route.alias || '').trim()) return `第 ${i + 1} 条线路缺少服务器别名`;\n        if (!String(route.host || '').trim()) return `第 ${i + 1} 条线路缺少服务器地址`;\n        const port = parseInt(route.port, 10);\n        if (!Number.isFinite(port) || port <= 0 || port > 65535) return `第 ${i + 1} 条线路端口无效`;\n      }\n      return '';\n    }\n\n    async function saveRoutes() {\n      const validationError = validateRoutes();\n      if (validationError) {\n        setMessage(validationError, 'error');\n        return;\n      }\n      setMessage('正在提交到电视，请稍候...', 'info');\n      try {\n        const res = await fetch('/save', {\n          method: 'POST',\n          headers: { 'Content-Type': 'application/json; charset=UTF-8' },\n          body: JSON.stringify({ routes })\n        });\n        if (!res.ok) {\n          const text = await res.text();\n          setMessage('提交失败：' + text, 'error');\n          return;\n        }\n        setMessage('保存成功，线路信息已同步到电视。现在可以返回电视继续操作。', 'success');\n      } catch (e) {\n        setMessage('提交失败：' + (e && e.message ? e.message : '未知错误'), 'error');\n      }\n    }\n\n    renderRoutes();\n  </script>\n</body>\n</html>\n        "));
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/dh/myembyapp/server/BackupRouteConfigServer$BackupRoutePayload;", "", "routes", "", "Lcom/dh/myembyapp/server/BackupRouteConfigServer$BackupRouteItemPayload;", "<init>", "(Ljava/util/List;)V", "getRoutes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackupRoutePayload {
        private final List<BackupRouteItemPayload> routes;

        public /* synthetic */ BackupRoutePayload(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BackupRoutePayload copy$default(BackupRoutePayload backupRoutePayload, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = backupRoutePayload.routes;
            }
            return backupRoutePayload.copy(list);
        }

        public final List<BackupRouteItemPayload> component1() {
            return this.routes;
        }

        public final BackupRoutePayload copy(List<BackupRouteItemPayload> routes) {
            routes.getClass();
            return new BackupRoutePayload(routes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BackupRoutePayload) && Intrinsics.areEqual(this.routes, ((BackupRoutePayload) other).routes);
        }

        public final List<BackupRouteItemPayload> getRoutes() {
            return this.routes;
        }

        public int hashCode() {
            return this.routes.hashCode();
        }

        public String toString() {
            return "BackupRoutePayload(routes=" + this.routes + ")";
        }

        public BackupRoutePayload(List<BackupRouteItemPayload> list) {
            list.getClass();
            this.routes = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BackupRoutePayload() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0082\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\bHÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/dh/myembyapp/server/BackupRouteConfigServer$BackupRouteItemPayload;", "", TtmlNode.ATTR_ID, "", "alias", "protocol", "host", "port", "", "path", "directOnly", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getAlias", "getProtocol", "getHost", "getPort", "()I", "getPath", "getDirectOnly", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackupRouteItemPayload {
        private final String alias;
        private final boolean directOnly;
        private final String host;
        private final String id;
        private final String path;
        private final int port;
        private final String protocol;

        public /* synthetic */ BackupRouteItemPayload(String str, String str2, String str3, String str4, int i, String str5, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "http" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 8096 : i, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? false : z);
        }

        public static /* synthetic */ BackupRouteItemPayload copy$default(BackupRouteItemPayload backupRouteItemPayload, String str, String str2, String str3, String str4, int i, String str5, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = backupRouteItemPayload.id;
            }
            if ((i2 & 2) != 0) {
                str2 = backupRouteItemPayload.alias;
            }
            if ((i2 & 4) != 0) {
                str3 = backupRouteItemPayload.protocol;
            }
            if ((i2 & 8) != 0) {
                str4 = backupRouteItemPayload.host;
            }
            if ((i2 & 16) != 0) {
                i = backupRouteItemPayload.port;
            }
            if ((i2 & 32) != 0) {
                str5 = backupRouteItemPayload.path;
            }
            if ((i2 & 64) != 0) {
                z = backupRouteItemPayload.directOnly;
            }
            String str6 = str5;
            boolean z2 = z;
            int i3 = i;
            String str7 = str3;
            return backupRouteItemPayload.copy(str, str2, str7, str4, i3, str6, z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */

        /* JADX INFO: renamed from: component2, reason: from getter */

        /* JADX INFO: renamed from: component3, reason: from getter */

        /* JADX INFO: renamed from: component4, reason: from getter */

        /* JADX INFO: renamed from: component5, reason: from getter */

        /* JADX INFO: renamed from: component6, reason: from getter */

        /* JADX INFO: renamed from: component7, reason: from getter */

        public final BackupRouteItemPayload copy(String id, String alias, String protocol, String host, int port, String path, boolean directOnly) {
            alias.getClass();
            protocol.getClass();
            host.getClass();
            path.getClass();
            return new BackupRouteItemPayload(id, alias, protocol, host, port, path, directOnly);
        }

        public boolean equals(Object other) {
            String str = this.id;
            return i02.i((i02.i(i02.i(i02.i((str == null ? 0 : str.hashCode()) * 31, 31, this.alias), 31, this.protocol), 31, this.host) + this.port) * 31, 31, this.path) + (this.directOnly ? 1231 : 1237);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.alias;
            String str3 = this.protocol;
            String str4 = this.host;
            int i = this.port;
            String str5 = this.path;
            boolean z = this.directOnly;
            StringBuilder sbZ = kb0.z("BackupRouteItemPayload(id=", str, ", alias=", str2, ", protocol=");
            i02.v(sbZ, str3, ", host=", str4, ", port=");
            sbZ.append(i);
            sbZ.append(", path=");
            sbZ.append(str5);
            sbZ.append(", directOnly=");
            return i9.i(sbZ, z, ")");
        }

        public BackupRouteItemPayload(String str, String str2, String str3, String str4, int i, String str5, boolean z) {
            str2.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            this.id = str;
            this.alias = str2;
            this.protocol = str3;
            this.host = str4;
            this.port = i;
            this.path = str5;
            this.directOnly = z;
        }

        public BackupRouteItemPayload() {
            this(null, null, null, null, 0, null, false, 127, null);
        }
    }
}
