package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qk2 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ float i;
    public final /* synthetic */ u72 j;
    public final /* synthetic */ w71 k;
    public final /* synthetic */ vp0 l;

    public /* synthetic */ qk2(float f, u72 u72Var, w71 w71Var, vp0 vp0Var, byte b) {
        this.h = b;
        this.i = f;
        this.j = u72Var;
        this.k = w71Var;
        this.l = vp0Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        float fA;
        byte b = this.h;
        j23 j23Var = j23.a;
        vp0 vp0Var = this.l;
        w71 w71Var = this.k;
        u72 u72Var = this.j;
        float f = this.i;
        switch (b) {
            case 0:
                lk2 lk2Var = (lk2) vp0Var;
                bd bdVar = (bd) obj;
                float fAbs = Math.abs(((Number) bdVar.e.getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                lu1 lu1Var = bdVar.e;
                if (fAbs < fAbs2) {
                    r02.f(bdVar, w71Var, lk2Var, ((Number) lu1Var.getValue()).floatValue() - u72Var.h);
                    u72Var.h = ((Number) lu1Var.getValue()).floatValue();
                } else {
                    float fN = r02.n(((Number) lu1Var.getValue()).floatValue(), f);
                    r02.f(bdVar, w71Var, lk2Var, fN - u72Var.h);
                    bdVar.a();
                    u72Var.h = fN;
                }
                break;
            default:
                bd bdVar2 = (bd) obj;
                float fN2 = r02.n(((Number) bdVar2.e.getValue()).floatValue(), f);
                float f2 = fN2 - u72Var.h;
                try {
                    fA = w71Var.a(f2);
                } catch (CancellationException unused) {
                    bdVar2.a();
                    fA = 0.0f;
                }
                vp0Var.h(Float.valueOf(fA));
                if (Math.abs(f2 - fA) > 0.5f || fN2 != ((Number) bdVar2.e.getValue()).floatValue()) {
                    bdVar2.a();
                }
                u72Var.h += fA;
                break;
        }
        return j23Var;
    }
}
