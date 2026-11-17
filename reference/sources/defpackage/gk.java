package defpackage;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gk {
    public final OffsetDateTime a;
    public final boolean b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final ed2 g;

    public gk(OffsetDateTime offsetDateTime, boolean z, List list, List list2, List list3, List list4, ed2 ed2Var) {
        offsetDateTime.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.a = offsetDateTime;
        this.b = z;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = ed2Var;
    }

    public final gk a() {
        List list = this.e;
        ArrayList arrayList = new ArrayList(ev.o0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(dy1.a((dy1) it.next(), null, null, null, null, null, null, 0.0d, null, 1735));
        }
        OffsetDateTime offsetDateTime = this.a;
        offsetDateTime.getClass();
        List list2 = this.c;
        list2.getClass();
        List list3 = this.d;
        list3.getClass();
        return new gk(offsetDateTime, false, list2, list3, arrayList, ag0.h, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk)) {
            return false;
        }
        gk gkVar = (gk) obj;
        return uz0.g(this.a, gkVar.a) && this.b == gkVar.b && uz0.g(this.c, gkVar.c) && uz0.g(this.d, gkVar.d) && uz0.g(this.e, gkVar.e) && uz0.g(this.f, gkVar.f) && this.g.equals(gkVar.g);
    }

    public final int hashCode() {
        return this.g.a.hashCode() + jp1.g(this.f, jp1.g(this.e, jp1.g(this.d, jp1.g(this.c, jp1.c(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31);
    }

    public final String toString() {
        return "BackupData(exportedAt=" + this.a + ", includesBodyData=" + this.b + ", ingredients=" + this.c + ", recipes=" + this.d + ", persons=" + this.e + ", weights=" + this.f + ", schedule=" + this.g + ")";
    }
}
