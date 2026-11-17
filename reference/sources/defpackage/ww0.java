package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ww0 extends o02 {
    public final boolean l;

    public ww0(String str, xw0 xw0Var) {
        super(str, xw0Var, 1);
        this.l = true;
    }

    @Override // defpackage.o02
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ww0) {
            rh2 rh2Var = (rh2) obj;
            if (this.a.equals(rh2Var.b())) {
                ww0 ww0Var = (ww0) obj;
                if (ww0Var.l && Arrays.equals((rh2[]) this.j.getValue(), (rh2[]) ww0Var.j.getValue())) {
                    int iD = rh2Var.d();
                    int i = this.c;
                    if (i == iD) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (uz0.g(j(i2).b(), rh2Var.j(i2).b()) && uz0.g(j(i2).c(), rh2Var.j(i2).c())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.rh2
    public final boolean f() {
        return this.l;
    }

    @Override // defpackage.o02
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
