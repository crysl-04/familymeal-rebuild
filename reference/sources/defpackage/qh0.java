package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class qh0 implements Runnable, Comparable, jb0 {
    private volatile Object _heap;
    public long h;
    public int i = -1;

    public qh0(long j) {
        this.h = j;
    }

    @Override // defpackage.jb0
    public final void a() {
        synchronized (this) {
            Object obj = this._heap;
            qf0 qf0Var = tz0.S;
            if (obj == qf0Var) {
                return;
            }
            rh0 rh0Var = obj instanceof rh0 ? (rh0) obj : null;
            if (rh0Var != null) {
                synchronized (rh0Var) {
                    Object obj2 = this._heap;
                    if ((obj2 instanceof ix2 ? (ix2) obj2 : null) != null) {
                        rh0Var.c(this.i);
                    }
                }
            }
            this._heap = qf0Var;
        }
    }

    public final int b(long j, rh0 rh0Var, sh0 sh0Var) {
        synchronized (this) {
            if (this._heap == tz0.S) {
                return 2;
            }
            synchronized (rh0Var) {
                qh0[] qh0VarArr = rh0Var.a;
                qh0 qh0Var = qh0VarArr != null ? qh0VarArr[0] : null;
                int i = sh0.q;
                if (hi.a.getIntVolatile(sh0Var, sh0.o) != 0) {
                    return 1;
                }
                if (qh0Var == null) {
                    rh0Var.c = j;
                } else {
                    long j2 = qh0Var.h;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    long j3 = rh0Var.c;
                    if (j - j3 > 0) {
                        rh0Var.c = j;
                    } else {
                        j = j3;
                    }
                }
                if (this.h - j < 0) {
                    this.h = j;
                }
                rh0Var.a(this);
                return 0;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.h - ((qh0) obj).h;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(rh0 rh0Var) {
        if (this._heap != tz0.S) {
            this._heap = rh0Var;
        } else {
            wg.m("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.h + ']';
    }
}
