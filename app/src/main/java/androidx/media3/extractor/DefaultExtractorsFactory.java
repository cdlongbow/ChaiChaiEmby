package androidx.media3.extractor;

import java.lang.reflect.Constructor;

public class DefaultExtractorsFactory {
    public interface ExtensionLoader {
        interface ConstructorSupplier {
            Constructor<?> getConstructor();
        }
    }
}
