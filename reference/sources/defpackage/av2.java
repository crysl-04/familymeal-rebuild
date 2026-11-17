package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class av2 implements ke2 {
    public final /* synthetic */ ke2 a;
    public final o90 b;
    public final o90 c;

    public av2(ke2 ke2Var, final bv2 bv2Var) {
        this.a = ke2Var;
        final byte b = 0;
        this.b = il2.b(new kp0() { // from class: zu2
            /* JADX WARN: Code duplicated, block: B:9:0x0025  */
            @Override // defpackage.kp0
            public final Object a() {
                byte b2 = b;
                boolean z = false;
                bv2 bv2Var2 = bv2Var;
                switch (b2) {
                    case 0:
                        if (bv2Var2.a.g() < bv2Var2.b.g()) {
                            z = true;
                        }
                        break;
                    default:
                        if (bv2Var2.a.g() > 0.0f) {
                            z = true;
                        }
                        break;
                }
                return Boolean.valueOf(z);
            }
        });
        final byte b2 = 1;
        this.c = il2.b(new kp0() { // from class: zu2
            /* JADX WARN: Code duplicated, block: B:9:0x0025  */
            @Override // defpackage.kp0
            public final Object a() {
                byte b3 = b2;
                boolean z = false;
                bv2 bv2Var2 = bv2Var;
                switch (b3) {
                    case 0:
                        if (bv2Var2.a.g() < bv2Var2.b.g()) {
                            z = true;
                        }
                        break;
                    default:
                        if (bv2Var2.a.g() > 0.0f) {
                            z = true;
                        }
                        break;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // defpackage.ke2
    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.ke2
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.ke2
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.ke2
    public final Object d(ek1 ek1Var, zp0 zp0Var, n10 n10Var) {
        return this.a.d(ek1Var, zp0Var, n10Var);
    }

    @Override // defpackage.ke2
    public final float e(float f) {
        return this.a.e(f);
    }
}
