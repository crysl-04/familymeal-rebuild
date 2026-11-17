package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class li2 {
    public final pa2 a;
    public final pa2 b;
    public final pa2 c;
    public final pa2 d;
    public final pa2 e;
    public final pa2 f;
    public final pa2 g;
    public final pa2 h;

    public li2() {
        pa2 pa2Var = ii2.a;
        pa2 pa2Var2 = ii2.b;
        pa2 pa2Var3 = ii2.c;
        pa2 pa2Var4 = ii2.d;
        pa2 pa2Var5 = ii2.f;
        pa2 pa2Var6 = ii2.e;
        pa2 pa2Var7 = ii2.g;
        pa2 pa2Var8 = ii2.h;
        this.a = pa2Var;
        this.b = pa2Var2;
        this.c = pa2Var3;
        this.d = pa2Var4;
        this.e = pa2Var5;
        this.f = pa2Var6;
        this.g = pa2Var7;
        this.h = pa2Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li2)) {
            return false;
        }
        li2 li2Var = (li2) obj;
        return uz0.g(this.a, li2Var.a) && uz0.g(this.b, li2Var.b) && uz0.g(this.c, li2Var.c) && uz0.g(this.d, li2Var.d) && uz0.g(this.e, li2Var.e) && uz0.g(this.f, li2Var.f) && uz0.g(this.g, li2Var.g) && uz0.g(this.h, li2Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
