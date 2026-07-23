package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class c11 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        d11 d11Var = new d11(parcel);
        d11Var.a = parcel.readString();
        d11Var.c = parcel.readFloat();
        d11Var.d = parcel.readInt() == 1;
        d11Var.e = parcel.readString();
        d11Var.g = parcel.readInt();
        d11Var.h = parcel.readInt();
        return d11Var;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new d11[i];
    }
}
