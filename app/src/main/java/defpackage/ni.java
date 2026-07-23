package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.ViewModelKt;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.PersonInfo;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import java.io.File;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class ni implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ni(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        ServerConfig serverById;
        String customIconPath;
        Object objM8825constructorimpl;
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(((BackupRouteConfig) obj2).getId());
                return Unit.INSTANCE;
            case 1:
                return new kn((xv0) ((Function1) ((xp) obj).b).invoke((KClass) obj2));
            case 2:
                ((Function1) obj).invoke(((sw) obj2).a);
                return Unit.INSTANCE;
            case 3:
                PersonInfo personInfo = (PersonInfo) obj2;
                ((Function3) obj).invoke(personInfo.getId(), personInfo.getName(), personInfo.getPrimaryImageTag());
                return Unit.INSTANCE;
            case 4:
                ((Function1) obj).invoke(((rg0) obj2).a);
                return Unit.INSTANCE;
            case 5:
                ((Function1) obj).invoke((bi0) obj2);
                return Unit.INSTANCE;
            case 6:
                ((Function1) obj).invoke(((u51) obj2).a);
                return Unit.INSTANCE;
            case 7:
                ya1 ya1Var = (ya1) obj2;
                ((Function2) obj).invoke(ya1Var.a, ya1Var.b);
                return Unit.INSTANCE;
            case 8:
                ((Function1) obj).invoke((ya1) obj2);
                return Unit.INSTANCE;
            case 9:
                ((Function1) obj).invoke((tn0) obj2);
                return Unit.INSTANCE;
            case 10:
                hy1 hy1Var = (hy1) obj;
                String id = ((ServerConfig) obj2).getId();
                id.getClass();
                ServerPreferences serverPreferences = hy1Var.a;
                Object[] objArr = 0;
                if (serverPreferences != null && (serverById = serverPreferences.getServerById(id)) != null && (customIconPath = serverById.getCustomIconPath()) != null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        File file = new File(customIconPath);
                        if (!file.exists()) {
                            file = null;
                        }
                        objM8825constructorimpl = Result.m8825constructorimpl(file != null ? Boolean.valueOf(file.delete()) : null);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM8825constructorimpl);
                    if (thM8828exceptionOrNullimpl != null) {
                        Log.w("ServerListViewModel", "删除服务器图标失败: ".concat(customIconPath), thM8828exceptionOrNullimpl);
                    }
                    Result.m8824boximpl(objM8825constructorimpl);
                    break;
                }
                ServerPreferences serverPreferences2 = hy1Var.a;
                if (serverPreferences2 != null) {
                    serverPreferences2.deleteServer(id);
                }
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(hy1Var), null, null, new n2(hy1Var, id, objArr == true ? 1 : 0, 10), 3, null);
                hy1Var.e();
                MutableStateFlow mutableStateFlow = hy1Var.h;
                ServerPreferences serverPreferences3 = hy1Var.a;
                mutableStateFlow.setValue(serverPreferences3 != null ? serverPreferences3.getLastUsedServerId() : null);
                MutableStateFlow mutableStateFlow2 = hy1Var.j;
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value, MapsKt__MapsKt.minus((Map<? extends String, ? extends V>) value, id)));
                return Unit.INSTANCE;
            case 11:
                ((Function1) obj).invoke(((o32) obj2).a);
                return Unit.INSTANCE;
            default:
                ((MutableState) obj2).setValue((o32) obj);
                return Unit.INSTANCE;
        }
    }
}
