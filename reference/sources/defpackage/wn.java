package defpackage;

import android.text.Layout;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wn implements vp0 {
    public final /* synthetic */ byte h = 1;
    public final /* synthetic */ long i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Serializable k;
    public final /* synthetic */ Object l;

    public /* synthetic */ wn(long j, float[] fArr, v72 v72Var, u72 u72Var) {
        this.i = j;
        this.j = fArr;
        this.k = v72Var;
        this.l = u72Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        long j;
        j23 j23Var;
        float[] fArr;
        int i;
        float fA;
        float fA2;
        byte b = this.h;
        j23 j23Var2 = j23.a;
        Object obj2 = this.l;
        Serializable serializable = this.k;
        Object obj3 = this.j;
        switch (b) {
            case 0:
                r72 r72Var = (r72) obj3;
                x72 x72Var = (x72) serializable;
                long j2 = this.i;
                ln lnVar = (ln) obj2;
                n41 n41Var = (n41) obj;
                n41Var.a();
                float f = r72Var.a;
                float f2 = r72Var.b;
                yq yqVar = n41Var.h;
                ((g2) yqVar.i.i).P(f, f2);
                try {
                    td0.T(n41Var, (t8) x72Var.h, j2, 0L, 0.0f, lnVar, 0, 890);
                    return j23Var2;
                } finally {
                    ((g2) yqVar.i.i).P(-f, -f2);
                }
            default:
                float[] fArr2 = (float[]) obj3;
                v72 v72Var = (v72) serializable;
                u72 u72Var = (u72) obj2;
                yt1 yt1Var = (yt1) obj;
                int i2 = yt1Var.b;
                g9 g9Var = yt1Var.a;
                int iE = yt1Var.c;
                long j3 = this.i;
                int iF = i2 > qw2.f(j3) ? yt1Var.b : qw2.f(j3);
                if (iE >= qw2.e(j3)) {
                    iE = qw2.e(j3);
                }
                long jA = m02.a(yt1Var.b(iF), yt1Var.b(iE));
                int i3 = v72Var.h;
                hw2 hw2Var = g9Var.d;
                int iF2 = qw2.f(jA);
                int iE2 = qw2.e(jA);
                Layout layout = hw2Var.f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    bx0.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    bx0.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    bx0.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    bx0.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i3 < ((iE2 - iF2) << 2)) {
                    bx0.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iG = hw2Var.g(iF2);
                int iG2 = hw2Var.g(iE2 - 1);
                nt0 nt0Var = new nt0(hw2Var);
                if (iG <= iG2) {
                    while (true) {
                        int lineStart = layout.getLineStart(iG);
                        j = jA;
                        int iF3 = hw2Var.f(iG);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iF3);
                        float fI = hw2Var.i(iG);
                        float fE = hw2Var.e(iG);
                        j23Var = j23Var2;
                        fArr = fArr2;
                        boolean z = false;
                        boolean z2 = layout.getParagraphDirection(iG) == 1;
                        int i4 = i3;
                        int i5 = iMax;
                        while (i5 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i5);
                            if (!z2) {
                                i = iMin;
                                if (zIsRtlCharAt) {
                                    fA = nt0Var.a(i5, z, z, true);
                                    fA2 = nt0Var.a(i5 + 1, true, true, true);
                                    z = false;
                                } else {
                                    fA2 = nt0Var.a(i5, z, z, z);
                                    fA = nt0Var.a(i5 + 1, true, true, z);
                                }
                            } else if (!zIsRtlCharAt) {
                                fA2 = nt0Var.a(i5, z, z, true);
                                i = iMin;
                                fA = nt0Var.a(i5 + 1, true, true, true);
                                z = false;
                            } else if (zIsRtlCharAt) {
                                z = false;
                                float fA3 = nt0Var.a(i5, false, false, false);
                                i = iMin;
                                fA2 = nt0Var.a(i5 + 1, true, true, false);
                                fA = fA3;
                            } else {
                                i = iMin;
                                z = false;
                                fA2 = nt0Var.a(i5, z, z, z);
                                fA = nt0Var.a(i5 + 1, true, true, z);
                            }
                            fArr[i4] = fA2;
                            fArr[i4 + 1] = fI;
                            fArr[i4 + 2] = fA;
                            fArr[i4 + 3] = fE;
                            i4 += 4;
                            i5++;
                            iMin = i;
                        }
                        if (iG != iG2) {
                            iG++;
                            jA = j;
                            i3 = i4;
                            j23Var2 = j23Var;
                            fArr2 = fArr;
                        }
                    }
                } else {
                    j = jA;
                    j23Var = j23Var2;
                    fArr = fArr2;
                }
                int iD = v72Var.h + (qw2.d(j) << 2);
                for (int i6 = v72Var.h; i6 < iD; i6 += 4) {
                    int i7 = i6 + 1;
                    float f3 = fArr[i7];
                    float f4 = u72Var.h;
                    fArr[i7] = f3 + f4;
                    int i8 = i6 + 3;
                    fArr[i8] = fArr[i8] + f4;
                }
                v72Var.h = iD;
                u72Var.h += g9Var.f;
                return j23Var;
        }
    }

    public /* synthetic */ wn(r72 r72Var, x72 x72Var, long j, ln lnVar) {
        this.j = r72Var;
        this.k = x72Var;
        this.i = j;
        this.l = lnVar;
    }
}
