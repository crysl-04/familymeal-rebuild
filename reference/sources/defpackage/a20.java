package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a20 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ kv2 i;

    public /* synthetic */ a20(kv2 kv2Var, byte b) {
        this.h = b;
        this.i = kv2Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0102  */
    @Override // defpackage.vp0
    public final Object h(Object obj) {
        r72 r72Var;
        t31 t31VarC;
        float fIntBitsToFloat;
        t31 t31VarC2;
        t31 t31VarC3;
        t31 t31VarC4;
        t31 t31VarC5;
        byte b = this.h;
        kv2 kv2Var = this.i;
        switch (b) {
            case 0:
                return new w3(kv2Var, (byte) 6);
            case 1:
                kv2Var.s();
                return j23.a;
            default:
                t31 t31Var = (t31) obj;
                p81 p81Var = kv2Var.d;
                r72 r72Var2 = r72.e;
                if (p81Var == null) {
                    r72Var = r72Var2;
                } else {
                    if (p81Var.p) {
                        p81Var = null;
                    }
                    if (p81Var != null) {
                        xp1 xp1Var = kv2Var.b;
                        long j = kv2Var.l().b;
                        int i = qw2.c;
                        int iS = xp1Var.s((int) (j >> 32));
                        int iS2 = kv2Var.b.s((int) (kv2Var.l().b & 4294967295L));
                        p81 p81Var2 = kv2Var.d;
                        long jS = 0;
                        long jS2 = (p81Var2 == null || (t31VarC5 = p81Var2.c()) == null) ? 0L : t31VarC5.S(kv2Var.j(true));
                        p81 p81Var3 = kv2Var.d;
                        if (p81Var3 != null && (t31VarC4 = p81Var3.c()) != null) {
                            jS = t31VarC4.S(kv2Var.j(false));
                        }
                        p81 p81Var4 = kv2Var.d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (p81Var4 == null || (t31VarC3 = p81Var4.c()) == null) {
                            fIntBitsToFloat = 0.0f;
                        } else {
                            kw2 kw2VarD = p81Var.d();
                            fIntBitsToFloat = Float.intBitsToFloat((int) (t31VarC3.S(((long) Float.floatToRawIntBits(kw2VarD != null ? kw2VarD.a.c(iS).b : 0.0f)) & 4294967295L) & 4294967295L));
                        }
                        p81 p81Var5 = kv2Var.d;
                        if (p81Var5 != null && (t31VarC2 = p81Var5.c()) != null) {
                            kw2 kw2VarD2 = p81Var.d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (t31VarC2.S(((long) Float.floatToRawIntBits(kw2VarD2 != null ? kw2VarD2.a.c(iS2).b : 0.0f)) & 4294967295L) & 4294967295L));
                        }
                        int i2 = (int) (jS2 >> 32);
                        int i3 = (int) (jS >> 32);
                        r72Var = new r72(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), (p81Var.a.d.b() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jS2 & 4294967295L)), Float.intBitsToFloat((int) (jS & 4294967295L))));
                    } else {
                        r72Var = r72Var2;
                    }
                }
                p81 p81Var6 = kv2Var.d;
                if (p81Var6 == null || (t31VarC = p81Var6.c()) == null) {
                    return null;
                }
                return (t31VarC.C() && t31Var.C()) ? h12.b(t31Var.v(es.D(t31VarC).c(r72Var.d())), r72Var.c()) : r72Var2;
        }
    }
}
