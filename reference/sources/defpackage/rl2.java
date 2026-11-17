package defpackage;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rl2 extends zo {
    public final long a;

    public rl2(long j) {
        this.a = j;
    }

    @Override // defpackage.zo
    public final void a(float f, long j, e9 e9Var) {
        e9Var.c(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = kv.b(kv.c(jB) * f, jB);
        }
        e9Var.e(jB);
        if (((Shader) e9Var.c) != null) {
            e9Var.h(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl2)) {
            return false;
        }
        long j = ((rl2) obj).a;
        int i = kv.h;
        return r13.a(this.a, j);
    }

    public final int hashCode() {
        int i = kv.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wi0.h("SolidColor(value=", kv.h(this.a), ")");
    }
}
