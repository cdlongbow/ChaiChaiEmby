package defpackage;

import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes5.dex */
public final class yv0 implements KType {
    public final KType a;

    public yv0(KType kType) {
        kType.getClass();
        this.a = kType;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        yv0 yv0Var = obj instanceof yv0 ? (yv0) obj : null;
        KType kType = yv0Var != null ? yv0Var.a : null;
        KType kType2 = this.a;
        if (!Intrinsics.areEqual(kType2, kType)) {
            return false;
        }
        KClassifier classifier = kType2.getClassifier();
        if (classifier instanceof KClass) {
            KType kType3 = obj instanceof KType ? (KType) obj : null;
            KClassifier classifier2 = kType3 != null ? kType3.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof KClass)) {
                return Intrinsics.areEqual(JvmClassMappingKt.getJavaClass((KClass) classifier), JvmClassMappingKt.getJavaClass((KClass) classifier2));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    public final List getArguments() {
        return this.a.getArguments();
    }

    @Override // kotlin.reflect.KType
    public final KClassifier getClassifier() {
        return this.a.getClassifier();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.a.isMarkedNullable();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}
