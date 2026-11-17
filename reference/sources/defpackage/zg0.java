package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zg0 extends f41 implements r31 {
    public wh0 A;
    public si2 B;
    public kp0 C;
    public mg0 D;
    public long E = -9223372034707292160L;
    public d5 F;
    public final yg0 G;
    public final yg0 H;
    public qz2 v;
    public lz2 w;
    public lz2 x;
    public lz2 y;
    public ah0 z;

    public zg0(qz2 qz2Var, lz2 lz2Var, lz2 lz2Var2, lz2 lz2Var3, ah0 ah0Var, wh0 wh0Var, si2 si2Var, kp0 kp0Var, mg0 mg0Var) {
        this.v = qz2Var;
        this.w = lz2Var;
        this.x = lz2Var2;
        this.y = lz2Var3;
        this.z = ah0Var;
        this.A = wh0Var;
        this.B = si2Var;
        this.C = kp0Var;
        this.D = mg0Var;
        l00.b(0, 0, 0, 0, 15);
        this.G = new yg0(this, (byte) 0);
        this.H = new yg0(this, (byte) 1);
    }

    @Override // defpackage.qg1
    public final void B0() {
        this.E = -9223372034707292160L;
    }

    public final d5 J0() {
        if (this.v.f().c(kg0.h, kg0.i)) {
            bs bsVar = this.z.a.c;
            if (bsVar != null) {
                return bsVar.a;
            }
            bs bsVar2 = this.A.a.c;
            if (bsVar2 != null) {
                return bsVar2.a;
            }
            return null;
        }
        bs bsVar3 = this.A.a.c;
        if (bsVar3 != null) {
            return bsVar3.a;
        }
        bs bsVar4 = this.z.a.c;
        if (bsVar4 != null) {
            return bsVar4.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:58:0x0124  */
    @Override // defpackage.c41
    public final af1 e(bf1 bf1Var, ue1 ue1Var, long j) {
        kz2 kz2VarA;
        kz2 kz2VarA2;
        ez2 ez2Var;
        kz2 kz2VarA3;
        kz2 kz2VarA4;
        long j2;
        long j3;
        kz2 kz2VarA5;
        fd fdVar;
        ed edVar;
        float fFloatValue;
        if (this.v.a.g() == this.v.d.getValue()) {
            this.F = null;
        } else if (this.F == null) {
            d5 d5VarJ0 = J0();
            if (d5VarJ0 == null) {
                d5VarJ0 = c5.i;
            }
            this.F = d5VarJ0;
        }
        boolean zU = bf1Var.u();
        bg0 bg0Var = bg0.h;
        if (zU) {
            ny1 ny1VarE = ue1Var.e(j);
            long j4 = (((long) ny1VarE.h) << 32) | (((long) ny1VarE.i) & 4294967295L);
            this.E = j4;
            return bf1Var.g0((int) (j4 >> 32), (int) (j4 & 4294967295L), bg0Var, new tc(ny1VarE, (byte) 1));
        }
        if (!((Boolean) this.C.a()).booleanValue()) {
            ny1 ny1VarE2 = ue1Var.e(j);
            return bf1Var.g0(ny1VarE2.h, ny1VarE2.i, bg0Var, new tc(ny1VarE2, (byte) 2));
        }
        mg0 mg0Var = this.D;
        lz2 lz2Var = mg0Var.a;
        si2 si2Var = mg0Var.b;
        lz2 lz2Var2 = mg0Var.c;
        qz2 qz2Var = mg0Var.d;
        ah0 ah0Var = mg0Var.e;
        pz2 pz2Var = ah0Var.a;
        wh0 wh0Var = mg0Var.f;
        lz2 lz2Var3 = mg0Var.g;
        if (lz2Var != null) {
            kz2VarA = lz2Var.a(new og0(ah0Var, wh0Var, (byte) 0), si2Var.a() ? Float.valueOf(si2Var.f) : null, null, new pg0(ah0Var, wh0Var, si2Var, (byte) 0));
        } else {
            kz2VarA = null;
        }
        if (lz2Var2 != null) {
            og0 og0Var = new og0(ah0Var, wh0Var, (byte) 1);
            Float fValueOf = si2Var.a() ? Float.valueOf(si2Var.g) : null;
            if (si2Var.a()) {
                c43 c43Var = si2Var.j;
                if (c43Var != null) {
                    float fB = c43Var.b();
                    Float fValueOf2 = Float.valueOf(fB);
                    if (Float.isNaN(fB)) {
                        fValueOf2 = null;
                    }
                    if (fValueOf2 != null) {
                        fFloatValue = fValueOf2.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                } else {
                    fFloatValue = 0.0f;
                }
                edVar = new ed(fFloatValue);
            } else {
                edVar = null;
            }
            kz2VarA2 = lz2Var2.a(og0Var, fValueOf, edVar, new pg0(ah0Var, wh0Var, si2Var, (byte) 1));
        } else {
            kz2VarA2 = null;
        }
        if (qz2Var.a.g() == kg0.h) {
            ad2 ad2Var = pz2Var.d;
            if (ad2Var != null) {
                ez2Var = new ez2(ad2Var.b);
            } else {
                ad2 ad2Var2 = wh0Var.a.d;
                if (ad2Var2 != null) {
                    ez2Var = new ez2(ad2Var2.b);
                } else {
                    ez2Var = null;
                }
            }
        } else {
            ad2 ad2Var3 = wh0Var.a.d;
            if (ad2Var3 != null) {
                ez2Var = new ez2(ad2Var3.b);
            } else {
                ad2 ad2Var4 = pz2Var.d;
                if (ad2Var4 != null) {
                    ez2Var = new ez2(ad2Var4.b);
                } else {
                    ez2Var = null;
                }
            }
        }
        if (lz2Var3 != null) {
            kz2VarA3 = lz2Var3.a(wb.p, si2Var.a() ? new ez2(si2Var.h) : null, null, new qg0(ez2Var, ah0Var, wh0Var, si2Var));
        } else {
            kz2VarA3 = null;
        }
        qg0 qg0Var = new qg0(si2Var, kz2VarA, kz2VarA2, kz2VarA3);
        ny1 ny1VarE3 = ue1Var.e(j);
        long j5 = (((long) ny1VarE3.h) << 32) | (((long) ny1VarE3.i) & 4294967295L);
        long j6 = !vy0.a(this.E, -9223372034707292160L) ? this.E : j5;
        lz2 lz2Var4 = this.w;
        if (lz2Var4 != null) {
            kz2VarA4 = lz2Var4.a(this.G, null, null, new xg0(this, j6, (byte) 0));
        } else {
            kz2VarA4 = null;
        }
        long jD = l00.d(j, kz2VarA4 != null ? ((vy0) kz2VarA4.getValue()).a : j5);
        lz2 lz2Var5 = this.x;
        if (lz2Var5 != null) {
            j2 = 0;
            j3 = ((ny0) lz2Var5.a(wb.s, null, null, new xg0(this, j6, (byte) 2)).getValue()).a;
        } else {
            j2 = 0;
            j3 = 0;
        }
        lz2 lz2Var6 = this.y;
        if (lz2Var6 != null) {
            si2 si2Var2 = this.B;
            ny0 ny0Var = si2Var2.a() ? new ny0(si2Var2.i) : null;
            if (this.B.a()) {
                float fB2 = a43.b(j2);
                Float fValueOf3 = Float.valueOf(fB2);
                if (Float.isNaN(fB2)) {
                    fValueOf3 = null;
                }
                float fFloatValue2 = fValueOf3 != null ? fValueOf3.floatValue() : 0.0f;
                float fC = a43.c(j2);
                Float fValueOf4 = !Float.isNaN(fC) ? Float.valueOf(fC) : null;
                fdVar = new fd(fFloatValue2, fValueOf4 != null ? fValueOf4.floatValue() : 0.0f);
            } else {
                fdVar = null;
            }
            kz2VarA5 = lz2Var6.a(this.H, ny0Var, fdVar, new xg0(this, j6, (byte) 1));
        } else {
            kz2VarA5 = null;
        }
        return bf1Var.g0((int) (jD >> 32), (int) (jD & 4294967295L), bg0Var, new wg0(this, kz2VarA5, j5, j6, jD, ny1VarE3, j3, qg0Var));
    }

    @Override // defpackage.r31
    public final void q(t31 t31Var) {
    }
}
