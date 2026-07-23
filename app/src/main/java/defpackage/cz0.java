package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class cz0 extends ViewModel {
    public final uf0 a = new uf0();
    public final MutableStateFlow b;
    public final StateFlow c;
    public final MutableStateFlow d;
    public final StateFlow e;
    public final MutableStateFlow f;
    public final StateFlow g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public String j;
    public final int k;
    public final ArrayList l;
    public int m;
    public int n;
    public boolean o;
    public Library p;
    public px0 q;

    public cz0() {
        Object next;
        String strName;
        String str;
        String string;
        Iterator<E> it = uy0.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            strName = ((uy0) next).name();
            SharedPreferences sharedPreferences = ig2.d;
            str = "LAST_CONTENT_ADDED";
            if (sharedPreferences != null && (string = sharedPreferences.getString("sort_option", "LAST_CONTENT_ADDED")) != null) {
                str = string;
            }
        } while (!Intrinsics.areEqual(strName, str));
        uy0 uy0Var = (uy0) next;
        uy0Var = uy0Var == null ? uy0.LAST_CONTENT_ADDED : uy0Var;
        SharedPreferences sharedPreferences2 = ig2.d;
        boolean z = sharedPreferences2 == null ? true : sharedPreferences2.getBoolean("sort_descending", true);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(wy0.a);
        this.b = MutableStateFlow;
        this.c = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(uy0Var);
        this.d = MutableStateFlow2;
        this.e = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.valueOf(z));
        this.f = MutableStateFlow3;
        this.g = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.h = MutableStateFlow4;
        this.i = FlowKt.asStateFlow(MutableStateFlow4);
        this.k = 50;
        this.l = new ArrayList();
        this.q = new px0(qx0.b, "Movie,Series", true);
    }

    public static final int a(cz0 cz0Var, List list) {
        ArrayList arrayList = cz0Var.l;
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        HashSet hashSet = SequencesKt.toHashSet(SequencesKt.map(CollectionsKt.asSequence(arrayList), new ox0(3)));
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            MediaItem mediaItem = (MediaItem) it.next();
            if (hashSet.add(mediaItem.getId())) {
                arrayList.add(mediaItem);
                i2++;
            } else {
                i++;
            }
        }
        if (i > 0) {
            Log.w("LibraryViewModel", "分页结果包含重复项，已过滤: duplicates=" + i);
        }
        return i2;
    }

    public static final String b(cz0 cz0Var, uy0 uy0Var) {
        switch (zy0.$EnumSwitchMapping$0[uy0Var.ordinal()]) {
            case 1:
                return "DateCreated";
            case 2:
                return "DateLastContentAdded,DateCreated,SortName";
            case 3:
                return "LastContentPremiereDate,PremiereDate,SortName";
            case 4:
                return "SortName";
            case 5:
                return "ProductionYear,PremiereDate,SortName";
            case 6:
                return "CommunityRating,SortName";
            default:
                qu.f();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    public static final px0 c(cz0 cz0Var, Library library) {
        String str;
        String collectionType;
        String lowerCase = null;
        if (library != null) {
            boolean z = StringsKt__StringsJVMKt.equals(library.getType(), "CollectionFolder", true) && library.isFolder() && ((collectionType = library.getCollectionType()) == null || StringsKt.isBlank(collectionType)) && StringsKt__StringsJVMKt.equals(library.getLocationType(), "Virtual", true);
            boolean z2 = StringsKt__StringsJVMKt.equals(library.getType(), "Folder", true) && library.isFolder();
            if (z || z2) {
                return new px0(qx0.a, null, false);
            }
        }
        String collectionType2 = library != null ? library.getCollectionType() : null;
        if (collectionType2 != null) {
            lowerCase = collectionType2.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        if (lowerCase == null) {
            str = "Movie,Series";
        } else {
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -1068259517) {
                if (iHashCode != -936101932) {
                    if (iHashCode == 1888095479 && lowerCase.equals("homevideos")) {
                        str = "Video";
                    } else {
                        str = "Movie,Series";
                    }
                } else if (lowerCase.equals("tvshows")) {
                    str = "Series";
                } else {
                    str = "Movie,Series";
                }
            } else if (lowerCase.equals("movies")) {
                str = "Movie";
            } else {
                str = "Movie,Series";
            }
        }
        return new px0(qx0.b, str, true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        if (r0 == r2) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.cz0 r23, java.lang.String r24, java.lang.String r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cz0.d(cz0, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void e(String str, boolean z) {
        str.getClass();
        ArrayList arrayList = this.l;
        if (z || !Intrinsics.areEqual(this.j, str) || arrayList.isEmpty()) {
            this.j = str;
            arrayList.clear();
            this.m = 0;
            this.n = 0;
            this.b.setValue(wy0.a);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c6(this, str, null), 3, null);
            return;
        }
        Log.d("LibraryViewModel", "跳过重复加载: " + str + ", 已有 " + arrayList.size() + " 项");
    }

    public final void f() {
        String str = this.j;
        if (str == null || this.o || this.n >= this.m) {
            return;
        }
        this.o = true;
        MutableStateFlow mutableStateFlow = this.b;
        yy0 yy0Var = (yy0) mutableStateFlow.getValue();
        if (yy0Var instanceof xy0) {
            xy0 xy0Var = (xy0) yy0Var;
            List list = xy0Var.a;
            Library library = xy0Var.b;
            boolean z = xy0Var.c;
            int i = xy0Var.d;
            boolean z2 = xy0Var.e;
            list.getClass();
            mutableStateFlow.setValue(new xy0(list, library, z, i, z2, true));
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new az0(this, str, null), 3, null);
    }

    public final void g(uy0 uy0Var) {
        uy0Var.getClass();
        MutableStateFlow mutableStateFlow = this.d;
        mutableStateFlow.getValue();
        mutableStateFlow.setValue(uy0Var);
        String strName = uy0Var.name();
        strName.getClass();
        SharedPreferences sharedPreferences = ig2.d;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("sort_option", strName).apply();
        }
        String str = this.j;
        if (str != null) {
            e(str, true);
        }
    }

    public final void h() {
        MutableStateFlow mutableStateFlow = this.f;
        mutableStateFlow.setValue(Boolean.valueOf(!((Boolean) mutableStateFlow.getValue()).booleanValue()));
        boolean zBooleanValue = ((Boolean) mutableStateFlow.getValue()).booleanValue();
        SharedPreferences sharedPreferences = ig2.d;
        if (sharedPreferences != null) {
            i9.p(sharedPreferences, "sort_descending", zBooleanValue);
        }
        String str = this.j;
        if (str != null) {
            e(str, true);
        }
    }
}
