package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da implements Comparator {
    public final /* synthetic */ byte h;

    public /* synthetic */ da(byte b) {
        this.h = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                return uz0.i(((l32) obj2).a ? 1 : 0, ((l32) obj).a ? 1 : 0);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                return uz0.i(((c01) obj).b, ((c01) obj2).b);
            case 3:
                qy0 qy0Var = (qy0) obj;
                qy0 qy0Var2 = (qy0) obj2;
                return (qy0Var.i - qy0Var.h) - (qy0Var2.i - qy0Var2.h);
            case 4:
                l41 l41Var = (l41) obj;
                l41 l41Var2 = (l41) obj2;
                float f = l41Var.M.p.L;
                float f2 = l41Var2.M.p.L;
                return f == f2 ? uz0.i(l41Var.v(), l41Var2.v()) : Float.compare(f, f2);
            case 5:
                return uz0.i(((w61) obj).getIndex(), ((w61) obj2).getIndex());
            default:
                return ((Number) fh2.b.f(obj, obj2)).intValue();
        }
    }
}
