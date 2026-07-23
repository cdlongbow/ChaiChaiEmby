package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class d11 extends View.BaseSavedState {
    public static final Parcelable.Creator<d11> CREATOR = new c11();
    public String a;
    public int b;
    public float c;
    public boolean d;
    public String e;
    public int g;
    public int h;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }
}
