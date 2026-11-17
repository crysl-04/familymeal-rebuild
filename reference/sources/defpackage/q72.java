package defpackage;

import android.os.Bundle;
import com.familymeal.app.MainActivity;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class q72 implements c91 {
    public final /* synthetic */ byte h;
    public final Object i;

    public /* synthetic */ q72(Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // defpackage.c91
    public final void e(e91 e91Var, w81 w81Var) {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                dc2 dc2Var = (dc2) obj;
                if (w81Var != w81.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                e91Var.g().f(this);
                Bundle bundleC = dc2Var.b().c("androidx.savedstate.Restarter");
                if (bundleC != null) {
                    ArrayList<String> stringArrayList = bundleC.getStringArrayList("classes_to_restore");
                    if (stringArrayList == null) {
                        li1.g("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        return;
                    }
                    int size = stringArrayList.size();
                    int i = 0;
                    while (i < size) {
                        String str = stringArrayList.get(i);
                        i++;
                        String str2 = str;
                        try {
                            Class<? extends U> clsAsSubclass = Class.forName(str2, false, q72.class.getClassLoader()).asSubclass(ac2.class);
                            clsAsSubclass.getClass();
                            try {
                                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object objNewInstance = declaredConstructor.newInstance(null);
                                    objNewInstance.getClass();
                                    if (!(dc2Var instanceof h53)) {
                                        li1.f(dc2Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                        return;
                                    }
                                    g53 g53VarF = ((h53) dc2Var).f();
                                    k42 k42VarB = dc2Var.b();
                                    LinkedHashMap linkedHashMap = g53VarF.a;
                                    LinkedHashMap linkedHashMap2 = g53VarF.a;
                                    Iterator it = dv.U0(linkedHashMap.keySet()).iterator();
                                    while (it.hasNext()) {
                                        z43 z43Var = (z43) linkedHashMap2.get(it.next());
                                        if (z43Var != null) {
                                            es.m(z43Var, k42VarB, dc2Var.g());
                                        }
                                    }
                                    if (!dv.U0(linkedHashMap2.keySet()).isEmpty()) {
                                        k42VarB.l();
                                    }
                                } catch (Exception e) {
                                    throw new RuntimeException(jp1.j("Failed to instantiate ", str2), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw new RuntimeException(wi0.h("Class ", str2, " wasn't found"), e3);
                        }
                    }
                    return;
                }
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) obj;
                if (mainActivity.l == null) {
                    bx bxVar = (bx) mainActivity.getLastNonConfigurationInstance();
                    if (bxVar != null) {
                        mainActivity.l = bxVar.a;
                    }
                    if (mainActivity.l == null) {
                        mainActivity.l = new g53();
                    }
                }
                mainActivity.h.f(this);
                return;
            case 2:
                jr0[] jr0VarArr = (jr0[]) obj;
                if (jr0VarArr.length > 0) {
                    jr0 jr0Var = jr0VarArr[0];
                    throw null;
                }
                if (jr0VarArr.length <= 0) {
                    return;
                }
                jr0 jr0Var2 = jr0VarArr[0];
                throw null;
            default:
                if (w81Var != w81.ON_CREATE) {
                    li1.f(w81Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    e91Var.g().f(this);
                    ((yb2) obj).b();
                    return;
                }
        }
    }
}
