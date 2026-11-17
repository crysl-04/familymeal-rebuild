package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class c60 implements zp0 {
    public final /* synthetic */ b81 h;
    public final /* synthetic */ qy0 i;
    public final /* synthetic */ hq j;
    public final /* synthetic */ iq k;
    public final /* synthetic */ vp0 l;
    public final /* synthetic */ dq m;
    public final /* synthetic */ Long n;
    public final /* synthetic */ y40 o;
    public final /* synthetic */ vf2 p;
    public final /* synthetic */ s40 q;

    public c60(b81 b81Var, qy0 qy0Var, hq hqVar, iq iqVar, vp0 vp0Var, dq dqVar, Long l, y40 y40Var, vf2 vf2Var, s40 s40Var) {
        this.h = b81Var;
        this.i = qy0Var;
        this.j = hqVar;
        this.k = iqVar;
        this.l = vp0Var;
        this.m = dqVar;
        this.n = l;
        this.o = y40Var;
        this.p = vf2Var;
        this.q = s40Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dr0 dr0Var = (dr0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objK = dr0Var.K();
            yy yyVar = zy.a;
            if (objK == yyVar) {
                objK = new rt((byte) 11);
                dr0Var.f0(objK);
            }
            rg1 rg1VarA = tg2.a(og1.h, false, (vp0) objK);
            w40 w40Var = w40.a;
            u60 u60Var = new u60(new vj0());
            zm2 zm2VarA0 = ls.a0(gh1.j, dr0Var);
            boolean zF = dr0Var.f(u60Var);
            b81 b81Var = this.h;
            boolean zF2 = zF | dr0Var.f(b81Var);
            Object objK2 = dr0Var.K();
            if (zF2 || objK2 == yyVar) {
                pk2 pk2Var = new pk2(new g2(new x71(b81Var), (byte) 9), u60Var, zm2VarA0);
                dr0Var.f0(pk2Var);
                objK2 = pk2Var;
            }
            pk2 pk2Var2 = (pk2) objK2;
            boolean zH = dr0Var.h(this.i) | dr0Var.h(this.j) | dr0Var.f(this.k) | dr0Var.f(this.l);
            dq dqVar = this.m;
            boolean zF3 = zH | dr0Var.f(dqVar) | dr0Var.f(this.n) | dr0Var.h(this.o) | dr0Var.f(this.p) | dr0Var.f(this.q);
            Object objK3 = dr0Var.K();
            if (zF3 || objK3 == yyVar) {
                a60 a60Var = new a60(this.i, this.j, this.k, this.l, dqVar, this.n, this.o, this.p, this.q, (byte) 0);
                dr0Var.f0(a60Var);
                objK3 = a60Var;
            }
            cu.i(rg1VarA, b81Var, null, null, null, pk2Var2, false, null, (vp0) objK3, dr0Var, 0);
        } else {
            dr0Var.Q();
        }
        return j23.a;
    }
}
