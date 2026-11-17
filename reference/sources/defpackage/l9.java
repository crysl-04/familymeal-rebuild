package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class l9 {
    public final Path a;
    public RectF b;
    public float[] c;

    public l9(Path path) {
        this.a = path;
    }

    public static void a(l9 l9Var, l9 l9Var2) {
        Path path = l9Var.a;
        if (l9Var2 == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(l9Var2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public static void b(l9 l9Var, na2 na2Var) {
        RectF rectF = l9Var.b;
        if (rectF == null) {
            rectF = new RectF();
            l9Var.b = rectF;
        }
        float f = na2Var.a;
        long j = na2Var.h;
        long j2 = na2Var.g;
        long j3 = na2Var.f;
        long j4 = na2Var.e;
        rectF.set(f, na2Var.b, na2Var.c, na2Var.d);
        float[] fArr = l9Var.c;
        if (fArr == null) {
            fArr = new float[8];
            l9Var.c = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = l9Var.a;
        RectF rectF2 = l9Var.b;
        rectF2.getClass();
        float[] fArr2 = l9Var.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final r72 c() {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        this.a.computeBounds(rectF, true);
        return new r72(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void d(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final boolean e(l9 l9Var, l9 l9Var2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(l9Var instanceof l9)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = l9Var.a;
        if (l9Var2 != null) {
            return this.a.op(path, l9Var2.a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void f() {
        this.a.reset();
    }
}
