package defpackage;

import android.graphics.Typeface;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z2 implements Runnable {
    public final /* synthetic */ byte h;
    public Object i;
    public final Object j;

    public z2(bn bnVar, int i, CharSequence charSequence) {
        this.h = (byte) 1;
        this.j = bnVar;
        this.i = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gf1 gf1Var;
        byte b = this.h;
        int i = 0;
        byte b2 = 1;
        Object obj = this.j;
        switch (b) {
            case 0:
                x2 x2Var = (x2) this.i;
                b3 b3Var = (b3) obj;
                if1 if1Var = b3Var.j;
                if (if1Var != null && (gf1Var = if1Var.e) != null) {
                    gf1Var.g(if1Var);
                }
                View view = (View) b3Var.o;
                if (view != null && view.getWindowToken() != null) {
                    if (x2Var.b()) {
                        b3Var.z = x2Var;
                    } else if (x2Var.e != null) {
                        x2Var.d(0, 0, false, false);
                        b3Var.z = x2Var;
                    }
                }
                b3Var.B = null;
                break;
            case 1:
                jn jnVar = ((bn) obj).g0;
                t03 ggVar = jnVar.c;
                if (ggVar == null) {
                    ggVar = new gg(b2);
                    jnVar.c = ggVar;
                }
                ggVar.A((CharSequence) this.i);
                break;
            case 2:
                jn jnVar2 = ((bn) obj).g0;
                t03 ggVar2 = jnVar2.c;
                if (ggVar2 == null) {
                    ggVar2 = new gg(b2);
                    jnVar2.c = ggVar2;
                }
                ggVar2.B((en) this.i);
                break;
            case 3:
                Typeface typeface = (Typeface) obj;
                rf rfVar = (rf) ((xl1) this.i).i;
                if (rfVar != null) {
                    rfVar.k(typeface);
                }
                break;
            case 4:
                ((rq) this.i).E((ss0) obj);
                break;
            case 5:
                q91 q91Var = (q91) obj;
                q20 q20Var = q91Var.k;
                while (true) {
                    try {
                        ((Runnable) this.i).run();
                    } catch (Throwable th) {
                        ls.E(xf0.h, th);
                    }
                    Runnable runnableJ = q91Var.j();
                    if (runnableJ == null) {
                        break;
                    } else {
                        this.i = runnableJ;
                        i++;
                        if (i >= 16 && q20Var.f(q91Var)) {
                            q20Var.e(q91Var, this);
                            break;
                        }
                    }
                    break;
                }
                break;
            case 6:
                ((en0) this.i).accept(obj);
                break;
            default:
                ((rq) obj).E((vh0) this.i);
                break;
        }
    }

    public /* synthetic */ z2(Object obj, Object obj2, byte b, boolean z) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
    }

    public /* synthetic */ z2(Object obj, Object obj2, byte b) {
        this.h = b;
        this.j = obj;
        this.i = obj2;
    }
}
