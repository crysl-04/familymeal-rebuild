package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class wh0 {
    public static final wh0 b;
    public static final wh0 c;
    public final pz2 a;

    static {
        LinkedHashMap linkedHashMap = null;
        ri0 ri0Var = null;
        ck2 ck2Var = null;
        bs bsVar = null;
        ad2 ad2Var = null;
        b = new wh0(new pz2(ri0Var, ck2Var, bsVar, ad2Var, linkedHashMap, 127));
        c = new wh0(new pz2(ri0Var, ck2Var, bsVar, ad2Var, linkedHashMap, 95));
    }

    public wh0(pz2 pz2Var) {
        this.a = pz2Var;
    }

    public final wh0 a(wh0 wh0Var) {
        pz2 pz2Var = wh0Var.a;
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
        boolean z = pz2Var.e || pz2Var2.e;
        Map map = pz2Var2.f;
        Map map2 = pz2Var.f;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new wh0(new pz2(ri0Var, ck2Var, bsVar, ad2Var, z, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wh0) && ((wh0) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
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
        boolean z = pz2Var.e;
        StringBuilder sbL = wi0.l("ExitTransition:  Fade - ", string, ",  Slide - ", string2, ",  Shrink - ");
        wi0.v(sbL, string3, ",  Scale - ", string4, ",  Veil - null,  KeepUntilTransitionsFinished - ");
        sbL.append(z);
        return sbL.toString();
    }
}
