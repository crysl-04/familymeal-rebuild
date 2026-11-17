package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c92 extends b92 implements jq0 {
    public final byte i;

    /* JADX WARN: Multi-variable type inference failed */
    public c92(int i, m10 m10Var) {
        super(m10Var);
        this.i = i;
    }

    @Override // defpackage.jq0
    public final int b() {
        return this.i;
    }

    @Override // defpackage.rk
    public final String toString() {
        if (this.h != null) {
            return super.toString();
        }
        z72.a.getClass();
        return a82.a(this);
    }
}
