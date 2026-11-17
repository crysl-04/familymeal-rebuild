package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rc implements qk0 {
    public final /* synthetic */ byte h;
    public final Object i;
    public final Object j;
    public final Object k;

    public rc(qk0 qk0Var, o20 o20Var) {
        this.h = (byte) 4;
        this.i = o20Var;
        this.j = ie1.B(o20Var);
        this.k = new ha2(qk0Var, null, (byte) 5);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.qk0
    public final Object m(Object obj, m10 m10Var) {
        al0 al0Var;
        qk0 qk0Var;
        ql0 ql0Var;
        qk0 qk0Var2;
        rc rcVar = this;
        Object obj2 = obj;
        byte b = rcVar.h;
        y20 y20Var = y20.h;
        m10 m10Var2 = null;
        j23 j23Var = j23.a;
        Object obj3 = rcVar.k;
        Object obj4 = rcVar.j;
        Object obj5 = rcVar.i;
        switch (b) {
            case 0:
                qz2 qz2Var = (qz2) obj4;
                ((u32) obj5).setValue(Boolean.valueOf(((Boolean) obj2).booleanValue() ? ((Boolean) ((zp0) ((sj1) obj3).getValue()).f(qz2Var.a.g(), qz2Var.d.getValue())).booleanValue() : false));
                return j23Var;
            case 1:
                gz0 gz0Var = (gz0) obj2;
                ArrayList arrayList = (ArrayList) obj5;
                if (gz0Var instanceof ut0) {
                    arrayList.add(gz0Var);
                } else if (gz0Var instanceof vt0) {
                    arrayList.remove(((vt0) gz0Var).a);
                } else if (gz0Var instanceof wl0) {
                    arrayList.add(gz0Var);
                } else if (gz0Var instanceof xl0) {
                    arrayList.remove(((xl0) gz0Var).a);
                } else if (gz0Var instanceof m22) {
                    arrayList.add(gz0Var);
                } else if (gz0Var instanceof n22) {
                    arrayList.remove(((n22) gz0Var).a);
                } else if (gz0Var instanceof l22) {
                    arrayList.remove(((l22) gz0Var).a);
                }
                ie1.p((x20) obj4, null, new h((jk0) obj3, (gz0) dv.G0(arrayList), m10Var2, (byte) 16), 3);
                return j23Var;
            case 2:
                if (m10Var instanceof al0) {
                    al0Var = (al0) m10Var;
                    int i = al0Var.o;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        al0Var.o = i - Integer.MIN_VALUE;
                    } else {
                        al0Var = new al0(rcVar, m10Var);
                    }
                } else {
                    al0Var = new al0(rcVar, m10Var);
                }
                Object objF = al0Var.m;
                int i2 = al0Var.o;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            Object obj6 = al0Var.l;
                            rc rcVar2 = al0Var.k;
                            m02.y(objF);
                            obj2 = obj6;
                            rcVar = rcVar2;
                            if (!((Boolean) objF).booleanValue()) {
                                ((t72) rcVar.i).h = true;
                                qk0Var = (qk0) rcVar.j;
                                al0Var.k = null;
                                al0Var.l = null;
                                al0Var.o = 3;
                                if (qk0Var.m(obj2, al0Var) == y20Var) {
                                    return y20Var;
                                }
                            }
                        } else if (i2 != 3) {
                            li1.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    m02.y(objF);
                } else {
                    m02.y(objF);
                    if (((t72) obj5).h) {
                        al0Var.o = 1;
                        if (((qk0) obj4).m(obj2, al0Var) == y20Var) {
                            return y20Var;
                        }
                    } else {
                        al0Var.k = rcVar;
                        al0Var.l = obj2;
                        al0Var.o = 2;
                        objF = ((j72) obj3).f(obj2, al0Var);
                        if (objF == y20Var) {
                            return y20Var;
                        }
                        if (!((Boolean) objF).booleanValue()) {
                            ((t72) rcVar.i).h = true;
                            qk0Var = (qk0) rcVar.j;
                            al0Var.k = null;
                            al0Var.l = null;
                            al0Var.o = 3;
                            if (qk0Var.m(obj2, al0Var) == y20Var) {
                                return y20Var;
                            }
                        }
                    }
                }
                return j23Var;
            case 3:
                if (m10Var instanceof ql0) {
                    ql0Var = (ql0) m10Var;
                    int i3 = ql0Var.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ql0Var.l = i3 - Integer.MIN_VALUE;
                    } else {
                        ql0Var = new ql0(rcVar, m10Var);
                    }
                } else {
                    ql0Var = new ql0(rcVar, m10Var);
                }
                Object obj7 = ql0Var.k;
                int i4 = ql0Var.l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        qk0Var2 = ql0Var.m;
                        m02.y(obj7);
                    } else {
                        if (i4 != 2) {
                            li1.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m02.y(obj7);
                    }
                    return j23Var;
                }
                m02.y(obj7);
                qk0 qk0Var3 = (qk0) obj5;
                ql0Var.m = qk0Var3;
                ql0Var.l = 1;
                Object objP = cu.P(ql0Var, (vp0) obj3, (ga2) obj4, true, false);
                if (objP == y20Var) {
                    return y20Var;
                }
                qk0Var2 = qk0Var3;
                obj7 = objP;
                ql0Var.m = null;
                ql0Var.l = 2;
                if (qk0Var2.m(obj7, ql0Var) == y20Var) {
                    return y20Var;
                }
                return j23Var;
            default:
                Object objH0 = es.h0((o20) obj5, obj2, obj4, (ha2) obj3, m10Var);
                return objH0 == y20Var ? objH0 : j23Var;
        }
    }

    public /* synthetic */ rc(Object obj, Object obj2, Object obj3, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }
}
