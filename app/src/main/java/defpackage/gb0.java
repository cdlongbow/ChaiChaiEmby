package defpackage;

import java.io.IOException;
import okio.ForwardingFileSystem;
import okio.Path;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public final class gb0 extends ForwardingFileSystem {
    @Override // okio.ForwardingFileSystem, okio.FileSystem
    public final Sink sink(Path path, boolean z) throws IOException {
        Path pathParent = path.parent();
        if (pathParent != null) {
            createDirectories(pathParent);
        }
        return super.sink(path, z);
    }
}
