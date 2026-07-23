package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc b;

    public /* synthetic */ rc(vc vcVar, int i) {
        this.a = i;
        this.b = vcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        vc vcVar = this.b;
        switch (i) {
            case 0:
                Intent intent = (Intent) obj;
                intent.getClass();
                intent.addFlags(268435456);
                vcVar.a.startActivity(intent);
                return Unit.INSTANCE;
            case 1:
                vcVar.n.setIntValue(((Integer) obj).intValue());
                return Unit.INSTANCE;
            default:
                ((ActivityResult) obj).getClass();
                Context context = vcVar.a;
                String str = (String) vcVar.m.getValue();
                if (str != null) {
                    File file = new File(str);
                    if (file.exists()) {
                        int iOrdinal = hg2.L(context, file).ordinal();
                        if (iOrdinal == 0) {
                            vcVar.h(null);
                            vcVar.i("已打开安装界面，请按系统提示完成安装");
                        } else if (iOrdinal == 1) {
                            boolean zF = hg2.F(context, new rc(vcVar, 0));
                            vcVar.j("需要安装权限");
                            vcVar.i(zF ? "请在系统设置中允许本应用安装 APK，然后返回继续安装" : "设备未提供未知来源安装入口，可能是厂商限制。\n可在电脑下载发布页 APK 后执行：adb install -r xxx.apk");
                        } else {
                            if (iOrdinal != 2) {
                                qu.f();
                                return null;
                            }
                            vcVar.h(null);
                            vcVar.j("安装失败");
                            vcVar.i("无法启动系统安装器，请检查设备是否支持 APK 安装");
                        }
                    } else {
                        vcVar.j("安装失败");
                        vcVar.i("安装包不存在，请重新下载更新");
                        vcVar.h(null);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
