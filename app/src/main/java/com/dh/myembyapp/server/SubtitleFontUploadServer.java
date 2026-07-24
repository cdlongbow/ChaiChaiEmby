package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import defpackage.o32;
import fi.iki.elonen.NanoHTTPD;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
final class SubtitleFontUploadServer extends NanoHTTPD {
    private final Context context;
    private final Function1<o32, Unit> onFontUploaded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubtitleFontUploadServer(int i, Context context, Function1<? super o32, Unit> function1) {
        super(i);
        context.getClass();
        function1.getClass();
        this.context = context;
        this.onFontUploaded = function1;
    }

    private final NanoHTTPD.Response handleUpload(NanoHTTPD.IHTTPSession session) {
        String strDecode;
        String lowerCase;
        String strSubstringAfterLast;
        try {
            HashMap map = new HashMap();
            session.parseBody(map);
            String str = (String) map.get("fontfile");
            if (str == null) {
                NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.BAD_REQUEST, "text/plain; charset=UTF-8", "No file");
                responseNewFixedLengthResponse.getClass();
                return responseNewFixedLengthResponse;
            }
            List<String> list = session.getParameters().get("fontname");
            String str2 = list != null ? (String) CollectionsKt.firstOrNull((List) list) : null;
            if (str2 == null || StringsKt.isBlank(str2)) {
                List<String> list2 = session.getParameters().get("fontfile");
                str2 = list2 != null ? (String) CollectionsKt.firstOrNull((List) list2) : null;
            }
            if (str2 == null || StringsKt.isBlank(str2)) {
                strDecode = null;
            } else if (str2.contains("%")) {
                try {
                    strDecode = URLDecoder.decode(str2, "UTF-8");
                } catch (Exception unused) {
                    strDecode = str2;
                }
            } else {
                strDecode = str2;
            }
            Log.d("FontUploadServer", "filename raw=" + str2 + " | candidate=" + strDecode + " | decoded=" + strDecode);
            if (strDecode == null || (strSubstringAfterLast = StringsKt.substringAfterLast(strDecode, '.', "")) == null) {
                lowerCase = null;
            } else {
                lowerCase = strSubstringAfterLast.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            String str3 = CollectionsKt.contains(SetsKt.setOf((Object[]) new String[]{"ttf", "otf"}), lowerCase) ? lowerCase : "ttf";
            if (strDecode == null || StringsKt.isBlank(strDecode)) {
                strDecode = "字体_" + System.currentTimeMillis() + "." + str3;
            } else if (StringsKt.contains$default(strDecode, Utf8.REPLACEMENT_CHARACTER, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) strDecode, '?', false, 2, (Object) null)) {
                strDecode = "字体_" + System.currentTimeMillis() + "." + str3;
            }
            Log.d("FontUploadServer", "filename ext=" + lowerCase + " | safeExt=" + str3 + " | finalName=" + strDecode);
            if (!CollectionsKt.contains(SetsKt.setOf((Object[]) new String[]{"ttf", "otf"}), lowerCase)) {
                NanoHTTPD.Response responseNewFixedLengthResponse2 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.BAD_REQUEST, "text/plain; charset=UTF-8", "Unsupported format");
                responseNewFixedLengthResponse2.getClass();
                return responseNewFixedLengthResponse2;
            }
            File file = new File(this.context.getFilesDir(), "subtitle_fonts");
            if (!file.exists()) {
                file.mkdirs();
            }
            String str4 = "font_" + System.currentTimeMillis();
            File file2 = new File(file, str4 + "." + str3);
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    ByteStreamsKt.copyTo$default(fileInputStream, fileOutputStream, 0, 2, null);
                    CloseableKt.closeFinally(fileOutputStream, null);
                    CloseableKt.closeFinally(fileInputStream, null);
                    String absolutePath = file2.getAbsolutePath();
                    absolutePath.getClass();
                    this.onFontUploaded.invoke(new o32(str4, strDecode, absolutePath));
                    NanoHTTPD.Response responseNewFixedLengthResponse3 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/plain; charset=UTF-8", "OK");
                    responseNewFixedLengthResponse3.getClass();
                    return responseNewFixedLengthResponse3;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(fileInputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception e) {
            Log.e("FontUploadServer", "Upload failed", e);
            NanoHTTPD.Response responseNewFixedLengthResponse4 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.INTERNAL_ERROR, "text/plain; charset=UTF-8", "Error: " + e.getMessage());
            responseNewFixedLengthResponse4.getClass();
            return responseNewFixedLengthResponse4;
        }
    }

    private final NanoHTTPD.Response serveHtml() {
        NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/html; charset=UTF-8", "<!DOCTYPE html>\n<html lang=\"zh-CN\">\n<head>\n    <meta charset=\"UTF-8\" />\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n    <title>上传字幕字体</title>\n    <style>\n        body { font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, sans-serif; background:#0f172a; color:#fff; padding:36px; }\n        .card { background:#111827; border-radius:12px; padding:28px; max-width:560px; margin:0 auto; }\n        h1 { font-size:20px; margin-bottom:16px; }\n        p { color:#cbd5e1; font-size:14px; margin-bottom:16px; }\n        input { display:none; }\n        .file-btn {\n            margin-top:28px; margin-bottom:12px; width:100%; padding:12px 12px;\n            background:#1f2937; border-radius:8px; color:#fff; text-align:center;\n        }\n        .file-name { margin-top:14px; font-size:12px; color:#cbd5e1; }\n        button { margin-top:24px; width:100%; padding:14px; background:#3b82f6; color:#fff; border:none; border-radius:8px; font-size:16px; }\n        .msg { margin-top:18px; font-size:14px; }\n    </style>\n</head>\n<body>\n    <div class=\"card\">\n        <h1>上传字幕字体</h1>\n        <p>支持 .ttf / .otf。上传后会自动同步到电视。</p>\n        <label class=\"file-btn\" for=\"file\">选择字体文件</label>\n        <input id=\"file\" type=\"file\" accept=\".ttf,.otf\" />\n        <div id=\"filename\" class=\"file-name\">未选择文件</div>\n        <button onclick=\"upload()\">上传字体</button>\n        <div id=\"msg\" class=\"msg\"></div>\n    </div>\n    <script>\n        const fileInput = document.getElementById('file');\n        fileInput.addEventListener('change', () => {\n            const f = fileInput.files[0];\n            document.getElementById('filename').innerText = f ? f.name : '未选择文件';\n        });\n        async function upload() {\n            const file = document.getElementById('file').files[0];\n            if (!file) {\n                document.getElementById('msg').innerText = '请选择字体文件';\n                return;\n            }\n            const form = new FormData();\n            form.append('fontfile', file, file.name);\n            form.append('fontname', encodeURIComponent(file.name));\n            document.getElementById('msg').innerText = '上传中...';\n            try {\n                const res = await fetch('/upload', { method: 'POST', body: form });\n                const text = await res.text();\n                document.getElementById('msg').innerText = res.ok ? '上传成功' : ('上传失败：' + text);\n            } catch (e) {\n                document.getElementById('msg').innerText = '上传失败：' + e.message;\n            }\n        }\n    </script>\n</body>\n</html>");
        responseNewFixedLengthResponse.addHeader("Content-Type", "text/html; charset=UTF-8");
        return responseNewFixedLengthResponse;
    }

    @Override // fi.iki.elonen.NanoHTTPD
    public NanoHTTPD.Response serve(NanoHTTPD.IHTTPSession session) {
        session.getClass();
        if (Intrinsics.areEqual(session.getUri(), "/")) {
            return serveHtml();
        }
        if (Intrinsics.areEqual(session.getUri(), "/upload") && session.getMethod() == NanoHTTPD.Method.POST) {
            return handleUpload(session);
        }
        NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.NOT_FOUND, NanoHTTPD.MIME_PLAINTEXT, "Not Found");
        responseNewFixedLengthResponse.getClass();
        return responseNewFixedLengthResponse;
    }
}
