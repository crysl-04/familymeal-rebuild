package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c81 {
    public static final u71 a = new u71(null, 0, false, 0.0f, new e61((byte) 1), 0.0f, false, vs.b(xf0.h), ls.c(), l00.b(0, 0, 0, 0, 15), 0, ag0.h, 0, 0, 0, ks1.h, 0, 0);

    public static final b81 a(int i, dr0 dr0Var, int i2) {
        byte b = 1;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        k42 k42Var = b81.y;
        boolean zD = dr0Var.d(i) | dr0Var.d(0);
        Object objK = dr0Var.K();
        if (zD || objK == zy.a) {
            objK = new d61(i, b);
            dr0Var.f0(objK);
        }
        return (b81) rz1.B(objArr, k42Var, (kp0) objK, dr0Var, 0);
    }
}
