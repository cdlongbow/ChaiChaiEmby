package defpackage;

import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public interface ks0 extends AutoCloseable {
    Path a();

    FileSystem getFileSystem();

    tl0 getMetadata();

    BufferedSource source();
}
