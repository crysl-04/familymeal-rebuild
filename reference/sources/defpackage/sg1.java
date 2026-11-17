package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sg1 {
    public final t6 a;
    public fj1 b;
    public fj1 c;
    public fj1 d;
    public fj1 e;
    public boolean f;

    public sg1(t6 t6Var) {
        this.a = t6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [qg1] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [qg1] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [uj1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [uj1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static void b(qg1 qg1Var, h42 h42Var) {
        if (!qg1Var.h.u) {
            ax0.b("visitSubtreeIf called on an unattached node");
        }
        uj1 uj1Var = new uj1(new qg1[16]);
        qg1 qg1Var2 = qg1Var.h;
        qg1 qg1Var3 = qg1Var2.m;
        if (qg1Var3 == null) {
            cu.q(uj1Var, qg1Var2);
        } else {
            uj1Var.b(qg1Var3);
        }
        while (true) {
            int i = uj1Var.j;
            if (i == 0) {
                return;
            }
            qg1 qg1Var4 = (qg1) uj1Var.k(i - 1);
            if ((qg1Var4.k & 32) != 0) {
                qg1 qg1Var5 = qg1Var4;
                while (true) {
                    if (qg1Var5 != null && qg1Var5.u) {
                        if ((qg1Var5.j & 32) != 0) {
                            ?? R = qg1Var5;
                            ?? uj1Var2 = 0;
                            while (R != 0) {
                                if (R instanceof tg1) {
                                    if (((tg1) R).k().q(h42Var)) {
                                        break;
                                    }
                                } else if ((R.j & 32) != 0 && (R instanceof k80)) {
                                    qg1 qg1Var6 = ((k80) R).w;
                                    int i2 = 0;
                                    R = R;
                                    uj1Var2 = uj1Var2;
                                    while (qg1Var6 != null) {
                                        if ((qg1Var6.j & 32) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                uj1Var2 = uj1Var2;
                                                R = qg1Var6;
                                            } else {
                                                if (uj1Var2 == 0) {
                                                    uj1Var2 = new uj1(new qg1[16]);
                                                }
                                                if (R != 0) {
                                                    uj1Var2.b(R);
                                                    R = 0;
                                                }
                                                uj1Var2.b(qg1Var6);
                                            }
                                        }
                                        qg1Var6 = qg1Var6.m;
                                        R = R;
                                        uj1Var2 = uj1Var2;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                R = cu.R(uj1Var2);
                            }
                        }
                        qg1Var5 = qg1Var5.m;
                    }
                }
            }
            cu.q(uj1Var, qg1Var4);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        o9 o9Var = new o9(this, (byte) 23);
        fj1 fj1Var = this.a.w0;
        if (fj1Var.e(o9Var)) {
            return;
        }
        fj1Var.a(o9Var);
    }
}
