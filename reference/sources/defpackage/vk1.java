package defpackage;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vk1 implements vp0 {
    public final /* synthetic */ byte h = 2;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ vk1(p81 p81Var, gm0 gm0Var, boolean z, kv2 kv2Var, xp1 xp1Var) {
        this.j = p81Var;
        this.k = gm0Var;
        this.i = z;
        this.l = kv2Var;
        this.m = xp1Var;
    }

    @Override // defpackage.vp0
    public final Object h(Object obj) throws Exception {
        byte b = this.h;
        j23 j23Var = j23.a;
        Object obj2 = this.m;
        Object obj3 = this.l;
        boolean z = this.i;
        Object obj4 = this.k;
        Object obj5 = this.j;
        switch (b) {
            case 0:
                pk1 pk1Var = (pk1) obj;
                pk1Var.getClass();
                ((t72) obj5).h = true;
                ((t72) obj4).h = true;
                ((xk1) obj3).n(pk1Var, z, (ih) obj2);
                return j23Var;
            case 1:
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE plan_dish SET locked = ? WHERE plan_id = ? AND day = ? AND meal = ? AND recipe_id = ?");
                try {
                    sQLiteStatementPrepare.bindLong(1, z ? 1L : 0L);
                    sQLiteStatementPrepare.bindText(2, str);
                    sQLiteStatementPrepare.bindText(3, str2);
                    sQLiteStatementPrepare.bindText(4, str3);
                    sQLiteStatementPrepare.bindText(5, str4);
                    sQLiteStatementPrepare.step();
                    return j23Var;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            default:
                p81 p81Var = (p81) obj5;
                gm0 gm0Var = (gm0) obj4;
                kv2 kv2Var = (kv2) obj3;
                xp1 xp1Var = (xp1) obj2;
                up1 up1Var = (up1) obj;
                if (p81Var.b()) {
                    ol2 ol2Var = p81Var.c;
                    if (ol2Var != null) {
                        ((m80) ol2Var).b();
                    }
                } else {
                    gm0.a(gm0Var);
                }
                if (p81Var.b() && z) {
                    if (p81Var.a() != qs0.i) {
                        kw2 kw2VarD = p81Var.d();
                        if (kw2VarD != null) {
                            long j = up1Var.a;
                            ix0 ix0Var = p81Var.d;
                            v10 v10Var = p81Var.v;
                            int iN = xp1Var.n(kw2VarD.b(j, true));
                            v10Var.h(vv2.a((vv2) ix0Var.i, null, m02.a(iN, iN), 5));
                            if (p81Var.a.a.i.length() > 0) {
                                p81Var.k.setValue(qs0.j);
                            }
                        }
                    } else {
                        kv2Var.d(up1Var);
                    }
                }
                return j23Var;
        }
    }

    public /* synthetic */ vk1(t72 t72Var, t72 t72Var2, xk1 xk1Var, boolean z, ih ihVar) {
        this.j = t72Var;
        this.k = t72Var2;
        this.l = xk1Var;
        this.i = z;
        this.m = ihVar;
    }

    public /* synthetic */ vk1(boolean z, String str, String str2, String str3, String str4) {
        this.i = z;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = str4;
    }
}
