package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class mp {
    public static final rt1 a;
    public static final rt1 b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        float f = aa3.Z;
        float f2 = aa3.a0;
        a = new rt1(f, 8.0f, f2, 8.0f);
        if (!(f2 >= 0.0f)) {
            yw0.a("Padding must be non-negative");
        }
        b = new rt1(12.0f, 8.0f, 12.0f, 8.0f);
        if (!((8.0f >= 0.0f) & (8.0f >= 0.0f))) {
            yw0.a("Padding must be non-negative");
        }
        c = 58.0f;
        d = 40.0f;
        e = uz0.l;
    }

    public static lp a(pv pvVar) {
        lp lpVar = pvVar.Y;
        if (lpVar != null) {
            return lpVar;
        }
        long j = kv.f;
        lp lpVar2 = new lp(j, rv.c(pvVar, qv.r), j, kv.b(t03.G, rv.c(pvVar, t03.F)));
        pvVar.Y = lpVar2;
        return lpVar2;
    }
}
