package defpackage;

import androidx.media3.common.GlTextureInfo;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.Consumer;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleExtractor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ql implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ql(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((GlShaderProgram) obj2).releaseOutputFrame((GlTextureInfo) obj);
                break;
            case 1:
                ((ExperimentalBitmapProcessor) obj2).handleException((VideoFrameProcessingException) obj);
                break;
            case 2:
                ((SubtitleExtractor) obj2).lambda$parseAndWriteToOutput$0((CuesWithTiming) obj);
                break;
            default:
                ((xs0) obj2).c((CuesWithTiming) obj);
                break;
        }
    }
}
