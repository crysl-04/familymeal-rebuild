package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class pk1 implements e91, h53, at0, dc2 {
    public final lf0 h;
    public dl1 i;
    public final Bundle j;
    public x81 k;
    public final xl1 l;
    public final String m;
    public final Bundle n;
    public boolean p;
    public x81 s;
    public final k42 o = new k42(new cc2(this, new xu1(this, 6)), (byte) 3);
    public final yq2 q = new yq2(new jw0(17));
    public final h91 r = new h91(this, true);

    public pk1(lf0 lf0Var, dl1 dl1Var, Bundle bundle, x81 x81Var, xl1 xl1Var, String str, Bundle bundle2) {
        this.h = lf0Var;
        this.i = dl1Var;
        this.j = bundle;
        this.k = x81Var;
        this.l = xl1Var;
        this.m = str;
        this.n = bundle2;
        new yq2(new jw0((byte) 18));
        this.s = x81.i;
    }

    public final Bundle a() {
        Bundle bundle = this.j;
        if (bundle == null) {
            return null;
        }
        Bundle bundleL = t03.l((wt1[]) Arrays.copyOf(new wt1[0], 0));
        bundleL.putAll(bundle);
        return bundleL;
    }

    @Override // defpackage.dc2
    public final k42 b() {
        return (k42) this.o.j;
    }

    @Override // defpackage.at0
    public final e53 c() {
        return (fc2) this.q.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    @Override // defpackage.at0
    public final pi1 d() {
        Application application;
        pi1 pi1Var = new pi1(0);
        jy1 jy1Var = h7.Q;
        LinkedHashMap linkedHashMap = pi1Var.a;
        linkedHashMap.put(jy1Var, this);
        linkedHashMap.put(h7.R, this);
        Bundle bundleA = a();
        if (bundleA != null) {
            linkedHashMap.put(h7.S, bundleA);
        }
        lf0 lf0Var = this.h;
        if (lf0Var == null) {
            application = null;
        } else {
            Context context = lf0Var.a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            linkedHashMap.put(d53.d, application2);
        }
        return pi1Var;
    }

    public final void e() {
        if (!this.p) {
            k42 k42Var = this.o;
            ((cc2) k42Var.i).a();
            this.p = true;
            if (this.l != null) {
                h7.d0(this);
            }
            k42Var.f(this.n);
        }
        int iOrdinal = this.k.ordinal();
        int iOrdinal2 = this.s.ordinal();
        h91 h91Var = this.r;
        if (iOrdinal < iOrdinal2) {
            h91Var.g(this.k);
        } else {
            h91Var.g(this.s);
        }
    }

    public final boolean equals(Object obj) {
        boolean zG;
        if (obj != null && (obj instanceof pk1)) {
            pk1 pk1Var = (pk1) obj;
            Bundle bundle = pk1Var.j;
            Bundle bundle2 = this.j;
            if (uz0.g(bundle2, bundle)) {
                zG = true;
            } else {
                zG = (bundle2 == null || bundle == null) ? false : y02.g(bundle2, bundle);
            }
            if (this.m.equals(pk1Var.m) && uz0.g(this.i, pk1Var.i) && uz0.g(this.r, pk1Var.r) && ((k42) this.o.j) == ((k42) pk1Var.o.j) && zG) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h53
    public final g53 f() {
        if (!this.p) {
            li1.g("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (this.r.h == x81.h) {
            li1.g("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        xl1 xl1Var = this.l;
        if (xl1Var == null) {
            li1.g("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        mj1 mj1Var = ((j53) ((yq2) ((eg) xl1Var.i).k).getValue()).b;
        String str = this.m;
        Object objG = mj1Var.g(str);
        if (objG == null) {
            objG = new i53(str);
            mj1Var.n(str, objG);
        }
        return ((i53) objG).b;
    }

    @Override // defpackage.e91
    public final h91 g() {
        return this.r;
    }

    public final int hashCode() {
        int iHashCode = this.i.hashCode() + (this.m.hashCode() * 31);
        Bundle bundle = this.j;
        if (bundle != null) {
            iHashCode = (iHashCode * 31) + y02.h(bundle);
        }
        int iHashCode2 = this.r.hashCode();
        return ((k42) this.o.j).hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z72.a(sb.getClass()).c());
        sb.append("(" + this.m + ")");
        sb.append(" destination=");
        sb.append(this.i);
        return sb.toString();
    }
}
