package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class iu1 extends rn2 implements Parcelable, fl2, kn2, sj1 {
    public static final Parcelable.Creator<iu1> CREATOR = new l3((byte) 12);
    public dl2 i;

    public iu1(int i) {
        uk2 uk2VarH = bl2.h();
        dl2 dl2Var = new dl2(i, uk2VarH.g());
        if (!(uk2VarH instanceof wr0)) {
            dl2Var.b = new dl2(i, 1L);
        }
        this.i = dl2Var;
    }

    @Override // defpackage.qn2
    public final sn2 a() {
        return this.i;
    }

    @Override // defpackage.qn2
    public final sn2 b(sn2 sn2Var, sn2 sn2Var2, sn2 sn2Var3) {
        if (((dl2) sn2Var2).c == ((dl2) sn2Var3).c) {
            return sn2Var2;
        }
        return null;
    }

    @Override // defpackage.qn2
    public final void c(sn2 sn2Var) {
        this.i = (dl2) sn2Var;
    }

    @Override // defpackage.fl2
    public final hl2 d() {
        return vz1.s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((dl2) bl2.s(this.i, this)).c;
    }

    @Override // defpackage.kn2
    public final Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i) {
        uk2 uk2VarH;
        dl2 dl2Var = (dl2) bl2.f(this.i);
        if (dl2Var.c != i) {
            dl2 dl2Var2 = this.i;
            synchronized (bl2.c) {
                uk2VarH = bl2.h();
                ((dl2) bl2.n(dl2Var2, this, uk2VarH, dl2Var)).c = i;
            }
            bl2.l(uk2VarH, this);
        }
    }

    @Override // defpackage.sj1
    public final void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return wi0.f(((dl2) bl2.f(this.i)).c, hashCode(), "MutableIntState(value=", ")@");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(g());
    }
}
