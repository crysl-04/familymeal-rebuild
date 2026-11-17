package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class s73 extends WindowInsetsAnimation$Callback {
    public final n73 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public s73(n73 n73Var) {
        super(n73Var.i);
        this.d = new HashMap();
        this.a = n73Var;
    }

    public final v73 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        v73 v73Var = (v73) map.get(windowInsetsAnimation);
        if (v73Var != null) {
            return v73Var;
        }
        v73 v73Var2 = new v73(0, null, 0L);
        v73Var2.a = new t73(windowInsetsAnimation);
        map.put(windowInsetsAnimation, v73Var2);
        return v73Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationJ = w1.j(list.get(size));
            v73 v73VarA = a(windowInsetsAnimationJ);
            v73VarA.a.e(windowInsetsAnimationJ.getFraction());
            this.c.add(v73VarA);
        }
        return this.a.d(q83.c(windowInsets, null), this.b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        k42 k42VarE = this.a.e(a(windowInsetsAnimation), new k42(bounds));
        k42VarE.getClass();
        w1.n();
        return w1.h(((ox0) k42VarE.i).d(), ((ox0) k42VarE.j).d());
    }
}
