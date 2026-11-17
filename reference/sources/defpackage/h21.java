package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class h21 extends c92 implements aq0 {
    public j21 j;
    public boolean k;
    public /* synthetic */ x60 l;
    public final /* synthetic */ j21 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h21(j21 j21Var, m10 m10Var) {
        super(3, m10Var);
        this.m = j21Var;
    }

    @Override // defpackage.aq0
    public final Object c(Object obj, Object obj2, Object obj3) {
        h21 h21Var = new h21(this.m, (m10) obj3);
        h21Var.l = (x60) obj;
        return h21Var.r(j23.a);
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        j21 j21Var = this.m;
        short s = j21Var.b;
        fe feVar = j21Var.a;
        x60 x60Var = this.l;
        boolean z = this.k;
        if (!z) {
            m02.y(obj);
            byte bV = feVar.v();
            if (bV == 1) {
                return j21Var.d(true);
            }
            if (bV == 0) {
                return j21Var.d(false);
            }
            if (bV != 6) {
                if (bV != 8) {
                    fe.m(feVar, "Can't begin reading element, unexpected token", 0, null, 6);
                    throw null;
                }
                int i = j21Var.c + 1;
                j21Var.c = i;
                if (i >= s) {
                    ou.C(s);
                    throw null;
                }
                e11 e11VarB = j21Var.b();
                j21Var.c--;
                return e11VarB;
            }
            int i2 = j21Var.c + 1;
            j21Var.c = i2;
            if (i2 >= s) {
                ou.C(s);
                throw null;
            }
            this.l = null;
            this.j = j21Var;
            this.k = true;
            obj = j21Var.c(x60Var, this);
            y20 y20Var = y20.h;
            if (obj == y20Var) {
                return y20Var;
            }
        } else {
            if (!z) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j21Var = this.j;
            m02.y(obj);
        }
        n11 n11Var = (n11) obj;
        j21Var.c--;
        return n11Var;
    }
}
