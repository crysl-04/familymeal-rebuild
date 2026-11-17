package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Parcelable {
    public final Parcelable h;
    public static final d i = new d();
    public static final Parcelable.Creator<e> CREATOR = new ku1(1);

    public e(Parcelable parcelable) {
        if (parcelable != null) {
            this.h = parcelable == i ? null : parcelable;
        } else {
            wg.m("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.h, i2);
    }

    public e() {
        this.h = null;
    }

    public e(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.h = parcelable == null ? i : parcelable;
    }
}
