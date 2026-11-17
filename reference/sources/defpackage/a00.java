package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class a00 extends fp {
    public final dp w;

    public a00(int i, dp dpVar) {
        super(i);
        this.w = dpVar;
        if (dpVar == dp.h) {
            li1.h("This implementation does not support suspension for senders, use ", z72.a(fp.class).c(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        li1.e(jp1.i(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    public final Object J(Object obj, boolean z) {
        dp dpVar = this.w;
        dp dpVar2 = dp.j;
        j23 j23Var = j23.a;
        if (dpVar == dpVar2) {
            Object objS = super.s(obj);
            return (!(objS instanceof ns) || (objS instanceof ms)) ? objS : j23Var;
        }
        Object obj2 = hp.d;
        os osVar = (os) hi.a.getObjectVolatile(this, fp.u);
        while (true) {
            long andIncrement = fp.i.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zT = t(andIncrement, false);
            int i = hp.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (osVar.d != j3) {
                os osVarI = i(j3, osVar);
                if (osVarI != null) {
                    osVar = osVarI;
                } else if (zT) {
                    return new ms(n());
                }
            }
            int iG = G(osVar, i2, obj, j, obj2, zT);
            if (iG == 0) {
                osVar.a();
                return j23Var;
            }
            if (iG != 1) {
                if (iG != 2) {
                    if (iG == 3) {
                        li1.g("unexpected");
                        return null;
                    }
                    if (iG == 4) {
                        if (j < m()) {
                            osVar.a();
                        }
                        return new ms(n());
                    }
                    if (iG == 5) {
                        osVar.a();
                    }
                } else {
                    if (zT) {
                        osVar.h();
                        return new ms(n());
                    }
                    x53 x53Var = obj2 instanceof x53 ? (x53) obj2 : null;
                    if (x53Var != null) {
                        x53Var.a(osVar, i2 + i);
                    }
                    f((osVar.d * j2) + ((long) i2));
                }
            }
            return j23Var;
        }
    }

    @Override // defpackage.fp, defpackage.lh2
    public final Object c(m10 m10Var, Object obj) throws Throwable {
        if (J(obj, true) instanceof ms) {
            throw n();
        }
        return j23.a;
    }

    @Override // defpackage.fp, defpackage.lh2
    public final Object s(Object obj) {
        return J(obj, false);
    }

    @Override // defpackage.fp
    public final boolean x() {
        return this.w == dp.i;
    }
}
