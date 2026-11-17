package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xb0 extends c32 {
    public static final xb0 c = new xb0(zb0.a);

    @Override // defpackage.r
    public final int h(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.cv, defpackage.r
    public final void j(hz hzVar, int i, Object obj) {
        wb0 wb0Var = (wb0) obj;
        wb0Var.getClass();
        double dW = hzVar.w(this.b, i);
        wb0Var.b(wb0Var.d() + 1);
        double[] dArr = wb0Var.a;
        int i2 = wb0Var.b;
        wb0Var.b = i2 + 1;
        dArr[i2] = dW;
    }

    @Override // defpackage.c32
    public final a32 m() {
        wb0 wb0Var = new wb0();
        wb0Var.a = new double[10];
        wb0Var.b = 0;
        return wb0Var;
    }

    @Override // defpackage.c32
    public final void n(b bVar, Object obj, int i) {
        double[] dArr = (double[]) obj;
        bVar.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            bVar.f(this.b, i2, dArr[i2]);
        }
    }
}
