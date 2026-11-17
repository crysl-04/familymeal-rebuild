package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qz2 {
    public final qy a;
    public final qz2 b;
    public final String c;
    public final lu1 d;
    public final lu1 f;
    public final lu1 i;
    public final ll2 j;
    public final ll2 k;
    public final lu1 l;
    public final o90 m;
    public final lu1 e = rz1.x(null);
    public final ju1 g = new ju1(0);
    public final ju1 h = new ju1(Long.MIN_VALUE);

    public qz2(qy qyVar, qz2 qz2Var, String str) {
        this.a = qyVar;
        this.b = qz2Var;
        this.c = str;
        this.d = rz1.x(qyVar.g());
        this.f = rz1.x(new nz2(qyVar.g(), qyVar.g()));
        Boolean bool = Boolean.FALSE;
        this.i = rz1.x(bool);
        this.j = new ll2();
        this.k = new ll2();
        this.l = rz1.x(bool);
        this.m = il2.b(new jz2(this, (byte) 1));
        qyVar.o(this);
    }

    public final void a(Object obj, dr0 dr0Var, int i) {
        int i2;
        dr0Var.W(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? dr0Var.f(obj) : dr0Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dr0Var.f(this) ? 32 : 16;
        }
        byte b = 0;
        if (!dr0Var.N(i2 & 1, (i2 & 19) != 18)) {
            dr0Var.Q();
        } else if (g()) {
            dr0Var.V(467722849);
            dr0Var.p(false);
        } else {
            dr0Var.V(466062241);
            q(obj);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (z || objK == yyVar) {
                objK = il2.b(new jz2(this, b));
                dr0Var.f0(objK);
            }
            if (((Boolean) ((kn2) objK).getValue()).booleanValue()) {
                dr0Var.V(466470356);
                Object objK2 = dr0Var.K();
                if (objK2 == yyVar) {
                    objK2 = h7.Y(dr0Var);
                    dr0Var.f0(objK2);
                }
                x20 x20Var = (x20) objK2;
                boolean zH = dr0Var.h(x20Var) | (i3 == 32);
                Object objK3 = dr0Var.K();
                if (zH || objK3 == yyVar) {
                    objK3 = new uy1((Object) x20Var, (Object) this, (byte) 20);
                    dr0Var.f0(objK3);
                }
                h7.H(x20Var, this, (vp0) objK3, dr0Var);
                dr0Var.p(false);
            } else {
                dr0Var.V(467712929);
                dr0Var.p(false);
            }
            dr0Var.p(false);
        }
        e72 e72VarR = dr0Var.r();
        if (e72VarR != null) {
            e72VarR.d = new lx((byte) 6, i, this, obj);
        }
    }

    public final long b() {
        ll2 ll2Var = this.j;
        int size = ll2Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((oz2) ll2Var.get(i)).s.g());
        }
        ll2 ll2Var2 = this.k;
        int size2 = ll2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((qz2) ll2Var2.get(i2)).b());
        }
        return jMax;
    }

    public final void c() {
        ll2 ll2Var = this.j;
        int size = ll2Var.size();
        for (int i = 0; i < size; i++) {
            oz2 oz2Var = (oz2) ll2Var.get(i);
            oz2Var.m = null;
            oz2Var.l = null;
            oz2Var.p = false;
        }
        ll2 ll2Var2 = this.k;
        int size2 = ll2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((qz2) ll2Var2.get(i2)).c();
        }
    }

    public final boolean d() {
        ll2 ll2Var = this.j;
        int size = ll2Var.size();
        for (int i = 0; i < size; i++) {
            if (((oz2) ll2Var.get(i)).l != null) {
                return true;
            }
        }
        ll2 ll2Var2 = this.k;
        int size2 = ll2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((qz2) ll2Var2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        qz2 qz2Var = this.b;
        return qz2Var != null ? qz2Var.e() : this.g.g();
    }

    public final mz2 f() {
        return (mz2) this.f.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final void h(long j, boolean z) {
        ju1 ju1Var = this.h;
        long jG = ju1Var.g();
        qy qyVar = this.a;
        if (jG == Long.MIN_VALUE) {
            ju1Var.h(j);
            ((lu1) qyVar.a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((lu1) qyVar.a).getValue()).booleanValue()) {
            ((lu1) qyVar.a).setValue(Boolean.TRUE);
        }
        o(false);
        ll2 ll2Var = this.j;
        int size = ll2Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            oz2 oz2Var = (oz2) ll2Var.get(i);
            lu1 lu1Var = oz2Var.n;
            lu1 lu1Var2 = oz2Var.n;
            if (!((Boolean) lu1Var.getValue()).booleanValue()) {
                long jC = z ? oz2Var.a().c() : j;
                oz2Var.c(oz2Var.a().b(jC));
                oz2Var.r = oz2Var.a().f(jC);
                if (oz2Var.a().g(jC)) {
                    lu1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) lu1Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        ll2 ll2Var2 = this.k;
        int size2 = ll2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            qz2 qz2Var = (qz2) ll2Var2.get(i2);
            lu1 lu1Var3 = qz2Var.d;
            qy qyVar2 = qz2Var.a;
            if (!uz0.g(lu1Var3.getValue(), qyVar2.g())) {
                qz2Var.h(j, z);
            }
            if (!uz0.g(qz2Var.d.getValue(), qyVar2.g())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.h.h(Long.MIN_VALUE);
        qy qyVar = this.a;
        if (qyVar instanceof tj1) {
            qyVar.n(this.d.getValue());
        }
        n(0L);
        ((lu1) qyVar.a).setValue(Boolean.FALSE);
        ll2 ll2Var = this.k;
        int size = ll2Var.size();
        for (int i = 0; i < size; i++) {
            ((qz2) ll2Var.get(i)).i();
        }
    }

    public final void j(float f) {
        ll2 ll2Var = this.j;
        int size = ll2Var.size();
        for (int i = 0; i < size; i++) {
            oz2 oz2Var = (oz2) ll2Var.get(i);
            oz2Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                os2 os2Var = oz2Var.m;
                if (os2Var != null) {
                    oz2Var.a().h(os2Var.c);
                    oz2Var.l = null;
                    oz2Var.m = null;
                }
                Object obj = f == -4.0f ? oz2Var.a().d : oz2Var.a().c;
                oz2Var.a().h(obj);
                oz2Var.a().i(obj);
                oz2Var.c(obj);
                oz2Var.s.h(oz2Var.a().c());
            } else {
                oz2Var.o.h(f);
            }
        }
        ll2 ll2Var2 = this.k;
        int size2 = ll2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((qz2) ll2Var2.get(i2)).j(f);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.h.h(Long.MIN_VALUE);
        qy qyVar = this.a;
        ((lu1) qyVar.a).setValue(Boolean.FALSE);
        boolean zG = g();
        lu1 lu1Var = this.d;
        if (!zG || !uz0.g(qyVar.g(), obj) || !uz0.g(lu1Var.getValue(), obj2)) {
            if (!uz0.g(qyVar.g(), obj) && (qyVar instanceof tj1)) {
                qyVar.n(obj);
            }
            lu1Var.setValue(obj2);
            this.l.setValue(Boolean.TRUE);
            this.f.setValue(new nz2(obj, obj2));
        }
        ll2 ll2Var = this.k;
        int size = ll2Var.size();
        for (int i = 0; i < size; i++) {
            qz2 qz2Var = (qz2) ll2Var.get(i);
            qz2Var.getClass();
            if (qz2Var.g()) {
                qz2Var.k(qz2Var.a.g(), qz2Var.d.getValue());
            }
        }
        ll2 ll2Var2 = this.j;
        int size2 = ll2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((oz2) ll2Var2.get(i2)).b(0L);
        }
    }

    public final void l(long j) {
        ju1 ju1Var = this.h;
        if (ju1Var.g() == Long.MIN_VALUE) {
            ju1Var.h(j);
        }
        n(j);
        o(false);
        ll2 ll2Var = this.j;
        int size = ll2Var.size();
        for (int i = 0; i < size; i++) {
            ((oz2) ll2Var.get(i)).b(j);
        }
        ll2 ll2Var2 = this.k;
        int size2 = ll2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            qz2 qz2Var = (qz2) ll2Var2.get(i2);
            if (!uz0.g(qz2Var.d.getValue(), qz2Var.a.g())) {
                qz2Var.l(j);
            }
        }
    }

    public final void m(hf2 hf2Var) {
        ll2 ll2Var = this.j;
        int size = ll2Var.size();
        for (int i = 0; i < size; i++) {
            oz2 oz2Var = (oz2) ll2Var.get(i);
            lu1 lu1Var = oz2Var.q;
            if (!uz0.g(oz2Var.a().c, oz2Var.a().d)) {
                oz2Var.m = oz2Var.a();
                oz2Var.l = hf2Var;
            }
            oz2Var.k.setValue(new os2(oz2Var.u, oz2Var.h, lu1Var.getValue(), lu1Var.getValue(), oz2Var.r.c()));
            oz2Var.s.h(oz2Var.a().c());
            oz2Var.p = true;
        }
        ll2 ll2Var2 = this.k;
        int size2 = ll2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((qz2) ll2Var2.get(i2)).m(hf2Var);
        }
    }

    public final void n(long j) {
        if (this.b == null) {
            this.g.h(j);
        }
    }

    public final void o(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void p() {
        os2 os2Var;
        ll2 ll2Var = this.j;
        int size = ll2Var.size();
        for (int i = 0; i < size; i++) {
            oz2 oz2Var = (oz2) ll2Var.get(i);
            hf2 hf2Var = oz2Var.l;
            if (hf2Var != null && (os2Var = oz2Var.m) != null) {
                long jY = ie1.y(hf2Var.g * ((double) hf2Var.d));
                Object objB = os2Var.b(jY);
                if (oz2Var.p) {
                    oz2Var.a().i(objB);
                }
                oz2Var.a().h(objB);
                oz2Var.s.h(oz2Var.a().c());
                if (oz2Var.o.g() == -2.0f || oz2Var.p) {
                    oz2Var.c(objB);
                } else {
                    oz2Var.b(oz2Var.v.e());
                }
                if (jY >= hf2Var.g) {
                    oz2Var.l = null;
                    oz2Var.m = null;
                } else {
                    hf2Var.c = false;
                }
            }
        }
        ll2 ll2Var2 = this.k;
        int size2 = ll2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((qz2) ll2Var2.get(i2)).p();
        }
    }

    public final void q(Object obj) {
        lu1 lu1Var = this.d;
        if (uz0.g(lu1Var.getValue(), obj)) {
            return;
        }
        this.f.setValue(new nz2(lu1Var.getValue(), obj));
        qy qyVar = this.a;
        if (!uz0.g(qyVar.g(), lu1Var.getValue())) {
            qyVar.n(lu1Var.getValue());
        }
        lu1Var.setValue(obj);
        if (this.h.g() == Long.MIN_VALUE) {
            o(true);
        }
        ll2 ll2Var = this.j;
        int size = ll2Var.size();
        for (int i = 0; i < size; i++) {
            ((oz2) ll2Var.get(i)).o.h(-2.0f);
        }
    }

    public final String toString() {
        ll2 ll2Var = this.j;
        int size = ll2Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((oz2) ll2Var.get(i)) + ", ";
        }
        return str;
    }
}
