package defpackage;

import android.net.Uri;
import android.util.Log;
import androidx.core.os.CancellationSignal;
import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.transition.FragmentTransitionSupport;
import androidx.transition.Transition;

import java.util.List;
import java.util.Map;
import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g40 implements DefaultTrackSelector.TrackInfo.Factory, CancellationSignal.OnCancelListener, ExtractorsFactory, Authenticator {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g40(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, Response response) {
        String str = (String) this.b;
        String str2 = (String) this.c;
        String str3 = (String) this.a;
        response.getClass();
        if (response.request().header(HttpRequestHeader.ProxyAuthorization) != null) {
            Log.w(str, "代理认证已重试过一次，停止继续发送相同凭据");
            return null;
        }
        return response.request().newBuilder().header(HttpRequestHeader.ProxyAuthorization, Credentials.basic$default(str2, str3, null, 4, null)).build();
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        return DefaultTrackSelector.lambda$selectTextTrack$4((DefaultTrackSelector.Parameters) this.a, (String) this.b, (String) this.c, i, trackGroup, iArr);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        DefaultExtractorsFactory defaultExtractorsFactory = (DefaultExtractorsFactory) this.a;
        nd1 nd1Var = (nd1) this.b;
        md mdVar = (md) this.c;
        Extractor[] extractorArrCreateExtractors = defaultExtractorsFactory.createExtractors();
        extractorArrCreateExtractors.getClass();
        int length = extractorArrCreateExtractors.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            if (extractorArrCreateExtractors[i] instanceof MatroskaExtractor) {
                extractorArrCreateExtractors[i2] = new od(nd1Var, mdVar);
            }
            i++;
            i2 = i3;
        }
        return extractorArrCreateExtractors;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: experimentalSetCodecsToParseWithinGopSampleDependencies */
    public ExtractorsFactory mo10558experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        return this;
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        FragmentTransitionSupport.lambda$setListenerForTransitionEnd$0((Runnable) this.a, (Transition) this.b, (Runnable) this.c);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory */
    public ExtractorsFactory mo10559setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return this;
    }

    public /* synthetic */ g40(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.a = str3;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors(Uri uri, Map map) {
        return createExtractors();
    }
}
