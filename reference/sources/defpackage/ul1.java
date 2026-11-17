package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ul1 extends mq2 implements zp0 {
    public final /* synthetic */ qz2 l;
    public final /* synthetic */ kl1 m;
    public final /* synthetic */ pk1 n;
    public final /* synthetic */ aj1 o;
    public final /* synthetic */ kn2 p;
    public final /* synthetic */ fy q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul1(qz2 qz2Var, kl1 kl1Var, pk1 pk1Var, aj1 aj1Var, kn2 kn2Var, fy fyVar, m10 m10Var) {
        super(2, m10Var);
        this.l = qz2Var;
        this.m = kl1Var;
        this.n = pk1Var;
        this.o = aj1Var;
        this.p = kn2Var;
        this.q = fyVar;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        ul1 ul1Var = (ul1) p((m10) obj2, (x20) obj);
        j23 j23Var = j23.a;
        ul1Var.r(j23Var);
        return j23Var;
    }

    @Override // defpackage.rk
    public final m10 p(m10 m10Var, Object obj) {
        return new ul1(this.l, this.m, this.n, this.o, this.p, this.q, m10Var);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d5 A[LOOP:1: B:15:0x005f->B:27:0x00d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00d8 A[EDGE_INSN: B:32:0x00d8->B:28:0x00d8 BREAK  A[LOOP:1: B:15:0x005f->B:27:0x00d5], SYNTHETIC] */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        m02.y(obj);
        qz2 qz2Var = this.l;
        Object objG = qz2Var.a.g();
        lu1 lu1Var = qz2Var.d;
        if (uz0.g(objG, lu1Var.getValue()) && (((pk1) this.m.b.f.g()) == null || uz0.g(lu1Var.getValue(), this.n))) {
            Iterator it = ((List) this.p.getValue()).iterator();
            while (it.hasNext()) {
                this.q.b().c((pk1) it.next());
            }
            aj1 aj1Var = this.o;
            long[] jArr = aj1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = aj1Var.b[i4];
                                float f = aj1Var.c[i4];
                                if (!uz0.g((String) obj2, ((pk1) lu1Var.getValue()).m)) {
                                    aj1Var.e--;
                                    long[] jArr2 = aj1Var.a;
                                    int i5 = aj1Var.d;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    aj1Var.b[i4] = null;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i != length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return j23.a;
    }
}
