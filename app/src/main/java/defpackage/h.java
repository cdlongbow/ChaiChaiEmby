package defpackage;

import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h implements b20, xt {
    public static /* synthetic */ Object decodeSerializableValue$default(h hVar, l40 l40Var, Object obj, int i, Object obj2) {
        if (obj2 != null) {
            lm.e("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
            return null;
        }
        if ((i & 2) != 0) {
            obj = null;
        }
        return hVar.decodeSerializableValue(l40Var, obj);
    }

    @Override // defpackage.b20
    public xt beginStructure(lw1 lw1Var) {
        lw1Var.getClass();
        return this;
    }

    @Override // defpackage.b20
    public boolean decodeBoolean() {
        Object objDecodeValue = decodeValue();
        objDecodeValue.getClass();
        return ((Boolean) objDecodeValue).booleanValue();
    }

    @Override // defpackage.xt
    public final boolean decodeBooleanElement(lw1 lw1Var, int i) {
        lw1Var.getClass();
        return decodeBoolean();
    }

    @Override // defpackage.b20
    public byte decodeByte() {
        Object objDecodeValue = decodeValue();
        objDecodeValue.getClass();
        return ((Byte) objDecodeValue).byteValue();
    }

    @Override // defpackage.xt
    public final byte decodeByteElement(lw1 lw1Var, int i) {
        lw1Var.getClass();
        return decodeByte();
    }

    @Override // defpackage.b20
    public char decodeChar() {
        Object objDecodeValue = decodeValue();
        objDecodeValue.getClass();
        return ((Character) objDecodeValue).charValue();
    }

    @Override // defpackage.xt
    public final char decodeCharElement(lw1 lw1Var, int i) {
        lw1Var.getClass();
        return decodeChar();
    }

    @Override // defpackage.xt
    public int decodeCollectionSize(lw1 lw1Var) {
        lw1Var.getClass();
        return -1;
    }

    @Override // defpackage.b20
    public double decodeDouble() {
        Object objDecodeValue = decodeValue();
        objDecodeValue.getClass();
        return ((Double) objDecodeValue).doubleValue();
    }

    @Override // defpackage.xt
    public final double decodeDoubleElement(lw1 lw1Var, int i) {
        lw1Var.getClass();
        return decodeDouble();
    }

    @Override // defpackage.b20
    public int decodeEnum(lw1 lw1Var) {
        lw1Var.getClass();
        Object objDecodeValue = decodeValue();
        objDecodeValue.getClass();
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // defpackage.b20
    public float decodeFloat() {
        Object objDecodeValue = decodeValue();
        objDecodeValue.getClass();
        return ((Float) objDecodeValue).floatValue();
    }

    @Override // defpackage.xt
    public final float decodeFloatElement(lw1 lw1Var, int i) {
        lw1Var.getClass();
        return decodeFloat();
    }

    @Override // defpackage.b20
    public b20 decodeInline(lw1 lw1Var) {
        lw1Var.getClass();
        return this;
    }

    @Override // defpackage.xt
    public b20 decodeInlineElement(lw1 lw1Var, int i) {
        lw1Var.getClass();
        return decodeInline(lw1Var.e(i));
    }

    @Override // defpackage.b20
    public int decodeInt() {
        Object objDecodeValue = decodeValue();
        objDecodeValue.getClass();
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // defpackage.xt
    public final int decodeIntElement(lw1 lw1Var, int i) {
        lw1Var.getClass();
        return decodeInt();
    }

    @Override // defpackage.b20
    public long decodeLong() {
        Object objDecodeValue = decodeValue();
        objDecodeValue.getClass();
        return ((Long) objDecodeValue).longValue();
    }

    @Override // defpackage.xt
    public final long decodeLongElement(lw1 lw1Var, int i) {
        lw1Var.getClass();
        return decodeLong();
    }

    @Override // defpackage.b20
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // defpackage.b20
    public Void decodeNull() {
        return null;
    }

    public final <T> T decodeNullableSerializableElement(lw1 lw1Var, int i, l40 l40Var, T t) {
        lw1Var.getClass();
        l40Var.getClass();
        return (l40Var.getDescriptor().b() || decodeNotNullMark()) ? (T) decodeSerializableValue(l40Var, t) : (T) decodeNull();
    }

    public <T> T decodeNullableSerializableValue(l40 l40Var) {
        l40Var.getClass();
        return (l40Var.getDescriptor().b() || decodeNotNullMark()) ? (T) decodeSerializableValue(l40Var) : (T) decodeNull();
    }

    @Override // defpackage.xt
    public boolean decodeSequentially() {
        return false;
    }

    @Override // defpackage.xt
    public <T> T decodeSerializableElement(lw1 lw1Var, int i, l40 l40Var, T t) {
        lw1Var.getClass();
        l40Var.getClass();
        return (T) decodeSerializableValue(l40Var, t);
    }

    @Override // defpackage.b20
    public <T> T decodeSerializableValue(l40 l40Var) {
        l40Var.getClass();
        return (T) l40Var.deserialize(this);
    }

    @Override // defpackage.b20
    public short decodeShort() {
        Object objDecodeValue = decodeValue();
        objDecodeValue.getClass();
        return ((Short) objDecodeValue).shortValue();
    }

    @Override // defpackage.xt
    public final short decodeShortElement(lw1 lw1Var, int i) {
        lw1Var.getClass();
        return decodeShort();
    }

    @Override // defpackage.b20
    public String decodeString() {
        Object objDecodeValue = decodeValue();
        objDecodeValue.getClass();
        return (String) objDecodeValue;
    }

    @Override // defpackage.xt
    public final String decodeStringElement(lw1 lw1Var, int i) {
        lw1Var.getClass();
        return decodeString();
    }

    public Object decodeValue() {
        throw new uw1(Reflection.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.xt
    public void endStructure(lw1 lw1Var) {
        lw1Var.getClass();
    }

    public <T> T decodeSerializableValue(l40 l40Var, T t) {
        l40Var.getClass();
        return (T) decodeSerializableValue(l40Var);
    }
}
