package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jr2 extends qg1 implements c41 {
    public tb A;
    public cc0 B;
    public cc0 C;
    public lu1 v;
    public int w;
    public boolean x;
    public zm2 y;
    public tb z;

    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        float f;
        s03 s03Var = aa3.S;
        boolean zIsEmpty = ((List) this.v.getValue()).isEmpty();
        bg0 bg0Var = bg0.h;
        if (zIsEmpty) {
            return bf1Var.g0(0, 0, bg0Var, new jc2((byte) 29));
        }
        boolean z = this.x;
        lu1 lu1Var = this.v;
        float f2 = z ? ((qr2) ((List) lu1Var.getValue()).get(this.w)).c : ((qr2) ((List) lu1Var.getValue()).get(this.w)).b;
        cc0 cc0Var = this.C;
        m10 m10Var = null;
        if (cc0Var != null) {
            tb tbVar = this.A;
            if (tbVar == null) {
                tbVar = new tb(cc0Var, s03Var, null, 12);
                this.A = tbVar;
            }
            if (cc0.b(f2, ((cc0) tbVar.e.getValue()).h)) {
                f = f2;
            } else {
                f = f2;
                ie1.p(x0(), null, new ir2(tbVar, f2, this, m10Var, (byte) 0), 3);
            }
        } else {
            f = f2;
            this.C = new cc0(f);
        }
        float f3 = ((qr2) ((List) this.v.getValue()).get(this.w)).a;
        cc0 cc0Var2 = this.B;
        if (cc0Var2 != null) {
            tb tbVar2 = this.z;
            if (tbVar2 == null) {
                tbVar2 = new tb(cc0Var2, s03Var, null, 12);
                this.z = tbVar2;
            }
            if (!cc0.b(f3, ((cc0) tbVar2.e.getValue()).h)) {
                ie1.p(x0(), null, new ir2(tbVar2, f3, this, m10Var, (byte) 1), 3);
            }
        } else {
            this.B = new cc0(f3);
        }
        u31 layoutDirection = bf1Var.getLayoutDirection();
        tb tbVar3 = this.z;
        if (layoutDirection != u31.h) {
            if (tbVar3 != null) {
                f3 = ((cc0) tbVar3.d()).h;
            }
            f3 = -f3;
        } else if (tbVar3 != null) {
            f3 = ((cc0) tbVar3.d()).h;
        }
        tb tbVar4 = this.A;
        if (tbVar4 != null) {
            f = ((cc0) tbVar4.d()).h;
        }
        ny1 ny1VarE = ue1Var.e(k00.b(j, bf1Var.R(f), bf1Var.R(f), 0, 0, 12));
        return bf1Var.g0(ny1VarE.h, ny1VarE.i, bg0Var, new v7(ny1VarE, (Object) bf1Var, f3, (byte) 2));
    }
}
