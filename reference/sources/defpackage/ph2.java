package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ph2 extends qh2 {
    public static nh2 G(Iterator it) {
        it.getClass();
        return new h00(new jv(it, (byte) 1));
    }

    public static nh2 H(Object obj, vp0 vp0Var) {
        if (obj == null) {
            return fg0.a;
        }
        return new u80((byte) 2, vp0Var, new xu1(obj, (byte) 9));
    }

    public static List I(nh2 nh2Var) {
        Iterator it = nh2Var.iterator();
        if (!it.hasNext()) {
            return ag0.h;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return lt.P(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
