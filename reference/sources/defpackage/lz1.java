package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lz1 {
    public static final Map o;
    public static final Map p;
    public static final Map q;
    public final Map a;
    public final byte b;
    public final Set c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Set g;
    public final List h;
    public final byte i;
    public final boolean j;
    public final boolean k;
    public final Map l;
    public final wu m;
    public final Map n;

    static {
        Map mapL = ee1.L(new wt1(zr.k, new qy0(1, 1, 1)), new wt1(zr.l, new qy0(1, 1, 1)), new wt1(zr.n, new qy0(1, 1, 1)), new wt1(zr.m, new qy0(0, 1, 1)));
        Map mapSingletonMap = Collections.singletonMap(zr.j, new qy0(1, 1, 1));
        mapSingletonMap.getClass();
        te1 te1Var = te1.BREAKFAST;
        wt1 wt1Var = new wt1(te1Var, mapSingletonMap);
        te1 te1Var2 = te1.LUNCH;
        wt1 wt1Var2 = new wt1(te1Var2, mapL);
        te1 te1Var3 = te1.DINNER;
        o = ee1.L(wt1Var, wt1Var2, new wt1(te1Var3, mapL));
        Double dValueOf = Double.valueOf(0.3d);
        p = ee1.L(new wt1(te1Var, dValueOf), new wt1(te1Var2, Double.valueOf(0.4d)), new wt1(te1Var3, dValueOf));
        wt1 wt1Var3 = new wt1(zo1.h, Double.valueOf(0.01d));
        Double dValueOf2 = Double.valueOf(1.0d);
        q = ee1.L(wt1Var3, new wt1(zo1.i, dValueOf2), new wt1(zo1.j, Double.valueOf(0.5d)), new wt1(zo1.k, Double.valueOf(0.02d)), new wt1(zo1.l, dValueOf2));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0135 A[LOOP:0: B:36:0x012f->B:38:0x0135, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public lz1() {
        Iterator it;
        Set setC = r02.C(zr.n);
        Set setC0 = gi.c0(new String[]{"fish_whole", "fish_portion", "shrimp"});
        p60 p60Var = p60.WEDNESDAY;
        te1 te1Var = te1.DINNER;
        List listQ = lt.Q(new ek2(p60Var, te1Var), new ek2(p60.FRIDAY, te1Var));
        uu uuVar = new uu(0.5d, 2.0d);
        Map map = o;
        map.getClass();
        Map map2 = q;
        map2.getClass();
        this.a = map;
        this.b = (byte) 2;
        this.c = setC;
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = setC0;
        this.h = listQ;
        this.i = (byte) 3;
        this.j = true;
        this.k = true;
        this.l = map2;
        this.m = uuVar;
        this.n = p;
        Collection collectionValues = map2.values();
        double dDoubleValue = 0.0d;
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                double dDoubleValue2 = ((Number) it2.next()).doubleValue();
                if (dDoubleValue2 < 0.0d || Math.abs(dDoubleValue2) > Double.MAX_VALUE) {
                    wg.m("Failed requirement.");
                    throw null;
                }
            }
        }
        if (((Number) this.m.a()).doubleValue() <= 0.0d || ((Number) this.m.b()).doubleValue() > 5.0d || ((Number) this.m.a()).doubleValue() > ((Number) this.m.b()).doubleValue()) {
            wg.m("Failed requirement.");
            throw null;
        }
        Map map3 = this.n;
        if (map3 != null) {
            if (uz0.g(map3.keySet(), dv.U0(te1.o))) {
                Collection collectionValues2 = map3.values();
                if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
                    Collection collectionValues3 = map3.values();
                    collectionValues3.getClass();
                    it = collectionValues3.iterator();
                    while (it.hasNext()) {
                        dDoubleValue += ((Number) it.next()).doubleValue();
                    }
                    if (Math.abs(dDoubleValue - 1.0d) < 1.0E-6d) {
                        return;
                    }
                } else {
                    Iterator it3 = collectionValues2.iterator();
                    while (it3.hasNext()) {
                        if (((Number) it3.next()).doubleValue() > 0.0d) {
                        }
                    }
                    Collection collectionValues4 = map3.values();
                    collectionValues4.getClass();
                    it = collectionValues4.iterator();
                    while (it.hasNext()) {
                        dDoubleValue += ((Number) it.next()).doubleValue();
                    }
                    if (Math.abs(dDoubleValue - 1.0d) < 1.0E-6d) {
                        return;
                    }
                }
            }
            wg.m("Failed requirement.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz1)) {
            return false;
        }
        lz1 lz1Var = (lz1) obj;
        return uz0.g(this.a, lz1Var.a) && this.b == lz1Var.b && uz0.g(this.c, lz1Var.c) && this.d == lz1Var.d && this.e == lz1Var.e && this.f == lz1Var.f && uz0.g(this.g, lz1Var.g) && uz0.g(this.h, lz1Var.h) && this.i == lz1Var.i && this.j == lz1Var.j && this.k == lz1Var.k && uz0.g(this.l, lz1Var.l) && uz0.g(this.m, lz1Var.m) && uz0.g(this.n, lz1Var.n);
    }

    public final int hashCode() {
        int iHashCode = (this.m.hashCode() + ((this.l.hashCode() + jp1.c(jp1.c(jp1.b(this.i, jp1.g(this.h, (this.g.hashCode() + jp1.c(jp1.c(jp1.c((this.c.hashCode() + jp1.b(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31), 31), 31, this.j), 31, this.k)) * 31)) * 31;
        Map map = this.n;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "PlanRules(structure=" + this.a + ", maxRepeatsPerWeek=" + ((int) this.b) + ", repeatExemptCategories=" + this.c + ", noConsecutiveDays=" + this.d + ", noIdenticalSlots=" + this.e + ", weekdayQuickOnly=" + this.f + ", quickExemptTags=" + this.g + ", fishSlots=" + this.h + ", wholeFishMinDiners=" + ((int) this.i) + ", weekendLunchFishAndShrimp=" + this.j + ", respectExclusions=" + this.k + ", weights=" + this.l + ", staplePortion=" + this.m + ", mealShares=" + this.n + ")";
    }
}
