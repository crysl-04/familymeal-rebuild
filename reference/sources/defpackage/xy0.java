package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.LockSupport;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xy0 implements Consumer {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Serializable j;
    public final /* synthetic */ Serializable k;

    public /* synthetic */ xy0(Object obj, Serializable serializable, Serializable serializable2, byte b) {
        this.h = b;
        this.i = obj;
        this.j = serializable;
        this.k = serializable2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a7 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:20:0x006c, B:22:0x0072, B:24:0x0076, B:26:0x0082, B:28:0x008a, B:29:0x008f, B:31:0x0097, B:33:0x00a3, B:35:0x00a7, B:56:0x0129, B:38:0x00bb, B:40:0x00c2, B:41:0x00c5, B:43:0x00d1, B:44:0x00dc, B:45:0x00e8, B:47:0x00ed, B:49:0x00f6, B:51:0x00fd, B:53:0x0106, B:54:0x010b, B:55:0x0119, B:57:0x012c, B:59:0x0133, B:61:0x013b), top: B:68:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:20:0x006c, B:22:0x0072, B:24:0x0076, B:26:0x0082, B:28:0x008a, B:29:0x008f, B:31:0x0097, B:33:0x00a3, B:35:0x00a7, B:56:0x0129, B:38:0x00bb, B:40:0x00c2, B:41:0x00c5, B:43:0x00d1, B:44:0x00dc, B:45:0x00e8, B:47:0x00ed, B:49:0x00f6, B:51:0x00fd, B:53:0x0106, B:54:0x010b, B:55:0x0119, B:57:0x012c, B:59:0x0133, B:61:0x013b), top: B:68:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:20:0x006c, B:22:0x0072, B:24:0x0076, B:26:0x0082, B:28:0x008a, B:29:0x008f, B:31:0x0097, B:33:0x00a3, B:35:0x00a7, B:56:0x0129, B:38:0x00bb, B:40:0x00c2, B:41:0x00c5, B:43:0x00d1, B:44:0x00dc, B:45:0x00e8, B:47:0x00ed, B:49:0x00f6, B:51:0x00fd, B:53:0x0106, B:54:0x010b, B:55:0x0119, B:57:0x012c, B:59:0x0133, B:61:0x013b), top: B:68:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:20:0x006c, B:22:0x0072, B:24:0x0076, B:26:0x0082, B:28:0x008a, B:29:0x008f, B:31:0x0097, B:33:0x00a3, B:35:0x00a7, B:56:0x0129, B:38:0x00bb, B:40:0x00c2, B:41:0x00c5, B:43:0x00d1, B:44:0x00dc, B:45:0x00e8, B:47:0x00ed, B:49:0x00f6, B:51:0x00fd, B:53:0x0106, B:54:0x010b, B:55:0x0119, B:57:0x012c, B:59:0x0133, B:61:0x013b), top: B:68:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:20:0x006c, B:22:0x0072, B:24:0x0076, B:26:0x0082, B:28:0x008a, B:29:0x008f, B:31:0x0097, B:33:0x00a3, B:35:0x00a7, B:56:0x0129, B:38:0x00bb, B:40:0x00c2, B:41:0x00c5, B:43:0x00d1, B:44:0x00dc, B:45:0x00e8, B:47:0x00ed, B:49:0x00f6, B:51:0x00fd, B:53:0x0106, B:54:0x010b, B:55:0x0119, B:57:0x012c, B:59:0x0133, B:61:0x013b), top: B:68:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:20:0x006c, B:22:0x0072, B:24:0x0076, B:26:0x0082, B:28:0x008a, B:29:0x008f, B:31:0x0097, B:33:0x00a3, B:35:0x00a7, B:56:0x0129, B:38:0x00bb, B:40:0x00c2, B:41:0x00c5, B:43:0x00d1, B:44:0x00dc, B:45:0x00e8, B:47:0x00ed, B:49:0x00f6, B:51:0x00fd, B:53:0x0106, B:54:0x010b, B:55:0x0119, B:57:0x012c, B:59:0x0133, B:61:0x013b), top: B:68:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:20:0x006c, B:22:0x0072, B:24:0x0076, B:26:0x0082, B:28:0x008a, B:29:0x008f, B:31:0x0097, B:33:0x00a3, B:35:0x00a7, B:56:0x0129, B:38:0x00bb, B:40:0x00c2, B:41:0x00c5, B:43:0x00d1, B:44:0x00dc, B:45:0x00e8, B:47:0x00ed, B:49:0x00f6, B:51:0x00fd, B:53:0x0106, B:54:0x010b, B:55:0x0119, B:57:0x012c, B:59:0x0133, B:61:0x013b), top: B:68:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f6 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:20:0x006c, B:22:0x0072, B:24:0x0076, B:26:0x0082, B:28:0x008a, B:29:0x008f, B:31:0x0097, B:33:0x00a3, B:35:0x00a7, B:56:0x0129, B:38:0x00bb, B:40:0x00c2, B:41:0x00c5, B:43:0x00d1, B:44:0x00dc, B:45:0x00e8, B:47:0x00ed, B:49:0x00f6, B:51:0x00fd, B:53:0x0106, B:54:0x010b, B:55:0x0119, B:57:0x012c, B:59:0x0133, B:61:0x013b), top: B:68:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:20:0x006c, B:22:0x0072, B:24:0x0076, B:26:0x0082, B:28:0x008a, B:29:0x008f, B:31:0x0097, B:33:0x00a3, B:35:0x00a7, B:56:0x0129, B:38:0x00bb, B:40:0x00c2, B:41:0x00c5, B:43:0x00d1, B:44:0x00dc, B:45:0x00e8, B:47:0x00ed, B:49:0x00f6, B:51:0x00fd, B:53:0x0106, B:54:0x010b, B:55:0x0119, B:57:0x012c, B:59:0x0133, B:61:0x013b), top: B:68:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0133 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:20:0x006c, B:22:0x0072, B:24:0x0076, B:26:0x0082, B:28:0x008a, B:29:0x008f, B:31:0x0097, B:33:0x00a3, B:35:0x00a7, B:56:0x0129, B:38:0x00bb, B:40:0x00c2, B:41:0x00c5, B:43:0x00d1, B:44:0x00dc, B:45:0x00e8, B:47:0x00ed, B:49:0x00f6, B:51:0x00fd, B:53:0x0106, B:54:0x010b, B:55:0x0119, B:57:0x012c, B:59:0x0133, B:61:0x013b), top: B:68:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:74:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x010b A[SYNTHETIC] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object objPoll;
        un1 un1Var;
        ii0 ii0Var;
        ng1 ng1Var;
        int i;
        int i2;
        BigDecimal bigDecimalValueOf;
        BigDecimal bigDecimalValueOf2;
        int i3;
        switch (this.h) {
            case 0:
                zy0 zy0Var = (zy0) this.i;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.j;
                boolean zM = atomicBoolean.get();
                oi1 oi1Var = (oi1) ((ConcurrentHashMap) this.k).computeIfAbsent((Comparator) obj, new yy0(zy0Var.i, (byte) 0));
                zy0Var.a.getClass();
                zy0Var.l();
                Thread threadCurrentThread = Thread.currentThread();
                Double dValueOf = Double.valueOf(zy0Var.p == 2 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
                while (zM) {
                    try {
                        if (!atomicBoolean.get() || zy0Var.n || (((ConcurrentHashMap.KeySetView) zy0Var.i.i).isEmpty() && zy0Var.h.isEmpty())) {
                            zy0Var.h.remove(threadCurrentThread);
                            return;
                        }
                        zy0Var.h.put(threadCurrentThread, dValueOf);
                        do {
                            objPoll = oi1Var.a.poll();
                            if (objPoll != null) {
                            }
                            un1Var = (un1) objPoll;
                            if (un1Var != null) {
                                zy0Var.h.put(threadCurrentThread, Double.valueOf(un1Var.k));
                                if (!zy0Var.j()) {
                                    zM = false;
                                } else if (zy0Var.q()) {
                                    zy0Var.n = true;
                                } else if (zy0Var.q.e(zy0Var.f, un1Var.k)) {
                                    ii0Var = new ii0(zy0Var.k, true, false);
                                    ii0Var.k = true;
                                    ng1Var = zy0Var.q;
                                    for (i = 0; i < ng1Var.b.length; i++) {
                                        i2 = un1Var.o[i];
                                        bigDecimalValueOf = null;
                                        if (i2 != Integer.MIN_VALUE) {
                                            bigDecimalValueOf2 = BigDecimal.valueOf(i2);
                                        } else {
                                            bigDecimalValueOf2 = null;
                                        }
                                        i3 = un1Var.q[i];
                                        if (i3 != Integer.MAX_VALUE) {
                                            bigDecimalValueOf = BigDecimal.valueOf(i3);
                                        }
                                        un1.k(ii0Var.k(ng1Var.b[i]), bigDecimalValueOf2, bigDecimalValueOf);
                                    }
                                    ii0Var.i = zy0Var.p;
                                    zM &= zy0Var.m(un1Var, new do1(ii0Var), zy0Var.q);
                                } else {
                                    ((LongAdder) zy0Var.m.i).increment();
                                    zM = true;
                                }
                                un1Var.e();
                            }
                            zy0Var.h.remove(threadCurrentThread);
                            if (un1Var == null) {
                                LockSupport.parkNanos(50000L);
                            }
                            if (!zM) {
                                atomicBoolean.set(zM);
                            }
                        } while (!((ConcurrentHashMap.KeySetView) oi1Var.b.i).remove(objPoll));
                        un1Var = (un1) objPoll;
                        if (un1Var != null) {
                            zy0Var.h.put(threadCurrentThread, Double.valueOf(un1Var.k));
                            if (!zy0Var.j()) {
                                zM = false;
                            } else if (zy0Var.q()) {
                                zy0Var.n = true;
                            } else if (zy0Var.q.e(zy0Var.f, un1Var.k)) {
                                ((LongAdder) zy0Var.m.i).increment();
                                zM = true;
                            } else {
                                ii0Var = new ii0(zy0Var.k, true, false);
                                ii0Var.k = true;
                                ng1Var = zy0Var.q;
                                while (i < ng1Var.b.length) {
                                    i2 = un1Var.o[i];
                                    bigDecimalValueOf = null;
                                    if (i2 != Integer.MIN_VALUE) {
                                        bigDecimalValueOf2 = BigDecimal.valueOf(i2);
                                    } else {
                                        bigDecimalValueOf2 = null;
                                    }
                                    i3 = un1Var.q[i];
                                    if (i3 != Integer.MAX_VALUE) {
                                        bigDecimalValueOf = BigDecimal.valueOf(i3);
                                    }
                                    un1.k(ii0Var.k(ng1Var.b[i]), bigDecimalValueOf2, bigDecimalValueOf);
                                }
                                ii0Var.i = zy0Var.p;
                                zM &= zy0Var.m(un1Var, new do1(ii0Var), zy0Var.q);
                            }
                            un1Var.e();
                        }
                        zy0Var.h.remove(threadCurrentThread);
                        if (un1Var == null) {
                            LockSupport.parkNanos(50000L);
                        }
                        if (!zM) {
                            atomicBoolean.set(zM);
                        }
                    } catch (Throwable th) {
                        zy0Var.h.remove(threadCurrentThread);
                        throw th;
                    }
                }
                zy0Var.h.remove(threadCurrentThread);
                return;
            default:
                ArrayList arrayList = (ArrayList) this.i;
                ArrayList arrayList2 = (ArrayList) this.j;
                ArrayList arrayList3 = (ArrayList) this.k;
                zh0 zh0Var = (zh0) obj;
                if (zh0Var.p()) {
                    arrayList.add(zh0Var);
                    return;
                }
                if (zh0Var.r()) {
                    arrayList2.add(zh0Var);
                }
                if (zh0Var.u()) {
                    arrayList3.add(zh0Var);
                    return;
                }
                return;
        }
    }
}
