package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k01 implements ul2 {
    public int h;
    public int i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;

    public k01(m01 m01Var) {
        this.n = m01Var;
        q10 q10Var = m01Var.a.j;
        o10 o10Var = m01Var.i;
        int i = (o10Var.i() + o10Var.h()) << 1;
        b00 b00Var = (b00) q10Var.c.get();
        g2 g2Var = b00Var.i;
        if (g2Var == null) {
            g2Var = new g2((Object) b00Var, (byte) 22);
            b00Var.i = g2Var;
        }
        b00 b00Var2 = (b00) g2Var.i;
        b00Var2.h = q10Var.a;
        b00Var2.j = i;
        b00Var2.k = (v12) q10Var.b.get();
        int i2 = o10Var.i() + o10Var.h();
        this.k = new ArrayList();
        this.j = b00Var;
        this.h = i2;
        int iH = o10Var.h();
        this.i = iH;
        int i3 = o10Var.i() + iH;
        this.l = new l01(i3);
        this.m = new mh0[i3];
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    public final void a(int i, a1 a1Var, double d) {
        mh0 mh0Var;
        mh0 mh0Var2;
        int i2 = this.i;
        m01 m01Var = (m01) this.n;
        int[] iArrM = m01Var.M();
        mh0 mh0Var3 = new mh0((zk) ((l01) this.l).c(), i, d);
        mh0[] mh0VarArr = (mh0[]) this.m;
        mh0VarArr[i] = mh0Var3;
        ArrayList arrayList = (ArrayList) this.k;
        zk zkVar = mh0Var3.i;
        int size = zkVar.size();
        int i3 = this.h;
        if (size != i3) {
            Object[] objArr = {Integer.valueOf(zkVar.size()), Integer.valueOf(i3)};
            bl blVar = cl.b;
            if (blVar != null) {
                blVar.c(pz1.m("row.count(): {} != mySize: {}", objArr));
                blVar.a();
            }
            wg.f();
            return;
        }
        arrayList.add(mh0Var3);
        Collections.sort(arrayList);
        if (i2 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                double dS = m01Var.u(i4).S(a1Var);
                if (i4 != i) {
                    if (!i32.l.B(h32.b, dS)) {
                        mh0Var2 = mh0VarArr[i4];
                        if (mh0Var2 != null) {
                            mh0Var2.y(i, dS);
                        }
                        mh0Var3.y(i4, dS);
                    }
                } else {
                    mh0Var2 = mh0VarArr[i4];
                    if (mh0Var2 != null) {
                        mh0Var2.y(i, dS);
                    }
                    mh0Var3.y(i4, dS);
                }
            }
        }
        if (iArrM.length > 0) {
            for (int i5 = 0; i5 < iArrM.length; i5++) {
                double dS2 = m01Var.v(iArrM[i5]).S(a1Var);
                int i6 = iArrM[i5] + i2;
                if (i6 != i) {
                    if (!i32.l.B(h32.b, dS2)) {
                        mh0Var = mh0VarArr[i6];
                        if (mh0Var != null) {
                            mh0Var.y(i, dS2);
                        }
                        mh0Var3.y(i6, dS2);
                    }
                } else {
                    mh0Var = mh0VarArr[i6];
                    if (mh0Var != null) {
                        mh0Var.y(i, dS2);
                    }
                    mh0Var3.y(i6, dS2);
                }
            }
        }
        l52 l52Var = m01Var.r;
        l52Var.f(mh0Var3.h, ((h32.a - zkVar.S(l52Var)) * h32.b) / mh0Var3.j);
    }

    @Override // defpackage.ul2
    public final gy1 j(int i, int i2, int i3) {
        return ((b00) this.j).j(i, i2, i3);
    }

    public k01(int i, int i2) {
        this.h = -1;
        this.i = -1;
        this.j = new i90(i2);
        this.k = new double[Math.max(i, i2)];
        this.l = new i90(i);
        this.m = new i90(i);
        this.n = new i90(i);
    }
}
