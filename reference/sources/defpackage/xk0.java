package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xk0 implements pk0 {
    public final /* synthetic */ zk0 h;
    public final /* synthetic */ e01 i;

    public xk0(zk0 zk0Var, e01 e01Var) {
        this.h = zk0Var;
        this.i = e01Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pk0
    public final Object a(qk0 qk0Var, m10 m10Var) throws Throwable {
        wk0 wk0Var;
        db2 db2Var;
        db2 db2Var2;
        if (m10Var instanceof wk0) {
            wk0Var = (wk0) m10Var;
            int i = wk0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                wk0Var.l = i - Integer.MIN_VALUE;
            } else {
                wk0Var = new wk0(this, m10Var);
            }
        } else {
            wk0Var = new wk0(this, m10Var);
        }
        Object obj = wk0Var.k;
        int i2 = wk0Var.l;
        j23 j23Var = j23.a;
        y20 y20Var = y20.h;
        try {
            try {
                if (i2 == 0) {
                    m02.y(obj);
                    zk0 zk0Var = this.h;
                    wk0Var.n = this;
                    wk0Var.o = qk0Var;
                    wk0Var.l = 1;
                    if (zk0Var.a(qk0Var, wk0Var) != y20Var) {
                    }
                    return y20Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        Throwable th = (Throwable) wk0Var.n;
                        m02.y(obj);
                        throw th;
                    }
                    if (i2 != 3) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    db2Var2 = (db2) wk0Var.n;
                    try {
                        m02.y(obj);
                        db2Var2.s();
                        return j23Var;
                    } catch (Throwable th2) {
                        th = th2;
                        db2Var2.s();
                        throw th;
                    }
                }
                qk0Var = wk0Var.o;
                this = (xk0) wk0Var.n;
                m02.y(obj);
                e01 e01Var = this.i;
                wk0Var.n = db2Var;
                wk0Var.o = null;
                wk0Var.l = 3;
                e01Var.c(db2Var, null, wk0Var);
                if (j23Var != y20Var) {
                    db2Var2 = db2Var;
                    db2Var2.s();
                    return j23Var;
                }
                return y20Var;
            } catch (Throwable th3) {
                th = th3;
                db2Var2 = db2Var;
                db2Var2.s();
                throw th;
            }
            o20 o20Var = wk0Var.i;
            o20Var.getClass();
            db2Var = new db2(qk0Var, o20Var);
        } catch (Throwable th4) {
            ox2 ox2Var = new ox2(th4);
            e01 e01Var2 = this.i;
            wk0Var.n = th4;
            wk0Var.o = null;
            wk0Var.l = 2;
            if (ys.N(ox2Var, e01Var2, th4, wk0Var) != y20Var) {
                throw th4;
            }
        }
    }
}
