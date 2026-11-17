package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z83 {
    public final ao a;
    public final float b;

    public z83(Rect rect, float f) {
        this.a = new ao(rect);
        this.b = f;
    }

    public final Rect a() {
        ao aoVar = this.a;
        aoVar.getClass();
        return new Rect(aoVar.a, aoVar.b, aoVar.c, aoVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!z83.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        z83 z83Var = (z83) obj;
        return uz0.g(this.a, z83Var.a) && this.b == z83Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public z83(ao aoVar, float f) {
        this.a = aoVar;
        this.b = f;
    }
}
