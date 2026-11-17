package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p13 extends c32 {
    public static final p13 c = new p13(q13.a);

    @Override // defpackage.r
    public final int h(Object obj) {
        return ((n13) obj).h.length;
    }

    @Override // defpackage.cv, defpackage.r
    public final void j(hz hzVar, int i, Object obj) {
        o13 o13Var = (o13) obj;
        o13Var.getClass();
        int iQ = hzVar.c(this.b, i).q();
        o13Var.b(o13Var.d() + 1);
        int[] iArr = o13Var.a;
        int i2 = o13Var.b;
        o13Var.b = i2 + 1;
        iArr[i2] = iQ;
    }

    @Override // defpackage.c32
    public final a32 m() {
        o13 o13Var = new o13();
        o13Var.a = new int[10];
        o13Var.b = 0;
        return o13Var;
    }

    @Override // defpackage.c32
    public final void n(b bVar, Object obj, int i) {
        int[] iArr = ((n13) obj).h;
        bVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            bVar.j(this.b, i2).k(iArr[i2]);
        }
    }
}
