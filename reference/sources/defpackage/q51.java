package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q51 {
    public final x51 a;
    public final int b;
    public final int c;
    public final p51 d;
    public final u30 e;
    public final /* synthetic */ x51 f;

    public q51(x51 x51Var, int i, int i2, p51 p51Var, u30 u30Var) {
        this.f = x51Var;
        this.a = x51Var;
        this.b = i;
        this.c = i2;
        this.d = p51Var;
        this.e = u30Var;
    }

    public final long a(int i, int i2) {
        int i3;
        x51 x51Var = this.a;
        int[] iArr = x51Var.a;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = x51Var.b;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            cx0.a("width must be >= 0");
        }
        return l00.h(i3, i3, 0, Integer.MAX_VALUE);
    }

    public final v51 b(int i) {
        p4 p4VarE = this.e.e(i);
        int i2 = p4VarE.b;
        List list = (List) p4VarE.c;
        int size = list.size();
        int i3 = 0;
        int i4 = (size == 0 || i2 + size == this.b) ? 0 : this.c;
        u51[] u51VarArr = new u51[size];
        int i5 = 0;
        while (i3 < size) {
            int i6 = (int) ((is0) list.get(i3)).a;
            int i7 = i4;
            u51 u51VarQ = this.d.q(i2 + i3, i5, i6, i7, a(i5, i6));
            i5 += i6;
            u51VarArr[i3] = u51VarQ;
            i3++;
            i4 = i7;
        }
        return new v51(i, u51VarArr, this.f, list, i4);
    }
}
