package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class nt0 extends ss0 {
    public h91 a;
    public boolean b;

    @Override // defpackage.ss0
    public final ss0 a(Object obj) {
        c(1, obj);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX WARN: Code duplicated, block: B:18:0x003f A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003c -> B:9:0x001e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:7:0x000d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void c(int r8, java.lang.Object r9) {
        /*
            r7 = this;
            h91 r0 = r7.a
            java.util.Objects.requireNonNull(r0)
            if (r8 != 0) goto L8
            return
        L8:
            boolean r0 = r7.b
            r1 = 0
            if (r0 == 0) goto L41
            h91 r0 = new h91
            h91 r2 = r7.a
            r0.<init>()
            int r3 = r2.c
            r0.d(r3)
            int r3 = r2.c
            r4 = -1
            if (r3 != 0) goto L20
        L1e:
            r3 = r4
            goto L21
        L20:
            r3 = r1
        L21:
            if (r3 == r4) goto L3f
            int r5 = r2.c
            defpackage.ig2.p(r3, r5)
            java.lang.Object[] r5 = r2.a
            r5 = r5[r3]
            int r6 = r2.c
            defpackage.ig2.p(r3, r6)
            int[] r6 = r2.b
            r6 = r6[r3]
            r0.e(r5, r6)
            int r3 = r3 + 1
            int r5 = r2.c
            if (r3 >= r5) goto L1e
            goto L21
        L3f:
            r7.a = r0
        L41:
            r7.b = r1
            r9.getClass()
            h91 r7 = r7.a
            int r0 = r7.b(r9)
            int r0 = r0 + r8
            r7.e(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt0.c(int, java.lang.Object):void");
    }
}
