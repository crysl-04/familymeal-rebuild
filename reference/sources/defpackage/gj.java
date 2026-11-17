package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gj implements Parcelable {
    public static final Parcelable.Creator<gj> CREATOR = new l3((byte) 3);
    public final ArrayList h;
    public final ArrayList i;

    public gj(Parcel parcel) {
        this.h = parcel.createStringArrayList();
        this.i = parcel.createTypedArrayList(fj.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.h);
        parcel.writeTypedList(this.i);
    }
}
