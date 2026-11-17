package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ef0 extends dt {
    public final /* synthetic */ ff0 i;

    public ef0(ff0 ff0Var) {
        this.i = ff0Var;
    }

    @Override // defpackage.dt
    public final void J(Throwable th) {
        this.i.a.f(th);
    }

    @Override // defpackage.dt
    public final void K(wk wkVar) {
        ff0 ff0Var = this.i;
        ff0Var.c = wkVar;
        wk wkVar2 = ff0Var.c;
        if0 if0Var = ff0Var.a;
        ff0Var.b = new eg(wkVar2, if0Var.g, if0Var.i, Build.VERSION.SDK_INT >= 34 ? nf0.a() : lt.E());
        if0 if0Var2 = ff0Var.a;
        ArrayList arrayList = new ArrayList();
        if0Var2.a.writeLock().lock();
        try {
            if0Var2.c = (byte) 1;
            arrayList.addAll(if0Var2.b);
            if0Var2.b.clear();
            if0Var2.a.writeLock().unlock();
            if0Var2.d.post(new gf0(arrayList, if0Var2.c, null));
        } catch (Throwable th) {
            if0Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
