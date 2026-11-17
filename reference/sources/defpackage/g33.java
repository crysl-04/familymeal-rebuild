package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g33 extends z23 {
    public final ks0 b;
    public String c;
    public boolean d;
    public final qd0 e;
    public kp0 f;
    public final lu1 g;
    public ln h;
    public final lu1 i;
    public long j;
    public float k;
    public float l;
    public final f33 m;

    public g33(ks0 ks0Var) {
        this.b = ks0Var;
        ks0Var.i = new f33(this, (byte) 0);
        this.c = "";
        this.d = true;
        this.e = new qd0();
        this.f = new n62((byte) 20);
        this.g = rz1.x(null);
        this.i = rz1.x(new wj2(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new f33(this, (byte) 1);
    }

    @Override // defpackage.z23
    public final void a(td0 td0Var) {
        e(td0Var, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final void e(td0 td0Var, float f, ln lnVar) {
        ?? r3;
        ln lnVar2;
        t8 t8VarD;
        char c;
        long j;
        long jB;
        ln lnVar3;
        int i;
        int i2;
        ks0 ks0Var = this.b;
        boolean z = ks0Var.d;
        lu1 lu1Var = this.g;
        if (!z || ks0Var.e == 16) {
            r3 = 0;
        } else {
            ln lnVar4 = (ln) lu1Var.getValue();
            int i3 = k33.a;
            if (!(lnVar4 instanceof ln) ? lnVar4 == null : (i2 = lnVar4.c) == 5 || i2 == 3) {
                r3 = 0;
            } else if (!(lnVar instanceof ln) ? lnVar == null : (i = lnVar.c) == 5 || i == 3) {
                r3 = 0;
            } else {
                r3 = 1;
            }
        }
        boolean z2 = this.d;
        qd0 qd0Var = this.e;
        if (z2 || !wj2.a(this.j, td0Var.d())) {
            if (r3 == 1) {
                jB = ks0Var.e;
                int i4 = k33.a;
                if (kv.c(jB) != 1.0f) {
                    jB = kv.b(1.0f, jB);
                }
                lnVar2 = new ln(5, jB);
            } else {
                lnVar2 = null;
            }
            this.h = lnVar2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (td0Var.d() >> 32));
            lu1 lu1Var2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((wj2) lu1Var2.getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int) (td0Var.d() & 4294967295L)) / Float.intBitsToFloat((int) (((wj2) lu1Var2.getValue()).a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (td0Var.d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (td0Var.d() & 4294967295L))))) & 4294967295L);
            u31 layoutDirection = td0Var.getLayoutDirection();
            t8VarD = qd0Var.a;
            a6 a6Var = qd0Var.b;
            if (t8VarD != null || a6Var == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i5 = (int) (jCeil >> 32);
                Bitmap bitmap = t8VarD.a;
                c = ' ';
                j = 4294967295L;
                if (i5 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || qd0Var.d != r3) {
                }
                qd0Var.c = jCeil;
                yq yqVar = qd0Var.e;
                xq xqVar = yqVar.h;
                long jG = ou.G(jCeil);
                e90 e90Var = xqVar.a;
                u31 u31Var = xqVar.b;
                wq wqVar = xqVar.c;
                a6 a6Var2 = a6Var;
                long j2 = xqVar.d;
                xqVar.a = td0Var;
                xqVar.b = layoutDirection;
                xqVar.c = a6Var2;
                xqVar.d = jG;
                a6Var2.l();
                td0.H(yqVar, kv.b, 0L, 62);
                this.m.h(yqVar);
                a6Var2.i();
                xqVar.a = e90Var;
                xqVar.b = u31Var;
                xqVar.c = wqVar;
                xqVar.d = j2;
                t8VarD.a.prepareToDraw();
                this.d = false;
                this.j = td0Var.d();
            }
            t8VarD = ls.d((int) (jCeil >> c), (int) (jCeil & j), r3);
            Canvas canvas = b6.a;
            a6Var = new a6();
            a6Var.a = new Canvas(ie1.d(t8VarD));
            qd0Var.a = t8VarD;
            qd0Var.b = a6Var;
            qd0Var.d = r3;
            qd0Var.c = jCeil;
            yq yqVar2 = qd0Var.e;
            xq xqVar2 = yqVar2.h;
            long jG2 = ou.G(jCeil);
            e90 e90Var2 = xqVar2.a;
            u31 u31Var2 = xqVar2.b;
            wq wqVar2 = xqVar2.c;
            a6 a6Var3 = a6Var;
            long j3 = xqVar2.d;
            xqVar2.a = td0Var;
            xqVar2.b = layoutDirection;
            xqVar2.c = a6Var3;
            xqVar2.d = jG2;
            a6Var3.l();
            td0.H(yqVar2, kv.b, 0L, 62);
            this.m.h(yqVar2);
            a6Var3.i();
            xqVar2.a = e90Var2;
            xqVar2.b = u31Var2;
            xqVar2.c = wqVar2;
            xqVar2.d = j3;
            t8VarD.a.prepareToDraw();
            this.d = false;
            this.j = td0Var.d();
        } else {
            t8 t8Var = qd0Var.a;
            if (r3 != (t8Var != null ? t8Var.a() : 0)) {
                if (r3 == 1) {
                    jB = ks0Var.e;
                    int i6 = k33.a;
                    if (kv.c(jB) != 1.0f) {
                        jB = kv.b(1.0f, jB);
                    }
                    lnVar2 = new ln(5, jB);
                } else {
                    lnVar2 = null;
                }
                this.h = lnVar2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (td0Var.d() >> 32));
                lu1 lu1Var3 = this.i;
                this.k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((wj2) lu1Var3.getValue()).a >> 32));
                this.l = Float.intBitsToFloat((int) (td0Var.d() & 4294967295L)) / Float.intBitsToFloat((int) (((wj2) lu1Var3.getValue()).a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (td0Var.d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (td0Var.d() & 4294967295L))))) & 4294967295L);
                u31 layoutDirection2 = td0Var.getLayoutDirection();
                t8VarD = qd0Var.a;
                a6 a6Var4 = qd0Var.b;
                if (t8VarD != null) {
                    c = ' ';
                    j = 4294967295L;
                    t8VarD = ls.d((int) (jCeil2 >> c), (int) (jCeil2 & j), r3);
                    Canvas canvas2 = b6.a;
                    a6Var4 = new a6();
                    a6Var4.a = new Canvas(ie1.d(t8VarD));
                    qd0Var.a = t8VarD;
                    qd0Var.b = a6Var4;
                    qd0Var.d = r3;
                } else {
                    c = ' ';
                    j = 4294967295L;
                    t8VarD = ls.d((int) (jCeil2 >> c), (int) (jCeil2 & j), r3);
                    Canvas canvas3 = b6.a;
                    a6Var4 = new a6();
                    a6Var4.a = new Canvas(ie1.d(t8VarD));
                    qd0Var.a = t8VarD;
                    qd0Var.b = a6Var4;
                    qd0Var.d = r3;
                }
                qd0Var.c = jCeil2;
                yq yqVar3 = qd0Var.e;
                xq xqVar3 = yqVar3.h;
                long jG3 = ou.G(jCeil2);
                e90 e90Var3 = xqVar3.a;
                u31 u31Var3 = xqVar3.b;
                wq wqVar3 = xqVar3.c;
                a6 a6Var5 = a6Var4;
                long j4 = xqVar3.d;
                xqVar3.a = td0Var;
                xqVar3.b = layoutDirection2;
                xqVar3.c = a6Var5;
                xqVar3.d = jG3;
                a6Var5.l();
                td0.H(yqVar3, kv.b, 0L, 62);
                this.m.h(yqVar3);
                a6Var5.i();
                xqVar3.a = e90Var3;
                xqVar3.b = u31Var3;
                xqVar3.c = wqVar3;
                xqVar3.d = j4;
                t8VarD.a.prepareToDraw();
                this.d = false;
                this.j = td0Var.d();
            }
        }
        if (lnVar != null) {
            lnVar3 = lnVar;
        } else {
            lnVar3 = ((ln) lu1Var.getValue()) != null ? (ln) lu1Var.getValue() : this.h;
        }
        t8 t8Var2 = qd0Var.a;
        if (t8Var2 == null) {
            ax0.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        td0.T(td0Var, t8Var2, qd0Var.c, 0L, f, lnVar3, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        lu1 lu1Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((wj2) lu1Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((wj2) lu1Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
