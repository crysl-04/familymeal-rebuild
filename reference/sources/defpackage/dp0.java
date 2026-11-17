package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dp0 implements Parcelable {
    public static final Parcelable.Creator<dp0> CREATOR = new l3((byte) 7);
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final int m;
    public final String n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final int s;
    public final String t;
    public final int u;
    public final boolean v;

    public dp0(Parcel parcel) {
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readString();
        this.o = parcel.readInt() != 0;
        this.p = parcel.readInt() != 0;
        this.q = parcel.readInt() != 0;
        this.r = parcel.readInt() != 0;
        this.s = parcel.readInt();
        this.t = parcel.readString();
        this.u = parcel.readInt();
        this.v = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.h);
        sb.append(" (");
        sb.append(this.i);
        sb.append(")}:");
        if (this.j) {
            sb.append(" fromLayout");
        }
        if (this.k) {
            sb.append(" dynamicContainer");
        }
        int i = this.m;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.n;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.o) {
            sb.append(" retainInstance");
        }
        if (this.p) {
            sb.append(" removing");
        }
        if (this.q) {
            sb.append(" detached");
        }
        if (this.r) {
            sb.append(" hidden");
        }
        String str2 = this.t;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.u);
        }
        if (this.v) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeInt(this.s);
        parcel.writeString(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v ? 1 : 0);
    }

    public dp0(jo0 jo0Var) {
        this.h = jo0Var.getClass().getName();
        this.i = jo0Var.l;
        this.j = jo0Var.u;
        this.k = jo0Var.w;
        this.l = jo0Var.E;
        this.m = jo0Var.F;
        this.n = jo0Var.G;
        this.o = jo0Var.J;
        this.p = jo0Var.s;
        this.q = jo0Var.I;
        this.r = jo0Var.H;
        this.s = jo0Var.T.ordinal();
        this.t = jo0Var.o;
        this.u = jo0Var.p;
        this.v = jo0Var.O;
    }
}
