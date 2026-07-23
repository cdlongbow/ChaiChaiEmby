package defpackage;

import android.content.Context;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc b;

    public /* synthetic */ wc(vc vcVar, int i) {
        this.a = i;
        this.b = vcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        vc vcVar = this.b;
        switch (i) {
            case 0:
                vcVar.a();
                return Unit.INSTANCE;
            case 1:
                vcVar.a();
                return Unit.INSTANCE;
            case 2:
                vcVar.d();
                return Unit.INSTANCE;
            case 3:
                vc vcVar2 = this.b;
                if (((Boolean) vcVar2.i.getValue()).booleanValue()) {
                    String str = (String) vcVar2.l.getValue();
                    if (str == null || StringsKt.isBlank(str)) {
                        String str2 = (String) vcVar2.j.getValue();
                        String str3 = (String) vcVar2.k.getValue();
                        if (str2 == null || StringsKt.isBlank(str2) || str3 == null || StringsKt.isBlank(str3)) {
                            vcVar2.j("无法下载更新");
                            vcVar2.i("当前版本未找到可下载的 APK 资源，请前往发布页手动下载");
                        } else {
                            vcVar2.g(true);
                            vcVar2.p = false;
                            vcVar2.n.setIntValue(0);
                            long j = 1 + vcVar2.q;
                            vcVar2.q = j;
                            vcVar2.o = BuildersKt__Builders_commonKt.launch$default(vcVar2.b, null, null, new uc(vcVar2, str2, str3, j, (Continuation) null, 0), 3, null);
                        }
                    } else {
                        File file = new File(str);
                        if (file.exists()) {
                            Context context = vcVar2.a;
                            int iOrdinal = hg2.L(context, file).ordinal();
                            if (iOrdinal == 0) {
                                vcVar2.i("已打开安装界面，请按系统提示完成安装");
                            } else if (iOrdinal == 1) {
                                vcVar2.h(file.getAbsolutePath());
                                if (!hg2.F(context, new b(2, vcVar2.c, vcVar2))) {
                                    vcVar2.j("无法打开安装权限");
                                    vcVar2.i("设备未提供未知来源安装入口，可能是厂商限制。\n可在电脑下载发布页 APK 后执行：adb install -r xxx.apk");
                                }
                            } else {
                                if (iOrdinal != 2) {
                                    qu.f();
                                    return null;
                                }
                                vcVar2.j("安装失败");
                                vcVar2.i("无法启动系统安装器，请检查设备是否支持 APK 安装");
                            }
                        } else {
                            vcVar2.j("安装包丢失");
                            vcVar2.i("下载文件不存在，请重新下载更新");
                            vcVar2.f(null);
                            vcVar2.h(null);
                        }
                    }
                } else {
                    vcVar2.d();
                }
                return Unit.INSTANCE;
            case 4:
                return Float.valueOf(RangesKt.coerceIn(vcVar.n.getIntValue(), 0, 100) / 100.0f);
            default:
                vcVar.a();
                return Unit.INSTANCE;
        }
    }
}
