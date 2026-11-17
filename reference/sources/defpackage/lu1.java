package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lu1 extends rn2 implements Parcelable, fl2 {
    public static final Parcelable.Creator<lu1> CREATOR = new ku1(0);
    public final hl2 i;
    public gl2 j;

    public lu1(Object obj, hl2 hl2Var) {
        this.i = hl2Var;
        uk2 uk2VarH = bl2.h();
        gl2 gl2Var = new gl2(uk2VarH.g(), obj);
        if (!(uk2VarH instanceof wr0)) {
            gl2Var.b = new gl2(1L, obj);
        }
        this.j = gl2Var;
    }

    @Override // defpackage.qn2
    public final sn2 a() {
        return this.j;
    }

    @Override // defpackage.qn2
    public final sn2 b(sn2 sn2Var, sn2 sn2Var2, sn2 sn2Var3) {
        if (this.i.e(((gl2) sn2Var2).c, ((gl2) sn2Var3).c)) {
            return sn2Var2;
        }
        return null;
    }

    @Override // defpackage.qn2
    public final void c(sn2 sn2Var) {
        this.j = (gl2) sn2Var;
    }

    @Override // defpackage.fl2
    public final hl2 d() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.kn2
    public final Object getValue() {
        return ((gl2) bl2.s(this.j, this)).c;
    }

    @Override // defpackage.sj1
    public final void setValue(Object obj) {
        uk2 uk2VarH;
        gl2 gl2Var = (gl2) bl2.f(this.j);
        if (this.i.e(gl2Var.c, obj)) {
            return;
        }
        gl2 gl2Var2 = this.j;
        synchronized (bl2.c) {
            uk2VarH = bl2.h();
            ((gl2) bl2.n(gl2Var2, this, uk2VarH, gl2Var)).c = obj;
        }
        bl2.l(uk2VarH, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((gl2) bl2.f(this.j)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        c5 c5Var = c5.f0;
        hl2 hl2Var = this.i;
        if (uz0.g(hl2Var, c5Var)) {
            i2 = 0;
        } else if (uz0.g(hl2Var, vz1.s)) {
            i2 = 1;
        } else {
            if (!uz0.g(hl2Var, vz1.k)) {
                li1.g("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
