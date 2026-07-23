package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qd1 {
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    public static final xv0 a(KClass kClass, xv0... xv0VarArr) {
        Object obj;
        xv0 xv0Var;
        Class<?> cls;
        Object obj2;
        xv0 xv0VarB;
        Field field;
        sw1 sw1Var;
        kClass.getClass();
        Class javaClass = JvmClassMappingKt.getJavaClass(kClass);
        xv0[] xv0VarArr2 = (xv0[]) Arrays.copyOf(xv0VarArr, xv0VarArr.length);
        javaClass.getClass();
        if (javaClass.isEnum() && javaClass.getAnnotation(sw1.class) == null && javaClass.getAnnotation(yo1.class) == null) {
            Object[] enumConstants = javaClass.getEnumConstants();
            String canonicalName = javaClass.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new qg0(canonicalName, (Enum[]) enumConstants);
        }
        xv0[] xv0VarArr3 = (xv0[]) Arrays.copyOf(xv0VarArr2, xv0VarArr2.length);
        ap1 ap1Var = null;
        try {
            Field declaredField = javaClass.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        xv0 xv0VarB2 = obj == null ? null : b(obj, (xv0[]) Arrays.copyOf(xv0VarArr3, xv0VarArr3.length));
        if (xv0VarB2 != null) {
            return xv0VarB2;
        }
        String canonicalName2 = javaClass.getCanonicalName();
        if (canonicalName2 == null || StringsKt__StringsJVMKt.startsWith$default(canonicalName2, "java.", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(canonicalName2, "kotlin.", false, 2, null)) {
            xv0Var = null;
        } else {
            Field[] declaredFields = javaClass.getDeclaredFields();
            declaredFields.getClass();
            int length = declaredFields.length;
            Field field2 = null;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Field field3 = declaredFields[i];
                if (Intrinsics.areEqual(field3.getName(), "INSTANCE") && Intrinsics.areEqual(field3.getType(), javaClass) && Modifier.isStatic(field3.getModifiers())) {
                    if (!z) {
                        z = true;
                        field2 = field3;
                    }
                }
                i++;
                field2 = null;
                break;
            }
            if (field2 == null) {
                xv0Var = null;
            } else {
                Object obj3 = field2.get(null);
                Method[] methods = javaClass.getMethods();
                methods.getClass();
                int length2 = methods.length;
                Method method = null;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    if (i2 >= length2) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i2];
                    if (Intrinsics.areEqual(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0 && Intrinsics.areEqual(method2.getReturnType(), xv0.class)) {
                            if (!z2) {
                                z2 = true;
                                method = method2;
                            }
                        }
                    }
                    i2++;
                    method = null;
                    break;
                }
                if (method == null) {
                    xv0Var = null;
                } else {
                    Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof xv0) {
                        xv0Var = (xv0) objInvoke;
                    } else {
                        xv0Var = null;
                    }
                }
            }
        }
        if (xv0Var != null) {
            return xv0Var;
        }
        xv0[] xv0VarArr4 = (xv0[]) Arrays.copyOf(xv0VarArr2, xv0VarArr2.length);
        Class<?>[] declaredClasses = javaClass.getDeclaredClasses();
        declaredClasses.getClass();
        int length3 = declaredClasses.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                cls = null;
                break;
            }
            cls = declaredClasses[i3];
            if (cls.getAnnotation(v61.class) != null) {
                break;
            }
            i3++;
        }
        if (cls == null) {
            obj2 = null;
        } else {
            try {
                Field declaredField2 = javaClass.getDeclaredField(cls.getSimpleName());
                declaredField2.setAccessible(true);
                obj2 = declaredField2.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (xv0VarB = b(obj2, (xv0[]) Arrays.copyOf(xv0VarArr4, xv0VarArr4.length))) == null) {
            try {
                Class<?>[] declaredClasses2 = javaClass.getDeclaredClasses();
                declaredClasses2.getClass();
                int length4 = declaredClasses2.length;
                Class<?> cls2 = null;
                int i4 = 0;
                boolean z3 = false;
                while (true) {
                    if (i4 < length4) {
                        Class<?> cls3 = declaredClasses2[i4];
                        if (Intrinsics.areEqual(cls3.getSimpleName(), "$serializer")) {
                            if (!z3) {
                                z3 = true;
                                cls2 = cls3;
                            }
                        }
                        i4++;
                    } else if (!z3) {
                    }
                    cls2 = null;
                    break;
                }
                Object obj4 = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
                xv0VarB = obj4 instanceof xv0 ? (xv0) obj4 : null;
            } catch (NoSuchFieldException unused3) {
            }
        }
        if (xv0VarB != null) {
            return xv0VarB;
        }
        if (javaClass.getAnnotation(yo1.class) != null || ((sw1Var = (sw1) javaClass.getAnnotation(sw1.class)) != null && Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(sw1Var.with()), Reflection.getOrCreateKotlinClass(ap1.class)))) {
            ap1Var = new ap1(JvmClassMappingKt.getKotlinClass(javaClass));
        }
        return ap1Var;
    }

    public static final xv0 b(Object obj, xv0... xv0VarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (xv0VarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = xv0VarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = xv0.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(xv0VarArr, xv0VarArr.length));
            if (objInvoke instanceof xv0) {
                return (xv0) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }
}
