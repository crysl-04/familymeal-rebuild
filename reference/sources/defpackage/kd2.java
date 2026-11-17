package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kd2 {
    public final String a;
    public final String b;
    public final String c;

    public kd2(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd2)) {
            return false;
        }
        kd2 kd2Var = (kd2) obj;
        return uz0.g(this.a, kd2Var.a) && uz0.g(this.b, kd2Var.b) && uz0.g(this.c, kd2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + jp1.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return wi0.i(wi0.l("ScheduleSlotEntity(day=", this.a, ", meal=", this.b, ", personId="), this.c, ")");
    }
}
