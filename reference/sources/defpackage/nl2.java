package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class nl2 {
    public final vp0 a;
    public boolean c;
    public v3 h;
    public ml2 i;
    public final AtomicReference b = new AtomicReference(null);
    public final s d = new s((Object) this, (byte) 23);
    public final z61 e = new z61(this, 25);
    public final uj1 f = new uj1(new ml2[16]);
    public final Object g = new Object();
    public long j = -1;

    public nl2(vp0 vp0Var) {
        this.a = vp0Var;
    }

    public final void a() {
        synchronized (this.g) {
            uj1 uj1Var = this.f;
            Object[] objArr = uj1Var.h;
            int i = uj1Var.j;
            for (int i2 = 0; i2 < i; i2++) {
                ml2 ml2Var = (ml2) objArr[i2];
                ml2Var.e.a();
                ml2Var.f.a();
                ml2Var.l.a();
                ml2Var.m.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0072 A[Catch: all -> 0x009a, LOOP:1: B:12:0x002b->B:24:0x0072, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0007, B:5:0x000d, B:7:0x0011, B:9:0x001f, B:12:0x002b, B:14:0x003f, B:16:0x004d, B:18:0x0057, B:20:0x0067, B:26:0x0077, B:28:0x007f, B:31:0x008c, B:30:0x0084, B:24:0x0072, B:32:0x0090), top: B:38:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077 A[EDGE_INSN: B:45:0x0077->B:26:0x0077 BREAK  A[LOOP:1: B:12:0x002b->B:24:0x0072], SYNTHETIC] */
    public final void b(pf2 pf2Var) {
        int i;
        synchronized (this.g) {
            uj1 uj1Var = this.f;
            int i2 = uj1Var.j;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                Object[] objArr = uj1Var.h;
                if (i3 < i2) {
                    ml2 ml2Var = (ml2) objArr[i3];
                    bj1 bj1Var = (bj1) ml2Var.f.l(pf2Var);
                    if (bj1Var != null) {
                        Object[] objArr2 = bj1Var.b;
                        int[] iArr = bj1Var.c;
                        long[] jArr = bj1Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j = jArr[i5];
                                i = i3;
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        if ((j & 255) < 128) {
                                            int i8 = (i5 << 3) + i7;
                                            Object obj = objArr2[i8];
                                            int i9 = iArr[i8];
                                            ml2Var.c(pf2Var, obj);
                                        }
                                        j >>= 8;
                                    }
                                    if (i6 != 8) {
                                        break;
                                    }
                                    if (i5 != length) {
                                        break;
                                    }
                                    i5++;
                                    i3 = i;
                                } else if (i5 != length) {
                                    break;
                                    break;
                                } else {
                                    i5++;
                                    i3 = i;
                                }
                            }
                        } else {
                            i = i3;
                        }
                    } else {
                        i = i3;
                    }
                    if (!ml2Var.f.j()) {
                        i4++;
                    } else if (i4 > 0) {
                        Object[] objArr3 = uj1Var.h;
                        objArr3[i - i4] = objArr3[i];
                    }
                    i3 = i + 1;
                } else {
                    int i10 = i2 - i4;
                    Arrays.fill(objArr, i10, i2, (Object) null);
                    uj1Var.j = i10;
                }
            }
        }
    }

    public final boolean c() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        ez.b("Unexpected notification");
                        wg.k();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                uj1 uj1Var = this.f;
                Object[] objArr = uj1Var.h;
                int i = uj1Var.j;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((ml2) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01f8 A[Catch: all -> 0x01fe, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x01fe, blocks: (B:116:0x01f8, B:85:0x01c8), top: B:134:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01bd  */
    public final void d(Object obj, vp0 vp0Var, kp0 kp0Var) {
        Object obj2;
        ml2 ml2Var;
        ml2 ml2Var2;
        long j;
        long j2;
        ml2 ml2Var3;
        uk2 uz2Var;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        long jI = y02.i();
        synchronized (this.g) {
            uj1 uj1Var = this.f;
            Object[] objArr = uj1Var.h;
            int i2 = uj1Var.j;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((ml2) obj2).a == vp0Var) {
                    break;
                } else {
                    i3++;
                }
            }
            ml2Var = (ml2) obj2;
            if (ml2Var == null) {
                vp0Var.getClass();
                t03.k(1, vp0Var);
                ml2Var = new ml2(vp0Var);
                uj1Var.b(ml2Var);
            }
            ml2Var2 = this.i;
            j = this.j;
        }
        if (j != -1 && j != jI) {
            w12.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + jI + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            try {
                synchronized (this.g) {
                    try {
                        this.i = ml2Var;
                        this.j = jI;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                z61 z61Var = this.e;
                Object obj3 = ml2Var.b;
                bj1 bj1Var = ml2Var.c;
                int i4 = ml2Var.d;
                ml2Var.b = obj;
                ml2Var.c = (bj1) ml2Var.f.g(obj);
                if (ml2Var.d == -1) {
                    ml2Var.d = Long.hashCode(bl2.h().g());
                }
                cr0 cr0Var = ml2Var.i;
                uj1 uj1VarA = il2.a();
                try {
                    uj1VarA.b(cr0Var);
                    if (z61Var == null) {
                        kp0Var.a();
                        ml2Var3 = ml2Var;
                    } else {
                        uk2 uk2Var = (uk2) bl2.b.f();
                        if (uk2Var instanceof uz2) {
                            ml2Var3 = ml2Var;
                            if (((uz2) uk2Var).t == y02.i()) {
                                vp0 vp0Var2 = ((uz2) uk2Var).r;
                                vp0 vp0Var3 = ((uz2) uk2Var).s;
                                try {
                                    ((uz2) uk2Var).r = bl2.i(z61Var, vp0Var2, true);
                                    ((uz2) uk2Var).s = vp0Var3;
                                    kp0Var.a();
                                    ((uz2) uk2Var).r = vp0Var2;
                                    ((uz2) uk2Var).s = vp0Var3;
                                } catch (Throwable th2) {
                                    ((uz2) uk2Var).r = vp0Var2;
                                    ((uz2) uk2Var).s = vp0Var3;
                                    throw th2;
                                }
                            }
                        } else {
                            ml2Var3 = ml2Var;
                        }
                        if (uk2Var == null || (uk2Var instanceof rj1)) {
                            uz2Var = new uz2(uk2Var instanceof rj1 ? (rj1) uk2Var : null, z61Var, null, true, false);
                        } else {
                            uz2Var = uk2Var.u(z61Var);
                        }
                        try {
                            uk2 uk2VarJ = uz2Var.j();
                            try {
                                kp0Var.a();
                                uk2.q(uk2VarJ);
                                uz2Var.c();
                            } catch (Throwable th3) {
                                try {
                                    uk2.q(uk2VarJ);
                                    throw th3;
                                } catch (Throwable th4) {
                                    th = th4;
                                    try {
                                        uz2Var.c();
                                        throw th;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        uj1VarA.k(uj1VarA.j - 1);
                                        throw th;
                                    }
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                    uj1VarA.k(uj1VarA.j - 1);
                    ml2 ml2Var4 = ml2Var3;
                    Object obj4 = ml2Var4.b;
                    obj4.getClass();
                    int i5 = ml2Var4.d;
                    bj1 bj1Var2 = ml2Var4.c;
                    if (bj1Var2 != null) {
                        try {
                            long[] jArr3 = bj1Var2.a;
                            int length = jArr3.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    int i7 = length;
                                    long j5 = jArr3[i6];
                                    j3 = j;
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i8 = 8;
                                        int i9 = 8 - ((~(i6 - i7)) >>> 31);
                                        int i10 = 0;
                                        while (i10 < i9) {
                                            if ((j5 & 255) < 128) {
                                                i = i8;
                                                int i11 = (i6 << 3) + i10;
                                                jArr2 = jArr3;
                                                try {
                                                    Object obj5 = bj1Var2.b[i11];
                                                    j4 = j5;
                                                    if (bj1Var2.c[i11] != i5) {
                                                        ml2Var4.c(obj4, obj5);
                                                        bj1Var2.f(i11);
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    j2 = j3;
                                                    synchronized (this.g) {
                                                        this.i = ml2Var2;
                                                        this.j = j2;
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                jArr2 = jArr3;
                                                j4 = j5;
                                                i = i8;
                                            }
                                            j5 = j4 >> i;
                                            i10++;
                                            i8 = i;
                                            jArr3 = jArr2;
                                        }
                                        jArr = jArr3;
                                        if (i9 != i8) {
                                            break;
                                        }
                                    } else {
                                        jArr = jArr3;
                                    }
                                    length = i7;
                                    if (i6 == length) {
                                        break;
                                    }
                                    i6++;
                                    j = j3;
                                    jArr3 = jArr;
                                }
                            } else {
                                j3 = j;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            j3 = j;
                            j2 = j3;
                            synchronized (this.g) {
                                this.i = ml2Var2;
                                this.j = j2;
                                throw th;
                            }
                        }
                    } else {
                        j3 = j;
                    }
                    ml2Var4.b = obj3;
                    ml2Var4.c = bj1Var;
                    ml2Var4.d = i4;
                    synchronized (this.g) {
                        this.i = ml2Var2;
                        this.j = j3;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            } catch (Throwable th10) {
                th = th10;
                j2 = j;
            }
        } catch (Throwable th11) {
            throw th11;
        }
    }

    public final void e() {
        s sVar = this.d;
        bl2.b(bl2.a);
        synchronized (bl2.c) {
            bl2.h = dv.J0(bl2.h, sVar);
        }
        this.h = new v3(sVar);
    }
}
