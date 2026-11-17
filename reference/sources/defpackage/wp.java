package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wp extends c32 {
    public static final wp c = new wp(xp.a);

    @Override // defpackage.r
    public final int h(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.cv, defpackage.r
    public final void j(hz hzVar, int i, Object obj) {
        vp vpVar = (vp) obj;
        vpVar.getClass();
        byte bO = hzVar.o(this.b, i);
        vpVar.b(vpVar.d() + 1);
        byte[] bArr = vpVar.a;
        int i2 = vpVar.b;
        vpVar.b = i2 + 1;
        bArr[i2] = bO;
    }

    @Override // defpackage.c32
    public final a32 m() {
        vp vpVar = new vp();
        vpVar.a = new byte[10];
        vpVar.b = 0;
        return vpVar;
    }

    @Override // defpackage.c32
    public final void n(b bVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        bVar.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            bVar.g(this.b, i2);
            bVar.c(b);
        }
    }
}
