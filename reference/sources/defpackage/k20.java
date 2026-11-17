package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k20 extends k80 implements ug2 {
    public boolean A;
    public xp1 B;
    public kv2 C;
    public nu0 D;
    public gm0 E;
    public hz2 x;
    public vv2 y;
    public p81 z;

    public static void M0(p81 p81Var, String str, boolean z) {
        if (z) {
            dw2 dw2Var = p81Var.e;
            v10 v10Var = p81Var.v;
            if (dw2Var == null) {
                int length = str.length();
                v10Var.h(new vv2(str, m02.a(length, length), 4));
            } else {
                vv2 vv2VarN = p81Var.d.n(lt.Q(new q80(), new fw(str, 1)));
                dw2Var.a(null, vv2VarN);
                v10Var.h(vv2VarN);
            }
        }
    }

    @Override // defpackage.ug2
    public final void h0(dh2 dh2Var) {
        od odVar = this.y.a;
        q21[] q21VarArr = bh2.a;
        ch2 ch2Var = ah2.F;
        q21[] q21VarArr2 = bh2.a;
        q21 q21Var = q21VarArr2[18];
        ch2Var.getClass();
        dh2Var.a(ch2Var, odVar);
        od odVar2 = this.x.a;
        ch2 ch2Var2 = ah2.G;
        q21 q21Var2 = q21VarArr2[19];
        ch2Var2.getClass();
        dh2Var.a(ch2Var2, odVar2);
        long j = this.y.b;
        ch2 ch2Var3 = ah2.H;
        q21 q21Var3 = q21VarArr2[20];
        qw2 qw2Var = new qw2(j);
        ch2Var3.getClass();
        dh2Var.a(ch2Var3, qw2Var);
        bh2.e(dh2Var, c5.J);
        bh2.h(dh2Var, new m8(AutofillValue.forText(ia2.A(this.y.a))));
        bh2.c(dh2Var, new j20(this, (byte) 0));
        int i = this.D.d;
        if (i == 6) {
            b10.a.getClass();
            bh2.g(dh2Var, a10.c);
        } else if (i == 7 || i == 8) {
            b10.a.getClass();
            bh2.g(dh2Var, a10.b);
        } else if (i == 4) {
            b10.a.getClass();
            bh2.g(dh2Var, a10.d);
        }
        if (!this.A) {
            dh2Var.a(ah2.j, j23.a);
        }
        boolean z = this.A;
        ch2 ch2Var4 = ah2.Q;
        q21 q21Var4 = q21VarArr2[28];
        Boolean boolValueOf = Boolean.valueOf(z);
        ch2Var4.getClass();
        dh2Var.a(ch2Var4, boolValueOf);
        bh2.a(dh2Var, new j20(this, (byte) 1));
        if (z) {
            dh2Var.a(qg2.k, new m1(null, new j20(this, (byte) 2)));
            dh2Var.a(qg2.o, new m1(null, new j20(this, dh2Var)));
        }
        dh2Var.a(qg2.j, new m1(null, new kw0(this, (byte) 3)));
        int i2 = this.D.e;
        i20 i20Var = new i20(this, (byte) 6);
        dh2Var.a(ah2.J, new mu0(i2));
        dh2Var.a(qg2.p, new m1(null, i20Var));
        dh2Var.a(qg2.b, new m1(null, new i20(this, (byte) 7)));
        dh2Var.a(qg2.c, new m1(null, new i20(this, (byte) 1)));
        if (!qw2.c(this.y.b)) {
            dh2Var.a(qg2.q, new m1(null, new i20(this, (byte) 2)));
            if (this.A) {
                dh2Var.a(qg2.r, new m1(null, new i20(this, (byte) 3)));
            }
        }
        if (this.A) {
            dh2Var.a(qg2.s, new m1(null, new i20(this, (byte) 5)));
        }
    }

    @Override // defpackage.ug2
    public final boolean l0() {
        return true;
    }
}
