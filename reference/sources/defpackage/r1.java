package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class r1 {
    public Object a;
    public Object b;

    public r1() {
        this.b = new int[2];
    }

    public final void c() {
        qe qeVar = (qe) this.a;
        if (qeVar != null) {
            try {
                ((te) this.b).k.unregisterReceiver(qeVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int[] e(int i);

    public abstract int f();

    public final MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof zp2)) {
            return menuItem;
        }
        zp2 zp2Var = (zp2) menuItem;
        bj2 bj2Var = (bj2) this.b;
        if (bj2Var == null) {
            bj2Var = new bj2();
            this.b = bj2Var;
        }
        MenuItem menuItem2 = (MenuItem) bj2Var.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        pf1 pf1Var = new pf1((Context) this.a, zp2Var);
        ((bj2) this.b).put(zp2Var, pf1Var);
        return pf1Var;
    }

    public final int[] h(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public final String i() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        uz0.A("text");
        throw null;
    }

    public abstract void j();

    public abstract int[] k(int i);

    public final void l() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        qe qeVar = (qe) this.a;
        if (qeVar == null) {
            qeVar = new qe(this);
            this.a = qeVar;
        }
        ((te) this.b).k.registerReceiver(qeVar, intentFilterD);
    }

    public r1(Context context) {
        this.a = context;
    }

    public r1(te teVar) {
        this.b = teVar;
    }
}
