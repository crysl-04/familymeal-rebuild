package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jt extends v01 implements ht {
    public final z01 l;

    public jt(z01 z01Var) {
        this.l = z01Var;
    }

    @Override // defpackage.ht
    public final boolean c(Throwable th) {
        return l().F(th);
    }

    @Override // defpackage.ht
    public final s01 getParent() {
        return l();
    }

    @Override // defpackage.v01
    public final boolean m() {
        return true;
    }

    @Override // defpackage.v01
    public final void n(Throwable th) {
        this.l.A(l());
    }
}
