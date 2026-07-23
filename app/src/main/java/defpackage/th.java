package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.dh.myembyapp.data.SubtitlePreferences;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.ServerConfigKt;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class th implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ th(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, zq0 zq0Var, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, Context context) {
        this.a = 1;
        this.i = coroutineScope;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.j = zq0Var;
        this.e = mutableState4;
        this.g = mutableState5;
        this.h = mutableState6;
        this.k = context;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0168  */
    /* JADX WARN: Code duplicated, block: B:44:0x016c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0174  */
    /* JADX WARN: Code duplicated, block: B:47:0x017b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [T, kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i = this.a;
        Object r3 = 0;
        int i2 = -1;
        int i3 = 0;
        Object obj = this.k;
        Object obj2 = this.j;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        Object obj9 = this.i;
        switch (i) {
            case 0:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj9;
                MutableState mutableState = (MutableState) obj8;
                MutableState mutableState2 = (MutableState) obj7;
                MutableState mutableState3 = (MutableState) obj6;
                MutableState mutableState4 = (MutableState) obj5;
                MutableState mutableState5 = (MutableState) obj4;
                MutableState mutableState6 = (MutableState) obj3;
                MutableState mutableState7 = (MutableState) obj2;
                Function1 function1 = (Function1) obj;
                BackupRouteConfig backupRouteConfig = (BackupRouteConfig) mutableState.getValue();
                if (backupRouteConfig != null) {
                    String string = StringsKt.trim((CharSequence) backupRouteConfig.getAlias()).toString();
                    String string2 = StringsKt.trim((CharSequence) backupRouteConfig.getHost()).toString();
                    String path = backupRouteConfig.getPath();
                    if (path == null) {
                        path = "";
                    }
                    BackupRouteConfig backupRouteConfigNormalizeBackupRouteConfig = ServerConfigKt.normalizeBackupRouteConfig(BackupRouteConfig.copy$default(backupRouteConfig, null, string, null, string2, 0, StringsKt.trim((CharSequence) path).toString(), false, 85, null));
                    if (StringsKt.trim((CharSequence) backupRouteConfigNormalizeBackupRouteConfig.getAlias()).toString().length() == 0) {
                        str = "服务器别名不能为空";
                    } else if (StringsKt.trim((CharSequence) backupRouteConfigNormalizeBackupRouteConfig.getHost()).toString().length() == 0) {
                        str = "服务器地址不能为空";
                    } else {
                        int port = backupRouteConfigNormalizeBackupRouteConfig.getPort();
                        str = (1 > port || port >= 65536) ? "端口必须在 1 到 65535 之间" : null;
                    }
                    if (str != null) {
                        mutableState2.setValue(str);
                    } else {
                        Iterator it = snapshotStateList.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((BackupRouteConfig) it.next()).getId(), backupRouteConfigNormalizeBackupRouteConfig.getId())) {
                                i2 = i3;
                                if (i2 >= 0) {
                                    snapshotStateList.set(i2, backupRouteConfigNormalizeBackupRouteConfig);
                                } else if (snapshotStateList.size() >= 50) {
                                    mutableState2.setValue("最多只能配置 50 条备用线路");
                                } else {
                                    snapshotStateList.add(backupRouteConfigNormalizeBackupRouteConfig);
                                }
                                mutableState3.setValue(backupRouteConfigNormalizeBackupRouteConfig.getId());
                                mutableState4.setValue(backupRouteConfigNormalizeBackupRouteConfig.getId());
                                mutableState.setValue(BackupRouteConfig.copy$default(backupRouteConfigNormalizeBackupRouteConfig, null, null, null, null, 0, null, false, 127, null));
                                mutableState2.setValue(null);
                                mutableState5.setValue(null);
                                mutableState6.setValue(null);
                                mutableState7.setValue(null);
                                function1.invoke(snapshotStateList.toList());
                            } else {
                                i3++;
                            }
                        }
                        if (i2 >= 0) {
                            snapshotStateList.set(i2, backupRouteConfigNormalizeBackupRouteConfig);
                        } else if (snapshotStateList.size() >= 50) {
                            mutableState2.setValue("最多只能配置 50 条备用线路");
                        } else {
                            snapshotStateList.add(backupRouteConfigNormalizeBackupRouteConfig);
                        }
                        mutableState3.setValue(backupRouteConfigNormalizeBackupRouteConfig.getId());
                        mutableState4.setValue(backupRouteConfigNormalizeBackupRouteConfig.getId());
                        mutableState.setValue(BackupRouteConfig.copy$default(backupRouteConfigNormalizeBackupRouteConfig, null, null, null, null, 0, null, false, 127, null));
                        mutableState2.setValue(null);
                        mutableState5.setValue(null);
                        mutableState6.setValue(null);
                        mutableState7.setValue(null);
                        function1.invoke(snapshotStateList.toList());
                    }
                }
                break;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) obj9;
                MutableState mutableState8 = (MutableState) obj6;
                zq0 zq0Var = (zq0) obj2;
                MutableState mutableState9 = (MutableState) obj5;
                MutableState mutableState10 = (MutableState) obj4;
                MutableState mutableState11 = (MutableState) obj3;
                Context context = (Context) obj;
                Boolean bool = Boolean.FALSE;
                ((MutableState) obj8).setValue(bool);
                ((MutableState) obj7).setValue(bool);
                Job job = (Job) mutableState8.getValue();
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Object Launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new mp0(zq0Var, objectRef, mutableState9, mutableState10, mutableState11, context, mutableState8, null), 3, null);
                objectRef.element = Launch$default;
                if (Launch$default == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("job");
                } else {
                    r3 = Launch$default;
                }
                mutableState8.setValue(r3);
                break;
            default:
                ((vh1) obj9).invoke(Boolean.FALSE);
                ((SubtitlePreferences) obj8).saveSubtitlesEnabled(false);
                ig2.F((yh1) obj6, (String) obj5, (String) obj4, (TranscodeQualityOption) obj3, (zl1) obj2, (am1) obj, -1);
                ((xl1) obj7).invoke();
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ th(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Function function, int i) {
        this.a = i;
        this.i = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.g = obj6;
        this.h = obj7;
        this.j = obj8;
        this.k = function;
    }
}
