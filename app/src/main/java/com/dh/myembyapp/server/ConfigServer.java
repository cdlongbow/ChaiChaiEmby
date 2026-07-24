package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import com.google.gson.Gson;
import defpackage.i02;
import defpackage.i9;
import defpackage.kb0;
import defpackage.rd1;
import fi.iki.elonen.NanoHTTPD;
import java.nio.charset.Charset;
import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
final class ConfigServer extends NanoHTTPD {
    private final Context context;
    private final ServerConfig currentConfig;
    private final Gson gson;
    private final Function1<ServerConfig, Unit> onConfigReceived;

    /* JADX INFO: renamed from: com.dh.myembyapp.server.ConfigServer$handleConfigPost$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ServerConfig $config;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ServerConfig serverConfig, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$config = serverConfig;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConfigServer.this.new AnonymousClass1(this.$config, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            ConfigServer.this.onConfigReceived.invoke(this.$config);
            Log.d("ConfigServer", "Config received callback executed");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConfigServer(int i, Context context, ServerConfig serverConfig, Function1<? super ServerConfig, Unit> function1) {
        super(i);
        context.getClass();
        function1.getClass();
        this.context = context;
        this.currentConfig = serverConfig;
        this.onConfigReceived = function1;
        this.gson = new Gson();
    }

    private final NanoHTTPD.Response handleConfigPost(NanoHTTPD.IHTTPSession session) {
        String string;
        try {
            HashMap map = new HashMap();
            session.parseBody(map);
            String str = (String) map.get("postData");
            if (str == null) {
                NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.BAD_REQUEST, "text/plain; charset=UTF-8", "No data");
                responseNewFixedLengthResponse.getClass();
                return responseNewFixedLengthResponse;
            }
            Log.d("ConfigServer", "Received config data (raw): ".concat(str));
            Charset charset = Charsets.UTF_8;
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            Log.d("ConfigServer", "Received config data (UTF-8): ".concat(new String(bytes, charset)));
            ConfigData configData = (ConfigData) this.gson.fromJson(str, ConfigData.class);
            Log.d("ConfigServer", "Parsed config: alias=" + configData.getAlias() + ", host=" + configData.getHost() + ", port=" + configData.getPort());
            String strGenerateServerId = new ServerPreferences(this.context).generateServerId();
            String alias = configData.getAlias();
            String note = configData.getNote();
            ServerConfig serverConfig = new ServerConfig(strGenerateServerId, alias, configData.getProtocol(), configData.getHost(), configData.getPort(), configData.getPath(), configData.getUsername(), configData.getPassword(), null, null, null, 0L, false, configData.getDirectOnly(), configData.getEnableStrmDirectPlay(), false, configData.getTrustAllCerts(), null, null, null, (note == null || (string = StringsKt.trim((CharSequence) note).toString()) == null || string.length() <= 0) ? null : string, 0L, 3055360, null);
            Log.d("ConfigServer", "Calling onConfigReceived callback...");
            BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AnonymousClass1(serverConfig, null), 3, null);
            NanoHTTPD.Response responseNewFixedLengthResponse2 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/plain; charset=UTF-8", "OK");
            responseNewFixedLengthResponse2.getClass();
            return responseNewFixedLengthResponse2;
        } catch (Exception e) {
            Log.e("ConfigServer", "Failed to handle config", e);
            NanoHTTPD.Response responseNewFixedLengthResponse3 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.INTERNAL_ERROR, "text/plain; charset=UTF-8", "Error: " + e.getMessage());
            responseNewFixedLengthResponse3.getClass();
            return responseNewFixedLengthResponse3;
        }
    }

    private final NanoHTTPD.Response serveHtmlPage() {
        ServerConfig serverConfig = this.currentConfig;
        String strServeHtmlPage$escapeHtmlAttribute = serveHtmlPage$escapeHtmlAttribute(serverConfig != null ? serverConfig.getAlias() : null);
        ServerConfig serverConfig2 = this.currentConfig;
        String strServeHtmlPage$escapeHtmlAttribute2 = serveHtmlPage$escapeHtmlAttribute(serverConfig2 != null ? serverConfig2.getNote() : null);
        ServerConfig serverConfig3 = this.currentConfig;
        String str = "";
        String str2 = Intrinsics.areEqual(serverConfig3 != null ? serverConfig3.getProtocol() : null, "http") ? "selected" : "";
        ServerConfig serverConfig4 = this.currentConfig;
        String str3 = Intrinsics.areEqual(serverConfig4 != null ? serverConfig4.getProtocol() : null, "https") ? "selected" : "";
        ServerConfig serverConfig5 = this.currentConfig;
        String strServeHtmlPage$escapeHtmlAttribute3 = serveHtmlPage$escapeHtmlAttribute(serverConfig5 != null ? serverConfig5.getHost() : null);
        ServerConfig serverConfig6 = this.currentConfig;
        int port = serverConfig6 != null ? serverConfig6.getPort() : 8096;
        ServerConfig serverConfig7 = this.currentConfig;
        String strServeHtmlPage$escapeHtmlAttribute4 = serveHtmlPage$escapeHtmlAttribute(serverConfig7 != null ? serverConfig7.getPath() : null);
        ServerConfig serverConfig8 = this.currentConfig;
        String strServeHtmlPage$escapeHtmlAttribute5 = serveHtmlPage$escapeHtmlAttribute(serverConfig8 != null ? serverConfig8.getUsername() : null);
        ServerConfig serverConfig9 = this.currentConfig;
        String strServeHtmlPage$escapeHtmlAttribute6 = serveHtmlPage$escapeHtmlAttribute(serverConfig9 != null ? serverConfig9.getPassword() : null);
        ServerConfig serverConfig10 = this.currentConfig;
        String str4 = (serverConfig10 == null || !serverConfig10.getDirectOnly()) ? "" : "checked";
        ServerConfig serverConfig11 = this.currentConfig;
        String str5 = (serverConfig11 == null || !serverConfig11.getEnableStrmDirectPlay()) ? "" : "checked";
        ServerConfig serverConfig12 = this.currentConfig;
        if (serverConfig12 != null && serverConfig12.getTrustAllCerts()) {
            str = "checked";
        }
        StringBuilder sbZ = kb0.z("\n            <!DOCTYPE html>\n            <html lang=\"zh-CN\">\n            <head>\n                <meta charset=\"UTF-8\">\n                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n                <title>Emby 服务器配置</title>\n                <style>\n                    * { margin: 0; padding: 0; box-sizing: border-box; }\n                    body {\n                        font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, sans-serif;\n                        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);\n                        min-height: 100vh;\n                        padding: 20px;\n                    }\n                    .container {\n                        max-width: 500px;\n                        margin: 0 auto;\n                        background: white;\n                        border-radius: 16px;\n                        padding: 30px;\n                        box-shadow: 0 20px 60px rgba(0,0,0,0.3);\n                    }\n                    h1 {\n                        color: #333;\n                        margin-bottom: 10px;\n                        font-size: 24px;\n                    }\n                    .subtitle {\n                        color: #666;\n                        margin-bottom: 30px;\n                        font-size: 14px;\n                    }\n                    .form-group {\n                        margin-bottom: 20px;\n                    }\n                    label {\n                        display: block;\n                        margin-bottom: 8px;\n                        color: #555;\n                        font-weight: 500;\n                        font-size: 14px;\n                    }\n                    input, select {\n                        width: 100%;\n                        padding: 12px;\n                        border: 2px solid #e0e0e0;\n                        border-radius: 8px;\n                        font-size: 16px;\n                        transition: border-color 0.3s;\n                    }\n                    input:focus, select:focus {\n                        outline: none;\n                        border-color: #667eea;\n                    }\n                    button {\n                        width: 100%;\n                        padding: 14px;\n                        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);\n                        color: white;\n                        border: none;\n                        border-radius: 8px;\n                        font-size: 16px;\n                        font-weight: 600;\n                        cursor: pointer;\n                        transition: transform 0.2s;\n                    }\n                    button:active {\n                        transform: scale(0.98);\n                    }\n                    .success {\n                        position: fixed;\n                        top: 20px;\n                        left: 50%;\n                        transform: translateX(-50%);\n                        background: #10b981;\n                        color: white;\n                        padding: 16px 24px;\n                        border-radius: 8px;\n                        text-align: center;\n                        display: none;\n                        box-shadow: 0 4px 12px rgba(0,0,0,0.15);\n                        z-index: 1000;\n                        min-width: 200px;\n                        animation: slideDown 0.3s ease-out;\n                    }\n                    .error {\n                        position: fixed;\n                        top: 20px;\n                        left: 50%;\n                        transform: translateX(-50%);\n                        background: #ef4444;\n                        color: white;\n                        padding: 16px 24px;\n                        border-radius: 8px;\n                        text-align: center;\n                        display: none;\n                        box-shadow: 0 4px 12px rgba(0,0,0,0.15);\n                        z-index: 1000;\n                        min-width: 200px;\n                        animation: slideDown 0.3s ease-out;\n                    }\n                    @keyframes slideDown {\n                        from {\n                            opacity: 0;\n                            transform: translateX(-50%) translateY(-20px);\n                        }\n                        to {\n                            opacity: 1;\n                            transform: translateX(-50%) translateY(0);\n                        }\n                    }\n                </style>\n            </head>\n            <body>\n                <div class=\"container\">\n                    <h1>📺 Emby 服务器配置</h1>\n                    <p class=\"subtitle\">填写您的Emby服务器信息</p>\n                    \n                    <form id=\"configForm\">\n                        <div class=\"form-group\">\n                            <label>服务器别名</label>\n                            <input type=\"text\" id=\"alias\" placeholder=\"例如：家庭Emby\" value=\"", strServeHtmlPage$escapeHtmlAttribute, "\" required>\n                        </div>\n\n                        <div class=\"form-group\">\n                            <label>备注（可选）</label>\n                            <input type=\"text\" id=\"note\" placeholder=\"例如：家里主服、走专线、朋友共享\" value=\"", strServeHtmlPage$escapeHtmlAttribute2, "\">\n                        </div>\n                        \n                        <div class=\"form-group\">\n                            <label>协议</label>\n                            <select id=\"protocol\">\n                                <option value=\"http\" ");
        i02.v(sbZ, str2, ">HTTP</option>\n                                <option value=\"https\" ", str3, ">HTTPS</option>\n                            </select>\n                        </div>\n                        \n                        <div class=\"form-group\">\n                            <label>服务器地址</label>\n                            <input type=\"text\" id=\"host\" placeholder=\"192.168.1.100 或 emby.example.com\" value=\"");
        sbZ.append(strServeHtmlPage$escapeHtmlAttribute3);
        sbZ.append("\" required>\n                        </div>\n                        \n                        <div class=\"form-group\">\n                            <label>端口</label>\n                            <input type=\"number\" id=\"port\" value=\"");
        sbZ.append(port);
        sbZ.append("\" required>\n                        </div>\n                        \n                        <div class=\"form-group\">\n                            <label>路径（可选）</label>\n                            <input type=\"text\" id=\"path\" placeholder=\"如 emby\" value=\"");
        i02.v(sbZ, strServeHtmlPage$escapeHtmlAttribute4, "\">\n                        </div>\n                        \n                        <div class=\"form-group\">\n                            <label>用户名</label>\n                            <input type=\"text\" id=\"username\" placeholder=\"您的Emby用户名\" value=\"", strServeHtmlPage$escapeHtmlAttribute5, "\" required>\n                        </div>\n                        \n                        <div class=\"form-group\">\n                            <label>密码</label>\n                            <input type=\"password\" id=\"password\" placeholder=\"您的Emby密码\" value=\"");
        i02.v(sbZ, strServeHtmlPage$escapeHtmlAttribute6, "\" required>\n                        </div>\n                        \n                        <div class=\"form-group\" style=\"display: flex; align-items: center; gap: 8px;\">\n                            <input type=\"checkbox\" id=\"directOnly\" ", str4, " style=\"width: auto; margin: 0;\">\n                            <label for=\"directOnly\" style=\"margin: 0; cursor: pointer;\">仅直连（不使用代理）</label>\n                        </div>\n\n                        <div class=\"form-group\" style=\"display: flex; align-items: center; gap: 8px;\">\n                            <input type=\"checkbox\" id=\"enableStrmDirectPlay\" ");
        sbZ.append(str5);
        sbZ.append(" style=\"width: auto; margin: 0;\">\n                            <label for=\"enableStrmDirectPlay\" style=\"margin: 0; cursor: pointer;\">STRM直链播放</label>\n                        </div>\n                        \n                        <div class=\"form-group\" style=\"display: flex; align-items: center; gap: 8px;\">\n                            <input type=\"checkbox\" id=\"trustAllCerts\" ");
        sbZ.append(str);
        sbZ.append(" style=\"width: auto; margin: 0;\">\n                            <label for=\"trustAllCerts\" style=\"margin: 0; cursor: pointer; color: #ef4444;\">⚠️ 信任所有SSL证书（不安全）</label>\n                        </div>\n                        \n                        <button type=\"button\" id=\"submitBtn\">📺 同步到电视</button>\n                    </form>\n                </div>\n                \n                <!-- 提示消息浮动在页面顶部 -->\n                <div class=\"success\" id=\"success\">✅ 配置已成功发送到电视！</div>\n                <div class=\"error\" id=\"error\">❌ 发送失败，请重试</div>\n                \n                <script>\n                    // 智能解析URL\n                    function parseUrl(input) {\n                        let url = input.trim();\n                        let protocol = null;\n                        let port = null;\n                        \n                        // 识别协议\n                        const protocolMatch = url.match(/^(https?):\\/\\//i);\n                        if (protocolMatch) {\n                            protocol = protocolMatch[1].toLowerCase();\n                            url = url.substring(protocolMatch[0].length);\n                        }\n                        \n                        // 去除结尾斜杠\n                        url = url.replace(/[\\/\\\\]+$/, '');\n                        \n                        // 提取端口\n                        const portMatch = url.match(/:(\\d+)$/);\n                        if (portMatch) {\n                            port = parseInt(portMatch[1]);\n                            url = url.substring(0, portMatch.index);\n                        }\n                        \n                        return { host: url, protocol: protocol, port: port };\n                    }\n                    \n                    // 服务器地址输入框智能识别\n                    document.getElementById('host').addEventListener('input', (e) => {\n                        const parsed = parseUrl(e.target.value);\n                        \n                        // 只更新识别到的值\n                        if (parsed.protocol) {\n                            document.getElementById('protocol').value = parsed.protocol;\n                        }\n                        if (parsed.port) {\n                            document.getElementById('port').value = parsed.port;\n                        }\n                    });\n                    \n                    // 提交按钮点击事件\n                    const submitBtn = document.getElementById('submitBtn');\n                    console.log('Submit button found:', submitBtn);\n                    \n                    submitBtn.addEventListener('click', async (e) => {\n                        e.preventDefault();\n                        console.log('Submit button clicked!');\n                        \n                        const config = {\n                            alias: document.getElementById('alias').value.trim(),\n                            note: document.getElementById('note').value.trim(),\n                            protocol: document.getElementById('protocol').value,\n                            host: document.getElementById('host').value.trim(),\n                            port: parseInt(document.getElementById('port').value),\n                            path: document.getElementById('path').value.trim(),\n                            username: document.getElementById('username').value.trim(),\n                            password: document.getElementById('password').value.trim(),\n                            directOnly: document.getElementById('directOnly').checked,\n                            enableStrmDirectPlay: document.getElementById('enableStrmDirectPlay').checked,\n                            trustAllCerts: document.getElementById('trustAllCerts').checked\n                        };\n                        \n                        console.log('Sending config:', config);\n                        \n                        try {\n                            console.log('Fetching /config...');\n                            const response = await fetch('/config', {\n                                method: 'POST',\n                                headers: { \n                                    'Content-Type': 'application/json; charset=UTF-8',\n                                    'Accept-Charset': 'UTF-8'\n                                },\n                                body: JSON.stringify(config)\n                            });\n                            \n                            console.log('Response received:', response.status, response.statusText);\n                            \n                            if (response.ok) {\n                                console.log('Config sent successfully!');\n                                document.getElementById('success').style.display = 'block';\n                                document.getElementById('error').style.display = 'none';\n                                // 不再清空表单，保留用户填写的内容\n                                // 3秒后隐藏成功提示\n                                setTimeout(() => {\n                                    document.getElementById('success').style.display = 'none';\n                                }, 3000);\n                            } else {\n                                throw new Error('Failed to send config: ' + response.status);\n                            }\n                        } catch (error) {\n                            console.error('Send config error:', error);\n                            document.getElementById('error').style.display = 'block';\n                            document.getElementById('success').style.display = 'none';\n                            // 5秒后隐藏错误提示\n                            setTimeout(() => {\n                                document.getElementById('error').style.display = 'none';\n                            }, 5000);\n                        }\n                    });\n                </script>\n            </body>\n            </html>\n        ");
        NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/html; charset=UTF-8", StringsKt.trimIndent(sbZ.toString()));
        responseNewFixedLengthResponse.addHeader("Content-Type", "text/html; charset=UTF-8");
        return responseNewFixedLengthResponse;
    }

    private static final String serveHtmlPage$escapeHtmlAttribute(String str) {
        String strReplace$default;
        String strReplace$default2;
        String strReplace$default3;
        String strReplace$default4;
        return (str == null || (strReplace$default = str.replace("&", "&amp;")) == null || (strReplace$default2 = StringsKt.replace$default(strReplace$default, "\"", "&quot;", false, 4, (Object) null)) == null || (strReplace$default3 = StringsKt.replace$default(strReplace$default2, "<", "&lt;", false, 4, (Object) null)) == null || (strReplace$default4 = StringsKt.replace$default(strReplace$default3, ">", "&gt;", false, 4, (Object) null)) == null) ? "" : strReplace$default4;
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

        public static final  class ConfigData {
        private final String alias;
        private final boolean directOnly;
        private final boolean enableStrmDirectPlay;
        private final String host;
        private final String note;
        private final String password;
        private final String path;
        private final int port;
        private final String protocol;
        private final boolean trustAllCerts;
        private final String username;

        public ConfigData(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, boolean z, boolean z2, boolean z3) {
            str.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            str6.getClass();
            str7.getClass();
            this.alias = str;
            this.note = str2;
            this.protocol = str3;
            this.host = str4;
            this.port = i;
            this.path = str5;
            this.username = str6;
            this.password = str7;
            this.directOnly = z;
            this.enableStrmDirectPlay = z2;
            this.trustAllCerts = z3;
        }

        public static /* synthetic */ ConfigData copy$default(ConfigData configData, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = configData.alias;
            }
            if ((i2 & 2) != 0) {
                str2 = configData.note;
            }
            if ((i2 & 4) != 0) {
                str3 = configData.protocol;
            }
            if ((i2 & 8) != 0) {
                str4 = configData.host;
            }
            if ((i2 & 16) != 0) {
                i = configData.port;
            }
            if ((i2 & 32) != 0) {
                str5 = configData.path;
            }
            if ((i2 & 64) != 0) {
                str6 = configData.username;
            }
            if ((i2 & 128) != 0) {
                str7 = configData.password;
            }
            if ((i2 & 256) != 0) {
                z = configData.directOnly;
            }
            if ((i2 & 512) != 0) {
                z2 = configData.enableStrmDirectPlay;
            }
            if ((i2 & 1024) != 0) {
                z3 = configData.trustAllCerts;
            }
            boolean z4 = z2;
            boolean z5 = z3;
            String str8 = str7;
            boolean z6 = z;
            String str9 = str5;
            String str10 = str6;
            int i3 = i;
            String str11 = str3;
            return configData.copy(str, str2, str11, str4, i3, str9, str10, str8, z6, z4, z5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */

        /* JADX INFO: renamed from: component10, reason: from getter */

        /* JADX INFO: renamed from: component11, reason: from getter */

        /* JADX INFO: renamed from: component2, reason: from getter */

        /* JADX INFO: renamed from: component3, reason: from getter */

        /* JADX INFO: renamed from: component4, reason: from getter */

        /* JADX INFO: renamed from: component5, reason: from getter */

        /* JADX INFO: renamed from: component6, reason: from getter */

        /* JADX INFO: renamed from: component7, reason: from getter */

        /* JADX INFO: renamed from: component8, reason: from getter */

        /* JADX INFO: renamed from: component9, reason: from getter */

        public final ConfigData copy(String alias, String note, String protocol, String host, int port, String path, String username, String password, boolean directOnly, boolean enableStrmDirectPlay, boolean trustAllCerts) {
            alias.getClass();
            protocol.getClass();
            host.getClass();
            path.getClass();
            username.getClass();
            password.getClass();
            return new ConfigData(alias, note, protocol, host, port, path, username, password, directOnly, enableStrmDirectPlay, trustAllCerts);
        }

        public boolean equals(Object other) {
            int iHashCode = this.alias.hashCode() * 31;
            String str = this.note;
            return ((((i02.i(i02.i(i02.i((i02.i(i02.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.protocol), 31, this.host) + this.port) * 31, 31, this.path), 31, this.username), 31, this.password) + (this.directOnly ? 1231 : 1237)) * 31) + (this.enableStrmDirectPlay ? 1231 : 1237)) * 31) + (this.trustAllCerts ? 1231 : 1237);
        }

        public String toString() {
            String str = this.alias;
            String str2 = this.note;
            String str3 = this.protocol;
            String str4 = this.host;
            int i = this.port;
            String str5 = this.path;
            String str6 = this.username;
            String str7 = this.password;
            boolean z = this.directOnly;
            boolean z2 = this.enableStrmDirectPlay;
            boolean z3 = this.trustAllCerts;
            StringBuilder sbZ = kb0.z("ConfigData(alias=", str, ", note=", str2, ", protocol=");
            i02.v(sbZ, str3, ", host=", str4, ", port=");
            sbZ.append(i);
            sbZ.append(", path=");
            sbZ.append(str5);
            sbZ.append(", username=");
            i02.v(sbZ, str6, ", password=", str7, ", directOnly=");
            i9.r(sbZ, z, ", enableStrmDirectPlay=", z2, ", trustAllCerts=");
            return i9.i(sbZ, z3, ")");
        }

        public /* synthetic */ ConfigData(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? "" : str2, str3, str4, i, (i2 & 32) != 0 ? "" : str5, str6, str7, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? false : z2, (i2 & 1024) != 0 ? false : z3);
        }
    }
}
