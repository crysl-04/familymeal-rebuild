package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class u13 extends c32 {
    public static final u13 c = new u13(v13.a);

    @Override // defpackage.r
    public final int h(Object obj) {
        return ((s13) obj).h.length;
    }

    @Override // defpackage.cv, defpackage.r
    public final void j(hz hzVar, int i, Object obj) {
        t13 t13Var = (t13) obj;
        t13Var.getClass();
        long jB = hzVar.c(this.b, i).b();
        t13Var.b(t13Var.d() + 1);
        long[] jArr = t13Var.a;
        int i2 = t13Var.b;
        t13Var.b = i2 + 1;
        jArr[i2] = jB;
    }

    @Override // defpackage.c32
    public final a32 m() {
        t13 t13Var = new t13();
        t13Var.a = new long[10];
        t13Var.b = 0;
        return t13Var;
    }

    @Override // defpackage.c32
    public final void n(b bVar, Object obj, int i) {
        long[] jArr = ((s13) obj).h;
        bVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            bVar.j(this.b, i2).l(jArr[i2]);
        }
    }
}
