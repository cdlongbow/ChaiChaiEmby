package androidx.media3.container;

public class ReorderingBufferQueue {
    public interface OutputConsumer {
        void consume(long j, Object parsableByteArray);
    }
}
