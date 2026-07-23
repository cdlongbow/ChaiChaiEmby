package defpackage;

import android.graphics.ColorSpace;
import android.view.ScrollCaptureSession;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import com.google.gson.JsonIOException;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zq implements DoubleFunction, ObjectConstructor {
    public final /* synthetic */ int a;

    public /* synthetic */ zq(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ ColorSpace b(Object obj) {
        return (ColorSpace) obj;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession c(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession d(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* synthetic */ void e(String str, Object obj) {
        throw new JsonIOException(str + obj);
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.a) {
            case 20:
                return new TreeMap();
            case 21:
                return new ConcurrentHashMap();
            case 22:
                return new ConcurrentSkipListMap();
            case 23:
                return new ArrayList();
            case 24:
                return new LinkedHashSet();
            case 25:
                return new TreeSet();
            case 26:
                return new ArrayDeque();
            case 27:
                return ConstructorConstructor.lambda$newMapConstructor$3();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        switch (this.a) {
            case 11:
                return ColorSpaces.ExtendedSrgb$lambda$0(d);
            case 12:
                return ColorSpaces.ExtendedSrgb$lambda$1(d);
            case 13:
                return ColorSpaces.Bt2020Hlg$lambda$0(d);
            case 14:
                return ColorSpaces.Bt2020Hlg$lambda$1(d);
            case 15:
                return ColorSpaces.Bt2020Pq$lambda$0(d);
            default:
                return ColorSpaces.Bt2020Pq$lambda$1(d);
        }
    }
}
