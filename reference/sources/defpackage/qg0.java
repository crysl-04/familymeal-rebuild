package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qg0 extends m31 implements vp0 {
    public final /* synthetic */ byte i = 1;
    public final /* synthetic */ si2 j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg0(si2 si2Var, kz2 kz2Var, kz2 kz2Var2, kz2 kz2Var3) {
        super(1);
        this.j = si2Var;
        this.k = kz2Var;
        this.l = kz2Var2;
        this.m = kz2Var3;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        byte b = this.i;
        Object obj2 = this.l;
        Object obj3 = this.k;
        si2 si2Var = this.j;
        Object obj4 = this.m;
        switch (b) {
            case 0:
                j92 j92Var = (j92) obj;
                kz2 kz2Var = (kz2) obj3;
                float fFloatValue = kz2Var != null ? ((Number) kz2Var.getValue()).floatValue() : 1.0f;
                p61 p61Var = si2Var.c;
                hu1 hu1Var = (hu1) p61Var.d;
                float fG = fFloatValue * ((si2Var.b() && ((Boolean) ((lu1) p61Var.a).getValue()).booleanValue()) ? ((hu1) p61Var.b).g() : 1.0f);
                if (si2Var.b()) {
                    si2Var.f = fG;
                }
                j92Var.c(fG);
                kz2 kz2Var2 = (kz2) obj2;
                float fFloatValue2 = kz2Var2 != null ? ((Number) kz2Var2.getValue()).floatValue() : 1.0f;
                boolean z = si2Var.b() && ((Boolean) ((lu1) p61Var.c).getValue()).booleanValue();
                float fG2 = fFloatValue2 * (z ? hu1Var.g() : 1.0f);
                if (si2Var.b()) {
                    si2Var.g = fG2;
                    if (z) {
                        hu1Var.g();
                        c43 c43Var = si2Var.j;
                        if (c43Var == null) {
                            c43Var = new c43(false);
                            si2Var.j = c43Var;
                        }
                        long j = si2Var.d;
                        long jG = ((j - 1) | 1) == Long.MAX_VALUE ? de0.g(ys.I(j)) : ys.b0(yg1.a(), j);
                        c43Var.a(fG2, ((((int) jG) & 1) != 1 || de0.d(jG)) ? de0.f(jG, he0.MILLISECONDS) : jG >> 1);
                    }
                }
                j92Var.i(fG2);
                j92Var.j(fG2);
                kz2 kz2Var3 = (kz2) obj4;
                long j2 = kz2Var3 != null ? ((ez2) kz2Var3.getValue()).a : 4539628425446424576L;
                if (si2Var.b() && ((Boolean) ((lu1) p61Var.e).getValue()).booleanValue()) {
                    j2 = ((ez2) ((lu1) p61Var.f).getValue()).a;
                }
                if (si2Var.b()) {
                    si2Var.h = j2;
                }
                j92Var.o(j2);
                return j23.a;
            default:
                wh0 wh0Var = (wh0) obj4;
                int iOrdinal = ((kg0) obj).ordinal();
                ez2 ez2Var = null;
                if (iOrdinal == 0) {
                    ad2 ad2Var = ((ah0) obj2).a.d;
                    if (ad2Var != null) {
                        ez2Var = new ez2(ad2Var.b);
                    } else {
                        ad2 ad2Var2 = wh0Var.a.d;
                        if (ad2Var2 != null) {
                            ez2Var = new ez2(ad2Var2.b);
                        }
                    }
                } else if (iOrdinal == 1) {
                    ez2Var = (ez2) obj3;
                } else {
                    if (iOrdinal != 2) {
                        wg.n();
                        return null;
                    }
                    ad2 ad2Var3 = wh0Var.a.d;
                    ez2Var = new ez2(ad2Var3 != null ? ad2Var3.b : si2Var.h);
                }
                return new ez2(ez2Var != null ? ez2Var.a : 4539628425446424576L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg0(ez2 ez2Var, ah0 ah0Var, wh0 wh0Var, si2 si2Var) {
        super(1);
        this.k = ez2Var;
        this.l = ah0Var;
        this.m = wh0Var;
        this.j = si2Var;
    }
}
