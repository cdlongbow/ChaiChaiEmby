package androidx.emoji2.text.flatbuffer;

public class FlatBufferBuilder {
    public void putBoolean(boolean value) {}
    public void putInt(int value) {}
    public void putFloat(float value) {}
    public void putOffset(int offset) {}
    public int endObject() { return 0; }
    public int createString(String s) { return 0; }
    public void startObject(int numFields) {}
    public void addBoolean(int field, boolean value) {}
    public void addInt(int field, int value) {}
    public void addOffset(int field, int offset) {}
    public void addFloat(int field, float value) {}
}