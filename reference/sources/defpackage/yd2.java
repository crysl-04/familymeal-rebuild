package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yd2 implements ke2 {
    public static final k42 k = new k42(new kc2(6), new jc2(18), 4);
    public final iu1 a;
    public float g;
    public final o90 i;
    public final o90 j;
    public final iu1 b = new iu1(0);
    public final iu1 c = new iu1(0);
    public final lu1 d = rz1.x(Boolean.FALSE);
    public final ui1 e = new ui1();
    public final iu1 f = new iu1(Integer.MAX_VALUE);
    public final t70 h = new t70(new z61(this, 16));

    public yd2(int i) {
        this.a = new iu1(i);
        final byte b = 0;
        this.i = il2.b(new kp0(this) { // from class: xd2
            public final /* synthetic */ yd2 i;

            {
                this.i = this;
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0020  */
            @Override // defpackage.kp0
            public final Object a() {
                byte b2 = b;
                boolean z = false;
                yd2 yd2Var = this.i;
                switch (b2) {
                    case 0:
                        if (yd2Var.a.g() < yd2Var.f.g()) {
                            z = true;
                        }
                        break;
                    default:
                        if (yd2Var.a.g() > 0) {
                            z = true;
                        }
                        break;
                }
                return Boolean.valueOf(z);
            }
        });
        final byte b2 = 1;
        this.j = il2.b(new kp0(this) { // from class: xd2
            public final /* synthetic */ yd2 i;

            {
                this.i = this;
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0020  */
            @Override // defpackage.kp0
            public final Object a() {
                byte b3 = b2;
                boolean z = false;
                yd2 yd2Var = this.i;
                switch (b3) {
                    case 0:
                        if (yd2Var.a.g() < yd2Var.f.g()) {
                            z = true;
                        }
                        break;
                    default:
                        if (yd2Var.a.g() > 0) {
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
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    @Override // defpackage.ke2
    public final boolean b() {
        return this.h.b();
    }

    @Override // defpackage.ke2
    public final boolean c() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.ke2
    public final Object d(ek1 ek1Var, zp0 zp0Var, n10 n10Var) {
        Object objD = this.h.d(ek1Var, zp0Var, n10Var);
        return objD == y20.h ? objD : j23.a;
    }

    @Override // defpackage.ke2
    public final float e(float f) {
        return this.h.e(f);
    }
}
