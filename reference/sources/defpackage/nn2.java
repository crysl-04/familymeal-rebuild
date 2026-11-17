package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nn2 extends u0 implements pk0, lq0, ln2, qj1 {
    public static final /* synthetic */ long m = hi.a.objectFieldOffset(nn2.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int l;

    public nn2(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00db A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:14:0x0034, B:28:0x0073, B:30:0x007d, B:32:0x0083, B:33:0x0087, B:35:0x008a, B:44:0x00aa, B:46:0x00b9, B:47:0x00d5, B:49:0x00db, B:51:0x00e1, B:52:0x00e4, B:37:0x0090, B:41:0x0097, B:57:0x00ee, B:58:0x00f3, B:19:0x0048), top: B:65:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[LOOP:0: B:47:0x00d5->B:71:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [v0] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [on2] */
    /* JADX WARN: Type inference failed for: r1v6, types: [on2] */
    /* JADX WARN: Type inference failed for: r1v7, types: [on2] */
    /* JADX WARN: Type inference failed for: r1v9, types: [on2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [u0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b7 -> B:27:0x0071). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // defpackage.pk0
    public final java.lang.Object a(defpackage.qk0 r14, defpackage.m10 r15) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn2.a(qk0, m10):java.lang.Object");
    }

    @Override // defpackage.lq0
    public final pk0 b(o20 o20Var, int i, dp dpVar) {
        return (((i < 0 || i >= 2) && i != -2) || dpVar != dp.i) ? tz0.s(this, o20Var, i, dpVar) : this;
    }

    @Override // defpackage.u0
    public final v0 d() {
        return new on2();
    }

    @Override // defpackage.u0
    public final v0[] e() {
        return new on2[2];
    }

    @Override // defpackage.ln2
    public final Object getValue() {
        qf0 qf0Var = s60.r0;
        Object objectVolatile = hi.a.getObjectVolatile(this, m);
        if (objectVolatile == qf0Var) {
            return null;
        }
        return objectVolatile;
    }

    public final void h(Object obj) {
        if (obj == null) {
            obj = s60.r0;
        }
        i(null, obj);
    }

    public final boolean i(Object obj, Object obj2) {
        int i;
        v0[] v0VarArr;
        qf0 qf0Var;
        synchronized (this) {
            Unsafe unsafe = hi.a;
            long j = m;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !uz0.g(objectVolatile, obj)) {
                return false;
            }
            if (uz0.g(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.l;
            if ((i2 & 1) != 0) {
                this.l = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.l = i3;
            v0[] v0VarArr2 = this.h;
            while (true) {
                on2[] on2VarArr = (on2[]) v0VarArr2;
                if (on2VarArr != null) {
                    for (on2 on2Var : on2VarArr) {
                        if (on2Var != null) {
                            AtomicReference atomicReference = on2Var.a;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 == null || obj3 == (qf0Var = h7.X)) {
                                    break;
                                }
                                qf0 qf0Var2 = h7.W;
                                if (obj3 != qf0Var2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj3, qf0Var2)) {
                                            ((rq) obj3).g(j23.a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj3);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj3, qf0Var)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj3);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.l;
                    if (i == i3) {
                        this.l = i3 + 1;
                        return true;
                    }
                    v0VarArr = this.h;
                }
                v0VarArr2 = v0VarArr;
                i3 = i;
            }
        }
    }

    @Override // defpackage.qk0
    public final Object m(Object obj, m10 m10Var) {
        h(obj);
        return j23.a;
    }
}
