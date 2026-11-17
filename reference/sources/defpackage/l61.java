package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l61 extends qg1 implements c41 {
    public static final j61 y = new j61();
    public m61 v;
    public lo w;
    public ks1 x;

    public final boolean J0(h61 h61Var, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.x != ks1.h) {
                }
            } else if (i != 1 && i != 2) {
                li1.g("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (K0(i)) {
            }
        } else if (this.x != ks1.i) {
            if (K0(i) ? h61Var.a > 0 : h61Var.b < this.v.a() - 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean K0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = cu.Y(this).F.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            wg.n();
            return false;
        }
        if (i != 4) {
            li1.g("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = cu.Y(this).F.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        wg.n();
        return false;
    }

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        ny1 ny1VarE = ue1Var.e(j);
        return bf1Var.g0(ny1VarE.h, ny1VarE.i, bg0.h, new m6(ny1VarE, (byte) 5));
    }
}
