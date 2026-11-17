package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.system.Os;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public class g2 implements vf1, kf1, o12, xp1, sg, qp1, fy1, h92, ci1 {
    public final /* synthetic */ byte h;
    public Object i;

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[PHI: r12
  0x0028: PHI (r12v7 int) = (r12v6 int), (r12v8 int) binds: [B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    public g2(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int i2 = 3;
        this.h = (byte) 3;
        int length = fArr.length - 1;
        tg[][] tgVarArr = new tg[length][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr[i5];
            if (i6 == 0) {
                i = i2;
            } else if (i6 == 1) {
                i3 = 1;
                i = i3;
            } else {
                if (i6 != 2) {
                    if (i6 != i2) {
                        int i7 = 4;
                        if (i6 != 4) {
                            i7 = 5;
                            if (i6 != 5) {
                                i = i4;
                            } else {
                                i = i7;
                            }
                        } else {
                            i = i7;
                        }
                    } else {
                        if (i3 != 1) {
                            i3 = 1;
                        }
                        i = i3;
                    }
                }
                i3 = 2;
                i = i3;
            }
            float[] fArr3 = fArr2[i5];
            int i8 = i5 + 1;
            float[] fArr4 = fArr2[i8];
            float f = fArr[i5];
            float f2 = fArr[i8];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            tg[] tgVarArr2 = new tg[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = i9 << 1;
                int i11 = i9;
                int i12 = i10 + 1;
                tgVarArr2[i11] = new tg(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                i9 = i11 + 1;
            }
            tgVarArr[i5] = tgVarArr2;
            i5 = i8;
            i4 = i;
            i2 = 3;
        }
        this.i = tgVarArr;
    }

    public final void A() {
        ((jz) this.i).getClass();
    }

    public final void B(byte b) {
        ((Parcel) this.i).writeByte(b);
    }

    public final void C(float f) {
        ((Parcel) this.i).writeFloat(f);
    }

    public final void D(long j) {
        long jB = ax2.b(j);
        byte b = 0;
        if (!bx2.a(jB, 0L)) {
            if (bx2.a(jB, 4294967296L)) {
                b = 1;
            } else if (bx2.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        B(b);
        if (bx2.a(ax2.b(j), 0L)) {
            return;
        }
        C(ax2.c(j));
    }

    public e2 E(int i) {
        return null;
    }

    public final kn2 F() {
        if0 if0VarA = if0.a();
        if (if0VarA.c() == 1) {
            return new ou0(true);
        }
        lu1 lu1VarX = rz1.x(Boolean.FALSE);
        h70 h70Var = new h70(lu1VarX, this);
        if0VarA.a.writeLock().lock();
        try {
            if (if0VarA.c == 1 || if0VarA.c == 2) {
                if0VarA.d.post(new gf0(Arrays.asList(h70Var), if0VarA.c, null));
            } else {
                if0VarA.b.add(h70Var);
            }
            return lu1VarX;
        } finally {
            if0VarA.a.writeLock().unlock();
        }
    }

    public final void G(float f, float f2, float f3, float f4) {
        eg egVar = (eg) this.i;
        wq wqVarG = egVar.g();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (egVar.q() >> 32)) - (f3 + f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (egVar.q() & 4294967295L)) - (f4 + f2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) < 0.0f) {
            zw0.a("Width and height must be greater than or equal to zero");
        }
        egVar.H(jFloatToRawIntBits);
        wqVarG.g(f, f2);
    }

    @Override // defpackage.ni0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final or0 q(int i, int i2) {
        uc2 uc2Var = ((gh) this.i).k;
        vc2[] vc2VarArr = (vc2[]) uc2Var.j(i * i2);
        Arrays.fill(vc2VarArr, uc2Var.k());
        return new or0(this, i, i2, vc2VarArr);
    }

    public final void I() {
        ((lo0) this.i).o.Q();
    }

    public boolean J(int i, int i2, Bundle bundle) {
        return false;
    }

    public final boolean K(l41 l41Var) {
        if (!l41Var.I()) {
            ax0.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((vl2) this.i).remove(l41Var);
    }

    public final void L(float f, long j) {
        wq wqVarG = ((eg) this.i).g();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        wqVarG.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        wqVarG.c(f);
        wqVarG.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public final void M(float f, float f2, long j) {
        wq wqVarG = ((eg) this.i).g();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        wqVarG.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        wqVarG.b(f, f2);
        wqVarG.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public final ArrayList N(int i) {
        ArrayList arrayList = new ArrayList();
        c61 c61Var = (c61) this.i;
        uk2 uk2VarN = y02.n();
        vp0 vp0VarE = uk2VarN != null ? uk2VarN.e() : null;
        uk2 uk2VarQ = y02.q(uk2VarN);
        try {
            t51 t51Var = c61Var.b ? c61Var.c : (t51) c61Var.e.getValue();
            if (t51Var != null) {
                v72 v72Var = new v72();
                v72Var.h = 1;
                List list = (List) t51Var.k.h(Integer.valueOf(i));
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    wt1 wt1Var = (wt1) list.get(i2);
                    d71 d71Var = c61Var.o;
                    int iIntValue = ((Number) wt1Var.h).intValue();
                    long j = ((k00) wt1Var.i).a;
                    k42 k42Var = c61.w;
                    v72Var = v72Var;
                    arrayList.add(d71Var.a(iIntValue, j, false, new b20((ArrayList) null, v72Var, list, i, t51Var)));
                }
            }
            return arrayList;
        } finally {
            y02.u(uk2VarN, uk2VarQ, vp0VarE);
        }
    }

    public final void O(String str, Runnable runnable) {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        Object obj = wf0.h;
        TimeUnit timeUnit = TimeUnit.DAYS;
        bx1 bx1Var = bx1.c;
        rt rtVar = bx1Var.a;
        if (Boolean.FALSE.booleanValue()) {
            r32 r32Var = bx1Var.b;
            Thread threadCurrentThread = Thread.currentThread();
            long id = threadCurrentThread.getId();
            kx2 kx2VarB = r32Var.l;
            kx2 kx2Var = r32Var.m;
            if (kx2VarB == null || kx2VarB.k != id) {
                if (kx2Var == null || kx2Var.k != id) {
                    kx2VarB = r32Var.b(id, Os.gettid(), threadCurrentThread.getName());
                    r32Var.m = r32Var.l;
                    r32Var.l = kx2VarB;
                } else {
                    kx2VarB = kx2Var;
                }
            }
            kx2VarB.j.getClass();
            kx2VarB.j.getClass();
            ((jo0) this.i).l.getClass();
        }
        boolean z = false;
        try {
            runnable.run();
            if (obj instanceof AutoCloseable) {
                return;
            }
            if (obj instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) obj;
                if (executorService == ForkJoinPool.commonPool() || (zIsTerminated2 = executorService.isTerminated())) {
                    return;
                }
                executorService.shutdown();
                while (!zIsTerminated2) {
                    try {
                        zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
            }
            wg.f();
        } catch (Throwable th) {
            try {
                str.concat(".exception");
                h12.u(bx1Var, th);
                throw null;
            } catch (Throwable th2) {
                if (obj instanceof AutoCloseable) {
                    throw th2;
                }
                if (obj instanceof ExecutorService) {
                    ExecutorService executorService2 = (ExecutorService) obj;
                    if (executorService2 == ForkJoinPool.commonPool() || (zIsTerminated = executorService2.isTerminated())) {
                        throw th2;
                    }
                    executorService2.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                        } catch (InterruptedException unused2) {
                            if (!z) {
                                executorService2.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        throw th2;
                    }
                    Thread.currentThread().interrupt();
                    throw th2;
                }
            }
        }
    }

    public final void P(float f, float f2) {
        ((eg) this.i).g().g(f, f2);
    }

    @Override // defpackage.vf1
    public final void c(if1 if1Var, boolean z) {
        if (if1Var instanceof wo2) {
            ((wo2) if1Var).z.k().c(false);
        }
        vf1 vf1Var = ((b3) this.i).l;
        if (vf1Var != null) {
            vf1Var.c(if1Var, z);
        }
    }

    @Override // defpackage.sg
    public final Object e(w71 w71Var, Float f, Float f2, lk2 lk2Var, ok2 ok2Var) {
        Object objE = r02.e(w71Var, f.floatValue(), ie1.b(0.0f, f2.floatValue(), 28), (u60) this.i, lk2Var, ok2Var);
        return objE == y20.h ? objE : (zc) objE;
    }

    @Override // defpackage.o12
    public final long f(ry0 ry0Var, long j, u31 u31Var, long j2) {
        long j3 = ((ny0) ((kp0) this.i).a()).a;
        return (((long) ls.o(ry0Var.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), u31Var == u31.h)) << 32) | (((long) ls.o(ry0Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L);
    }

    @Override // defpackage.kf1
    public final void g(if1 if1Var, lf1 lf1Var) {
        ((fr) this.i).m.removeCallbacksAndMessages(if1Var);
    }

    @Override // defpackage.fy1
    public final uc2 h() {
        return ((gh) this.i).k;
    }

    @Override // defpackage.fy1
    public final ls i() {
        return ((gh) this.i).i;
    }

    @Override // defpackage.ci1
    public final Comparable j(q22 q22Var) {
        re1 re1Var = (re1) this.i;
        gy1 gy1Var = (gy1) re1Var.C0().b(1L, 1L);
        re1Var.r1(q22Var, gy1Var);
        return gy1Var.h0(0, 0);
    }

    @Override // defpackage.kf1
    public final void k(if1 if1Var, lf1 lf1Var) {
        fr frVar = (fr) this.i;
        Handler handler = frVar.m;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = frVar.o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (if1Var == ((er) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new dr(this, i2 < arrayList.size() ? (er) arrayList.get(i2) : null, lf1Var, if1Var), if1Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.qi0
    public final je1 l() {
        return ((gh) this.i).j;
    }

    @Override // defpackage.xp1
    public final int n(int i) {
        r5 r5Var = (r5) this.i;
        if (i <= r5Var.h - 1) {
            return i;
        }
        if (i <= r5Var.i - 1) {
            return i - 1;
        }
        int i2 = r5Var.j;
        return i <= i2 + 1 ? i - 2 : i2;
    }

    @Override // defpackage.fy1
    public final y22 r() {
        return (gh) this.i;
    }

    @Override // defpackage.xp1
    public final int s(int i) {
        r5 r5Var = (r5) this.i;
        if (i < r5Var.h) {
            return i;
        }
        if (i < r5Var.i) {
            return i + 1;
        }
        int i2 = r5Var.j;
        return i <= i2 ? i + 2 : i2 + 2;
    }

    @Override // defpackage.fy1
    public final s60 t() {
        return ((gh) this.i).i.m();
    }

    public final String toString() {
        switch (this.h) {
            case 13:
                return ((vl2) this.i).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.vf1
    public final boolean v(if1 if1Var) {
        b3 b3Var = (b3) this.i;
        if (if1Var == b3Var.j) {
            return false;
        }
        lf1 lf1Var = ((wo2) if1Var).A;
        vf1 vf1Var = b3Var.l;
        if (vf1Var != null) {
            return vf1Var.v(if1Var);
        }
        return false;
    }

    @Override // defpackage.qp1
    public final void w(Object obj) {
        e91 e91Var = (e91) obj;
        ca0 ca0Var = (ca0) this.i;
        if (e91Var == null || !ca0Var.m0) {
            return;
        }
        wg.j("Fragment ", ca0Var, " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void x(l41 l41Var) {
        if (!l41Var.I()) {
            ax0.b("DepthSortedSet.add called on an unattached node");
        }
        ((vl2) this.i).add(l41Var);
    }

    public e2 z(int i) {
        return null;
    }

    public /* synthetic */ g2(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    public /* synthetic */ g2(byte b, boolean z) {
        this.h = b;
    }

    public g2(re1 re1Var) {
        this.h = (byte) 27;
        if (re1Var.R0()) {
            this.i = re1Var;
        } else {
            wg.m("Must be a  vector!");
            throw null;
        }
    }

    public g2(byte b) {
        this.h = b;
        switch (b) {
            case 13:
                this.i = new vl2(aa3.t);
                break;
            case 14:
                this.i = new ConcurrentHashMap(16);
                break;
            case 26:
                sd1 sd1Var = new sd1();
                this.i = sd1Var;
                if (!sd1Var.i) {
                    if (sd1Var.j) {
                        x12.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    sd1Var.a();
                    sd1Var.j = true;
                }
                break;
            case 29:
                this.i = new ly1();
                break;
            default:
                this.i = new f2(this);
                break;
        }
    }

    public void y(int i, e2 e2Var, String str, Bundle bundle) {
    }
}
