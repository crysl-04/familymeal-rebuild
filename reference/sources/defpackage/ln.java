package defpackage;

import android.graphics.BlendModeColorFilter;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ln {
    public final BlendModeColorFilter a;
    public final long b;
    public final int c;

    public ln(int i, long j) {
        this.a = new BlendModeColorFilter(cu.c0(j), ia2.w(i));
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln)) {
            return false;
        }
        ln lnVar = (ln) obj;
        long j = lnVar.b;
        int i = kv.h;
        return r13.a(this.b, j) && this.c == lnVar.c;
    }

    public final int hashCode() {
        int i = kv.h;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return jp1.k("BlendModeColorFilter(color=", kv.h(this.b), ", blendMode=", aa3.J(this.c), ")");
    }
}
