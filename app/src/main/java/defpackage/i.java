package defpackage;

import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i implements wf0, yt {
    @Override // defpackage.wf0
    public yt beginCollection(lw1 lw1Var, int i) {
        lw1Var.getClass();
        return beginStructure(lw1Var);
    }

    @Override // defpackage.wf0
    public yt beginStructure(lw1 lw1Var) {
        lw1Var.getClass();
        return this;
    }

    @Override // defpackage.wf0
    public void encodeBoolean(boolean z) {
        encodeValue(Boolean.valueOf(z));
    }

    @Override // defpackage.yt
    public final void encodeBooleanElement(lw1 lw1Var, int i, boolean z) {
        lw1Var.getClass();
        if (encodeElement(lw1Var, i)) {
            encodeBoolean(z);
        }
    }

    @Override // defpackage.wf0
    public void encodeByte(byte b) {
        encodeValue(Byte.valueOf(b));
    }

    @Override // defpackage.yt
    public final void encodeByteElement(lw1 lw1Var, int i, byte b) {
        lw1Var.getClass();
        if (encodeElement(lw1Var, i)) {
            encodeByte(b);
        }
    }

    @Override // defpackage.wf0
    public void encodeChar(char c) {
        encodeValue(Character.valueOf(c));
    }

    @Override // defpackage.yt
    public final void encodeCharElement(lw1 lw1Var, int i, char c) {
        lw1Var.getClass();
        if (encodeElement(lw1Var, i)) {
            encodeChar(c);
        }
    }

    @Override // defpackage.wf0
    public void encodeDouble(double d) {
        encodeValue(Double.valueOf(d));
    }

    @Override // defpackage.yt
    public final void encodeDoubleElement(lw1 lw1Var, int i, double d) {
        lw1Var.getClass();
        if (encodeElement(lw1Var, i)) {
            encodeDouble(d);
        }
    }

    public boolean encodeElement(lw1 lw1Var, int i) {
        lw1Var.getClass();
        return true;
    }

    @Override // defpackage.wf0
    public void encodeEnum(lw1 lw1Var, int i) {
        lw1Var.getClass();
        encodeValue(Integer.valueOf(i));
    }

    @Override // defpackage.wf0
    public void encodeFloat(float f) {
        encodeValue(Float.valueOf(f));
    }

    @Override // defpackage.yt
    public final void encodeFloatElement(lw1 lw1Var, int i, float f) {
        lw1Var.getClass();
        if (encodeElement(lw1Var, i)) {
            encodeFloat(f);
        }
    }

    @Override // defpackage.wf0
    public wf0 encodeInline(lw1 lw1Var) {
        lw1Var.getClass();
        return this;
    }

    @Override // defpackage.yt
    public final wf0 encodeInlineElement(lw1 lw1Var, int i) {
        lw1Var.getClass();
        return encodeElement(lw1Var, i) ? encodeInline(lw1Var.e(i)) : x81.a;
    }

    @Override // defpackage.wf0
    public void encodeInt(int i) {
        encodeValue(Integer.valueOf(i));
    }

    @Override // defpackage.yt
    public final void encodeIntElement(lw1 lw1Var, int i, int i2) {
        lw1Var.getClass();
        if (encodeElement(lw1Var, i)) {
            encodeInt(i2);
        }
    }

    @Override // defpackage.wf0
    public void encodeLong(long j) {
        encodeValue(Long.valueOf(j));
    }

    @Override // defpackage.yt
    public final void encodeLongElement(lw1 lw1Var, int i, long j) {
        lw1Var.getClass();
        if (encodeElement(lw1Var, i)) {
            encodeLong(j);
        }
    }

    public <T> void encodeNullableSerializableElement(lw1 lw1Var, int i, vw1 vw1Var, T t) {
        lw1Var.getClass();
        vw1Var.getClass();
        if (encodeElement(lw1Var, i)) {
            encodeNullableSerializableValue(vw1Var, t);
        }
    }

    public <T> void encodeNullableSerializableValue(vw1 vw1Var, T t) {
        vw1Var.getClass();
        if (vw1Var.getDescriptor().b()) {
            encodeSerializableValue(vw1Var, t);
        } else if (t == null) {
            encodeNull();
        } else {
            encodeNotNullMark();
            encodeSerializableValue(vw1Var, t);
        }
    }

    @Override // defpackage.yt
    public <T> void encodeSerializableElement(lw1 lw1Var, int i, vw1 vw1Var, T t) {
        lw1Var.getClass();
        vw1Var.getClass();
        if (encodeElement(lw1Var, i)) {
            encodeSerializableValue(vw1Var, t);
        }
    }

    @Override // defpackage.wf0
    public void encodeSerializableValue(vw1 vw1Var, Object obj) {
        vw1Var.getClass();
        vw1Var.serialize(this, obj);
    }

    @Override // defpackage.wf0
    public void encodeShort(short s) {
        encodeValue(Short.valueOf(s));
    }

    @Override // defpackage.yt
    public final void encodeShortElement(lw1 lw1Var, int i, short s) {
        lw1Var.getClass();
        if (encodeElement(lw1Var, i)) {
            encodeShort(s);
        }
    }

    @Override // defpackage.wf0
    public void encodeString(String str) {
        str.getClass();
        encodeValue(str);
    }

    @Override // defpackage.yt
    public final void encodeStringElement(lw1 lw1Var, int i, String str) {
        lw1Var.getClass();
        str.getClass();
        if (encodeElement(lw1Var, i)) {
            encodeString(str);
        }
    }

    public void encodeValue(Object obj) {
        obj.getClass();
        throw new uw1("Non-serializable " + Reflection.getOrCreateKotlinClass(obj.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(getClass()) + " encoder");
    }

    @Override // defpackage.yt
    public void endStructure(lw1 lw1Var) {
        lw1Var.getClass();
    }

    public boolean shouldEncodeElementDefault(lw1 lw1Var, int i) {
        lw1Var.getClass();
        return true;
    }

    @Override // defpackage.wf0
    public void encodeNotNullMark() {
    }
}
