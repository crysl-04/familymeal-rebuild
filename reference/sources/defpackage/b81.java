package defpackage;

import android.os.Trace;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b81 implements ke2 {
    public static final k42 y = es.T(new yx(19), new vv0(20));
    public final k70 a;
    public boolean b;
    public u71 c;
    public boolean d;
    public final w51 e;
    public final lu1 f;
    public final ui1 g;
    public float h;
    public boolean i;
    public final t70 j;
    public final boolean k;
    public l41 l;
    public final z51 m;
    public final yi n;
    public final p61 o;
    public final lo p;
    public final d71 q;
    public final x71 r;
    public final a71 s;
    public final sj1 t;
    public final lu1 u;
    public final lu1 v;
    public final sj1 w;
    public final ix0 x;

    public b81(int i, int i2) {
        k70 k70Var = new k70();
        k70Var.a = -1;
        k70Var.c = -1;
        this.a = k70Var;
        this.e = new w51(i, i2, (byte) 1);
        this.f = new lu1(c81.a, c5.f0);
        this.g = new ui1();
        this.j = new t70(new z61(this, (byte) 3));
        this.k = true;
        this.m = new z51(this, (byte) 1);
        this.n = new yi();
        this.o = new p61((byte) 0);
        this.p = new lo((byte) 1);
        this.q = new d71(new a50(this, i));
        this.r = new x71(this);
        this.s = new a71();
        this.t = cu.B();
        Boolean bool = Boolean.FALSE;
        this.u = rz1.x(bool);
        this.v = rz1.x(bool);
        this.w = cu.B();
        this.x = new ix0((byte) 20);
    }

    public static Object l(b81 b81Var, int i, mq2 mq2Var) {
        b81Var.getClass();
        Object objD = b81Var.d(ek1.h, new b61(b81Var, i, null, (byte) 1), mq2Var);
        return objD == y20.h ? objD : j23.a;
    }

    @Override // defpackage.ke2
    public final boolean a() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    @Override // defpackage.ke2
    public final boolean b() {
        return this.j.b();
    }

    @Override // defpackage.ke2
    public final boolean c() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r6.j.d(r7, r8, r0) == r5) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ke2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ek1 r7, defpackage.zp0 r8, defpackage.n10 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.a81
            if (r0 == 0) goto L13
            r0 = r9
            a81 r0 = (defpackage.a81) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            a81 r0 = new a81
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.m
            int r1 = r0.o
            r2 = 0
            r3 = 2
            r4 = 1
            y20 r5 = defpackage.y20.h
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.m02.y(r9)
            goto L69
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r6)
            return r2
        L31:
            mq2 r7 = r0.l
            r8 = r7
            zp0 r8 = (defpackage.zp0) r8
            ek1 r7 = r0.k
            defpackage.m02.y(r9)
            goto L5a
        L3c:
            defpackage.m02.y(r9)
            lu1 r9 = r6.f
            java.lang.Object r9 = r9.getValue()
            u71 r1 = defpackage.c81.a
            if (r9 != r1) goto L5a
            r0.k = r7
            r9 = r8
            mq2 r9 = (defpackage.mq2) r9
            r0.l = r9
            r0.o = r4
            yi r9 = r6.n
            java.lang.Object r9 = r9.h(r0)
            if (r9 == r5) goto L68
        L5a:
            r0.k = r2
            r0.l = r2
            r0.o = r3
            t70 r6 = r6.j
            java.lang.Object r6 = r6.d(r7, r8, r0)
            if (r6 != r5) goto L69
        L68:
            return r5
        L69:
            j23 r6 = defpackage.j23.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b81.d(ek1, zp0, n10):java.lang.Object");
    }

    @Override // defpackage.ke2
    public final float e(float f) {
        return this.j.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [j23, java.lang.Object] */
    public final Object f(int i, n10 n10Var) {
        y71 y71Var;
        if (n10Var instanceof y71) {
            y71Var = (y71) n10Var;
            int i2 = y71Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y71Var.m = i2 - Integer.MIN_VALUE;
            } else {
                y71Var = new y71(this, n10Var);
            }
        } else {
            y71Var = new y71(this, n10Var);
        }
        Object obj = y71Var.k;
        int i3 = y71Var.m;
        try {
            if (i3 == 0) {
                m02.y(obj);
                this.i = true;
                z71 z71Var = new z71(this, i, null);
                y71Var.m = 1;
                Object objD = d(ek1.h, z71Var, y71Var);
                y20 y20Var = y20.h;
                if (objD == y20Var) {
                    return y20Var;
                }
            } else {
                if (i3 != 1) {
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
            }
            this.i = false;
            this = j23.a;
            return this;
        } catch (Throwable th) {
            this.i = false;
            throw th;
        }
    }

    public final void g(u71 u71Var, boolean z, boolean z2) {
        List list = u71Var.l;
        int i = u71Var.o;
        int i2 = u71Var.b;
        v71 v71Var = u71Var.a;
        this.q.e = list.size();
        ix0 ix0Var = this.x;
        w51 w51Var = this.e;
        if (z) {
            this.b = true;
        } else if (this.b) {
            this.c = u71Var;
            uk2 uk2VarN = y02.n();
            vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
            uk2 uk2VarQ = y02.q(uk2VarN);
            try {
                if (!(((Number) ((dd) ix0Var.j).i.getValue()).floatValue() == 0.0f) && v71Var != null && v71Var.a == w51Var.b.g() && i2 == w51Var.c.g()) {
                    ix0Var.O();
                }
                return;
            } finally {
                y02.u(uk2VarN, uk2VarQ, vp0VarE);
            }
        }
        this.v.setValue(Boolean.valueOf(((v71Var != null ? v71Var.a : 0) == 0 && i2 == 0) ? false : true));
        this.u.setValue(Boolean.valueOf(u71Var.c));
        this.h -= u71Var.d;
        this.f.setValue(u71Var);
        if (z2) {
            w51Var.getClass();
            if (i2 < 0.0f) {
                dx0.c("scrollOffset should be non-negative");
            }
            w51Var.c.h(i2);
        } else {
            v71 v71Var2 = (v71) dv.y0(list);
            v71 v71Var3 = (v71) dv.G0(list);
            Trace.setCounter("firstVisibleItem:index", v71Var2 != null ? v71Var2.a : -1L);
            Trace.setCounter("lastVisibleItem:index", v71Var3 != null ? v71Var3.a : -1L);
            w51Var.getClass();
            w51Var.e = v71Var != null ? v71Var.i : null;
            if (w51Var.d || i > 0) {
                w51Var.d = true;
                if (i2 < r6) {
                    dx0.c("scrollOffset should be non-negative");
                }
                w51Var.a(v71Var != null ? v71Var.a : 0, i2);
            }
            if (this.k) {
                k70 k70Var = this.a;
                int i3 = k70Var.a;
                boolean z3 = k70Var.b;
                if (i3 != -1 && !list.isEmpty() && i3 != k70.a(u71Var, z3)) {
                    k70Var.a = -1;
                    c71 c71Var = (c71) k70Var.e;
                    if (c71Var != null) {
                        c71Var.cancel();
                    }
                    k70Var.e = null;
                }
                int i4 = k70Var.c;
                if (i4 != -1 && k70Var.d != r6 && i4 != i && !list.isEmpty()) {
                    int iA = k70.a(u71Var, k70Var.d < 0);
                    if (iA >= 0 && iA < i) {
                        k70Var.a = iA;
                        k70Var.e = x71.a(this.r, iA);
                    }
                }
                k70Var.c = i;
            }
        }
        if (z) {
            ix0Var.Q(u71Var.f, u71Var.i, u71Var.h);
        }
    }

    public final int h() {
        return this.e.b.g();
    }

    public final int i() {
        return this.e.c.g();
    }

    public final u71 j() {
        return (u71) this.f.getValue();
    }

    public final void k(float f, u71 u71Var) {
        c71 c71Var;
        c71 c71Var2;
        if (this.k) {
            boolean zIsEmpty = u71Var.l.isEmpty();
            k70 k70Var = this.a;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iA = k70.a(u71Var, z);
                if (iA >= 0 && iA < u71Var.o) {
                    if (iA != k70Var.a) {
                        if (k70Var.b != z) {
                            k70Var.a = -1;
                            c71 c71Var3 = (c71) k70Var.e;
                            if (c71Var3 != null) {
                                c71Var3.cancel();
                            }
                            k70Var.e = null;
                        }
                        k70Var.b = z;
                        k70Var.a = iA;
                        k70Var.e = x71.a(this.r, iA);
                    }
                    List list = u71Var.l;
                    if (z) {
                        v71 v71Var = (v71) dv.F0(list);
                        if (((v71Var.l + v71Var.m) + u71Var.r) - u71Var.n < (-f) && (c71Var2 = (c71) k70Var.e) != null) {
                            c71Var2.a();
                        }
                    } else if (u71Var.m - ((v71) dv.x0(list)).l < f && (c71Var = (c71) k70Var.e) != null) {
                        c71Var.a();
                    }
                }
            }
            k70Var.d = f;
        }
    }

    public final void m(int i) {
        w51 w51Var = this.e;
        if (w51Var.b.g() != i || w51Var.c.g() != 0) {
            p61 p61Var = this.o;
            p61Var.d();
            p61Var.b = null;
        }
        w51Var.a(i, 0);
        w51Var.e = null;
        l41 l41Var = this.l;
        if (l41Var != null) {
            l41Var.k();
        }
    }
}
