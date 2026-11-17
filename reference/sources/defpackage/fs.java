package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class fs implements lq0 {
    public final o20 h;
    public final int i;
    public final dp j;
    public final pk0 k;

    public fs(pk0 pk0Var, o20 o20Var, int i, dp dpVar) {
        this.h = o20Var;
        this.i = i;
        this.j = dpVar;
        this.k = pk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f A[RETURN] */
    @Override // defpackage.pk0
    public final Object a(qk0 qk0Var, m10 m10Var) {
        Object objX;
        int i = this.i;
        m10 m10Var2 = null;
        y20 y20Var = y20.h;
        j23 j23Var = j23.a;
        if (i == -3) {
            o20 o20VarE = m10Var.e();
            Boolean bool = Boolean.FALSE;
            yx yxVar = new yx((byte) 12);
            o20 o20Var = this.h;
            o20 o20VarI = !((Boolean) o20Var.p(yxVar, bool)).booleanValue() ? o20VarE.i(o20Var) : ou.v(o20VarE, o20Var, false);
            if (uz0.g(o20VarI, o20VarE)) {
                Object objE = e(qk0Var, m10Var);
                if (objE == y20Var) {
                    return objE;
                }
            } else {
                c5 c5Var = c5.L;
                if (uz0.g(o20VarI.m(c5Var), o20VarE.m(c5Var))) {
                    o20 o20VarE2 = m10Var.e();
                    if (!(qk0Var instanceof mh2) && !(qk0Var instanceof jo1)) {
                        qk0Var = new rc(qk0Var, o20VarE2);
                    }
                    Object objH0 = es.h0(o20VarI, qk0Var, ie1.B(o20VarI), new h((Object) this, m10Var2, (byte) 10), m10Var);
                    if (objH0 == y20Var) {
                        return objH0;
                    }
                } else {
                    objX = vs.x(new j(qk0Var, this, m10Var2, (byte) 4), m10Var);
                    if (objX != y20Var) {
                        objX = j23Var;
                    }
                    if (objX == y20Var) {
                        return objX;
                    }
                }
            }
        } else {
            objX = vs.x(new j(qk0Var, this, m10Var2, (byte) 4), m10Var);
            if (objX != y20Var) {
                objX = j23Var;
            }
            if (objX == y20Var) {
                return objX;
            }
        }
        return j23Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    @Override // defpackage.lq0
    public final pk0 b(o20 o20Var, int i, dp dpVar) {
        o20 o20Var2 = this.h;
        o20 o20VarI = o20Var.i(o20Var2);
        dp dpVar2 = dp.h;
        dp dpVar3 = this.j;
        int i2 = this.i;
        if (dpVar == dpVar2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            dpVar = dpVar3;
        }
        return (uz0.g(o20VarI, o20Var2) && i == i2 && dpVar == dpVar3) ? this : c(o20VarI, i, dpVar);
    }

    public fs c(o20 o20Var, int i, dp dpVar) {
        return new gs(this.k, o20Var, i, dpVar);
    }

    public pk0 d() {
        return null;
    }

    public Object e(qk0 qk0Var, m10 m10Var) {
        Object objA = this.k.a(qk0Var, m10Var);
        return objA == y20.h ? objA : j23.a;
    }

    public final String f() {
        ArrayList arrayList = new ArrayList(4);
        xf0 xf0Var = xf0.h;
        o20 o20Var = this.h;
        if (o20Var != xf0Var) {
            arrayList.add("context=" + o20Var);
        }
        int i = this.i;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        dp dpVar = dp.h;
        dp dpVar2 = this.j;
        if (dpVar2 != dpVar) {
            arrayList.add("onBufferOverflow=" + dpVar2);
        }
        return getClass().getSimpleName() + '[' + dv.E0(arrayList, ", ", null, null, null, 62) + ']';
    }

    public final String toString() {
        return this.k + " -> " + f();
    }
}
