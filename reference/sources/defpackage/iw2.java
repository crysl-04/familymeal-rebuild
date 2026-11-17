package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class iw2 {
    public final od a;
    public final xw2 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final e90 g;
    public final u31 h;
    public final sm0 i;
    public final long j;

    public iw2(od odVar, xw2 xw2Var, List list, int i, boolean z, int i2, e90 e90Var, u31 u31Var, sm0 sm0Var, long j) {
        this.a = odVar;
        this.b = xw2Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = e90Var;
        this.h = u31Var;
        this.i = sm0Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw2)) {
            return false;
        }
        iw2 iw2Var = (iw2) obj;
        return uz0.g(this.a, iw2Var.a) && uz0.g(this.b, iw2Var.b) && uz0.g(this.c, iw2Var.c) && this.d == iw2Var.d && this.e == iw2Var.e && this.f == iw2Var.f && uz0.g(this.g, iw2Var.g) && this.h == iw2Var.h && uz0.g(this.i, iw2Var.i) && k00.c(this.j, iw2Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + jp1.b(this.f, jp1.c((jp1.g(this.c, jp1.e(this.b, this.a.hashCode() * 31, 31), 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        int i = this.f;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 5) {
            str = "MiddleEllipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = i == 4 ? "StartEllipsis" : "Invalid";
        }
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + str + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + k00.l(this.j) + ")";
    }
}
