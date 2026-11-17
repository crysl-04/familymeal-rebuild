package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class z43 {
    public final a53 a = new a53();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        a53 a53Var = this.a;
        if (a53Var.d) {
            a53.a(autoCloseable);
            return;
        }
        synchronized (a53Var.a) {
            autoCloseable2 = (AutoCloseable) a53Var.b.put(str, autoCloseable);
        }
        a53.a(autoCloseable2);
    }

    public final void b() {
        a53 a53Var = this.a;
        if (!a53Var.d) {
            a53Var.d = true;
            synchronized (a53Var.a) {
                Iterator it = a53Var.b.values().iterator();
                while (it.hasNext()) {
                    a53.a((AutoCloseable) it.next());
                }
                Iterator it2 = a53Var.c.iterator();
                while (it2.hasNext()) {
                    a53.a((AutoCloseable) it2.next());
                }
                a53Var.c.clear();
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        a53 a53Var = this.a;
        synchronized (a53Var.a) {
            autoCloseable = (AutoCloseable) a53Var.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
