package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gk0 {
    public static void a(FileSystem fileSystem, Path path) {
        if (fileSystem.exists(path)) {
            return;
        }
        try {
            fileSystem.sink(path).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void b(FileSystem fileSystem, Path path) throws IOException {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.list(path)) {
                try {
                    if (fileSystem.metadata(path2).getIsDirectory()) {
                        b(fileSystem, path2);
                    }
                    fileSystem.delete(path2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
