package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x61 implements kn2 {
    public final byte h;
    public final short i;
    public final lu1 j;
    public int k;

    /* JADX WARN: Multi-variable type inference failed */
    public x61(int i, int i2, int i3) {
        this.h = i2;
        this.i = i3;
        int i4 = (i / i2) * i2;
        this.j = new lu1(cy1.S(Math.max(i4 - i3, 0), i4 + i2 + i3), vz1.s);
        this.k = i;
    }

    public final void a(int i) {
        if (i != this.k) {
            this.k = i;
            byte b = this.h;
            int i2 = (i / b) * b;
            short s = this.i;
            this.j.setValue(cy1.S(Math.max(i2 - s, 0), i2 + b + s));
        }
    }

    @Override // defpackage.kn2
    public final Object getValue() {
        return (qy0) this.j.getValue();
    }
}
