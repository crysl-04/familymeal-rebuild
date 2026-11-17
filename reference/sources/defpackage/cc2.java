package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class cc2 {
    public final dc2 a;
    public final xu1 b;
    public final jy1 c = new jy1((byte) 22);
    public final mj1 d;
    public boolean e;
    public Bundle f;
    public boolean g;
    public boolean h;

    public cc2(dc2 dc2Var, xu1 xu1Var) {
        this.a = dc2Var;
        this.b = xu1Var;
        long[] jArr = bd2.a;
        this.d = new mj1();
        this.h = true;
    }

    public final void a() {
        dc2 dc2Var = this.a;
        if (dc2Var.g().h != x81.i) {
            li1.g("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                li1.g("SavedStateRegistry was already attached.");
                return;
            }
            this.b.a();
            dc2Var.g().a(new uk1(this, (byte) 1));
            this.e = true;
        }
    }
}
