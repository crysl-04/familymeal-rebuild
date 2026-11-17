package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ip0 implements at0, dc2, h53 {
    public final jo0 h;
    public final g53 i;
    public final eo0 j;
    public e53 k;
    public h91 l = null;
    public k42 m = null;

    public ip0(jo0 jo0Var, g53 g53Var, eo0 eo0Var) {
        this.h = jo0Var;
        this.i = g53Var;
        this.j = eo0Var;
    }

    public final void a() {
        if (this.l == null) {
            this.l = new h91(this, true);
            cc2 cc2Var = new cc2(this, new xu1(this, (byte) 6));
            this.m = new k42(cc2Var, (byte) 3);
            cc2Var.a();
            this.j.run();
        }
    }

    @Override // defpackage.dc2
    public final k42 b() {
        a();
        return (k42) this.m.j;
    }

    @Override // defpackage.at0
    public final e53 c() {
        Application application;
        jo0 jo0Var = this.h;
        e53 e53VarC = jo0Var.c();
        if (e53VarC != jo0Var.Y) {
            this.k = e53VarC;
            return e53VarC;
        }
        e53 e53Var = this.k;
        if (e53Var != null) {
            return e53Var;
        }
        for (Context applicationContext = jo0Var.F().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                fc2 fc2Var = new fc2(application, jo0Var, jo0Var.m);
                this.k = fc2Var;
                return fc2Var;
            }
        }
        application = null;
        fc2 fc2Var2 = new fc2(application, jo0Var, jo0Var.m);
        this.k = fc2Var2;
        return fc2Var2;
    }

    @Override // defpackage.at0
    public final pi1 d() {
        Application application;
        jo0 jo0Var = this.h;
        Context applicationContext = jo0Var.F().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        pi1 pi1Var = new pi1(0);
        LinkedHashMap linkedHashMap = pi1Var.a;
        if (application != null) {
            linkedHashMap.put(d53.d, application);
        }
        linkedHashMap.put(h7.Q, jo0Var);
        linkedHashMap.put(h7.R, this);
        Bundle bundle = jo0Var.m;
        if (bundle != null) {
            linkedHashMap.put(h7.S, bundle);
        }
        return pi1Var;
    }

    @Override // defpackage.h53
    public final g53 f() {
        a();
        return this.i;
    }

    @Override // defpackage.e91
    public final h91 g() {
        a();
        return this.l;
    }
}
