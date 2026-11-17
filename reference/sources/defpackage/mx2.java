package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mx2 {
    public final int a;
    public final xi b;
    public final g c;
    public mx2 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ nx2 h;

    public mx2(nx2 nx2Var, int i, xi xiVar, g gVar) {
        this.h = nx2Var;
        this.a = i;
        this.b = xiVar;
        this.c = gVar;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        e82 e82Var;
        e82 e82Var2;
        long j5 = this.h.f;
        xi xiVar = this.b;
        pn1 pn1VarW = cu.W(xiVar, 2);
        l41 l41VarY = cu.Y(xiVar);
        boolean zJ = l41VarY.J();
        ln1 ln1Var = l41VarY.L;
        if (zJ) {
            if (ln1Var.d != pn1VarW) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L);
                long j6 = pn1VarW.j;
                pn1 pn1Var = ln1Var.d;
                pn1Var.getClass();
                long jD0 = lt.d0(pn1Var.G(pn1VarW, jFloatToRawIntBits));
                e82Var = new e82(jD0, (((long) (((int) (jD0 >> 32)) + ((int) (j6 >> 32)))) << 32) | (((long) (((int) (jD0 & 4294967295L)) + ((int) (j6 & 4294967295L)))) & 4294967295L), j3, j4, j5, fArr, xiVar);
            } else {
                e82Var = new e82(j, j2, j3, j4, j5, fArr, xiVar);
            }
            e82Var2 = e82Var;
        } else {
            e82Var2 = null;
        }
        if (e82Var2 == null) {
            return;
        }
        this.c.h(e82Var2);
    }

    public final void b() {
        nx2 nx2Var = this.h;
        si1 si1Var = nx2Var.a;
        int i = this.a;
        mx2 mx2Var = (mx2) si1Var.g(i);
        if (mx2Var != null) {
            if (mx2Var == this) {
                mx2 mx2Var2 = this.d;
                this.d = null;
                if (mx2Var2 != null) {
                    int iD = si1Var.d(i);
                    Object[] objArr = si1Var.c;
                    Object obj = objArr[iD];
                    si1Var.b[iD] = i;
                    objArr[iD] = mx2Var2;
                    return;
                }
                l41 l41VarY = cu.Y(this.b.h);
                if (l41VarY.I()) {
                    s72 rectManager = o41.a(l41VarY).getRectManager();
                    rectManager.getClass();
                    if (l41VarY.n != -4) {
                        u8 u8Var = rectManager.c;
                        int iD2 = rectManager.d(l41VarY);
                        long[] jArr = (long[]) u8Var.b;
                        int i2 = iD2 + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
            int iD3 = si1Var.d(i);
            Object[] objArr2 = si1Var.c;
            Object obj2 = objArr2[iD3];
            si1Var.b[iD3] = i;
            objArr2[iD3] = mx2Var;
            while (true) {
                mx2 mx2Var3 = mx2Var.d;
                if (mx2Var3 == null) {
                    break;
                }
                if (mx2Var3 == this) {
                    mx2Var.d = this.d;
                    this.d = null;
                    return;
                }
                mx2Var = mx2Var3;
            }
        }
        mx2 mx2Var4 = nx2Var.b;
        if (mx2Var4 == this) {
            nx2Var.b = mx2Var4.d;
            this.d = null;
            return;
        }
        mx2 mx2Var5 = mx2Var4 != null ? mx2Var4.d : null;
        while (true) {
            mx2 mx2Var6 = mx2Var4;
            mx2Var4 = mx2Var5;
            if (mx2Var4 == null) {
                return;
            }
            if (mx2Var4 == this) {
                if (mx2Var6 != null) {
                    mx2Var6.d = mx2Var4.d;
                }
                this.d = null;
                return;
            }
            mx2Var5 = mx2Var4.d;
        }
    }
}
