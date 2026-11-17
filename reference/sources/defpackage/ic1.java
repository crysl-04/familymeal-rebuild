package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ic1 extends c32 {
    public static final ic1 c = new ic1(rc1.a);

    @Override // defpackage.r
    public final int h(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.cv, defpackage.r
    public final void j(hz hzVar, int i, Object obj) {
        hc1 hc1Var = (hc1) obj;
        hc1Var.getClass();
        long jL = hzVar.l(this.b, i);
        hc1Var.b(hc1Var.d() + 1);
        long[] jArr = hc1Var.a;
        int i2 = hc1Var.b;
        hc1Var.b = i2 + 1;
        jArr[i2] = jL;
    }

    @Override // defpackage.c32
    public final a32 m() {
        hc1 hc1Var = new hc1();
        hc1Var.a = new long[10];
        hc1Var.b = 0;
        return hc1Var;
    }

    @Override // defpackage.c32
    public final void n(b bVar, Object obj, int i) {
        long[] jArr = (long[]) obj;
        bVar.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            bVar.g(this.b, i2);
            bVar.l(j);
        }
    }
}
