package defpackage;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z41 implements hy {
    public final l41 h;
    public jz i;
    public cp2 j;
    public int k;
    public int l;
    public final mj1 m;
    public final mj1 n;
    public final t41 o;
    public final q41 p;
    public final mj1 q;
    public final bp2 r;
    public final mj1 s;
    public final uj1 t;
    public int u;
    public int v;
    public final String w;

    public z41(l41 l41Var, cp2 cp2Var) {
        this.h = l41Var;
        this.j = cp2Var;
        long[] jArr = bd2.a;
        this.m = new mj1();
        this.n = new mj1();
        this.o = new t41(this);
        this.p = new q41(this);
        this.q = new mj1();
        this.r = new bp2();
        this.s = new mj1();
        this.t = new uj1(new Object[16]);
        this.w = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void d(r41 r41Var) {
        nj1 nj1Var;
        wv1 wv1Var = r41Var.f;
        if (wv1Var != null) {
            wv1Var.h.set(yv1.i);
            g82 g82Var = wv1Var.k;
            if (g82Var.d.h()) {
                nj1Var = g82Var.d;
                nj1 nj1Var2 = cd2.a;
                g82Var.d = new nj1();
                g82Var.c.g();
            } else {
                nj1Var = null;
            }
            g82Var.b();
            oz ozVar = wv1Var.a;
            ozVar.x = null;
            if (nj1Var != null) {
                ozVar.B.k = nj1Var;
                ozVar.D = (byte) 2;
            }
            r41Var.f = null;
            oz ozVar2 = r41Var.c;
            if (ozVar2 != null) {
                ozVar2.m();
            }
            r41Var.c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // defpackage.hy
    public final void a() {
        oz ozVar;
        l41 l41Var = this.h;
        l41Var.w = true;
        mj1 mj1Var = this.m;
        Object[] objArr = mj1Var.c;
        long[] jArr = mj1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (ozVar = ((r41) objArr[(i << 3) + i3]).c) != null) {
                            ozVar.m();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        l41Var.Q();
        l41Var.w = false;
        mj1Var.a();
        this.n.a();
        this.v = 0;
        this.u = 0;
        this.q.a();
        h();
    }

    @Override // defpackage.hy
    public final void b() {
        i(true);
    }

    public final void c(r41 r41Var, boolean z) {
        wv1 wv1Var = r41Var.f;
        if (wv1Var != null) {
            uk2 uk2VarN = y02.n();
            vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
            uk2 uk2VarQ = y02.q(uk2VarN);
            try {
                l41 l41Var = this.h;
                l41Var.w = true;
                if (z) {
                    while (!wv1Var.c()) {
                        wv1Var.e(new wg((byte) 20));
                    }
                }
                wv1Var.a();
                r41Var.f = null;
                l41Var.w = false;
                y02.u(uk2VarN, uk2VarQ, vp0VarE);
            } catch (Throwable th) {
                y02.u(uk2VarN, uk2VarQ, vp0VarE);
                throw th;
            }
        }
    }

    public final yo2 e(Object obj) {
        return !this.h.I() ? new w41() : new x41(this, obj);
    }

    public final void f(int i) {
        boolean z;
        boolean z2 = false;
        this.u = 0;
        List listO = this.h.o();
        dj1 dj1Var = (dj1) listO;
        int i2 = (((uj1) dj1Var.i).j - this.v) - 1;
        if (i <= i2) {
            this.r.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.m.g((l41) dj1Var.get(i3));
                    objG.getClass();
                    ((gj1) this.r.i).a(((r41) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.j.c(this.r);
            uk2 uk2VarN = y02.n();
            vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
            uk2 uk2VarQ = y02.q(uk2VarN);
            z = false;
            while (i2 >= i) {
                try {
                    l41 l41Var = (l41) ((dj1) listO).get(i2);
                    Object objG2 = this.m.g(l41Var);
                    objG2.getClass();
                    r41 r41Var = (r41) objG2;
                    Object obj = r41Var.a;
                    if (((gj1) this.r.i).c(obj)) {
                        this.u++;
                        if (((Boolean) r41Var.g.getValue()).booleanValue()) {
                            p41 p41Var = l41Var.M;
                            ye1 ye1Var = p41Var.p;
                            j41 j41Var = j41.j;
                            ye1Var.s = j41Var;
                            gd1 gd1Var = p41Var.q;
                            if (gd1Var != null) {
                                gd1Var.q = j41Var;
                            }
                            l(r41Var, false);
                            if (r41Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        l41 l41Var2 = this.h;
                        l41Var2.w = true;
                        this.m.l(l41Var);
                        oz ozVar = r41Var.c;
                        if (ozVar != null) {
                            ozVar.m();
                        }
                        this.h.R(i2, 1);
                        l41Var2.w = false;
                    }
                    this.n.l(obj);
                    i2--;
                } catch (Throwable th) {
                    y02.u(uk2VarN, uk2VarQ, vp0VarE);
                    throw th;
                }
            }
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
        } else {
            z = false;
        }
        if (z) {
            synchronized (bl2.c) {
                nj1 nj1Var = bl2.j.h;
                if (nj1Var != null && nj1Var.h()) {
                    z2 = true;
                }
            }
            if (z2) {
                bl2.c();
            }
        }
        h();
    }

    public final void g(Object obj) {
        h();
        l41 l41Var = (l41) this.q.l(obj);
        l41 l41Var2 = this.h;
        if (l41Var != null) {
            if (this.v <= 0) {
                ax0.b("No pre-composed items to dispose");
            }
            int i = ((uj1) ((dj1) l41Var2.o()).i).i(l41Var);
            if (i < ((uj1) ((dj1) l41Var2.o()).i).j - this.v) {
                ax0.b("Item is not in pre-composed item range");
            }
            this.u++;
            this.v--;
            r41 r41Var = (r41) this.m.g(l41Var);
            if (r41Var != null) {
                d(r41Var);
            }
            int i2 = (((uj1) ((dj1) l41Var2.o()).i).j - this.v) - this.u;
            j(i, i2);
            f(i2);
        }
        if (this.t.h(obj)) {
            l41.W(l41Var2, true, 6);
        }
    }

    public final void h() {
        int i = ((uj1) ((dj1) this.h.o()).i).j;
        int i2 = this.m.e;
        if (i2 != i) {
            ax0.a("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.u;
        int i4 = this.v;
        if ((i - i3) - i4 < 0) {
            StringBuilder sbK = wi0.k("Incorrect state. Total children ", i, ". Reusable children ", i3, ". Precomposed children ");
            sbK.append(i4);
            ax0.a(sbK.toString());
        }
        int i5 = this.q.e;
        int i6 = this.v;
        if (i5 == i6) {
            return;
        }
        ax0.a("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    public final void i(boolean z) {
        this.v = 0;
        this.q.a();
        List listO = this.h.o();
        int i = ((uj1) ((dj1) listO).i).j;
        if (this.u != i) {
            this.u = i;
            uk2 uk2VarN = y02.n();
            vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
            uk2 uk2VarQ = y02.q(uk2VarN);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    l41 l41Var = (l41) ((dj1) listO).get(i2);
                    r41 r41Var = (r41) this.m.g(l41Var);
                    if (r41Var != null && ((Boolean) r41Var.g.getValue()).booleanValue()) {
                        p41 p41Var = l41Var.M;
                        ye1 ye1Var = p41Var.p;
                        j41 j41Var = j41.j;
                        ye1Var.s = j41Var;
                        gd1 gd1Var = p41Var.q;
                        if (gd1Var != null) {
                            gd1Var.q = j41Var;
                        }
                        l(r41Var, z);
                        r41Var.a = tz0.j0;
                    }
                } catch (Throwable th) {
                    y02.u(uk2VarN, uk2VarQ, vp0VarE);
                    throw th;
                }
            }
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
            this.n.a();
        }
        h();
    }

    public final void j(int i, int i2) {
        l41 l41Var = this.h;
        l41Var.w = true;
        l41Var.M(i, i2, 1);
        l41Var.w = false;
    }

    public final void k(Object obj, zp0 zp0Var, boolean z) {
        l41 l41Var = this.h;
        if (l41Var.I()) {
            h();
            if (this.n.c(obj)) {
                return;
            }
            this.s.l(obj);
            mj1 mj1Var = this.q;
            Object objG = mj1Var.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((uj1) ((dj1) l41Var.o()).i).i(objG), ((uj1) ((dj1) l41Var.o()).i).j);
                    this.v++;
                } else {
                    int i = ((uj1) ((dj1) l41Var.o()).i).j;
                    l41 l41Var2 = new l41(2);
                    l41Var.w = true;
                    l41Var.C(i, l41Var2);
                    l41Var.w = false;
                    this.v++;
                    objG = l41Var2;
                }
                mj1Var.n(obj, objG);
            }
            m((l41) objG, obj, z, zp0Var);
        }
    }

    public final void l(r41 r41Var, boolean z) {
        oz ozVar;
        if (z || !r41Var.h) {
            r41Var.g = rz1.x(Boolean.FALSE);
        } else {
            r41Var.g.setValue(Boolean.FALSE);
        }
        if (r41Var.f != null) {
            d(r41Var);
            return;
        }
        if (z) {
            oz ozVar2 = r41Var.c;
            if (ozVar2 != null) {
                ozVar2.l();
                return;
            }
            return;
        }
        ls1 outOfFrameExecutor = o41.a(this.h).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            ((t6) outOfFrameExecutor).D(new o9((Object) r41Var, (byte) 19));
        } else {
            if (r41Var.h || (ozVar = r41Var.c) == null) {
                return;
            }
            ozVar.l();
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008b A[Catch: all -> 0x0127, TryCatch #0 {all -> 0x0127, blocks: (B:41:0x0073, B:44:0x0080, B:53:0x00a5, B:55:0x00b5, B:58:0x00cb, B:60:0x00cf, B:71:0x0112, B:61:0x00dc, B:62:0x00e7, B:64:0x00eb, B:66:0x0100, B:69:0x0109, B:68:0x0104, B:70:0x010f, B:56:0x00b8, B:50:0x008b, B:51:0x0098, B:74:0x011c, B:75:0x0126), top: B:79:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0098 A[Catch: all -> 0x0127, TryCatch #0 {all -> 0x0127, blocks: (B:41:0x0073, B:44:0x0080, B:53:0x00a5, B:55:0x00b5, B:58:0x00cb, B:60:0x00cf, B:71:0x0112, B:61:0x00dc, B:62:0x00e7, B:64:0x00eb, B:66:0x0100, B:69:0x0109, B:68:0x0104, B:70:0x010f, B:56:0x00b8, B:50:0x008b, B:51:0x0098, B:74:0x011c, B:75:0x0126), top: B:79:0x0073 }] */
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
    public final void m(l41 l41Var, Object obj, boolean z, zp0 zp0Var) {
        boolean z2;
        oz ozVar;
        mj1 mj1Var = this.m;
        Object objG = mj1Var.g(l41Var);
        Object obj2 = objG;
        if (objG == null) {
            nx nxVar = uz0.w;
            r41 r41Var = new r41();
            r41Var.a = obj;
            r41Var.b = nxVar;
            r41Var.c = null;
            r41Var.g = rz1.x(Boolean.TRUE);
            mj1Var.n(l41Var, r41Var);
            obj2 = r41Var;
        }
        r41 r41Var2 = (r41) obj2;
        boolean z3 = r41Var2.b != zp0Var;
        if (r41Var2.f != null) {
            if (z3) {
                d(r41Var2);
            } else if (z) {
                return;
            } else {
                c(r41Var2, true);
            }
        }
        oz ozVar2 = r41Var2.c;
        if (ozVar2 != null) {
            synchronized (ozVar2.k) {
                z2 = ozVar2.u.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || r41Var2.d) {
            r41Var2.b = zp0Var;
            if (r41Var2.f != null) {
                ax0.a("new subcompose call while paused composition is still active");
            }
            uk2 uk2VarN = y02.n();
            vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
            uk2 uk2VarQ = y02.q(uk2VarN);
            try {
                l41 l41Var2 = this.h;
                l41Var2.w = true;
                oz ozVar3 = r41Var2.c;
                jz jzVar = this.i;
                if (jzVar == null) {
                    ax0.c("parent composition reference not set");
                    throw new a42((byte) 3);
                }
                if (ozVar3 == null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = v93.a;
                        ozVar = new oz(jzVar, new b23(l41Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = v93.a;
                        ozVar = new oz(jzVar, new b23(l41Var));
                    }
                    ozVar3 = ozVar;
                } else {
                    if (ozVar3.D == 3) {
                        if (z) {
                            ViewGroup.LayoutParams layoutParams3 = v93.a;
                            ozVar = new oz(jzVar, new b23(l41Var));
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = v93.a;
                            ozVar = new oz(jzVar, new b23(l41Var));
                        }
                        ozVar3 = ozVar;
                    }
                }
                r41Var2.c = ozVar3;
                zp0 nxVar2 = r41Var2.b;
                if (o41.a(this.h).getOutOfFrameExecutor() != null) {
                    r41Var2.h = false;
                } else {
                    r41Var2.h = true;
                    nxVar2 = new nx(1524156494, true, new j7(r41Var2, nxVar2, (byte) 16));
                }
                if (z) {
                    if (r41Var2.e) {
                        ozVar3.i();
                        ozVar3.q();
                        r41Var2.f = ozVar3.k(true, nxVar2);
                    } else {
                        r41Var2.f = ozVar3.k(ozVar3.i(), nxVar2);
                    }
                } else if (r41Var2.e) {
                    ozVar3.i();
                    ozVar3.q();
                    dr0 dr0Var = ozVar3.C;
                    dr0Var.z = 0;
                    dr0Var.y = true;
                    ozVar3.h.a(ozVar3, nxVar2);
                    if (dr0Var.F || dr0Var.z != 0) {
                        w12.a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    dr0Var.z = -1;
                    dr0Var.y = false;
                } else {
                    ozVar3.A(nxVar2);
                }
                r41Var2.e = false;
                l41Var2.w = false;
                y02.u(uk2VarN, uk2VarQ, vp0VarE);
                r41Var2.d = false;
            } catch (Throwable th) {
                y02.u(uk2VarN, uk2VarQ, vp0VarE);
                throw th;
            }
        }
    }

    public final l41 n(Object obj) {
        mj1 mj1Var;
        int i;
        if (this.u == 0) {
            return null;
        }
        dj1 dj1Var = (dj1) this.h.o();
        int i2 = ((uj1) dj1Var.i).j - this.v;
        int i3 = i2 - this.u;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            mj1Var = this.m;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = mj1Var.g((l41) dj1Var.get(i5));
            objG.getClass();
            if (uz0.g(((r41) objG).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                Object objG2 = mj1Var.g((l41) dj1Var.get(i4));
                objG2.getClass();
                r41 r41Var = (r41) objG2;
                Object obj2 = r41Var.a;
                if (obj2 == tz0.j0 || this.j.h(obj, obj2)) {
                    r41Var.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.u--;
        l41 l41Var = (l41) dj1Var.get(i3);
        Object objG3 = mj1Var.g(l41Var);
        objG3.getClass();
        r41 r41Var2 = (r41) objG3;
        r41Var2.g = rz1.x(Boolean.TRUE);
        r41Var2.e = true;
        r41Var2.d = true;
        return l41Var;
    }
}
