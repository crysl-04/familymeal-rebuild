package defpackage;

import java.util.Iterator;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mg implements kp0 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ kl1 i;

    public /* synthetic */ mg(kl1 kl1Var, byte b) {
        this.h = b;
        this.i = kl1Var;
    }

    @Override // defpackage.kp0
    public final Object a() {
        int i;
        byte b = this.h;
        j23 j23Var = j23.a;
        kl1 kl1Var = this.i;
        switch (b) {
            case 0:
                kl1.a(kl1Var, "ingredient/new");
                return j23Var;
            case 1:
                kl1.a(kl1Var, "recipe/new");
                return j23Var;
            case 2:
                kl1Var.b();
                return j23Var;
            case 3:
                kl1Var.b();
                return j23Var;
            case 4:
                kl1Var.b();
                return j23Var;
            case 5:
                kl1.a(kl1Var, "person/new");
                return j23Var;
            case 6:
                kl1.a(kl1Var, "schedule");
                return j23Var;
            case 7:
                kl1Var.b();
                return j23Var;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                kl1Var.b();
                return j23Var;
            default:
                qo0 qo0Var = kl1Var.f;
                boolean z = false;
                if (kl1Var.g) {
                    ih ihVar = kl1Var.b.f;
                    if (ihVar == null || !ihVar.isEmpty()) {
                        Iterator it = ihVar.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((pk1) it.next()).i instanceof gl1) && (i = i + 1) < 0) {
                                lt.g0();
                                throw null;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z = true;
                    }
                }
                qo0Var.d(z);
                return j23Var;
        }
    }
}
