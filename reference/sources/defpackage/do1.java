package defpackage;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAdder;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class do1 extends lz0 {
    public static final ThreadLocal i = ThreadLocal.withInitial(new p10(2));
    public boolean g;
    public Boolean h;

    public do1(ii0 ii0Var) {
        super(ii0Var);
        this.g = false;
        this.h = null;
    }

    public final boolean l(ng1 ng1Var, u30 u30Var, boolean z) {
        EnumMap enumMap = (EnumMap) u30Var.c;
        EnumMap enumMap2 = (EnumMap) u30Var.d;
        cz0 cz0VarD = ng1Var.f.d();
        EnumMap enumMap3 = (EnumMap) i.get();
        gs1 gs1VarF = this.d;
        u23 u23Var = null;
        if (gs1VarF == null) {
            gs1VarF = f(null);
            this.d = gs1VarF;
        }
        HashMap map = new HashMap();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < cz0VarD.d && this.e != null && this.d != null) {
            hs1 hs1VarI = i();
            u23 u23Var2 = hs1VarI instanceof u23 ? (u23) hs1VarI : u23Var;
            bj bjVar = new bj();
            bjVar.c = this.c;
            bjVar.e = u23Var2;
            bjVar.d = gs1VarF;
            bjVar.b = cz0VarD;
            bjVar.a = map;
            double d = gs1VarF.n;
            Iterator it = cz0VarD.e.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                dz0 dz0Var = (dz0) it.next();
                t30 t30Var = (t30) (z ? enumMap2 : enumMap).get(dz0Var);
                LongAdder longAdder = t30Var.a;
                enumMap = enumMap;
                LongAdder longAdder2 = t30Var.i;
                if (longAdder.sum() <= 0 && t30Var.c.sum() >= 10) {
                    longAdder2.increment();
                    if (longAdder2.sum() % 10 != 0) {
                    }
                }
                co1 co1Var = (co1) enumMap3.get(dz0Var);
                long jNanoTime = System.nanoTime();
                int iD = co1Var.d(bjVar);
                EnumMap enumMap4 = enumMap2;
                cz0 cz0Var = cz0VarD;
                long jNanoTime2 = System.nanoTime() - jNanoTime;
                EnumMap enumMap5 = enumMap3;
                Iterator it2 = it;
                t30 t30Var2 = (t30) (z ? enumMap4 : enumMap).get(co1Var.g());
                t30Var2.j.add(jNanoTime2);
                t30Var2.c.increment();
                int size = co1Var.a.size();
                if (size > 0) {
                    t30Var2.d.increment();
                }
                t30Var2.a.add(size);
                t30Var2.b.add(co1Var.b);
                t30Var2.e.add(co1Var.f);
                t30Var2.f.add(co1Var.g);
                t30Var2.g.add(co1Var.h);
                t30Var2.h.add(co1Var.i);
                i3 += iD;
                enumMap2 = enumMap4;
                cz0VarD = cz0Var;
                enumMap3 = enumMap5;
                it = it2;
            }
            EnumMap enumMap6 = enumMap;
            EnumMap enumMap7 = enumMap2;
            cz0 cz0Var2 = cz0VarD;
            EnumMap enumMap8 = enumMap3;
            if (i3 == 0) {
                break;
            }
            long jNanoTime3 = System.nanoTime();
            j();
            gs1 gs1VarF2 = this.d;
            if (gs1VarF2 == null) {
                gs1VarF2 = f(null);
                this.d = gs1VarF2;
            }
            gs1VarF = gs1VarF2;
            long jNanoTime4 = System.nanoTime() - jNanoTime3;
            if (gs1VarF == null || !gs1VarF.m.d()) {
                z2 = true;
                break;
            }
            double d2 = gs1VarF.n;
            double d3 = u30Var.b == 1 ? d - d2 : d2 - d;
            wk wkVar = (wk) (z ? u30Var.f : u30Var.e);
            ((LongAdder) wkVar.k).increment();
            if (d3 > 0.0d) {
                ((LongAdder) wkVar.l).increment();
                ((DoubleAdder) wkVar.i).add(d3);
            }
            ((LongAdder) wkVar.j).add(jNanoTime4);
            i2++;
            u23Var = null;
            enumMap2 = enumMap7;
            cz0VarD = cz0Var2;
            enumMap = enumMap6;
            enumMap3 = enumMap8;
            z2 = true;
        }
        if (z2) {
            j();
            this.g = true;
        }
        return z2;
    }

    public final boolean m() {
        Boolean boolValueOf = this.h;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(!this.c.t());
            this.h = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
