package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class yq0 {
    public final /* synthetic */ byte a = 0;
    public int b;
    public int c;
    public int d;
    public Object e;

    public yq0(int i, int i2, int i3, jw2 jw2Var) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = jw2Var;
    }

    public final ag2 a(int i) {
        return new ag2(i, m02.m((jw2) this.e, i));
    }

    public final int b() {
        return this.d - this.c;
    }

    public final int c(int i) {
        return ((bs1) this.e).j[this.c + i];
    }

    public final Object d(int i) {
        return ((bs1) this.e).l[this.d + i];
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "";
            case 1:
            default:
                return super.toString();
            case 2:
                int i = this.b;
                jw2 jw2Var = (jw2) this.e;
                u82 u82VarM = m02.m(jw2Var, i);
                int i2 = this.c;
                return "SelectionInfo(id=1, range=(" + i + "-" + u82VarM + "," + i2 + "-" + m02.m(jw2Var, i2) + "), prevOffset=" + this.d + ")";
        }
    }

    public yq0(bs1 bs1Var) {
        this.e = bs1Var;
    }

    public /* synthetic */ yq0() {
    }
}
