package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kp2 extends qi2 implements ln2 {
    @Override // defpackage.ln2
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.o;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.p + ((long) ((int) ((o() + ((long) this.r)) - this.p)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void w(int i) {
        synchronized (this) {
            Object[] objArr = this.o;
            objArr.getClass();
            q(Integer.valueOf(((Number) objArr[((int) ((this.p + ((long) ((int) ((o() + ((long) this.r)) - this.p)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
