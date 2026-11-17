package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cb2 implements v12 {
    public double a;
    public transient l52 b;
    public transient l52 c;
    public transient l52 d;
    public transient ArrayList e;
    public int f;

    @Override // defpackage.v12
    public final void a(l52 l52Var, l52 l52Var2) {
        int i;
        int i2;
        double d;
        double d2 = this.a;
        if (this.e == null) {
            l52Var2.Z(l52Var);
            return;
        }
        double d3 = h32.b;
        boolean z = d2 == d3;
        if (!z) {
            d3 /= d2;
        }
        this.c.T1(Double.valueOf(h32.a));
        int size = this.e.size();
        int i3 = 0;
        while (i3 < size) {
            mh0 mh0Var = (mh0) this.e.get(i3);
            int i4 = mh0Var.h;
            double d4 = this.b.j[i4];
            l52 l52Var3 = this.c;
            double dA0 = h32.a;
            zk zkVar = mh0Var.i;
            if (zkVar instanceof cm2) {
                am2 it = ((cm2) zkVar).b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        d = d2;
                        break;
                    }
                    it.c();
                    d = d2;
                    int iD0 = (int) it.D0();
                    if (iD0 >= i4) {
                        break;
                    }
                    dA0 = (l52Var3.j[iD0] * it.A0()) + dA0;
                    d2 = d;
                }
            } else {
                d = d2;
                for (int i5 = 0; i5 < i4; i5++) {
                    double dA = zkVar.A(i5);
                    if (dA != h32.a) {
                        dA0 = (l52Var3.j[i5] * dA) + dA0;
                    }
                }
            }
            double d5 = l52Var.j[i4] - dA0;
            l52 l52Var4 = this.c;
            if (!z) {
                d4 *= d3;
            }
            l52Var4.j[i4] = d5 / d4;
            i3++;
            d2 = d;
        }
        double d6 = d2;
        for (int i6 = 0; i6 < this.f; i6++) {
            l52 l52Var5 = this.c;
            double d7 = this.b.j[i6];
            double[] dArr = l52Var5.j;
            dArr[i6] = d7 * dArr[i6];
        }
        this.d.T1(Double.valueOf(h32.a));
        int size2 = this.e.size() - 1;
        while (size2 >= 0) {
            mh0 mh0Var2 = (mh0) this.e.get(size2);
            int i7 = mh0Var2.h;
            double d8 = this.b.j[i7];
            l52 l52Var6 = this.d;
            double dA1 = h32.a;
            zk zkVar2 = mh0Var2.i;
            if (zkVar2 instanceof cm2) {
                am2 it2 = ((cm2) zkVar2).b().iterator();
                while (it2.hasNext()) {
                    it2.c();
                    int iD1 = (int) it2.D0();
                    if (iD1 > i7) {
                        dA1 = (l52Var6.j[iD1] * it2.A0()) + dA1;
                        size2 = size2;
                    }
                }
                i = size2;
            } else {
                i = size2;
                int i8 = i7 + 1;
                int size3 = zkVar2.size();
                while (i8 < size3) {
                    double dA2 = zkVar2.A(i8);
                    if (dA2 != h32.a) {
                        i2 = i8;
                        dA1 = (l52Var6.j[i2] * dA2) + dA1;
                    } else {
                        i2 = i8;
                    }
                    i8 = i2 + 1;
                }
            }
            double d9 = this.c.j[i7] - dA1;
            l52 l52Var7 = this.d;
            if (!z) {
                d8 *= d3;
            }
            l52Var7.j[i7] = d9 / d8;
            size2 = i - 1;
        }
        double d10 = z ? h32.b : d6 / (h32.c - d6);
        if (d10 != h32.b) {
            for (int i9 = 0; i9 < this.f; i9++) {
                double[] dArr2 = this.d.j;
                dArr2[i9] = dArr2[i9] * d10;
            }
        }
        l52Var2.Z(this.d);
    }

    @Override // defpackage.v12
    public final void b(ArrayList arrayList, int i) {
        this.e = arrayList;
        this.f = i;
        l52 l52VarA = b00.a(this.b, i);
        this.b = l52VarA;
        l52VarA.T1(Double.valueOf(h32.b));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            mh0 mh0Var = (mh0) arrayList.get(i2);
            double d = mh0Var.j;
            if (d != h32.a) {
                l52 l52Var = this.b;
                l52Var.j[mh0Var.h] = d;
            }
        }
        this.c = b00.a(this.c, i);
        this.d = b00.a(this.d, i);
    }
}
