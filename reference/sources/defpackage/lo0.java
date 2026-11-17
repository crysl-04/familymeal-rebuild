package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import com.familymeal.app.MainActivity;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class lo0 extends es implements h53, e91, x3, dc2, bp0 {
    public final MainActivity l;
    public final MainActivity m;
    public final Handler n;
    public final yo0 o;
    public final /* synthetic */ MainActivity p;

    public lo0(MainActivity mainActivity) {
        this.p = mainActivity;
        Handler handler = new Handler();
        this.l = mainActivity;
        this.m = mainActivity;
        this.n = handler;
        this.o = new yo0();
    }

    @Override // defpackage.es
    public final View W(int i) {
        return this.p.findViewById(i);
    }

    @Override // defpackage.es
    public final boolean X() {
        Window window = this.p.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.dc2
    public final k42 b() {
        return (k42) this.p.k.j;
    }

    @Override // defpackage.x3
    public final ex e() {
        return this.p.o;
    }

    @Override // defpackage.h53
    public final g53 f() {
        return this.p.f();
    }

    @Override // defpackage.e91
    public final h91 g() {
        return this.p.C;
    }

    @Override // defpackage.bp0
    public final void a() {
    }
}
