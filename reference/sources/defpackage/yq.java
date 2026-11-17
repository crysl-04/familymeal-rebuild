package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yq implements td0 {
    public final xq h;
    public final eg i;
    public e9 j;
    public e9 k;

    public yq() {
        h90 h90Var = t03.u;
        xq xqVar = new xq();
        xqVar.a = h90Var;
        xqVar.b = u31.h;
        xqVar.c = vf0.a;
        xqVar.d = 0L;
        this.h = xqVar;
        this.i = new eg(this);
    }

    public static e9 a(yq yqVar, long j, ud0 ud0Var, int i) {
        e9 e9VarE = yqVar.e(ud0Var);
        Paint paint = (Paint) e9VarE.b;
        long jA = t93.a.a(paint);
        int i2 = kv.h;
        if (!r13.a(jA, j)) {
            e9VarE.e(j);
        }
        if (((Shader) e9VarE.c) != null) {
            e9VarE.h(null);
        }
        if (!uz0.g((ln) e9VarE.d, null)) {
            e9VarE.f(null);
        }
        if (e9VarE.a != i) {
            e9VarE.d(i);
        }
        if (paint.isFilterBitmap()) {
            return e9VarE;
        }
        e9VarE.g(1);
        return e9VarE;
    }

    @Override // defpackage.td0
    public final eg F() {
        return this.i;
    }

    @Override // defpackage.td0
    public final void P(t8 t8Var, long j, long j2, long j3, float f, ln lnVar, int i) {
        this.h.c.e(t8Var, j, j2, j3, c(null, xi0.a, f, lnVar, 3, i));
    }

    @Override // defpackage.td0
    public final void Z(l9 l9Var, long j, ud0 ud0Var) {
        this.h.c.h(l9Var, a(this, j, ud0Var, 3));
    }

    @Override // defpackage.e90
    public final float b() {
        return this.h.a.b();
    }

    public final e9 c(zo zoVar, ud0 ud0Var, float f, ln lnVar, int i, int i2) {
        e9 e9VarE = e(ud0Var);
        Paint paint = (Paint) e9VarE.b;
        if (zoVar != null) {
            zoVar.a(f, d(), e9VarE);
        } else {
            if (((Shader) e9VarE.c) != null) {
                e9VarE.h(null);
            }
            long jA = t93.a.a(paint);
            long j = kv.b;
            if (!r13.a(jA, j)) {
                e9VarE.e(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                e9VarE.c(f);
            }
        }
        if (!uz0.g((ln) e9VarE.d, lnVar)) {
            e9VarE.f(lnVar);
        }
        if (e9VarE.a != i) {
            e9VarE.d(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return e9VarE;
        }
        e9VarE.g(i2);
        return e9VarE;
    }

    public final e9 e(ud0 ud0Var) {
        if (uz0.g(ud0Var, xi0.a)) {
            e9 e9Var = this.j;
            if (e9Var != null) {
                return e9Var;
            }
            e9 e9VarD = aa3.d();
            e9VarD.l(0);
            this.j = e9VarD;
            return e9VarD;
        }
        if (!(ud0Var instanceof ko2)) {
            wg.n();
            return null;
        }
        e9 e9VarD2 = this.k;
        if (e9VarD2 == null) {
            e9VarD2 = aa3.d();
            e9VarD2.l(1);
            this.k = e9VarD2;
        }
        Paint paint = (Paint) e9VarD2.b;
        float strokeWidth = paint.getStrokeWidth();
        ko2 ko2Var = (ko2) ud0Var;
        float f = ko2Var.a;
        if (strokeWidth != f) {
            e9VarD2.k(f);
        }
        int iA = e9VarD2.a();
        int i = ko2Var.c;
        if (iA != i) {
            e9VarD2.i(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = ko2Var.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iB = e9VarD2.b();
        int i2 = ko2Var.d;
        if (iB == i2) {
            return e9VarD2;
        }
        e9VarD2.j(i2);
        return e9VarD2;
    }

    @Override // defpackage.td0
    public final u31 getLayoutDirection() {
        return this.h.b;
    }

    @Override // defpackage.td0
    public final void h(l9 l9Var, zo zoVar, float f, ud0 ud0Var, int i) {
        this.h.c.h(l9Var, c(zoVar, ud0Var, f, null, i, 1));
    }

    @Override // defpackage.td0
    public final void i0(long j, long j2, long j3, float f) {
        wq wqVar = this.h.c;
        e9 e9VarD = this.k;
        if (e9VarD == null) {
            e9VarD = aa3.d();
            e9VarD.l(1);
            this.k = e9VarD;
        }
        Paint paint = (Paint) e9VarD.b;
        long jA = t93.a.a(paint);
        int i = kv.h;
        if (!r13.a(jA, j)) {
            e9VarD.e(j);
        }
        if (((Shader) e9VarD.c) != null) {
            e9VarD.h(null);
        }
        if (!uz0.g((ln) e9VarD.d, null)) {
            e9VarD.f(null);
        }
        if (e9VarD.a != 3) {
            e9VarD.d(3);
        }
        if (paint.getStrokeWidth() != f) {
            e9VarD.k(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (e9VarD.a() != 0) {
            e9VarD.i(0);
        }
        if (e9VarD.b() != 0) {
            e9VarD.j(0);
        }
        if (!paint.isFilterBitmap()) {
            e9VarD.g(1);
        }
        wqVar.m(j2, j3, e9VarD);
    }

    @Override // defpackage.e90
    public final float n() {
        return this.h.a.n();
    }

    @Override // defpackage.td0
    public final void s(float f, long j, long j2) {
        this.h.c.d(f, j2, a(this, j, xi0.a, 3));
    }

    @Override // defpackage.td0
    public final void v0(long j, float f, float f2, long j2, long j3, ud0 ud0Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.h.c.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, ud0Var, 3));
    }

    @Override // defpackage.td0
    public final void y(long j, long j2, int i, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.h.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, xi0.a, i));
    }

    @Override // defpackage.td0
    public final void z(long j, long j2, long j3, long j4, ud0 ud0Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.h.c.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, ud0Var, 3));
    }
}
