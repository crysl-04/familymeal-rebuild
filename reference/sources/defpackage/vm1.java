package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vm1 extends rj1 {
    public final rj1 o;
    public boolean p;

    public vm1(long j, zk2 zk2Var, vp0 vp0Var, vp0 vp0Var2, rj1 rj1Var) {
        super(j, zk2Var, vp0Var, vp0Var2);
        this.o = rj1Var;
        rj1Var.k();
    }

    @Override // defpackage.rj1, defpackage.uk2
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.rj1
    public final h12 w() {
        vm1 vm1Var;
        rj1 rj1Var = this.o;
        if (rj1Var.m || rj1Var.c) {
            return new wk2(this);
        }
        nj1 nj1Var = this.h;
        long j = this.b;
        HashMap mapM = nj1Var != null ? bl2.m(rj1Var.g(), this, this.o.d()) : null;
        Object obj = bl2.c;
        synchronized (obj) {
            bl2.v(this);
            if (nj1Var == null || nj1Var.d == 0) {
                vm1Var = this;
                vm1Var.a();
            } else {
                vm1Var = this;
                h12 h12VarZ = vm1Var.z(this.o.g(), nj1Var, mapM, this.o.d());
                if (!h12VarZ.equals(xk2.b)) {
                    return h12VarZ;
                }
                nj1 nj1VarX = vm1Var.o.x();
                if (nj1VarX != null) {
                    nj1VarX.j(nj1Var);
                } else {
                    vm1Var.o.B(nj1Var);
                    vm1Var.h = null;
                }
            }
            if (uz0.j(vm1Var.o.g(), j) < 0) {
                vm1Var.o.v();
            }
            rj1 rj1Var2 = vm1Var.o;
            rj1Var2.r(rj1Var2.d().b(j).a(vm1Var.j));
            vm1Var.o.A(j);
            rj1 rj1Var3 = vm1Var.o;
            int i = vm1Var.d;
            vm1Var.d = -1;
            if (i >= 0) {
                int[] iArr = rj1Var3.k;
                iArr.getClass();
                int length = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                iArrCopyOf[length] = i;
                rj1Var3.k = iArrCopyOf;
            } else {
                rj1Var3.getClass();
            }
            rj1 rj1Var4 = vm1Var.o;
            zk2 zk2Var = vm1Var.j;
            rj1Var4.getClass();
            synchronized (obj) {
                rj1Var4.j = rj1Var4.j.d(zk2Var);
                rj1 rj1Var5 = vm1Var.o;
                int[] iArr2 = vm1Var.k;
                rj1Var5.getClass();
                if (iArr2.length != 0) {
                    int[] iArr3 = rj1Var5.k;
                    if (iArr3.length != 0) {
                        int length2 = iArr3.length;
                        int length3 = iArr2.length;
                        int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                        System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                        iArr2 = iArrCopyOf2;
                    }
                    rj1Var5.k = iArr2;
                }
            }
            vm1Var.m = true;
            if (!vm1Var.p) {
                vm1Var.p = true;
                vm1Var.o.l();
            }
            return xk2.b;
        }
    }
}
