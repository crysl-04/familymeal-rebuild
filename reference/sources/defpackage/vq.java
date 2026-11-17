package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vq implements m20, n20 {
    public static final vz1 i = new vz1((byte) 27);
    public static final vq j = new vq(1);
    public static final vq k = new vq(2);
    public final /* synthetic */ byte h;

    public /* synthetic */ vq(byte b) {
        this.h = b;
    }

    @Override // defpackage.m20
    public final n20 getKey() {
        switch (this.h) {
            case 0:
                return i;
            case 1:
                return j;
            default:
                return this;
        }
    }

    @Override // defpackage.o20
    public final o20 i(o20 o20Var) {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
        }
        return cu.Q(this, o20Var);
    }

    @Override // defpackage.o20
    public final m20 m(n20 n20Var) {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
        }
        return cu.F(this, n20Var);
    }

    @Override // defpackage.o20
    public final Object p(zp0 zp0Var, Object obj) {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
        }
        return zp0Var.f(obj, this);
    }

    @Override // defpackage.o20
    public final o20 t(n20 n20Var) {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
        }
        return cu.M(this, n20Var);
    }
}
