package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gy0 extends c32 {
    public static final gy0 c = new gy0(ty0.a);

    @Override // defpackage.r
    public final int h(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.cv, defpackage.r
    public final void j(hz hzVar, int i, Object obj) {
        fy0 fy0Var = (fy0) obj;
        fy0Var.getClass();
        int iZ = hzVar.z(this.b, i);
        fy0Var.b(fy0Var.d() + 1);
        int[] iArr = fy0Var.a;
        int i2 = fy0Var.b;
        fy0Var.b = i2 + 1;
        iArr[i2] = iZ;
    }

    @Override // defpackage.c32
    public final a32 m() {
        fy0 fy0Var = new fy0();
        fy0Var.a = new int[10];
        fy0Var.b = 0;
        return fy0Var;
    }

    @Override // defpackage.c32
    public final void n(b bVar, Object obj, int i) {
        int[] iArr = (int[]) obj;
        bVar.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            bVar.g(this.b, i2);
            bVar.k(i3);
        }
    }
}
