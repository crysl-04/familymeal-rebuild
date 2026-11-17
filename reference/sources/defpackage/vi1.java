package defpackage;

import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vi1 {
    public static final Object k = new Object();
    public final Object a = new Object();
    public final lb2 b = new lb2();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final q6 j;

    public vi1() {
        Object obj = k;
        this.f = obj;
        this.j = new q6(this, (byte) 8);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        vg.V().getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        li1.g(wi0.h("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(kb1 kb1Var) {
        if (kb1Var.i) {
            if (!kb1Var.h()) {
                kb1Var.d(false);
                return;
            }
            int i = kb1Var.j;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            kb1Var.j = i2;
            kb1Var.h.w(this.e);
        }
    }

    public final void c(kb1 kb1Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (kb1Var != null) {
                b(kb1Var);
                kb1Var = null;
            } else {
                lb2 lb2Var = this.b;
                lb2Var.getClass();
                jb2 jb2Var = new jb2(lb2Var);
                lb2Var.j.put(jb2Var, Boolean.FALSE);
                while (jb2Var.hasNext()) {
                    b((kb1) ((Map.Entry) jb2Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(jo0 jo0Var, qp1 qp1Var) {
        a("observe");
        if (jo0Var.U.h != x81.h) {
            jb1 jb1Var = new jb1(this, jo0Var, qp1Var);
            kb1 kb1Var = (kb1) this.b.a(qp1Var, jb1Var);
            if (kb1Var == null) {
                jo0Var.U.a(jb1Var);
            } else {
                if (kb1Var.g(jo0Var)) {
                    return;
                }
                wg.m("Cannot add the same observer with different lifecycles");
            }
        }
    }

    public final void e(qp1 qp1Var) {
        kb1 kb1Var;
        a("removeObserver");
        lb2 lb2Var = this.b;
        WeakHashMap weakHashMap = lb2Var.j;
        ib2 ib2Var = lb2Var.h;
        while (true) {
            kb1Var = null;
            if (ib2Var == null) {
                break;
            }
            if (ib2Var.h.equals(qp1Var)) {
                lb2Var.k--;
                if (!weakHashMap.isEmpty()) {
                    Iterator it = weakHashMap.keySet().iterator();
                    while (it.hasNext()) {
                        ((kb2) it.next()).a(ib2Var);
                    }
                }
                ib2 ib2Var2 = ib2Var.k;
                ib2 ib2Var3 = ib2Var.j;
                if (ib2Var2 != null) {
                    ib2Var2.j = ib2Var3;
                } else {
                    lb2Var.h = ib2Var3;
                }
                ib2 ib2Var4 = ib2Var.j;
                if (ib2Var4 != null) {
                    ib2Var4.k = ib2Var2;
                } else {
                    lb2Var.i = ib2Var2;
                }
                ib2Var.j = null;
                ib2Var.k = null;
                kb1Var = ib2Var.i;
                break;
            }
            ib2Var = ib2Var.j;
        }
        if (kb1Var == null) {
            return;
        }
        kb1Var.f();
        kb1Var.d(false);
    }

    public final void f(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }
}
