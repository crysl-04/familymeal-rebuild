package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g60 implements bq0 {
    public final /* synthetic */ Long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ vp0 j;
    public final /* synthetic */ vp0 k;
    public final /* synthetic */ hq l;
    public final /* synthetic */ qy0 m;
    public final /* synthetic */ y40 n;
    public final /* synthetic */ vf2 o;
    public final /* synthetic */ s40 p;
    public final /* synthetic */ gm0 q;

    public g60(Long l, long j, vp0 vp0Var, vp0 vp0Var2, hq hqVar, qy0 qy0Var, y40 y40Var, vf2 vf2Var, s40 s40Var, gm0 gm0Var) {
        this.h = l;
        this.i = j;
        this.j = vp0Var;
        this.k = vp0Var2;
        this.l = hqVar;
        this.m = qy0Var;
        this.n = y40Var;
        this.o = vf2Var;
        this.p = s40Var;
        this.q = gm0Var;
    }

    @Override // defpackage.bq0
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = ((ab0) obj2).a;
        dr0 dr0Var = (dr0) obj3;
        ((Number) obj4).intValue();
        if (i == 0) {
            dr0Var.V(1567031954);
            n60.c(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, dr0Var, 0);
            dr0Var.p(false);
        } else if (i == 1) {
            dr0Var.V(1567050592);
            q40.a(this.h, this.j, this.l, this.m, this.n, this.o, this.p, this.q, dr0Var, 0);
            dr0Var.p(false);
        } else {
            dr0Var.V(1334373351);
            dr0Var.p(false);
        }
        return j23.a;
    }
}
