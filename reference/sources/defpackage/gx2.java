package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class gx2 implements n20 {
    public final ThreadLocal h;

    public gx2(ThreadLocal threadLocal) {
        this.h = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx2) && uz0.g(this.h, ((gx2) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.h + ')';
    }
}
