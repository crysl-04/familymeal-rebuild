package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public abstract class cv extends r {
    public final r21 a;

    public cv(r21 r21Var) {
        this.a = r21Var;
    }

    @Override // defpackage.r21
    public void c(b bVar, Object obj) {
        int iH = h(obj);
        rh2 rh2VarD = d();
        rh2VarD.getClass();
        b bVarA = bVar.a(rh2VarD);
        Iterator itG = g(obj);
        for (int i = 0; i < iH; i++) {
            bVarA.o(d(), i, this.a, itG.next());
        }
        bVarA.t(rh2VarD);
    }

    @Override // defpackage.r
    public void j(hz hzVar, int i, Object obj) {
        l(i, obj, hzVar.y(d(), i, this.a, null));
    }

    public void l(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
