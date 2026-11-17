package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z13 extends c32 {
    public static final z13 c = new z13(a23.a);

    @Override // defpackage.r
    public final int h(Object obj) {
        return ((x13) obj).h.length;
    }

    @Override // defpackage.cv, defpackage.r
    public final void j(hz hzVar, int i, Object obj) {
        y13 y13Var = (y13) obj;
        y13Var.getClass();
        short sA = hzVar.c(this.b, i).A();
        y13Var.b(y13Var.d() + 1);
        short[] sArr = y13Var.a;
        int i2 = y13Var.b;
        y13Var.b = i2 + 1;
        sArr[i2] = sA;
    }

    @Override // defpackage.c32
    public final a32 m() {
        y13 y13Var = new y13();
        y13Var.a = new short[10];
        y13Var.b = 0;
        return y13Var;
    }

    @Override // defpackage.c32
    public final void n(b bVar, Object obj, int i) {
        short[] sArr = ((x13) obj).h;
        bVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            bVar.j(this.b, i2).q(sArr[i2]);
        }
    }
}
