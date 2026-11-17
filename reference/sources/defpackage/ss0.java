package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ss0 extends q20 implements h80 {
    public final Handler j;
    public final String k;
    public final boolean l;
    public final ss0 m;

    public ss0(Handler handler, String str, boolean z) {
        this.j = handler;
        this.k = str;
        this.l = z;
        this.m = z ? this : new ss0(handler, str, true);
    }

    @Override // defpackage.h80
    public final void c(long j, rq rqVar) {
        z2 z2Var = new z2(rqVar, this, (byte) 4, false);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.j.postDelayed(z2Var, j)) {
            rqVar.w(new g(this, z2Var, (byte) 13));
        } else {
            j(rqVar.l, z2Var);
        }
    }

    @Override // defpackage.h80
    public final jb0 d(long j, final Runnable runnable, o20 o20Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.j.postDelayed(runnable, j)) {
            return new jb0() { // from class: rs0
                @Override // defpackage.jb0
                public final void a() {
                    this.h.j.removeCallbacks(runnable);
                }
            };
        }
        j(o20Var, runnable);
        return fo1.h;
    }

    @Override // defpackage.q20
    public final void e(o20 o20Var, Runnable runnable) {
        if (this.j.post(runnable)) {
            return;
        }
        j(o20Var, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ss0)) {
            return false;
        }
        ss0 ss0Var = (ss0) obj;
        return ss0Var.j == this.j && ss0Var.l == this.l;
    }

    @Override // defpackage.q20
    public final boolean f(o20 o20Var) {
        return (this.l && uz0.g(Looper.myLooper(), this.j.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.j) ^ (this.l ? 1231 : 1237);
    }

    public final void j(o20 o20Var, Runnable runnable) {
        ys.m(o20Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        r70 r70Var = ya0.a;
        j70.j.e(o20Var, runnable);
    }

    @Override // defpackage.q20
    public final String toString() {
        ss0 ss0Var;
        String str;
        r70 r70Var = ya0.a;
        ss0 ss0Var2 = pd1.a;
        if (this == ss0Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                ss0Var = ss0Var2.m;
            } catch (UnsupportedOperationException unused) {
                ss0Var = null;
            }
            str = this == ss0Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.k;
        if (string == null) {
            string = this.j.toString();
        }
        if (!this.l) {
            return string;
        }
        return string + ".immediate";
    }

    public ss0(Handler handler) {
        this(handler, null, false);
    }
}
