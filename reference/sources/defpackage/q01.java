package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q01 implements v12 {
    public transient l52 a;

    @Override // defpackage.v12
    public final void a(final l52 l52Var, l52 l52Var2) {
        final f32 f32Var = h32.C;
        final l52 l52Var3 = this.a;
        final double[] dArr = l52Var2.j;
        int i = l52Var2.o;
        u8 u8Var = aj0.h;
        long length = dArr.length;
        long j = l52Var.i;
        long jCount = l52Var3.count();
        BigDecimal[] bigDecimalArr = lg1.a;
        int intExact = Math.toIntExact(Math.min(Math.min(length, j), jCount));
        if (i <= 0 || dArr.length / i <= 256) {
            ls.H(dArr, 0, intExact, 1, l52Var, f32Var, l52Var3);
            return;
        }
        u8 u8Var2 = aj0.h;
        u8Var2.a = 65536;
        u8Var2.b(0, intExact, new sb0() { // from class: zi0
            @Override // defpackage.sb0
            public final void a(int i2, int i3) {
                ls.H(dArr, i2, i3, 1, l52Var, f32Var, l52Var3);
            }
        });
    }

    @Override // defpackage.v12
    public final void b(ArrayList arrayList, int i) {
        l52 l52VarA = b00.a(this.a, i);
        this.a = l52VarA;
        l52VarA.T1(Double.valueOf(h32.b));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            mh0 mh0Var = (mh0) arrayList.get(i2);
            double d = mh0Var.j;
            int i3 = mh0Var.h;
            l52 l52Var = this.a;
            if (d != 0.0d) {
                l52Var.j[i3] = h32.b / d;
            } else {
                l52Var.j[i3] = h32.b;
            }
        }
    }
}
