package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z02 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final byte i;
    public final long j;
    public final float k;
    public final long l;
    public final ArrayList m;
    public final long n;
    public boolean o;
    public boolean p;
    public z02 q;

    /* JADX WARN: Multi-variable type inference failed */
    public z02(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.o = z3;
        this.p = z3;
    }

    public final void a() {
        z02 z02Var = this.q;
        if (z02Var == null) {
            this.o = true;
            this.p = true;
        } else if (z02Var != null) {
            z02Var.a();
        }
    }

    public final List b() {
        ArrayList arrayList = this.m;
        return arrayList == null ? ag0.h : arrayList;
    }

    public final boolean c() {
        z02 z02Var = this.q;
        if (z02Var != null) {
            return z02Var.c();
        }
        return this.o || this.p;
    }

    public final String toString() {
        return "PointerInputChange(id=" + y02.z(this.a) + ", uptimeMillis=" + this.b + ", position=" + up1.g(this.c) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + up1.g(this.g) + ", previousPressed=" + this.h + ", isConsumed=" + c() + ", type=" + f12.a(this.i) + ", historical=" + b() + ", scrollDelta=" + up1.g(this.j) + ", scaleFactor=" + this.k + ", panOffset=" + up1.g(this.l) + ")";
    }

    public z02(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = arrayList;
        this.n = j8;
    }
}
