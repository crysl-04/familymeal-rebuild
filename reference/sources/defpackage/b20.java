package defpackage;

import android.os.Bundle;
import com.familymeal.app.MealPlannerApp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b20 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ b20(ArrayList arrayList, v72 v72Var, List list, int i, t51 t51Var) {
        this.h = (byte) 2;
        this.i = arrayList;
        this.j = v72Var;
        this.k = list;
        this.l = t51Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00ae  */
    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.h;
        int i = 0;
        j23 j23Var = j23.a;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (b) {
            case 0:
                p81 p81Var = (p81) obj5;
                aw2 aw2Var = (aw2) obj4;
                vv2 vv2Var = (vv2) obj3;
                nu0 nu0Var = (nu0) obj2;
                if (p81Var.b()) {
                    ix0 ix0Var = p81Var.d;
                    v10 v10Var = p81Var.v;
                    v10 v10Var2 = p81Var.w;
                    x72 x72Var = new x72();
                    qb qbVar = new qb((Object) ix0Var, (Object) v10Var, (Object) x72Var, (byte) 17);
                    j02 j02Var = aw2Var.a;
                    j02Var.h(vv2Var, nu0Var, qbVar, v10Var2);
                    dw2 dw2Var = new dw2(aw2Var, j02Var);
                    aw2Var.b.set(dw2Var);
                    x72Var.h = dw2Var;
                    p81Var.e = dw2Var;
                }
                return new y9((byte) 1);
            case 1:
                tv0 tv0Var = (tv0) obj4;
                u72 u72Var = (u72) obj3;
                x20 x20Var = (x20) obj2;
                long jLongValue = ((Long) obj).longValue();
                kn2 kn2Var = (kn2) ((sj1) obj5).getValue();
                long jLongValue2 = kn2Var != null ? ((Number) kn2Var.getValue()).longValue() : jLongValue;
                long j = tv0Var.c;
                uj1 uj1Var = tv0Var.a;
                if (j == Long.MIN_VALUE || u72Var.h != cy1.v(x20Var.f())) {
                    tv0Var.c = jLongValue;
                    Object[] objArr = uj1Var.h;
                    int i2 = uj1Var.j;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((rv0) objArr[i3]).m = true;
                    }
                    u72Var.h = cy1.v(x20Var.f());
                }
                float f = u72Var.h;
                if (f == 0.0f) {
                    Object[] objArr2 = uj1Var.h;
                    int i4 = uj1Var.j;
                    while (i < i4) {
                        rv0 rv0Var = (rv0) objArr2[i];
                        rv0Var.j.setValue(rv0Var.k.c);
                        rv0Var.m = true;
                        i++;
                    }
                } else {
                    long j2 = (long) ((jLongValue2 - tv0Var.c) / f);
                    Object[] objArr3 = uj1Var.h;
                    int i5 = uj1Var.j;
                    boolean z = true;
                    for (int i6 = 0; i6 < i5; i6++) {
                        rv0 rv0Var2 = (rv0) objArr3[i6];
                        boolean zG = rv0Var2.l;
                        if (!zG) {
                            rv0Var2.o.b.setValue(Boolean.FALSE);
                            if (rv0Var2.m) {
                                rv0Var2.m = false;
                                rv0Var2.n = j2;
                            }
                            long j3 = j2 - rv0Var2.n;
                            rv0Var2.j.setValue(rv0Var2.k.b(j3));
                            zG = rv0Var2.k.g(j3);
                            rv0Var2.l = zG;
                        }
                        if (!zG) {
                            z = false;
                        }
                    }
                    tv0Var.d.setValue(Boolean.valueOf(!z));
                }
                return j23Var;
            case 2:
                ArrayList arrayList = (ArrayList) obj5;
                v72 v72Var = (v72) obj4;
                List list = (List) obj3;
                t51 t51Var = (t51) obj2;
                b22 b22Var = (b22) obj;
                yo2 yo2Var = b22Var.e;
                int iD = yo2Var != null ? yo2Var.d() : 0;
                int iC = 0;
                while (i < iD) {
                    ks1 ks1Var = t51Var.r;
                    yo2 yo2Var2 = b22Var.e;
                    iC += (int) (ks1Var == ks1.h ? (yo2Var2 != null ? yo2Var2.c(i) : 0L) & 4294967295L : (yo2Var2 != null ? yo2Var2.c(i) : 0L) >> 32);
                    i++;
                }
                if (arrayList != null) {
                    arrayList.add(Integer.valueOf(iC));
                }
                if (v72Var.h != list.size()) {
                    v72Var.h++;
                }
                return j23Var;
            case 3:
                d71 d71Var = (d71) obj5;
                d71Var.c = new n31((r61) obj4, (zo2) obj3, (c22) obj2);
                return new w3(d71Var, (byte) 8);
            case 4:
                u72 u72Var2 = (u72) obj5;
                nh1 nh1Var = (nh1) obj4;
                oe2 oe2Var = (oe2) obj3;
                u3 u3Var = (u3) obj2;
                bd bdVar = (bd) obj;
                float fFloatValue = ((Number) bdVar.e.getValue()).floatValue() - u72Var2.h;
                if (vs.L(fFloatValue)) {
                    if (((Boolean) u3Var.h(Float.valueOf(u72Var2.h))).booleanValue()) {
                        bdVar.a();
                    }
                } else if (vs.L(fFloatValue - nh1Var.c(oe2Var, fFloatValue))) {
                    u72Var2.h += fFloatValue;
                    if (((Boolean) u3Var.h(Float.valueOf(u72Var2.h))).booleanValue()) {
                        bdVar.a();
                    }
                } else {
                    bdVar.a();
                }
                return j23Var;
            case 5:
                pk1 pk1Var = (pk1) obj;
                pk1Var.getClass();
                ((t72) obj5).h = true;
                ((xk1) obj4).a((dl1) obj3, (Bundle) obj2, pk1Var, ag0.h);
                return j23Var;
            default:
                p71 p71Var = (p71) obj;
                p71Var.getClass();
                p71.o0(p71Var, null, tz0.k, 3);
                jc2 jc2Var = new jc2((byte) 15);
                lh0 lh0Var = p60.p;
                p71Var.p0(lh0Var.a(), new q9(jc2Var, lh0Var, (byte) 11), new id2(lh0Var, (byte) 0), new nx(802480018, true, new jd2(lh0Var, (sj1) obj5, (x20) obj4, (MealPlannerApp) obj3, (sj1) obj2)));
                return j23Var;
        }
    }

    public /* synthetic */ b20(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
    }
}
