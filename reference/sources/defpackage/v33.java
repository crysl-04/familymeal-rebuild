package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v33 implements q33 {
    public final ri1 h;
    public final si1 i;
    public final short j;
    public final wg k;
    public int[] l = p33.a;
    public float[] m;
    public id n;
    public id o;
    public id p;
    public id q;
    public float[] r;
    public float[] s;
    public g2 t;

    /* JADX WARN: Multi-variable type inference failed */
    public v33(ri1 ri1Var, si1 si1Var, int i, wg wgVar) {
        this.h = ri1Var;
        this.i = si1Var;
        this.j = i;
        this.k = wgVar;
        float[] fArr = p33.b;
        this.m = fArr;
        this.r = fArr;
        this.s = fArr;
        this.t = p33.c;
    }

    public final int c(int i) {
        int i2;
        ri1 ri1Var = this.h;
        int i3 = ri1Var.b;
        int i4 = 0;
        if (i3 <= 0) {
            wg.i("");
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = ri1Var.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float d(int i, int i2, boolean z) {
        ke0 ke0Var;
        float f;
        ri1 ri1Var = this.h;
        if (i >= ri1Var.b - 1) {
            f = i2;
        } else {
            int iC = ri1Var.c(i);
            int iC2 = ri1Var.c(i + 1);
            if (i2 != iC) {
                int i3 = iC2 - iC;
                u33 u33Var = (u33) this.i.b(iC);
                if (u33Var == null || (ke0Var = u33Var.b) == null) {
                    ke0Var = this.k;
                }
                float f2 = i3;
                float fC = ke0Var.c((i2 - iC) / f2);
                return z ? fC : ((f2 * fC) + iC) / 1000.0f;
            }
            f = iC;
        }
        return f / 1000.0f;
    }

    public final void e(id idVar, id idVar2, id idVar3) {
        float[] fArr;
        boolean z = this.t != p33.c;
        id idVar4 = this.n;
        si1 si1Var = this.i;
        ri1 ri1Var = this.h;
        if (idVar4 == null) {
            this.n = idVar.c();
            this.o = idVar3.c();
            int i = ri1Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = ri1Var.c(i2) / 1000.0f;
            }
            this.m = fArr2;
            int i3 = ri1Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.l = iArr;
        }
        if (z) {
            if (this.t != p33.c && uz0.g(this.p, idVar) && uz0.g(this.q, idVar2)) {
                return;
            }
            this.p = idVar;
            this.q = idVar2;
            int iB = idVar.b() + (idVar.b() % 2);
            this.r = new float[iB];
            this.s = new float[iB];
            int i5 = ri1Var.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iC = ri1Var.c(i6);
                u33 u33Var = (u33) si1Var.b(iC);
                if (iC == 0 && u33Var == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = idVar.a(i7);
                    }
                } else if (iC == this.j && u33Var == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = idVar2.a(i8);
                    }
                } else {
                    u33Var.getClass();
                    id idVar5 = u33Var.a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = idVar5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.t = new g2(this.l, this.m, fArr3);
        }
    }

    @Override // defpackage.q33
    public final int k() {
        return 0;
    }

    @Override // defpackage.o33
    public final id l(long j, id idVar, id idVar2, id idVar3) {
        long j2 = j / 1000000;
        int[] iArr = p33.a;
        long j3 = this.j;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return idVar3;
        }
        e(idVar, idVar2, idVar3);
        id idVar4 = this.o;
        idVar4.getClass();
        int i = 0;
        if (this.t != p33.c) {
            int i2 = (int) j4;
            float fD = d(c(i2), i2, false);
            float[] fArr = this.s;
            tg[][] tgVarArr = (tg[][]) this.t.i;
            float f = tgVarArr[0][0].a;
            float f2 = tgVarArr[tgVarArr.length - 1][0].b;
            if (fD < f) {
                fD = f;
            }
            if (fD <= f2) {
                f2 = fD;
            }
            int length = fArr.length;
            boolean z = false;
            for (tg[] tgVarArr2 : tgVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    tg tgVar = tgVarArr2[i4];
                    if (f2 <= tgVar.b) {
                        if (tgVar.p) {
                            fArr[i3] = tgVar.q;
                            fArr[i3 + 1] = tgVar.r;
                        } else {
                            tgVar.c(f2);
                            fArr[i3] = tgVar.a();
                            fArr[i3 + 1] = tgVar.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                idVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            id idVarP = p((j4 - 1) * 1000000, idVar, idVar2, idVar3);
            id idVarP2 = p(j4 * 1000000, idVar, idVar2, idVar3);
            int iB = idVarP.b();
            while (i < iB) {
                idVar4.e(i, (idVarP.a(i) - idVarP2.a(i)) * 1000.0f);
                i++;
            }
        }
        return idVar4;
    }

    @Override // defpackage.q33
    public final int o() {
        return this.j;
    }

    @Override // defpackage.o33
    public final id p(long j, id idVar, id idVar2, id idVar3) {
        id idVar4;
        id idVar5;
        id idVar6 = idVar;
        long j2 = j / 1000000;
        int[] iArr = p33.a;
        short s = this.j;
        long j3 = s;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i = (int) j3;
        si1 si1Var = this.i;
        u33 u33Var = (u33) si1Var.b(i);
        if (u33Var != null) {
            return u33Var.a;
        }
        if (i >= s) {
            return idVar2;
        }
        if (i <= 0) {
            return idVar6;
        }
        e(idVar6, idVar2, idVar3);
        id idVar7 = this.n;
        idVar7.getClass();
        int i2 = 0;
        if (this.t != p33.c) {
            float fD = d(c(i), i, false);
            float[] fArr = this.r;
            tg[][] tgVarArr = (tg[][]) this.t.i;
            int length = tgVarArr.length - 1;
            float f = tgVarArr[0][0].a;
            float f2 = tgVarArr[length][0].b;
            int length2 = fArr.length;
            if (fD >= f && fD <= f2) {
                int length3 = tgVarArr.length;
                int i3 = 0;
                boolean z = false;
                while (i3 < length3) {
                    int i4 = i2;
                    int i5 = i4;
                    while (i4 < length2 - 1) {
                        tg tgVar = tgVarArr[i3][i5];
                        if (fD <= tgVar.b) {
                            if (tgVar.p) {
                                float f3 = tgVar.a;
                                float f4 = tgVar.k;
                                float f5 = tgVar.c;
                                fArr[i4] = ((tgVar.e - f5) * (fD - f3) * f4) + f5;
                                float f6 = tgVar.d;
                                fArr[i4 + 1] = ((tgVar.f - f6) * (fD - f3) * f4) + f6;
                            } else {
                                tgVar.c(fD);
                                fArr[i4] = (tgVar.n * tgVar.h) + tgVar.q;
                                fArr[i4 + 1] = (tgVar.o * tgVar.i) + tgVar.r;
                            }
                            z = true;
                        }
                        i4 += 2;
                        i5++;
                    }
                    if (z) {
                        break;
                    }
                    i3++;
                    i2 = 0;
                }
            } else {
                if (fD > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f7 = fD - f;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length2 - 1) {
                    tg tgVar2 = tgVarArr[length][i7];
                    boolean z2 = tgVar2.p;
                    float f8 = tgVar2.r;
                    float f9 = tgVar2.q;
                    if (z2) {
                        float f10 = tgVar2.a;
                        float f11 = tgVar2.k;
                        float f12 = tgVar2.c;
                        fArr[i6] = (f9 * f7) + ((tgVar2.e - f12) * (f - f10) * f11) + f12;
                        float f13 = (f - f10) * f11;
                        float f14 = tgVar2.d;
                        fArr[i6 + 1] = (f8 * f7) + ((tgVar2.f - f14) * f13) + f14;
                    } else {
                        tgVar2.c(f);
                        fArr[i6] = (tgVar2.a() * f7) + (tgVar2.n * tgVar2.h) + f9;
                        fArr[i6 + 1] = (tgVar2.b() * f7) + (tgVar2.o * tgVar2.i) + f8;
                    }
                    i6 += 2;
                    i7++;
                    tgVarArr = tgVarArr;
                }
            }
            int length4 = fArr.length;
            for (int i8 = 0; i8 < length4; i8++) {
                idVar7.e(i8, fArr[i8]);
            }
        } else {
            int iC = c(i);
            float fD2 = d(iC, i, true);
            ri1 ri1Var = this.h;
            u33 u33Var2 = (u33) si1Var.b(ri1Var.c(iC));
            if (u33Var2 != null && (idVar5 = u33Var2.a) != null) {
                idVar6 = idVar5;
            }
            u33 u33Var3 = (u33) si1Var.b(ri1Var.c(iC + 1));
            if (u33Var3 == null || (idVar4 = u33Var3.a) == null) {
                idVar4 = idVar2;
            }
            int iB = idVar7.b();
            for (int i9 = 0; i9 < iB; i9++) {
                idVar7.e(i9, (idVar4.a(i9) * fD2) + ((1.0f - fD2) * idVar6.a(i9)));
            }
        }
        return idVar7;
    }
}
