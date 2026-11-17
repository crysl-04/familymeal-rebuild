package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kb implements m20 {
    public final /* synthetic */ byte h;
    public final Object i;
    public final Object j;

    public kb(kb kbVar) {
        this.h = (byte) 2;
        this.i = kbVar;
        this.j = new n31();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final Object c(m10 m10Var, vp0 vp0Var) {
        vv1 vv1Var;
        boolean z;
        Object objT;
        byte b = 2;
        byte b2 = 1;
        switch (this.h) {
            case 0:
                ib ibVar = (ib) this.j;
                rq rqVar = new rq(1, ls.F(m10Var));
                rqVar.u();
                jb jbVar = new jb(rqVar, this, vp0Var);
                if (uz0.g(ibVar.j, (Choreographer) this.i)) {
                    synchronized (ibVar.l) {
                        ibVar.n.add(jbVar);
                        if (!ibVar.q) {
                            ibVar.q = true;
                            ibVar.j.postFrameCallback(ibVar.r);
                        }
                        break;
                    }
                    rqVar.w(new q9(ibVar, jbVar, b2));
                } else {
                    ((Choreographer) this.i).postFrameCallback(jbVar);
                    rqVar.w(new q9(this, jbVar, b));
                }
                return rqVar.t();
            case 1:
                rq rqVar2 = new rq(1, ls.F(m10Var));
                rqVar2.u();
                bj bjVar = (bj) this.j;
                yo yoVar = new yo();
                yoVar.a = rqVar2;
                yoVar.b = vp0Var;
                rqVar2.w(new aa(bjVar.a(yoVar, (f72) this.i), b2));
                return rqVar2.t();
            default:
                if (m10Var instanceof vv1) {
                    vv1Var = (vv1) m10Var;
                    int i = vv1Var.n;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        vv1Var.n = i - Integer.MIN_VALUE;
                    } else {
                        vv1Var = new vv1(this, m10Var);
                    }
                } else {
                    vv1Var = new vv1(this, m10Var);
                }
                Object obj = vv1Var.l;
                y20 y20Var = y20.h;
                int i2 = vv1Var.n;
                if (i2 == 0) {
                    m02.y(obj);
                    n31 n31Var = (n31) this.j;
                    vv1Var.k = vp0Var;
                    vv1Var.n = 1;
                    synchronized (n31Var.b) {
                        z = n31Var.a;
                    }
                    if (z) {
                        objT = j23.a;
                    } else {
                        rq rqVar3 = new rq(1, ls.F(vv1Var));
                        rqVar3.u();
                        synchronized (n31Var.b) {
                            ((ArrayList) n31Var.c).add(rqVar3);
                        }
                        rqVar3.w(new q9(n31Var, rqVar3, (byte) 7));
                        objT = rqVar3.t();
                        if (objT != y20Var) {
                            objT = j23.a;
                        }
                    }
                    if (objT != y20Var) {
                    }
                    return y20Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        m02.y(obj);
                        return obj;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vp0Var = vv1Var.k;
                m02.y(obj);
                kb kbVar = (kb) this.i;
                vv1Var.k = null;
                vv1Var.n = 2;
                Object objC = kbVar.c(vv1Var, vp0Var);
                if (objC != y20Var) {
                    return objC;
                }
                return y20Var;
        }
    }

    @Override // defpackage.m20
    public final n20 getKey() {
        return c5.c0;
    }

    @Override // defpackage.o20
    public final o20 i(o20 o20Var) {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
        }
        return cu.Q(this, o20Var);
    }

    @Override // defpackage.o20
    public final m20 m(n20 n20Var) {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
        }
        return cu.F(this, n20Var);
    }

    @Override // defpackage.o20
    public final Object p(zp0 zp0Var, Object obj) {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
        }
        return zp0Var.f(obj, this);
    }

    @Override // defpackage.o20
    public final o20 t(n20 n20Var) {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
        }
        return cu.M(this, n20Var);
    }

    public kb(Choreographer choreographer, ib ibVar) {
        this.h = (byte) 0;
        this.i = choreographer;
        this.j = ibVar;
    }

    public kb(f72 f72Var) {
        this.h = (byte) 1;
        this.i = f72Var;
        this.j = new bj();
    }
}
