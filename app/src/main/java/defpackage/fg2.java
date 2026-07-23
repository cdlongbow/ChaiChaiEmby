package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import okio.BufferedSource;
import okio.internal.ZipFilesKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fg2 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ BufferedSource b;
    public final /* synthetic */ Ref.ObjectRef c;
    public final /* synthetic */ Ref.ObjectRef d;
    public final /* synthetic */ Ref.ObjectRef e;

    public /* synthetic */ fg2(Ref.ObjectRef objectRef, BufferedSource bufferedSource, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.c = objectRef;
        this.b = bufferedSource;
        this.d = objectRef2;
        this.e = objectRef3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int iIntValue = ((Integer) obj).intValue();
        long jLongValue = ((Long) obj2).longValue();
        switch (i) {
            case 0:
                return ZipFilesKt.readCentralDirectoryZipEntry$lambda$1$0(this.c, this.b, this.d, this.e, iIntValue, jLongValue);
            default:
                return ZipFilesKt.readOrSkipLocalHeader$lambda$0(this.b, this.c, this.d, this.e, iIntValue, jLongValue);
        }
    }

    public /* synthetic */ fg2(BufferedSource bufferedSource, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.b = bufferedSource;
        this.c = objectRef;
        this.d = objectRef2;
        this.e = objectRef3;
    }
}
