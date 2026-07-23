package defpackage;

import android.graphics.Gainmap;
import androidx.media3.common.VideoFrameProcessingException;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lc1 implements GlShaderProgram.ErrorListener {
    public static /* bridge */ /* synthetic */ Gainmap a(Object obj) {
        return (Gainmap) obj;
    }

    public static /* bridge */ /* synthetic */ Class b() {
        return BasicFileAttributes.class;
    }

    public static /* synthetic */ void f(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void g(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void h(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void j(String str, Object obj, Throwable th) {
        throw new GdxRuntimeException(str + obj, th);
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return FileAttributeView.class;
    }

    @Override // androidx.media3.effect.GlShaderProgram.ErrorListener
    public void onError(VideoFrameProcessingException videoFrameProcessingException) {
        PassthroughShaderProgram.lambda$new$0(videoFrameProcessingException);
    }
}
