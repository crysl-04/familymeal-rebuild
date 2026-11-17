package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class dw implements o20, Serializable {
    public final o20 h;
    public final m20 i;

    public dw(m20 m20Var, o20 o20Var) {
        o20Var.getClass();
        this.h = o20Var;
        this.i = m20Var;
    }

    public final boolean equals(Object obj) {
        boolean zG;
        if (this == obj) {
            return true;
        }
        if (obj instanceof dw) {
            dw dwVar = (dw) obj;
            int i = 2;
            dw dwVar2 = dwVar;
            int i2 = 2;
            while (true) {
                o20 o20Var = dwVar2.h;
                dwVar2 = o20Var instanceof dw ? (dw) o20Var : null;
                if (dwVar2 == null) {
                    break;
                }
                i2++;
            }
            dw dwVar3 = this;
            while (true) {
                o20 o20Var2 = dwVar3.h;
                dwVar3 = o20Var2 instanceof dw ? (dw) o20Var2 : null;
                if (dwVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    m20 m20Var = this.i;
                    if (!uz0.g(dwVar.m(m20Var.getKey()), m20Var)) {
                        zG = false;
                        break;
                    }
                    o20 o20Var3 = this.h;
                    if (!(o20Var3 instanceof dw)) {
                        o20Var3.getClass();
                        m20 m20Var2 = (m20) o20Var3;
                        zG = uz0.g(dwVar.m(m20Var2.getKey()), m20Var2);
                        break;
                    }
                    this = (dw) o20Var3;
                }
                if (zG) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + this.h.hashCode();
    }

    @Override // defpackage.o20
    public final o20 i(o20 o20Var) {
        o20Var.getClass();
        return o20Var == xf0.h ? this : (o20) o20Var.p(new yx((byte) 9), this);
    }

    @Override // defpackage.o20
    public final m20 m(n20 n20Var) {
        n20Var.getClass();
        while (true) {
            m20 m20VarM = this.i.m(n20Var);
            if (m20VarM != null) {
                return m20VarM;
            }
            o20 o20Var = this.h;
            if (!(o20Var instanceof dw)) {
                return o20Var.m(n20Var);
            }
            this = (dw) o20Var;
        }
    }

    @Override // defpackage.o20
    public final Object p(zp0 zp0Var, Object obj) {
        return zp0Var.f(this.h.p(zp0Var, obj), this.i);
    }

    @Override // defpackage.o20
    public final o20 t(n20 n20Var) {
        n20Var.getClass();
        m20 m20Var = this.i;
        m20 m20VarM = m20Var.m(n20Var);
        o20 o20Var = this.h;
        if (m20VarM != null) {
            return o20Var;
        }
        o20 o20VarT = o20Var.t(n20Var);
        if (o20VarT == o20Var) {
            return this;
        }
        return o20VarT == xf0.h ? m20Var : new dw(m20Var, o20VarT);
    }

    public final String toString() {
        return "[" + ((String) p(new ig((byte) 3), "")) + ']';
    }
}
