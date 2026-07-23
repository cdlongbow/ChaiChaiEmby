package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class gd extends a0 {
    private static final long serialVersionUID = 0;
    public transient int h;

    public gd() {
        super(kr.b(12));
        ig2.r(3, "expectedValuesPerKey");
        this.h = 3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.h = 3;
        int i = objectInputStream.readInt();
        k(kr.a());
        for (int i2 = 0; i2 < i; i2++) {
            List list = get(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                ((o0) list).add(objectInputStream.readObject());
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ku.U(this, objectOutputStream);
    }

    @Override // defpackage.p0
    public final Collection j() {
        return new ArrayList(this.h);
    }
}
