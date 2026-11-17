package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z00 {
    public final ah0 a;
    public final wh0 b;
    public final hu1 c;
    public ak2 d;

    public z00(ah0 ah0Var, wh0 wh0Var, float f, ak2 ak2Var) {
        this.a = ah0Var;
        this.b = wh0Var;
        this.c = new hu1(f);
        this.d = ak2Var;
    }

    public z00(ah0 ah0Var, wh0 wh0Var, ak2 ak2Var, int i) {
        this(ah0Var, wh0Var, 0.0f, (i & 8) != 0 ? new ak2(ec.j) : ak2Var);
    }
}
