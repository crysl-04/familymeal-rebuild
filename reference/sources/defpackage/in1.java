package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class in1 extends zn1 {
    public final qg1 c;
    public final p4 d;
    public final tc1 e;
    public pn1 f;
    public q02 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public in1(qg1 qg1Var) {
        this.c = qg1Var;
        p4 p4Var = new p4((byte) 5);
        p4Var.c = new long[2];
        this.d = p4Var;
        this.e = new tc1(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x030d A[EDGE_INSN: B:153:0x030d->B:154:0x030f BREAK  A[LOOP:9: B:148:0x02f0->B:151:0x0308]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [qg1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [qg1] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [qg1] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [uj1] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [uj1] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    @Override // defpackage.zn1
    public final boolean a(tc1 tc1Var, t31 t31Var, ix0 ix0Var, boolean z) {
        p4 p4Var;
        tc1 tc1Var2;
        Object obj;
        boolean z2;
        boolean z3;
        q02 q02Var;
        boolean z4;
        byte b;
        int i;
        boolean z5;
        boolean zA = super.a(tc1Var, t31Var, ix0Var, z);
        ?? R = this.c;
        boolean z6 = true;
        if (R.u) {
            ?? uj1Var = 0;
            while (R != 0) {
                if (R instanceof c12) {
                    this.f = cu.W((c12) R, 16);
                } else if ((R.j & 16) != 0 && (R instanceof k80)) {
                    qg1 qg1Var = ((k80) R).w;
                    int i2 = 0;
                    while (qg1Var != null) {
                        if ((qg1Var.j & 16) != 0) {
                            i2++;
                            if (i2 == 1) {
                                R = R;
                                uj1Var = uj1Var;
                                uj1Var = uj1Var;
                                R = qg1Var;
                            } else {
                                if (uj1Var == 0) {
                                    uj1Var = new uj1(new qg1[16]);
                                }
                                if (R != 0) {
                                    uj1Var.b(R);
                                    R = 0;
                                }
                                uj1Var.b(qg1Var);
                            }
                        } else {
                            R = R;
                            uj1Var = uj1Var;
                        }
                        qg1Var = qg1Var.m;
                        R = R;
                        uj1Var = uj1Var;
                    }
                    if (i2 != 1) {
                        R = R;
                        uj1Var = uj1Var;
                    } else {
                        R = R;
                        uj1Var = uj1Var;
                    }
                }
                R = cu.R(uj1Var);
            }
            if (this.f != null) {
                int iE = tc1Var.e();
                int i3 = 0;
                while (true) {
                    p4Var = this.d;
                    tc1Var2 = this.e;
                    if (i3 >= iE) {
                        break;
                    }
                    long jB = tc1Var.b(i3);
                    z02 z02Var = (z02) tc1Var.f(i3);
                    if (p4Var.b(jB)) {
                        boolean z7 = z6;
                        long j = z02Var.g;
                        long j2 = z02Var.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            ArrayList arrayList = new ArrayList(z02Var.b().size());
                            List listB = z02Var.b();
                            int size = listB.size();
                            int i4 = 0;
                            while (i4 < size) {
                                List list = listB;
                                ft0 ft0Var = (ft0) listB.get(i4);
                                tc1 tc1Var3 = tc1Var2;
                                long j3 = jB;
                                long j4 = ft0Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j5 = ft0Var.a;
                                    pn1 pn1Var = this.f;
                                    pn1Var.getClass();
                                    arrayList.add(new ft0(j5, pn1Var.G(t31Var, j4), ft0Var.c, ft0Var.d, ft0Var.e));
                                }
                                i4++;
                                size = size;
                                listB = list;
                                tc1Var2 = tc1Var3;
                                jB = j3;
                                z02Var = z02Var;
                            }
                            tc1 tc1Var4 = tc1Var2;
                            long j6 = jB;
                            pn1 pn1Var2 = this.f;
                            pn1Var2.getClass();
                            long jG = pn1Var2.G(t31Var, j);
                            pn1 pn1Var3 = this.f;
                            pn1Var3.getClass();
                            z02 z02Var2 = new z02(z02Var.a, z02Var.b, pn1Var3.G(t31Var, j2), z02Var.d, z02Var.e, z02Var.f, jG, z02Var.h, z02Var.i, arrayList, z02Var.j, z02Var.k, z02Var.l, z02Var.n);
                            z02 z02Var3 = z02Var.q;
                            if (z02Var3 == null) {
                                z02Var3 = z02Var;
                            }
                            z02Var2.q = z02Var3;
                            z02 z02Var4 = z02Var.q;
                            if (z02Var4 != null) {
                                z02Var = z02Var4;
                            }
                            z02Var2.q = z02Var;
                            tc1Var4.c(j6, z02Var2);
                        } else {
                            z5 = z7;
                        }
                    } else {
                        z5 = z6;
                    }
                    i3++;
                    z6 = z5;
                    iE = iE;
                    zA = zA;
                }
                boolean z8 = zA;
                boolean z9 = z6;
                if (tc1Var2.e() == 0) {
                    p4Var.b = 0;
                    this.a.g();
                    return z9;
                }
                int i5 = p4Var.b;
                while (true) {
                    i5--;
                    if (-1 >= i5) {
                        break;
                    }
                    long j7 = ((long[]) p4Var.c)[i5];
                    if (tc1Var.h) {
                        int i6 = tc1Var.k;
                        long[] jArr = tc1Var.i;
                        Object[] objArr = tc1Var.j;
                        int i7 = 0;
                        for (int i8 = 0; i8 < i6; i8++) {
                            Object obj2 = objArr[i8];
                            if (obj2 != ie1.I) {
                                if (i8 != i7) {
                                    jArr[i7] = jArr[i8];
                                    objArr[i7] = obj2;
                                    objArr[i8] = null;
                                }
                                i7++;
                            }
                        }
                        tc1Var.h = false;
                        tc1Var.k = i7;
                    }
                    if (s60.i(tc1Var.i, tc1Var.k, j7) < 0 && i5 < (i = p4Var.b)) {
                        int i9 = i - 1;
                        int i10 = i5;
                        while (i10 < i9) {
                            long[] jArr2 = (long[]) p4Var.c;
                            int i11 = i10 + 1;
                            jArr2[i10] = jArr2[i11];
                            i10 = i11;
                        }
                        p4Var.b--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(tc1Var2.e());
                int iE2 = tc1Var2.e();
                for (int i12 = 0; i12 < iE2; i12++) {
                    arrayList2.add(tc1Var2.f(i12));
                }
                q02 q02Var2 = new q02(arrayList2, ix0Var);
                int size2 = arrayList2.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i13);
                    if (ix0Var.l(((z02) obj).a)) {
                        break;
                    }
                    i13++;
                }
                z02 z02Var5 = (z02) obj;
                if (z02Var5 != null) {
                    boolean z10 = z02Var5.d;
                    z2 = false;
                    if (z) {
                        z4 = this.i;
                        if (!z4 && (z10 || z02Var5.h)) {
                            pn1 pn1Var4 = this.f;
                            pn1Var4.getClass();
                            long j8 = pn1Var4.j;
                            long j9 = z02Var5.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            z4 = !((fIntBitsToFloat < 0.0f ? z9 : false) | (fIntBitsToFloat > ((float) ((int) (j8 >> 32))) ? z9 : false) | (fIntBitsToFloat2 < 0.0f ? z9 : false) | (fIntBitsToFloat2 > ((float) ((int) (j8 & 4294967295L))) ? z9 : false));
                            this.i = z4;
                        }
                    } else {
                        this.i = false;
                        z4 = false;
                    }
                    boolean z11 = this.h;
                    if (z4 == z11 || !((b = q02Var2.f) == 3 || b == 4 || b == 5)) {
                        byte b2 = q02Var2.f;
                        if (b2 == 4 && z11 && !this.j) {
                            q02Var2.f = (byte) 3;
                        } else if (b2 == 5 && z4 && z10) {
                            q02Var2.f = (byte) 3;
                        }
                    } else {
                        q02Var2.f = z4 ? (byte) 4 : (byte) 5;
                    }
                } else {
                    z2 = false;
                }
                if (z8 || q02Var2.f != 3 || (q02Var = this.g) == null) {
                    z3 = z9;
                    break;
                }
                ?? r1 = q02Var.a;
                int size3 = r1.size();
                ?? r4 = q02Var2.a;
                if (size3 != r4.size()) {
                    z3 = z9;
                    break;
                }
                int size4 = r4.size();
                ?? r5 = z2;
                while (true) {
                    if (r5 >= size4) {
                        z3 = z2;
                        break;
                    }
                    if (!up1.b(((z02) r1.get(r5)).c, ((z02) r4.get(r5)).c)) {
                        z3 = z9;
                        break;
                    }
                    r5++;
                }
                this.g = q02Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.zn1
    public final void b(ix0 ix0Var) {
        super.b(ix0Var);
        q02 q02Var = this.g;
        if (q02Var == null) {
            return;
        }
        this.h = this.i;
        List list = q02Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            z02 z02Var = (z02) list.get(i);
            boolean z = z02Var.d;
            long j = z02Var.a;
            boolean zL = ix0Var.l(j);
            boolean z2 = this.i;
            if (!z && (!zL || !z2)) {
                this.d.h(j);
            }
        }
        this.i = false;
        this.j = q02Var.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [uj1] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [uj1] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [qg1] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [qg1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [qg1] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        uj1 uj1Var = this.a;
        Object[] objArr = uj1Var.h;
        int i = uj1Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            ((in1) objArr[i2]).c();
        }
        ?? R = this.c;
        ?? uj1Var2 = 0;
        while (R != 0) {
            if (R instanceof c12) {
                ((c12) R).j0();
            } else if ((R.j & 16) != 0 && (R instanceof k80)) {
                qg1 qg1Var = ((k80) R).w;
                int i3 = 0;
                uj1Var2 = uj1Var2;
                R = R;
                while (qg1Var != null) {
                    if ((qg1Var.j & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            uj1Var2 = uj1Var2;
                            R = qg1Var;
                        } else {
                            if (uj1Var2 == 0) {
                                uj1Var2 = new uj1(new qg1[16]);
                            }
                            if (R != 0) {
                                uj1Var2.b(R);
                                R = 0;
                            }
                            uj1Var2.b(qg1Var);
                        }
                    }
                    qg1Var = qg1Var.m;
                    uj1Var2 = uj1Var2;
                    R = R;
                }
                if (i3 != 1) {
                }
            }
            R = cu.R(uj1Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [qg1] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [qg1] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [uj1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [uj1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(ix0 ix0Var) {
        boolean z;
        l41 l41Var;
        tc1 tc1Var = this.e;
        if (tc1Var.e() != 0) {
            qg1 qg1Var = this.c;
            if (qg1Var.u) {
                pn1 pn1Var = qg1Var.o;
                if ((pn1Var == null || (l41Var = pn1Var.B) == null) ? false : l41Var.J()) {
                    q02 q02Var = this.g;
                    q02Var.getClass();
                    pn1 pn1Var2 = this.f;
                    pn1Var2.getClass();
                    long j = pn1Var2.j;
                    ?? R = qg1Var;
                    ?? uj1Var = 0;
                    while (true) {
                        z = true;
                        if (R == 0) {
                            break;
                        }
                        if (R instanceof c12) {
                            ((c12) R).K(q02Var, s02.j, j);
                        } else if ((R.j & 16) != 0 && (R instanceof k80)) {
                            qg1 qg1Var2 = ((k80) R).w;
                            int i = 0;
                            while (qg1Var2 != null) {
                                if ((qg1Var2.j & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        R = R;
                                        uj1Var = uj1Var;
                                        uj1Var = uj1Var;
                                        R = qg1Var2;
                                    } else {
                                        if (uj1Var == 0) {
                                            uj1Var = new uj1(new qg1[16]);
                                        }
                                        if (R != 0) {
                                            uj1Var.b(R);
                                            R = 0;
                                        }
                                        uj1Var.b(qg1Var2);
                                    }
                                } else {
                                    R = R;
                                    uj1Var = uj1Var;
                                }
                                qg1Var2 = qg1Var2.m;
                                R = R;
                                uj1Var = uj1Var;
                            }
                            if (i != 1) {
                                R = R;
                                uj1Var = uj1Var;
                            } else {
                                R = R;
                                uj1Var = uj1Var;
                            }
                        }
                        R = cu.R(uj1Var);
                    }
                    if (qg1Var.u) {
                        uj1 uj1Var2 = this.a;
                        Object[] objArr = uj1Var2.h;
                        int i2 = uj1Var2.j;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((in1) objArr[i3]).d(ix0Var);
                        }
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        b(ix0Var);
        int i4 = tc1Var.k;
        Object[] objArr2 = tc1Var.j;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr2[i5] = null;
        }
        tc1Var.k = 0;
        tc1Var.h = false;
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [qg1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [qg1] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [qg1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [uj1] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [uj1] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [qg1] */
    /* JADX WARN: Type inference failed for: r6v10, types: [qg1] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [uj1] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [uj1] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(ix0 ix0Var, boolean z) {
        l41 l41Var;
        if (this.e.e() == 0) {
            return false;
        }
        ?? R = this.c;
        if (R.u) {
            pn1 pn1Var = R.o;
            if ((pn1Var == null || (l41Var = pn1Var.B) == null) ? false : l41Var.J()) {
                q02 q02Var = this.g;
                q02Var.getClass();
                pn1 pn1Var2 = this.f;
                pn1Var2.getClass();
                long j = pn1Var2.j;
                ?? R2 = R;
                ?? uj1Var = 0;
                while (R2 != 0) {
                    if (R2 instanceof c12) {
                        ((c12) R2).K(q02Var, s02.h, j);
                    } else if ((R2.j & 16) != 0 && (R2 instanceof k80)) {
                        qg1 qg1Var = ((k80) R2).w;
                        int i = 0;
                        while (qg1Var != null) {
                            if ((qg1Var.j & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    R2 = R2;
                                    uj1Var = uj1Var;
                                    uj1Var = uj1Var;
                                    R2 = qg1Var;
                                } else {
                                    if (uj1Var == 0) {
                                        uj1Var = new uj1(new qg1[16]);
                                    }
                                    if (R2 != 0) {
                                        uj1Var.b(R2);
                                        R2 = 0;
                                    }
                                    uj1Var.b(qg1Var);
                                }
                            } else {
                                R2 = R2;
                                uj1Var = uj1Var;
                            }
                            qg1Var = qg1Var.m;
                            R2 = R2;
                            uj1Var = uj1Var;
                        }
                        if (i != 1) {
                            R2 = R2;
                            uj1Var = uj1Var;
                        } else {
                            R2 = R2;
                            uj1Var = uj1Var;
                        }
                    }
                    R2 = cu.R(uj1Var);
                }
                if (R.u) {
                    uj1 uj1Var2 = this.a;
                    Object[] objArr = uj1Var2.h;
                    int i2 = uj1Var2.j;
                    for (int i3 = 0; i3 < i2; i3++) {
                        in1 in1Var = (in1) objArr[i3];
                        this.f.getClass();
                        in1Var.e(ix0Var, z);
                    }
                }
                if (R.u) {
                    ?? uj1Var3 = 0;
                    while (R != 0) {
                        if (R instanceof c12) {
                            ((c12) R).K(q02Var, s02.i, j);
                        } else if ((R.j & 16) != 0 && (R instanceof k80)) {
                            qg1 qg1Var2 = ((k80) R).w;
                            int i4 = 0;
                            while (qg1Var2 != null) {
                                if ((qg1Var2.j & 16) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        R = R;
                                        uj1Var3 = uj1Var3;
                                        uj1Var3 = uj1Var3;
                                        R = qg1Var2;
                                    } else {
                                        if (uj1Var3 == 0) {
                                            uj1Var3 = new uj1(new qg1[16]);
                                        }
                                        if (R != 0) {
                                            uj1Var3.b(R);
                                            R = 0;
                                        }
                                        uj1Var3.b(qg1Var2);
                                    }
                                } else {
                                    R = R;
                                    uj1Var3 = uj1Var3;
                                }
                                qg1Var2 = qg1Var2.m;
                                R = R;
                                uj1Var3 = uj1Var3;
                            }
                            if (i4 != 1) {
                                R = R;
                                uj1Var3 = uj1Var3;
                            } else {
                                R = R;
                                uj1Var3 = uj1Var3;
                            }
                        }
                        R = cu.R(uj1Var3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, fj1 fj1Var) {
        p4 p4Var = this.d;
        if (p4Var.b(j) && !fj1Var.e(this)) {
            p4Var.h(j);
            this.e.d(j);
        }
        uj1 uj1Var = this.a;
        Object[] objArr = uj1Var.h;
        int i = uj1Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            ((in1) objArr[i2]).f(j, fj1Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}
