package defpackage;

import java.util.function.Predicate;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m5 implements Predicate {
    public final /* synthetic */ byte a;

    public /* synthetic */ m5(byte b) {
        this.a = b;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((zh0) obj).T();
            case 1:
                return ((e33) obj).o();
            case 2:
                zh0 zh0Var = (zh0) obj;
                return zh0Var.p() && !zh0Var.U();
            case 3:
                zh0 zh0Var2 = (zh0) obj;
                return zh0Var2.u() && !zh0Var2.U();
            case 4:
                return ((e33) obj).u();
            case 5:
                zh0 zh0Var3 = (zh0) obj;
                return zh0Var3.r() && !zh0Var3.U();
            case 6:
                return ((e33) obj).r();
            case 7:
                return ((e33) obj).p();
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                return ((e33) obj).r;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                e33 e33Var = (e33) obj;
                return e33Var.o() && !e33Var.p();
            case 10:
                zh0 zh0Var4 = (zh0) obj;
                return zh0Var4.o() && !zh0Var4.y;
            default:
                return !((e33) obj).p();
        }
    }
}
