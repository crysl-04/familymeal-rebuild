package defpackage;

import android.os.Looper;
import android.view.View;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uy1 implements vp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ uy1(su2 su2Var, oz2 oz2Var, sj1 sj1Var) {
        this.h = (byte) 15;
        this.i = oz2Var;
        this.j = sj1Var;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0437  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vp0
    public final Object h(Object obj) {
        String str;
        byte b = 17;
        byte b2 = 4;
        byte b3 = 2;
        byte b4 = 3;
        m10 m10Var = null;
        byte b5 = 1;
        switch (this.h) {
            case 0:
                vy1 vy1Var = (vy1) this.i;
                yy1 yy1Var = (yy1) this.j;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                vy1Var.f.R(sQLiteConnection, yy1Var);
                return j23.a;
            case 1:
                vy1 vy1Var2 = (vy1) this.i;
                vi2 vi2Var = (vi2) this.j;
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                vy1Var2.e.Q(sQLiteConnection2, vi2Var);
                return j23.a;
            case 2:
                m62 m62Var = (m62) this.i;
                y62 y62Var = (y62) this.j;
                SQLiteConnection sQLiteConnection3 = (SQLiteConnection) obj;
                sQLiteConnection3.getClass();
                m62Var.d.R(sQLiteConnection3, y62Var);
                return j23.a;
            case 3:
                x62 x62Var = (x62) this.i;
                sj1 sj1Var = (sj1) this.j;
                String str2 = (String) obj;
                str2.getClass();
                List listE = x62Var.e();
                if (listE == null || !listE.isEmpty()) {
                    Iterator it = listE.iterator();
                    while (it.hasNext()) {
                        if (uz0.g(((w62) it.next()).a, str2)) {
                        }
                    }
                    if (x62Var.e().size() < 40) {
                        x62Var.n.setValue(dv.J0(x62Var.e(), new w62(str2, "100")));
                    }
                } else if (x62Var.e().size() < 40) {
                    x62Var.n.setValue(dv.J0(x62Var.e(), new w62(str2, "100")));
                }
                sj1Var.setValue(Boolean.FALSE);
                return j23.a;
            case 4:
                List list = (List) this.i;
                vp0 vp0Var = (vp0) this.j;
                p71 p71Var = (p71) obj;
                p71Var.getClass();
                p71Var.p0(list.size(), new q9(new vw1((byte) 22), list, (byte) 9), new rw0(list, (byte) 2), new nx(802480018, true, new sw0(list, vp0Var, b5)));
                if (list.isEmpty()) {
                    p71.o0(p71Var, null, h7.C, 3);
                }
                return j23.a;
            case 5:
                bp1 bp1Var = (bp1) this.i;
                bp1 bp1Var2 = (bp1) this.j;
                zo1 zo1Var = (zo1) obj;
                zo1Var.getClass();
                String str3 = zo1Var == zo1.h ? "kcal" : "g";
                int iOrdinal = zo1Var.ordinal();
                if (iOrdinal == 0) {
                    str = "热量";
                } else if (iOrdinal == 1) {
                    str = "蛋白";
                } else if (iOrdinal == 2) {
                    str = "脂肪";
                } else if (iOrdinal == 3) {
                    str = "碳水";
                } else {
                    if (iOrdinal != 4) {
                        wg.n();
                        return null;
                    }
                    str = "纤维";
                }
                return wi0.i(wi0.l(str, " 原 ", t03.t(1, bp1Var.a(zo1Var)), str3, " / 算 "), t03.t(1, bp1Var2.a(zo1Var)), str3);
            case 6:
                ArrayList arrayList = (ArrayList) this.i;
                vp0 vp0Var2 = (vp0) this.j;
                p71 p71Var2 = (p71) obj;
                p71Var2.getClass();
                p71Var2.p0(arrayList.size(), new q9(new vw1((byte) 23), arrayList, (byte) 10), new ba(arrayList, (byte) 1), new nx(802480018, true, new sw0(arrayList, vp0Var2, b3)));
                if (arrayList.isEmpty()) {
                    p71.o0(p71Var2, null, s60.i, 3);
                }
                return j23.a;
            case 7:
                oz ozVar = (oz) this.i;
                nj1 nj1Var = (nj1) this.j;
                ozVar.z(obj);
                if (nj1Var != null) {
                    nj1Var.a(obj);
                }
                return j23.a;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                l72 l72Var = (l72) this.i;
                Throwable th = (Throwable) this.j;
                Throwable th2 = (Throwable) obj;
                synchronized (l72Var.c) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        if (th2 instanceof CancellationException) {
                            th2 = null;
                        }
                        if (th2 != null) {
                            vs.l(th, th2);
                        }
                    }
                    l72Var.e = th;
                    nn2 nn2Var = l72Var.u;
                    i72 i72Var = i72.h;
                    nn2Var.getClass();
                    nn2Var.i(null, i72Var);
                }
                return j23.a;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                a92 a92Var = (a92) this.i;
                ArrayList arrayList2 = (ArrayList) this.j;
                SQLiteConnection sQLiteConnection4 = (SQLiteConnection) obj;
                sQLiteConnection4.getClass();
                a92Var.b.P(sQLiteConnection4, arrayList2);
                return j23.a;
            case 10:
                String str4 = (String) this.i;
                ArrayList arrayList3 = (ArrayList) this.j;
                SQLiteConnection sQLiteConnection5 = (SQLiteConnection) obj;
                sQLiteConnection5.getClass();
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection5.prepare(str4);
                try {
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList3.get(i);
                        i++;
                        sQLiteStatementPrepare.bindText(b5, (String) obj2);
                        b5++;
                    }
                    sQLiteStatementPrepare.step();
                    return j23.a;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 11:
                ((wj1) this.i).a.setValue(new th0((m73) this.j, (m73) obj));
                return j23.a;
            case 12:
                fd2 fd2Var = (fd2) this.i;
                List list2 = (List) this.j;
                SQLiteConnection sQLiteConnection6 = (SQLiteConnection) obj;
                sQLiteConnection6.getClass();
                fd2Var.b.P(sQLiteConnection6, list2);
                return j23.a;
            case 13:
                oe2 oe2Var = (oe2) this.i;
                qe2 qe2Var = (qe2) this.j;
                rc0 rc0Var = (rc0) obj;
                float f = rc0Var.b ? -1.0f : 1.0f;
                long j = rc0Var.a;
                oe2Var.a(1, up1.f(f, qe2Var.d == ks1.i ? up1.a(j, 0.0f, 1) : up1.a(j, 0.0f, 2)));
                return j23.a;
            case 14:
                my1.m((my1) obj, (ny1) this.i, ((cj2) this.j).O);
                return j23.a;
            case 15:
                oz2 oz2Var = (oz2) this.i;
                sj1 sj1Var2 = (sj1) this.j;
                wj2 wj2Var = (wj2) obj;
                float fFloatValue = ((Number) oz2Var.q.getValue()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (wj2Var.a >> 32)) * fFloatValue;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (wj2Var.a & 4294967295L)) * fFloatValue;
                if (Float.intBitsToFloat((int) (((wj2) sj1Var2.getValue()).a >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((wj2) sj1Var2.getValue()).a & 4294967295L)) != fIntBitsToFloat2) {
                    sj1Var2.setValue(new wj2((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)));
                }
                return j23.a;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                zp zpVar = (zp) obj;
                return zpVar.a(new p((Object) new uy1(((hi2) this.i).a(zpVar.h.d(), zpVar.h.getLayoutDirection(), zpVar), (bu2) this.j, b), (byte) 12));
            case 17:
                es.z((td0) obj, (ou) this.i, ((kv) ((bu2) this.j).a.get()).a);
                return j23.a;
            case 18:
                return new ga0((sj1) this.i, (ui1) this.j, b2);
            case 19:
                kp0 kp0Var = (kp0) this.i;
                pv2 pv2Var = (pv2) this.j;
                rt2 rt2Var = (rt2) obj;
                kp0Var.a();
                if (pv2Var != null ? ((Boolean) pv2Var.a()).booleanValue() : true) {
                    rt2Var.close();
                }
                return j23.a;
            case 20:
                ie1.p((x20) this.i, null, new sl1((qz2) this.j, null), 1);
                return new y9((byte) 3);
            case 21:
                qz2 qz2Var = (qz2) this.i;
                oz2 oz2Var2 = (oz2) this.j;
                qz2Var.j.add(oz2Var2);
                return new ga0(qz2Var, oz2Var2, (byte) 7);
            case 22:
                qy qyVar = (qy) this.i;
                ((pf2) qyVar).y(new nl2(new uy1((Object) Thread.currentThread(), this.j, (byte) 25)));
                return new w3(qyVar, (byte) 11);
            case 23:
                qz2 qz2Var2 = (qz2) this.i;
                qz2 qz2Var3 = (qz2) this.j;
                qz2Var2.k.add(qz2Var3);
                return new ga0(qz2Var2, qz2Var3, (byte) 5);
            case 24:
                return new ga0((qz2) this.i, (lz2) this.j, (byte) 6);
            case 25:
                Thread thread = (Thread) this.i;
                x20 x20Var = (x20) this.j;
                kp0 kp0Var2 = (kp0) obj;
                if (thread == Thread.currentThread()) {
                    kp0Var2.a();
                } else {
                    ie1.p(x20Var, null, new pl(kp0Var2, m10Var, b4), 3);
                }
                return j23.a;
            case 26:
                t23 t23Var = (t23) this.i;
                vp0 vp0Var3 = (vp0) this.j;
                ((Long) obj).getClass();
                float f2 = t23Var.e;
                t23Var.e = 0.0f;
                vp0Var3.h(Float.valueOf(f2));
                return j23.a;
            case 27:
                r63 r63Var = (r63) this.i;
                s63 s63Var = (s63) this.j;
                SQLiteConnection sQLiteConnection7 = (SQLiteConnection) obj;
                sQLiteConnection7.getClass();
                r63Var.b.R(sQLiteConnection7, s63Var);
                return j23.a;
            case 28:
                u83 u83Var = (u83) this.i;
                View view = (View) this.j;
                u83Var.a(view);
                return new ga0(u83Var, view, (byte) 8);
            default:
                r93 r93Var = (r93) this.i;
                nx nxVar = (nx) this.j;
                wy wyVar = (wy) obj;
                if (!r93Var.j) {
                    e91 e91VarD = wyVar.d();
                    View view2 = wyVar.a;
                    h91 h91VarG = e91VarD.g();
                    r93Var.l = nxVar;
                    if (r93Var.k == null) {
                        if (uz0.g(Looper.myLooper(), view2.getHandler().getLooper())) {
                            r93Var.k = h91VarG;
                            h91VarG.a(r93Var);
                        } else {
                            view2.post(new l7(r93Var, h91VarG, (byte) 4));
                        }
                    } else if (h91VarG.h.compareTo(x81.j) >= 0) {
                        r93Var.i.A(new nx(-1723985096, true, new s62(r93Var, wyVar, nxVar, b)));
                    }
                }
                return j23.a;
        }
    }

    public /* synthetic */ uy1(Object obj, Object obj2, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
    }
}
