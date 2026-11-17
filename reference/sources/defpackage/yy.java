package defpackage;

import android.os.Bundle;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yy implements n20, on1, xp1 {
    public final /* synthetic */ byte h;

    public yy(int i, int i2) {
        this.h = (byte) 19;
    }

    public static pk1 h(lf0 lf0Var, dl1 dl1Var, Bundle bundle, x81 x81Var, xl1 xl1Var) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        dl1Var.getClass();
        x81Var.getClass();
        return new pk1(lf0Var, dl1Var, bundle, x81Var, xl1Var, string, null);
    }

    public static p60 i(String str) {
        Object next;
        str.getClass();
        lh0 lh0Var = p60.p;
        lh0Var.getClass();
        z zVar = new z(lh0Var, (byte) 0);
        do {
            if (!zVar.hasNext()) {
                next = null;
                break;
            }
            next = zVar.next();
        } while (!((p60) next).h.equals(str));
        p60 p60Var = (p60) next;
        if (p60Var != null) {
            return p60Var;
        }
        wg.m("Unknown day: ".concat(str));
        return null;
    }

    public static te1 j(String str) {
        Object next;
        str.getClass();
        lh0 lh0Var = te1.o;
        lh0Var.getClass();
        z zVar = new z(lh0Var, (byte) 0);
        do {
            if (!zVar.hasNext()) {
                next = null;
                break;
            }
            next = zVar.next();
        } while (!((te1) next).h.equals(str));
        te1 te1Var = (te1) next;
        if (te1Var != null) {
            return te1Var;
        }
        wg.m("Unknown meal type: ".concat(str));
        return null;
    }

    @Override // defpackage.on1
    public final boolean a(qg1 qg1Var) {
        return false;
    }

    @Override // defpackage.on1
    public final int b() {
        return 8;
    }

    @Override // defpackage.on1
    public final boolean c(qg1 qg1Var) {
        return aa3.A(h12.d(cu.Y(qg1Var), false));
    }

    @Override // defpackage.on1
    public final void d(l41 l41Var, long j, jt0 jt0Var, int i, boolean z) {
        ln1 ln1Var = l41Var.L;
        pn1 pn1Var = ln1Var.d;
        de1 de1Var = pn1.b0;
        ln1Var.d.b1(pn1.h0, pn1Var.S0(j), jt0Var, 1, z);
    }

    @Override // defpackage.on1
    public final boolean e(jt0 jt0Var, l41 l41Var) {
        return false;
    }

    @Override // defpackage.on1
    public final boolean f(l41 l41Var) {
        rg2 rg2VarW = l41Var.w();
        boolean z = false;
        if (rg2VarW != null && rg2VarW.k) {
            z = true;
        }
        return !z;
    }

    public final long g(long j, long j2) {
        switch (this.h) {
            case 2:
                float fZ = cu.z(j, j2);
                return (((long) Float.floatToRawIntBits(fZ)) << 32) | (((long) Float.floatToRawIntBits(fZ)) & 4294967295L);
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    return 4575657222473777152L;
                }
                float fZ2 = cu.z(j, j2);
                return (((long) Float.floatToRawIntBits(fZ2)) << 32) | (((long) Float.floatToRawIntBits(fZ2)) & 4294967295L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0214, code lost:
    
        if (defpackage.t21.a(defpackage.lt.a(r15.getKeyCode()), defpackage.t21.o) != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x030a, code lost:
    
        if (defpackage.t21.a(r14, defpackage.t21.N) == false) goto L266;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.u21 k(android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yy.k(android.view.KeyEvent):u21");
    }

    public final String toString() {
        switch (this.h) {
            case 0:
                return "Empty";
            case 1:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ yy(byte b) {
        this.h = b;
    }

    @Override // defpackage.xp1
    public final int n(int i) {
        return i;
    }

    @Override // defpackage.xp1
    public final int s(int i) {
        return i;
    }
}
