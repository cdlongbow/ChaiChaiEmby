package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface xt {
    boolean decodeBooleanElement(lw1 lw1Var, int i);

    byte decodeByteElement(lw1 lw1Var, int i);

    char decodeCharElement(lw1 lw1Var, int i);

    int decodeCollectionSize(lw1 lw1Var);

    double decodeDoubleElement(lw1 lw1Var, int i);

    int decodeElementIndex(lw1 lw1Var);

    float decodeFloatElement(lw1 lw1Var, int i);

    b20 decodeInlineElement(lw1 lw1Var, int i);

    int decodeIntElement(lw1 lw1Var, int i);

    long decodeLongElement(lw1 lw1Var, int i);

    boolean decodeSequentially();

    Object decodeSerializableElement(lw1 lw1Var, int i, l40 l40Var, Object obj);

    short decodeShortElement(lw1 lw1Var, int i);

    String decodeStringElement(lw1 lw1Var, int i);

    void endStructure(lw1 lw1Var);

    yw1 getSerializersModule();
}
