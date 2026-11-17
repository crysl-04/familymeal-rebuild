package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class bz0 implements ez0 {
    public final cz0 b;
    public final wo1 c;
    public final wo1 d;
    public final Comparator[] e;

    public bz0(Comparator[] comparatorArr, wo1 wo1Var, wo1 wo1Var2, az0 az0Var, cz0 cz0Var) {
        this.e = comparatorArr;
        this.d = wo1Var;
        this.c = wo1Var2;
        this.b = cz0Var;
    }

    @Override // defpackage.ez0
    public final List a(int i) {
        int iMax = Math.max(1, i);
        ArrayList arrayList = new ArrayList(iMax);
        for (int i2 = 0; i2 < iMax; i2++) {
            arrayList.add(this.e[i2 % 3]);
        }
        return arrayList;
    }

    @Override // defpackage.ez0
    public final wo1 b() {
        return this.c;
    }

    @Override // defpackage.ez0
    public final wo1 c() {
        return this.d;
    }

    @Override // defpackage.ez0
    public final cz0 d() {
        return this.b;
    }
}
