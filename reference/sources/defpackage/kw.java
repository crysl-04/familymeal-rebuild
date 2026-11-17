package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class kw {
    public final Object a;
    public final nq b;
    public final aq0 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ kw(Object obj, nq nqVar, aq0 aq0Var, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : nqVar, (i & 4) != 0 ? null : aq0Var, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }

    public static kw a(kw kwVar, nq nqVar, CancellationException cancellationException, int i) {
        Object obj = kwVar.a;
        if ((i & 2) != 0) {
            nqVar = kwVar.b;
        }
        nq nqVar2 = nqVar;
        aq0 aq0Var = kwVar.c;
        Object obj2 = kwVar.d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = kwVar.e;
        }
        return new kw(obj, nqVar2, aq0Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw)) {
            return false;
        }
        kw kwVar = (kw) obj;
        return uz0.g(this.a, kwVar.a) && uz0.g(this.b, kwVar.b) && uz0.g(this.c, kwVar.c) && uz0.g(this.d, kwVar.d) && uz0.g(this.e, kwVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        nq nqVar = this.b;
        int iHashCode2 = (iHashCode + (nqVar == null ? 0 : nqVar.hashCode())) * 31;
        aq0 aq0Var = this.c;
        int iHashCode3 = (iHashCode2 + (aq0Var == null ? 0 : aq0Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public kw(Object obj, nq nqVar, aq0 aq0Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = nqVar;
        this.c = aq0Var;
        this.d = obj2;
        this.e = th;
    }
}
