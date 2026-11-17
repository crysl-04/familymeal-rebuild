package defpackage;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class je2 extends k80 implements z21, ug2, c12, nv0, pz, ld0 {
    public ui1 A;
    public fp B;
    public jd0 C;
    public boolean D;
    public boolean E;
    public mc0 F;
    public long G;
    public qr0 H;
    public qr0 I;
    public pc0 J;
    public oc0 K;
    public nc0 L;
    public vs M;
    public xl1 N;
    public wy2 O;
    public mv0 P;
    public final wk Q;
    public s R;
    public r0 S;
    public boolean T;
    public boolean U;
    public nh1 V;
    public zy2 W;
    public final e70 X;
    public final qe2 Y;
    public final az Z;
    public final lm0 a0;
    public final x00 b0;
    public ks1 x;
    public vp0 y;
    public boolean z;

    public je2(j8 j8Var, tj0 tj0Var, ui1 ui1Var, ks1 ks1Var, ke2 ke2Var, un2 un2Var, boolean z, boolean z2) {
        s0 s0Var = s60.a;
        this.x = ks1Var;
        this.y = s0Var;
        this.z = z;
        this.A = ui1Var;
        this.G = 0L;
        this.Q = new wk((byte) 9);
        e70 e70Var = new e70(new u60(new xl1(fe2.c)));
        this.X = e70Var;
        qe2 qe2Var = new qe2(ke2Var, j8Var, tj0Var == null ? e70Var : tj0Var, ks1Var, z2, this.Q, this, new he2(this, (byte) 0));
        this.Y = qe2Var;
        az azVar = new az();
        azVar.b = qe2Var;
        azVar.a = z;
        this.Z = azVar;
        lm0 lm0Var = new lm0(2, null, 10);
        J0(lm0Var);
        this.a0 = lm0Var;
        x00 x00Var = new x00(ks1Var, qe2Var, z2, un2Var, new he2(this, (byte) 1));
        J0(x00Var);
        this.b0 = x00Var;
        J0(new bn1(azVar, this.Q));
        so soVar = new so();
        soVar.v = x00Var;
        J0(soVar);
    }

    public static void P0(je2 je2Var, z02 z02Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        oc0 oc0Var = je2Var.K;
        if (oc0Var == null) {
            oc0Var = new oc0();
            oc0Var.h = null;
            oc0Var.i = Long.MAX_VALUE;
            oc0Var.j = false;
            je2Var.K = oc0Var;
        }
        oc0Var.h = z02Var;
        oc0Var.i = j;
        wy2 wy2Var = je2Var.O;
        ks1 ks1Var = je2Var.x;
        if (wy2Var == null) {
            je2Var.O = new wy2(ks1Var);
        } else {
            wy2Var.a = ks1Var;
            wy2Var.b = j2;
        }
        oc0Var.j = false;
        je2Var.M = oc0Var;
    }

    @Override // defpackage.qg1
    public final void B0() {
        nh1 nh1Var = this.V;
        if (nh1Var != null) {
            nh1Var.c = cu.Y(this).E;
        }
        zy2 zy2Var = this.W;
        if (zy2Var != null) {
            zy2Var.c = cu.Y(this).E;
        }
        if (this.u) {
            e90 e90Var = cu.Y(this).E;
            e70 e70Var = this.X;
            e70Var.getClass();
            e70Var.a = new u60(new xl1(e90Var));
        }
    }

    @Override // defpackage.nv0
    public final void C() {
        mv0 mv0Var = this.P;
        if (mv0Var != null) {
            mv0Var.a();
            je2 je2Var = mv0Var.h;
            if (je2Var.D) {
                je2Var.Q0(qc0.a);
            }
            mv0Var.n = null;
            p4 p4Var = mv0Var.q;
            p4Var.b = 0;
            ((wi1) p4Var.c).b = 0;
        }
    }

    @Override // defpackage.qg1
    public final void C0() {
        this.D = false;
        M0();
        qr0 qr0Var = this.I;
        if (qr0Var != null) {
            K0(qr0Var);
        }
        qr0 qr0Var2 = this.H;
        if (qr0Var2 != null) {
            K0(qr0Var2);
        }
        this.I = null;
        this.H = null;
    }

    @Override // defpackage.nv0
    public final void G(u8 u8Var, s02 s02Var) {
        Object obj;
        char c;
        Object obj2;
        float f;
        Object obj3;
        fv0 fv0Var;
        float fIntBitsToFloat;
        boolean z;
        long j;
        long jFloatToRawIntBits;
        float fIntBitsToFloat2;
        float fIntBitsToFloat3;
        mv0 mv0Var;
        Object obj4;
        mv0 mv0Var2;
        Object obj5;
        Object obj6;
        hv0 hv0Var;
        int i = u8Var.a;
        ArrayList arrayList = (ArrayList) u8Var.b;
        if (this.z) {
            mv0 mv0Var3 = this.P;
            if (mv0Var3 == null) {
                mv0Var3 = new mv0(this);
                this.P = mv0Var3;
            }
            if (this.I == null) {
                qr0 qr0Var = new qr0(mv0Var3);
                J0(qr0Var);
                this.I = qr0Var;
            }
            mv0 mv0Var4 = this.P;
            if (mv0Var4 != null) {
                je2 je2Var = mv0Var4.h;
                dt dtVar = mv0Var4.m;
                if (dtVar == null) {
                    hv0 hv0Var2 = mv0Var4.i;
                    if (hv0Var2 == null) {
                        obj = dtVar;
                        hv0Var = hv0Var2;
                        hv0 hv0Var3 = new hv0();
                        hv0Var3.i = gv0.j;
                        hv0Var3.j = false;
                        hv0Var3.k = false;
                        mv0Var4.i = hv0Var3;
                        hv0Var = hv0Var3;
                    }
                    obj = dtVar;
                    hv0Var = hv0Var2;
                    mv0Var4.m = hv0Var;
                    obj = hv0Var;
                }
                obj = dtVar;
                boolean z2 = obj instanceof hv0;
                s02 s02Var2 = s02.h;
                s02 s02Var3 = s02.i;
                if (z2) {
                    hv0 hv0Var4 = (hv0) obj;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!lt.f((fv0) arrayList.get(i2))) {
                            return;
                        }
                    }
                    fv0 fv0Var2 = (fv0) dv.x0(arrayList);
                    int i3 = lv0.a[hv0Var4.i.ordinal()];
                    gv0 gv0Var = gv0.i;
                    gv0 gv0Var2 = gv0.h;
                    gv0 gv0Var3 = i3 == 1 ? !je2Var.a1() ? gv0Var2 : gv0Var : hv0Var4.i;
                    hv0Var4.i = gv0Var3;
                    if (s02Var == s02Var2) {
                        if (gv0Var3 == gv0Var) {
                            fv0Var2.i = true;
                            hv0Var4.j = true;
                        }
                        hv0Var4.k = true;
                    }
                    if (s02Var == s02Var3) {
                        if (gv0Var3 == gv0Var2) {
                            mv0.c(mv0Var4, fv0Var2, fv0Var2.a, 0L, 12);
                            return;
                        }
                        if (hv0Var4.j) {
                            mv0Var4.f(fv0Var2, fv0Var2, new ev0(i), 0L);
                            mv0Var4.e(fv0Var2, new ev0(i), 0L);
                            long j2 = fv0Var2.a;
                            kv0 kv0Var = mv0Var4.j;
                            if (kv0Var == null) {
                                kv0Var = new kv0();
                                kv0Var.i = Long.MAX_VALUE;
                                mv0Var4.j = kv0Var;
                            }
                            kv0Var.i = j2;
                            mv0Var4.m = kv0Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = obj instanceof jv0;
                s02 s02Var4 = s02.j;
                if (z3) {
                    jv0 jv0Var = (jv0) obj;
                    if (s02Var != s02Var2) {
                        int size2 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                mv0Var = mv0Var4;
                                obj4 = null;
                                break;
                            }
                            obj4 = arrayList.get(i4);
                            mv0Var = mv0Var4;
                            if (y02.k(((fv0) obj4).a, jv0Var.j)) {
                                break;
                            }
                            i4++;
                            mv0Var4 = mv0Var;
                        }
                        fv0 fv0Var3 = (fv0) obj4;
                        if (fv0Var3 == null) {
                            int size3 = arrayList.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size3) {
                                    obj6 = null;
                                    break;
                                }
                                obj6 = arrayList.get(i5);
                                if (((fv0) obj6).d) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                            fv0Var3 = (fv0) obj6;
                            if (fv0Var3 == null) {
                                mv0Var.a();
                                return;
                            }
                            jv0Var.j = fv0Var3.a;
                        }
                        fv0 fv0Var4 = fv0Var3;
                        if (s02Var != s02Var3) {
                            mv0Var2 = mv0Var;
                        } else if (fv0Var4.i) {
                            mv0Var2 = mv0Var;
                            fv0 fv0Var5 = jv0Var.i;
                            if (fv0Var5 == null) {
                                wg.m("AwaitTouchSlop.initialDown was not initialized");
                                return;
                            }
                            long j3 = jv0Var.j;
                            wy2 wy2Var = mv0Var2.o;
                            if (wy2Var == null) {
                                wg.m("AwaitTouchSlop.touchSlopDetector was not initialized");
                                return;
                            }
                            mv0Var2.b(fv0Var5, j3, wy2Var);
                        } else if (lt.g(fv0Var4)) {
                            int size4 = arrayList.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size4) {
                                    obj5 = null;
                                    break;
                                }
                                Object obj7 = arrayList.get(i6);
                                if (((fv0) obj7).d) {
                                    obj5 = obj7;
                                    break;
                                }
                                i6++;
                            }
                            fv0 fv0Var6 = (fv0) obj5;
                            if (fv0Var6 == null) {
                                mv0Var.a();
                            } else {
                                jv0Var.j = fv0Var6.a;
                            }
                            mv0Var2 = mv0Var;
                        } else {
                            float fD = ((v43) vs.z(je2Var, uz.t)).d();
                            mv0Var2 = mv0Var;
                            wy2 wy2Var2 = mv0Var2.o;
                            if (wy2Var2 == null) {
                                wg.m("Touch slop detector not initialized.");
                                return;
                            }
                            long jA = wy2.a(wy2Var2, lt.Z(fv0Var4, je2Var.x, new ev0(i), true), fD);
                            if ((9223372034707292159L & jA) != 9205357640488583168L) {
                                fv0Var4.i = true;
                                fv0 fv0Var7 = jv0Var.i;
                                fv0Var7.getClass();
                                mv0Var2.f(fv0Var7, fv0Var4, new ev0(i), jA);
                                mv0Var2.e(fv0Var4, new ev0(i), jA);
                                long j4 = fv0Var4.a;
                                kv0 kv0Var2 = mv0Var2.j;
                                if (kv0Var2 == null) {
                                    kv0Var2 = new kv0();
                                    kv0Var2.i = Long.MAX_VALUE;
                                    mv0Var2.j = kv0Var2;
                                }
                                kv0Var2.i = j4;
                                mv0Var2.m = kv0Var2;
                            } else {
                                jv0Var.k = true;
                            }
                        }
                        if (s02Var == s02Var4 && jv0Var.k) {
                            if (!fv0Var4.i) {
                                jv0Var.k = false;
                                return;
                            }
                            fv0 fv0Var8 = jv0Var.i;
                            if (fv0Var8 == null) {
                                wg.m("AwaitTouchSlop.initialDown was not initialized");
                                return;
                            }
                            long j5 = jv0Var.j;
                            wy2 wy2Var3 = mv0Var2.o;
                            if (wy2Var3 != null) {
                                mv0Var2.b(fv0Var8, j5, wy2Var3);
                                return;
                            } else {
                                wg.m("AwaitTouchSlop.touchSlopDetector was not initialized");
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                boolean z4 = obj instanceof iv0;
                char c2 = ' ';
                ks1 ks1Var = ks1.i;
                if (z4) {
                    iv0 iv0Var = (iv0) obj;
                    if (s02Var == s02Var4) {
                        int size5 = arrayList.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size5) {
                                z = true;
                                break;
                            } else {
                                if (((fv0) arrayList.get(i7)).i) {
                                    z = false;
                                    break;
                                }
                                i7++;
                            }
                        }
                        int size6 = arrayList.size();
                        for (int i8 = 0; i8 < size6; i8++) {
                            if (((fv0) arrayList.get(i8)).d) {
                                if (arrayList.isEmpty()) {
                                    break;
                                }
                                if (z) {
                                    fv0 fv0Var9 = (fv0) dv.x0(arrayList);
                                    ks1 ks1Var2 = je2Var.x;
                                    if (ks1Var2 == null) {
                                        jFloatToRawIntBits = fv0Var9.c;
                                        j = 4294967295L;
                                    } else {
                                        j = 4294967295L;
                                        if (i == 1) {
                                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (fv0Var9.c >> 32));
                                        } else if (i == 2) {
                                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (fv0Var9.c & 4294967295L));
                                        } else {
                                            jFloatToRawIntBits = fv0Var9.c;
                                        }
                                        jFloatToRawIntBits = ks1Var2 == ks1Var ? ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32 : ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                                    }
                                    fv0 fv0Var10 = iv0Var.i;
                                    fv0Var10.getClass();
                                    long jFloatToRawIntBits2 = fv0Var10.c;
                                    ks1 ks1Var3 = je2Var.x;
                                    if (ks1Var3 != null) {
                                        if (i == 1) {
                                            fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
                                        } else if (i == 2) {
                                            fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j));
                                        }
                                        jFloatToRawIntBits2 = ks1Var3 == ks1Var ? ((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32 : ((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j;
                                    }
                                    long jD = up1.d(jFloatToRawIntBits, jFloatToRawIntBits2);
                                    fv0 fv0Var11 = iv0Var.i;
                                    if (fv0Var11 != null) {
                                        mv0.c(mv0Var4, fv0Var11, iv0Var.j, jD, 8);
                                        return;
                                    } else {
                                        wg.m("AwaitGesturePickup.initialDown was not initialized.");
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        mv0Var4.a();
                        return;
                    }
                    return;
                }
                if (!(obj instanceof kv0)) {
                    wg.n();
                    return;
                }
                kv0 kv0Var3 = (kv0) obj;
                if (s02Var == s02Var3) {
                    long j6 = kv0Var3.i;
                    int size7 = arrayList.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size7) {
                            c = c2;
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i9);
                        c = c2;
                        if (y02.k(((fv0) obj2).a, j6)) {
                            break;
                        }
                        i9++;
                        c2 = c;
                    }
                    fv0 fv0Var12 = (fv0) obj2;
                    if (fv0Var12 != null) {
                        long j7 = fv0Var12.c;
                        boolean zG = lt.g(fv0Var12);
                        qc0 qc0Var = qc0.a;
                        if (!zG) {
                            if (fv0Var12.i) {
                                je2Var.Q0(qc0Var);
                                return;
                            } else {
                                if (up1.c(lt.Z(fv0Var12, je2Var.x, new ev0(i), true)) != 0.0f) {
                                    mv0Var4.e(fv0Var12, new ev0(i), lt.Z(fv0Var12, je2Var.x, new ev0(i), false));
                                    fv0Var12.i = true;
                                    return;
                                }
                                return;
                            }
                        }
                        int size8 = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size8) {
                                f = 0.0f;
                                obj3 = null;
                                break;
                            } else {
                                obj3 = arrayList.get(i10);
                                f = 0.0f;
                                if (((fv0) obj3).d) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                        fv0 fv0Var13 = (fv0) obj3;
                        if (fv0Var13 != null) {
                            kv0Var3.i = fv0Var13.a;
                            return;
                        }
                        if (fv0Var12.i || !lt.g(fv0Var12)) {
                            je2Var.Q0(qc0Var);
                        } else {
                            xl1 xl1VarD = mv0Var4.d();
                            ks1 ks1Var4 = je2Var.x;
                            p4 p4Var = mv0Var4.p;
                            fj1 fj1Var = (fj1) p4Var.c;
                            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j7 >> c));
                            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                            if (lt.f(fv0Var12)) {
                                p4Var.b = 0;
                                fj1Var.d();
                            }
                            if (lt.g(fv0Var12) || lt.f(fv0Var12)) {
                                fv0Var = fv0Var12;
                            } else {
                                if (fj1Var.b == 3) {
                                    int i11 = p4Var.b;
                                    p4Var.b = i11 + 1;
                                    fj1Var.o(i11, fv0Var12);
                                } else {
                                    fj1Var.a(fv0Var12);
                                }
                                if (p4Var.b == 3) {
                                    p4Var.b = 0;
                                }
                                Object[] objArr = fj1Var.a;
                                int i12 = fj1Var.b;
                                float fIntBitsToFloat6 = f;
                                for (int i13 = 0; i13 < i12; i13++) {
                                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((fv0) objArr[i13]).c >> c));
                                }
                                int i14 = fj1Var.b;
                                fIntBitsToFloat4 = fIntBitsToFloat6 / i14;
                                Object[] objArr2 = fj1Var.a;
                                float fIntBitsToFloat7 = f;
                                int i15 = 0;
                                while (i15 < i14) {
                                    fIntBitsToFloat7 += Float.intBitsToFloat((int) (((fv0) objArr2[i15]).c & 4294967295L));
                                    i15++;
                                    fv0Var12 = fv0Var12;
                                }
                                fv0Var = fv0Var12;
                                fIntBitsToFloat5 = fIntBitsToFloat7 / fj1Var.b;
                            }
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
                            if (ks1Var4 != null) {
                                if (i == 1) {
                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> c));
                                } else if (i == 2) {
                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L));
                                }
                                jFloatToRawIntBits3 = ks1Var4 == ks1Var ? ((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c : ((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L;
                            }
                            ((id1) xl1VarD.i).a(fv0Var.b, jFloatToRawIntBits3);
                            float fA = ((v43) vs.z(je2Var, uz.t)).a();
                            long jI = mv0Var4.d().i(p02.c(fA, fA));
                            id1 id1Var = (id1) mv0Var4.d().i;
                            c43 c43Var = id1Var.a;
                            f40[] f40VarArr = c43Var.d;
                            Arrays.fill(f40VarArr, 0, f40VarArr.length, (Object) null);
                            c43Var.e = 0;
                            c43 c43Var2 = id1Var.b;
                            f40[] f40VarArr2 = c43Var2.d;
                            Arrays.fill(f40VarArr2, 0, f40VarArr2.length, (Object) null);
                            c43Var2.e = 0;
                            id1Var.c = 0L;
                            je2Var.Q0(new tc0(nd0.a(jI), true));
                        }
                        mv0Var4.a();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0269  */
    /* JADX WARN: Code duplicated, block: B:124:0x0273  */
    /* JADX WARN: Code duplicated, block: B:126:0x0277  */
    /* JADX WARN: Code duplicated, block: B:128:0x027d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0282  */
    /* JADX WARN: Code duplicated, block: B:130:0x0287  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e0  */
    @Override // defpackage.c12
    public final void K(q02 q02Var, s02 s02Var, long j) {
        s02 s02Var2;
        s02 s02Var3;
        byte b;
        byte b2;
        s02 s02Var4;
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        z02 z02Var;
        long j2;
        wy2 wy2Var;
        boolean z2;
        Object obj4;
        Object obj5;
        mc0 mc0Var;
        je2 je2Var = this;
        List list = q02Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            s02 s02Var5 = s02.i;
            s02Var2 = s02.h;
            if (i < size) {
                if (((Boolean) je2Var.y.h(new f12(((z02) list.get(i)).i))).booleanValue()) {
                    je2Var.E = true;
                    if (!je2Var.z) {
                        break;
                    }
                    if (je2Var.H == null) {
                        qr0 qr0Var = new qr0(je2Var);
                        je2Var.J0(qr0Var);
                        je2Var.H = qr0Var;
                    }
                    vs vsVar = je2Var.M;
                    Object obj6 = vsVar;
                    if (vsVar == null) {
                        mc0 mc0Var2 = je2Var.F;
                        if (mc0Var2 == null) {
                            mc0Var = mc0Var2;
                            mc0 mc0Var3 = new mc0();
                            mc0Var3.h = lc0.j;
                            mc0Var3.i = false;
                            mc0Var3.j = false;
                            je2Var.F = mc0Var3;
                            mc0Var = mc0Var3;
                        }
                        mc0Var = mc0Var2;
                        je2Var.M = mc0Var;
                        obj6 = mc0Var;
                    }
                    if (!(obj6 instanceof mc0)) {
                        boolean z3 = obj6 instanceof oc0;
                        s02 s02Var6 = s02.j;
                        if (!z3) {
                            s02Var4 = s02Var5;
                            if (!(obj6 instanceof nc0)) {
                                if (!(obj6 instanceof pc0)) {
                                    s02Var3 = s02Var4;
                                    wg.n();
                                    break;
                                }
                                pc0 pc0Var = (pc0) obj6;
                                s02Var3 = s02Var4;
                                if (s02Var != s02Var3) {
                                    break;
                                }
                                long j3 = pc0Var.h;
                                List list2 = q02Var.a;
                                int size2 = list2.size();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= size2) {
                                        obj = null;
                                        break;
                                    }
                                    obj = list2.get(i2);
                                    if (y02.k(((z02) obj).a, j3)) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                                z02 z02Var2 = (z02) obj;
                                if (z02Var2 == null) {
                                    break;
                                }
                                boolean zM = r02.m(z02Var2);
                                qc0 qc0Var = qc0.a;
                                if (!zM) {
                                    if (!z02Var2.c()) {
                                        if (up1.c(r02.B(z02Var2, true)) == 0.0f) {
                                            break;
                                        }
                                        je2Var.Y0(z02Var2, r02.B(z02Var2, false));
                                        z02Var2.a();
                                        break;
                                    }
                                    je2Var.W0().s(qc0Var);
                                    break;
                                }
                                List list3 = q02Var.a;
                                int size3 = list3.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size3) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = list3.get(i3);
                                    if (((z02) obj2).d) {
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                z02 z02Var3 = (z02) obj2;
                                if (z02Var3 != null) {
                                    pc0Var.h = z02Var3.a;
                                    break;
                                }
                                if (z02Var2.c() || !r02.m(z02Var2)) {
                                    je2Var.W0().s(qc0Var);
                                } else {
                                    float fA = ((v43) vs.z(je2Var, uz.t)).a();
                                    r02.d(je2Var.X0(), z02Var2);
                                    long jI = je2Var.X0().i(p02.c(fA, fA));
                                    id1 id1Var = (id1) je2Var.X0().i;
                                    c43 c43Var = id1Var.a;
                                    f40[] f40VarArr = c43Var.d;
                                    Arrays.fill(f40VarArr, 0, f40VarArr.length, (Object) null);
                                    c43Var.e = 0;
                                    c43 c43Var2 = id1Var.b;
                                    f40[] f40VarArr2 = c43Var2.d;
                                    Arrays.fill(f40VarArr2, 0, f40VarArr2.length, (Object) null);
                                    c43Var2.e = 0;
                                    id1Var.c = 0L;
                                    je2Var.W0().s(new tc0(nd0.a(jI), false));
                                    je2Var.E = false;
                                }
                                je2Var.N0();
                                break;
                            }
                            nc0 nc0Var = (nc0) obj6;
                            if (s02Var == s02Var6) {
                                List list4 = q02Var.a;
                                int size4 = list4.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size4) {
                                        z = true;
                                        break;
                                    } else {
                                        if (((z02) list4.get(i4)).c()) {
                                            z = false;
                                            break;
                                        }
                                        i4++;
                                    }
                                }
                                int size5 = list4.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 < size5) {
                                        if (((z02) list4.get(i5)).d) {
                                            if (!list4.isEmpty()) {
                                                if (!z) {
                                                    break;
                                                }
                                                long j4 = ((z02) dv.x0(list4)).c;
                                                z02 z02Var4 = nc0Var.h;
                                                z02Var4.getClass();
                                                long jD = up1.d(j4, z02Var4.c);
                                                z02 z02Var5 = nc0Var.h;
                                                if (z02Var5 != null) {
                                                    P0(je2Var, z02Var5, nc0Var.i, jD, 8);
                                                    break;
                                                } else {
                                                    wg.m("AwaitGesturePickup.initialDown was not initialized.");
                                                    break;
                                                }
                                            }
                                        } else {
                                            i5++;
                                        }
                                    }
                                    je2Var.N0();
                                    break;
                                }
                            }
                        } else {
                            oc0 oc0Var = (oc0) obj6;
                            if (s02Var != s02Var2) {
                                List list5 = q02Var.a;
                                int size6 = list5.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size6) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = list5.get(i6);
                                    if (y02.k(((z02) obj3).a, oc0Var.i)) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                                z02 z02Var6 = (z02) obj3;
                                if (z02Var6 == null) {
                                    int size7 = list5.size();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= size7) {
                                            obj5 = null;
                                            break;
                                        }
                                        obj5 = list5.get(i7);
                                        if (((z02) obj5).d) {
                                            break;
                                        } else {
                                            i7++;
                                        }
                                    }
                                    z02Var6 = (z02) obj5;
                                    if (z02Var6 == null) {
                                        je2Var.N0();
                                    } else {
                                        oc0Var.i = z02Var6.a;
                                    }
                                }
                                if (s02Var != s02Var5) {
                                    s02Var4 = s02Var5;
                                    if (s02Var == s02Var6 && oc0Var.j) {
                                        if (z02Var6.c()) {
                                            z02Var = oc0Var.h;
                                            if (z02Var != null) {
                                                j2 = oc0Var.i;
                                                wy2Var = je2Var.O;
                                                if (wy2Var != null) {
                                                    je2Var.O0(z02Var, j2, wy2Var);
                                                } else {
                                                    wg.m("AwaitTouchSlop.touchSlopDetector was not initialized");
                                                }
                                            } else {
                                                wg.m("AwaitTouchSlop.initialDown was not initialized");
                                            }
                                        } else {
                                            oc0Var.j = false;
                                        }
                                    }
                                } else if (z02Var6.c()) {
                                    s02Var4 = s02Var5;
                                    z02 z02Var7 = oc0Var.h;
                                    if (z02Var7 != null) {
                                        long j5 = oc0Var.i;
                                        wy2 wy2Var2 = je2Var.O;
                                        if (wy2Var2 != null) {
                                            je2Var.O0(z02Var7, j5, wy2Var2);
                                            if (s02Var == s02Var6) {
                                                if (z02Var6.c()) {
                                                    z02Var = oc0Var.h;
                                                    if (z02Var != null) {
                                                        j2 = oc0Var.i;
                                                        wy2Var = je2Var.O;
                                                        if (wy2Var != null) {
                                                            je2Var.O0(z02Var, j2, wy2Var);
                                                        } else {
                                                            wg.m("AwaitTouchSlop.touchSlopDetector was not initialized");
                                                        }
                                                    } else {
                                                        wg.m("AwaitTouchSlop.initialDown was not initialized");
                                                    }
                                                } else {
                                                    oc0Var.j = false;
                                                }
                                            }
                                        } else {
                                            wg.m("AwaitTouchSlop.touchSlopDetector was not initialized");
                                        }
                                    } else {
                                        wg.m("AwaitTouchSlop.initialDown was not initialized");
                                    }
                                } else if (r02.m(z02Var6)) {
                                    int size8 = list5.size();
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 >= size8) {
                                            obj4 = null;
                                            break;
                                        }
                                        obj4 = list5.get(i8);
                                        if (((z02) obj4).d) {
                                            break;
                                        } else {
                                            i8++;
                                        }
                                    }
                                    z02 z02Var8 = (z02) obj4;
                                    if (z02Var8 == null) {
                                        je2Var.N0();
                                    } else {
                                        oc0Var.i = z02Var8.a;
                                    }
                                    s02Var4 = s02Var5;
                                    if (s02Var == s02Var6) {
                                        if (z02Var6.c()) {
                                            z02Var = oc0Var.h;
                                            if (z02Var != null) {
                                                j2 = oc0Var.i;
                                                wy2Var = je2Var.O;
                                                if (wy2Var != null) {
                                                    je2Var.O0(z02Var, j2, wy2Var);
                                                } else {
                                                    wg.m("AwaitTouchSlop.touchSlopDetector was not initialized");
                                                }
                                            } else {
                                                wg.m("AwaitTouchSlop.initialDown was not initialized");
                                            }
                                        } else {
                                            oc0Var.j = false;
                                        }
                                    }
                                } else {
                                    float fW = ys.W((v43) vs.z(je2Var, uz.t), z02Var6.i);
                                    wy2 wy2Var3 = je2Var.O;
                                    if (wy2Var3 != null) {
                                        long jA = wy2.a(wy2Var3, r02.B(z02Var6, true), fW);
                                        if ((9223372034707292159L & jA) != 9205357640488583168L) {
                                            s02Var4 = s02Var5;
                                            long jE = up1.e(je2Var.G, r02.B(z02Var6, false));
                                            je2Var.G = jE;
                                            float fAtan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (je2Var.G & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jE >> 32))))) * 57.29578f;
                                            ks1 ks1Var = je2Var.x;
                                            if (ks1Var != null) {
                                                int i9 = nd0.a;
                                                if (ks1Var != ks1.i ? fAtan2 <= 30.0f || fAtan2 > 90.0f : fAtan2 > 30.0f) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                            } else {
                                                z2 = true;
                                            }
                                            t72 t72Var = new t72();
                                            cd0 cd0Var = new cd0(fAtan2, t72Var);
                                            int i10 = nd0.a;
                                            y02.A(je2Var, qr0.w, new rr0(new p((Object) cd0Var, (byte) 19), (byte) 0));
                                            if (z2 || !t72Var.h) {
                                                z02Var6.a();
                                                z02 z02Var9 = oc0Var.h;
                                                z02Var9.getClass();
                                                je2Var.Z0(z02Var9, z02Var6, jA);
                                                je2Var.Y0(z02Var6, jA);
                                                long j6 = z02Var6.a;
                                                pc0 pc0Var2 = je2Var.J;
                                                if (pc0Var2 == null) {
                                                    pc0Var2 = new pc0();
                                                    pc0Var2.h = Long.MAX_VALUE;
                                                    je2Var.J = pc0Var2;
                                                }
                                                pc0Var2.h = j6;
                                                je2Var.M = pc0Var2;
                                            } else {
                                                oc0Var.j = true;
                                            }
                                        } else {
                                            s02Var4 = s02Var5;
                                            oc0Var.j = true;
                                            je2Var.G = up1.e(je2Var.G, r02.B(z02Var6, true));
                                        }
                                        if (s02Var == s02Var6) {
                                            if (z02Var6.c()) {
                                                z02Var = oc0Var.h;
                                                if (z02Var != null) {
                                                    j2 = oc0Var.i;
                                                    wy2Var = je2Var.O;
                                                    if (wy2Var != null) {
                                                        je2Var.O0(z02Var, j2, wy2Var);
                                                    } else {
                                                        wg.m("AwaitTouchSlop.touchSlopDetector was not initialized");
                                                    }
                                                } else {
                                                    wg.m("AwaitTouchSlop.initialDown was not initialized");
                                                }
                                            } else {
                                                oc0Var.j = false;
                                            }
                                        }
                                    } else {
                                        s02Var4 = s02Var5;
                                        wg.m("Touch slop detector not initialized.");
                                    }
                                }
                            }
                        }
                        s02Var3 = s02Var4;
                        break;
                    }
                    mc0 mc0Var4 = (mc0) obj6;
                    if (!q02Var.a.isEmpty() && ns2.d(q02Var, false)) {
                        z02 z02Var10 = (z02) dv.x0(q02Var.a);
                        int i11 = dd0.a[mc0Var4.h.ordinal()];
                        lc0 lc0Var = lc0.i;
                        lc0 lc0Var2 = lc0.h;
                        lc0 lc0Var3 = i11 == 1 ? !je2Var.a1() ? lc0Var2 : lc0Var : mc0Var4.h;
                        mc0Var4.h = lc0Var3;
                        if (s02Var == s02Var2) {
                            if (lc0Var3 == lc0Var) {
                                z02Var10.a();
                                mc0Var4.i = true;
                            }
                            mc0Var4.j = true;
                        }
                        if (s02Var == s02Var5) {
                            if (lc0Var3 == lc0Var2) {
                                P0(je2Var, z02Var10, z02Var10.a, 0L, 12);
                            } else if (mc0Var4.i) {
                                je2Var.Z0(z02Var10, z02Var10, 0L);
                                je2Var.Y0(z02Var10, 0L);
                                long j7 = z02Var10.a;
                                pc0 pc0Var3 = je2Var.J;
                                if (pc0Var3 == null) {
                                    pc0Var3 = new pc0();
                                    pc0Var3.h = Long.MAX_VALUE;
                                    je2Var.J = pc0Var3;
                                }
                                pc0Var3.h = j7;
                                je2Var.M = pc0Var3;
                            }
                        }
                    }
                } else {
                    i++;
                }
            }
            s02Var3 = s02Var5;
            break;
        }
        if (je2Var.z) {
            if (je2Var.H == null) {
                qr0 qr0Var2 = new qr0(je2Var);
                je2Var.J0(qr0Var2);
                je2Var.H = qr0Var2;
            }
            byte b3 = 3;
            byte b4 = 6;
            if (s02Var == s02Var2 && q02Var.f == 6) {
                if (!je2Var.T) {
                    je2Var = this;
                    je2Var.V = new nh1(je2Var.Y, new g2((Object) ViewConfiguration.get(ou.F(je2Var).getContext()), (byte) 2), new mx(2, this, je2.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4, (byte) 1), cu.Y(je2Var).E);
                    je2Var.T = true;
                }
                nh1 nh1Var = je2Var.V;
                if (nh1Var != null) {
                    x20 x20VarX0 = je2Var.x0();
                    if (nh1Var.h == null) {
                        nh1Var.h = ie1.p(x20VarX0, null, new y8(nh1Var, null, b3), 3);
                    }
                }
            }
            nh1 nh1Var2 = je2Var.V;
            if (nh1Var2 != null && q02Var.f == 6) {
                List list6 = q02Var.a;
                int size9 = list6.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size9) {
                        if (s02Var == s02Var2 && nh1Var2.d) {
                            nh1Var2.f(q02Var);
                            ho1.a(q02Var);
                        }
                        if (s02Var != s02Var3 || nh1Var2.d || !nh1Var2.f(q02Var)) {
                            break;
                            break;
                            break;
                        } else {
                            ho1.a(q02Var);
                            break;
                        }
                    }
                    if (((z02) list6.get(i12)).c()) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            if (s02Var == s02Var2 && ((b2 = q02Var.f) == 10 || b2 == 11 || b2 == 12)) {
                if (je2Var.U) {
                    b = 10;
                } else {
                    b = 10;
                    je2Var = this;
                    je2Var.W = new zy2(je2Var.Y, new mx(2, this, je2.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, (byte) 2), cu.Y(je2Var).E);
                    je2Var.U = true;
                }
                zy2 zy2Var = je2Var.W;
                if (zy2Var != null) {
                    x20 x20VarX1 = je2Var.x0();
                    if (zy2Var.g == null) {
                        zy2Var.g = ie1.p(x20VarX1, null, new hd0(zy2Var, (m10) null, b4), 3);
                    }
                }
            } else {
                b = 10;
            }
            zy2 zy2Var2 = je2Var.W;
            if (zy2Var2 != null) {
                byte b5 = q02Var.f;
                if (b5 == b || b5 == 11 || b5 == 12) {
                    List list7 = q02Var.a;
                    int size10 = list7.size();
                    for (int i13 = 0; i13 < size10; i13++) {
                        if (((z02) list7.get(i13)).c()) {
                            return;
                        }
                    }
                    if (s02Var == s02Var2 && zy2Var2.d) {
                        zy2Var2.d(q02Var);
                        ho1.a(q02Var);
                    }
                    if (s02Var == s02Var3 && !zy2Var2.d && zy2Var2.d(q02Var)) {
                        ho1.a(q02Var);
                    }
                }
            }
        }
    }

    public final void M0() {
        jd0 jd0Var = this.C;
        if (jd0Var != null) {
            ui1 ui1Var = this.A;
            if (ui1Var != null) {
                ui1Var.c(new id0(jd0Var));
            }
            this.C = null;
        }
    }

    public final void N0() {
        this.G = 0L;
        mc0 mc0Var = this.F;
        lc0 lc0Var = lc0.j;
        if (mc0Var == null) {
            mc0Var = new mc0();
            mc0Var.h = lc0Var;
            mc0Var.i = false;
            mc0Var.j = false;
            this.F = mc0Var;
        }
        mc0Var.h = lc0Var;
        mc0Var.i = false;
        mc0Var.j = false;
        this.M = mc0Var;
    }

    public final void O0(z02 z02Var, long j, wy2 wy2Var) {
        nc0 nc0Var = this.L;
        if (nc0Var == null) {
            nc0Var = new nc0();
            nc0Var.h = null;
            nc0Var.i = Long.MAX_VALUE;
            this.L = nc0Var;
        }
        nc0Var.h = z02Var;
        nc0Var.i = j;
        wy2Var.b = 0L;
        this.M = nc0Var;
    }

    public final void Q0(uc0 uc0Var) {
        if ((uc0Var instanceof sc0) && !this.D) {
            this.D = true;
            b1();
        }
        W0().s(uc0Var);
    }

    public final void S0(tc0 tc0Var) {
        if (this.u) {
            ie1.p(this.Q.u(), null, new ha2(tc0Var, this, null, (byte) 1), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T0(n10 n10Var) throws Throwable {
        ed0 ed0Var;
        if (n10Var instanceof ed0) {
            ed0Var = (ed0) n10Var;
            int i = ed0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ed0Var.m = i - Integer.MIN_VALUE;
            } else {
                ed0Var = new ed0(this, n10Var);
            }
        } else {
            ed0Var = new ed0(this, n10Var);
        }
        Object obj = ed0Var.k;
        int i2 = ed0Var.m;
        if (i2 == 0) {
            m02.y(obj);
            jd0 jd0Var = this.C;
            if (jd0Var != null) {
                ui1 ui1Var = this.A;
                if (ui1Var != null) {
                    id0 id0Var = new id0(jd0Var);
                    ed0Var.m = 1;
                    Object objB = ui1Var.b(id0Var, ed0Var);
                    y20 y20Var = y20.h;
                    if (objB == y20Var) {
                        return y20Var;
                    }
                }
            }
            S0(new tc0(0L, false));
            return j23.a;
        }
        if (i2 != 1) {
            li1.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m02.y(obj);
        this.C = null;
        S0(new tc0(0L, false));
        return j23.a;
    }

    @Override // defpackage.z21
    public final boolean U(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.z || ((!t21.a(ys.F(keyEvent), t21.D) && !t21.a(lt.a(keyEvent.getKeyCode()), t21.C)) || ys.G(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.Y.d == ks1.h;
        x00 x00Var = this.b0;
        if (z) {
            int iK0 = (int) (x00Var.K0() & 4294967295L);
            jFloatToRawIntBits = ((long) Float.floatToRawIntBits(t21.a(lt.a(keyEvent.getKeyCode()), t21.C) ? iK0 : -iK0)) & 4294967295L;
        } else {
            int iK1 = (int) (x00Var.K0() >> 32);
            jFloatToRawIntBits = ((long) Float.floatToRawIntBits(t21.a(lt.a(keyEvent.getKeyCode()), t21.C) ? iK1 : -iK1)) << 32;
        }
        ie1.p(x0(), null, new r0(this, jFloatToRawIntBits, null, (byte) 1), 3);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U0(sc0 sc0Var, n10 n10Var) {
        fd0 fd0Var;
        ui1 ui1Var;
        jd0 jd0Var;
        sc0 sc0Var2;
        jd0 jd0Var2;
        if (n10Var instanceof fd0) {
            fd0Var = (fd0) n10Var;
            int i = fd0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                fd0Var.o = i - Integer.MIN_VALUE;
            } else {
                fd0Var = new fd0(this, n10Var);
            }
        } else {
            fd0Var = new fd0(this, n10Var);
        }
        Object obj = fd0Var.m;
        int i2 = fd0Var.o;
        y20 y20Var = y20.h;
        if (i2 == 0) {
            m02.y(obj);
            jd0 jd0Var3 = this.C;
            if (jd0Var3 != null && (ui1Var = this.A) != null) {
                id0 id0Var = new id0(jd0Var3);
                fd0Var.k = sc0Var;
                fd0Var.o = 1;
                if (ui1Var.b(id0Var, fd0Var) != y20Var) {
                }
                return y20Var;
            }
            this.C = jd0Var;
            long j = sc0Var.a;
            return j23.a;
        }
        if (i2 == 1) {
            sc0Var = fd0Var.k;
            m02.y(obj);
        } else {
            if (i2 != 2) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jd0Var2 = fd0Var.l;
            sc0Var2 = fd0Var.k;
            m02.y(obj);
        }
        jd0Var = jd0Var2;
        sc0Var = sc0Var2;
        this.C = jd0Var;
        long j2 = sc0Var.a;
        return j23.a;
        jd0Var = new jd0();
        ui1 ui1Var2 = this.A;
        if (ui1Var2 != null) {
            fd0Var.k = sc0Var;
            fd0Var.l = jd0Var;
            fd0Var.o = 2;
            if (ui1Var2.b(jd0Var, fd0Var) != y20Var) {
                sc0Var2 = sc0Var;
                jd0Var2 = jd0Var;
                jd0Var = jd0Var2;
                sc0Var = sc0Var2;
            }
            return y20Var;
        }
        this.C = jd0Var;
        long j3 = sc0Var.a;
        return j23.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object V0(tc0 tc0Var, n10 n10Var) throws Throwable {
        gd0 gd0Var;
        if (n10Var instanceof gd0) {
            gd0Var = (gd0) n10Var;
            int i = gd0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                gd0Var.n = i - Integer.MIN_VALUE;
            } else {
                gd0Var = new gd0(this, n10Var);
            }
        } else {
            gd0Var = new gd0(this, n10Var);
        }
        Object obj = gd0Var.l;
        int i2 = gd0Var.n;
        if (i2 == 0) {
            m02.y(obj);
            jd0 jd0Var = this.C;
            if (jd0Var != null) {
                ui1 ui1Var = this.A;
                if (ui1Var != null) {
                    kd0 kd0Var = new kd0(jd0Var);
                    gd0Var.k = tc0Var;
                    gd0Var.n = 1;
                    Object objB = ui1Var.b(kd0Var, gd0Var);
                    y20 y20Var = y20.h;
                    if (objB == y20Var) {
                        return y20Var;
                    }
                }
            }
            S0(tc0Var);
            return j23.a;
        }
        if (i2 != 1) {
            li1.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tc0Var = gd0Var.k;
        m02.y(obj);
        this.C = null;
        S0(tc0Var);
        return j23.a;
    }

    public final ds W0() {
        fp fpVar = this.B;
        if (fpVar != null) {
            return fpVar;
        }
        wg.m("Events channel not initialized.");
        return null;
    }

    public final xl1 X0() {
        xl1 xl1Var = this.N;
        if (xl1Var != null) {
            return xl1Var;
        }
        wg.m("Velocity Tracker not initialized.");
        return null;
    }

    public final void Y0(z02 z02Var, long j) {
        this.G = up1.e(this.G, j);
        r02.d(X0(), z02Var);
        W0().s(new rc0(j, false));
    }

    public final void Z0(z02 z02Var, z02 z02Var2, long j) {
        if (this.N == null) {
            this.N = new xl1((byte) 23);
        }
        r02.d(X0(), z02Var);
        long jD = up1.d(z02Var2.c, j);
        if (((Boolean) this.y.h(new f12(z02Var.i))).booleanValue()) {
            if (!this.D) {
                if (this.B == null) {
                    this.B = ls.a(Integer.MAX_VALUE, 6, null);
                }
                b1();
            }
            W0().s(new sc0(jD));
        }
    }

    @Override // defpackage.j80
    public final void a() {
        j0();
        nh1 nh1Var = this.V;
        if (nh1Var != null) {
            nh1Var.c = cu.Y(this).E;
        }
        zy2 zy2Var = this.W;
        if (zy2Var != null) {
            zy2Var.c = cu.Y(this).E;
        }
        j0();
        if (this.u) {
            e90 e90Var = cu.Y(this).E;
            e70 e70Var = this.X;
            e70Var.getClass();
            e70Var.a = new u60(new xl1(e90Var));
        }
    }

    public final boolean a1() {
        qe2 qe2Var = this.Y;
        if (qe2Var.a.b()) {
            return true;
        }
        j8 j8Var = qe2Var.b;
        return j8Var != null ? j8Var.e() : false;
    }

    public final void b1() {
        this.D = true;
        m10 m10Var = null;
        if (this.B == null) {
            this.B = ls.a(Integer.MAX_VALUE, 6, null);
        }
        ie1.p(x0(), null, new hd0((Object) this, m10Var, (byte) 0), 3);
    }

    public final void c1(j8 j8Var, tj0 tj0Var, ui1 ui1Var, ks1 ks1Var, ke2 ke2Var, un2 un2Var, boolean z, boolean z2) {
        boolean z3;
        if (this.z != z) {
            this.Z.a = z;
            this.R = null;
            this.S = null;
            y02.p(this);
        }
        if (tj0Var == null) {
            tj0Var = this.X;
        }
        qe2 qe2Var = this.Y;
        boolean z4 = true;
        if (uz0.g(qe2Var.a, ke2Var)) {
            z3 = false;
        } else {
            qe2Var.a = ke2Var;
            z3 = true;
        }
        qe2Var.b = j8Var;
        ks1 ks1Var2 = qe2Var.d;
        if (ks1Var2 != ks1Var) {
            qe2Var.d = ks1Var;
            ks1Var2 = ks1Var;
            z3 = true;
        }
        if (qe2Var.e != z2) {
            qe2Var.e = z2;
            z3 = true;
        }
        qe2Var.c = tj0Var;
        qe2Var.f = this.Q;
        x00 x00Var = this.b0;
        x00Var.v = ks1Var;
        x00Var.x = z2;
        x00Var.y = un2Var;
        s0 s0Var = s60.a;
        ks1 ks1Var3 = ks1.h;
        if (ks1Var2 != ks1Var3) {
            ks1Var3 = ks1.i;
        }
        this.y = s0Var;
        if (this.z != z) {
            this.z = z;
            if (!z) {
                qr0 qr0Var = this.I;
                if (qr0Var != null) {
                    K0(qr0Var);
                }
                qr0 qr0Var2 = this.H;
                if (qr0Var2 != null) {
                    K0(qr0Var2);
                }
                this.I = null;
                this.H = null;
                M0();
                this.P = null;
            }
            z3 = true;
        }
        if (!uz0.g(this.A, ui1Var)) {
            M0();
            this.A = ui1Var;
        }
        if (this.x != ks1Var3) {
            this.x = ks1Var3;
        } else {
            z4 = z3;
        }
        if (z4) {
            boolean z5 = this.E;
            qc0 qc0Var = qc0.a;
            if (z5) {
                N0();
                if (this.D) {
                    W0().s(qc0Var);
                }
                this.N = null;
            }
            mv0 mv0Var = this.P;
            if (mv0Var != null) {
                mv0Var.a();
                je2 je2Var = mv0Var.h;
                if (je2Var.D) {
                    je2Var.Q0(qc0Var);
                }
                mv0Var.n = null;
                p4 p4Var = mv0Var.q;
                p4Var.b = 0;
                ((wi1) p4Var.c).b = 0;
            }
        }
    }

    @Override // defpackage.ug2
    public final void h0(dh2 dh2Var) {
        if (this.z && (this.R == null || this.S == null)) {
            this.R = new s((Object) this, (byte) 1);
            this.S = new r0(this, null);
        }
        s sVar = this.R;
        if (sVar != null) {
            q21[] q21VarArr = bh2.a;
            dh2Var.a(qg2.d, new m1(null, sVar));
        }
        r0 r0Var = this.S;
        if (r0Var != null) {
            q21[] q21VarArr2 = bh2.a;
            dh2Var.a(qg2.e, r0Var);
        }
    }

    @Override // defpackage.c12
    public final void j0() {
        if (this.E) {
            N0();
            if (this.D) {
                W0().s(qc0.a);
            }
            this.N = null;
        }
        this.E = false;
    }

    @Override // defpackage.ld0
    public final ks1 l() {
        return this.x;
    }

    @Override // defpackage.z21
    public final boolean m(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.pr0
    public final String q0() {
        if (!this.z) {
            return "idle";
        }
        vs vsVar = this.M;
        if (vsVar instanceof mc0) {
            return ((mc0) vsVar).j ? "waiting" : "idle";
        }
        if ((vsVar instanceof oc0) || (vsVar instanceof nc0)) {
            return "waiting";
        }
        return vsVar instanceof pc0 ? "recognized" : "idle";
    }

    @Override // defpackage.qg1
    public final boolean y0() {
        return false;
    }

    public final void R0(long j) {
    }
}
