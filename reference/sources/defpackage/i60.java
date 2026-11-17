package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i60 implements vp0 {
    public final /* synthetic */ byte h = 1;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ i60(qy0 qy0Var, hq hqVar, int i, int i2, vp0 vp0Var, vf2 vf2Var, s40 s40Var) {
        this.k = qy0Var;
        this.l = hqVar;
        this.i = i;
        this.j = i2;
        this.m = vp0Var;
        this.n = vf2Var;
        this.o = s40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vp0
    public final Object h(Object obj) {
        int size;
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj2 = this.o;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        Object obj6 = this.k;
        int i = 0;
        switch (b) {
            case 0:
                qy0 qy0Var = (qy0) obj6;
                hq hqVar = (hq) obj5;
                vp0 vp0Var = (vp0) obj4;
                vf2 vf2Var = (vf2) obj3;
                s40 s40Var = (s40) obj2;
                j51 j51Var = (j51) obj;
                qy0Var.getClass();
                if (qy0Var instanceof Collection) {
                    size = ((Collection) qy0Var).size();
                } else {
                    Iterator it = qy0Var.iterator();
                    while (((py0) it).j) {
                        ((jy0) it).next();
                        i++;
                        if (i < 0) {
                            lt.g0();
                            throw null;
                        }
                    }
                    size = i;
                }
                j51Var.i.a(size, new i51(j51.j, new nx(674613074, true, new k60(qy0Var, hqVar, this.i, this.j, vp0Var, vf2Var, s40Var))));
                return j23Var;
            default:
                ny1 ny1Var = (ny1) obj6;
                ny1 ny1Var2 = (ny1) obj5;
                bf1 bf1Var = (bf1) obj4;
                Integer num = (Integer) obj3;
                Integer num2 = (Integer) obj2;
                my1 my1Var = (my1) obj;
                int i2 = this.j;
                if (ny1Var != null) {
                    if (ny1Var2 != null) {
                        num.getClass();
                        int iIntValue = num.intValue();
                        num2.getClass();
                        int iIntValue2 = num2.intValue();
                        int iR = bf1Var.R(p22.b) + bf1Var.R(iIntValue == iIntValue2 ? pr2.c : pr2.d);
                        int iJ = (bf1Var.J(pr2.e) + ny1Var2.i) - iIntValue;
                        int i3 = ny1Var.h;
                        int i4 = this.i;
                        int i5 = (i2 - iIntValue2) - iR;
                        my1.k(my1Var, ny1Var, (i4 - i3) / 2, i5);
                        my1.k(my1Var, ny1Var2, (i4 - ny1Var2.h) / 2, i5 - iJ);
                    } else {
                        float f = pr2.a;
                        my1.k(my1Var, ny1Var, 0, (i2 - ny1Var.i) / 2);
                    }
                } else if (ny1Var2 != null) {
                    float f2 = pr2.a;
                    my1.k(my1Var, ny1Var2, 0, (i2 - ny1Var2.i) / 2);
                }
                return j23Var;
        }
    }

    public /* synthetic */ i60(ny1 ny1Var, ny1 ny1Var2, bf1 bf1Var, int i, int i2, Integer num, Integer num2) {
        this.k = ny1Var;
        this.l = ny1Var2;
        this.m = bf1Var;
        this.i = i;
        this.j = i2;
        this.n = num;
        this.o = num2;
    }
}
