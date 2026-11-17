package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class lu extends k80 implements c12, z21, ug2, pz, rp1, nv0, pr0 {
    public String A;
    public ba2 B;
    public boolean C;
    public kp0 D;
    public final pm0 E;
    public dv0 F;
    public qr0 G;
    public String H = "idle";
    public j80 I;
    public m22 J;
    public ut0 K;
    public final xi1 L;
    public long M;
    public m22 N;
    public ui1 O;
    public boolean P;
    public dn2 Q;
    public z02 R;
    public fv0 S;
    public ui1 x;
    public dv0 y;
    public boolean z;

    public lu(ui1 ui1Var, aa2 aa2Var, boolean z, boolean z2, String str, ba2 ba2Var, kp0 kp0Var) {
        this.x = ui1Var;
        this.y = aa2Var;
        this.z = z;
        this.A = str;
        this.B = ba2Var;
        this.C = z2;
        this.D = kp0Var;
        this.E = new pm0(ui1Var, 0, new i(1, this, lu.class, "onFocusChange", "onFocusChange(Z)V", 0, (byte) 0));
        int i = jc1.a;
        this.L = new xi1(6);
        this.M = 0L;
        ui1 ui1Var2 = this.x;
        this.O = ui1Var2;
        this.P = ui1Var2 == null;
    }

    @Override // defpackage.qg1
    public final void B0() {
        M();
        if (!this.P) {
            R0();
        }
        if (this.C) {
            J0(this.E);
        }
    }

    @Override // defpackage.nv0
    public final void C() {
        N0(true);
    }

    @Override // defpackage.qg1
    public final void C0() {
        P0();
        if (this.O == null) {
            this.x = null;
        }
        j80 j80Var = this.I;
        if (j80Var != null) {
            K0(j80Var);
        }
        this.I = null;
        qr0 qr0Var = this.G;
        if (qr0Var != null) {
            K0(qr0Var);
        }
        this.G = null;
    }

    @Override // defpackage.nv0
    public final void G(u8 u8Var, s02 s02Var) {
        ArrayList arrayList = (ArrayList) u8Var.b;
        R0();
        if (this.C && this.G == null) {
            qr0 qr0Var = new qr0(this);
            J0(qr0Var);
            this.G = qr0Var;
        }
        if (s02Var != s02.i) {
            if (s02Var == s02.j) {
                if (this.S != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        fv0 fv0Var = (fv0) arrayList.get(i);
                        if (fv0Var.i && fv0Var != this.S) {
                            N0(true);
                            break;
                        }
                    }
                }
                if (uz0.g(this.H, "recognized")) {
                    this.H = "idle";
                    return;
                }
                return;
            }
            return;
        }
        m10 m10Var = null;
        if (this.S == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (lt.f((fv0) arrayList.get(i2))) {
                    fv0 fv0Var2 = (fv0) arrayList.get(0);
                    fv0Var2.i = true;
                    this.S = fv0Var2;
                    if (this.C) {
                        this.H = "waiting";
                        ui1 ui1Var = this.x;
                        if (ui1Var != null) {
                            m22 m22Var = new m22(fv0Var2.c);
                            if (O0()) {
                                this.Q = ie1.p(x0(), null, new m(ui1Var, m22Var, this, m10Var, (byte) 0), 3);
                                return;
                            } else {
                                this.N = m22Var;
                                ie1.p(x0(), null, new l(ui1Var, m22Var, null, (byte) 1), 3);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            fv0 fv0Var3 = (fv0) arrayList.get(i3);
            if (fv0Var3.i || !fv0Var3.h || fv0Var3.d) {
                float fD = ((v43) vs.z(this, uz.t)).d();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    fv0 fv0Var4 = (fv0) arrayList.get(i4);
                    long j = fv0Var4.c;
                    fv0 fv0Var5 = this.S;
                    fv0Var5.getClass();
                    boolean z = Math.abs(up1.c(up1.d(j, fv0Var5.c))) > fD;
                    if (fv0Var4.i || z) {
                        N0(true);
                        return;
                    }
                }
                return;
            }
        }
        ((fv0) arrayList.get(0)).i = true;
        if (this.C) {
            this.H = "recognized";
            fv0 fv0Var6 = this.S;
            fv0Var6.getClass();
            Q0(fv0Var6.c, true);
            S0();
        }
        this.S = null;
    }

    @Override // defpackage.c12
    public final void K(q02 q02Var, s02 s02Var, long j) {
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.M = (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L);
        R0();
        boolean z = this.C;
        s02 s02Var2 = s02.i;
        byte b = 1;
        byte b2 = 0;
        m10 m10Var = null;
        if (z) {
            if (this.G == null) {
                qr0 qr0Var = new qr0(this);
                J0(qr0Var);
                this.G = qr0Var;
            }
            if (s02Var == s02Var2) {
                byte b3 = q02Var.f;
                if (b3 == 4) {
                    ie1.p(x0(), null, new o(this, m10Var, b2), 3);
                } else if (b3 == 5) {
                    ie1.p(x0(), null, new o(this, m10Var, b), 3);
                }
            }
        }
        if (s02Var != s02Var2) {
            if (s02Var == s02.j) {
                if (this.R != null) {
                    List list = q02Var.a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        z02 z02Var = (z02) list.get(i);
                        if (z02Var.c() && z02Var != this.R) {
                            N0(false);
                            break;
                        }
                    }
                }
                if (uz0.g(this.H, "recognized")) {
                    this.H = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.R == null) {
            if (ns2.d(q02Var, true)) {
                z02 z02Var2 = (z02) q02Var.a.get(0);
                z02Var2.a();
                this.R = z02Var2;
                if (this.C) {
                    this.H = "waiting";
                    ui1 ui1Var = this.x;
                    if (ui1Var != null) {
                        m22 m22Var = new m22(z02Var2.c);
                        if (O0()) {
                            this.Q = ie1.p(x0(), null, new m(ui1Var, m22Var, this, m10Var, (byte) 1), 3);
                            return;
                        } else {
                            this.J = m22Var;
                            ie1.p(x0(), null, new l(ui1Var, m22Var, null, (byte) 2), 3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        List list2 = q02Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!r02.l((z02) list2.get(i2))) {
                long jC0 = cu.Y(this).E.c0(((v43) vs.z(this, uz.t)).g());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jC0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jC0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    z02 z02Var3 = (z02) list2.get(i3);
                    if (z02Var3.c() || r02.w(z02Var3, j, jFloatToRawIntBits)) {
                        N0(false);
                        return;
                    }
                }
                return;
            }
        }
        ((z02) list2.get(0)).a();
        if (this.C) {
            this.H = "recognized";
            z02 z02Var4 = this.R;
            z02Var4.getClass();
            Q0(z02Var4.c, false);
            S0();
        }
        this.R = null;
    }

    @Override // defpackage.rp1
    public final void M() {
        if (this.z) {
            ou.D(this, new f(this, (byte) 0));
        }
    }

    public final void N0(boolean z) {
        m10 m10Var = null;
        if (z) {
            this.S = null;
        } else {
            this.R = null;
        }
        ui1 ui1Var = this.x;
        if (ui1Var != null) {
            dn2 dn2Var = this.Q;
            if (dn2Var == null || !dn2Var.b()) {
                m22 m22Var = z ? this.N : this.J;
                if (m22Var != null) {
                    l22 l22Var = new l22(m22Var);
                    s01 s01Var = (s01) ((k10) x0()).h.m(c5.Z);
                    ie1.p(x0(), null, new j(ui1Var, l22Var, s01Var != null ? s01Var.r(new g(ui1Var, l22Var, (byte) 0)) : null, m10Var, (byte) 0), 3);
                }
            } else {
                dn2 dn2Var2 = this.Q;
                if (dn2Var2 != null) {
                    dn2Var2.a(null);
                }
            }
            if (z) {
                this.N = null;
            } else {
                this.J = null;
            }
        }
        this.H = "idle";
    }

    public final boolean O0() {
        x72 x72Var = new x72();
        y02.A(this, qr0.w, new rr0(new f6(x72Var, (byte) 1), (byte) 0));
        if (x72Var.h == null) {
            int i = mu.b;
            ViewParent parent = ou.F(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    public final void P0() {
        ui1 ui1Var = this.x;
        xi1 xi1Var = this.L;
        if (ui1Var != null) {
            m22 m22Var = this.J;
            if (m22Var != null) {
                ui1Var.c(new l22(m22Var));
            }
            m22 m22Var2 = this.N;
            if (m22Var2 != null) {
                ui1Var.c(new l22(m22Var2));
            }
            ut0 ut0Var = this.K;
            if (ut0Var != null) {
                ui1Var.c(new vt0(ut0Var));
            }
            Object[] objArr = xi1Var.c;
            long[] jArr = xi1Var.a;
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
                                ui1Var.c(new l22((m22) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.J = null;
        this.N = null;
        this.K = null;
        xi1Var.a();
    }

    public final void Q0(long j, boolean z) {
        ui1 ui1Var = this.x;
        if (ui1Var != null) {
            dn2 dn2Var = this.Q;
            if (dn2Var == null || !dn2Var.b()) {
                m22 m22Var = z ? this.N : this.J;
                if (m22Var != null) {
                    ie1.p(x0(), null, new l(m22Var, ui1Var, null), 3);
                }
            } else {
                dn2Var.a(null);
                ie1.p(x0(), null, new k((Object) dn2Var, j, ui1Var, (m10) null, (byte) 0), 3);
            }
            if (z) {
                this.N = null;
            } else {
                this.J = null;
            }
        }
    }

    public final void R0() {
        if (this.I == null) {
            dv0 dv0Var = this.z ? this.F : this.y;
            if (dv0Var != null) {
                ui1 ui1Var = this.x;
                if (ui1Var == null) {
                    ui1Var = new ui1();
                    this.x = ui1Var;
                }
                this.E.O0(ui1Var);
                ui1 ui1Var2 = this.x;
                ui1Var2.getClass();
                j80 j80VarA = dv0Var.a(ui1Var2);
                J0(j80VarA);
                this.I = j80VarA;
            }
        }
    }

    public final void S0() {
        wl2 wl2Var = (wl2) vs.z(this, uz.v);
        if (wl2Var != null) {
            wl2Var.a();
        }
        this.D.a();
    }

    public final void T0(ui1 ui1Var, dv0 dv0Var, boolean z, boolean z2, String str, ba2 ba2Var, kp0 kp0Var) {
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (uz0.g(this.O, ui1Var)) {
            z3 = false;
        } else {
            P0();
            this.O = ui1Var;
            this.x = ui1Var;
            z3 = true;
        }
        if (!uz0.g(this.y, dv0Var)) {
            this.y = dv0Var;
            z3 = true;
        }
        if (this.z != z) {
            this.z = z;
            if (z) {
                M();
            }
            z3 = true;
        }
        boolean z6 = this.C;
        pm0 pm0Var = this.E;
        if (z6 != z2) {
            if (z2) {
                J0(pm0Var);
            } else {
                K0(pm0Var);
                P0();
            }
            y02.p(this);
            if (!z2) {
                j80 j80Var = this.G;
                if (j80Var != null) {
                    K0(j80Var);
                }
                this.G = null;
                this.H = "idle";
            }
            this.C = z2;
        }
        if (!uz0.g(this.A, str)) {
            this.A = str;
            y02.p(this);
        }
        if (!uz0.g(this.B, ba2Var)) {
            this.B = ba2Var;
            y02.p(this);
        }
        this.D = kp0Var;
        boolean z7 = this.P;
        ui1 ui1Var2 = this.O;
        if (z7 == (ui1Var2 == null)) {
            z5 = z3;
            z4 = z7;
        } else {
            z4 = ui1Var2 == null;
            this.P = z4;
            if (z4 || this.I != null) {
                z7 = z4;
                z5 = z3;
                z4 = z7;
            }
        }
        if (z5) {
            j80 j80Var2 = this.I;
            if (j80Var2 != null) {
                K0(j80Var2);
            } else if (!z4) {
            }
            this.I = null;
            R0();
        }
        pm0Var.O0(this.x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.z21
    public final boolean U(KeyEvent keyEvent) {
        boolean z;
        int iNumberOfTrailingZeros;
        Object obj;
        R0();
        long jF = ys.F(keyEvent);
        boolean z2 = this.C;
        xi1 xi1Var = this.L;
        int i = 1;
        if (z2 && ys.G(keyEvent) == 2 && h7.o0(keyEvent)) {
            if (!xi1Var.b(jF)) {
                m22 m22Var = new m22(this.M);
                xi1Var.f(jF, m22Var);
                if (this.x == null) {
                    return true;
                }
                ie1.p(x0(), null, new n(this, m22Var, null, (byte) 2), 3);
                return true;
            }
        } else if (this.C && ys.G(keyEvent) == 1 && h7.o0(keyEvent)) {
            int iHashCode = Long.hashCode(jF) * (-862048943);
            int i2 = iHashCode ^ (iHashCode << 16);
            int i3 = i2 & 127;
            int i4 = xi1Var.d;
            int i5 = (i2 >>> 7) & i4;
            int i6 = 0;
            loop0: while (true) {
                long[] jArr = xi1Var.a;
                int i7 = i5 >> 3;
                int i8 = (i5 & 7) << 3;
                z = i;
                long j = (jArr[i7] >>> i8) | ((jArr[i7 + i] << (64 - i8)) & ((-i8) >> 63));
                long j2 = (((long) i3) * 72340172838076673L) ^ j;
                long j3 = (j2 - 72340172838076673L) & (~j2);
                long j4 = -9187201950435737472L;
                long j5 = j3 & (-9187201950435737472L);
                while (j5 != 0) {
                    iNumberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j5) >> 3)) & i4;
                    long j6 = j4;
                    if (xi1Var.b[iNumberOfTrailingZeros] == jF) {
                        break loop0;
                    }
                    j5 &= j5 - 1;
                    j4 = j6;
                }
                if ((j & ((~j) << 6) & j4) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i6 += 8;
                i5 = (i5 + i6) & i4;
                i = z ? 1 : 0;
            }
            if (iNumberOfTrailingZeros >= 0) {
                xi1Var.e--;
                long[] jArr2 = xi1Var.a;
                int i9 = xi1Var.d;
                int i10 = iNumberOfTrailingZeros >> 3;
                int i11 = (iNumberOfTrailingZeros & 7) << 3;
                long j7 = (jArr2[i10] & (~(255 << i11))) | (254 << i11);
                jArr2[i10] = j7;
                jArr2[(((iNumberOfTrailingZeros - 7) & i9) + (i9 & 7)) >> 3] = j7;
                Object[] objArr = xi1Var.c;
                obj = objArr[iNumberOfTrailingZeros];
                objArr[iNumberOfTrailingZeros] = null;
            } else {
                obj = null;
            }
            m22 m22Var2 = (m22) obj;
            if (m22Var2 != null) {
                if (this.x != null) {
                    ie1.p(x0(), null, new n(this, m22Var2, null, (byte) 3), 3);
                }
                S0();
            }
            if (m22Var2 != null) {
                return z;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.ug2
    public final void h0(dh2 dh2Var) {
        ba2 ba2Var = this.B;
        if (ba2Var != null) {
            bh2.k(dh2Var, ba2Var.a);
        }
        String str = this.A;
        f fVar = new f(this, (byte) 1);
        q21[] q21VarArr = bh2.a;
        dh2Var.a(qg2.b, new m1(str, fVar));
        if (this.C) {
            this.E.h0(dh2Var);
        } else {
            dh2Var.a(ah2.j, j23.a);
        }
        M0(dh2Var);
    }

    @Override // defpackage.c12
    public final void j0() {
        ut0 ut0Var;
        ui1 ui1Var = this.x;
        if (ui1Var != null && (ut0Var = this.K) != null) {
            ui1Var.c(new vt0(ut0Var));
        }
        this.K = null;
        N0(false);
    }

    @Override // defpackage.ug2
    public final boolean l0() {
        return true;
    }

    @Override // defpackage.z21
    public final boolean m(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.pr0
    public final String q0() {
        return this.H;
    }

    @Override // defpackage.qg1
    public final boolean y0() {
        return false;
    }

    public void M0(dh2 dh2Var) {
    }
}
