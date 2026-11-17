package defpackage;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class uk2 {
    public zk2 a;
    public long b;
    public boolean c;
    public int d;

    public uk2(long j, zk2 zk2Var) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = zk2Var;
        this.b = j;
        jc2 jc2Var = bl2.a;
        if (j != 0) {
            zk2 zk2VarD = d();
            long j2 = zk2VarD.j;
            long[] jArr = zk2VarD.k;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = zk2VarD.i;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = zk2VarD.h;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (bl2.c) {
                iA = bl2.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(uk2 uk2Var) {
        bl2.b.D(uk2Var);
    }

    public final void a() {
        synchronized (bl2.c) {
            b();
            p();
        }
    }

    public void b() {
        bl2.d = bl2.d.b(g());
    }

    public abstract void c();

    public zk2 d() {
        return this.a;
    }

    public abstract vp0 e();

    public boolean f() {
        return false;
    }

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public vp0 i() {
        return null;
    }

    public final uk2 j() {
        eg egVar = bl2.b;
        uk2 uk2Var = (uk2) egVar.f();
        egVar.D(this);
        return uk2Var;
    }

    public void k() {
        m02.z();
        throw null;
    }

    public void l() {
        m02.z();
        throw null;
    }

    public void n(qn2 qn2Var) {
        jc2 jc2Var = bl2.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            bl2.t(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(zk2 zk2Var) {
        this.a = zk2Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract uk2 u(vp0 vp0Var);

    public void m() {
    }
}
