package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class mz0 {
    public final int a;
    public final int b;
    public final n61 c;

    public mz0(int i, int i2, n61 n61Var) {
        this.a = i;
        this.b = i2;
        this.c = n61Var;
        if (i < 0) {
            dx0.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        dx0.a("size should be > 0");
    }
}
