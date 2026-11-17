package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zy2 extends ho1 {
    public final fp f;
    public dn2 g;

    public zy2(qe2 qe2Var, mx mxVar, e90 e90Var) {
        super(qe2Var, mxVar, e90Var);
        this.f = ls.a(Integer.MAX_VALUE, 6, null);
    }

    public static xy2 e(fp fpVar) {
        xy2 xy2Var = null;
        oh2 oh2VarU = rz1.u(new io1(new ih1(fpVar, (byte) 1), null));
        while (oh2VarU.hasNext()) {
            xy2 xy2VarA = (xy2) oh2VarU.next();
            if (xy2Var != null) {
                xy2VarA = xy2Var.a(xy2VarA);
            }
            xy2Var = xy2VarA;
        }
        return xy2Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00da, code lost:
    
        if (r16.b.f(r0, r6) == r10) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.qe2 r17, defpackage.xy2 r18, defpackage.n10 r19) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy2.c(qe2, xy2, n10):java.lang.Object");
    }

    public final boolean d(q02 q02Var) {
        boolean z;
        boolean z2;
        boolean z3;
        fp fpVar;
        qe2 qe2Var;
        z02 z02Var = (z02) dv.y0(q02Var.a);
        if (z02Var != null) {
            List listB = z02Var.b();
            int size = listB.size();
            int i = 0;
            z3 = false;
            while (true) {
                fpVar = this.f;
                qe2Var = this.a;
                if (i >= size) {
                    break;
                }
                ft0 ft0Var = (ft0) listB.get(i);
                long j = ft0Var.d ^ (-9223372034707292160L);
                if (!(qe2Var.j(qe2Var.f(j)) == 0.0f)) {
                    z3 = !(fpVar.s(new xy2(j, ft0Var.a, false)) instanceof ns) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = z02Var.l ^ (-9223372034707292160L);
            boolean z4 = q02Var.f == 12;
            if (!(qe2Var.j(qe2Var.f(j2)) == 0.0f) || z4) {
                if (!(fpVar.s(new xy2(j2, z02Var.b, z4)) instanceof ns) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
