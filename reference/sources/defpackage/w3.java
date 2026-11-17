package defpackage;

import android.view.ActionMode;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class w3 implements gb0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.gb0
    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                t3 t3Var = ((q3) obj).a;
                if (t3Var == null) {
                    li1.g("Launcher has not been initialized");
                } else {
                    t3Var.K();
                }
                break;
            case 1:
                na0 na0Var = (na0) obj;
                na0Var.dismiss();
                na0Var.o.f();
                break;
            case 2:
                m12 m12Var = (m12) obj;
                m12Var.f();
                m12Var.setTag(R.id.view_tree_lifecycle_owner, null);
                m12Var.w.removeViewImmediate(m12Var);
                break;
            case 3:
                za zaVar = (za) obj;
                nl2 nl2Var = zaVar.e;
                v3 v3Var = nl2Var.h;
                if (v3Var != null) {
                    v3Var.b();
                }
                nl2Var.a();
                ActionMode actionMode = zaVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                zaVar.h = null;
                break;
            case 4:
                fl flVar = (fl) ((gl) obj).c.getValue();
                if (flVar != null) {
                    flVar.close();
                }
                break;
            case 5:
                rq rqVar = ((ry2) obj).c;
                if (rqVar != null) {
                    rqVar.l(null);
                }
                break;
            case 6:
                ((kv2) obj).m();
                break;
            case 7:
                ((q61) obj).d = null;
                break;
            case DatabaseUtils.STATEMENT_DDL /* 8 */:
                d71 d71Var = (d71) obj;
                n31 n31Var = d71Var.c;
                if (n31Var != null) {
                    n31Var.a = false;
                }
                d71Var.c = null;
                break;
            case DatabaseUtils.STATEMENT_UNPREPARED /* 9 */:
                y61 y61Var = (y61) obj;
                y61Var.f = true;
                y61Var.d = 0;
                y61Var.c();
                break;
            case 10:
                ((ll1) obj).e();
                break;
            default:
                ((pf2) ((qy) obj)).y(null);
                break;
        }
    }
}
