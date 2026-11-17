package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class m41 {
    public final i5 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public i5 h;
    public final /* synthetic */ byte j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public m41(i5 i5Var, byte b) {
        this.j = b;
        this.a = i5Var;
    }

    public final void a(e5 e5Var, int i, pn1 pn1Var) {
        float f = i;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        while (true) {
            switch (this.j) {
                case 0:
                    gt1 gt1Var = pn1Var.a0;
                    if (gt1Var != null) {
                        es0 es0Var = (es0) gt1Var;
                        float[] fArrB = es0Var.b();
                        if (!es0Var.z) {
                            jFloatToRawIntBits = ke1.b(jFloatToRawIntBits, fArrB);
                        }
                    }
                    jFloatToRawIntBits = lt.Y(jFloatToRawIntBits, pn1Var.M);
                    break;
                default:
                    cd1 cd1VarT0 = pn1Var.T0();
                    cd1VarT0.getClass();
                    long j = cd1VarT0.C;
                    jFloatToRawIntBits = up1.e((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L), jFloatToRawIntBits);
                    break;
            }
            pn1Var = pn1Var.D;
            pn1Var.getClass();
            if (pn1Var.equals(this.a.p())) {
                int iRound = Math.round(e5Var instanceof mt0 ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
                HashMap map = this.i;
                if (map.containsKey(e5Var)) {
                    int iIntValue = ((Number) ee1.J(e5Var, map)).intValue();
                    mt0 mt0Var = h5.a;
                    iRound = ((Number) e5Var.a.f(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                }
                map.put(e5Var, Integer.valueOf(iRound));
                return;
            }
            if (b(pn1Var).containsKey(e5Var)) {
                float fC = c(pn1Var, e5Var);
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
            }
        }
    }

    public final Map b(pn1 pn1Var) {
        switch (this.j) {
            case 0:
                return pn1Var.C0().a();
            default:
                cd1 cd1VarT0 = pn1Var.T0();
                cd1VarT0.getClass();
                return cd1VarT0.C0().a();
        }
    }

    public final int c(pn1 pn1Var, e5 e5Var) {
        switch (this.j) {
            case 0:
                return pn1Var.h0(e5Var);
            default:
                cd1 cd1VarT0 = pn1Var.T0();
                cd1VarT0.getClass();
                return cd1VarT0.h0(e5Var);
        }
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        h();
        return this.h != null;
    }

    public final void f() {
        this.b = true;
        i5 i5Var = this.a;
        i5 i5VarQ = i5Var.q();
        if (i5VarQ == null) {
            return;
        }
        if (this.c) {
            i5VarQ.Y();
        } else if (this.e || this.d) {
            i5VarQ.requestLayout();
        }
        if (this.f) {
            i5Var.Y();
        }
        if (this.g) {
            i5Var.requestLayout();
        }
        i5VarQ.a().f();
    }

    public final void g() {
        HashMap map = this.i;
        map.clear();
        p pVar = new p((Object) this, (byte) 3);
        i5 i5Var = this.a;
        i5Var.j(pVar);
        map.putAll(b(i5Var.p()));
        this.b = false;
    }

    public final void h() {
        m41 m41VarA;
        m41 m41VarA2;
        boolean zD = d();
        i5 i5Var = this.a;
        if (!zD) {
            i5 i5VarQ = i5Var.q();
            if (i5VarQ == null) {
                return;
            }
            i5Var = i5VarQ.a().h;
            if (i5Var == null || !i5Var.a().d()) {
                i5 i5Var2 = this.h;
                if (i5Var2 == null || i5Var2.a().d()) {
                    return;
                }
                i5 i5VarQ2 = i5Var2.q();
                if (i5VarQ2 != null && (m41VarA2 = i5VarQ2.a()) != null) {
                    m41VarA2.h();
                }
                i5 i5VarQ3 = i5Var2.q();
                i5Var = (i5VarQ3 == null || (m41VarA = i5VarQ3.a()) == null) ? null : m41VarA.h;
            }
        }
        this.h = i5Var;
    }
}
