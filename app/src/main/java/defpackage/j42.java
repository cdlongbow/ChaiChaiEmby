package defpackage;

import java.util.ArrayList;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j42 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ j42(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                return ((h42) arrayList.get(((Integer) obj).intValue())).a;
            default:
                return TextStreamsKt.readLines$lambda$0(arrayList, (String) obj);
        }
    }
}
