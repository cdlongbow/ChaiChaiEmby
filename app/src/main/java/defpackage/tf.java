package defpackage;

import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class tf extends BaseAudioProcessor {
    public final int a;
    public final Function0 b;
    public long c;
    public long d;
    public long e;

    public tf(int i, g6 g6Var) {
        g6Var.getClass();
        this.a = i;
        this.b = g6Var;
        this.e = Long.MIN_VALUE;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        audioFormat.getClass();
        if (this.a == 0) {
            AudioProcessor.AudioFormat audioFormat2 = AudioProcessor.AudioFormat.NOT_SET;
            audioFormat2.getClass();
            return audioFormat2;
        }
        if (!Util.isEncodingLinearPcm(audioFormat.encoding) || audioFormat.bytesPerFrame <= 0) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        return audioFormat;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void onFlush(AudioProcessor.StreamMetadata streamMetadata) {
        streamMetadata.getClass();
        long jLongValue = ((Number) this.b.invoke()).longValue();
        if (jLongValue == this.e) {
            return;
        }
        this.e = jLongValue;
        double d = this.inputAudioFormat.sampleRate;
        int i = this.a;
        long jRoundToLong = MathKt.roundToLong((d * ((double) Math.abs(i))) / 1000.0d) * ((long) this.inputAudioFormat.bytesPerFrame);
        this.c = i > 0 ? jRoundToLong : 0L;
        if (i >= 0) {
            jRoundToLong = 0;
        }
        this.d = jRoundToLong;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void onReset() {
        this.c = 0L;
        this.d = 0L;
        this.e = Long.MIN_VALUE;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (hasPendingOutput()) {
            return;
        }
        if (this.c > 0) {
            int i = this.inputAudioFormat.bytesPerFrame;
            int iCoerceAtMost = (int) RangesKt.coerceAtMost(this.c, ((long) RangesKt.coerceAtLeast(65536 / i, 1)) * ((long) i));
            ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(iCoerceAtMost);
            byteBufferReplaceOutputBuffer.getClass();
            for (int i2 = 0; i2 < iCoerceAtMost; i2++) {
                byteBufferReplaceOutputBuffer.put((byte) 0);
            }
            byteBufferReplaceOutputBuffer.flip();
            this.c -= (long) iCoerceAtMost;
            return;
        }
        long j = this.d;
        if (j > 0) {
            int iCoerceAtMost2 = (int) RangesKt.coerceAtMost(j, byteBuffer.remaining());
            byteBuffer.position(byteBuffer.position() + iCoerceAtMost2);
            this.d -= (long) iCoerceAtMost2;
            if (!byteBuffer.hasRemaining()) {
                return;
            }
        }
        ByteBuffer byteBufferReplaceOutputBuffer2 = replaceOutputBuffer(byteBuffer.remaining());
        byteBufferReplaceOutputBuffer2.getClass();
        byteBufferReplaceOutputBuffer2.put(byteBuffer);
        byteBufferReplaceOutputBuffer2.flip();
    }
}
