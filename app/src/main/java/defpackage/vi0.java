package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.font.TypefaceResult;
import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vi0 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ vi0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                MediaItem mediaItem = (MediaItem) obj;
                mediaItem.getClass();
                return mediaItem.getId();
            case 1:
                MediaItem mediaItem2 = (MediaItem) obj;
                mediaItem2.getClass();
                return mediaItem2.getId();
            case 2:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 3:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 4:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 5:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 6:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 7:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 8:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 9:
                return FloatingActionButtonKt.FloatingActionButton_lF_WlFE$lambda$3$lambda$2((SemanticsPropertyReceiver) obj);
            case 10:
                return FontFamilyResolverImpl.preload$lambda$1$0((TypefaceResult.Immutable) obj);
            case 11:
                return FontFamilyResolverImpl.preload$lambda$1$1((TypefaceResult.Immutable) obj);
            case 12:
                return FontListFontFamilyTypefaceAdapter.preload$lambda$3$0((TypefaceRequest) obj);
            case 13:
                return GlobalSnapshot._init_$lambda$0(obj);
            case 14:
                tn0 tn0Var = (tn0) obj;
                tn0Var.getClass();
                String str = tn0Var.a;
                return str == null ? "main_route" : str;
            case 15:
                Context context = (Context) obj;
                context.getClass();
                View view = new View(context);
                view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                return view;
            case 16:
                View view2 = (View) obj;
                view2.getClass();
                view2.post(new e(view2, 18));
                return Unit.INSTANCE;
            case 17:
                Library library = (Library) obj;
                library.getClass();
                return library.getId();
            case 18:
                MediaItem mediaItem3 = (MediaItem) obj;
                mediaItem3.getClass();
                return mediaItem3.getId();
            case 19:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 20:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 21:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 22:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 23:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 24:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 25:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 26:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 27:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 28:
                return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & UByte.MAX_VALUE)}, 1));
            default:
                rx0 rx0Var = (rx0) obj;
                rx0Var.getClass();
                return rx0Var.getLibrary().getId();
        }
    }
}
