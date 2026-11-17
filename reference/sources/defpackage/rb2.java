package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class rb2 implements qb2 {
    public final vp0 h;
    public final mj1 i;
    public mj1 j;

    public rb2(Map map, vp0 vp0Var) {
        mj1 mj1Var;
        this.h = vp0Var;
        if (map == null || map.isEmpty()) {
            mj1Var = null;
        } else {
            mj1Var = new mj1(map.size());
            for (Map.Entry entry : map.entrySet()) {
                mj1Var.n(entry.getKey(), entry.getValue());
            }
        }
        this.i = mj1Var;
    }

    @Override // defpackage.qb2
    public final eg a(String str, kp0 kp0Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!vs.M(str.charAt(i))) {
                mj1 mj1Var = this.j;
                if (mj1Var == null) {
                    long[] jArr = bd2.a;
                    mj1Var = new mj1();
                    this.j = mj1Var;
                }
                Object objG = mj1Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    mj1Var.n(str, objG);
                }
                ((List) objG).add(kp0Var);
                return new eg((Object) mj1Var, (Object) str, (Object) kp0Var, (byte) 18);
            }
        }
        wg.m("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.qb2
    public final boolean c(Object obj) {
        return ((Boolean) this.h.h(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // defpackage.qb2
    public final Map d() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        mj1 mj1Var = this.i;
        if (mj1Var == null && this.j == null) {
            return bg0.h;
        }
        int i3 = 0;
        int i4 = mj1Var != null ? mj1Var.e : 0;
        mj1 mj1Var2 = this.j;
        HashMap map = new HashMap(i4 + (mj1Var2 != null ? mj1Var2.e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (mj1Var != null) {
            Object[] objArr = mj1Var.b;
            Object[] objArr2 = mj1Var.c;
            long[] jArr3 = mj1Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        mj1 mj1Var3 = this.j;
        if (mj1Var3 != null) {
            Object[] objArr3 = mj1Var3.b;
            Object[] objArr4 = mj1Var3.c;
            long[] jArr4 = mj1Var3.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objA = ((kp0) list.get(i3)).a();
                                    if (objA != null) {
                                        if (!c(objA)) {
                                            throw new IllegalStateException(rz1.m(objA).toString());
                                        }
                                        map.put(str, lt.c(objA));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objA2 = ((kp0) list.get(i3)).a();
                                        if (objA2 != null && !c(objA2)) {
                                            throw new IllegalStateException(rz1.m(objA2).toString());
                                        }
                                        arrayList.add(objA2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // defpackage.qb2
    public final Object e(String str) {
        mj1 mj1Var = this.i;
        List list = mj1Var != null ? (List) mj1Var.l(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && mj1Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = mj1Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = mj1Var.c;
            Object obj = objArr[iF];
            mj1Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }
}
