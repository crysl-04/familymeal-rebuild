package defpackage;

import com.familymeal.app.MealPlannerApp;
import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class b9 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public Object n;
    public Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(Object obj, Object obj2, Object obj3, Object obj4, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
        this.q = obj4;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) throws Throwable {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                ((b9) p((m10) obj2, (r9) obj)).r(j23Var);
                return y20.h;
            case 1:
                return ((b9) p((m10) obj2, (x20) obj)).r(j23Var);
            case 2:
                return ((b9) p((m10) obj2, (x20) obj)).r(j23Var);
            case 3:
                return ((b9) p((m10) obj2, (vp0) obj)).r(j23Var);
            case 4:
                return ((b9) p((m10) obj2, (ti2) obj)).r(j23Var);
            case 5:
                return ((b9) p((m10) obj2, (x20) obj)).r(j23Var);
            case 6:
                return ((b9) p((m10) obj2, (x20) obj)).r(j23Var);
            case 7:
                return ((b9) p((m10) obj2, (x20) obj)).r(j23Var);
            default:
                return ((b9) p((m10) obj2, (x20) obj)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.q;
        Object obj3 = this.p;
        switch (b) {
            case 0:
                b9 b9Var = new b9((u3) this.o, (c9) obj3, (k81) obj2, m10Var, (byte) 0);
                b9Var.n = obj;
                return b9Var;
            case 1:
                return new b9(this.n, (tb) this.o, (sj1) obj3, (sj1) obj2, m10Var, (byte) 1);
            case 2:
                return new b9((b81) this.n, (vp0) this.o, (hq) obj3, (qy0) obj2, m10Var, (byte) 2);
            case 3:
                b9 b9Var2 = new b9((x72) obj3, (je2) obj2, m10Var);
                b9Var2.n = obj;
                return b9Var2;
            case 4:
                b9 b9Var3 = new b9((pk0) this.o, (nn2) obj3, (Float) obj2, m10Var, (byte) 4);
                b9Var3.n = obj;
                return b9Var3;
            case 5:
                b9 b9Var4 = new b9((ga2) this.o, (rq) obj3, (ha2) obj2, m10Var, (byte) 5);
                b9Var4.n = obj;
                return b9Var4;
            case 6:
                b9 b9Var5 = new b9((d12) this.o, (aq0) obj3, (a20) obj2, m10Var, (byte) 6);
                b9Var5.n = obj;
                return b9Var5;
            case 7:
                return new b9((MealPlannerApp) this.o, (String) obj3, (sj1) obj2, m10Var, (byte) 7);
            default:
                return new b9((x72) this.n, (l72) this.o, (e91) obj3, (i93) obj2, m10Var, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01ba  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01e0 -> B:97:0x01e2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01e5 -> B:99:0x01e8). Please report as a decompilation issue!!! */
    @Override // defpackage.rk
    public final Object r(Object obj) throws Throwable {
        vp0 vp0Var;
        Object obj2;
        vp0 vp0Var2;
        x72 x72Var;
        uc0 uc0Var;
        Object objV;
        m10 m10Var;
        Object objG;
        sj1 sj1Var;
        Object objA;
        byte b = this.l;
        j23 j23Var = j23.a;
        y20 y20Var = y20.h;
        Object obj3 = this.p;
        Object obj4 = this.q;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (z) {
                    if (!z) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        m02.y(obj);
                    }
                    return null;
                }
                m02.y(obj);
                a9 a9Var = new a9((r9) this.n, (u3) this.o, (c9) obj3, (k81) obj4, null, (byte) 0);
                this.m = true;
                if (vs.x(a9Var, this) == y20Var) {
                    return y20Var;
                }
                wg.k();
                return null;
            case 1:
                Object obj5 = this.n;
                tb tbVar = (tb) this.o;
                boolean z2 = this.m;
                if (!z2) {
                    m02.y(obj);
                    if (uz0.g(obj5, tbVar.e.getValue())) {
                        return j23Var;
                    }
                    zm2 zm2Var = vb.a;
                    cd cdVar = (cd) ((sj1) obj3).getValue();
                    this.m = true;
                    if (tb.a(tbVar, obj5, cdVar, this) == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (!z2) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                }
                zm2 zm2Var2 = vb.a;
                vp0 vp0Var3 = (vp0) ((sj1) obj4).getValue();
                if (vp0Var3 == null) {
                    return j23Var;
                }
                vp0Var3.h(tbVar.d());
                return j23Var;
            case 2:
                boolean z3 = this.m;
                if (z3) {
                    if (z3) {
                        m02.y(obj);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                b81 b81Var = (b81) this.n;
                this.m = true;
                rt1 rt1Var = n60.a;
                Object objA2 = pz1.y(new i50(b81Var, (byte) 0)).a(new js(b81Var, (vp0) this.o, (hq) obj3, (qy0) obj4, (byte) 2), this);
                if (objA2 != y20Var) {
                    objA2 = j23Var;
                }
                return objA2 == y20Var ? y20Var : j23Var;
            case 3:
                x72 x72Var2 = (x72) obj3;
                boolean z4 = this.m;
                if (!z4) {
                    m02.y(obj);
                    vp0Var = (vp0) this.n;
                    obj2 = x72Var2.h;
                    if (!(obj2 instanceof tc0) || (obj2 instanceof qc0)) {
                        return j23Var;
                    }
                    rc0 rc0Var = obj2 instanceof rc0 ? (rc0) obj2 : null;
                    if (rc0Var != null) {
                        vp0Var.h(rc0Var);
                    }
                    fp fpVar = ((je2) obj4).B;
                    if (fpVar != null) {
                        this.n = vp0Var;
                        this.o = x72Var2;
                        this.m = true;
                        objV = fpVar.v(this);
                        if (objV == y20Var) {
                            return y20Var;
                        }
                        vp0Var2 = vp0Var;
                        x72Var = x72Var2;
                    } else {
                        vp0Var2 = vp0Var;
                        x72Var = x72Var2;
                        uc0Var = null;
                    }
                    x72Var.h = uc0Var;
                    vp0Var = vp0Var2;
                    obj2 = x72Var2.h;
                    if (obj2 instanceof tc0) {
                        return j23Var;
                    }
                    return j23Var;
                }
                if (!z4) {
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x72 x72Var3 = (x72) this.o;
                vp0 vp0Var4 = (vp0) this.n;
                m02.y(obj);
                vp0Var2 = vp0Var4;
                x72Var = x72Var3;
                objV = obj;
                uc0Var = (uc0) objV;
                x72Var.h = uc0Var;
                vp0Var = vp0Var2;
                obj2 = x72Var2.h;
                if (obj2 instanceof tc0) {
                    return j23Var;
                }
                return j23Var;
            case 4:
                nn2 nn2Var = (nn2) obj3;
                boolean z5 = this.m;
                if (!z5) {
                    m02.y(obj);
                    int iOrdinal = ((ti2) this.n).ordinal();
                    if (iOrdinal == 0) {
                        pk0 pk0Var = (pk0) this.o;
                        this.m = true;
                        return pk0Var.a(nn2Var, this) == y20Var ? y20Var : j23Var;
                    }
                    if (iOrdinal == 1) {
                        return j23Var;
                    }
                    if (iOrdinal == 2) {
                        Float f = (Float) obj4;
                        if (f == tz0.i0) {
                            throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                        }
                        nn2Var.i(null, f);
                        return j23Var;
                    }
                    wg.n();
                } else {
                    if (z5) {
                        m02.y(obj);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 5:
                boolean z6 = this.m;
                if (!z6) {
                    m02.y(obj);
                    m20 m20VarM = ((x20) this.n).f().m(c5.L);
                    m20VarM.getClass();
                    q20 q20Var = (q20) m20VarM;
                    ga2 ga2Var = (ga2) this.o;
                    o20 o20VarQ = cu.Q(q20Var, new az2(q20Var));
                    o20 o20VarI = o20VarQ.i(new ex2(o20VarQ, ga2Var.h));
                    m10Var = (rq) obj3;
                    this.n = m10Var;
                    this.m = true;
                    objG = ie1.G(o20VarI, (ha2) obj4, this);
                    if (objG == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (!z6) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m10 m10Var2 = (m10) this.n;
                    m02.y(obj);
                    m10Var = m10Var2;
                    objG = obj;
                }
                m10Var.g(objG);
                return j23Var;
            case 6:
                d12 d12Var = (d12) this.o;
                boolean z7 = this.m;
                if (!z7) {
                    m02.y(obj);
                    is2 is2Var = new is2((x20) this.n, new k22(d12Var), (aq0) obj3, (a20) obj4, null);
                    this.m = true;
                    return ou.l(d12Var, is2Var, this) == y20Var ? y20Var : j23Var;
                }
                if (z7) {
                    m02.y(obj);
                    return j23Var;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                boolean z8 = this.m;
                if (!z8) {
                    m02.y(obj);
                    sj1Var = (sj1) obj4;
                    this.n = sj1Var;
                    this.m = true;
                    LocalDate localDateNow = LocalDate.now();
                    localDateNow.getClass();
                    objA = ((MealPlannerApp) this.o).c().a((String) obj3, localDateNow, this);
                    if (objA == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (!z8) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sj1 sj1Var2 = (sj1) this.n;
                    m02.y(obj);
                    sj1Var = sj1Var2;
                    objA = obj;
                }
                sj1Var.setValue((i4) objA);
                return j23Var;
            default:
                i93 i93Var = (i93) obj4;
                e91 e91Var = (e91) obj3;
                l72 l72Var = (l72) this.o;
                boolean z9 = this.m;
                try {
                    if (!z9) {
                        m02.y(obj);
                        ah1 ah1Var = (ah1) ((x72) this.n).h;
                        if (ah1Var != null) {
                            ah1Var.i = vs.b(l72Var.x);
                        }
                        this.m = true;
                        k72 k72Var = new k72(l72Var, null);
                        o20 o20Var = this.i;
                        o20Var.getClass();
                        Object objG2 = ie1.G(l72Var.a, new a9(l72Var, k72Var, es.M(o20Var), null, (byte) 5), this);
                        if (objG2 != y20Var) {
                            objG2 = j23Var;
                        }
                        if (objG2 != y20Var) {
                            objG2 = j23Var;
                        }
                        if (objG2 == y20Var) {
                            return y20Var;
                        }
                    } else {
                        if (!z9) {
                            li1.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m02.y(obj);
                    }
                    e91Var.g().f(i93Var);
                    return j23Var;
                } catch (Throwable th) {
                    e91Var.g().f(i93Var);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(Object obj, Object obj2, Object obj3, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(x72 x72Var, je2 je2Var, m10 m10Var) {
        super(2, m10Var);
        this.l = (byte) 3;
        this.p = x72Var;
        this.q = je2Var;
    }
}
