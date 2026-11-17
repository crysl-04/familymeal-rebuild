package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class py0 extends jy0 {
    public final int h;
    public final int i;
    public boolean j;
    public int k;

    public py0(int i, int i2, int i3) {
        this.h = i3;
        this.i = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.j = z;
        this.k = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j;
    }

    @Override // defpackage.jy0
    public final int nextInt() {
        int i = this.k;
        if (i != this.i) {
            this.k = this.h + i;
            return i;
        }
        if (this.j) {
            this.j = false;
            return i;
        }
        wg.p();
        return 0;
    }
}
