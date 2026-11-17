package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class zm2 implements oj0 {
    public final float a;
    public final float b;
    public final Object c;

    public zm2(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // defpackage.cd
    public final o33 a(s03 s03Var) {
        Object obj = this.c;
        return new xl1(this.a, this.b, obj == null ? null : (id) s03Var.a.h(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zm2) {
            zm2 zm2Var = (zm2) obj;
            if (zm2Var.a == this.a && zm2Var.b == this.b && uz0.g(zm2Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + wi0.d(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ zm2(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
