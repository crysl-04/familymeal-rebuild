package defpackage;

import android.view.View;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ha2 extends mq2 implements zp0 {
    public final /* synthetic */ byte l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ha2(Object obj, Object obj2, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.n = obj;
        this.o = obj2;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        byte b = this.l;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                return ((ha2) p((m10) obj2, (x20) obj)).r(j23Var);
            case 1:
                return ((ha2) p((m10) obj2, (x20) obj)).r(j23Var);
            case 2:
                return ((ha2) p((m10) obj2, (x20) obj)).r(j23Var);
            case 3:
                return ((ha2) p((m10) obj2, (ru1) obj)).r(j23Var);
            case 4:
                return ((ha2) p((m10) obj2, (x20) obj)).r(j23Var);
            case 5:
                return ((ha2) p((m10) obj2, obj)).r(j23Var);
            case 6:
                return ((ha2) p((m10) obj2, (x20) obj)).r(j23Var);
            default:
                return ((ha2) p((m10) obj2, (x20) obj)).r(j23Var);
        }
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        byte b = this.l;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                ha2 ha2Var = new ha2((vp0) obj2, m10Var, (byte) 0);
                ha2Var.n = obj;
                return ha2Var;
            case 1:
                return new ha2((tc0) this.n, (je2) obj2, m10Var, (byte) 1);
            case 2:
                return new ha2((kt) this.n, (q03) obj2, m10Var, (byte) 2);
            case 3:
                ha2 ha2Var2 = new ha2((p03) obj2, m10Var, (byte) 3);
                ha2Var2.n = obj;
                return ha2Var2;
            case 4:
                return new ha2((p03) this.n, (jw0) obj2, m10Var, (byte) 4);
            case 5:
                ha2 ha2Var3 = new ha2((qk0) obj2, m10Var, (byte) 5);
                ha2Var3.n = obj;
                return ha2Var3;
            case 6:
                return new ha2((p63) this.n, (vp0) obj2, m10Var, (byte) 6);
            default:
                return new ha2((l72) this.n, (View) obj2, m10Var, (byte) 7);
        }
    }

    @Override // defpackage.rk
    public final Object r(Object obj) {
        byte b = this.l;
        byte b2 = 0;
        j23 j23Var = j23.a;
        Object obj2 = this.o;
        y20 y20Var = y20.h;
        byte b3 = 1;
        m10 m10Var = null;
        switch (b) {
            case 0:
                boolean z = this.m;
                if (!z) {
                    m02.y(obj);
                    if (((x20) this.n).f().m(az2.i) != null) {
                        this.m = true;
                        Object objH = ((vp0) obj2).h(this);
                        return objH == y20Var ? y20Var : objH;
                    }
                    li1.g("Expected a TransactionElement in the CoroutineContext but none was found.");
                } else {
                    if (z) {
                        m02.y(obj);
                        return obj;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                boolean z2 = this.m;
                if (z2) {
                    if (z2) {
                        m02.y(obj);
                        return j23Var;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                tc0 tc0Var = (tc0) this.n;
                float f = tc0Var.b ? -1.0f : 1.0f;
                qe2 qe2Var = ((je2) obj2).Y;
                long j = tc0Var.a;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
                this.m = true;
                return qe2Var.c(jFloatToRawIntBits, false, this) == y20Var ? y20Var : j23Var;
            case 2:
                boolean z3 = this.m;
                if (!z3) {
                    m02.y(obj);
                    this.m = true;
                    return tb.a((tb) ((kt) this.n).c, new Float(0.0f), (q03) obj2, this) == y20Var ? y20Var : j23Var;
                }
                if (z3) {
                    m02.y(obj);
                    return j23Var;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.m;
                if (z4) {
                    if (z4) {
                        m02.y(obj);
                        return obj;
                    }
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m02.y(obj);
                ru1 ru1Var = (ru1) this.n;
                this.m = true;
                Object objA = ((p03) obj2).a(ru1Var, this);
                return objA == y20Var ? y20Var : objA;
            case 4:
                boolean z5 = this.m;
                if (!z5) {
                    m02.y(obj);
                    p03 p03Var = (p03) this.n;
                    this.m = true;
                    obj = p03Var.b(this);
                    if (obj == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (!z5) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj);
                }
                return j23Var;
            case 5:
                boolean z6 = this.m;
                if (!z6) {
                    m02.y(obj);
                    Object obj3 = this.n;
                    this.m = true;
                    return ((qk0) obj2).m(obj3, this) == y20Var ? y20Var : j23Var;
                }
                if (z6) {
                    m02.y(obj);
                    return j23Var;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                p63 p63Var = (p63) this.n;
                lu1 lu1Var = p63Var.j;
                boolean z7 = this.m;
                try {
                    if (!z7) {
                        m02.y(obj);
                        r70 r70Var = ya0.a;
                        qv2 qv2Var = new qv2((vp0) obj2, m10Var, b3);
                        this.m = true;
                        obj = ie1.G(r70Var, qv2Var, this);
                        if (obj == y20Var) {
                            return y20Var;
                        }
                    } else {
                        if (!z7) {
                            li1.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m02.y(obj);
                    }
                    dz1 dz1Var = (dz1) obj;
                    String strConcat = dz1Var.b;
                    boolean z8 = dz1Var.a;
                    if (co2.X(strConcat)) {
                        strConcat = null;
                    }
                    if (strConcat == null) {
                        strConcat = z8 ? null : "未完成";
                    } else if (!z8) {
                        strConcat = "未完成：".concat(strConcat);
                    }
                    p63Var.k.setValue(strConcat);
                    if (z8) {
                        p63Var.f();
                        break;
                    }
                    lu1Var.setValue(null);
                    return j23Var;
                } catch (Throwable th) {
                    lu1Var.setValue(null);
                    throw th;
                }
            default:
                l72 l72Var = (l72) this.n;
                View view = (View) obj2;
                boolean z9 = this.m;
                try {
                    if (!z9) {
                        m02.y(obj);
                        this.m = true;
                        Object objB = dt.B(l72Var.u, new j72(2, m10Var, b2), this);
                        if (objB != y20Var) {
                            objB = j23Var;
                        }
                        if (objB == y20Var) {
                            return y20Var;
                        }
                    } else {
                        if (!z9) {
                            li1.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m02.y(obj);
                    }
                    if (j93.a(view) != l72Var) {
                        return j23Var;
                    }
                    view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    return j23Var;
                } catch (Throwable th2) {
                    if (j93.a(view) == l72Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                    throw th2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ha2(Object obj, m10 m10Var, byte b) {
        super(2, m10Var);
        this.l = b;
        this.o = obj;
    }
}
