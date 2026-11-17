package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vn0 implements Comparable {
    public final int h;
    public final int i;
    public final String j;
    public final String k;

    public vn0(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.h = i;
        this.i = i2;
        this.j = str;
        this.k = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        vn0 vn0Var = (vn0) obj;
        vn0Var.getClass();
        int i = this.h - vn0Var.h;
        return i == 0 ? this.i - vn0Var.i : i;
    }
}
