package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.b;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ka1 extends r {
    public final r21 a;
    public final ja1 b;

    public ka1(r21 r21Var) {
        bo2 bo2Var = bo2.a;
        this.a = r21Var;
        this.b = new ja1(bo2.b, r21Var.d());
    }

    @Override // defpackage.r21
    public final void c(b bVar, Object obj) {
        h(obj);
        ja1 ja1Var = this.b;
        b bVarA = bVar.a(ja1Var);
        Iterator itG = g(obj);
        int i = 0;
        while (itG.hasNext()) {
            Map.Entry entry = (Map.Entry) itG.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            bVarA.o(ja1Var, i, bo2.a, key);
            i += 2;
            bVarA.o(ja1Var, i2, this.a, value);
        }
        bVarA.t(ja1Var);
    }

    @Override // defpackage.r21
    public final rh2 d() {
        return this.b;
    }

    @Override // defpackage.r
    public final Object e() {
        return new LinkedHashMap();
    }

    @Override // defpackage.r
    public final int f(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap.size() << 1;
    }

    @Override // defpackage.r
    public final Iterator g(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    @Override // defpackage.r
    public final int h(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    @Override // defpackage.r
    public final void j(hz hzVar, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        bo2 bo2Var = bo2.a;
        ja1 ja1Var = this.b;
        Object objY = hzVar.y(ja1Var, i, bo2Var, null);
        int iH = hzVar.h(ja1Var);
        if (iH != i + 1) {
            li1.e(wi0.f(i, iH, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objY);
        r21 r21Var = this.a;
        map.put(objY, (!zContainsKey || (r21Var.d().c() instanceof d32)) ? hzVar.y(ja1Var, iH, r21Var, null) : hzVar.y(ja1Var, iH, r21Var, ee1.J(objY, map)));
    }

    @Override // defpackage.r
    public final Object k(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap;
    }
}
