package defpackage;

import androidx.sqlite.SQLiteConnection;
import com.familymeal.app.data.db.AppDatabase;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class jz1 extends mq2 implements vp0 {
    public byte l;
    public final /* synthetic */ kz1 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ LocalDate o;
    public final /* synthetic */ sl2 p;
    public final /* synthetic */ c63 q;
    public final /* synthetic */ LinkedHashMap r;
    public final /* synthetic */ Set s;
    public final /* synthetic */ aw1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz1(kz1 kz1Var, String str, LocalDate localDate, sl2 sl2Var, c63 c63Var, LinkedHashMap linkedHashMap, Set set, aw1 aw1Var, m10 m10Var) {
        super(1, m10Var);
        this.m = kz1Var;
        this.n = str;
        this.o = localDate;
        this.p = sl2Var;
        this.q = c63Var;
        this.r = linkedHashMap;
        this.s = set;
        this.t = aw1Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) {
        Set set = this.s;
        aw1 aw1Var = this.t;
        return new jz1(this.m, this.n, this.o, this.p, this.q, this.r, set, aw1Var, (m10) obj).r(j23.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ae A[PHI: r3 r4
  0x00ae: PHI (r3v3 y20) = (r3v1 y20), (r3v4 y20) binds: [B:22:0x00ac, B:13:0x0044] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r4v3 boolean) = (r4v1 boolean), (r4v4 boolean) binds: [B:22:0x00ac, B:13:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c8 A[PHI: r3 r4
  0x00c8: PHI (r3v5 y20) = (r3v3 y20), (r3v6 y20) binds: [B:26:0x00c6, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00c8: PHI (r4v5 boolean) = (r4v3 boolean), (r4v6 boolean) binds: [B:26:0x00c6, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00de  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e2 A[PHI: r3 r4
  0x00e2: PHI (r3v7 y20) = (r3v5 y20), (r3v8 y20) binds: [B:30:0x00e0, B:11:0x0036] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r4v7 boolean) = (r4v5 boolean), (r4v8 boolean) binds: [B:30:0x00e0, B:11:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fc A[PHI: r3
  0x00fc: PHI (r3v9 y20) = (r3v7 y20), (r3v10 y20) binds: [B:34:0x00fa, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0115  */
    /* JADX WARN: Code duplicated, block: B:41:0x013c  */
    /* JADX WARN: Code duplicated, block: B:43:0x015b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0193  */
    /* JADX WARN: Code duplicated, block: B:50:0x0197 A[PHI: r3 r19
  0x0197: PHI (r3v11 y20) = (r3v9 y20), (r3v12 y20) binds: [B:49:0x0195, B:9:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x0197: PHI (r19v2 com.familymeal.app.data.db.AppDatabase) = (r19v0 com.familymeal.app.data.db.AppDatabase), (r19v3 com.familymeal.app.data.db.AppDatabase) binds: [B:49:0x0195, B:9:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ef A[LOOP:3: B:57:0x01e9->B:59:0x01ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0226  */
    /* JADX WARN: Code duplicated, block: B:66:0x022a A[PHI: r3 r19
  0x022a: PHI (r3v14 y20) = (r3v11 y20), (r3v15 y20) binds: [B:65:0x0228, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x022a: PHI (r19v4 com.familymeal.app.data.db.AppDatabase) = (r19v2 com.familymeal.app.data.db.AppDatabase), (r19v5 com.familymeal.app.data.db.AppDatabase) binds: [B:65:0x0228, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0247 A[LOOP:0: B:67:0x0241->B:69:0x0247, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x028e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0293 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x015c A[SYNTHETIC] */
    @Override // defpackage.rk
    public final Object r(Object obj) {
        y20 y20Var;
        boolean z;
        Object objP;
        Object objP2;
        Object objP3;
        Object objP4;
        final ArrayList arrayList;
        AppDatabase appDatabase;
        Object objP5;
        ek2 ek2Var;
        ArrayList arrayList2;
        String str;
        final ArrayList arrayList3;
        z zVar;
        byte b;
        Object objP6;
        p60 p60Var;
        ArrayList arrayList4;
        z zVar2;
        te1 te1Var;
        ArrayList arrayList5;
        Iterator it;
        final ArrayList arrayList6;
        Object objP7;
        AppDatabase appDatabase2 = this.m.a;
        byte b2 = this.l;
        c63 c63Var = this.q;
        String str2 = this.n;
        byte b3 = 0;
        j23 j23Var = j23.a;
        y20 y20Var2 = y20.h;
        switch (b2) {
            case 0:
                m02.y(obj);
                vy1 vy1VarP = appDatabase2.p();
                LocalDate localDate = this.o;
                String string = localDate.toString();
                string.getClass();
                int monthValue = localDate.getMonthValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                sl2 sl2Var = this.p;
                y20Var = y20Var2;
                z = true;
                yy1 yy1Var = new yy1(str2, string, monthValue, jCurrentTimeMillis, sl2Var.a.name(), sl2Var.c, sl2Var.e);
                this.l = (byte) 1;
                Object objP8 = cu.P(this, new uy1(vy1VarP, yy1Var, b3), vy1VarP.a, false, true);
                if (objP8 != y20Var) {
                    objP8 = j23Var;
                }
                if (objP8 != y20Var) {
                    vy1 vy1VarP2 = appDatabase2.p();
                    this.l = (byte) 2;
                    objP = cu.P(this, new ql(str2, (byte) 21), vy1VarP2.a, false, z);
                    if (objP != y20Var) {
                        objP = j23Var;
                    }
                    if (objP != y20Var) {
                        vy1 vy1VarP3 = appDatabase2.p();
                        this.l = (byte) 3;
                        objP2 = cu.P(this, new ql(str2, (byte) 22), vy1VarP3.a, false, z);
                        if (objP2 != y20Var) {
                            objP2 = j23Var;
                        }
                        if (objP2 != y20Var) {
                            vy1 vy1VarP4 = appDatabase2.p();
                            this.l = (byte) 4;
                            objP3 = cu.P(this, new ql(str2, (byte) 14), vy1VarP4.a, false, z);
                            if (objP3 != y20Var) {
                                objP3 = j23Var;
                            }
                            if (objP3 != y20Var) {
                                vy1 vy1VarP5 = appDatabase2.p();
                                this.l = (byte) 5;
                                objP4 = cu.P(this, new ql(str2, (byte) 20), vy1VarP5.a, false, z);
                                if (objP4 != y20Var) {
                                    objP4 = j23Var;
                                }
                                if (objP4 != y20Var) {
                                    final vy1 vy1VarP6 = appDatabase2.p();
                                    LinkedHashMap linkedHashMap = c63Var.a;
                                    arrayList = new ArrayList();
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        ek2Var = (ek2) entry.getKey();
                                        List<String> list = (List) entry.getValue();
                                        arrayList2 = new ArrayList(ev.o0(list, 10));
                                        for (String str3 : list) {
                                            String strName = ek2Var.a.name();
                                            String strName2 = ek2Var.b.name();
                                            str = (String) this.r.get(str3);
                                            if (str == null) {
                                                str = str3;
                                            }
                                            AppDatabase appDatabase3 = appDatabase2;
                                            ArrayList arrayList7 = arrayList2;
                                            arrayList7.add(new xy1(str2, strName, strName2, str3, str, this.s.contains(new wt1(ek2Var, str3))));
                                            ek2Var = ek2Var;
                                            arrayList2 = arrayList7;
                                            appDatabase2 = appDatabase3;
                                        }
                                        iv.q0(arrayList2, arrayList);
                                    }
                                    appDatabase = appDatabase2;
                                    this.l = (byte) 6;
                                    final byte b4 = 1;
                                    objP5 = cu.P(this, new vp0() { // from class: ty1
                                        @Override // defpackage.vp0
                                        public final Object h(Object obj2) {
                                            byte b5 = b4;
                                            j23 j23Var2 = j23.a;
                                            ArrayList arrayList8 = arrayList;
                                            vy1 vy1Var = vy1VarP6;
                                            SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                                            switch (b5) {
                                                case 0:
                                                    sQLiteConnection.getClass();
                                                    vy1Var.d.P(sQLiteConnection, arrayList8);
                                                    break;
                                                case 1:
                                                    sQLiteConnection.getClass();
                                                    vy1Var.b.P(sQLiteConnection, arrayList8);
                                                    break;
                                                default:
                                                    sQLiteConnection.getClass();
                                                    vy1Var.c.P(sQLiteConnection, arrayList8);
                                                    break;
                                            }
                                            return j23Var2;
                                        }
                                    }, vy1VarP6.a, false, true);
                                    if (objP5 != y20Var) {
                                        objP5 = j23Var;
                                    }
                                    if (objP5 != y20Var) {
                                        final vy1 vy1VarP7 = appDatabase.p();
                                        arrayList3 = new ArrayList();
                                        lh0 lh0Var = p60.p;
                                        lh0Var.getClass();
                                        b = 0;
                                        zVar = new z(lh0Var, b);
                                        while (zVar.hasNext()) {
                                            p60Var = (p60) zVar.next();
                                            arrayList4 = new ArrayList();
                                            lh0 lh0Var2 = te1.o;
                                            lh0Var2.getClass();
                                            zVar2 = new z(lh0Var2, b);
                                            while (zVar2.hasNext()) {
                                                te1Var = (te1) zVar2.next();
                                                List listA = this.t.b.a(p60Var, te1Var);
                                                arrayList5 = new ArrayList(ev.o0(listA, 10));
                                                it = listA.iterator();
                                                while (it.hasNext()) {
                                                    arrayList5.add(new wy1(str2, p60Var.name(), te1Var.name(), (String) it.next()));
                                                    p60Var = p60Var;
                                                }
                                                iv.q0(arrayList5, arrayList4);
                                            }
                                            iv.q0(arrayList4, arrayList3);
                                            b = 0;
                                        }
                                        this.l = (byte) 7;
                                        final byte b5 = 2;
                                        objP6 = cu.P(this, new vp0() { // from class: ty1
                                            @Override // defpackage.vp0
                                            public final Object h(Object obj2) {
                                                byte b6 = b5;
                                                j23 j23Var2 = j23.a;
                                                ArrayList arrayList8 = arrayList3;
                                                vy1 vy1Var = vy1VarP7;
                                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                                                switch (b6) {
                                                    case 0:
                                                        sQLiteConnection.getClass();
                                                        vy1Var.d.P(sQLiteConnection, arrayList8);
                                                        break;
                                                    case 1:
                                                        sQLiteConnection.getClass();
                                                        vy1Var.b.P(sQLiteConnection, arrayList8);
                                                        break;
                                                    default:
                                                        sQLiteConnection.getClass();
                                                        vy1Var.c.P(sQLiteConnection, arrayList8);
                                                        break;
                                                }
                                                return j23Var2;
                                            }
                                        }, vy1VarP7.a, false, true);
                                        if (objP6 != y20Var) {
                                            objP6 = j23Var;
                                        }
                                        if (objP6 != y20Var) {
                                            final vy1 vy1VarP8 = appDatabase.p();
                                            LinkedHashMap linkedHashMap2 = c63Var.b;
                                            arrayList6 = new ArrayList(linkedHashMap2.size());
                                            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                                q12 q12Var = (q12) entry2.getKey();
                                                arrayList6.add(new cz1(str2, q12Var.a.a.name(), q12Var.a.b.name(), q12Var.b, q12Var.c, ((Number) entry2.getValue()).doubleValue()));
                                            }
                                            this.l = (byte) 8;
                                            final byte b6 = 0;
                                            objP7 = cu.P(this, new vp0() { // from class: ty1
                                                @Override // defpackage.vp0
                                                public final Object h(Object obj2) {
                                                    byte b7 = b6;
                                                    j23 j23Var2 = j23.a;
                                                    ArrayList arrayList8 = arrayList6;
                                                    vy1 vy1Var = vy1VarP8;
                                                    SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                                                    switch (b7) {
                                                        case 0:
                                                            sQLiteConnection.getClass();
                                                            vy1Var.d.P(sQLiteConnection, arrayList8);
                                                            break;
                                                        case 1:
                                                            sQLiteConnection.getClass();
                                                            vy1Var.b.P(sQLiteConnection, arrayList8);
                                                            break;
                                                        default:
                                                            sQLiteConnection.getClass();
                                                            vy1Var.c.P(sQLiteConnection, arrayList8);
                                                            break;
                                                    }
                                                    return j23Var2;
                                                }
                                            }, vy1VarP8.a, false, true);
                                            if (objP7 != y20Var) {
                                                objP7 = j23Var;
                                            }
                                            if (objP7 != y20Var) {
                                                return j23Var;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return y20Var;
            case 1:
                m02.y(obj);
                z = true;
                y20Var = y20Var2;
                vy1 vy1VarP9 = appDatabase2.p();
                this.l = (byte) 2;
                objP = cu.P(this, new ql(str2, (byte) 21), vy1VarP9.a, false, z);
                if (objP != y20Var) {
                    objP = j23Var;
                }
                if (objP != y20Var) {
                    vy1 vy1VarP10 = appDatabase2.p();
                    this.l = (byte) 3;
                    objP2 = cu.P(this, new ql(str2, (byte) 22), vy1VarP10.a, false, z);
                    if (objP2 != y20Var) {
                        objP2 = j23Var;
                    }
                    if (objP2 != y20Var) {
                        vy1 vy1VarP11 = appDatabase2.p();
                        this.l = (byte) 4;
                        objP3 = cu.P(this, new ql(str2, (byte) 14), vy1VarP11.a, false, z);
                        if (objP3 != y20Var) {
                            objP3 = j23Var;
                        }
                        if (objP3 != y20Var) {
                            vy1 vy1VarP12 = appDatabase2.p();
                            this.l = (byte) 5;
                            objP4 = cu.P(this, new ql(str2, (byte) 20), vy1VarP12.a, false, z);
                            if (objP4 != y20Var) {
                                objP4 = j23Var;
                            }
                            if (objP4 != y20Var) {
                                final vy1 vy1VarP13 = appDatabase2.p();
                                LinkedHashMap linkedHashMap3 = c63Var.a;
                                arrayList = new ArrayList();
                                while (r14.hasNext()) {
                                    ek2Var = (ek2) entry.getKey();
                                    List<String> list2 = (List) entry.getValue();
                                    arrayList2 = new ArrayList(ev.o0(list2, 10));
                                    while (r18.hasNext()) {
                                        String strName3 = ek2Var.a.name();
                                        String strName4 = ek2Var.b.name();
                                        str = (String) this.r.get(str3);
                                        if (str == null) {
                                            str = str3;
                                        }
                                        AppDatabase appDatabase4 = appDatabase2;
                                        ArrayList arrayList8 = arrayList2;
                                        arrayList8.add(new xy1(str2, strName3, strName4, str3, str, this.s.contains(new wt1(ek2Var, str3))));
                                        ek2Var = ek2Var;
                                        arrayList2 = arrayList8;
                                        appDatabase2 = appDatabase4;
                                    }
                                    iv.q0(arrayList2, arrayList);
                                }
                                appDatabase = appDatabase2;
                                this.l = (byte) 6;
                                final byte b7 = 1;
                                objP5 = cu.P(this, new vp0() { // from class: ty1
                                    @Override // defpackage.vp0
                                    public final Object h(Object obj2) {
                                        byte b8 = b7;
                                        j23 j23Var2 = j23.a;
                                        ArrayList arrayList9 = arrayList;
                                        vy1 vy1Var = vy1VarP13;
                                        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                                        switch (b8) {
                                            case 0:
                                                sQLiteConnection.getClass();
                                                vy1Var.d.P(sQLiteConnection, arrayList9);
                                                break;
                                            case 1:
                                                sQLiteConnection.getClass();
                                                vy1Var.b.P(sQLiteConnection, arrayList9);
                                                break;
                                            default:
                                                sQLiteConnection.getClass();
                                                vy1Var.c.P(sQLiteConnection, arrayList9);
                                                break;
                                        }
                                        return j23Var2;
                                    }
                                }, vy1VarP13.a, false, true);
                                if (objP5 != y20Var) {
                                    objP5 = j23Var;
                                }
                                if (objP5 != y20Var) {
                                    final vy1 vy1VarP14 = appDatabase.p();
                                    arrayList3 = new ArrayList();
                                    lh0 lh0Var3 = p60.p;
                                    lh0Var3.getClass();
                                    b = 0;
                                    zVar = new z(lh0Var3, b);
                                    while (zVar.hasNext()) {
                                        p60Var = (p60) zVar.next();
                                        arrayList4 = new ArrayList();
                                        lh0 lh0Var4 = te1.o;
                                        lh0Var4.getClass();
                                        zVar2 = new z(lh0Var4, b);
                                        while (zVar2.hasNext()) {
                                            te1Var = (te1) zVar2.next();
                                            List listA2 = this.t.b.a(p60Var, te1Var);
                                            arrayList5 = new ArrayList(ev.o0(listA2, 10));
                                            it = listA2.iterator();
                                            while (it.hasNext()) {
                                                arrayList5.add(new wy1(str2, p60Var.name(), te1Var.name(), (String) it.next()));
                                                p60Var = p60Var;
                                            }
                                            iv.q0(arrayList5, arrayList4);
                                        }
                                        iv.q0(arrayList4, arrayList3);
                                        b = 0;
                                    }
                                    this.l = (byte) 7;
                                    final byte b8 = 2;
                                    objP6 = cu.P(this, new vp0() { // from class: ty1
                                        @Override // defpackage.vp0
                                        public final Object h(Object obj2) {
                                            byte b9 = b8;
                                            j23 j23Var2 = j23.a;
                                            ArrayList arrayList9 = arrayList3;
                                            vy1 vy1Var = vy1VarP14;
                                            SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                                            switch (b9) {
                                                case 0:
                                                    sQLiteConnection.getClass();
                                                    vy1Var.d.P(sQLiteConnection, arrayList9);
                                                    break;
                                                case 1:
                                                    sQLiteConnection.getClass();
                                                    vy1Var.b.P(sQLiteConnection, arrayList9);
                                                    break;
                                                default:
                                                    sQLiteConnection.getClass();
                                                    vy1Var.c.P(sQLiteConnection, arrayList9);
                                                    break;
                                            }
                                            return j23Var2;
                                        }
                                    }, vy1VarP14.a, false, true);
                                    if (objP6 != y20Var) {
                                        objP6 = j23Var;
                                    }
                                    if (objP6 != y20Var) {
                                        final vy1 vy1VarP15 = appDatabase.p();
                                        LinkedHashMap linkedHashMap4 = c63Var.b;
                                        arrayList6 = new ArrayList(linkedHashMap4.size());
                                        while (r2.hasNext()) {
                                            q12 q12Var2 = (q12) entry2.getKey();
                                            arrayList6.add(new cz1(str2, q12Var2.a.a.name(), q12Var2.a.b.name(), q12Var2.b, q12Var2.c, ((Number) entry2.getValue()).doubleValue()));
                                        }
                                        this.l = (byte) 8;
                                        final byte b9 = 0;
                                        objP7 = cu.P(this, new vp0() { // from class: ty1
                                            @Override // defpackage.vp0
                                            public final Object h(Object obj2) {
                                                byte b10 = b9;
                                                j23 j23Var2 = j23.a;
                                                ArrayList arrayList9 = arrayList6;
                                                vy1 vy1Var = vy1VarP15;
                                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        sQLiteConnection.getClass();
                                                        vy1Var.d.P(sQLiteConnection, arrayList9);
                                                        break;
                                                    case 1:
                                                        sQLiteConnection.getClass();
                                                        vy1Var.b.P(sQLiteConnection, arrayList9);
                                                        break;
                                                    default:
                                                        sQLiteConnection.getClass();
                                                        vy1Var.c.P(sQLiteConnection, arrayList9);
                                                        break;
                                                }
                                                return j23Var2;
                                            }
                                        }, vy1VarP15.a, false, true);
                                        if (objP7 != y20Var) {
                                            objP7 = j23Var;
                                        }
                                        if (objP7 != y20Var) {
                                            return j23Var;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return y20Var;
            case 2:
                m02.y(obj);
                z = true;
                y20Var = y20Var2;
                vy1 vy1VarP16 = appDatabase2.p();
                this.l = (byte) 3;
                objP2 = cu.P(this, new ql(str2, (byte) 22), vy1VarP16.a, false, z);
                if (objP2 != y20Var) {
                    objP2 = j23Var;
                }
                if (objP2 != y20Var) {
                    vy1 vy1VarP17 = appDatabase2.p();
                    this.l = (byte) 4;
                    objP3 = cu.P(this, new ql(str2, (byte) 14), vy1VarP17.a, false, z);
                    if (objP3 != y20Var) {
                        objP3 = j23Var;
                    }
                    if (objP3 != y20Var) {
                        vy1 vy1VarP18 = appDatabase2.p();
                        this.l = (byte) 5;
                        objP4 = cu.P(this, new ql(str2, (byte) 20), vy1VarP18.a, false, z);
                        if (objP4 != y20Var) {
                            objP4 = j23Var;
                        }
                        if (objP4 != y20Var) {
                            final vy1 vy1VarP19 = appDatabase2.p();
                            LinkedHashMap linkedHashMap5 = c63Var.a;
                            arrayList = new ArrayList();
                            while (r14.hasNext()) {
                                ek2Var = (ek2) entry.getKey();
                                List<String> list3 = (List) entry.getValue();
                                arrayList2 = new ArrayList(ev.o0(list3, 10));
                                while (r18.hasNext()) {
                                    String strName5 = ek2Var.a.name();
                                    String strName6 = ek2Var.b.name();
                                    str = (String) this.r.get(str3);
                                    if (str == null) {
                                        str = str3;
                                    }
                                    AppDatabase appDatabase5 = appDatabase2;
                                    ArrayList arrayList9 = arrayList2;
                                    arrayList9.add(new xy1(str2, strName5, strName6, str3, str, this.s.contains(new wt1(ek2Var, str3))));
                                    ek2Var = ek2Var;
                                    arrayList2 = arrayList9;
                                    appDatabase2 = appDatabase5;
                                }
                                iv.q0(arrayList2, arrayList);
                            }
                            appDatabase = appDatabase2;
                            this.l = (byte) 6;
                            final byte b10 = 1;
                            objP5 = cu.P(this, new vp0() { // from class: ty1
                                @Override // defpackage.vp0
                                public final Object h(Object obj2) {
                                    byte b11 = b10;
                                    j23 j23Var2 = j23.a;
                                    ArrayList arrayList10 = arrayList;
                                    vy1 vy1Var = vy1VarP19;
                                    SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                                    switch (b11) {
                                        case 0:
                                            sQLiteConnection.getClass();
                                            vy1Var.d.P(sQLiteConnection, arrayList10);
                                            break;
                                        case 1:
                                            sQLiteConnection.getClass();
                                            vy1Var.b.P(sQLiteConnection, arrayList10);
                                            break;
                                        default:
                                            sQLiteConnection.getClass();
                                            vy1Var.c.P(sQLiteConnection, arrayList10);
                                            break;
                                    }
                                    return j23Var2;
                                }
                            }, vy1VarP19.a, false, true);
                            if (objP5 != y20Var) {
                                objP5 = j23Var;
                            }
                            if (objP5 != y20Var) {
                                final vy1 vy1VarP110 = appDatabase.p();
                                arrayList3 = new ArrayList();
                                lh0 lh0Var5 = p60.p;
                                lh0Var5.getClass();
                                b = 0;
                                zVar = new z(lh0Var5, b);
                                while (zVar.hasNext()) {
                                    p60Var = (p60) zVar.next();
                                    arrayList4 = new ArrayList();
                                    lh0 lh0Var6 = te1.o;
                                    lh0Var6.getClass();
                                    zVar2 = new z(lh0Var6, b);
                                    while (zVar2.hasNext()) {
                                        te1Var = (te1) zVar2.next();
                                        List listA3 = this.t.b.a(p60Var, te1Var);
                                        arrayList5 = new ArrayList(ev.o0(listA3, 10));
                                        it = listA3.iterator();
                                        while (it.hasNext()) {
                                            arrayList5.add(new wy1(str2, p60Var.name(), te1Var.name(), (String) it.next()));
                                            p60Var = p60Var;
                                        }
                                        iv.q0(arrayList5, arrayList4);
                                    }
                                    iv.q0(arrayList4, arrayList3);
                                    b = 0;
                                }
                                this.l = (byte) 7;
                                final byte b11 = 2;
                                objP6 = cu.P(this, new vp0() { // from class: ty1
                                    @Override // defpackage.vp0
                                    public final Object h(Object obj2) {
                                        byte b12 = b11;
                                        j23 j23Var2 = j23.a;
                                        ArrayList arrayList10 = arrayList3;
                                        vy1 vy1Var = vy1VarP110;
                                        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                                        switch (b12) {
                                            case 0:
                                                sQLiteConnection.getClass();
                                                vy1Var.d.P(sQLiteConnection, arrayList10);
                                                break;
                                            case 1:
                                                sQLiteConnection.getClass();
                                                vy1Var.b.P(sQLiteConnection, arrayList10);
                                                break;
                                            default:
                                                sQLiteConnection.getClass();
                                                vy1Var.c.P(sQLiteConnection, arrayList10);
                                                break;
                                        }
                                        return j23Var2;
                                    }
                                }, vy1VarP110.a, false, true);
                                if (objP6 != y20Var) {
                                    objP6 = j23Var;
                                }
                                if (objP6 != y20Var) {
                                    final vy1 vy1VarP111 = appDatabase.p();
                                    LinkedHashMap linkedHashMap6 = c63Var.b;
                                    arrayList6 = new ArrayList(linkedHashMap6.size());
                                    while (r2.hasNext()) {
                                        q12 q12Var3 = (q12) entry2.getKey();
                                        arrayList6.add(new cz1(str2, q12Var3.a.a.name(), q12Var3.a.b.name(), q12Var3.b, q12Var3.c, ((Number) entry2.getValue()).doubleValue()));
                                    }
                                    this.l = (byte) 8;
                                    final byte b12 = 0;
                                    objP7 = cu.P(this, new vp0() { // from class: ty1
                                        @Override // defpackage.vp0
                                        public final Object h(Object obj2) {
                                            byte b13 = b12;
                                            j23 j23Var2 = j23.a;
                                            ArrayList arrayList10 = arrayList6;
                                            vy1 vy1Var = vy1VarP111;
                                            SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                                            switch (b13) {
                                                case 0:
                                                    sQLiteConnection.getClass();
                                                    vy1Var.d.P(sQLiteConnection, arrayList10);
                                                    break;
                                                case 1:
                                                    sQLiteConnection.getClass();
                                                    vy1Var.b.P(sQLiteConnection, arrayList10);
                                                    break;
                                                default:
                                                    sQLiteConnection.getClass();
                                                    vy1Var.c.P(sQLiteConnection, arrayList10);
                                                    break;
                                            }
                                            return j23Var2;
                                        }
                                    }, vy1VarP111.a, false, true);
                                    if (objP7 != y20Var) {
                                        objP7 = j23Var;
                                    }
                                    if (objP7 != y20Var) {
                                        return j23Var;
                                    }
                                }
                            }
                        }
                    }
                }
                return y20Var;
            case 3:
                m02.y(obj);
                z = true;
                y20Var = y20Var2;
                vy1 vy1VarP112 = appDatabase2.p();
                this.l = (byte) 4;
                objP3 = cu.P(this, new ql(str2, (byte) 14), vy1VarP112.a, false, z);
                if (objP3 != y20Var) {
                    objP3 = j23Var;
                }
                if (objP3 != y20Var) {
                    vy1 vy1VarP113 = appDatabase2.p();
                    this.l = (byte) 5;
                    objP4 = cu.P(this, new ql(str2, (byte) 20), vy1VarP113.a, false, z);
                    if (objP4 != y20Var) {
                        objP4 = j23Var;
                    }
                    if (objP4 != y20Var) {
                        final vy1 vy1VarP114 = appDatabase2.p();
                        LinkedHashMap linkedHashMap7 = c63Var.a;
                        arrayList = new ArrayList();
                        while (r14.hasNext()) {
                            ek2Var = (ek2) entry.getKey();
                            List<String> list4 = (List) entry.getValue();
                            arrayList2 = new ArrayList(ev.o0(list4, 10));
                            while (r18.hasNext()) {
                                String strName7 = ek2Var.a.name();
                                String strName8 = ek2Var.b.name();
                                str = (String) this.r.get(str3);
                                if (str == null) {
                                    str = str3;
                                }
                                AppDatabase appDatabase6 = appDatabase2;
                                ArrayList arrayList10 = arrayList2;
                                arrayList10.add(new xy1(str2, strName7, strName8, str3, str, this.s.contains(new wt1(ek2Var, str3))));
                                ek2Var = ek2Var;
                                arrayList2 = arrayList10;
                                appDatabase2 = appDatabase6;
                            }
                            iv.q0(arrayList2, arrayList);
                        }
                        appDatabase = appDatabase2;
                        this.l = (byte) 6;
                        final byte b13 = 1;
                        objP5 = cu.P(this, new vp0() { // from class: ty1
                            @Override // defpackage.vp0
                            public final Object h(Object obj2) {
                                byte b14 = b13;
                                j23 j23Var2 = j23.a;
                                ArrayList arrayList11 = arrayList;
                                vy1 vy1Var = vy1VarP114;
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                                switch (b14) {
                                    case 0:
                                        sQLiteConnection.getClass();
                                        vy1Var.d.P(sQLiteConnection, arrayList11);
                                        break;
                                    case 1:
                                        sQLiteConnection.getClass();
                                        vy1Var.b.P(sQLiteConnection, arrayList11);
                                        break;
                                    default:
                                        sQLiteConnection.getClass();
                                        vy1Var.c.P(sQLiteConnection, arrayList11);
                                        break;
                                }
                                return j23Var2;
                            }
                        }, vy1VarP114.a, false, true);
                        if (objP5 != y20Var) {
                            objP5 = j23Var;
                        }
                        if (objP5 != y20Var) {
                            final vy1 vy1VarP115 = appDatabase.p();
                            arrayList3 = new ArrayList();
                            lh0 lh0Var7 = p60.p;
                            lh0Var7.getClass();
                            b = 0;
                            zVar = new z(lh0Var7, b);
                            while (zVar.hasNext()) {
                                p60Var = (p60) zVar.next();
                                arrayList4 = new ArrayList();
                                lh0 lh0Var8 = te1.o;
                                lh0Var8.getClass();
                                zVar2 = new z(lh0Var8, b);
                                while (zVar2.hasNext()) {
                                    te1Var = (te1) zVar2.next();
                                    List listA4 = this.t.b.a(p60Var, te1Var);
                                    arrayList5 = new ArrayList(ev.o0(listA4, 10));
                                    it = listA4.iterator();
                                    while (it.hasNext()) {
                                        arrayList5.add(new wy1(str2, p60Var.name(), te1Var.name(), (String) it.next()));
                                        p60Var = p60Var;
                                    }
                                    iv.q0(arrayList5, arrayList4);
                                }
                                iv.q0(arrayList4, arrayList3);
                                b = 0;
                            }
                            this.l = (byte) 7;
                            final byte b14 = 2;
                            objP6 = cu.P(this, new vp0() { // from class: ty1
                                @Override // defpackage.vp0
                                public final Object h(Object obj2) {
                                    byte b15 = b14;
                                    j23 j23Var2 = j23.a;
                                    ArrayList arrayList11 = arrayList3;
                                    vy1 vy1Var = vy1VarP115;
                                    SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                                    switch (b15) {
                                        case 0:
                                            sQLiteConnection.getClass();
                                            vy1Var.d.P(sQLiteConnection, arrayList11);
                                            break;
                                        case 1:
                                            sQLiteConnection.getClass();
                                            vy1Var.b.P(sQLiteConnection, arrayList11);
                                            break;
                                        default:
                                            sQLiteConnection.getClass();
                                            vy1Var.c.P(sQLiteConnection, arrayList11);
                                            break;
                                    }
                                    return j23Var2;
                                }
                            }, vy1VarP115.a, false, true);
                            if (objP6 != y20Var) {
                                objP6 = j23Var;
                            }
                            if (objP6 != y20Var) {
                                final vy1 vy1VarP116 = appDatabase.p();
                                LinkedHashMap linkedHashMap8 = c63Var.b;
                                arrayList6 = new ArrayList(linkedHashMap8.size());
                                while (r2.hasNext()) {
                                    q12 q12Var4 = (q12) entry2.getKey();
                                    arrayList6.add(new cz1(str2, q12Var4.a.a.name(), q12Var4.a.b.name(), q12Var4.b, q12Var4.c, ((Number) entry2.getValue()).doubleValue()));
                                }
                                this.l = (byte) 8;
                                final byte b15 = 0;
                                objP7 = cu.P(this, new vp0() { // from class: ty1
                                    @Override // defpackage.vp0
                                    public final Object h(Object obj2) {
                                        byte b16 = b15;
                                        j23 j23Var2 = j23.a;
                                        ArrayList arrayList11 = arrayList6;
                                        vy1 vy1Var = vy1VarP116;
                                        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                                        switch (b16) {
                                            case 0:
                                                sQLiteConnection.getClass();
                                                vy1Var.d.P(sQLiteConnection, arrayList11);
                                                break;
                                            case 1:
                                                sQLiteConnection.getClass();
                                                vy1Var.b.P(sQLiteConnection, arrayList11);
                                                break;
                                            default:
                                                sQLiteConnection.getClass();
                                                vy1Var.c.P(sQLiteConnection, arrayList11);
                                                break;
                                        }
                                        return j23Var2;
                                    }
                                }, vy1VarP116.a, false, true);
                                if (objP7 != y20Var) {
                                    objP7 = j23Var;
                                }
                                if (objP7 != y20Var) {
                                    return j23Var;
                                }
                            }
                        }
                    }
                }
                return y20Var;
            case 4:
                m02.y(obj);
                z = true;
                y20Var = y20Var2;
                vy1 vy1VarP117 = appDatabase2.p();
                this.l = (byte) 5;
                objP4 = cu.P(this, new ql(str2, (byte) 20), vy1VarP117.a, false, z);
                if (objP4 != y20Var) {
                    objP4 = j23Var;
                }
                if (objP4 != y20Var) {
                    final vy1 vy1VarP118 = appDatabase2.p();
                    LinkedHashMap linkedHashMap9 = c63Var.a;
                    arrayList = new ArrayList();
                    while (r14.hasNext()) {
                        ek2Var = (ek2) entry.getKey();
                        List<String> list5 = (List) entry.getValue();
                        arrayList2 = new ArrayList(ev.o0(list5, 10));
                        while (r18.hasNext()) {
                            String strName9 = ek2Var.a.name();
                            String strName10 = ek2Var.b.name();
                            str = (String) this.r.get(str3);
                            if (str == null) {
                                str = str3;
                            }
                            AppDatabase appDatabase7 = appDatabase2;
                            ArrayList arrayList11 = arrayList2;
                            arrayList11.add(new xy1(str2, strName9, strName10, str3, str, this.s.contains(new wt1(ek2Var, str3))));
                            ek2Var = ek2Var;
                            arrayList2 = arrayList11;
                            appDatabase2 = appDatabase7;
                        }
                        iv.q0(arrayList2, arrayList);
                    }
                    appDatabase = appDatabase2;
                    this.l = (byte) 6;
                    final byte b16 = 1;
                    objP5 = cu.P(this, new vp0() { // from class: ty1
                        @Override // defpackage.vp0
                        public final Object h(Object obj2) {
                            byte b17 = b16;
                            j23 j23Var2 = j23.a;
                            ArrayList arrayList12 = arrayList;
                            vy1 vy1Var = vy1VarP118;
                            SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                            switch (b17) {
                                case 0:
                                    sQLiteConnection.getClass();
                                    vy1Var.d.P(sQLiteConnection, arrayList12);
                                    break;
                                case 1:
                                    sQLiteConnection.getClass();
                                    vy1Var.b.P(sQLiteConnection, arrayList12);
                                    break;
                                default:
                                    sQLiteConnection.getClass();
                                    vy1Var.c.P(sQLiteConnection, arrayList12);
                                    break;
                            }
                            return j23Var2;
                        }
                    }, vy1VarP118.a, false, true);
                    if (objP5 != y20Var) {
                        objP5 = j23Var;
                    }
                    if (objP5 != y20Var) {
                        final vy1 vy1VarP119 = appDatabase.p();
                        arrayList3 = new ArrayList();
                        lh0 lh0Var9 = p60.p;
                        lh0Var9.getClass();
                        b = 0;
                        zVar = new z(lh0Var9, b);
                        while (zVar.hasNext()) {
                            p60Var = (p60) zVar.next();
                            arrayList4 = new ArrayList();
                            lh0 lh0Var10 = te1.o;
                            lh0Var10.getClass();
                            zVar2 = new z(lh0Var10, b);
                            while (zVar2.hasNext()) {
                                te1Var = (te1) zVar2.next();
                                List listA5 = this.t.b.a(p60Var, te1Var);
                                arrayList5 = new ArrayList(ev.o0(listA5, 10));
                                it = listA5.iterator();
                                while (it.hasNext()) {
                                    arrayList5.add(new wy1(str2, p60Var.name(), te1Var.name(), (String) it.next()));
                                    p60Var = p60Var;
                                }
                                iv.q0(arrayList5, arrayList4);
                            }
                            iv.q0(arrayList4, arrayList3);
                            b = 0;
                        }
                        this.l = (byte) 7;
                        final byte b17 = 2;
                        objP6 = cu.P(this, new vp0() { // from class: ty1
                            @Override // defpackage.vp0
                            public final Object h(Object obj2) {
                                byte b18 = b17;
                                j23 j23Var2 = j23.a;
                                ArrayList arrayList12 = arrayList3;
                                vy1 vy1Var = vy1VarP119;
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                                switch (b18) {
                                    case 0:
                                        sQLiteConnection.getClass();
                                        vy1Var.d.P(sQLiteConnection, arrayList12);
                                        break;
                                    case 1:
                                        sQLiteConnection.getClass();
                                        vy1Var.b.P(sQLiteConnection, arrayList12);
                                        break;
                                    default:
                                        sQLiteConnection.getClass();
                                        vy1Var.c.P(sQLiteConnection, arrayList12);
                                        break;
                                }
                                return j23Var2;
                            }
                        }, vy1VarP119.a, false, true);
                        if (objP6 != y20Var) {
                            objP6 = j23Var;
                        }
                        if (objP6 != y20Var) {
                            final vy1 vy1VarP1110 = appDatabase.p();
                            LinkedHashMap linkedHashMap10 = c63Var.b;
                            arrayList6 = new ArrayList(linkedHashMap10.size());
                            while (r2.hasNext()) {
                                q12 q12Var5 = (q12) entry2.getKey();
                                arrayList6.add(new cz1(str2, q12Var5.a.a.name(), q12Var5.a.b.name(), q12Var5.b, q12Var5.c, ((Number) entry2.getValue()).doubleValue()));
                            }
                            this.l = (byte) 8;
                            final byte b18 = 0;
                            objP7 = cu.P(this, new vp0() { // from class: ty1
                                @Override // defpackage.vp0
                                public final Object h(Object obj2) {
                                    byte b19 = b18;
                                    j23 j23Var2 = j23.a;
                                    ArrayList arrayList12 = arrayList6;
                                    vy1 vy1Var = vy1VarP1110;
                                    SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                                    switch (b19) {
                                        case 0:
                                            sQLiteConnection.getClass();
                                            vy1Var.d.P(sQLiteConnection, arrayList12);
                                            break;
                                        case 1:
                                            sQLiteConnection.getClass();
                                            vy1Var.b.P(sQLiteConnection, arrayList12);
                                            break;
                                        default:
                                            sQLiteConnection.getClass();
                                            vy1Var.c.P(sQLiteConnection, arrayList12);
                                            break;
                                    }
                                    return j23Var2;
                                }
                            }, vy1VarP1110.a, false, true);
                            if (objP7 != y20Var) {
                                objP7 = j23Var;
                            }
                            if (objP7 != y20Var) {
                                return j23Var;
                            }
                        }
                    }
                }
                return y20Var;
            case 5:
                m02.y(obj);
                y20Var = y20Var2;
                final vy1 vy1VarP1111 = appDatabase2.p();
                LinkedHashMap linkedHashMap11 = c63Var.a;
                arrayList = new ArrayList();
                while (r14.hasNext()) {
                    ek2Var = (ek2) entry.getKey();
                    List<String> list6 = (List) entry.getValue();
                    arrayList2 = new ArrayList(ev.o0(list6, 10));
                    while (r18.hasNext()) {
                        String strName11 = ek2Var.a.name();
                        String strName12 = ek2Var.b.name();
                        str = (String) this.r.get(str3);
                        if (str == null) {
                            str = str3;
                        }
                        AppDatabase appDatabase8 = appDatabase2;
                        ArrayList arrayList12 = arrayList2;
                        arrayList12.add(new xy1(str2, strName11, strName12, str3, str, this.s.contains(new wt1(ek2Var, str3))));
                        ek2Var = ek2Var;
                        arrayList2 = arrayList12;
                        appDatabase2 = appDatabase8;
                    }
                    iv.q0(arrayList2, arrayList);
                }
                appDatabase = appDatabase2;
                this.l = (byte) 6;
                final byte b19 = 1;
                objP5 = cu.P(this, new vp0() { // from class: ty1
                    @Override // defpackage.vp0
                    public final Object h(Object obj2) {
                        byte b110 = b19;
                        j23 j23Var2 = j23.a;
                        ArrayList arrayList13 = arrayList;
                        vy1 vy1Var = vy1VarP1111;
                        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                        switch (b110) {
                            case 0:
                                sQLiteConnection.getClass();
                                vy1Var.d.P(sQLiteConnection, arrayList13);
                                break;
                            case 1:
                                sQLiteConnection.getClass();
                                vy1Var.b.P(sQLiteConnection, arrayList13);
                                break;
                            default:
                                sQLiteConnection.getClass();
                                vy1Var.c.P(sQLiteConnection, arrayList13);
                                break;
                        }
                        return j23Var2;
                    }
                }, vy1VarP1111.a, false, true);
                if (objP5 != y20Var) {
                    objP5 = j23Var;
                }
                if (objP5 != y20Var) {
                    final vy1 vy1VarP1112 = appDatabase.p();
                    arrayList3 = new ArrayList();
                    lh0 lh0Var11 = p60.p;
                    lh0Var11.getClass();
                    b = 0;
                    zVar = new z(lh0Var11, b);
                    while (zVar.hasNext()) {
                        p60Var = (p60) zVar.next();
                        arrayList4 = new ArrayList();
                        lh0 lh0Var12 = te1.o;
                        lh0Var12.getClass();
                        zVar2 = new z(lh0Var12, b);
                        while (zVar2.hasNext()) {
                            te1Var = (te1) zVar2.next();
                            List listA6 = this.t.b.a(p60Var, te1Var);
                            arrayList5 = new ArrayList(ev.o0(listA6, 10));
                            it = listA6.iterator();
                            while (it.hasNext()) {
                                arrayList5.add(new wy1(str2, p60Var.name(), te1Var.name(), (String) it.next()));
                                p60Var = p60Var;
                            }
                            iv.q0(arrayList5, arrayList4);
                        }
                        iv.q0(arrayList4, arrayList3);
                        b = 0;
                    }
                    this.l = (byte) 7;
                    final byte b110 = 2;
                    objP6 = cu.P(this, new vp0() { // from class: ty1
                        @Override // defpackage.vp0
                        public final Object h(Object obj2) {
                            byte b111 = b110;
                            j23 j23Var2 = j23.a;
                            ArrayList arrayList13 = arrayList3;
                            vy1 vy1Var = vy1VarP1112;
                            SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                            switch (b111) {
                                case 0:
                                    sQLiteConnection.getClass();
                                    vy1Var.d.P(sQLiteConnection, arrayList13);
                                    break;
                                case 1:
                                    sQLiteConnection.getClass();
                                    vy1Var.b.P(sQLiteConnection, arrayList13);
                                    break;
                                default:
                                    sQLiteConnection.getClass();
                                    vy1Var.c.P(sQLiteConnection, arrayList13);
                                    break;
                            }
                            return j23Var2;
                        }
                    }, vy1VarP1112.a, false, true);
                    if (objP6 != y20Var) {
                        objP6 = j23Var;
                    }
                    if (objP6 != y20Var) {
                        final vy1 vy1VarP1113 = appDatabase.p();
                        LinkedHashMap linkedHashMap12 = c63Var.b;
                        arrayList6 = new ArrayList(linkedHashMap12.size());
                        while (r2.hasNext()) {
                            q12 q12Var6 = (q12) entry2.getKey();
                            arrayList6.add(new cz1(str2, q12Var6.a.a.name(), q12Var6.a.b.name(), q12Var6.b, q12Var6.c, ((Number) entry2.getValue()).doubleValue()));
                        }
                        this.l = (byte) 8;
                        final byte b111 = 0;
                        objP7 = cu.P(this, new vp0() { // from class: ty1
                            @Override // defpackage.vp0
                            public final Object h(Object obj2) {
                                byte b112 = b111;
                                j23 j23Var2 = j23.a;
                                ArrayList arrayList13 = arrayList6;
                                vy1 vy1Var = vy1VarP1113;
                                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                                switch (b112) {
                                    case 0:
                                        sQLiteConnection.getClass();
                                        vy1Var.d.P(sQLiteConnection, arrayList13);
                                        break;
                                    case 1:
                                        sQLiteConnection.getClass();
                                        vy1Var.b.P(sQLiteConnection, arrayList13);
                                        break;
                                    default:
                                        sQLiteConnection.getClass();
                                        vy1Var.c.P(sQLiteConnection, arrayList13);
                                        break;
                                }
                                return j23Var2;
                            }
                        }, vy1VarP1113.a, false, true);
                        if (objP7 != y20Var) {
                            objP7 = j23Var;
                        }
                        if (objP7 != y20Var) {
                            return j23Var;
                        }
                    }
                }
                return y20Var;
            case 6:
                m02.y(obj);
                appDatabase = appDatabase2;
                y20Var = y20Var2;
                final vy1 vy1VarP1114 = appDatabase.p();
                arrayList3 = new ArrayList();
                lh0 lh0Var13 = p60.p;
                lh0Var13.getClass();
                b = 0;
                zVar = new z(lh0Var13, b);
                while (zVar.hasNext()) {
                    p60Var = (p60) zVar.next();
                    arrayList4 = new ArrayList();
                    lh0 lh0Var14 = te1.o;
                    lh0Var14.getClass();
                    zVar2 = new z(lh0Var14, b);
                    while (zVar2.hasNext()) {
                        te1Var = (te1) zVar2.next();
                        List listA7 = this.t.b.a(p60Var, te1Var);
                        arrayList5 = new ArrayList(ev.o0(listA7, 10));
                        it = listA7.iterator();
                        while (it.hasNext()) {
                            arrayList5.add(new wy1(str2, p60Var.name(), te1Var.name(), (String) it.next()));
                            p60Var = p60Var;
                        }
                        iv.q0(arrayList5, arrayList4);
                    }
                    iv.q0(arrayList4, arrayList3);
                    b = 0;
                }
                this.l = (byte) 7;
                final byte b112 = 2;
                objP6 = cu.P(this, new vp0() { // from class: ty1
                    @Override // defpackage.vp0
                    public final Object h(Object obj2) {
                        byte b113 = b112;
                        j23 j23Var2 = j23.a;
                        ArrayList arrayList13 = arrayList3;
                        vy1 vy1Var = vy1VarP1114;
                        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                        switch (b113) {
                            case 0:
                                sQLiteConnection.getClass();
                                vy1Var.d.P(sQLiteConnection, arrayList13);
                                break;
                            case 1:
                                sQLiteConnection.getClass();
                                vy1Var.b.P(sQLiteConnection, arrayList13);
                                break;
                            default:
                                sQLiteConnection.getClass();
                                vy1Var.c.P(sQLiteConnection, arrayList13);
                                break;
                        }
                        return j23Var2;
                    }
                }, vy1VarP1114.a, false, true);
                if (objP6 != y20Var) {
                    objP6 = j23Var;
                }
                if (objP6 != y20Var) {
                    final vy1 vy1VarP1115 = appDatabase.p();
                    LinkedHashMap linkedHashMap13 = c63Var.b;
                    arrayList6 = new ArrayList(linkedHashMap13.size());
                    while (r2.hasNext()) {
                        q12 q12Var7 = (q12) entry2.getKey();
                        arrayList6.add(new cz1(str2, q12Var7.a.a.name(), q12Var7.a.b.name(), q12Var7.b, q12Var7.c, ((Number) entry2.getValue()).doubleValue()));
                    }
                    this.l = (byte) 8;
                    final byte b113 = 0;
                    objP7 = cu.P(this, new vp0() { // from class: ty1
                        @Override // defpackage.vp0
                        public final Object h(Object obj2) {
                            byte b114 = b113;
                            j23 j23Var2 = j23.a;
                            ArrayList arrayList13 = arrayList6;
                            vy1 vy1Var = vy1VarP1115;
                            SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                            switch (b114) {
                                case 0:
                                    sQLiteConnection.getClass();
                                    vy1Var.d.P(sQLiteConnection, arrayList13);
                                    break;
                                case 1:
                                    sQLiteConnection.getClass();
                                    vy1Var.b.P(sQLiteConnection, arrayList13);
                                    break;
                                default:
                                    sQLiteConnection.getClass();
                                    vy1Var.c.P(sQLiteConnection, arrayList13);
                                    break;
                            }
                            return j23Var2;
                        }
                    }, vy1VarP1115.a, false, true);
                    if (objP7 != y20Var) {
                        objP7 = j23Var;
                    }
                    if (objP7 != y20Var) {
                        return j23Var;
                    }
                }
                return y20Var;
            case 7:
                m02.y(obj);
                appDatabase = appDatabase2;
                y20Var = y20Var2;
                final vy1 vy1VarP1116 = appDatabase.p();
                LinkedHashMap linkedHashMap14 = c63Var.b;
                arrayList6 = new ArrayList(linkedHashMap14.size());
                while (r2.hasNext()) {
                    q12 q12Var8 = (q12) entry2.getKey();
                    arrayList6.add(new cz1(str2, q12Var8.a.a.name(), q12Var8.a.b.name(), q12Var8.b, q12Var8.c, ((Number) entry2.getValue()).doubleValue()));
                }
                this.l = (byte) 8;
                final byte b114 = 0;
                objP7 = cu.P(this, new vp0() { // from class: ty1
                    @Override // defpackage.vp0
                    public final Object h(Object obj2) {
                        byte b115 = b114;
                        j23 j23Var2 = j23.a;
                        ArrayList arrayList13 = arrayList6;
                        vy1 vy1Var = vy1VarP1116;
                        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                        switch (b115) {
                            case 0:
                                sQLiteConnection.getClass();
                                vy1Var.d.P(sQLiteConnection, arrayList13);
                                break;
                            case 1:
                                sQLiteConnection.getClass();
                                vy1Var.b.P(sQLiteConnection, arrayList13);
                                break;
                            default:
                                sQLiteConnection.getClass();
                                vy1Var.c.P(sQLiteConnection, arrayList13);
                                break;
                        }
                        return j23Var2;
                    }
                }, vy1VarP1116.a, false, true);
                if (objP7 != y20Var) {
                    objP7 = j23Var;
                }
                if (objP7 != y20Var) {
                    return y20Var;
                }
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                m02.y(obj);
                return j23Var;
            default:
                li1.g("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
