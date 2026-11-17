package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class fc2 implements e53 {
    public final Application a;
    public final d53 b;
    public final Bundle c;
    public final h91 d;
    public final k42 e;

    public fc2(Application application, dc2 dc2Var, Bundle bundle) {
        d53 d53Var;
        this.e = dc2Var.b();
        this.d = dc2Var.g();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            d53Var = d53.c;
            if (d53Var == null) {
                d53Var = new d53(application);
                d53.c = d53Var;
            }
        } else {
            d53Var = new d53(null);
        }
        this.b = d53Var;
    }

    @Override // defpackage.e53
    public final z43 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        wg.m("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.e53
    public final z43 b(Class cls, pi1 pi1Var) {
        c53 c53Var = s60.B0;
        LinkedHashMap linkedHashMap = pi1Var.a;
        String str = (String) linkedHashMap.get(c53Var);
        if (str == null) {
            li1.g("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(h7.Q) == null || linkedHashMap.get(h7.R) == null) {
            if (this.d != null) {
                return d(str, cls);
            }
            li1.g("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(d53.d);
        boolean zIsAssignableFrom = nb.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? gc2.a(cls, gc2.b) : gc2.a(cls, gc2.a);
        if (constructorA == null) {
            return this.b.b(cls, pi1Var);
        }
        return (!zIsAssignableFrom || application == null) ? gc2.b(cls, constructorA, h7.a0(pi1Var)) : gc2.b(cls, constructorA, application, h7.a0(pi1Var));
    }

    @Override // defpackage.e53
    public final z43 c(du duVar, pi1 pi1Var) {
        Class cls = duVar.a;
        cls.getClass();
        return b(cls, pi1Var);
    }

    public final z43 d(String str, Class cls) {
        ub2 ub2Var;
        h91 h91Var = this.d;
        if (h91Var == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = nb.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? gc2.a(cls, gc2.b) : gc2.a(cls, gc2.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            f53 f53Var = f53.a;
            if (f53Var == null) {
                f53Var = new f53();
                f53.a = f53Var;
            }
            return f53Var.a(cls);
        }
        k42 k42Var = this.e;
        k42Var.getClass();
        Bundle bundleC = k42Var.c(str);
        if (bundleC == null) {
            bundleC = this.c;
        }
        if (bundleC == null) {
            ub2Var = new ub2();
        } else {
            ClassLoader classLoader = ub2.class.getClassLoader();
            classLoader.getClass();
            bundleC.setClassLoader(classLoader);
            wd1 wd1Var = new wd1(bundleC.size());
            for (String str2 : bundleC.keySet()) {
                str2.getClass();
                wd1Var.put(str2, bundleC.get(str2));
            }
            ub2Var = new ub2(wd1Var.b());
        }
        vb2 vb2Var = new vb2(str, ub2Var);
        vb2Var.d(k42Var, h91Var);
        x81 x81Var = h91Var.h;
        if (x81Var == x81.i || x81Var.compareTo(x81.k) >= 0) {
            k42Var.l();
        } else {
            h91Var.a(new o70((Object) h91Var, (Object) k42Var, (byte) 1));
        }
        z43 z43VarB = (!zIsAssignableFrom || application == null) ? gc2.b(cls, constructorA, ub2Var) : gc2.b(cls, constructorA, application, ub2Var);
        z43VarB.a("androidx.lifecycle.savedstate.vm.tag", vb2Var);
        return z43VarB;
    }

    public fc2() {
        this.b = new d53(null);
    }
}
