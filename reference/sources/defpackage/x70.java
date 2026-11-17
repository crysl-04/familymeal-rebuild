package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class x70 implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ x70(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, x21] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v3, types: [fj1] */
    /* JADX WARN: Type inference failed for: r9v2, types: [fj1] */
    @Override // defpackage.kp0
    public final Object a() {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                sy2 sy2Var = ((sj2) obj).i;
                return new kv(cu.K(le0.b.c(0.0f), sy2Var.a, sy2Var.b));
            default:
                ArrayList arrayList = ((gr0) obj).a;
                mj1 mj1Var = new mj1(arrayList.size());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ?? r4 = (x21) arrayList.get(i);
                    Object obj2 = r4.b;
                    int i2 = r4.a;
                    Object a11Var = obj2 != null ? new a11(Integer.valueOf(i2), r4.b) : Integer.valueOf(i2);
                    int iF = mj1Var.f(a11Var);
                    boolean z = iF < 0;
                    Object obj3 = z ? null : mj1Var.c[iF];
                    if (obj3 != null) {
                        if (obj3 instanceof fj1) {
                            ?? r8 = (fj1) obj3;
                            r8.a(r4);
                            r4 = r8;
                        } else {
                            Object[] objArr = kp1.a;
                            ?? fj1Var = new fj1(2);
                            fj1Var.a(obj3);
                            fj1Var.a(r4);
                            r4 = fj1Var;
                        }
                    }
                    if (z) {
                        int i3 = ~iF;
                        mj1Var.b[i3] = a11Var;
                        mj1Var.c[i3] = r4;
                    } else {
                        mj1Var.c[iF] = r4;
                    }
                }
                return new ai1(mj1Var);
        }
    }
}
