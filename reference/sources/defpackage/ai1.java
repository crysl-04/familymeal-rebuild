package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ai1 {
    public final mj1 a;

    public /* synthetic */ ai1(mj1 mj1Var) {
        this.a = mj1Var;
    }

    public static final Object a(mj1 mj1Var) {
        Object objG = mj1Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof fj1)) {
            mj1Var.l(null);
            return objG;
        }
        fj1 fj1Var = (fj1) objG;
        if (fj1Var.i()) {
            li1.m("List is empty.");
            return null;
        }
        int i = fj1Var.b - 1;
        Object objG2 = fj1Var.g(i);
        fj1Var.l(i);
        objG2.getClass();
        if (fj1Var.i()) {
            mj1Var.l(null);
        }
        if (fj1Var.b == 1) {
            mj1Var.n(null, fj1Var.f());
        }
        return objG2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e A[LOOP:0: B:9:0x001c->B:22:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[EDGE_INSN: B:25:0x0061->B:23:0x0061 BREAK  A[LOOP:0: B:9:0x001c->B:22:0x005e], SYNTHETIC] */
    public static final fj1 b(mj1 mj1Var) {
        if (mj1Var.i()) {
            fj1 fj1Var = kp1.b;
            fj1Var.getClass();
            return fj1Var;
        }
        fj1 fj1Var2 = new fj1();
        Object[] objArr = mj1Var.c;
        long[] jArr = mj1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof fj1) {
                                fj1Var2.b((fj1) obj);
                            } else {
                                obj.getClass();
                                fj1Var2.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return fj1Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ai1) {
            return this.a.equals(((ai1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
