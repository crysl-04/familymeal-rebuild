package defpackage;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c83 {
    public final q83 a;
    public ox0[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public c83(q83 q83Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = q83Var;
        c(q83Var);
    }

    public final void a() {
        ox0[] ox0VarArr = this.b;
        if (ox0VarArr != null) {
            ox0 ox0VarH = ox0VarArr[0];
            ox0 ox0VarH2 = ox0VarArr[1];
            q83 q83Var = this.a;
            if (ox0VarH2 == null) {
                ox0VarH2 = q83Var.a.h(2);
            }
            if (ox0VarH == null) {
                ox0VarH = q83Var.a.h(1);
            }
            g(ox0.a(ox0VarH, ox0VarH2));
            ox0 ox0Var = this.b[cy1.D(16)];
            if (ox0Var != null) {
                f(ox0Var);
            }
            ox0 ox0Var2 = this.b[cy1.D(32)];
            if (ox0Var2 != null) {
                e(ox0Var2);
            }
            ox0 ox0Var3 = this.b[cy1.D(64)];
            if (ox0Var3 != null) {
                h(ox0Var3);
            }
        }
    }

    public abstract q83 b();

    public void c(q83 q83Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listE = q83Var.a.e(i);
            int iD = cy1.D(i);
            this.c[iD] = (Rect[]) listE.toArray(new Rect[listE.size()]);
            if (i != 8) {
                List<Rect> listF = q83Var.a.f(i);
                this.d[iD] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            }
        }
    }

    public void d(int i, ox0 ox0Var) {
        if (this.b == null) {
            this.b = new ox0[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[cy1.D(i2)] = ox0Var;
            }
        }
    }

    public abstract void e(ox0 ox0Var);

    public abstract void f(ox0 ox0Var);

    public abstract void g(ox0 ox0Var);

    public abstract void h(ox0 ox0Var);

    public c83() {
        this(new q83());
    }
}
