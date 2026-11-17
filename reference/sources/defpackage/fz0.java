package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fz0 implements Parcelable {
    public static final Parcelable.Creator<fz0> CREATOR = new l3((byte) 8);
    public final IntentSender h;
    public final Intent i;
    public final int j;
    public final int k;

    public fz0(IntentSender intentSender, Intent intent, int i, int i2) {
        this.h = intentSender;
        this.i = intent;
        this.j = i;
        this.k = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
    }
}
