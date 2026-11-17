package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gm0 {
    public static final gm0 b = new gm0();
    public static final gm0 c = new gm0();
    public static final gm0 d = new gm0();
    public final uj1 a = new uj1(new im0[16]);

    public static void a(gm0 gm0Var) {
        gm0Var.getClass();
        if (gm0Var == b) {
            li1.g("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (gm0Var == c) {
            li1.g("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        uj1 uj1Var = gm0Var.a;
        int i = uj1Var.j;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = uj1Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            j80 j80Var = (im0) objArr[i2];
            if (!((qg1) j80Var).h.u) {
                ax0.b("visitChildren called on an unattached node");
            }
            uj1 uj1Var2 = new uj1(new qg1[16]);
            qg1 qg1Var = ((qg1) j80Var).h;
            qg1 qg1Var2 = qg1Var.m;
            if (qg1Var2 == null) {
                cu.q(uj1Var2, qg1Var);
            } else {
                uj1Var2.b(qg1Var2);
            }
            while (true) {
                int i3 = uj1Var2.j;
                if (i3 == 0) {
                    break;
                }
                qg1 qg1VarR = (qg1) uj1Var2.k(i3 - 1);
                if ((qg1VarR.k & 1024) == 0) {
                    cu.q(uj1Var2, qg1VarR);
                } else {
                    while (qg1VarR != null) {
                        if ((qg1VarR.j & 1024) != 0) {
                            uj1 uj1Var3 = null;
                            while (qg1VarR != null) {
                                if (qg1VarR instanceof lm0) {
                                    if (((lm0) qg1VarR).R0(7)) {
                                        break;
                                    }
                                } else if ((qg1VarR.j & 1024) != 0 && (qg1VarR instanceof k80)) {
                                    int i4 = 0;
                                    for (qg1 qg1Var3 = ((k80) qg1VarR).w; qg1Var3 != null; qg1Var3 = qg1Var3.m) {
                                        if ((qg1Var3.j & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                qg1VarR = qg1Var3;
                                            } else {
                                                if (uj1Var3 == null) {
                                                    uj1Var3 = new uj1(new qg1[16]);
                                                }
                                                if (qg1VarR != null) {
                                                    uj1Var3.b(qg1VarR);
                                                    qg1VarR = null;
                                                }
                                                uj1Var3.b(qg1Var3);
                                            }
                                        }
                                    }
                                    if (i4 != 1) {
                                    }
                                }
                                qg1VarR = cu.R(uj1Var3);
                            }
                            break;
                        }
                        qg1VarR = qg1VarR.m;
                    }
                }
            }
        }
    }
}
