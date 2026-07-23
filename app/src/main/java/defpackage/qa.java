package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qa(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Activity activity;
        Window window;
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return AndroidTextPaint.setBrush_12SF9DM$lambda$0((Brush) obj, j);
            case 1:
                return DatePickerKt.Month$lambda$58$lambda$57$lambda$54$lambda$53((Function1) obj, j);
            case 2:
                return Long.valueOf(Http2Connection._init_$lambda$0((Http2Connection) obj, j));
            case 3:
                Context baseContext = (Context) obj;
                while (true) {
                    if (baseContext instanceof Activity) {
                        activity = (Activity) baseContext;
                    } else if (baseContext instanceof ContextWrapper) {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        baseContext.getClass();
                    } else {
                        activity = null;
                    }
                }
                if (activity != null && (window = activity.getWindow()) != null) {
                    window.setBackgroundDrawable(new ColorDrawable(ColorKt.m5206toArgb8_81llA(j)));
                }
                return Unit.INSTANCE;
            case 4:
                return Long.valueOf(RealWebSocket.initReaderAndWriter$lambda$0$0((RealWebSocket) obj, j));
            default:
                return TextFieldStateKt.rememberTextFieldState_Le_punE$lambda$0$0((String) obj, j);
        }
    }
}
