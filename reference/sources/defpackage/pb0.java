package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pb0 implements qk0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public pb0(qb0 qb0Var, x72 x72Var, qk0 qk0Var) {
        this.h = (byte) 0;
        this.i = x72Var;
        this.j = qk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:137:0x027e  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d8  */
    @Override // defpackage.qk0
    public final Object m(Object obj, m10 m10Var) {
        ob0 ob0Var;
        dl0 dl0Var;
        be1 be1Var;
        n22 n22Var;
        l22 l22Var;
        Object n22Var2;
        pb0 pb0Var = this;
        Object obj2 = obj;
        byte b = pb0Var.h;
        y20 y20Var = y20.h;
        Object obj3 = pb0Var.i;
        j23 j23Var = j23.a;
        Object obj4 = pb0Var.j;
        switch (b) {
            case 0:
                x72 x72Var = (x72) obj3;
                if (m10Var instanceof ob0) {
                    ob0Var = (ob0) m10Var;
                    int i = ob0Var.m;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ob0Var.m = i - Integer.MIN_VALUE;
                    } else {
                        ob0Var = new ob0(pb0Var, m10Var);
                    }
                } else {
                    ob0Var = new ob0(pb0Var, m10Var);
                }
                Object obj5 = ob0Var.k;
                int i2 = ob0Var.m;
                if (i2 == 0) {
                    m02.y(obj5);
                    Object obj6 = x72Var.h;
                    if (obj6 == s60.r0 || !uz0.g(obj6, obj2)) {
                        x72Var.h = obj2;
                        ob0Var.m = 1;
                        if (((qk0) obj4).m(obj2, ob0Var) == y20Var) {
                            return y20Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj5);
                }
                return j23Var;
            case 1:
                if (m10Var instanceof dl0) {
                    dl0Var = (dl0) m10Var;
                    int i3 = dl0Var.m;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        dl0Var.m = i3 - Integer.MIN_VALUE;
                    } else {
                        dl0Var = new dl0(pb0Var, m10Var);
                    }
                } else {
                    dl0Var = new dl0(pb0Var, m10Var);
                }
                Object objF = dl0Var.l;
                int i4 = dl0Var.m;
                if (i4 == 0) {
                    m02.y(objF);
                    dl0Var.k = pb0Var;
                    dl0Var.o = obj2;
                    dl0Var.m = 1;
                    objF = ((zp0) obj4).f(obj2, dl0Var);
                    if (objF == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (i4 != 1) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj7 = dl0Var.o;
                    pb0 pb0Var2 = dl0Var.k;
                    m02.y(objF);
                    obj2 = obj7;
                    pb0Var = pb0Var2;
                }
                if (!((Boolean) objF).booleanValue()) {
                    return j23Var;
                }
                ((x72) pb0Var.i).h = obj2;
                throw new a(pb0Var);
            case 2:
                gz0 gz0Var = (gz0) obj2;
                ArrayList arrayList = (ArrayList) obj3;
                if (gz0Var instanceof wl0) {
                    arrayList.add(gz0Var);
                } else if (gz0Var instanceof xl0) {
                    arrayList.remove(((xl0) gz0Var).a);
                }
                ((sj1) obj4).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return j23Var;
            case 3:
                ce1 ce1Var = (ce1) obj3;
                LinkedHashMap linkedHashMap = ce1Var.b;
                if (m10Var instanceof be1) {
                    be1Var = (be1) m10Var;
                    int i5 = be1Var.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        be1Var.l = i5 - Integer.MIN_VALUE;
                    } else {
                        be1Var = new be1(pb0Var, m10Var);
                    }
                } else {
                    be1Var = new be1(pb0Var, m10Var);
                }
                Object obj8 = be1Var.k;
                int i6 = be1Var.l;
                if (i6 == 0) {
                    m02.y(obj8);
                    qk0 qk0Var = (qk0) obj4;
                    gz0 gz0Var2 = (gz0) obj2;
                    if (gz0Var2 instanceof m22) {
                        m22 m22Var = new m22(up1.d(((m22) gz0Var2).a, ce1Var.a));
                        linkedHashMap.put(gz0Var2, m22Var);
                        n22Var2 = m22Var;
                    } else if (gz0Var2 instanceof l22) {
                        l22Var = (l22) gz0Var2;
                        m22 m22Var2 = (m22) linkedHashMap.remove(l22Var.a);
                        if (m22Var2 != null) {
                            n22Var2 = l22Var;
                            n22Var2 = new l22(m22Var2);
                        }
                    } else if (gz0Var2 instanceof n22) {
                        n22Var = (n22) gz0Var2;
                        m22 m22Var3 = (m22) linkedHashMap.remove(n22Var.a);
                        if (m22Var3 != null) {
                            n22Var2 = gz0Var2;
                            n22Var2 = n22Var;
                            n22Var2 = new n22(m22Var3);
                        }
                    }
                    n22Var2 = gz0Var2;
                    n22Var2 = n22Var;
                    n22Var2 = gz0Var2;
                    n22Var2 = l22Var;
                    be1Var.l = 1;
                    if (qk0Var.m(n22Var2, be1Var) == y20Var) {
                        return y20Var;
                    }
                } else {
                    if (i6 != 1) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m02.y(obj8);
                }
                return j23Var;
            case 4:
                gz0 gz0Var3 = (gz0) obj2;
                ga gaVar = (ga) obj3;
                if (!(gz0Var3 instanceof o22)) {
                    x20 x20Var = (x20) obj4;
                    kt ktVar = gaVar.A;
                    float f = 0.0f;
                    if (ktVar == null) {
                        boolean z = gaVar.w;
                        n80 n80Var = gaVar.z;
                        ktVar = new kt();
                        ktVar.a = z;
                        ktVar.b = n80Var;
                        ktVar.c = ie1.a(0.0f);
                        ktVar.d = new ArrayList();
                        dt.H(gaVar);
                        gaVar.A = ktVar;
                    }
                    kt ktVar2 = ktVar;
                    ArrayList arrayList2 = (ArrayList) ktVar2.d;
                    if (gz0Var3 instanceof ut0) {
                        arrayList2.add(gz0Var3);
                    } else if (gz0Var3 instanceof vt0) {
                        arrayList2.remove(((vt0) gz0Var3).a);
                    } else if (gz0Var3 instanceof wl0) {
                        arrayList2.add(gz0Var3);
                    } else if (gz0Var3 instanceof xl0) {
                        arrayList2.remove(((xl0) gz0Var3).a);
                    } else if (gz0Var3 instanceof jd0) {
                        arrayList2.add(gz0Var3);
                    } else if (gz0Var3 instanceof kd0) {
                        arrayList2.remove(((kd0) gz0Var3).a);
                    } else if (gz0Var3 instanceof id0) {
                        arrayList2.remove(((id0) gz0Var3).a);
                    }
                    gz0 gz0Var4 = (gz0) dv.G0(arrayList2);
                    if (!uz0.g((gz0) ktVar2.e, gz0Var4)) {
                        m10 m10Var2 = null;
                        if (gz0Var4 != null) {
                            ((n80) ktVar2.b).a();
                            boolean z2 = gz0Var4 instanceof ut0;
                            if (z2) {
                                f = 0.08f;
                            } else if (gz0Var4 instanceof wl0) {
                                f = 0.1f;
                            } else if (gz0Var4 instanceof jd0) {
                                f = 0.16f;
                            }
                            float f2 = f;
                            q03 q03Var = z92.a;
                            if (!z2 && ((gz0Var4 instanceof wl0) || (gz0Var4 instanceof jd0))) {
                                q03Var = new q03(45, 0, le0.c);
                            }
                            ie1.p(x20Var, null, new sl1(ktVar2, f2, q03Var, m10Var2, (byte) 1), 3);
                        } else {
                            gz0 gz0Var5 = (gz0) ktVar2.e;
                            q03 q03Var2 = z92.a;
                            if (!(gz0Var5 instanceof ut0) && !(gz0Var5 instanceof wl0) && (gz0Var5 instanceof jd0)) {
                                q03Var2 = new q03(150, 0, le0.c);
                            }
                            ie1.p(x20Var, null, new ha2(ktVar2, q03Var2, m10Var2, (byte) 2), 3);
                        }
                        ktVar2.e = gz0Var4;
                    }
                } else if (gaVar.D) {
                    gaVar.J0((o22) gz0Var3);
                } else {
                    gaVar.E.a(gz0Var3);
                }
                return j23Var;
            case 5:
                up1 up1Var = (up1) obj2;
                long j = up1Var.a;
                tb tbVar = (tb) obj3;
                if ((((up1) tbVar.d()).a & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & j) == 9205357640488583168L || Float.intBitsToFloat((int) (((up1) tbVar.d()).a & 4294967295L)) == Float.intBitsToFloat((int) (4294967295L & j))) {
                    Object objE = tbVar.e(m10Var, up1Var);
                    return objE == y20Var ? objE : j23Var;
                }
                ie1.p((x20) obj4, null, new r0(tbVar, j, null, (byte) 4), 3);
                return j23Var;
            default:
                gz0 gz0Var6 = (gz0) obj2;
                v72 v72Var = (v72) obj3;
                if (gz0Var6 instanceof m22) {
                    v72Var.h++;
                } else if ((gz0Var6 instanceof n22) || (gz0Var6 instanceof l22)) {
                    v72Var.h--;
                }
                boolean z3 = v72Var.h > 0;
                rx2 rx2Var = (rx2) obj4;
                if (rx2Var.y != z3) {
                    rx2Var.y = z3;
                    vs.E(rx2Var);
                }
                return j23Var;
        }
    }

    public /* synthetic */ pb0(Object obj, Object obj2, byte b) {
        this.h = b;
        this.j = obj;
        this.i = obj2;
    }

    public /* synthetic */ pb0(Object obj, Object obj2, byte b, boolean z) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
    }
}
