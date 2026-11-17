package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vv2 {
    public static final k42 d = new k42(new kc2(26), new ss2(10), 4);
    public final od a;
    public final long b;
    public final qw2 c;

    public vv2(od odVar, long j, qw2 qw2Var) {
        qw2 qw2Var2;
        this.a = odVar;
        this.b = m02.d(odVar.i.length(), j);
        if (qw2Var != null) {
            qw2Var2 = new qw2(m02.d(odVar.i.length(), qw2Var.a));
        } else {
            qw2Var2 = null;
        }
        this.c = qw2Var2;
    }

    public static vv2 a(vv2 vv2Var, od odVar, long j, int i) {
        if ((i & 1) != 0) {
            odVar = vv2Var.a;
        }
        if ((i & 2) != 0) {
            j = vv2Var.b;
        }
        qw2 qw2Var = (i & 4) != 0 ? vv2Var.c : null;
        vv2Var.getClass();
        return new vv2(odVar, j, qw2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv2)) {
            return false;
        }
        vv2 vv2Var = (vv2) obj;
        return qw2.b(this.b, vv2Var.b) && uz0.g(this.c, vv2Var.c) && uz0.g(this.a, vv2Var.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = qw2.c;
        int iD = jp1.d(this.b, iHashCode, 31);
        qw2 qw2Var = this.c;
        return iD + (qw2Var != null ? Long.hashCode(qw2Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + qw2.h(this.b) + ", composition=" + this.c + ")";
    }

    public vv2(String str, long j, int i) {
        this(new od((i & 1) != 0 ? "" : str), (i & 2) != 0 ? qw2.b : j, (qw2) null);
    }
}
