package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class g03 extends f03 {
    public final /* synthetic */ byte k;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.k) {
            case 0:
                int i = this.j;
                this.j = i + 2;
                Object[] objArr = this.h;
                return new zd1(objArr[i], objArr[i + 1], (byte) 0);
            case 1:
                int i2 = this.j;
                this.j = i2 + 2;
                return this.h[i2];
            default:
                int i3 = this.j;
                this.j = i3 + 2;
                return this.h[i3 + 1];
        }
    }
}
