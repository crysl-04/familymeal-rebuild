package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hj1 extends c92 implements zp0 {
    public lr0 j;
    public ij1 k;
    public long[] l;
    public int m;
    public boolean n;
    public /* synthetic */ m10 o;
    public final /* synthetic */ ij1 p;
    public final /* synthetic */ lr0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj1(ij1 ij1Var, lr0 lr0Var, m10 m10Var) {
        super(2, m10Var);
        this.p = ij1Var;
        this.q = lr0Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((hj1) p((m10) obj2, (oh2) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        hj1 hj1Var = new hj1(this.p, this.q, m10Var);
        hj1Var.o = (m10) obj;
        return hj1Var;
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        oh2 oh2Var;
        ij1 ij1Var;
        long[] jArr;
        int i;
        lr0 lr0Var;
        boolean z = this.n;
        if (!z) {
            m02.y(obj);
            oh2Var = (oh2) this.o;
            ij1Var = this.p;
            gj1 gj1Var = ij1Var.i;
            jArr = gj1Var.c;
            i = gj1Var.e;
            lr0Var = this.q;
        } else {
            if (!z) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.m;
            jArr = this.l;
            ij1Var = this.k;
            lr0Var = this.j;
            oh2Var = (oh2) this.o;
            m02.y(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return j23.a;
        }
        int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
        lr0Var.i = i;
        Object obj2 = ij1Var.i.b[i];
        this.o = oh2Var;
        this.j = lr0Var;
        this.k = ij1Var;
        this.l = jArr;
        this.m = i2;
        this.n = true;
        oh2Var.b(obj2, this);
        return y20.h;
    }
}
