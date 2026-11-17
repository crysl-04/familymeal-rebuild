package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sf2 extends zk {
    public final int i;
    public final long j;
    public final xk k;
    public final zk[] l;
    public final long m;

    public sf2(zk[] zkVarArr, xk xkVar) {
        super(xkVar);
        long jCount = zkVarArr[0].count();
        this.m = jCount;
        this.i = Arrays.binarySearch(r12.b, jCount);
        this.j = jCount - 1;
        this.l = zkVarArr;
        this.k = xkVar;
    }

    public static sf2 U0(xk xkVar, long... jArr) {
        long jJ1 = oo2.J1(jArr);
        long[] jArr2 = r12.b;
        int iBinarySearch = Arrays.binarySearch(jArr2, jJ1);
        if (iBinarySearch < 0) {
            iBinarySearch = Math.max(-(iBinarySearch + 2), 0);
        }
        int iBinarySearch2 = Arrays.binarySearch(jArr2, jJ1 / 2147483639);
        if (iBinarySearch2 < 0) {
            iBinarySearch2 = Math.min(-(iBinarySearch2 + 1), 62);
        }
        if (iBinarySearch2 > iBinarySearch) {
            wg.f();
            return null;
        }
        long jMax = 1 << Math.max(iBinarySearch2, iBinarySearch - aq1.a.l);
        int intExact = Math.toIntExact(jJ1 / jMax);
        long j = jJ1 % jMax;
        zk[] zkVarArr = new zk[j == 0 ? intExact : intExact + 1];
        for (int i = 0; i < intExact; i++) {
            zkVarArr[i] = (zk) xkVar.o(jMax);
        }
        if (j != 0) {
            zkVarArr[intExact] = (zk) xkVar.o(j);
        }
        return new sf2(zkVarArr, xkVar);
    }

    @Override // defpackage.a1
    public final double A(int i) {
        return this.l[i >> this.i].z(((long) i) & this.j);
    }

    @Override // defpackage.zk
    public final void A0(long j, a1 a1Var, f32 f32Var) {
        long j2 = 0;
        if (!a0()) {
            while (j2 < j) {
                B(j2, f32Var.a(a1Var.G(j2), G(j2)));
                j2++;
            }
        } else {
            while (j2 < j) {
                double dZ = a1Var.z(j2);
                double dZ2 = z(j2);
                f32Var.getClass();
                y(j2, dZ - dZ2);
                j2++;
            }
        }
    }

    @Override // defpackage.zj1
    public final void B(long j, Comparable comparable) {
        this.l[(int) (j >> this.i)].B(j & this.j, comparable);
    }

    @Override // defpackage.zk
    public final void D0(long j, tm tmVar, a1 a1Var) {
        long j2 = 0;
        if (a0()) {
            while (j2 < j) {
                y(j2, tmVar.c(z(j2), a1Var.z(j2)));
                j2++;
            }
        } else {
            while (j2 < j) {
                B(j2, tmVar.a(G(j2), a1Var.G(j2)));
                j2++;
            }
        }
    }

    @Override // defpackage.yj1
    public final void F(long j, double d) {
        this.l[(int) (j >> this.i)].F(j & this.j, d);
    }

    @Override // defpackage.a1
    public final Comparable G(long j) {
        return this.l[(int) (j >> this.i)].G(j & this.j);
    }

    @Override // defpackage.zk
    public final void M0(long j, long j2, long j3, im imVar) {
        long j4 = this.m;
        if (j3 > j4) {
            if (a0()) {
                long j5 = j;
                while (j5 < j2) {
                    imVar.b(z(j5));
                    j5 += j3;
                }
                return;
            }
            long j6 = j;
            while (j6 < j2) {
                imVar.d(G(j6));
                j6 += j3;
            }
            return;
        }
        int i = (int) ((j2 - 1) / j4);
        long j7 = j % j4;
        int i2 = (int) (j / j4);
        while (true) {
            zk[] zkVarArr = this.l;
            if (i2 >= i) {
                zkVarArr[i].M0(j7, j2 - (((long) i) * j4), j3, imVar);
                return;
            }
            zkVarArr[i2].M0(j7, this.m, j3, imVar);
            long j8 = (j4 - j7) % j3;
            j7 = j8 == 0 ? 0L : j3 - j8;
            i2++;
        }
    }

    @Override // defpackage.mo2
    public final long count() {
        zk[] zkVarArr = this.l;
        return zkVarArr[zkVarArr.length - 1].count() + (zkVarArr[0].count() * ((long) (zkVarArr.length - 1)));
    }

    @Override // defpackage.zk
    public final void d0(long j, long j2, long j3, c23 c23Var) {
        long j4 = this.m;
        if (j3 > j4) {
            if (a0()) {
                long j5 = j;
                while (j5 < j2) {
                    y(j5, c23Var.a(z(j5)));
                    j5 += j3;
                }
                return;
            }
            long j6 = j;
            while (j6 < j2) {
                B(j6, c23Var.b(G(j6)));
                j6 += j3;
            }
            return;
        }
        int i = (int) ((j2 - 1) / j4);
        long j7 = j % j4;
        int i2 = (int) (j / j4);
        while (true) {
            zk[] zkVarArr = this.l;
            if (i2 >= i) {
                zkVarArr[i].d0(j7, j2 - (((long) i) * j4), j3, c23Var);
                return;
            }
            zkVarArr[i2].d0(j7, this.m, j3, c23Var);
            long j8 = (j4 - j7) % j3;
            j7 = j8 == 0 ? 0L : j3 - j8;
            i2++;
        }
    }

    @Override // defpackage.yj1
    public final void f(int i, double d) {
        this.l[i >> this.i].F(((long) i) & this.j, d);
    }

    @Override // defpackage.yj1
    public final void g(long j, Comparable comparable) {
        this.l[(int) (j >> this.i)].g(j & this.j, comparable);
    }

    @Override // defpackage.zk
    public final void j(long j, long j2, long j3, long j4) {
        long j5 = 0;
        long j6 = j2;
        if (a0()) {
            while (j5 < j4) {
                double dZ = z(j);
                y(j, z(j6));
                y(j6, dZ);
                j += j3;
                j6 += j3;
                j5++;
            }
            return;
        }
        while (j5 < j4) {
            Comparable comparableG = G(j);
            B(j, G(j6));
            B(j6, comparableG);
            j += j3;
            j6 += j3;
            j5++;
        }
    }

    @Override // defpackage.yj1
    public final void n(long j, c23 c23Var) {
        zk zkVar = this.l[(int) (j >> this.i)];
        long j2 = j & this.j;
        zkVar.B(j2, c23Var.b(zkVar.G(j2)));
    }

    @Override // defpackage.zj1
    public final void o(int i, double d) {
        this.l[i >> this.i].y(((long) i) & this.j, d);
    }

    @Override // defpackage.zj1
    public final void reset() {
        for (zk zkVar : this.l) {
            zkVar.reset();
        }
    }

    @Override // defpackage.mo2
    public final int size() {
        return Math.toIntExact(count());
    }

    @Override // defpackage.z0
    public final void t(long j, im imVar) {
        if (a0()) {
            imVar.b(z(j));
        } else {
            imVar.d(G(j));
        }
    }

    @Override // defpackage.zj1
    public final void w1(float f, long j) {
        this.l[(int) (j >> this.i)].w1(f, j & this.j);
    }

    @Override // defpackage.zj1
    public final void y(long j, double d) {
        this.l[(int) (j >> this.i)].y(j & this.j, d);
    }

    @Override // defpackage.a1
    public final double z(long j) {
        return this.l[(int) (j >> this.i)].z(j & this.j);
    }
}
