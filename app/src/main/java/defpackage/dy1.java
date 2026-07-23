package defpackage;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dy1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy1(Object obj, int i) {
        super(1, obj, FocusManager.class, "moveFocus", "moveFocus-3ESFkO8(I)Z", 0);
        this.a = i;
        switch (i) {
            case 2:
                super(1, obj, FocusManager.class, "moveFocus", "moveFocus-3ESFkO8(I)Z", 0);
                break;
            default:
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                List<String> list = (List) obj;
                list.getClass();
                hy1 hy1Var = (hy1) this.receiver;
                hy1Var.getClass();
                ServerPreferences serverPreferences = hy1Var.a;
                if (serverPreferences != null) {
                    serverPreferences.saveServerOrder(list);
                }
                hy1Var.e();
                MutableStateFlow mutableStateFlow = hy1Var.h;
                ServerPreferences serverPreferences2 = hy1Var.a;
                mutableStateFlow.setValue(serverPreferences2 != null ? serverPreferences2.getLastUsedServerId() : null);
                return Unit.INSTANCE;
            case 1:
                return Boolean.valueOf(((FocusManager) this.receiver).mo4803moveFocus3ESFkO8(((FocusDirection) obj).getValue()));
            default:
                return Boolean.valueOf(((FocusManager) this.receiver).mo4803moveFocus3ESFkO8(((FocusDirection) obj).getValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy1(hy1 hy1Var) {
        super(1, hy1Var, hy1.class, "saveServerOrder", "saveServerOrder(Ljava/util/List;)V", 0);
        this.a = 0;
    }
}
