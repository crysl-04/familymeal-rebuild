package defpackage;

import android.content.res.AssetManager;
import com.familymeal.app.data.db.AppDatabase;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tw1 {
    public final AppDatabase a;
    public final AssetManager b;
    public final kp0 c;
    public final ok1 d;
    public final vr e;
    public final zk0 f;

    public tw1(AppDatabase appDatabase, AssetManager assetManager) {
        jw0 jw0Var = new jw0((byte) 24);
        appDatabase.getClass();
        this.a = appDatabase;
        this.b = assetManager;
        this.c = jw0Var;
        this.d = new ok1();
        this.e = new vr(es.x(appDatabase.o().a, new String[]{"person"}, new vw1((byte) 2)), (byte) 3);
        this.f = new zk0(es.x(appDatabase.s().a, new String[]{"schedule_slot"}, new jc2((byte) 13)), this, (byte) 3);
    }

    public static ed2 f(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            p60 p60VarValueOf = p60.valueOf(((kd2) obj).a);
            Object arrayList = linkedHashMap.get(p60VarValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(p60VarValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        lh0 lh0Var = p60.p;
        int iK = ee1.K(ev.o0(lh0Var, 10));
        if (iK < 16) {
            iK = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iK);
        byte b = 0;
        z zVar = new z(lh0Var, b);
        while (zVar.hasNext()) {
            Object next = zVar.next();
            List list2 = (List) linkedHashMap.get((p60) next);
            ag0 ag0Var = ag0.h;
            if (list2 == null) {
                list2 = ag0Var;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj2 : list2) {
                te1 te1VarValueOf = te1.valueOf(((kd2) obj2).b);
                Object arrayList2 = linkedHashMap3.get(te1VarValueOf);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap3.put(te1VarValueOf, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            lh0 lh0Var2 = te1.o;
            int iK2 = ee1.K(ev.o0(lh0Var2, 10));
            if (iK2 < 16) {
                iK2 = 16;
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(iK2);
            z zVar2 = new z(lh0Var2, b);
            while (zVar2.hasNext()) {
                Object next2 = zVar2.next();
                List list3 = (List) linkedHashMap3.get((te1) next2);
                if (list3 == null) {
                    list3 = ag0Var;
                }
                ArrayList arrayList3 = new ArrayList(ev.o0(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((kd2) it.next()).c);
                }
                linkedHashMap4.put(next2, dv.L0(arrayList3));
            }
            linkedHashMap2.put(next, linkedHashMap4);
        }
        return new ed2(linkedHashMap2);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0097 A[LOOP:0: B:26:0x0091->B:28:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, LocalDate localDate, n10 n10Var) {
        gw1 gw1Var;
        LocalDate localDate2;
        Object objD;
        LocalDate localDate3;
        dy1 dy1Var;
        ArrayList arrayList;
        int iIntValue;
        Integer num;
        Integer numValueOf;
        long jBetween;
        long j;
        wt1 wt1Var;
        String str2 = str;
        if (n10Var instanceof gw1) {
            gw1Var = (gw1) n10Var;
            int i = gw1Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                gw1Var.p = i - Integer.MIN_VALUE;
            } else {
                gw1Var = new gw1(this, n10Var);
            }
        } else {
            gw1Var = new gw1(this, n10Var);
        }
        Object obj = gw1Var.n;
        int i2 = gw1Var.p;
        int i3 = 0;
        Object[] objArr = 0;
        Object obj2 = null;
        Object obj3 = y20.h;
        if (i2 == 0) {
            m02.y(obj);
            gw1Var.k = str2;
            localDate2 = localDate;
            gw1Var.l = localDate2;
            gw1Var.p = 1;
            objD = d(str2, gw1Var);
            if (objD != obj3) {
            }
            return obj3;
        }
        if (i2 == 1) {
            LocalDate localDate4 = gw1Var.l;
            String str3 = gw1Var.k;
            m02.y(obj);
            localDate2 = localDate4;
            str2 = str3;
            objD = obj;
        } else {
            if (i2 != 2) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dy1 dy1Var2 = gw1Var.m;
            localDate3 = gw1Var.l;
            m02.y(obj);
            dy1Var = dy1Var2;
        }
        Iterable<s63> iterable = (Iterable) obj;
        arrayList = new ArrayList(ev.o0(iterable, 10));
        for (s63 s63Var : iterable) {
            LocalDate localDate5 = LocalDate.parse(s63Var.b);
            localDate5.getClass();
            arrayList.add(new t63(localDate5, s63Var.c));
        }
        iIntValue = ((Number) this.c.a()).intValue();
        Double dValueOf = Double.valueOf(100.0d);
        dy1Var.getClass();
        double d = dy1Var.m;
        LocalDate localDate6 = dy1Var.n;
        localDate3.getClass();
        num = dy1Var.d;
        if (num != null) {
            numValueOf = Integer.valueOf(iIntValue - num.intValue());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null || numValueOf.intValue() < 18) {
            return new f4("未满 18 岁按成长计算，体重增加是正常的，不做热量调整");
        }
        if (dy1Var.l != null) {
            return new f4("使用手动营养目标时不做自动调整");
        }
        ps2 ps2VarA = rs2.a(dy1Var, iIntValue);
        if (ps2VarA.b != qs2.i) {
            return new f4("请先补全身高体重");
        }
        LocalDate localDateMinusDays = localDate3.minusDays(28L);
        localDateMinusDays.getClass();
        LocalDate localDate7 = localDate6 == null ? LocalDate.MIN : localDate6;
        localDate7.getClass();
        if (localDateMinusDays.compareTo((Object) localDate7) < 0) {
            localDateMinusDays = localDate7;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i3 < size) {
            Object obj4 = arrayList.get(i3);
            i3++;
            t63 t63Var = (t63) obj4;
            Object obj5 = obj2;
            if (t63Var.a.isAfter(localDateMinusDays) && !t63Var.a.isAfter(localDate3)) {
                arrayList2.add(obj4);
            }
            obj2 = obj5;
        }
        Object obj6 = obj2;
        if (!arrayList2.isEmpty()) {
            ChronoUnit chronoUnit = ChronoUnit.DAYS;
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                LocalDate localDate8 = ((t63) it.next()).a;
                while (it.hasNext()) {
                    LocalDate localDate9 = ((t63) it.next()).a;
                    if (localDate8.compareTo((Object) localDate9) > 0) {
                        localDate8 = localDate9;
                    }
                }
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    LocalDate localDate10 = ((t63) it2.next()).a;
                    while (it2.hasNext()) {
                        LocalDate localDate11 = ((t63) it2.next()).a;
                        if (localDate10.compareTo((Object) localDate11) < 0) {
                            localDate10 = localDate11;
                        }
                    }
                    jBetween = chronoUnit.between(localDate8, localDate10);
                }
            }
            wg.p();
            return obj6;
        }
        jBetween = 0;
        if (localDate6 != null) {
            long jBetween2 = 14 - ChronoUnit.DAYS.between(localDate6, localDate3);
            if (jBetween2 < 0) {
                jBetween2 = 0;
            }
            j = jBetween2;
        } else {
            j = 0;
        }
        if (arrayList2.size() < 4 || jBetween < 14 || j > 0) {
            return new e4(arrayList2.size(), jBetween, j);
        }
        Double dF = y02.F(arrayList2);
        if (dF == null) {
            return new e4(arrayList2.size(), jBetween, j);
        }
        double dDoubleValue = dF.doubleValue();
        double d2 = ((-ps2VarA.f) * 7.0d) / 7700.0d;
        Double d3 = dy1Var.f;
        double dDoubleValue2 = d3 != null ? d3.doubleValue() : ((t63) dv.F0(arrayList2)).b;
        double dMax = Math.max(0.5d * Math.abs(d2), 0.1d);
        if (ps2VarA.c == as0.i && dDoubleValue < dDoubleValue2 * (-0.01d)) {
            wt1Var = new wt1(dValueOf, "每周减重超过体重的 1%，过快了，建议多吃一点");
        } else if (dDoubleValue > d2 + dMax) {
            wt1Var = new wt1(Double.valueOf(-100.0d), "体重变化比计划慢，实际消耗可能比估算的低");
        } else {
            if (dDoubleValue >= d2 - dMax) {
                return new g4(dDoubleValue, d2);
            }
            wt1Var = new wt1(dValueOf, "体重下降比计划快（或增长比计划慢），实际消耗可能比估算的高");
        }
        double dDoubleValue3 = ((Number) wt1Var.h).doubleValue();
        String str4 = (String) wt1Var.i;
        double dL = cy1.l(d + dDoubleValue3, -300.0d, 300.0d);
        if (dL == d) {
            return new f4("校准已到上限（±300 kcal），建议咨询营养师");
        }
        Map map = rs2.a;
        e40 e40Var = rs2.a(dy1.a(dy1Var, null, null, null, null, null, null, dL, null, 12287), iIntValue).a;
        e40Var.getClass();
        e40 e40Var2 = ps2VarA.a;
        e40Var2.getClass();
        return (dDoubleValue3 >= 0.0d || e40Var.a.a < e40Var2.a.a) ? new h4(dDoubleValue3, dL, dDoubleValue, d2, str4) : new d4(dDoubleValue, d2);
        dy1 dy1Var3 = (dy1) objD;
        if (dy1Var3 == null) {
            return null;
        }
        r63 r63VarT = this.a.t();
        gw1Var.k = null;
        gw1Var.l = localDate2;
        gw1Var.m = dy1Var3;
        gw1Var.p = 2;
        Object objP = cu.P(gw1Var, new q63(str2, objArr == true ? 1 : 0), r63VarT.a, true, false);
        if (objP != obj3) {
            localDate3 = localDate2;
            dy1Var = dy1Var3;
            obj = objP;
            Iterable<s63> iterable2 = (Iterable) obj;
            arrayList = new ArrayList(ev.o0(iterable2, 10));
            while (r2.hasNext()) {
                LocalDate localDate12 = LocalDate.parse(s63Var.b);
                localDate12.getClass();
                arrayList.add(new t63(localDate12, s63Var.c));
            }
            iIntValue = ((Number) this.c.a()).intValue();
            Double dValueOf2 = Double.valueOf(100.0d);
            dy1Var.getClass();
            double d4 = dy1Var.m;
            LocalDate localDate13 = dy1Var.n;
            localDate3.getClass();
            num = dy1Var.d;
            if (num != null) {
                numValueOf = Integer.valueOf(iIntValue - num.intValue());
            } else {
                numValueOf = null;
            }
            if (numValueOf != null) {
            }
            return new f4("未满 18 岁按成长计算，体重增加是正常的，不做热量调整");
        }
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, n10 n10Var) {
        hw1 hw1Var;
        if (n10Var instanceof hw1) {
            hw1Var = (hw1) n10Var;
            int i = hw1Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                hw1Var.m = i - Integer.MIN_VALUE;
            } else {
                hw1Var = new hw1(this, n10Var);
            }
        } else {
            hw1Var = new hw1(this, n10Var);
        }
        Object obj = hw1Var.k;
        int i2 = hw1Var.m;
        if (i2 == 0) {
            m02.y(obj);
            sx1 sx1VarO = this.a.o();
            hw1Var.m = 1;
            Object objP = cu.P(hw1Var, new ql(str, (byte) 12), sx1VarO.a, false, true);
            y20 y20Var = y20.h;
            if (objP == y20Var) {
                return y20Var;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(obj);
        }
        return j23.a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0076 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #2 {all -> 0x0099, blocks: (B:29:0x0076, B:26:0x005a), top: B:47:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (defpackage.ia2.C(r2, r5, r0) == r7) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.n10 r13) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.iw1
            if (r0 == 0) goto L13
            r0 = r13
            iw1 r0 = (defpackage.iw1) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            iw1 r0 = new iw1
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.l
            int r1 = r0.n
            com.familymeal.app.data.db.AppDatabase r2 = r12.a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            y20 r7 = defpackage.y20.h
            if (r1 == 0) goto L4b
            if (r1 == r5) goto L44
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            ok1 r12 = r0.k
            defpackage.m02.y(r13)     // Catch: java.lang.Throwable -> L93
            goto L8d
        L32:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.li1.g(r12)
            return r6
        L38:
            ok1 r1 = r0.k
            defpackage.m02.y(r13)     // Catch: java.lang.Throwable -> L41
            r11 = r1
            r1 = r13
            r13 = r11
            goto L74
        L41:
            r13 = move-exception
            r12 = r1
            goto L9b
        L44:
            ok1 r1 = r0.k
            defpackage.m02.y(r13)
            r13 = r1
            goto L5a
        L4b:
            defpackage.m02.y(r13)
            ok1 r13 = r12.d
            r0.k = r13
            r0.n = r5
            java.lang.Object r1 = r13.d(r0)
            if (r1 == r7) goto L8b
        L5a:
            ag1 r1 = r2.n()     // Catch: java.lang.Throwable -> L99
            java.lang.String r8 = "people_seed_version"
            r0.k = r13     // Catch: java.lang.Throwable -> L99
            r0.n = r4     // Catch: java.lang.Throwable -> L99
            ga2 r1 = r1.a     // Catch: java.lang.Throwable -> L99
            ql r9 = new ql     // Catch: java.lang.Throwable -> L99
            r10 = 11
            r9.<init>(r8, r10)     // Catch: java.lang.Throwable -> L99
            r8 = 0
            java.lang.Object r1 = defpackage.cu.P(r0, r9, r1, r5, r8)     // Catch: java.lang.Throwable -> L99
            if (r1 == r7) goto L8b
        L74:
            if (r1 != 0) goto L8c
            android.content.res.AssetManager r1 = r12.b     // Catch: java.lang.Throwable -> L99
            ef2 r1 = defpackage.aa3.D(r1)     // Catch: java.lang.Throwable -> L99
            kr r5 = new kr     // Catch: java.lang.Throwable -> L99
            r5.<init>(r12, r1, r6, r4)     // Catch: java.lang.Throwable -> L99
            r0.k = r13     // Catch: java.lang.Throwable -> L99
            r0.n = r3     // Catch: java.lang.Throwable -> L99
            java.lang.Object r12 = defpackage.ia2.C(r2, r5, r0)     // Catch: java.lang.Throwable -> L99
            if (r12 != r7) goto L8c
        L8b:
            return r7
        L8c:
            r12 = r13
        L8d:
            j23 r13 = defpackage.j23.a     // Catch: java.lang.Throwable -> L93
            r12.f(r6)
            return r13
        L93:
            r13 = move-exception
            goto L9b
        L95:
            r11 = r13
            r13 = r12
            r12 = r11
            goto L9b
        L99:
            r12 = move-exception
            goto L95
        L9b:
            r12.f(r6)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw1.c(n10):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, n10 n10Var) {
        mw1 mw1Var;
        if (n10Var instanceof mw1) {
            mw1Var = (mw1) n10Var;
            int i = mw1Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                mw1Var.m = i - Integer.MIN_VALUE;
            } else {
                mw1Var = new mw1(this, n10Var);
            }
        } else {
            mw1Var = new mw1(this, n10Var);
        }
        Object objA = mw1Var.k;
        int i2 = mw1Var.m;
        if (i2 == 0) {
            m02.y(objA);
            sx1 sx1VarO = this.a.o();
            mw1Var.m = 1;
            objA = sx1VarO.a(str, mw1Var);
            y20 y20Var = y20.h;
            if (objA == y20Var) {
                return y20Var;
            }
        } else {
            if (i2 != 1) {
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m02.y(objA);
        }
        by1 by1Var = (by1) objA;
        if (by1Var != null) {
            return cu.j0(by1Var);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object e(dy1 dy1Var, n10 n10Var) {
        sw1 sw1Var;
        Object next;
        sx1 sx1Var;
        dy1 dy1Var2;
        dy1 dy1Var3 = dy1Var;
        if (n10Var instanceof sw1) {
            sw1Var = (sw1) n10Var;
            int i = sw1Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                sw1Var.p = i - Integer.MIN_VALUE;
            } else {
                sw1Var = new sw1(this, n10Var);
            }
        } else {
            sw1Var = new sw1(this, n10Var);
        }
        Object objP = sw1Var.n;
        int i2 = sw1Var.p;
        cw1 cw1Var = cw1.a;
        AppDatabase appDatabase = this.a;
        y20 y20Var = y20.h;
        if (i2 == 0) {
            m02.y(objP);
            r63 r63VarT = appDatabase.t();
            String str = dy1Var3.a;
            sw1Var.k = dy1Var3;
            sw1Var.p = 1;
            objP = cu.P(sw1Var, new q63(str, (byte) 0), r63VarT.a, true, false);
            if (objP != y20Var) {
            }
        }
        if (i2 == 1) {
            dy1Var3 = sw1Var.k;
            m02.y(objP);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    m02.y(objP);
                    return cw1Var;
                }
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dy1Var2 = sw1Var.m;
            sx1Var = sw1Var.l;
            m02.y(objP);
        }
        objP.getClass();
        by1 by1VarF0 = cu.f0(dy1Var2, ((by1) objP).l);
        sw1Var.k = null;
        sw1Var.l = null;
        sw1Var.m = null;
        sw1Var.p = 3;
        return sx1Var.c(by1VarF0, sw1Var) == y20Var ? y20Var : cw1Var;
        dy1 dy1Var4 = dy1Var3;
        Iterator it = ((Iterable) objP).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                String str2 = ((s63) next).b;
                do {
                    Object next2 = it.next();
                    String str3 = ((s63) next2).b;
                    if (str2.compareTo(str3) < 0) {
                        next = next2;
                        str2 = str3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        s63 s63Var = (s63) next;
        if (s63Var != null) {
            double d = s63Var.c;
            Double d2 = dy1Var4.f;
            if (d2 == null || d != d2.doubleValue()) {
                dy1 dy1VarA = dy1.a(dy1Var4, null, null, null, new Double(d), null, null, 0.0d, null, 16351);
                b82 b82Var = bh0.a;
                na1 na1VarF = bh0.f(dy1VarA, ((Number) this.c.a()).intValue());
                if (!na1VarF.isEmpty()) {
                    return new bw1(na1VarF);
                }
                sx1 sx1VarO = appDatabase.o();
                sx1 sx1VarO2 = appDatabase.o();
                String str4 = dy1Var4.a;
                sw1Var.k = null;
                sw1Var.l = sx1VarO;
                sw1Var.m = dy1VarA;
                sw1Var.p = 2;
                objP = sx1VarO2.a(str4, sw1Var);
                if (objP != y20Var) {
                    sx1Var = sx1VarO;
                    dy1Var2 = dy1VarA;
                    objP.getClass();
                    by1 by1VarF1 = cu.f0(dy1Var2, ((by1) objP).l);
                    sw1Var.k = null;
                    sw1Var.l = null;
                    sw1Var.m = null;
                    sw1Var.p = 3;
                    if (sx1Var.c(by1VarF1, sw1Var) == y20Var) {
                    }
                }
            }
        }
    }
}
