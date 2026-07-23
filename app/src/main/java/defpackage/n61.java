package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Window;
import android.widget.Toast;
import androidx.compose.runtime.DisposableEffectScope;
import com.dh.myembyapp.MyEmbyApp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n61 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ n61(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Window window;
        int i = this.a;
        int i2 = 0;
        Context context = this.b;
        switch (i) {
            case 0:
                int i3 = MyEmbyApp.j;
                ((fs0) obj).getClass();
                Drawable drawable = context.getDrawable(zr1.media_placeholder);
                if (drawable != null) {
                    return ig2.f(drawable);
                }
                rd1.o("media_placeholder drawable is missing");
                return null;
            case 1:
                String str = (String) obj;
                str.getClass();
                Toast.makeText(context, str, 0).show();
                return Unit.INSTANCE;
            case 2:
                ((DisposableEffectScope) obj).getClass();
                Activity activityI = in1.i(context);
                if (activityI != null && (window = activityI.getWindow()) != null) {
                    window.addFlags(128);
                }
                return new bn1(activityI, i2);
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                Toast.makeText(context, str2, 0).show();
                return Unit.INSTANCE;
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                Toast.makeText(context, str3, 0).show();
                return Unit.INSTANCE;
            case 5:
                String str4 = (String) obj;
                str4.getClass();
                Toast.makeText(context, str4, 0).show();
                return Unit.INSTANCE;
            case 6:
                String str5 = (String) obj;
                str5.getClass();
                Toast.makeText(context, str5, 0).show();
                return Unit.INSTANCE;
            case 7:
                String str6 = (String) obj;
                str6.getClass();
                Toast.makeText(context, str6, 0).show();
                return Unit.INSTANCE;
            case 8:
                String str7 = (String) obj;
                str7.getClass();
                Toast.makeText(context, str7, 0).show();
                return Unit.INSTANCE;
            case 9:
                String str8 = (String) obj;
                str8.getClass();
                Toast.makeText(context, str8, 0).show();
                return Unit.INSTANCE;
            case 10:
                String str9 = (String) obj;
                str9.getClass();
                Toast.makeText(context, str9, 0).show();
                return Unit.INSTANCE;
            case 11:
                String str10 = (String) obj;
                str10.getClass();
                Toast.makeText(context, str10, 0).show();
                return Unit.INSTANCE;
            default:
                ((DisposableEffectScope) obj).getClass();
                return new bn1(context instanceof Activity ? (Activity) context : null, 1);
        }
    }
}
