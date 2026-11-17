package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rg2 implements dh2, Iterable, l21 {
    public final mj1 h;
    public ae1 i;
    public boolean j;
    public boolean k;

    public rg2() {
        long[] jArr = bd2.a;
        this.h = new mj1();
    }

    @Override // defpackage.dh2
    public final void a(ch2 ch2Var, Object obj) {
        boolean z = obj instanceof m1;
        mj1 mj1Var = this.h;
        if (z && mj1Var.c(ch2Var)) {
            Object objG = mj1Var.g(ch2Var);
            objG.getClass();
            m1 m1Var = (m1) objG;
            m1 m1Var2 = (m1) obj;
            String str = m1Var2.a;
            if (str == null) {
                str = m1Var.a;
            }
            hq0 hq0Var = m1Var2.b;
            if (hq0Var == null) {
                hq0Var = m1Var.b;
            }
            mj1Var.n(ch2Var, new m1(str, hq0Var));
        } else {
            mj1Var.n(ch2Var, obj);
        }
        ch2Var.getClass();
    }

    public final Object b(ch2 ch2Var) {
        Object objG = this.h.g(ch2Var);
        if (objG != null) {
            return objG;
        }
        wg.j("Key not present: ", ch2Var, " - consider getOrElse or getOrNull");
        return null;
    }

    public final void c(rg2 rg2Var) {
        mj1 mj1Var = rg2Var.h;
        Object[] objArr = mj1Var.b;
        Object[] objArr2 = mj1Var.c;
        long[] jArr = mj1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        ch2 ch2Var = (ch2) obj;
                        mj1 mj1Var2 = this.h;
                        Object objG = mj1Var2.g(ch2Var);
                        ch2Var.getClass();
                        Object objF = ch2Var.b.f(objG, obj2);
                        if (objF != null) {
                            mj1Var2.n(ch2Var, objF);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg2)) {
            return false;
        }
        rg2 rg2Var = (rg2) obj;
        return this.h.equals(rg2Var.h) && this.j == rg2Var.j && this.k == rg2Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + jp1.c(this.h.hashCode() * 31, 31, this.j);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ae1 ae1Var = this.i;
        if (ae1Var == null) {
            mj1 mj1Var = this.h;
            ae1 ae1Var2 = mj1Var.f;
            if (ae1Var2 == null) {
                ae1Var2 = new ae1(mj1Var);
                mj1Var.f = ae1Var2;
            }
            ae1Var = ae1Var2;
            this.i = ae1Var;
        }
        return ((dh0) ae1Var.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.j) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.k) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        mj1 mj1Var = this.h;
        Object[] objArr = mj1Var.b;
        Object[] objArr2 = mj1Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((ch2) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return es.c0(this) + "{ " + ((Object) sb) + " }";
    }
}
