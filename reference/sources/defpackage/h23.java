package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h23 {
    public k42 a;
    public k42 b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    public final void a(vv2 vv2Var) {
        k42 k42Var;
        vv2 vv2Var2;
        this.e = false;
        k42 k42Var2 = this.a;
        if (uz0.g(vv2Var, k42Var2 != null ? (vv2) k42Var2.j : null)) {
            return;
        }
        String str = vv2Var.a.i;
        k42 k42Var3 = this.a;
        boolean zG = uz0.g(str, (k42Var3 == null || (vv2Var2 = (vv2) k42Var3.j) == null) ? null : vv2Var2.a.i);
        k42 k42Var4 = this.a;
        if (zG) {
            if (k42Var4 != null) {
                k42Var4.j = vv2Var;
                return;
            }
            return;
        }
        this.a = new k42(k42Var4, vv2Var, (byte) 8);
        this.b = null;
        int length = vv2Var.a.i.length() + this.c;
        this.c = length;
        if (length > 100000) {
            k42 k42Var5 = this.a;
            if ((k42Var5 != null ? (k42) k42Var5.i : null) != null) {
                while (true) {
                    if (k42Var5 == null) {
                        k42Var = null;
                    } else {
                        k42 k42Var6 = (k42) k42Var5.i;
                        if (k42Var6 != null) {
                            k42Var = (k42) k42Var6.i;
                        } else {
                            k42Var = null;
                        }
                    }
                    if (k42Var == null) {
                        break;
                    } else {
                        k42Var5 = (k42) k42Var5.i;
                    }
                }
                if (k42Var5 != null) {
                    k42Var5.i = null;
                }
            }
        }
    }
}
