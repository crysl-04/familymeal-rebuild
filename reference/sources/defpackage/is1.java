package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public enum is1 {
    APPROXIMATE(8),
    DISTINCT(256),
    FAILED(-1),
    FEASIBLE(16),
    INFEASIBLE(-8),
    INVALID(-2),
    OPTIMAL(64),
    UNBOUNDED(-32),
    UNEXPLORED(0),
    VALID(4);

    public final int h;

    is1(int i) {
        this.h = i;
    }

    public final boolean a() {
        return this == APPROXIMATE || c();
    }

    public final boolean b() {
        return this.h < 0;
    }

    public final boolean c() {
        return Math.abs(this.h) >= 16;
    }

    public final boolean d() {
        return Math.abs(this.h) >= 64;
    }
}
