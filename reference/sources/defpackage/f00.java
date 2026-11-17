package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class f00 {
    public final sv a;
    public final sv b;
    public final sv c;
    public final float[] d;

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Illegal instructions before constructor call */
    public f00(sv svVar, sv svVar2, int i) {
        g73 g73Var;
        float[] fArrA;
        sv svVarL = ou.t(svVar.b, 12884901888L) ? es.l(svVar) : svVar;
        sv svVarL2 = ou.t(svVar2.b, 12884901888L) ? es.l(svVar2) : svVar2;
        float[] fArrA2 = s60.X;
        float[] fArr = null;
        if (i == 3) {
            boolean zT = ou.t(svVar.b, 12884901888L);
            boolean zT2 = ou.t(svVar2.b, 12884901888L);
            if (zT) {
                if (!zT2) {
                    g73Var = ((s92) svVar).d;
                    if (zT) {
                        fArrA = g73Var.a();
                    } else {
                        fArrA = fArrA2;
                    }
                    fArrA2 = zT2 ? g73Var.a() : fArrA2;
                    fArr = new float[]{fArrA[0] / fArrA2[0], fArrA[1] / fArrA2[1], fArrA[2] / fArrA2[2]};
                }
            } else if (zT2) {
                svVar = svVar2;
                g73Var = ((s92) svVar).d;
                if (zT) {
                    fArrA = g73Var.a();
                } else {
                    fArrA = fArrA2;
                }
                if (zT2) {
                }
                fArr = new float[]{fArrA[0] / fArrA2[0], fArrA[1] / fArrA2[1], fArrA[2] / fArrA2[2]};
            }
        }
        this(svVar2, svVarL, svVarL2, fArr);
    }

    public long a(long j) {
        float fG = kv.g(j);
        float f = kv.f(j);
        float fD = kv.d(j);
        float fC = kv.c(j);
        sv svVar = this.b;
        long jD = svVar.d(fG, f, fD);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE = svVar.e(fG, f, fD);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE *= fArr[2];
        }
        float f2 = fIntBitsToFloat;
        float f3 = fIntBitsToFloat2;
        return this.c.f(f2, f3, fE, fC, this.a);
    }

    public f00(sv svVar, sv svVar2, sv svVar3, float[] fArr) {
        this.a = svVar;
        this.b = svVar2;
        this.c = svVar3;
        this.d = fArr;
    }
}
