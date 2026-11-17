package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j7 implements zp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ j7(byte b, int i, Object obj, Object obj2) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
    }

    @Override // defpackage.zp0
    public final Object f(Object obj, Object obj2) {
        String str;
        boolean z;
        dr0 dr0Var;
        qw2 qw2Var;
        byte b = this.h;
        byte b2 = 29;
        yy yyVar = zy.a;
        j23 j23Var = j23.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        switch (b) {
            case 0:
                o7 o7Var = (o7) obj3;
                int iIntValue = ((Integer) obj).intValue();
                wg2 wg2Var = (wg2) obj2;
                if (!((xg2) obj4).b.b(wg2Var.f)) {
                    o7Var.k(iIntValue, wg2Var);
                    o7Var.n.s(j23Var);
                }
                return j23Var;
            case 1:
                String str2 = (String) obj4;
                kl1 kl1Var = (kl1) obj3;
                dr0 dr0Var2 = (dr0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (dr0Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    List list = pg.a;
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((gr2) it.next()).a.equals(str2)) {
                                dr0Var2.V(-344896232);
                                hm1.a(null, 0L, 0L, null, dt.N(916390242, new ng(str2, kl1Var, (byte) 0), dr0Var2), dr0Var2, 196608);
                                dr0Var2.p(false);
                            }
                        }
                        dr0Var2.V(-344148574);
                        dr0Var2.p(false);
                    } else {
                        dr0Var2.V(-344148574);
                        dr0Var2.p(false);
                    }
                } else {
                    dr0Var2.Q();
                }
                return j23Var;
            case 2:
                hk hkVar = (hk) obj4;
                DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) obj3;
                dr0 dr0Var3 = (dr0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (dr0Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    aw awVarA = yv.a(new ah(4.0f, new wg((byte) 0)), c5.u, dr0Var3, 6);
                    int iHashCode = Long.hashCode(dr0Var3.T);
                    dx1 dx1VarL = dr0Var3.l();
                    rg1 rg1VarU = ls.U(dr0Var3, og1.h);
                    sy.f.getClass();
                    dr0Var3.Y();
                    if (dr0Var3.S) {
                        dr0Var3.k(l41.W);
                    } else {
                        dr0Var3.i0();
                    }
                    h12.y(c5.F, dr0Var3, awVarA);
                    h12.y(c5.E, dr0Var3, dx1VarL);
                    h12.y(c5.G, dr0Var3, Integer.valueOf(iHashCode));
                    h12.t(dr0Var3);
                    h12.y(c5.D, dr0Var3, rg1VarU);
                    OffsetDateTime offsetDateTime = hkVar.f;
                    boolean z2 = hkVar.g;
                    gw2.b(jp1.j("备份时间：", offsetDateTime.format(dateTimeFormatter)), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 0, 0, 262142);
                    gw2.b(wi0.g("食材 ", hkVar.b, " 种 · 菜谱 ", hkVar.c, " 道"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 0, 0, 262142);
                    gw2.b(wi0.g("家人 ", hkVar.d, " 位（其中 ", hkVar.h, " 位本机已有）"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 0, 0, 262142);
                    if (z2) {
                        dr0Var3.V(654846101);
                        gw2.b(jp1.i(hkVar.e, "包含身体数据和 ", " 条体重记录"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 0, 0, 262142);
                        dr0Var3.p(false);
                        str = "以及体重记录";
                    } else {
                        dr0Var3.V(654848027);
                        gw2.b("不含身体数据：本机已有的家人保留原来的身高体重；新家人需要补填。", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 6, 0, 262142);
                        dr0Var3.p(false);
                        str = "";
                    }
                    gw2.b(wi0.h("将覆盖本机的食材、菜谱、家人和时间表", str, "。覆盖前会自动保存当前数据，可以撤销一次。"), null, ((pv) dr0Var3.j(rv.a)).w, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var3, 0, 0, 262138);
                    dr0Var3.p(true);
                } else {
                    dr0Var3.Q();
                }
                return j23Var;
            case 3:
                ((Integer) obj2).getClass();
                ia2.f((rg1) obj4, (vp0) obj3, (dr0) obj, m02.A(1));
                return j23Var;
            case 4:
                vp0 vp0Var = (vp0) obj4;
                dr0 dr0Var4 = (dr0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (dr0Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    gw2.b((String) vp0Var.h(obj3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, dr0Var4, 0, 0, 262142);
                } else {
                    dr0Var4.Q();
                }
                return j23Var;
            case 5:
                ((Integer) obj2).getClass();
                ((f10) obj4).a((e10) obj3, (dr0) obj, m02.A(1));
                return j23Var;
            case 6:
                ((Integer) obj2).getClass();
                n60.l((s40) obj4, (hq) obj3, (dr0) obj, m02.A(1));
                return j23Var;
            case 7:
                ((Integer) obj2).getClass();
                ((y60) obj4).a((wk) obj3, (dr0) obj, m02.A(1));
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                ((Integer) obj2).getClass();
                ((q70) obj4).a((im1) obj3, (dr0) obj, m02.A(1));
                return j23Var;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                ((Integer) obj2).getClass();
                ((y70) obj4).a((sj2) obj3, (dr0) obj, m02.A(1));
                return j23Var;
            case 10:
                gt2 gt2Var = (gt2) obj4;
                fl flVar = (fl) obj3;
                dr0 dr0Var5 = (dr0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (dr0Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zF = dr0Var5.f(gt2Var);
                    Object objK = dr0Var5.K();
                    if (zF || objK == yyVar) {
                        objK = il2.b(new o6(0, gt2Var, gt2.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, (byte) 1));
                        dr0Var5.f0(objK);
                    }
                    e80.a(flVar, (ft2) ((kn2) objK).getValue(), dr0Var5, 0);
                } else {
                    dr0Var5.Q();
                }
                return j23Var;
            case 11:
                ((Integer) obj2).getClass();
                e80.a((fl) obj4, (ft2) obj3, (dr0) obj, m02.A(1));
                return j23Var;
            case 12:
                ((Integer) obj2).getClass();
                vs.i((ll2) obj4, (List) obj3, (dr0) obj, m02.A(1));
                return j23Var;
            case 13:
                ja0 ja0Var = (ja0) obj4;
                pk1 pk1Var = (pk1) obj3;
                dr0 dr0Var6 = (dr0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (dr0Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ja0Var.n.c(pk1Var, dr0Var6, 0);
                } else {
                    dr0Var6.Q();
                }
                return j23Var;
            case 14:
                g82 g82Var = (g82) obj4;
                ik2 ik2Var = (ik2) obj3;
                int iIntValue7 = ((Integer) obj).intValue();
                if (obj2 instanceof hy) {
                    g82Var.f.b((hy) obj2);
                } else if (!(obj2 instanceof i92)) {
                    if (obj2 instanceof hr0) {
                        aa3.G(ik2Var, iIntValue7, obj2);
                        g82Var.e((hr0) obj2);
                    } else if (obj2 instanceof e72) {
                        aa3.G(ik2Var, iIntValue7, obj2);
                        ((e72) obj2).c();
                    }
                }
                return j23Var;
            case 15:
                sj1 sj1Var = (sj1) obj4;
                lw0 lw0Var = (lw0) obj3;
                dr0 dr0Var7 = (dr0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (dr0Var7.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zF2 = dr0Var7.f(sj1Var) | dr0Var7.h(lw0Var);
                    Object objK2 = dr0Var7.K();
                    if (zF2 || objK2 == yyVar) {
                        objK2 = new h6((Object) lw0Var, (Object) sj1Var, (byte) 18);
                        dr0Var7.f0(objK2);
                    }
                    aa3.e((kp0) objK2, null, false, null, null, null, uz0.r, dr0Var7, 805306368, 510);
                } else {
                    dr0Var7.Q();
                }
                return j23Var;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                r41 r41Var = (r41) obj4;
                zp0 zp0Var = (zp0) obj3;
                dr0 dr0Var8 = (dr0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (dr0Var8.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    Boolean bool = (Boolean) r41Var.g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    dr0Var8.X(bool);
                    boolean zG = dr0Var8.g(zBooleanValue);
                    if (zBooleanValue) {
                        zp0Var.f(dr0Var8, 0);
                    } else {
                        if (dr0Var8.l != 0) {
                            ez.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!dr0Var8.S) {
                            if (zG) {
                                dk2 dk2Var = dr0Var8.G;
                                int i = dk2Var.g;
                                int i2 = dk2Var.h;
                                bz bzVar = dr0Var8.M;
                                bzVar.getClass();
                                bzVar.d(false);
                                bzVar.b.h.r0(yq1.c);
                                aa3.H(dr0Var8.s, i, i2);
                                dr0Var8.G.t();
                            } else {
                                dr0Var8.P();
                            }
                        }
                    }
                    if (dr0Var8.y && dr0Var8.G.i == dr0Var8.z) {
                        dr0Var8.z = -1;
                        z = false;
                        dr0Var8.y = false;
                    } else {
                        z = false;
                    }
                    dr0Var8.p(z);
                } else {
                    dr0Var8.Q();
                }
                return j23Var;
            case 17:
                r61 r61Var = (r61) obj4;
                q61 q61Var = (q61) obj3;
                dr0 dr0Var9 = (dr0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (dr0Var9.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    s61 s61Var = (s61) r61Var.b.a();
                    int iE = q61Var.c;
                    Object obj5 = q61Var.a;
                    if ((iE >= s61Var.a() || !s61Var.b(iE).equals(obj5)) && (iE = s61Var.e(obj5)) != -1) {
                        q61Var.c = iE;
                    }
                    if (iE != -1) {
                        dr0Var9.V(-1664741271);
                        cu.o(s61Var, r61Var.a, iE, q61Var.a, dr0Var9, 0);
                        dr0Var = dr0Var9;
                        dr0Var.p(false);
                    } else {
                        dr0Var = dr0Var9;
                        dr0Var.V(-1664505826);
                        dr0Var.p(false);
                    }
                    boolean zH = dr0Var.h(q61Var);
                    Object objK3 = dr0Var.K();
                    if (zH || objK3 == yyVar) {
                        objK3 = new p(q61Var, b2);
                        dr0Var.f0(objK3);
                    }
                    h7.G(obj5, (vp0) objK3, dr0Var);
                } else {
                    dr0Var9.Q();
                }
                return j23Var;
            case 18:
                return ((u61) obj3).a(new v61((r61) obj4, (ap2) obj), ((k00) obj2).a);
            case 19:
                nx nxVar = (nx) obj4;
                d81 d81Var = (d81) obj3;
                dr0 dr0Var10 = (dr0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (dr0Var10.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    nxVar.c(d81Var, dr0Var10, 0);
                } else {
                    dr0Var10.Q();
                }
                return j23Var;
            case 20:
                ((Integer) obj2).getClass();
                vs.d((e91) obj4, (vp0) obj3, (dr0) obj, m02.A(7));
                return j23Var;
            case 21:
                pk1 pk1Var2 = (pk1) obj4;
                nx nxVar2 = (nx) obj3;
                dr0 dr0Var11 = (dr0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (dr0Var11.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ys.b(new i42[]{sb1.a.a(pk1Var2), ob1.a.a(pk1Var2), rb1.a.a(pk1Var2)}, nxVar2, dr0Var11, 8);
                } else {
                    dr0Var11.Q();
                }
                return j23Var;
            case 22:
                ((Integer) obj2).getClass();
                ou.j((pb2) obj4, (nx) obj3, (dr0) obj, m02.A(49));
                return j23Var;
            case 23:
                pk1 pk1Var3 = (pk1) obj4;
                hc hcVar = (hc) obj3;
                dr0 dr0Var12 = (dr0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (dr0Var12.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    dl1 dl1Var = pk1Var3.i;
                    dl1Var.getClass();
                    ((ey) dl1Var).m.o(hcVar, pk1Var3, dr0Var12, 0);
                } else {
                    dr0Var12.Q();
                }
                return j23Var;
            case 24:
                pn1 pn1Var = (pn1) obj4;
                mn1 mn1Var = (mn1) obj3;
                wq wqVar = (wq) obj;
                cs0 cs0Var = (cs0) obj2;
                l41 l41Var = pn1Var.B;
                if (l41Var.J()) {
                    pn1Var.W = wqVar;
                    pn1Var.V = cs0Var;
                    o41.a(l41Var).getSnapshotObserver().a.d(pn1Var, pn1.c0, mn1Var);
                    pn1Var.Z = false;
                } else {
                    pn1Var.Z = true;
                }
                return j23Var;
            case 25:
                sj1 sj1Var2 = (sj1) obj4;
                ay1 ay1Var = (ay1) obj3;
                dr0 dr0Var13 = (dr0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (dr0Var13.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    boolean zF3 = dr0Var13.f(sj1Var2) | dr0Var13.h(ay1Var);
                    Object objK4 = dr0Var13.K();
                    if (zF3 || objK4 == yyVar) {
                        objK4 = new h6((Object) ay1Var, (Object) sj1Var2, (byte) 26);
                        dr0Var13.f0(objK4);
                    }
                    aa3.e((kp0) objK4, null, false, null, null, null, aa3.p, dr0Var13, 805306368, 510);
                } else {
                    dr0Var13.Q();
                }
                return j23Var;
            case 26:
                sj1 sj1Var3 = (sj1) obj4;
                x62 x62Var = (x62) obj3;
                dr0 dr0Var14 = (dr0) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (dr0Var14.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    boolean zF4 = dr0Var14.f(sj1Var3) | dr0Var14.h(x62Var);
                    Object objK5 = dr0Var14.K();
                    if (zF4 || objK5 == yyVar) {
                        objK5 = new h6((Object) x62Var, (Object) sj1Var3, (byte) 28);
                        dr0Var14.f0(objK5);
                    }
                    aa3.e((kp0) objK5, null, false, null, null, null, h7.w, dr0Var14, 805306368, 510);
                } else {
                    dr0Var14.Q();
                }
                return j23Var;
            case 27:
                ((Integer) obj2).getClass();
                ((vz1) obj4).i((Drawable) obj3, (dr0) obj, m02.A(49));
                return j23Var;
            case 28:
                kv2 kv2Var = (kv2) obj4;
                x20 x20Var = (x20) obj3;
                dt2 dt2Var = (dt2) obj;
                Context context = (Context) obj2;
                boolean zH2 = kv2Var.h();
                od odVarK = kv2Var.k();
                ct2 ct2Var = null;
                String str3 = odVarK != null ? odVarK.i : null;
                qw2 qw2Var2 = kv2Var.v;
                if (qw2Var2 != null) {
                    long j = qw2Var2.a;
                    xp1 xp1Var = kv2Var.b;
                    qw2Var = new qw2(m02.a(xp1Var.s((int) (j >> 32)), xp1Var.s((int) (j & 4294967295L))));
                } else {
                    qw2Var = null;
                }
                d02 d02Var = kv2Var.i;
                qb qbVar = new qb((Object) kv2Var, (Object) x20Var, (Object) context, (byte) 19);
                ie0 ie0Var = e02.a;
                if (str3 == null || qw2Var == null || d02Var == null) {
                    qbVar.h(dt2Var);
                    if (str3 != null && qw2Var != null) {
                        y02.e(dt2Var, context, zH2, str3, qw2Var.a);
                    }
                } else {
                    long j2 = qw2Var.a;
                    Object obj6 = d02Var.h;
                    ok1 ok1Var = d02Var.e;
                    if (ok1Var.e()) {
                        ct2 ct2Var2 = (ct2) d02Var.g.getValue();
                        if (ct2Var2 == null || !qw2.b(j2, ct2Var2.b) || !uz0.g(str3, ct2Var2.a)) {
                            ct2Var2 = null;
                        }
                        ok1Var.f(null);
                        ct2Var = ct2Var2;
                    }
                    if (ct2Var == null) {
                        qbVar.h(dt2Var);
                    } else {
                        ArrayList arrayList = ct2Var.d;
                        TextClassification textClassification = ct2Var.c;
                        if (!textClassification.getActions().isEmpty()) {
                            dt2Var.a.a(new st2(obj6, textClassification, 0, (Drawable) arrayList.get(0)));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            dt2Var.a.a(new st2(obj6, textClassification, -1, textClassification.getIcon()));
                        }
                        qbVar.h(dt2Var);
                        List<RemoteAction> actions = textClassification.getActions();
                        int size = actions.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            actions.get(i3);
                            if (i3 > 0) {
                                dt2Var.a.a(new st2(obj6, textClassification, i3, (Drawable) arrayList.get(i3)));
                            }
                        }
                    }
                    y02.e(dt2Var, context, zH2, str3, qw2Var.a);
                }
                return j23Var;
            default:
                dy1 dy1Var = (dy1) obj4;
                kp0 kp0Var = (kp0) obj3;
                dr0 dr0Var15 = (dr0) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (dr0Var15.N(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    de.b(dt.N(1171435161, new s(dy1Var, b2), dr0Var15), null, dt.N(-1676951269, new gw0(kp0Var, (byte) 13), dr0Var15), null, 0.0f, null, null, dr0Var15, 390, 250);
                } else {
                    dr0Var15.Q();
                }
                return j23Var;
        }
    }

    public /* synthetic */ j7(Object obj, Object obj2, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
    }
}
