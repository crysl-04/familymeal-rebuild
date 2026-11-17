package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k13 extends c32 {
    public static final k13 c = new k13(l13.a);

    @Override // defpackage.r
    public final int h(Object obj) {
        return ((i13) obj).h.length;
    }

    @Override // defpackage.cv, defpackage.r
    public final void j(hz hzVar, int i, Object obj) {
        j13 j13Var = (j13) obj;
        j13Var.getClass();
        byte bV = hzVar.c(this.b, i).v();
        j13Var.b(j13Var.d() + 1);
        byte[] bArr = j13Var.a;
        int i2 = j13Var.b;
        j13Var.b = i2 + 1;
        bArr[i2] = bV;
    }

    @Override // defpackage.c32
    public final a32 m() {
        j13 j13Var = new j13();
        j13Var.a = new byte[10];
        j13Var.b = 0;
        return j13Var;
    }

    @Override // defpackage.c32
    public final void n(b bVar, Object obj, int i) {
        byte[] bArr = ((i13) obj).h;
        bVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            bVar.j(this.b, i2).c(bArr[i2]);
        }
    }
}
