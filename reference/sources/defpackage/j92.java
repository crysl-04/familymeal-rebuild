package defpackage;

import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class j92 implements e90 {
    public e90 A;
    public u31 B;
    public ln C;
    public int D;
    public ou E;
    public int h;
    public float i = 1.0f;
    public float j = 1.0f;
    public float k = 1.0f;
    public float l;
    public float m;
    public float n;
    public long o;
    public long p;
    public float q;
    public float r;
    public float s;
    public float t;
    public long u;
    public hi2 v;
    public boolean w;
    public int x;
    public long y;
    public p31 z;

    public j92() {
        long j = fs0.a;
        this.o = j;
        this.p = j;
        this.t = 8.0f;
        this.u = ez2.b;
        this.v = t03.A;
        this.x = 0;
        this.y = 9205357640488583168L;
        this.z = p31.a;
        this.A = ls.c();
        this.B = u31.h;
        this.D = 3;
    }

    public final void a() {
        i(1.0f);
        j(1.0f);
        c(1.0f);
        if (this.l != 0.0f) {
            this.h |= 8;
            this.l = 0.0f;
        }
        if (this.m != 0.0f) {
            this.h |= 16;
            this.m = 0.0f;
        }
        k(0.0f);
        long j = fs0.a;
        e(j);
        m(j);
        if (this.q != 0.0f) {
            this.h |= 256;
            this.q = 0.0f;
        }
        if (this.r != 0.0f) {
            this.h |= 512;
            this.r = 0.0f;
        }
        if (this.s != 0.0f) {
            this.h |= 1024;
            this.s = 0.0f;
        }
        if (this.t != 8.0f) {
            this.h |= 2048;
            this.t = 8.0f;
        }
        o(ez2.b);
        l(t03.A);
        g(false);
        if (!uz0.g(this.C, null)) {
            this.h |= 262144;
            this.C = null;
        }
        if (this.D != 3) {
            this.h |= 524288;
            this.D = 3;
        }
        if (this.x != 0) {
            this.h |= 32768;
            this.x = 0;
        }
        p31 p31Var = p31.a;
        if (!uz0.g(this.z, p31Var)) {
            this.h |= 1048576;
            this.z = p31Var;
        }
        this.y = 9205357640488583168L;
        this.E = null;
        this.h = 0;
    }

    @Override // defpackage.e90
    public final float b() {
        return this.A.b();
    }

    public final void c(float f) {
        if (this.k == f) {
            return;
        }
        this.h |= 4;
        this.k = f;
    }

    public final void e(long j) {
        long j2 = this.o;
        int i = kv.h;
        if (r13.a(j2, j)) {
            return;
        }
        this.h |= 64;
        this.o = j;
    }

    public final void g(boolean z) {
        if (this.w != z) {
            this.h |= CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
            this.w = z;
        }
    }

    public final void i(float f) {
        if (this.i == f) {
            return;
        }
        this.h |= 1;
        this.i = f;
    }

    public final void j(float f) {
        if (this.j == f) {
            return;
        }
        this.h |= 2;
        this.j = f;
    }

    public final void k(float f) {
        if (this.n == f) {
            return;
        }
        this.h |= 32;
        this.n = f;
    }

    public final void l(hi2 hi2Var) {
        if (uz0.g(this.v, hi2Var)) {
            return;
        }
        this.h |= 8192;
        this.v = hi2Var;
    }

    public final void m(long j) {
        long j2 = this.p;
        int i = kv.h;
        if (r13.a(j2, j)) {
            return;
        }
        this.h |= 128;
        this.p = j;
    }

    @Override // defpackage.e90
    public final float n() {
        return this.A.n();
    }

    public final void o(long j) {
        if (ez2.a(this.u, j)) {
            return;
        }
        this.h |= 4096;
        this.u = j;
    }
}
