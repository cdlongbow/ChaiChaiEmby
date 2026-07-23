package defpackage;

import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g6 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(mh1 mh1Var, int i) {
        super(0, mh1Var, mh1.class, "retry", "retry()V", 0);
        this.a = i;
        switch (i) {
            case 10:
                super(0, mh1Var, mh1.class, "transcode", "transcode()V", 0);
                break;
            case 11:
                super(0, mh1Var, mh1.class, "backToDetail", "backToDetail()V", 0);
                break;
            case 12:
                super(0, mh1Var, mh1.class, "dismiss", "dismiss()V", 0);
                break;
            default:
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((vc) this.receiver).b();
                return Unit.INSTANCE;
            case 1:
                MutableStateFlow mutableStateFlow = ((va0) this.receiver).l0;
                if (!((aa0) mutableStateFlow.getValue()).a) {
                    mutableStateFlow.setValue(new aa0((jb2) null, (String) null, (kb2) null, (String) null, 31));
                }
                return Unit.INSTANCE;
            case 2:
                ((vc) this.receiver).b();
                return Unit.INSTANCE;
            case 3:
                ((cz0) this.receiver).f();
                return Unit.INSTANCE;
            case 4:
                ((cz0) this.receiver).h();
                return Unit.INSTANCE;
            case 5:
                ((cz0) this.receiver).f();
                return Unit.INSTANCE;
            case 6:
                ((cz0) this.receiver).h();
                return Unit.INSTANCE;
            case 7:
                vo1 vo1Var = (vo1) this.receiver;
                vo1Var.a = false;
                vo1Var.b = null;
                vo1Var.c = null;
                vo1Var.d = null;
                return Unit.INSTANCE;
            case 8:
                ((UserPreferences) this.receiver).clearAssSubtitleEnhancementGuard();
                return Unit.INSTANCE;
            case 9:
                ((mh1) this.receiver).a.invoke();
                return Unit.INSTANCE;
            case 10:
                mh1 mh1Var = (mh1) this.receiver;
                mh1Var.d.invoke(Boolean.FALSE);
                mh1Var.b.invoke();
                return Unit.INSTANCE;
            case 11:
                mh1 mh1Var2 = (mh1) this.receiver;
                mh1Var2.d.invoke(Boolean.FALSE);
                mh1Var2.e.invoke();
                mh1Var2.c.invoke();
                return Unit.INSTANCE;
            case 12:
                mh1 mh1Var3 = (mh1) this.receiver;
                mh1Var3.d.invoke(Boolean.TRUE);
                mh1Var3.e.invoke();
                mh1Var3.f.invoke(Boolean.FALSE);
                mh1Var3.g.invoke(0L);
                return Unit.INSTANCE;
            case 13:
                return Long.valueOf(((AtomicLong) this.receiver).get());
            default:
                ((vc) this.receiver).b();
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(vc vcVar, int i) {
        super(0, vcVar, vc.class, "checkForUpdate", "checkForUpdate()V", 0);
        this.a = i;
        switch (i) {
            case 2:
                super(0, vcVar, vc.class, "checkForUpdate", "checkForUpdate()V", 0);
                break;
            case 14:
                super(0, vcVar, vc.class, "checkForUpdate", "checkForUpdate()V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(vo1 vo1Var) {
        super(0, vo1Var, vo1.class, "reset", "reset()V", 0);
        this.a = 7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(UserPreferences userPreferences) {
        super(0, userPreferences, UserPreferences.class, "clearAssSubtitleEnhancementGuard", "clearAssSubtitleEnhancementGuard()V", 0);
        this.a = 8;
    }
}
