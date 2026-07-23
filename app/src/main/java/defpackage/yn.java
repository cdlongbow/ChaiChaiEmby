package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class yn implements Function3 {
    public static final yn a = new yn();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        try {
            qb2.m((Response) obj2);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
