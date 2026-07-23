package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.OtherServerResourceMatch;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerIconEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class n90 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public n90(ServerConfig serverConfig, MutableState mutableState, MutableState mutableState2) {
        this.a = 3;
        this.c = serverConfig;
        this.b = mutableState;
        this.d = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Function2) obj3).invoke((ServerConfig) obj2, (OtherServerResourceMatch) obj);
                break;
            case 1:
                MediaItem mediaItem = (MediaItem) obj3;
                ((MutableState) obj).setValue(mediaItem.getId());
                ((Function1) obj2).invoke(mediaItem.getId());
                break;
            case 2:
                if (!((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                    ((MutableState) obj).setValue((ServerIconEntry) obj3);
                }
                break;
            default:
                ServerConfig serverConfig = (ServerConfig) obj2;
                ((MutableState) obj3).setValue(serverConfig.getId());
                ((MutableState) obj).setValue(serverConfig.getId());
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n90(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
