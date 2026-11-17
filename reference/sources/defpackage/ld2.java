package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class ld2 extends v implements z20 {
    public final m10 k;

    public ld2(m10 m10Var, o20 o20Var) {
        super(o20Var, true);
        this.k = m10Var;
    }

    @Override // defpackage.z01
    public final boolean S() {
        return true;
    }

    @Override // defpackage.z20
    public final z20 d() {
        m10 m10Var = this.k;
        if (m10Var instanceof z20) {
            return (z20) m10Var;
        }
        return null;
    }

    @Override // defpackage.z01
    public void y(Object obj) {
        tz0.F(ls.F(this.k), ys.Y(obj));
    }

    @Override // defpackage.z01
    public void z(Object obj) {
        this.k.g(ys.Y(obj));
    }
}
