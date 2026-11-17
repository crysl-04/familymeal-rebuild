package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a6 implements wq {
    public Canvas a = b6.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.wq
    public final void a(t8 t8Var, e9 e9Var) {
        this.a.drawBitmap(ie1.d(t8Var), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) e9Var.b);
    }

    @Override // defpackage.wq
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.wq
    public final void c(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.wq
    public final void d(float f, long j, e9 e9Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) e9Var.b);
    }

    @Override // defpackage.wq
    public final void e(t8 t8Var, long j, long j2, long j3, e9 e9Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapD = ie1.d(t8Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapD, rect, rect2, (Paint) e9Var.b);
    }

    @Override // defpackage.wq
    public final void f(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.wq
    public final void g(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.wq
    public final void h(l9 l9Var, e9 e9Var) {
        Canvas canvas = this.a;
        if (!(l9Var instanceof l9)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(l9Var.a, aa3.u(e9Var));
    }

    @Override // defpackage.wq
    public final void i() {
        this.a.restore();
    }

    @Override // defpackage.wq
    public final void j(float f, float f2, float f3, float f4, float f5, float f6, e9 e9Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) e9Var.b);
    }

    @Override // defpackage.wq
    public final void l() {
        this.a.save();
    }

    @Override // defpackage.wq
    public final void m(long j, long j2, e9 e9Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) e9Var.b);
    }

    @Override // defpackage.wq
    public final void n() {
        this.a.disableZ();
    }

    @Override // defpackage.wq
    public final void o(r72 r72Var, e9 e9Var) {
        this.a.saveLayer(r72Var.a, r72Var.b, r72Var.c, r72Var.d, (Paint) e9Var.b, 31);
    }

    @Override // defpackage.wq
    public final void p(float f, float f2, float f3, float f4, e9 e9Var) {
        this.a.drawRect(f, f2, f3, f4, aa3.u(e9Var));
    }

    @Override // defpackage.wq
    public final void q(float[] fArr) {
        if (vs.J(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        ia2.u(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.wq
    public final void r() {
        this.a.enableZ();
    }

    @Override // defpackage.wq
    public final void s(l9 l9Var) {
        Canvas canvas = this.a;
        if (l9Var == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(l9Var.a, Region.Op.INTERSECT);
    }

    @Override // defpackage.wq
    public final void t(float f, float f2, float f3, float f4, float f5, float f6, e9 e9Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) e9Var.b);
    }
}
