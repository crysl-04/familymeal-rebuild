package defpackage;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class db1 implements AbsListView.OnScrollListener {
    public final /* synthetic */ fb1 a;

    public db1(fb1 fb1Var) {
        this.a = fb1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        fb1 fb1Var = this.a;
        cb1 cb1Var = fb1Var.x;
        af afVar = fb1Var.F;
        if (i != 1 || afVar.getInputMethodMode() == 2 || afVar.getContentView() == null) {
            return;
        }
        fb1Var.B.removeCallbacks(cb1Var);
        cb1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
