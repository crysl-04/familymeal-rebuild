package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rs extends c32 {
    public static final rs c = new rs(us.a);

    @Override // defpackage.r
    public final int h(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.cv, defpackage.r
    public final void j(hz hzVar, int i, Object obj) {
        ps psVar = (ps) obj;
        psVar.getClass();
        char cI = hzVar.i(this.b, i);
        psVar.b(psVar.d() + 1);
        char[] cArr = psVar.a;
        int i2 = psVar.b;
        psVar.b = i2 + 1;
        cArr[i2] = cI;
    }

    @Override // defpackage.c32
    public final a32 m() {
        ps psVar = new ps();
        psVar.a = new char[10];
        psVar.b = 0;
        return psVar;
    }

    @Override // defpackage.c32
    public final void n(b bVar, Object obj, int i) {
        char[] cArr = (char[]) obj;
        bVar.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            char c2 = cArr[i2];
            bVar.g(this.b, i2);
            bVar.d(c2);
        }
    }
}
