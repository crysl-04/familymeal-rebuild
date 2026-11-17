package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g51 implements m61 {
    public final c61 a;

    public g51(c61 c61Var) {
        this.a = c61Var;
    }

    @Override // defpackage.m61
    public final int a() {
        return this.a.g().q;
    }

    @Override // defpackage.m61
    public final int b() {
        return ((u51) dv.F0(this.a.g().n)).a;
    }

    @Override // defpackage.m61
    public final boolean c() {
        return !this.a.g().n.isEmpty();
    }

    @Override // defpackage.m61
    public final int d() {
        int i;
        c61 c61Var = this.a;
        int i2 = 0;
        if (c61Var.g().n.isEmpty()) {
            return 0;
        }
        t51 t51VarG = c61Var.g();
        ks1 ks1Var = t51VarG.r;
        ks1 ks1Var2 = ks1.h;
        int i3 = (int) (ks1Var == ks1Var2 ? t51VarG.i() & 4294967295L : t51VarG.i() >> 32);
        t51 t51VarG2 = c61Var.g();
        ks1 ks1Var3 = t51VarG2.r;
        List list = t51VarG2.n;
        boolean z = ks1Var3 == ks1Var2;
        if (!list.isEmpty()) {
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < list.size()) {
                u51 u51Var = (u51) list.get(i4);
                int i7 = z ? u51Var.s : u51Var.t;
                if (i7 == -1) {
                    i4++;
                } else {
                    int iMax = 0;
                    while (i4 < list.size()) {
                        u51 u51Var2 = (u51) list.get(i4);
                        if ((z ? u51Var2.s : u51Var2.t) != i7) {
                            break;
                        }
                        iMax = Math.max(iMax, (int) (z ? ((u51) list.get(i4)).q & 4294967295L : ((u51) list.get(i4)).q >> 32));
                        i4++;
                    }
                    i5 += iMax;
                    i6++;
                }
            }
            i2 = (i5 / i6) + t51VarG2.t;
        }
        if (i2 == 0 || (i = i3 / i2) < 1) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.m61
    public final int e() {
        return this.a.d.b.g();
    }
}
