package defpackage;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.ViewModelKt;
import com.dh.myembyapp.data.IntroOutroMemory;
import com.dh.myembyapp.data.IntroOutroSettings;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ u1(Object obj, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, Object obj2, int i) {
        this.a = i;
        this.n = obj;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
        this.g = mutableState5;
        this.h = mutableState6;
        this.i = mutableState7;
        this.j = mutableState8;
        this.k = mutableState9;
        this.l = mutableState10;
        this.m = mutableState11;
        this.o = mutableState12;
        this.p = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0096  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableState mutableState;
        Object next;
        ServerConfig serverConfig;
        boolean z;
        int i = this.a;
        MutableState mutableState2 = this.g;
        MutableState mutableState3 = this.e;
        MutableState mutableState4 = this.d;
        MutableState mutableState5 = this.c;
        MutableState mutableState6 = this.b;
        Object obj = this.m;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.n;
        Object obj7 = this.h;
        Object obj8 = this.p;
        Object obj9 = this.o;
        switch (i) {
            case 0:
                Context context = (Context) obj6;
                String str = (String) obj9;
                w2 w2Var = (w2) obj8;
                MutableState mutableState7 = (MutableState) obj7;
                MutableState mutableState8 = (MutableState) obj5;
                MutableState mutableState9 = (MutableState) obj4;
                MutableState mutableState10 = (MutableState) obj3;
                MutableState mutableState11 = (MutableState) obj2;
                MutableState mutableState12 = (MutableState) obj;
                ArrayList arrayList = new ArrayList();
                if (StringsKt.isBlank((String) mutableState6.getValue())) {
                    arrayList.add("服务器别名");
                }
                if (StringsKt.isBlank((String) mutableState5.getValue())) {
                    arrayList.add("服务器地址");
                }
                if (StringsKt.isBlank((String) mutableState4.getValue())) {
                    arrayList.add("端口");
                }
                if (StringsKt.isBlank((String) mutableState3.getValue())) {
                    arrayList.add("用户名");
                }
                if (!arrayList.isEmpty()) {
                    Toast.makeText(context, CollectionsKt___CollectionsKt.joinToString$default(arrayList, "、", null, null, 0, null, null, 62, null) + " 未填写", 0).show();
                } else {
                    ServerPreferences serverPreferences = new ServerPreferences(context);
                    Iterator it = serverPreferences.getAllServers().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            ServerConfig serverConfig2 = (ServerConfig) next;
                            Iterator it2 = it;
                            mutableState = mutableState7;
                            if (!Intrinsics.areEqual(StringsKt.trim((CharSequence) serverConfig2.getAlias()).toString(), StringsKt.trim((CharSequence) mutableState6.getValue()).toString()) || Intrinsics.areEqual(serverConfig2.getId(), str)) {
                                it = it2;
                                mutableState7 = mutableState;
                            }
                        } else {
                            mutableState = mutableState7;
                            next = null;
                        }
                    }
                    if (((ServerConfig) next) == null) {
                        Integer intOrNull = StringsKt.toIntOrNull((String) mutableState4.getValue());
                        int iIntValue = intOrNull != null ? intOrNull.intValue() : 8096;
                        String string = StringsKt.trim((CharSequence) mutableState2.getValue()).toString();
                        if (string.length() > 0 && !StringsKt__StringsJVMKt.startsWith$default(string, "/", false, 2, null)) {
                            string = "/".concat(string);
                        }
                        String str2 = string;
                        ServerConfig serverById = str != null ? serverPreferences.getServerById(str) : null;
                        String string2 = StringsKt.trim((CharSequence) mutableState.getValue()).toString();
                        String str3 = string2.length() > 0 ? string2 : null;
                        if (serverById == null || (serverConfig = ServerConfig.copy$default(serverById, null, StringsKt.trim((CharSequence) mutableState6.getValue()).toString(), (String) mutableState8.getValue(), StringsKt.trim((CharSequence) mutableState5.getValue()).toString(), iIntValue, str2, StringsKt.trim((CharSequence) mutableState3.getValue()).toString(), StringsKt.trim((CharSequence) mutableState9.getValue()).toString(), null, null, null, 0L, false, ((Boolean) mutableState10.getValue()).booleanValue(), ((Boolean) mutableState11.getValue()).booleanValue(), false, ((Boolean) mutableState12.getValue()).booleanValue(), null, null, null, str3, 0L, 3055361, null)) == null) {
                            serverConfig = new ServerConfig(new ServerPreferences(context).generateServerId(), StringsKt.trim((CharSequence) mutableState6.getValue()).toString(), (String) mutableState8.getValue(), StringsKt.trim((CharSequence) mutableState5.getValue()).toString(), iIntValue, str2, StringsKt.trim((CharSequence) mutableState3.getValue()).toString(), StringsKt.trim((CharSequence) mutableState9.getValue()).toString(), null, null, null, 0L, false, ((Boolean) mutableState10.getValue()).booleanValue(), ((Boolean) mutableState11.getValue()).booleanValue(), false, ((Boolean) mutableState12.getValue()).booleanValue(), null, null, null, str3, 0L, 3055360, null);
                        }
                        w2Var.c.setValue(t2.a);
                        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(w2Var), null, null, new v2(serverConfig, w2Var, null), 3, null);
                    } else {
                        Toast.makeText(context, "服务器别名「" + StringsKt.trim((CharSequence) mutableState6.getValue()).toString() + "」已存在，请使用其他名称", 1).show();
                    }
                }
                break;
            case 1:
                pi.l((SnapshotStateList) obj9, this.b, this.c, this.d, this.e, this.g, (MutableState) obj7, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, (MutableState) obj, (Function1) obj8, ((ch) obj6).b);
                break;
            case 2:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj6;
                MutableState mutableState13 = (MutableState) obj5;
                MutableState mutableState14 = (MutableState) obj9;
                Function1 function1 = (Function1) obj8;
                List listEmptyList = CollectionsKt.emptyList();
                MutableState mutableState15 = this.b;
                MutableState mutableState16 = this.c;
                MutableState mutableState17 = this.d;
                MutableState mutableState18 = this.e;
                pi.n(snapshotStateList, mutableState15, mutableState16, mutableState17, mutableState18, this.g, (MutableState) obj7, mutableState13, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, listEmptyList);
                ((MutableState) obj).setValue("已清空备用线路列表");
                mutableState18.setValue(null);
                mutableState13.setValue(null);
                mutableState14.setValue(Boolean.FALSE);
                function1.invoke(snapshotStateList.toList());
                break;
            case 3:
                Boolean bool = (Boolean) mutableState6.getValue();
                bool.booleanValue();
                Boolean bool2 = (Boolean) mutableState5.getValue();
                bool2.booleanValue();
                Boolean bool3 = (Boolean) mutableState4.getValue();
                bool3.booleanValue();
                Boolean bool4 = (Boolean) mutableState3.getValue();
                bool4.booleanValue();
                Boolean bool5 = (Boolean) mutableState2.getValue();
                bool5.booleanValue();
                Boolean bool6 = (Boolean) ((MutableState) obj7).getValue();
                bool6.booleanValue();
                Boolean bool7 = (Boolean) ((MutableState) obj5).getValue();
                bool7.booleanValue();
                Boolean bool8 = (Boolean) ((MutableState) obj4).getValue();
                bool8.booleanValue();
                Boolean bool9 = (Boolean) ((MutableState) obj3).getValue();
                bool9.booleanValue();
                Boolean bool10 = (Boolean) ((MutableState) obj2).getValue();
                bool10.booleanValue();
                Boolean bool11 = (Boolean) ((MutableState) obj).getValue();
                bool11.booleanValue();
                Boolean bool12 = (Boolean) ((MutableState) obj9).getValue();
                bool12.booleanValue();
                Boolean bool13 = (Boolean) ((MutableState) obj8).getValue();
                bool13.booleanValue();
                ((Function13) obj6).invoke(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13);
                break;
            default:
                Long l = (Long) obj8;
                MediaItem mediaItem = (MediaItem) obj7;
                Context context2 = (Context) obj6;
                Function1 function2 = (Function1) obj5;
                Function1 function3 = (Function1) obj4;
                c71 c71Var = (c71) obj3;
                Function0 function0 = (Function0) obj2;
                Function0 function4 = (Function0) obj;
                if (Intrinsics.areEqual((Long) mutableState6.getValue(), (Long) obj9) && Intrinsics.areEqual((Long) mutableState5.getValue(), l)) {
                    z = false;
                } else {
                    String seasonId = mediaItem.getSeasonId();
                    if (seasonId == null) {
                        seasonId = mediaItem.getParentId();
                    }
                    if (seasonId != null) {
                        new IntroOutroMemory(context2).saveSeasonIntroOutro(seasonId, (Long) mutableState6.getValue(), (Long) mutableState5.getValue());
                        Log.d("IntroOutro", "保存手动标记: 正片=" + ((Long) mutableState6.getValue()) + ", 片尾=" + ((Long) mutableState5.getValue()));
                        z = true;
                    } else {
                        z = false;
                    }
                }
                function2.invoke(new IntroOutroSettings.Settings(((Boolean) mutableState4.getValue()).booleanValue(), ((Boolean) mutableState3.getValue()).booleanValue(), ((Boolean) mutableState2.getValue()).booleanValue()));
                function3.invoke(Boolean.FALSE);
                if (z) {
                    c71Var.invoke();
                }
                function0.invoke();
                function4.invoke();
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ u1(Context context, String str, w2 w2Var, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11) {
        this.a = 0;
        this.n = context;
        this.o = str;
        this.p = w2Var;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
        this.g = mutableState5;
        this.h = mutableState6;
        this.i = mutableState7;
        this.j = mutableState8;
        this.k = mutableState9;
        this.l = mutableState10;
        this.m = mutableState11;
    }

    public /* synthetic */ u1(Long l, Long l2, MediaItem mediaItem, Context context, Function1 function1, Function1 function2, c71 c71Var, Function0 function0, Function0 function3, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        this.a = 4;
        this.o = l;
        this.p = l2;
        this.h = mediaItem;
        this.n = context;
        this.i = function1;
        this.j = function2;
        this.k = c71Var;
        this.l = function0;
        this.m = function3;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
        this.g = mutableState5;
    }

    public /* synthetic */ u1(ch chVar, SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, Function1 function1) {
        this.a = 1;
        this.n = chVar;
        this.o = snapshotStateList;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
        this.g = mutableState5;
        this.h = mutableState6;
        this.i = mutableState7;
        this.j = mutableState8;
        this.k = mutableState9;
        this.l = mutableState10;
        this.m = mutableState11;
        this.p = function1;
    }
}
