package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zj0 extends c32 {
    public static final zj0 c = new zj0(ck0.a);

    @Override // defpackage.r
    public final int h(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.cv, defpackage.r
    public final void j(hz hzVar, int i, Object obj) {
        yj0 yj0Var = (yj0) obj;
        yj0Var.getClass();
        float fM = hzVar.m(this.b, i);
        yj0Var.b(yj0Var.d() + 1);
        float[] fArr = yj0Var.a;
        int i2 = yj0Var.b;
        yj0Var.b = i2 + 1;
        fArr[i2] = fM;
    }

    @Override // defpackage.c32
    public final a32 m() {
        yj0 yj0Var = new yj0();
        yj0Var.a = new float[10];
        yj0Var.b = 0;
        return yj0Var;
    }

    @Override // defpackage.c32
    public final void n(b bVar, Object obj, int i) {
        float[] fArr = (float[]) obj;
        bVar.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            bVar.g(this.b, i2);
            bVar.h(f);
        }
    }
}
