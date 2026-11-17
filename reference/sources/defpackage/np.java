package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class np implements qk0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ ll2 i;

    public /* synthetic */ np(ll2 ll2Var, byte b) {
        this.h = b;
        this.i = ll2Var;
    }

    @Override // defpackage.qk0
    public final Object m(Object obj, m10 m10Var) {
        byte b = this.h;
        j23 j23Var = j23.a;
        ll2 ll2Var = this.i;
        switch (b) {
            case 0:
                gz0 gz0Var = (gz0) obj;
                if (gz0Var instanceof ut0) {
                    ll2Var.add(gz0Var);
                } else if (gz0Var instanceof vt0) {
                    ll2Var.remove(((vt0) gz0Var).a);
                } else if (gz0Var instanceof wl0) {
                    ll2Var.add(gz0Var);
                } else if (gz0Var instanceof xl0) {
                    ll2Var.remove(((xl0) gz0Var).a);
                } else if (gz0Var instanceof m22) {
                    ll2Var.add(gz0Var);
                } else if (gz0Var instanceof n22) {
                    ll2Var.remove(((n22) gz0Var).a);
                } else if (gz0Var instanceof l22) {
                    ll2Var.remove(((l22) gz0Var).a);
                }
                break;
            default:
                gz0 gz0Var2 = (gz0) obj;
                if (gz0Var2 instanceof ut0) {
                    ll2Var.add(gz0Var2);
                } else if (gz0Var2 instanceof vt0) {
                    ll2Var.remove(((vt0) gz0Var2).a);
                } else if (gz0Var2 instanceof wl0) {
                    ll2Var.add(gz0Var2);
                } else if (gz0Var2 instanceof xl0) {
                    ll2Var.remove(((xl0) gz0Var2).a);
                } else if (gz0Var2 instanceof m22) {
                    ll2Var.add(gz0Var2);
                } else if (gz0Var2 instanceof n22) {
                    ll2Var.remove(((n22) gz0Var2).a);
                } else if (gz0Var2 instanceof l22) {
                    ll2Var.remove(((l22) gz0Var2).a);
                } else if (gz0Var2 instanceof jd0) {
                    ll2Var.add(gz0Var2);
                } else if (gz0Var2 instanceof kd0) {
                    ll2Var.remove(((kd0) gz0Var2).a);
                } else if (gz0Var2 instanceof id0) {
                    ll2Var.remove(((id0) gz0Var2).a);
                }
                break;
        }
        return j23Var;
    }
}
