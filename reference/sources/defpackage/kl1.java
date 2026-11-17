package defpackage;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kl1 {
    public final Context a;
    public final xk1 b;
    public final lf0 c;
    public final Activity d;
    public boolean e;
    public final qo0 f;
    public final boolean g;

    public kl1(Context context) {
        context.getClass();
        this.a = context;
        this.b = new xk1(this, new mg(this, (byte) 9));
        this.c = new lf0(context, (byte) 1);
        for (Object obj : ph2.H(context, new de1((byte) 4))) {
            if (((Context) obj) instanceof Activity) {
                this.d = (Activity) obj;
                this.f = new qo0(this, (byte) 1);
                this.g = true;
                tm1 tm1Var = this.b.s;
                tm1Var.a(new jl1(tm1Var));
                this.b.s.a(new k3(this.a));
            }
        }
        obj = null;
        this.d = (Activity) obj;
        this.f = new qo0(this, (byte) 1);
        this.g = true;
        tm1 tm1Var2 = this.b.s;
        tm1Var2.a(new jl1(tm1Var2));
        this.b.s.a(new k3(this.a));
    }

    public static void a(kl1 kl1Var, String str) {
        kl1Var.getClass();
        kl1Var.b.l(str, null);
    }

    public final void b() {
        xk1 xk1Var = this.b;
        if (xk1Var.f.isEmpty()) {
            return;
        }
        dl1 dl1VarF = xk1Var.f();
        dl1VarF.getClass();
        if (xk1Var.m(dl1VarF.i.b, true, false)) {
            xk1Var.b();
        }
    }
}
