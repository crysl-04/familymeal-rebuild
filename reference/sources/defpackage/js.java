package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class js implements qk0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public js(x72 x72Var, qk0 qk0Var, String[] strArr, int[] iArr) {
        this.h = (byte) 4;
        this.i = x72Var;
        this.l = qk0Var;
        this.j = strArr;
        this.k = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r1.m(r13, r3) == r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if (r1.m(r13, r3) == r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int[] r14, defpackage.m10 r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.j
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.l
            qk0 r1 = (defpackage.qk0) r1
            java.lang.Object r2 = r13.i
            x72 r2 = (defpackage.x72) r2
            boolean r3 = r15 instanceof defpackage.j03
            if (r3 == 0) goto L1f
            r3 = r15
            j03 r3 = (defpackage.j03) r3
            int r4 = r3.n
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1f
            int r4 = r4 - r5
            r3.n = r4
            goto L24
        L1f:
            j03 r3 = new j03
            r3.<init>(r13, r15)
        L24:
            java.lang.Object r15 = r3.l
            int r4 = r3.n
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3d
            if (r4 == r7) goto L37
            if (r4 == r6) goto L37
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r13)
            return r5
        L37:
            int[] r14 = r3.k
            defpackage.m02.y(r15)
            goto L97
        L3d:
            defpackage.m02.y(r15)
            java.lang.Object r15 = r2.h
            y20 r4 = defpackage.y20.h
            if (r15 != 0) goto L55
            java.util.Set r13 = defpackage.gi.c0(r0)
            r3.k = r14
            r3.n = r7
            java.lang.Object r13 = r1.m(r13, r3)
            if (r13 != r4) goto L97
            goto L96
        L55:
            java.lang.Object r13 = r13.k
            int[] r13 = (int[]) r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = r8
        L61:
            if (r8 >= r7) goto L82
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r2.h
            if (r12 == 0) goto L7c
            int[] r12 = (int[]) r12
            r9 = r13[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L78
            r15.add(r10)
        L78:
            int r8 = r8 + 1
            r9 = r11
            goto L61
        L7c:
            java.lang.String r13 = "Required value was null."
            defpackage.li1.g(r13)
            return r5
        L82:
            boolean r13 = r15.isEmpty()
            if (r13 != 0) goto L97
            java.util.Set r13 = defpackage.dv.U0(r15)
            r3.k = r14
            r3.n = r6
            java.lang.Object r13 = r1.m(r13, r3)
            if (r13 != r4) goto L97
        L96:
            return r4
        L97:
            r2.h = r14
            j23 r13 = defpackage.j23.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js.a(int[], m10):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    @Override // defpackage.qk0
    public final Object m(Object obj, m10 m10Var) {
        is isVar;
        byte b = this.h;
        byte b2 = 0;
        Object obj2 = this.l;
        byte b3 = 1;
        Object obj3 = this.j;
        Object obj4 = this.k;
        j23 j23Var = j23.a;
        Object obj5 = this.i;
        switch (b) {
            case 0:
                if (m10Var instanceof is) {
                    isVar = (is) m10Var;
                    int i = isVar.o;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        isVar.o = i - Integer.MIN_VALUE;
                    } else {
                        isVar = new is(this, m10Var);
                    }
                } else {
                    isVar = new is(this, m10Var);
                }
                Object obj6 = isVar.m;
                int i2 = isVar.o;
                if (i2 == 0) {
                    m02.y(obj6);
                    s01 s01Var = (s01) ((x72) obj5).h;
                    if (s01Var != null) {
                        s01Var.a(new ft("Child of the scoped flow was cancelled", b2));
                        isVar.k = this;
                        isVar.l = obj;
                        isVar.o = 1;
                        Object objX = s01Var.x(isVar);
                        y20 y20Var = y20.h;
                        if (objX == y20Var) {
                            return y20Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        li1.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = isVar.l;
                    this = isVar.k;
                    m02.y(obj6);
                }
                ((x72) this.i).h = ie1.p((x20) this.j, null, new hs((ks) this.k, (qk0) this.l, obj, null), 1);
                return j23Var;
            case 1:
                kv2 kv2Var = (kv2) obj4;
                p81 p81Var = (p81) obj5;
                if (((Boolean) obj).booleanValue() && p81Var.b()) {
                    dt.S((aw2) obj3, p81Var, kv2Var.l(), (nu0) obj2, kv2Var.b);
                } else {
                    dt.z(p81Var);
                }
                return j23Var;
            case 2:
                ((Number) obj).intValue();
                b81 b81Var = (b81) obj5;
                int iH = b81Var.h() / 12;
                int iH2 = (b81Var.h() % 12) + 1;
                hq hqVar = (hq) obj4;
                int i3 = ((qy0) obj2).h + iH;
                hqVar.getClass();
                ((vp0) obj3).h(new Long(hqVar.c(LocalDate.of(i3, iH2, 1)).e));
                return j23Var;
            case 3:
                gz0 gz0Var = (gz0) obj;
                v72 v72Var = (v72) obj4;
                v72 v72Var2 = (v72) obj3;
                v72 v72Var3 = (v72) obj5;
                if (gz0Var instanceof m22) {
                    v72Var3.h++;
                } else if ((gz0Var instanceof n22) || (gz0Var instanceof l22)) {
                    v72Var3.h--;
                } else if (gz0Var instanceof ut0) {
                    v72Var2.h++;
                } else if (gz0Var instanceof vt0) {
                    v72Var2.h--;
                } else if (gz0Var instanceof wl0) {
                    v72Var.h++;
                } else if (gz0Var instanceof xl0) {
                    v72Var.h--;
                }
                boolean z = v72Var3.h > 0;
                boolean z2 = v72Var2.h > 0;
                boolean z3 = v72Var.h > 0;
                z60 z60Var = (z60) obj2;
                if (z60Var.w != z) {
                    z60Var.w = z;
                    b2 = 1;
                }
                if (z60Var.x != z2) {
                    z60Var.x = z2;
                    b2 = 1;
                }
                if (z60Var.y != z3) {
                    z60Var.y = z3;
                } else {
                    b3 = b2;
                }
                if (b3 != 0) {
                    dt.H(z60Var);
                }
                return j23Var;
            default:
                return a((int[]) obj, m10Var);
        }
    }

    public /* synthetic */ js(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
    }
}
