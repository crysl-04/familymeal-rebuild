package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.h43;
import defpackage.i43;
import defpackage.l3;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new l3((byte) 10);
    public final i43 h;

    public ParcelImpl(Parcel parcel) {
        this.h = new h43(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new h43(parcel).i(this.h);
    }
}
