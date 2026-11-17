package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c61 implements ke2 {
    public static final k42 w = es.T(new yx(18), new vv0(15));
    public final k70 a;
    public boolean b;
    public t51 c;
    public final w51 d;
    public final lu1 e;
    public final ui1 f;
    public float g;
    public final t70 h;
    public final boolean i;
    public l41 j;
    public final z51 k;
    public final yi l;
    public final p61 m;
    public final lo n;
    public final d71 o;
    public final g2 p;
    public final a71 q;
    public final sj1 r;
    public final sj1 s;
    public final lu1 t;
    public final lu1 u;
    public final ix0 v;

    public c61(int i, int i2) {
        k70 k70Var = new k70();
        k70Var.a = -1;
        k70Var.e = new uj1(new c71[16]);
        k70Var.c = -1;
        this.a = k70Var;
        this.d = new w51(i, i2, (byte) 0);
        this.e = new lu1(f61.a, c5.f0);
        this.f = new ui1();
        this.h = new t70(new p((Object) this, (byte) 28));
        this.i = true;
        this.k = new z51(this, (byte) 0);
        this.l = new yi();
        this.m = new p61((byte) 0);
        this.n = new lo((byte) 1);
        this.o = new d71(new ao0((Object) this, i, (byte) 1));
        this.p = new g2((Object) this, (byte) 24);
        this.q = new a71();
        this.r = cu.B();
        this.s = cu.B();
        Boolean bool = Boolean.FALSE;
        this.t = rz1.x(bool);
        this.u = rz1.x(bool);
        this.v = new ix0((byte) 20);
    }

    @Override // defpackage.ke2
    public final boolean a() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.ke2
    public final boolean b() {
        return this.h.b();
    }

    @Override // defpackage.ke2
    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r6.h.d(r7, r8, r0) == r5) goto L22;
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
            boolean r0 = r9 instanceof defpackage.a61
            if (r0 == 0) goto L13
            r0 = r9
            a61 r0 = (defpackage.a61) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            a61 r0 = new a61
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
            lu1 r9 = r6.e
            java.lang.Object r9 = r9.getValue()
            t51 r1 = defpackage.f61.a
            if (r9 != r1) goto L5a
            r0.k = r7
            r9 = r8
            mq2 r9 = (defpackage.mq2) r9
            r0.l = r9
            r0.o = r4
            yi r9 = r6.l
            java.lang.Object r9 = r9.h(r0)
            if (r9 == r5) goto L68
        L5a:
            r0.k = r2
            r0.l = r2
            r0.o = r3
            t70 r6 = r6.h
            java.lang.Object r6 = r6.d(r7, r8, r0)
            if (r6 != r5) goto L69
        L68:
            return r5
        L69:
            j23 r6 = defpackage.j23.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c61.d(ek1, zp0, n10):java.lang.Object");
    }

    @Override // defpackage.ke2
    public final float e(float f) {
        return this.h.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fc  */
    public final void f(t51 t51Var, boolean z, boolean z2) {
        Object obj;
        int i;
        u51 u51Var;
        List list = t51Var.n;
        int i2 = t51Var.q;
        v51 v51Var = t51Var.a;
        int i3 = t51Var.b;
        this.o.e = list.size();
        w51 w51Var = this.d;
        ix0 ix0Var = this.v;
        if (z) {
            this.b = true;
        } else if (this.b) {
            this.c = t51Var;
            uk2 uk2VarN = y02.n();
            vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
            uk2 uk2VarQ = y02.q(uk2VarN);
            try {
                if (!(((Number) ((dd) ix0Var.j).i.getValue()).floatValue() == 0.0f) && i3 == w51Var.c.g() && v51Var != null) {
                    u51[] u51VarArr = v51Var.b;
                    u51Var = u51VarArr.length != 0 ? u51VarArr[0] : null;
                    if (u51Var != null && u51Var.a == w51Var.b.g()) {
                        ix0Var.O();
                    }
                }
                return;
            } finally {
                y02.u(uk2VarN, uk2VarQ, vp0VarE);
            }
        }
        this.g -= t51Var.d;
        this.e.setValue(t51Var);
        this.u.setValue(Boolean.valueOf(((v51Var != null ? v51Var.a : 0) == 0 && i3 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(t51Var.c));
        if (z2) {
            w51Var.getClass();
            if (i3 < 0.0f) {
                dx0.c("scrollOffset should be non-negative");
            }
            w51Var.c.h(i3);
        } else {
            w51Var.getClass();
            if (v51Var != null) {
                u51[] u51VarArr2 = v51Var.b;
                u51 u51Var2 = u51VarArr2.length == 0 ? null : u51VarArr2[0];
                if (u51Var2 != null) {
                    obj = u51Var2.b;
                } else {
                    obj = null;
                }
            } else {
                obj = null;
            }
            w51Var.e = obj;
            if (w51Var.d || i2 > 0) {
                w51Var.d = true;
                if (i3 < 0.0f) {
                    dx0.c("scrollOffset should be non-negative (" + i3 + ")");
                }
                if (v51Var != null) {
                    u51[] u51VarArr3 = v51Var.b;
                    u51Var = u51VarArr3.length != 0 ? u51VarArr3[0] : null;
                    if (u51Var != null) {
                        i = u51Var.a;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
                w51Var.a(i, i3);
            }
            if (this.i) {
                k70 k70Var = this.a;
                uj1 uj1Var = (uj1) k70Var.e;
                int i4 = k70Var.a;
                boolean z3 = k70Var.b;
                if (i4 != -1 && !list.isEmpty() && i4 != k70.b(t51Var, z3)) {
                    k70Var.a = -1;
                    Object[] objArr = uj1Var.h;
                    int i5 = uj1Var.j;
                    for (int i6 = 0; i6 < i5; i6++) {
                        ((c71) objArr[i6]).cancel();
                    }
                    uj1Var.g();
                }
                int i7 = k70Var.c;
                if (i7 != -1 && k70Var.d != 0.0f && i7 != i2 && !list.isEmpty()) {
                    int iB = k70.b(t51Var, k70Var.d < 0.0f);
                    int i8 = k70Var.d < 0.0f ? ((u51) dv.F0(list)).a + 1 : ((u51) dv.x0(list)).a - 1;
                    if (i8 >= 0 && i8 < i2 && iB != k70Var.a && iB >= 0) {
                        k70Var.a = iB;
                        uj1Var.g();
                        uj1Var.d(uj1Var.j, this.p.N(iB));
                    }
                }
                k70Var.c = i2;
            }
        }
        if (z) {
            ix0Var.Q(t51Var.f, t51Var.i, t51Var.h);
        }
    }

    public final t51 g() {
        return (t51) this.e.getValue();
    }

    public final void h(float f, t51 t51Var) {
        if (this.i) {
            k70 k70Var = this.a;
            uj1 uj1Var = (uj1) k70Var.e;
            List list = t51Var.n;
            List list2 = t51Var.n;
            ks1 ks1Var = t51Var.r;
            if (!list.isEmpty()) {
                int i = 0;
                boolean z = f < 0.0f;
                int iB = k70.b(t51Var, z);
                int i2 = z ? ((u51) dv.F0(list2)).a + 1 : ((u51) dv.x0(list2)).a - 1;
                if (i2 >= 0 && i2 < t51Var.q) {
                    if (iB != k70Var.a && iB >= 0) {
                        if (k70Var.b != z) {
                            Object[] objArr = uj1Var.h;
                            int i3 = uj1Var.j;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((c71) objArr[i4]).cancel();
                            }
                        }
                        k70Var.b = z;
                        k70Var.a = iB;
                        uj1Var.g();
                        uj1Var.d(uj1Var.j, this.p.N(iB));
                    }
                    if (z) {
                        u51 u51Var = (u51) dv.F0(list2);
                        if (((ls.X(u51Var, ks1Var) + ((int) (ks1Var == ks1.h ? u51Var.q & 4294967295L : u51Var.q >> 32))) + t51Var.t) - t51Var.p < (-f)) {
                            Object[] objArr2 = uj1Var.h;
                            int i5 = uj1Var.j;
                            while (i < i5) {
                                ((c71) objArr2[i]).a();
                                i++;
                            }
                        }
                    } else if (t51Var.o - ls.X((u51) dv.x0(list2), ks1Var) < f) {
                        Object[] objArr3 = uj1Var.h;
                        int i6 = uj1Var.j;
                        while (i < i6) {
                            ((c71) objArr3[i]).a();
                            i++;
                        }
                    }
                }
            }
            k70Var.d = f;
        }
    }
}
