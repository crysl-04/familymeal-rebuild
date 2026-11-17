package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gt0 {
    public final t31 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final fj1 f = new fj1();
    public final zn1 g = new zn1();
    public final xi1 h = new xi1(10);

    public gt0(t31 t31Var) {
        this.a = t31Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    public final void a(long j, List list, boolean z) {
        xi1 xi1Var;
        long[] jArr;
        in1 in1Var;
        Object objD;
        Object obj;
        int size = list.size();
        zn1 zn1Var = this.g;
        zn1 zn1Var2 = zn1Var;
        boolean z2 = true;
        int i = 0;
        while (true) {
            xi1Var = this.h;
            if (i >= size) {
                break;
            }
            qg1 qg1Var = (qg1) list.get(i);
            if (qg1Var.u) {
                qg1Var.t = new h6(this, qg1Var, (byte) 17);
                if (z2) {
                    uj1 uj1Var = zn1Var2.a;
                    Object[] objArr = uj1Var.h;
                    int i2 = uj1Var.j;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (((in1) obj).c.equals(qg1Var)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    in1Var = (in1) obj;
                    if (in1Var != null) {
                        in1Var.i = true;
                        in1Var.d.a(j);
                        if (z) {
                            Object objD2 = xi1Var.d(j);
                            if (objD2 == null) {
                                objD2 = new fj1();
                                xi1Var.f(j, objD2);
                            }
                            ((fj1) objD2).a(in1Var);
                        }
                    } else {
                        z2 = false;
                        in1Var = new in1(qg1Var);
                        in1Var.d.a(j);
                        if (z) {
                            objD = xi1Var.d(j);
                            if (objD == null) {
                                objD = new fj1();
                                xi1Var.f(j, objD);
                            }
                            ((fj1) objD).a(in1Var);
                        }
                        zn1Var2.a.b(in1Var);
                    }
                } else {
                    in1Var = new in1(qg1Var);
                    in1Var.d.a(j);
                    if (z) {
                        objD = xi1Var.d(j);
                        if (objD == null) {
                            objD = new fj1();
                            xi1Var.f(j, objD);
                        }
                        ((fj1) objD).a(in1Var);
                    }
                    zn1Var2.a.b(in1Var);
                }
                zn1Var2 = in1Var;
            }
            i++;
        }
        if (z) {
            long[] jArr2 = xi1Var.b;
            Object[] objArr2 = xi1Var.c;
            long[] jArr3 = xi1Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr3[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j2) < 128) {
                                int i8 = (i4 << 3) + i7;
                                long j3 = jArr2[i8];
                                fj1 fj1Var = (fj1) objArr2[i8];
                                uj1 uj1Var2 = zn1Var.a;
                                Object[] objArr3 = uj1Var2.h;
                                int i9 = uj1Var2.j;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    ((in1) objArr3[i10]).f(j3, fj1Var);
                                }
                            }
                            j2 >>= i5;
                            i7++;
                            i5 = i5;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i6 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr2 = jArr;
                }
            }
        }
        xi1Var.a();
    }

    public final boolean b(ix0 ix0Var, boolean z) {
        zn1 zn1Var = this.g;
        uj1 uj1Var = zn1Var.a;
        if (!zn1Var.a((tc1) ix0Var.i, this.a, ix0Var, z)) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = uj1Var.h;
        int i = uj1Var.j;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((in1) objArr[i2]).e(ix0Var, z) || z3;
        }
        Object[] objArr2 = uj1Var.h;
        int i3 = uj1Var.j;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((in1) objArr2[i4]).d(ix0Var) || z4;
        }
        zn1Var.b(ix0Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            fj1 fj1Var = this.f;
            int i5 = fj1Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((qg1) fj1Var.g(i6));
            }
            fj1Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            zn1Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        zn1 zn1Var = this.g;
        uj1 uj1Var = zn1Var.a;
        Object[] objArr = uj1Var.h;
        int i = uj1Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            ((in1) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            zn1Var.a.g();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d(qg1 qg1Var) {
        if (this.b) {
            this.e = true;
            this.f.a(qg1Var);
            return;
        }
        zn1 zn1Var = this.g;
        fj1 fj1Var = zn1Var.b;
        fj1Var.d();
        fj1Var.a(zn1Var);
        while (fj1Var.j()) {
            zn1 zn1Var2 = (zn1) fj1Var.l(fj1Var.b - 1);
            int i = 0;
            while (true) {
                uj1 uj1Var = zn1Var2.a;
                if (i < uj1Var.j) {
                    in1 in1Var = (in1) uj1Var.h[i];
                    if (in1Var.c.equals(qg1Var)) {
                        zn1Var2.a.j(in1Var);
                        in1Var.c();
                    } else {
                        fj1Var.a(in1Var);
                        i++;
                    }
                }
            }
        }
    }
}
