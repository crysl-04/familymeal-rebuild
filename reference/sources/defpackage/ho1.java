package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ho1 {
    public final qe2 a;
    public final zp0 b;
    public e90 c;
    public boolean d;
    public final ix0 e = new ix0((byte) 9);

    public ho1(qe2 qe2Var, zp0 zp0Var, e90 e90Var) {
        this.a = qe2Var;
        this.b = zp0Var;
        this.c = e90Var;
    }

    public static void a(q02 q02Var) {
        List list = q02Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((z02) list.get(i)).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zp0 zp0Var, n10 n10Var) throws Throwable {
        go1 go1Var;
        if (n10Var instanceof go1) {
            go1Var = (go1) n10Var;
            int i = go1Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                go1Var.m = i - Integer.MIN_VALUE;
            } else {
                go1Var = new go1(this, n10Var);
            }
        } else {
            go1Var = new go1(this, n10Var);
        }
        Object obj = go1Var.k;
        int i2 = go1Var.m;
        m10 m10Var = null;
        if (i2 == 0) {
            m02.y(obj);
            this.d = true;
            h hVar = new h(this, zp0Var, m10Var, (byte) 22);
            go1Var.m = 1;
            o20 o20Var = go1Var.i;
            o20Var.getClass();
            tp2 tp2Var = new tp2(go1Var, o20Var);
            Object objD = r02.D(tp2Var, tp2Var, hVar);
            y20 y20Var = y20.h;
            if (objD == y20Var) {
                return y20Var;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(obj);
        }
        this.d = false;
        return j23.a;
    }
}
