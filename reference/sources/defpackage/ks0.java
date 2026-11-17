package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ks0 extends z23 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = kv.g;
    public List f;
    public boolean g;
    public l9 h;
    public vp0 i;
    public final p j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public ks0() {
        int i = k33.a;
        this.f = ag0.h;
        this.g = true;
        this.j = new p((Object) this, (byte) 25);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.z23
    public final void a(td0 td0Var) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = ke1.a();
                this.b = fArrA;
            } else {
                ke1.d(fArrA);
            }
            ke1.f(fArrA, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrA.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrA[0];
                float f3 = fArrA[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrA[1];
                float f8 = fArrA[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrA[2];
                float f12 = fArrA[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrA[3];
                float f16 = fArrA[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrA[0] = f4;
                fArrA[1] = f9;
                fArrA[2] = f13;
                fArrA[3] = f17;
                fArrA[4] = f6;
                fArrA[5] = f10;
                fArrA[6] = f14;
                fArrA[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.o;
            float f19 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f18;
                fArrA[1] = fArrA[1] * f18;
                fArrA[2] = fArrA[2] * f18;
                fArrA[3] = fArrA[3] * f18;
                fArrA[4] = fArrA[4] * f19;
                fArrA[5] = fArrA[5] * f19;
                fArrA[6] = fArrA[6] * f19;
                fArrA[7] = fArrA[7] * f19;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            ke1.f(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                l9 l9VarA = this.h;
                if (l9VarA == null) {
                    l9VarA = n9.a();
                    this.h = l9VarA;
                }
                lt.k0(this.f, l9VarA);
            }
            this.g = false;
        }
        eg egVarF = td0Var.F();
        long jQ = egVarF.q();
        egVarF.g().l();
        try {
            eg egVar = (eg) ((g2) egVarF.i).i;
            float[] fArr = this.b;
            if (fArr != null) {
                egVar.g().q(fArr);
            }
            l9 l9Var = this.h;
            if (!this.f.isEmpty() && l9Var != null) {
                egVar.g().s(l9Var);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((z23) arrayList.get(i)).a(td0Var);
            }
        } finally {
            wi0.r(egVarF, jQ);
        }
    }

    @Override // defpackage.z23
    public final vp0 b() {
        return this.i;
    }

    @Override // defpackage.z23
    public final void d(p pVar) {
        this.i = pVar;
    }

    public final void e(int i, z23 z23Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, z23Var);
        } else {
            arrayList.add(z23Var);
        }
        g(z23Var);
        z23Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (!this.d || j == 16) {
            return;
        }
        long j2 = this.e;
        if (j2 == 16) {
            this.e = j;
            return;
        }
        int i = k33.a;
        if (kv.g(j2) == kv.g(j) && kv.f(j2) == kv.f(j) && kv.d(j2) == kv.d(j)) {
            return;
        }
        this.d = false;
        this.e = kv.g;
    }

    public final void g(z23 z23Var) {
        if (!(z23Var instanceof av1)) {
            if (z23Var instanceof ks0) {
                ks0 ks0Var = (ks0) z23Var;
                if (ks0Var.d && this.d) {
                    f(ks0Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = kv.g;
                    return;
                }
            }
            return;
        }
        av1 av1Var = (av1) z23Var;
        zo zoVar = av1Var.b;
        if (this.d && zoVar != null) {
            if (zoVar instanceof rl2) {
                f(((rl2) zoVar).a);
            } else {
                this.d = false;
                this.e = kv.g;
            }
        }
        zo zoVar2 = av1Var.g;
        if (!this.d || zoVar2 == null) {
            return;
        }
        if (zoVar2 instanceof rl2) {
            f(((rl2) zoVar2).a);
        } else {
            this.d = false;
            this.e = kv.g;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            z23 z23Var = (z23) arrayList.get(i);
            sb.append("\t");
            sb.append(z23Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
