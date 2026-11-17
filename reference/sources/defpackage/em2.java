package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class em2 extends jy0 {
    public int h;
    public final /* synthetic */ dm2 i;

    public em2(dm2 dm2Var) {
        this.i = dm2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h < this.i.d();
    }

    @Override // defpackage.jy0
    public final int nextInt() {
        int i = this.h;
        this.h = i + 1;
        return this.i.b(i);
    }
}
