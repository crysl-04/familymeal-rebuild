package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yx implements zp0 {
    public final /* synthetic */ byte h;

    public /* synthetic */ yx(byte b) {
        this.h = b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0070 A[LOOP:0: B:9:0x0029->B:22:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:250:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [qg1] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [qg1] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [uj1] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [uj1] */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        dw dwVar;
        LinkedHashMap linkedHashMap;
        byte b = this.h;
        Bundle bundleL = null;
        j23 j23Var = j23.a;
        switch (b) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (dr0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    gw2.b("用餐时间表", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var, 6, 0, 262142);
                } else {
                    dr0Var.Q();
                }
                return j23Var;
            case 1:
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    eu0.a(tz0.u(), "返回", null, 0L, dr0Var2, 48, 12);
                } else {
                    dr0Var2.Q();
                }
                return j23Var;
            case 2:
                dr0 dr0Var3 = (dr0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dr0Var3.Q();
                }
                return j23Var;
            case 3:
                dr0 dr0Var4 = (dr0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (dr0Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    eu0.a(tz0.u(), "返回", null, 0L, dr0Var4, 48, 12);
                } else {
                    dr0Var4.Q();
                }
                return j23Var;
            case 4:
                dr0 dr0Var5 = (dr0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!dr0Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    dr0Var5.Q();
                }
                return j23Var;
            case 5:
                ((l41) ((sy) obj)).e0((rg1) obj2);
                return j23Var;
            case 6:
                rz rzVar = (rz) obj2;
                l41 l41Var = (l41) ((sy) obj);
                l41Var.H = rzVar;
                ln1 ln1Var = l41Var.L;
                ie0 ie0Var = uz.h;
                dx1 dx1Var = (dx1) rzVar;
                dx1Var.getClass();
                l41Var.a0((e90) dt.M(dx1Var, ie0Var));
                dx1 dx1Var2 = (dx1) rzVar;
                u31 u31Var = (u31) dt.M(dx1Var2, uz.n);
                if (l41Var.F != u31Var) {
                    l41Var.F = u31Var;
                    l41Var.F();
                    l41 l41VarU = l41Var.u();
                    if (l41VarU != null) {
                        l41VarU.D();
                    } else {
                        t6 t6Var = l41Var.u;
                        if (t6Var != null) {
                            t6Var.invalidate();
                        }
                    }
                    l41Var.E();
                    for (qg1 qg1Var = ln1Var.f; qg1Var != null; qg1Var = qg1Var.m) {
                        qg1Var.t0();
                    }
                }
                l41Var.f0((v43) dt.M(dx1Var2, uz.t));
                qg1 qg1Var2 = ln1Var.f;
                if ((qg1Var2.k & 32768) != 0) {
                    while (qg1Var2 != null) {
                        if ((qg1Var2.j & 32768) != 0) {
                            ?? R = qg1Var2;
                            ?? uj1Var = 0;
                            while (R != 0) {
                                if (R instanceof pz) {
                                    qg1 qg1Var3 = ((qg1) ((pz) R)).h;
                                    if (qg1Var3.u) {
                                        vn1.c(qg1Var3);
                                    } else {
                                        qg1Var3.q = true;
                                    }
                                } else if ((R.j & 32768) != 0 && (R instanceof k80)) {
                                    qg1 qg1Var4 = ((k80) R).w;
                                    int i = 0;
                                    while (qg1Var4 != null) {
                                        if ((qg1Var4.j & 32768) != 0) {
                                            i++;
                                            if (i == 1) {
                                                R = R;
                                                uj1Var = uj1Var;
                                                uj1Var = uj1Var;
                                                R = qg1Var4;
                                            } else {
                                                if (uj1Var == 0) {
                                                    uj1Var = new uj1(new qg1[16]);
                                                }
                                                if (R != 0) {
                                                    uj1Var.b(R);
                                                    R = 0;
                                                }
                                                uj1Var.b(qg1Var4);
                                            }
                                        } else {
                                            R = R;
                                            uj1Var = uj1Var;
                                        }
                                        qg1Var4 = qg1Var4.m;
                                        R = R;
                                        uj1Var = uj1Var;
                                    }
                                    if (i != 1) {
                                        R = R;
                                        uj1Var = uj1Var;
                                    } else {
                                        R = R;
                                        uj1Var = uj1Var;
                                    }
                                }
                                R = cu.R(uj1Var);
                            }
                        }
                        if ((qg1Var2.k & 32768) != 0) {
                            qg1Var2 = qg1Var2.m;
                        }
                    }
                }
                return j23Var;
            case 7:
                ((l41) ((sy) obj)).d0((ze1) obj2);
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                ((Integer) obj2).getClass();
                ((l41) ((sy) obj)).getClass();
                return j23Var;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                o20 o20Var = (o20) obj;
                m20 m20Var = (m20) obj2;
                o20Var.getClass();
                m20Var.getClass();
                o20 o20VarT = o20Var.t(m20Var.getKey());
                xf0 xf0Var = xf0.h;
                if (o20VarT == xf0Var) {
                    return m20Var;
                }
                c5 c5Var = c5.L;
                q20 q20Var = (q20) o20VarT.m(c5Var);
                if (q20Var == null) {
                    dwVar = new dw(m20Var, o20VarT);
                } else {
                    o20 o20VarT2 = o20VarT.t(c5Var);
                    if (o20VarT2 == xf0Var) {
                        return new dw(q20Var, m20Var);
                    }
                    dwVar = new dw(q20Var, new dw(m20Var, o20VarT2));
                }
                return dwVar;
            case 10:
                return ((o20) obj).i((m20) obj2);
            case 11:
                return ((o20) obj).i((m20) obj2);
            case 12:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 13:
                o60 o60Var = (o60) obj2;
                Long lB = o60Var.b();
                Long lValueOf = Long.valueOf(((iq) o60Var.e.getValue()).e);
                qy0 qy0Var = o60Var.a;
                return lt.Q(lB, lValueOf, Integer.valueOf(qy0Var.h), Integer.valueOf(qy0Var.i), Integer.valueOf(o60Var.a()));
            case 14:
                ((Integer) obj2).getClass();
                return vg0.d(uz0.y(1.0f, 1600.0f, null, 4), 2);
            case 15:
                ((Integer) obj2).getClass();
                s03 s03Var = vg0.a;
                return new wh0(new pz2((ri0) null, (ck2) null, (bs) null, new ad2(0.7f, 4539628425446424576L, uz0.y(0.0f, 400.0f, null, 5)), (LinkedHashMap) null, 119));
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                return Boolean.valueOf(uz0.g(obj, obj2));
            case 17:
                ((Integer) obj2).getClass();
                return new is0(1L);
            case 18:
                c61 c61Var = (c61) obj2;
                return lt.Q(Integer.valueOf(c61Var.d.b.g()), Integer.valueOf(c61Var.d.c.g()));
            case 19:
                b81 b81Var = (b81) obj2;
                return lt.Q(Integer.valueOf(b81Var.h()), Integer.valueOf(b81Var.i()));
            case 20:
                Map mapD = ((d81) obj2).d();
                if (mapD.isEmpty()) {
                    return null;
                }
                return mapD;
            case 21:
                kl1 kl1Var = (kl1) obj2;
                xk1 xk1Var = kl1Var.b;
                LinkedHashMap linkedHashMap2 = xk1Var.m;
                ih<pk1> ihVar = xk1Var.f;
                LinkedHashMap linkedHashMap3 = xk1Var.l;
                ArrayList arrayList = new ArrayList();
                Bundle bundleL2 = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
                Bundle bundle = xk1Var.d;
                if (bundle != null && bundle.containsKey("android-support-nav:controller:navigatorState:names")) {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        r02.y("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    int size = stringArrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        String str = stringArrayList.get(i2);
                        i2++;
                        String str2 = str;
                        str2.getClass();
                        if (bundle.containsKey(str2)) {
                            Bundle bundle2 = bundle.getBundle(str2);
                            if (bundle2 == null) {
                                r02.y(str2);
                                throw null;
                            }
                            arrayList.add(str2);
                            bundleL2.putBundle(str2, bundle2);
                        }
                    }
                }
                for (Map.Entry entry : ee1.N(xk1Var.s.a).entrySet()) {
                    ((sm1) entry.getValue()).getClass();
                }
                if (!arrayList.isEmpty()) {
                    bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
                    h12.s(bundleL2, "android-support-nav:controller:navigatorState:names", arrayList);
                    bundleL.putBundle("android-support-nav:controller:navigatorState", bundleL2);
                }
                if (ihVar.isEmpty()) {
                    linkedHashMap = linkedHashMap2;
                    if (xk1Var.e != null) {
                        if (bundleL == null) {
                            bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
                        }
                        Bundle[] bundleArr = xk1Var.e;
                        bundleArr.getClass();
                        List listB0 = gi.b0(bundleArr);
                        bundleL.putParcelableArrayList("android-support-nav:controller:backStack", listB0 instanceof ArrayList ? (ArrayList) listB0 : new ArrayList<>(listB0));
                    }
                } else {
                    if (bundleL == null) {
                        bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    for (pk1 pk1Var : ihVar) {
                        pk1Var.getClass();
                        int i3 = pk1Var.i.i.b;
                        String str3 = pk1Var.m;
                        Bundle bundleA = pk1Var.a();
                        LinkedHashMap linkedHashMap4 = linkedHashMap2;
                        Bundle bundleL3 = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
                        pk1Var.o.g(bundleL3);
                        Bundle bundleL4 = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
                        bundleL4.putString("nav-entry-state:id", str3);
                        bundleL4.putInt("nav-entry-state:destination-id", i3);
                        if (bundleA == null) {
                            bundleA = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
                        }
                        bundleL4.putBundle("nav-entry-state:args", bundleA);
                        bundleL4.putBundle("nav-entry-state:saved-state", bundleL3);
                        arrayList2.add(bundleL4);
                        linkedHashMap2 = linkedHashMap4;
                    }
                    linkedHashMap = linkedHashMap2;
                    bundleL.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap3.isEmpty()) {
                    if (bundleL == null) {
                        bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap3.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i4 = 0;
                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                        int iIntValue6 = ((Number) entry2.getKey()).intValue();
                        String str4 = (String) entry2.getValue();
                        int i5 = i4 + 1;
                        iArr[i4] = iIntValue6;
                        if (str4 == null) {
                            str4 = "";
                        }
                        arrayList3.add(str4);
                        i4 = i5;
                    }
                    bundleL.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    h12.s(bundleL, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundleL == null) {
                        bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str5 = (String) entry3.getKey();
                        ih ihVar2 = (ih) entry3.getValue();
                        arrayList4.add(str5);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it = ihVar2.iterator();
                        while (it.hasNext()) {
                            e9 e9Var = ((sk1) it.next()).a;
                            Bundle bundleL5 = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
                            bundleL5.putString("nav-entry-state:id", (String) e9Var.b);
                            bundleL5.putInt("nav-entry-state:destination-id", e9Var.a);
                            Bundle bundleL6 = (Bundle) e9Var.c;
                            if (bundleL6 == null) {
                                bundleL6 = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
                            }
                            bundleL5.putBundle("nav-entry-state:args", bundleL6);
                            bundleL5.putBundle("nav-entry-state:saved-state", (Bundle) e9Var.d);
                            arrayList5.add(bundleL5);
                        }
                        bundleL.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str5, arrayList5);
                    }
                    h12.s(bundleL, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (kl1Var.e) {
                    if (bundleL == null) {
                        bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
                    }
                    bundleL.putBoolean("android-support-nav:controller:deepLinkHandled", kl1Var.e);
                }
                return bundleL;
            case 22:
                return Integer.valueOf(((ue1) obj).d0(((Integer) obj2).intValue()));
            case 23:
                return Integer.valueOf(((ue1) obj).a0(((Integer) obj2).intValue()));
            case 24:
                return Integer.valueOf(((ue1) obj).g(((Integer) obj2).intValue()));
            case 25:
                return Integer.valueOf(((ue1) obj).U(((Integer) obj2).intValue()));
            case 26:
                nb2 nb2Var = (nb2) obj;
                sj1 sj1Var = (sj1) obj2;
                if (!(sj1Var instanceof fl2)) {
                    wg.m("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                    return null;
                }
                fl2 fl2Var = (fl2) sj1Var;
                Object objF = ((zp0) vv2.d.i).f(nb2Var, fl2Var.getValue());
                if (objF == null) {
                    return null;
                }
                hl2 hl2VarD = fl2Var.d();
                hl2VarD.getClass();
                return new lu1(objF, hl2VarD);
            case 27:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 28:
                pb2 pb2Var = (pb2) obj2;
                Map map = pb2Var.h;
                mj1 mj1Var = pb2Var.i;
                Object[] objArr = mj1Var.b;
                Object[] objArr2 = mj1Var.c;
                long[] jArr = mj1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((255 & j) < 128) {
                                    int i9 = (i6 << 3) + i8;
                                    Object obj3 = objArr[i9];
                                    Map mapD2 = ((qb2) objArr2[i9]).d();
                                    if (mapD2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapD2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i7 == 8) {
                                if (i6 != length) {
                                    i6++;
                                }
                            }
                        } else if (i6 != length) {
                            i6++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            default:
                return obj2;
        }
    }
}
