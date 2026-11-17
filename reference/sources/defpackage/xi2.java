package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class xi2 extends c32 {
    public static final xi2 c = new xi2(yi2.a);

    @Override // defpackage.r
    public final int h(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.cv, defpackage.r
    public final void j(hz hzVar, int i, Object obj) {
        wi2 wi2Var = (wi2) obj;
        wi2Var.getClass();
        short sR = hzVar.r(this.b, i);
        wi2Var.b(wi2Var.d() + 1);
        short[] sArr = wi2Var.a;
        int i2 = wi2Var.b;
        wi2Var.b = i2 + 1;
        sArr[i2] = sR;
    }

    @Override // defpackage.c32
    public final a32 m() {
        wi2 wi2Var = new wi2();
        wi2Var.a = new short[10];
        wi2Var.b = 0;
        return wi2Var;
    }

    @Override // defpackage.c32
    public final void n(b bVar, Object obj, int i) {
        short[] sArr = (short[]) obj;
        bVar.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            bVar.g(this.b, i2);
            bVar.q(s);
        }
    }
}
