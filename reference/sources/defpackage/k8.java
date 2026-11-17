package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class k8 {
    public final Context a;
    public final e90 b;
    public final long c;
    public final rt1 d;

    public k8(Context context, e90 e90Var, long j, rt1 rt1Var) {
        this.a = context;
        this.b = e90Var;
        this.c = j;
        this.d = rt1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        k8 k8Var = (k8) obj;
        if (!uz0.g(this.a, k8Var.a) || !uz0.g(this.b, k8Var.b)) {
            return false;
        }
        long j = k8Var.c;
        int i = kv.h;
        return r13.a(this.c, j) && this.d.equals(k8Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = kv.h;
        return this.d.hashCode() + jp1.d(this.c, iHashCode, 31);
    }
}
