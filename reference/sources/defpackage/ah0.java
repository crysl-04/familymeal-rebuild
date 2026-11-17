package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class ah0 {
    public static final ah0 b = new ah0(new pz2((ri0) null, (ck2) null, (bs) null, (ad2) null, (LinkedHashMap) null, 127));
    public final pz2 a;

    public ah0(pz2 pz2Var) {
        this.a = pz2Var;
    }

    public final ah0 a(ah0 ah0Var) {
        pz2 pz2Var = ah0Var.a;
        ri0 ri0Var = pz2Var.a;
        pz2 pz2Var2 = this.a;
        if (ri0Var == null) {
            ri0Var = pz2Var2.a;
        }
        ck2 ck2Var = pz2Var.b;
        if (ck2Var == null) {
            ck2Var = pz2Var2.b;
        }
        bs bsVar = pz2Var.c;
        if (bsVar == null) {
            bsVar = pz2Var2.c;
        }
        ad2 ad2Var = pz2Var.d;
        if (ad2Var == null) {
            ad2Var = pz2Var2.d;
        }
        Map map = pz2Var2.f;
        Map map2 = pz2Var.f;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new ah0(new pz2(ri0Var, ck2Var, bsVar, ad2Var, linkedHashMap, 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ah0) && ((ah0) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        pz2 pz2Var = this.a;
        ri0 ri0Var = pz2Var.a;
        String string = ri0Var != null ? ri0Var.toString() : null;
        ck2 ck2Var = pz2Var.b;
        String string2 = ck2Var != null ? ck2Var.toString() : null;
        bs bsVar = pz2Var.c;
        String string3 = bsVar != null ? bsVar.toString() : null;
        ad2 ad2Var = pz2Var.d;
        String string4 = ad2Var != null ? ad2Var.toString() : null;
        StringBuilder sbL = wi0.l("EnterTransition: Fade - ", string, ", Slide - ", string2, ", Shrink - ");
        sbL.append(string3);
        sbL.append(", Scale - ");
        sbL.append(string4);
        sbL.append(", Veil - null");
        return sbL.toString();
    }
}
