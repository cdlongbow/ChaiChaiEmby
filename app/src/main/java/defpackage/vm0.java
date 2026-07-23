package defpackage;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.media3.extractor.metadata.id3.Id3Decoder;

import java.io.IOException;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vm0 implements Id3Decoder.FramePredicate {
    public static /* bridge */ /* synthetic */ DeleteGesture a(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture b(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ InsertGesture c(Object obj) {
        return (InsertGesture) obj;
    }

    public static /* bridge */ /* synthetic */ JoinOrSplitGesture d(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    public static /* bridge */ /* synthetic */ RemoveSpaceGesture e(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectGesture f(Object obj) {
        return (SelectGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture g(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* synthetic */ void h() {
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void i(int i, String str) throws IOException {
        throw new IOException(str + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(Object obj, int i, String str) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void k(Object obj, Object obj2, Throwable th) {
        throw new SerializationException("Error accessing field: " + obj + ((Object) " (") + obj2 + ((Object) ")"), th);
    }

    public static /* synthetic */ void l(Object obj, String str, Object obj2) {
        throw new hr0(str + obj + ((Object) " at path ") + obj2);
    }

    public static /* synthetic */ void m(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void n(String str, Object obj) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void o(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void p(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* bridge */ /* synthetic */ boolean q(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* synthetic */ void r(String str, Object obj) {
        throw new SerializationException(str + obj);
    }

    public static /* synthetic */ void s(String str, Object obj, Throwable th) {
        throw new SerializationException(str + obj, th);
    }

    public static /* synthetic */ void t(Throwable th) {
        throw new IllegalStateException(th);
    }

    public static /* bridge */ /* synthetic */ boolean u(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof DeleteGesture;
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        return Id3Decoder.lambda$static$0(i, i2, i3, i4, i5);
    }
}
