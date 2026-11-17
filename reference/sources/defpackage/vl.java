package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vl extends c92 implements zp0 {
    public nn2 j;
    public s02 k;
    public long l;
    public byte m;
    public /* synthetic */ Object n;
    public final /* synthetic */ x20 o;
    public final /* synthetic */ ry2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(x20 x20Var, ry2 ry2Var, m10 m10Var) {
        super(2, m10Var);
        this.o = x20Var;
        this.p = ry2Var;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        return ((vl) p((m10) obj2, (sq2) obj)).r(j23.a);
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        vl vlVar = new vl(this.o, this.p, m10Var);
        vlVar.n = obj;
        return vlVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9 A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #1 {all -> 0x00c5, blocks: (B:8:0x0015, B:34:0x00b5, B:36:0x00b9), top: B:49:0x0015 }] */
    @Override // defpackage.rk
    public final Object r(Object obj) throws Throwable {
        nn2 nn2VarN;
        s02 s02Var;
        long j;
        sq2 sq2Var;
        nn2 nn2Var;
        nn2 nn2Var2;
        z02 z02Var;
        byte b = this.m;
        byte b2 = 0;
        m10 m10Var = null;
        y20 y20Var = y20.h;
        if (b == 0) {
            m02.y(obj);
            sq2 sq2Var2 = (sq2) this.n;
            nn2VarN = h7.N(Boolean.FALSE);
            long jC = sq2Var2.i().c();
            this.n = sq2Var2;
            this.j = nn2VarN;
            s02Var = s02.h;
            this.k = s02Var;
            this.l = jC;
            this.m = (byte) 1;
            Object objB = ns2.b(sq2Var2, this, 1);
            if (objB != y20Var) {
                j = jC;
                sq2Var = sq2Var2;
                obj = objB;
            }
            return y20Var;
        }
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nn2Var2 = (nn2) this.n;
                try {
                    m02.y(obj);
                    z02Var = (z02) obj;
                    if (z02Var != null) {
                        z02Var.a();
                    }
                    Boolean bool = Boolean.FALSE;
                    nn2Var2.getClass();
                    nn2Var2.i(null, bool);
                    return j23.a;
                } catch (Throwable th) {
                    th = th;
                    Boolean bool2 = Boolean.FALSE;
                    nn2Var2.getClass();
                    nn2Var2.i(null, bool2);
                    throw th;
                }
            }
            s02 s02Var2 = this.k;
            nn2Var = this.j;
            sq2Var = (sq2) this.n;
            try {
                m02.y(obj);
                Boolean bool3 = Boolean.FALSE;
                nn2Var.getClass();
                nn2Var.i(null, bool3);
            } catch (t02 unused) {
                s02Var = s02Var2;
                nn2VarN = nn2Var;
                ie1.p(this.o, null, new ul(nn2VarN, this.p, m10Var, b2), 1);
                this.n = nn2VarN;
                this.j = null;
                this.k = null;
                this.m = (byte) 3;
                obj = ns2.h(sq2Var, s02Var, this);
                if (obj != y20Var) {
                    nn2Var2 = nn2VarN;
                    z02Var = (z02) obj;
                    if (z02Var != null) {
                        z02Var.a();
                    }
                    Boolean bool4 = Boolean.FALSE;
                    nn2Var2.getClass();
                    nn2Var2.i(null, bool4);
                }
                return y20Var;
            } catch (Throwable th2) {
                th = th2;
                nn2Var2 = nn2Var;
                Boolean bool5 = Boolean.FALSE;
                nn2Var2.getClass();
                nn2Var2.i(null, bool5);
                throw th;
            }
            return j23.a;
        }
        long j2 = this.l;
        s02 s02Var3 = this.k;
        nn2 nn2Var3 = this.j;
        sq2 sq2Var3 = (sq2) this.n;
        m02.y(obj);
        s02Var = s02Var3;
        nn2VarN = nn2Var3;
        j = j2;
        sq2Var = sq2Var3;
        long j3 = j;
        byte b3 = ((z02) obj).i;
        if (b3 == 1 || b3 == 3) {
            try {
                try {
                    tl tlVar = new tl(s02Var, m10Var, b2);
                    this.n = sq2Var;
                    this.j = nn2VarN;
                    this.k = s02Var;
                    this.m = (byte) 2;
                    if (sq2Var.m(j3, tlVar, this) != y20Var) {
                        nn2Var = nn2VarN;
                        Boolean bool6 = Boolean.FALSE;
                        nn2Var.getClass();
                        nn2Var.i(null, bool6);
                    }
                } catch (t02 unused2) {
                    ie1.p(this.o, null, new ul(nn2VarN, this.p, m10Var, b2), 1);
                    this.n = nn2VarN;
                    this.j = null;
                    this.k = null;
                    this.m = (byte) 3;
                    obj = ns2.h(sq2Var, s02Var, this);
                    if (obj != y20Var) {
                        nn2Var2 = nn2VarN;
                        z02Var = (z02) obj;
                        if (z02Var != null) {
                            z02Var.a();
                        }
                        Boolean bool7 = Boolean.FALSE;
                        nn2Var2.getClass();
                        nn2Var2.i(null, bool7);
                        return j23.a;
                    }
                }
                return y20Var;
            } catch (Throwable th3) {
                th = th3;
                nn2Var2 = nn2VarN;
                Boolean bool8 = Boolean.FALSE;
                nn2Var2.getClass();
                nn2Var2.i(null, bool8);
                throw th;
            }
        }
        return j23.a;
    }
}
