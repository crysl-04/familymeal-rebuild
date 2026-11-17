package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class db extends TextPaint {
    public e9 a;
    public vt2 b;
    public byte c;
    public ei2 d;
    public kv e;
    public zo f;
    public o90 g;
    public wj2 h;
    public ud0 i;

    public final e9 a() {
        e9 e9Var = this.a;
        if (e9Var != null) {
            return e9Var;
        }
        e9 e9Var2 = new e9(this);
        this.a = e9Var2;
        return e9Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().d(i);
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    public final void c(zo zoVar, long j, float f) {
        if (zoVar == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (zoVar instanceof rl2) {
            d(m02.r(f, ((rl2) zoVar).a));
            return;
        }
        if (!(zoVar instanceof ap)) {
            wg.n();
            return;
        }
        if (uz0.g(this.f, zoVar)) {
            wj2 wj2Var = this.h;
            if (!(wj2Var == null ? false : wj2.a(wj2Var.a, j))) {
                if (j != 9205357640488583168L) {
                    this.f = zoVar;
                    this.h = new wj2(j);
                    this.g = il2.b(new o9(zoVar, j));
                }
            }
        } else if (j != 9205357640488583168L) {
            this.f = zoVar;
            this.h = new wj2(j);
            this.g = il2.b(new o9(zoVar, j));
        }
        e9 e9VarA = a();
        o90 o90Var = this.g;
        e9VarA.h(o90Var != null ? (Shader) o90Var.getValue() : null);
        this.e = null;
        tz0.G(this, f);
    }

    public final void d(long j) {
        kv kvVar = this.e;
        if ((kvVar == null ? false : r13.a(kvVar.a, j)) || j == 16) {
            return;
        }
        this.e = new kv(j);
        setColor(cu.c0(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(ud0 ud0Var) {
        if (ud0Var == null || uz0.g(this.i, ud0Var)) {
            return;
        }
        this.i = ud0Var;
        if (ud0Var.equals(xi0.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(ud0Var instanceof ko2)) {
            wg.n();
            return;
        }
        a().l(1);
        ko2 ko2Var = (ko2) ud0Var;
        a().k(ko2Var.a);
        e9 e9VarA = a();
        ((Paint) e9VarA.b).setStrokeMiter(ko2Var.b);
        a().j(ko2Var.d);
        a().i(ko2Var.c);
        ((Paint) a().b).setPathEffect(null);
    }

    public final void f(ei2 ei2Var) {
        if (ei2Var == null || uz0.g(this.d, ei2Var)) {
            return;
        }
        this.d = ei2Var;
        if (ei2Var.equals(ei2.d)) {
            clearShadowLayer();
            return;
        }
        ei2 ei2Var2 = this.d;
        float f = ei2Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (ei2Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), cu.c0(this.d.a));
    }

    public final void g(vt2 vt2Var) {
        if (vt2Var == null || uz0.g(this.b, vt2Var)) {
            return;
        }
        this.b = vt2Var;
        int i = vt2Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
