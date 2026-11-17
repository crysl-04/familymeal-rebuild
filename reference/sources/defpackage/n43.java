package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class n43 implements View.OnApplyWindowInsetsListener {
    public q83 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ cq1 c;

    public n43(View view, cq1 cq1Var) {
        this.b = view;
        this.c = cq1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        q83 q83VarC = q83.c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        cq1 cq1Var = this.c;
        if (i < 30) {
            o43.a(windowInsets, this.b);
            if (q83VarC.equals(this.a)) {
                return cq1Var.a(view, q83VarC).b();
            }
        }
        this.a = q83VarC;
        q83 q83VarA = cq1Var.a(view, q83VarC);
        if (i >= 30) {
            return q83VarA.b();
        }
        WeakHashMap weakHashMap = t43.a;
        view.requestApplyInsets();
        return q83VarA.b();
    }
}
