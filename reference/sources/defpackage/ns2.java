package defpackage;

import java.util.List;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ns2 {
    public static final md0 a = new md0(3, null, (byte) 2);

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.sq2 r5, boolean r6, defpackage.s02 r7, defpackage.rk r8) {
        /*
            boolean r0 = r8 instanceof defpackage.es2
            if (r0 == 0) goto L13
            r0 = r8
            es2 r0 = (defpackage.es2) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            es2 r0 = new es2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.n
            int r1 = r0.o
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.m
            s02 r6 = r0.l
            sq2 r7 = r0.k
            defpackage.m02.y(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r5)
            r5 = 0
            return r5
        L36:
            defpackage.m02.y(r8)
        L39:
            r0.k = r5
            r0.l = r7
            r0.m = r6
            r0.o = r2
            java.lang.Object r8 = r5.a(r7, r0)
            y20 r1 = defpackage.y20.h
            if (r8 != r1) goto L4a
            return r1
        L4a:
            q02 r8 = (defpackage.q02) r8
            boolean r1 = d(r8, r6)
            if (r1 == 0) goto L39
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns2.a(sq2, boolean, s02, rk):java.lang.Object");
    }

    public static /* synthetic */ Object b(sq2 sq2Var, rk rkVar, int i) {
        return a(sq2Var, (i & 1) != 0, (i & 2) != 0 ? s02.i : s02.h, rkVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a A[LOOP:1: B:22:0x005e->B:25:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0060
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.sq2 r7, defpackage.n10 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.fs2
            if (r0 == 0) goto L13
            r0 = r8
            fs2 r0 = (defpackage.fs2) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            fs2 r0 = new fs2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.l
            int r1 = r0.m
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            sq2 r7 = r0.k
            defpackage.m02.y(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.m02.y(r8)
        L31:
            r0.k = r7
            r0.m = r2
            s02 r8 = defpackage.s02.i
            java.lang.Object r8 = r7.a(r8, r0)
            y20 r1 = defpackage.y20.h
            if (r8 != r1) goto L40
            return r1
        L40:
            q02 r8 = (defpackage.q02) r8
            java.util.List r1 = r8.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4a:
            if (r5 >= r3) goto L58
            java.lang.Object r6 = r1.get(r5)
            z02 r6 = (defpackage.z02) r6
            r6.a()
            int r5 = r5 + 1
            goto L4a
        L58:
            java.util.List r8 = r8.a
            int r1 = r8.size()
        L5e:
            if (r4 >= r1) goto L6d
            java.lang.Object r3 = r8.get(r4)
            z02 r3 = (defpackage.z02) r3
            boolean r3 = r3.d
            if (r3 != 0) goto L31
            int r4 = r4 + 1
            goto L5e
        L6d:
            j23 r7 = defpackage.j23.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns2.c(sq2, n10):java.lang.Object");
    }

    public static boolean d(q02 q02Var, boolean z) {
        List list = q02Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            z02 z02Var = (z02) list.get(i);
            if (!(z ? r02.j(z02Var) : r02.k(z02Var))) {
                return false;
            }
        }
        return true;
    }

    public static dn2 e(x20 x20Var, s01 s01Var, zp0 zp0Var) {
        return ie1.p(x20Var, null, new ul(s01Var, zp0Var, null, (byte) 1), 1);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:25:0x0186  */
    /* JADX WARN: Code duplicated, block: B:26:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:28:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:32:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:34:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:37:0x0204  */
    /* JADX WARN: Code duplicated, block: B:39:0x022a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0236  */
    /* JADX WARN: Code duplicated, block: B:44:0x023a  */
    /* JADX WARN: Code duplicated, block: B:45:0x023f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0243  */
    /* JADX WARN: Code duplicated, block: B:50:0x024b  */
    /* JADX WARN: Code duplicated, block: B:51:0x025b  */
    /* JADX WARN: Code duplicated, block: B:53:0x026f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0271 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0273  */
    /* JADX WARN: Code duplicated, block: B:57:0x027e  */
    /* JADX WARN: Code duplicated, block: B:59:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x02b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:68:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:72:0x030e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0319  */
    /* JADX WARN: Code duplicated, block: B:76:0x0334  */
    /* JADX WARN: Code duplicated, block: B:79:0x0347  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x036e  */
    /* JADX WARN: Code duplicated, block: B:85:0x037a  */
    /* JADX WARN: Code duplicated, block: B:87:0x037e  */
    /* JADX WARN: Code duplicated, block: B:88:0x038b  */
    /* JADX WARN: Code duplicated, block: B:90:0x038f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0398  */
    /* JADX WARN: Code duplicated, block: B:94:0x03af  */
    /* JADX WARN: Code duplicated, block: B:96:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:98:0x03c5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v17, types: [z02] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r26v1, types: [m10] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [m10, w] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v31, types: [m10] */
    /* JADX WARN: Type inference failed for: r5v34, types: [m10] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    public static final Object f(sq2 sq2Var, x20 x20Var, k22 k22Var, aq0 aq0Var, a20 a20Var, rk rkVar) {
        js2 js2Var;
        x20 x20Var2;
        k22 k22Var2;
        ?? r5;
        aq0 aq0Var2;
        vp0 vp0Var;
        byte b;
        Object objB;
        vp0 vp0Var2;
        vp0 vp0Var3;
        z02 z02Var;
        dn2 dn2VarP;
        k22 k22Var3;
        Object objG;
        sq2 sq2Var2;
        s01 s01Var;
        x20 x20Var3;
        vp0 vp0Var4;
        aq0 aq0Var3;
        k22 k22Var4;
        Object objH;
        aq0 aq0Var4;
        vp0 vp0Var5;
        x20 x20Var4;
        vp0 vp0Var6;
        vp0 vp0Var7;
        z02 z02Var2;
        k22 k22Var5;
        dn2 dn2VarE;
        dn2 dn2Var;
        Object objO;
        vp0 vp0Var8;
        aq0 aq0Var5;
        sq2 sq2Var3;
        vp0 vp0Var9;
        vp0 vp0Var10;
        z02 z02Var3;
        s01 s01Var2;
        oc1 oc1Var;
        m10 m10Var;
        k22 k22Var6;
        x20 x20Var5;
        z02 z02Var4;
        m10 m10Var2;
        dn2 dn2VarP2;
        k22 k22Var7;
        vp0 vp0Var11;
        Object objG2;
        z02 z02Var5;
        k22 k22Var8;
        x20 x20Var6;
        sq2 sq2Var4;
        vp0 vp0Var12;
        s01 s01Var3;
        z02 z02Var6;
        s01 s01Var4;
        z02 z02Var7;
        vp0 vp0Var13;
        x20 x20Var7;
        vp0 vp0Var14;
        vp0 vp0Var15;
        ?? r12;
        ?? r6;
        vp0 vp0Var16;
        oc1 oc1Var2;
        s01 s01Var5;
        x20 x20Var8;
        ?? r7;
        sq2 sq2Var5 = sq2Var;
        if (rkVar instanceof js2) {
            js2Var = (js2) rkVar;
            int i = js2Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                js2Var.u = i - Integer.MIN_VALUE;
            } else {
                js2Var = new js2(rkVar);
            }
        } else {
            js2Var = new js2(rkVar);
        }
        Object objH2 = js2Var.t;
        int i2 = js2Var.u;
        s02 s02Var = s02.i;
        nc1 nc1Var = nc1.a;
        md0 md0Var = a;
        j23 j23Var = j23.a;
        y20 y20Var = y20.h;
        switch (i2) {
            case 0:
                m02.y(objH2);
                js2Var.k = sq2Var5;
                x20Var2 = x20Var;
                js2Var.l = x20Var2;
                k22Var2 = k22Var;
                js2Var.m = k22Var2;
                r5 = 0;
                js2Var.n = null;
                js2Var.o = null;
                aq0Var2 = aq0Var;
                js2Var.p = aq0Var2;
                vp0Var = a20Var;
                js2Var.q = vp0Var;
                b = 1;
                js2Var.u = 1;
                objB = b(sq2Var5, js2Var, 3);
                if (objB != y20Var) {
                    vp0Var2 = null;
                    vp0Var3 = null;
                    z02 z02Var8 = (z02) objB;
                    z02Var8.a();
                    z02Var = z02Var8;
                    dn2VarP = ie1.p(x20Var2, r5, new hs2(k22Var2, r5, b), b);
                    if (aq0Var2 != md0Var) {
                        k22 k22Var9 = k22Var2;
                        k22Var3 = k22Var9;
                        e(x20Var2, dn2VarP, new ks2(aq0Var2, k22Var9, z02Var, r5, (byte) 0));
                    } else {
                        k22Var3 = k22Var2;
                    }
                    if (vp0Var2 == null) {
                        js2Var.k = sq2Var5;
                        js2Var.l = x20Var2;
                        js2Var.m = k22Var3;
                        js2Var.n = vp0Var3;
                        js2Var.o = vp0Var2;
                        js2Var.p = aq0Var2;
                        js2Var.q = vp0Var;
                        js2Var.r = dn2VarP;
                        js2Var.u = 2;
                        objH = h(sq2Var5, s02Var, js2Var);
                        if (objH != y20Var) {
                            sq2Var2 = sq2Var5;
                            s01Var = dn2VarP;
                            aq0Var4 = aq0Var2;
                            vp0Var5 = vp0Var2;
                            x20Var4 = x20Var2;
                            objH2 = objH;
                            vp0Var6 = vp0Var;
                            vp0Var7 = vp0Var3;
                            z02Var2 = (z02) objH2;
                            k22 k22Var10 = k22Var3;
                            aq0Var3 = aq0Var4;
                            k22Var5 = k22Var10;
                            if (z02Var2 == null) {
                                dn2VarE = e(x20Var4, s01Var, new gs2(k22Var5, null, (byte) 3));
                            } else {
                                z02Var2.a();
                                dn2VarE = e(x20Var4, s01Var, new gs2(k22Var5, null, (byte) 4));
                            }
                            if (z02Var2 != null) {
                                if (vp0Var7 == null) {
                                    js2Var.k = sq2Var2;
                                    js2Var.l = x20Var4;
                                    js2Var.m = k22Var5;
                                    js2Var.n = vp0Var7;
                                    js2Var.o = vp0Var5;
                                    js2Var.p = aq0Var3;
                                    js2Var.q = vp0Var6;
                                    js2Var.r = z02Var2;
                                    js2Var.s = dn2VarE;
                                    js2Var.u = 5;
                                    dn2Var = dn2VarE;
                                    objO = sq2Var2.o(sq2Var2.i().b(), new ig2(z02Var2, null), js2Var);
                                    if (objO != y20Var) {
                                        vp0Var8 = vp0Var7;
                                        aq0Var5 = aq0Var3;
                                        sq2Var3 = sq2Var2;
                                        vp0Var9 = vp0Var5;
                                        vp0Var10 = vp0Var6;
                                        z02Var3 = z02Var2;
                                        objH2 = objO;
                                        s01Var2 = dn2Var;
                                        z02Var4 = (z02) objH2;
                                        if (z02Var4 != null) {
                                            m10Var2 = null;
                                            dn2VarP2 = ie1.p(x20Var4, null, new y8(s01Var2, k22Var5, m10Var2, (byte) 7), 1);
                                            if (aq0Var5 != md0Var) {
                                                k22 k22Var11 = k22Var5;
                                                aq0 aq0Var6 = aq0Var5;
                                                k22Var7 = k22Var11;
                                                vp0Var11 = null;
                                                e(x20Var4, dn2VarP2, new ks2(aq0Var6, k22Var11, z02Var4, m10Var2, (byte) 1));
                                            } else {
                                                k22Var7 = k22Var5;
                                                vp0Var11 = null;
                                            }
                                            if (vp0Var9 == null) {
                                                js2Var.k = x20Var4;
                                                js2Var.l = k22Var7;
                                                js2Var.m = vp0Var8;
                                                js2Var.n = vp0Var10;
                                                js2Var.o = dn2VarP2;
                                                js2Var.p = z02Var3;
                                                js2Var.q = vp0Var11;
                                                js2Var.r = vp0Var11;
                                                js2Var.s = vp0Var11;
                                                js2Var.u = 6;
                                                objH2 = h(sq2Var3, s02Var, js2Var);
                                                if (objH2 != y20Var) {
                                                    z02 z02Var9 = z02Var3;
                                                    s01Var4 = dn2VarP2;
                                                    z02Var7 = z02Var9;
                                                    vp0Var13 = vp0Var10;
                                                    x20Var7 = x20Var4;
                                                    vp0Var14 = vp0Var8;
                                                    vp0Var15 = vp0Var11;
                                                    r6 = vp0Var15;
                                                    r12 = (z02) objH2;
                                                    if (r12 != 0) {
                                                        r6 = vp0Var16;
                                                        r6 = vp0Var16;
                                                        r12.a();
                                                        e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 5));
                                                        vp0Var14.h(new up1(r12.c));
                                                        return j23Var;
                                                    }
                                                    r6 = vp0Var16;
                                                    e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 6));
                                                    if (vp0Var13 != null) {
                                                        r6 = vp0Var16;
                                                        vp0Var13.h(new up1(z02Var7.c));
                                                        return j23Var;
                                                    }
                                                }
                                            } else {
                                                js2Var.k = sq2Var3;
                                                js2Var.l = x20Var4;
                                                js2Var.m = k22Var7;
                                                js2Var.n = vp0Var8;
                                                js2Var.o = vp0Var9;
                                                js2Var.p = vp0Var10;
                                                js2Var.q = dn2VarP2;
                                                js2Var.r = z02Var3;
                                                js2Var.s = r25;
                                                js2Var.u = 7;
                                                objG2 = g(sq2Var3, s02Var, js2Var);
                                                if (objG2 != y20Var) {
                                                    k22 k22Var12 = k22Var7;
                                                    z02Var5 = z02Var3;
                                                    k22Var8 = k22Var12;
                                                    x20Var6 = x20Var4;
                                                    sq2Var4 = sq2Var3;
                                                    vp0Var12 = vp0Var10;
                                                    s01Var3 = dn2VarP2;
                                                    z02Var6 = z02Var4;
                                                    objH2 = objG2;
                                                    vp0Var16 = vp0Var11;
                                                    oc1Var2 = (oc1) objH2;
                                                    if (uz0.g(oc1Var2, nc1Var)) {
                                                        vp0Var9.h(new up1(z02Var6.c));
                                                        js2Var.k = x20Var6;
                                                        js2Var.l = k22Var8;
                                                        js2Var.m = s01Var3;
                                                        js2Var.n = vp0Var16;
                                                        js2Var.o = vp0Var16;
                                                        js2Var.p = vp0Var16;
                                                        js2Var.q = vp0Var16;
                                                        js2Var.r = vp0Var16;
                                                        js2Var.s = vp0Var16;
                                                        js2Var.u = 8;
                                                        if (c(sq2Var4, js2Var) != y20Var) {
                                                            s01Var5 = s01Var3;
                                                            x20Var8 = x20Var6;
                                                            r7 = vp0Var16;
                                                            e(x20Var8, s01Var5, new gs2(k22Var8, r7, (byte) 7));
                                                            return j23Var;
                                                        }
                                                    } else {
                                                        if (oc1Var2 instanceof mc1) {
                                                            vp0 vp0Var17 = vp0Var8;
                                                            r12 = ((mc1) oc1Var2).a;
                                                            z02Var7 = z02Var5;
                                                            k22Var7 = k22Var8;
                                                            s01Var4 = s01Var3;
                                                            vp0Var14 = vp0Var17;
                                                            vp0Var13 = vp0Var12;
                                                            x20Var7 = x20Var6;
                                                        } else {
                                                            if (oc1Var2 instanceof lc1) {
                                                                wg.n();
                                                                return null;
                                                            }
                                                            z02Var7 = z02Var5;
                                                            vp0Var13 = vp0Var12;
                                                            x20Var7 = x20Var6;
                                                            k22Var7 = k22Var8;
                                                            s01Var4 = s01Var3;
                                                            vp0Var14 = vp0Var8;
                                                            r12 = vp0Var16;
                                                        }
                                                        if (r12 != 0) {
                                                            r6 = vp0Var16;
                                                            r6 = vp0Var16;
                                                            r12.a();
                                                            e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 5));
                                                            vp0Var14.h(new up1(r12.c));
                                                            return j23Var;
                                                        }
                                                        r6 = vp0Var16;
                                                        e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 6));
                                                        if (vp0Var13 != null) {
                                                            r6 = vp0Var16;
                                                            vp0Var13.h(new up1(z02Var7.c));
                                                            return j23Var;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (vp0Var10 != null) {
                                            vp0Var10.h(new up1(z02Var3.c));
                                            return j23Var;
                                        }
                                    }
                                } else if (vp0Var6 != null) {
                                    vp0Var6.h(new up1(z02Var2.c));
                                    return j23Var;
                                }
                            }
                            r6 = vp0Var16;
                            return j23Var;
                        }
                    } else {
                        js2Var.k = sq2Var5;
                        js2Var.l = x20Var2;
                        js2Var.m = k22Var3;
                        js2Var.n = vp0Var3;
                        js2Var.o = vp0Var2;
                        js2Var.p = aq0Var2;
                        js2Var.q = vp0Var;
                        js2Var.r = z02Var;
                        js2Var.s = dn2VarP;
                        js2Var.u = 3;
                        objG = g(sq2Var5, s02Var, js2Var);
                        if (objG != y20Var) {
                            sq2Var2 = sq2Var5;
                            s01Var = dn2VarP;
                            vp0 vp0Var18 = vp0Var;
                            x20Var3 = x20Var2;
                            objH2 = objG;
                            vp0Var4 = vp0Var18;
                            k22 k22Var13 = k22Var3;
                            aq0Var3 = aq0Var2;
                            k22Var4 = k22Var13;
                            oc1Var = (oc1) objH2;
                            if (!uz0.g(oc1Var, nc1Var)) {
                                if (oc1Var instanceof mc1) {
                                    z02Var2 = ((mc1) oc1Var).a;
                                } else {
                                    if (!(oc1Var instanceof lc1)) {
                                        wg.n();
                                        return null;
                                    }
                                    z02Var2 = null;
                                }
                                vp0Var6 = vp0Var4;
                                k22Var5 = k22Var4;
                                vp0Var5 = vp0Var2;
                                x20Var4 = x20Var3;
                                vp0Var7 = vp0Var3;
                                if (z02Var2 == null) {
                                    dn2VarE = e(x20Var4, s01Var, new gs2(k22Var5, null, (byte) 3));
                                } else {
                                    z02Var2.a();
                                    dn2VarE = e(x20Var4, s01Var, new gs2(k22Var5, null, (byte) 4));
                                }
                                if (z02Var2 != null) {
                                    if (vp0Var7 == null) {
                                        js2Var.k = sq2Var2;
                                        js2Var.l = x20Var4;
                                        js2Var.m = k22Var5;
                                        js2Var.n = vp0Var7;
                                        js2Var.o = vp0Var5;
                                        js2Var.p = aq0Var3;
                                        js2Var.q = vp0Var6;
                                        js2Var.r = z02Var2;
                                        js2Var.s = dn2VarE;
                                        js2Var.u = 5;
                                        dn2Var = dn2VarE;
                                        objO = sq2Var2.o(sq2Var2.i().b(), new ig2(z02Var2, null), js2Var);
                                        if (objO != y20Var) {
                                            vp0Var8 = vp0Var7;
                                            aq0Var5 = aq0Var3;
                                            sq2Var3 = sq2Var2;
                                            vp0Var9 = vp0Var5;
                                            vp0Var10 = vp0Var6;
                                            z02Var3 = z02Var2;
                                            objH2 = objO;
                                            s01Var2 = dn2Var;
                                            z02Var4 = (z02) objH2;
                                            if (z02Var4 != null) {
                                                m10Var2 = null;
                                                dn2VarP2 = ie1.p(x20Var4, null, new y8(s01Var2, k22Var5, m10Var2, (byte) 7), 1);
                                                if (aq0Var5 != md0Var) {
                                                    k22 k22Var14 = k22Var5;
                                                    aq0 aq0Var7 = aq0Var5;
                                                    k22Var7 = k22Var14;
                                                    vp0Var11 = null;
                                                    e(x20Var4, dn2VarP2, new ks2(aq0Var7, k22Var14, z02Var4, m10Var2, (byte) 1));
                                                } else {
                                                    k22Var7 = k22Var5;
                                                    vp0Var11 = null;
                                                }
                                                if (vp0Var9 == null) {
                                                    js2Var.k = x20Var4;
                                                    js2Var.l = k22Var7;
                                                    js2Var.m = vp0Var8;
                                                    js2Var.n = vp0Var10;
                                                    js2Var.o = dn2VarP2;
                                                    js2Var.p = z02Var3;
                                                    js2Var.q = vp0Var11;
                                                    js2Var.r = vp0Var11;
                                                    js2Var.s = vp0Var11;
                                                    js2Var.u = 6;
                                                    objH2 = h(sq2Var3, s02Var, js2Var);
                                                    if (objH2 != y20Var) {
                                                        z02 z02Var10 = z02Var3;
                                                        s01Var4 = dn2VarP2;
                                                        z02Var7 = z02Var10;
                                                        vp0Var13 = vp0Var10;
                                                        x20Var7 = x20Var4;
                                                        vp0Var14 = vp0Var8;
                                                        vp0Var15 = vp0Var11;
                                                        r6 = vp0Var15;
                                                        r12 = (z02) objH2;
                                                        if (r12 != 0) {
                                                            r6 = vp0Var16;
                                                            r6 = vp0Var16;
                                                            r12.a();
                                                            e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 5));
                                                            vp0Var14.h(new up1(r12.c));
                                                            return j23Var;
                                                        }
                                                        r6 = vp0Var16;
                                                        e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 6));
                                                        if (vp0Var13 != null) {
                                                            r6 = vp0Var16;
                                                            vp0Var13.h(new up1(z02Var7.c));
                                                            return j23Var;
                                                        }
                                                    }
                                                } else {
                                                    js2Var.k = sq2Var3;
                                                    js2Var.l = x20Var4;
                                                    js2Var.m = k22Var7;
                                                    js2Var.n = vp0Var8;
                                                    js2Var.o = vp0Var9;
                                                    js2Var.p = vp0Var10;
                                                    js2Var.q = dn2VarP2;
                                                    js2Var.r = z02Var3;
                                                    js2Var.s = r25;
                                                    js2Var.u = 7;
                                                    objG2 = g(sq2Var3, s02Var, js2Var);
                                                    if (objG2 != y20Var) {
                                                        k22 k22Var15 = k22Var7;
                                                        z02Var5 = z02Var3;
                                                        k22Var8 = k22Var15;
                                                        x20Var6 = x20Var4;
                                                        sq2Var4 = sq2Var3;
                                                        vp0Var12 = vp0Var10;
                                                        s01Var3 = dn2VarP2;
                                                        z02Var6 = z02Var4;
                                                        objH2 = objG2;
                                                        vp0Var16 = vp0Var11;
                                                        oc1Var2 = (oc1) objH2;
                                                        if (uz0.g(oc1Var2, nc1Var)) {
                                                            vp0Var9.h(new up1(z02Var6.c));
                                                            js2Var.k = x20Var6;
                                                            js2Var.l = k22Var8;
                                                            js2Var.m = s01Var3;
                                                            js2Var.n = vp0Var16;
                                                            js2Var.o = vp0Var16;
                                                            js2Var.p = vp0Var16;
                                                            js2Var.q = vp0Var16;
                                                            js2Var.r = vp0Var16;
                                                            js2Var.s = vp0Var16;
                                                            js2Var.u = 8;
                                                            if (c(sq2Var4, js2Var) != y20Var) {
                                                                s01Var5 = s01Var3;
                                                                x20Var8 = x20Var6;
                                                                r7 = vp0Var16;
                                                                e(x20Var8, s01Var5, new gs2(k22Var8, r7, (byte) 7));
                                                                return j23Var;
                                                            }
                                                        } else {
                                                            if (oc1Var2 instanceof mc1) {
                                                                vp0 vp0Var19 = vp0Var8;
                                                                r12 = ((mc1) oc1Var2).a;
                                                                z02Var7 = z02Var5;
                                                                k22Var7 = k22Var8;
                                                                s01Var4 = s01Var3;
                                                                vp0Var14 = vp0Var19;
                                                                vp0Var13 = vp0Var12;
                                                                x20Var7 = x20Var6;
                                                            } else {
                                                                if (oc1Var2 instanceof lc1) {
                                                                    wg.n();
                                                                    return null;
                                                                }
                                                                z02Var7 = z02Var5;
                                                                vp0Var13 = vp0Var12;
                                                                x20Var7 = x20Var6;
                                                                k22Var7 = k22Var8;
                                                                s01Var4 = s01Var3;
                                                                vp0Var14 = vp0Var8;
                                                                r12 = vp0Var16;
                                                            }
                                                            if (r12 != 0) {
                                                                r6 = vp0Var16;
                                                                r6 = vp0Var16;
                                                                r12.a();
                                                                e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 5));
                                                                vp0Var14.h(new up1(r12.c));
                                                                return j23Var;
                                                            }
                                                            r6 = vp0Var16;
                                                            e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 6));
                                                            if (vp0Var13 != null) {
                                                                r6 = vp0Var16;
                                                                vp0Var13.h(new up1(z02Var7.c));
                                                                return j23Var;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (vp0Var10 != null) {
                                                vp0Var10.h(new up1(z02Var3.c));
                                                return j23Var;
                                            }
                                        }
                                    } else if (vp0Var6 != null) {
                                        vp0Var6.h(new up1(z02Var2.c));
                                        return j23Var;
                                    }
                                }
                                r6 = vp0Var16;
                                return j23Var;
                            }
                            vp0Var2.h(new up1(z02Var.c));
                            js2Var.k = x20Var3;
                            js2Var.l = k22Var4;
                            js2Var.m = s01Var;
                            m10Var = null;
                            js2Var.n = null;
                            js2Var.o = null;
                            js2Var.p = null;
                            js2Var.q = null;
                            js2Var.r = null;
                            js2Var.s = null;
                            js2Var.u = 4;
                            if (c(sq2Var2, js2Var) != y20Var) {
                                k22Var6 = k22Var4;
                                x20Var5 = x20Var3;
                                e(x20Var5, s01Var, new gs2(k22Var6, m10Var, (byte) 2));
                                return j23Var;
                            }
                        }
                    }
                }
                return y20Var;
            case 1:
                vp0 vp0Var20 = (vp0) js2Var.q;
                aq0 aq0Var8 = (aq0) js2Var.p;
                vp0 vp0Var21 = (vp0) js2Var.o;
                vp0 vp0Var22 = js2Var.n;
                k22 k22Var16 = (k22) js2Var.m;
                x20 x20Var9 = (x20) js2Var.l;
                sq2 sq2Var6 = (sq2) js2Var.k;
                m02.y(objH2);
                objB = objH2;
                vp0Var3 = vp0Var22;
                x20Var2 = x20Var9;
                b = 1;
                aq0Var2 = aq0Var8;
                k22Var2 = k22Var16;
                vp0Var = vp0Var20;
                sq2Var5 = sq2Var6;
                vp0Var2 = vp0Var21;
                r5 = 0;
                z02 z02Var11 = (z02) objB;
                z02Var11.a();
                z02Var = z02Var11;
                dn2VarP = ie1.p(x20Var2, r5, new hs2(k22Var2, r5, b), b);
                if (aq0Var2 != md0Var) {
                    k22 k22Var17 = k22Var2;
                    k22Var3 = k22Var17;
                    e(x20Var2, dn2VarP, new ks2(aq0Var2, k22Var17, z02Var, r5, (byte) 0));
                } else {
                    k22Var3 = k22Var2;
                }
                if (vp0Var2 == null) {
                    js2Var.k = sq2Var5;
                    js2Var.l = x20Var2;
                    js2Var.m = k22Var3;
                    js2Var.n = vp0Var3;
                    js2Var.o = vp0Var2;
                    js2Var.p = aq0Var2;
                    js2Var.q = vp0Var;
                    js2Var.r = dn2VarP;
                    js2Var.u = 2;
                    objH = h(sq2Var5, s02Var, js2Var);
                    if (objH != y20Var) {
                        sq2Var2 = sq2Var5;
                        s01Var = dn2VarP;
                        aq0Var4 = aq0Var2;
                        vp0Var5 = vp0Var2;
                        x20Var4 = x20Var2;
                        objH2 = objH;
                        vp0Var6 = vp0Var;
                        vp0Var7 = vp0Var3;
                        z02Var2 = (z02) objH2;
                        k22 k22Var18 = k22Var3;
                        aq0Var3 = aq0Var4;
                        k22Var5 = k22Var18;
                        if (z02Var2 == null) {
                            dn2VarE = e(x20Var4, s01Var, new gs2(k22Var5, null, (byte) 3));
                        } else {
                            z02Var2.a();
                            dn2VarE = e(x20Var4, s01Var, new gs2(k22Var5, null, (byte) 4));
                        }
                        if (z02Var2 != null) {
                            if (vp0Var7 == null) {
                                js2Var.k = sq2Var2;
                                js2Var.l = x20Var4;
                                js2Var.m = k22Var5;
                                js2Var.n = vp0Var7;
                                js2Var.o = vp0Var5;
                                js2Var.p = aq0Var3;
                                js2Var.q = vp0Var6;
                                js2Var.r = z02Var2;
                                js2Var.s = dn2VarE;
                                js2Var.u = 5;
                                dn2Var = dn2VarE;
                                objO = sq2Var2.o(sq2Var2.i().b(), new ig2(z02Var2, null), js2Var);
                                if (objO != y20Var) {
                                    vp0Var8 = vp0Var7;
                                    aq0Var5 = aq0Var3;
                                    sq2Var3 = sq2Var2;
                                    vp0Var9 = vp0Var5;
                                    vp0Var10 = vp0Var6;
                                    z02Var3 = z02Var2;
                                    objH2 = objO;
                                    s01Var2 = dn2Var;
                                    z02Var4 = (z02) objH2;
                                    if (z02Var4 != null) {
                                        m10Var2 = null;
                                        dn2VarP2 = ie1.p(x20Var4, null, new y8(s01Var2, k22Var5, m10Var2, (byte) 7), 1);
                                        if (aq0Var5 != md0Var) {
                                            k22 k22Var19 = k22Var5;
                                            aq0 aq0Var9 = aq0Var5;
                                            k22Var7 = k22Var19;
                                            vp0Var11 = null;
                                            e(x20Var4, dn2VarP2, new ks2(aq0Var9, k22Var19, z02Var4, m10Var2, (byte) 1));
                                        } else {
                                            k22Var7 = k22Var5;
                                            vp0Var11 = null;
                                        }
                                        if (vp0Var9 == null) {
                                            js2Var.k = x20Var4;
                                            js2Var.l = k22Var7;
                                            js2Var.m = vp0Var8;
                                            js2Var.n = vp0Var10;
                                            js2Var.o = dn2VarP2;
                                            js2Var.p = z02Var3;
                                            js2Var.q = vp0Var11;
                                            js2Var.r = vp0Var11;
                                            js2Var.s = vp0Var11;
                                            js2Var.u = 6;
                                            objH2 = h(sq2Var3, s02Var, js2Var);
                                            if (objH2 != y20Var) {
                                                z02 z02Var12 = z02Var3;
                                                s01Var4 = dn2VarP2;
                                                z02Var7 = z02Var12;
                                                vp0Var13 = vp0Var10;
                                                x20Var7 = x20Var4;
                                                vp0Var14 = vp0Var8;
                                                vp0Var15 = vp0Var11;
                                                r6 = vp0Var15;
                                                r12 = (z02) objH2;
                                                if (r12 != 0) {
                                                    r6 = vp0Var16;
                                                    r6 = vp0Var16;
                                                    r12.a();
                                                    e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 5));
                                                    vp0Var14.h(new up1(r12.c));
                                                    return j23Var;
                                                }
                                                r6 = vp0Var16;
                                                e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 6));
                                                if (vp0Var13 != null) {
                                                    r6 = vp0Var16;
                                                    vp0Var13.h(new up1(z02Var7.c));
                                                    return j23Var;
                                                }
                                            }
                                        } else {
                                            js2Var.k = sq2Var3;
                                            js2Var.l = x20Var4;
                                            js2Var.m = k22Var7;
                                            js2Var.n = vp0Var8;
                                            js2Var.o = vp0Var9;
                                            js2Var.p = vp0Var10;
                                            js2Var.q = dn2VarP2;
                                            js2Var.r = z02Var3;
                                            js2Var.s = r25;
                                            js2Var.u = 7;
                                            objG2 = g(sq2Var3, s02Var, js2Var);
                                            if (objG2 != y20Var) {
                                                k22 k22Var110 = k22Var7;
                                                z02Var5 = z02Var3;
                                                k22Var8 = k22Var110;
                                                x20Var6 = x20Var4;
                                                sq2Var4 = sq2Var3;
                                                vp0Var12 = vp0Var10;
                                                s01Var3 = dn2VarP2;
                                                z02Var6 = z02Var4;
                                                objH2 = objG2;
                                                vp0Var16 = vp0Var11;
                                                oc1Var2 = (oc1) objH2;
                                                if (uz0.g(oc1Var2, nc1Var)) {
                                                    vp0Var9.h(new up1(z02Var6.c));
                                                    js2Var.k = x20Var6;
                                                    js2Var.l = k22Var8;
                                                    js2Var.m = s01Var3;
                                                    js2Var.n = vp0Var16;
                                                    js2Var.o = vp0Var16;
                                                    js2Var.p = vp0Var16;
                                                    js2Var.q = vp0Var16;
                                                    js2Var.r = vp0Var16;
                                                    js2Var.s = vp0Var16;
                                                    js2Var.u = 8;
                                                    if (c(sq2Var4, js2Var) != y20Var) {
                                                        s01Var5 = s01Var3;
                                                        x20Var8 = x20Var6;
                                                        r7 = vp0Var16;
                                                        e(x20Var8, s01Var5, new gs2(k22Var8, r7, (byte) 7));
                                                        return j23Var;
                                                    }
                                                } else {
                                                    if (oc1Var2 instanceof mc1) {
                                                        vp0 vp0Var110 = vp0Var8;
                                                        r12 = ((mc1) oc1Var2).a;
                                                        z02Var7 = z02Var5;
                                                        k22Var7 = k22Var8;
                                                        s01Var4 = s01Var3;
                                                        vp0Var14 = vp0Var110;
                                                        vp0Var13 = vp0Var12;
                                                        x20Var7 = x20Var6;
                                                    } else {
                                                        if (oc1Var2 instanceof lc1) {
                                                            wg.n();
                                                            return null;
                                                        }
                                                        z02Var7 = z02Var5;
                                                        vp0Var13 = vp0Var12;
                                                        x20Var7 = x20Var6;
                                                        k22Var7 = k22Var8;
                                                        s01Var4 = s01Var3;
                                                        vp0Var14 = vp0Var8;
                                                        r12 = vp0Var16;
                                                    }
                                                    if (r12 != 0) {
                                                        r6 = vp0Var16;
                                                        r6 = vp0Var16;
                                                        r12.a();
                                                        e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 5));
                                                        vp0Var14.h(new up1(r12.c));
                                                        return j23Var;
                                                    }
                                                    r6 = vp0Var16;
                                                    e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 6));
                                                    if (vp0Var13 != null) {
                                                        r6 = vp0Var16;
                                                        vp0Var13.h(new up1(z02Var7.c));
                                                        return j23Var;
                                                    }
                                                }
                                            }
                                        }
                                    } else if (vp0Var10 != null) {
                                        vp0Var10.h(new up1(z02Var3.c));
                                        return j23Var;
                                    }
                                }
                            } else if (vp0Var6 != null) {
                                vp0Var6.h(new up1(z02Var2.c));
                                return j23Var;
                            }
                        }
                        r6 = vp0Var16;
                        return j23Var;
                    }
                } else {
                    js2Var.k = sq2Var5;
                    js2Var.l = x20Var2;
                    js2Var.m = k22Var3;
                    js2Var.n = vp0Var3;
                    js2Var.o = vp0Var2;
                    js2Var.p = aq0Var2;
                    js2Var.q = vp0Var;
                    js2Var.r = z02Var;
                    js2Var.s = dn2VarP;
                    js2Var.u = 3;
                    objG = g(sq2Var5, s02Var, js2Var);
                    if (objG != y20Var) {
                        sq2Var2 = sq2Var5;
                        s01Var = dn2VarP;
                        vp0 vp0Var111 = vp0Var;
                        x20Var3 = x20Var2;
                        objH2 = objG;
                        vp0Var4 = vp0Var111;
                        k22 k22Var111 = k22Var3;
                        aq0Var3 = aq0Var2;
                        k22Var4 = k22Var111;
                        oc1Var = (oc1) objH2;
                        if (!uz0.g(oc1Var, nc1Var)) {
                            if (oc1Var instanceof mc1) {
                                z02Var2 = ((mc1) oc1Var).a;
                            } else {
                                if (!(oc1Var instanceof lc1)) {
                                    wg.n();
                                    return null;
                                }
                                z02Var2 = null;
                            }
                            vp0Var6 = vp0Var4;
                            k22Var5 = k22Var4;
                            vp0Var5 = vp0Var2;
                            x20Var4 = x20Var3;
                            vp0Var7 = vp0Var3;
                            if (z02Var2 == null) {
                                dn2VarE = e(x20Var4, s01Var, new gs2(k22Var5, null, (byte) 3));
                            } else {
                                z02Var2.a();
                                dn2VarE = e(x20Var4, s01Var, new gs2(k22Var5, null, (byte) 4));
                            }
                            if (z02Var2 != null) {
                                if (vp0Var7 == null) {
                                    js2Var.k = sq2Var2;
                                    js2Var.l = x20Var4;
                                    js2Var.m = k22Var5;
                                    js2Var.n = vp0Var7;
                                    js2Var.o = vp0Var5;
                                    js2Var.p = aq0Var3;
                                    js2Var.q = vp0Var6;
                                    js2Var.r = z02Var2;
                                    js2Var.s = dn2VarE;
                                    js2Var.u = 5;
                                    dn2Var = dn2VarE;
                                    objO = sq2Var2.o(sq2Var2.i().b(), new ig2(z02Var2, null), js2Var);
                                    if (objO != y20Var) {
                                        vp0Var8 = vp0Var7;
                                        aq0Var5 = aq0Var3;
                                        sq2Var3 = sq2Var2;
                                        vp0Var9 = vp0Var5;
                                        vp0Var10 = vp0Var6;
                                        z02Var3 = z02Var2;
                                        objH2 = objO;
                                        s01Var2 = dn2Var;
                                        z02Var4 = (z02) objH2;
                                        if (z02Var4 != null) {
                                            m10Var2 = null;
                                            dn2VarP2 = ie1.p(x20Var4, null, new y8(s01Var2, k22Var5, m10Var2, (byte) 7), 1);
                                            if (aq0Var5 != md0Var) {
                                                k22 k22Var112 = k22Var5;
                                                aq0 aq0Var10 = aq0Var5;
                                                k22Var7 = k22Var112;
                                                vp0Var11 = null;
                                                e(x20Var4, dn2VarP2, new ks2(aq0Var10, k22Var112, z02Var4, m10Var2, (byte) 1));
                                            } else {
                                                k22Var7 = k22Var5;
                                                vp0Var11 = null;
                                            }
                                            if (vp0Var9 == null) {
                                                js2Var.k = x20Var4;
                                                js2Var.l = k22Var7;
                                                js2Var.m = vp0Var8;
                                                js2Var.n = vp0Var10;
                                                js2Var.o = dn2VarP2;
                                                js2Var.p = z02Var3;
                                                js2Var.q = vp0Var11;
                                                js2Var.r = vp0Var11;
                                                js2Var.s = vp0Var11;
                                                js2Var.u = 6;
                                                objH2 = h(sq2Var3, s02Var, js2Var);
                                                if (objH2 != y20Var) {
                                                    z02 z02Var13 = z02Var3;
                                                    s01Var4 = dn2VarP2;
                                                    z02Var7 = z02Var13;
                                                    vp0Var13 = vp0Var10;
                                                    x20Var7 = x20Var4;
                                                    vp0Var14 = vp0Var8;
                                                    vp0Var15 = vp0Var11;
                                                    r6 = vp0Var15;
                                                    r12 = (z02) objH2;
                                                    if (r12 != 0) {
                                                        r6 = vp0Var16;
                                                        r6 = vp0Var16;
                                                        r12.a();
                                                        e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 5));
                                                        vp0Var14.h(new up1(r12.c));
                                                        return j23Var;
                                                    }
                                                    r6 = vp0Var16;
                                                    e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 6));
                                                    if (vp0Var13 != null) {
                                                        r6 = vp0Var16;
                                                        vp0Var13.h(new up1(z02Var7.c));
                                                        return j23Var;
                                                    }
                                                }
                                            } else {
                                                js2Var.k = sq2Var3;
                                                js2Var.l = x20Var4;
                                                js2Var.m = k22Var7;
                                                js2Var.n = vp0Var8;
                                                js2Var.o = vp0Var9;
                                                js2Var.p = vp0Var10;
                                                js2Var.q = dn2VarP2;
                                                js2Var.r = z02Var3;
                                                js2Var.s = r25;
                                                js2Var.u = 7;
                                                objG2 = g(sq2Var3, s02Var, js2Var);
                                                if (objG2 != y20Var) {
                                                    k22 k22Var113 = k22Var7;
                                                    z02Var5 = z02Var3;
                                                    k22Var8 = k22Var113;
                                                    x20Var6 = x20Var4;
                                                    sq2Var4 = sq2Var3;
                                                    vp0Var12 = vp0Var10;
                                                    s01Var3 = dn2VarP2;
                                                    z02Var6 = z02Var4;
                                                    objH2 = objG2;
                                                    vp0Var16 = vp0Var11;
                                                    oc1Var2 = (oc1) objH2;
                                                    if (uz0.g(oc1Var2, nc1Var)) {
                                                        vp0Var9.h(new up1(z02Var6.c));
                                                        js2Var.k = x20Var6;
                                                        js2Var.l = k22Var8;
                                                        js2Var.m = s01Var3;
                                                        js2Var.n = vp0Var16;
                                                        js2Var.o = vp0Var16;
                                                        js2Var.p = vp0Var16;
                                                        js2Var.q = vp0Var16;
                                                        js2Var.r = vp0Var16;
                                                        js2Var.s = vp0Var16;
                                                        js2Var.u = 8;
                                                        if (c(sq2Var4, js2Var) != y20Var) {
                                                            s01Var5 = s01Var3;
                                                            x20Var8 = x20Var6;
                                                            r7 = vp0Var16;
                                                            e(x20Var8, s01Var5, new gs2(k22Var8, r7, (byte) 7));
                                                            return j23Var;
                                                        }
                                                    } else {
                                                        if (oc1Var2 instanceof mc1) {
                                                            vp0 vp0Var112 = vp0Var8;
                                                            r12 = ((mc1) oc1Var2).a;
                                                            z02Var7 = z02Var5;
                                                            k22Var7 = k22Var8;
                                                            s01Var4 = s01Var3;
                                                            vp0Var14 = vp0Var112;
                                                            vp0Var13 = vp0Var12;
                                                            x20Var7 = x20Var6;
                                                        } else {
                                                            if (oc1Var2 instanceof lc1) {
                                                                wg.n();
                                                                return null;
                                                            }
                                                            z02Var7 = z02Var5;
                                                            vp0Var13 = vp0Var12;
                                                            x20Var7 = x20Var6;
                                                            k22Var7 = k22Var8;
                                                            s01Var4 = s01Var3;
                                                            vp0Var14 = vp0Var8;
                                                            r12 = vp0Var16;
                                                        }
                                                        if (r12 != 0) {
                                                            r6 = vp0Var16;
                                                            r6 = vp0Var16;
                                                            r12.a();
                                                            e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 5));
                                                            vp0Var14.h(new up1(r12.c));
                                                            return j23Var;
                                                        }
                                                        r6 = vp0Var16;
                                                        e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 6));
                                                        if (vp0Var13 != null) {
                                                            r6 = vp0Var16;
                                                            vp0Var13.h(new up1(z02Var7.c));
                                                            return j23Var;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (vp0Var10 != null) {
                                            vp0Var10.h(new up1(z02Var3.c));
                                            return j23Var;
                                        }
                                    }
                                } else if (vp0Var6 != null) {
                                    vp0Var6.h(new up1(z02Var2.c));
                                    return j23Var;
                                }
                            }
                            r6 = vp0Var16;
                            return j23Var;
                        }
                        vp0Var2.h(new up1(z02Var.c));
                        js2Var.k = x20Var3;
                        js2Var.l = k22Var4;
                        js2Var.m = s01Var;
                        m10Var = null;
                        js2Var.n = null;
                        js2Var.o = null;
                        js2Var.p = null;
                        js2Var.q = null;
                        js2Var.r = null;
                        js2Var.s = null;
                        js2Var.u = 4;
                        if (c(sq2Var2, js2Var) != y20Var) {
                            k22Var6 = k22Var4;
                            x20Var5 = x20Var3;
                            e(x20Var5, s01Var, new gs2(k22Var6, m10Var, (byte) 2));
                            return j23Var;
                        }
                    }
                }
                return y20Var;
            case 2:
                s01Var = (s01) js2Var.r;
                vp0Var6 = (vp0) js2Var.q;
                aq0Var4 = (aq0) js2Var.p;
                vp0Var5 = (vp0) js2Var.o;
                vp0Var7 = js2Var.n;
                k22Var3 = (k22) js2Var.m;
                x20Var4 = (x20) js2Var.l;
                sq2Var2 = (sq2) js2Var.k;
                m02.y(objH2);
                z02Var2 = (z02) objH2;
                k22 k22Var114 = k22Var3;
                aq0Var3 = aq0Var4;
                k22Var5 = k22Var114;
                if (z02Var2 == null) {
                    dn2VarE = e(x20Var4, s01Var, new gs2(k22Var5, null, (byte) 3));
                } else {
                    z02Var2.a();
                    dn2VarE = e(x20Var4, s01Var, new gs2(k22Var5, null, (byte) 4));
                }
                if (z02Var2 != null) {
                    if (vp0Var7 == null) {
                        js2Var.k = sq2Var2;
                        js2Var.l = x20Var4;
                        js2Var.m = k22Var5;
                        js2Var.n = vp0Var7;
                        js2Var.o = vp0Var5;
                        js2Var.p = aq0Var3;
                        js2Var.q = vp0Var6;
                        js2Var.r = z02Var2;
                        js2Var.s = dn2VarE;
                        js2Var.u = 5;
                        dn2Var = dn2VarE;
                        objO = sq2Var2.o(sq2Var2.i().b(), new ig2(z02Var2, null), js2Var);
                        if (objO != y20Var) {
                            vp0Var8 = vp0Var7;
                            aq0Var5 = aq0Var3;
                            sq2Var3 = sq2Var2;
                            vp0Var9 = vp0Var5;
                            vp0Var10 = vp0Var6;
                            z02Var3 = z02Var2;
                            objH2 = objO;
                            s01Var2 = dn2Var;
                            z02Var4 = (z02) objH2;
                            if (z02Var4 != null) {
                                m10Var2 = null;
                                dn2VarP2 = ie1.p(x20Var4, null, new y8(s01Var2, k22Var5, m10Var2, (byte) 7), 1);
                                if (aq0Var5 != md0Var) {
                                    k22 k22Var115 = k22Var5;
                                    aq0 aq0Var11 = aq0Var5;
                                    k22Var7 = k22Var115;
                                    vp0Var11 = null;
                                    e(x20Var4, dn2VarP2, new ks2(aq0Var11, k22Var115, z02Var4, m10Var2, (byte) 1));
                                } else {
                                    k22Var7 = k22Var5;
                                    vp0Var11 = null;
                                }
                                if (vp0Var9 == null) {
                                    js2Var.k = x20Var4;
                                    js2Var.l = k22Var7;
                                    js2Var.m = vp0Var8;
                                    js2Var.n = vp0Var10;
                                    js2Var.o = dn2VarP2;
                                    js2Var.p = z02Var3;
                                    js2Var.q = vp0Var11;
                                    js2Var.r = vp0Var11;
                                    js2Var.s = vp0Var11;
                                    js2Var.u = 6;
                                    objH2 = h(sq2Var3, s02Var, js2Var);
                                    if (objH2 != y20Var) {
                                        z02 z02Var14 = z02Var3;
                                        s01Var4 = dn2VarP2;
                                        z02Var7 = z02Var14;
                                        vp0Var13 = vp0Var10;
                                        x20Var7 = x20Var4;
                                        vp0Var14 = vp0Var8;
                                        vp0Var15 = vp0Var11;
                                        r6 = vp0Var15;
                                        r12 = (z02) objH2;
                                        if (r12 != 0) {
                                            r6 = vp0Var16;
                                            r6 = vp0Var16;
                                            r12.a();
                                            e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 5));
                                            vp0Var14.h(new up1(r12.c));
                                            return j23Var;
                                        }
                                        r6 = vp0Var16;
                                        e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 6));
                                        if (vp0Var13 != null) {
                                            r6 = vp0Var16;
                                            vp0Var13.h(new up1(z02Var7.c));
                                            return j23Var;
                                        }
                                    }
                                } else {
                                    js2Var.k = sq2Var3;
                                    js2Var.l = x20Var4;
                                    js2Var.m = k22Var7;
                                    js2Var.n = vp0Var8;
                                    js2Var.o = vp0Var9;
                                    js2Var.p = vp0Var10;
                                    js2Var.q = dn2VarP2;
                                    js2Var.r = z02Var3;
                                    js2Var.s = r25;
                                    js2Var.u = 7;
                                    objG2 = g(sq2Var3, s02Var, js2Var);
                                    if (objG2 != y20Var) {
                                        k22 k22Var116 = k22Var7;
                                        z02Var5 = z02Var3;
                                        k22Var8 = k22Var116;
                                        x20Var6 = x20Var4;
                                        sq2Var4 = sq2Var3;
                                        vp0Var12 = vp0Var10;
                                        s01Var3 = dn2VarP2;
                                        z02Var6 = z02Var4;
                                        objH2 = objG2;
                                        vp0Var16 = vp0Var11;
                                        oc1Var2 = (oc1) objH2;
                                        if (uz0.g(oc1Var2, nc1Var)) {
                                            vp0Var9.h(new up1(z02Var6.c));
                                            js2Var.k = x20Var6;
                                            js2Var.l = k22Var8;
                                            js2Var.m = s01Var3;
                                            js2Var.n = vp0Var16;
                                            js2Var.o = vp0Var16;
                                            js2Var.p = vp0Var16;
                                            js2Var.q = vp0Var16;
                                            js2Var.r = vp0Var16;
                                            js2Var.s = vp0Var16;
                                            js2Var.u = 8;
                                            if (c(sq2Var4, js2Var) != y20Var) {
                                                s01Var5 = s01Var3;
                                                x20Var8 = x20Var6;
                                                r7 = vp0Var16;
                                                e(x20Var8, s01Var5, new gs2(k22Var8, r7, (byte) 7));
                                                return j23Var;
                                            }
                                        } else {
                                            if (oc1Var2 instanceof mc1) {
                                                vp0 vp0Var113 = vp0Var8;
                                                r12 = ((mc1) oc1Var2).a;
                                                z02Var7 = z02Var5;
                                                k22Var7 = k22Var8;
                                                s01Var4 = s01Var3;
                                                vp0Var14 = vp0Var113;
                                                vp0Var13 = vp0Var12;
                                                x20Var7 = x20Var6;
                                            } else {
                                                if (oc1Var2 instanceof lc1) {
                                                    wg.n();
                                                    return null;
                                                }
                                                z02Var7 = z02Var5;
                                                vp0Var13 = vp0Var12;
                                                x20Var7 = x20Var6;
                                                k22Var7 = k22Var8;
                                                s01Var4 = s01Var3;
                                                vp0Var14 = vp0Var8;
                                                r12 = vp0Var16;
                                            }
                                            if (r12 != 0) {
                                                r6 = vp0Var16;
                                                r6 = vp0Var16;
                                                r12.a();
                                                e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 5));
                                                vp0Var14.h(new up1(r12.c));
                                                return j23Var;
                                            }
                                            r6 = vp0Var16;
                                            e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 6));
                                            if (vp0Var13 != null) {
                                                r6 = vp0Var16;
                                                vp0Var13.h(new up1(z02Var7.c));
                                                return j23Var;
                                            }
                                        }
                                    }
                                }
                            } else if (vp0Var10 != null) {
                                vp0Var10.h(new up1(z02Var3.c));
                                return j23Var;
                            }
                        }
                        return y20Var;
                    }
                    if (vp0Var6 != null) {
                        vp0Var6.h(new up1(z02Var2.c));
                        return j23Var;
                    }
                }
                r6 = vp0Var16;
                return j23Var;
            case 3:
                s01Var = (s01) js2Var.s;
                z02Var = (z02) js2Var.r;
                vp0Var4 = (vp0) js2Var.q;
                aq0Var3 = (aq0) js2Var.p;
                vp0Var2 = (vp0) js2Var.o;
                vp0Var3 = js2Var.n;
                k22Var4 = (k22) js2Var.m;
                x20Var3 = (x20) js2Var.l;
                sq2Var2 = (sq2) js2Var.k;
                m02.y(objH2);
                oc1Var = (oc1) objH2;
                if (!uz0.g(oc1Var, nc1Var)) {
                    if (oc1Var instanceof mc1) {
                        z02Var2 = ((mc1) oc1Var).a;
                    } else {
                        if (!(oc1Var instanceof lc1)) {
                            wg.n();
                            return null;
                        }
                        z02Var2 = null;
                    }
                    vp0Var6 = vp0Var4;
                    k22Var5 = k22Var4;
                    vp0Var5 = vp0Var2;
                    x20Var4 = x20Var3;
                    vp0Var7 = vp0Var3;
                    if (z02Var2 == null) {
                        dn2VarE = e(x20Var4, s01Var, new gs2(k22Var5, null, (byte) 3));
                    } else {
                        z02Var2.a();
                        dn2VarE = e(x20Var4, s01Var, new gs2(k22Var5, null, (byte) 4));
                    }
                    if (z02Var2 != null) {
                        if (vp0Var7 == null) {
                            js2Var.k = sq2Var2;
                            js2Var.l = x20Var4;
                            js2Var.m = k22Var5;
                            js2Var.n = vp0Var7;
                            js2Var.o = vp0Var5;
                            js2Var.p = aq0Var3;
                            js2Var.q = vp0Var6;
                            js2Var.r = z02Var2;
                            js2Var.s = dn2VarE;
                            js2Var.u = 5;
                            dn2Var = dn2VarE;
                            objO = sq2Var2.o(sq2Var2.i().b(), new ig2(z02Var2, null), js2Var);
                            if (objO != y20Var) {
                                vp0Var8 = vp0Var7;
                                aq0Var5 = aq0Var3;
                                sq2Var3 = sq2Var2;
                                vp0Var9 = vp0Var5;
                                vp0Var10 = vp0Var6;
                                z02Var3 = z02Var2;
                                objH2 = objO;
                                s01Var2 = dn2Var;
                                z02Var4 = (z02) objH2;
                                if (z02Var4 != null) {
                                    m10Var2 = null;
                                    dn2VarP2 = ie1.p(x20Var4, null, new y8(s01Var2, k22Var5, m10Var2, (byte) 7), 1);
                                    if (aq0Var5 != md0Var) {
                                        k22 k22Var117 = k22Var5;
                                        aq0 aq0Var12 = aq0Var5;
                                        k22Var7 = k22Var117;
                                        vp0Var11 = null;
                                        e(x20Var4, dn2VarP2, new ks2(aq0Var12, k22Var117, z02Var4, m10Var2, (byte) 1));
                                    } else {
                                        k22Var7 = k22Var5;
                                        vp0Var11 = null;
                                    }
                                    if (vp0Var9 == null) {
                                        js2Var.k = x20Var4;
                                        js2Var.l = k22Var7;
                                        js2Var.m = vp0Var8;
                                        js2Var.n = vp0Var10;
                                        js2Var.o = dn2VarP2;
                                        js2Var.p = z02Var3;
                                        js2Var.q = vp0Var11;
                                        js2Var.r = vp0Var11;
                                        js2Var.s = vp0Var11;
                                        js2Var.u = 6;
                                        objH2 = h(sq2Var3, s02Var, js2Var);
                                        if (objH2 != y20Var) {
                                            z02 z02Var15 = z02Var3;
                                            s01Var4 = dn2VarP2;
                                            z02Var7 = z02Var15;
                                            vp0Var13 = vp0Var10;
                                            x20Var7 = x20Var4;
                                            vp0Var14 = vp0Var8;
                                            vp0Var15 = vp0Var11;
                                            r6 = vp0Var15;
                                            r12 = (z02) objH2;
                                            if (r12 != 0) {
                                                r6 = vp0Var16;
                                                r6 = vp0Var16;
                                                r12.a();
                                                e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 5));
                                                vp0Var14.h(new up1(r12.c));
                                                return j23Var;
                                            }
                                            r6 = vp0Var16;
                                            e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 6));
                                            if (vp0Var13 != null) {
                                                r6 = vp0Var16;
                                                vp0Var13.h(new up1(z02Var7.c));
                                                return j23Var;
                                            }
                                        }
                                    } else {
                                        js2Var.k = sq2Var3;
                                        js2Var.l = x20Var4;
                                        js2Var.m = k22Var7;
                                        js2Var.n = vp0Var8;
                                        js2Var.o = vp0Var9;
                                        js2Var.p = vp0Var10;
                                        js2Var.q = dn2VarP2;
                                        js2Var.r = z02Var3;
                                        js2Var.s = r25;
                                        js2Var.u = 7;
                                        objG2 = g(sq2Var3, s02Var, js2Var);
                                        if (objG2 != y20Var) {
                                            k22 k22Var118 = k22Var7;
                                            z02Var5 = z02Var3;
                                            k22Var8 = k22Var118;
                                            x20Var6 = x20Var4;
                                            sq2Var4 = sq2Var3;
                                            vp0Var12 = vp0Var10;
                                            s01Var3 = dn2VarP2;
                                            z02Var6 = z02Var4;
                                            objH2 = objG2;
                                            vp0Var16 = vp0Var11;
                                            oc1Var2 = (oc1) objH2;
                                            if (uz0.g(oc1Var2, nc1Var)) {
                                                vp0Var9.h(new up1(z02Var6.c));
                                                js2Var.k = x20Var6;
                                                js2Var.l = k22Var8;
                                                js2Var.m = s01Var3;
                                                js2Var.n = vp0Var16;
                                                js2Var.o = vp0Var16;
                                                js2Var.p = vp0Var16;
                                                js2Var.q = vp0Var16;
                                                js2Var.r = vp0Var16;
                                                js2Var.s = vp0Var16;
                                                js2Var.u = 8;
                                                if (c(sq2Var4, js2Var) != y20Var) {
                                                    s01Var5 = s01Var3;
                                                    x20Var8 = x20Var6;
                                                    r7 = vp0Var16;
                                                    e(x20Var8, s01Var5, new gs2(k22Var8, r7, (byte) 7));
                                                    return j23Var;
                                                }
                                            } else {
                                                if (oc1Var2 instanceof mc1) {
                                                    vp0 vp0Var114 = vp0Var8;
                                                    r12 = ((mc1) oc1Var2).a;
                                                    z02Var7 = z02Var5;
                                                    k22Var7 = k22Var8;
                                                    s01Var4 = s01Var3;
                                                    vp0Var14 = vp0Var114;
                                                    vp0Var13 = vp0Var12;
                                                    x20Var7 = x20Var6;
                                                } else {
                                                    if (oc1Var2 instanceof lc1) {
                                                        wg.n();
                                                        return null;
                                                    }
                                                    z02Var7 = z02Var5;
                                                    vp0Var13 = vp0Var12;
                                                    x20Var7 = x20Var6;
                                                    k22Var7 = k22Var8;
                                                    s01Var4 = s01Var3;
                                                    vp0Var14 = vp0Var8;
                                                    r12 = vp0Var16;
                                                }
                                                if (r12 != 0) {
                                                    r6 = vp0Var16;
                                                    r6 = vp0Var16;
                                                    r12.a();
                                                    e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 5));
                                                    vp0Var14.h(new up1(r12.c));
                                                    return j23Var;
                                                }
                                                r6 = vp0Var16;
                                                e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 6));
                                                if (vp0Var13 != null) {
                                                    r6 = vp0Var16;
                                                    vp0Var13.h(new up1(z02Var7.c));
                                                    return j23Var;
                                                }
                                            }
                                        }
                                    }
                                } else if (vp0Var10 != null) {
                                    vp0Var10.h(new up1(z02Var3.c));
                                    return j23Var;
                                }
                            }
                        } else if (vp0Var6 != null) {
                            vp0Var6.h(new up1(z02Var2.c));
                            return j23Var;
                        }
                    }
                    r6 = vp0Var16;
                    return j23Var;
                }
                vp0Var2.h(new up1(z02Var.c));
                js2Var.k = x20Var3;
                js2Var.l = k22Var4;
                js2Var.m = s01Var;
                m10Var = null;
                js2Var.n = null;
                js2Var.o = null;
                js2Var.p = null;
                js2Var.q = null;
                js2Var.r = null;
                js2Var.s = null;
                js2Var.u = 4;
                if (c(sq2Var2, js2Var) != y20Var) {
                    k22Var6 = k22Var4;
                    x20Var5 = x20Var3;
                    e(x20Var5, s01Var, new gs2(k22Var6, m10Var, (byte) 2));
                    return j23Var;
                }
                return y20Var;
            case 4:
                s01Var = (s01) js2Var.m;
                k22Var6 = (k22) js2Var.l;
                x20Var5 = (x20) js2Var.k;
                m02.y(objH2);
                m10Var = null;
                e(x20Var5, s01Var, new gs2(k22Var6, m10Var, (byte) 2));
                return j23Var;
            case 5:
                s01Var2 = (s01) js2Var.s;
                z02Var3 = (z02) js2Var.r;
                vp0Var10 = (vp0) js2Var.q;
                aq0Var5 = (aq0) js2Var.p;
                vp0 vp0Var23 = (vp0) js2Var.o;
                vp0 vp0Var24 = js2Var.n;
                k22Var5 = (k22) js2Var.m;
                x20Var4 = (x20) js2Var.l;
                sq2 sq2Var7 = (sq2) js2Var.k;
                m02.y(objH2);
                vp0Var9 = vp0Var23;
                sq2Var3 = sq2Var7;
                vp0Var8 = vp0Var24;
                nc1Var = nc1Var;
                j23Var = j23Var;
                z02Var4 = (z02) objH2;
                if (z02Var4 != null) {
                    m10Var2 = null;
                    dn2VarP2 = ie1.p(x20Var4, null, new y8(s01Var2, k22Var5, m10Var2, (byte) 7), 1);
                    if (aq0Var5 != md0Var) {
                        k22 k22Var119 = k22Var5;
                        aq0 aq0Var13 = aq0Var5;
                        k22Var7 = k22Var119;
                        vp0Var11 = null;
                        e(x20Var4, dn2VarP2, new ks2(aq0Var13, k22Var119, z02Var4, m10Var2, (byte) 1));
                    } else {
                        k22Var7 = k22Var5;
                        vp0Var11 = null;
                    }
                    if (vp0Var9 == null) {
                        js2Var.k = x20Var4;
                        js2Var.l = k22Var7;
                        js2Var.m = vp0Var8;
                        js2Var.n = vp0Var10;
                        js2Var.o = dn2VarP2;
                        js2Var.p = z02Var3;
                        js2Var.q = vp0Var11;
                        js2Var.r = vp0Var11;
                        js2Var.s = vp0Var11;
                        js2Var.u = 6;
                        objH2 = h(sq2Var3, s02Var, js2Var);
                        if (objH2 != y20Var) {
                            z02 z02Var16 = z02Var3;
                            s01Var4 = dn2VarP2;
                            z02Var7 = z02Var16;
                            vp0Var13 = vp0Var10;
                            x20Var7 = x20Var4;
                            vp0Var14 = vp0Var8;
                            vp0Var15 = vp0Var11;
                            r6 = vp0Var15;
                            r12 = (z02) objH2;
                            if (r12 != 0) {
                                r6 = vp0Var16;
                                r6 = vp0Var16;
                                r12.a();
                                e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 5));
                                vp0Var14.h(new up1(r12.c));
                                return j23Var;
                            }
                            r6 = vp0Var16;
                            e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 6));
                            if (vp0Var13 != null) {
                                r6 = vp0Var16;
                                vp0Var13.h(new up1(z02Var7.c));
                                return j23Var;
                            }
                        }
                    } else {
                        js2Var.k = sq2Var3;
                        js2Var.l = x20Var4;
                        js2Var.m = k22Var7;
                        js2Var.n = vp0Var8;
                        js2Var.o = vp0Var9;
                        js2Var.p = vp0Var10;
                        js2Var.q = dn2VarP2;
                        js2Var.r = z02Var3;
                        js2Var.s = r25;
                        js2Var.u = 7;
                        objG2 = g(sq2Var3, s02Var, js2Var);
                        if (objG2 != y20Var) {
                            k22 k22Var1110 = k22Var7;
                            z02Var5 = z02Var3;
                            k22Var8 = k22Var1110;
                            x20Var6 = x20Var4;
                            sq2Var4 = sq2Var3;
                            vp0Var12 = vp0Var10;
                            s01Var3 = dn2VarP2;
                            z02Var6 = z02Var4;
                            objH2 = objG2;
                            vp0Var16 = vp0Var11;
                            oc1Var2 = (oc1) objH2;
                            if (uz0.g(oc1Var2, nc1Var)) {
                                vp0Var9.h(new up1(z02Var6.c));
                                js2Var.k = x20Var6;
                                js2Var.l = k22Var8;
                                js2Var.m = s01Var3;
                                js2Var.n = vp0Var16;
                                js2Var.o = vp0Var16;
                                js2Var.p = vp0Var16;
                                js2Var.q = vp0Var16;
                                js2Var.r = vp0Var16;
                                js2Var.s = vp0Var16;
                                js2Var.u = 8;
                                if (c(sq2Var4, js2Var) != y20Var) {
                                    s01Var5 = s01Var3;
                                    x20Var8 = x20Var6;
                                    r7 = vp0Var16;
                                    e(x20Var8, s01Var5, new gs2(k22Var8, r7, (byte) 7));
                                    return j23Var;
                                }
                            } else {
                                if (oc1Var2 instanceof mc1) {
                                    vp0 vp0Var115 = vp0Var8;
                                    r12 = ((mc1) oc1Var2).a;
                                    z02Var7 = z02Var5;
                                    k22Var7 = k22Var8;
                                    s01Var4 = s01Var3;
                                    vp0Var14 = vp0Var115;
                                    vp0Var13 = vp0Var12;
                                    x20Var7 = x20Var6;
                                } else {
                                    if (oc1Var2 instanceof lc1) {
                                        wg.n();
                                        return null;
                                    }
                                    z02Var7 = z02Var5;
                                    vp0Var13 = vp0Var12;
                                    x20Var7 = x20Var6;
                                    k22Var7 = k22Var8;
                                    s01Var4 = s01Var3;
                                    vp0Var14 = vp0Var8;
                                    r12 = vp0Var16;
                                }
                                if (r12 != 0) {
                                    r6 = vp0Var16;
                                    r6 = vp0Var16;
                                    r12.a();
                                    e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 5));
                                    vp0Var14.h(new up1(r12.c));
                                    return j23Var;
                                }
                                r6 = vp0Var16;
                                e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 6));
                                if (vp0Var13 != null) {
                                    r6 = vp0Var16;
                                    vp0Var13.h(new up1(z02Var7.c));
                                    return j23Var;
                                }
                            }
                        }
                    }
                    return y20Var;
                }
                if (vp0Var10 != null) {
                    vp0Var10.h(new up1(z02Var3.c));
                    return j23Var;
                }
                r6 = vp0Var16;
                return j23Var;
            case 6:
                z02Var7 = (z02) js2Var.p;
                s01Var4 = (s01) js2Var.o;
                vp0Var13 = js2Var.n;
                vp0Var14 = (vp0) js2Var.m;
                k22Var7 = (k22) js2Var.l;
                x20Var7 = (x20) js2Var.k;
                m02.y(objH2);
                j23Var = j23Var;
                vp0Var15 = null;
                r6 = vp0Var15;
                r12 = (z02) objH2;
                if (r12 != 0) {
                    r6 = vp0Var16;
                    r6 = vp0Var16;
                    r12.a();
                    e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 5));
                    vp0Var14.h(new up1(r12.c));
                    return j23Var;
                }
                r6 = vp0Var16;
                e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 6));
                if (vp0Var13 != null) {
                    r6 = vp0Var16;
                    vp0Var13.h(new up1(z02Var7.c));
                    return j23Var;
                }
                r6 = vp0Var16;
                return j23Var;
            case 7:
                z02Var6 = (z02) js2Var.s;
                z02 z02Var17 = (z02) js2Var.r;
                s01Var3 = (s01) js2Var.q;
                vp0 vp0Var25 = (vp0) js2Var.p;
                vp0 vp0Var26 = (vp0) js2Var.o;
                vp0 vp0Var27 = js2Var.n;
                k22 k22Var20 = (k22) js2Var.m;
                x20Var6 = (x20) js2Var.l;
                sq2 sq2Var8 = (sq2) js2Var.k;
                m02.y(objH2);
                vp0Var8 = vp0Var27;
                nc1Var = nc1Var;
                j23Var = j23Var;
                vp0Var16 = null;
                vp0Var9 = vp0Var26;
                sq2Var4 = sq2Var8;
                vp0Var12 = vp0Var25;
                z02Var5 = z02Var17;
                k22Var8 = k22Var20;
                oc1Var2 = (oc1) objH2;
                if (uz0.g(oc1Var2, nc1Var)) {
                    vp0Var9.h(new up1(z02Var6.c));
                    js2Var.k = x20Var6;
                    js2Var.l = k22Var8;
                    js2Var.m = s01Var3;
                    js2Var.n = vp0Var16;
                    js2Var.o = vp0Var16;
                    js2Var.p = vp0Var16;
                    js2Var.q = vp0Var16;
                    js2Var.r = vp0Var16;
                    js2Var.s = vp0Var16;
                    js2Var.u = 8;
                    if (c(sq2Var4, js2Var) != y20Var) {
                        s01Var5 = s01Var3;
                        x20Var8 = x20Var6;
                        r7 = vp0Var16;
                        e(x20Var8, s01Var5, new gs2(k22Var8, r7, (byte) 7));
                        return j23Var;
                    }
                    return y20Var;
                }
                if (oc1Var2 instanceof mc1) {
                    vp0 vp0Var116 = vp0Var8;
                    r12 = ((mc1) oc1Var2).a;
                    z02Var7 = z02Var5;
                    k22Var7 = k22Var8;
                    s01Var4 = s01Var3;
                    vp0Var14 = vp0Var116;
                    vp0Var13 = vp0Var12;
                    x20Var7 = x20Var6;
                } else {
                    if (oc1Var2 instanceof lc1) {
                        wg.n();
                        return null;
                    }
                    z02Var7 = z02Var5;
                    vp0Var13 = vp0Var12;
                    x20Var7 = x20Var6;
                    k22Var7 = k22Var8;
                    s01Var4 = s01Var3;
                    vp0Var14 = vp0Var8;
                    r12 = vp0Var16;
                }
                if (r12 != 0) {
                    r6 = vp0Var16;
                    r6 = vp0Var16;
                    r12.a();
                    e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 5));
                    vp0Var14.h(new up1(r12.c));
                    return j23Var;
                }
                r6 = vp0Var16;
                e(x20Var7, s01Var4, new gs2(k22Var7, r6, (byte) 6));
                if (vp0Var13 != null) {
                    r6 = vp0Var16;
                    vp0Var13.h(new up1(z02Var7.c));
                    return j23Var;
                }
                r6 = vp0Var16;
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                s01Var5 = (s01) js2Var.m;
                k22Var8 = (k22) js2Var.l;
                x20Var8 = (x20) js2Var.k;
                m02.y(objH2);
                j23Var = j23Var;
                r7 = 0;
                e(x20Var8, s01Var5, new gs2(k22Var8, r7, (byte) 7));
                return j23Var;
            default:
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(sq2 sq2Var, s02 s02Var, n10 n10Var) {
        ls2 ls2Var;
        x72 x72Var;
        if (n10Var instanceof ls2) {
            ls2Var = (ls2) n10Var;
            int i = ls2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ls2Var.m = i - Integer.MIN_VALUE;
            } else {
                ls2Var = new ls2(n10Var);
            }
        } else {
            ls2Var = new ls2(n10Var);
        }
        Object obj = ls2Var.l;
        int i2 = ls2Var.m;
        m10 m10Var = null;
        try {
            if (i2 == 0) {
                m02.y(obj);
                x72 x72Var2 = new x72();
                x72Var2.h = lc1.a;
                long jC = sq2Var.i().c();
                zp0 un0Var = new un0(s02Var, x72Var2, m10Var, (byte) 2);
                ls2Var.k = x72Var2;
                ls2Var.m = 1;
                Object objM = sq2Var.m(jC, un0Var, ls2Var);
                Object obj2 = y20.h;
                if (objM == obj2) {
                    return obj2;
                }
                x72Var = x72Var2;
            } else {
                if (i2 != 1) {
                    li1.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x72Var = ls2Var.k;
                m02.y(obj);
            }
            return x72Var.h;
        } catch (t02 unused) {
            return nc1.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb A[LOOP:1: B:22:0x006d->B:42:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ab -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object h(defpackage.sq2 r17, defpackage.s02 r18, defpackage.rk r19) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns2.h(sq2, s02, rk):java.lang.Object");
    }
}
