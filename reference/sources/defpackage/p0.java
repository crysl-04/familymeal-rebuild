package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 implements Future {
    public static final boolean k = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger l = Logger.getLogger(p0.class.getName());
    public static final ie1 m;
    public static final Object n;
    public volatile Object h;
    public volatile l0 i;
    public volatile o0 j;

    static {
        ie1 n0Var;
        try {
            n0Var = new m0(AtomicReferenceFieldUpdater.newUpdater(o0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(o0.class, o0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(p0.class, o0.class, "j"), AtomicReferenceFieldUpdater.newUpdater(p0.class, l0.class, "i"), AtomicReferenceFieldUpdater.newUpdater(p0.class, Object.class, "h"));
            th = null;
        } catch (Throwable th) {
            th = th;
            n0Var = new n0();
        }
        m = n0Var;
        if (th != null) {
            l.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        n = new Object();
    }

    public static void b(p0 p0Var) {
        o0 o0Var;
        l0 l0Var;
        do {
            o0Var = p0Var.j;
        } while (!m.i(p0Var, o0Var, o0.c));
        while (o0Var != null) {
            Thread thread = o0Var.a;
            if (thread != null) {
                o0Var.a = null;
                LockSupport.unpark(thread);
            }
            o0Var = o0Var.b;
        }
        do {
            l0Var = p0Var.i;
        } while (!m.g(p0Var, l0Var));
        l0 l0Var2 = null;
        while (l0Var != null) {
            l0 l0Var3 = l0Var.a;
            l0Var.a = l0Var2;
            l0Var2 = l0Var;
            l0Var = l0Var3;
        }
        while (l0Var2 != null) {
            l0Var2 = l0Var2.a;
            try {
                throw null;
            } catch (RuntimeException e) {
                l.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof j0) {
            CancellationException cancellationException = ((j0) obj).a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof k0) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == n) {
            return null;
        }
        return obj;
    }

    public static Object d(p0 p0Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = p0Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objD = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objD == this ? "this future" : String.valueOf(objD));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        j0 j0Var;
        Object obj = this.h;
        if (obj != null) {
            return false;
        }
        if (k) {
            j0Var = new j0(z, new CancellationException("Future.cancel() was called."));
        } else {
            j0Var = z ? j0.b : j0.c;
        }
        if (!m.h(this, obj, j0Var)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(o0 o0Var) {
        o0Var.a = null;
        while (true) {
            o0 o0Var2 = this.j;
            if (o0Var2 != o0.c) {
                o0 o0Var3 = null;
                while (o0Var2 != null) {
                    o0 o0Var4 = o0Var2.b;
                    if (o0Var2.a != null) {
                        o0Var3 = o0Var2;
                    } else if (o0Var3 != null) {
                        o0Var3.b = o0Var4;
                        if (o0Var3.a == null) {
                        }
                    } else if (m.i(this, o0Var2, o0Var4)) {
                    }
                    o0Var2 = o0Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        o0 o0Var = o0.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.h;
        if (obj != null) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            o0 o0Var2 = this.j;
            if (o0Var2 != o0Var) {
                o0 o0Var3 = new o0();
                while (true) {
                    ie1 ie1Var = m;
                    ie1Var.t(o0Var3, o0Var2);
                    if (ie1Var.i(this, o0Var2, o0Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(o0Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.h;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(o0Var3);
                        break;
                    }
                    o0Var2 = this.j;
                    if (o0Var2 == o0Var) {
                    }
                }
            }
            return c(this.h);
        }
        while (nanos > 0) {
            Object obj3 = this.h;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(wi0.h(strConcat, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.h instanceof j0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.h != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.h instanceof j0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        o0 o0Var = o0.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.h;
            if (obj2 != null) {
                return c(obj2);
            }
            o0 o0Var2 = this.j;
            if (o0Var2 != o0Var) {
                o0 o0Var3 = new o0();
                do {
                    ie1 ie1Var = m;
                    ie1Var.t(o0Var3, o0Var2);
                    if (ie1Var.i(this, o0Var2, o0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.h;
                            } else {
                                e(o0Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    o0Var2 = this.j;
                } while (o0Var2 != o0Var);
            }
            return c(this.h);
        }
        throw new InterruptedException();
    }
}
