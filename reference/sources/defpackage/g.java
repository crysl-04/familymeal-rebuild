package defpackage;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ g(Object obj, Object obj2, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vp0
    public final Object h(Object obj) {
        h91 h91VarG;
        byte b = this.h;
        m10 m10Var = null;
        byte b2 = 3;
        byte b3 = 2;
        byte b4 = 1;
        Object[] objArr = 0;
        j23 j23Var = j23.a;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                ((ui1) obj3).c((l22) obj2);
                return j23Var;
            case 1:
                return new jx0((q81) obj3, new o9(obj2, (byte) (objArr == true ? 1 : 0)));
            case 2:
                m12 m12Var = (m12) obj3;
                m12Var.setPositionProvider((o12) obj2);
                m12Var.r();
                return new y9((byte) 0);
            case 3:
                xi xiVar = (xi) obj3;
                yi yiVar = (yi) obj2;
                mx2 mx2Var = xiVar.v;
                if (mx2Var != null) {
                    mx2Var.b();
                }
                xiVar.v = null;
                jw jwVar = yiVar.i;
                if (jwVar != null) {
                    jwVar.T(j23Var);
                }
                yiVar.i = null;
                return j23Var;
            case 4:
                vp0 vp0Var = (vp0) obj2;
                vv2 vv2Var = (vv2) obj;
                if (!uz0.g((vv2) obj3, vv2Var)) {
                    vp0Var.h(vv2Var);
                }
                return j23Var;
            case 5:
                ie1.p((x20) obj3, null, new h((km0) obj, (ry2) obj2, m10Var, (byte) 7), 3);
                return j23Var;
            case 6:
                my1.m((my1) obj, (ny1) obj3, ((nn) obj2).v);
                return j23Var;
            case 7:
                rl2 rl2Var = (rl2) obj2;
                n41 n41Var = (n41) obj;
                n41Var.a();
                td0.f(n41Var, (l9) obj3, rl2Var, 0.0f, null, 60);
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                n41 n41Var2 = (n41) obj;
                n41Var2.a();
                td0.f(n41Var2, ((ms1) obj3).g, (rl2) obj2, 0.0f, null, 60);
                return j23Var;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                ((lo) obj3).a.j((u00) obj2);
                return j23Var;
            case 10:
                p81 p81Var = (p81) obj3;
                zo zoVar = (zo) obj2;
                n41 n41Var3 = (n41) obj;
                n41Var3.a();
                if (((Boolean) p81Var.s.getValue()).booleanValue() || ((Boolean) p81Var.t.getValue()).booleanValue()) {
                    td0.V(n41Var3, zoVar, 0L, 0L, 0.0f, null, 126);
                }
                return j23Var;
            case 11:
                List list = (List) obj;
                Long l = (Long) list.get(0);
                Long l2 = (Long) list.get(1);
                Object obj4 = list.get(2);
                obj4.getClass();
                int iIntValue = ((Integer) obj4).intValue();
                Object obj5 = list.get(3);
                obj5.getClass();
                qy0 qy0Var = new qy0(iIntValue, ((Integer) obj5).intValue(), 1);
                Object obj6 = list.get(4);
                obj6.getClass();
                return new o60(l, l2, qy0Var, ((Integer) obj6).intValue(), (vf2) obj3, (Locale) obj2);
            case 12:
                ((ui1) obj3).c((gz0) obj2);
                return j23Var;
            case 13:
                ((ss0) obj3).j.removeCallbacks((z2) obj2);
                return j23Var;
            case 14:
                tv0 tv0Var = (tv0) obj3;
                rv0 rv0Var = (rv0) obj2;
                tv0Var.a.b(rv0Var);
                tv0Var.b.setValue(Boolean.TRUE);
                return new ga0(tv0Var, rv0Var, b4);
            case 15:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                ((yv0) obj3).c.R(sQLiteConnection, (mw0) obj2);
                return j23Var;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                ((yv0) obj3).b.P(sQLiteConnection2, (ArrayList) obj2);
                return j23Var;
            case 17:
                q51 q51Var = (q51) obj2;
                p4 p4VarE = ((u30) obj3).e(((Integer) obj).intValue());
                int i = p4VarE.b;
                List list2 = (List) p4VarE.c;
                ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int i4 = (int) ((is0) list2.get(i3)).a;
                    arrayList.add(new wt1(Integer.valueOf(i), new k00(q51Var.a(i2, i4))));
                    i++;
                    i2 += i4;
                }
                return arrayList;
            case 18:
                q51 q51Var2 = (q51) obj3;
                p51 p51Var = (p51) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                u30 u30Var = q51Var2.e;
                int i5 = u30Var.b;
                int i6 = u30Var.i(iIntValue2);
                return p51Var.q(iIntValue2, 0, i6, p51Var.d, q51Var2.a(0, i6));
            case 19:
                d81 d81Var = (d81) obj3;
                d81Var.j.i(obj2);
                return new ga0(d81Var, obj2, b3);
            case 20:
                return new d81((qb2) obj3, (Map) obj, (pb2) obj2);
            case 21:
                SQLiteConnection sQLiteConnection3 = (SQLiteConnection) obj;
                sQLiteConnection3.getClass();
                ((ag1) obj3).b.R(sQLiteConnection3, (bg1) obj2);
                return j23Var;
            case 22:
                ((zh1) obj3).c.add(new wh1(obj, (ds) obj2));
                return j23Var;
            case 23:
                dl1 dl1Var = (dl1) obj3;
                xk1 xk1Var = ((kl1) obj2).b;
                wl1 wl1Var = (wl1) obj;
                wl1Var.getClass();
                ji0 ji0Var = wl1Var.a;
                ji0Var.a = 0;
                ji0Var.b = 0;
                if (dl1Var instanceof gl1) {
                    int i7 = dl1.l;
                    for (dl1 dl1Var2 : es.L(dl1Var)) {
                        dl1 dl1VarF = xk1Var.f();
                        if (uz0.g(dl1Var2, dl1VarF != null ? dl1VarF.j : null)) {
                        }
                    }
                    int i8 = gl1.n;
                    wl1Var.d = ls.x(xk1Var.g()).i.b;
                    wl1Var.e = true;
                }
                return j23Var;
            case 24:
                ll1 ll1Var = (ll1) obj2;
                wk.d((wk) obj3, ll1Var);
                return new w3(ll1Var, (byte) 10);
            case 25:
                return new ga0((kn2) obj3, (fy) obj2, b2);
            case 26:
                kl1 kl1Var = (kl1) obj3;
                e91 e91Var = (e91) obj2;
                kl1Var.getClass();
                e91Var.getClass();
                xk1 xk1Var2 = kl1Var.b;
                uk1 uk1Var = xk1Var2.r;
                if (!e91Var.equals(xk1Var2.n)) {
                    e91 e91Var2 = xk1Var2.n;
                    if (e91Var2 != null && (h91VarG = e91Var2.g()) != null) {
                        h91VarG.f(uk1Var);
                    }
                    xk1Var2.n = e91Var;
                    e91Var.g().a(uk1Var);
                }
                return new y9((byte) 2);
            case 27:
                ot1 ot1Var = (ot1) obj3;
                ny1 ny1Var = (ny1) obj2;
                my1 my1Var = (my1) obj;
                boolean z = ot1Var.z;
                float f = ot1Var.v;
                if (z) {
                    my1.k(my1Var, ny1Var, my1Var.R(f), my1Var.R(ot1Var.w));
                } else {
                    my1.i(my1Var, ny1Var, my1Var.R(f), my1Var.R(ot1Var.w));
                }
                return j23Var;
            case 28:
                SQLiteConnection sQLiteConnection4 = (SQLiteConnection) obj;
                sQLiteConnection4.getClass();
                ((sx1) obj3).c.R(sQLiteConnection4, (by1) obj2);
                return j23Var;
            default:
                SQLiteConnection sQLiteConnection5 = (SQLiteConnection) obj;
                sQLiteConnection5.getClass();
                ((sx1) obj3).b.P(sQLiteConnection5, (ArrayList) obj2);
                return j23Var;
        }
    }
}
