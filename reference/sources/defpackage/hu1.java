package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hu1 extends rn2 implements Parcelable, fl2, kn2, sj1 {
    public static final Parcelable.Creator<hu1> CREATOR = new l3((byte) 11);
    public cl2 i;

    public hu1(float f) {
        uk2 uk2VarH = bl2.h();
        cl2 cl2Var = new cl2(f, uk2VarH.g());
        if (!(uk2VarH instanceof wr0)) {
            cl2Var.b = new cl2(f, 1L);
        }
        this.i = cl2Var;
    }

    @Override // defpackage.qn2
    public final sn2 a() {
        return this.i;
    }

    @Override // defpackage.qn2
    public final sn2 b(sn2 sn2Var, sn2 sn2Var2, sn2 sn2Var3) {
        if (((cl2) sn2Var2).c == ((cl2) sn2Var3).c) {
            return sn2Var2;
        }
        return null;
    }

    @Override // defpackage.qn2
    public final void c(sn2 sn2Var) {
        this.i = (cl2) sn2Var;
    }

    @Override // defpackage.fl2
    public final hl2 d() {
        return vz1.s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((cl2) bl2.s(this.i, this)).c;
    }

    @Override // defpackage.kn2
    public final Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f) {
        uk2 uk2VarH;
        cl2 cl2Var = (cl2) bl2.f(this.i);
        if (cl2Var.c == f) {
            return;
        }
        cl2 cl2Var2 = this.i;
        synchronized (bl2.c) {
            uk2VarH = bl2.h();
            ((cl2) bl2.n(cl2Var2, this, uk2VarH, cl2Var)).c = f;
        }
        bl2.l(uk2VarH, this);
    }

    @Override // defpackage.sj1
    public final void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((cl2) bl2.f(this.i)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(g());
    }
}
