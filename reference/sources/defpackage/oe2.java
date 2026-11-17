package defpackage;

import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class oe2 {
    public final /* synthetic */ qe2 a;

    public oe2(qe2 qe2Var) {
        this.a = qe2Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:103:0x020e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0213  */
    /* JADX WARN: Code duplicated, block: B:107:0x021b  */
    /* JADX WARN: Code duplicated, block: B:108:0x021f  */
    /* JADX WARN: Code duplicated, block: B:111:0x022b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0230  */
    /* JADX WARN: Code duplicated, block: B:115:0x0238  */
    /* JADX WARN: Code duplicated, block: B:116:0x023c  */
    /* JADX WARN: Code duplicated, block: B:118:0x023f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x0245  */
    /* JADX WARN: Code duplicated, block: B:124:0x024d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0288  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:150:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:160:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:165:0x030a  */
    /* JADX WARN: Code duplicated, block: B:172:0x0327  */
    /* JADX WARN: Code duplicated, block: B:174:0x0338  */
    /* JADX WARN: Code duplicated, block: B:175:0x033c  */
    /* JADX WARN: Code duplicated, block: B:180:0x034b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0352  */
    /* JADX WARN: Code duplicated, block: B:187:0x0356  */
    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    /* JADX WARN: Code duplicated, block: B:67:0x013e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0146  */
    /* JADX WARN: Code duplicated, block: B:77:0x0170 A[PHI: r8
  0x0170: PHI (r8v10 float) = (r8v9 float), (r8v13 float) binds: [B:75:0x0169, B:65:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0173  */
    /* JADX WARN: Code duplicated, block: B:81:0x018d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final long a(int i, long j) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jD;
        long jD2;
        boolean z;
        boolean zF;
        boolean z2;
        EdgeEffect edgeEffectB;
        float fIntBitsToFloat3;
        yr0 yr0Var;
        float f;
        EdgeEffect edgeEffectE;
        float fIntBitsToFloat4;
        yr0 yr0Var2;
        float f2;
        EdgeEffect edgeEffectD;
        float fIntBitsToFloat5;
        yr0 yr0Var3;
        float f3;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        float fH;
        qe2 qe2Var = this.a;
        qe2Var.j = i;
        j8 j8Var = qe2Var.b;
        if (j8Var == null || !qe2Var.b()) {
            return qe2Var.d(qe2Var.k, j, i);
        }
        byte b = qe2Var.j;
        qe2 qe2Var2 = (qe2) qe2Var.m.i;
        oe0 oe0Var = j8Var.c;
        if (wj2.c(j8Var.g)) {
            return new up1(qe2Var2.d(qe2Var2.k, j, qe2Var2.j)).a;
        }
        if (!j8Var.f) {
            if (oe0.g(oe0Var.f)) {
                j8Var.g(0L);
            }
            if (oe0.g(oe0Var.g)) {
                j8Var.h(0L);
            }
            if (oe0.g(oe0Var.d)) {
                j8Var.i(0L);
            }
            if (oe0.g(oe0Var.e)) {
                j8Var.f(0L);
            }
            j8Var.f = true;
        }
        int i5 = d9.a;
        float f4 = b == 2 ? 4.0f : 1.0f;
        long jF = up1.f(f4, j);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!oe0.g(oe0Var.d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (oe0.g(oe0Var.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float f5 = j8Var.f(jF);
                    if (!oe0.g(oe0Var.e)) {
                        oe0Var.b().finish();
                    }
                    fIntBitsToFloat = f5 == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i6) : f5 / f4;
                }
            } else {
                float fI = j8Var.i(jF);
                j2 = 4294967295L;
                if (!oe0.g(oe0Var.d)) {
                    oe0Var.e().finish();
                }
                fIntBitsToFloat = fI == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i6) : fI / f4;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) == 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!oe0.g(oe0Var.f) && Float.intBitsToFloat(i2) < 0.0f) {
                fH = j8Var.g(jF);
                if (!oe0.g(oe0Var.f)) {
                    oe0Var.c().finish();
                }
                if (fH == Float.intBitsToFloat((int) (jF >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fH / f4;
                }
            } else if (oe0.g(oe0Var.g) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fH = j8Var.h(jF);
                if (!oe0.g(oe0Var.g)) {
                    oe0Var.d().finish();
                }
                if (fH == Float.intBitsToFloat((int) (jF >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fH / f4;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!up1.b(jFloatToRawIntBits, 0L)) {
                j8Var.d();
            }
            jD = up1.d(j, jFloatToRawIntBits);
            long j3 = new up1(qe2Var2.d(qe2Var2.k, jD, qe2Var2.j)).a;
            jD2 = up1.d(jD, j3);
            if ((Float.intBitsToFloat((int) (jD >> 32)) == 0.0f || Float.intBitsToFloat((int) (jD & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (oe0.g(oe0Var.f) || oe0.g(oe0Var.d) || oe0.g(oe0Var.g) || oe0.g(oe0Var.e)))) {
                j8Var.a();
            }
            if (b == 1) {
                i3 = (int) (jD2 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    j8Var.g(jD2);
                } else {
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        j8Var.h(jD2);
                    } else {
                        z3 = false;
                    }
                    i4 = (int) (jD2 & j2);
                    if (Float.intBitsToFloat(i4) > 0.5f) {
                        j8Var.i(jD2);
                    } else {
                        if (Float.intBitsToFloat(i4) < -0.5f) {
                            j8Var.f(jD2);
                        } else {
                            z4 = false;
                        }
                        if (!z3 || z4) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z4 = true;
                    if (z3) {
                    }
                    z = true;
                }
                z3 = true;
                i4 = (int) (jD2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    j8Var.i(jD2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        j8Var.f(jD2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!up1.b(jD, 0L)) {
                if (oe0.f(oe0Var.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = oe0Var.c();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    if (edgeEffectC instanceof yr0) {
                        yr0 yr0Var4 = (yr0) edgeEffectC;
                        float f6 = yr0Var4.b + fIntBitsToFloat6;
                        yr0Var4.b = f6;
                        if (Math.abs(f6) > yr0Var4.a) {
                            yr0Var4.onRelease();
                        }
                    } else {
                        edgeEffectC.onRelease();
                    }
                    zF = oe0.f(oe0Var.f);
                }
                if (oe0.f(oe0Var.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    edgeEffectD = oe0Var.d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    if (edgeEffectD instanceof yr0) {
                        yr0Var3 = (yr0) edgeEffectD;
                        f3 = yr0Var3.b + fIntBitsToFloat5;
                        yr0Var3.b = f3;
                        if (Math.abs(f3) > yr0Var3.a) {
                            yr0Var3.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    if (!zF || oe0.f(oe0Var.g)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (oe0.f(oe0Var.d) && Float.intBitsToFloat(i6) < 0.0f) {
                    edgeEffectE = oe0Var.e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i6);
                    if (edgeEffectE instanceof yr0) {
                        yr0Var2 = (yr0) edgeEffectE;
                        f2 = yr0Var2.b + fIntBitsToFloat4;
                        yr0Var2.b = f2;
                        if (Math.abs(f2) > yr0Var2.a) {
                            yr0Var2.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    if (!zF || oe0.f(oe0Var.d)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (oe0.f(oe0Var.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    edgeEffectB = oe0Var.b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i6);
                    if (edgeEffectB instanceof yr0) {
                        yr0Var = (yr0) edgeEffectB;
                        f = yr0Var.b + fIntBitsToFloat3;
                        yr0Var.b = f;
                        if (Math.abs(f) > yr0Var.a) {
                            yr0Var.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    if (!zF || oe0.f(oe0Var.e)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (!zF || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z2;
            }
            if (z) {
                j8Var.d();
            }
            return up1.e(jFloatToRawIntBits, j3);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) == 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!oe0.g(oe0Var.f)) {
            if (oe0.g(oe0Var.g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (oe0.g(oe0Var.g)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!up1.b(jFloatToRawIntBits, 0L)) {
            j8Var.d();
        }
        jD = up1.d(j, jFloatToRawIntBits);
        long j4 = new up1(qe2Var2.d(qe2Var2.k, jD, qe2Var2.j)).a;
        jD2 = up1.d(jD, j4);
        if (Float.intBitsToFloat((int) (jD >> 32)) == 0.0f) {
            j8Var.a();
        } else {
            j8Var.a();
        }
        if (b == 1) {
            i3 = (int) (jD2 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                j8Var.g(jD2);
            } else {
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    j8Var.h(jD2);
                } else {
                    z3 = false;
                }
                i4 = (int) (jD2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    j8Var.i(jD2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        j8Var.f(jD2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            }
            z3 = true;
            i4 = (int) (jD2 & j2);
            if (Float.intBitsToFloat(i4) > 0.5f) {
                j8Var.i(jD2);
            } else {
                if (Float.intBitsToFloat(i4) < -0.5f) {
                    j8Var.f(jD2);
                } else {
                    z4 = false;
                }
                if (z3) {
                }
                z = true;
            }
            z4 = true;
            if (z3) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!up1.b(jD, 0L)) {
            if (oe0.f(oe0Var.f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (oe0.f(oe0Var.g)) {
                edgeEffectD = oe0Var.d();
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                if (edgeEffectD instanceof yr0) {
                    yr0Var3 = (yr0) edgeEffectD;
                    f3 = yr0Var3.b + fIntBitsToFloat5;
                    yr0Var3.b = f3;
                    if (Math.abs(f3) > yr0Var3.a) {
                        yr0Var3.onRelease();
                    }
                } else {
                    edgeEffectD.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (oe0.f(oe0Var.d)) {
                edgeEffectE = oe0Var.e();
                fIntBitsToFloat4 = Float.intBitsToFloat(i6);
                if (edgeEffectE instanceof yr0) {
                    yr0Var2 = (yr0) edgeEffectE;
                    f2 = yr0Var2.b + fIntBitsToFloat4;
                    yr0Var2.b = f2;
                    if (Math.abs(f2) > yr0Var2.a) {
                        yr0Var2.onRelease();
                    }
                } else {
                    edgeEffectE.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (oe0.f(oe0Var.e)) {
                edgeEffectB = oe0Var.b();
                fIntBitsToFloat3 = Float.intBitsToFloat(i6);
                if (edgeEffectB instanceof yr0) {
                    yr0Var = (yr0) edgeEffectB;
                    f = yr0Var.b + fIntBitsToFloat3;
                    yr0Var.b = f;
                    if (Math.abs(f) > yr0Var.a) {
                        yr0Var.onRelease();
                    }
                } else {
                    edgeEffectB.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (zF) {
                z2 = true;
            } else {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            j8Var.d();
        }
        return up1.e(jFloatToRawIntBits, j4);
    }
}
