package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class eu {
    public final String a;
    public final ArrayList b = new ArrayList();
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public eu(String str) {
        this.a = str;
    }

    public static void a(eu euVar, String str, rh2 rh2Var) {
        rh2Var.getClass();
        if (!euVar.c.add(str)) {
            li1.i("Element with name '", str, "' is already registered in ", euVar.a);
            return;
        }
        euVar.b.add(str);
        euVar.d.add(rh2Var);
        euVar.e.add(ag0.h);
        euVar.f.add(false);
    }
}
