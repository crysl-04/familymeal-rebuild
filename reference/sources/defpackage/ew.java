package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ew implements rg1 {
    public final rg1 h;
    public final rg1 i;

    public ew(rg1 rg1Var, rg1 rg1Var2) {
        this.h = rg1Var;
        this.i = rg1Var2;
    }

    @Override // defpackage.rg1
    public final Object a(zp0 zp0Var, Object obj) {
        return this.i.a(zp0Var, this.h.a(zp0Var, obj));
    }

    @Override // defpackage.rg1
    public final boolean b(vp0 vp0Var) {
        return this.h.b(vp0Var) && this.i.b(vp0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ew)) {
            return false;
        }
        ew ewVar = (ew) obj;
        return this.h.equals(ewVar.h) && uz0.g(this.i, ewVar.i);
    }

    public final int hashCode() {
        return (this.i.hashCode() * 31) + this.h.hashCode();
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) a(new ig((byte) 4), new StringBuilder("["));
        sb.append("]");
        return sb.toString();
    }
}
