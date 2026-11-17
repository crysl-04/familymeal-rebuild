package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class zr1 {
    public final int a;
    public final int b;

    public /* synthetic */ zr1(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public void a(yq0 yq0Var, rg rgVar, ik2 ik2Var, g82 g82Var, as1 as1Var) {
        ik2Var.a(yq0Var.c(0));
    }

    public xq0 b(yq0 yq0Var) {
        return null;
    }

    public final String toString() {
        String strC = z72.a(getClass()).c();
        return strC == null ? "" : strC;
    }

    public zr1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
