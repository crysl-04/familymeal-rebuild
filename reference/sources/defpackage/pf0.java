package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pf0 implements of0 {
    public final int h;
    public int i = -1;
    public int j = -1;

    public pf0(int i) {
        this.h = i;
    }

    @Override // defpackage.of0
    public final boolean g(CharSequence charSequence, int i, int i2, x03 x03Var) {
        int i3 = this.h;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.i = i;
        this.j = i2;
        return false;
    }

    @Override // defpackage.of0
    public final Object a() {
        return this;
    }
}
