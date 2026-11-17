package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class aw1 {
    public final ArrayList a;
    public final ed2 b;
    public final ArrayList c;

    public aw1(ArrayList arrayList, ed2 ed2Var, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.a = arrayList;
        this.b = ed2Var;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw1)) {
            return false;
        }
        aw1 aw1Var = (aw1) obj;
        return this.a.equals(aw1Var.a) && this.b.equals(aw1Var.b) && this.c.equals(aw1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlanningPeople(persons=" + this.a + ", schedule=" + this.b + ", incomplete=" + this.c + ")";
    }
}
