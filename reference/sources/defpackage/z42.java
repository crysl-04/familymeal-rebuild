package defpackage;

import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class z42 extends ThreadLocal {
    public final /* synthetic */ byte a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                x42 x42Var = new x42((byte) 6);
                x42Var.j = u42.r;
                return x42Var;
            case 1:
                x42 x42Var2 = new x42((byte) 7);
                x42Var2.j = u42.r;
                return x42Var2;
            case 2:
                s52 s52Var = new s52((byte) 0);
                s52Var.j = z52.o;
                s52Var.k = false;
                return s52Var;
            case 3:
                t52 t52Var = new t52((byte) 0);
                t52Var.j = z52.p;
                return t52Var;
            case 4:
                t52 t52Var2 = new t52((byte) 1);
                t52Var2.j = z52.p;
                return t52Var2;
            case 5:
                r52 r52Var = new r52((byte) 5);
                r52Var.i = 0;
                r52Var.j = z52.p;
                return r52Var;
            case 6:
                u52 u52Var = new u52((byte) 5);
                u52Var.i = 0;
                return u52Var;
            case 7:
                t52 t52Var3 = new t52((byte) 2);
                t52Var3.j = z52.p;
                return t52Var3;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                s52 s52Var2 = new s52((byte) 1);
                s52Var2.j = z52.m;
                s52Var2.k = false;
                return s52Var2;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                s52 s52Var3 = new s52((byte) 2);
                s52Var3.j = z52.o;
                s52Var3.k = false;
                return s52Var3;
            case 10:
                t52 t52Var4 = new t52((byte) 3);
                t52Var4.j = z52.p;
                return t52Var4;
            case 11:
                t52 t52Var5 = new t52((byte) 4);
                t52Var5.j = z52.p;
                return t52Var5;
            case 12:
                t52 t52Var6 = new t52((byte) 5);
                t52Var6.j = z52.n;
                return t52Var6;
            default:
                t52 t52Var7 = new t52((byte) 6);
                t52Var7.j = z52.n;
                return t52Var7;
        }
    }
}
