package defpackage;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Transformations;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rb2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediatorLiveData b;

    public /* synthetic */ rb2(MediatorLiveData mediatorLiveData, int i) {
        this.a = i;
        this.b = mediatorLiveData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MediatorLiveData mediatorLiveData = this.b;
        switch (i) {
            case 0:
                return Transformations.switchMap$lambda$0$0(mediatorLiveData, obj);
            default:
                return Transformations.AnonymousClass2.onChanged$lambda$0(mediatorLiveData, obj);
        }
    }
}
