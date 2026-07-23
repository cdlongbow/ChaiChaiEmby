package defpackage;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerIconEntry;
import com.dh.myembyapp.server.BackupRouteConfigServerManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ih implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ih(BackupRouteConfig backupRouteConfig, SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, Function1 function1, MutableState mutableState7) {
        this.j = backupRouteConfig;
        this.k = snapshotStateList;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
        this.g = mutableState5;
        this.h = mutableState6;
        this.l = function1;
        this.i = mutableState7;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x01b3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String id;
        int i = this.a;
        MutableState mutableState = this.c;
        MutableState mutableState2 = this.d;
        Object obj = this.k;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.e;
        Object obj7 = this.l;
        switch (i) {
            case 0:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                MutableState mutableState3 = (MutableState) obj6;
                MutableState mutableState4 = (MutableState) obj5;
                MutableState mutableState5 = (MutableState) obj4;
                Function1 function1 = (Function1) obj7;
                MutableState mutableState6 = (MutableState) obj3;
                String id2 = ((BackupRouteConfig) obj2).getId();
                Iterator<T> it = snapshotStateList.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                    } else if (!Intrinsics.areEqual(((BackupRouteConfig) it.next()).getId(), id2)) {
                        i2++;
                    }
                }
                if (i2 != -1) {
                    snapshotStateList.remove(i2);
                    MutableState mutableState7 = this.b;
                    if (Intrinsics.areEqual((String) mutableState7.getValue(), id2)) {
                        BackupRouteConfig backupRouteConfig = (BackupRouteConfig) CollectionsKt.getOrNull(snapshotStateList, i2);
                        if (backupRouteConfig == null || (id = backupRouteConfig.getId()) == null) {
                            BackupRouteConfig backupRouteConfig2 = (BackupRouteConfig) CollectionsKt.lastOrNull((List) snapshotStateList);
                            id = backupRouteConfig2 != null ? backupRouteConfig2.getId() : "__main_route__";
                        }
                        mutableState7.setValue(id);
                    }
                    if (Intrinsics.areEqual((String) mutableState.getValue(), id2)) {
                        mutableState.setValue(null);
                        mutableState2.setValue(null);
                    } else {
                        BackupRouteConfig backupRouteConfig3 = (BackupRouteConfig) mutableState2.getValue();
                        if (Intrinsics.areEqual(backupRouteConfig3 != null ? backupRouteConfig3.getId() : null, id2)) {
                            mutableState.setValue(null);
                            mutableState2.setValue(null);
                        }
                    }
                    mutableState3.setValue(null);
                    mutableState4.setValue(null);
                    mutableState5.setValue(null);
                    function1.invoke(snapshotStateList.toList());
                }
                mutableState6.setValue(null);
                break;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                BackupRouteConfigServerManager backupRouteConfigServerManager = (BackupRouteConfigServerManager) obj;
                ServerConfig serverConfig = (ServerConfig) obj7;
                MutableState mutableState8 = (MutableState) obj6;
                MutableState mutableState9 = (MutableState) obj5;
                MutableState mutableState10 = (MutableState) obj4;
                MutableState mutableState11 = (MutableState) obj3;
                MutableState mutableState12 = this.b;
                if (!((Boolean) mutableState12.getValue()).booleanValue()) {
                    mutableState.setValue(null);
                    MutableState mutableState13 = this.d;
                    mutableState13.setValue(null);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new mi(backupRouteConfigServerManager, serverConfig, mutableState12, mutableState8, mutableState9, mutableState10, mutableState11, mutableState13, null, 0), 3, null);
                }
                break;
            case 2:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj2, null, null, new cz((Function1) obj7, (Function0) obj, (MutableFloatState) mutableState2, (MutableFloatState) obj6, (MutableIntState) obj5, (MutableFloatState) obj4, (MutableIntState) obj3, this.b, this.c, (Continuation) null), 3, null);
                break;
            case 3:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj2, null, null, new i00((px1) obj, (ServerConfig) obj6, (ServerIconEntry) obj5, this.b, (Function1) obj7, (Function1) obj4, (Function0) obj3, this.c, this.d, (Continuation) null, 3), 3, null);
                break;
            case 4:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj2, null, null, new i00((q72) obj, (Function0) obj7, this.b, this.c, this.d, (MutableState) obj6, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3, null), 3, null);
                break;
            default:
                hb2.d((Function1) obj7, this.b, this.c, this.d, (MutableState) obj6, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, (MutableState) obj, true);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ih(Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9) {
        this.l = function1;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
        this.g = mutableState5;
        this.h = mutableState6;
        this.i = mutableState7;
        this.j = mutableState8;
        this.k = mutableState9;
    }

    public /* synthetic */ ih(CoroutineScope coroutineScope, px1 px1Var, ServerConfig serverConfig, ServerIconEntry serverIconEntry, MutableState mutableState, Function1 function1, Function1 function2, Function0 function0, MutableState mutableState2, MutableState mutableState3) {
        this.j = coroutineScope;
        this.k = px1Var;
        this.e = serverConfig;
        this.g = serverIconEntry;
        this.b = mutableState;
        this.l = function1;
        this.h = function2;
        this.i = function0;
        this.c = mutableState2;
        this.d = mutableState3;
    }

    public /* synthetic */ ih(CoroutineScope coroutineScope, q72 q72Var, Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        this.j = coroutineScope;
        this.k = q72Var;
        this.l = function0;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
        this.g = mutableState5;
        this.h = mutableState6;
        this.i = mutableState7;
    }

    public /* synthetic */ ih(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, BackupRouteConfigServerManager backupRouteConfigServerManager, ServerConfig serverConfig, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        this.j = coroutineScope;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.k = backupRouteConfigServerManager;
        this.l = serverConfig;
        this.e = mutableState4;
        this.g = mutableState5;
        this.h = mutableState6;
        this.i = mutableState7;
    }

    public /* synthetic */ ih(CoroutineScope coroutineScope, Function1 function1, Function0 function0, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableIntState mutableIntState, MutableFloatState mutableFloatState3, MutableIntState mutableIntState2, MutableState mutableState, MutableState mutableState2) {
        this.j = coroutineScope;
        this.l = function1;
        this.k = function0;
        this.d = mutableFloatState;
        this.e = mutableFloatState2;
        this.g = mutableIntState;
        this.h = mutableFloatState3;
        this.i = mutableIntState2;
        this.b = mutableState;
        this.c = mutableState2;
    }
}
