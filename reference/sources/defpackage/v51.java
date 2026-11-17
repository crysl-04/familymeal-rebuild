package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class v51 {
    public final int a;
    public final u51[] b;
    public final x51 c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;

    public v51(int i, u51[] u51VarArr, x51 x51Var, List list, int i2) {
        this.a = i;
        this.b = u51VarArr;
        this.c = x51Var;
        this.d = list;
        this.e = i2;
        int iMax = 0;
        for (u51 u51Var : u51VarArr) {
            iMax = Math.max(iMax, u51Var.k);
        }
        this.f = iMax;
        int i3 = iMax + this.e;
        this.g = i3 >= 0 ? i3 : 0;
    }

    public final u51[] a(int i, int i2, int i3) {
        u51[] u51VarArr = this.b;
        int length = u51VarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            u51 u51Var = u51VarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((is0) this.d.get(i5)).a;
            u51Var.m(i, this.c.b[i6], i2, i3, this.a, i6);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return u51VarArr;
    }
}
