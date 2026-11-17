package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ru implements Comparator {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ru(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.h;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                double[] dArr = (double[]) obj3;
                return Double.compare(dArr[((Integer) obj2).intValue()], dArr[((Integer) obj).intValue()]);
            case 1:
                double[] dArr2 = (double[]) obj3;
                return Double.compare(dArr2[((Integer) obj2).intValue()], dArr2[((Integer) obj).intValue()]);
            case 2:
                double[] dArr3 = (double[]) obj3;
                return Double.compare(dArr3[((Integer) obj2).intValue()], dArr3[((Integer) obj).intValue()]);
            default:
                for (vp0 vp0Var : (vp0[]) obj3) {
                    int iU = vs.u((Comparable) vp0Var.h(obj), (Comparable) vp0Var.h(obj2));
                    if (iU != 0) {
                        return iU;
                    }
                }
                return 0;
        }
    }
}
