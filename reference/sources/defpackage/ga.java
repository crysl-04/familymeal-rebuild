package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ga extends qg1 implements pz, sd0, r31 {
    public kt A;
    public float B;
    public boolean D;
    public w92 F;
    public x92 G;
    public final hz0 v;
    public final boolean w;
    public final float x;
    public final o80 y;
    public final n80 z;
    public long C = 0;
    public final fj1 E = new fj1();

    public ga(hz0 hz0Var, boolean z, float f, o80 o80Var, n80 n80Var) {
        this.v = hz0Var;
        this.w = z;
        this.x = f;
        this.y = o80Var;
        this.z = n80Var;
    }

    @Override // defpackage.qg1
    public final void B0() {
        ie1.p(x0(), null, new h((Object) this, (m10) null, (byte) 29), 3);
    }

    @Override // defpackage.qg1
    public final void C0() {
        w92 w92Var = this.F;
        if (w92Var != null) {
            this.G = null;
            dt.H(this);
            k42 k42Var = w92Var.k;
            x92 x92Var = (x92) ((LinkedHashMap) k42Var.i).get(this);
            if (x92Var != null) {
                x92Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) k42Var.i;
                x92 x92Var2 = (x92) linkedHashMap.get(this);
                if (x92Var2 != null) {
                }
                linkedHashMap.remove(this);
                w92Var.j.add(x92Var);
            }
        }
    }

    public final void J0(o22 o22Var) {
        x92 x92Var;
        if (!(o22Var instanceof m22)) {
            if (o22Var instanceof n22) {
                x92 x92Var2 = this.G;
                if (x92Var2 != null) {
                    x92Var2.d();
                    return;
                }
                return;
            }
            if (!(o22Var instanceof l22) || (x92Var = this.G) == null) {
                return;
            }
            x92Var.d();
            return;
        }
        m22 m22Var = (m22) o22Var;
        long j = this.C;
        float f = this.B;
        w92 w92Var = this.F;
        if (w92Var == null) {
            Object obj = (View) vs.z(this, i7.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    li1.h("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    w92 w92Var2 = new w92(viewGroup.getContext());
                    viewGroup.addView(w92Var2);
                    w92Var = w92Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof w92) {
                        w92Var = (w92) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.F = w92Var;
        }
        ArrayList arrayList = w92Var.i;
        k42 k42Var = w92Var.k;
        LinkedHashMap linkedHashMap = (LinkedHashMap) k42Var.i;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) k42Var.i;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) k42Var.j;
        x92 x92Var3 = (x92) linkedHashMap.get(this);
        byte b = 1;
        if (x92Var3 == null) {
            ArrayList arrayList2 = w92Var.j;
            arrayList2.getClass();
            x92Var3 = (x92) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (x92Var3 == null) {
                if (w92Var.l > lt.H(arrayList)) {
                    x92Var3 = new x92(w92Var.getContext());
                    w92Var.addView(x92Var3);
                    arrayList.add(x92Var3);
                } else {
                    x92Var3 = (x92) arrayList.get(w92Var.l);
                    ga gaVar = (ga) linkedHashMap3.get(x92Var3);
                    if (gaVar != null) {
                        gaVar.G = null;
                        dt.H(gaVar);
                        x92 x92Var4 = (x92) linkedHashMap2.get(gaVar);
                        if (x92Var4 != null) {
                        }
                        linkedHashMap2.remove(gaVar);
                        x92Var3.c();
                    }
                }
                int i2 = w92Var.l;
                if (i2 < w92Var.h - 1) {
                    w92Var.l = i2 + 1;
                } else {
                    w92Var.l = 0;
                }
            }
            linkedHashMap2.put(this, x92Var3);
            linkedHashMap3.put(x92Var3, this);
        }
        x92 x92Var5 = x92Var3;
        int iX = ie1.x(f);
        long jA = this.y.a();
        this.z.a();
        x92Var5.b(m22Var, this.w, j, iX, jA, new o9(this, b));
        this.G = x92Var5;
        dt.H(this);
    }

    @Override // defpackage.sd0
    public final void O(n41 n41Var) {
        yq yqVar = n41Var.h;
        n41Var.a();
        kt ktVar = this.A;
        if (ktVar != null) {
            float f = this.B;
            long jA = this.y.a();
            float fFloatValue = ((Number) ((tb) ktVar.c).d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jB = kv.b(fFloatValue, jA);
                if (ktVar.a) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (yqVar.d() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (yqVar.d() & 4294967295L));
                    eg egVar = yqVar.i;
                    long jQ = egVar.q();
                    egVar.g().l();
                    try {
                        ((eg) ((g2) egVar.i).i).g().f(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        td0.e0(n41Var, jB, f, 0L, 124);
                        wi0.r(egVar, jQ);
                    } catch (Throwable th) {
                        wi0.r(egVar, jQ);
                        throw th;
                    }
                } else {
                    td0.e0(n41Var, jB, f, 0L, 124);
                }
            }
        }
        wq wqVarG = yqVar.i.g();
        x92 x92Var = this.G;
        if (x92Var != null) {
            long j = this.C;
            int iX = ie1.x(this.B);
            long jA2 = this.y.a();
            this.z.a();
            x92Var.e(iX, j, jA2);
            x92Var.draw(b6.a(wqVarG));
        }
    }

    @Override // defpackage.r31, defpackage.cf1
    public final void c(long j) {
        float fA;
        this.D = true;
        e90 e90Var = cu.Y(this).E;
        this.C = ou.G(j);
        float f = this.x;
        if (Float.isNaN(f)) {
            long j2 = this.C;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            fA = up1.c((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)) / 2.0f;
            if (this.w) {
                fA += e90Var.A(10.0f);
            }
        } else {
            fA = e90Var.A(f);
        }
        this.B = fA;
        fj1 fj1Var = this.E;
        Object[] objArr = fj1Var.a;
        int i = fj1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            J0((o22) objArr[i2]);
        }
        fj1Var.d();
    }

    @Override // defpackage.qg1
    public final boolean y0() {
        return false;
    }
}
