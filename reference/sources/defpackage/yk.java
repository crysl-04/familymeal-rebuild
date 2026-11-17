package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yk extends xk {
    public final y22 l;
    public final ns0 m;
    public final ns0 n;

    public yk(y22 y22Var) {
        super(y22Var.j);
        this.l = y22Var;
        ns0 ns0VarA = ns0.a(y22Var.j);
        long[] jArr = r12.b;
        int iBinarySearch = Arrays.binarySearch(jArr, Math.max(ns0VarA.a, jArr[23]));
        this.m = new ns0(4L, ns0VarA.a, 1 << (iBinarySearch < 0 ? Math.max(-(iBinarySearch + 2), 0) : iBinarySearch));
        ns0 ns0VarA2 = ns0.a(y22Var.j);
        int iBinarySearch2 = Arrays.binarySearch(jArr, Math.max(ns0VarA2.a, jArr[46]));
        this.n = new ns0(4L, ns0VarA2.a, 1 << (iBinarySearch2 < 0 ? Math.max(-(iBinarySearch2 + 2), 0) : iBinarySearch2));
    }

    public final zk c(long... jArr) {
        long jJ1 = oo2.J1(jArr);
        return jJ1 > this.m.c ? sf2.U0(this, jJ1) : (zk) this.l.o(jJ1);
    }

    @Override // defpackage.li0
    public final mo2 o(long j) {
        long[] jArr = {j};
        long jJ1 = oo2.J1(jArr);
        ns0 ns0Var = this.n;
        if (jJ1 > ns0Var.c) {
            return sf2.U0(this, jArr);
        }
        long j2 = ns0Var.a;
        y22 y22Var = this.l;
        return (jJ1 <= j2 || y22Var == null) ? (zk) y22Var.o(jJ1) : new cm2(y22Var, ns0Var, Math.toIntExact(jJ1));
    }

    @Override // defpackage.li0
    public final mo2 p(int i) {
        return c(i);
    }
}
