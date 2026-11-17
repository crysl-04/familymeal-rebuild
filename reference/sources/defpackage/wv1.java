package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wv1 {
    public final oz a;
    public final jz b;
    public final dr0 c;
    public final zp0 d;
    public final boolean e;
    public final b23 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(yv1.j);
    public long i = y02.i();
    public nj1 j;
    public final g82 k;
    public final m72 l;

    public wv1(oz ozVar, jz jzVar, dr0 dr0Var, pj1 pj1Var, zp0 zp0Var, boolean z, b23 b23Var, Object obj) {
        this.a = ozVar;
        this.b = jzVar;
        this.c = dr0Var;
        this.d = zp0Var;
        this.e = z;
        this.f = b23Var;
        this.g = obj;
        nj1 nj1Var = cd2.a;
        nj1Var.getClass();
        this.j = nj1Var;
        g82 g82Var = new g82();
        g82Var.g(pj1Var, dr0Var.y());
        this.k = g82Var;
        this.l = new m72(b23Var.j);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((yv1) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    yv1 yv1Var = yv1.m;
                    yv1 yv1Var2 = yv1.n;
                    while (!atomicReference.compareAndSet(yv1Var, yv1Var2)) {
                        if (atomicReference.get() != yv1Var) {
                            w12.b("Unexpected state change from: " + yv1Var + " to: " + yv1Var2 + ".");
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new a42((byte) 4);
            }
        } catch (Exception e) {
            atomicReference.set(yv1.h);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.a(this.f, this.k);
                    this.k.c();
                    this.k.d();
                    this.k.b();
                    this.a.x = null;
                } catch (Throwable th) {
                    this.k.b();
                    this.a.x = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean c() {
        return ((yv1) this.h.get()).compareTo(yv1.m) >= 0;
    }

    public final void d() {
        AtomicReference atomicReference;
        yv1 yv1Var;
        yv1 yv1Var2;
        do {
            atomicReference = this.h;
            yv1Var = yv1.k;
            yv1Var2 = yv1.m;
            if (atomicReference.compareAndSet(yv1Var, yv1Var2)) {
                return;
            }
        } while (atomicReference.get() == yv1Var);
        w12.b("Unexpected state change from: " + yv1Var + " to: " + yv1Var2 + ".");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x007f A[Catch: Exception -> 0x014b, TryCatch #0 {Exception -> 0x014b, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0023, B:8:0x0024, B:9:0x002b, B:10:0x002c, B:11:0x0033, B:12:0x0034, B:13:0x003f, B:14:0x0040, B:16:0x0046, B:18:0x004c, B:19:0x0067, B:21:0x0077, B:22:0x0079, B:24:0x007f, B:26:0x0085, B:27:0x00a0, B:29:0x00a8, B:31:0x00ae, B:32:0x00b0, B:34:0x00b6, B:36:0x00bc, B:37:0x00d7, B:40:0x00df, B:43:0x00ee, B:45:0x00f2, B:48:0x00fb, B:47:0x00f6, B:49:0x0100, B:50:0x0102, B:52:0x0108, B:54:0x010e, B:55:0x0129, B:57:0x0131, B:61:0x013a, B:62:0x013b, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:41:0x00e4, B:20:0x0069), top: B:69:0x0004, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a8 A[Catch: Exception -> 0x014b, TryCatch #0 {Exception -> 0x014b, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0023, B:8:0x0024, B:9:0x002b, B:10:0x002c, B:11:0x0033, B:12:0x0034, B:13:0x003f, B:14:0x0040, B:16:0x0046, B:18:0x004c, B:19:0x0067, B:21:0x0077, B:22:0x0079, B:24:0x007f, B:26:0x0085, B:27:0x00a0, B:29:0x00a8, B:31:0x00ae, B:32:0x00b0, B:34:0x00b6, B:36:0x00bc, B:37:0x00d7, B:40:0x00df, B:43:0x00ee, B:45:0x00f2, B:48:0x00fb, B:47:0x00f6, B:49:0x0100, B:50:0x0102, B:52:0x0108, B:54:0x010e, B:55:0x0129, B:57:0x0131, B:61:0x013a, B:62:0x013b, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:41:0x00e4, B:20:0x0069), top: B:69:0x0004, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0131 A[Catch: Exception -> 0x014b, TRY_LEAVE, TryCatch #0 {Exception -> 0x014b, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0023, B:8:0x0024, B:9:0x002b, B:10:0x002c, B:11:0x0033, B:12:0x0034, B:13:0x003f, B:14:0x0040, B:16:0x0046, B:18:0x004c, B:19:0x0067, B:21:0x0077, B:22:0x0079, B:24:0x007f, B:26:0x0085, B:27:0x00a0, B:29:0x00a8, B:31:0x00ae, B:32:0x00b0, B:34:0x00b6, B:36:0x00bc, B:37:0x00d7, B:40:0x00df, B:43:0x00ee, B:45:0x00f2, B:48:0x00fb, B:47:0x00f6, B:49:0x0100, B:50:0x0102, B:52:0x0108, B:54:0x010e, B:55:0x0129, B:57:0x0131, B:61:0x013a, B:62:0x013b, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:41:0x00e4, B:20:0x0069), top: B:69:0x0004, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[LOOP:1: B:22:0x0079->B:79:?, LOOP_END, SYNTHETIC] */
    public final boolean e(zi2 zi2Var) throws Exception {
        long j;
        yv1 yv1Var = yv1.l;
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((yv1) atomicReference.get()).ordinal();
            yv1 yv1Var2 = yv1.k;
            oz ozVar = this.a;
            jz jzVar = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    dr0 dr0Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        dr0Var.z = 0;
                        dr0Var.y = true;
                    }
                    this.j = jzVar.b(ozVar, zi2Var, this.d);
                    if (z) {
                        if (dr0Var.F || dr0Var.z != 0) {
                            w12.a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        dr0Var.z = -1;
                        dr0Var.y = false;
                    }
                    yv1 yv1Var3 = yv1.j;
                    while (!atomicReference.compareAndSet(yv1Var3, yv1Var2)) {
                        if (atomicReference.get() != yv1Var3) {
                            w12.b("Unexpected state change from: " + yv1Var3 + " to: " + yv1Var2 + ".");
                            if (this.j.g()) {
                                d();
                            }
                            return c();
                        }
                    }
                    if (this.j.g()) {
                        d();
                    }
                    return c();
                case 3:
                    try {
                        while (!atomicReference.compareAndSet(yv1Var2, yv1Var)) {
                            if (atomicReference.get() != yv1Var2) {
                                w12.b("Unexpected state change from: " + yv1Var2 + " to: " + yv1Var + ".");
                                j = this.i;
                                this.i = y02.i();
                                this.j = jzVar.n(ozVar, zi2Var, this.j);
                                this.i = j;
                                while (!atomicReference.compareAndSet(yv1Var, yv1Var2)) {
                                    if (atomicReference.get() != yv1Var) {
                                        w12.b("Unexpected state change from: " + yv1Var + " to: " + yv1Var2 + ".");
                                        if (this.j.g()) {
                                            d();
                                        }
                                        return c();
                                    }
                                }
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        this.i = y02.i();
                        this.j = jzVar.n(ozVar, zi2Var, this.j);
                        this.i = j;
                        while (!atomicReference.compareAndSet(yv1Var, yv1Var2)) {
                            if (atomicReference.get() != yv1Var) {
                                w12.b("Unexpected state change from: " + yv1Var + " to: " + yv1Var2 + ".");
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        while (!atomicReference.compareAndSet(yv1Var, yv1Var2)) {
                            if (atomicReference.get() != yv1Var) {
                                w12.b("Unexpected state change from: " + yv1Var + " to: " + yv1Var2 + ".");
                                throw th;
                            }
                        }
                        throw th;
                    }
                    j = this.i;
                case 4:
                    ez.b("Recursive call to resume()");
                    throw new a42((byte) 3);
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new a42((byte) 4);
            }
        } catch (Exception e) {
            atomicReference.set(yv1.h);
            throw e;
        }
    }
}
