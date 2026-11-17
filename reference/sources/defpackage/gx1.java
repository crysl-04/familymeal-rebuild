package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class gx1 extends fx1 {
    public final cx1 k;
    public Object l;
    public boolean m;
    public int n;

    public gx1(cx1 cx1Var, f03[] f03VarArr) {
        super(cx1Var.i, f03VarArr);
        this.k = cx1Var;
        this.n = cx1Var.k;
    }

    public final void c(int i, e03 e03Var, Object obj, int i2) {
        int i3 = i2 * 5;
        f03[] f03VarArr = this.h;
        if (i3 <= 30) {
            int iM = 1 << h12.m(i, i3);
            if (e03Var.h(iM)) {
                f03VarArr[i2].a(e03Var.d, Integer.bitCount(e03Var.a) << 1, e03Var.f(iM));
                this.i = i2;
                return;
            } else {
                int iT = e03Var.t(iM);
                e03 e03VarS = e03Var.s(iT);
                f03VarArr[i2].a(e03Var.d, Integer.bitCount(e03Var.a) << 1, iT);
                c(i, e03VarS, obj, i2 + 1);
                return;
            }
        }
        f03 f03Var = f03VarArr[i2];
        Object[] objArr = e03Var.d;
        f03Var.a(objArr, objArr.length, 0);
        while (true) {
            f03 f03Var2 = f03VarArr[i2];
            if (uz0.g(f03Var2.h[f03Var2.j], obj)) {
                this.i = i2;
                return;
            } else {
                f03VarArr[i2].j += 2;
            }
        }
    }

    @Override // defpackage.fx1, java.util.Iterator
    public final Object next() {
        if (this.k.k != this.n) {
            throw new ConcurrentModificationException();
        }
        if (!this.j) {
            wg.p();
            return null;
        }
        f03 f03Var = this.h[this.i];
        this.l = f03Var.h[f03Var.j];
        this.m = true;
        return super.next();
    }

    @Override // defpackage.fx1, java.util.Iterator
    public final void remove() {
        if (!this.m) {
            throw new IllegalStateException();
        }
        boolean z = this.j;
        cx1 cx1Var = this.k;
        if (!z) {
            t03.j(cx1Var).remove(this.l);
        } else {
            if (!z) {
                wg.p();
                return;
            }
            f03 f03Var = this.h[this.i];
            Object obj = f03Var.h[f03Var.j];
            t03.j(cx1Var).remove(this.l);
            c(obj != null ? obj.hashCode() : 0, cx1Var.i, obj, 0);
        }
        this.l = null;
        this.m = false;
        this.n = cx1Var.k;
    }
}
