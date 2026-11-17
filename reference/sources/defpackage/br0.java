package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class br0 extends jz {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final nj1 e;
    public final lu1 f;
    public final /* synthetic */ dr0 g;

    public br0(dr0 dr0Var, long j, boolean z, boolean z2, g2 g2Var) {
        this.g = dr0Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        nj1 nj1Var = cd2.a;
        this.e = new nj1();
        this.f = new lu1(dx1.k, vz1.k);
    }

    @Override // defpackage.jz
    public final void a(oz ozVar, zp0 zp0Var) {
        this.g.b.a(ozVar, zp0Var);
    }

    @Override // defpackage.jz
    public final nj1 b(oz ozVar, zi2 zi2Var, zp0 zp0Var) {
        return this.g.b.b(ozVar, zi2Var, zp0Var);
    }

    @Override // defpackage.jz
    public final void c() {
        this.g.A--;
    }

    @Override // defpackage.jz
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // defpackage.jz
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.jz
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.jz
    public final long g() {
        return this.a;
    }

    @Override // defpackage.jz
    public final iz h() {
        return this.g.h;
    }

    @Override // defpackage.jz
    public final dx1 i() {
        return (dx1) this.f.getValue();
    }

    @Override // defpackage.jz
    public final o20 j() {
        return this.g.b.j();
    }

    @Override // defpackage.jz
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // defpackage.jz
    public final void l(oz ozVar) {
        dr0 dr0Var = this.g;
        jz jzVar = dr0Var.b;
        jzVar.l(dr0Var.h);
        jzVar.l(ozVar);
    }

    @Override // defpackage.jz
    public final oh1 m(ph1 ph1Var) {
        return this.g.b.m(ph1Var);
    }

    @Override // defpackage.jz
    public final nj1 n(oz ozVar, zi2 zi2Var, nj1 nj1Var) {
        return this.g.b.n(ozVar, zi2Var, nj1Var);
    }

    @Override // defpackage.jz
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.jz
    public final void p(dr0 dr0Var) {
        this.e.a(dr0Var);
    }

    @Override // defpackage.jz
    public final void q(e72 e72Var) {
        this.g.b.q(e72Var);
    }

    @Override // defpackage.jz
    public final void r(oz ozVar) {
        this.g.b.r(ozVar);
    }

    @Override // defpackage.jz
    public final sq s(o9 o9Var) {
        return this.g.b.s(o9Var);
    }

    @Override // defpackage.jz
    public final void t() {
        this.g.A++;
    }

    @Override // defpackage.jz
    public final void u(dr0 dr0Var) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                dr0Var.getClass();
                set.remove(dr0Var.v());
            }
        }
        if (dr0Var != null) {
            this.e.l(dr0Var);
        }
    }

    @Override // defpackage.jz
    public final void v(oz ozVar) {
        this.g.b.v(ozVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[LOOP:0: B:9:0x0017->B:22:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[EDGE_INSN: B:26:0x0066->B:23:0x0066 BREAK  A[LOOP:0: B:9:0x0017->B:22:0x0063], SYNTHETIC] */
    public final void w() {
        nj1 nj1Var = this.e;
        if (nj1Var.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = nj1Var.b;
                long[] jArr = nj1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    dr0 dr0Var = (dr0) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(dr0Var.v());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            nj1Var.b();
        }
    }
}
