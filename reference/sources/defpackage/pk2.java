package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pk2 implements tj0 {
    public final g2 a;
    public final u60 b;
    public final zm2 c;
    public final sa0 d = fe2.b;

    public pk2(g2 g2Var, u60 u60Var, zm2 zm2Var) {
        this.a = g2Var;
        this.b = u60Var;
        this.c = zm2Var;
    }

    @Override // defpackage.tj0
    public final Object a(w71 w71Var, float f, ne2 ne2Var) {
        return c(w71Var, f, ia2.h0, ne2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(w71 w71Var, float f, ss2 ss2Var, n10 n10Var) {
        kk2 kk2Var;
        ss2 ss2Var2;
        if (n10Var instanceof kk2) {
            kk2Var = (kk2) n10Var;
            int i = kk2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                kk2Var.n = i - Integer.MIN_VALUE;
            } else {
                kk2Var = new kk2(this, n10Var);
            }
        } else {
            kk2Var = new kk2(this, n10Var);
        }
        Object objG = kk2Var.l;
        int i2 = kk2Var.n;
        if (i2 == 0) {
            m02.y(objG);
            mk2 mk2Var = new mk2(this, f, ss2Var, w71Var, null);
            kk2Var.k = ss2Var;
            kk2Var.n = 1;
            objG = ie1.G(this.d, mk2Var, kk2Var);
            y20 y20Var = y20.h;
            if (objG == y20Var) {
                return y20Var;
            }
            ss2Var2 = ss2Var;
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ss2Var2 = kk2Var.k;
            m02.y(objG);
        }
        zc zcVar = (zc) objG;
        ss2Var2.h(new Float(0.0f));
        return zcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(w71 w71Var, float f, ss2 ss2Var, n10 n10Var) {
        nk2 nk2Var;
        if (n10Var instanceof nk2) {
            nk2Var = (nk2) n10Var;
            int i = nk2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                nk2Var.m = i - Integer.MIN_VALUE;
            } else {
                nk2Var = new nk2(this, n10Var);
            }
        } else {
            nk2Var = new nk2(this, n10Var);
        }
        Object objB = nk2Var.k;
        int i2 = nk2Var.m;
        if (i2 == 0) {
            m02.y(objB);
            nk2Var.m = 1;
            objB = b(w71Var, f, ss2Var, nk2Var);
            Object obj = y20.h;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(objB);
        }
        zc zcVar = (zc) objB;
        return new Float(zcVar.a.floatValue() != 0.0f ? ((Number) zcVar.b.a()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(w71 w71Var, float f, float f2, lk2 lk2Var, n10 n10Var) {
        ok2 ok2Var;
        if (n10Var instanceof ok2) {
            ok2Var = (ok2) n10Var;
            int i = ok2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ok2Var.m = i - Integer.MIN_VALUE;
            } else {
                ok2Var = new ok2(this, n10Var);
            }
        } else {
            ok2Var = new ok2(this, n10Var);
        }
        ok2 ok2Var2 = ok2Var;
        Object objE = ok2Var2.k;
        int i2 = ok2Var2.m;
        if (i2 == 0) {
            m02.y(objE);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return ie1.b(f, f2, 28);
            }
            ok2Var2.m = 1;
            u60 u60Var = this.b;
            objE = (Math.abs(ys.l(u60Var, f2)) >= Math.abs(f) ? new g2((Object) u60Var, (byte) 11) : new xl1((Object) this.c, (byte) 15)).e(w71Var, new Float(f), new Float(f2), lk2Var, ok2Var2);
            y20 y20Var = y20.h;
            if (objE == y20Var) {
                return y20Var;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(objE);
        }
        return ((zc) objE).b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pk2) {
            pk2 pk2Var = (pk2) obj;
            return pk2Var.c.equals(this.c) && pk2Var.b == this.b && pk2Var.a == this.a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
