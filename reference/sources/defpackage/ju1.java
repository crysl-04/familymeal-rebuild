package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ju1 extends rn2 implements Parcelable, fl2, kn2, sj1 {
    public static final Parcelable.Creator<ju1> CREATOR = new l3((byte) 13);
    public el2 i;

    public ju1(long j) {
        uk2 uk2VarH = bl2.h();
        el2 el2Var = new el2(uk2VarH.g(), j);
        if (!(uk2VarH instanceof wr0)) {
            el2Var.b = new el2(1L, j);
        }
        this.i = el2Var;
    }

    @Override // defpackage.qn2
    public final sn2 a() {
        return this.i;
    }

    @Override // defpackage.qn2
    public final sn2 b(sn2 sn2Var, sn2 sn2Var2, sn2 sn2Var3) {
        if (((el2) sn2Var2).c == ((el2) sn2Var3).c) {
            return sn2Var2;
        }
        return null;
    }

    @Override // defpackage.qn2
    public final void c(sn2 sn2Var) {
        this.i = (el2) sn2Var;
    }

    @Override // defpackage.fl2
    public final hl2 d() {
        return vz1.s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long g() {
        return ((el2) bl2.s(this.i, this)).c;
    }

    @Override // defpackage.kn2
    public final Object getValue() {
        return Long.valueOf(g());
    }

    public final void h(long j) {
        uk2 uk2VarH;
        el2 el2Var = (el2) bl2.f(this.i);
        if (el2Var.c != j) {
            el2 el2Var2 = this.i;
            synchronized (bl2.c) {
                uk2VarH = bl2.h();
                ((el2) bl2.n(el2Var2, this, uk2VarH, el2Var)).c = j;
            }
            bl2.l(uk2VarH, this);
        }
    }

    @Override // defpackage.sj1
    public final void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((el2) bl2.f(this.i)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(g());
    }
}
