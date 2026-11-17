package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ap extends zo {
    public xl1 a;
    public long b = 9205357640488583168L;
    public final /* synthetic */ Shader c;

    public ap(Shader shader) {
        this.c = shader;
    }

    @Override // defpackage.zo
    public final void a(float f, long j, e9 e9Var) {
        Paint paint = (Paint) e9Var.b;
        xl1 xl1Var = this.a;
        if (xl1Var == null || !wj2.a(this.b, j)) {
            if (wj2.c(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                xl1Var = null;
            } else {
                xl1Var = this.a;
                if (xl1Var == null) {
                    xl1Var = new xl1((byte) 17, false);
                    this.a = xl1Var;
                }
                xl1Var.i = this.c;
                this.a = xl1Var;
                this.b = j;
            }
        }
        long jA = t93.a.a(paint);
        long j2 = kv.b;
        if (!r13.a(jA, j2)) {
            e9Var.e(j2);
        }
        if (!uz0.g((Shader) e9Var.c, xl1Var != null ? (Shader) xl1Var.i : null)) {
            e9Var.h(xl1Var != null ? (Shader) xl1Var.i : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        e9Var.c(f);
    }
}
