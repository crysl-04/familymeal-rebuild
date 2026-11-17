package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o6 extends kq0 implements kp0 {
    public final /* synthetic */ byte o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.o = b;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x04b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x04b6 A[LOOP:5: B:131:0x0483->B:141:0x04b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:188:0x0563 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x0565 A[LOOP:9: B:179:0x0537->B:189:0x0565, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:218:0x0568 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0568 A[SYNTHETIC] */
    @Override // defpackage.kp0
    public final Object a() throws Exception {
        ln1 ln1Var;
        byte b = this.o;
        byte b2 = 8;
        n63 n63Var = n63.i;
        byte b3 = 1;
        j23 j23Var = j23.a;
        m10 m10Var = null;
        Object obj = this.i;
        switch (b) {
            case 0:
                View view = (View) obj;
                if (Build.VERSION.SDK_INT >= 30) {
                    a2.f(view);
                }
                ContentCaptureSession contentCaptureSession = view.getContentCaptureSession();
                if (contentCaptureSession != null) {
                    return new ix0(contentCaptureSession, view, b2);
                }
                return null;
            case 1:
                return ((gt2) obj).s0();
            case 2:
                zl0 zl0Var = (zl0) obj;
                nj1 nj1Var = zl0Var.c;
                nj1 nj1Var2 = zl0Var.d;
                em0 em0Var = zl0Var.a;
                lm0 lm0VarF = em0Var.f();
                km0 km0Var = km0.j;
                if (lm0VarF == null) {
                    Object[] objArr = nj1Var2.b;
                    long[] jArr = nj1Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((j & 255) < 128) {
                                        ((vl0) objArr[(i << 3) + i3]).W(km0Var);
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
                } else if (lm0VarF.u) {
                    if (nj1Var.c(lm0VarF)) {
                        lm0VarF.P0();
                    }
                    km0 km0VarO0 = lm0VarF.O0();
                    if (!lm0VarF.h.u) {
                        ax0.b("visitAncestors called on an unattached node");
                    }
                    qg1 qg1Var = lm0VarF.h;
                    l41 l41VarY = cu.Y(lm0VarF);
                    int i4 = 0;
                    while (l41VarY != null) {
                        if ((l41VarY.L.f.k & 5120) != 0) {
                            while (qg1Var != null) {
                                int i5 = qg1Var.j;
                                if ((i5 & 5120) != 0) {
                                    if ((i5 & 1024) != 0) {
                                        i4++;
                                    }
                                    if ((qg1Var instanceof vl0) && nj1Var2.c(qg1Var)) {
                                        if (i4 <= 1) {
                                            ((vl0) qg1Var).W(km0VarO0);
                                        } else {
                                            ((vl0) qg1Var).W(km0.i);
                                        }
                                        nj1Var2.l(qg1Var);
                                    }
                                }
                                qg1Var = qg1Var.l;
                            }
                        }
                        l41VarY = l41VarY.u();
                        qg1Var = (l41VarY == null || (ln1Var = l41VarY.L) == null) ? null : ln1Var.e;
                    }
                    Object[] objArr2 = nj1Var2.b;
                    long[] jArr2 = nj1Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr2[i6];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j2 & 255) < 128) {
                                        ((vl0) objArr2[(i6 << 3) + i8]).W(km0Var);
                                    }
                                    j2 >>= 8;
                                }
                                if (i7 == 8) {
                                    if (i6 != length2) {
                                        i6++;
                                    }
                                }
                            } else if (i6 != length2) {
                                i6++;
                            }
                        }
                    }
                }
                if (em0Var.f() == null || em0Var.c.O0() == km0Var) {
                    em0Var.c();
                }
                nj1Var.b();
                nj1Var2.b();
                zl0Var.e = false;
                return j23Var;
            case 3:
                return Boolean.valueOf(lm0.S0(((pm0) obj).C));
            case 4:
                lw0 lw0Var = (lw0) obj;
                Map mapL = ee1.L(new wt1("kcal", (String) lw0Var.g.getValue()), new wt1("protein", (String) lw0Var.h.getValue()), new wt1("fat", (String) lw0Var.i.getValue()), new wt1("carb", (String) lw0Var.j.getValue()), new wt1("fiber", (String) lw0Var.k.getValue()));
                LinkedHashMap linkedHashMap = new LinkedHashMap(ee1.K(mapL.size()));
                for (Map.Entry entry : mapL.entrySet()) {
                    linkedHashMap.put(entry.getKey(), t03.K((String) entry.getValue()));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (((Double) entry2.getValue()) == null) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(ee1.K(linkedHashMap2.size()));
                Iterator it = linkedHashMap2.entrySet().iterator();
                while (it.hasNext()) {
                    linkedHashMap3.put(((Map.Entry) it.next()).getKey(), "请输入数字");
                }
                if (linkedHashMap3.isEmpty()) {
                    String strE = lw0Var.c;
                    if (strE == null) {
                        strE = bh0.e("ing");
                    }
                    String string = co2.g0((String) lw0Var.e.getValue()).toString();
                    String string2 = co2.g0((String) lw0Var.f.getValue()).toString();
                    Object obj2 = linkedHashMap.get("kcal");
                    obj2.getClass();
                    double dDoubleValue = ((Number) obj2).doubleValue();
                    Object obj3 = linkedHashMap.get("protein");
                    obj3.getClass();
                    double dDoubleValue2 = ((Number) obj3).doubleValue();
                    Object obj4 = linkedHashMap.get("fat");
                    obj4.getClass();
                    double dDoubleValue3 = ((Number) obj4).doubleValue();
                    Object obj5 = linkedHashMap.get("carb");
                    obj5.getClass();
                    double dDoubleValue4 = ((Number) obj5).doubleValue();
                    Object obj6 = linkedHashMap.get("fiber");
                    obj6.getClass();
                    ie1.p(h7.h0(lw0Var), null, new h(lw0Var, new uv0(strE, string, string2, new bp1(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, ((Number) obj6).doubleValue())), m10Var, (byte) 19), 3);
                } else {
                    lw0Var.l.setValue(linkedHashMap3);
                }
                return j23Var;
            case 5:
                ay1 ay1Var = (ay1) obj;
                ay1Var.getClass();
                lu1 lu1Var = ay1Var.n;
                lu1 lu1Var2 = ay1Var.k;
                lu1 lu1Var3 = ay1Var.j;
                wd1 wd1Var = new wd1();
                if (jo2.O((String) ay1Var.i.getValue()) == null) {
                    wd1Var.put("birthYear", "请输入四位年份");
                }
                if (!co2.X((String) lu1Var3.getValue()) && t03.K((String) lu1Var3.getValue()) == null) {
                    wd1Var.put("height", "请输入数字");
                }
                if (!co2.X((String) lu1Var2.getValue()) && t03.K((String) lu1Var2.getValue()) == null) {
                    wd1Var.put("weight", "请输入数字");
                }
                if (ay1Var.h() == as0.i && !co2.X((String) lu1Var.getValue()) && t03.K((String) lu1Var.getValue()) == null) {
                    wd1Var.put("targetWeight", "请输入数字");
                }
                if (((Boolean) ay1Var.r.getValue()).booleanValue() && ay1Var.j() == null) {
                    wd1Var.put("manual", "请填写所有下限，且上限不小于下限");
                }
                wd1 wd1VarB = wd1Var.b();
                if (wd1VarB.isEmpty()) {
                    dy1 dy1VarF = ay1Var.f();
                    dy1VarF.getClass();
                    String strE2 = ay1Var.d;
                    if (strE2 == null) {
                        strE2 = bh0.e("p");
                    }
                    ie1.p(h7.h0(ay1Var), null, new h(ay1Var, dy1.a(dy1VarF, strE2, null, null, null, null, null, 0.0d, null, 16382), m10Var, (byte) 25), 3);
                } else {
                    ay1Var.t.setValue(wd1VarB);
                }
                return j23Var;
            case 6:
                x62 x62Var = (x62) obj;
                x62Var.getClass();
                lu1 lu1Var4 = x62Var.q;
                lu1 lu1Var5 = x62Var.j;
                wd1 wd1Var2 = new wd1();
                lu1 lu1Var6 = x62Var.i;
                if (jo2.O((String) lu1Var6.getValue()) == null) {
                    wd1Var2.put("servings", "请输入整数");
                }
                if (jo2.O((String) lu1Var5.getValue()) == null) {
                    wd1Var2.put("minDiners", "请输入整数");
                }
                List listE = x62Var.e();
                if (listE == null || !listE.isEmpty()) {
                    Iterator it2 = listE.iterator();
                    while (it2.hasNext()) {
                        if (t03.K(((w62) it2.next()).b) == null) {
                            wd1Var2.put("ingredients", "请为每种食材填写用量");
                        }
                    }
                }
                wd1 wd1VarB2 = wd1Var2.b();
                if (wd1VarB2.isEmpty()) {
                    List<w62> listE2 = x62Var.e();
                    ArrayList arrayList = new ArrayList(ev.o0(listE2, 10));
                    for (w62 w62Var : listE2) {
                        String str = w62Var.a;
                        Double dK = t03.K(w62Var.b);
                        dK.getClass();
                        arrayList.add(new z62(str, dK.doubleValue()));
                    }
                    int i9 = Integer.parseInt((String) lu1Var6.getValue());
                    int i10 = Integer.parseInt((String) lu1Var5.getValue());
                    if (i9 < 1 || i10 < 1) {
                        wd1 wd1Var3 = new wd1();
                        if (i9 < 1) {
                            wd1Var3.put("servings", "基准份数需在 1–20");
                        }
                        if (i10 < 1) {
                            wd1Var3.put("minDiners", "最少用餐人数需在 1–20");
                        }
                        lu1Var4.setValue(wd1Var3.b());
                    } else {
                        String strE3 = x62Var.c;
                        if (strE3 == null) {
                            strE3 = bh0.e("rcp");
                        }
                        String str2 = strE3;
                        String string3 = co2.g0((String) x62Var.e.getValue()).toString();
                        Set set = (Set) x62Var.g.getValue();
                        zr zrVar = (zr) x62Var.f.getValue();
                        b82 b82Var = bh0.a;
                        bp1 bp1VarA = bh0.a(arrayList, (Map) x62Var.o.getValue());
                        Set set2 = x62Var.m;
                        Set setF = x62Var.f();
                        set2.getClass();
                        setF.getClass();
                        Integer numValueOf = setF instanceof Collection ? Integer.valueOf(setF.size()) : null;
                        LinkedHashSet linkedHashSet = new LinkedHashSet(ee1.K(numValueOf != null ? set2.size() + numValueOf.intValue() : set2.size() << 1));
                        linkedHashSet.addAll(set2);
                        iv.q0(setF, linkedHashSet);
                        ie1.p(h7.h0(x62Var), null, new h(x62Var, new j62(str2, string3, set, zrVar, i9, i10, arrayList, bp1VarA, linkedHashSet, (cf2) x62Var.h.getValue(), ((Boolean) x62Var.k.getValue()).booleanValue()), m10Var, (byte) 28), 3);
                    }
                } else {
                    lu1Var4.setValue(wd1VarB2);
                }
                return j23Var;
            case 7:
                ga2 ga2Var = (ga2) obj;
                k10 k10Var = ga2Var.a;
                if (k10Var == null) {
                    uz0.A("coroutineScope");
                    throw null;
                }
                vs.q(k10Var, null);
                ga2Var.e();
                ea2 ea2Var = ga2Var.e;
                if (ea2Var == null) {
                    uz0.A("connectionManager");
                    throw null;
                }
                ea2Var.L.close();
                SupportSQLiteOpenHelper supportSQLiteOpenHelper = ea2Var.M;
                if (supportSQLiteOpenHelper != null) {
                    supportSQLiteOpenHelper.close();
                }
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                p63 p63Var = (p63) obj;
                p63Var.getClass();
                p63Var.g(n63Var, new qy2(p63Var, m10Var, b3));
                return j23Var;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                p63 p63Var2 = (p63) obj;
                dn2 dn2Var = p63Var2.l;
                if (dn2Var != null) {
                    dn2Var.a(null);
                }
                p63Var2.j.setValue(null);
                p63Var2.k.setValue("已取消，食谱保持不变");
                return j23Var;
            default:
                p63 p63Var3 = (p63) obj;
                p63Var3.getClass();
                p63Var3.g(n63Var, new qy2(p63Var3, m10Var, b3));
                return j23Var;
        }
    }
}
