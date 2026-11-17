package defpackage;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class av1 extends z23 {
    public zo b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public zo g;
    public byte h;
    public byte i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ko2 q;
    public final l9 r;
    public l9 s;
    public l9 t;
    public final d51 u;

    public av1() {
        int i = k33.a;
        this.d = ag0.h;
        this.e = 1.0f;
        this.h = (byte) 0;
        this.i = (byte) 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        l9 l9VarA = n9.a();
        this.r = l9VarA;
        this.s = l9VarA;
        this.u = vs.N(g81.i, new jw0((byte) 23));
    }

    @Override // defpackage.z23
    public final void a(td0 td0Var) {
        td0 td0Var2;
        ko2 ko2Var;
        if (this.n) {
            lt.k0(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        zo zoVar = this.b;
        if (zoVar != null) {
            td0Var2 = td0Var;
            td0.f(td0Var2, this.s, zoVar, this.c, null, 56);
        } else {
            td0Var2 = td0Var;
        }
        zo zoVar2 = this.g;
        if (zoVar2 != null) {
            ko2 ko2Var2 = this.q;
            if (this.o || ko2Var2 == null) {
                ko2 ko2Var3 = new ko2(this.f, this.j, this.h, this.i, 16);
                this.q = ko2Var3;
                this.o = false;
                ko2Var = ko2Var3;
            } else {
                ko2Var = ko2Var2;
            }
            td0.f(td0Var2, this.s, zoVar2, this.e, ko2Var, 48);
        }
    }

    public final void e() {
        float f = this.k;
        l9 l9Var = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = l9Var;
            return;
        }
        l9 l9Var2 = this.s;
        if (l9Var2 != l9Var) {
            Path.FillType fillType = l9Var2.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.s.a.rewind();
            Path path = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        } else {
            this.s = n9.a();
        }
        d51 d51Var = this.u;
        ((m9) d51Var.getValue()).a.setPath(l9Var.a, false);
        float length = ((m9) d51Var.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((m9) d51Var.getValue()).a(f4, f5, this.s);
            return;
        }
        l9 l9VarA = this.t;
        if (l9VarA == null) {
            l9VarA = n9.a();
            this.t = l9VarA;
        }
        l9VarA.f();
        ((m9) d51Var.getValue()).a(f4, length, l9VarA);
        l9.a(this.s, l9VarA);
        l9VarA.f();
        ((m9) d51Var.getValue()).a(0.0f, f5, l9VarA);
        l9.a(this.s, l9VarA);
    }

    public final String toString() {
        return this.r.toString();
    }
}
