package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class dl {
    public final long h;
    public final int i;

    public dl(int i, long j) {
        this.h = j;
        this.i = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl)) {
            return false;
        }
        dl dlVar = (dl) obj;
        return this.h == dlVar.h && this.i == dlVar.i;
    }

    public int hashCode() {
        long j = this.h;
        return ((((int) (j ^ (j >>> 32))) + 31) * 31) + this.i;
    }

    public String toString() {
        double d;
        String string;
        long j = this.h;
        double d2 = j / 1024.0d;
        int i = 1;
        while (true) {
            d = 10.0d * d2;
            if (Math.round(d) < 10240) {
                break;
            }
            i++;
            d2 /= 1024.0d;
        }
        long jRound = Math.round(d);
        long j2 = jRound % 10;
        if (j2 == 0) {
            string = Long.toString(jRound / 10);
        } else {
            String str = jRound < 0 ? "-" : "";
            string = str + Math.abs(jRound / 10) + "." + Math.abs(j2);
        }
        int i2 = this.i;
        if (i == 1) {
            return string + "kB/" + i2 + (i2 == 1 ? "thread" : "threads");
        }
        if (i == 2) {
            return string + "MB/" + i2 + (i2 == 1 ? "thread" : "threads");
        }
        if (i != 3) {
            return j + "bytes/" + i2 + (i2 == 1 ? "thread" : "threads");
        }
        return string + "GB/" + i2 + (i2 == 1 ? "thread" : "threads");
    }
}
