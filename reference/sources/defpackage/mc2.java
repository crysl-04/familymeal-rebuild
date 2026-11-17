package defpackage;

import java.util.ArrayList;
import java.util.List;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class mc2 {
    public static final k42 A;
    public static final k42 B;
    public static final k42 C;
    public static final lc2 D;
    public static final lc2 E;
    public static final lc2 F;
    public static final k42 a;
    public static final k42 b;
    public static final k42 c;
    public static final k42 d;
    public static final k42 e;
    public static final k42 f;
    public static final k42 g;
    public static final k42 h;
    public static final k42 i;
    public static final k42 j;
    public static final k42 k;
    public static final k42 l;
    public static final k42 m;
    public static final k42 n;
    public static final k42 o;
    public static final k42 p;
    public static final k42 q;
    public static final lc2 r;
    public static final lc2 s;
    public static final lc2 t;
    public static final lc2 u;
    public static final k42 v;
    public static final k42 w;
    public static final lc2 x;
    public static final lc2 y;
    public static final lc2 z;

    static {
        final byte b2 = 0;
        final byte b3 = 8;
        final byte b4 = 4;
        a = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b2) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82(b3), b4);
        final byte b5 = 7;
        final byte b6 = 20;
        b = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b5) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82(b6), b4);
        final byte b7 = 19;
        final byte b8 = 2;
        c = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b7) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new jc2(b8), b4);
        final byte b9 = 26;
        d = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b9) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new jc2(b4), b4);
        final byte b10 = 28;
        final byte b11 = 5;
        e = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b10) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new jc2(b11), b4);
        zp0 zp0Var = new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b11) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        };
        final byte b12 = 17;
        f = new k42(zp0Var, new z82(b12), b4);
        final byte b13 = 16;
        g = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b13) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82(b10), b4);
        final byte b14 = 27;
        final byte b15 = 6;
        h = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b14) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new jc2(b15), b4);
        final byte b16 = 29;
        i = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b16) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new jc2(b5), b4);
        j = new k42(new kc2(b2), new z82(b5), b4);
        final byte b17 = 1;
        final byte b18 = 9;
        k = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b17) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82(b18), b4);
        zp0 zp0Var2 = new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b8) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        };
        final byte b19 = 10;
        l = new k42(zp0Var2, new z82(b19), b4);
        final byte b20 = 3;
        zp0 zp0Var3 = new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b20) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        };
        final byte b21 = 11;
        m = new k42(zp0Var3, new z82(b21), b4);
        final byte b22 = 12;
        n = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b4) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82(b22), b4);
        final byte b23 = 13;
        o = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b15) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82(b23), b4);
        p = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b3) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82((byte) 14), b4);
        q = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b18) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82((byte) 15), b4);
        r = new lc2(px.s, z9.n);
        s = new lc2(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b19) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82(b13));
        t = new lc2(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b21) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82((byte) 18));
        u = new lc2(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b22) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82(b7));
        v = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b23) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82((byte) 21), b4);
        final byte b24 = 14;
        w = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b24) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82((byte) 22), b4);
        final byte b25 = 15;
        x = new lc2(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b25) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82((byte) 23));
        y = new lc2(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b12) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82((byte) 24));
        final byte b26 = 18;
        z = new lc2(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b26) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82((byte) 25));
        A = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b6) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82(b9), b4);
        final byte b27 = 21;
        B = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b27) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82(b14), b4);
        final byte b28 = 22;
        C = new k42(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b28) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new z82((byte) 29), b4);
        final byte b29 = 23;
        D = new lc2(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b29) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new jc2((byte) 0));
        final byte b30 = 24;
        E = new lc2(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b30) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new jc2((byte) 1));
        final byte b31 = 25;
        F = new lc2(new zp0() { // from class: ic2
            @Override // defpackage.zp0
            public final Object f(Object obj, Object obj2) {
                qd qdVar;
                Object objA;
                switch (b31) {
                    case 0:
                        od odVar = (od) obj2;
                        return lt.c(odVar.i, mc2.a(odVar.h, mc2.b, (nb2) obj));
                    case 1:
                        return Integer.valueOf(((vt2) obj2).a);
                    case 2:
                        yv2 yv2Var = (yv2) obj2;
                        return lt.c(Float.valueOf(yv2Var.a), Float.valueOf(yv2Var.b));
                    case 3:
                        nb2 nb2Var = (nb2) obj;
                        zv2 zv2Var = (zv2) obj2;
                        ax2 ax2Var = new ax2(zv2Var.a);
                        lc2 lc2Var = mc2.x;
                        return lt.c(mc2.a(ax2Var, lc2Var, nb2Var), mc2.a(new ax2(zv2Var.b), lc2Var, nb2Var));
                    case 4:
                        return Integer.valueOf(((qn0) obj2).h);
                    case 5:
                        ha1 ha1Var = (ha1) obj2;
                        return lt.c(ha1Var.a, mc2.a(ha1Var.b, mc2.j, (nb2) obj));
                    case 6:
                        return Float.valueOf(((uk) obj2).a);
                    case 7:
                        nb2 nb2Var2 = (nb2) obj;
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList.add(mc2.a((nd) list.get(i2), mc2.c, nb2Var2));
                        }
                        return arrayList;
                    case DatabaseUtils.STATEMENT_DDL /* 8 */:
                        qw2 qw2Var = (qw2) obj2;
                        return lt.c(Integer.valueOf((int) (qw2Var.a >> 32)), Integer.valueOf((int) (qw2Var.a & 4294967295L)));
                    case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                        nb2 nb2Var3 = (nb2) obj;
                        ei2 ei2Var = (ei2) obj2;
                        return lt.c(mc2.a(new kv(ei2Var.a), mc2.r, nb2Var3), mc2.a(new up1(ei2Var.b), mc2.z, nb2Var3), Float.valueOf(ei2Var.c));
                    case 10:
                        return Integer.valueOf(((zs2) obj2).a);
                    case 11:
                        return Integer.valueOf(((yt2) obj2).a);
                    case 12:
                        return Integer.valueOf(((wt0) obj2).a);
                    case 13:
                        return Integer.valueOf(((on0) obj2).a);
                    case 14:
                        return Integer.valueOf(((pn0) obj2).a);
                    case 15:
                        ax2 ax2Var2 = (ax2) obj2;
                        return ax2Var2 != null ? ax2.a(ax2Var2.a, ax2.c) : false ? Boolean.FALSE : lt.c(Float.valueOf(ax2.c(ax2Var2.a)), mc2.a(new bx2(ax2.b(ax2Var2.a)), mc2.y, (nb2) obj));
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                        ga1 ga1Var = (ga1) obj2;
                        return lt.c(ga1Var.a, mc2.a(ga1Var.b, mc2.j, (nb2) obj));
                    case 17:
                        long j2 = ((bx2) obj2).a;
                        if (bx2.a(j2, 8589934592L)) {
                            return 0;
                        }
                        if (bx2.a(j2, 4294967296L)) {
                            return 1;
                        }
                        return Boolean.FALSE;
                    case 18:
                        up1 up1Var = (up1) obj2;
                        return up1Var != null ? up1.b(up1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : lt.c(Float.valueOf(Float.intBitsToFloat((int) (up1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (up1Var.a & 4294967295L))));
                    case 19:
                        nb2 nb2Var4 = (nb2) obj;
                        nd ndVar = (nd) obj2;
                        Object obj3 = ndVar.a;
                        if (obj3 instanceof cu1) {
                            qdVar = qd.h;
                        } else if (obj3 instanceof yl2) {
                            qdVar = qd.i;
                        } else if (obj3 instanceof f43) {
                            qdVar = qd.j;
                        } else if (obj3 instanceof w23) {
                            qdVar = qd.k;
                        } else if (obj3 instanceof ha1) {
                            qdVar = qd.l;
                        } else if (obj3 instanceof ga1) {
                            qdVar = qd.m;
                        } else {
                            if (!(obj3 instanceof xn2)) {
                                throw new UnsupportedOperationException();
                            }
                            qdVar = qd.n;
                        }
                        switch (qdVar.ordinal()) {
                            case 0:
                                obj3.getClass();
                                objA = mc2.a((cu1) obj3, mc2.h, nb2Var4);
                                break;
                            case 1:
                                obj3.getClass();
                                objA = mc2.a((yl2) obj3, mc2.i, nb2Var4);
                                break;
                            case 2:
                                obj3.getClass();
                                objA = mc2.a((f43) obj3, mc2.d, nb2Var4);
                                break;
                            case 3:
                                obj3.getClass();
                                objA = mc2.a((w23) obj3, mc2.e, nb2Var4);
                                break;
                            case 4:
                                obj3.getClass();
                                objA = mc2.a((ha1) obj3, mc2.f, nb2Var4);
                                break;
                            case 5:
                                obj3.getClass();
                                objA = mc2.a((ga1) obj3, mc2.g, nb2Var4);
                                break;
                            case 6:
                                obj3.getClass();
                                objA = ((xn2) obj3).a;
                                break;
                            default:
                                wg.n();
                                return null;
                        }
                        return lt.c(qdVar, objA, Integer.valueOf(ndVar.b), Integer.valueOf(ndVar.c), ndVar.d);
                    case 20:
                        nb2 nb2Var5 = (nb2) obj;
                        List list2 = ((ub1) obj2).h;
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList2.add(mc2.a((tb1) list2.get(i3), mc2.B, nb2Var5));
                        }
                        return arrayList2;
                    case 21:
                        return ((tb1) obj2).a.toLanguageTag();
                    case 22:
                        nb2 nb2Var6 = (nb2) obj;
                        w91 w91Var = (w91) obj2;
                        return lt.c(mc2.a(new t91(w91Var.a), mc2.D, nb2Var6), mc2.a(new v91(w91Var.b), mc2.E, nb2Var6), mc2.a(new u91(w91Var.c), mc2.F, nb2Var6));
                    case 23:
                        return Float.valueOf(((t91) obj2).a);
                    case 24:
                        return Integer.valueOf(((v91) obj2).a);
                    case 25:
                        return Integer.valueOf(((u91) obj2).a);
                    case 26:
                        return ((f43) obj2).a;
                    case 27:
                        nb2 nb2Var7 = (nb2) obj;
                        cu1 cu1Var = (cu1) obj2;
                        Object objA2 = mc2.a(new zs2(cu1Var.a), mc2.s, nb2Var7);
                        Object objA3 = mc2.a(new yt2(cu1Var.b), mc2.t, nb2Var7);
                        Object objA4 = mc2.a(new ax2(cu1Var.c), mc2.x, nb2Var7);
                        zv2 zv2Var2 = cu1Var.d;
                        zv2 zv2Var3 = zv2.c;
                        Object objA5 = mc2.a(zv2Var2, mc2.m, nb2Var7);
                        Object objA6 = mc2.a(cu1Var.e, tz0.d0, nb2Var7);
                        w91 w91Var2 = cu1Var.f;
                        w91 w91Var3 = w91.d;
                        return lt.c(objA2, objA3, objA4, objA5, objA6, mc2.a(w91Var2, mc2.C, nb2Var7), mc2.a(new r91(cu1Var.g), tz0.f0, nb2Var7), mc2.a(new wt0(cu1Var.h), mc2.u, nb2Var7), mc2.a(cu1Var.i, tz0.g0, nb2Var7));
                    case 28:
                        return ((w23) obj2).a;
                    default:
                        nb2 nb2Var8 = (nb2) obj;
                        yl2 yl2Var = (yl2) obj2;
                        kv kvVar = new kv(yl2Var.a.a());
                        lc2 lc2Var2 = mc2.r;
                        Object objA7 = mc2.a(kvVar, lc2Var2, nb2Var8);
                        ax2 ax2Var3 = new ax2(yl2Var.b);
                        lc2 lc2Var3 = mc2.x;
                        Object objA8 = mc2.a(ax2Var3, lc2Var3, nb2Var8);
                        qn0 qn0Var = yl2Var.c;
                        qn0 qn0Var2 = qn0.i;
                        Object objA9 = mc2.a(qn0Var, mc2.n, nb2Var8);
                        Object objA10 = mc2.a(yl2Var.d, mc2.v, nb2Var8);
                        Object objA11 = mc2.a(yl2Var.e, mc2.w, nb2Var8);
                        String str = yl2Var.g;
                        Object objA12 = mc2.a(new ax2(yl2Var.h), lc2Var3, nb2Var8);
                        Object objA13 = mc2.a(yl2Var.i, mc2.o, nb2Var8);
                        Object objA14 = mc2.a(yl2Var.j, mc2.l, nb2Var8);
                        ub1 ub1Var = yl2Var.k;
                        ub1 ub1Var2 = ub1.j;
                        Object objA15 = mc2.a(ub1Var, mc2.A, nb2Var8);
                        Object objA16 = mc2.a(new kv(yl2Var.l), lc2Var2, nb2Var8);
                        Object objA17 = mc2.a(yl2Var.m, mc2.k, nb2Var8);
                        ei2 ei2Var2 = yl2Var.n;
                        ei2 ei2Var3 = ei2.d;
                        return lt.c(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, mc2.a(ei2Var2, mc2.q, nb2Var8));
                }
            }
        }, new jc2((byte) 3));
    }

    public static final Object a(Object obj, hc2 hc2Var, nb2 nb2Var) {
        Object objA;
        return (obj == null || (objA = hc2Var.a(nb2Var, obj)) == null) ? Boolean.FALSE : objA;
    }
}
