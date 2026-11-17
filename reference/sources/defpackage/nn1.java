package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nn1 implements on1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [uj1] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [uj1] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [qg1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [qg1] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [qg1] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.on1
    public final boolean a(qg1 qg1Var) {
        ?? uj1Var = 0;
        while (true) {
            int i = 0;
            if (qg1Var == 0) {
                return false;
            }
            if (qg1Var instanceof c12) {
                if (((c12) qg1Var).p0()) {
                    return true;
                }
            } else if ((qg1Var.j & 16) != 0 && (qg1Var instanceof k80)) {
                qg1 qg1Var2 = ((k80) qg1Var).w;
                while (qg1Var2 != null) {
                    if ((qg1Var2.j & 16) != 0) {
                        i++;
                        if (i == 1) {
                            uj1Var = uj1Var;
                            qg1Var = qg1Var;
                            uj1Var = uj1Var;
                            qg1Var = qg1Var2;
                        } else {
                            if (uj1Var == 0) {
                                uj1Var = new uj1(new qg1[16]);
                            }
                            if (qg1Var != 0) {
                                uj1Var.b(qg1Var);
                                qg1Var = 0;
                            }
                            uj1Var.b(qg1Var2);
                        }
                    } else {
                        uj1Var = uj1Var;
                        qg1Var = qg1Var;
                    }
                    qg1Var2 = qg1Var2.m;
                    uj1Var = uj1Var;
                    qg1Var = qg1Var;
                }
                if (i != 1) {
                    uj1Var = uj1Var;
                    qg1Var = qg1Var;
                } else {
                    uj1Var = uj1Var;
                    qg1Var = qg1Var;
                }
            }
            qg1Var = cu.R(uj1Var);
        }
    }

    @Override // defpackage.on1
    public final int b() {
        return 16;
    }

    @Override // defpackage.on1
    public final void d(l41 l41Var, long j, jt0 jt0Var, int i, boolean z) {
        l41Var.A(j, jt0Var, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [qg1] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [qg1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [uj1] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [uj1] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.on1
    public final boolean e(jt0 jt0Var, l41 l41Var) {
        pn1 pn1Var = l41Var.L.d;
        pn1Var.getClass();
        qg1 qg1VarY0 = pn1Var.Y0(vn1.g(16));
        if (qg1VarY0 != null && qg1VarY0.u) {
            if (!qg1VarY0.h.u) {
                ax0.b("visitLocalDescendants called on an unattached node");
            }
            qg1 qg1Var = qg1VarY0.h;
            if ((qg1Var.k & 16) != 0) {
                while (qg1Var != null) {
                    if ((qg1Var.j & 16) != 0) {
                        ?? R = qg1Var;
                        ?? uj1Var = 0;
                        while (R != 0) {
                            if (R instanceof c12) {
                                if (((c12) R).a0()) {
                                    jt0Var.j = jt0Var.h.b - 1;
                                    return true;
                                }
                            } else if ((R.j & 16) != 0 && (R instanceof k80)) {
                                qg1 qg1Var2 = ((k80) R).w;
                                int i = 0;
                                while (qg1Var2 != null) {
                                    if ((qg1Var2.j & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            R = R;
                                            uj1Var = uj1Var;
                                            uj1Var = uj1Var;
                                            R = qg1Var2;
                                        } else {
                                            if (uj1Var == 0) {
                                                uj1Var = new uj1(new qg1[16]);
                                            }
                                            if (R != 0) {
                                                uj1Var.b(R);
                                                R = 0;
                                            }
                                            uj1Var.b(qg1Var2);
                                        }
                                    } else {
                                        R = R;
                                        uj1Var = uj1Var;
                                    }
                                    qg1Var2 = qg1Var2.m;
                                    R = R;
                                    uj1Var = uj1Var;
                                }
                                if (i != 1) {
                                    R = R;
                                    uj1Var = uj1Var;
                                } else {
                                    R = R;
                                    uj1Var = uj1Var;
                                }
                            }
                            R = cu.R(uj1Var);
                        }
                    }
                    qg1Var = qg1Var.m;
                }
            }
        }
        return false;
    }

    @Override // defpackage.on1
    public final boolean f(l41 l41Var) {
        return true;
    }
}
