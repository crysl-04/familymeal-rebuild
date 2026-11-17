package defpackage;

import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w22 extends ThreadLocal {
    public final /* synthetic */ byte a;

    public /* synthetic */ w22(byte b) {
        this.a = b;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        byte b = this.a;
        l42 l42Var = l42.o;
        l42 l42Var2 = l42.n;
        l42 l42Var3 = l42.p;
        switch (b) {
            case 0:
                v22 v22Var = new v22((byte) 2);
                v22Var.i = 0;
                return v22Var;
            case 1:
                u22 u22Var = new u22((byte) 2);
                u22Var.j = h32.a;
                return u22Var;
            case 2:
                t22 t22Var = new t22((byte) 1);
                t22Var.j = Double.NEGATIVE_INFINITY;
                t22Var.k = false;
                return t22Var;
            case 3:
                t22 t22Var2 = new t22((byte) 2);
                t22Var2.j = Double.POSITIVE_INFINITY;
                t22Var2.k = false;
                return t22Var2;
            case 4:
                u22 u22Var2 = new u22((byte) 3);
                u22Var2.j = h32.a;
                return u22Var2;
            case 5:
                u22 u22Var3 = new u22((byte) 4);
                u22Var3.j = h32.a;
                return u22Var3;
            case 6:
                u22 u22Var4 = new u22((byte) 5);
                u22Var4.j = h32.b;
                return u22Var4;
            case 7:
                u22 u22Var5 = new u22((byte) 6);
                u22Var5.j = h32.b;
                return u22Var5;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                n42 n42Var = new n42((byte) 0);
                n42Var.j = l42Var;
                n42Var.k = false;
                return n42Var;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                o42 o42Var = new o42((byte) 0);
                o42Var.j = l42Var3;
                return o42Var;
            case 10:
                o42 o42Var2 = new o42((byte) 1);
                o42Var2.j = l42Var3;
                return o42Var2;
            case 11:
                m42 m42Var = new m42((byte) 3);
                m42Var.i = 0;
                m42Var.j = l42Var3;
                return m42Var;
            case 12:
                p42 p42Var = new p42((byte) 3);
                p42Var.i = 0;
                return p42Var;
            case 13:
                o42 o42Var3 = new o42((byte) 2);
                o42Var3.j = l42Var3;
                return o42Var3;
            case 14:
                n42 n42Var2 = new n42((byte) 1);
                n42Var2.j = l42.m;
                n42Var2.k = false;
                return n42Var2;
            case 15:
                n42 n42Var3 = new n42((byte) 2);
                n42Var3.j = l42Var;
                n42Var3.k = false;
                return n42Var3;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /* 16 */:
                o42 o42Var4 = new o42((byte) 3);
                o42Var4.j = l42Var3;
                return o42Var4;
            case 17:
                o42 o42Var5 = new o42((byte) 4);
                o42Var5.j = l42Var3;
                return o42Var5;
            case 18:
                o42 o42Var6 = new o42((byte) 5);
                o42Var6.j = l42Var2;
                return o42Var6;
            case 19:
                o42 o42Var7 = new o42((byte) 6);
                o42Var7.j = l42Var2;
                return o42Var7;
            case 20:
                w42 w42Var = new w42((byte) 0);
                w42Var.j = u42.q;
                w42Var.k = false;
                return w42Var;
            case 21:
                x42 x42Var = new x42((byte) 0);
                x42Var.j = u42.s;
                return x42Var;
            case 22:
                x42 x42Var2 = new x42((byte) 1);
                x42Var2.j = u42.s;
                return x42Var2;
            case 23:
                v42 v42Var = new v42((byte) 4);
                v42Var.i = 0;
                v42Var.j = u42.s;
                return v42Var;
            case 24:
                y42 y42Var = new y42((byte) 4);
                y42Var.i = 0;
                return y42Var;
            case 25:
                x42 x42Var3 = new x42((byte) 2);
                x42Var3.j = u42.s;
                return x42Var3;
            case 26:
                x42 x42Var4 = new x42((byte) 3);
                x42Var4.j = u42.s;
                return x42Var4;
            case 27:
                w42 w42Var2 = new w42((byte) 1);
                w42Var2.j = u42.q;
                w42Var2.k = false;
                return w42Var2;
            case 28:
                x42 x42Var5 = new x42((byte) 4);
                x42Var5.j = u42.s;
                return x42Var5;
            default:
                x42 x42Var6 = new x42((byte) 5);
                x42Var6.j = u42.s;
                return x42Var6;
        }
    }
}
