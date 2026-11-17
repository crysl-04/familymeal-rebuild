package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class tm1 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(sm1 sm1Var) {
        sm1Var.getClass();
        String strD = vs.D(sm1Var.getClass());
        if (strD.length() <= 0) {
            wg.m("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        sm1 sm1Var2 = (sm1) linkedHashMap.get(strD);
        if (uz0.g(sm1Var2, sm1Var)) {
            return;
        }
        if (sm1Var2 != null && sm1Var2.b) {
            li1.n("Navigator ", sm1Var, " is replacing an already attached ", sm1Var2);
        } else {
            if (!sm1Var.b) {
                return;
            }
            throw new IllegalStateException(("Navigator " + sm1Var + " is already attached to another NavController").toString());
        }
    }

    public final sm1 b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            wg.m("navigator name cannot be an empty string");
            return null;
        }
        sm1 sm1Var = (sm1) this.a.get(str);
        if (sm1Var != null) {
            return sm1Var;
        }
        li1.g(wi0.h("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
