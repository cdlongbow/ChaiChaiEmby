package defpackage;

import androidx.media3.common.VideoFrameProcessingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fm0 {
    public static final bn a;

    static {
        zm zmVar = new zm(15);
        w61 w61Var = w61.a;
        a = new bn(new zm(17), new wt1(new bu(new bn(zmVar, w61Var), new bn(new zm(16), w61Var))));
    }

    public static Exception a(Throwable th) {
        Object objNewInstance;
        List listAsList = Arrays.asList(VideoFrameProcessingException.class.getConstructors());
        bn bnVar = a;
        bnVar.getClass();
        if (!en0.n(listAsList)) {
            Iterator it = listAsList.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            listAsList = arrayList;
        }
        Object[] array = listAsList.toArray();
        Arrays.sort(array, bnVar);
        List listAsList2 = Arrays.asList(array);
        listAsList2.getClass();
        ArrayList arrayList2 = new ArrayList(listAsList2);
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Constructor constructor = (Constructor) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Object[] objArr = new Object[parameterTypes.length];
            int i2 = 0;
            while (true) {
                objNewInstance = null;
                if (i2 < parameterTypes.length) {
                    Class<?> cls = parameterTypes[i2];
                    if (!cls.equals(String.class)) {
                        if (!cls.equals(Throwable.class)) {
                            break;
                        }
                        objArr[i2] = th;
                    } else {
                        objArr[i2] = th.toString();
                    }
                    i2++;
                } else {
                    try {
                        objNewInstance = constructor.newInstance(objArr);
                        break;
                    } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
                    }
                }
            }
            Exception exc = (Exception) objNewInstance;
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + VideoFrameProcessingException.class + " in response to chained exception", th);
    }
}
