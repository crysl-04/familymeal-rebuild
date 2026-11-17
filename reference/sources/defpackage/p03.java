package defpackage;

import com.familymeal.app.data.db.AppDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class p03 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final AppDatabase_Impl a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final i e;
    public final String[] g;
    public final op1 h;
    public final xl1 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public kp0 k = new r3((byte) 24);
    public final LinkedHashMap f = new LinkedHashMap();

    public p03(AppDatabase_Impl appDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, i iVar) {
        String lowerCase;
        this.a = appDatabase_Impl;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = iVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase4, ee1.J(lowerCase3, linkedHashMap3));
            }
        }
        this.h = new op1(this.g.length);
        this.i = new xl1(this.g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(j12 j12Var, n10 n10Var) {
        i03 i03Var;
        if (n10Var instanceof i03) {
            i03Var = (i03) n10Var;
            int i = i03Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                i03Var.n = i - Integer.MIN_VALUE;
            } else {
                i03Var = new i03(this, n10Var);
            }
        } else {
            i03Var = new i03(this, n10Var);
        }
        Object objB = i03Var.l;
        int i2 = i03Var.n;
        y20 y20Var = y20.h;
        if (i2 == 0) {
            m02.y(objB);
            ss2 ss2Var = new ss2((byte) 17);
            i03Var.k = j12Var;
            i03Var.n = 1;
            objB = j12Var.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1", ss2Var, i03Var);
            if (objB != y20Var) {
            }
            return y20Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) i03Var.k;
            m02.y(objB);
            return set;
        }
        j12Var = (j12) i03Var.k;
        m02.y(objB);
        Set set2 = (Set) objB;
        if (!set2.isEmpty()) {
            i03Var.k = set2;
            i03Var.n = 2;
            if (r02.p(j12Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", i03Var) == y20Var) {
                return y20Var;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(n10 n10Var) {
        k03 k03Var;
        eg egVar;
        Object value;
        int[] iArr;
        if (n10Var instanceof k03) {
            k03Var = (k03) n10Var;
            int i = k03Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                k03Var.n = i - Integer.MIN_VALUE;
            } else {
                k03Var = new k03(this, n10Var);
            }
        } else {
            k03Var = new k03(this, n10Var);
        }
        Object objL = k03Var.l;
        int i2 = k03Var.n;
        m10 m10Var = null;
        if (i2 == 0) {
            m02.y(objL);
            AppDatabase_Impl appDatabase_Impl = this.a;
            eg egVar2 = appDatabase_Impl.g;
            boolean zB = egVar2.b();
            gg0 gg0Var = gg0.h;
            if (!zB) {
                return gg0Var;
            }
            try {
                if (!this.j.compareAndSet(true, false) || !((Boolean) this.k.a()).booleanValue()) {
                    egVar2.J();
                    return gg0Var;
                }
                y8 y8Var = new y8(this, m10Var, (byte) 8);
                k03Var.k = egVar2;
                k03Var.n = 1;
                objL = appDatabase_Impl.l(false, y8Var, k03Var);
                y20 y20Var = y20.h;
                if (objL == y20Var) {
                    return y20Var;
                }
                egVar = egVar2;
            } catch (Throwable th) {
                th = th;
                egVar = egVar2;
                egVar.J();
                throw th;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            egVar = k03Var.k;
            try {
                m02.y(objL);
            } catch (Throwable th2) {
                th = th2;
                egVar.J();
                throw th;
            }
        }
        Set set = (Set) objL;
        if (!set.isEmpty()) {
            xl1 xl1Var = this.i;
            set.getClass();
            if (!set.isEmpty()) {
                nn2 nn2Var = (nn2) xl1Var.i;
                do {
                    value = nn2Var.getValue();
                    int[] iArr2 = (int[]) value;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
                    }
                    qf0 qf0Var = s60.r0;
                    if (value == null) {
                        value = qf0Var;
                    }
                } while (!nn2Var.i(value, iArr));
            }
            this.e.h(set);
        }
        egVar.J();
        return set;
    }

    public final void c(jw0 jw0Var, jw0 jw0Var2) {
        jw0Var.getClass();
        jw0Var2.getClass();
        if (this.j.compareAndSet(false, true)) {
            k10 k10Var = this.a.a;
            m10 m10Var = null;
            if (k10Var != null) {
                ie1.p(k10Var, new t20(t20.i), new ha2(this, jw0Var2, m10Var, (byte) 4), 2);
            } else {
                uz0.A("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0088  */
    /* JADX WARN: Code duplicated, block: B:22:0x008e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (defpackage.r02.p(r1, r3, r4) != r8) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00da, code lost:
    
        if (defpackage.r02.p(r11, r3, r4) == r8) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dc, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00da -> B:27:0x00dd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.j12 r18, int r19, defpackage.n10 r20) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p03.d(j12, int, n10):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0089 -> B:19:0x008c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(defpackage.j12 r8, int r9, defpackage.n10 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.m03
            if (r0 == 0) goto L13
            r0 = r10
            m03 r0 = (defpackage.m03) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            m03 r0 = new m03
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.p
            int r1 = r0.r
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            byte r7 = r0.o
            int r8 = r0.n
            java.lang.String[] r9 = r0.m
            java.lang.String r1 = r0.l
            j12 r3 = r0.k
            defpackage.m02.y(r10)
            r10 = r9
            r9 = r3
            goto L8c
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r7)
            r7 = 0
            return r7
        L38:
            defpackage.m02.y(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = defpackage.p03.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4a:
            if (r8 >= r7) goto L8e
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r4.<init>(r5)
            r4.append(r3)
            r3 = 96
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.k = r9
            r0.l = r1
            r0.m = r10
            r0.n = r8
            r0.o = r7
            r0.r = r2
            java.lang.Object r3 = defpackage.r02.p(r9, r3, r0)
            y20 r4 = defpackage.y20.h
            if (r3 != r4) goto L8c
            return r4
        L8c:
            int r8 = r8 + r2
            goto L4a
        L8e:
            j23 r7 = defpackage.j23.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p03.e(j12, int, n10):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(n10 n10Var) {
        n03 n03Var;
        eg egVar;
        if (n10Var instanceof n03) {
            n03Var = (n03) n10Var;
            int i = n03Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                n03Var.n = i - Integer.MIN_VALUE;
            } else {
                n03Var = new n03(this, n10Var);
            }
        } else {
            n03Var = new n03(this, n10Var);
        }
        Object obj = n03Var.l;
        int i2 = n03Var.n;
        m10 m10Var = null;
        if (i2 == 0) {
            m02.y(obj);
            AppDatabase_Impl appDatabase_Impl = this.a;
            eg egVar2 = appDatabase_Impl.g;
            if (egVar2.b()) {
                try {
                    ul ulVar = new ul(this, m10Var, (byte) 3);
                    n03Var.k = egVar2;
                    n03Var.n = 1;
                    Object objL = appDatabase_Impl.l(false, ulVar, n03Var);
                    y20 y20Var = y20.h;
                    if (objL == y20Var) {
                        return y20Var;
                    }
                    egVar = egVar2;
                    egVar.J();
                } catch (Throwable th) {
                    th = th;
                    egVar = egVar2;
                    egVar.J();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            egVar = n03Var.k;
            try {
                m02.y(obj);
                egVar.J();
            } catch (Throwable th2) {
                th = th2;
                egVar.J();
                throw th;
            }
        }
        return j23.a;
    }
}
