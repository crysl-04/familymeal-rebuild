package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ga0 implements gb0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ga0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gb0
    public final void a() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((pk1) obj2).r.f((da0) obj);
                break;
            case 1:
                ((tv0) obj2).a.j((rv0) obj);
                break;
            case 2:
                ((d81) obj2).j.k(obj);
                break;
            case 3:
                Iterator it = ((List) ((kn2) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((fy) obj).b().c((pk1) it.next());
                }
                break;
            case 4:
                sj1 sj1Var = (sj1) obj2;
                m22 m22Var = (m22) sj1Var.getValue();
                if (m22Var != null) {
                    l22 l22Var = new l22(m22Var);
                    ui1 ui1Var = (ui1) obj;
                    if (ui1Var != null) {
                        ui1Var.c(l22Var);
                    }
                    sj1Var.setValue(null);
                }
                break;
            case 5:
                ((qz2) obj2).k.remove((qz2) obj);
                break;
            case 6:
                qz2 qz2Var = (qz2) obj2;
                qz2Var.getClass();
                kz2 kz2Var = (kz2) ((lz2) obj).b.getValue();
                if (kz2Var != null) {
                    qz2Var.j.remove(kz2Var.h);
                }
                break;
            case 7:
                ((qz2) obj2).j.remove((oz2) obj);
                break;
            default:
                u83 u83Var = (u83) obj2;
                View view = (View) obj;
                int i = u83Var.t - 1;
                u83Var.t = i;
                if (i == 0) {
                    WeakHashMap weakHashMap = t43.a;
                    o43.c(view, null);
                    v73.a(view, null);
                    view.removeOnAttachStateChangeListener(u83Var.u);
                }
                break;
        }
    }
}
