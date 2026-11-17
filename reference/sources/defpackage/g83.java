package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class g83 extends f83 {
    public ox0 s;
    public ox0 t;
    public ox0 u;

    public g83(q83 q83Var, WindowInsets windowInsets) {
        super(q83Var, windowInsets);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.m83
    public ox0 j() {
        ox0 ox0Var = this.t;
        if (ox0Var != null) {
            return ox0Var;
        }
        ox0 ox0VarC = ox0.c(this.c.getMandatorySystemGestureInsets());
        this.t = ox0VarC;
        return ox0VarC;
    }

    @Override // defpackage.m83
    public ox0 l() {
        ox0 ox0Var = this.s;
        if (ox0Var != null) {
            return ox0Var;
        }
        ox0 ox0VarC = ox0.c(this.c.getSystemGestureInsets());
        this.s = ox0VarC;
        return ox0VarC;
    }

    @Override // defpackage.m83
    public ox0 n() {
        ox0 ox0Var = this.u;
        if (ox0Var != null) {
            return ox0Var;
        }
        ox0 ox0VarC = ox0.c(this.c.getTappableElementInsets());
        this.u = ox0VarC;
        return ox0VarC;
    }

    @Override // defpackage.m83
    public q83 q(int i, int i2, int i3, int i4) {
        return q83.c(this.c.inset(i, i2, i3, i4), null);
    }
}
