package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class i52 implements mi0, bk1 {
    public int h = 0;
    public int i = 0;
    public final cw j;

    public i52() {
        g52 g52Var = l52.q;
        this.j = new cw(Integer.MAX_VALUE);
    }

    @Override // defpackage.bk1
    public final void I0(long j, long j2, double d) {
        q0(d, Math.toIntExact(j), Math.toIntExact(j2));
    }

    @Override // defpackage.bk1
    public final void S0(long j, long j2, Comparable comparable) {
        q0(comparable != null ? xo1.c1(comparable) : 0.0d, Math.toIntExact(j), Math.toIntExact(j2));
    }

    @Override // defpackage.no2
    public final int T() {
        return this.h;
    }

    @Override // defpackage.bk1
    public final void W0(long j, long j2, c23 c23Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.no2
    public final int Z1() {
        return this.i;
    }

    @Override // defpackage.dk1
    public final void b0(double d, int i, int i2) {
        cw cwVar = this.j;
        ArrayList arrayList = cwVar.i;
        if (i2 >= arrayList.size()) {
            cwVar.j((i2 + 1) - arrayList.size());
        }
        cwVar.b0(d, i, i2);
        this.i = Math.max(this.i, i + 1);
        this.h = Math.max(this.h, i2 + 1);
    }

    @Override // defpackage.mi0
    public final no2 build() {
        int i = this.i;
        int i2 = this.h;
        cw cwVar = this.j;
        ArrayList arrayList = cwVar.i;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            i3 += ((cm2) obj).i;
        }
        return cwVar.a0(i, i2, i3);
    }

    @Override // defpackage.bk1
    public final void q0(double d, int i, int i2) {
        cw cwVar = this.j;
        ArrayList arrayList = cwVar.i;
        if (i2 >= arrayList.size()) {
            cwVar.j((i2 + 1) - arrayList.size());
        }
        cwVar.q0(d, i, i2);
        this.i = Math.max(this.i, i + 1);
        this.h = Math.max(this.h, i2 + 1);
    }

    @Override // defpackage.zj1
    public final void reset() {
        this.i = 0;
        this.h = 0;
        this.j.reset();
    }

    @Override // defpackage.dk1
    public final void y0(long j, long j2, Comparable comparable) {
        b0(comparable != null ? xo1.c1(comparable) : 0.0d, Math.toIntExact(j), Math.toIntExact(j2));
    }
}
