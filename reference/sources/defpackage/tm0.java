package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tm0 implements sm0 {
    public final p8 a;
    public final k42 b;

    public tm0(vz1 vz1Var, p8 p8Var) {
        k42 k42Var = um0.a;
        wm0 wm0Var = xm0.a;
        ss0 ss0Var = xa0.a;
        wm0Var.getClass();
        vs.b(cu.Q(wm0Var, ss0Var).i(xf0.h).i(new up2(null)));
        new jy1((byte) 1);
        this.a = p8Var;
        this.b = k42Var;
        new p((Object) this, (byte) 22);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f A[Catch: Exception -> 0x0087, TRY_ENTER, TryCatch #1 {Exception -> 0x0087, blocks: (B:23:0x003e, B:25:0x0046, B:27:0x004a, B:29:0x004e, B:31:0x0059, B:45:0x007f, B:46:0x0086, B:30:0x0055), top: B:54:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final a13 a(z03 z03Var) {
        Typeface typefaceV;
        Object objRemove;
        k42 k42Var = this.b;
        synchronized (((jy1) k42Var.i)) {
            a13 a13Var = (a13) ((hd1) k42Var.j).b(z03Var);
            a13 a13Var2 = null;
            if (a13Var != null) {
                if (a13Var.i) {
                    return a13Var;
                }
                hd1 hd1Var = (hd1) k42Var.j;
                synchronized (hd1Var.c) {
                    objRemove = hd1Var.b.a.remove(z03Var);
                    if (objRemove != null) {
                        hd1Var.d--;
                    }
                }
                if (objRemove != null) {
                    hd1Var.a(z03Var, objRemove, null);
                }
            }
            try {
                ar2 ar2Var = z03Var.a;
                int i = z03Var.c;
                qn0 qn0Var = z03Var.b;
                if (ar2Var != null && !(ar2Var instanceof f70)) {
                    if (ar2Var instanceof mr0) {
                        typefaceV = jy1.v("sans-serif", qn0Var, i);
                    }
                    if (a13Var2 != null) {
                        throw new IllegalStateException("Could not load font");
                    }
                    synchronized (((jy1) k42Var.i)) {
                        if (((hd1) k42Var.j).b(z03Var) == null && a13Var2.i) {
                            ((hd1) k42Var.j).c(z03Var, a13Var2);
                        }
                    }
                    return a13Var2;
                }
                typefaceV = jy1.v(null, qn0Var, i);
                a13Var2 = new a13(typefaceV);
                if (a13Var2 != null) {
                    throw new IllegalStateException("Could not load font");
                }
                synchronized (((jy1) k42Var.i)) {
                    if (((hd1) k42Var.j).b(z03Var) == null) {
                        ((hd1) k42Var.j).c(z03Var, a13Var2);
                    }
                    return a13Var2;
                }
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final a13 b(ar2 ar2Var, qn0 qn0Var, int i, int i2) {
        int i3 = this.a.h;
        if (i3 != 0 && i3 != Integer.MAX_VALUE) {
            qn0Var = new qn0(cy1.n(qn0Var.h + i3, 1, 1000));
        }
        return a(new z03(ar2Var, qn0Var, i, i2));
    }
}
