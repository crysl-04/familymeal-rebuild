package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v00 extends mq2 implements zp0 {
    public final /* synthetic */ byte l = 1;
    public boolean m;
    public final /* synthetic */ long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v00(d02 d02Var, String str, long j, qw2 qw2Var, kv2 kv2Var, xp1 xp1Var, m10 m10Var) {
        super(2, m10Var);
        this.o = d02Var;
        this.p = str;
        this.n = j;
        this.q = qw2Var;
        this.r = kv2Var;
        this.s = xp1Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                return ((v00) p((m10) obj2, (oe2) obj)).r(j23Var);
            default:
                return ((v00) p((m10) obj2, (x20) obj)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.s;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        switch (b) {
            case 0:
                v00 v00Var = new v00((t23) obj5, (x00) obj4, (vo) obj3, this.n, (s01) obj2, m10Var);
                v00Var.o = obj;
                return v00Var;
            default:
                return new v00((d02) this.o, (String) obj5, this.n, (qw2) obj4, (kv2) obj3, (xp1) obj2, m10Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        Object objG;
        byte b = this.l;
        Object obj2 = this.q;
        y20 y20Var = y20.h;
        Object obj3 = this.r;
        Object obj4 = this.p;
        Object obj5 = this.s;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                vo voVar = (vo) obj3;
                x00 x00Var = (x00) obj2;
                t23 t23Var = (t23) obj4;
                boolean z = this.m;
                if (!z) {
                    m02.y(obj);
                    oe2 oe2Var = (oe2) this.o;
                    t23Var.e = x00Var.J0(voVar, this.n);
                    qb qbVar = new qb(x00Var, t23Var, (s01) obj5, oe2Var);
                    zi ziVar = new zi((Object) x00Var, (Object) t23Var, (Object) voVar, (byte) 3);
                    this.m = true;
                    if (t23Var.a(qbVar, ziVar, this) == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (!z) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                }
                return j23Var;
            default:
                xp1 xp1Var = (xp1) obj5;
                String str = (String) obj4;
                kv2 kv2Var = (kv2) obj3;
                boolean z2 = this.m;
                if (!z2) {
                    m02.y(obj);
                    d02 d02Var = (d02) this.o;
                    this.m = true;
                    d02Var.getClass();
                    if (str.length() != 0) {
                        long j = this.n;
                        if (qw2.c(j)) {
                            objG = null;
                        } else {
                            objG = ie1.G(d02Var.a, new hd0(d02Var, new c02(str, j, d02Var, null), (m10) null), this);
                        }
                    } else {
                        objG = null;
                    }
                    if (objG == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (!z2) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                    objG = obj;
                }
                qw2 qw2Var = (qw2) objG;
                if (qw2Var != null) {
                    long j2 = qw2Var.a;
                    long jA = m02.a(xp1Var.n((int) (j2 >> 32)), xp1Var.n((int) (j2 & 4294967295L)));
                    if (!qw2.a(jA, (qw2) obj2) && uz0.g(kv2Var.l().a.i, str) && xp1Var == kv2Var.b) {
                        kv2Var.c.h(kv2.b(kv2Var.l().a, jA));
                        kv2Var.v = new qw2(jA);
                    }
                }
                return j23Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v00(t23 t23Var, x00 x00Var, vo voVar, long j, s01 s01Var, m10 m10Var) {
        super(2, m10Var);
        this.p = t23Var;
        this.q = x00Var;
        this.r = voVar;
        this.n = j;
        this.s = s01Var;
    }
}
