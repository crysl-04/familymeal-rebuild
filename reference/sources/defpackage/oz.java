package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class oz implements iz {
    public final g2 A;
    public final g82 B;
    public final dr0 C;
    public byte D;
    public final jz h;
    public final b23 i;
    public final AtomicReference j = new AtomicReference(null);
    public final Object k = new Object();
    public final pj1 l;
    public final fk2 m;
    public final mj1 n;
    public final nj1 o;
    public final nj1 p;
    public final mj1 q;
    public final as r;
    public final as s;
    public final mj1 t;
    public mj1 u;
    public boolean v;
    public zi2 w;
    public wv1 x;
    public oz y;
    public int z;

    public oz(jz jzVar, b23 b23Var) {
        this.h = jzVar;
        this.i = b23Var;
        nj1 nj1Var = new nj1();
        pj1 pj1Var = nj1Var.e;
        if (pj1Var == null) {
            pj1Var = new pj1(nj1Var);
            nj1Var.e = pj1Var;
        }
        pj1 pj1Var2 = pj1Var;
        this.l = pj1Var2;
        fk2 fk2Var = new fk2();
        if (jzVar.d()) {
            fk2Var.r = new si1();
        }
        if (jzVar.f()) {
            fk2Var.b();
        }
        this.m = fk2Var;
        this.n = p02.v();
        this.o = new nj1();
        this.p = new nj1();
        this.q = p02.v();
        as asVar = new as();
        this.r = asVar;
        as asVar2 = new as();
        this.s = asVar2;
        this.t = p02.v();
        this.u = p02.v();
        g2 g2Var = new g2((Object) jzVar, (byte) 7);
        this.A = g2Var;
        this.B = new g82();
        dr0 dr0Var = new dr0(b23Var, jzVar, hk2.a(fk2Var), pj1Var2, asVar, asVar2, g2Var, this);
        jzVar.p(dr0Var);
        this.C = dr0Var;
    }

    public final void A(zp0 zp0Var) {
        boolean zI = i();
        q();
        jz jzVar = this.h;
        if (!zI) {
            jzVar.a(this, zp0Var);
            return;
        }
        dr0 dr0Var = this.C;
        dr0Var.z = 0;
        dr0Var.y = true;
        jzVar.a(this, zp0Var);
        if (dr0Var.F || dr0Var.z != 0) {
            w12.a("Cannot disable reuse from root if it was caused by other groups");
        }
        dr0Var.z = -1;
        dr0Var.y = false;
    }

    public final void a() {
        this.j.set(null);
        this.r.h.o0();
        this.s.h.o0();
        pj1 pj1Var = this.l;
        if (pj1Var.h.g()) {
            return;
        }
        g82 g82Var = this.B;
        try {
            g82Var.g(pj1Var, this.C.y());
            g82Var.b();
        } finally {
            g82Var.a();
        }
    }

    public final void b(Object obj, boolean z) {
        Object objG = this.n.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof nj1;
        d01 d01Var = d01.h;
        nj1 nj1Var = this.o;
        nj1 nj1Var2 = this.p;
        mj1 mj1Var = this.t;
        if (!z2) {
            e72 e72Var = (e72) objG;
            if (p02.E(mj1Var, obj, e72Var) || e72Var.b(obj) == d01Var) {
                return;
            }
            if (e72Var.g == null || z) {
                nj1Var.a(e72Var);
                return;
            } else {
                nj1Var2.a(e72Var);
                return;
            }
        }
        nj1 nj1Var3 = (nj1) objG;
        Object[] objArr = nj1Var3.b;
        long[] jArr = nj1Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        e72 e72Var2 = (e72) objArr[(i << 3) + i3];
                        if (!p02.E(mj1Var, obj, e72Var2) && e72Var2.b(obj) != d01Var) {
                            if (e72Var2.g == null || z) {
                                nj1Var.a(e72Var2);
                            } else {
                                nj1Var2.a(e72Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:219:0x0122 A[EDGE_INSN: B:219:0x0122->B:214:0x0122 BREAK  A[LOOP:13: B:63:0x0150->B:74:0x0184], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0184 A[LOOP:13: B:63:0x0150->B:74:0x0184, LOOP_END] */
    public final void c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zC;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zG;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i;
        int i2;
        boolean z2 = set instanceof dd2;
        mj1 mj1Var = this.q;
        Object obj = null;
        int i3 = 8;
        if (z2) {
            nj1 nj1Var = ((dd2) set).h;
            Object[] objArr = nj1Var.b;
            long[] jArr9 = nj1Var.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i4];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof e72) {
                                    ((e72) obj2).b(obj);
                                } else {
                                    b(obj2, z);
                                    Object objG = mj1Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof nj1) {
                                            nj1 nj1Var2 = (nj1) objG;
                                            Object[] objArr2 = nj1Var2.b;
                                            long[] jArr10 = nj1Var2.a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i8];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                b((o90) objArr2[(i8 << 3) + i10], z);
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr9 = jArr9;
                                                        }
                                                        jArr8 = jArr9;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr9;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr9;
                                            j8 = j9;
                                            i = length;
                                            b((o90) objG, z);
                                        }
                                    }
                                    i2 = 8;
                                }
                                jArr8 = jArr9;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            jArr9 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr9;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr9;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr9 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof e72) {
                    ((e72) obj3).b(null);
                } else {
                    b(obj3, z);
                    Object objG2 = mj1Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof nj1) {
                            nj1 nj1Var3 = (nj1) objG2;
                            Object[] objArr3 = nj1Var3.b;
                            long[] jArr12 = nj1Var3.a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr12[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length3) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                b((o90) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        } else if (i12 != length3) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((o90) objG2, z);
                        }
                    }
                }
            }
        }
        mj1 mj1Var2 = this.n;
        nj1 nj1Var4 = this.o;
        if (z) {
            nj1 nj1Var5 = this.p;
            if (nj1Var5.h()) {
                long[] jArr13 = mj1Var2.a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr13[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = mj1Var2.b[i18];
                                    Object obj5 = mj1Var2.c[i18];
                                    if (obj5 instanceof nj1) {
                                        nj1 nj1Var6 = (nj1) obj5;
                                        Object[] objArr4 = nj1Var6.b;
                                        long[] jArr14 = nj1Var6.a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr14[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr15 = jArr14;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr13;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            e72 e72Var = (e72) objArr5[i22];
                                                            if (nj1Var5.c(e72Var) || nj1Var4.c(e72Var)) {
                                                                nj1Var6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr13;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr13 = jArr6;
                                                    }
                                                    jArr5 = jArr13;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr13;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr14 = jArr15;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            j6 = j12;
                                        }
                                        zG = nj1Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        j6 = j12;
                                        obj5.getClass();
                                        e72 e72Var2 = (e72) obj5;
                                        zG = nj1Var5.c(e72Var2) || nj1Var4.c(e72Var2);
                                    }
                                    if (zG) {
                                        mj1Var2.m(i18);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr13 = jArr4;
                    }
                }
                nj1Var5.b();
                h();
                return;
            }
        }
        if (nj1Var4.h()) {
            long[] jArr16 = mj1Var2.a;
            int length6 = jArr16.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr16[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = mj1Var2.b[i26];
                                Object obj7 = mj1Var2.c[i26];
                                if (obj7 instanceof nj1) {
                                    nj1 nj1Var7 = (nj1) obj7;
                                    Object[] objArr6 = nj1Var7.b;
                                    long[] jArr17 = nj1Var7.a;
                                    int length7 = jArr17.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr17[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr18 = jArr17;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr16;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (nj1Var4.c((e72) objArr7[i30])) {
                                                            nj1Var7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr16;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr16 = jArr3;
                                                }
                                                jArr2 = jArr16;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr16;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr17 = jArr18;
                                            jArr16 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr16;
                                        j4 = j14;
                                    }
                                    zC = nj1Var7.g();
                                } else {
                                    jArr2 = jArr16;
                                    j4 = j14;
                                    obj7.getClass();
                                    zC = nj1Var4.c((e72) obj7);
                                }
                                if (zC) {
                                    mj1Var2.m(i26);
                                }
                            } else {
                                jArr2 = jArr16;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr16 = jArr2;
                        }
                        jArr = jArr16;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr16;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr16 = jArr;
                }
            }
            h();
            nj1Var4.b();
        }
    }

    public final void d() {
        synchronized (this.k) {
            try {
                e(this.r);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.l.h.g()) {
                        g82 g82Var = this.B;
                        try {
                            g82Var.g(this.l, this.C.y());
                            g82Var.b();
                        } finally {
                            g82Var.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0127 A[EDGE_INSN: B:148:0x0127->B:70:0x0127 BREAK  A[LOOP:2: B:129:0x00dd->B:68:0x011d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x011d A[Catch: all -> 0x0186, LOOP:2: B:129:0x00dd->B:68:0x011d, LOOP_END, TryCatch #2 {all -> 0x0186, blocks: (B:54:0x00dd, B:56:0x00ec, B:58:0x00f6, B:60:0x00fc, B:62:0x010c, B:64:0x0112, B:70:0x0127, B:76:0x0144, B:79:0x0157, B:68:0x011d, B:71:0x012c, B:85:0x0174, B:87:0x017f), top: B:129:0x00dd }] */
    public final void e(as asVar) throws Throwable {
        g82 g82Var;
        long[] jArr;
        int i;
        long[] jArr2;
        g82 g82Var2;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        long j3;
        as asVar2 = this.s;
        dr0 dr0Var = this.C;
        mz mzVarY = dr0Var.y();
        g82 g82Var3 = this.B;
        g82Var3.g(this.l, mzVarY);
        try {
            try {
                if (asVar.h.q0()) {
                    try {
                        if (asVar2.h.q0() && this.x == null) {
                            g82Var3.b();
                        }
                        return;
                    } finally {
                        g82Var3.a();
                    }
                }
                wv1 wv1Var = this.x;
                rg rgVar = wv1Var != null ? wv1Var.l : this.i;
                try {
                    Trace.beginSection(rgVar.equals(wv1Var != null ? wv1Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                    try {
                        wv1 wv1Var2 = this.x;
                        g82 g82Var4 = wv1Var2 != null ? wv1Var2.k : g82Var3;
                        fk2 fk2Var = this.m;
                        mz mzVarY2 = dr0Var.y();
                        ik2 ik2VarD = hk2.a(fk2Var).d();
                        int i3 = 0;
                        try {
                            asVar.W(rgVar, ik2VarD, g82Var4, mzVarY2);
                            ik2VarD.e(true);
                            rgVar.g();
                            Trace.endSection();
                            g82Var3.c();
                            g82Var3.d();
                            if (this.v) {
                                Trace.beginSection("Compose:unobserve");
                                try {
                                    this.v = false;
                                    mj1 mj1Var = this.n;
                                    long[] jArr3 = mj1Var.a;
                                    int length = jArr3.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        while (true) {
                                            long j4 = jArr3[i4];
                                            char c2 = 7;
                                            long j5 = -9187201950435737472L;
                                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8;
                                                int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                int i7 = i3;
                                                while (i7 < i6) {
                                                    if ((j4 & 255) < 128) {
                                                        c = c2;
                                                        int i8 = (i4 << 3) + i7;
                                                        j2 = j5;
                                                        Object obj = mj1Var.b[i8];
                                                        Object obj2 = mj1Var.c[i8];
                                                        if (obj2 instanceof nj1) {
                                                            nj1 nj1Var = (nj1) obj2;
                                                            Object[] objArr = nj1Var.b;
                                                            long[] jArr4 = nj1Var.a;
                                                            int i9 = i5;
                                                            int length2 = jArr4.length - 2;
                                                            i = i7;
                                                            jArr2 = jArr3;
                                                            g82Var2 = g82Var3;
                                                            if (length2 >= 0) {
                                                                int i10 = 0;
                                                                while (true) {
                                                                    try {
                                                                        long j6 = jArr4[i10];
                                                                        j = j4;
                                                                        long[] jArr5 = jArr4;
                                                                        if ((((~j6) << c) & j6 & j2) == j2) {
                                                                            if (i10 != length2) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            i10++;
                                                                            jArr4 = jArr5;
                                                                            j4 = j;
                                                                            i9 = 8;
                                                                        } else {
                                                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                            for (int i12 = 0; i12 < i11; i12++) {
                                                                                if ((j6 & 255) < 128) {
                                                                                    j3 = j6;
                                                                                    int i13 = (i10 << 3) + i12;
                                                                                    if (!((e72) objArr[i13]).a()) {
                                                                                        nj1Var.m(i13);
                                                                                    }
                                                                                } else {
                                                                                    j3 = j6;
                                                                                }
                                                                                j6 = j3 >> i9;
                                                                            }
                                                                            if (i11 != i9) {
                                                                                break;
                                                                            }
                                                                            if (i10 != length2) {
                                                                                break;
                                                                            }
                                                                            i10++;
                                                                            jArr4 = jArr5;
                                                                            j4 = j;
                                                                            i9 = 8;
                                                                        }
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        Trace.endSection();
                                                                        throw th;
                                                                    }
                                                                }
                                                            } else {
                                                                j = j4;
                                                            }
                                                            zG = nj1Var.g();
                                                        } else {
                                                            i = i7;
                                                            jArr2 = jArr3;
                                                            g82Var2 = g82Var3;
                                                            j = j4;
                                                            obj2.getClass();
                                                            zG = !((e72) obj2).a();
                                                        }
                                                        if (zG) {
                                                            mj1Var.m(i8);
                                                        }
                                                        i2 = 8;
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        g82Var2 = g82Var3;
                                                        j = j4;
                                                        c = c2;
                                                        j2 = j5;
                                                        i2 = i5;
                                                    }
                                                    j4 = j >> i2;
                                                    i7 = i + 1;
                                                    i5 = i2;
                                                    c2 = c;
                                                    j5 = j2;
                                                    g82Var3 = g82Var2;
                                                    jArr3 = jArr2;
                                                }
                                                jArr = jArr3;
                                                g82Var = g82Var3;
                                                if (i6 != i5) {
                                                    break;
                                                }
                                            } else {
                                                jArr = jArr3;
                                                g82Var = g82Var3;
                                            }
                                            if (i4 == length) {
                                                break;
                                            }
                                            i4++;
                                            g82Var3 = g82Var;
                                            jArr3 = jArr;
                                            i3 = 0;
                                        }
                                    } else {
                                        g82Var = g82Var3;
                                    }
                                    h();
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } else {
                                g82Var = g82Var3;
                            }
                            if (asVar2.h.q0() && this.x == null) {
                                g82Var.b();
                            }
                            g82Var.a();
                            return;
                        } catch (Throwable th3) {
                            try {
                                ik2VarD.e(false);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                Trace.endSection();
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
            if (asVar2.h.q0() && this.x == null) {
                g82Var3.b();
            }
        } catch (Throwable th8) {
            th = th8;
        }
        g82Var3.a();
        throw th;
    }

    public final void f() {
        synchronized (this.k) {
            try {
                as asVar = this.s;
                asVar.getClass();
                if (!asVar.h.q0()) {
                    e(this.s);
                }
            } catch (Throwable th) {
                try {
                    if (!this.l.h.g()) {
                        g82 g82Var = this.B;
                        try {
                            g82Var.g(this.l, this.C.y());
                            g82Var.b();
                        } finally {
                            g82Var.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.k) {
            try {
                this.C.v = null;
                if (!this.l.h.g()) {
                    g82 g82Var = this.B;
                    try {
                        g82Var.g(this.l, this.C.y());
                        g82Var.b();
                        g82Var.a();
                    } catch (Throwable th) {
                        g82Var.a();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.l.h.g()) {
                        g82 g82Var2 = this.B;
                        try {
                            g82Var2.g(this.l, this.C.y());
                            g82Var2.b();
                        } finally {
                            g82Var2.a();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void h() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zG;
        int i4;
        int i5;
        mj1 mj1Var = this.q;
        long[] jArr3 = mj1Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = mj1Var.b[i10];
                            Object obj2 = mj1Var.c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof nj1;
                            j5 = j8;
                            mj1 mj1Var2 = this.n;
                            if (z) {
                                nj1 nj1Var = (nj1) obj2;
                                Object[] objArr = nj1Var.b;
                                long[] jArr4 = nj1Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!mj1Var2.c((o90) objArr[i15])) {
                                                        nj1Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zG = nj1Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zG = !mj1Var2.c((o90) obj2);
                            }
                            if (zG) {
                                mj1Var.m(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        nj1 nj1Var2 = this.p;
        if (!nj1Var2.h()) {
            return;
        }
        Object[] objArr2 = nj1Var2.b;
        long[] jArr5 = nj1Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((e72) objArr2[i20]).g == null) {
                            nj1Var2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.k) {
            z = this.D == 1;
            if (z) {
                this.D = (byte) 0;
            }
        }
        return z;
    }

    public final void j(zp0 zp0Var) {
        try {
            synchronized (this.k) {
                n();
                mj1 mj1Var = this.u;
                this.u = p02.v();
                try {
                    dr0 dr0Var = this.C;
                    zi2 zi2Var = this.w;
                    if (!dr0Var.e.h.q0()) {
                        ez.a("Expected applyChanges() to have been called");
                    }
                    dr0Var.P = zi2Var;
                    try {
                        dr0Var.n(mj1Var, zp0Var);
                        dr0Var.P = null;
                    } catch (Throwable th) {
                        dr0Var.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.u = mj1Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.l.h.g()) {
                    g82 g82Var = this.B;
                    try {
                        g82Var.g(this.l, this.C.y());
                        g82Var.b();
                    } finally {
                        g82Var.a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final wv1 k(boolean z, zp0 zp0Var) {
        if (this.x != null) {
            w12.b("A pausable composition is in progress");
        }
        wv1 wv1Var = new wv1(this, this.h, this.C, this.l, zp0Var, z, this.i, this.k);
        this.x = wv1Var;
        return wv1Var;
    }

    public final void l() {
        synchronized (this.k) {
            if (this.x != null) {
                w12.b("Deactivate is not supported while pausable composition is in progress");
            }
            boolean z = this.m.i == 0;
            if (!z || !this.l.h.g()) {
                Trace.beginSection("Compose:deactivate");
                try {
                    g82 g82Var = this.B;
                    try {
                        g82Var.g(this.l, this.C.y());
                        if (!z) {
                            fk2 fk2Var = this.m;
                            g82 g82Var2 = this.B;
                            ik2 ik2VarD = fk2Var.d();
                            try {
                                ik2VarD.m(ik2VarD.t, new j7(g82Var2, ik2VarD, (byte) 14));
                                ik2VarD.e(true);
                                this.i.g();
                                g82Var.c();
                            } catch (Throwable th) {
                                ik2VarD.e(false);
                                throw th;
                            }
                        }
                        g82Var.b();
                        g82Var.a();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        g82Var.a();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            }
            this.n.a();
            this.q.a();
            this.u.a();
            this.r.h.o0();
            this.s.h.o0();
            dr0 dr0Var = this.C;
            dr0Var.E.clear();
            dr0Var.s.clear();
            dr0Var.e.h.o0();
            dr0Var.v = null;
            this.D = (byte) 1;
        }
    }

    public final void m() {
        synchronized (this.k) {
            if (this.C.F) {
                w12.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (this.D != 3) {
                this.D = (byte) 3;
                as asVar = this.C.L;
                if (asVar != null) {
                    e(asVar);
                }
                boolean z = this.m.i == 0;
                if (!z || !this.l.h.g()) {
                    g82 g82Var = this.B;
                    try {
                        g82Var.g(this.l, this.C.y());
                        if (!z) {
                            fk2 fk2Var = this.m;
                            g82 g82Var2 = this.B;
                            ik2 ik2VarD = fk2Var.d();
                            try {
                                ik2VarD.m(ik2VarD.t, new s((Object) g82Var2, (byte) 5));
                                ik2VarD.G();
                                ik2VarD.e(true);
                                this.i.a();
                                this.i.g();
                                g82Var.c();
                            } catch (Throwable th) {
                                ik2VarD.e(false);
                                throw th;
                            }
                        }
                        g82Var.b();
                        g82Var.a();
                    } catch (Throwable th2) {
                        g82Var.a();
                        throw th2;
                    }
                }
                this.t.a();
                dr0 dr0Var = this.C;
                dr0Var.getClass();
                Trace.beginSection("Compose:Composer.dispose");
                try {
                    dr0Var.b.u(dr0Var);
                    dr0Var.E.clear();
                    dr0Var.s.clear();
                    dr0Var.e.h.o0();
                    dr0Var.v = null;
                    dr0Var.a.a();
                    Trace.endSection();
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            }
        }
        this.h.v(this);
    }

    public final void n() {
        Object obj = aa3.s;
        AtomicReference atomicReference = this.j;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                ez.b("pending composition has not been applied");
                wg.k();
                return;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ez.b("corrupt pendingModifications drain: " + atomicReference);
                wg.k();
                return;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.j;
        Object andSet = atomicReference.getAndSet(null);
        if (uz0.g(andSet, aa3.s)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.x == null) {
                ez.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            ez.b("corrupt pendingModifications drain: " + atomicReference);
            wg.k();
        }
    }

    public final void p() {
        gg0 gg0Var = gg0.h;
        AtomicReference atomicReference = this.j;
        Object andSet = atomicReference.getAndSet(gg0Var);
        if (uz0.g(andSet, aa3.s) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            ez.b("corrupt pendingModifications drain: " + atomicReference);
            wg.k();
            return;
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        String str;
        byte b = this.D;
        if (b != 0) {
            if (b == 1) {
                str = "The composition should be activated before setting content.";
            } else if (b != 2) {
                str = b != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            w12.b(str);
        }
        if (this.x == null) {
            return;
        }
        w12.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        pj1 pj1Var = this.l;
        dr0 dr0Var = this.C;
        if (arrayList.size() > 0) {
            ((ph1) ((wt1) arrayList.get(0)).h).getClass();
            ez.a("Check failed");
        }
        try {
            dr0Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    dr0Var.A(arrayList);
                    dr0Var.i();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                dr0Var.a();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!pj1Var.h.g()) {
                    g82 g82Var = this.B;
                    try {
                        g82Var.g(pj1Var, dr0Var.y());
                        g82Var.b();
                    } finally {
                        g82Var.a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final d01 s(e72 e72Var, Object obj) {
        oz ozVar;
        int i = e72Var.b;
        if ((i & 2) != 0) {
            e72Var.b = i | 4;
        }
        xq0 xq0Var = e72Var.c;
        if (xq0Var == null || !xq0Var.a()) {
            return d01.h;
        }
        fk2 fk2Var = this.m;
        fk2Var.getClass();
        xq0 xq0Var2 = e72Var.c;
        if (xq0Var2 != null && fk2Var.e(dt.s(xq0Var2))) {
            if (e72Var.d == null) {
                return d01.h;
            }
            d01 d01VarT = t(e72Var, xq0Var, obj);
            if (d01VarT != d01.h) {
                this.A.A();
            }
            return d01VarT;
        }
        synchronized (this.k) {
            ozVar = this.y;
        }
        if (ozVar != null) {
            dr0 dr0Var = ozVar.C;
            if (dr0Var.F && dr0Var.a0(e72Var, obj)) {
                return d01.k;
            }
        }
        return d01.h;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba A[Catch: all -> 0x00e1, LOOP:0: B:43:0x0084->B:54:0x00ba, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:13:0x0026, B:15:0x0030, B:12:0x0021, B:21:0x0043, B:23:0x0049, B:28:0x0054, B:32:0x005a, B:33:0x0062, B:35:0x0068, B:36:0x006e, B:38:0x0074, B:40:0x0078, B:43:0x0084, B:45:0x0094, B:47:0x00a0, B:49:0x00a9, B:51:0x00b2, B:54:0x00ba, B:55:0x00bd, B:57:0x00c1), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1 A[Catch: all -> 0x00e1, EDGE_INSN: B:57:0x00c1->B:58:0x00c6 BREAK  A[LOOP:0: B:43:0x0084->B:54:0x00ba], TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:13:0x0026, B:15:0x0030, B:12:0x0021, B:21:0x0043, B:23:0x0049, B:28:0x0054, B:32:0x005a, B:33:0x0062, B:35:0x0068, B:36:0x006e, B:38:0x0074, B:40:0x0078, B:43:0x0084, B:45:0x0094, B:47:0x00a0, B:49:0x00a9, B:51:0x00b2, B:54:0x00ba, B:55:0x00bd, B:57:0x00c1), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00c1 A[SYNTHETIC] */
    public final d01 t(e72 e72Var, xq0 xq0Var, Object obj) {
        synchronized (this.k) {
            oz ozVar = this.y;
            oz ozVar2 = null;
            if (ozVar != null) {
                fk2 fk2Var = this.m;
                int i = this.z;
                if (fk2Var.n) {
                    ez.a("Writer is active");
                }
                if (i < 0 || i >= fk2Var.i) {
                    ez.a("Invalid group index");
                }
                xq0 xq0VarS = dt.s(xq0Var);
                if (fk2Var.e(xq0VarS)) {
                    int i2 = fk2Var.h[(i * 5) + 3] + i;
                    int i3 = xq0VarS.a;
                    if (i > i3 || i3 >= i2) {
                        ozVar = null;
                    }
                } else {
                    ozVar = null;
                }
                ozVar2 = ozVar;
            }
            if (ozVar2 == null) {
                dr0 dr0Var = this.C;
                if (dr0Var.F && dr0Var.a0(e72Var, obj)) {
                    return d01.k;
                }
                if (obj != null) {
                    boolean z = obj instanceof o90;
                    mj1 mj1Var = this.u;
                    if (z) {
                        Object objG = mj1Var.g(e72Var);
                        if (objG == null) {
                            p02.e(this.u, e72Var, obj);
                            break;
                        }
                        if (objG instanceof nj1) {
                            nj1 nj1Var = (nj1) objG;
                            Object[] objArr = nj1Var.b;
                            long[] jArr = nj1Var.a;
                            int length = jArr.length - 2;
                            if (length < 0) {
                                p02.e(this.u, e72Var, obj);
                                break;
                            }
                            int i4 = 0;
                            loop0: while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    for (int i6 = 0; i6 < i5; i6++) {
                                        if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == vz1.l) {
                                            break loop0;
                                        }
                                        j >>= 8;
                                    }
                                    if (i5 == 8) {
                                        if (i4 == length) {
                                            i4++;
                                        }
                                    }
                                    p02.e(this.u, e72Var, obj);
                                    break;
                                }
                                if (i4 == length) {
                                    p02.e(this.u, e72Var, obj);
                                    break;
                                }
                                i4++;
                            }
                        } else if (objG != vz1.l) {
                            p02.e(this.u, e72Var, obj);
                            break;
                        }
                    } else {
                        mj1Var.n(e72Var, vz1.l);
                    }
                } else {
                    this.u.n(e72Var, vz1.l);
                }
            }
            if (ozVar2 != null) {
                return ozVar2.t(e72Var, xq0Var, obj);
            }
            this.h.l(this);
            return this.C.F ? d01.j : d01.i;
        }
    }

    public final void u(Object obj) {
        Object objG = this.n.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof nj1;
        d01 d01Var = d01.k;
        mj1 mj1Var = this.t;
        if (!z) {
            e72 e72Var = (e72) objG;
            if (e72Var.b(obj) != d01Var || (obj instanceof o90)) {
                return;
            }
            p02.e(mj1Var, obj, e72Var);
            return;
        }
        nj1 nj1Var = (nj1) objG;
        Object[] objArr = nj1Var.b;
        long[] jArr = nj1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        e72 e72Var2 = (e72) objArr[(i << 3) + i3];
                        if (e72Var2.b(obj) == d01Var && !(obj instanceof o90)) {
                            p02.e(mj1Var, obj, e72Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[LOOP:0: B:7:0x0013->B:20:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0070 A[SYNTHETIC] */
    public final boolean v(dd2 dd2Var) {
        mj1 mj1Var = this.q;
        mj1 mj1Var2 = this.n;
        if (dd2Var != null) {
            nj1 nj1Var = dd2Var.h;
            Object[] objArr = nj1Var.b;
            long[] jArr = nj1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (mj1Var2.c(obj) || mj1Var.c(obj)) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
        } else {
            for (Object obj2 : dd2Var) {
                if (mj1Var2.c(obj2) || mj1Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean w() {
        boolean z;
        synchronized (this.k) {
            wv1 wv1Var = this.x;
            z = false;
            if (wv1Var == null || (wv1Var.h.get() == yv1.l && wv1Var.i == y02.i())) {
                n();
                try {
                    mj1 mj1Var = this.u;
                    this.u = p02.v();
                    try {
                        dr0 dr0Var = this.C;
                        zi2 zi2Var = this.w;
                        bs1 bs1Var = dr0Var.e.h;
                        if (!bs1Var.q0()) {
                            ez.a("Expected applyChanges() to have been called");
                        }
                        if (mj1Var.e > 0 || !dr0Var.s.isEmpty()) {
                            dr0Var.P = zi2Var;
                            try {
                                dr0Var.n(mj1Var, null);
                                dr0Var.P = null;
                                z = !bs1Var.q0();
                            } catch (Throwable th) {
                                dr0Var.P = null;
                                throw th;
                            }
                        }
                        if (!z) {
                            o();
                        }
                    } catch (Throwable th2) {
                        this.u = mj1Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        if (!this.l.h.g()) {
                            g82 g82Var = this.B;
                            try {
                                g82Var.g(this.l, this.C.y());
                                g82Var.b();
                            } finally {
                                g82Var.a();
                            }
                        }
                        throw th3;
                    } catch (Throwable th4) {
                        a();
                        throw th4;
                    }
                }
            } else {
                AtomicReference atomicReference = wv1Var.h;
                yv1 yv1Var = yv1.m;
                yv1 yv1Var2 = yv1.k;
                while (!atomicReference.compareAndSet(yv1Var, yv1Var2) && atomicReference.get() == yv1Var) {
                }
                wv1Var.l.h.a(9);
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(dd2 dd2Var) {
        Object obj;
        while (true) {
            Object obj2 = this.j.get();
            if (obj2 == null || obj2.equals(aa3.s)) {
                obj = dd2Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, dd2Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.j).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = dd2Var;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.j;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.k) {
                            o();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[LOOP:0: B:29:0x0075->B:44:0x00c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6 A[EDGE_INSN: B:51:0x00c6->B:45:0x00c6 BREAK  A[LOOP:0: B:29:0x0075->B:44:0x00c3], SYNTHETIC] */
    public final void y(Object obj) {
        e72 e72VarW;
        boolean z;
        int i;
        dr0 dr0Var = this.C;
        if (dr0Var.A > 0 || (e72VarW = dr0Var.w()) == null) {
            return;
        }
        int i2 = e72VarW.b | 1;
        e72VarW.b = i2;
        if ((i2 & 32) != 0) {
            z = false;
        } else {
            bj1 bj1Var = e72VarW.f;
            if (bj1Var == null) {
                bj1Var = new bj1();
                e72VarW.f = bj1Var;
            }
            int i3 = e72VarW.e;
            int iC = bj1Var.c(obj);
            if (iC < 0) {
                iC = ~iC;
                i = -1;
            } else {
                i = bj1Var.c[iC];
            }
            bj1Var.b[iC] = obj;
            bj1Var.c[iC] = i3;
            if (i == e72VarW.e) {
                z = true;
            } else {
                z = false;
            }
        }
        this.A.A();
        if (z) {
            return;
        }
        if (obj instanceof rn2) {
            ((rn2) obj).f(1);
        }
        p02.e(this.n, obj, e72VarW);
        if (obj instanceof o90) {
            o90 o90Var = (o90) obj;
            n90 n90VarH = o90Var.h();
            mj1 mj1Var = this.q;
            p02.G(mj1Var, obj);
            bj1 bj1Var2 = n90VarH.e;
            Object[] objArr = bj1Var2.b;
            long[] jArr = bj1Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j = jArr[i4];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i4 != length) {
                            break;
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j & 255) < 128) {
                                qn2 qn2Var = (qn2) objArr[(i4 << 3) + i7];
                                if (qn2Var instanceof rn2) {
                                    ((rn2) qn2Var).f(1);
                                }
                                p02.e(mj1Var, qn2Var, obj);
                            }
                            j >>= i5;
                            i7++;
                            i5 = i5;
                        }
                        if (i6 != i5) {
                            break;
                        } else if (i4 != length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
            Object obj2 = n90VarH.f;
            mj1 mj1Var2 = e72VarW.g;
            if (mj1Var2 == null) {
                mj1Var2 = new mj1();
                e72VarW.g = mj1Var2;
            }
            mj1Var2.n(o90Var, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[Catch: all -> 0x0060, LOOP:0: B:11:0x001f->B:21:0x0056, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:18:0x004e, B:21:0x0056, B:22:0x0059), top: B:28:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x005e A[EDGE_INSN: B:30:0x005e->B:23:0x005e BREAK  A[LOOP:0: B:11:0x001f->B:21:0x0056], SYNTHETIC] */
    public final void z(Object obj) {
        synchronized (this.k) {
            u(obj);
            Object objG = this.q.g(obj);
            if (objG != null) {
                if (objG instanceof nj1) {
                    nj1 nj1Var = (nj1) objG;
                    Object[] objArr = nj1Var.b;
                    long[] jArr = nj1Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i != length) {
                                    break;
                                    break;
                                }
                                i++;
                            } else {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        u((o90) objArr[(i << 3) + i3]);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                } else if (i != length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                } else {
                    u((o90) objG);
                }
            }
        }
    }
}
