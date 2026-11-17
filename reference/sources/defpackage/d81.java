package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class d81 implements qb2, ob2 {
    public final rb2 h;
    public final pb2 i;
    public final nj1 j;

    public d81(qb2 qb2Var, Map map, pb2 pb2Var) {
        z61 z61Var = new z61(qb2Var, (byte) 4);
        ie0 ie0Var = sb2.a;
        this.h = new rb2(map, z61Var);
        this.i = pb2Var;
        nj1 nj1Var = cd2.a;
        this.j = new nj1();
    }

    @Override // defpackage.qb2
    public final eg a(String str, kp0 kp0Var) {
        return this.h.a(str, kp0Var);
    }

    @Override // defpackage.ob2
    public final void b(Object obj, nx nxVar, dr0 dr0Var, int i) {
        int i2;
        dr0Var.W(-858296452);
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
            this.i.b(obj, nxVar, dr0Var, i2 & 126);
            boolean zH = dr0Var.h(this) | dr0Var.h(obj);
            Object objK = dr0Var.K();
            if (zH || objK == zy.a) {
                objK = new g(this, obj, (byte) 19);
                dr0Var.f0(objK);
            }
            h7.G(obj, (vp0) objK, dr0Var);
        } else {
            dr0Var.Q();
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new ha((Object) this, obj, (hq0) nxVar, i, (byte) 8);
        }
    }

    @Override // defpackage.qb2
    public final boolean c(Object obj) {
        return this.h.c(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // defpackage.qb2
    public final Map d() {
        nj1 nj1Var = this.j;
        Object[] objArr = nj1Var.b;
        long[] jArr = nj1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.i.f(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.h.d();
    }

    @Override // defpackage.qb2
    public final Object e(String str) {
        return this.h.e(str);
    }

    @Override // defpackage.ob2
    public final void f(Object obj) {
        this.i.f(obj);
    }
}
