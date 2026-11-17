package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zo0 implements Parcelable {
    public static final Parcelable.Creator<zo0> CREATOR = new l3((byte) 6);
    public ArrayList h;
    public ArrayList i;
    public fj[] j;
    public int k;
    public String l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.h);
        parcel.writeStringList(this.i);
        parcel.writeTypedArray(this.j, i);
        parcel.writeInt(this.k);
        parcel.writeString(this.l);
        parcel.writeStringList(this.m);
        parcel.writeTypedList(this.n);
        parcel.writeTypedList(this.o);
    }
}
