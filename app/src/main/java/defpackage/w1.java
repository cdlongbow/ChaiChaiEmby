package defpackage;

import android.content.Context;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w1 implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ w1(dh dhVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        this.c = dhVar;
        this.b = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MediaItem mediaItem;
        String id;
        int i = this.a;
        boolean z = false;
        MutableState mutableState = this.b;
        Object obj = this.h;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                String str = (String) obj3;
                new ServerPreferences((Context) obj4).deleteServer(str);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj2, null, null, new n2((lz0) obj, str, null, 0), 3, null);
                mutableState.setValue(Boolean.FALSE);
                ((Function0) obj5).invoke();
                return Unit.INSTANCE;
            case 1:
                MutableState mutableState2 = (MutableState) obj3;
                MutableState mutableState3 = (MutableState) obj2;
                MutableState mutableState4 = (MutableState) obj5;
                MutableState mutableState5 = (MutableState) obj;
                BackupRouteConfig backupRouteConfig = ((dh) obj4).e;
                if (backupRouteConfig != null) {
                    mutableState.setValue(backupRouteConfig.getId());
                    mutableState2.setValue(backupRouteConfig.getId());
                    mutableState3.setValue(BackupRouteConfig.copy$default(backupRouteConfig, null, null, null, null, 0, null, false, 127, null));
                    mutableState4.setValue(null);
                }
                mutableState5.setValue(null);
                return Unit.INSTANCE;
            case 2:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj2, null, null, new r3(this.b, (ScrollState) obj4, (MutableState) obj3, (FocusRequester) obj5, (MutableState) obj, null, 4), 3, null);
                return Boolean.TRUE;
            case 3:
                MediaItem mediaItem2 = (MediaItem) obj4;
                List list = (List) obj3;
                MutableState mutableState6 = (MutableState) obj2;
                MutableState mutableState7 = (MutableState) obj5;
                MutableState mutableState8 = (MutableState) obj;
                u90.n(mutableState, false);
                if (mediaItem2 == null || (id = mediaItem2.getId()) == null) {
                    mediaItem = (MediaItem) CollectionsKt.firstOrNull(list);
                    if (mediaItem != null) {
                        id = mediaItem.getId();
                    } else {
                        id = null;
                    }
                } else {
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                id = null;
                            }
                        } while (!Intrinsics.areEqual(((MediaItem) it.next()).getId(), id));
                    } else {
                        id = null;
                    }
                    if (id == null) {
                        mediaItem = (MediaItem) CollectionsKt.firstOrNull(list);
                        if (mediaItem != null) {
                            id = mediaItem.getId();
                        } else {
                            id = null;
                        }
                    }
                }
                if (id != null) {
                    mutableState6.setValue(null);
                    mutableState7.setValue(id);
                    z = true;
                    mutableState8.setValue(Integer.valueOf(u90.i(mutableState8) + 1));
                }
                return Boolean.valueOf(z);
            default:
                Function0 function0 = (Function0) obj5;
                MutableState mutableState9 = (MutableState) obj2;
                MutableState mutableState10 = (MutableState) obj;
                mutableState.setValue(Boolean.FALSE);
                ((MutableState) obj4).setValue(Long.valueOf(System.currentTimeMillis()));
                if (!((Boolean) ((MutableState) obj3).getValue()).booleanValue() && !((Boolean) mutableState9.getValue()).booleanValue() && !((Boolean) mutableState10.getValue()).booleanValue()) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ w1(Context context, String str, CoroutineScope coroutineScope, Function0 function0, lz0 lz0Var, MutableState mutableState) {
        this.c = context;
        this.d = str;
        this.e = coroutineScope;
        this.g = function0;
        this.h = lz0Var;
        this.b = mutableState;
    }

    public /* synthetic */ w1(MediaItem mediaItem, List list, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.c = mediaItem;
        this.d = list;
        this.b = mutableState;
        this.e = mutableState2;
        this.g = mutableState3;
        this.h = mutableState4;
    }

    public /* synthetic */ w1(Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        this.g = function0;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
        this.h = mutableState5;
    }

    public /* synthetic */ w1(CoroutineScope coroutineScope, MutableState mutableState, ScrollState scrollState, MutableState mutableState2, FocusRequester focusRequester, MutableState mutableState3) {
        this.e = coroutineScope;
        this.b = mutableState;
        this.c = scrollState;
        this.d = mutableState2;
        this.g = focusRequester;
        this.h = mutableState3;
    }
}
