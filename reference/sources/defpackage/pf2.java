package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pf2 extends qy {
    public static final ed s = new ed(0.0f);
    public static final ed t = new ed(1.0f);
    public final lu1 b;
    public final lu1 c;
    public Object d;
    public qz2 e;
    public long f;
    public final xu1 g;
    public nl2 h;
    public final hu1 i;
    public rq j;
    public final ok1 k;
    public final mk1 l;
    public long m;
    public final fj1 n;
    public hf2 o;
    public final gf2 p;
    public float q;
    public final gf2 r;

    /* JADX WARN: Type inference failed for: r3v6, types: [gf2] */
    /* JADX WARN: Type inference failed for: r3v7, types: [gf2] */
    public pf2(pk1 pk1Var) {
        super((byte) 4);
        this.b = rz1.x(pk1Var);
        this.c = rz1.x(pk1Var);
        this.d = pk1Var;
        this.g = new xu1(this, (byte) 8);
        this.i = new hu1(0.0f);
        this.k = new ok1();
        this.l = new mk1();
        this.m = Long.MIN_VALUE;
        this.n = new fj1();
        final byte b = 0;
        this.p = new vp0(this) { // from class: gf2
            public final /* synthetic */ pf2 i;

            {
                this.i = this;
            }

            @Override // defpackage.vp0
            public final Object h(Object obj) {
                byte b2 = b;
                j23 j23Var = j23.a;
                pf2 pf2Var = this.i;
                long jLongValue = ((Long) obj).longValue();
                switch (b2) {
                    case 0:
                        pf2Var.m = jLongValue;
                        break;
                    default:
                        long j = jLongValue - pf2Var.m;
                        pf2Var.m = jLongValue;
                        long jY = ie1.y(j / ((double) pf2Var.q));
                        fj1 fj1Var = pf2Var.n;
                        if (fj1Var.j()) {
                            Object[] objArr = fj1Var.a;
                            int i = fj1Var.b;
                            int i2 = 0;
                            for (int i3 = 0; i3 < i; i3++) {
                                hf2 hf2Var = (hf2) objArr[i3];
                                pf2.t(hf2Var, jY);
                                hf2Var.c = true;
                            }
                            qz2 qz2Var = pf2Var.e;
                            if (qz2Var != null) {
                                qz2Var.p();
                            }
                            int i4 = fj1Var.b;
                            Object[] objArr2 = fj1Var.a;
                            qy0 qy0VarS = cy1.S(0, i4);
                            int i5 = qy0VarS.h;
                            int i6 = qy0VarS.i;
                            if (i5 <= i6) {
                                while (true) {
                                    objArr2[i5 - i2] = objArr2[i5];
                                    if (((hf2) objArr2[i5]).c) {
                                        i2++;
                                    }
                                    if (i5 != i6) {
                                        i5++;
                                    }
                                }
                            }
                            gi.U(objArr2, i4 - i2, i4);
                            fj1Var.b -= i2;
                        }
                        hf2 hf2Var2 = pf2Var.o;
                        if (hf2Var2 != null) {
                            hf2Var2.g = pf2Var.f;
                            pf2.t(hf2Var2, jY);
                            pf2Var.x(hf2Var2.d);
                            if (hf2Var2.d == 1.0f) {
                                pf2Var.o = null;
                            }
                            pf2Var.w();
                        }
                        break;
                }
                return j23Var;
            }
        };
        final byte b2 = 1;
        this.r = new vp0(this) { // from class: gf2
            public final /* synthetic */ pf2 i;

            {
                this.i = this;
            }

            @Override // defpackage.vp0
            public final Object h(Object obj) {
                byte b3 = b2;
                j23 j23Var = j23.a;
                pf2 pf2Var = this.i;
                long jLongValue = ((Long) obj).longValue();
                switch (b3) {
                    case 0:
                        pf2Var.m = jLongValue;
                        break;
                    default:
                        long j = jLongValue - pf2Var.m;
                        pf2Var.m = jLongValue;
                        long jY = ie1.y(j / ((double) pf2Var.q));
                        fj1 fj1Var = pf2Var.n;
                        if (fj1Var.j()) {
                            Object[] objArr = fj1Var.a;
                            int i = fj1Var.b;
                            int i2 = 0;
                            for (int i3 = 0; i3 < i; i3++) {
                                hf2 hf2Var = (hf2) objArr[i3];
                                pf2.t(hf2Var, jY);
                                hf2Var.c = true;
                            }
                            qz2 qz2Var = pf2Var.e;
                            if (qz2Var != null) {
                                qz2Var.p();
                            }
                            int i4 = fj1Var.b;
                            Object[] objArr2 = fj1Var.a;
                            qy0 qy0VarS = cy1.S(0, i4);
                            int i5 = qy0VarS.h;
                            int i6 = qy0VarS.i;
                            if (i5 <= i6) {
                                while (true) {
                                    objArr2[i5 - i2] = objArr2[i5];
                                    if (((hf2) objArr2[i5]).c) {
                                        i2++;
                                    }
                                    if (i5 != i6) {
                                        i5++;
                                    }
                                }
                            }
                            gi.U(objArr2, i4 - i2, i4);
                            fj1Var.b -= i2;
                        }
                        hf2 hf2Var2 = pf2Var.o;
                        if (hf2Var2 != null) {
                            hf2Var2.g = pf2Var.f;
                            pf2.t(hf2Var2, jY);
                            pf2Var.x(hf2Var2.d);
                            if (hf2Var2.d == 1.0f) {
                                pf2Var.o = null;
                            }
                            pf2Var.w();
                        }
                        break;
                }
                return j23Var;
            }
        };
    }

    public static void t(hf2 hf2Var, long j) {
        long j2 = hf2Var.a + j;
        hf2Var.a = j2;
        long j3 = hf2Var.h;
        if (j2 >= j3) {
            hf2Var.d = 1.0f;
            return;
        }
        r33 r33Var = hf2Var.b;
        ed edVar = hf2Var.e;
        if (r33Var == null) {
            float f = j2 / j3;
            hf2Var.d = (f * 1.0f) + ((1.0f - f) * edVar.a(0));
            return;
        }
        ed edVar2 = hf2Var.f;
        if (edVar2 == null) {
            edVar2 = s;
        }
        hf2Var.d = cy1.m(((ed) r33Var.p(j2, edVar, t, edVar2)).a(0), 0.0f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x0083, please report this as an issue */
    public final Object A(n10 n10Var) {
        of2 of2Var;
        Object value;
        Object obj;
        if (n10Var instanceof of2) {
            of2Var = (of2) n10Var;
            int i = of2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                of2Var.n = i - Integer.MIN_VALUE;
            } else {
                of2Var = new of2(this, n10Var);
            }
        } else {
            of2Var = new of2(this, n10Var);
        }
        Object obj2 = of2Var.l;
        int i2 = of2Var.n;
        ok1 ok1Var = this.k;
        y20 y20Var = y20.h;
        if (i2 == 0) {
            m02.y(obj2);
            value = this.b.getValue();
            of2Var.k = value;
            of2Var.n = 1;
            if (ok1Var.d(of2Var) != y20Var) {
            }
            return y20Var;
        }
        if (i2 == 1) {
            Object obj3 = of2Var.k;
            m02.y(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = of2Var.k;
            m02.y(obj2);
        }
        if (!uz0.g(obj2, obj)) {
            this.m = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return j23.a;
        if (!uz0.g(value, this.d)) {
            of2Var.k = value;
            of2Var.n = 2;
            rq rqVar = new rq(1, ls.F(of2Var));
            rqVar.u();
            this.j = rqVar;
            ok1Var.f(null);
            Object objT = rqVar.t();
            if (objT != y20Var) {
                obj = value;
                obj2 = objT;
                if (!uz0.g(obj2, obj)) {
                    this.m = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return y20Var;
        }
        ok1Var.f(null);
        return j23.a;
    }

    @Override // defpackage.qy
    public final Object g() {
        return this.c.getValue();
    }

    @Override // defpackage.qy
    public final Object i() {
        return this.b.getValue();
    }

    @Override // defpackage.qy
    public final void n(Object obj) {
        this.c.setValue(obj);
    }

    @Override // defpackage.qy
    public final void o(qz2 qz2Var) {
        qz2 qz2Var2 = this.e;
        if (qz2Var2 != null && !qz2Var.equals(qz2Var2)) {
            y12.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e + ", new instance: " + qz2Var);
        }
        this.e = qz2Var;
    }

    @Override // defpackage.qy
    public final void p() {
        this.e = null;
        nl2 nl2Var = this.h;
        if (nl2Var != null) {
            nl2Var.b(this);
        }
    }

    public final Object q(n10 n10Var) {
        float fV = cy1.v(n10Var.e());
        j23 j23Var = j23.a;
        if (fV <= 0.0f) {
            r();
            return j23Var;
        }
        this.q = fV;
        Object objC = es.M(n10Var.e()).c(n10Var, this.r);
        return objC == y20.h ? objC : j23Var;
    }

    public final void r() {
        qz2 qz2Var = this.e;
        if (qz2Var != null) {
            qz2Var.c();
        }
        this.n.d();
        if (this.o != null) {
            this.o = null;
            x(1.0f);
            w();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005b  */
    public final void s() {
        qz2 qz2Var = this.e;
        if (qz2Var == null) {
            return;
        }
        hf2 hf2Var = this.o;
        if (hf2Var == null) {
            if (this.f > 0) {
                hu1 hu1Var = this.i;
                if (hu1Var.g() == 1.0f || uz0.g(this.c.getValue(), this.b.getValue())) {
                    hf2Var = null;
                } else {
                    hf2 hf2Var2 = new hf2();
                    hf2Var2.d = hu1Var.g();
                    long j = this.f;
                    hf2Var2.g = j;
                    hf2Var2.h = ie1.y((1.0d - ((double) hu1Var.g())) * j);
                    hf2Var2.e.e(0, hu1Var.g());
                    hf2Var = hf2Var2;
                }
            } else {
                hf2Var = null;
            }
        }
        if (hf2Var != null) {
            hf2Var.g = this.f;
            this.n.a(hf2Var);
            qz2Var.m(hf2Var);
        }
        this.o = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(n10 n10Var) {
        kf2 kf2Var;
        if (n10Var instanceof kf2) {
            kf2Var = (kf2) n10Var;
            int i = kf2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                kf2Var.m = i - Integer.MIN_VALUE;
            } else {
                kf2Var = new kf2(this, n10Var);
            }
        } else {
            kf2Var = new kf2(this, n10Var);
        }
        o20 o20Var = kf2Var.i;
        Object obj = kf2Var.k;
        int i2 = kf2Var.m;
        fj1 fj1Var = this.n;
        j23 j23Var = j23.a;
        Object obj2 = y20.h;
        if (i2 == 0) {
            m02.y(obj);
            if (fj1Var.i() && this.o == null) {
                return j23Var;
            }
            o20Var.getClass();
            if (cy1.v(o20Var) == 0.0f) {
                r();
                this.m = Long.MIN_VALUE;
                return j23Var;
            }
            if (this.m == Long.MIN_VALUE) {
                kf2Var.m = 1;
                o20Var.getClass();
                if (es.M(o20Var).c(kf2Var, this.p) != obj2) {
                }
            }
            return obj2;
        }
        if (i2 != 1 && i2 != 2) {
            li1.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m02.y(obj);
        do {
            if (!fj1Var.j() && this.o == null) {
                this.m = Long.MIN_VALUE;
                return j23Var;
            }
            kf2Var.m = 2;
        } while (q(kf2Var) != obj2);
        return obj2;
    }

    public final Object v(float f, Object obj, mq2 mq2Var) {
        if (0.0f > f || f > 1.0f) {
            y12.a("Expecting fraction between 0 and 1. Got " + f);
        }
        qz2 qz2Var = this.e;
        if (qz2Var != null) {
            Object objA = mk1.a(this.l, new mf2(obj, this.b.getValue(), this, qz2Var, f, null), mq2Var);
            if (objA == y20.h) {
                return objA;
            }
        }
        return j23.a;
    }

    public final void w() {
        qz2 qz2Var = this.e;
        if (qz2Var == null) {
            return;
        }
        qz2Var.l(ie1.y(((double) this.i.g()) * ((Number) qz2Var.m.getValue()).longValue()));
    }

    public final void x(float f) {
        this.i.h(f);
    }

    public final void y(nl2 nl2Var) {
        v3 v3Var;
        if (uz0.g(this.h, nl2Var)) {
            return;
        }
        nl2 nl2Var2 = this.h;
        if (nl2Var2 != null) {
            nl2Var2.b(this);
        }
        nl2 nl2Var3 = this.h;
        if (nl2Var3 != null && (v3Var = nl2Var3.h) != null) {
            v3Var.b();
        }
        this.h = nl2Var;
        if (nl2Var != null) {
            nl2Var.e();
        }
        nl2 nl2Var4 = this.h;
        if (nl2Var4 != null) {
            nl2Var4.d(this, t03.H, this.g);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(n10 n10Var) {
        nf2 nf2Var;
        Object value;
        Object obj;
        if (n10Var instanceof nf2) {
            nf2Var = (nf2) n10Var;
            int i = nf2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                nf2Var.n = i - Integer.MIN_VALUE;
            } else {
                nf2Var = new nf2(this, n10Var);
            }
        } else {
            nf2Var = new nf2(this, n10Var);
        }
        Object obj2 = nf2Var.l;
        int i2 = nf2Var.n;
        ok1 ok1Var = this.k;
        y20 y20Var = y20.h;
        if (i2 == 0) {
            m02.y(obj2);
            value = this.b.getValue();
            nf2Var.k = value;
            nf2Var.n = 1;
            if (ok1Var.d(nf2Var) != y20Var) {
            }
            return y20Var;
        }
        if (i2 == 1) {
            Object obj3 = nf2Var.k;
            m02.y(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = nf2Var.k;
            m02.y(obj2);
        }
        if (uz0.g(obj2, obj)) {
            return j23.a;
        }
        this.m = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        nf2Var.k = value;
        nf2Var.n = 2;
        rq rqVar = new rq(1, ls.F(nf2Var));
        rqVar.u();
        this.j = rqVar;
        ok1Var.f(null);
        Object objT = rqVar.t();
        if (objT != y20Var) {
            obj = value;
            obj2 = objT;
            if (uz0.g(obj2, obj)) {
                return j23.a;
            }
            this.m = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return y20Var;
    }
}
