package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class i02 {
    public static final ie0 a = new ie0(new jw0((byte) 29), (byte) 1);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(k81 k81Var, b9 b9Var, n10 n10Var) {
        g02 g02Var;
        if (n10Var instanceof g02) {
            g02Var = (g02) n10Var;
            int i = g02Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                g02Var.l = i - Integer.MIN_VALUE;
            } else {
                g02Var = new g02(n10Var);
            }
        } else {
            g02Var = new g02(n10Var);
        }
        Object obj = g02Var.k;
        int i2 = g02Var.l;
        if (i2 != 0) {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                m02.y(obj);
                wg.k();
                return;
            }
        }
        m02.y(obj);
        if (!k81Var.h.u) {
            wg.m("establishTextInputSession called from an unattached node");
            return;
        }
        t6 t6VarZ = cu.Z(k81Var);
        dx1 dx1Var = (dx1) cu.Y(k81Var).H;
        dx1Var.getClass();
        if (dt.M(dx1Var, a) != null) {
            li1.c();
        } else {
            g02Var.l = 1;
            b(t6VarZ, b9Var, g02Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(t6 t6Var, b9 b9Var, n10 n10Var) {
        h02 h02Var;
        if (n10Var instanceof h02) {
            h02Var = (h02) n10Var;
            int i = h02Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                h02Var.l = i - Integer.MIN_VALUE;
            } else {
                h02Var = new h02(n10Var);
            }
        } else {
            h02Var = new h02(n10Var);
        }
        Object obj = h02Var.k;
        int i2 = h02Var.l;
        if (i2 == 0) {
            m02.y(obj);
            h02Var.l = 1;
            t6Var.I(b9Var, h02Var);
        } else if (i2 == 1) {
            m02.y(obj);
            wg.k();
        } else if (i2 != 2) {
            li1.g("call to 'resume' before 'invoke' with coroutine");
        } else {
            m02.y(obj);
            wg.k();
        }
    }
}
