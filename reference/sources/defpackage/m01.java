package defpackage;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.LinkedTransferQueue;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m01 extends h3 {
    public final l52 K;
    public final k01 L;

    public m01(o10 o10Var, ds1 ds1Var) {
        super(o10Var, ds1Var);
        this.L = new k01(this);
        int iJ = this.i.j();
        tk.p.getClass();
        this.K = g52.R(iJ, 1);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.tk
    public final void C() {
        int[] iArr;
        o10 o10Var;
        boolean zS0;
        me1 me1Var;
        wo1 wo1Var;
        double d;
        l();
        int i = this.v;
        this.v = -1;
        int[] iArrM = M();
        int[] iArrA = this.w;
        if (iArrA == null) {
            iArrA = this.s.a();
            this.w = iArrA;
        }
        k01 k01Var = this.L;
        me1 me1Var2 = this.l;
        o10 o10Var2 = this.i;
        if (i >= 0) {
            int iH = o10Var2.h() + i;
            cm2 cm2VarV = v(i);
            k01Var.a(iH, me1Var2.H1(new c1(cm2VarV), this.K), cm2VarV.S(this.y) - o10Var2.d.A(i));
        }
        int iJ = J();
        int iJ2 = o10Var2.j();
        l52 l52Var = this.r;
        l52 l52Var2 = this.z;
        if (iJ <= iJ2) {
            zS0 = me1Var2.s0();
            if (zS0) {
                a1 a1Var = this.y;
                if (J() == 0) {
                    l52Var2.Z(a1Var);
                    iArr = iArrA;
                    o10Var = o10Var2;
                } else {
                    b00 b00Var = (b00) k01Var.j;
                    g2 g2Var = b00Var.i;
                    if (g2Var == null) {
                        g2Var = new g2((Object) b00Var, (byte) 22);
                        b00Var.i = g2Var;
                    }
                    ((b00) g2Var.i).j = (((m01) k01Var.n).J() << 1) + 10;
                    ArrayList arrayList = (ArrayList) k01Var.k;
                    int size = arrayList.size();
                    int i2 = l52Var.i;
                    int i3 = b00Var.j;
                    wo1 wo1Var2 = b00Var.h;
                    double d2 = h32.a;
                    l52 l52VarA = b00.a(b00Var.n, i2);
                    double[] dArr = l52VarA.j;
                    b00Var.n = l52VarA;
                    l52 l52VarA2 = b00.a(b00Var.l, i2);
                    b00Var.l = l52VarA2;
                    o10Var = o10Var2;
                    l52 l52VarA3 = b00.a(b00Var.m, i2);
                    b00Var.m = l52VarA3;
                    iArr = iArrA;
                    l52 l52VarA4 = b00.a(b00Var.o, i2);
                    b00Var.o = l52VarA4;
                    v12 v12Var = b00Var.k;
                    v12Var.b(arrayList, i2);
                    int i4 = 0;
                    while (i4 < size) {
                        int i5 = i4;
                        mh0 mh0Var = (mh0) arrayList.get(i4);
                        int i6 = i3;
                        double d3 = mh0Var.k;
                        d2 = (d3 * d3) + d2;
                        dArr[mh0Var.h] = d3 - mh0Var.i.S(l52Var);
                        i4 = i5 + 1;
                        i3 = i6;
                        wo1Var2 = wo1Var2;
                    }
                    int i7 = i3;
                    wo1 wo1Var3 = wo1Var2;
                    double dSqrt = Math.sqrt(d2);
                    v12Var.a(l52VarA, l52VarA3);
                    l52VarA2.Z(l52VarA3);
                    double dS = l52VarA3.S(l52VarA);
                    int i8 = 0;
                    while (true) {
                        int i9 = i8;
                        int i10 = 0;
                        while (i10 < size) {
                            ArrayList arrayList2 = arrayList;
                            mh0 mh0Var2 = (mh0) arrayList.get(i10);
                            l52VarA4.j[mh0Var2.h] = mh0Var2.i.S(l52VarA2);
                            i10++;
                            size = size;
                            arrayList = arrayList2;
                        }
                        ArrayList arrayList3 = arrayList;
                        int i11 = size;
                        me1Var = me1Var2;
                        double dS2 = dS / l52VarA2.S(l52VarA4);
                        if (!Double.isNaN(dS2)) {
                            l52VarA2.m1(dS2, l52Var);
                            l52VarA4.m1(-dS2, l52VarA);
                        }
                        double dJ = lt.J(0, dArr.length, dArr);
                        double dSqrt2 = h32.a;
                        if (dJ != dSqrt2) {
                            double d4 = h32.a;
                            for (double d5 : dArr) {
                                double d6 = d5 / dJ;
                                d4 = (d6 * d6) + d4;
                            }
                            dSqrt2 = Math.sqrt(d4) * dJ;
                        }
                        double d7 = dSqrt2;
                        v12Var.a(l52VarA, l52VarA3);
                        double dS3 = l52VarA3.S(l52VarA);
                        l52 l52Var3 = l52VarA3;
                        double d8 = dS3 / dS;
                        f32 f32Var = h32.C;
                        f32Var.getClass();
                        v12 v12Var2 = v12Var;
                        l52VarA2.O1(new sm(f32Var, d8));
                        l52VarA2.v1(h32.s, l52Var3);
                        i8 = i9 + 1;
                        int i12 = i7;
                        if (i8 >= i12 || Double.isNaN(d7)) {
                            wo1Var = wo1Var3;
                            d = d7;
                            break;
                        }
                        i7 = i12;
                        wo1Var = wo1Var3;
                        d = d7;
                        if (wo1Var.B(dSqrt, d)) {
                            break;
                        }
                        wo1Var3 = wo1Var;
                        l52VarA3 = l52Var3;
                        me1Var2 = me1Var;
                        v12Var = v12Var2;
                        size = i11;
                        arrayList = arrayList3;
                        dS = dS3;
                    }
                    if (!wo1.D(dSqrt, wo1Var.j)) {
                        d /= dSqrt;
                    }
                    k();
                    zS0 = wo1.D(d, this.a.j.a.j);
                    if (zS0) {
                        long jH = o10Var.h();
                        me1Var.H1(new pe1(w(), h32.I, new pe1(new wz2(F()), l52Var.A1(jH, 1L).o0(new xa2(l52Var.V1(jH, 0L), iArrM)))), l52Var2);
                    }
                }
            } else {
                iArr = iArrA;
                o10Var = o10Var2;
            }
        } else {
            iArr = iArrA;
            o10Var = o10Var2;
            zS0 = false;
        }
        if (!zS0) {
            l52 l52Var4 = (l52) tk.p.b(J() + o10Var.j(), 1L);
            boolean zE = E(l52Var4);
            if (zE) {
                a1 a1VarA1 = l52Var4.A1(o10Var.j(), 1L);
                double[] dArr2 = l52Var4.j;
                l52Var2.Z(a1VarA1);
                for (int i13 = 0; i13 < o10Var.h(); i13++) {
                    l52Var.j[i13] = dArr2[o10Var.j() + i13];
                }
                int length = iArrM.length;
                for (int i14 = 0; i14 < length; i14++) {
                    l52Var.j[o10Var.h() + iArrM[i14]] = dArr2[o10Var.h() + o10Var.j() + i14];
                }
            }
            zS0 = zE;
        }
        P(zS0, l52Var2, iArrM, iArr);
    }

    @Override // defpackage.h3
    public final void K(int i) {
        super.K(i);
        int iH = this.i.h() + i;
        k01 k01Var = this.L;
        mh0[] mh0VarArr = (mh0[]) k01Var.m;
        mh0 mh0Var = mh0VarArr[iH];
        if (mh0Var != null) {
            ((ArrayList) k01Var.k).remove(mh0Var);
            l01 l01Var = (l01) k01Var.l;
            zk zkVar = mh0Var.i;
            Objects.requireNonNull(zkVar);
            zkVar.reset();
            ((LinkedTransferQueue) l01Var.a).offer(zkVar);
        }
        mh0VarArr[iH] = null;
        l52 l52Var = ((m01) k01Var.n).r;
        l52Var.j[iH] = h32.a;
    }

    @Override // defpackage.h3
    public final void R() {
        super.R();
        o10 o10Var = this.i;
        int iH = o10Var.h();
        o10Var.j();
        k01 k01Var = this.L;
        ((ArrayList) k01Var.k).clear();
        int[] iArrM = M();
        if (iArrM.length + iH > 0) {
            re1 re1VarF = F();
            re1 re1VarG = G();
            re1 re1VarL = this.l.l(new wz2(re1VarF));
            cf0 cf0VarW1 = this.y.W1((l52) re1VarF);
            f32 f32Var = h32.I;
            cf0VarW1.getClass();
            dk1 dk1Var = (dk1) tk.p.b(cf0VarW1.Z1(), cf0VarW1.T());
            gz2 gz2Var = (gz2) dk1Var;
            cf0VarW1.a(gz2Var);
            gz2Var.v1(f32Var, re1VarG);
            re1 re1Var = (re1) dk1Var;
            for (int i = 0; i < iH; i++) {
                k01Var.a(i, re1VarL.g0(i), re1Var.A(i));
            }
            for (int i2 = 0; i2 < iArrM.length; i2++) {
                int i3 = iH + i2;
                k01Var.a(iArrM[i2] + iH, re1VarL.g0(i3), re1Var.A(i3));
            }
        }
    }
}
