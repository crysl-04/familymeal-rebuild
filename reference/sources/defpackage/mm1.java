package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mm1 {
    public final ou a;
    public final List b;
    public final List c;
    public final int d;
    public na1 e;

    public mm1(ou ouVar, List list, List list2, int i) {
        this.a = ouVar;
        this.b = list;
        this.c = list2;
        this.d = i;
    }

    public final List a() {
        na1 na1VarE = this.e;
        if (na1VarE == null) {
            na1 na1VarQ = lt.q();
            na1VarQ.addAll(this.b);
            ou ouVar = this.a;
            if (ouVar != null) {
                na1VarQ.add(ouVar);
            }
            na1VarQ.addAll(this.c);
            na1VarE = lt.e(na1VarQ);
            this.e = na1VarE;
        }
        na1VarE.getClass();
        return na1VarE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mm1.class != obj.getClass()) {
            return false;
        }
        mm1 mm1Var = (mm1) obj;
        return this.d == mm1Var.d && a().equals(mm1Var.a());
    }

    public final int hashCode() {
        return a().hashCode() + (this.d * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.d + ", mergedHistory=" + a() + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mm1() {
        ag0 ag0Var = ag0.h;
        this(null, ag0Var, ag0Var, -1);
    }
}
