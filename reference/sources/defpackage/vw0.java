package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class vw0 {
    public final LinkedHashMap a;

    public vw0(byte b) {
        switch (b) {
            case 1:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
            case 2:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public final void a(du duVar, vp0 vp0Var) {
        vp0Var.getClass();
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(duVar)) {
            li1.e(wi0.h("A `initializer` with the same `clazz` has already been added: ", duVar.b(), "."));
        } else {
            linkedHashMap.put(duVar, new b53(duVar, vp0Var));
        }
    }

    public final uw0 b() {
        Collection collectionValues = this.a.values();
        collectionValues.getClass();
        b53[] b53VarArr = (b53[]) collectionValues.toArray(new b53[0]);
        return new uw0((b53[]) Arrays.copyOf(b53VarArr, b53VarArr.length));
    }
}
