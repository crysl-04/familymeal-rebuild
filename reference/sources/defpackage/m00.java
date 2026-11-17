package defpackage;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m00 implements mo2 {
    public final BitSet h;
    public final ih0[] i;
    public final BitSet k;
    public final int m;
    public double j = 1.0d;
    public boolean l = false;

    public m00(int i, ih0[] ih0VarArr, BitSet bitSet) {
        this.m = i;
        this.i = ih0VarArr;
        this.k = bitSet;
        this.h = new BitSet(i);
    }

    public static m00 a0(int i, boolean z) {
        return new m00(i, z ? new ih0[i] : null, new BitSet(i));
    }

    public final ArrayList R(a1 a1Var) {
        int i = this.m;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            ih0 hh0Var = this.i[i2];
            mg1 mg1Var = (mg1) hh0Var.R();
            cs1 cs1Var = (cs1) hh0Var.j();
            double dA = (a1Var.A(i2) * (this.h.get(i2) ? mg1Var.h() : 1.0d)) / this.j;
            if (this.l) {
                cs1 cs1Var2 = cs1.i;
                if (cs1Var == cs1Var2) {
                    dA = -dA;
                } else if (cs1Var == cs1.k) {
                    cs1Var = dA < 0.0d ? cs1Var2 : cs1.l;
                    dA = Math.abs(dA);
                }
            }
            mg1 mg1VarL = mg1Var.l();
            if (mg1VarL != mg1Var || cs1Var != hh0Var.j()) {
                hh0Var = new hh0(mg1VarL, cs1Var);
            }
            arrayList.add(new fh0(hh0Var, dA));
        }
        return arrayList;
    }

    public final void d0(int i, mg1 mg1Var, cs1 cs1Var, boolean z, boolean z2) {
        this.i[i] = new hh0(mg1Var, cs1Var);
        this.k.set(i, z);
        this.h.set(i, z2);
    }

    public final boolean j() {
        return this.i != null;
    }

    @Override // defpackage.mo2
    public final int size() {
        return this.m;
    }
}
