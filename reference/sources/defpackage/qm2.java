package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class qm2 implements mi0 {
    public final int h;
    public final ConcurrentHashMap.KeySetView i;
    public final int j;

    public qm2(int i, int i2) {
        g52 g52Var = l52.q;
        this.i = ConcurrentHashMap.newKeySet();
        rm2.d0(i, i2);
        this.j = i;
        this.h = i2;
    }

    @Override // defpackage.no2
    public final int T() {
        return this.h;
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.j;
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        this.i.add(new gh0((((long) i2) * ((long) this.j)) + ((long) i), Double.valueOf(d)));
    }

    @Override // defpackage.mi0
    public final no2 build() {
        rm2 rm2Var = new rm2(l52.q, this.j, this.h, new nm2(this, (byte) 5));
        ConcurrentHashMap.KeySetView keySetView = this.i;
        keySetView.stream().sorted().forEach(new b1(rm2Var.n, (byte) 2));
        keySetView.clear();
        return rm2Var;
    }

    @Override // defpackage.dk1
    public final void y0(long j, long j2, Comparable comparable) {
        this.i.add(new gh0((j2 * ((long) this.j)) + j, comparable));
    }
}
