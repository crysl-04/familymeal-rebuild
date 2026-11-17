package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fj implements Parcelable {
    public static final Parcelable.Creator<fj> CREATOR = new l3((byte) 2);
    public final int[] h;
    public final ArrayList i;
    public final int[] j;
    public final int[] k;
    public final int l;
    public final String m;
    public final int n;
    public final int o;
    public final CharSequence p;
    public final int q;
    public final CharSequence r;
    public final ArrayList s;
    public final ArrayList t;
    public final boolean u;

    public fj(ej ejVar) {
        int size = ejVar.a.size();
        this.h = new int[size * 6];
        if (!ejVar.g) {
            li1.g("Not on back stack");
            throw null;
        }
        this.i = new ArrayList(size);
        this.j = new int[size];
        this.k = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            hp0 hp0Var = (hp0) ejVar.a.get(i2);
            int i3 = i + 1;
            this.h[i] = hp0Var.a;
            ArrayList arrayList = this.i;
            jo0 jo0Var = hp0Var.b;
            arrayList.add(jo0Var != null ? jo0Var.l : null);
            int[] iArr = this.h;
            iArr[i3] = hp0Var.c ? 1 : 0;
            iArr[i + 2] = hp0Var.d;
            iArr[i + 3] = hp0Var.e;
            int i4 = i + 5;
            iArr[i + 4] = hp0Var.f;
            i += 6;
            iArr[i4] = hp0Var.g;
            this.j[i2] = hp0Var.h.ordinal();
            this.k[i2] = hp0Var.i.ordinal();
        }
        this.l = ejVar.f;
        this.m = ejVar.h;
        this.n = ejVar.s;
        this.o = ejVar.i;
        this.p = ejVar.j;
        this.q = ejVar.k;
        this.r = ejVar.l;
        this.s = ejVar.m;
        this.t = ejVar.n;
        this.u = ejVar.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.h);
        parcel.writeStringList(this.i);
        parcel.writeIntArray(this.j);
        parcel.writeIntArray(this.k);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        TextUtils.writeToParcel(this.p, parcel, 0);
        parcel.writeInt(this.q);
        TextUtils.writeToParcel(this.r, parcel, 0);
        parcel.writeStringList(this.s);
        parcel.writeStringList(this.t);
        parcel.writeInt(this.u ? 1 : 0);
    }

    public fj(Parcel parcel) {
        this.h = parcel.createIntArray();
        this.i = parcel.createStringArrayList();
        this.j = parcel.createIntArray();
        this.k = parcel.createIntArray();
        this.l = parcel.readInt();
        this.m = parcel.readString();
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.p = (CharSequence) creator.createFromParcel(parcel);
        this.q = parcel.readInt();
        this.r = (CharSequence) creator.createFromParcel(parcel);
        this.s = parcel.createStringArrayList();
        this.t = parcel.createStringArrayList();
        this.u = parcel.readInt() != 0;
    }
}
