package defpackage;

import java.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class bt0 extends lt0 implements e01 {
    private static final long serialVersionUID = 0;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(i9.f(i, "Invalid key count "));
        }
        dt0 dt0VarA = ft0.a();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(i9.f(i4, "Invalid value count "));
            }
            xs0 xs0VarI = at0.i();
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                xs0VarI.c(object2);
            }
            dt0VarA.b(object, xs0VarI.f());
            i2 += i4;
        }
        try {
            gt1 gt1VarA = dt0VarA.a(true);
            ri riVar = jt0.a;
            riVar.getClass();
            try {
                ((Field) riVar.b).set(this, gt1VarA);
                ri riVar2 = jt0.b;
                riVar2.getClass();
                try {
                    ((Field) riVar2.b).set(this, Integer.valueOf(i2));
                } catch (IllegalAccessException e) {
                    lm.d(e);
                }
            } catch (IllegalAccessException e2) {
                lm.d(e2);
            }
        } catch (IllegalArgumentException e3) {
            throw ((InvalidObjectException) new InvalidObjectException(e3.getMessage()).initCause(e3));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ku.U(this, objectOutputStream);
    }

    @Override // defpackage.d61
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final at0 get(Object obj) {
        at0 at0Var = (at0) this.e.get(obj);
        if (at0Var != null) {
            return at0Var;
        }
        bl0 bl0Var = at0.b;
        return bt1.e;
    }
}
