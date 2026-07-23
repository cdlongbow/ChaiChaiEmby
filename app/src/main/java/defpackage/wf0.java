package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface wf0 {
    yt beginCollection(lw1 lw1Var, int i);

    yt beginStructure(lw1 lw1Var);

    void encodeBoolean(boolean z);

    void encodeByte(byte b);

    void encodeChar(char c);

    void encodeDouble(double d);

    void encodeEnum(lw1 lw1Var, int i);

    void encodeFloat(float f);

    wf0 encodeInline(lw1 lw1Var);

    void encodeInt(int i);

    void encodeLong(long j);

    void encodeNotNullMark();

    void encodeNull();

    void encodeSerializableValue(vw1 vw1Var, Object obj);

    void encodeShort(short s);

    void encodeString(String str);

    yw1 getSerializersModule();
}
