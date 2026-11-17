package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qy0 extends oy0 implements xu {
    public static final qy0 k = new qy0(1, 0, 1);

    public final boolean c(int i) {
        return this.h <= i && i <= this.i;
    }

    @Override // defpackage.oy0
    public final boolean equals(Object obj) {
        if (!(obj instanceof qy0)) {
            return false;
        }
        if (isEmpty() && ((qy0) obj).isEmpty()) {
            return true;
        }
        qy0 qy0Var = (qy0) obj;
        return this.h == qy0Var.h && this.i == qy0Var.i;
    }

    @Override // defpackage.oy0
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.h * 31) + this.i;
    }

    @Override // defpackage.oy0
    public final boolean isEmpty() {
        return this.h > this.i;
    }

    @Override // defpackage.oy0
    public final String toString() {
        return this.h + ".." + this.i;
    }
}
