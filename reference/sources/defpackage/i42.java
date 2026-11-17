package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class i42 {
    public final g42 a;
    public final boolean b;
    public final hl2 c;
    public final vp0 d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public i42(g42 g42Var, Object obj, boolean z, hl2 hl2Var, vp0 vp0Var, boolean z2) {
        this.a = g42Var;
        this.b = z;
        this.c = hl2Var;
        this.d = vp0Var;
        this.e = z2;
        this.f = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        ez.b("Unexpected form of a provided value");
        wg.k();
        return null;
    }
}
