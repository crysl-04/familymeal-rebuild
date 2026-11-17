package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class hn2 implements o33 {
    public final o33 h;
    public final long i;

    public hn2(o33 o33Var, long j) {
        this.h = o33Var;
        this.i = j;
    }

    @Override // defpackage.o33
    public final boolean a() {
        return this.h.a();
    }

    @Override // defpackage.o33
    public final long b(id idVar, id idVar2, id idVar3) {
        return this.h.b(idVar, idVar2, idVar3) + this.i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hn2)) {
            return false;
        }
        hn2 hn2Var = (hn2) obj;
        return hn2Var.i == this.i && uz0.g(hn2Var.h, this.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + (this.h.hashCode() * 31);
    }

    @Override // defpackage.o33
    public final id l(long j, id idVar, id idVar2, id idVar3) {
        long j2 = this.i;
        return j < j2 ? idVar3 : this.h.l(j - j2, idVar, idVar2, idVar3);
    }

    @Override // defpackage.o33
    public final id p(long j, id idVar, id idVar2, id idVar3) {
        long j2 = this.i;
        return j < j2 ? idVar : this.h.p(j - j2, idVar, idVar2, idVar3);
    }
}
