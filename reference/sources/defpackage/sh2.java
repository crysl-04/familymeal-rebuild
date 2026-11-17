package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class sh2 implements rh2, aq {
    public final rh2 a;
    public final String b;
    public final Set c;

    public sh2(rh2 rh2Var) {
        rh2Var.getClass();
        this.a = rh2Var;
        this.b = rh2Var.b() + '?';
        this.c = t03.m(rh2Var);
    }

    @Override // defpackage.rh2
    public final int a(String str) {
        str.getClass();
        return this.a.a(str);
    }

    @Override // defpackage.rh2
    public final String b() {
        return this.b;
    }

    @Override // defpackage.rh2
    public final p02 c() {
        return this.a.c();
    }

    @Override // defpackage.rh2
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.rh2
    public final String e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sh2) {
            return uz0.g(this.a, ((sh2) obj).a);
        }
        return false;
    }

    @Override // defpackage.rh2
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.aq
    public final Set g() {
        return this.c;
    }

    @Override // defpackage.rh2
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.rh2
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.rh2
    public final List i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.rh2
    public final rh2 j(int i) {
        return this.a.j(i);
    }

    @Override // defpackage.rh2
    public final boolean k(int i) {
        return this.a.k(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
