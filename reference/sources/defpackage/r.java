package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class r implements r21 {
    @Override // defpackage.r21
    public Object a(v60 v60Var) {
        return i(v60Var);
    }

    public Object e() {
        return new ArrayList();
    }

    public int f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    public Iterator g(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    public int h(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    public final Object i(v60 v60Var) {
        hz hzVarD = v60Var.D(d());
        d().getClass();
        Object objE = e();
        int iF = f(objE);
        while (true) {
            int iH = hzVarD.h(d());
            if (iH == -1) {
                hzVarD.s(d());
                return k(objE);
            }
            j(hzVarD, iH + iF, objE);
        }
    }

    public abstract void j(hz hzVar, int i, Object obj);

    public Object k(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList;
    }
}
