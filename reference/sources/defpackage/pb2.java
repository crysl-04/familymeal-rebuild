package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pb2 implements ob2 {
    public static final k42 l = new k42(new yx(28), new z82((byte) 5), 4);
    public final Map h;
    public final mj1 i;
    public qb2 j;
    public final z61 k;

    public pb2(Map map) {
        this.h = map;
        long[] jArr = bd2.a;
        this.i = new mj1();
        this.k = new z61(this, (byte) 15);
    }

    @Override // defpackage.ob2
    public final void b(Object obj, nx nxVar, dr0 dr0Var, int i) {
        int i2;
        dr0Var.W(533563200);
        if ((i & 6) == 0) {
            i2 = (dr0Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.h(nxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dr0Var.h(this) ? 256 : 128;
        }
        if (dr0Var.N(i2 & 1, (i2 & 147) != 146)) {
            dr0Var.X(obj);
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (objK == yyVar) {
                z61 z61Var = this.k;
                if (!((Boolean) z61Var.h(obj)).booleanValue()) {
                    li1.h("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                Map map = (Map) this.h.get(obj);
                ie0 ie0Var = sb2.a;
                tb2 tb2Var = new tb2(new rb2(map, z61Var));
                dr0Var.f0(tb2Var);
                objK = tb2Var;
            }
            tb2 tb2Var2 = (tb2) objK;
            ys.b(new i42[]{sb2.a.a(tb2Var2), rb1.a.a(tb2Var2)}, nxVar, dr0Var, 8 | (i2 & 112));
            boolean zH = dr0Var.h(this) | dr0Var.h(obj) | dr0Var.h(tb2Var2);
            Object objK2 = dr0Var.K();
            if (zH || objK2 == yyVar) {
                objK2 = new qb((Object) this, obj, (Object) tb2Var2, (byte) 14);
                dr0Var.f0(objK2);
            }
            h7.G(j23.a, (vp0) objK2, dr0Var);
            if (dr0Var.y && dr0Var.G.i == dr0Var.z) {
                dr0Var.z = -1;
                dr0Var.y = false;
            }
            dr0Var.p(false);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ha((Object) this, obj, (hq0) nxVar, i, (byte) 11);
        }
    }

    @Override // defpackage.ob2
    public final void f(Object obj) {
        if (this.i.l(obj) == null) {
            this.h.remove(obj);
        }
    }
}
