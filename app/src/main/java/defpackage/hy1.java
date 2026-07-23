package defpackage;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerPingState;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class hy1 extends ViewModel {
    public ServerPreferences a;
    public lz0 b;
    public final ky1 c = new ky1();
    public Job d;
    public long e;
    public final MutableStateFlow f;
    public final StateFlow g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public final MutableStateFlow j;
    public final StateFlow k;

    public hy1() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.f = MutableStateFlow;
        this.g = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.h = MutableStateFlow2;
        this.i = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        this.j = MutableStateFlow3;
        this.k = FlowKt.asStateFlow(MutableStateFlow3);
    }

    public final StateFlow a() {
        return this.i;
    }

    public final StateFlow b() {
        return this.k;
    }

    public final StateFlow c() {
        return this.g;
    }

    public final void d(Context context) {
        context.getClass();
        if (this.a == null) {
            this.a = new ServerPreferences(context);
            this.b = new lz0(context);
        }
        e();
        ServerPreferences serverPreferences = this.a;
        this.h.setValue(serverPreferences != null ? serverPreferences.getLastUsedServerId() : null);
    }

    public final void e() {
        List<ServerConfig> listEmptyList;
        ServerPreferences serverPreferences = this.a;
        if (serverPreferences == null || (listEmptyList = serverPreferences.getAllServers()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.f.setValue(listEmptyList);
    }

    public final void f(List list) {
        list.getClass();
        long j = 1 + this.e;
        this.e = j;
        Job job = this.d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.d = null;
        boolean zIsEmpty = list.isEmpty();
        MutableStateFlow mutableStateFlow = this.j;
        if (zIsEmpty) {
            mutableStateFlow.setValue(MapsKt.emptyMap());
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((ServerConfig) obj).getId())) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10)), 16));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            Pair pair = TuplesKt.to(((ServerConfig) obj2).getId(), ServerPingState.INSTANCE.getMeasuring());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        mutableStateFlow.setValue(linkedHashMap);
        this.d = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new n7(arrayList, this, j, null, 4), 3, null);
    }

    public final void g(ServerConfig serverConfig) {
        serverConfig.getClass();
        ServerPreferences serverPreferences = this.a;
        if (serverPreferences != null) {
            serverPreferences.saveServer(serverConfig);
        }
        e();
        ServerPreferences serverPreferences2 = this.a;
        this.h.setValue(serverPreferences2 != null ? serverPreferences2.getLastUsedServerId() : null);
    }
}
