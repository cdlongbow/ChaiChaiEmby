package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public class m0 extends h0 implements SortedSet {
    public final /* synthetic */ f61 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(f61 f61Var, SortedMap sortedMap) {
        super(f61Var, sortedMap);
        this.c = f61Var;
    }

    public SortedMap a() {
        return (SortedMap) this.a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new m0(this.c, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new m0(this.c, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new m0(this.c, a().tailMap(obj));
    }
}
