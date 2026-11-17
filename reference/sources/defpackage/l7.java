package defpackage;

import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.familymeal.app.MainActivity;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l7 implements Runnable {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ l7(Object obj, Object obj2, byte b) {
        this.h = b;
        this.i = obj;
        this.j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.h;
        Object obj = this.j;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                m7.b((o7) obj2, (LongSparseArray) obj);
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) obj2;
                mainActivity.h.a(new xw((kq1) obj, mainActivity));
                return;
            case 2:
                ((rf) obj2).k((Typeface) obj);
                return;
            case 3:
                bz2 bz2Var = (bz2) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } finally {
                    bz2Var.a();
                }
            default:
                r93 r93Var = (r93) obj2;
                h91 h91Var = (h91) obj;
                if (r93Var.j) {
                    return;
                }
                r93Var.k = h91Var;
                h91Var.a(r93Var);
                return;
        }
    }
}
