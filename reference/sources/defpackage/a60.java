package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a60 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ a60(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
        this.m = obj5;
        this.n = obj6;
        this.o = obj7;
        this.p = obj8;
        this.q = obj9;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x01fe A[LOOP:2: B:110:0x01c7->B:125:0x01fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:276:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0187 A[LOOP:4: B:246:0x0150->B:91:0x0187, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    @Override // defpackage.vp0
    public final Object h(Object obj) {
        boolean z;
        j23 j23Var;
        uk2 uk2Var;
        char c;
        long j;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        switch (this.h) {
            case 0:
                qy0 qy0Var = (qy0) this.i;
                hq hqVar = (hq) this.j;
                iq iqVar = (iq) this.k;
                vp0 vp0Var = (vp0) this.l;
                dq dqVar = (dq) this.m;
                Long l = (Long) this.n;
                y40 y40Var = (y40) this.o;
                vf2 vf2Var = (vf2) this.p;
                s40 s40Var = (s40) this.q;
                rt1 rt1Var = n60.a;
                ((p71) obj).p0(((qy0Var.i - qy0Var.h) + 1) * 12, null, z9.m, new nx(72599078, true, new b60(hqVar, iqVar, vp0Var, dqVar, l, y40Var, vf2Var, s40Var)));
                return j23.a;
            default:
                j23 j23Var2 = j23.a;
                l72 l72Var = (l72) this.i;
                nj1 nj1Var = (nj1) this.j;
                nj1 nj1Var2 = (nj1) this.k;
                ArrayList arrayList3 = (ArrayList) this.l;
                ArrayList arrayList4 = (ArrayList) this.m;
                nj1 nj1Var3 = (nj1) this.n;
                ?? r8 = (ArrayList) this.o;
                nj1 nj1Var4 = (nj1) this.p;
                dd2 dd2Var = (dd2) this.q;
                long jLongValue = ((Long) obj).longValue();
                nn2 nn2Var = l72.z;
                synchronized (l72Var.c) {
                    z = l72Var.z();
                }
                boolean z3 = false;
                if (z) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        ((bj) l72Var.a.j).c(new u7(jLongValue, (byte) 1));
                        synchronized (bl2.c) {
                            nj1 nj1Var5 = bl2.j.h;
                            z2 = nj1Var5 != null && nj1Var5.h();
                        }
                        if (z2) {
                            bl2.c();
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    l72Var.K();
                    synchronized (l72Var.c) {
                        uj1 uj1Var = l72Var.i;
                        Object[] objArr = uj1Var.h;
                        int i = uj1Var.j;
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList3.add((oz) objArr[i2]);
                        }
                        l72Var.i.g();
                    }
                    nj1Var.b();
                    nj1Var2.b();
                    while (true) {
                        if (arrayList3.isEmpty() && arrayList4.isEmpty()) {
                            uk2 uk2VarH = bl2.h();
                            uk2 uz2Var = uk2VarH instanceof rj1 ? new uz2((rj1) uk2VarH, null, null, true, false) : new vz2(uk2VarH, null, true, z3);
                            try {
                                uk2 uk2VarJ = uz2Var.j();
                                try {
                                    if (!r8.isEmpty()) {
                                        try {
                                            int size = r8.size();
                                            for (?? r3 = z3; r3 < size; r3++) {
                                                nj1Var4.a((oz) r8.get(r3));
                                            }
                                            int size2 = r8.size();
                                            for (?? r4 = z3; r4 < size2; r4++) {
                                                ((oz) r8.get(r4)).d();
                                            }
                                            r8.clear();
                                        } catch (Throwable th2) {
                                            try {
                                                l72Var.J(th2, null);
                                                k72.t(l72Var, arrayList3, arrayList4, r8, nj1Var3, nj1Var4, nj1Var, nj1Var2);
                                                r8.clear();
                                                uk2.q(uk2VarJ);
                                                uz2Var.c();
                                                Trace.endSection();
                                                return j23Var2;
                                            } catch (Throwable th3) {
                                                r8.clear();
                                                throw th3;
                                            }
                                        }
                                    }
                                    try {
                                        if (nj1Var3.h()) {
                                            try {
                                                nj1Var4.j(nj1Var3);
                                                Object[] objArr2 = nj1Var3.b;
                                                c = 7;
                                                long[] jArr = nj1Var3.a;
                                                int length = jArr.length - 2;
                                                if (length >= 0) {
                                                    j23Var = j23Var2;
                                                    int i3 = 0;
                                                    j = 128;
                                                    while (true) {
                                                        try {
                                                            long j2 = jArr[i3];
                                                            uk2Var = uk2VarJ;
                                                            long[] jArr2 = jArr;
                                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                                                for (int i5 = 0; i5 < i4; i5++) {
                                                                    if ((j2 & 255) < 128) {
                                                                        try {
                                                                            ((oz) objArr2[(i3 << 3) + i5]).f();
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                            try {
                                                                                l72Var.J(th, null);
                                                                                k72.t(l72Var, arrayList3, arrayList4, r8, nj1Var3, nj1Var4, nj1Var, nj1Var2);
                                                                                nj1Var3.b();
                                                                                uk2.q(uk2Var);
                                                                                uz2Var.c();
                                                                                Trace.endSection();
                                                                                return j23Var;
                                                                            } catch (Throwable th5) {
                                                                                nj1Var3.b();
                                                                                throw th5;
                                                                            }
                                                                        }
                                                                    }
                                                                    j2 >>= 8;
                                                                }
                                                                if (i4 == 8) {
                                                                    if (i3 != length) {
                                                                        i3++;
                                                                        uk2VarJ = uk2Var;
                                                                        jArr = jArr2;
                                                                    }
                                                                }
                                                            } else if (i3 != length) {
                                                                i3++;
                                                                uk2VarJ = uk2Var;
                                                                jArr = jArr2;
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            uk2Var = uk2VarJ;
                                                            l72Var.J(th, null);
                                                            k72.t(l72Var, arrayList3, arrayList4, r8, nj1Var3, nj1Var4, nj1Var, nj1Var2);
                                                            nj1Var3.b();
                                                            uk2.q(uk2Var);
                                                            uz2Var.c();
                                                            Trace.endSection();
                                                            return j23Var;
                                                        }
                                                    }
                                                } else {
                                                    j23Var = j23Var2;
                                                    uk2Var = uk2VarJ;
                                                    j = 128;
                                                }
                                                nj1Var3.b();
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j23Var = j23Var2;
                                            }
                                        } else {
                                            j23Var = j23Var2;
                                            uk2Var = uk2VarJ;
                                            c = 7;
                                            j = 128;
                                        }
                                        if (nj1Var4.h()) {
                                            try {
                                                Object[] objArr3 = nj1Var4.b;
                                                long[] jArr3 = nj1Var4.a;
                                                int length2 = jArr3.length - 2;
                                                if (length2 >= 0) {
                                                    int i6 = 0;
                                                    while (true) {
                                                        long j3 = jArr3[i6];
                                                        arrayList = arrayList3;
                                                        arrayList2 = arrayList4;
                                                        if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                                            for (int i8 = 0; i8 < i7; i8++) {
                                                                if ((j3 & 255) < j) {
                                                                    try {
                                                                        ((oz) objArr3[(i6 << 3) + i8]).g();
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                        try {
                                                                            l72Var.J(th, null);
                                                                            k72.t(l72Var, arrayList, arrayList2, r8, nj1Var3, nj1Var4, nj1Var, nj1Var2);
                                                                            nj1Var4.b();
                                                                            uk2.q(uk2Var);
                                                                            uz2Var.c();
                                                                            Trace.endSection();
                                                                            return j23Var;
                                                                        } catch (Throwable th9) {
                                                                            nj1Var4.b();
                                                                            throw th9;
                                                                        }
                                                                    }
                                                                }
                                                                j3 >>= 8;
                                                            }
                                                            if (i7 == 8) {
                                                                if (i6 != length2) {
                                                                    i6++;
                                                                    arrayList3 = arrayList;
                                                                    arrayList4 = arrayList2;
                                                                }
                                                            }
                                                        } else if (i6 != length2) {
                                                            i6++;
                                                            arrayList3 = arrayList;
                                                            arrayList4 = arrayList2;
                                                        }
                                                    }
                                                }
                                                nj1Var4.b();
                                            } catch (Throwable th10) {
                                                th = th10;
                                                arrayList = arrayList3;
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                        uk2.q(uk2Var);
                                        uz2Var.c();
                                        synchronized (l72Var.c) {
                                            if (l72Var.y() != null) {
                                                ez.a("unexpected to get continuation here");
                                            }
                                            break;
                                        }
                                        bl2.h().m();
                                        nj1Var2.b();
                                        nj1Var.b();
                                        l72Var.q = null;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        uk2.q(uk2Var);
                                        throw th;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    uk2Var = uk2VarJ;
                                    uk2.q(uk2Var);
                                    throw th;
                                }
                            } catch (Throwable th13) {
                                uz2Var.c();
                                throw th13;
                            }
                        } else {
                            j23Var = j23Var2;
                            try {
                                int size3 = arrayList3.size();
                                for (int i9 = 0; i9 < size3; i9++) {
                                    oz ozVar = (oz) arrayList3.get(i9);
                                    oz ozVarI = l72Var.I(ozVar, nj1Var);
                                    if (ozVarI != null) {
                                        r8.add(ozVarI);
                                    }
                                    nj1Var2.a(ozVar);
                                }
                                arrayList3.clear();
                                if (nj1Var.h() || l72Var.i.j != 0) {
                                    synchronized (l72Var.c) {
                                        List listD = l72Var.D();
                                        int size4 = listD.size();
                                        for (int i10 = 0; i10 < size4; i10++) {
                                            oz ozVar2 = (oz) listD.get(i10);
                                            if (!nj1Var2.c(ozVar2) && ozVar2.v(dd2Var)) {
                                                arrayList3.add(ozVar2);
                                            }
                                        }
                                        uj1 uj1Var2 = l72Var.i;
                                        int i11 = uj1Var2.j;
                                        int i12 = 0;
                                        int i13 = 0;
                                        while (true) {
                                            Object[] objArr4 = uj1Var2.h;
                                            if (i12 < i11) {
                                                oz ozVar3 = (oz) objArr4[i12];
                                                if (!nj1Var2.c(ozVar3) && !arrayList3.contains(ozVar3)) {
                                                    arrayList3.add(ozVar3);
                                                    i13++;
                                                } else if (i13 > 0) {
                                                    Object[] objArr5 = uj1Var2.h;
                                                    objArr5[i12 - i13] = objArr5[i12];
                                                }
                                                i12++;
                                            } else {
                                                int i14 = i11 - i13;
                                                Arrays.fill(objArr4, i14, i11, (Object) null);
                                                uj1Var2.j = i14;
                                            }
                                        }
                                    }
                                }
                                if (arrayList3.isEmpty()) {
                                    try {
                                        k72.u(arrayList4, l72Var);
                                        while (!arrayList4.isEmpty()) {
                                            List listH = l72Var.H(arrayList4, nj1Var);
                                            nj1Var3.getClass();
                                            Iterator it = listH.iterator();
                                            while (it.hasNext()) {
                                                nj1Var3.k(it.next());
                                            }
                                            k72.u(arrayList4, l72Var);
                                        }
                                    } catch (Throwable th14) {
                                        l72Var.J(th14, null);
                                        k72.t(l72Var, arrayList3, arrayList4, r8, nj1Var3, nj1Var4, nj1Var, nj1Var2);
                                    }
                                }
                                j23Var2 = j23Var;
                                z3 = false;
                            } catch (Throwable th15) {
                                try {
                                    l72Var.J(th15, null);
                                    k72.t(l72Var, arrayList3, arrayList4, r8, nj1Var3, nj1Var4, nj1Var, nj1Var2);
                                    arrayList3.clear();
                                } catch (Throwable th16) {
                                    arrayList3.clear();
                                    throw th16;
                                }
                            }
                        }
                        Trace.endSection();
                        return j23Var;
                    }
                } catch (Throwable th17) {
                    Trace.endSection();
                    throw th17;
                }
        }
    }
}
