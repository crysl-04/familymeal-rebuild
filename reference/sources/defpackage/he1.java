package defpackage;

import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class he1 {
    public static final ie0 a = new ie0(new jw0((byte) 16), (byte) 1);

    public static final void a(pv pvVar, fh1 fh1Var, li2 li2Var, c13 c13Var, nx nxVar, dr0 dr0Var, int i) {
        int i2;
        dr0Var.W(904511636);
        if ((i & 6) == 0) {
            i2 = (dr0Var.f(pvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.f(fh1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.f(li2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dr0Var.f(c13Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dr0Var.h(nxVar) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if (dr0Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            dr0Var.S();
            if ((i & 1) != 0 && !dr0Var.x()) {
                dr0Var.Q();
            }
            dr0Var.q();
            aa2 aa2VarA = y92.a(0.0f, 7, 0L, false);
            long j = pvVar.a;
            boolean zE = dr0Var.e(j);
            Object objK = dr0Var.K();
            if (zE || objK == zy.a) {
                objK = new rw2(j, kv.b(0.4f, j));
                dr0Var.f0(objK);
            }
            ys.b(new i42[]{rv.a.a(pvVar), a.a(fh1Var), av0.a.a(aa2VarA), mi2.a.a(li2Var), sw2.a.a((rw2) objK), e13.a.a(c13Var)}, dt.N(-1750539308, new rl(c13Var, nxVar, (byte) 6), dr0Var), dr0Var, 56);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new nl(pvVar, fh1Var, li2Var, c13Var, nxVar, i);
        }
    }

    public static final void b(pv pvVar, li2 li2Var, c13 c13Var, nx nxVar, dr0 dr0Var, int i) {
        pv pvVar2;
        dr0 dr0Var2;
        nx nxVar2;
        c13 c13Var2;
        li2 li2Var2;
        dr0Var.W(-449719819);
        int i2 = (dr0Var.f(pvVar) ? 4 : 2) | i | 144;
        if (dr0Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            dr0Var.S();
            if ((i & 1) == 0 || dr0Var.x()) {
                li2Var = (li2) dr0Var.j(mi2.a);
                c13Var = (c13) dr0Var.j(e13.a);
            } else {
                dr0Var.Q();
            }
            int i3 = i2 & (-1009);
            li2 li2Var3 = li2Var;
            c13 c13Var3 = c13Var;
            dr0Var.q();
            pvVar2 = pvVar;
            dr0Var2 = dr0Var;
            a(pvVar2, (fh1) dr0Var.j(a), li2Var3, c13Var3, nxVar, dr0Var2, (i3 & 14) | 24576);
            nxVar2 = nxVar;
            li2Var2 = li2Var3;
            c13Var2 = c13Var3;
        } else {
            pvVar2 = pvVar;
            dr0Var2 = dr0Var;
            nxVar2 = nxVar;
            dr0Var2.Q();
            c13Var2 = c13Var;
            li2Var2 = li2Var;
        }
        e72 e72VarR = dr0Var2.r();
        if (e72VarR != null) {
            e72VarR.d = new hl(pvVar2, li2Var2, c13Var2, nxVar2, i);
        }
    }
}
