package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xv1 implements h82 {
    public final Set h;
    public final uj1 i = new uj1(new hr0[16]);

    public xv1(Set set) {
        this.h = set;
    }

    @Override // defpackage.h82
    public final void c() {
        uj1 uj1Var = this.i;
        Object[] objArr = uj1Var.h;
        int i = uj1Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            h82 h82Var = ((hr0) objArr[i2]).a;
            this.h.remove(h82Var);
            h82Var.c();
        }
    }

    @Override // defpackage.h82
    public final void d() {
    }

    @Override // defpackage.h82
    public final void e() {
    }
}
