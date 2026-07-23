package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public class l0 extends g0 implements SortedMap {
    public SortedSet e;
    public final /* synthetic */ f61 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(f61 f61Var, SortedMap sortedMap) {
        super(f61Var, sortedMap);
        this.g = f61Var;
    }

    public SortedSet b() {
        return new m0(this.g, d());
    }

    @Override // defpackage.g0, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.e = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new l0(this.g, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new l0(this.g, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new l0(this.g, d().tailMap(obj));
    }
}
