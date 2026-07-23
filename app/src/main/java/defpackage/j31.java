package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j31 extends d {
    public final xv0 a;
    public final xv0 b;

    public j31(xv0 xv0Var, xv0 xv0Var2) {
        this.a = xv0Var;
        this.b = xv0Var2;
    }

    @Override // defpackage.d
    public final void g(xt xtVar, Object obj, int i, int i2) {
        Map map = (Map) obj;
        map.getClass();
        if (i2 < 0) {
            ra.q("Size must be known in advance when using READ_ALL");
            return;
        }
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt.until(0, i2 * 2), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            k(xtVar, i + first, map, false);
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    @Override // defpackage.d
    public final /* bridge */ /* synthetic */ void h(xt xtVar, int i, Object obj) {
        k(xtVar, i, (Map) obj, true);
    }

    public final void k(xt xtVar, int i, Map map, boolean z) {
        int iDecodeElementIndex;
        map.getClass();
        Object objDecodeSerializableElement = xtVar.decodeSerializableElement(getDescriptor(), i, this.a, null);
        if (z) {
            iDecodeElementIndex = xtVar.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex != i + 1) {
                lc1.f(i02.o(i, iDecodeElementIndex, "Value must follow key in a map, index for key: ", ", returned index for value: "));
                return;
            }
        } else {
            iDecodeElementIndex = i + 1;
        }
        boolean zContainsKey = map.containsKey(objDecodeSerializableElement);
        xv0 xv0Var = this.b;
        map.put(objDecodeSerializableElement, (!zContainsKey || (xv0Var.getDescriptor().getKind() instanceof yp1)) ? xtVar.decodeSerializableElement(getDescriptor(), iDecodeElementIndex, xv0Var, null) : xtVar.decodeSerializableElement(getDescriptor(), iDecodeElementIndex, xv0Var, MapsKt.getValue(map, objDecodeSerializableElement)));
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        int iE = e(obj);
        lw1 descriptor = getDescriptor();
        yt ytVarBeginCollection = wf0Var.beginCollection(descriptor, iE);
        Iterator itD = d(obj);
        int i = 0;
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            ytVarBeginCollection.encodeSerializableElement(getDescriptor(), i, this.a, key);
            i += 2;
            ytVarBeginCollection.encodeSerializableElement(getDescriptor(), i2, this.b, value);
        }
        ytVarBeginCollection.endStructure(descriptor);
    }
}
