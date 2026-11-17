package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ef2 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ed2 d;
    public final ArrayList e;

    public ef2(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ed2 ed2Var, ArrayList arrayList4) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = ed2Var;
        this.e = arrayList4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef2)) {
            return false;
        }
        ef2 ef2Var = (ef2) obj;
        return this.a.equals(ef2Var.a) && this.b.equals(ef2Var.b) && this.c.equals(ef2Var.c) && this.d.equals(ef2Var.d) && this.e.equals(ef2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.a.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SeedData(ingredients=" + this.a + ", recipes=" + this.b + ", persons=" + this.c + ", schedule=" + this.d + ", profiles=" + this.e + ")";
    }
}
