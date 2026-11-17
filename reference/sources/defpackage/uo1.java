package defpackage;

import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class uo1 implements r21 {
    public final r21 a;
    public final sh2 b;

    public uo1(r21 r21Var) {
        this.a = r21Var;
        this.b = new sh2(r21Var.d());
    }

    @Override // defpackage.r21
    public final Object a(v60 v60Var) {
        if (v60Var.e()) {
            return v60Var.a(this.a);
        }
        return null;
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        if (obj != null) {
            bVar.p(this.a, obj);
        } else {
            bVar.m();
        }
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && uo1.class == obj.getClass() && this.a.equals(((uo1) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
