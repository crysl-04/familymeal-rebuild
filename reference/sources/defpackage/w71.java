package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w71 implements wd2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w71(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj2;
        this.b = obj;
    }

    public static int b(w71 w71Var, int i) {
        Object obj;
        b81 b81Var = (b81) w71Var.c;
        u71 u71VarJ = b81Var.j();
        if (!u71VarJ.l.isEmpty()) {
            int iH = b81Var.h();
            if (i > w71Var.c() || iH > i) {
                return ((i - b81Var.h()) * lt.n0(u71VarJ)) - b81Var.i();
            }
            List list = u71VarJ.l;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj = null;
                    break;
                }
                obj = list.get(i2);
                if (((v71) obj).a == i) {
                    break;
                }
                i2++;
            }
            v71 v71Var = (v71) obj;
            if (v71Var != null) {
                return v71Var.l;
            }
        }
        return 0;
    }

    @Override // defpackage.wd2
    public final float a(float f) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((wd2) obj).a(f);
            default:
                qe2 qe2Var = (qe2) obj;
                if (Math.abs(f) == 0.0f || ((Boolean) qe2Var.h.a()).booleanValue()) {
                    return qe2Var.e(qe2Var.h(((oe2) this.c).a(2, qe2Var.f(qe2Var.i(f)))));
                }
                throw new wj0("The fling animation was cancelled", (byte) 0);
        }
    }

    public final int c() {
        v71 v71Var = (v71) dv.G0(((b81) this.c).j().l);
        if (v71Var != null) {
            return v71Var.a;
        }
        return 0;
    }
}
