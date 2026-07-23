package defpackage;

import java.util.Map;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes5.dex */
public abstract class aq1 {
    public static final Map a;

    static {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        StringCompanionObject.INSTANCE.getClass();
        mapCreateMapBuilder.put(orCreateKotlinClass, j32.a);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Character.TYPE);
        CharCompanionObject.INSTANCE.getClass();
        mapCreateMapBuilder.put(orCreateKotlinClass2, hp.a);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(char[].class), yo.c);
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Double.TYPE);
        DoubleCompanionObject.INSTANCE.getClass();
        mapCreateMapBuilder.put(orCreateKotlinClass3, lc0.a);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(double[].class), ic0.c);
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Float.TYPE);
        FloatCompanionObject.INSTANCE.getClass();
        mapCreateMapBuilder.put(orCreateKotlinClass4, nk0.a);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(float[].class), lk0.c);
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Long.TYPE);
        LongCompanionObject.INSTANCE.getClass();
        mapCreateMapBuilder.put(orCreateKotlinClass5, y01.a);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(long[].class), u01.c);
        KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(ULong.class);
        ULong.INSTANCE.getClass();
        mapCreateMapBuilder.put(orCreateKotlinClass6, jd2.a);
        KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(Integer.TYPE);
        IntCompanionObject.INSTANCE.getClass();
        mapCreateMapBuilder.put(orCreateKotlinClass7, fu0.a);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(int[].class), du0.c);
        KClass orCreateKotlinClass8 = Reflection.getOrCreateKotlinClass(UInt.class);
        UInt.INSTANCE.getClass();
        mapCreateMapBuilder.put(orCreateKotlinClass8, gd2.a);
        KClass orCreateKotlinClass9 = Reflection.getOrCreateKotlinClass(Short.TYPE);
        ShortCompanionObject.INSTANCE.getClass();
        mapCreateMapBuilder.put(orCreateKotlinClass9, h02.a);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(short[].class), e02.c);
        KClass orCreateKotlinClass10 = Reflection.getOrCreateKotlinClass(UShort.class);
        UShort.INSTANCE.getClass();
        mapCreateMapBuilder.put(orCreateKotlinClass10, md2.a);
        KClass orCreateKotlinClass11 = Reflection.getOrCreateKotlinClass(Byte.TYPE);
        ByteCompanionObject.INSTANCE.getClass();
        mapCreateMapBuilder.put(orCreateKotlinClass11, hn.a);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(byte[].class), en.c);
        KClass orCreateKotlinClass12 = Reflection.getOrCreateKotlinClass(UByte.class);
        UByte.INSTANCE.getClass();
        mapCreateMapBuilder.put(orCreateKotlinClass12, dd2.a);
        KClass orCreateKotlinClass13 = Reflection.getOrCreateKotlinClass(Boolean.TYPE);
        BooleanCompanionObject.INSTANCE.getClass();
        mapCreateMapBuilder.put(orCreateKotlinClass13, vl.a);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(boolean[].class), ul.c);
        KClass orCreateKotlinClass14 = Reflection.getOrCreateKotlinClass(Unit.class);
        Unit.INSTANCE.getClass();
        mapCreateMapBuilder.put(orCreateKotlinClass14, pd2.b);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Void.class), b91.a);
        try {
            KClass orCreateKotlinClass15 = Reflection.getOrCreateKotlinClass(Duration.class);
            Duration.INSTANCE.getClass();
            mapCreateMapBuilder.put(orCreateKotlinClass15, cd0.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(ULongArray.class), id2.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UIntArray.class), fd2.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UShortArray.class), ld2.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UByteArray.class), cd2.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            KClass orCreateKotlinClass16 = Reflection.getOrCreateKotlinClass(Uuid.class);
            Uuid.INSTANCE.getClass();
            mapCreateMapBuilder.put(orCreateKotlinClass16, de2.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        a = MapsKt.build(mapCreateMapBuilder);
    }
}
