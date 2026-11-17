package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p61 {
    public final Object a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public p61(byte b) {
        switch (b) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.a = rz1.x(bool);
                this.b = new hu1(1.0f);
                this.c = rz1.x(bool);
                this.d = new hu1(1.0f);
                this.e = rz1.x(bool);
                this.f = rz1.x(new ez2(4539628425446424576L));
                this.g = rz1.x(bool);
                this.h = rz1.x(new kv(kv.f));
                break;
            default:
                long[] jArr = bd2.a;
                this.a = new mj1();
                nj1 nj1Var = cd2.a;
                this.c = new nj1();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f = new ArrayList();
                this.g = new ArrayList();
                this.h = new ArrayList();
                break;
        }
    }

    public static int e(int[] iArr, w61 w61Var, boolean z) {
        int iD = w61Var.d();
        int iC = w61Var.c() + iD;
        int iMax = 0;
        while (iD < iC) {
            int iY = t03.y(w61Var, z) + iArr[iD];
            iArr[iD] = iY;
            iMax = Math.max(iMax, iY);
            iD++;
        }
        return iMax;
    }

    public final void a(int i, Object obj) {
        wi0.t(((mj1) this.a).g(obj));
    }

    public final long b() {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        wi0.t(arrayList.get(0));
        throw null;
    }

    public final void c(int i, int i2, ArrayList arrayList, u8 u8Var, qy qyVar, boolean z, boolean z2, int i3, boolean z3, int i4, int i5) throws Throwable {
        boolean z4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Throwable th;
        mj1 mj1Var;
        ArrayList arrayList6;
        ArrayList arrayList7;
        mj1 mj1Var2;
        byte b;
        ArrayList arrayList8 = (ArrayList) this.e;
        ArrayList arrayList9 = (ArrayList) this.d;
        nj1 nj1Var = (nj1) this.c;
        Object obj = this.a;
        mj1 mj1Var3 = (mj1) obj;
        ArrayList arrayList10 = (ArrayList) this.g;
        ArrayList arrayList11 = (ArrayList) this.f;
        u8 u8Var2 = (u8) this.b;
        this.b = u8Var;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            w61 w61Var = (w61) arrayList.get(i6);
            int size2 = w61Var.h().size();
            int i7 = 0;
            while (i7 < size2) {
                ((ny1) w61Var.h().get(i7)).l();
                i7++;
                obj = obj;
            }
        }
        Object obj2 = obj;
        if (mj1Var3.i()) {
            d();
            return;
        }
        w61 w61Var2 = (w61) dv.y0(arrayList);
        if (w61Var2 != null) {
            w61Var2.getIndex();
        }
        boolean z5 = z2 || !z3;
        Object[] objArr = mj1Var3.b;
        long[] jArr = mj1Var3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j = jArr[i8];
                arrayList2 = arrayList10;
                arrayList3 = arrayList11;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j & 255) < 128) {
                            nj1Var.a(objArr[(i8 << 3) + i10]);
                        }
                        j >>= 8;
                        i10++;
                        z5 = z5;
                    }
                    z4 = z5;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    z4 = z5;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                arrayList10 = arrayList2;
                arrayList11 = arrayList3;
                z5 = z4;
            }
        } else {
            z4 = z5;
            arrayList2 = arrayList10;
            arrayList3 = arrayList11;
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            w61 w61Var3 = (w61) arrayList.get(i11);
            nj1Var.l(w61Var3.getKey());
            int size4 = w61Var3.h().size();
            for (int i12 = 0; i12 < size4; i12++) {
                ((ny1) w61Var3.h().get(i12)).l();
            }
            wi0.t(((mj1) obj2).l(w61Var3.getKey()));
        }
        int[] iArr = new int[i3];
        Throwable th2 = null;
        if (z4 && u8Var2 != null) {
            if (arrayList9.isEmpty()) {
                b = 0;
            } else {
                if (arrayList9.size() > 1) {
                    hv.p0(arrayList9, new o61(u8Var2, (byte) 2));
                }
                if (arrayList9.size() > 0) {
                    w61 w61Var4 = (w61) arrayList9.get(0);
                    e(iArr, w61Var4, z);
                    Object objG = mj1Var3.g(w61Var4.getKey());
                    objG.getClass();
                    wi0.t(objG);
                    w61Var4.b(0);
                    throw null;
                }
                b = 0;
                Arrays.fill(iArr, 0, i3, 0);
            }
            if (!arrayList8.isEmpty()) {
                if (arrayList8.size() > 1) {
                    hv.p0(arrayList8, new o61(u8Var2, b));
                }
                if (arrayList8.size() > 0) {
                    w61 w61Var5 = (w61) arrayList8.get(b);
                    e(iArr, w61Var5, z);
                    t03.y(w61Var5, z);
                    Object objG2 = mj1Var3.g(w61Var5.getKey());
                    objG2.getClass();
                    wi0.t(objG2);
                    w61Var5.b(b);
                    throw null;
                }
                Arrays.fill(iArr, (int) b, i3, (int) b);
            }
        }
        Object[] objArr2 = nj1Var.b;
        long[] jArr2 = nj1Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j2 = jArr2[i13];
                th = th2;
                mj1 mj1Var4 = mj1Var3;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j2 & 255) < 128) {
                            mj1Var2 = mj1Var4;
                            wi0.t(mj1Var2.g(objArr2[(i13 << 3) + i15]));
                        } else {
                            mj1Var2 = mj1Var4;
                        }
                        j2 >>= 8;
                        i15++;
                        mj1Var4 = mj1Var2;
                        arrayList9 = arrayList9;
                        arrayList8 = arrayList8;
                    }
                    arrayList4 = arrayList8;
                    arrayList5 = arrayList9;
                    mj1Var = mj1Var4;
                    if (i14 != 8) {
                        break;
                    }
                } else {
                    arrayList4 = arrayList8;
                    arrayList5 = arrayList9;
                    mj1Var = mj1Var4;
                }
                if (i13 == length2) {
                    break;
                }
                i13++;
                th2 = th;
                mj1Var3 = mj1Var;
                arrayList9 = arrayList5;
                arrayList8 = arrayList4;
            }
        } else {
            arrayList4 = arrayList8;
            arrayList5 = arrayList9;
            th = null;
            mj1Var = mj1Var3;
        }
        if (arrayList3.isEmpty()) {
            arrayList6 = arrayList3;
        } else {
            if (arrayList3.size() > 1) {
                arrayList6 = arrayList3;
                hv.p0(arrayList6, new o61(u8Var, (byte) 3));
            } else {
                arrayList6 = arrayList3;
            }
            if (arrayList6.size() > 0) {
                w61 w61Var6 = (w61) arrayList6.get(0);
                Object objG3 = mj1Var.g(w61Var6.getKey());
                objG3.getClass();
                wi0.t(objG3);
                e(iArr, w61Var6, z);
                if (!z2) {
                    throw th;
                }
                ((w61) dv.x0(arrayList)).b(0);
                throw th;
            }
            Arrays.fill(iArr, 0, i3, 0);
        }
        if (arrayList2.isEmpty()) {
            arrayList7 = arrayList2;
        } else {
            byte b2 = 1;
            if (arrayList2.size() > 1) {
                arrayList7 = arrayList2;
                hv.p0(arrayList7, new o61(u8Var, b2));
            } else {
                arrayList7 = arrayList2;
            }
            if (arrayList7.size() > 0) {
                w61 w61Var7 = (w61) arrayList7.get(0);
                Object objG4 = mj1Var.g(w61Var7.getKey());
                objG4.getClass();
                wi0.t(objG4);
                e(iArr, w61Var7, z);
                throw th;
            }
        }
        Collections.reverse(arrayList6);
        arrayList.addAll(0, arrayList6);
        arrayList.addAll(arrayList7);
        arrayList5.clear();
        arrayList4.clear();
        arrayList6.clear();
        arrayList7.clear();
        nj1Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004c A[LOOP:0: B:7:0x0015->B:18:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x004f A[EDGE_INSN: B:22:0x004f->B:19:0x004f BREAK  A[LOOP:0: B:7:0x0015->B:18:0x004c], SYNTHETIC] */
    public final void d() {
        mj1 mj1Var = (mj1) this.a;
        if (mj1Var.j()) {
            Object[] objArr = mj1Var.c;
            long[] jArr = mj1Var.a;
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
                                wi0.t(objArr[(i << 3) + i3]);
                                throw null;
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
            mj1Var.a();
        }
    }
}
