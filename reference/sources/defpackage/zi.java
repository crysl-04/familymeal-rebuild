package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zi implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ zi(dr0 dr0Var, as asVar, dk2 dk2Var, ph1 ph1Var) {
        this.h = (byte) 4;
        this.i = dr0Var;
        this.j = asVar;
        this.k = dk2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kp0
    public final Object a() {
        int i;
        r72 r72Var;
        r72 r72VarX;
        r72 r72VarX2;
        Iterable iterableP;
        byte b = this.h;
        byte b2 = 0;
        j23 j23Var = j23.a;
        Object[] objArr = 0;
        Object obj = this.k;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                ((aj) obj3).a();
                ji jiVar = (ji) ((bj) obj2).c;
                int i2 = ((v72) obj).h;
                do {
                    i = jiVar.get();
                } while (!jiVar.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
                return j23Var;
            case 1:
                ry2 ry2Var = (ry2) obj3;
                x20 x20Var = (x20) obj2;
                sj1 sj1Var = (sj1) obj;
                if (ry2Var.b()) {
                    ie1.p(x20Var, null, new pl(ry2Var, objArr == true ? 1 : 0, b2), 3);
                    sj1Var.setValue(Boolean.FALSE);
                }
                return j23Var;
            case 2:
                so soVar = (so) obj3;
                r72 r72VarJ0 = so.J0(soVar, (pn1) obj2, (h6) obj);
                if (r72VarJ0 == null) {
                    return null;
                }
                x00 x00Var = soVar.v;
                if (vy0.a(x00Var.C, -1L)) {
                    dx0.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return r72VarJ0.i(x00Var.N0(r72VarJ0, x00Var.K0(), 0L) ^ (-9223372034707292160L));
            case 3:
                x00 x00Var2 = (x00) obj3;
                t23 t23Var = (t23) obj2;
                vo voVar = (vo) obj;
                lo loVar = x00Var2.A;
                while (true) {
                    uj1 uj1Var = loVar.a;
                    int i3 = uj1Var.j;
                    if (i3 != 0) {
                        if (i3 == 0) {
                            li1.m("MutableVector is empty.");
                            return null;
                        }
                        r72 r72Var2 = (r72) ((u00) uj1Var.h[i3 - 1]).a.a();
                        if (r72Var2 == null ? true : x00.L0(x00Var2, r72Var2, 0L, 0L, 3)) {
                            uj1 uj1Var2 = loVar.a;
                            ((u00) uj1Var2.k(uj1Var2.j - 1)).b.g(j23Var);
                        }
                    }
                }
                if (x00Var2.B && (r72Var = (r72) x00Var2.z.a()) != null && x00.L0(x00Var2, r72Var, 0L, 0L, 3)) {
                    x00Var2.B = false;
                }
                t23Var.e = x00Var2.J0(voVar, 0L);
                return j23Var;
            case 4:
                dr0 dr0Var = (dr0) obj3;
                as asVar = (as) obj2;
                dk2 dk2Var = (dk2) obj;
                bz bzVar = dr0Var.M;
                as asVar2 = bzVar.b;
                try {
                    bzVar.b = asVar;
                    dk2 dk2Var2 = dr0Var.G;
                    int[] iArr = dr0Var.o;
                    si1 si1Var = dr0Var.v;
                    dr0Var.o = null;
                    dr0Var.v = null;
                    try {
                        dr0Var.G = dk2Var;
                        boolean z = bzVar.e;
                        try {
                            bzVar.e = false;
                            dr0Var.B(null, null);
                            bzVar.e = z;
                            dr0Var.G = dk2Var2;
                            dr0Var.o = iArr;
                            dr0Var.v = si1Var;
                            bzVar.b = asVar2;
                            return j23Var;
                        } catch (Throwable th) {
                            bzVar.e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        dr0Var.G = dk2Var2;
                        dr0Var.o = iArr;
                        dr0Var.v = si1Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    bzVar.b = asVar2;
                    throw th3;
                }
            case 5:
                b81 b81Var = (b81) obj2;
                p71 p71Var = (p71) ((o90) obj3).getValue();
                return new q71(b81Var, p71Var, (g61) obj, new u8((qy0) b81Var.e.f.getValue(), p71Var));
            case 6:
                zp0 zp0Var = (zp0) obj3;
                Object obj4 = (pt0) obj;
                ad1 ad1Var = (ad1) ((x72) obj2).h;
                mj1 mj1Var = ad1Var.t;
                if (mj1Var == null) {
                    long[] jArr = bd2.a;
                    mj1Var = new mj1();
                    ad1Var.t = mj1Var;
                }
                Object objG = mj1Var.g(obj4);
                if (objG == null) {
                    objG = new yc1(ad1Var);
                    mj1Var.n(obj4, objG);
                }
                yc1 yc1Var = (yc1) objG;
                yc1Var.h = false;
                zp0Var.f(yc1Var, obj4);
                return j23Var;
            case 7:
                pn1 pn1Var = (pn1) obj2;
                t72 t72Var = (t72) obj;
                j92 j92Var = pn1.d0;
                ((vp0) obj3).h(j92Var);
                boolean zG = uz0.g(pn1Var.Q, j92Var.v);
                b2 = pn1Var.T != j92Var.w ? (byte) 1 : (byte) 0;
                ou ouVarA = j92Var.v.a(j92Var.y, j92Var.B, j92Var.A);
                j92Var.E = ouVarA;
                boolean zG2 = uz0.g(pn1Var.S, ouVarA != null ? ouVarA.x() : null);
                t72Var.h = !zG2;
                if (!zG || b2 != 0 || !zG2) {
                    pn1Var.Q = j92Var.v;
                    pn1Var.T = j92Var.w;
                    ou ouVar = j92Var.E;
                    r72 r72Var3 = r72.e;
                    if (ouVar == null || (r72VarX = ouVar.x()) == null) {
                        r72VarX = r72Var3;
                    }
                    pn1Var.S = r72VarX;
                    ou ouVar2 = j92Var.E;
                    if (ouVar2 != null && (r72VarX2 = ouVar2.x()) != null) {
                        ry0 ry0VarA0 = cu.a0(r72VarX2);
                        r72Var3 = new r72(ry0VarA0.a, ry0VarA0.b, ry0VarA0.c, ry0VarA0.d);
                    }
                    pn1Var.R = r72Var3;
                    if (pn1Var.U && (b2 != 0 || (pn1Var.T && !zG))) {
                        pn1Var.B.G();
                    }
                }
                pn1Var.U = true;
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                xq0 xq0Var = (xq0) obj3;
                ik2 ik2Var = (ik2) obj2;
                as1 as1Var = (as1) obj;
                if (xq0Var != null) {
                    ik2Var.a(ik2Var.c(xq0Var) - ik2Var.t);
                }
                List listT = cu.t(ik2Var, null, ik2Var.t, null);
                ry ryVar = (ry) dv.G0(listT);
                Integer num = ryVar != null ? ryVar.b : null;
                List listD = as1Var.d(num);
                if (num != null && !listD.isEmpty()) {
                    ry ryVar2 = (ry) dv.x0(listD);
                    int size = listD.size() - 1;
                    if (size <= 0) {
                        iterableP = ag0.h;
                    } else if (size == 1) {
                        iterableP = lt.P(dv.F0(listD));
                    } else {
                        ArrayList arrayList = new ArrayList(size);
                        if (listD instanceof RandomAccess) {
                            int size2 = listD.size();
                            for (int i4 = 1; i4 < size2; i4++) {
                                arrayList.add(listD.get(i4));
                            }
                        } else {
                            ListIterator listIterator = listD.listIterator(1);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        iterableP = arrayList;
                    }
                    listD = dv.I0(lt.P(new ry(ryVar2.a, null, num)), iterableP);
                }
                return new py(dv.I0(listT, listD), as1Var.f());
            default:
                u uVar = (u) obj3;
                uVar.removeOnAttachStateChangeListener((r8) obj2);
                pz1.o(uVar).a.remove((li1) obj);
                return j23Var;
        }
    }

    public /* synthetic */ zi(Object obj, Object obj2, Object obj3, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }
}
