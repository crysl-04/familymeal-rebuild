package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class mq2 extends n10 implements jq0 {
    public final byte k;

    /* JADX WARN: Multi-variable type inference failed */
    public mq2(int i, m10 m10Var) {
        super(m10Var);
        this.k = i;
    }

    @Override // defpackage.jq0
    public final int b() {
        return this.k;
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
