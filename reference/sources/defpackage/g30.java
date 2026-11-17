package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g30 extends ys {
    public final cm h;

    public g30(cm cmVar) {
        this.h = cmVar;
    }

    @Override // defpackage.ys
    public final int d(int i, int i2, u31 u31Var) {
        return this.h.a(i2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g30) && uz0.g(this.h, ((g30) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.h + ")";
    }
}
