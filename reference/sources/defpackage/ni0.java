package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public interface ni0 extends oi0 {
    mi0 a(long j, long j2);

    @Override // defpackage.oi0
    default no2 b(long j, long j2) {
        return a(j, j2).build();
    }

    default no2 d(a1 a1Var) {
        long jCount = a1Var.count();
        mi0 mi0VarA = a(jCount, 1L);
        long j = 0;
        if (l().a()) {
            while (j < jCount) {
                mi0VarA.y(j, a1Var.z(j));
                j++;
            }
        } else {
            while (j < jCount) {
                mi0VarA.B(j, a1Var.G(j));
                j++;
            }
        }
        return mi0VarA.build();
    }

    default no2 m(q22 q22Var) {
        long size = q22Var.size();
        mi0 mi0VarA = a(1L, size);
        long j = 0;
        if (l().a()) {
            while (j < size) {
                mi0VarA.y(j, q22Var.z(j));
                j++;
            }
        } else {
            while (j < size) {
                mi0VarA.B(j, q22Var.G(j));
                j++;
            }
        }
        return mi0VarA.build();
    }

    no2 q(int i, int i2);
}
