package defpackage;

import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class le implements Runnable {
    public final /* synthetic */ byte h;
    public final /* synthetic */ te i;

    public /* synthetic */ le(te teVar, byte b) {
        this.h = b;
        this.i = teVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        byte b = this.h;
        te teVar = this.i;
        byte b2 = 0;
        switch (b) {
            case 0:
                if ((teVar.X & 1) != 0) {
                    teVar.l(0);
                }
                if ((teVar.X & 4096) != 0) {
                    teVar.l(108);
                }
                teVar.W = false;
                teVar.X = 0;
                break;
            default:
                teVar.u.showAtLocation(teVar.t, 55, 0, 0);
                l53 l53Var = teVar.w;
                if (l53Var != null) {
                    l53Var.b();
                }
                if (teVar.y && (viewGroup = teVar.z) != null) {
                    WeakHashMap weakHashMap = t43.a;
                    if (viewGroup.isLaidOut()) {
                        teVar.t.setAlpha(0.0f);
                        l53 l53VarA = t43.a(teVar.t);
                        l53VarA.a(1.0f);
                        teVar.w = l53VarA;
                        l53VarA.d(new ne(this, b2));
                    }
                }
                teVar.t.setAlpha(1.0f);
                teVar.t.setVisibility(0);
                break;
        }
    }
}
